'use strict';

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
} = require('../generalHelper');
const { getTableStatement } = require('../tableHelper');
const { sortUdt, getUdtMap, getUdtScripts, prepareDefinitions } = require('../udtHelper');
const { getIndexes } = require('../indexHelper');
const { getKeyspaceStatement } = require('../keyspaceHelper');
const { getViewScript } = require('../viewHelper');
const { setDependencies } = require('../appDependencies');
const { getScriptOptions } = require('../getScriptOptions');
const { buildContainerLevelAlterScript } = require('../alterScriptBuilder');
const { joinScripts } = require('./joinScripts');

function generateContainerScript(data, logger, callback, app) {
	try {
		setDependencies(app);
		if (data.isUpdateScript) {
			const { udtTypeMap, modelDefinitions, externalDefinitions } = prepareDefinitions(data);
			data = { ...data, udtTypeMap, modelDefinitions, externalDefinitions };
			data.scriptOptions = getScriptOptions(data);

			const scripts = data.entities.map(entityId => {
				const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
				data.internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions[entityId]));
				return buildContainerLevelAlterScript(jsonSchema, data.udtTypeMap, data);
			});
			callback(null, scripts.filter(Boolean).join('\n\n'));
		} else {
			const modelDefinitions = sortUdt(JSON.parse(data.modelDefinitions));
			const externalDefinitions = JSON.parse(data.externalDefinitions);
			const containerData = data.containerData;
			let cqlScriptData = [];

			const containerName = retrieveContainerName(containerData);
			const keyspace = getKeyspaceStatement(containerData);
			const isKeyspaceActivated = retrieveIsItemActivated(containerData);

			const generalUdtTypeMap = getUdtMap([modelDefinitions, externalDefinitions]);
			let generalUDT = getUdtScripts(
				containerName,
				[externalDefinitions, modelDefinitions],
				generalUdtTypeMap,
				isKeyspaceActivated,
			);

			const UDF = getUserDefinedFunctions(retrieveUDF(containerData));
			const UDA = getUserDefinedAggregations(retrieveUDA(containerData));

			const dbVersion = data.modelData[0].dbVersion;

			cqlScriptData.push(keyspace, ...generalUDT);

			data.entities.forEach(entityId => {
				const internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions[entityId]));
				const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
				const entityData = data.entityData[entityId];
				const udtTypeMap = Object.assign({}, generalUdtTypeMap, getUdtMap([internalDefinitions, jsonSchema]));

				const entityName = retrieveEntityName(entityData);
				const isEntityActivated = retrieveIsItemActivated(entityData);
				const dataSources = [jsonSchema, modelDefinitions, internalDefinitions, externalDefinitions];
				const internalUdt = getUdtScripts(
					containerName,
					[internalDefinitions, jsonSchema],
					udtTypeMap,
					isKeyspaceActivated && isEntityActivated,
				).map(udtStatement =>
					commentDeactivatedStatement(udtStatement, isEntityActivated, isKeyspaceActivated),
				);

				const table = getTableStatement({
					tableData: jsonSchema,
					tableMetaData: entityData,
					keyspaceMetaData: containerData,
					dataSources,
					udtTypeMap,
					isKeyspaceActivated,
				});
				const indexes = getIndexes(
					retrieveIndexes(entityData, dbVersion),
					dataSources,
					entityName,
					containerName,
					isEntityActivated,
					isKeyspaceActivated,
					dbVersion,
				);

				cqlScriptData.push(...internalUdt, table, indexes);
			});

			cqlScriptData = cqlScriptData.concat(
				data.views.map(viewId => {
					const viewSchema = JSON.parse(data.jsonSchema[viewId] || '{}');

					return getViewScript({
						schema: viewSchema,
						viewData: data.viewData[viewId],
						entityData: data.entityData[viewSchema.viewOn],
						containerData: data.containerData,
						collectionRefsDefinitionsMap: data.collectionRefsDefinitionsMap,
						isKeyspaceActivated,
						ifNotExist: viewSchema.viewIfNotExist,
					});
				}),
			);

			cqlScriptData.push(UDF, UDA);

			callback(null, commentDeactivatedStatement(joinScripts(cqlScriptData), isKeyspaceActivated));
		}
	} catch (e) {
		logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

		setTimeout(() => {
			callback({ message: e.message, stack: e.stack });
		}, 150);
	}
}

module.exports = {
	generateContainerScript,
};
