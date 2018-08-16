'use strict'

const { retrieveContainerName, retrieveEntityName, retrieveUDA, retrieveUDF, retrieveIndexes } = require('./helpers/generalHelper'); 
const { getTableStatement } = require('./helpers/tableHelper');
const { getUserDefinedTypes, getUdtMap, getUdtScripts } = require('./helpers/udtHelper');
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
				keyspace,
				UDF,
				UDA,
				...UDT,
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
		try {
			const modelDefinitions = JSON.parse(data.modelDefinitions);
			const externalDefinitions = JSON.parse(data.externalDefinitions);
			const containerData = data.containerData;
			let cqlScriptData = [];

			const containerName = retrieveContainerName(containerData);
			const keyspace = getKeyspaceStatement(containerData);

			const generalUdtTypeMap = getUdtMap([modelDefinitions, externalDefinitions]);
			let generalUDT = getUdtScripts(containerName, [
				modelDefinitions,
				externalDefinitions
			], generalUdtTypeMap);

			const UDF = getUserDefinedFunctions(retrieveUDF(containerData));
			const UDA = getUserDefinedAggregations(retrieveUDA(containerData));

			cqlScriptData.push(
				keyspace,
				...generalUDT
			);

			data.entities.forEach(entityId => {
				const internalDefinitions = JSON.parse(data.internalDefinitions[entityId]);
				const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
				const entityData = data.entityData[entityId];
				const udtTypeMap = Object.assign({}, generalUdtTypeMap, getUdtMap([internalDefinitions, jsonSchema]));

				const entityName = retrieveEntityName(entityData);
				const dataSources = [
					jsonSchema,
					modelDefinitions,
					internalDefinitions,
					externalDefinitions
				];
				const internalUdt = getUdtScripts(containerName, [ jsonSchema, internalDefinitions ], udtTypeMap);
				const table = getTableStatement({
					tableData: jsonSchema,
					tableMetaData: entityData,
					keyspaceMetaData: containerData,
					dataSources,
					udtTypeMap
				});
				const indexes = getIndexes(retrieveIndexes(entityData), dataSources, entityName, containerName);
		
				cqlScriptData.push(...internalUdt, table, indexes);
			});

			cqlScriptData.push(UDF, UDA);

			callback(null, getScript(cqlScriptData));
		} catch (e) {
			logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

			setTimeout(() => {
				callback({ message: e.message, stack: e.stack });
			}, 150);
		}
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
