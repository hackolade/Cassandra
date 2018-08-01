'use strict'

const { getTypeByData } = require('./typeHelper');

module.exports = {
	getColumnDefinition(properties, udtTypeMap = {}) {
		return Object.keys(properties).map(name => {
			const data = properties[name];
	
			return getColumn(data.code || name, getTypeDefinition(data, udtTypeMap), isStatic(data));
		}).join(',\n');
	}
};

const isStatic = (data) => Boolean((data || {}).static);

const getColumn = (name, typeDefinition, isStatic) => {
	return `"${name}" ${typeDefinition}${isStatic ? ' STATIC' : ''}`;
};

const getTypeDefinition = (data, udtTypeMap) => {
	return getTypeByData(data, udtTypeMap);
};
