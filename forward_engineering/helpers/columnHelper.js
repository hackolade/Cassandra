'use strict'

module.exports = {
	getColumnDefinition(properties, typeHandler) {
		return Object.keys(properties).map(name => {
			const data = properties[name];
	
			return getColumn(name, getTypeDefinition(data, typeHandler));
		}).join(',\n');
	}
};

const getColumn = (name, typeDefinition, isPrimary, isStatic) => {
	return `"${name}" ${typeDefinition}`;
};

const getTypeDefinition = (data, typeHandler) => {
	const getType = (data) => {
		if (data.$ref) {
			return data.$ref.split('/').pop();
		} else if (data.type) {
			return data.type;
		} else {
			return "string";
		}
	};
	
	const handlers = typeHandler();
	const type = getType(data);
	const handler = handlers[type] || (() => type);

	return handler(data);
};
