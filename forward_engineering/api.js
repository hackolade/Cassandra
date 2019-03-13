'use strict'

const { retrieveContainerName, retrieveEntityName, retrieveUDA, retrieveUDF, retrieveIndexes } = require('./helpers/generalHelper');
const { getTableStatement } = require('./helpers/tableHelper');
const { sortUdt, getUdtMap, getUdtScripts } = require('./helpers/udtHelper');
const { getIndexes } = require('./helpers/indexHelper');
const { getKeyspaceStatement } = require('./helpers/keyspaceHelper');
const { getAlterScript } = require('./helpers/updateHelper');
const { getCreateTableScript } = require('./helpers/createHelper');
const { applyToInstance, testConnection } = require('./helpers/dbConnectionService/index');

module.exports = {
	generateScript(data, logger, callback) {
		try {
			data.udtTypeMap = getUdtMap([data.modelDefinitions, data.externalDefinitions]);
			data.jsonSchema = JSON.parse(data.jsonSchema);
			data.modelDefinitions = sortUdt(JSON.parse(data.modelDefinitions));
			data.internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions));
			data.externalDefinitions = JSON.parse(data.externalDefinitions);

			if (data.isUpdateScript) {
				callback(null, getAlterScript(data.jsonSchema, data.udtTypeMap, data));
			} else {
				let script = `${getKeyspaceStatement(data.containerData)}\n\n${getCreateTableScript(data)}`;
				callback(null, script);
			}
		} catch (e) {
			logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

			setTimeout(() => {
				callback({ message: e.message, stack: e.stack });
			}, 150);
		}
	},

	generateContainerScript(data, logger, callback) {
		try {
			if (data.isUpdateScript) {
				let result = '';
				data.udtTypeMap = getUdtMap([data.modelDefinitions, data.externalDefinitions]);
				data.collections.forEach(jsonSchema => {
					result += getAlterScript(JSON.parse(jsonSchema), data.udtTypeMap);
				})
				callback(null, result);
			} else {
				const modelDefinitions = sortUdt(JSON.parse(data.modelDefinitions));
				const externalDefinitions = JSON.parse(data.externalDefinitions);
				const containerData = data.containerData;
				let cqlScriptData = [];

				const containerName = retrieveContainerName(containerData);
				const keyspace = getKeyspaceStatement(containerData);

				const generalUdtTypeMap = getUdtMap([modelDefinitions, externalDefinitions]);
				let generalUDT = getUdtScripts(containerName, [
					externalDefinitions,
					modelDefinitions
				], generalUdtTypeMap);

				const UDF = getUserDefinedFunctions(retrieveUDF(containerData));
				const UDA = getUserDefinedAggregations(retrieveUDA(containerData));

				cqlScriptData.push(
					keyspace,
					...generalUDT
				);

				data.entities.forEach(entityId => {
					const internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions[entityId]));
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
					const internalUdt = getUdtScripts(containerName, [internalDefinitions, jsonSchema], udtTypeMap);
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
			}
		} catch (e) {
			logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

			setTimeout(() => {
				callback({ message: e.message, stack: e.stack });
			}, 150);
		}
	},

	applyToInstance(connectionInfo, logger, callback) {
		logger.clear();
		logger.log('info', connectionInfo, 'connectionInfo', connectionInfo.hiddenKeys);

		applyToInstance(connectionInfo, logger)
			.then(result => {
				callback(null, result);
			})
			.catch(error => {
				callback(error);
			});
	},

	testConnection(connectionInfo, logger, callback) {
		testConnection(connectionInfo)
			.then(
				callback,
				callback
			);
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