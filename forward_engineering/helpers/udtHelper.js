'use strict'

const { tab } = require('./formatHelper');
const { getColumnDefinition } = require('./columnHelper');

module.exports = {
	getUserDefinedTypes(keyspaceName, definitions, typeHandler) {
		const properties = definitions.properties || {};

		return Object.keys(properties).map(
			typeName => getCreateTypeStatement(
				keyspaceName,
				typeName,
				getFieldsDefinitions(typeName, properties[typeName], typeHandler)
			)
		).join('\n\n');
	}
};

const getCreateTypeStatement = (keyspaceName, typeName, fieldsDefinitions) => {
	return `CREATE TYPE IF NOT EXISTS "${keyspaceName}".${typeName} (\n${tab(fieldsDefinitions)}\n);`
};

const getFieldsDefinitions = (typeName, typeData, typeHandler) => {
	if (typeData.properties) {
		return getColumnDefinition(typeData.properties, typeHandler);
	} else {
		return getColumnDefinition({ [typeName]: typeData }, typeHandler);
	}
};
