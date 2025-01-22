const fs = require('fs');
const path = require('path');

let pluginConfiguration = {};
let logger = {};
const descriptors = {};

const initPluginConfiguration = (config, appLogger) => {
	logger = appLogger;
	pluginConfiguration = config || {};
};

const getTypeConfig = typeName => {
	if (descriptors[typeName]) {
		return descriptors[typeName];
	}

	try {
		descriptors[typeName] = require(`../types/${typeName}.json`);

		return descriptors[typeName];
	} catch (e) {
		return {};
	}
};

const getFieldLevelConfig = type => pluginConfiguration.fieldLevelConfig;

const getEntityLevelConfig = () => pluginConfiguration.entityLevelConfig;

module.exports = {
	initPluginConfiguration,
	getTypeConfig,
	getFieldLevelConfig,
	getEntityLevelConfig,
};
