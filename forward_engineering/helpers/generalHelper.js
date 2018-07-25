'use strict'

const TAB_SIZE = 2;

const tab = (text, count = 1) => {
	const space = ' '.repeat(count * TAB_SIZE);

	return text.split('\n').map(string => space + string).join('\n');
};

const retrivePropertyFromConfig = (config, tab, propertyName, defaultValue = "") => ((config || [])[tab] || {})[propertyName] || defaultValue;

const retrieveContainerName = (containerConfig) => retrivePropertyFromConfig(containerConfig, 0, "name", "");
const retrieveEntityName = (entityConfig) => retrivePropertyFromConfig(entityConfig, 0, "collectionName", "");
const retrieveUDF = (containerConfig) => retrivePropertyFromConfig(containerConfig, 1, "UDFs", []);
const retrieveUDA = (containerConfig) => retrivePropertyFromConfig(containerConfig, 2, "UDAs", []);
const retrieveIndexes = (entityConfig) => retrivePropertyFromConfig(entityConfig, 1, "SecIndxs", []);
const getTableNameStatement = (keyspaceName, tableName) => `${(keyspaceName) ? `"${keyspaceName}".` : ""}"${tableName}"`;

module.exports = {
	tab,
	retrieveContainerName,
	retrieveEntityName,
	retrieveUDF,
	retrieveUDA,
	retrieveIndexes,
	retrivePropertyFromConfig,
	getTableNameStatement
};
