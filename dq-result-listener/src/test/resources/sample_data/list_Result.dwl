%dw 1.0
%output application/java
---
[{
	evaluatedColumn: {
		databaseName: "DB",
		name: "COLUMN",
		schemaName: "SCHEMA",
		tableName: "TABLE"
	} as :object {
		class : "com.collibra.connect.template.dgcdqresultconsumer.ColumnIdentifier"
	}
} as :object {
	class : "com.collibra.connect.template.dgcdqresultconsumer.Result"
}]