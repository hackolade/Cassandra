'use strict';

const { sortUdt, prepareDefinitions } = require('./helpers/udtHelper');
const { setDependencies } = require('./helpers/appDependencies');
const { applyToInstance, testConnection } = require('./helpers/dbConnectionService/index');
const { isDropInStatements } = require('./helpers/alterScriptBuilder');

const { generateScript } = require('./helpers/buildScript/generateScript');
const { generateViewScript } = require('./helpers/buildScript/generateViewScript');
const { generateContainerScript } = require('./helpers/buildScript/generateContainerScript');

module.exports = {
	generateScript,
	generateViewScript,
	generateContainerScript,

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
		testConnection(connectionInfo, app).then(callback, callback);
	},

	isDropInStatements(data, logger, callback, app) {
		try {
			setDependencies(app);
			let result;
			const { udtTypeMap, modelDefinitions, externalDefinitions } = prepareDefinitions(data);

			if (data.level === 'container') {
				data = { ...data, udtTypeMap, modelDefinitions, externalDefinitions };
				result = data.entities
					.map(entityId => {
						const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
						data.internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions[entityId]));
						return isDropInStatements(jsonSchema, data.udtTypeMap, data);
					})
					.some(Boolean);
			} else if (data.level === 'entity') {
				const jsonSchema = JSON.parse(data.jsonSchema);
				const internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions));
				data = { ...data, udtTypeMap, modelDefinitions, externalDefinitions, jsonSchema, internalDefinitions };
				result = isDropInStatements(data.jsonSchema, data.udtTypeMap, data);
			}

			callback(null, result);
		} catch (e) {
			callback({ message: e.message, stack: e.stack });
		}
	},
};
