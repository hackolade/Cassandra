'use strict';

const { retrieveIsItemActivated, commentDeactivatedStatement } = require('../generalHelper');
const { sortUdt, prepareDefinitions } = require('../udtHelper');
const { getKeyspaceStatement } = require('../keyspaceHelper');
const { getCreateTableScript } = require('../createHelper');
const { setDependencies } = require('../appDependencies');
const { getScriptOptions } = require('../getScriptOptions');
const { buildContainerLevelAlterScript } = require('../alterScriptBuilder');

function generateScript(data, logger, callback, app) {
	try {
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
