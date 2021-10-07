const { CqlParserVisitor } = require('./parser/CqlParserVisitor');
const { CqlParser } = require('./parser/CqlParser');
const {
	CREATE_COLLECTION_COMMAND,
	REMOVE_COLLECTION_COMMAND,
	CREATE_BUCKET_COMMAND,
	REMOVE_BUCKET_COMMAND,
	USE_BUCKET_COMMAND,
	CREATE_DEFINITION_COMMAND,
	ADD_FIELDS_TO_COLLECTION_COMMAND,
	RENAME_FIELD_COMMAND,
	CREATE_VIEW_COMMAND,
	ADD_BUCKET_DATA_COMMAND,
	ADD_COLLECTION_LEVEL_INDEX_COMMAND,
	ADD_COLLECTION_LEVEL_SEARCH_INDEX_COMMAND,
	UPDATE_BUCKET_COMMAND,
	UPDATE_ENTITY_LEVEL_DATA_COMMAND,
	UPDATE_VIEW_LEVEL_DATA_COMMAND,
	ADD_FIELDS_TO_DEFINITION_COMMAND,
} = require('./commandsService');

const ALLOWED_COMMANDS = [
	CqlParser.RULE_createTable,
	CqlParser.RULE_createKeyspace,
	CqlParser.RULE_dropTable,
	CqlParser.RULE_dropKeyspace,
	CqlParser.RULE_createType,
	CqlParser.RULE_alterTable,
	CqlParser.RULE_createMaterializedView,
	CqlParser.RULE_use,
	CqlParser.RULE_createFunction,
	CqlParser.RULE_createAggregate,
	CqlParser.RULE_alterKeyspace,
	CqlParser.RULE_alterMaterializedView,
	CqlParser.RULE_createIndex,
	CqlParser.RULE_createSearchIndex,
	CqlParser.RULE_alterType
];

const DEFAULT_TYPE = { type: 'char' };

class Visitor extends CqlParserVisitor {
	visitCql(ctx) {
		if (ALLOWED_COMMANDS.includes(ctx.children[0].ruleIndex)) {
			return super.visitCql(ctx)[0];
		}
		return;
	}

	visitCreateTable(ctx) {
		const { properties, keyData } = this.visit(ctx.columnDefinitionList());
		const collectionName = this.visit(ctx.table());
		const bucketName = this.getKeyspaceName(ctx);
		const optionsContext = ctx.withElement();
		const options = optionsContext ? this.visit(optionsContext) : { partitionKey: [], clusteringKey: [] };
		const comments = removeQuotes(options?.comment || '');
		delete options?.comment;
		const tableIfNotExist = this.visitFlagValue(ctx, 'ifNotExist');

		return {
			type: CREATE_COLLECTION_COMMAND,
			collectionName,
			bucketName,
			schema: {
				collectionName,
				type: 'object',
				properties,
			},
			entityLevelData: {
				comments,
				tableOptions: options,
				compositePartitionKey: keyData.partitionKey,
				compositeClusteringKey: mergeClusteringKeys(options.clusteringKey, keyData.clusteringKey),
				tableIfNotExist,
			}
		}
	}

	visitCreateKeyspace(ctx) {
		const name = this.getKeyspaceName(ctx)
		const replicationProperties = this.visit(ctx.replicationList());
		const durableWrites = ctx.durableWrites() ? !!(this.visit(ctx.durableWrites())) : true;
		const keyspaceIfNotExist = this.visitFlagValue(ctx, 'ifNotExist');
		return {
			type: CREATE_BUCKET_COMMAND,
			name,
			data: {
				...replicationProperties,
				durableWrites,
				keyspaceIfNotExist
			},
		};
	}

