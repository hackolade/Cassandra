const { getTypeByData } = require("../typeHelper");

const removeColumnStatement = columnName => `DROP "${columnName}";`;

const alterTablePrefix = (tableName, keySpace) => 
	keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"`;

const getDelete = deleteData => {
	const script = `${alterTablePrefix(deleteData.tableName, deleteData.keyspaceName)} ${removeColumnStatement(deleteData.columnData.name)}`;
	return [{
		added: false,
		modified: false,
		deleted: true,
		script,
		field: 'field',
	}];
};

const hydrateColumn = ({ tableName, keyspaceName, isOldModel, property, udtMap }) => {
	const { oldField = {}, newField = {} } = property?.compMod || {};
	const newType = getTypeByData(property, udtMap);
	const oldType = getTypeByData(oldField, udtMap)
	return {
		property,
		isOldModel,
		oldName: oldField.name,
		newName: newField.name,
		newType,
		oldType,
		isNameChange: oldField.name !== newField.name,
		isTypeChange: newType !== oldType,
		dataForScript: {
			tableName,
			keyspaceName,
			columnData: {
				name: newField.name,
				type: newType,
			}
		}
	}
};

module.exports = {
	getDelete,
	alterTablePrefix,
	hydrateColumn
}