'use strict'

const { getTypeByData } = require('./typeHelper');

module.exports = {
	getColumnDefinition(properties) {
		return Object.keys(properties).map(name => {
			const data = properties[name];
	
			return getColumn(name, getTypeDefinition(data));
		}).join(',\n');
	}
};

const getColumn = (name, typeDefinition, isPrimary, isStatic) => {
	return `"${name}" ${typeDefinition}`;
};

const getTypeDefinition = (data) => {
	return getTypeByData(data);
};
