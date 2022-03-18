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

module.exports = {
	getDelete,
	alterTablePrefix
}