	visitCreateMaterializedView(ctx) {
		const name = this.visit(ctx.materializedView());
		const table = this.visit(ctx.table());
		const columns = this.visit(ctx.columnList());
		const optionsContext = ctx.materializedViewOptions();
		const options = optionsContext ? this.visit(optionsContext) : {};
		const comments = removeQuotes(options?.comment || '');
		delete options?.comment;
		const schema = getViewSchema(table, columns);
		const keyspace = ctx.keyspace()[0];
		const bucketName = keyspace ? this.visit(keyspace) : '';
		const primaryKeyContext = ctx.primaryKeyElement();
		const keyData = primaryKeyContext ? this.visit(primaryKeyContext) : { partitionKey: [], clusteringKey: [] };
		const viewIfNotExist = this.visitFlagValue(ctx, 'ifNotExist')

		return {
			type: CREATE_VIEW_COMMAND,
			name,
			bucketName,
			collectionName: table,
			jsonSchema: { properties: schema },
			data: {
				comments,
				tableOptions: options,
				compositePartitionKey: keyData.partitionKey,
				compositeClusteringKey: keyData.clusteringKey,
				viewIfNotExist
			}
		};
	}

	visitSecondaryIndex(ctx) {
		const keyspace = this.getKeyspaceName(ctx);
		const column = this.visit(ctx.indexColumnSpec());
		const nameContext = ctx.indexName();
		const name = nameContext ? this.visit(nameContext) : '';
		const indexIfNotExist = this.visitFlagValue(ctx, 'ifNotExist')
		return {
			type: ADD_COLLECTION_LEVEL_INDEX_COMMAND,
			bucketName: keyspace,
			collectionName: this.visit(ctx.table()),
			name,
			column: column.name,
			columnType: column.type,
			indexIfNotExist
		};
	}

	visitCustomIndex(ctx) {
		const keyspace = this.getKeyspaceName(ctx);
		const column = this.visit(ctx.indexColumnSpec());
		const nameContext = ctx.indexName();
		const name = nameContext ? this.visit(nameContext) : '';
		const indexIfNotExist = this.visitFlagValue(ctx, 'ifNotExist');
		const customOptions = this.visitIfExists(ctx, 'customIndexOption', []).reduce((options, option)=>({...options, ...option}),{});
		return {
			type: ADD_COLLECTION_LEVEL_INDEX_COMMAND,
			bucketName: keyspace,
			collectionName: this.visit(ctx.table()),
			name,
			column: column.name,
			columnType: column.type,
			indexType: 'custom',
			customOptions,
			indexIfNotExist
		};
	}

