%dw 1.0
%output application/java
---
[{
	
			"externalEntityId": "extId1",
			"name": "Rule Name1",
			"description" : "Some Desc1",
			"note" : "Some Notes1",
			"result" : true,
			"qualityScore" : 0.9,
			"rowsFailed" : 1,
			"rowsPassed" : 10,
			
			"dimension": "CONFORMITY",
	
			"evaluatedColumns": [{
				"databaseName": "DB_NAME1",
				"schemaName": "SCHEMA_NAME1",
				"tableName": "TABLE_NAME1",
				"name": "COLUMN_NAME1"
			}],
			"customAttributes" :[]
		}, {
	
			"externalEntityId": "extId2",
			"name": "Rule Name2",
			"dimension": "CONFORMITY",
			"result" : false,
			"qualityScore" : 0.4,
			"rowsFailed" : 6,
			"rowsPassed" : 4,
	
	
			"evaluatedColumns": [{
				"databaseName": "DB_NAME2",
				"schemaName": "SCHEMA_NAME2",
				"tableName": "TABLE_NAME2",
				"name": "COLUMN_NAME2"
			},{
				"databaseName": "DB_NAME2",
				"schemaName": "SCHEMA_NAME3",
				"tableName": "TABLE_NAME3",
				"name": "COLUMN_NAME3"
			}],
			"customAttributes" :[]
		}]