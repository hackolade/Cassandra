'use strict'

const { tab, getNameWithKeyspace } = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');

const getUserDefinedTypes = (keyspaceName, definitions, udtTypeMap) => {
	const properties = definitions.properties || {};

	return Object.keys(properties).map(
		typeName => getCreateTypeStatement(
			keyspaceName,
			getName(typeName, properties[typeName]),
			getFieldsDefinitions(
				getName(typeName, properties[typeName]),
				properties[typeName],
				udtTypeMap
			)
		)
	).join('\n\n');
};

const getName = (name, property) => {
	return property.code || name;
};

const getCreateTypeStatement = (keyspaceName, typeName, fieldsDefinitions) => {
	return `CREATE TYPE IF NOT EXISTS ${getNameWithKeyspace(keyspaceName, typeName)} (\n${tab(fieldsDefinitions)}\n);`
};

const getFieldsDefinitions = (typeName, typeData, udtTypeMap) => {
	if (typeData.properties) {
		return getColumnDefinition(typeData.properties, udtTypeMap);
	} else {
		return getColumnDefinition({ [typeName]: typeData }, udtTypeMap);
	}
};

const getUdtMap = (udtSources) => {
	return udtSources.reduce((map, source) => {
		if (source.properties) {
			return Object.assign(
				{}, map, Object.keys(source.properties).reduce((map, name) => {
					return Object.assign(map, { [name]: getName(name, source.properties[name]) });
				},{})
			);
		} else {
			return map;
		}
	}, {});
};

module.exports = {
	getUserDefinedTypes,
	getUdtMap
};