	visitCustomIndexOption(ctx){
		if(ctx.caseSensitiveOption){
			return {case_sensitive: ctx.caseSensitiveOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.normalizeOption){
			return {normalize: ctx.normalizeOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.asciiOption){
			return {ascii: ctx.asciiOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.analyzedOption){
			return {analyzed: ctx.analyzedOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.isLiteralOption){
			return {isLiteral: ctx.isLiteralOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.tokenizationEnableStemmingOption){
			return {tokenizationEnableStemming: ctx.tokenizationEnableStemmingOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.tokenizationNormalizeLowercaseOption){
			return {tokenizationNormalizeLowercase: ctx.tokenizationNormalizeLowercaseOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.tokenizationNormalizeUppercaseOption){
			return {tokenizationNormalizeUppercase: ctx.tokenizationNormalizeUppercaseOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.normalizeUppercaseOption){
			return {normalizeUppercase: ctx.normalizeUppercaseOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.normalizeLowercaseOption){
			return {normalizeLowercase: ctx.normalizeLowercaseOption.getText().toLowerCase() === `'true'`}
		}
		if(ctx.maxCompactionFlushMemoryInMbOption){
			return {maxCompactionFlushMemoryInMb: parseInt(ctx.maxCompactionFlushMemoryInMbOption.getText())}
		}
		if(ctx.modeOption){
			return {mode: ctx.modeOption.getText().replaceAll('\'','')}
		}
		if(ctx.analyzerClassOption){
			return {analyzerClass: ctx.analyzerClassOption.getText().replaceAll('\'','')}
		}
		if(ctx.tokenizationLocaleOption){
			return {tokenizationLocale: ctx.tokenizationLocaleOption.getText().replaceAll('\'','')}
		}
		if(ctx.tokenizationSkipStopWordsOption){
			return {tokenizationSkipStopWords: ctx.tokenizationSkipStopWordsOption.getText().replaceAll('\'','')}
		}
		return {}
	}

	visitCreateSearchIndex(ctx) {
		return {
			type: ADD_COLLECTION_LEVEL_SEARCH_INDEX_COMMAND,
			bucketName: this.getKeyspaceName(ctx),
			collectionName: this.visit(ctx.table()),
			searchIndex: true,
			searchIndexColumns: this.visitIfExists(ctx, 'searchIndexColumnList'),
			searchIndexProfiles: this.visitIfExists(ctx, 'searchIndexProfiles'),
			searchIndexConfig: this.visitIfExists(ctx, 'searchIndexConfigs'),
			searchIndexOptions: this.visitIfExists(ctx, 'searchIndexOptions'),
			searchIndexIfNotExist: this.visitFlagValue(ctx, 'ifNotExist')
		};
	}

	visitSearchIndexOptions(ctx) {
		return {
			recovery: ctx.recoveryOption ? ctx.recoveryOption.getText().toLowerCase() === `true` : false,
			reindex: ctx.reindexOption ? ctx.reindexOption.getText().toLowerCase() === `true` : false,
			lenient: ctx.lenientOption ? ctx.lenientOption.getText().toLowerCase() === `true` : false
		}
	}

	visitSearchIndexConfigs(ctx) {
		return {
			autoCommitTime: ctx.autoCommitTimeConfig ? ctx.autoCommitTimeConfig.getText() : 1000,
			defaultQueryField: ctx.defaultQueryFieldConfig ? removeQuotes(ctx.defaultQueryFieldConfig.getText()) : '',
			directoryFactory: ctx.directoryFactoryConfig ? removeQuotes(ctx.directoryFactoryConfig.getText()) : '',
			filterCacheLowWaterMark: ctx.filterCacheLowWaterMarkConfig ? ctx.filterCacheLowWaterMarkConfig.getText() : 1024,
			filterCacheHighWaterMark: ctx.filterCacheHighWaterMarkConfig ? ctx.filterCacheHighWaterMarkConfig.getText() : 2048,
			directoryFactoryClass: ctx.directoryFactoryClassConfig ? removeQuotes(ctx.directoryFactoryClassConfig.getText()) : '',
			mergeMaxThreadCount: ctx.mergeMaxThreadCountConfig ? ctx.mergeMaxThreadCountConfig.getText() : '',
			mergeMaxMergeCount: ctx.mergeMaxMergeCountConfig ? ctx.mergeMaxMergeCountConfig.getText() : '',
			ramBufferSize: ctx.ramBufferSizeConfig ? ctx.ramBufferSizeConfig.getText() : 512,
			realtime: ctx.realtimeConfig ? ctx.realtimeConfig.getText().toLowerCase() === `true` : false
		}
	}

	visitSearchIndexProfiles(ctx) {
		let profiles = ctx.getText();

		if (typeof profiles === 'string') {
			profiles = profiles.split(',').map(item => item.trim());
		}

		if (profiles.map(item => item.toLowerCase()).includes('spacesavingall')) {
			return [
				"spaceSavingNoJoin",
				"spaceSavingNoTextfield",
				"spaceSavingSlowTriePrecision"
			];
		}

		return profiles;
	}

	visitSearchIndexColumnList(ctx) {
		return this.visit(ctx.searchIndexColumn())
	}

	visitSearchIndexColumn(ctx) {
		let key;
		if (ctx.star) {
			key = '*'
		} else {
			key = ctx.column().getText()
		}
		const copyField = ctx.copyFieldOption ? ctx.copyFieldOption.getText().toLowerCase() === `true` : false;
		const docValues = ctx.docValuesOption ? ctx.docValuesOption.getText().toLowerCase() === `true` : false;
		const excluded = ctx.excludedOption ? ctx.excludedOption.getText().toLowerCase() === `true` : false;
		const indexed = ctx.indexedOption ? ctx.indexedOption.getText().toLowerCase() === `true` : false;
		return {
			key: [key],
			copyField,
			docValues,
			excluded,
			indexed
		}
	}

	visitCreateType(ctx) {
		const name = this.visit(ctx.type());
		const properties = listToJson(this.visit(ctx.typeMemberColumnList()))

		return {
			type: CREATE_DEFINITION_COMMAND,
			name,
			properties
		}
	}

	visitCreateAggregate(ctx) {
		const keyspace = this.getKeyspaceName(ctx);
		const name = this.visit(ctx.aggregate());
		const [sFunc, finalFunc] = this.visit(ctx.functionStatement());
		const fullName = keyspace ? `${keyspace}.${name}` : name;
		const initCond = this.visit(ctx.initCondDefinition());

		const [argType, sType] = ctx.dataType().map(context => context.getText());

		let statement = 'CREATE';
		if (ctx.orReplace()) {
			statement += ' OR REPLACE';
		}
		statement += ` AGGREGATE`
		if (ctx.ifNotExist()) {
			statement += ' IF NOT EXIST';
		}
		statement += ` ${fullName} (${argType})\n\tSFUNC ${sFunc}\n\tSTYPE ${sType}\n\tFINALFUNC ${finalFunc}\n\tINITCOND ${initCond};`;

		return {
			type: ADD_BUCKET_DATA_COMMAND,
			bucketName: keyspace,
			key: 'UDAs',
			data: {
				name,
				storedProcFunction: statement,
			}
		};
	}

	visitCreateFunction(ctx) {
		const keyspace = this.getKeyspaceName(ctx);
		const name = this.visit(ctx.functionStatement());
		const fullName = keyspace ? `${keyspace}.${name}` : name;
		const body = this.visit(ctx.codeBlock());
		const language = this.visit(ctx.language());
		const params = this.visit(ctx.paramList());
		const returnMode = this.visit(ctx.returnMode());

		const returnsType = ctx.dataType().getText();

		let statement = 'CREATE';
		if (ctx.orReplace()) {
			statement += ' OR REPLACE';
		}
		statement += ` FUNCTION`
		if (ctx.ifNotExist()) {
			statement += ' IF NOT EXIST';
		}
		statement += ` ${fullName} ${params}\n\t${returnMode}\n\tRETURNS ${returnsType}\n\tLANGUAGE ${language} AS\n\t${body};`;

		return {
			type: ADD_BUCKET_DATA_COMMAND,
			bucketName: keyspace,
			key: 'UDFs',
			data: {
				name,
				functionBody: statement,
			}
		};
	}

	visitUse(ctx) {
		return {
			type: USE_BUCKET_COMMAND,
			bucketName: this.getKeyspaceName(ctx)
		}
	}

	visitAlterTable(ctx) {
		const bucketName = this.getKeyspaceName(ctx);
		const operationContext = ctx.alterTableOperation();
		const alterTableAdd = operationContext.alterTableAdd();
		const alterTableRename = operationContext.alterTableRename();
		const alterTableUpdateOptions = operationContext.alterTableWith();
		const collectionName = this.visit(ctx.table());

		if (alterTableAdd) {
			return {
				type: ADD_FIELDS_TO_COLLECTION_COMMAND,
				collectionName,
				bucketName,
				data: listToJson(this.visit(alterTableAdd.alterTableColumnDefinition()))
			};
		}

		if (alterTableRename) {
			const [column1, column2] = alterTableRename.column();

			return {
				type: RENAME_FIELD_COMMAND,
				collectionName,
				bucketName,
				nameFrom: this.visit(column1),
				nameTo: this.visit(column2)
			}
		}


		if (alterTableUpdateOptions) {
			const tableOptions = this.visit(alterTableUpdateOptions.tableOptions());

			return {
				type: UPDATE_ENTITY_LEVEL_DATA_COMMAND,
				collectionName,
				bucketName,
				data: {
					tableOptions
				}
			}
		}
	}

	visitAlterKeyspace(ctx) {
		return {
			...this.visitCreateKeyspace(ctx),
			type: UPDATE_BUCKET_COMMAND
		};
	}

	visitAlterMaterializedView(ctx) {
		const name = this.visit(ctx.materializedView());
		const optionsContext = ctx.materializedViewOptions();
		const options = optionsContext ? this.visit(optionsContext) : {};
		const keyspace = this.getKeyspaceName(ctx);
		const bucketName = keyspace ? this.visit(keyspace) : '';

		return {
			type: UPDATE_VIEW_LEVEL_DATA_COMMAND,
			name,
			bucketName,
			data: {
				tableOptions: options
			}
		};
	}

	visitAlterType(ctx) {
		const name = this.visit(ctx.type());
		const bucketName = this.getKeyspaceName(ctx);
		const operationContext = ctx.alterTypeOperation();
		const alterTypeAdd = operationContext.alterTypeAdd();

		if (alterTypeAdd) {
			return {
				type: ADD_FIELDS_TO_DEFINITION_COMMAND,
				name,
				bucketName,
				data: listToJson(this.visit(ctx.typeMemberColumnList()))
			};
		}

	}

	visitDropTable(ctx) {
		return {
			type: REMOVE_COLLECTION_COMMAND,
			bucketName: this.getKeyspaceName(ctx),
			collectionName: this.visit(ctx.table())
		}
	}

	visitDropKeyspace(ctx) {
		return {
			type: REMOVE_BUCKET_COMMAND,
			bucketName: this.getKeyspaceName(ctx)
		}
	}

	visitDurableWrites(ctx) {
		return this.visit(ctx.booleanLiteral());
	}

	visitReplicationList(ctx) {
		const items = this.visit(ctx.replicationListItem());

		return items.reduce((replicationProperties, item) => ({
			...replicationProperties,
			...item
		}), {});
	}

	visitReplicationListItem(ctx) {
		const data = ctx.getText();
		const REPLICATION_LIST_ITEMS_KEY_MAP = {
			'class': 'replStrategy',
			'replication_factor': 'replFactor'
		};
		const REPLICATION_VALUE_MAP = {
			'networktopologystrategy': 'NetworkTopologyStrategy',
			'simplestrategy': 'SimpleStrategy'
		};

		const [key, value] = data.split(':').map(removeQuotes);
		const targetKey = REPLICATION_LIST_ITEMS_KEY_MAP[key.toLowerCase()] || key;
		let targetValue = REPLICATION_VALUE_MAP[key.toLowerCase()] || value;

		if (targetKey === 'replFactor') {
			targetValue = Number(targetValue) || 0;
		}

		return { [targetKey]: targetValue };
	}

	visitIndexColumnSpec(ctx) {
		if (ctx.column()) {
			return {
				name: this.visit(ctx.column()),
				type: ''
			};
		}
		const keysContext = ctx.indexKeysSpec();
		const entriesContext = ctx.indexEntriesSSpec();
		const fullContext = ctx.indexFullSpec();
		const valuesContext = ctx.indexValuesSpec();

		const context = keysContext || entriesContext || fullContext || valuesContext;

		return this.visit(context);
	}

	visitIndexKeysSpec(ctx) {
		return {
			name: this.visit(ctx.column()),
			type: 'keys'
		};
	}

	visitIndexEntriesSSpec(ctx) {
		return {
			name: this.visit(ctx.column()),
			type: 'entries'
		};
	}

	visitIndexFullSpec(ctx) {
		return {
			name: this.visit(ctx.column()),
			type: 'full'
		};
	}

	visitIndexValuesSpec(ctx) {
		return {
			name: this.visit(ctx.column()),
			type: 'values'
		};
	}

	visitColumnList(ctx) {
		return this.visit(ctx.column());
	}

	visitMaterializedViewOptions(ctx) {
		return this.visit(ctx.tableOptions());
	}

	visitReturnMode(ctx) {
		const start = ctx.kwCalled() ? 'CALLED' : 'RETURNS NULL';
		return `${start} ON NULL INPUT`;
	}

	visitParamList(ctx) {
		const params = ctx.param();
		if (!params) {
			return '()';
		}

		return '(' + this.visit(params).join(',') + ')';
	}

	visitParam(ctx) {
		const name = this.visit(ctx.paramName());
		const type = ctx.dataType().getText();

		return `${name} ${type}`;
	}

	visitTableOptions(ctx) {
		return this.visit(ctx.tableOptionItem()).filter(Boolean).reduce((options, data) => {
			if (data.key === 'clusteringKey') {
				return {
					...options,
					[data.key]: data.value
				}
			}

			const key = tableOptionsHashMap[data.key.toLowerCase()];
			if (key === 'caching') {
				return {
					...options,
					[key]: getCachingOptionValue(data.value)
				}
			}

			const value = isNaN(data.value) ? removeQuotes(data.value || '') : Number(data.value);
			if (!key) {
				const otherProperties = options.otherProperties || [];
				return {
					...options,
					otherProperties: [
						...otherProperties,
						{
							name: data.key,
							value
						},
					],
				}
			}

			return {
				...options,
				[key]: value
			}
		}, {});
	}

	visitTableOptionItem(ctx) {
		if (ctx.clusteringOrder()) {
			return {
				key: 'clusteringKey',
				value: this.visit(ctx.clusteringOrder()),
			}
		}

		const valueContext = ctx.tableOptionValue() || ctx.optionHash();

		return {
			key: ctx.tableOptionName().getText(),
			value: valueContext.getText()
		};
	}

	visitClusteringOrder(ctx) {
		return this.visit(ctx.clusteringOrderColumns());
	}

	visitClusteringOrderColumns(ctx) {
		const columnsData = {
			names: this.visit(ctx.column()),
			directions: this.visit(ctx.orderDirection())
		}

		return columnsData.names.map((columnName, index) => {
			return {
				name: columnName,
				type: getKeyType(columnsData.directions[index]),
			}
		})
	}

	visitOrderDirection(ctx) {
		return ctx.getText()
	}

	visitDataType(ctx) {
		const type = this.visit(ctx.dataTypeName());
		const COMPLEX_TYPES = ['map', 'tuple', 'list', 'set'];
		const hackoladeType = getTargetType(type);

		const typeDescription = ctx.dataTypeDefinition();
		if (!hackoladeType) {
			if (isFrozen(type)) {
				return {
					...this.visit(typeDescription)[0],
					frozen: true,
				}
			}

			return {
				type: 'reference',
				$ref: '#/definitions/' + type
			};
		}

		const isComplexType = COMPLEX_TYPES.includes(hackoladeType.type);
		if (!isComplexType) {
			return hackoladeType
		}

		const [description1, description2] = typeDescription ? this.visit(typeDescription) : [DEFAULT_TYPE, DEFAULT_TYPE];

		if (hackoladeType === 'map') {
			return {
				...hackoladeType,
				subtype: `map<${complexTypeMapper(description2.type || '')}>`
			}
		}

		return {
			...hackoladeType,
			subtype: `${hackoladeType.type}<${complexTypeMapper(description1.type || '')}>`,
			items: description1
		}
	}

	visitColumnDefinitionList(ctx) {
		const primaryKeyContext = ctx.primaryKeyElement();
		const keyData = primaryKeyContext ? this.visit(primaryKeyContext) : { partitionKey: [], clusteringKey: [] };
		const columns = this.visit(ctx.columnDefinition());
		const primaryKeysFromColumns = columns.filter(column => column.isPrimaryKey).map(column => ({ name: column.name }));

		return {
			properties: columns.reduce((properties, column) => ({
				...properties,
				[column.name]: column.type
			}), {}),
			keyData: {
				...keyData,
				partitionKey: [...keyData.partitionKey, ...primaryKeysFromColumns]
			}
		};
	}

	visitWithElement(ctx) {
		return this.visit(ctx.tableOptions());
	}

	visitPrimaryKeyElement(ctx) {
		const keyData = this.visit(ctx.primaryKeyDefinition())[0];

		return {
			partitionKey: keyData.partitionKey.map(key => ({ name: key, type: getKeyType() })),
			clusteringKey: keyData.clusteringKey.map(key => ({ name: key, type: getKeyType() })),
		}
	}

	visitSinglePrimaryKey(ctx) {
		return {
			partitionKey: [this.visit(ctx.column())],
			clusteringKey: []
		}
	}

	visitCompoundKey(ctx) {
		const partitionKey = [this.visit(ctx.partitionKey())];
		const clusteringKeyList = ctx.clusteringKeyList();
		const clusteringKey = clusteringKeyList ? this.visit(clusteringKeyList) : [];

		return {
			partitionKey, clusteringKey
		}
	}

	visitCompositeKey(ctx) {
		const partitionKey = this.visit(ctx.partitionKeyList());
		const clusteringKeyList = ctx.clusteringKeyList();
		const clusteringKey = clusteringKeyList ? this.visit(clusteringKeyList) : [];

		return {
			partitionKey, clusteringKey
		}
	}

	visitColumnDefinition(ctx) {
		const name = this.visit(ctx.column());
		const isPrimaryKey = !!ctx.primaryKeyColumn();

		return { name, type: this.visit(ctx.dataType()), isPrimaryKey };
	}

	visitPartitionKeyList(ctx) {
		return this.visit(ctx.partitionKey());
	}

	visitClusteringKeyList(ctx) {
		return this.visit(ctx.clusteringKey());
	}

	visitPartitionKey(ctx) {
		return this.visit(ctx.column());
	}

	visitClusteringKey(ctx) {
		return this.visit(ctx.column());
	}

	visitCodeBlock(ctx) {
		return ctx.getText();
	}

	visitDataTypeDefinition(ctx) {
		return this.visit(ctx.dataType());
	}

	visitBooleanLiteral(ctx) {
		return (ctx.getText() || '').toLowerCase() === 'true';
	}

	visitLanguage(ctx) {
		return ctx.getText();
	}

	visitParamName(ctx) {
		return getName(ctx);
	}

	visitInitCondDefinition(ctx) {
		return getName(ctx);
	}

	visitFunctionStatement(ctx) {
		return getName(ctx);
	}

	visitAggregate(ctx) {
		return getName(ctx);
	}

	visitDataTypeName(ctx) {
		return getName(ctx);
	}

	visitKeyspace(ctx) {
		return getName(ctx);
	}

	visitColumn(ctx) {
		return getName(ctx);
	}

	visitTable(ctx) {
		return getName(ctx);
	}

	visitType(ctx) {
		return getName(ctx);
	}

	visitMaterializedView(ctx) {
		return getName(ctx);
	}

	visitParamName(ctx) {
		return getName(ctx);
	}

	visitIndexName(ctx) {
		return getName(ctx);
	}

	visitStatementSeparator() {
		return;
	}

	visitSyntaxComma() {
		return;
	}

	getKeyspaceName(ctx) {
		const keyspaceContext = ctx.keyspace();

		return keyspaceContext ? this.visit(keyspaceContext) : '';
	}

	visitIfExists(ctx, funcName, defaultValue) {
		try {
			return this.visit(ctx[funcName]());
		} catch (e) {
			return defaultValue;
		}
	}

	visitFlagValue(ctx, funcName) {
		try {
			this.visit(ctx[funcName]());
			return true;
		} catch (e) {
			return false;
		}
	}
}

const getName = context => {
	if (!context) {
		return '';
	}
	return removeQuotes(context.getText());
}

const removeQuotes = string => string.replace(/^(['"])([\s\S]*)\1$/m, '$2');

const listToJson = list => list.filter(Boolean).reduce((properties, data, index) => {
	if (index % 2 === 0) {
		return [...properties, { key: data }];
	}
	const key = properties[properties.length - 1].key;
	return [...properties.slice(0, -1), { key, value: data }];
}, []).reduce((properties, item) => ({
	...properties, [item.key]: item.value || DEFAULT_TYPE
}), {});

const isFrozen = type => type.toUpperCase() === 'FROZEN';

const getTargetType = (type) => {
	type = removeQuotes((type || '').toLowerCase());
	switch (type) {
		case "int":
			return {
				type: "numeric",
				mode: "integer"
			};
		case "smallint":
		case "tinyint":
		case "bigint":
		case "counter":
		case "decimal":
		case "double":
		case "float":
		case "varint":
			return {
				type: "numeric",
				mode: type
			};
		case "text":
		case "varchar":
		case "ascii":
		case "inet":
			return {
				type: "char",
				mode: type
			};
		case "duration":
			return {
				type: "duration"
			}
		case "pointtype":
		case "linestringtype":
		case "polygontype":
			return {
				type: "geospatial"
			};
		case "daterangetype":
			return {
				type: "DateRangeType"
			}
		case "boolean":
			return {
				type: 'bool'
			};
		case "timestamp":
		case "timeuuid":
		case "blob":
		case "date":
		case "time":
		case "uuid":
			return { type };
		case "tuple":
		case "list":
		case "set":
		case "map":
			return { type };
		default:
			return;
	}
};

const complexTypeMapper = type => {
	switch (type) {
		case "numeric":
			return "num";
		case "char":
			return "str";
		case "timestamp":
			return "ts";
		case "blob":
		case "date":
		case "tuple":
		case "list":
		case "set":
		case "map":
			return type;
		default:
			return "udt";
	}
}

const tableOptionsHashMap = {
	'comment': 'comment',
	'caching': 'caching',
	'compression': 'compression',
	'compaction': 'compaction',
	'dclocal_read_repair_chance': 'localReadRepairChance',
	'read_repair_chance': 'readRepairChance',
	'gc_grace_seconds': 'gcGraceSeconds',
	'bloom_filter_fp_chance': 'bloomFilterFalsePositiveChance',
	'default_time_to_live': 'defaultTtl',
	'speculative_retry': 'speculativeRetry',
	'min_index_interval': 'minIndexInterval',
	'max_index_interval': 'maxIndexInterval',
	'crc_check_chance': 'crcCheckChance',
	'memtable_flush_period_in_ms': 'memtableFlushPeriod',
};


const getViewSchema = (tableName, columns) => {
	return columns.reduce((schema, name) => {
		return Object.assign({}, schema, {
			[name]: { $ref: `#collection/definitions/${tableName}/${name}` }
		});
	}, {});
};

const getCachingOptionValue = value => {
	try {
		const data = JSON.parse(value.replace(/'/g, '"'));
		return Object.keys(data).reduce((options, name) => {
			const key = name.toLowerCase();
			if (key === 'rows_per_partition') {
				return {
					...options,
					rowsPerPartition: data[name]
				}
			}

			return {
				...options,
				[key]: data[name]
			}
		}, {});
	} catch (err) {
		return {};
	}
}

const getKeyType = (type) => {
	if (type === 'DESC') {
		return 'descending';
	}

	return 'ascending';
}

const mergeClusteringKeys = (keysWithDirection = [], keys = []) => {
	const keysWithDirectionNames = keysWithDirection.map(key => key.name);

	return keys.filter(key => !keysWithDirectionNames.includes(key.name)).concat(keysWithDirection);
}

module.exports = Visitor;