const { retrieveContainerName, retrieveEntityName, retrieveUDA, retrieveUDF, retrieveIndexes, commentDeactivatedStatement, retrieveIsItemActivated } = require('./generalHelper');
const { getTableStatement } = require('./tableHelper');
const { getUdtMap, getUdtScripts } = require('./udtHelper');
const { getIndexes } = require('./indexHelper');

const getCreateTableScript = (data, isKeyspaceActivated) => {
	const containerName = retrieveContainerName(data.containerData);
	const entityName = retrieveEntityName(data.entityData);
	const isEntityActivated = retrieveIsItemActivated(data.entityData);
	const isEntityChildrenActivated = isKeyspaceActivated && isEntityActivated;
	const dataSources = [
		data.externalDefinitions,
		data.modelDefinitions,
		data.internalDefinitions,
		data.jsonSchema
	];

	let udtTypeMap = getUdtMap(dataSources);

	let UDT = getUdtScripts(containerName, dataSources, udtTypeMap, isEntityChildrenActivated);

	const table = getTableStatement({
		tableData: data.jsonSchema,
		tableMetaData: data.entityData,
		keyspaceMetaData: data.containerData,
		dataSources,
		udtTypeMap,
		isKeyspaceActivated: isEntityChildrenActivated
	});
	const dbVersion = data.modelData?.[0]?.dbVersion;
	const indexes = getIndexes(retrieveIndexes(data.entityData, dbVersion), dataSources, entityName, containerName, isEntityActivated, isKeyspaceActivated, dbVersion);
	const UDF = getUserDefinedFunctions(retrieveUDF(data.containerData));
	const UDA = getUserDefinedAggregations(retrieveUDA(data.containerData));

	const cqlScript = getScript([
		UDF,
		UDA,
		...UDT,
		table,
		indexes
	]);

	return commentDeactivatedStatement(cqlScript, isEntityActivated && isKeyspaceActivated);
}

const getScript = (structure) => {
	return structure.filter(item => item).join('\n\n');
};

const getUserDefinedFunctions = (udfItems) => {
	return udfItems.map(item => item.functionBody).filter(item => item).join('\n');
};

const getUserDefinedAggregations = (udaItems) => {
	return udaItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};

module.exports = {
	getCreateTableScript
};
