'use strict'

const attributesForReturn = ['isActivated', 'type', 'compositePartitionKey'];

const getAttributes = (field = {}) => {
	return attributesForReturn.reduce((fieldAttributes, attribute) => {
		if (!field.hasOwnProperty(attribute) || field[attribute] === undefined) {
			return fieldAttributes
		}

		return {
			...fieldAttributes,
			[attribute]: field[attribute],
		}
	}, {});
};

const getPathById = (schema, id, path) => {
	if (schema.GUID === id || schema.id === id) {
		return path;
	}

	if (schema.properties) {
		return Object.keys(schema.properties).reduce((newPath, propertyName) => {
			if (newPath) {
				return newPath;
			} else {
				const property = schema.properties[propertyName]
				return getPathById(property, id, [...path, property.GUID || property.id]);
			}
		}, undefined);
	} else if (schema.items) {
		if (Array.isArray(schema.items)) {
			return schema.items.reduce((newPath, item) => {
				if (newPath) {
					return newPath;
				} else {
					return getPathById(item, id, [...path, item.GUID || item.id]);
				}
			}, undefined);
		} else {
			return getPathById(schema.items, id, [...path, schema.items.GUID]);
		}
	}
};

const getRootItemMetadataById = (id, properties) => {
	const propertyName = Object.keys(properties).find(propertyName => (properties[propertyName].GUID === id || properties[propertyName].id === id));
	const propertyValue = properties[propertyName];
	if (propertyValue && (propertyValue.code || propertyValue.name)) {
		return { name: propertyValue.code || propertyValue.name, ...getAttributes(properties[propertyName]) };
	}

	return { name: propertyName, ...getAttributes(properties[propertyName]) };
};

const findFieldMetadataById = (id, source) => {
	let path = getPathById(source, id, []);

	if (path) {
		return getRootItemMetadataById(path[0], source.properties);
	} else {
		return { name: "" };
	}
};

const getAttributesDataByIds = (ids, sources) => {
	return ids.reduce((hash, id) => {
		for (let i = 0; i < sources.length; i++) {
			const fieldData = findFieldMetadataById(id, sources[i]);

			if (fieldData?.name) {
				return Object.assign({}, hash, { [id]: fieldData});
			}
		}

		return hash;
	}, {});
};

module.exports = {
	getPathById,
	getNamesByIds: getAttributesDataByIds
};
