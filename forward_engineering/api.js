const { applyToInstance, testConnection } = require('./helpers/dbConnectionService/index');
const { generateScript } = require('./generateScript');
const { generateViewScript } = require('./generateViewScript');
const { generateContainerScript } = require('./generateContainerScript');
const { isDropInStatements } = require('./isDropInStatements');

module.exports = {
	generateScript,
	generateViewScript,
	generateContainerScript,
	isDropInStatements,

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
};
