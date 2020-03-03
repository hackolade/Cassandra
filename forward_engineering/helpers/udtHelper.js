'use strict'

const { tab, getNameWithKeyspace, eachField } = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');

const getUdtScripts = (keyspaceName, sources, udtMap) => {
	const copyUdtTypeMap = setFrozenForAllUdt(udtMap);

	return sources.reduce((definitions, source) => {
		const udts = getAllUdt(source, copyUdtTypeMap).map(({ name, definition }) => {
			return getCreateTypeStatement(keyspaceName, name, definition);
		});

		return definitions.concat(udts);
	}, []);
};

const setFrozenForAllUdt = (udtTypeMap) => {
	return Object.keys(udtTypeMap).reduce((typeMap, typeName) => {
		return Object.assign(typeMap, { [typeName]: Object.assign({}, udtTypeMap[typeName], { frozen: true }) })
	}, {});
};

const getName = (name, property) => {
	if (typeof name === 'number' && property.name) {
		return property.name;
	}

	return property.code || name;
};

const getCreateTypeStatement = (keyspaceName, typeName, fieldsDefinitions) => {
	return `CREATE TYPE IF NOT EXISTS ${getNameWithKeyspace(keyspaceName, typeName)} (\n${tab(fieldsDefinitions)}\n);`
};

const getUdtMap = (udtSources) => {
	return udtSources.reduce((map, source) => {
		eachField(source, (field, fieldName) => {
			if (field.type === 'udt') {
				map[fieldName] = {
					name: getName(fieldName, field),
					frozen: field.frozen
				};
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

const sortUdt = (definitionJsonSchema) => {
	if (!definitionJsonSchema.properties) {
		return definitionJsonSchema;
	}

	const udtNames = Object.keys(definitionJsonSchema.properties);
	let orderedUdtNames = [];
	
	udtNames.forEach(udtName => {
		let references = [];

		eachField(definitionJsonSchema.properties[udtName], (field) => {
			if (field.$ref) {
				const udtName = field.$ref.split('/').pop();
				
				if (references.indexOf(udtName) === -1) {
					references.push(udtName);
				}
			}
		});

		if (references.length) {
			orderedUdtNames.push(...references.filter(name => orderedUdtNames.indexOf(name) === -1));
		} else {
			const i = orderedUdtNames.indexOf(udtName);

			if (i === -1) {
				orderedUdtNames.unshift(udtName);
			} else {
				orderedUdtNames.unshift(...orderedUdtNames.splice(i, 1));
			}
		}
	});


	udtNames.forEach(udtName => {
		if (orderedUdtNames.indexOf(udtName) === -1) {
			orderedUdtNames.push(udtName);
		}
	});

	let properties = {};

	orderedUdtNames.forEach(udtName => {
		if (definitionJsonSchema.properties[udtName]) {
			properties[udtName] = Object.assign({}, definitionJsonSchema.properties[udtName]);
		}
	});

	definitionJsonSchema.properties = properties;

	return definitionJsonSchema;
};

module.exports = {
	getUdtScripts,
	getUdtMap,
	sortUdt
};
