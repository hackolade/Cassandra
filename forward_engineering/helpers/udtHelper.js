'use strict'

const { tab, getNameWithKeyspace, eachField } = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');

const getUdtScripts = (keyspaceName, sources, udtMap) => {
	return sources.reduce((definitions, source) => {
		const udts = getAllUdt(source, udtMap).map(({ name, definition }) => {
			return getCreateTypeStatement(keyspaceName, name, definition);
		});

		return definitions.concat(udts);
	}, []);
};

const getName = (name, property) => {
	return property.code || name;
};

const getCreateTypeStatement = (keyspaceName, typeName, fieldsDefinitions) => {
	return `CREATE TYPE IF NOT EXISTS ${getNameWithKeyspace(keyspaceName, typeName)} (\n${tab(fieldsDefinitions)}\n);`
};

const getUdtMap = (udtSources) => {
	return udtSources.reduce((map, source) => {
		eachField(source, (field, fieldName) => {
			if (field.type === 'udt') {
				map[fieldName] = getName(fieldName, field);
			}

			return field;
		});
		
		return map;
	}, {});
};

const getAllUdt = (jsonSchema, udtTypeMap) => {
	const udts = [];

	eachField(jsonSchema, (field, fieldName) => {
		if (field.type === 'udt' && field.properties) {
			udts.push({
				name: getName(fieldName, field),
				definition: getColumnDefinition(field.properties, udtTypeMap)
			});
		}

		return field;
	});

	return udts;
};

module.exports = {
	getUdtScripts,
	getUdtMap
};
