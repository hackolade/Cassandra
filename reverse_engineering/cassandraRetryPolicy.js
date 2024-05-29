const cassandra = require('cassandra-driver');

class CassandraRetryPolicy extends cassandra.policies.retry.RetryPolicy {
	constructor(logger) {
		super();
		this.hackoladeLogger = logger;
	}

	onReadTimeout(info, consistency, received, blockFor, isDataPresent) {
		var totalRetry = 2;
		var currentRetry = info.nbRetry;

		if (this.hackoladeLogger) {
			this.hackoladeLogger.log(
				'info',
				{
					exception: 'Read timeout',
					respondedNodes: received,
					needNodesForSuccess: blockFor,
					query: info.query,
					nbRetry: info.nbRetry,
					isLastTry: currentRetry > totalRetry,
				},
				'Retry policy info',
			);
		}

		if (currentRetry > totalRetry) {
			return this.rethrowResult();
		}

		return this.retryResult(cassandra.types.consistencies.one);
	}

	onUnavailable(info, consistency, received, blockFor, isDataPresent) {
		if (this.hackoladeLogger) {
			this.hackoladeLogger.log(
				'info',
				{
					exception: 'Unavailable',
					query: info.query,
					nbRetry: info.nbRetry,
					isLastTry: info.nbRetry > 0,
				},
				'Retry policy info',
			);
		}

		// The default implementation
		if (info.nbRetry > 0) {
			return this.rethrowResult();
		}

		return this.retryResult(undefined, false);
	}

	onRequestError = function (info, consistency, err) {
		if (this.hackoladeLogger) {
			this.hackoladeLogger.log(
				'info',
				{
					exception: 'Request error',
					query: info.query,
					nbRetry: info.nbRetry,
					error: { ...err },
				},
				'Retry policy info',
			);
		}

		// The default implementation
		return this.retryResult(undefined, false);
	};
}

module.exports = CassandraRetryPolicy;
