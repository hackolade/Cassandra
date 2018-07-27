'use strict'
const fs = require('fs');
const path = require('path');
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

const getConfig = (pathToConfig) => {
	try {
		const config = fs.readFileSync(path.join(__dirname, "..", "..", pathToConfig));

		return JSON.parse(config.toString().replace(/\/\*[\s\S]*?\*\//g, ""));
	} catch (e) {
		return {};
	}
};

const cacheResult = (method) => {
	let result;

	return (...args) => {
		if (!result) {
			result = method(...args);
		}

		return result;
	}
};

const getFieldLevelConfig = cacheResult(() => getConfig(path.join("properties_pane", "field_level", "fieldLevelConfig.json")));

const getTypesConfig = cacheResult(() => {
	const getName = typeFile => typeFile.replace(/\.json/, "");
	const typeDir = path.join(__dirname, "..", "..", "types");
	const types = fs.readdirSync(typeDir);

	return types.reduce((typesMap, fileName) => {
		typesMap[getName(fileName)] = getConfig(path.join("types", fileName));

		return typesMap;
	}, {});
});

const getTypeConfig = (type) => getTypesConfig()[type];

const getFieldConfig = (type, property) => {
	const fieldLevelConfig = getFieldLevelConfig().structure;

	if (!fieldLevelConfig[type]) {
		return;
	}
	const propertyData = fieldLevelConfig[type].find(config => config.propertyKeyword === property);

	return propertyData;
};

module.exports = {
	tab,
	retrieveContainerName,
	retrieveEntityName,
	retrieveUDF,
	retrieveUDA,
	retrieveIndexes,
	retrivePropertyFromConfig,
	getTableNameStatement,
	getFieldConfig,
	getTypeConfig
};
