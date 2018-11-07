%dw 1.0
%output application/java
---
{
	evaluatedColumn: {
		databaseName: "DB_NAME",
		name: "COLUMN_NAME",
		schemaName: "SCHEMA_NAME",
		tableName: "TABLE_NAME"
	} as :object {
		class : "com.collibra.connect.template.dgcdqresultconsumer.ColumnIdentifier"
	}
} as :object {
	class : "com.collibra.connect.template.dgcdqresultconsumer.Result"
}