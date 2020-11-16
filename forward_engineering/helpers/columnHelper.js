'use strict'

const { getTypeByData } = require('./typeHelper');
const { commentDeactivatedStatement } = require('./generalHelper');

module.exports = {
	getColumnDefinition(properties, udtTypeMap = {}, isParentActivated = false) {
		return Object.keys(properties).map(name => {
			const data = properties[name];
			const typeDefinition = getTypeDefinition(data, udtTypeMap, name);

			if (typeDefinition === undefined) {
				return '';
			} else {
				const columnStatement = getColumn(
					data.code || name,
					typeDefinition,
					isStatic(data)
				);
				return commentDeactivatedStatement(
					columnStatement,
					data.isActivated,
					isParentActivated,
					false
				);
			}
		}).filter(column => column).join(',\n');
	}
};

const isStatic = (data) => Boolean((data || {}).static);

const getColumn = (name, typeDefinition, isStatic) => {
	return `"${name}" ${typeDefinition}${isStatic ? ' STATIC' : ''}`;
};

const getTypeDefinition = (data, udtTypeMap, name) => {
	return getTypeByData(data, udtTypeMap, name);
};
