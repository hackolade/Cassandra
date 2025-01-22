const { retrieveIsItemActivated, commentDeactivatedStatement } = require('./helpers/generalHelper');
const { sortUdt, prepareDefinitions } = require('./helpers/udtHelper');
const { getKeyspaceStatement } = require('./helpers/keyspaceHelper');
const { getCreateTableScript } = require('./helpers/createHelper');
const { setDependencies } = require('./helpers/appDependencies');
const { getScriptOptions } = require('./helpers/getScriptOptions');
const { buildContainerLevelAlterScript } = require('./helpers/alterScriptBuilder');
const { initPluginConfiguration } = require('../helpers/levelConfigHelper');

function generateScript(data, logger, callback, app) {
	try {
		initPluginConfiguration(data.pluginConfiguration, logger);
		setDependencies(app);

		const { udtTypeMap, modelDefinitions, externalDefinitions } = prepareDefinitions(data);
		const jsonSchema = JSON.parse(data.jsonSchema);
		const internalDefinitions = sortUdt(JSON.parse(data.internalDefinitions));
		data = { ...data, jsonSchema, udtTypeMap, modelDefinitions, externalDefinitions, internalDefinitions };

		if (data.isUpdateScript) {
			data.scriptOptions = getScriptOptions(data);

			callback(null, buildContainerLevelAlterScript(data.jsonSchema, udtTypeMap, data));
		} else {
			const isKeyspaceActivated = retrieveIsItemActivated(data.containerData);
			const statement = `${getKeyspaceStatement(data.containerData)}\n\n${getCreateTableScript(data, isKeyspaceActivated)}`;
			const script = commentDeactivatedStatement(statement, isKeyspaceActivated);
			callback(null, script);
		}
	} catch (e) {
		logger.log('error', { message: e.message, stack: e.stack }, 'Cassandra Forward-Engineering Error');

		setTimeout(() => {
			callback({ message: e.message, stack: e.stack });
		}, 150);
	}
}

module.exports = {
	generateScript,
};
