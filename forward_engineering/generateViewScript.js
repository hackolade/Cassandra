const { getViewScript } = require('./helpers/viewHelper');
const { setDependencies } = require('./helpers/appDependencies');
const { initPluginConfiguration } = require('../helpers/levelConfigHelper');

function generateViewScript(data, logger, callback, app) {
	setDependencies(app);
	initPluginConfiguration(data.pluginConfiguration, logger);

	const viewSchema = JSON.parse(data.jsonSchema || '{}');
	const entitySchema = JSON.parse(data.jsonSchema[viewSchema.viewOn] || '{}');

	const script = getViewScript({
		schema: viewSchema,
		entitySchema,
		viewData: data.viewData,
		entityData: data.entityData,
		containerData: data.containerData,
		collectionRefsDefinitionsMap: data.collectionRefsDefinitionsMap,
		ifNotExist: viewSchema.viewIfNotExist,
	});

	callback(null, script);
}

module.exports = {
	generateViewScript,
};
