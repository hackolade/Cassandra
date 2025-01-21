'use strict';

const { generateScript } = require('../forward_engineering/helpers/buildScript/generateScript');
const { generateViewScript } = require('../forward_engineering/helpers/buildScript/generateViewScript');
const { generateContainerScript } = require('../forward_engineering/helpers/buildScript/generateContainerScript');

module.exports = {
	generateScript,
	generateViewScript,
	generateContainerScript,
};
