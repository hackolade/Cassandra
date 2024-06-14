const cassandra = require('cassandra-driver');
const typesHelper = require('./typesHelper');
let _;
const fs = require('fs');
const { createTableOptionsFromMeta } = require('./helpers/createTableOptionsFromMeta');
const { getEntityLevelConfig } = require('../helpers/levelConfigHelper');
const CassandraRetryPolicy = require('./cassandraRetryPolicy');
const xmlParser = require('fast-xml-parser');
const filterComplexUdt = require('./helpers/filterComplexUdt');

const state = {
	client: null,
	isSshTunnel: null,
};

const COLUMNS_TO_FILTER_OUT = ['solr_query'];

module.exports = _ => {
	const requireKeyStore = app =>
		new Promise((resolve, reject) => {
			return app.require('java-ssl', (err, Keystore) => {
				if (err) {
					reject(err);
				} else {
					resolve(Keystore);
				}
			});
		});

	const getCertificatesFromFiles = info => {
		const readFile = filePath => (filePath ? fs.readFileSync(filePath) : '');

		try {
			const ca = readFile(info.sslCaFile);
			const cert = readFile(info.sslCertFile);
			const key = readFile(info.sslKeyFile);

			return Promise.resolve({
				ca,
				cert,
				key,
			});
		} catch (e) {
			return Promise.reject(e);
		}
	};

	const getCertificatesFromKeystore = (info, app, logger) => {
		return requireKeyStore(app)
			.then(Keystore => {
				try {
					const store = Keystore(info.keystore, info.keystorepass);
					const cert = (store.getCert(info.alias) || '').replace(
						/\s*-----END CERTIFICATE-----$/,
						'\n-----END CERTIFICATE-----',
					);
					const key = store.getPrivateKey(info.alias);
					let ca = cert;

					logger.log(
						'info',
						{
							message: `[info] certificates successfully retrieved from keystore`,
							certLength: cert.length,
							keyLength: key.length,
							pemCertValidity: cert.startsWith('-----BEGIN CERTIFICATE-----\nMII'),
							pemKeyValidity: key.startsWith('-----BEGIN PRIVATE KEY-----\nMII'),
							countOfCerts: (cert.match(/-----BEGIN CERTIFICATE-----/gi) || []).length,
						},
						'Keystore Info',
					);

					if (info.truststore) {
						const truststore = Keystore(info.truststore, info.truststorePass || '');
						ca = (truststore.getCert(info.truststoreAlias || info.alias) || '').replace(
							/\s*-----END CERTIFICATE-----$/,
							'\n-----END CERTIFICATE-----',
						);

						logger.log(
							'info',
							{
								message: `[info] certificates successfully retrieved from truststore`,
								certLength: ca.length,
								pemCertValidity: ca.startsWith('-----BEGIN CERTIFICATE-----\nMII'),
								countOfCerts: (ca.match(/-----BEGIN CERTIFICATE-----/gi) || []).length,
							},
							'Keystore Info',
						);
					}

					return {
						cert,
						key,
						ca,
						...analyzeJks(info, logger),
					};
				} catch (error) {
					if (error.message.includes('java.lang.NullPointerException')) {
						return Promise.reject({
							message:
								'Please, check the alias name of the provided JKS certificates. Error message: ' +
								error.message,
							error: error.message,
							stack: error.stack,
						});
					}

					return Promise.reject(error);
				}
			})
			.catch(error => {
				logger.log(
					'error',
					{
						message: error.message,
						stack: error.stack,
					},
					'Initialization java-ssl failed',
				);

				const certs = analyzeJks(info, logger);

				if (Object.keys(certs).length === 0) {
					return Promise.reject(error);
				}

				return certs;
			});
	};

	const analyzeJks = (info, logger) => {
		try {
			const jksJs = require('jks-js');
			let keystore;

			if (fs.existsSync(info.keystore)) {
				keystore = jksJs.toPem(fs.readFileSync(info.keystore), info.keystorepass);

				Object.keys(keystore).forEach(alias => {
					logger.log(
						'info',
						{
							type: 'keystore',
							certLength: _.get(keystore, `[${alias}].cert.length`),
							keyLength: _.get(keystore, `[${alias}].key.length`),
							countOfCerts: (
								_.get(keystore, `[${alias}].cert`, '').match(/-----BEGIN CERTIFICATE-----/gi) || []
							).length,
							alias,
						},
						'jks analyze',
					);
				});
			} else {
				logger.log('info', `[info] keystore file not found ${info.keystore}`, 'jks analyze');
			}

			let truststore;

			if (fs.existsSync(info.truststore)) {
				truststore = jksJs.toPem(fs.readFileSync(info.truststore), info.truststorePass);

				Object.keys(truststore).forEach(alias => {
					logger.log(
						'info',
						{
							type: 'truststore',
							certLength: _.get(truststore, `[${alias}].ca.length`),
							countOfCerts: (
								_.get(truststore, `[${alias}].ca`, '').match(/-----BEGIN CERTIFICATE-----/gi) || []
							).length,
							alias,
						},
						'jks analyze',
					);
				});
			} else {
				logger.log('info', `[info] truststore file not found ${info.truststore}`, 'jks analyze');
			}

			return {
				cert: _.get(keystore, `[${info.alias}].cert`),
				key: _.get(keystore, `[${info.alias}].key`),
				ca:
					_.get(truststore, `[${info.truststoreAlias || info.alias}].ca`) ||
					_.get(keystore, `[${info.alias}].cert`),
			};
		} catch (error) {
			logger.log('info', `[info] issue with jks-js. Message: ${error.message}`, 'jks analyze');

			return {};
		}
	};

	const isSsl = ssl => ssl && ssl !== 'false';

	const getSslOptions = (info, app, logger) => {
		const add = (key, value, obj) =>
			!value
				? obj
				: Object.assign({}, obj, {
						[key]: value,
					});
		if (!isSsl(info.ssl)) {
			return Promise.resolve({});
		}

		const host = _.get(info, 'hosts[0].host', '');
		let sslPromise;

		if (info.ssl === 'jks') {
			sslPromise = getCertificatesFromKeystore(info, app, logger);
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
				rejectUnauthorized: !info.disableStrictSsl,
				host,
			});

			return { sslOptions };
		});
	};

	const getPolicy = (info, logger) => {
		if (info.localDataCenter) {
			return {
				localDataCenter: info.localDataCenter,
				policies: {
					retry: new CassandraRetryPolicy(logger),
				},
			};
		} else {
			return {
				policies: {
					loadBalancing: new cassandra.policies.loadBalancing.RoundRobinPolicy(),
					retry: new CassandraRetryPolicy(logger),
				},
			};
		}
	};

	const validateRequestTimeout = (timeout, applicationQueryRequestTimeout) => {
		const DEFAULT_TIMEOUT = 60 * 1000;
		const connectionTimeout = Number(timeout);
		const queryRequestTimeout = Number(applicationQueryRequestTimeout);

		const requestTimeout = isNaN(connectionTimeout) ? queryRequestTimeout : connectionTimeout;

		if (isNaN(requestTimeout)) {
			return DEFAULT_TIMEOUT;
		}

		if (requestTimeout <= 0) {
			return DEFAULT_TIMEOUT;
		}

		return requestTimeout;
	};

	const getDistributedClient = (app, info, logger) => {
		if (!Array.isArray(info.hosts)) {
			throw new Error('Hosts were not defined');
		}
		const credentials =
			info.authType === 'tokenBased'
				? { username: 'token', password: info.astraToken }
				: { username: info.user, password: info.password };
		const authProvider = new cassandra.auth.PlainTextAuthProvider(credentials.username, credentials.password);
		const contactPoints = info.hosts.map(item => `${item.host}:${item.port}`);
		const readTimeout = validateRequestTimeout(info.requestTimeout, info.queryRequestTimeout);

		return getSslOptions(info, app, logger).then(sslOptions => {
			return new cassandra.Client(
				Object.assign(
					{
						contactPoints,
						authProvider,
						socketOptions: {
							readTimeout,
						},
					},
					getPolicy(info, logger),
					sslOptions,
				),
			);
		});
	};

	const getCloudClient = info => {
		const readTimeout = validateRequestTimeout(info.requestTimeout, info.queryRequestTimeout);
		const credentials =
			info.authType === 'tokenBased'
				? { username: 'token', password: info.astraToken }
				: { username: info.user, password: info.password };

		const client = new cassandra.Client(
			Object.assign({
				cloud: {
					secureConnectBundle: info.secureConnectBundle,
				},
				credentials,
				socketOptions: {
					readTimeout,
				},
			}),
		);

		return Promise.resolve(client);
	};

	const getClient = (app, info, logger) => {
		if (info.clusterType === 'apolloCloud') {
			return getCloudClient(info);
		} else {
			return getDistributedClient(app, info, logger);
		}
	};

	const connect = (app, logger) => async info => {
		if (state.client) {
			return state.client.connect();
		}

		if (info.ssh) {
			const sshService = app.require('@hackolade/ssh-service');
			const host = info.hosts[0];

			const { options } = await sshService.openTunnel({
				sshAuthMethod: info.ssh_method === 'privateKey' ? 'IDENTITY_FILE' : 'USER_PASSWORD',
				sshTunnelHostname: info.ssh_host,
				sshTunnelPort: info.ssh_port,
				sshTunnelUsername: info.ssh_user,
				sshTunnelPassword: info.ssh_password,
				sshTunnelIdentityFile: info.ssh_key_file,
				sshTunnelPassphrase: info.ssh_key_passphrase,
				host: host.host,
				port: host.port,
			});

			state.isSshTunnel = true;
			info = {
				...info,
				hosts: [options],
			};
		}

		state.client = await getClient(app, info, logger);

		state.client.on('log', (type, name, info, furtherInfo) => {
			if (logger) {
				const message = '[' + type + '] ' + name + ': ' + info + '. ' + furtherInfo;
				logger.log('info', { message }, 'Cassandra Info');
			}
		});

		return state.client.connect();
	};

	const close = async app => {
		if (state.client) {
			state.client.shutdown();
			state.client = null;
		}

		if (state.isSshTunnel) {
			const sshService = app.require('@hackolade/ssh-service');
			await sshService.closeConsumer();
			state.isSshTunnel = false;
		}
	};

	const getKeyspaceMetaData = keyspace => {
		return state.client.metadata.keyspaces[keyspace];
	};

	const getKeyspaceInfo = keyspace => {
		const metaData = getKeyspaceMetaData(keyspace);
		const strategy = _.get(metaData, 'strategy', '').split('.').slice(-1).pop();
		let keyspaceInfo = {
			code: keyspace,
			durableWrites: Boolean(metaData.durableWrites),
			replStrategy: strategy,
		};

		if (strategy === 'SimpleStrategy') {
			keyspaceInfo.replFactor = Number(metaData.strategyOptions.replication_factor);
		} else if (strategy === 'NetworkTopologyStrategy') {
			keyspaceInfo.dataCenters = Object.keys(metaData.strategyOptions).map(key => {
				return {
					dataCenterName: key,
					replFactorValue: Number(metaData.strategyOptions[key]),
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

	const getTablesNames = keyspace => {
		const oldSelectTableNamePrefix = 'SELECT columnfamily_name FROM system.schema_columnfamilies';
		const newSelectTableNamePrefix = 'SELECT table_name FROM system_schema.tables';
		const query = isOldVersion()
			? `${oldSelectTableNamePrefix} WHERE keyspace_name ='${keyspace}'`
			: `${newSelectTableNamePrefix} WHERE keyspace_name ='${keyspace}'`;

		return execute(query);
	};

	const getViewsNames = keyspace => {
		const query = `SELECT view_name FROM system_schema.views WHERE keyspace_name ='${keyspace}'`;

		return execute(query).then(
			viewData => viewData.rows.map(view => view.view_name),
			() => [],
		);
	};

	const execute = query => {
		return state.client.execute(query);
	};

	const getTableMetadata = (keyspace, table) => {
		return state.client.metadata.getTable(keyspace, table);
	};

	const getViews = (recordSamplingSettings, keyspace, views, logger) => {
		return Promise.all(
			views.map(viewName => {
				return state.client.metadata.getMaterializedView(keyspace, viewName).then(
					view => {
						return getViewDocumentTemplate(recordSamplingSettings, keyspace, viewName, logger).then(
							documentTemplate => ({
								documentTemplate,
								view,
							}),
						);
					},
					() => ({
						documentTemplate: {},
						view: {},
					}),
				);
			}),
		);
	};

	const getViewDocumentTemplate = (recordSamplingSettings, keyspace, viewName, logger) => {
		return scanRecords(keyspace, viewName, recordSamplingSettings, logger).then(mergeDocuments, () => ({}));
	};

	const describeSearchIndexes = async (keyspaceName, tableName) => {
		try {
			const result = await execute(
				`select resource_name, resource_value from solr_admin.solr_resources where resource_name IN ('schema.xml', 'solrconfig.xml') AND core_name = '${keyspaceName}.${tableName}';`,
			);

			if (!result.rows.length) {
				return {};
			}

			const keyMap = {
				'schema.xml': 'schema',
				'solrconfig.xml': 'config',
			};

			return result.rows.reduce((result, row) => {
				return {
					...result,
					[keyMap[row.resource_name]]: row.resource_value.toString(),
				};
			}, {});
		} catch (error) {
			return {};
		}
	};

	const splitEntityNames = names => {
		const namesByCategory = _.partition(names, isView);

		return { views: namesByCategory[0].map(name => name.slice(0, -4)), tables: namesByCategory[1] };
	};

	const getColumnInfo = (keyspace, table) => {
		const query = `SELECT * FROM system_schema.columns WHERE keyspace_name='${keyspace}' AND table_name='${table}';`;
		return execute(query);
	};

	const prepareConnectionDataItem = (keyspace, tables, views) => {
		const connectionDataItem = {
			dbName: keyspace,
			dbCollections: tables,
			views,
		};

		return connectionDataItem;
	};

	const getTableSchema = (columns, udtHash, sample = {}) => {
		let schema = {};
		columns
			.filter(column => !_.includes(COLUMNS_TO_FILTER_OUT, column.name))
			.forEach(column => {
				const columnType = typesHelper(_).getColumnType(
					column,
					udtHash,
					sample ? sample[column.name] : undefined,
				);
				schema[column.name] = columnType;
				schema[column.name].code = column.name;
				schema[column.name].static = column.isStatic;
				schema[column.name].frozen = column.type.options.frozen;
			});
		return { properties: schema };
	};

	const scanRecords = (keyspace, table, recordSamplingSettings, logger) => {
		return getSizeOfRows(keyspace, table, recordSamplingSettings).then(
			size =>
				new Promise((resolve, reject) => {
					let rows = [];

					logger.log('info', { table: `${keyspace}.${table}`, limit: size }, 'Scan records');

					if (!size) {
						return resolve(rows);
					}

					const options = { prepare: true, autoPage: true, retry: new CassandraRetryPolicy(logger) };
					const selQuery = `SELECT * FROM "${keyspace}"."${table}" LIMIT ${size}`;

					state.client.eachRow(
						selQuery,
						[],
						options,
						function (n, row) {
							rows.push(row);
						},
						(err, rs) => {
							return err ? reject(err) : resolve(rows);
						},
					);
				}),
		);
	};

	const getSizeOfRows = (keyspace, table, recordSamplingSettings) => {
		if (recordSamplingSettings.active === 'absolute') {
			return Promise.resolve(Number(recordSamplingSettings.absolute.value));
		}

		const countQueryLimit = getCountLimit(recordSamplingSettings);
		const query = `SELECT COUNT(*) FROM "${keyspace}"."${table}" LIMIT ${countQueryLimit}`;

		return execute(query).then(count => {
			const rowsCount = _.get(count, 'rows[0].count.low', recordSamplingSettings.maxValue);

			return getSampleDocSize(rowsCount, recordSamplingSettings);
		});
	};

	const getEntityLevelData = (table, tableName, searchIndex) => {
		const partitionKeys = handlePartitionKeys(table.partitionKeys);
		const clusteringKeys = handleClusteringKeys(table);
		const indexData = handleIndexes(table.indexes, searchIndex);

		return {
			...indexData,
			code: tableName,
			compositePartitionKey: partitionKeys,
			compositeClusteringKey: clusteringKeys,
			comments: table.comment,
			tableOptions: getTableOptions(table),
		};
	};

	const getOptionsFromTab = config => {
		const optionsBlock = config.structure.find(prop => prop.propertyName === 'Options');
		return optionsBlock.structure;
	};

	const getTableOptions = table => {
		const [detailsTab] = getEntityLevelConfig();
		const configOptions = getOptionsFromTab(detailsTab);
		return createTableOptionsFromMeta(table, configOptions);
	};

	const getKeyOrder = order => {
		switch (order) {
			case 'DESC':
				return 'descending';
			case 'ASC':
			default:
				return 'ascending';
		}
	};
	const handlePartitionKeys = partitionKeys => {
		return (partitionKeys || []).map(item => item.name);
	};

	const handleClusteringKeys = table => {
		return (table.clusteringKeys || []).map((item, index) => {
			const clusteringOrder = table.clusteringOrder ? table.clusteringOrder[index] : '';
			return {
				name: item.name,
				type: getKeyOrder(clusteringOrder),
			};
		});
	};

	const handleIndexes = (indexes, searchIndex) => {
		return {
			SecIndxs: getGeneralIndexes(indexes),
			...getSearchIndex(searchIndex),
		};
	};

	const getGeneralIndexes = indexes => {
		return indexes
			.filter(
				index =>
					!(
						index.options &&
						index.options['class_name'] === 'com.datastax.bdp.search.solr.Cql3SolrSecondaryIndex'
					),
			)
			.map(item => {
				const indexType = item.isCustomKind() ? 'custom' : 'secondary';
				let customOptions = {};

				if (item.options && indexType === 'custom') {
					customOptions.case_sensitive = item.options.case_sensitive === 'true';
					customOptions.normalize = item.options.normalize === 'true';
					customOptions.ascii = item.options.ascii === 'true';
					customOptions.similarity_function = item.options.similarity_function || '';
				}

				return {
					name: item.name,
					SecIndxKey: [getIndexKey(item.target)],
					customOptions,
					indexType,
				};
			});
	};

	const getSearchIndexConfig = config => {
		const result = {};
		const autoCommitTime = _.get(config, 'updateHandler.autoSoftCommit.maxTime');
		const defaultQueryFieldHandler = _.get(config, 'requestHandler', []).find(
			handler => handler.lst && handler.lst['@_name'] === 'defaults',
		);
		const filterCache = _.get(config, 'query.filterCache');
		const mergeScheduler = _.get(config, 'indexConfig.mergeScheduler.int', []).reduce(
			(result, item) => ({
				...result,
				[item['@_name']]: item['#text'],
			}),
			{},
		);

		result.realtime = _.get(config, 'indexConfig.rt', false);
		result.directoryFactoryClass = _.get(config, 'directoryFactory.@_class');
		result.directoryFactory = '';

		if (result.directoryFactoryClass === 'solr.EncryptedFSDirectoryFactory') {
			result.directoryFactory = 'encrypted';
			result.directoryFactoryClass = '';
		}
		if (result.directoryFactoryClass === 'solr.StandardDirectoryFactory') {
			result.directoryFactory = 'standard';
			result.directoryFactoryClass = '';
		}

		if (autoCommitTime) {
			result.autoCommitTime = autoCommitTime;
		}

		if (defaultQueryFieldHandler) {
			result.defaultQueryField = defaultQueryFieldHandler.lst.str['#text'];
		}

		if (filterCache) {
			result.filterCacheLowWaterMark = filterCache['@_lowWaterMarkMB'];
			result.filterCacheHighWaterMark = filterCache['@_highWaterMarkMB'];
		}

		if (!_.isEmpty(mergeScheduler)) {
			if (mergeScheduler.maxThreadCount) {
				result.mergeMaxThreadCount = mergeScheduler.maxThreadCount;
			}
			if (mergeScheduler.maxMergeCount) {
				result.mergeMaxMergeCount = mergeScheduler.maxMergeCount;
			}
		}

		return result;
	};

	const transformObjectToArray = schema => (Array.isArray(schema) ? schema : [schema]);

	const getSearchIndexProfile = schema => {
		const fields = transformObjectToArray(schema.fields.field);
		const fieldTypes = transformObjectToArray(schema.types.fieldType);
		const uniqueKeys = (schema.uniqueKey || '').replace(/^\(|\)$/g, '').split(',');
		const fieldsWithoutNoJoin = fields.filter(field => field['@_name'] !== '_partitionKey');
		const isNotOnlyUniqueKeysHaveStrField = fieldsWithoutNoJoin.some(
			field => !uniqueKeys.includes(field['@_name']) && field['@_type'] === 'StrField',
		);
		const spaceSavingSlowTriePrecision = fieldTypes.some(fieldType => fieldType['@_precisionStep'] === 0);
		const uniqueKeysHaveStrField = fieldsWithoutNoJoin.some(
			field => uniqueKeys.includes(field['@_name']) && field['@_type'] === 'StrField',
		);
		const fieldTypesWithStrField = fieldTypes.some(fieldType => fieldType['@_name'] === 'StrField');
		const searchIndexProfiles = {
			spaceSavingSlowTriePrecision,
			spaceSavingNoJoin: fields.length !== fieldsWithoutNoJoin.length,
			spaceSavingNoTextfield:
				isNotOnlyUniqueKeysHaveStrField || (!uniqueKeysHaveStrField && fieldTypesWithStrField),
		};

		return Object.entries(searchIndexProfiles)
			.filter(([___, value]) => value)
			.map(([spaceName]) => spaceName);
	};

	const getSearchIndex = indexData => {
		if (_.isEmpty(indexData)) {
			return {};
		}

		const schema = xmlParser.parse(indexData['schema'], {
			parseAttributeValue: true,
			ignoreAttributes: false,
		}).schema;
		const config = xmlParser.parse(indexData['config'], {
			parseAttributeValue: true,
			ignoreAttributes: false,
		}).config;
		const fields = transformObjectToArray(schema.fields.field);

		const searchIndexColumns = fields
			.filter(field => field['@_name'] !== schema.uniqueKey && field['@_name'] !== '_partitionKey')
			.map(field => {
				return {
					key: [field['@_name']],
					indexed: Boolean(field['@_indexed']),
					docValues: Boolean(field['@_docValues']),
					lowerCase: field['@_type']?.startsWith('LowerCase'),
				};
			});

		const searchIndexConfig = getSearchIndexConfig(config);
		const searchIndexProfiles = getSearchIndexProfile(schema);

		return {
			searchIndex: true,
			searchIndexColumns,
			searchIndexConfig,
			searchIndexProfiles,
		};
	};

	const getIndexKey = target => {
		const isValues = /^values\(([\s\S]+)\)$/i;
		const isEntries = /^entries\(([\s\S]+)\)$/i;
		const isKeys = /^keys\(([\s\S]+)\)$/i;
		let type = '';
		let name = target;

		if (isValues.test(target)) {
			type = 'values';
			name = target.match(isValues)[1];
		}

		if (isEntries.test(target)) {
			type = 'entries';
			name = target.match(isEntries)[1];
		}

		if (isKeys.test(target)) {
			type = 'keys';
			name = target.match(isKeys)[1];
		}

		return {
			type,
			name,
		};
	};

	const handleUdts = udts => {
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
					properties: getTableSchema(fields, nestedUdts, sample).properties,
				};
			});

			return {
				...schema,
				...(handleUdts(nestedUdts) || {}),
			};
		} else {
			return null;
		}
	};

	const getUDT = keyspace => {
		const query = `SELECT * FROM system_schema.types WHERE keyspace_name='${keyspace}'`;
		return execute(query);
	};

	const getUDF = keyspace => {
		const query = `SELECT * FROM system_schema.functions WHERE keyspace_name='${keyspace}'`;
		return execute(query);
	};

	const getUDA = keyspace => {
		const query = `SELECT * FROM system_schema.aggregates WHERE keyspace_name='${keyspace}'`;
		return execute(query);
	};

	const removeFrozen = str => str.replace(/frozen\<(.*)\>/i, '$1');

	const handleUDF = udf => {
		const udfData = udf.rows.map(item => {
			const args = item.argument_names
				.map((name, index) => {
					return `${name} ${removeFrozen(item.argument_types[index] || '')}`;
				})
				.join(', ');

			const deterministic = item.deterministic ? 'DETERMINISTIC' : '';
			const monotonic = item.monotonic ? 'MONOTONIC ON' + item.monotonic_on.join(', ') : '';

			const func = `CREATE OR REPLACE FUNCTION ${item.function_name} ( ${args} )
				${item.called_on_null_input ? 'CALLED' : 'RETURNS NULL'} ON NULL INPUT
				RETURNS ${removeFrozen(item.return_type)}  ${deterministic} ${monotonic}
				LANGUAGE ${item.language} AS
				$$ ${item.body} $$ ;`;

			return {
				name: item.function_name,
				functionBody: func,
			};
		});
		return udfData;
	};

	const handleUDA = uda => {
		const udaData = uda.rows.map(item => {
			const args = item.argument_types.map(removeFrozen).join(', ');

			const aggr =
				`CREATE OR REPLACE AGGREGATE ${item.aggregate_name} (${args})` +
				`\n\t\t\tSFUNC ${item.state_func}` +
				`\n\t\t\tSTYPE ${removeFrozen(item.state_type)}` +
				(item.final_func !== null ? `\n\t\t\tFINALFUNC ${item.final_func}` : '') +
				`\n\t\t\tINITCOND ${item.initcond}` +
				`${item.deterministic ? '\n\t\t\tDETERMINISTIC' : ''};`;

			return {
				name: item.aggregate_name,
				storedProcFunction: aggr,
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
						tableOptions: getTableOptions(view),
					},
				};
			});
	};

	const getViewData = (viewData, parentTableSchema) => {
		if (_.isEmpty(_.get(viewData, 'columns'))) {
			return {};
		}
		const columns = Object.keys(viewData.columnsByName);

		return { properties: getViewSchema(parentTableSchema, viewData.tableName, columns) };
	};

	const getViewSchema = (tableSchema, tableName, columns) => {
		return columns.reduce((schema, name) => {
			if (!_.get(tableSchema, ['properties', name])) {
				return schema;
			}

			return Object.assign({}, schema, {
				[name]: { $ref: `#collection/definitions/${tableName}/${name}` },
			});
		}, {});
	};

	const getPackageData = (data, includeEmptyCollection) => {
		let packageData = {
			dbName: data.keyspaceName,
			collectionName: data.tableName,
			documents: data.records,
		};

		if (data?.table?.columns?.length) {
			packageData.bucketInfo = getKeyspaceInfo(data.keyspaceName);
			packageData.bucketInfo.UDFs = data.UDFs;
			packageData.bucketInfo.UDAs = data.UDAs;
			packageData.entityLevel = getEntityLevelData(data.table, data.tableName, data.searchIndex);
			const udtHash = [];
			const mergedDocument = mergeDocuments(data.records);
			const schema = getTableSchema(data.table.columns, udtHash, mergedDocument);
			packageData.validation = {
				jsonSchema: schema,
			};
			packageData.documentTemplate = mergedDocument;
			packageData.modelDefinitions = {
				definitions: handleUdts(udtHash),
			};

			if (!_.isEmpty(data.views)) {
				packageData.views = getViewsData(data.views, data.tableName, schema);
			}
			packageData = {
				...packageData,
				documents: filterComplexUdt(_).filterUdts(schema.properties, data.records),
			};
		} else if (!includeEmptyCollection) {
			packageData = null;
		}
		return packageData;
	};
	const mergeDocuments = documents => {
		const split = (arr, f) => {
			return arr.reduce(
				(result, item) => {
					if (f(item)) {
						return [result[0].concat([item]), result[1]];
					} else {
						return [result[0], result[1].concat([item])];
					}
				},
				[[], []],
			);
		};
		const uniqByType = arr => {
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
		const mergeByType = arr => {
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
		const isObject = obj => obj && typeof obj === 'object' && !Array.isArray(obj);
		const mergeArray = (arr1, arr2) => {
			const arr = arr1.concat(arr2);
			if (!arr.length) {
				return [];
			}

			return mergeByType(arr);
		};
		const mergeObjects = (obj1, obj2) => {
			return Object.keys(obj1)
				.concat(Object.keys(obj2))
				.reduce((result, key) => {
					return Object.assign({}, result, {
						[key]: merge(obj1[key], obj2[key]),
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

	const prepareError = error => {
		if (!(error instanceof Error)) {
			return error;
		}

		return {
			message: error.message,
			stack: error.stack,
		};
	};

	const filterKeyspaces = (keyspaces, systemKeyspaces) => {
		return _.difference(keyspaces, systemKeyspaces || []);
	};

	const getSampleDocSize = (count, recordSamplingSettings) => {
		const limit = Math.ceil((count * recordSamplingSettings.relative.value) / 100);

		return Math.min(limit, recordSamplingSettings.maxValue);
	};

	const cleanOutComments = script => {
		return script.replace(/\/\*([\s\S]+?)\*\//, '');
	};

	const splitScriptByQueries = script => {
		const findFunctionStatements = script => {
			return (script.match(/\$\$([\s\S]+?)\$\$/g) || []).map(item => item.trim().replace(/(^\$\$|\$\$$)/g, ''));
		};
		const getPlaceholder = n => `\$__HACKOLADE__PLACEHOLDER_${n}__\$`;

		script = cleanOutComments(script);

		const functionStatements = findFunctionStatements(script);

		const queries = functionStatements
			.reduce((script, func, i) => {
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
			result => {
				const query = queries[currentQuery];

				progress(query, result, currentQuery, totalQueries);

				currentQuery++;
			},
		).then(
			result => result,
			error => Promise.reject({ error, query: queries[currentQuery] }),
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

	const filterNullItems = doc => {
		if (doc === null) {
			return undefined;
		} else if (Array.isArray(doc)) {
			return doc.map(filterNullItems).filter(item => item !== undefined);
		} else if (typeof doc === 'object') {
			return Object.keys(doc).reduce((result, key) => {
				const item = filterNullItems(doc[key]);

				if (item === undefined) {
					return result;
				}

				return {
					...result,
					[key]: item,
				};
			}, {});
		} else {
			return doc;
		}
	};

	const getCountLimit = recordSamplingSettings => {
		const per = recordSamplingSettings.relative.value;
		const max = recordSamplingSettings.maxValue;

		return Math.round((max / per) * 100);
	};

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
		splitEntityNames,
		filterNullItems,
		describeSearchIndexes,
	};
};
