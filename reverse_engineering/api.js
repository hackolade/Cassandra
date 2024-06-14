'use strict';

const cassandraHelper = require('./cassandraHelper');
const systemKeyspaces = require('./package').systemKeyspaces;
const logHelper = require('./logHelper');
const commandsService = require('./commandsService');
const fs = require('fs');
const antlr4 = require('antlr4');
const CqlLexer = require('./parser/CqlLexer.js');
const CqlParser = require('./parser/CqlParser.js');
const cqlToCollectionsVisitor = require('./cqlToCollectionsVisitor.js');
const ExprErrorListener = require('./antlrErrorListener');

const handleFileData = filePath => {
	return new Promise((resolve, reject) => {
		fs.readFile(filePath, 'utf-8', (err, content) => {
			if (err) {
				reject(err);
			} else {
				resolve(content);
			}
		});
	});
};

module.exports = {
	connect: function (connectionInfo, logger, cb, app) {
		cassandraHelper(app.require('lodash'))
			.connect(
				app,
				logger,
			)(connectionInfo)
			.then(cb, error => {
				logger.log('error', error, 'Connection error');
				cb(error);
			});
	},

	reFromFile: async (data, logger, callback) => {
		try {
			const input = await handleFileData(data.filePath);
			const chars = new antlr4.InputStream(input);
			const lexer = new CqlLexer.CqlLexer(chars);

			const tokens = new antlr4.CommonTokenStream(lexer);
			const parser = new CqlParser.CqlParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(new ExprErrorListener());

			const tree = parser.root();
			const cqlsTree = tree.cqls();
			const cqlToCollectionsGenerator = new cqlToCollectionsVisitor();

			const result = commandsService.convertCommandsToReDocs(cqlsTree.accept(cqlToCollectionsGenerator));
			callback(null, result, {}, [], 'multipleSchema');
		} catch (err) {
			const { error, title, name } = err;
			const handledError = handleErrorObject(error || err, title || name);
			logger.log('error', handledError, title);
			callback(handledError);
		}
	},

	disconnect: function (connectionInfo, cb, app) {
		cassandraHelper(app.require('lodash')).close(app);
		cb();
	},

	testConnection: function (connectionInfo, logger, cb, app) {
		logInfo('Test connection', connectionInfo, logger);

		this.connect(
			connectionInfo,
			logger,
			error => {
				if (error) {
					logger.log('info', 'Connection failed', 'Test connection');
				} else {
					logger.log('info', 'Connection successful', 'Test connection');
				}

				this.disconnect(connectionInfo, () => {}, app);

				return cb(cassandraHelper(app.require('lodash')).prepareError(error));
			},
			app,
		);
	},

	getDbCollectionsNames: function (connectionInfo, logger, cb, app) {
		const async = app.require('async');

		logInfo('Retrieving keyspaces and tables information', connectionInfo, logger);
		const { includeSystemCollection } = connectionInfo;
		const cassandra = cassandraHelper(app.require('lodash'));

		cassandra
			.connect(
				app,
				logger,
			)(connectionInfo)
			.then(() => {
				let keyspaces = cassandra.getKeyspacesNames();

				if (!includeSystemCollection) {
					keyspaces = cassandra.filterKeyspaces(keyspaces, systemKeyspaces);
				}

				async.map(
					keyspaces,
					(keyspace, next) => {
						cassandra
							.getTablesNames(keyspace)
							.then(tablesData => {
								const table_name_selector = cassandra.isOldVersion()
									? 'columnfamily_name'
									: 'table_name';
								const tableNames = tablesData.rows.map(table => table[table_name_selector]);

								return tableNames;
							})
							.then(tableNames => {
								return cassandra.getViewsNames(keyspace).then(
									views =>
										next(null, cassandra.prepareConnectionDataItem(keyspace, tableNames, views)),
									() => next(null, cassandra.prepareConnectionDataItem(keyspace, tableNames, [])),
								);
							})
							.catch(next);
					},
					(err, result) => {
						return cb(err, result);
					},
				);
			})
			.catch(error => {
				logger.log('error', error, 'Retrieving keyspaces and tables information');
				return cb(cassandra.prepareError(error) || 'error');
			});
	},

	getDbCollectionsData: function (data, logger, cb, app) {
		const async = app.require('async');
		const cassandra = cassandraHelper(app.require('lodash'));
		logger.log('info', data, 'Retrieving schema', data.hiddenKeys);

		const tables = data.collectionData.collections;
		const keyspacesNames = data.collectionData.dataBaseNames;
		const includeEmptyCollection = data.includeEmptyCollection;
		const recordSamplingSettings = data.recordSamplingSettings;

		async.map(
			keyspacesNames,
			(keyspaceName, keyspaceCallback) => {
				const entityNames = cassandra.splitEntityNames(tables[keyspaceName]);
				const viewNames = entityNames.views;
				const tableNames = entityNames.tables;

				let udfData = [];
				let udaData = [];

				cassandra
					.getUDF(keyspaceName)
					.then(udf => {
						progress(logger, keyspaceName, '', 'UDF has loaded');

						udfData = cassandra.handleUDF(udf);
						return cassandra.getUDA(keyspaceName);
					})
					.then(uda => {
						progress(logger, keyspaceName, '', 'UDA has loaded');

						udaData = cassandra.handleUDA(uda);

						return cassandra.getViews(recordSamplingSettings, keyspaceName, viewNames, logger);
					})
					.then(
						views => {
							pipeline(udaData, udfData, views);
						},
						err => {
							pipeline([], [], []);
						},
					)
					.catch(err => {
						logger.log('error', cassandra.prepareError(err), 'Retrieving schema');
						keyspaceCallback(err);
					});

				const pipeline = (UDAs, UDFs, views) => {
					if (!tableNames.length) {
						let packageData = {
							dbName: keyspaceName,
							emptyBucket: true,
						};

						packageData.bucketInfo = cassandra.getKeyspaceInfo(keyspaceName);
						packageData.bucketInfo.UDFs = UDFs;
						packageData.bucketInfo.UDAs = UDAs;
						return keyspaceCallback(null, packageData);
					} else {
						async.map(
							tableNames,
							(tableName, tableCallback) => {
								let packageData = {
									dbName: keyspaceName,
									collectionName: tableName,
									documents: [],
								};
								const loadProgress = progress.bind(null, logger, keyspaceName, tableName);
								const exec = (promise, startMessage, finishMessage) => {
									loadProgress(startMessage);
									return promise.then(result => {
										loadProgress(finishMessage);

										return result;
									});
								};

								Promise.all([
									exec(
										cassandra.getTableMetadata(keyspaceName, tableName),
										'Load meta data...',
										'Meta data has loaded',
									),
									exec(
										cassandra.scanRecords(keyspaceName, tableName, recordSamplingSettings, logger),
										'Load records...',
										'Records have loaded',
									),
									cassandra.describeSearchIndexes(keyspaceName, tableName),
								])
									.then(([table, records, searchIndex]) => {
										loadProgress('Records and Meta data have loaded');

										packageData = cassandra.getPackageData(
											{
												records: cassandra.filterNullItems(JSON.parse(JSON.stringify(records))),
												keyspaceName,
												table,
												tableName,
												UDFs,
												UDAs,
												views,
												searchIndex,
											},
											includeEmptyCollection,
										);

										return packageData;
									})
									.then(
										packageData => tableCallback(null, packageData),
										err => tableCallback({ ...err, table: tableName }),
									);
							},
							(err, res) => {
								if (err) {
									logger.log('error', cassandra.prepareError(err), 'Retrieving schema');
								}

								return keyspaceCallback(err, res);
							},
						);
					}
				};
			},
			(err, res) => {
				err = cassandra.prepareError(err);

				if (!err) {
					logger.progress({ message: 'Reverse-Engineering complete!', containerName: '', entityName: '' });
				} else {
					logger.log('error', err, 'Retrieving schema');
				}

				return cb(err, res);
			},
		);
	},
};

const logInfo = (step, connectionInfo, logger) => {
	logger.clear();
	logger.log('info', logHelper.getSystemInfo(connectionInfo.appVersion), step);
	logger.log('info', connectionInfo, 'connectionInfo', connectionInfo.hiddenKeys);
};

const progress = (logger, keyspace, table, message) => {
	logger.progress({
		containerName: keyspace,
		entityName: table,
		message: message,
	});
	logger.log('info', { keyspace, table, message }, 'Retrieving schema ...');
};

const handleErrorObject = (error, title) => {
	const errorProperties = Object.getOwnPropertyNames(error).reduce(
		(accumulator, key) => ({ ...accumulator, [key]: error[key] }),
		{},
	);

	return { title, ...errorProperties };
};
