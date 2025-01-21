'use strict';

const { getViewScript } = require('../viewHelper');
const { setDependencies } = require('../appDependencies');

function generateViewScript(data, logger, callback, app) {
	setDependencies(app);
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
