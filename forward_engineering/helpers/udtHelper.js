'use strict'

const { tab } = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');

module.exports = {
	getUserDefinedTypes(keyspaceName, definitions) {
		const properties = definitions.properties || {};

		return Object.keys(properties).map(
			typeName => getCreateTypeStatement(
				keyspaceName,
				typeName,
				getFieldsDefinitions(typeName, properties[typeName])
			)
		).join('\n\n');
	}
};

const getCreateTypeStatement = (keyspaceName, typeName, fieldsDefinitions) => {
	return `CREATE TYPE IF NOT EXISTS "${keyspaceName}".${typeName} (\n${tab(fieldsDefinitions)}\n);`
};

const getFieldsDefinitions = (typeName, typeData) => {
	if (typeData.properties) {
		return getColumnDefinition(typeData.properties);
	} else {
		return getColumnDefinition({ [typeName]: typeData });
	}
};
