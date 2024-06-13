const fs = require('fs');
const path = require('path');

const getConfig = pathToConfig => {
	try {
		const config = fs.readFileSync(path.join(__dirname, '..', pathToConfig));

		return JSON.parse(config.toString().replace(/\/\*[\s\S]*?\*\//g, ''));
	} catch (e) {
		return {};
	}
};

const cacheResult = method => {
	let result;

	return (...args) => {
		if (!result) {
			result = method(...args);
		}

		return result;
	};
};

const getFieldLevelConfig = cacheResult(() =>
	getConfig(path.join('properties_pane', 'field_level', 'fieldLevelConfig.json')),
);
const getEntityLevelConfig = cacheResult(() =>
	getConfig(path.join('properties_pane', 'entity_level', 'entityLevelConfig.json')),
);

const getTypesConfig = cacheResult(() => {
	const getName = typeFile => typeFile.replace(/\.json/, '');
	const typeDir = path.join(__dirname, '..', 'types');
	const types = fs.readdirSync(typeDir);

	return types.reduce((typesMap, fileName) => {
		typesMap[getName(fileName)] = getConfig(path.join('types', fileName));

		return typesMap;
	}, {});
});

module.exports = {
	getEntityLevelConfig,
	getFieldLevelConfig,
	getTypesConfig,
};
