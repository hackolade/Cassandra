'use strict'

const getPathById = (schema, id, path) => {
	if (schema.GUID === id) {
		return path;
	}

	if (schema.properties) {
		return Object.keys(schema.properties).reduce((newPath, propertyName) => {
			if (newPath) {
				return newPath;
			} else {
				return getPathById(schema.properties[propertyName], id, [...path, schema.properties[propertyName].GUID]);
			}
		}, undefined);
	} else if (schema.items) {
		if (Array.isArray(schema.items)) {
			return schema.items.reduce((newPath, item) => {
				if (newPath) {
					return newPath;
				} else {
					return getPathById(item, id, [...path, item.GUID]);
				}
			}, undefined);
		} else {
			return getPathById(schema.items, id, [...path, schema.items.GUID]);
		}
	}
};

const getRootItemMetadataById = (id, properties) => {
	const propertyName = Object.keys(properties).find(propertyName => (properties[propertyName].GUID === id));

	if (properties[propertyName] && properties[propertyName].code) {
		return { name: properties[propertyName].code, isActivated: properties[propertyName].isActivated };
	}

	return { name: propertyName, isActivated: properties[propertyName] && properties[propertyName].isActivated };
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
			const { name, isActivated } = findFieldMetadataById(id, sources[i]);

			if (name) {
				return Object.assign({}, hash, { [id]: { name, isActivated }});
			}
		}

		return hash;
	}, {});
};

module.exports = {
	getPathById,
	getNamesByIds: getAttributesDataByIds
};
