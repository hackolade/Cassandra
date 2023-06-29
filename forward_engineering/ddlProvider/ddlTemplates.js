module.exports = {

	dropTable: 'DROP TABLE IF EXISTS ${name};',

	createTable:
		'CREATE TABLE ${ifNotExistStatement}${name}${items}${options};',
	
	dropDatabase: 'DROP DATABASE IF EXISTS ${name};',
	
	createCustomIndex: 'CREATE CUSTOM INDEX ${ifNotExistStatement}${name}\n  ON ${tableName} (${column})\n  USING \'${usingStatement}\'${optionsStatement};',

	createIndex: 'CREATE INDEX ${ifNotExistStatement}${nameStatement}\n  ON ${tableName} (${column});',

	createSearchIndex: 'CREATE SEARCH INDEX ${ifNotExistStatement}ON ${tableName}\n  WITH COLUMNS\n${columnsStatement}${profiles}${config}${options};',

	dropType: 'DROP TYPE IF EXISTS ${keyspaceName}.${typeName};',

	renameColumn: '${alterTablePrefixStatement} RENAME ${oldName} TO ${newName};',

	addEntity: '${alterTablePrefixStatement} ADD ${name} ${type};',

	deleteEntity: '${alterTablePrefixStatement} DROP ${name};',

	addPropertyToUdt: '${alterTypePrefixStatement}.${udtName} ADD ${name} ${type};',

	createUdt: 'CREATE TYPE IF NOT EXISTS ${keySpaceName}.${udtName} (\n${columnScript} \n);',

	updateUdtType: '${alterTypePrefixStatement}.${udtName}\nALTER ${name} TYPE ${type};',
	
	renameType: '${alterTypePrefixStatement}.${udtName} \n	RENAME ${oldFieldName} TO ${newFieldName};',

	updateType: '${alterTablePrefixStatement} \n	ALTER ${name} TYPE ${type};',

	updateTableOptions: '${alterTablePrefixStatement}${optionsStatement};',

	dropSearchIndexConfig: 'ALTER SEARCH INDEX CONFIG\n  ON ${tableNameStatement}\n    DROP ${indexName};',

	modifySearchIndex: 'ALTER SEARCH INDEX CONFIG\n  ON ${tableNameStatement}\n    SET ${key} = ${value};',
	
	dropSearchIndex: 'DROP SEARCH INDEX ON ${tableNameStatement};',
	
	dropIndex: 'DROP INDEX IF EXISTS ${tableNameStatement};',

	dropKeySpace: 'DROP KEYSPACE IF EXISTS ${keySpaceName};',

	createKeySpace: 'CREATE KEYSPACE IF NOT EXISTS ${keySpaceName} \n${replication}\n${durableWrites}${udfScript}${udaScript};',

	alterKeySpaceReplication: 'ALTER KEYSPACE ${keySpaceName} \n${replication}\n${durableWrites};',

	dropView: 'DROP MATERIALIZED VIEW IF EXISTS ${viewName};',

	alterView: 'ALTER MATERIALIZED VIEW ${keySpaceViewName}\n${optionScript};',
	
};