const cassandra = require('../../reverse_engineering/cassandraHelper');

const applyToInstance = (connectionInfo, logger, cb) => {
	const script = connectionInfo.script;

	if (!Array.isArray(connectionInfo.hosts)) {
		return Promise.reject({ message: 'Hosts were not defined' });
	}

	return cassandra.connect(connectionInfo)
		.then(() => {
			logger.log('info', {
				message: 'Applying cassandra script has been started'
			}, 'Cassandra script');	

			return cassandra.batch(script, (query, result, i, total) => {
				logger.progress({
					message: `Completed queries: ${i + 1} / ${total}`
				});
			});
		})
		.then(result => {
			logger.log('info', {
				message: 'Cassandra script has been applied successfully!'
			}, 'Cassandra script');

			cassandra.close();

			return {};
		}, ({ error, query }) => {
			const err = modifyLineError(error, script, query);

			logger.progress({
				message: `Query has executed with error: \n ${query} \n ${err.message}`
			});

			return Promise.reject(Object.assign(
				{},
				cassandra.prepareError(error),
				err,
				{
					query
				}
			));
		})
		.catch(error => {
			cassandra.close();

			return Promise.reject({
				error: cassandra.prepareError(error),
				detail: error
			});
		});
};

const modifyLineError = (error, wholeScript, query) => {
	const lineRegExp = /^line\ (\d+)\:(\-?\d+)/i;

	const i = wholeScript.indexOf(query);

	if (i === -1) {
		return error;
	}

	const lineOffset = wholeScript.slice(0, i).split('\n').length;

	if (!lineRegExp.test(error.message)) {
		return Object.assign({}, error, {
			message: `query line ${lineOffset}:0 ${error.message}`
		});
	}

	const lineData = error.message.match(lineRegExp);
	const line = +(lineData[1]);
	const offset = lineData[2];

	const message = error.message.replace(lineRegExp, `line ${lineOffset + line - 1}:${offset}`);

	return Object.assign({}, error, { message });
};

module.exports = {
	applyToInstance
};
