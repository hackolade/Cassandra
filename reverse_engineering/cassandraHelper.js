const cassandra = require('cassandra-driver');
const typesHelper = require('./typesHelper');
let _;
const fs = require('fs');
const { createTableOptionsFromMeta } = require('./helpers/createTableOptionsFromMeta');
const { getEntityLevelConfig } = require('../forward_engineering/helpers/generalHelper');

var state = {
	client: null
};

module.exports = (_) => {

	const requireKeyStore = (app) => new Promise((resolve, reject) => {
		return app.require('java-ssl', (err, Keystore) => {
			if (err) {
				reject(err);
			} else {
				resolve(Keystore);
			}
		});
	});
	
	const getCertificatesFromFiles = (info) => {
		const readFile = (filePath) => filePath ? fs.readFileSync(filePath) : '';
		
		try {
			const ca = readFile(info.sslCaFile);
			const cert = readFile(info.sslCertFile);
			const key = readFile(info.sslKeyFile);
		
			return Promise.resolve({
				ca, cert, key
			});
		} catch (e) {
			return Promise.reject(e);
		}
	};
	
	const getCertificatesFromKeystore = (info, app) => {
		return requireKeyStore(app).then((Keystore) => {
			const store = Keystore(info.keystore, info.keystorepass);
			const ca = store.getCert(info.alias);
			const key = store.getPrivateKey(info.alias);
		
			return {
				cert: ca,
				key,
				ca,
			};
		});
	};
	
	const isSsl = (ssl) => ssl && ssl !== 'false';
	
	const getSslOptions = (info, app) => {
		const add = (key, value, obj) => !value ? obj : Object.assign({}, obj, {
			[key]: value
		});
		if (!isSsl(info.ssl)) {
			return Promise.resolve({});
		}
	
		const host = _.get(info, 'hosts[0].host', '');
		let sslPromise;
	
		if (info.ssl === 'jks') {
			sslPromise = getCertificatesFromKeystore(info, app);
		} else {
			sslPromise = getCertificatesFromFiles(info);
		}
	
		return sslPromise.then(ssl => {
			const sslOptions = _.flow([
				add.bind(null, 'ca', ssl.ca),
				add.bind(null, 'cert', ssl.cert),
				add.bind(null, 'key', ssl.key),
				add.bind(null, 'host', host),
			])({
				rejectUnauthorized: true,
				host
			});
		
			return { sslOptions };
		});
	};

	const getPolicy = (info) => {
		if (info.localDataCenter) {
			return {
				localDataCenter: info.localDataCenter
			};
		} else {
			return {
				policies : {
					loadBalancing : new cassandra.policies.loadBalancing.RoundRobinPolicy()
				}
			};
		}
	};
	
	const validateRequestTimeout = (timeout) => {
		const DEFAULT_TIMEOUT = 60 * 1000;
		timeout = Number(timeout);

		if (isNaN(timeout)) {
			return DEFAULT_TIMEOUT;
		}

		if (timeout <= 0) {
			return DEFAULT_TIMEOUT;
		}

		return timeout;
	};

	const getDistributedClient = (app, info) => {
		if (!Array.isArray(info.hosts)) {
			throw new Error('Hosts were not defined');
		}
	
		const username = info.user;
		const password = info.password;
		const authProvider = new cassandra.auth.PlainTextAuthProvider(username, password);
		const contactPoints = info.hosts.map(item => `${item.host}:${item.port}`);
		const readTimeout = validateRequestTimeout(info.requestTimeout);
		
		return getSslOptions(info, app)
			.then(sslOptions => {
				return new cassandra.Client(Object.assign({
					contactPoints,
					authProvider,
					socketOptions: {
						readTimeout
					}
				}, getPolicy(info), sslOptions));
			});
	};
	
	const getCloudClient = (info) => {
		const readTimeout = validateRequestTimeout(info.requestTimeout);

		const client = new cassandra.Client(Object.assign({
			cloud: {
				secureConnectBundle: info.secureConnectBundle
			},
			credentials: {
				username: info.user,
				password: info.password
			},
			socketOptions: {
				readTimeout
			}
		}));
	
		return Promise.resolve(client);
	};
	
	const getClient = (app, info) => {
		if (info.clusterType === 'apolloCloud') {
			return getCloudClient(info);
		} else {
			return getDistributedClient(app, info);
		}
	};
	
	const connect = (app, logger) => (info) => {
		if (!state.client) {
			return getClient(app, info)
				.then((client) => {
					state.client = client;

					client.on('log', (type, name, info, furtherInfo) => {
						if (logger) {
							logger.log('info', { message: '[' + type + '] ' + name + ': ' + info + '. ' + furtherInfo }, 'Cassandra Info');
						}
					});
	
					return state.client.connect();
				});
		}
		
		return state.client.connect();
	};
	
	const close = () => {
		if (state.client) {
			state.client.shutdown();
			state.client = null;
		}
	};
	
	const getKeyspaceMetaData = (keyspace) => {
		return state.client.metadata.keyspaces[keyspace];
	};
	
	const getKeyspaceInfo = (keyspace) => {
		const metaData = getKeyspaceMetaData(keyspace);
		const strategy = _.get(metaData, 'strategy', '').split('.').slice(-1).pop();
		let keyspaceInfo = {
			code: keyspace,
			durableWrites: Boolean(metaData.durableWrites),
			replStrategy: strategy
		};
	
		if (strategy === 'SimpleStrategy') {
			keyspaceInfo.replFactor = Number(metaData.strategyOptions.replication_factor);
		} else if (strategy === 'NetworkTopologyStrategy') {
			keyspaceInfo.dataCenters = Object.keys(metaData.strategyOptions).map(key => {
				return {
					dataCenterName: key,
					replFactorValue: Number(metaData.strategyOptions[key])
				};
			});
		}
		return keyspaceInfo;
	};
	
	const getKeyspacesNames = () => {
		return Object.keys(state.client.metadata.keyspaces);
	};
	
	const isOldVersion = () => {
		const hosts = _.get(state, 'client.hosts._items');
	
		if (!hosts) {
			return false;
		}
		
		const host = hosts[Object.keys(hosts)[0]];
	
		if (!host) {
			return false;
		}
	
		const version = host.getCassandraVersion();
	
		if (!version.length) {
			return false;
		}
	
		const majorDigit = _.get(version, '[0]');
	
		return majorDigit < 3;
	};
	
	const getTablesNames = (keyspace) => {
		const oldSelectTableNamePrefix = 'SELECT columnfamily_name FROM system.schema_columnfamilies';
		const newSelectTableNamePrefix = 'SELECT table_name FROM system_schema.tables';
		const query = isOldVersion() ? `${oldSelectTableNamePrefix} WHERE keyspace_name ='${keyspace}'` : 
			`${newSelectTableNamePrefix} WHERE keyspace_name ='${keyspace}'`;
	
		return execute(query);
	};
	
	const getViewsNames = (keyspace) => {
		const query = `SELECT view_name FROM system_schema.views WHERE keyspace_name ='${keyspace}'`;

		return execute(query).then(viewData => viewData.rows.map(view => view.view_name), ()=>[]);
	};

	const execute = (query) => {
		return state.client.execute(query);
	};
	
	const getTableMetadata = (keyspace, table) => {
		return state.client.metadata.getTable(keyspace, table);
	};

	const getViews = (recordSamplingSettings, keyspace, views) => {
		return Promise.all(views.map(viewName => {
			return state.client.metadata.getMaterializedView(keyspace, viewName)
				.then(view => {
					return getViewDocumentTemplate(recordSamplingSettings, keyspace, viewName)
						.then(documentTemplate => ({
							documentTemplate,
							view
						}))
				}, () => ({
					documentTemplate: {},
					view: {}
				}));
		}));
	};

	const getViewDocumentTemplate = (recordSamplingSettings, keyspace, viewName) => {
		return scanRecords(keyspace, viewName, recordSamplingSettings).then(mergeDocuments, () => ({}));
	};

	const splitEntityNames = names => {
		const namesByCategory =_.partition(names, isView);

		return { views: namesByCategory[0].map(name => name.slice(0, -4)), tables: namesByCategory[1] };
	}

	const getColumnInfo = (keyspace, table) => {
		const query = `SELECT * FROM system_schema.columns WHERE keyspace_name='${keyspace}' AND table_name='${table}';`;
		return execute(query);
	};
	
	const prepareConnectionDataItem = (keyspace, tables, views) => {
		const connectionDataItem = {
			dbName: keyspace,
			dbCollections: tables,
			views
		};
	
		return connectionDataItem;
	};
	
	const getTableSchema = (columns, udtHash, sample = {}) => {
		let schema = {};
		columns.forEach(column => {
			const columnType = typesHelper(_).getColumnType(column, udtHash, sample ? sample[column.name] : null);
			schema[column.name] = columnType;
			schema[column.name].code = column.name;
			schema[column.name].static = column.isStatic;
			schema[column.name].frozen = column.type.options.frozen;
		});
		return { properties: schema };
	};
	
	const scanRecords = (keyspace, table, recordSamplingSettings) => {
		const defaultCount = 1000;
		const query = `SELECT COUNT(*) FROM "${keyspace}"."${table}"`;
		
		return execute(query)
		.then(count => new Promise((resolve, reject) => {
			const rowsCount = _.get(count, 'rows[0].count.low', defaultCount);
			let rows = [];
	
			if (!rowsCount) {
				return resolve(rows);
			}
	
			const size = getSampleDocSize(rowsCount, recordSamplingSettings)
			const options = { prepare : true , autoPage: true };
			const selQuery = `SELECT * FROM "${keyspace}"."${table}" LIMIT ${size}`;
			
			state.client.eachRow(selQuery, [], options, function(n, row) {
				rows.push(row)
			}, (err, rs) => {
				return (err ? reject(err) : resolve(rows))
			});
		}));
	};
	
	
	const getEntityLevelData = (table, tableName) => {
		const partitionKeys = handlePartitionKeys(table.partitionKeys);
		const clusteringKeys = handleClusteringKeys(table);
		const indexes = handleIndexes(table.indexes);
	
		return {
			code: tableName,
			compositePartitionKey: partitionKeys,
			compositeClusteringKey: clusteringKeys,
			SecIndxs: indexes,
			comments: table.comment,
			tableOptions: getTableOptions(table)
		};
	};
	
	const changeQuotes = (str) => {
		return String(str).replace(/\"/g, '\'');
	};
	
	const getCompaction = (data) => {
		return Object.assign({}, data.compactionOptions, {
			class: data.compactionClass
		});
	};
	
	const getOptionsFromTab = config => {
		const optionsBlock = config.structure.find(prop => prop.propertyName === 'Options');
		return optionsBlock.structure;
	}
	
	const getTableOptions = (table) => {
		const [detailsTab] = getEntityLevelConfig();
		const configOptions = getOptionsFromTab(detailsTab);
		return createTableOptionsFromMeta(table, configOptions);
	};
	
	const getKeyOrder = (order) => {
		switch(order) {
			case 'DESC':
				return 'descending';
			case 'ASC':
			default:
				return 'ascending';
		}
	};
	const handlePartitionKeys = (partitionKeys) => {
		return (partitionKeys || []).map(item => item.name);
	};
	
	const handleClusteringKeys = (table) => {
		return (table.clusteringKeys || []).map((item, index) => {
			const clusteringOrder = table.clusteringOrder ? table.clusteringOrder[index] : '';
			return {
				name: item.name,
				type: getKeyOrder(clusteringOrder)
			};
		});
	};
	
	const handleIndexes = (indexes) => {
		return indexes.map(item => {
			return {
				name: item.name,
				SecIndxKey: [getIndexKey(item.target)]
			};
		});
	};
	
	const getIndexKey = (target) => {
		return target;
	};
	
	const handleUdts = (udts) => {
		if (udts && udts.length) {
			let schema = {};
			let nestedUdts = [];

			udts.forEach(({ udt, sample }) => {
				const info = _.get(udt, 'type.info', _.get(udt, 'info'), {});
				const name = info.name || udt.name;
				const fields = info.fields || [];
				schema[name] = {
					type: 'udt',
					static: udt.isStatic,
					properties: getTableSchema(fields, nestedUdts, sample).properties
				};
			});

			return {
				...schema,
				...handleUdts(nestedUdts) || {}
			};
		} else {
			return null;
		}
	};
	
	const getUDT = (keyspace) => {
		const query = `SELECT * FROM system_schema.types WHERE keyspace_name='${keyspace}'`;
		return execute(query);
	};
	
	const getUDF = (keyspace) => {
		const query = `SELECT * FROM system_schema.functions WHERE keyspace_name='${keyspace}'`;
		return execute(query);
	};
	
	const getUDA = (keyspace) => {
		const query = `SELECT * FROM system_schema.aggregates WHERE keyspace_name='${keyspace}'`;
		return execute(query);
	};
	
	const removeFrozen = str => str.replace(/frozen\<(.*)\>/i, '$1')
	
	const handleUDF = (udf) => {
		const udfData = udf.rows.map(item => {
			const args = item.argument_names.map((name, index) => {
				return `${name} ${removeFrozen(item.argument_types[index] || '')}`;
			}).join(', ');
	
			const deterministic = item.deterministic ? 'DETERMINISTIC' : '';
			const monotonic = item.monotonic ? 'MONOTONIC ON' + item.monotonic_on.join(', ') : '';
	
			const func = `CREATE OR REPLACE FUNCTION ${item.function_name} ( ${args} )
				${item.called_on_null_input ? 'CALLED' : 'RETURNS NULL'} ON NULL INPUT
				RETURNS ${removeFrozen(item.return_type)}  ${deterministic} ${monotonic}
				LANGUAGE ${item.language} AS
				$$ ${item.body} $$ ;`;
	
			return {
				name: item.function_name,
				storedProcFunction: func
			};
		});
		return udfData;
	};
	
	const handleUDA = (uda) => {
		const udaData = uda.rows.map(item => {
			const args = item.argument_types.map(removeFrozen).join(', ');
			
			const aggr = `CREATE OR REPLACE AGGREGATE ${item.aggregate_name} (${args})` +
				`\n\t\t\tSFUNC ${item.state_func}` +
				`\n\t\t\tSTYPE ${removeFrozen(item.state_type)}` +
				(item.final_func !== null ? `\n\t\t\tFINALFUNC ${item.final_func}` : '') +
				`\n\t\t\tINITCOND ${item.initcond}` +
				`${item.deterministic ? '\n\t\t\tDETERMINISTIC' : ''};`;
	
			return {
				name: item.aggregate_name,
				storedProcFunction: aggr
			};
		});
		return udaData;
	};
	
	const getViewsData = (views, tableName, tableSchema) => {
		return views
			.filter(viewData => _.get(viewData, 'view.tableName') === tableName)
			.map(viewData => {
				const view = _.get(viewData, 'view', {});
				const documentTemplate = Object.keys(_.get(viewData, 'documentTemplate', {}));

				return {
					name: view.name,
					jsonSchema: getViewData(view, tableSchema),
					documentTemplate,
					data: {
						compositePartitionKey: handlePartitionKeys(view.partitionKeys),
						compositeClusteringKey: handleClusteringKeys(view),
						comments: view.comment,
						tableOptions: getTableOptions(view)
					}
				}
			});
	};

	const getViewData = (viewData, parentTableSchema) => {
		if (_.isEmpty(_.get(viewData, 'columns'))) {
			return {};
		}
		const columns = Object.keys(viewData.columnsByName);

		return { properties: getViewSchema(parentTableSchema, viewData.tableName, columns)}
	};

	const getViewSchema = (tableSchema, tableName, columns) => {
		return columns.reduce((schema, name) => {
			if (!_.get(tableSchema, ['properties', name])) {
				return schema;
			}

			return Object.assign({}, schema, {
				[name]: {$ref: `#collection/definitions/${tableName}/${name}`}
			});
		}, {});
	};

	const getPackageData = (data, includeEmptyCollection) => {
		let packageData = {
			dbName: data.keyspaceName,
			collectionName: data.tableName,
			documents: data.records,
		};
	
		if (data.table.columns && data.table.columns.length) {
			packageData.bucketInfo = getKeyspaceInfo(data.keyspaceName);
			packageData.bucketInfo.UDFs = data.UDFs;
			packageData.bucketInfo.UDAs = data.UDAs;
			packageData.entityLevel = getEntityLevelData(data.table, data.tableName);
			const udtHash = [];
			const mergedDocument = mergeDocuments(data.records);
			const schema = getTableSchema(data.table.columns, udtHash, mergedDocument);
			packageData.validation = {
				jsonSchema: schema
			};
			packageData.documentTemplate = mergedDocument;
			packageData.modelDefinitions = {
				definitions: handleUdts(udtHash)
			};

			if (!_.isEmpty(data.views)) {
				packageData.views = getViewsData(data.views, data.tableName, schema);
			}
		} else if (!includeEmptyCollection) {
			packageData = null;
		}
		return packageData;
	};
	const mergeDocuments = (documents) => {
		const split = (arr, f) => {
			return arr.reduce((result, item) => {
				if (f(item)) {
					return [
						result[0].concat([ item ]),
						result[1]
					];
				} else {
					return [
						result[0],
						result[1].concat([ item ])
					];
				}
			}, [[], []]);
		};
		const uniqByType = (arr) => {
			const hash = {};
	
			return arr.reduce((result, item) => {
				if (!hash[typeof item]) {
					hash[typeof item] = true;
	
					return result.concat([item]);
				} else {
					return result;
				}
			}, []);
		};
		const mergeByType = (arr) => {
			const [arrays, noArrays] = split(arr, Array.isArray);
			const [objects, rest] = split(noArrays, isObject);
			const scalars = uniqByType(rest);
			const mergedObject = objects.reduce(merge, {});
			const result = scalars.concat(arrays.reduce(merge, []));
	
			if (Object.keys(mergedObject).length) {
				return result.concat([mergedObject]);
			}
	
			return result;
		};
		const isObject = (obj) => obj && typeof obj === 'object' && !Array.isArray(obj);
		const mergeArray = (arr1, arr2) => {
			const arr = arr1.concat(arr2);
			if (!arr.length) {
				return [];
			}
	
			return mergeByType(arr);
		};
		const mergeObjects = (obj1, obj2) => {
			return Object.keys(obj1).concat(Object.keys(obj2)).reduce((result, key) => {
				return Object.assign({}, result, {
					[key]: merge(obj1[key], obj2[key])
				});
			}, {});
		};
		const merge = (doc1, doc2) => {
			if (Array.isArray(doc1) && Array.isArray(doc2)) {
				return mergeArray(doc1, doc2);
			} else if (isObject(doc1) && isObject(doc2)) {
				return mergeObjects(doc1, doc2);
			} else if (Array.isArray(doc1)) {
				return merge(doc1, []);
			} else if (Array.isArray(doc2)) {
				return merge([], doc2);
			} else if (isObject(doc1)) {
				return merge(doc1, {});
			} else if (isObject(doc2)) {
				return merge({}, doc2);
			} else if (doc1 !== undefined) {
				return doc1;
			} else if (doc2 !== undefined) {
				return doc2;
			}
		};
	
		if (!Array.isArray(documents) || !documents.length) {
			return {};
		}
		
		try {
			return JSON.parse(JSON.stringify(documents)).reduce(merge, {});
		} catch (e) {
			return {};
		}
	};
	
	const prepareError = (error) => {
		if (!(error instanceof Error)) {
			return error;
		}
	
		return {
			message: error.message,
			stack: error.stack
		};
	};
	
	const filterKeyspaces = (keyspaces, systemKeyspaces) => {
		return _.difference(keyspaces, systemKeyspaces || []);
	};
	
	
	const getSampleDocSize = (count, recordSamplingSettings) => {
		const per = recordSamplingSettings.relative.value;
		return (recordSamplingSettings.active === 'absolute')
			? recordSamplingSettings.absolute.value
				: Math.round( count/100 * per);
	};
	
	const splitScriptByQueries = (script) => {
		const findFunctionStatements = (script) => {
			return (script.match(/\$\$([\s\S]+?)\$\$/g) || [])
				.map(item => item.trim().replace(/(^\$\$|\$\$$)/g, ''));
		};
		const getPlaceholder = (n) => `\$__HACKOLADE__PLACEHOLDER_${n}__\$`;
		const functionStatements = findFunctionStatements(script);
	
		const queries = functionStatements.reduce((script, func, i) => {
			return script.replace(func, getPlaceholder(i));
		}, script)
			.split(';')
			.map(query => query.trim())
			.filter(Boolean);
	
		return functionStatements.reduce((queries, func, i) => {
			return queries.map(query => query.replace(getPlaceholder(i), func));
		}, queries);
	};
	
	const batch = (script, progress) => {
		const queries = splitScriptByQueries(script);
	
		const totalQueries = queries.length;
		let currentQuery = 0;
	
		return promiseSeriesAll(
			queries.map(query => () => state.client.execute(query)),
			(result) => {
				const query = queries[currentQuery];
	
				progress(query, result, currentQuery, totalQueries);
	
				currentQuery++;
			}
		).then(
			result => result,
			error => Promise.reject({ error, query: queries[currentQuery] })
		);
	};
	
	const promiseSeriesAll = (promises, callback) => {
		if (!promises.length) {
			return Promise.resolve();
		}
	
		return promises[0]().then(result => {
			callback(result);
	
			return promiseSeriesAll(promises.slice(1), callback);
		});
	};

	const isView = name => name.slice(-4) === ' (v)';
	
	return {
		connect,
		close,
		getKeyspacesNames,
		getTablesNames,
		prepareConnectionDataItem,
		getColumnInfo,
		getTableMetadata,
		getTableSchema,
		scanRecords,
		getEntityLevelData,
		getKeyspaceMetaData,
		getKeyspaceInfo,
		handleUdts,
		getUDF,
		getUDA,
		handleUDF,
		handleUDA,
		getPackageData,
		prepareError,
		filterKeyspaces,
		batch,
		isOldVersion,
		getViews,
		getViewsNames,
		splitEntityNames
	};
}
