const { retrieveContainerName, retrieveEntityName, retrieveUDA, retrieveUDF, retrieveIndexes } = require('./generalHelper');
const { getTableStatement } = require('./tableHelper');
const { getUdtMap, getUdtScripts } = require('./udtHelper');
const { getIndexes } = require('./indexHelper');
const { getKeyspaceStatement } = require('./keyspaceHelper');

const getCreateTableScript = (data) => {
	const containerName = retrieveContainerName(data.containerData);
	const entityName = retrieveEntityName(data.entityData);
	const dataSources = [
		data.externalDefinitions,
		data.modelDefinitions,
		data.internalDefinitions,
		data.jsonSchema
	];

	let udtTypeMap = getUdtMap(dataSources);

	let UDT = getUdtScripts(containerName, dataSources, udtTypeMap)

	const table = getTableStatement({
		tableData: data.jsonSchema,
		tableMetaData: data.entityData,
		keyspaceMetaData: data.containerData,
		dataSources,
		udtTypeMap
	});
	const indexes = getIndexes(retrieveIndexes(data.entityData), dataSources, entityName, containerName);
	const UDF = getUserDefinedFunctions(retrieveUDF(data.containerData));
	const UDA = getUserDefinedAggregations(retrieveUDA(data.containerData));

	const cqlScript = getScript([
		UDF,
		UDA,
		...UDT,
		table,
		indexes
	]);
    return cqlScript;
}

const getScript = (structure) => {
	return structure.filter(item => item).join('\n\n');
};

const getUserDefinedFunctions = (udfItems) => {
	return udfItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};

const getUserDefinedAggregations = (udaItems) => {
	return udaItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};

module.exports = {
	getCreateTableScript
};
