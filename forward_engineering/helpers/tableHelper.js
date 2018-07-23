'use strict'

const { tab } = require('./formatHelper');
const { getColumnDefinition } = require('./columnHelper');
const { getNamesByIds } = require('./schemaHelper');

module.exports = {
	getTableStatement({
		tableData,
		tableMetaData,
		modelDefinitions,
		internalDefinition,
		keyspaceMetaData,
		typeHandler
	}) {
		const keyspaceName = (keyspaceMetaData[0] || {}).name || "";
		const tableName = (tableMetaData[0] || {}).collectionName || "";

		return getCreateTableStatement(
			keyspaceName,
			tableName,
			getColumnDefinition(tableData.properties, typeHandler),
			getPrimaryKeyList(tableMetaData[0], [ tableData, modelDefinitions, internalDefinition ]),
			getOptions()
		);
	}
};

const getCreateTableStatement = (keyspaceName, tableName, columnDefinition, primaryKeys, options) => 
	`CREATE TABLE IF NOT EXISTS "${keyspaceName}"."${tableName}" (\n` + 
		`${tab(columnDefinition)},\n` + 
		`${tab(`PRIMARY KEY (${primaryKeys})`)}\n`+
	`)${options};`;

const getPrimaryKeyList = (tableMetaData, fieldSources) => {
	const partitionKeys = getPartitionKeys(tableMetaData.compositePartitionKey || [], fieldSources);
	const clusteringKeys = getClusteringKeys(tableMetaData.compositeClusteringKey || [], fieldSources);

	return [partitionKeys, clusteringKeys].join(', ');
};

const getPartitionKeys = (partitionKeys, sources) => {
	const names = getNamesByIds(partitionKeys.map(key => key.keyId), sources);

	if (names) {
		if (names.length > 1) {
			return `("${names.join('", "')}")`;
		} else {
			return `"${names[0]}"`;
		}
	} else {
		return "";
	}
};

const getClusteringKeys = (clusteringKeys, sources) => {
	const names = getNamesByIds(clusteringKeys.map(key => key.keyId), sources);

	if (names) {
		return `"${names.join('", "')}"`;
	} else {
		return "";
	}
};

const getOptions = () => "";
