const applyToInstance = (cassandra) => (connectionInfo, logger) => {
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
		}, error => {
			const err = cassandra.prepareError(error);

			logger.log('error', err, "Cassandra script");

			return Promise.reject(err);
		})
		.then(result => {
			logger.log('info', {
				message: 'Cassandra script has been applied successfully!'
			}, 'Cassandra script');

			cassandra.close();

			return {};
		}, (commonError) => {
			if (!commonError.query) {
				return Promise.reject(commonError);
			}

			const { error, query } = commonError;
			const err = modifyLineError(error, script, query);
			const preparedError = cassandra.prepareError(err);

			logger.progress({
				message: `Query has executed with error: \n ${query} \n ${err.message}`
			});

			logger.log('error', {
				query: query,
				error: preparedError,
				detail: err
			}, "Cassandra script: query has been executed with error");

			return Promise.reject(preparedError);
		})
		.catch(err => {
			cassandra.close();

			return Promise.reject(err);
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

module.exports = applyToInstance;
