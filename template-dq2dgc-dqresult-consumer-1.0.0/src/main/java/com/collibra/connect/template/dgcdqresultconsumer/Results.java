package com.collibra.connect.template.dgcdqresultconsumer;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	private String externalSystemId;
	private String communityName;
	private List<Result> results;

	public String getExternalSystemId() {
		return externalSystemId;
	}

	public void setExternalSystemId(String externalSystemId) {
		this.externalSystemId = externalSystemId;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
}
