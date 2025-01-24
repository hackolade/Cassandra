const { isDropInStatements: containsDropScript } = require('./helpers/alterScriptBuilder');
const { sortUdt, prepareDefinitions } = require('./helpers/udtHelper');
const { setDependencies } = require('./helpers/appDependencies');
const { initPluginConfiguration } = require('../helpers/levelConfigHelper');

function isDropInStatements(data, logger, callback, app) {
	try {
		setDependencies(app);
		initPluginConfiguration(data.pluginConfiguration, logger);

		let result;
		const { udtTypeMap, modelDefinitions, externalDefinitions } = prepareDefinitions(data);

		if (data.level === 'container') {
			data = { ...data, udtTypeMap, modelDefinitions, externalDefinitions };
			result = data.entities
				.map(entityId => {
					const jsonSchema = JSON.parse(data.jsonSchema[entityId]);
					data.internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions[entityId]));
					return containsDropScript(jsonSchema, data.udtTypeMap, data);
				})
				.some(Boolean);
		} else if (data.level === 'entity') {
			const jsonSchema = JSON.parse(data.jsonSchema);
			const internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions));
			data = { ...data, udtTypeMap, modelDefinitions, externalDefinitions, jsonSchema, internalDefinitions };
			result = containsDropScript(data.jsonSchema, data.udtTypeMap, data);
		}

		callback(null, result);
	} catch (e) {
		callback({ message: e.message, stack: e.stack });
	}
}

module.exports = {
	isDropInStatements,
};
