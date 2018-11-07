package com.collibra.connect.template.dgcdqresultconsumer;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColumnIdentifier {

	private String databaseName;
	private String schemaName;
	private String tableName;
	private String name;
	private String hostName;
	private String viewName;

	@Override
	public String toString() {
		return "ColumnIdentifier [databaseName=" + databaseName + ", schemaName=" + schemaName + ", tableName="
				+ tableName + ", name=" + name + ", hostName=" + hostName + ", viewName=" + viewName + "]";
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
