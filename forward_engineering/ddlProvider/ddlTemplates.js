module.exports = {

	dropTable: 'DROP TABLE IF EXISTS ${name};',

	createTable:
		'CREATE TABLE ${ifNotExists}${name}${items}${options};',
	
	dropDatabase: 'DROP DATABASE IF EXISTS ${name};',
	
	createCustomIndex: 'CREATE CUSTOM INDEX ${ifNotExistStatement}"${name}"\n  ON ${tableName} (${column})\n  USING \'${usingStatement}\'${optionsStatement};',

	createIndex: 'CREATE INDEX ${ifNotExistStatement}${nameStatement}\n  ON ${tableName} (${column});',

	createSearchIndex: 'CREATE SEARCH INDEX ${ifNotExistStatement}ON ${tableName}\n  WITH COLUMNS\n${columnsStatement}${profiles}${config}${options};',

	dropType: 'DROP TYPE IF EXISTS "${keyspaceName}"."${typeName}";',

	renameColumn: '${alterTablePrefixStatement} RENAME "${oldName}" TO "${newName}";',

	addEntity: '${alterTablePrefixStatement} ADD "${name}" ${type};',

	deleteEntity: '${alterTablePrefixStatement} DROP "${name}";',

	addPropertyToUdt: '${alterTypePrefixStatement}."${udtName}" ADD "${name}" ${type};',

	createUdt: 'CREATE TYPE IF NOT EXISTS "${keySpaceName}"."${udtName}" (\n${columnScript} \n);',

	updateType: '${alterTypePrefixStatement}."${udtName}"\nALTER "${name}" TYPE ${type};',
};