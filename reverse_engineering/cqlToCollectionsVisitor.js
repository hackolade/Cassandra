const { CqlParserVisitor } = require('./lib/CqlParserVisitor');
const { CqlParser } = require('./lib/CqlParser');
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
	ADD_BUCKET_DATA_COMMAND
} = require('./commandsHelper');

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
		const collectionName =  getName(ctx.table());
		const bucketName = this.getKeyspaceName(ctx);
		const optionsContext = ctx.withElement();
		const options = optionsContext ? this.visit(optionsContext) : {};
		
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
				tableOptions: options,
				compositePartitionKey: (keyData.partitionKey || []).map(key => ({ name: key })),
				compositeClusteringKey: (keyData.clusteringKey || []).map(key => ({ name: key }))
			}
		}
	}

	visitCreateKeyspace(ctx) {
		const name = this.getKeyspaceName(ctx)
		const replicationProperties = this.visit(ctx.replicationList());

		return {
			type: CREATE_BUCKET_COMMAND,
			name,
			data: {
				...replicationProperties,
				durableWrites: Boolean(this.visit(ctx.durableWrites()))
			}
		};
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

		const [ key, value ] = data.split(':').map(removeQuotes);
		const targetKey = REPLICATION_LIST_ITEMS_KEY_MAP[key.toLowerCase()] || key;
		let targetValue = REPLICATION_VALUE_MAP[key.toLowerCase()] || value;

		if (targetKey === 'replFactor') {
			targetValue = Number(targetValue) || 0;
		}

		return { [targetKey] : targetValue };
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

	visitAlterTable(ctx) {
		const bucketName =this.getKeyspaceName(ctx);
		const alterTableAdd = ctx.alterTableOperation().alterTableAdd();
		const alterTableRename = ctx.alterTableOperation().alterTableRename();
		if (alterTableAdd) {
			return {
				type: ADD_FIELDS_TO_COLLECTION_COMMAND,
				collectionName: this.visit(ctx.table()),
				bucketName,
				data: listToJson(this.visit(alterTableAdd.alterTableColumnDefinition()))
			};
		}

		if (alterTableRename) {
			const [column1, column2] = alterTableRename.column();
			
			return {
				type: RENAME_FIELD_COMMAND,
				collectionName: this.visit(ctx.table()),
				bucketName,
				nameFrom: this.visit(column1),
				nameTo: this.visit(column2) 
			}
		}
	
		return;
	}

	visitDropKeyspace(ctx) {
		return {
		  type: REMOVE_BUCKET_COMMAND,
		  bucketName: this.getKeyspaceName(ctx)
		}
	}

	visitDropTable(ctx) {
		return {
		  type: REMOVE_COLLECTION_COMMAND,
		  bucketName: this.getKeyspaceName(ctx),
		  collectionName: this.visit(ctx.table())
		}
	}

	visitUse(ctx) {
		return {
		  type: USE_BUCKET_COMMAND,
		  bucketName: this.getKeyspaceName(ctx)
		}
	}

	visitCreateMaterializedView(ctx) {
		const name = this.visit(ctx.materializedView());
		const table = this.visit(ctx.table());
		const columns = this.visit(ctx.columnList()[0]).filter(Boolean);
		const schema = getViewSchema(table, columns);
		const keyspace = ctx.keyspace()[0];
		const bucketName = keyspace ? this.visit(keyspace) : '';
		
		return {
		  type: CREATE_VIEW_COMMAND,
		  name,
		  bucketName,
		  collectionName: table,
		  jsonSchema: { properties: schema }
		};
	}

	visitCreateAggregate(ctx) {
		const keyspace = this.getKeyspaceName(ctx);
		const name = this.visit(ctx.aggregate());
		const [ sFunc, finalFunc ] = this.visit(ctx.functionStatement());
		const fullName = keyspace ? `${keyspace}.${name}` : name;
		const initCond = this.visit(ctx.initCondDefinition());

		const [ argType, sType ] = ctx.dataType().map(context => context.getText());

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
				  storedProcFunction: statement,
			  }
		  };
	}


	visitReturnMode(ctx) {
		const start = ctx.kwCalled() ? 'CALLED' : 'RETURNS NULL';
		return `${start} ON NULL INPUT`;
	}

	visitInitCondDefinition(ctx) {
		  return getName(ctx);
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
			const key = tableOptionsHashMap[data.key.toLowerCase()];
			if (!key) {
				return options;
			}
			return {
				...options,
				[key]: removeQuotes(data.value || '')
			}
		}, {});
	}

	visitTableOptionItem(ctx) {
		if (ctx.clusteringOrder()) {
		  return;
		}

		return {
		  key: ctx.tableOptionName().getText(),
		  value: ctx.tableOptionValue() ? ctx.tableOptionValue().getText() : ctx.optionHash().getText()
		}
	}


	visitDataType(ctx) {
		const type = this.visit(ctx.dataTypeName());
		const hackoladeType = getTargetType(type);
		
		const typeDescription = ctx.dataTypeDefinition();
		if (hackoladeType) {
			const isComplexType = ['map', 'tuple', 'list', 'set'].includes(hackoladeType.type);
			if (!isComplexType) {
				return hackoladeType
			}
			const [ description1, description2 ] = typeDescription ? this.visit(typeDescription) : [ DEFAULT_TYPE, DEFAULT_TYPE ];

			if (hackoladeType === 'map') {
				return {
					...hackoladeType,
					subtype: `map<${description2.type || ''}>`
				}
			}

			return {
				...hackoladeType,
				subtype: `${hackoladeType.type}<${description1.type || ''}>`,
				items: description1
			}
		}

		const isFrozen = type.toUpperCase() === 'FROZEN';
		if (isFrozen) {
		  return {
			...this.visit(typeDescription)[0],
			frozen: true,
		  }
		} else {
		  return {
			type: 'reference',
			frozen: isFrozen,
			$ref: '#/definitions/'+ type
		  }
		}
	}

	visitColumnDefinitionList(ctx) {
		const primaryKeyContext = ctx.primaryKeyElement();
		const keyData = primaryKeyContext ? this.visit(primaryKeyContext) : {};
		const columns = this.visit(ctx.columnDefinition());

		return {
		  properties: Object.assign(...columns),
		  keyData
		};
	}

	visitWithElement(ctx) {
		return this.visit(ctx.tableOptions());
	}

	visitPrimaryKeyElement(ctx) {
		return this.visit(ctx.primaryKeyDefinition())[0];
	}

	visitCompoundKey(ctx) {
		const partitionKey = this.visit(ctx.partitionKey());
		const clusteringKey = this.visit(ctx.clusteringKeyList())[0];

		return {
		  partitionKey, clusteringKey
		}
	}

	visitColumnDefinition(ctx) {
		const name = this.visit(ctx.column());
		return { [name]: this.visit(ctx.dataType()) };
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

	visitCreateRole(ctx) {
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
}

const getName = context => {
	if (!context) {
		return '';
	}
	return removeQuotes(context.getText());
}
const removeQuotes = string => string.replace(/^(['"])(.*)\1$/, '$2');

const listToJson = list => list.filter(Boolean).reduce((properties, data, index) => {
	if (index % 2 === 0) {
		  return [ ...properties, { key: data } ];
	}
	const key = properties[properties.length - 1].key;
	return [ ...properties.slice(0, -1), { key, value: data} ];
}, []).reduce((properties, item) => ({
	...properties, [item.key]: item.value || DEFAULT_TYPE
}), {});

const getTargetType = (type) => {
	type = (type || '').toLowerCase();
	switch(type) {
		case "smallint":
		case "tinyint":
		case "int":
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
			type: "char"
		  };
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

const tableOptionsHashMap = {
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
		  [name]: {$ref: `#collection/definitions/${tableName}/${name}`}
		});
	}, {});
};

module.exports = Visitor;