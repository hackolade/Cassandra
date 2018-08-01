'use strict'

const { retrieveContainerName, retrieveEntityName, retrieveUDA, retrieveUDF, retrieveIndexes } = require('./helpers/generalHelper'); 
const { getTableStatement } = require('./helpers/tableHelper');
const { getUserDefinedTypes } = require('./helpers/udtHelper');
const { getIndexes } = require('./helpers/indexHelper');
const { getKeyspaceStatement } = require('./helpers/keyspaceHelper');

module.exports = {
	generateScript(data, logger, callback) {
		try {
			data.jsonSchema = JSON.parse(data.jsonSchema);
			data.modelDefinitions = JSON.parse(data.modelDefinitions);
			data.internalDefinitions = JSON.parse(data.internalDefinitions);
			data.externalDefinitions = JSON.parse(data.externalDefinitions);

			const containerName = retrieveContainerName(data.containerData);
			const entityName = retrieveEntityName(data.entityData);
			const dataSources = [
				data.jsonSchema,
				data.modelDefinitions,
				data.internalDefinitions,
				data.externalDefinitions
			];

			const keyspace = getKeyspaceStatement(data.containerData);
			const modelUdt = getUserDefinedTypes(containerName, data.modelDefinitions);
			const internalUdt = getUserDefinedTypes(containerName, data.internalDefinitions);
			const externalUdt = getUserDefinedTypes(containerName, data.externalDefinitions);
			const table = getTableStatement({
				tableData: data.jsonSchema,
				tableMetaData: data.entityData,
				keyspaceMetaData: data.containerData,
				dataSources
			});
			const indexes = getIndexes(retrieveIndexes(data.entityData), dataSources, entityName, containerName);
			const UDF = getUserDefinedFunctions(retrieveUDF(data.containerData));
			const UDA = getUserDefinedAggregations(retrieveUDA(data.containerData));

			const cqlScript = getScript([
				keyspace,
				UDF,
				UDA,
				modelUdt,
				internalUdt,
				externalUdt,
				table,
				indexes
			]);

			callback(null, cqlScript);	
		} catch (e) {
			logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

			setTimeout(() => {
				callback({ message: e.message, stack: e.stack });
			}, 150);
		}
	},

	generateContainerScript(data, logger, callback) {
		const modelDefinitions = JSON.parse(data.modelDefinitions);
		const externalDefinitions = JSON.parse(data.externalDefinitions);
		const containerData = data.containerData;
		let cqlScriptData = [];

		const containerName = retrieveContainerName(containerData);
		const keyspace = getKeyspaceStatement(containerData);
		const modelUdt = getUserDefinedTypes(containerName, modelDefinitions);
		const externalUdt = getUserDefinedTypes(containerName, externalDefinitions);
		const UDF = getUserDefinedFunctions(retrieveUDF(containerData));
		const UDA = getUserDefinedAggregations(retrieveUDA(containerData));

		cqlScriptData.push(
			keyspace,
			modelUdt,
			externalUdt
		);

		data.entities.forEach(entityId => {
			const internalDefinitions = JSON.parse(data.internalDefinitions[entityId]);
			const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
			const entityData = data.entityData[entityId];

			const entityName = retrieveEntityName(entityData);
			const dataSources = [
				jsonSchema,
				modelDefinitions,
				internalDefinitions,
				externalDefinitions
			];
			const internalUdt = getUserDefinedTypes(containerName, internalDefinitions);
			const table = getTableStatement({
				tableData: jsonSchema,
				tableMetaData: entityData,
				keyspaceMetaData: containerData,
				dataSources
			});
			const indexes = getIndexes(retrieveIndexes(entityData), dataSources, entityName, containerName);
	
			cqlScriptData.push(internalUdt, table, indexes);
		});

		cqlScriptData.push(UDF, UDA);

		callback(null, getScript(cqlScriptData));
	}
};

const getScript = (structure) => {
	return structure.filter(item => item).join('\n\n');
};

const getUserDefinedFunctions = (udfItems) => {
	return udfItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};

const getUserDefinedAggregations = (udaItems) => {
	return udaItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};
