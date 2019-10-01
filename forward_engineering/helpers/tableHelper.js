'use strict'

const { 
	tab,
	retrieveContainerName,
	retrieveEntityName,
	retrivePropertyFromConfig,
	getTableNameStatement
} = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');
const { getNamesByIds } = require('./schemaHelper');
const { getEntityLevelConfig } = require('./generalHelper');
const { parseTableOptions } = require('./parseTableOptions');

module.exports = {
	getTableStatement({
		tableData,
		tableMetaData,
		dataSources,
		keyspaceMetaData,
		udtTypeMap
	}) {
		const keyspaceName = retrieveContainerName(keyspaceMetaData);
		const tableName = retrieveEntityName(tableMetaData);
		const partitionKeys = retrivePropertyFromConfig(tableMetaData, 0, "compositePartitionKey", []);
		const clusteringKeys = retrivePropertyFromConfig(tableMetaData, 0, "compositeClusteringKey", []);
		const tableId = retrivePropertyFromConfig(tableMetaData, 0, "schemaId", "");
		const tableComment = retrivePropertyFromConfig(tableMetaData, 0, "comments", "");
		const tableOptions = retrivePropertyFromConfig(tableMetaData, 0, "tableOptions", "");

		const partitionKeysHash = getNamesByIds(
			partitionKeys.map(key => key.keyId),
			dataSources
		);
		const clusteringKeysHash = getNamesByIds(
			clusteringKeys.map(key => key.keyId),
			dataSources
		);

		return getCreateTableStatement(
			keyspaceName,
			tableName,
			getColumnDefinition(tableData.properties || {}, udtTypeMap),
			getPrimaryKeyList(partitionKeysHash, clusteringKeysHash),
			getOptions(tableOptions, tableComment)
		);
	}
};

const getCreateTableStatement = (keyspaceName, tableName, columnDefinition, primaryKeys, options) => {
	const items = [];

	if (columnDefinition) {
		items.push(columnDefinition);
	}

	if (primaryKeys) {
		items.push(`PRIMARY KEY (${primaryKeys})`);
	}

	return `CREATE TABLE IF NOT EXISTS ${getTableNameStatement(keyspaceName, tableName)} (\n` + 
		items.map(item => tab(item)).join(',\n') + '\n' +
	`)${options};`;
};

const getPrimaryKeyList = (partitionKeysHash, clusteringKeysHash) => {
	const partitionKeys = getPartitionKeys(partitionKeysHash);
	const clusteringKeys = getClusteringKeys(clusteringKeysHash);
	const keys = [];

	if (partitionKeys) {
		keys.push(partitionKeys);
	}

	if (clusteringKeys) {
		keys.push(clusteringKeys);
	}

	return keys.join(', ');
};

const getPartitionKeys = (partitionKeysHash) => {
	const keysIds = Object.keys(partitionKeysHash);

	if (keysIds.length) {
		const keysString = `"${keysIds.map(id => partitionKeysHash[id]).join('", "')}"`;

		return (keysIds.length > 1) ? `(${keysString})` : keysString;
	} else {
		return "";
	}
};

const getClusteringKeys = (clusteringKeysHash) => {
	const keysIds = Object.keys(clusteringKeysHash);

	if (keysIds.length) {
		return `"${keysIds.map(id => clusteringKeysHash[id]).join('", "')}"`;
	} else {
		return "";
	}
};

const seedOptionsWithValues = (options, valueObject) => options.map(option => {
	const value = valueObject[option['propertyKeyword']];
	if (!value) {
		return option;
	}

	return Object.assign({}, option, { value });
});

const getOptionsFromTab = config => {
	const optionsBlock = config.structure.find(prop => prop.propertyName === 'Options');
	return optionsBlock.structure;
}


const getOptions = (tableOptions, comment) => {
	const [detailsTab] = getEntityLevelConfig();
	const configOptions = getOptionsFromTab(detailsTab);
	const optionsWithValues = seedOptionsWithValues(configOptions, tableOptions);

	return parseTableOptions(optionsWithValues, comment);
};
