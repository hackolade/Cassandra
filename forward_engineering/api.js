'use strict'

const {
	retrieveContainerName,
	retrieveEntityName,
	retrieveUDA,
	retrieveUDF,
	retrieveIndexes,
	retrieveIsItemActivated,
	commentDeactivatedStatement,
	getUserDefinedAggregations,
	getUserDefinedFunctions,
} = require('./helpers/generalHelper');
const { getTableStatement } = require('./helpers/tableHelper');
const { sortUdt, getUdtMap, getUdtScripts } = require('./helpers/udtHelper');
const { getIndexes } = require('./helpers/indexHelper');
const { getKeyspaceStatement } = require('./helpers/keyspaceHelper');
const { getAlterScript } = require('./helpers/updateHelper');
const { getViewScript } = require('./helpers/viewHelper');
const { getCreateTableScript } = require('./helpers/createHelper');
const { setDependencies } = require('./helpers/appDependencies');
const { applyToInstance, testConnection } = require('./helpers/dbConnectionService/index');
const { getScriptOptions } = require('./helpers/getScriptOptions');

module.exports = {
	generateScript(data, logger, callback, app) {
		try {
			setDependencies(app);
			data.udtTypeMap = getUdtMap([data.modelDefinitions, data.externalDefinitions]);
			data.jsonSchema = JSON.parse(data.jsonSchema);
			data.modelDefinitions = sortUdt(JSON.parse(data.modelDefinitions));
			data.internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions));
			data.externalDefinitions = JSON.parse(data.externalDefinitions);

			if (data.isUpdateScript) {
				data.scriptOptions = getScriptOptions(data);

				callback(null, getAlterScript(data.jsonSchema, data.udtTypeMap, data));
			} else {
				let script = `${getKeyspaceStatement(data.containerData)}\n\n${getCreateTableScript(data, true)}`;
				callback(null, script);
			}
		} catch (e) {
			logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

			setTimeout(() => {
				callback({ message: e.message, stack: e.stack });
			}, 150);
		}
	},

	generateViewScript(data, logger, callback, app) {
		setDependencies(app);
		const viewSchema = JSON.parse(data.jsonSchema || '{}');

		const script = getViewScript({
			schema: viewSchema,
			viewData: data.viewData,
			entityData: data.entityData,
			containerData: data.containerData,
			collectionRefsDefinitionsMap: data.collectionRefsDefinitionsMap,
			ifNotExist: viewSchema.viewIfNotExist
		});

		callback(null, script)
	},

	generateContainerScript(data, logger, callback, app) {
		try {
			setDependencies(app);
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
				const isKeyspaceActivated = retrieveIsItemActivated(containerData);
				
				const generalUdtTypeMap = getUdtMap([modelDefinitions, externalDefinitions]);
				let generalUDT = getUdtScripts(containerName, [
					externalDefinitions,
					modelDefinitions
				], generalUdtTypeMap, isKeyspaceActivated);

				const UDF = getUserDefinedFunctions(retrieveUDF(containerData));
				const UDA = getUserDefinedAggregations(retrieveUDA(containerData));

				cqlScriptData.push(
					keyspace,
					...generalUDT
				);

				data.entities.forEach((entityId) => {
					const internalDefinitions = sortUdt(
						JSON.parse(data.internalDefinitions[entityId])
					);
					const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
					const entityData = data.entityData[entityId];
					const udtTypeMap = Object.assign(
						{},
						generalUdtTypeMap,
						getUdtMap([internalDefinitions, jsonSchema])
					);

					const entityName = retrieveEntityName(entityData);
					const isEntityActivated = retrieveIsItemActivated(entityData);
					const dataSources = [
						jsonSchema,
						modelDefinitions,
						internalDefinitions,
						externalDefinitions,
					];
					const internalUdt = getUdtScripts(
						containerName,
						[internalDefinitions, jsonSchema],
						udtTypeMap,
						isKeyspaceActivated && isEntityActivated
					).map(udtStatement => commentDeactivatedStatement(udtStatement, isEntityActivated, isKeyspaceActivated));

					const table = getTableStatement({
						tableData: jsonSchema,
						tableMetaData: entityData,
						keyspaceMetaData: containerData,
						dataSources,
						udtTypeMap,
						isKeyspaceActivated,
					});
					const indexes = getIndexes(
						retrieveIndexes(entityData),
						dataSources,
						entityName,
						containerName,
						isEntityActivated,
						isKeyspaceActivated,
						data.modelData[0].dbVersion
					);
					
					cqlScriptData.push(...internalUdt, table, indexes);
				});

				cqlScriptData = cqlScriptData.concat(data.views.map(viewId => {
					const viewSchema = JSON.parse(data.jsonSchema[viewId] || '{}');

					return getViewScript({
						schema: viewSchema,
						viewData: data.viewData[viewId],
						entityData: data.entityData[viewSchema.viewOn],
						containerData: data.containerData,
						collectionRefsDefinitionsMap: data.collectionRefsDefinitionsMap,
						isKeyspaceActivated,
						ifNotExist: viewSchema.viewIfNotExist
					})
				}));

				cqlScriptData.push(UDF, UDA);

				callback(null, commentDeactivatedStatement(getScript(cqlScriptData), isKeyspaceActivated));
			}
		} catch (e) {
			logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

			setTimeout(() => {
				callback({ message: e.message, stack: e.stack });
			}, 150);
		}
	},

	applyToInstance(connectionInfo, logger, callback, app) {
		logger.clear();
		logger.log('info', connectionInfo, 'connectionInfo', connectionInfo.hiddenKeys);

		applyToInstance(connectionInfo, logger, app)
			.then(result => {
				callback(null, result);
			})
			.catch(error => {
				callback(error);
			});
	},

	testConnection(connectionInfo, logger, callback, app) {
		testConnection(connectionInfo, app)
			.then(
				callback,
				callback
			);
	}
};

const getScript = (structure) => {
	return structure.filter(item => item).join('\n\n');
};
