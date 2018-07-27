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

const getRootItemNameById = (id, properties) => {
	return Object.keys(properties).find(propertyName => (properties[propertyName].GUID === id));
};

const findFieldNameById = (id, source) => {
	let path = getPathById(source, id, []);

	if (path) {
		return getRootItemNameById(path[0], source.properties);
	} else {
		return "";
	}
};

const getNamesByIds = (ids, sources) => {
	return ids.reduce((hash, id) => {
		for (let i = 0; i < sources.length; i++) {
			const name = findFieldNameById(id, sources[i]);

			if (name) {
				return Object.assign({}, hash, { [id]: name });
			}
		}

		return hash;
	}, {});
};

module.exports = {
	getPathById,
	getNamesByIds
};
