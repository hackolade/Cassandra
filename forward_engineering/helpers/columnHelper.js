'use strict'

const { getTypeByData } = require('./typeHelper');

module.exports = {
	getColumnDefinition(properties) {
		return Object.keys(properties).map(name => {
			const data = properties[name];
	
			return getColumn(name, getTypeDefinition(data), isStatic(data));
		}).join(',\n');
	}
};

const isStatic = (data) => Boolean((data || {}).static);

const getColumn = (name, typeDefinition, isStatic) => {
	return `"${name}" ${typeDefinition}${isStatic ? ' STATIC' : ''}`;
};

const getTypeDefinition = (data) => {
	return getTypeByData(data);
};
