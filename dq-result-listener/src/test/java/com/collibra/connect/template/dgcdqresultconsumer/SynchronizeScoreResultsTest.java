package com.collibra.connect.template.dgcdqresultconsumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.mule.munit.common.mocking.Attribute.attribute;

import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mule.api.MessagingException;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.module.json.validation.JsonSchemaValidationException;
import org.mule.munit.common.mocking.SpyProcess;
import org.mule.munit.runner.functional.FunctionalMunitSuite;

import com.collibra.connect.dgc.connector.model.Community;
import com.google.gson.Gson;

public class SynchronizeScoreResultsTest extends FunctionalMunitSuite {

	private static final String VALIDATE_AND_PARSE_FLOW = "validateAndParse";
	private static final String IMPORT_DATABASES = "Import Database Domains and Schemas";
	private static final String FLOWVARS_COMMUNITY_ID = "communityId";
	private static final String MAIN_FLOW = "main";

	@Test
	public void temp() throws Exception {
		// given
		MuleEvent event = testEvent(getResource("threeValidResults.json"));

		runFlow(MAIN_FLOW, event);
	}

	@Test
	public void createsCommuntyIfDoesNotExist() throws Exception {
		// given
		MuleEvent event = testEvent("{\"externalSystemId\":\"IDQ\",\"results\":[]}");

		// When
		MuleEvent result = runFlow("getOrCreateCommunity", event);

		// then
		assertThat(result.getMessage().getPayload(), Matchers.is(Matchers.instanceOf(Community.class)));
	}

	@Test
	public void shouldNotThrowExceptionWhenColumnIsNotSpecified() throws Exception {
		runFlow(VALIDATE_AND_PARSE_FLOW, testEvent(getResource("resultsWithoutTheEvaluatedColumn.json")));
	}

	@Test
	public void shouldThrowExceptionWhenFieldsInDQResultsAreMissing() throws Exception {
		try {
			// when
			runFlow(VALIDATE_AND_PARSE_FLOW, testEvent(getResource("resultsWithMissingColumnNameAndTableName.json")));
		} catch (MessagingException e) {
			// then
			if (e.getCauseException() instanceof JsonSchemaValidationException) {
				return;
			}
		}
		throw new IllegalStateException("JsonSchemaValidationException should have been thrown!");
	}

	@Test
	public void shouldNotThrowExceptionIfCommunityNameOrTypeNameExist() throws Exception {

		// when
		runFlow(VALIDATE_AND_PARSE_FLOW, testEvent(getResource("resultsWithCommunityNameAndTypeName.json")));
	}

	@Test
	public void shouldNotThrowExceptionOnValidData() throws Exception {
		runFlow(VALIDATE_AND_PARSE_FLOW, testEvent(getResource("twoValidResults.json")));
	}

	@Test
	public void shouldImportDatabasesAsDomainsAndSchemasAsDatabaseAssets() throws Exception {
		// given
		Results results = new Gson().fromJson(getResource("twoValidResults.json"), Results.class);
		MuleEvent event = testEvent(null);
		event.setFlowVariable(FLOWVARS_COMMUNITY_ID, "someCommunityId");
		event.setFlowVariable("withEvaluatedColumn", results.getResults());

		whenMessageProcessor("import-c-s-v").ofNamespace("collibra-dgc")
				.withAttributes(attribute("doc:name").withValue(IMPORT_DATABASES))
				.thenReturn(muleMessageWithPayload(null));

		// then
		spyMessageProcessor("import-c-s-v").ofNamespace("collibra-dgc")
				.withAttributes(attribute("doc:name").withValue(IMPORT_DATABASES)).before(new SpyProcess() {
					@Override
					public void spy(MuleEvent event) throws MuleException {
						assertThat(event.getMessage().getPayload(), instanceOf(String.class));
						Scanner scanner = new Scanner((String) event.getMessage().getPayload());
						assertThat(
								scanner.nextLine(),
								equalTo("DB_NAME1.SCHEMA_NAME1,00000000-0000-0000-0000-000000031006,DB_NAME1,00000000-0000-0000-0000-000000030001,someCommunityId"));
						assertThat(
								scanner.nextLine(),
								equalTo("DB_NAME2.SCHEMA_NAME2,00000000-0000-0000-0000-000000031006,DB_NAME2,00000000-0000-0000-0000-000000030001,someCommunityId"));
						scanner.close();
					}
				});

		// when
		runFlow("upsertDatabaseDomainsAndSchemas", event);
	}

	private String getResource(String name) throws IOException {
		String string = IOUtils.toString(SynchronizeScoreResultsTest.class.getResourceAsStream(name));
		return string;
	}
}
