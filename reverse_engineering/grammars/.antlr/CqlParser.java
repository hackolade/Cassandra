// Generated from /home/mikhail/.hackolade/plugins/Cassandra/reverse_engineering/grammars/CqlParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LR_BRACKET=1, RR_BRACKET=2, LC_BRACKET=3, RC_BRACKET=4, LS_BRACKET=5, 
		RS_BRACKET=6, COMMA=7, SEMI=8, COLON=9, SPACE=10, SPEC_MYSQL_COMMENT=11, 
		COMMENT_INPUT=12, LINE_COMMENT=13, DOT=14, STAR=15, DIVIDE=16, MODULE=17, 
		PLUS=18, MINUSMINUS=19, MINUS=20, DQUOTE=21, SQUOTE=22, K_ADD=23, K_AGGREGATE=24, 
		K_ALL=25, K_ALLOW=26, K_ALTER=27, K_AND=28, K_ANY=29, K_APPLY=30, K_AS=31, 
		K_ASC=32, K_AUTHORIZE=33, K_BATCH=34, K_BEGIN=35, K_BY=36, K_CALLED=37, 
		K_CLUSTERING=38, K_COLUMNFAMILY=39, K_COMPACT=40, K_CONSISTENCY=41, K_CONTAINS=42, 
		K_CREATE=43, K_CUSTOM=44, K_DELETE=45, K_DESC=46, K_DESCRIBE=47, K_DISTINCT=48, 
		K_DROP=49, K_DURABLE_WRITES=50, K_EACH_QUORUM=51, K_ENTRIES=52, K_EXECUTE=53, 
		K_EXISTS=54, K_FALSE=55, K_FILTERING=56, K_FINALFUNC=57, K_FROM=58, K_FULL=59, 
		K_FUNCTION=60, K_FUNCTIONS=61, K_GRANT=62, K_IF=63, K_IN=64, K_INDEX=65, 
		K_INFINITY=66, K_INITCOND=67, K_INPUT=68, K_INSERT=69, K_INTO=70, K_IS=71, 
		K_JSON=72, K_KEY=73, K_KEYS=74, K_KEYSPACE=75, K_KEYSPACES=76, K_LANGUAGE=77, 
		K_LEVEL=78, K_LIMIT=79, K_LOCAL_ONE=80, K_LOCAL_QUORUM=81, K_LOGGED=82, 
		K_LOGIN=83, K_MATERIALIZED=84, K_MODIFY=85, K_NAN=86, K_NORECURSIVE=87, 
		K_NOSUPERUSER=88, K_NOT=89, K_NULL=90, K_OF=91, K_ON=92, K_ONE=93, K_OPTIONS=94, 
		K_OR=95, K_ORDER=96, K_PARTITION=97, K_PASSWORD=98, K_PER=99, K_PERMISSION=100, 
		K_PERMISSIONS=101, K_PRIMARY=102, K_QUORUM=103, K_RENAME=104, K_REPLACE=105, 
		K_REPLICATION=106, K_RETURNS=107, K_REVOKE=108, K_ROLE=109, K_ROLES=110, 
		K_INTERNAL=111, K_LDAP=112, K_SCHEME=113, K_SCHEMA=114, K_SELECT=115, 
		K_SET=116, K_SFUNC=117, K_STATIC=118, K_STORAGE=119, K_STYPE=120, K_SUPERUSER=121, 
		K_TABLE=122, K_THREE=123, K_TIMESTAMP=124, K_TO=125, K_TOKEN=126, K_TRIGGER=127, 
		K_TRUE=128, K_TRUNCATE=129, K_TTL=130, K_TWO=131, K_TYPE=132, K_UNLOGGED=133, 
		K_UPDATE=134, K_USE=135, K_USER=136, K_USING=137, K_UUID=138, K_VALUES=139, 
		K_VIEW=140, K_WHERE=141, K_WITH=142, K_WRITETIME=143, K_ASCII=144, K_BIGINT=145, 
		K_BLOB=146, K_BOOLEAN=147, K_COUNTER=148, K_DATE=149, K_DECIMAL=150, K_DOUBLE=151, 
		K_FLOAT=152, K_FROZEN=153, K_INET=154, K_INT=155, K_LIST=156, K_MAP=157, 
		K_SMALLINT=158, K_TEXT=159, K_TIMEUUID=160, K_TIME=161, K_TINYINT=162, 
		K_TUPLE=163, K_VARCHAR=164, K_VARINT=165, CODE_BLOCK=166, STRING_LITERAL=167, 
		DECIMAL_LITERAL=168, FLOAT_LITERAL=169, HEXADECIMAL_LITERAL=170, REAL_LITERAL=171, 
		OBJECT_NAME=172, UUID=173, OPERATOR_EQ=174, OPERATOR_LT=175, OPERATOR_GT=176, 
		OPERATOR_LTE=177, OPERATOR_GTE=178, K_USERS=179;
	public static final int
		RULE_root = 0, RULE_cqls = 1, RULE_statementSeparator = 2, RULE_empty = 3, 
		RULE_cql = 4, RULE_revoke = 5, RULE_listUsers = 6, RULE_listRoles = 7, 
		RULE_listPermissions = 8, RULE_grant = 9, RULE_priviledge = 10, RULE_resource = 11, 
		RULE_createUser = 12, RULE_createRole = 13, RULE_createType = 14, RULE_typeMemberColumnList = 15, 
		RULE_createTrigger = 16, RULE_createMaterializedView = 17, RULE_materializedViewWhere = 18, 
		RULE_columnNotNullList = 19, RULE_columnNotNull = 20, RULE_materializedViewOptions = 21, 
		RULE_createKeyspace = 22, RULE_createFunction = 23, RULE_codeBlock = 24, 
		RULE_paramList = 25, RULE_returnMode = 26, RULE_createAggregate = 27, 
		RULE_initCondDefinition = 28, RULE_initCondHash = 29, RULE_initCondHashItem = 30, 
		RULE_initCondListNested = 31, RULE_initCondList = 32, RULE_orReplace = 33, 
		RULE_alterUser = 34, RULE_userPassword = 35, RULE_userSuperUser = 36, 
		RULE_alterType = 37, RULE_alterTypeOperation = 38, RULE_alterTypeRename = 39, 
		RULE_alterTypeRenameList = 40, RULE_alterTypeRenameItem = 41, RULE_alterTypeAdd = 42, 
		RULE_alterTypeAlterType = 43, RULE_alterTable = 44, RULE_alterTableOperation = 45, 
		RULE_alterTableWith = 46, RULE_alterTableRename = 47, RULE_alterTableDropCompactStorage = 48, 
		RULE_alterTableDropColumns = 49, RULE_alterTableDropColumnList = 50, RULE_alterTableAdd = 51, 
		RULE_alterTableColumnDefinition = 52, RULE_alterRole = 53, RULE_roleWith = 54, 
		RULE_roleWithOptions = 55, RULE_alterMaterializedView = 56, RULE_dropUser = 57, 
		RULE_dropType = 58, RULE_dropMaterializedView = 59, RULE_dropAggregate = 60, 
		RULE_dropFunction = 61, RULE_dropTrigger = 62, RULE_dropRole = 63, RULE_dropTable = 64, 
		RULE_dropKeyspace = 65, RULE_dropIndex = 66, RULE_createTable = 67, RULE_withElement = 68, 
		RULE_clusteringOrder = 69, RULE_tableOptions = 70, RULE_tableOptionItem = 71, 
		RULE_tableOptionName = 72, RULE_tableOptionValue = 73, RULE_optionHash = 74, 
		RULE_optionHashItem = 75, RULE_optionHashKey = 76, RULE_optionHashValue = 77, 
		RULE_columnDefinitionList = 78, RULE_columnDefinition = 79, RULE_primaryKeyColumn = 80, 
		RULE_primaryKeyElement = 81, RULE_primaryKeyDefinition = 82, RULE_singlePrimaryKey = 83, 
		RULE_compoundKey = 84, RULE_compositeKey = 85, RULE_partitionKeyList = 86, 
		RULE_clusteringKeyList = 87, RULE_partitionKey = 88, RULE_clusteringKey = 89, 
		RULE_applyBatch = 90, RULE_beginBatch = 91, RULE_batchType = 92, RULE_alterKeyspace = 93, 
		RULE_replicationList = 94, RULE_replicationListItem = 95, RULE_durableWrites = 96, 
		RULE_use = 97, RULE_truncate = 98, RULE_createIndex = 99, RULE_indexName = 100, 
		RULE_indexColumnSpec = 101, RULE_indexKeysSpec = 102, RULE_indexEntriesSSpec = 103, 
		RULE_indexFullSpec = 104, RULE_deleteStatement = 105, RULE_deleteColumnList = 106, 
		RULE_deleteColumnItem = 107, RULE_update = 108, RULE_ifSpec = 109, RULE_ifConditionList = 110, 
		RULE_ifCondition = 111, RULE_assignments = 112, RULE_assignmentElement = 113, 
		RULE_assignmentSet = 114, RULE_assignmentMap = 115, RULE_assignmentMapExpression = 116, 
		RULE_assignmentList = 117, RULE_assignmentTuple = 118, RULE_insert = 119, 
		RULE_usingTtlTimestamp = 120, RULE_timestamp = 121, RULE_ttl = 122, RULE_usingTimestampSpec = 123, 
		RULE_ifNotExist = 124, RULE_ifExist = 125, RULE_insertValuesSpec = 126, 
		RULE_insertColumnSpec = 127, RULE_columnList = 128, RULE_expressionList = 129, 
		RULE_expression = 130, RULE_select = 131, RULE_allowFilteringSpec = 132, 
		RULE_limitSpec = 133, RULE_fromSpec = 134, RULE_fromSpecElement = 135, 
		RULE_orderSpec = 136, RULE_orderSpecElement = 137, RULE_whereSpec = 138, 
		RULE_distinctSpec = 139, RULE_selectElements = 140, RULE_selectElement = 141, 
		RULE_relationElements = 142, RULE_relationElement = 143, RULE_relalationContains = 144, 
		RULE_relalationContainsKey = 145, RULE_functionCall = 146, RULE_functionArgs = 147, 
		RULE_constant = 148, RULE_decimalLiteral = 149, RULE_floatLiteral = 150, 
		RULE_stringLiteral = 151, RULE_booleanLiteral = 152, RULE_hexadecimalLiteral = 153, 
		RULE_keyspace = 154, RULE_table = 155, RULE_column = 156, RULE_dataType = 157, 
		RULE_dataTypeName = 158, RULE_dataTypeDefinition = 159, RULE_orderDirection = 160, 
		RULE_role = 161, RULE_trigger = 162, RULE_triggerClass = 163, RULE_materializedView = 164, 
		RULE_type = 165, RULE_aggregate = 166, RULE_functionStatement = 167, RULE_language = 168, 
		RULE_user = 169, RULE_password = 170, RULE_hashKey = 171, RULE_param = 172, 
		RULE_paramName = 173, RULE_kwAdd = 174, RULE_kwAggregate = 175, RULE_kwAll = 176, 
		RULE_kwAllPermissions = 177, RULE_kwAllow = 178, RULE_kwAlter = 179, RULE_kwAnd = 180, 
		RULE_kwApply = 181, RULE_kwAs = 182, RULE_kwAsc = 183, RULE_kwAuthorize = 184, 
		RULE_kwBatch = 185, RULE_kwBegin = 186, RULE_kwBy = 187, RULE_kwCalled = 188, 
		RULE_kwClustering = 189, RULE_kwCompact = 190, RULE_kwContains = 191, 
		RULE_kwCreate = 192, RULE_kwDelete = 193, RULE_kwDesc = 194, RULE_kwDescibe = 195, 
		RULE_kwDistinct = 196, RULE_kwDrop = 197, RULE_kwDurableWrites = 198, 
		RULE_kwEntries = 199, RULE_kwExecute = 200, RULE_kwExists = 201, RULE_kwFiltering = 202, 
		RULE_kwFinalfunc = 203, RULE_kwFrom = 204, RULE_kwFull = 205, RULE_kwFunction = 206, 
		RULE_kwFunctions = 207, RULE_kwGrant = 208, RULE_kwIf = 209, RULE_kwIn = 210, 
		RULE_kwIndex = 211, RULE_kwInitcond = 212, RULE_kwInput = 213, RULE_kwInsert = 214, 
		RULE_kwInto = 215, RULE_kwIs = 216, RULE_kwJson = 217, RULE_kwKey = 218, 
		RULE_kwKeys = 219, RULE_kwKeyspace = 220, RULE_kwKeyspaces = 221, RULE_kwLanguage = 222, 
		RULE_kwLimit = 223, RULE_kwList = 224, RULE_kwLogged = 225, RULE_kwLogin = 226, 
		RULE_kwMaterialized = 227, RULE_kwModify = 228, RULE_kwNosuperuser = 229, 
		RULE_kwNorecursive = 230, RULE_kwNot = 231, RULE_kwNull = 232, RULE_kwOf = 233, 
		RULE_kwOn = 234, RULE_kwOptions = 235, RULE_kwOr = 236, RULE_kwOrder = 237, 
		RULE_kwPassword = 238, RULE_kwPrimary = 239, RULE_kwRename = 240, RULE_kwReplace = 241, 
		RULE_kwReplication = 242, RULE_kwReturns = 243, RULE_kwRole = 244, RULE_kwInternal = 245, 
		RULE_kwLdap = 246, RULE_kwScheme = 247, RULE_kwRoles = 248, RULE_kwSelect = 249, 
		RULE_kwSet = 250, RULE_kwSfunc = 251, RULE_kwStorage = 252, RULE_kwStype = 253, 
		RULE_kwSuperuser = 254, RULE_kwTable = 255, RULE_kwTimestamp = 256, RULE_kwTo = 257, 
		RULE_kwTrigger = 258, RULE_kwTruncate = 259, RULE_kwTtl = 260, RULE_kwType = 261, 
		RULE_kwUnlogged = 262, RULE_kwUpdate = 263, RULE_kwUse = 264, RULE_kwUser = 265, 
		RULE_kwUsers = 266, RULE_kwUsing = 267, RULE_kwValues = 268, RULE_kwView = 269, 
		RULE_kwWhere = 270, RULE_kwWith = 271, RULE_kwRevoke = 272, RULE_eof = 273, 
		RULE_syntaxBracketLr = 274, RULE_syntaxBracketRr = 275, RULE_syntaxBracketLc = 276, 
		RULE_syntaxBracketRc = 277, RULE_syntaxBracketLa = 278, RULE_syntaxBracketRa = 279, 
		RULE_syntaxBracketLs = 280, RULE_syntaxBracketRs = 281, RULE_syntaxComma = 282, 
		RULE_syntaxColon = 283, RULE_id = 284;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "cqls", "statementSeparator", "empty", "cql", "revoke", "listUsers", 
			"listRoles", "listPermissions", "grant", "priviledge", "resource", "createUser", 
			"createRole", "createType", "typeMemberColumnList", "createTrigger", 
			"createMaterializedView", "materializedViewWhere", "columnNotNullList", 
			"columnNotNull", "materializedViewOptions", "createKeyspace", "createFunction", 
			"codeBlock", "paramList", "returnMode", "createAggregate", "initCondDefinition", 
			"initCondHash", "initCondHashItem", "initCondListNested", "initCondList", 
			"orReplace", "alterUser", "userPassword", "userSuperUser", "alterType", 
			"alterTypeOperation", "alterTypeRename", "alterTypeRenameList", "alterTypeRenameItem", 
			"alterTypeAdd", "alterTypeAlterType", "alterTable", "alterTableOperation", 
			"alterTableWith", "alterTableRename", "alterTableDropCompactStorage", 
			"alterTableDropColumns", "alterTableDropColumnList", "alterTableAdd", 
			"alterTableColumnDefinition", "alterRole", "roleWith", "roleWithOptions", 
			"alterMaterializedView", "dropUser", "dropType", "dropMaterializedView", 
			"dropAggregate", "dropFunction", "dropTrigger", "dropRole", "dropTable", 
			"dropKeyspace", "dropIndex", "createTable", "withElement", "clusteringOrder", 
			"tableOptions", "tableOptionItem", "tableOptionName", "tableOptionValue", 
			"optionHash", "optionHashItem", "optionHashKey", "optionHashValue", "columnDefinitionList", 
			"columnDefinition", "primaryKeyColumn", "primaryKeyElement", "primaryKeyDefinition", 
			"singlePrimaryKey", "compoundKey", "compositeKey", "partitionKeyList", 
			"clusteringKeyList", "partitionKey", "clusteringKey", "applyBatch", "beginBatch", 
			"batchType", "alterKeyspace", "replicationList", "replicationListItem", 
			"durableWrites", "use", "truncate", "createIndex", "indexName", "indexColumnSpec", 
			"indexKeysSpec", "indexEntriesSSpec", "indexFullSpec", "deleteStatement", 
			"deleteColumnList", "deleteColumnItem", "update", "ifSpec", "ifConditionList", 
			"ifCondition", "assignments", "assignmentElement", "assignmentSet", "assignmentMap", 
			"assignmentMapExpression", "assignmentList", "assignmentTuple", "insert", 
			"usingTtlTimestamp", "timestamp", "ttl", "usingTimestampSpec", "ifNotExist", 
			"ifExist", "insertValuesSpec", "insertColumnSpec", "columnList", "expressionList", 
			"expression", "select", "allowFilteringSpec", "limitSpec", "fromSpec", 
			"fromSpecElement", "orderSpec", "orderSpecElement", "whereSpec", "distinctSpec", 
			"selectElements", "selectElement", "relationElements", "relationElement", 
			"relalationContains", "relalationContainsKey", "functionCall", "functionArgs", 
			"constant", "decimalLiteral", "floatLiteral", "stringLiteral", "booleanLiteral", 
			"hexadecimalLiteral", "keyspace", "table", "column", "dataType", "dataTypeName", 
			"dataTypeDefinition", "orderDirection", "role", "trigger", "triggerClass", 
			"materializedView", "type", "aggregate", "functionStatement", "language", 
			"user", "password", "hashKey", "param", "paramName", "kwAdd", "kwAggregate", 
			"kwAll", "kwAllPermissions", "kwAllow", "kwAlter", "kwAnd", "kwApply", 
			"kwAs", "kwAsc", "kwAuthorize", "kwBatch", "kwBegin", "kwBy", "kwCalled", 
			"kwClustering", "kwCompact", "kwContains", "kwCreate", "kwDelete", "kwDesc", 
			"kwDescibe", "kwDistinct", "kwDrop", "kwDurableWrites", "kwEntries", 
			"kwExecute", "kwExists", "kwFiltering", "kwFinalfunc", "kwFrom", "kwFull", 
			"kwFunction", "kwFunctions", "kwGrant", "kwIf", "kwIn", "kwIndex", "kwInitcond", 
			"kwInput", "kwInsert", "kwInto", "kwIs", "kwJson", "kwKey", "kwKeys", 
			"kwKeyspace", "kwKeyspaces", "kwLanguage", "kwLimit", "kwList", "kwLogged", 
			"kwLogin", "kwMaterialized", "kwModify", "kwNosuperuser", "kwNorecursive", 
			"kwNot", "kwNull", "kwOf", "kwOn", "kwOptions", "kwOr", "kwOrder", "kwPassword", 
			"kwPrimary", "kwRename", "kwReplace", "kwReplication", "kwReturns", "kwRole", 
			"kwInternal", "kwLdap", "kwScheme", "kwRoles", "kwSelect", "kwSet", "kwSfunc", 
			"kwStorage", "kwStype", "kwSuperuser", "kwTable", "kwTimestamp", "kwTo", 
			"kwTrigger", "kwTruncate", "kwTtl", "kwType", "kwUnlogged", "kwUpdate", 
			"kwUse", "kwUser", "kwUsers", "kwUsing", "kwValues", "kwView", "kwWhere", 
			"kwWith", "kwRevoke", "eof", "syntaxBracketLr", "syntaxBracketRr", "syntaxBracketLc", 
			"syntaxBracketRc", "syntaxBracketLa", "syntaxBracketRa", "syntaxBracketLs", 
			"syntaxBracketRs", "syntaxComma", "syntaxColon", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'", "':'", 
			null, null, null, null, "'.'", "'*'", "'/'", "'%'", "'+'", "'--'", "'-'", 
			"'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LR_BRACKET", "RR_BRACKET", "LC_BRACKET", "RC_BRACKET", "LS_BRACKET", 
			"RS_BRACKET", "COMMA", "SEMI", "COLON", "SPACE", "SPEC_MYSQL_COMMENT", 
			"COMMENT_INPUT", "LINE_COMMENT", "DOT", "STAR", "DIVIDE", "MODULE", "PLUS", 
			"MINUSMINUS", "MINUS", "DQUOTE", "SQUOTE", "K_ADD", "K_AGGREGATE", "K_ALL", 
			"K_ALLOW", "K_ALTER", "K_AND", "K_ANY", "K_APPLY", "K_AS", "K_ASC", "K_AUTHORIZE", 
			"K_BATCH", "K_BEGIN", "K_BY", "K_CALLED", "K_CLUSTERING", "K_COLUMNFAMILY", 
			"K_COMPACT", "K_CONSISTENCY", "K_CONTAINS", "K_CREATE", "K_CUSTOM", "K_DELETE", 
			"K_DESC", "K_DESCRIBE", "K_DISTINCT", "K_DROP", "K_DURABLE_WRITES", "K_EACH_QUORUM", 
			"K_ENTRIES", "K_EXECUTE", "K_EXISTS", "K_FALSE", "K_FILTERING", "K_FINALFUNC", 
			"K_FROM", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_GRANT", "K_IF", "K_IN", 
			"K_INDEX", "K_INFINITY", "K_INITCOND", "K_INPUT", "K_INSERT", "K_INTO", 
			"K_IS", "K_JSON", "K_KEY", "K_KEYS", "K_KEYSPACE", "K_KEYSPACES", "K_LANGUAGE", 
			"K_LEVEL", "K_LIMIT", "K_LOCAL_ONE", "K_LOCAL_QUORUM", "K_LOGGED", "K_LOGIN", 
			"K_MATERIALIZED", "K_MODIFY", "K_NAN", "K_NORECURSIVE", "K_NOSUPERUSER", 
			"K_NOT", "K_NULL", "K_OF", "K_ON", "K_ONE", "K_OPTIONS", "K_OR", "K_ORDER", 
			"K_PARTITION", "K_PASSWORD", "K_PER", "K_PERMISSION", "K_PERMISSIONS", 
			"K_PRIMARY", "K_QUORUM", "K_RENAME", "K_REPLACE", "K_REPLICATION", "K_RETURNS", 
			"K_REVOKE", "K_ROLE", "K_ROLES", "K_INTERNAL", "K_LDAP", "K_SCHEME", 
			"K_SCHEMA", "K_SELECT", "K_SET", "K_SFUNC", "K_STATIC", "K_STORAGE", 
			"K_STYPE", "K_SUPERUSER", "K_TABLE", "K_THREE", "K_TIMESTAMP", "K_TO", 
			"K_TOKEN", "K_TRIGGER", "K_TRUE", "K_TRUNCATE", "K_TTL", "K_TWO", "K_TYPE", 
			"K_UNLOGGED", "K_UPDATE", "K_USE", "K_USER", "K_USING", "K_UUID", "K_VALUES", 
			"K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", "K_ASCII", "K_BIGINT", 
			"K_BLOB", "K_BOOLEAN", "K_COUNTER", "K_DATE", "K_DECIMAL", "K_DOUBLE", 
			"K_FLOAT", "K_FROZEN", "K_INET", "K_INT", "K_LIST", "K_MAP", "K_SMALLINT", 
			"K_TEXT", "K_TIMEUUID", "K_TIME", "K_TINYINT", "K_TUPLE", "K_VARCHAR", 
			"K_VARINT", "CODE_BLOCK", "STRING_LITERAL", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
			"HEXADECIMAL_LITERAL", "REAL_LITERAL", "OBJECT_NAME", "UUID", "OPERATOR_EQ", 
			"OPERATOR_LT", "OPERATOR_GT", "OPERATOR_LTE", "OPERATOR_GTE", "K_USERS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public CqlsContext cqls() {
			return getRuleContext(CqlsContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(CqlParser.MINUSMINUS, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (SEMI - 8)) | (1L << (K_ALTER - 8)) | (1L << (K_APPLY - 8)) | (1L << (K_BEGIN - 8)) | (1L << (K_CREATE - 8)) | (1L << (K_DELETE - 8)) | (1L << (K_DROP - 8)) | (1L << (K_GRANT - 8)) | (1L << (K_INSERT - 8)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (K_REVOKE - 108)) | (1L << (K_SELECT - 108)) | (1L << (K_TRUNCATE - 108)) | (1L << (K_UPDATE - 108)) | (1L << (K_USE - 108)) | (1L << (K_LIST - 108)))) != 0)) {
				{
				setState(570);
				cqls();
				}
			}

			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUSMINUS) {
				{
				setState(573);
				match(MINUSMINUS);
				}
			}

			setState(576);
			eof();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CqlsContext extends ParserRuleContext {
		public List<CqlContext> cql() {
			return getRuleContexts(CqlContext.class);
		}
		public CqlContext cql(int i) {
			return getRuleContext(CqlContext.class,i);
		}
		public List<EmptyContext> empty() {
			return getRuleContexts(EmptyContext.class);
		}
		public EmptyContext empty(int i) {
			return getRuleContext(EmptyContext.class,i);
		}
		public List<StatementSeparatorContext> statementSeparator() {
			return getRuleContexts(StatementSeparatorContext.class);
		}
		public StatementSeparatorContext statementSeparator(int i) {
			return getRuleContext(StatementSeparatorContext.class,i);
		}
		public List<TerminalNode> MINUSMINUS() { return getTokens(CqlParser.MINUSMINUS); }
		public TerminalNode MINUSMINUS(int i) {
			return getToken(CqlParser.MINUSMINUS, i);
		}
		public CqlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cqls; }
	}

	public final CqlsContext cqls() throws RecognitionException {
		CqlsContext _localctx = new CqlsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cqls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(585);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ALTER:
					case K_APPLY:
					case K_BEGIN:
					case K_CREATE:
					case K_DELETE:
					case K_DROP:
					case K_GRANT:
					case K_INSERT:
					case K_REVOKE:
					case K_SELECT:
					case K_TRUNCATE:
					case K_UPDATE:
					case K_USE:
					case K_LIST:
						{
						setState(578);
						cql();
						setState(580);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUSMINUS) {
							{
							setState(579);
							match(MINUSMINUS);
							}
						}

						setState(582);
						statementSeparator();
						}
						break;
					case SEMI:
						{
						setState(584);
						empty();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
			case K_APPLY:
			case K_BEGIN:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_GRANT:
			case K_INSERT:
			case K_REVOKE:
			case K_SELECT:
			case K_TRUNCATE:
			case K_UPDATE:
			case K_USE:
			case K_LIST:
				{
				setState(590);
				cql();
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUSMINUS) {
						{
						setState(591);
						match(MINUSMINUS);
						}
					}

					setState(594);
					statementSeparator();
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(597);
				empty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSeparatorContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CqlParser.SEMI, 0); }
		public StatementSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeparator; }
	}

	public final StatementSeparatorContext statementSeparator() throws RecognitionException {
		StatementSeparatorContext _localctx = new StatementSeparatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public StatementSeparatorContext statementSeparator() {
			return getRuleContext(StatementSeparatorContext.class,0);
		}
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			statementSeparator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CqlContext extends ParserRuleContext {
		public AlterKeyspaceContext alterKeyspace() {
			return getRuleContext(AlterKeyspaceContext.class,0);
		}
		public AlterMaterializedViewContext alterMaterializedView() {
			return getRuleContext(AlterMaterializedViewContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public AlterTypeContext alterType() {
			return getRuleContext(AlterTypeContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public ApplyBatchContext applyBatch() {
			return getRuleContext(ApplyBatchContext.class,0);
		}
		public CreateAggregateContext createAggregate() {
			return getRuleContext(CreateAggregateContext.class,0);
		}
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public CreateKeyspaceContext createKeyspace() {
			return getRuleContext(CreateKeyspaceContext.class,0);
		}
		public CreateMaterializedViewContext createMaterializedView() {
			return getRuleContext(CreateMaterializedViewContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateTriggerContext createTrigger() {
			return getRuleContext(CreateTriggerContext.class,0);
		}
		public CreateTypeContext createType() {
			return getRuleContext(CreateTypeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public DropAggregateContext dropAggregate() {
			return getRuleContext(DropAggregateContext.class,0);
		}
		public DropFunctionContext dropFunction() {
			return getRuleContext(DropFunctionContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public DropKeyspaceContext dropKeyspace() {
			return getRuleContext(DropKeyspaceContext.class,0);
		}
		public DropMaterializedViewContext dropMaterializedView() {
			return getRuleContext(DropMaterializedViewContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public DropTriggerContext dropTrigger() {
			return getRuleContext(DropTriggerContext.class,0);
		}
		public DropTypeContext dropType() {
			return getRuleContext(DropTypeContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public ListPermissionsContext listPermissions() {
			return getRuleContext(ListPermissionsContext.class,0);
		}
		public ListRolesContext listRoles() {
			return getRuleContext(ListRolesContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TruncateContext truncate() {
			return getRuleContext(TruncateContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public CqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cql; }
	}

	public final CqlContext cql() throws RecognitionException {
		CqlContext _localctx = new CqlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cql);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				alterKeyspace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				alterMaterializedView();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				alterRole();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				alterTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				alterType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(609);
				alterUser();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				applyBatch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(611);
				createAggregate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(612);
				createFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(613);
				createIndex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(614);
				createKeyspace();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(615);
				createMaterializedView();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(616);
				createRole();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(617);
				createTable();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(618);
				createTrigger();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(619);
				createType();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(620);
				createUser();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(621);
				deleteStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(622);
				dropAggregate();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(623);
				dropFunction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(624);
				dropIndex();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(625);
				dropKeyspace();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(626);
				dropMaterializedView();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(627);
				dropRole();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(628);
				dropTable();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(629);
				dropTrigger();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(630);
				dropType();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(631);
				dropUser();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(632);
				grant();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(633);
				insert();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(634);
				listPermissions();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(635);
				listRoles();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(636);
				revoke();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(637);
				select();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(638);
				truncate();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(639);
				update();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(640);
				use();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeContext extends ParserRuleContext {
		public KwRevokeContext kwRevoke() {
			return getRuleContext(KwRevokeContext.class,0);
		}
		public PriviledgeContext priviledge() {
			return getRuleContext(PriviledgeContext.class,0);
		}
		public KwOnContext kwOn() {
			return getRuleContext(KwOnContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public KwFromContext kwFrom() {
			return getRuleContext(KwFromContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			kwRevoke();
			setState(644);
			priviledge();
			setState(645);
			kwOn();
			setState(646);
			resource();
			setState(647);
			kwFrom();
			setState(648);
			role();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListUsersContext extends ParserRuleContext {
		public KwListContext kwList() {
			return getRuleContext(KwListContext.class,0);
		}
		public KwUsersContext kwUsers() {
			return getRuleContext(KwUsersContext.class,0);
		}
		public ListUsersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listUsers; }
	}

	public final ListUsersContext listUsers() throws RecognitionException {
		ListUsersContext _localctx = new ListUsersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listUsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			kwList();
			setState(651);
			kwUsers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListRolesContext extends ParserRuleContext {
		public KwListContext kwList() {
			return getRuleContext(KwListContext.class,0);
		}
		public KwRolesContext kwRoles() {
			return getRuleContext(KwRolesContext.class,0);
		}
		public KwOfContext kwOf() {
			return getRuleContext(KwOfContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public KwNorecursiveContext kwNorecursive() {
			return getRuleContext(KwNorecursiveContext.class,0);
		}
		public ListRolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRoles; }
	}

	public final ListRolesContext listRoles() throws RecognitionException {
		ListRolesContext _localctx = new ListRolesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listRoles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			kwList();
			setState(654);
			kwRoles();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(655);
				kwOf();
				setState(656);
				role();
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NORECURSIVE) {
				{
				setState(660);
				kwNorecursive();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListPermissionsContext extends ParserRuleContext {
		public KwListContext kwList() {
			return getRuleContext(KwListContext.class,0);
		}
		public PriviledgeContext priviledge() {
			return getRuleContext(PriviledgeContext.class,0);
		}
		public KwOnContext kwOn() {
			return getRuleContext(KwOnContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public KwOfContext kwOf() {
			return getRuleContext(KwOfContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public ListPermissionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPermissions; }
	}

	public final ListPermissionsContext listPermissions() throws RecognitionException {
		ListPermissionsContext _localctx = new ListPermissionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listPermissions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			kwList();
			setState(664);
			priviledge();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(665);
				kwOn();
				setState(666);
				resource();
				}
			}

			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(670);
				kwOf();
				setState(671);
				role();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantContext extends ParserRuleContext {
		public KwGrantContext kwGrant() {
			return getRuleContext(KwGrantContext.class,0);
		}
		public PriviledgeContext priviledge() {
			return getRuleContext(PriviledgeContext.class,0);
		}
		public KwOnContext kwOn() {
			return getRuleContext(KwOnContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public KwToContext kwTo() {
			return getRuleContext(KwToContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			kwGrant();
			setState(676);
			priviledge();
			setState(677);
			kwOn();
			setState(678);
			resource();
			setState(679);
			kwTo();
			setState(680);
			role();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PriviledgeContext extends ParserRuleContext {
		public KwAllContext kwAll() {
			return getRuleContext(KwAllContext.class,0);
		}
		public KwAllPermissionsContext kwAllPermissions() {
			return getRuleContext(KwAllPermissionsContext.class,0);
		}
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwAuthorizeContext kwAuthorize() {
			return getRuleContext(KwAuthorizeContext.class,0);
		}
		public KwDescibeContext kwDescibe() {
			return getRuleContext(KwDescibeContext.class,0);
		}
		public KwExecuteContext kwExecute() {
			return getRuleContext(KwExecuteContext.class,0);
		}
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwModifyContext kwModify() {
			return getRuleContext(KwModifyContext.class,0);
		}
		public KwSelectContext kwSelect() {
			return getRuleContext(KwSelectContext.class,0);
		}
		public PriviledgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priviledge; }
	}

	public final PriviledgeContext priviledge() throws RecognitionException {
		PriviledgeContext _localctx = new PriviledgeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_priviledge);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(682);
					kwAll();
					}
					break;
				case 2:
					{
					setState(683);
					kwAllPermissions();
					}
					break;
				}
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				kwAlter();
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				kwAuthorize();
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				kwDescibe();
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
				kwExecute();
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(690);
				kwCreate();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(691);
				kwDrop();
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 8);
				{
				setState(692);
				kwModify();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(693);
				kwSelect();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public KwAllContext kwAll() {
			return getRuleContext(KwAllContext.class,0);
		}
		public KwFunctionsContext kwFunctions() {
			return getRuleContext(KwFunctionsContext.class,0);
		}
		public KwInContext kwIn() {
			return getRuleContext(KwInContext.class,0);
		}
		public KwKeyspaceContext kwKeyspace() {
			return getRuleContext(KwKeyspaceContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public KwFunctionContext kwFunction() {
			return getRuleContext(KwFunctionContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public KwKeyspacesContext kwKeyspaces() {
			return getRuleContext(KwKeyspacesContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public KwTableContext kwTable() {
			return getRuleContext(KwTableContext.class,0);
		}
		public KwRolesContext kwRoles() {
			return getRuleContext(KwRolesContext.class,0);
		}
		public KwRoleContext kwRole() {
			return getRuleContext(KwRoleContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public KwSchemeContext kwScheme() {
			return getRuleContext(KwSchemeContext.class,0);
		}
		public KwInternalContext kwInternal() {
			return getRuleContext(KwInternalContext.class,0);
		}
		public KwLdapContext kwLdap() {
			return getRuleContext(KwLdapContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resource);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				kwAll();
				setState(697);
				kwFunctions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				kwAll();
				setState(700);
				kwFunctions();
				setState(701);
				kwIn();
				setState(702);
				kwKeyspace();
				setState(703);
				keyspace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				kwFunction();
				setState(709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(706);
					keyspace();
					setState(707);
					match(DOT);
					}
					break;
				}
				setState(711);
				functionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				kwAll();
				setState(714);
				kwKeyspaces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				kwKeyspace();
				setState(717);
				keyspace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(719);
					kwTable();
					}
					break;
				}
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(722);
					keyspace();
					setState(723);
					match(DOT);
					}
					break;
				}
				setState(727);
				table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(728);
				kwAll();
				setState(729);
				kwRoles();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(731);
				kwRole();
				setState(732);
				role();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(736);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INTERNAL:
					{
					setState(734);
					kwInternal();
					}
					break;
				case K_LDAP:
					{
					setState(735);
					kwLdap();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(738);
				kwScheme();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateUserContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwUserContext kwUser() {
			return getRuleContext(KwUserContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public KwPasswordContext kwPassword() {
			return getRuleContext(KwPasswordContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KwSuperuserContext kwSuperuser() {
			return getRuleContext(KwSuperuserContext.class,0);
		}
		public KwNosuperuserContext kwNosuperuser() {
			return getRuleContext(KwNosuperuserContext.class,0);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			kwCreate();
			setState(743);
			kwUser();
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(744);
				ifNotExist();
				}
				break;
			}
			setState(747);
			user();
			setState(748);
			kwWith();
			setState(749);
			kwPassword();
			setState(750);
			stringLiteral();
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				{
				setState(751);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				{
				setState(752);
				kwNosuperuser();
				}
				break;
			case EOF:
			case SEMI:
			case MINUSMINUS:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwRoleContext kwRole() {
			return getRuleContext(KwRoleContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public RoleWithContext roleWith() {
			return getRuleContext(RoleWithContext.class,0);
		}
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			kwCreate();
			setState(756);
			kwRole();
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(757);
				ifNotExist();
				}
				break;
			}
			setState(760);
			role();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(761);
				roleWith();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTypeContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwTypeContext kwType() {
			return getRuleContext(KwTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public TypeMemberColumnListContext typeMemberColumnList() {
			return getRuleContext(TypeMemberColumnListContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public CreateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createType; }
	}

	public final CreateTypeContext createType() throws RecognitionException {
		CreateTypeContext _localctx = new CreateTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			kwCreate();
			setState(765);
			kwType();
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(766);
				ifNotExist();
				}
				break;
			}
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(769);
				keyspace();
				setState(770);
				match(DOT);
				}
				break;
			}
			setState(774);
			type();
			setState(775);
			syntaxBracketLr();
			setState(776);
			typeMemberColumnList();
			setState(777);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMemberColumnListContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public TypeMemberColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMemberColumnList; }
	}

	public final TypeMemberColumnListContext typeMemberColumnList() throws RecognitionException {
		TypeMemberColumnListContext _localctx = new TypeMemberColumnListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeMemberColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			column();
			setState(780);
			dataType();
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(781);
				syntaxComma();
				setState(782);
				column();
				setState(783);
				dataType();
				}
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTriggerContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwTriggerContext kwTrigger() {
			return getRuleContext(KwTriggerContext.class,0);
		}
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public KwUsingContext kwUsing() {
			return getRuleContext(KwUsingContext.class,0);
		}
		public TriggerClassContext triggerClass() {
			return getRuleContext(TriggerClassContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public CreateTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTrigger; }
	}

	public final CreateTriggerContext createTrigger() throws RecognitionException {
		CreateTriggerContext _localctx = new CreateTriggerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_createTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			kwCreate();
			setState(791);
			kwTrigger();
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(792);
				ifNotExist();
				}
				break;
			}
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(795);
				keyspace();
				setState(796);
				match(DOT);
				}
				break;
			}
			setState(800);
			trigger();
			setState(801);
			kwUsing();
			setState(802);
			triggerClass();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateMaterializedViewContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwMaterializedContext kwMaterialized() {
			return getRuleContext(KwMaterializedContext.class,0);
		}
		public KwViewContext kwView() {
			return getRuleContext(KwViewContext.class,0);
		}
		public MaterializedViewContext materializedView() {
			return getRuleContext(MaterializedViewContext.class,0);
		}
		public KwAsContext kwAs() {
			return getRuleContext(KwAsContext.class,0);
		}
		public KwSelectContext kwSelect() {
			return getRuleContext(KwSelectContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public KwFromContext kwFrom() {
			return getRuleContext(KwFromContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public MaterializedViewWhereContext materializedViewWhere() {
			return getRuleContext(MaterializedViewWhereContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public List<KeyspaceContext> keyspace() {
			return getRuleContexts(KeyspaceContext.class);
		}
		public KeyspaceContext keyspace(int i) {
			return getRuleContext(KeyspaceContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CqlParser.DOT, i);
		}
		public PrimaryKeyElementContext primaryKeyElement() {
			return getRuleContext(PrimaryKeyElementContext.class,0);
		}
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public MaterializedViewOptionsContext materializedViewOptions() {
			return getRuleContext(MaterializedViewOptionsContext.class,0);
		}
		public CreateMaterializedViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMaterializedView; }
	}

	public final CreateMaterializedViewContext createMaterializedView() throws RecognitionException {
		CreateMaterializedViewContext _localctx = new CreateMaterializedViewContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_createMaterializedView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			kwCreate();
			setState(805);
			kwMaterialized();
			setState(806);
			kwView();
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(807);
				ifNotExist();
				}
				break;
			}
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(810);
				keyspace();
				setState(811);
				match(DOT);
				}
				break;
			}
			setState(815);
			materializedView();
			setState(816);
			kwAs();
			setState(817);
			kwSelect();
			setState(818);
			columnList();
			setState(819);
			kwFrom();
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(820);
				keyspace();
				setState(821);
				match(DOT);
				}
				break;
			}
			setState(825);
			table();
			setState(826);
			materializedViewWhere();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(827);
				primaryKeyElement();
				}
			}

			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(830);
				kwWith();
				setState(831);
				materializedViewOptions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterializedViewWhereContext extends ParserRuleContext {
		public KwWhereContext kwWhere() {
			return getRuleContext(KwWhereContext.class,0);
		}
		public ColumnNotNullListContext columnNotNullList() {
			return getRuleContext(ColumnNotNullListContext.class,0);
		}
		public KwAndContext kwAnd() {
			return getRuleContext(KwAndContext.class,0);
		}
		public RelationElementsContext relationElements() {
			return getRuleContext(RelationElementsContext.class,0);
		}
		public MaterializedViewWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materializedViewWhere; }
	}

	public final MaterializedViewWhereContext materializedViewWhere() throws RecognitionException {
		MaterializedViewWhereContext _localctx = new MaterializedViewWhereContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_materializedViewWhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			kwWhere();
			setState(836);
			columnNotNullList();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(837);
				kwAnd();
				setState(838);
				relationElements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNotNullListContext extends ParserRuleContext {
		public List<ColumnNotNullContext> columnNotNull() {
			return getRuleContexts(ColumnNotNullContext.class);
		}
		public ColumnNotNullContext columnNotNull(int i) {
			return getRuleContext(ColumnNotNullContext.class,i);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public ColumnNotNullListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNotNullList; }
	}

	public final ColumnNotNullListContext columnNotNullList() throws RecognitionException {
		ColumnNotNullListContext _localctx = new ColumnNotNullListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnNotNullList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			columnNotNull();
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(843);
					kwAnd();
					setState(844);
					columnNotNull();
					}
					} 
				}
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNotNullContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public KwIsContext kwIs() {
			return getRuleContext(KwIsContext.class,0);
		}
		public KwNotContext kwNot() {
			return getRuleContext(KwNotContext.class,0);
		}
		public KwNullContext kwNull() {
			return getRuleContext(KwNullContext.class,0);
		}
		public ColumnNotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNotNull; }
	}

	public final ColumnNotNullContext columnNotNull() throws RecognitionException {
		ColumnNotNullContext _localctx = new ColumnNotNullContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_columnNotNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			column();
			setState(852);
			kwIs();
			setState(853);
			kwNot();
			setState(854);
			kwNull();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterializedViewOptionsContext extends ParserRuleContext {
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public MaterializedViewOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materializedViewOptions; }
	}

	public final MaterializedViewOptionsContext materializedViewOptions() throws RecognitionException {
		MaterializedViewOptionsContext _localctx = new MaterializedViewOptionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_materializedViewOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			tableOptions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateKeyspaceContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwKeyspaceContext kwKeyspace() {
			return getRuleContext(KwKeyspaceContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public KwReplicationContext kwReplication() {
			return getRuleContext(KwReplicationContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public ReplicationListContext replicationList() {
			return getRuleContext(ReplicationListContext.class,0);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KwAndContext kwAnd() {
			return getRuleContext(KwAndContext.class,0);
		}
		public DurableWritesContext durableWrites() {
			return getRuleContext(DurableWritesContext.class,0);
		}
		public CreateKeyspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createKeyspace; }
	}

	public final CreateKeyspaceContext createKeyspace() throws RecognitionException {
		CreateKeyspaceContext _localctx = new CreateKeyspaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_createKeyspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			kwCreate();
			setState(859);
			kwKeyspace();
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(860);
				ifNotExist();
				}
				break;
			}
			setState(863);
			keyspace();
			setState(864);
			kwWith();
			setState(865);
			kwReplication();
			setState(866);
			match(OPERATOR_EQ);
			setState(867);
			syntaxBracketLc();
			setState(868);
			replicationList();
			setState(869);
			syntaxBracketRc();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(870);
				kwAnd();
				setState(871);
				durableWrites();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFunctionContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwFunctionContext kwFunction() {
			return getRuleContext(KwFunctionContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public ReturnModeContext returnMode() {
			return getRuleContext(ReturnModeContext.class,0);
		}
		public KwReturnsContext kwReturns() {
			return getRuleContext(KwReturnsContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public KwLanguageContext kwLanguage() {
			return getRuleContext(KwLanguageContext.class,0);
		}
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public KwAsContext kwAs() {
			return getRuleContext(KwAsContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public OrReplaceContext orReplace() {
			return getRuleContext(OrReplaceContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			kwCreate();
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(876);
				orReplace();
				}
			}

			setState(879);
			kwFunction();
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(880);
				ifNotExist();
				}
				break;
			}
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(883);
				keyspace();
				setState(884);
				match(DOT);
				}
				break;
			}
			setState(888);
			functionStatement();
			setState(889);
			syntaxBracketLr();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TRUE - 128)) | (1L << (K_TRUNCATE - 128)) | (1L << (K_TTL - 128)) | (1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (K_USERS - 128)))) != 0)) {
				{
				setState(890);
				paramList();
				}
			}

			setState(893);
			syntaxBracketRr();
			setState(894);
			returnMode();
			setState(895);
			kwReturns();
			setState(896);
			dataType();
			setState(897);
			kwLanguage();
			setState(898);
			language();
			setState(899);
			kwAs();
			setState(900);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode CODE_BLOCK() { return getToken(CqlParser.CODE_BLOCK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CqlParser.STRING_LITERAL, 0); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !(_la==CODE_BLOCK || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			param();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(905);
				syntaxComma();
				setState(906);
				param();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnModeContext extends ParserRuleContext {
		public KwOnContext kwOn() {
			return getRuleContext(KwOnContext.class,0);
		}
		public List<KwNullContext> kwNull() {
			return getRuleContexts(KwNullContext.class);
		}
		public KwNullContext kwNull(int i) {
			return getRuleContext(KwNullContext.class,i);
		}
		public KwInputContext kwInput() {
			return getRuleContext(KwInputContext.class,0);
		}
		public KwCalledContext kwCalled() {
			return getRuleContext(KwCalledContext.class,0);
		}
		public KwReturnsContext kwReturns() {
			return getRuleContext(KwReturnsContext.class,0);
		}
		public ReturnModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnMode; }
	}

	public final ReturnModeContext returnMode() throws RecognitionException {
		ReturnModeContext _localctx = new ReturnModeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CALLED:
				{
				setState(913);
				kwCalled();
				}
				break;
			case K_RETURNS:
				{
				setState(914);
				kwReturns();
				setState(915);
				kwNull();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(919);
			kwOn();
			setState(920);
			kwNull();
			setState(921);
			kwInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateAggregateContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwAggregateContext kwAggregate() {
			return getRuleContext(KwAggregateContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public KwSfuncContext kwSfunc() {
			return getRuleContext(KwSfuncContext.class,0);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public KwStypeContext kwStype() {
			return getRuleContext(KwStypeContext.class,0);
		}
		public KwFinalfuncContext kwFinalfunc() {
			return getRuleContext(KwFinalfuncContext.class,0);
		}
		public KwInitcondContext kwInitcond() {
			return getRuleContext(KwInitcondContext.class,0);
		}
		public InitCondDefinitionContext initCondDefinition() {
			return getRuleContext(InitCondDefinitionContext.class,0);
		}
		public OrReplaceContext orReplace() {
			return getRuleContext(OrReplaceContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public CreateAggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAggregate; }
	}

	public final CreateAggregateContext createAggregate() throws RecognitionException {
		CreateAggregateContext _localctx = new CreateAggregateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createAggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			kwCreate();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(924);
				orReplace();
				}
			}

			setState(927);
			kwAggregate();
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(928);
				ifNotExist();
				}
				break;
			}
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(931);
				keyspace();
				setState(932);
				match(DOT);
				}
				break;
			}
			setState(936);
			aggregate();
			setState(937);
			syntaxBracketLr();
			setState(938);
			dataType();
			setState(939);
			syntaxBracketRr();
			setState(940);
			kwSfunc();
			setState(941);
			functionStatement();
			setState(942);
			kwStype();
			setState(943);
			dataType();
			setState(944);
			kwFinalfunc();
			setState(945);
			functionStatement();
			setState(946);
			kwInitcond();
			setState(947);
			initCondDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitCondDefinitionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public InitCondListContext initCondList() {
			return getRuleContext(InitCondListContext.class,0);
		}
		public InitCondListNestedContext initCondListNested() {
			return getRuleContext(InitCondListNestedContext.class,0);
		}
		public InitCondHashContext initCondHash() {
			return getRuleContext(InitCondHashContext.class,0);
		}
		public InitCondDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initCondDefinition; }
	}

	public final InitCondDefinitionContext initCondDefinition() throws RecognitionException {
		InitCondDefinitionContext _localctx = new InitCondDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initCondDefinition);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				initCondList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				initCondListNested();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				initCondHash();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitCondHashContext extends ParserRuleContext {
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public List<InitCondHashItemContext> initCondHashItem() {
			return getRuleContexts(InitCondHashItemContext.class);
		}
		public InitCondHashItemContext initCondHashItem(int i) {
			return getRuleContext(InitCondHashItemContext.class,i);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public InitCondHashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initCondHash; }
	}

	public final InitCondHashContext initCondHash() throws RecognitionException {
		InitCondHashContext _localctx = new InitCondHashContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initCondHash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			syntaxBracketLc();
			setState(956);
			initCondHashItem();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(957);
				syntaxComma();
				setState(958);
				initCondHashItem();
				}
				}
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(965);
			syntaxBracketRc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitCondHashItemContext extends ParserRuleContext {
		public HashKeyContext hashKey() {
			return getRuleContext(HashKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CqlParser.COLON, 0); }
		public InitCondDefinitionContext initCondDefinition() {
			return getRuleContext(InitCondDefinitionContext.class,0);
		}
		public InitCondHashItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initCondHashItem; }
	}

	public final InitCondHashItemContext initCondHashItem() throws RecognitionException {
		InitCondHashItemContext _localctx = new InitCondHashItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initCondHashItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			hashKey();
			setState(968);
			match(COLON);
			setState(969);
			initCondDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitCondListNestedContext extends ParserRuleContext {
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public List<InitCondListContext> initCondList() {
			return getRuleContexts(InitCondListContext.class);
		}
		public InitCondListContext initCondList(int i) {
			return getRuleContext(InitCondListContext.class,i);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public InitCondListNestedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initCondListNested; }
	}

	public final InitCondListNestedContext initCondListNested() throws RecognitionException {
		InitCondListNestedContext _localctx = new InitCondListNestedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_initCondListNested);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			syntaxBracketLr();
			setState(972);
			initCondList();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LR_BRACKET || _la==COMMA) {
				{
				setState(977);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(973);
					syntaxComma();
					setState(974);
					constant();
					}
					break;
				case LR_BRACKET:
					{
					setState(976);
					initCondList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitCondListContext extends ParserRuleContext {
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public InitCondListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initCondList; }
	}

	public final InitCondListContext initCondList() throws RecognitionException {
		InitCondListContext _localctx = new InitCondListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_initCondList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			syntaxBracketLr();
			setState(985);
			constant();
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(986);
				syntaxComma();
				setState(987);
				constant();
				}
				}
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(994);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrReplaceContext extends ParserRuleContext {
		public KwOrContext kwOr() {
			return getRuleContext(KwOrContext.class,0);
		}
		public KwReplaceContext kwReplace() {
			return getRuleContext(KwReplaceContext.class,0);
		}
		public OrReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orReplace; }
	}

	public final OrReplaceContext orReplace() throws RecognitionException {
		OrReplaceContext _localctx = new OrReplaceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_orReplace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			kwOr();
			setState(997);
			kwReplace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwUserContext kwUser() {
			return getRuleContext(KwUserContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public UserPasswordContext userPassword() {
			return getRuleContext(UserPasswordContext.class,0);
		}
		public UserSuperUserContext userSuperUser() {
			return getRuleContext(UserSuperUserContext.class,0);
		}
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alterUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			kwAlter();
			setState(1000);
			kwUser();
			setState(1001);
			user();
			setState(1002);
			kwWith();
			setState(1003);
			userPassword();
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOSUPERUSER || _la==K_SUPERUSER) {
				{
				setState(1004);
				userSuperUser();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserPasswordContext extends ParserRuleContext {
		public KwPasswordContext kwPassword() {
			return getRuleContext(KwPasswordContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public UserPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userPassword; }
	}

	public final UserPasswordContext userPassword() throws RecognitionException {
		UserPasswordContext _localctx = new UserPasswordContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_userPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			kwPassword();
			setState(1008);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserSuperUserContext extends ParserRuleContext {
		public KwSuperuserContext kwSuperuser() {
			return getRuleContext(KwSuperuserContext.class,0);
		}
		public KwNosuperuserContext kwNosuperuser() {
			return getRuleContext(KwNosuperuserContext.class,0);
		}
		public UserSuperUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userSuperUser; }
	}

	public final UserSuperUserContext userSuperUser() throws RecognitionException {
		UserSuperUserContext _localctx = new UserSuperUserContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_userSuperUser);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				kwNosuperuser();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwTypeContext kwType() {
			return getRuleContext(KwTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AlterTypeOperationContext alterTypeOperation() {
			return getRuleContext(AlterTypeOperationContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public AlterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterType; }
	}

	public final AlterTypeContext alterType() throws RecognitionException {
		AlterTypeContext _localctx = new AlterTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			kwAlter();
			setState(1015);
			kwType();
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(1016);
				keyspace();
				setState(1017);
				match(DOT);
				}
				break;
			}
			setState(1021);
			type();
			setState(1022);
			alterTypeOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeOperationContext extends ParserRuleContext {
		public AlterTypeAlterTypeContext alterTypeAlterType() {
			return getRuleContext(AlterTypeAlterTypeContext.class,0);
		}
		public AlterTypeAddContext alterTypeAdd() {
			return getRuleContext(AlterTypeAddContext.class,0);
		}
		public AlterTypeRenameContext alterTypeRename() {
			return getRuleContext(AlterTypeRenameContext.class,0);
		}
		public AlterTypeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTypeOperation; }
	}

	public final AlterTypeOperationContext alterTypeOperation() throws RecognitionException {
		AlterTypeOperationContext _localctx = new AlterTypeOperationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alterTypeOperation);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				alterTypeAlterType();
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				alterTypeAdd();
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				alterTypeRename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeRenameContext extends ParserRuleContext {
		public KwRenameContext kwRename() {
			return getRuleContext(KwRenameContext.class,0);
		}
		public AlterTypeRenameListContext alterTypeRenameList() {
			return getRuleContext(AlterTypeRenameListContext.class,0);
		}
		public AlterTypeRenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTypeRename; }
	}

	public final AlterTypeRenameContext alterTypeRename() throws RecognitionException {
		AlterTypeRenameContext _localctx = new AlterTypeRenameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alterTypeRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			kwRename();
			setState(1030);
			alterTypeRenameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeRenameListContext extends ParserRuleContext {
		public List<AlterTypeRenameItemContext> alterTypeRenameItem() {
			return getRuleContexts(AlterTypeRenameItemContext.class);
		}
		public AlterTypeRenameItemContext alterTypeRenameItem(int i) {
			return getRuleContext(AlterTypeRenameItemContext.class,i);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public AlterTypeRenameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTypeRenameList; }
	}

	public final AlterTypeRenameListContext alterTypeRenameList() throws RecognitionException {
		AlterTypeRenameListContext _localctx = new AlterTypeRenameListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alterTypeRenameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			alterTypeRenameItem();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1033);
				kwAnd();
				setState(1034);
				alterTypeRenameItem();
				}
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeRenameItemContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public KwToContext kwTo() {
			return getRuleContext(KwToContext.class,0);
		}
		public AlterTypeRenameItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTypeRenameItem; }
	}

	public final AlterTypeRenameItemContext alterTypeRenameItem() throws RecognitionException {
		AlterTypeRenameItemContext _localctx = new AlterTypeRenameItemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alterTypeRenameItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			column();
			setState(1042);
			kwTo();
			setState(1043);
			column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeAddContext extends ParserRuleContext {
		public KwAddContext kwAdd() {
			return getRuleContext(KwAddContext.class,0);
		}
		public TypeMemberColumnListContext typeMemberColumnList() {
			return getRuleContext(TypeMemberColumnListContext.class,0);
		}
		public AlterTypeAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTypeAdd; }
	}

	public final AlterTypeAddContext alterTypeAdd() throws RecognitionException {
		AlterTypeAddContext _localctx = new AlterTypeAddContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alterTypeAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			kwAdd();
			setState(1046);
			typeMemberColumnList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTypeAlterTypeContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public KwTypeContext kwType() {
			return getRuleContext(KwTypeContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AlterTypeAlterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTypeAlterType; }
	}

	public final AlterTypeAlterTypeContext alterTypeAlterType() throws RecognitionException {
		AlterTypeAlterTypeContext _localctx = new AlterTypeAlterTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_alterTypeAlterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			kwAlter();
			setState(1049);
			column();
			setState(1050);
			kwType();
			setState(1051);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwTableContext kwTable() {
			return getRuleContext(KwTableContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public AlterTableOperationContext alterTableOperation() {
			return getRuleContext(AlterTableOperationContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			kwAlter();
			setState(1054);
			kwTable();
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(1055);
				keyspace();
				setState(1056);
				match(DOT);
				}
				break;
			}
			setState(1060);
			table();
			setState(1061);
			alterTableOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableOperationContext extends ParserRuleContext {
		public AlterTableAddContext alterTableAdd() {
			return getRuleContext(AlterTableAddContext.class,0);
		}
		public AlterTableDropColumnsContext alterTableDropColumns() {
			return getRuleContext(AlterTableDropColumnsContext.class,0);
		}
		public AlterTableDropCompactStorageContext alterTableDropCompactStorage() {
			return getRuleContext(AlterTableDropCompactStorageContext.class,0);
		}
		public AlterTableRenameContext alterTableRename() {
			return getRuleContext(AlterTableRenameContext.class,0);
		}
		public AlterTableWithContext alterTableWith() {
			return getRuleContext(AlterTableWithContext.class,0);
		}
		public AlterTableOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOperation; }
	}

	public final AlterTableOperationContext alterTableOperation() throws RecognitionException {
		AlterTableOperationContext _localctx = new AlterTableOperationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alterTableOperation);
		try {
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				alterTableAdd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				alterTableDropColumns();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				alterTableDropColumns();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				alterTableDropCompactStorage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1067);
				alterTableRename();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1068);
				alterTableWith();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableWithContext extends ParserRuleContext {
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public AlterTableWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableWith; }
	}

	public final AlterTableWithContext alterTableWith() throws RecognitionException {
		AlterTableWithContext _localctx = new AlterTableWithContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alterTableWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			kwWith();
			setState(1072);
			tableOptions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableRenameContext extends ParserRuleContext {
		public KwRenameContext kwRename() {
			return getRuleContext(KwRenameContext.class,0);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public KwToContext kwTo() {
			return getRuleContext(KwToContext.class,0);
		}
		public AlterTableRenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableRename; }
	}

	public final AlterTableRenameContext alterTableRename() throws RecognitionException {
		AlterTableRenameContext _localctx = new AlterTableRenameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alterTableRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			kwRename();
			setState(1075);
			column();
			setState(1076);
			kwTo();
			setState(1077);
			column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableDropCompactStorageContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwCompactContext kwCompact() {
			return getRuleContext(KwCompactContext.class,0);
		}
		public KwStorageContext kwStorage() {
			return getRuleContext(KwStorageContext.class,0);
		}
		public AlterTableDropCompactStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropCompactStorage; }
	}

	public final AlterTableDropCompactStorageContext alterTableDropCompactStorage() throws RecognitionException {
		AlterTableDropCompactStorageContext _localctx = new AlterTableDropCompactStorageContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alterTableDropCompactStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			kwDrop();
			setState(1080);
			kwCompact();
			setState(1081);
			kwStorage();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableDropColumnsContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public AlterTableDropColumnListContext alterTableDropColumnList() {
			return getRuleContext(AlterTableDropColumnListContext.class,0);
		}
		public AlterTableDropColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropColumns; }
	}

	public final AlterTableDropColumnsContext alterTableDropColumns() throws RecognitionException {
		AlterTableDropColumnsContext _localctx = new AlterTableDropColumnsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alterTableDropColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			kwDrop();
			setState(1084);
			alterTableDropColumnList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableDropColumnListContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public AlterTableDropColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropColumnList; }
	}

	public final AlterTableDropColumnListContext alterTableDropColumnList() throws RecognitionException {
		AlterTableDropColumnListContext _localctx = new AlterTableDropColumnListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alterTableDropColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			column();
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1087);
				syntaxComma();
				setState(1088);
				column();
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableAddContext extends ParserRuleContext {
		public KwAddContext kwAdd() {
			return getRuleContext(KwAddContext.class,0);
		}
		public AlterTableColumnDefinitionContext alterTableColumnDefinition() {
			return getRuleContext(AlterTableColumnDefinitionContext.class,0);
		}
		public AlterTableAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAdd; }
	}

	public final AlterTableAddContext alterTableAdd() throws RecognitionException {
		AlterTableAddContext _localctx = new AlterTableAddContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_alterTableAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			kwAdd();
			setState(1096);
			alterTableColumnDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableColumnDefinitionContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public AlterTableColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableColumnDefinition; }
	}

	public final AlterTableColumnDefinitionContext alterTableColumnDefinition() throws RecognitionException {
		AlterTableColumnDefinitionContext _localctx = new AlterTableColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_alterTableColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			column();
			setState(1099);
			dataType();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1100);
				syntaxComma();
				setState(1101);
				column();
				setState(1102);
				dataType();
				}
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoleContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwRoleContext kwRole() {
			return getRuleContext(KwRoleContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public RoleWithContext roleWith() {
			return getRuleContext(RoleWithContext.class,0);
		}
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_alterRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			kwAlter();
			setState(1110);
			kwRole();
			setState(1111);
			role();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1112);
				roleWith();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleWithContext extends ParserRuleContext {
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public List<RoleWithOptionsContext> roleWithOptions() {
			return getRuleContexts(RoleWithOptionsContext.class);
		}
		public RoleWithOptionsContext roleWithOptions(int i) {
			return getRuleContext(RoleWithOptionsContext.class,i);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public RoleWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleWith; }
	}

	public final RoleWithContext roleWith() throws RecognitionException {
		RoleWithContext _localctx = new RoleWithContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_roleWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			kwWith();
			{
			setState(1116);
			roleWithOptions();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1117);
				kwAnd();
				setState(1118);
				roleWithOptions();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleWithOptionsContext extends ParserRuleContext {
		public KwPasswordContext kwPassword() {
			return getRuleContext(KwPasswordContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public KwLoginContext kwLogin() {
			return getRuleContext(KwLoginContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public KwSuperuserContext kwSuperuser() {
			return getRuleContext(KwSuperuserContext.class,0);
		}
		public KwOptionsContext kwOptions() {
			return getRuleContext(KwOptionsContext.class,0);
		}
		public OptionHashContext optionHash() {
			return getRuleContext(OptionHashContext.class,0);
		}
		public RoleWithOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleWithOptions; }
	}

	public final RoleWithOptionsContext roleWithOptions() throws RecognitionException {
		RoleWithOptionsContext _localctx = new RoleWithOptionsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_roleWithOptions);
		try {
			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PASSWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				kwPassword();
				setState(1126);
				match(OPERATOR_EQ);
				setState(1127);
				stringLiteral();
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				kwLogin();
				setState(1130);
				match(OPERATOR_EQ);
				setState(1131);
				booleanLiteral();
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				kwSuperuser();
				setState(1134);
				match(OPERATOR_EQ);
				setState(1135);
				booleanLiteral();
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1137);
				kwOptions();
				setState(1138);
				match(OPERATOR_EQ);
				setState(1139);
				optionHash();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterMaterializedViewContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwMaterializedContext kwMaterialized() {
			return getRuleContext(KwMaterializedContext.class,0);
		}
		public KwViewContext kwView() {
			return getRuleContext(KwViewContext.class,0);
		}
		public MaterializedViewContext materializedView() {
			return getRuleContext(MaterializedViewContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public AlterMaterializedViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterMaterializedView; }
	}

	public final AlterMaterializedViewContext alterMaterializedView() throws RecognitionException {
		AlterMaterializedViewContext _localctx = new AlterMaterializedViewContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_alterMaterializedView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			kwAlter();
			setState(1144);
			kwMaterialized();
			setState(1145);
			kwView();
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(1146);
				keyspace();
				setState(1147);
				match(DOT);
				}
				break;
			}
			setState(1151);
			materializedView();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1152);
				kwWith();
				setState(1153);
				tableOptions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwUserContext kwUser() {
			return getRuleContext(KwUserContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			kwDrop();
			setState(1158);
			kwUser();
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1159);
				ifExist();
				}
				break;
			}
			setState(1162);
			user();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTypeContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwTypeContext kwType() {
			return getRuleContext(KwTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropType; }
	}

	public final DropTypeContext dropType() throws RecognitionException {
		DropTypeContext _localctx = new DropTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_dropType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			kwDrop();
			setState(1165);
			kwType();
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1166);
				ifExist();
				}
				break;
			}
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1169);
				keyspace();
				setState(1170);
				match(DOT);
				}
				break;
			}
			setState(1174);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropMaterializedViewContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwMaterializedContext kwMaterialized() {
			return getRuleContext(KwMaterializedContext.class,0);
		}
		public KwViewContext kwView() {
			return getRuleContext(KwViewContext.class,0);
		}
		public MaterializedViewContext materializedView() {
			return getRuleContext(MaterializedViewContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropMaterializedViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropMaterializedView; }
	}

	public final DropMaterializedViewContext dropMaterializedView() throws RecognitionException {
		DropMaterializedViewContext _localctx = new DropMaterializedViewContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dropMaterializedView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			kwDrop();
			setState(1177);
			kwMaterialized();
			setState(1178);
			kwView();
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(1179);
				ifExist();
				}
				break;
			}
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1182);
				keyspace();
				setState(1183);
				match(DOT);
				}
				break;
			}
			setState(1187);
			materializedView();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropAggregateContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwAggregateContext kwAggregate() {
			return getRuleContext(KwAggregateContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropAggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropAggregate; }
	}

	public final DropAggregateContext dropAggregate() throws RecognitionException {
		DropAggregateContext _localctx = new DropAggregateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dropAggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			kwDrop();
			setState(1190);
			kwAggregate();
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1191);
				ifExist();
				}
				break;
			}
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1194);
				keyspace();
				setState(1195);
				match(DOT);
				}
				break;
			}
			setState(1199);
			aggregate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropFunctionContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwFunctionContext kwFunction() {
			return getRuleContext(KwFunctionContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropFunction; }
	}

	public final DropFunctionContext dropFunction() throws RecognitionException {
		DropFunctionContext _localctx = new DropFunctionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dropFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			kwDrop();
			setState(1202);
			kwFunction();
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(1203);
				ifExist();
				}
				break;
			}
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1206);
				keyspace();
				setState(1207);
				match(DOT);
				}
				break;
			}
			setState(1211);
			functionStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTriggerContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwTriggerContext kwTrigger() {
			return getRuleContext(KwTriggerContext.class,0);
		}
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public KwOnContext kwOn() {
			return getRuleContext(KwOnContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTrigger; }
	}

	public final DropTriggerContext dropTrigger() throws RecognitionException {
		DropTriggerContext _localctx = new DropTriggerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dropTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			kwDrop();
			setState(1214);
			kwTrigger();
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1215);
				ifExist();
				}
				break;
			}
			setState(1218);
			trigger();
			setState(1219);
			kwOn();
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1220);
				keyspace();
				setState(1221);
				match(DOT);
				}
				break;
			}
			setState(1225);
			table();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwRoleContext kwRole() {
			return getRuleContext(KwRoleContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			kwDrop();
			setState(1228);
			kwRole();
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1229);
				ifExist();
				}
				break;
			}
			setState(1232);
			role();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwTableContext kwTable() {
			return getRuleContext(KwTableContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			kwDrop();
			setState(1235);
			kwTable();
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1236);
				ifExist();
				}
				break;
			}
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1239);
				keyspace();
				setState(1240);
				match(DOT);
				}
				break;
			}
			setState(1244);
			table();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropKeyspaceContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwKeyspaceContext kwKeyspace() {
			return getRuleContext(KwKeyspaceContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public DropKeyspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropKeyspace; }
	}

	public final DropKeyspaceContext dropKeyspace() throws RecognitionException {
		DropKeyspaceContext _localctx = new DropKeyspaceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dropKeyspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			kwDrop();
			setState(1247);
			kwKeyspace();
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1248);
				ifExist();
				}
				break;
			}
			setState(1251);
			keyspace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public KwDropContext kwDrop() {
			return getRuleContext(KwDropContext.class,0);
		}
		public KwIndexContext kwIndex() {
			return getRuleContext(KwIndexContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			kwDrop();
			setState(1254);
			kwIndex();
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1255);
				ifExist();
				}
				break;
			}
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1258);
				keyspace();
				setState(1259);
				match(DOT);
				}
				break;
			}
			setState(1263);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwTableContext kwTable() {
			return getRuleContext(KwTableContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public ColumnDefinitionListContext columnDefinitionList() {
			return getRuleContext(ColumnDefinitionListContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public WithElementContext withElement() {
			return getRuleContext(WithElementContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			kwCreate();
			setState(1266);
			kwTable();
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(1267);
				ifNotExist();
				}
				break;
			}
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1270);
				keyspace();
				setState(1271);
				match(DOT);
				}
				break;
			}
			setState(1275);
			table();
			setState(1276);
			syntaxBracketLr();
			setState(1277);
			columnDefinitionList();
			setState(1278);
			syntaxBracketRr();
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1279);
				withElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithElementContext extends ParserRuleContext {
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public WithElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withElement; }
	}

	public final WithElementContext withElement() throws RecognitionException {
		WithElementContext _localctx = new WithElementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_withElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			kwWith();
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TRUE - 128)) | (1L << (K_TRUNCATE - 128)) | (1L << (K_TTL - 128)) | (1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (K_USERS - 128)))) != 0)) {
				{
				setState(1283);
				tableOptions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteringOrderContext extends ParserRuleContext {
		public KwClusteringContext kwClustering() {
			return getRuleContext(KwClusteringContext.class,0);
		}
		public KwOrderContext kwOrder() {
			return getRuleContext(KwOrderContext.class,0);
		}
		public KwByContext kwBy() {
			return getRuleContext(KwByContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public OrderDirectionContext orderDirection() {
			return getRuleContext(OrderDirectionContext.class,0);
		}
		public ClusteringOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusteringOrder; }
	}

	public final ClusteringOrderContext clusteringOrder() throws RecognitionException {
		ClusteringOrderContext _localctx = new ClusteringOrderContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_clusteringOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			kwClustering();
			setState(1287);
			kwOrder();
			setState(1288);
			kwBy();
			setState(1289);
			syntaxBracketLr();
			setState(1290);
			column();
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1291);
				orderDirection();
				}
			}

			setState(1294);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionsContext extends ParserRuleContext {
		public List<TableOptionItemContext> tableOptionItem() {
			return getRuleContexts(TableOptionItemContext.class);
		}
		public TableOptionItemContext tableOptionItem(int i) {
			return getRuleContext(TableOptionItemContext.class,i);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			tableOptionItem();
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1297);
				kwAnd();
				setState(1298);
				tableOptionItem();
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionItemContext extends ParserRuleContext {
		public TableOptionNameContext tableOptionName() {
			return getRuleContext(TableOptionNameContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public TableOptionValueContext tableOptionValue() {
			return getRuleContext(TableOptionValueContext.class,0);
		}
		public OptionHashContext optionHash() {
			return getRuleContext(OptionHashContext.class,0);
		}
		public ClusteringOrderContext clusteringOrder() {
			return getRuleContext(ClusteringOrderContext.class,0);
		}
		public TableOptionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptionItem; }
	}

	public final TableOptionItemContext tableOptionItem() throws RecognitionException {
		TableOptionItemContext _localctx = new TableOptionItemContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tableOptionItem);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				tableOptionName();
				setState(1306);
				match(OPERATOR_EQ);
				setState(1307);
				tableOptionValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				tableOptionName();
				setState(1310);
				match(OPERATOR_EQ);
				setState(1311);
				optionHash();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				clusteringOrder();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TableOptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptionName; }
	}

	public final TableOptionNameContext tableOptionName() throws RecognitionException {
		TableOptionNameContext _localctx = new TableOptionNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tableOptionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionValueContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TableOptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptionValue; }
	}

	public final TableOptionValueContext tableOptionValue() throws RecognitionException {
		TableOptionValueContext _localctx = new TableOptionValueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tableOptionValue);
		try {
			setState(1320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				stringLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				floatLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionHashContext extends ParserRuleContext {
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public List<OptionHashItemContext> optionHashItem() {
			return getRuleContexts(OptionHashItemContext.class);
		}
		public OptionHashItemContext optionHashItem(int i) {
			return getRuleContext(OptionHashItemContext.class,i);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public OptionHashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionHash; }
	}

	public final OptionHashContext optionHash() throws RecognitionException {
		OptionHashContext _localctx = new OptionHashContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_optionHash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			syntaxBracketLc();
			setState(1323);
			optionHashItem();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1324);
				syntaxComma();
				setState(1325);
				optionHashItem();
				}
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1332);
			syntaxBracketRc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionHashItemContext extends ParserRuleContext {
		public OptionHashKeyContext optionHashKey() {
			return getRuleContext(OptionHashKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CqlParser.COLON, 0); }
		public OptionHashValueContext optionHashValue() {
			return getRuleContext(OptionHashValueContext.class,0);
		}
		public OptionHashItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionHashItem; }
	}

	public final OptionHashItemContext optionHashItem() throws RecognitionException {
		OptionHashItemContext _localctx = new OptionHashItemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_optionHashItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			optionHashKey();
			setState(1335);
			match(COLON);
			setState(1336);
			optionHashValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionHashKeyContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public OptionHashKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionHashKey; }
	}

	public final OptionHashKeyContext optionHashKey() throws RecognitionException {
		OptionHashKeyContext _localctx = new OptionHashKeyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_optionHashKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionHashValueContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public OptionHashValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionHashValue; }
	}

	public final OptionHashValueContext optionHashValue() throws RecognitionException {
		OptionHashValueContext _localctx = new OptionHashValueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_optionHashValue);
		try {
			setState(1342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				stringLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				floatLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionListContext extends ParserRuleContext {
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public PrimaryKeyElementContext primaryKeyElement() {
			return getRuleContext(PrimaryKeyElementContext.class,0);
		}
		public ColumnDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionList; }
	}

	public final ColumnDefinitionListContext columnDefinitionList() throws RecognitionException {
		ColumnDefinitionListContext _localctx = new ColumnDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_columnDefinitionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1344);
			columnDefinition();
			}
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1345);
					syntaxComma();
					setState(1346);
					columnDefinition();
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1353);
				syntaxComma();
				setState(1354);
				primaryKeyElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public PrimaryKeyColumnContext primaryKeyColumn() {
			return getRuleContext(PrimaryKeyColumnContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			column();
			setState(1359);
			dataType();
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(1360);
				primaryKeyColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyColumnContext extends ParserRuleContext {
		public KwPrimaryContext kwPrimary() {
			return getRuleContext(KwPrimaryContext.class,0);
		}
		public KwKeyContext kwKey() {
			return getRuleContext(KwKeyContext.class,0);
		}
		public PrimaryKeyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyColumn; }
	}

	public final PrimaryKeyColumnContext primaryKeyColumn() throws RecognitionException {
		PrimaryKeyColumnContext _localctx = new PrimaryKeyColumnContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_primaryKeyColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			kwPrimary();
			setState(1364);
			kwKey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyElementContext extends ParserRuleContext {
		public KwPrimaryContext kwPrimary() {
			return getRuleContext(KwPrimaryContext.class,0);
		}
		public KwKeyContext kwKey() {
			return getRuleContext(KwKeyContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public PrimaryKeyDefinitionContext primaryKeyDefinition() {
			return getRuleContext(PrimaryKeyDefinitionContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public PrimaryKeyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyElement; }
	}

	public final PrimaryKeyElementContext primaryKeyElement() throws RecognitionException {
		PrimaryKeyElementContext _localctx = new PrimaryKeyElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_primaryKeyElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			kwPrimary();
			setState(1367);
			kwKey();
			setState(1368);
			syntaxBracketLr();
			setState(1369);
			primaryKeyDefinition();
			setState(1370);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyDefinitionContext extends ParserRuleContext {
		public SinglePrimaryKeyContext singlePrimaryKey() {
			return getRuleContext(SinglePrimaryKeyContext.class,0);
		}
		public CompoundKeyContext compoundKey() {
			return getRuleContext(CompoundKeyContext.class,0);
		}
		public CompositeKeyContext compositeKey() {
			return getRuleContext(CompositeKeyContext.class,0);
		}
		public PrimaryKeyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyDefinition; }
	}

	public final PrimaryKeyDefinitionContext primaryKeyDefinition() throws RecognitionException {
		PrimaryKeyDefinitionContext _localctx = new PrimaryKeyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_primaryKeyDefinition);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				singlePrimaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				compoundKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				compositeKey();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinglePrimaryKeyContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SinglePrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlePrimaryKey; }
	}

	public final SinglePrimaryKeyContext singlePrimaryKey() throws RecognitionException {
		SinglePrimaryKeyContext _localctx = new SinglePrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_singlePrimaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundKeyContext extends ParserRuleContext {
		public PartitionKeyContext partitionKey() {
			return getRuleContext(PartitionKeyContext.class,0);
		}
		public SyntaxCommaContext syntaxComma() {
			return getRuleContext(SyntaxCommaContext.class,0);
		}
		public ClusteringKeyListContext clusteringKeyList() {
			return getRuleContext(ClusteringKeyListContext.class,0);
		}
		public CompoundKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundKey; }
	}

	public final CompoundKeyContext compoundKey() throws RecognitionException {
		CompoundKeyContext _localctx = new CompoundKeyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_compoundKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			partitionKey();
			{
			setState(1380);
			syntaxComma();
			setState(1381);
			clusteringKeyList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeKeyContext extends ParserRuleContext {
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public PartitionKeyListContext partitionKeyList() {
			return getRuleContext(PartitionKeyListContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public SyntaxCommaContext syntaxComma() {
			return getRuleContext(SyntaxCommaContext.class,0);
		}
		public ClusteringKeyListContext clusteringKeyList() {
			return getRuleContext(ClusteringKeyListContext.class,0);
		}
		public CompositeKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeKey; }
	}

	public final CompositeKeyContext compositeKey() throws RecognitionException {
		CompositeKeyContext _localctx = new CompositeKeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_compositeKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			syntaxBracketLr();
			setState(1384);
			partitionKeyList();
			setState(1385);
			syntaxBracketRr();
			{
			setState(1386);
			syntaxComma();
			setState(1387);
			clusteringKeyList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionKeyListContext extends ParserRuleContext {
		public List<PartitionKeyContext> partitionKey() {
			return getRuleContexts(PartitionKeyContext.class);
		}
		public PartitionKeyContext partitionKey(int i) {
			return getRuleContext(PartitionKeyContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public PartitionKeyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionKeyList; }
	}

	public final PartitionKeyListContext partitionKeyList() throws RecognitionException {
		PartitionKeyListContext _localctx = new PartitionKeyListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_partitionKeyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1389);
			partitionKey();
			}
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1390);
				syntaxComma();
				setState(1391);
				partitionKey();
				}
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteringKeyListContext extends ParserRuleContext {
		public List<ClusteringKeyContext> clusteringKey() {
			return getRuleContexts(ClusteringKeyContext.class);
		}
		public ClusteringKeyContext clusteringKey(int i) {
			return getRuleContext(ClusteringKeyContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public ClusteringKeyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusteringKeyList; }
	}

	public final ClusteringKeyListContext clusteringKeyList() throws RecognitionException {
		ClusteringKeyListContext _localctx = new ClusteringKeyListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_clusteringKeyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1398);
			clusteringKey();
			}
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1399);
				syntaxComma();
				setState(1400);
				clusteringKey();
				}
				}
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionKeyContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public PartitionKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionKey; }
	}

	public final PartitionKeyContext partitionKey() throws RecognitionException {
		PartitionKeyContext _localctx = new PartitionKeyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_partitionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteringKeyContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ClusteringKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusteringKey; }
	}

	public final ClusteringKeyContext clusteringKey() throws RecognitionException {
		ClusteringKeyContext _localctx = new ClusteringKeyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_clusteringKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplyBatchContext extends ParserRuleContext {
		public KwApplyContext kwApply() {
			return getRuleContext(KwApplyContext.class,0);
		}
		public KwBatchContext kwBatch() {
			return getRuleContext(KwBatchContext.class,0);
		}
		public ApplyBatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyBatch; }
	}

	public final ApplyBatchContext applyBatch() throws RecognitionException {
		ApplyBatchContext _localctx = new ApplyBatchContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_applyBatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			kwApply();
			setState(1412);
			kwBatch();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginBatchContext extends ParserRuleContext {
		public KwBeginContext kwBegin() {
			return getRuleContext(KwBeginContext.class,0);
		}
		public KwBatchContext kwBatch() {
			return getRuleContext(KwBatchContext.class,0);
		}
		public BatchTypeContext batchType() {
			return getRuleContext(BatchTypeContext.class,0);
		}
		public UsingTimestampSpecContext usingTimestampSpec() {
			return getRuleContext(UsingTimestampSpecContext.class,0);
		}
		public BeginBatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginBatch; }
	}

	public final BeginBatchContext beginBatch() throws RecognitionException {
		BeginBatchContext _localctx = new BeginBatchContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_beginBatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			kwBegin();
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOGGED || _la==K_UNLOGGED) {
				{
				setState(1415);
				batchType();
				}
			}

			setState(1418);
			kwBatch();
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1419);
				usingTimestampSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchTypeContext extends ParserRuleContext {
		public KwLoggedContext kwLogged() {
			return getRuleContext(KwLoggedContext.class,0);
		}
		public KwUnloggedContext kwUnlogged() {
			return getRuleContext(KwUnloggedContext.class,0);
		}
		public BatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchType; }
	}

	public final BatchTypeContext batchType() throws RecognitionException {
		BatchTypeContext _localctx = new BatchTypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_batchType);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_LOGGED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				kwLogged();
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				kwUnlogged();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterKeyspaceContext extends ParserRuleContext {
		public KwAlterContext kwAlter() {
			return getRuleContext(KwAlterContext.class,0);
		}
		public KwKeyspaceContext kwKeyspace() {
			return getRuleContext(KwKeyspaceContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public KwReplicationContext kwReplication() {
			return getRuleContext(KwReplicationContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public ReplicationListContext replicationList() {
			return getRuleContext(ReplicationListContext.class,0);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public KwAndContext kwAnd() {
			return getRuleContext(KwAndContext.class,0);
		}
		public DurableWritesContext durableWrites() {
			return getRuleContext(DurableWritesContext.class,0);
		}
		public AlterKeyspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterKeyspace; }
	}

	public final AlterKeyspaceContext alterKeyspace() throws RecognitionException {
		AlterKeyspaceContext _localctx = new AlterKeyspaceContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_alterKeyspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			kwAlter();
			setState(1427);
			kwKeyspace();
			setState(1428);
			keyspace();
			setState(1429);
			kwWith();
			setState(1430);
			kwReplication();
			setState(1431);
			match(OPERATOR_EQ);
			setState(1432);
			syntaxBracketLc();
			setState(1433);
			replicationList();
			setState(1434);
			syntaxBracketRc();
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(1435);
				kwAnd();
				setState(1436);
				durableWrites();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplicationListContext extends ParserRuleContext {
		public List<ReplicationListItemContext> replicationListItem() {
			return getRuleContexts(ReplicationListItemContext.class);
		}
		public ReplicationListItemContext replicationListItem(int i) {
			return getRuleContext(ReplicationListItemContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public ReplicationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replicationList; }
	}

	public final ReplicationListContext replicationList() throws RecognitionException {
		ReplicationListContext _localctx = new ReplicationListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_replicationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1440);
			replicationListItem();
			}
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1441);
				syntaxComma();
				setState(1442);
				replicationListItem();
				}
				}
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplicationListItemContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(CqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(CqlParser.STRING_LITERAL, i);
		}
		public TerminalNode COLON() { return getToken(CqlParser.COLON, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CqlParser.DECIMAL_LITERAL, 0); }
		public ReplicationListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replicationListItem; }
	}

	public final ReplicationListItemContext replicationListItem() throws RecognitionException {
		ReplicationListItemContext _localctx = new ReplicationListItemContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_replicationListItem);
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				match(STRING_LITERAL);
				setState(1450);
				match(COLON);
				setState(1451);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
				match(STRING_LITERAL);
				setState(1453);
				match(COLON);
				setState(1454);
				match(DECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurableWritesContext extends ParserRuleContext {
		public KwDurableWritesContext kwDurableWrites() {
			return getRuleContext(KwDurableWritesContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public DurableWritesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durableWrites; }
	}

	public final DurableWritesContext durableWrites() throws RecognitionException {
		DurableWritesContext _localctx = new DurableWritesContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_durableWrites);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			kwDurableWrites();
			setState(1458);
			match(OPERATOR_EQ);
			setState(1459);
			booleanLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public KwUseContext kwUse() {
			return getRuleContext(KwUseContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			kwUse();
			setState(1462);
			keyspace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateContext extends ParserRuleContext {
		public KwTruncateContext kwTruncate() {
			return getRuleContext(KwTruncateContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public KwTableContext kwTable() {
			return getRuleContext(KwTableContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public TruncateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate; }
	}

	public final TruncateContext truncate() throws RecognitionException {
		TruncateContext _localctx = new TruncateContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_truncate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			kwTruncate();
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1465);
				kwTable();
				}
				break;
			}
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1468);
				keyspace();
				setState(1469);
				match(DOT);
				}
				break;
			}
			setState(1473);
			table();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwIndexContext kwIndex() {
			return getRuleContext(KwIndexContext.class,0);
		}
		public KwOnContext kwOn() {
			return getRuleContext(KwOnContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public IndexColumnSpecContext indexColumnSpec() {
			return getRuleContext(IndexColumnSpecContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			kwCreate();
			setState(1476);
			kwIndex();
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1477);
				ifNotExist();
				}
				break;
			}
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1480);
				indexName();
				}
				break;
			}
			setState(1483);
			kwOn();
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1484);
				keyspace();
				setState(1485);
				match(DOT);
				}
				break;
			}
			setState(1489);
			table();
			setState(1490);
			syntaxBracketLr();
			setState(1491);
			indexColumnSpec();
			setState(1492);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_indexName);
		try {
			setState(1496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ADD:
			case K_ALL:
			case K_ALLOW:
			case K_ALTER:
			case K_AND:
			case K_ANY:
			case K_APPLY:
			case K_AS:
			case K_ASC:
			case K_AUTHORIZE:
			case K_BATCH:
			case K_BEGIN:
			case K_BY:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONSISTENCY:
			case K_CONTAINS:
			case K_CREATE:
			case K_CUSTOM:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DISTINCT:
			case K_DROP:
			case K_DURABLE_WRITES:
			case K_EACH_QUORUM:
			case K_ENTRIES:
			case K_EXECUTE:
			case K_EXISTS:
			case K_FALSE:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROM:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GRANT:
			case K_IF:
			case K_IN:
			case K_INDEX:
			case K_INFINITY:
			case K_INITCOND:
			case K_INPUT:
			case K_INSERT:
			case K_INTO:
			case K_IS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LEVEL:
			case K_LIMIT:
			case K_LOCAL_ONE:
			case K_LOCAL_QUORUM:
			case K_LOGGED:
			case K_LOGIN:
			case K_MATERIALIZED:
			case K_MODIFY:
			case K_NAN:
			case K_NORECURSIVE:
			case K_NOSUPERUSER:
			case K_NOT:
			case K_NULL:
			case K_OF:
			case K_ON:
			case K_ONE:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_PRIMARY:
			case K_QUORUM:
			case K_RENAME:
			case K_REPLACE:
			case K_REPLICATION:
			case K_RETURNS:
			case K_REVOKE:
			case K_ROLE:
			case K_ROLES:
			case K_SCHEMA:
			case K_SELECT:
			case K_SET:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLE:
			case K_THREE:
			case K_TIMESTAMP:
			case K_TO:
			case K_TOKEN:
			case K_TRIGGER:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TTL:
			case K_TWO:
			case K_TYPE:
			case K_UNLOGGED:
			case K_UPDATE:
			case K_USE:
			case K_USER:
			case K_USING:
			case K_UUID:
			case K_VALUES:
			case K_VIEW:
			case K_WHERE:
			case K_WITH:
			case K_WRITETIME:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_COUNTER:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_FLOAT:
			case K_FROZEN:
			case K_INET:
			case K_INT:
			case K_LIST:
			case K_MAP:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIMEUUID:
			case K_TIME:
			case K_TINYINT:
			case K_TUPLE:
			case K_VARCHAR:
			case K_VARINT:
			case OBJECT_NAME:
			case K_USERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexColumnSpecContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public IndexKeysSpecContext indexKeysSpec() {
			return getRuleContext(IndexKeysSpecContext.class,0);
		}
		public IndexEntriesSSpecContext indexEntriesSSpec() {
			return getRuleContext(IndexEntriesSSpecContext.class,0);
		}
		public IndexFullSpecContext indexFullSpec() {
			return getRuleContext(IndexFullSpecContext.class,0);
		}
		public IndexColumnSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnSpec; }
	}

	public final IndexColumnSpecContext indexColumnSpec() throws RecognitionException {
		IndexColumnSpecContext _localctx = new IndexColumnSpecContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_indexColumnSpec);
		try {
			setState(1502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				indexKeysSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500);
				indexEntriesSSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1501);
				indexFullSpec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexKeysSpecContext extends ParserRuleContext {
		public KwKeysContext kwKeys() {
			return getRuleContext(KwKeysContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public IndexKeysSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexKeysSpec; }
	}

	public final IndexKeysSpecContext indexKeysSpec() throws RecognitionException {
		IndexKeysSpecContext _localctx = new IndexKeysSpecContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_indexKeysSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			kwKeys();
			setState(1505);
			syntaxBracketLr();
			setState(1506);
			column();
			setState(1507);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexEntriesSSpecContext extends ParserRuleContext {
		public KwEntriesContext kwEntries() {
			return getRuleContext(KwEntriesContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public IndexEntriesSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexEntriesSSpec; }
	}

	public final IndexEntriesSSpecContext indexEntriesSSpec() throws RecognitionException {
		IndexEntriesSSpecContext _localctx = new IndexEntriesSSpecContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_indexEntriesSSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			kwEntries();
			setState(1510);
			syntaxBracketLr();
			setState(1511);
			column();
			setState(1512);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexFullSpecContext extends ParserRuleContext {
		public KwFullContext kwFull() {
			return getRuleContext(KwFullContext.class,0);
		}
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public IndexFullSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexFullSpec; }
	}

	public final IndexFullSpecContext indexFullSpec() throws RecognitionException {
		IndexFullSpecContext _localctx = new IndexFullSpecContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_indexFullSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			kwFull();
			setState(1515);
			syntaxBracketLr();
			setState(1516);
			column();
			setState(1517);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStatementContext extends ParserRuleContext {
		public KwDeleteContext kwDelete() {
			return getRuleContext(KwDeleteContext.class,0);
		}
		public FromSpecContext fromSpec() {
			return getRuleContext(FromSpecContext.class,0);
		}
		public WhereSpecContext whereSpec() {
			return getRuleContext(WhereSpecContext.class,0);
		}
		public BeginBatchContext beginBatch() {
			return getRuleContext(BeginBatchContext.class,0);
		}
		public DeleteColumnListContext deleteColumnList() {
			return getRuleContext(DeleteColumnListContext.class,0);
		}
		public UsingTimestampSpecContext usingTimestampSpec() {
			return getRuleContext(UsingTimestampSpecContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public IfSpecContext ifSpec() {
			return getRuleContext(IfSpecContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1519);
				beginBatch();
				}
			}

			setState(1522);
			kwDelete();
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1523);
				deleteColumnList();
				}
				break;
			}
			setState(1526);
			fromSpec();
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1527);
				usingTimestampSpec();
				}
			}

			setState(1530);
			whereSpec();
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1531);
				ifExist();
				}
				break;
			case 2:
				{
				setState(1532);
				ifSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteColumnListContext extends ParserRuleContext {
		public List<DeleteColumnItemContext> deleteColumnItem() {
			return getRuleContexts(DeleteColumnItemContext.class);
		}
		public DeleteColumnItemContext deleteColumnItem(int i) {
			return getRuleContext(DeleteColumnItemContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public DeleteColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteColumnList; }
	}

	public final DeleteColumnListContext deleteColumnList() throws RecognitionException {
		DeleteColumnListContext _localctx = new DeleteColumnListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_deleteColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1535);
			deleteColumnItem();
			}
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1536);
				syntaxComma();
				setState(1537);
				deleteColumnItem();
				}
				}
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteColumnItemContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LS_BRACKET() { return getToken(CqlParser.LS_BRACKET, 0); }
		public TerminalNode RS_BRACKET() { return getToken(CqlParser.RS_BRACKET, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public DeleteColumnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteColumnItem; }
	}

	public final DeleteColumnItemContext deleteColumnItem() throws RecognitionException {
		DeleteColumnItemContext _localctx = new DeleteColumnItemContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_deleteColumnItem);
		try {
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				id();
				setState(1546);
				match(LS_BRACKET);
				setState(1549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(1547);
					stringLiteral();
					}
					break;
				case DECIMAL_LITERAL:
					{
					setState(1548);
					decimalLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1551);
				match(RS_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public KwUpdateContext kwUpdate() {
			return getRuleContext(KwUpdateContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public KwSetContext kwSet() {
			return getRuleContext(KwSetContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public WhereSpecContext whereSpec() {
			return getRuleContext(WhereSpecContext.class,0);
		}
		public BeginBatchContext beginBatch() {
			return getRuleContext(BeginBatchContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public UsingTtlTimestampContext usingTtlTimestamp() {
			return getRuleContext(UsingTtlTimestampContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public IfSpecContext ifSpec() {
			return getRuleContext(IfSpecContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1555);
				beginBatch();
				}
			}

			setState(1558);
			kwUpdate();
			setState(1562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1559);
				keyspace();
				setState(1560);
				match(DOT);
				}
				break;
			}
			setState(1564);
			table();
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1565);
				usingTtlTimestamp();
				}
			}

			setState(1568);
			kwSet();
			setState(1569);
			assignments();
			setState(1570);
			whereSpec();
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1571);
				ifExist();
				}
				break;
			case 2:
				{
				setState(1572);
				ifSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfSpecContext extends ParserRuleContext {
		public KwIfContext kwIf() {
			return getRuleContext(KwIfContext.class,0);
		}
		public IfConditionListContext ifConditionList() {
			return getRuleContext(IfConditionListContext.class,0);
		}
		public IfSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSpec; }
	}

	public final IfSpecContext ifSpec() throws RecognitionException {
		IfSpecContext _localctx = new IfSpecContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_ifSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			kwIf();
			setState(1576);
			ifConditionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionListContext extends ParserRuleContext {
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public IfConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditionList; }
	}

	public final IfConditionListContext ifConditionList() throws RecognitionException {
		IfConditionListContext _localctx = new IfConditionListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_ifConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1578);
			ifCondition();
			}
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1579);
				kwAnd();
				setState(1580);
				ifCondition();
				}
				}
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			id();
			setState(1588);
			match(OPERATOR_EQ);
			setState(1589);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentsContext extends ParserRuleContext {
		public List<AssignmentElementContext> assignmentElement() {
			return getRuleContexts(AssignmentElementContext.class);
		}
		public AssignmentElementContext assignmentElement(int i) {
			return getRuleContext(AssignmentElementContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1591);
			assignmentElement();
			}
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1592);
				syntaxComma();
				setState(1593);
				assignmentElement();
				}
				}
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentElementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AssignmentMapContext assignmentMap() {
			return getRuleContext(AssignmentMapContext.class,0);
		}
		public AssignmentSetContext assignmentSet() {
			return getRuleContext(AssignmentSetContext.class,0);
		}
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CqlParser.MINUS, 0); }
		public SyntaxBracketLsContext syntaxBracketLs() {
			return getRuleContext(SyntaxBracketLsContext.class,0);
		}
		public SyntaxBracketRsContext syntaxBracketRs() {
			return getRuleContext(SyntaxBracketRsContext.class,0);
		}
		public AssignmentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentElement; }
	}

	public final AssignmentElementContext assignmentElement() throws RecognitionException {
		AssignmentElementContext _localctx = new AssignmentElementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_assignmentElement);
		int _la;
		try {
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				id();
				setState(1601);
				match(OPERATOR_EQ);
				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1602);
					constant();
					}
					break;
				case 2:
					{
					setState(1603);
					assignmentMap();
					}
					break;
				case 3:
					{
					setState(1604);
					assignmentSet();
					}
					break;
				case 4:
					{
					setState(1605);
					assignmentList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608);
				id();
				setState(1609);
				match(OPERATOR_EQ);
				setState(1610);
				id();
				setState(1611);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1612);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				id();
				setState(1615);
				match(OPERATOR_EQ);
				setState(1616);
				id();
				setState(1617);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1618);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1620);
				id();
				setState(1621);
				match(OPERATOR_EQ);
				setState(1622);
				assignmentSet();
				setState(1623);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1624);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1626);
				id();
				setState(1627);
				match(OPERATOR_EQ);
				setState(1628);
				id();
				setState(1629);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1630);
				assignmentMap();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1632);
				id();
				setState(1633);
				match(OPERATOR_EQ);
				setState(1634);
				assignmentMap();
				setState(1635);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1636);
				id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1638);
				id();
				setState(1639);
				match(OPERATOR_EQ);
				setState(1640);
				id();
				setState(1641);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1642);
				assignmentList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1644);
				id();
				setState(1645);
				match(OPERATOR_EQ);
				setState(1646);
				assignmentList();
				setState(1647);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1648);
				id();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1650);
				id();
				setState(1651);
				syntaxBracketLs();
				setState(1652);
				decimalLiteral();
				setState(1653);
				syntaxBracketRs();
				setState(1654);
				match(OPERATOR_EQ);
				setState(1655);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentSetContext extends ParserRuleContext {
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentSet; }
	}

	public final AssignmentSetContext assignmentSet() throws RecognitionException {
		AssignmentSetContext _localctx = new AssignmentSetContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_assignmentSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			syntaxBracketLc();
			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TRUE - 128)) | (1L << (K_TRUNCATE - 128)) | (1L << (K_TTL - 128)) | (1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (CODE_BLOCK - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (FLOAT_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (UUID - 128)) | (1L << (K_USERS - 128)))) != 0)) {
				{
				setState(1660);
				constant();
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1661);
					syntaxComma();
					setState(1662);
					expression();
					}
					}
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1671);
			syntaxBracketRc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentMapContext extends ParserRuleContext {
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<SyntaxColonContext> syntaxColon() {
			return getRuleContexts(SyntaxColonContext.class);
		}
		public SyntaxColonContext syntaxColon(int i) {
			return getRuleContext(SyntaxColonContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public AssignmentMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentMap; }
	}

	public final AssignmentMapContext assignmentMap() throws RecognitionException {
		AssignmentMapContext _localctx = new AssignmentMapContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_assignmentMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			syntaxBracketLc();
			{
			setState(1674);
			constant();
			setState(1675);
			syntaxColon();
			setState(1676);
			expression();
			}
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1678);
				syntaxComma();
				setState(1679);
				constant();
				setState(1680);
				syntaxColon();
				setState(1681);
				expression();
				}
				}
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1688);
			syntaxBracketRc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentMapExpressionContext extends ParserRuleContext {
		public SyntaxBracketLcContext syntaxBracketLc() {
			return getRuleContext(SyntaxBracketLcContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SyntaxBracketRcContext syntaxBracketRc() {
			return getRuleContext(SyntaxBracketRcContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public AssignmentMapExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentMapExpression; }
	}

	public final AssignmentMapExpressionContext assignmentMapExpression() throws RecognitionException {
		AssignmentMapExpressionContext _localctx = new AssignmentMapExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_assignmentMapExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			syntaxBracketLc();
			setState(1691);
			expression();
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1692);
				syntaxComma();
				setState(1693);
				expression();
				}
				}
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1700);
			syntaxBracketRc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public SyntaxBracketLsContext syntaxBracketLs() {
			return getRuleContext(SyntaxBracketLsContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public SyntaxBracketRsContext syntaxBracketRs() {
			return getRuleContext(SyntaxBracketRsContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			syntaxBracketLs();
			setState(1703);
			constant();
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1704);
				syntaxComma();
				setState(1705);
				expression();
				}
				}
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1712);
			syntaxBracketRs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentTupleContext extends ParserRuleContext {
		public SyntaxBracketLrContext syntaxBracketLr() {
			return getRuleContext(SyntaxBracketLrContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AssignmentTupleContext> assignmentTuple() {
			return getRuleContexts(AssignmentTupleContext.class);
		}
		public AssignmentTupleContext assignmentTuple(int i) {
			return getRuleContext(AssignmentTupleContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public AssignmentTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentTuple; }
	}

	public final AssignmentTupleContext assignmentTuple() throws RecognitionException {
		AssignmentTupleContext _localctx = new AssignmentTupleContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_assignmentTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			syntaxBracketLr();
			setState(1743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1715);
				expression();
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1716);
						syntaxComma();
						setState(1717);
						expression();
						}
						}
						setState(1723);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1724);
						syntaxComma();
						setState(1725);
						assignmentTuple();
						}
						}
						setState(1731);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1734);
				assignmentTuple();
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1735);
					syntaxComma();
					setState(1736);
					assignmentTuple();
					}
					}
					setState(1742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1745);
			syntaxBracketRr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public KwInsertContext kwInsert() {
			return getRuleContext(KwInsertContext.class,0);
		}
		public KwIntoContext kwInto() {
			return getRuleContext(KwIntoContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public InsertValuesSpecContext insertValuesSpec() {
			return getRuleContext(InsertValuesSpecContext.class,0);
		}
		public BeginBatchContext beginBatch() {
			return getRuleContext(BeginBatchContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public InsertColumnSpecContext insertColumnSpec() {
			return getRuleContext(InsertColumnSpecContext.class,0);
		}
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public UsingTtlTimestampContext usingTtlTimestamp() {
			return getRuleContext(UsingTtlTimestampContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1747);
				beginBatch();
				}
			}

			setState(1750);
			kwInsert();
			setState(1751);
			kwInto();
			setState(1755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1752);
				keyspace();
				setState(1753);
				match(DOT);
				}
				break;
			}
			setState(1757);
			table();
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(1758);
				insertColumnSpec();
				}
			}

			setState(1761);
			insertValuesSpec();
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1762);
				ifNotExist();
				}
			}

			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1765);
				usingTtlTimestamp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingTtlTimestampContext extends ParserRuleContext {
		public KwUsingContext kwUsing() {
			return getRuleContext(KwUsingContext.class,0);
		}
		public TtlContext ttl() {
			return getRuleContext(TtlContext.class,0);
		}
		public KwAndContext kwAnd() {
			return getRuleContext(KwAndContext.class,0);
		}
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public UsingTtlTimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingTtlTimestamp; }
	}

	public final UsingTtlTimestampContext usingTtlTimestamp() throws RecognitionException {
		UsingTtlTimestampContext _localctx = new UsingTtlTimestampContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_usingTtlTimestamp);
		try {
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				kwUsing();
				setState(1769);
				ttl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				kwUsing();
				setState(1772);
				ttl();
				setState(1773);
				kwAnd();
				setState(1774);
				timestamp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1776);
				kwUsing();
				setState(1777);
				timestamp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1779);
				kwUsing();
				setState(1780);
				timestamp();
				setState(1781);
				kwAnd();
				setState(1782);
				ttl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampContext extends ParserRuleContext {
		public KwTimestampContext kwTimestamp() {
			return getRuleContext(KwTimestampContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			kwTimestamp();
			setState(1787);
			decimalLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlContext extends ParserRuleContext {
		public KwTtlContext kwTtl() {
			return getRuleContext(KwTtlContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttl; }
	}

	public final TtlContext ttl() throws RecognitionException {
		TtlContext _localctx = new TtlContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ttl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			kwTtl();
			setState(1790);
			decimalLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingTimestampSpecContext extends ParserRuleContext {
		public KwUsingContext kwUsing() {
			return getRuleContext(KwUsingContext.class,0);
		}
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public UsingTimestampSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingTimestampSpec; }
	}

	public final UsingTimestampSpecContext usingTimestampSpec() throws RecognitionException {
		UsingTimestampSpecContext _localctx = new UsingTimestampSpecContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_usingTimestampSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			kwUsing();
			setState(1793);
			timestamp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfNotExistContext extends ParserRuleContext {
		public KwIfContext kwIf() {
			return getRuleContext(KwIfContext.class,0);
		}
		public KwNotContext kwNot() {
			return getRuleContext(KwNotContext.class,0);
		}
		public KwExistsContext kwExists() {
			return getRuleContext(KwExistsContext.class,0);
		}
		public IfNotExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExist; }
	}

	public final IfNotExistContext ifNotExist() throws RecognitionException {
		IfNotExistContext _localctx = new IfNotExistContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ifNotExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			kwIf();
			setState(1796);
			kwNot();
			setState(1797);
			kwExists();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExistContext extends ParserRuleContext {
		public KwIfContext kwIf() {
			return getRuleContext(KwIfContext.class,0);
		}
		public KwExistsContext kwExists() {
			return getRuleContext(KwExistsContext.class,0);
		}
		public IfExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExist; }
	}

	public final IfExistContext ifExist() throws RecognitionException {
		IfExistContext _localctx = new IfExistContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_ifExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			kwIf();
			setState(1800);
			kwExists();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesSpecContext extends ParserRuleContext {
		public KwValuesContext kwValues() {
			return getRuleContext(KwValuesContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(CqlParser.LR_BRACKET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(CqlParser.RR_BRACKET, 0); }
		public KwJsonContext kwJson() {
			return getRuleContext(KwJsonContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public InsertValuesSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesSpec; }
	}

	public final InsertValuesSpecContext insertValuesSpec() throws RecognitionException {
		InsertValuesSpecContext _localctx = new InsertValuesSpecContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_insertValuesSpec);
		try {
			setState(1810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				kwValues();
				setState(1803);
				match(LR_BRACKET);
				setState(1804);
				expressionList();
				setState(1805);
				match(RR_BRACKET);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				kwJson();
				setState(1808);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertColumnSpecContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(CqlParser.LR_BRACKET, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(CqlParser.RR_BRACKET, 0); }
		public InsertColumnSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertColumnSpec; }
	}

	public final InsertColumnSpecContext insertColumnSpec() throws RecognitionException {
		InsertColumnSpecContext _localctx = new InsertColumnSpecContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_insertColumnSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(LR_BRACKET);
			setState(1813);
			columnList();
			setState(1814);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnListContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			column();
			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1817);
				syntaxComma();
				setState(1818);
				column();
				}
				}
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			expression();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1826);
				syntaxComma();
				setState(1827);
				expression();
				}
				}
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AssignmentMapContext assignmentMap() {
			return getRuleContext(AssignmentMapContext.class,0);
		}
		public AssignmentSetContext assignmentSet() {
			return getRuleContext(AssignmentSetContext.class,0);
		}
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public AssignmentTupleContext assignmentTuple() {
			return getRuleContext(AssignmentTupleContext.class,0);
		}
		public AssignmentMapExpressionContext assignmentMapExpression() {
			return getRuleContext(AssignmentMapExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_expression);
		try {
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				assignmentMap();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1837);
				assignmentList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1838);
				assignmentTuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1839);
				assignmentMapExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public KwSelectContext kwSelect() {
			return getRuleContext(KwSelectContext.class,0);
		}
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public FromSpecContext fromSpec() {
			return getRuleContext(FromSpecContext.class,0);
		}
		public DistinctSpecContext distinctSpec() {
			return getRuleContext(DistinctSpecContext.class,0);
		}
		public KwJsonContext kwJson() {
			return getRuleContext(KwJsonContext.class,0);
		}
		public WhereSpecContext whereSpec() {
			return getRuleContext(WhereSpecContext.class,0);
		}
		public OrderSpecContext orderSpec() {
			return getRuleContext(OrderSpecContext.class,0);
		}
		public LimitSpecContext limitSpec() {
			return getRuleContext(LimitSpecContext.class,0);
		}
		public AllowFilteringSpecContext allowFilteringSpec() {
			return getRuleContext(AllowFilteringSpecContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			kwSelect();
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1843);
				distinctSpec();
				}
				break;
			}
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1846);
				kwJson();
				}
				break;
			}
			setState(1849);
			selectElements();
			setState(1850);
			fromSpec();
			setState(1852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1851);
				whereSpec();
				}
			}

			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1854);
				orderSpec();
				}
			}

			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1857);
				limitSpec();
				}
			}

			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALLOW) {
				{
				setState(1860);
				allowFilteringSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllowFilteringSpecContext extends ParserRuleContext {
		public KwAllowContext kwAllow() {
			return getRuleContext(KwAllowContext.class,0);
		}
		public KwFilteringContext kwFiltering() {
			return getRuleContext(KwFilteringContext.class,0);
		}
		public AllowFilteringSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowFilteringSpec; }
	}

	public final AllowFilteringSpecContext allowFilteringSpec() throws RecognitionException {
		AllowFilteringSpecContext _localctx = new AllowFilteringSpecContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_allowFilteringSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			kwAllow();
			setState(1864);
			kwFiltering();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitSpecContext extends ParserRuleContext {
		public KwLimitContext kwLimit() {
			return getRuleContext(KwLimitContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public LimitSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitSpec; }
	}

	public final LimitSpecContext limitSpec() throws RecognitionException {
		LimitSpecContext _localctx = new LimitSpecContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_limitSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			kwLimit();
			setState(1867);
			decimalLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSpecContext extends ParserRuleContext {
		public KwFromContext kwFrom() {
			return getRuleContext(KwFromContext.class,0);
		}
		public FromSpecElementContext fromSpecElement() {
			return getRuleContext(FromSpecElementContext.class,0);
		}
		public FromSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSpec; }
	}

	public final FromSpecContext fromSpec() throws RecognitionException {
		FromSpecContext _localctx = new FromSpecContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_fromSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			kwFrom();
			setState(1870);
			fromSpecElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSpecElementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public FromSpecElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSpecElement; }
	}

	public final FromSpecElementContext fromSpecElement() throws RecognitionException {
		FromSpecElementContext _localctx = new FromSpecElementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_fromSpecElement);
		try {
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				id();
				setState(1874);
				match(DOT);
				setState(1875);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderSpecContext extends ParserRuleContext {
		public KwOrderContext kwOrder() {
			return getRuleContext(KwOrderContext.class,0);
		}
		public KwByContext kwBy() {
			return getRuleContext(KwByContext.class,0);
		}
		public OrderSpecElementContext orderSpecElement() {
			return getRuleContext(OrderSpecElementContext.class,0);
		}
		public OrderSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSpec; }
	}

	public final OrderSpecContext orderSpec() throws RecognitionException {
		OrderSpecContext _localctx = new OrderSpecContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_orderSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			kwOrder();
			setState(1880);
			kwBy();
			setState(1881);
			orderSpecElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderSpecElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KwAscContext kwAsc() {
			return getRuleContext(KwAscContext.class,0);
		}
		public KwDescContext kwDesc() {
			return getRuleContext(KwDescContext.class,0);
		}
		public OrderSpecElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSpecElement; }
	}

	public final OrderSpecElementContext orderSpecElement() throws RecognitionException {
		OrderSpecElementContext _localctx = new OrderSpecElementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_orderSpecElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			id();
			setState(1886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				{
				setState(1884);
				kwAsc();
				}
				break;
			case K_DESC:
				{
				setState(1885);
				kwDesc();
				}
				break;
			case EOF:
			case SEMI:
			case MINUSMINUS:
			case K_ALLOW:
			case K_LIMIT:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereSpecContext extends ParserRuleContext {
		public KwWhereContext kwWhere() {
			return getRuleContext(KwWhereContext.class,0);
		}
		public RelationElementsContext relationElements() {
			return getRuleContext(RelationElementsContext.class,0);
		}
		public WhereSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereSpec; }
	}

	public final WhereSpecContext whereSpec() throws RecognitionException {
		WhereSpecContext _localctx = new WhereSpecContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_whereSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			kwWhere();
			setState(1889);
			relationElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctSpecContext extends ParserRuleContext {
		public KwDistinctContext kwDistinct() {
			return getRuleContext(KwDistinctContext.class,0);
		}
		public DistinctSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctSpec; }
	}

	public final DistinctSpecContext distinctSpec() throws RecognitionException {
		DistinctSpecContext _localctx = new DistinctSpecContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_distinctSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			kwDistinct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public TerminalNode STAR() { return getToken(CqlParser.STAR, 0); }
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(1893);
				((SelectElementsContext)_localctx).star = match(STAR);
				}
				break;
			case K_ADD:
			case K_ALL:
			case K_ALLOW:
			case K_ALTER:
			case K_AND:
			case K_ANY:
			case K_APPLY:
			case K_AS:
			case K_ASC:
			case K_AUTHORIZE:
			case K_BATCH:
			case K_BEGIN:
			case K_BY:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONSISTENCY:
			case K_CONTAINS:
			case K_CREATE:
			case K_CUSTOM:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DISTINCT:
			case K_DROP:
			case K_DURABLE_WRITES:
			case K_EACH_QUORUM:
			case K_ENTRIES:
			case K_EXECUTE:
			case K_EXISTS:
			case K_FALSE:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROM:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GRANT:
			case K_IF:
			case K_IN:
			case K_INDEX:
			case K_INFINITY:
			case K_INITCOND:
			case K_INPUT:
			case K_INSERT:
			case K_INTO:
			case K_IS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LEVEL:
			case K_LIMIT:
			case K_LOCAL_ONE:
			case K_LOCAL_QUORUM:
			case K_LOGGED:
			case K_LOGIN:
			case K_MATERIALIZED:
			case K_MODIFY:
			case K_NAN:
			case K_NORECURSIVE:
			case K_NOSUPERUSER:
			case K_NOT:
			case K_NULL:
			case K_OF:
			case K_ON:
			case K_ONE:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_PRIMARY:
			case K_QUORUM:
			case K_RENAME:
			case K_REPLACE:
			case K_REPLICATION:
			case K_RETURNS:
			case K_REVOKE:
			case K_ROLE:
			case K_ROLES:
			case K_SCHEMA:
			case K_SELECT:
			case K_SET:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLE:
			case K_THREE:
			case K_TIMESTAMP:
			case K_TO:
			case K_TOKEN:
			case K_TRIGGER:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TTL:
			case K_TWO:
			case K_TYPE:
			case K_UNLOGGED:
			case K_UPDATE:
			case K_USE:
			case K_USER:
			case K_USING:
			case K_UUID:
			case K_VALUES:
			case K_VIEW:
			case K_WHERE:
			case K_WITH:
			case K_WRITETIME:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_COUNTER:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_FLOAT:
			case K_FROZEN:
			case K_INET:
			case K_INT:
			case K_LIST:
			case K_MAP:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIMEUUID:
			case K_TIME:
			case K_TINYINT:
			case K_TUPLE:
			case K_VARCHAR:
			case K_VARINT:
			case OBJECT_NAME:
			case K_USERS:
				{
				setState(1894);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1897);
				syntaxComma();
				setState(1898);
				selectElement();
				}
				}
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(CqlParser.STAR, 0); }
		public KwAsContext kwAs() {
			return getRuleContext(KwAsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_selectElement);
		int _la;
		try {
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905);
				id();
				setState(1906);
				match(DOT);
				setState(1907);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
				id();
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1910);
					kwAs();
					setState(1911);
					id();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1915);
				functionCall();
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1916);
					kwAs();
					setState(1917);
					id();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationElementsContext extends ParserRuleContext {
		public List<RelationElementContext> relationElement() {
			return getRuleContexts(RelationElementContext.class);
		}
		public RelationElementContext relationElement(int i) {
			return getRuleContext(RelationElementContext.class,i);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public RelationElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationElements; }
	}

	public final RelationElementsContext relationElements() throws RecognitionException {
		RelationElementsContext _localctx = new RelationElementsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_relationElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1923);
			relationElement();
			}
			setState(1929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1924);
				kwAnd();
				setState(1925);
				relationElement();
				}
				}
				setState(1931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationElementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public TerminalNode OPERATOR_LT() { return getToken(CqlParser.OPERATOR_LT, 0); }
		public TerminalNode OPERATOR_GT() { return getToken(CqlParser.OPERATOR_GT, 0); }
		public TerminalNode OPERATOR_LTE() { return getToken(CqlParser.OPERATOR_LTE, 0); }
		public TerminalNode OPERATOR_GTE() { return getToken(CqlParser.OPERATOR_GTE, 0); }
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public KwInContext kwIn() {
			return getRuleContext(KwInContext.class,0);
		}
		public List<TerminalNode> LR_BRACKET() { return getTokens(CqlParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(CqlParser.LR_BRACKET, i);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(CqlParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(CqlParser.RR_BRACKET, i);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public List<AssignmentTupleContext> assignmentTuple() {
			return getRuleContexts(AssignmentTupleContext.class);
		}
		public AssignmentTupleContext assignmentTuple(int i) {
			return getRuleContext(AssignmentTupleContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public RelalationContainsKeyContext relalationContainsKey() {
			return getRuleContext(RelalationContainsKeyContext.class,0);
		}
		public RelalationContainsContext relalationContains() {
			return getRuleContext(RelalationContainsContext.class,0);
		}
		public RelationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationElement; }
	}

	public final RelationElementContext relationElement() throws RecognitionException {
		RelationElementContext _localctx = new RelationElementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_relationElement);
		int _la;
		try {
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				id();
				setState(1933);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (OPERATOR_EQ - 174)) | (1L << (OPERATOR_LT - 174)) | (1L << (OPERATOR_GT - 174)) | (1L << (OPERATOR_LTE - 174)) | (1L << (OPERATOR_GTE - 174)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1934);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				id();
				setState(1937);
				match(DOT);
				setState(1938);
				id();
				setState(1939);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (OPERATOR_EQ - 174)) | (1L << (OPERATOR_LT - 174)) | (1L << (OPERATOR_GT - 174)) | (1L << (OPERATOR_LTE - 174)) | (1L << (OPERATOR_GTE - 174)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1940);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1942);
				functionCall();
				setState(1943);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (OPERATOR_EQ - 174)) | (1L << (OPERATOR_LT - 174)) | (1L << (OPERATOR_GT - 174)) | (1L << (OPERATOR_LTE - 174)) | (1L << (OPERATOR_GTE - 174)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1944);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1946);
				functionCall();
				setState(1947);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (OPERATOR_EQ - 174)) | (1L << (OPERATOR_LT - 174)) | (1L << (OPERATOR_GT - 174)) | (1L << (OPERATOR_LTE - 174)) | (1L << (OPERATOR_GTE - 174)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1948);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1950);
				id();
				setState(1951);
				kwIn();
				setState(1952);
				match(LR_BRACKET);
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TRUE - 128)) | (1L << (K_TRUNCATE - 128)) | (1L << (K_TTL - 128)) | (1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (CODE_BLOCK - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (FLOAT_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (UUID - 128)) | (1L << (K_USERS - 128)))) != 0)) {
					{
					setState(1953);
					functionArgs();
					}
				}

				setState(1956);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1958);
				match(LR_BRACKET);
				setState(1959);
				id();
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1960);
					syntaxComma();
					setState(1961);
					id();
					}
					}
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1968);
				match(RR_BRACKET);
				setState(1969);
				kwIn();
				setState(1970);
				match(LR_BRACKET);
				setState(1971);
				assignmentTuple();
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1972);
					syntaxComma();
					setState(1973);
					assignmentTuple();
					}
					}
					setState(1979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1980);
				match(RR_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1982);
				match(LR_BRACKET);
				setState(1983);
				id();
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1984);
					syntaxComma();
					setState(1985);
					id();
					}
					}
					setState(1991);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1992);
				match(RR_BRACKET);
				setState(1993);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (OPERATOR_EQ - 174)) | (1L << (OPERATOR_LT - 174)) | (1L << (OPERATOR_GT - 174)) | (1L << (OPERATOR_LTE - 174)) | (1L << (OPERATOR_GTE - 174)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(1994);
				assignmentTuple();
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1995);
					syntaxComma();
					setState(1996);
					assignmentTuple();
					}
					}
					setState(2002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2003);
				relalationContainsKey();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2004);
				relalationContains();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelalationContainsContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KwContainsContext kwContains() {
			return getRuleContext(KwContainsContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public RelalationContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relalationContains; }
	}

	public final RelalationContainsContext relalationContains() throws RecognitionException {
		RelalationContainsContext _localctx = new RelalationContainsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_relalationContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			id();
			setState(2008);
			kwContains();
			setState(2009);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelalationContainsKeyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public KwContainsContext kwContains() {
			return getRuleContext(KwContainsContext.class,0);
		}
		public KwKeyContext kwKey() {
			return getRuleContext(KwKeyContext.class,0);
		}
		public RelalationContainsKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relalationContainsKey; }
	}

	public final RelalationContainsKeyContext relalationContainsKey() throws RecognitionException {
		RelalationContainsKeyContext _localctx = new RelalationContainsKeyContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_relalationContainsKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			id();
			{
			setState(2012);
			kwContains();
			setState(2013);
			kwKey();
			}
			setState(2015);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(CqlParser.LR_BRACKET, 0); }
		public TerminalNode STAR() { return getToken(CqlParser.STAR, 0); }
		public TerminalNode RR_BRACKET() { return getToken(CqlParser.RR_BRACKET, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_functionCall);
		int _la;
		try {
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				id();
				setState(2018);
				match(LR_BRACKET);
				setState(2019);
				match(STAR);
				setState(2020);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2022);
				id();
				setState(2023);
				match(LR_BRACKET);
				setState(2025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TRUE - 128)) | (1L << (K_TRUNCATE - 128)) | (1L << (K_TTL - 128)) | (1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (CODE_BLOCK - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (FLOAT_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (UUID - 128)) | (1L << (K_USERS - 128)))) != 0)) {
					{
					setState(2024);
					functionArgs();
					}
				}

				setState(2027);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(2031);
				constant();
				}
				break;
			case 2:
				{
				setState(2032);
				id();
				}
				break;
			case 3:
				{
				setState(2033);
				functionCall();
				}
				break;
			}
			setState(2044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2036);
				syntaxComma();
				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(2037);
					constant();
					}
					break;
				case 2:
					{
					setState(2038);
					id();
					}
					break;
				case 3:
					{
					setState(2039);
					functionCall();
					}
					break;
				}
				}
				}
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(CqlParser.UUID, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public HexadecimalLiteralContext hexadecimalLiteral() {
			return getRuleContext(HexadecimalLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public KwNullContext kwNull() {
			return getRuleContext(KwNullContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_constant);
		try {
			setState(2056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2047);
				match(UUID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2048);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2049);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2050);
				floatLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2051);
				hexadecimalLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2052);
				booleanLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2053);
				codeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2054);
				kwNull();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2055);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CqlParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CqlParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CqlParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL_LITERAL || _la==FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CqlParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(CqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(CqlParser.K_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			_la = _input.LA(1);
			if ( !(_la==K_FALSE || _la==K_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalLiteralContext extends ParserRuleContext {
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(CqlParser.HEXADECIMAL_LITERAL, 0); }
		public HexadecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiteral; }
	}

	public final HexadecimalLiteralContext hexadecimalLiteral() throws RecognitionException {
		HexadecimalLiteralContext _localctx = new HexadecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_hexadecimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(HEXADECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyspaceContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(CqlParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(CqlParser.DQUOTE, i);
		}
		public KeyspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyspace; }
	}

	public final KeyspaceContext keyspace() throws RecognitionException {
		KeyspaceContext _localctx = new KeyspaceContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_keyspace);
		try {
			setState(2073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ADD:
			case K_ALL:
			case K_ALLOW:
			case K_ALTER:
			case K_AND:
			case K_ANY:
			case K_APPLY:
			case K_AS:
			case K_ASC:
			case K_AUTHORIZE:
			case K_BATCH:
			case K_BEGIN:
			case K_BY:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONSISTENCY:
			case K_CONTAINS:
			case K_CREATE:
			case K_CUSTOM:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DISTINCT:
			case K_DROP:
			case K_DURABLE_WRITES:
			case K_EACH_QUORUM:
			case K_ENTRIES:
			case K_EXECUTE:
			case K_EXISTS:
			case K_FALSE:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROM:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GRANT:
			case K_IF:
			case K_IN:
			case K_INDEX:
			case K_INFINITY:
			case K_INITCOND:
			case K_INPUT:
			case K_INSERT:
			case K_INTO:
			case K_IS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LEVEL:
			case K_LIMIT:
			case K_LOCAL_ONE:
			case K_LOCAL_QUORUM:
			case K_LOGGED:
			case K_LOGIN:
			case K_MATERIALIZED:
			case K_MODIFY:
			case K_NAN:
			case K_NORECURSIVE:
			case K_NOSUPERUSER:
			case K_NOT:
			case K_NULL:
			case K_OF:
			case K_ON:
			case K_ONE:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_PRIMARY:
			case K_QUORUM:
			case K_RENAME:
			case K_REPLACE:
			case K_REPLICATION:
			case K_RETURNS:
			case K_REVOKE:
			case K_ROLE:
			case K_ROLES:
			case K_SCHEMA:
			case K_SELECT:
			case K_SET:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLE:
			case K_THREE:
			case K_TIMESTAMP:
			case K_TO:
			case K_TOKEN:
			case K_TRIGGER:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TTL:
			case K_TWO:
			case K_TYPE:
			case K_UNLOGGED:
			case K_UPDATE:
			case K_USE:
			case K_USER:
			case K_USING:
			case K_UUID:
			case K_VALUES:
			case K_VIEW:
			case K_WHERE:
			case K_WITH:
			case K_WRITETIME:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_COUNTER:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_FLOAT:
			case K_FROZEN:
			case K_INET:
			case K_INT:
			case K_LIST:
			case K_MAP:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIMEUUID:
			case K_TIME:
			case K_TINYINT:
			case K_TUPLE:
			case K_VARCHAR:
			case K_VARINT:
			case OBJECT_NAME:
			case K_USERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				match(DQUOTE);
				setState(2070);
				id();
				setState(2071);
				match(DQUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(CqlParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(CqlParser.DQUOTE, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_table);
		try {
			setState(2080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ADD:
			case K_ALL:
			case K_ALLOW:
			case K_ALTER:
			case K_AND:
			case K_ANY:
			case K_APPLY:
			case K_AS:
			case K_ASC:
			case K_AUTHORIZE:
			case K_BATCH:
			case K_BEGIN:
			case K_BY:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONSISTENCY:
			case K_CONTAINS:
			case K_CREATE:
			case K_CUSTOM:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DISTINCT:
			case K_DROP:
			case K_DURABLE_WRITES:
			case K_EACH_QUORUM:
			case K_ENTRIES:
			case K_EXECUTE:
			case K_EXISTS:
			case K_FALSE:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROM:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GRANT:
			case K_IF:
			case K_IN:
			case K_INDEX:
			case K_INFINITY:
			case K_INITCOND:
			case K_INPUT:
			case K_INSERT:
			case K_INTO:
			case K_IS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LEVEL:
			case K_LIMIT:
			case K_LOCAL_ONE:
			case K_LOCAL_QUORUM:
			case K_LOGGED:
			case K_LOGIN:
			case K_MATERIALIZED:
			case K_MODIFY:
			case K_NAN:
			case K_NORECURSIVE:
			case K_NOSUPERUSER:
			case K_NOT:
			case K_NULL:
			case K_OF:
			case K_ON:
			case K_ONE:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_PRIMARY:
			case K_QUORUM:
			case K_RENAME:
			case K_REPLACE:
			case K_REPLICATION:
			case K_RETURNS:
			case K_REVOKE:
			case K_ROLE:
			case K_ROLES:
			case K_SCHEMA:
			case K_SELECT:
			case K_SET:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLE:
			case K_THREE:
			case K_TIMESTAMP:
			case K_TO:
			case K_TOKEN:
			case K_TRIGGER:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TTL:
			case K_TWO:
			case K_TYPE:
			case K_UNLOGGED:
			case K_UPDATE:
			case K_USE:
			case K_USER:
			case K_USING:
			case K_UUID:
			case K_VALUES:
			case K_VIEW:
			case K_WHERE:
			case K_WITH:
			case K_WRITETIME:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_COUNTER:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_FLOAT:
			case K_FROZEN:
			case K_INET:
			case K_INT:
			case K_LIST:
			case K_MAP:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIMEUUID:
			case K_TIME:
			case K_TINYINT:
			case K_TUPLE:
			case K_VARCHAR:
			case K_VARINT:
			case OBJECT_NAME:
			case K_USERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2076);
				match(DQUOTE);
				setState(2077);
				id();
				setState(2078);
				match(DQUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> DQUOTE() { return getTokens(CqlParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(CqlParser.DQUOTE, i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_column);
		try {
			setState(2087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ADD:
			case K_ALL:
			case K_ALLOW:
			case K_ALTER:
			case K_AND:
			case K_ANY:
			case K_APPLY:
			case K_AS:
			case K_ASC:
			case K_AUTHORIZE:
			case K_BATCH:
			case K_BEGIN:
			case K_BY:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONSISTENCY:
			case K_CONTAINS:
			case K_CREATE:
			case K_CUSTOM:
			case K_DELETE:
			case K_DESC:
			case K_DESCRIBE:
			case K_DISTINCT:
			case K_DROP:
			case K_DURABLE_WRITES:
			case K_EACH_QUORUM:
			case K_ENTRIES:
			case K_EXECUTE:
			case K_EXISTS:
			case K_FALSE:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROM:
			case K_FULL:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GRANT:
			case K_IF:
			case K_IN:
			case K_INDEX:
			case K_INFINITY:
			case K_INITCOND:
			case K_INPUT:
			case K_INSERT:
			case K_INTO:
			case K_IS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LEVEL:
			case K_LIMIT:
			case K_LOCAL_ONE:
			case K_LOCAL_QUORUM:
			case K_LOGGED:
			case K_LOGIN:
			case K_MATERIALIZED:
			case K_MODIFY:
			case K_NAN:
			case K_NORECURSIVE:
			case K_NOSUPERUSER:
			case K_NOT:
			case K_NULL:
			case K_OF:
			case K_ON:
			case K_ONE:
			case K_OPTIONS:
			case K_OR:
			case K_ORDER:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_PRIMARY:
			case K_QUORUM:
			case K_RENAME:
			case K_REPLACE:
			case K_REPLICATION:
			case K_RETURNS:
			case K_REVOKE:
			case K_ROLE:
			case K_ROLES:
			case K_SCHEMA:
			case K_SELECT:
			case K_SET:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLE:
			case K_THREE:
			case K_TIMESTAMP:
			case K_TO:
			case K_TOKEN:
			case K_TRIGGER:
			case K_TRUE:
			case K_TRUNCATE:
			case K_TTL:
			case K_TWO:
			case K_TYPE:
			case K_UNLOGGED:
			case K_UPDATE:
			case K_USE:
			case K_USER:
			case K_USING:
			case K_UUID:
			case K_VALUES:
			case K_VIEW:
			case K_WHERE:
			case K_WITH:
			case K_WRITETIME:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_COUNTER:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_FLOAT:
			case K_FROZEN:
			case K_INET:
			case K_INT:
			case K_LIST:
			case K_MAP:
			case K_SMALLINT:
			case K_TEXT:
			case K_TIMEUUID:
			case K_TIME:
			case K_TINYINT:
			case K_TUPLE:
			case K_VARCHAR:
			case K_VARINT:
			case OBJECT_NAME:
			case K_USERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2082);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2083);
				match(DQUOTE);
				setState(2084);
				id();
				setState(2085);
				match(DQUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeDefinitionContext dataTypeDefinition() {
			return getRuleContext(DataTypeDefinitionContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			dataTypeName();
			setState(2091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATOR_LT) {
				{
				setState(2090);
				dataTypeDefinition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CqlParser.STRING_LITERAL, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(CqlParser.K_TIMESTAMP, 0); }
		public TerminalNode K_SET() { return getToken(CqlParser.K_SET, 0); }
		public TerminalNode K_ASCII() { return getToken(CqlParser.K_ASCII, 0); }
		public TerminalNode K_BIGINT() { return getToken(CqlParser.K_BIGINT, 0); }
		public TerminalNode K_BLOB() { return getToken(CqlParser.K_BLOB, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(CqlParser.K_BOOLEAN, 0); }
		public TerminalNode K_COUNTER() { return getToken(CqlParser.K_COUNTER, 0); }
		public TerminalNode K_DATE() { return getToken(CqlParser.K_DATE, 0); }
		public TerminalNode K_DECIMAL() { return getToken(CqlParser.K_DECIMAL, 0); }
		public TerminalNode K_DOUBLE() { return getToken(CqlParser.K_DOUBLE, 0); }
		public TerminalNode K_FLOAT() { return getToken(CqlParser.K_FLOAT, 0); }
		public TerminalNode K_FROZEN() { return getToken(CqlParser.K_FROZEN, 0); }
		public TerminalNode K_INET() { return getToken(CqlParser.K_INET, 0); }
		public TerminalNode K_INT() { return getToken(CqlParser.K_INT, 0); }
		public TerminalNode K_LIST() { return getToken(CqlParser.K_LIST, 0); }
		public TerminalNode K_MAP() { return getToken(CqlParser.K_MAP, 0); }
		public TerminalNode K_SMALLINT() { return getToken(CqlParser.K_SMALLINT, 0); }
		public TerminalNode K_TEXT() { return getToken(CqlParser.K_TEXT, 0); }
		public TerminalNode K_TIME() { return getToken(CqlParser.K_TIME, 0); }
		public TerminalNode K_TIMEUUID() { return getToken(CqlParser.K_TIMEUUID, 0); }
		public TerminalNode K_TINYINT() { return getToken(CqlParser.K_TINYINT, 0); }
		public TerminalNode K_TUPLE() { return getToken(CqlParser.K_TUPLE, 0); }
		public TerminalNode K_VARCHAR() { return getToken(CqlParser.K_VARCHAR, 0); }
		public TerminalNode K_VARINT() { return getToken(CqlParser.K_VARINT, 0); }
		public TerminalNode K_UUID() { return getToken(CqlParser.K_UUID, 0); }
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dataTypeName);
		try {
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2094);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2095);
				match(K_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2096);
				match(K_SET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2097);
				match(K_ASCII);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2098);
				match(K_BIGINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2099);
				match(K_BLOB);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2100);
				match(K_BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2101);
				match(K_COUNTER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2102);
				match(K_DATE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2103);
				match(K_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2104);
				match(K_DOUBLE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2105);
				match(K_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2106);
				match(K_FROZEN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2107);
				match(K_INET);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2108);
				match(K_INT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2109);
				match(K_LIST);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2110);
				match(K_MAP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2111);
				match(K_SMALLINT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2112);
				match(K_TEXT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2113);
				match(K_TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2114);
				match(K_TIMEUUID);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2115);
				match(K_TINYINT);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2116);
				match(K_TUPLE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2117);
				match(K_VARCHAR);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2118);
				match(K_VARINT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2119);
				match(K_TIMESTAMP);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2120);
				match(K_UUID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeDefinitionContext extends ParserRuleContext {
		public SyntaxBracketLaContext syntaxBracketLa() {
			return getRuleContext(SyntaxBracketLaContext.class,0);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public SyntaxBracketRaContext syntaxBracketRa() {
			return getRuleContext(SyntaxBracketRaContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public DataTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDefinition; }
	}

	public final DataTypeDefinitionContext dataTypeDefinition() throws RecognitionException {
		DataTypeDefinitionContext _localctx = new DataTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			syntaxBracketLa();
			setState(2124);
			dataType();
			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2125);
				syntaxComma();
				setState(2126);
				dataType();
				}
				}
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2133);
			syntaxBracketRa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderDirectionContext extends ParserRuleContext {
		public KwAscContext kwAsc() {
			return getRuleContext(KwAscContext.class,0);
		}
		public KwDescContext kwDesc() {
			return getRuleContext(KwDescContext.class,0);
		}
		public OrderDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderDirection; }
	}

	public final OrderDirectionContext orderDirection() throws RecognitionException {
		OrderDirectionContext _localctx = new OrderDirectionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_orderDirection);
		try {
			setState(2137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2135);
				kwAsc();
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2136);
				kwDesc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggerContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggerClassContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TriggerClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerClass; }
	}

	public final TriggerClassContext triggerClass() throws RecognitionException {
		TriggerClassContext _localctx = new TriggerClassContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_triggerClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterializedViewContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MaterializedViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materializedView; }
	}

	public final MaterializedViewContext materializedView() throws RecognitionException {
		MaterializedViewContext _localctx = new MaterializedViewContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_materializedView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashKeyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public HashKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashKey; }
	}

	public final HashKeyContext hashKey() throws RecognitionException {
		HashKeyContext _localctx = new HashKeyContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_hashKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			paramName();
			setState(2162);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAddContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(CqlParser.K_ADD, 0); }
		public KwAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAdd; }
	}

	public final KwAddContext kwAdd() throws RecognitionException {
		KwAddContext _localctx = new KwAddContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_kwAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			match(K_ADD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAggregateContext extends ParserRuleContext {
		public TerminalNode K_AGGREGATE() { return getToken(CqlParser.K_AGGREGATE, 0); }
		public KwAggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAggregate; }
	}

	public final KwAggregateContext kwAggregate() throws RecognitionException {
		KwAggregateContext _localctx = new KwAggregateContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_kwAggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(K_AGGREGATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAllContext extends ParserRuleContext {
		public TerminalNode K_ALL() { return getToken(CqlParser.K_ALL, 0); }
		public KwAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAll; }
	}

	public final KwAllContext kwAll() throws RecognitionException {
		KwAllContext _localctx = new KwAllContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_kwAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			match(K_ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAllPermissionsContext extends ParserRuleContext {
		public TerminalNode K_ALL() { return getToken(CqlParser.K_ALL, 0); }
		public TerminalNode K_PERMISSIONS() { return getToken(CqlParser.K_PERMISSIONS, 0); }
		public KwAllPermissionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAllPermissions; }
	}

	public final KwAllPermissionsContext kwAllPermissions() throws RecognitionException {
		KwAllPermissionsContext _localctx = new KwAllPermissionsContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_kwAllPermissions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			match(K_ALL);
			setState(2173);
			match(K_PERMISSIONS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAllowContext extends ParserRuleContext {
		public TerminalNode K_ALLOW() { return getToken(CqlParser.K_ALLOW, 0); }
		public KwAllowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAllow; }
	}

	public final KwAllowContext kwAllow() throws RecognitionException {
		KwAllowContext _localctx = new KwAllowContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_kwAllow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			match(K_ALLOW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAlterContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(CqlParser.K_ALTER, 0); }
		public KwAlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAlter; }
	}

	public final KwAlterContext kwAlter() throws RecognitionException {
		KwAlterContext _localctx = new KwAlterContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_kwAlter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(K_ALTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAndContext extends ParserRuleContext {
		public TerminalNode K_AND() { return getToken(CqlParser.K_AND, 0); }
		public KwAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAnd; }
	}

	public final KwAndContext kwAnd() throws RecognitionException {
		KwAndContext _localctx = new KwAndContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_kwAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			match(K_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwApplyContext extends ParserRuleContext {
		public TerminalNode K_APPLY() { return getToken(CqlParser.K_APPLY, 0); }
		public KwApplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwApply; }
	}

	public final KwApplyContext kwApply() throws RecognitionException {
		KwApplyContext _localctx = new KwApplyContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_kwApply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			match(K_APPLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAsContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(CqlParser.K_AS, 0); }
		public KwAsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAs; }
	}

	public final KwAsContext kwAs() throws RecognitionException {
		KwAsContext _localctx = new KwAsContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_kwAs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(K_AS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAscContext extends ParserRuleContext {
		public TerminalNode K_ASC() { return getToken(CqlParser.K_ASC, 0); }
		public KwAscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAsc; }
	}

	public final KwAscContext kwAsc() throws RecognitionException {
		KwAscContext _localctx = new KwAscContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_kwAsc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			match(K_ASC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAuthorizeContext extends ParserRuleContext {
		public TerminalNode K_AUTHORIZE() { return getToken(CqlParser.K_AUTHORIZE, 0); }
		public KwAuthorizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAuthorize; }
	}

	public final KwAuthorizeContext kwAuthorize() throws RecognitionException {
		KwAuthorizeContext _localctx = new KwAuthorizeContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_kwAuthorize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			match(K_AUTHORIZE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwBatchContext extends ParserRuleContext {
		public TerminalNode K_BATCH() { return getToken(CqlParser.K_BATCH, 0); }
		public KwBatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwBatch; }
	}

	public final KwBatchContext kwBatch() throws RecognitionException {
		KwBatchContext _localctx = new KwBatchContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_kwBatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			match(K_BATCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwBeginContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(CqlParser.K_BEGIN, 0); }
		public KwBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwBegin; }
	}

	public final KwBeginContext kwBegin() throws RecognitionException {
		KwBeginContext _localctx = new KwBeginContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_kwBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			match(K_BEGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwByContext extends ParserRuleContext {
		public TerminalNode K_BY() { return getToken(CqlParser.K_BY, 0); }
		public KwByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwBy; }
	}

	public final KwByContext kwBy() throws RecognitionException {
		KwByContext _localctx = new KwByContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_kwBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(K_BY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwCalledContext extends ParserRuleContext {
		public TerminalNode K_CALLED() { return getToken(CqlParser.K_CALLED, 0); }
		public KwCalledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwCalled; }
	}

	public final KwCalledContext kwCalled() throws RecognitionException {
		KwCalledContext _localctx = new KwCalledContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_kwCalled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			match(K_CALLED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwClusteringContext extends ParserRuleContext {
		public TerminalNode K_CLUSTERING() { return getToken(CqlParser.K_CLUSTERING, 0); }
		public KwClusteringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwClustering; }
	}

	public final KwClusteringContext kwClustering() throws RecognitionException {
		KwClusteringContext _localctx = new KwClusteringContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_kwClustering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			match(K_CLUSTERING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwCompactContext extends ParserRuleContext {
		public TerminalNode K_COMPACT() { return getToken(CqlParser.K_COMPACT, 0); }
		public KwCompactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwCompact; }
	}

	public final KwCompactContext kwCompact() throws RecognitionException {
		KwCompactContext _localctx = new KwCompactContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_kwCompact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(K_COMPACT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwContainsContext extends ParserRuleContext {
		public TerminalNode K_CONTAINS() { return getToken(CqlParser.K_CONTAINS, 0); }
		public KwContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwContains; }
	}

	public final KwContainsContext kwContains() throws RecognitionException {
		KwContainsContext _localctx = new KwContainsContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_kwContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(K_CONTAINS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwCreateContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(CqlParser.K_CREATE, 0); }
		public KwCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwCreate; }
	}

	public final KwCreateContext kwCreate() throws RecognitionException {
		KwCreateContext _localctx = new KwCreateContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_kwCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			match(K_CREATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDeleteContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(CqlParser.K_DELETE, 0); }
		public KwDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDelete; }
	}

	public final KwDeleteContext kwDelete() throws RecognitionException {
		KwDeleteContext _localctx = new KwDeleteContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_kwDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			match(K_DELETE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDescContext extends ParserRuleContext {
		public TerminalNode K_DESC() { return getToken(CqlParser.K_DESC, 0); }
		public KwDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDesc; }
	}

	public final KwDescContext kwDesc() throws RecognitionException {
		KwDescContext _localctx = new KwDescContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_kwDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			match(K_DESC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDescibeContext extends ParserRuleContext {
		public TerminalNode K_DESCRIBE() { return getToken(CqlParser.K_DESCRIBE, 0); }
		public KwDescibeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDescibe; }
	}

	public final KwDescibeContext kwDescibe() throws RecognitionException {
		KwDescibeContext _localctx = new KwDescibeContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_kwDescibe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209);
			match(K_DESCRIBE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDistinctContext extends ParserRuleContext {
		public TerminalNode K_DISTINCT() { return getToken(CqlParser.K_DISTINCT, 0); }
		public KwDistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDistinct; }
	}

	public final KwDistinctContext kwDistinct() throws RecognitionException {
		KwDistinctContext _localctx = new KwDistinctContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_kwDistinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			match(K_DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDropContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(CqlParser.K_DROP, 0); }
		public KwDropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDrop; }
	}

	public final KwDropContext kwDrop() throws RecognitionException {
		KwDropContext _localctx = new KwDropContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_kwDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(K_DROP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDurableWritesContext extends ParserRuleContext {
		public TerminalNode K_DURABLE_WRITES() { return getToken(CqlParser.K_DURABLE_WRITES, 0); }
		public KwDurableWritesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDurableWrites; }
	}

	public final KwDurableWritesContext kwDurableWrites() throws RecognitionException {
		KwDurableWritesContext _localctx = new KwDurableWritesContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_kwDurableWrites);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			match(K_DURABLE_WRITES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwEntriesContext extends ParserRuleContext {
		public TerminalNode K_ENTRIES() { return getToken(CqlParser.K_ENTRIES, 0); }
		public KwEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwEntries; }
	}

	public final KwEntriesContext kwEntries() throws RecognitionException {
		KwEntriesContext _localctx = new KwEntriesContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_kwEntries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			match(K_ENTRIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwExecuteContext extends ParserRuleContext {
		public TerminalNode K_EXECUTE() { return getToken(CqlParser.K_EXECUTE, 0); }
		public KwExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwExecute; }
	}

	public final KwExecuteContext kwExecute() throws RecognitionException {
		KwExecuteContext _localctx = new KwExecuteContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_kwExecute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			match(K_EXECUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwExistsContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(CqlParser.K_EXISTS, 0); }
		public KwExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwExists; }
	}

	public final KwExistsContext kwExists() throws RecognitionException {
		KwExistsContext _localctx = new KwExistsContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_kwExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			match(K_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFilteringContext extends ParserRuleContext {
		public TerminalNode K_FILTERING() { return getToken(CqlParser.K_FILTERING, 0); }
		public KwFilteringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFiltering; }
	}

	public final KwFilteringContext kwFiltering() throws RecognitionException {
		KwFilteringContext _localctx = new KwFilteringContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_kwFiltering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			match(K_FILTERING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFinalfuncContext extends ParserRuleContext {
		public TerminalNode K_FINALFUNC() { return getToken(CqlParser.K_FINALFUNC, 0); }
		public KwFinalfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFinalfunc; }
	}

	public final KwFinalfuncContext kwFinalfunc() throws RecognitionException {
		KwFinalfuncContext _localctx = new KwFinalfuncContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_kwFinalfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(K_FINALFUNC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFromContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(CqlParser.K_FROM, 0); }
		public KwFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFrom; }
	}

	public final KwFromContext kwFrom() throws RecognitionException {
		KwFromContext _localctx = new KwFromContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_kwFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			match(K_FROM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFullContext extends ParserRuleContext {
		public TerminalNode K_FULL() { return getToken(CqlParser.K_FULL, 0); }
		public KwFullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFull; }
	}

	public final KwFullContext kwFull() throws RecognitionException {
		KwFullContext _localctx = new KwFullContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_kwFull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(K_FULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFunctionContext extends ParserRuleContext {
		public TerminalNode K_FUNCTION() { return getToken(CqlParser.K_FUNCTION, 0); }
		public KwFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFunction; }
	}

	public final KwFunctionContext kwFunction() throws RecognitionException {
		KwFunctionContext _localctx = new KwFunctionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_kwFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			match(K_FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFunctionsContext extends ParserRuleContext {
		public TerminalNode K_FUNCTIONS() { return getToken(CqlParser.K_FUNCTIONS, 0); }
		public KwFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFunctions; }
	}

	public final KwFunctionsContext kwFunctions() throws RecognitionException {
		KwFunctionsContext _localctx = new KwFunctionsContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_kwFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			match(K_FUNCTIONS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwGrantContext extends ParserRuleContext {
		public TerminalNode K_GRANT() { return getToken(CqlParser.K_GRANT, 0); }
		public KwGrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwGrant; }
	}

	public final KwGrantContext kwGrant() throws RecognitionException {
		KwGrantContext _localctx = new KwGrantContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_kwGrant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(K_GRANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwIfContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(CqlParser.K_IF, 0); }
		public KwIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwIf; }
	}

	public final KwIfContext kwIf() throws RecognitionException {
		KwIfContext _localctx = new KwIfContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_kwIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			match(K_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwInContext extends ParserRuleContext {
		public TerminalNode K_IN() { return getToken(CqlParser.K_IN, 0); }
		public KwInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwIn; }
	}

	public final KwInContext kwIn() throws RecognitionException {
		KwInContext _localctx = new KwInContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_kwIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			match(K_IN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwIndexContext extends ParserRuleContext {
		public TerminalNode K_INDEX() { return getToken(CqlParser.K_INDEX, 0); }
		public KwIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwIndex; }
	}

	public final KwIndexContext kwIndex() throws RecognitionException {
		KwIndexContext _localctx = new KwIndexContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_kwIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			match(K_INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwInitcondContext extends ParserRuleContext {
		public TerminalNode K_INITCOND() { return getToken(CqlParser.K_INITCOND, 0); }
		public KwInitcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwInitcond; }
	}

	public final KwInitcondContext kwInitcond() throws RecognitionException {
		KwInitcondContext _localctx = new KwInitcondContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_kwInitcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(K_INITCOND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwInputContext extends ParserRuleContext {
		public TerminalNode K_INPUT() { return getToken(CqlParser.K_INPUT, 0); }
		public KwInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwInput; }
	}

	public final KwInputContext kwInput() throws RecognitionException {
		KwInputContext _localctx = new KwInputContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_kwInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			match(K_INPUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwInsertContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(CqlParser.K_INSERT, 0); }
		public KwInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwInsert; }
	}

	public final KwInsertContext kwInsert() throws RecognitionException {
		KwInsertContext _localctx = new KwInsertContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_kwInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			match(K_INSERT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwIntoContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(CqlParser.K_INTO, 0); }
		public KwIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwInto; }
	}

	public final KwIntoContext kwInto() throws RecognitionException {
		KwIntoContext _localctx = new KwIntoContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_kwInto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			match(K_INTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwIsContext extends ParserRuleContext {
		public TerminalNode K_IS() { return getToken(CqlParser.K_IS, 0); }
		public KwIsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwIs; }
	}

	public final KwIsContext kwIs() throws RecognitionException {
		KwIsContext _localctx = new KwIsContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_kwIs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(K_IS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwJsonContext extends ParserRuleContext {
		public TerminalNode K_JSON() { return getToken(CqlParser.K_JSON, 0); }
		public KwJsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwJson; }
	}

	public final KwJsonContext kwJson() throws RecognitionException {
		KwJsonContext _localctx = new KwJsonContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_kwJson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			match(K_JSON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwKeyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(CqlParser.K_KEY, 0); }
		public KwKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwKey; }
	}

	public final KwKeyContext kwKey() throws RecognitionException {
		KwKeyContext _localctx = new KwKeyContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_kwKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(K_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwKeysContext extends ParserRuleContext {
		public TerminalNode K_KEYS() { return getToken(CqlParser.K_KEYS, 0); }
		public KwKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwKeys; }
	}

	public final KwKeysContext kwKeys() throws RecognitionException {
		KwKeysContext _localctx = new KwKeysContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_kwKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			match(K_KEYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwKeyspaceContext extends ParserRuleContext {
		public TerminalNode K_KEYSPACE() { return getToken(CqlParser.K_KEYSPACE, 0); }
		public KwKeyspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwKeyspace; }
	}

	public final KwKeyspaceContext kwKeyspace() throws RecognitionException {
		KwKeyspaceContext _localctx = new KwKeyspaceContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_kwKeyspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(K_KEYSPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwKeyspacesContext extends ParserRuleContext {
		public TerminalNode K_KEYSPACES() { return getToken(CqlParser.K_KEYSPACES, 0); }
		public KwKeyspacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwKeyspaces; }
	}

	public final KwKeyspacesContext kwKeyspaces() throws RecognitionException {
		KwKeyspacesContext _localctx = new KwKeyspacesContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_kwKeyspaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			match(K_KEYSPACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwLanguageContext extends ParserRuleContext {
		public TerminalNode K_LANGUAGE() { return getToken(CqlParser.K_LANGUAGE, 0); }
		public KwLanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwLanguage; }
	}

	public final KwLanguageContext kwLanguage() throws RecognitionException {
		KwLanguageContext _localctx = new KwLanguageContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_kwLanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2263);
			match(K_LANGUAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwLimitContext extends ParserRuleContext {
		public TerminalNode K_LIMIT() { return getToken(CqlParser.K_LIMIT, 0); }
		public KwLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwLimit; }
	}

	public final KwLimitContext kwLimit() throws RecognitionException {
		KwLimitContext _localctx = new KwLimitContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_kwLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			match(K_LIMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwListContext extends ParserRuleContext {
		public TerminalNode K_LIST() { return getToken(CqlParser.K_LIST, 0); }
		public KwListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwList; }
	}

	public final KwListContext kwList() throws RecognitionException {
		KwListContext _localctx = new KwListContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_kwList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			match(K_LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwLoggedContext extends ParserRuleContext {
		public TerminalNode K_LOGGED() { return getToken(CqlParser.K_LOGGED, 0); }
		public KwLoggedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwLogged; }
	}

	public final KwLoggedContext kwLogged() throws RecognitionException {
		KwLoggedContext _localctx = new KwLoggedContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_kwLogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			match(K_LOGGED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwLoginContext extends ParserRuleContext {
		public TerminalNode K_LOGIN() { return getToken(CqlParser.K_LOGIN, 0); }
		public KwLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwLogin; }
	}

	public final KwLoginContext kwLogin() throws RecognitionException {
		KwLoginContext _localctx = new KwLoginContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_kwLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			match(K_LOGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwMaterializedContext extends ParserRuleContext {
		public TerminalNode K_MATERIALIZED() { return getToken(CqlParser.K_MATERIALIZED, 0); }
		public KwMaterializedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwMaterialized; }
	}

	public final KwMaterializedContext kwMaterialized() throws RecognitionException {
		KwMaterializedContext _localctx = new KwMaterializedContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_kwMaterialized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			match(K_MATERIALIZED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwModifyContext extends ParserRuleContext {
		public TerminalNode K_MODIFY() { return getToken(CqlParser.K_MODIFY, 0); }
		public KwModifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwModify; }
	}

	public final KwModifyContext kwModify() throws RecognitionException {
		KwModifyContext _localctx = new KwModifyContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_kwModify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			match(K_MODIFY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNosuperuserContext extends ParserRuleContext {
		public TerminalNode K_NOSUPERUSER() { return getToken(CqlParser.K_NOSUPERUSER, 0); }
		public KwNosuperuserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNosuperuser; }
	}

	public final KwNosuperuserContext kwNosuperuser() throws RecognitionException {
		KwNosuperuserContext _localctx = new KwNosuperuserContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_kwNosuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			match(K_NOSUPERUSER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNorecursiveContext extends ParserRuleContext {
		public TerminalNode K_NORECURSIVE() { return getToken(CqlParser.K_NORECURSIVE, 0); }
		public KwNorecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNorecursive; }
	}

	public final KwNorecursiveContext kwNorecursive() throws RecognitionException {
		KwNorecursiveContext _localctx = new KwNorecursiveContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_kwNorecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			match(K_NORECURSIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNotContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(CqlParser.K_NOT, 0); }
		public KwNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNot; }
	}

	public final KwNotContext kwNot() throws RecognitionException {
		KwNotContext _localctx = new KwNotContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_kwNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			match(K_NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(CqlParser.K_NULL, 0); }
		public KwNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNull; }
	}

	public final KwNullContext kwNull() throws RecognitionException {
		KwNullContext _localctx = new KwNullContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_kwNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwOfContext extends ParserRuleContext {
		public TerminalNode K_OF() { return getToken(CqlParser.K_OF, 0); }
		public KwOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwOf; }
	}

	public final KwOfContext kwOf() throws RecognitionException {
		KwOfContext _localctx = new KwOfContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_kwOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			match(K_OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwOnContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(CqlParser.K_ON, 0); }
		public KwOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwOn; }
	}

	public final KwOnContext kwOn() throws RecognitionException {
		KwOnContext _localctx = new KwOnContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_kwOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			match(K_ON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwOptionsContext extends ParserRuleContext {
		public TerminalNode K_OPTIONS() { return getToken(CqlParser.K_OPTIONS, 0); }
		public KwOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwOptions; }
	}

	public final KwOptionsContext kwOptions() throws RecognitionException {
		KwOptionsContext _localctx = new KwOptionsContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_kwOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			match(K_OPTIONS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwOrContext extends ParserRuleContext {
		public TerminalNode K_OR() { return getToken(CqlParser.K_OR, 0); }
		public KwOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwOr; }
	}

	public final KwOrContext kwOr() throws RecognitionException {
		KwOrContext _localctx = new KwOrContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_kwOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(K_OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwOrderContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(CqlParser.K_ORDER, 0); }
		public KwOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwOrder; }
	}

	public final KwOrderContext kwOrder() throws RecognitionException {
		KwOrderContext _localctx = new KwOrderContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_kwOrder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(K_ORDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwPasswordContext extends ParserRuleContext {
		public TerminalNode K_PASSWORD() { return getToken(CqlParser.K_PASSWORD, 0); }
		public KwPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwPassword; }
	}

	public final KwPasswordContext kwPassword() throws RecognitionException {
		KwPasswordContext _localctx = new KwPasswordContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_kwPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			match(K_PASSWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwPrimaryContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(CqlParser.K_PRIMARY, 0); }
		public KwPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwPrimary; }
	}

	public final KwPrimaryContext kwPrimary() throws RecognitionException {
		KwPrimaryContext _localctx = new KwPrimaryContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_kwPrimary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			match(K_PRIMARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRenameContext extends ParserRuleContext {
		public TerminalNode K_RENAME() { return getToken(CqlParser.K_RENAME, 0); }
		public KwRenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRename; }
	}

	public final KwRenameContext kwRename() throws RecognitionException {
		KwRenameContext _localctx = new KwRenameContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_kwRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			match(K_RENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwReplaceContext extends ParserRuleContext {
		public TerminalNode K_REPLACE() { return getToken(CqlParser.K_REPLACE, 0); }
		public KwReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwReplace; }
	}

	public final KwReplaceContext kwReplace() throws RecognitionException {
		KwReplaceContext _localctx = new KwReplaceContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_kwReplace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(K_REPLACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwReplicationContext extends ParserRuleContext {
		public TerminalNode K_REPLICATION() { return getToken(CqlParser.K_REPLICATION, 0); }
		public KwReplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwReplication; }
	}

	public final KwReplicationContext kwReplication() throws RecognitionException {
		KwReplicationContext _localctx = new KwReplicationContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_kwReplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			match(K_REPLICATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwReturnsContext extends ParserRuleContext {
		public TerminalNode K_RETURNS() { return getToken(CqlParser.K_RETURNS, 0); }
		public KwReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwReturns; }
	}

	public final KwReturnsContext kwReturns() throws RecognitionException {
		KwReturnsContext _localctx = new KwReturnsContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_kwReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			match(K_RETURNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRoleContext extends ParserRuleContext {
		public TerminalNode K_ROLE() { return getToken(CqlParser.K_ROLE, 0); }
		public KwRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRole; }
	}

	public final KwRoleContext kwRole() throws RecognitionException {
		KwRoleContext _localctx = new KwRoleContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_kwRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(K_ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwInternalContext extends ParserRuleContext {
		public TerminalNode K_INTERNAL() { return getToken(CqlParser.K_INTERNAL, 0); }
		public KwInternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwInternal; }
	}

	public final KwInternalContext kwInternal() throws RecognitionException {
		KwInternalContext _localctx = new KwInternalContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_kwInternal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			match(K_INTERNAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwLdapContext extends ParserRuleContext {
		public TerminalNode K_LDAP() { return getToken(CqlParser.K_LDAP, 0); }
		public KwLdapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwLdap; }
	}

	public final KwLdapContext kwLdap() throws RecognitionException {
		KwLdapContext _localctx = new KwLdapContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_kwLdap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			match(K_LDAP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSchemeContext extends ParserRuleContext {
		public TerminalNode K_SCHEME() { return getToken(CqlParser.K_SCHEME, 0); }
		public KwSchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwScheme; }
	}

	public final KwSchemeContext kwScheme() throws RecognitionException {
		KwSchemeContext _localctx = new KwSchemeContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_kwScheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(K_SCHEME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRolesContext extends ParserRuleContext {
		public TerminalNode K_ROLES() { return getToken(CqlParser.K_ROLES, 0); }
		public KwRolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRoles; }
	}

	public final KwRolesContext kwRoles() throws RecognitionException {
		KwRolesContext _localctx = new KwRolesContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_kwRoles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			match(K_ROLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSelectContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(CqlParser.K_SELECT, 0); }
		public KwSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSelect; }
	}

	public final KwSelectContext kwSelect() throws RecognitionException {
		KwSelectContext _localctx = new KwSelectContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_kwSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			match(K_SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSetContext extends ParserRuleContext {
		public TerminalNode K_SET() { return getToken(CqlParser.K_SET, 0); }
		public KwSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSet; }
	}

	public final KwSetContext kwSet() throws RecognitionException {
		KwSetContext _localctx = new KwSetContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_kwSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			match(K_SET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSfuncContext extends ParserRuleContext {
		public TerminalNode K_SFUNC() { return getToken(CqlParser.K_SFUNC, 0); }
		public KwSfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSfunc; }
	}

	public final KwSfuncContext kwSfunc() throws RecognitionException {
		KwSfuncContext _localctx = new KwSfuncContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_kwSfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			match(K_SFUNC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwStorageContext extends ParserRuleContext {
		public TerminalNode K_STORAGE() { return getToken(CqlParser.K_STORAGE, 0); }
		public KwStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwStorage; }
	}

	public final KwStorageContext kwStorage() throws RecognitionException {
		KwStorageContext _localctx = new KwStorageContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_kwStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			match(K_STORAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwStypeContext extends ParserRuleContext {
		public TerminalNode K_STYPE() { return getToken(CqlParser.K_STYPE, 0); }
		public KwStypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwStype; }
	}

	public final KwStypeContext kwStype() throws RecognitionException {
		KwStypeContext _localctx = new KwStypeContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_kwStype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			match(K_STYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSuperuserContext extends ParserRuleContext {
		public TerminalNode K_SUPERUSER() { return getToken(CqlParser.K_SUPERUSER, 0); }
		public KwSuperuserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSuperuser; }
	}

	public final KwSuperuserContext kwSuperuser() throws RecognitionException {
		KwSuperuserContext _localctx = new KwSuperuserContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_kwSuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			match(K_SUPERUSER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTableContext extends ParserRuleContext {
		public TerminalNode K_TABLE() { return getToken(CqlParser.K_TABLE, 0); }
		public KwTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTable; }
	}

	public final KwTableContext kwTable() throws RecognitionException {
		KwTableContext _localctx = new KwTableContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_kwTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
			match(K_TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTimestampContext extends ParserRuleContext {
		public TerminalNode K_TIMESTAMP() { return getToken(CqlParser.K_TIMESTAMP, 0); }
		public KwTimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTimestamp; }
	}

	public final KwTimestampContext kwTimestamp() throws RecognitionException {
		KwTimestampContext _localctx = new KwTimestampContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_kwTimestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			match(K_TIMESTAMP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwToContext extends ParserRuleContext {
		public TerminalNode K_TO() { return getToken(CqlParser.K_TO, 0); }
		public KwToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTo; }
	}

	public final KwToContext kwTo() throws RecognitionException {
		KwToContext _localctx = new KwToContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_kwTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			match(K_TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTriggerContext extends ParserRuleContext {
		public TerminalNode K_TRIGGER() { return getToken(CqlParser.K_TRIGGER, 0); }
		public KwTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTrigger; }
	}

	public final KwTriggerContext kwTrigger() throws RecognitionException {
		KwTriggerContext _localctx = new KwTriggerContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_kwTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			match(K_TRIGGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTruncateContext extends ParserRuleContext {
		public TerminalNode K_TRUNCATE() { return getToken(CqlParser.K_TRUNCATE, 0); }
		public KwTruncateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTruncate; }
	}

	public final KwTruncateContext kwTruncate() throws RecognitionException {
		KwTruncateContext _localctx = new KwTruncateContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_kwTruncate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			match(K_TRUNCATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTtlContext extends ParserRuleContext {
		public TerminalNode K_TTL() { return getToken(CqlParser.K_TTL, 0); }
		public KwTtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTtl; }
	}

	public final KwTtlContext kwTtl() throws RecognitionException {
		KwTtlContext _localctx = new KwTtlContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_kwTtl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			match(K_TTL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTypeContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(CqlParser.K_TYPE, 0); }
		public KwTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwType; }
	}

	public final KwTypeContext kwType() throws RecognitionException {
		KwTypeContext _localctx = new KwTypeContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_kwType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(K_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwUnloggedContext extends ParserRuleContext {
		public TerminalNode K_UNLOGGED() { return getToken(CqlParser.K_UNLOGGED, 0); }
		public KwUnloggedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwUnlogged; }
	}

	public final KwUnloggedContext kwUnlogged() throws RecognitionException {
		KwUnloggedContext _localctx = new KwUnloggedContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_kwUnlogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			match(K_UNLOGGED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwUpdateContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(CqlParser.K_UPDATE, 0); }
		public KwUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwUpdate; }
	}

	public final KwUpdateContext kwUpdate() throws RecognitionException {
		KwUpdateContext _localctx = new KwUpdateContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_kwUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			match(K_UPDATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwUseContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(CqlParser.K_USE, 0); }
		public KwUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwUse; }
	}

	public final KwUseContext kwUse() throws RecognitionException {
		KwUseContext _localctx = new KwUseContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_kwUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(K_USE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwUserContext extends ParserRuleContext {
		public TerminalNode K_USER() { return getToken(CqlParser.K_USER, 0); }
		public KwUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwUser; }
	}

	public final KwUserContext kwUser() throws RecognitionException {
		KwUserContext _localctx = new KwUserContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_kwUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(K_USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwUsersContext extends ParserRuleContext {
		public TerminalNode K_USERS() { return getToken(CqlParser.K_USERS, 0); }
		public KwUsersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwUsers; }
	}

	public final KwUsersContext kwUsers() throws RecognitionException {
		KwUsersContext _localctx = new KwUsersContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_kwUsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			match(K_USERS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwUsingContext extends ParserRuleContext {
		public TerminalNode K_USING() { return getToken(CqlParser.K_USING, 0); }
		public KwUsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwUsing; }
	}

	public final KwUsingContext kwUsing() throws RecognitionException {
		KwUsingContext _localctx = new KwUsingContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_kwUsing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(K_USING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwValuesContext extends ParserRuleContext {
		public TerminalNode K_VALUES() { return getToken(CqlParser.K_VALUES, 0); }
		public KwValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwValues; }
	}

	public final KwValuesContext kwValues() throws RecognitionException {
		KwValuesContext _localctx = new KwValuesContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_kwValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(K_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwViewContext extends ParserRuleContext {
		public TerminalNode K_VIEW() { return getToken(CqlParser.K_VIEW, 0); }
		public KwViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwView; }
	}

	public final KwViewContext kwView() throws RecognitionException {
		KwViewContext _localctx = new KwViewContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_kwView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			match(K_VIEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwWhereContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(CqlParser.K_WHERE, 0); }
		public KwWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwWhere; }
	}

	public final KwWhereContext kwWhere() throws RecognitionException {
		KwWhereContext _localctx = new KwWhereContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_kwWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			match(K_WHERE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwWithContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(CqlParser.K_WITH, 0); }
		public KwWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwWith; }
	}

	public final KwWithContext kwWith() throws RecognitionException {
		KwWithContext _localctx = new KwWithContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_kwWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			match(K_WITH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRevokeContext extends ParserRuleContext {
		public TerminalNode K_REVOKE() { return getToken(CqlParser.K_REVOKE, 0); }
		public KwRevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRevoke; }
	}

	public final KwRevokeContext kwRevoke() throws RecognitionException {
		KwRevokeContext _localctx = new KwRevokeContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_kwRevoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			match(K_REVOKE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CqlParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketLrContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(CqlParser.LR_BRACKET, 0); }
		public SyntaxBracketLrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketLr; }
	}

	public final SyntaxBracketLrContext syntaxBracketLr() throws RecognitionException {
		SyntaxBracketLrContext _localctx = new SyntaxBracketLrContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_syntaxBracketLr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			match(LR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketRrContext extends ParserRuleContext {
		public TerminalNode RR_BRACKET() { return getToken(CqlParser.RR_BRACKET, 0); }
		public SyntaxBracketRrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketRr; }
	}

	public final SyntaxBracketRrContext syntaxBracketRr() throws RecognitionException {
		SyntaxBracketRrContext _localctx = new SyntaxBracketRrContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_syntaxBracketRr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketLcContext extends ParserRuleContext {
		public TerminalNode LC_BRACKET() { return getToken(CqlParser.LC_BRACKET, 0); }
		public SyntaxBracketLcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketLc; }
	}

	public final SyntaxBracketLcContext syntaxBracketLc() throws RecognitionException {
		SyntaxBracketLcContext _localctx = new SyntaxBracketLcContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_syntaxBracketLc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			match(LC_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketRcContext extends ParserRuleContext {
		public TerminalNode RC_BRACKET() { return getToken(CqlParser.RC_BRACKET, 0); }
		public SyntaxBracketRcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketRc; }
	}

	public final SyntaxBracketRcContext syntaxBracketRc() throws RecognitionException {
		SyntaxBracketRcContext _localctx = new SyntaxBracketRcContext(_ctx, getState());
		enterRule(_localctx, 554, RULE_syntaxBracketRc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			match(RC_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketLaContext extends ParserRuleContext {
		public TerminalNode OPERATOR_LT() { return getToken(CqlParser.OPERATOR_LT, 0); }
		public SyntaxBracketLaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketLa; }
	}

	public final SyntaxBracketLaContext syntaxBracketLa() throws RecognitionException {
		SyntaxBracketLaContext _localctx = new SyntaxBracketLaContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_syntaxBracketLa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			match(OPERATOR_LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketRaContext extends ParserRuleContext {
		public TerminalNode OPERATOR_GT() { return getToken(CqlParser.OPERATOR_GT, 0); }
		public SyntaxBracketRaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketRa; }
	}

	public final SyntaxBracketRaContext syntaxBracketRa() throws RecognitionException {
		SyntaxBracketRaContext _localctx = new SyntaxBracketRaContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_syntaxBracketRa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			match(OPERATOR_GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketLsContext extends ParserRuleContext {
		public TerminalNode LS_BRACKET() { return getToken(CqlParser.LS_BRACKET, 0); }
		public SyntaxBracketLsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketLs; }
	}

	public final SyntaxBracketLsContext syntaxBracketLs() throws RecognitionException {
		SyntaxBracketLsContext _localctx = new SyntaxBracketLsContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_syntaxBracketLs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			match(LS_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxBracketRsContext extends ParserRuleContext {
		public TerminalNode RS_BRACKET() { return getToken(CqlParser.RS_BRACKET, 0); }
		public SyntaxBracketRsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxBracketRs; }
	}

	public final SyntaxBracketRsContext syntaxBracketRs() throws RecognitionException {
		SyntaxBracketRsContext _localctx = new SyntaxBracketRsContext(_ctx, getState());
		enterRule(_localctx, 562, RULE_syntaxBracketRs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			match(RS_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxCommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CqlParser.COMMA, 0); }
		public SyntaxCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxComma; }
	}

	public final SyntaxCommaContext syntaxComma() throws RecognitionException {
		SyntaxCommaContext _localctx = new SyntaxCommaContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_syntaxComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxColonContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CqlParser.COLON, 0); }
		public SyntaxColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxColon; }
	}

	public final SyntaxColonContext syntaxColon() throws RecognitionException {
		SyntaxColonContext _localctx = new SyntaxColonContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_syntaxColon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode OBJECT_NAME() { return getToken(CqlParser.OBJECT_NAME, 0); }
		public TerminalNode K_ADD() { return getToken(CqlParser.K_ADD, 0); }
		public TerminalNode K_AGGREGATE() { return getToken(CqlParser.K_AGGREGATE, 0); }
		public TerminalNode K_ALL() { return getToken(CqlParser.K_ALL, 0); }
		public TerminalNode K_ALLOW() { return getToken(CqlParser.K_ALLOW, 0); }
		public TerminalNode K_ALTER() { return getToken(CqlParser.K_ALTER, 0); }
		public TerminalNode K_AND() { return getToken(CqlParser.K_AND, 0); }
		public TerminalNode K_ANY() { return getToken(CqlParser.K_ANY, 0); }
		public TerminalNode K_APPLY() { return getToken(CqlParser.K_APPLY, 0); }
		public TerminalNode K_AS() { return getToken(CqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(CqlParser.K_ASC, 0); }
		public TerminalNode K_AUTHORIZE() { return getToken(CqlParser.K_AUTHORIZE, 0); }
		public TerminalNode K_BATCH() { return getToken(CqlParser.K_BATCH, 0); }
		public TerminalNode K_BEGIN() { return getToken(CqlParser.K_BEGIN, 0); }
		public TerminalNode K_BY() { return getToken(CqlParser.K_BY, 0); }
		public TerminalNode K_CALLED() { return getToken(CqlParser.K_CALLED, 0); }
		public TerminalNode K_CLUSTERING() { return getToken(CqlParser.K_CLUSTERING, 0); }
		public TerminalNode K_COLUMNFAMILY() { return getToken(CqlParser.K_COLUMNFAMILY, 0); }
		public TerminalNode K_COMPACT() { return getToken(CqlParser.K_COMPACT, 0); }
		public TerminalNode K_CONSISTENCY() { return getToken(CqlParser.K_CONSISTENCY, 0); }
		public TerminalNode K_CONTAINS() { return getToken(CqlParser.K_CONTAINS, 0); }
		public TerminalNode K_CREATE() { return getToken(CqlParser.K_CREATE, 0); }
		public TerminalNode K_CUSTOM() { return getToken(CqlParser.K_CUSTOM, 0); }
		public TerminalNode K_DELETE() { return getToken(CqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(CqlParser.K_DESC, 0); }
		public TerminalNode K_DESCRIBE() { return getToken(CqlParser.K_DESCRIBE, 0); }
		public TerminalNode K_DISTINCT() { return getToken(CqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(CqlParser.K_DROP, 0); }
		public TerminalNode K_DURABLE_WRITES() { return getToken(CqlParser.K_DURABLE_WRITES, 0); }
		public TerminalNode K_EACH_QUORUM() { return getToken(CqlParser.K_EACH_QUORUM, 0); }
		public TerminalNode K_ENTRIES() { return getToken(CqlParser.K_ENTRIES, 0); }
		public TerminalNode K_EXECUTE() { return getToken(CqlParser.K_EXECUTE, 0); }
		public TerminalNode K_EXISTS() { return getToken(CqlParser.K_EXISTS, 0); }
		public TerminalNode K_FALSE() { return getToken(CqlParser.K_FALSE, 0); }
		public TerminalNode K_FILTERING() { return getToken(CqlParser.K_FILTERING, 0); }
		public TerminalNode K_FINALFUNC() { return getToken(CqlParser.K_FINALFUNC, 0); }
		public TerminalNode K_FROM() { return getToken(CqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(CqlParser.K_FULL, 0); }
		public TerminalNode K_FUNCTION() { return getToken(CqlParser.K_FUNCTION, 0); }
		public TerminalNode K_FUNCTIONS() { return getToken(CqlParser.K_FUNCTIONS, 0); }
		public TerminalNode K_GRANT() { return getToken(CqlParser.K_GRANT, 0); }
		public TerminalNode K_IF() { return getToken(CqlParser.K_IF, 0); }
		public TerminalNode K_IN() { return getToken(CqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(CqlParser.K_INDEX, 0); }
		public TerminalNode K_INFINITY() { return getToken(CqlParser.K_INFINITY, 0); }
		public TerminalNode K_INITCOND() { return getToken(CqlParser.K_INITCOND, 0); }
		public TerminalNode K_INPUT() { return getToken(CqlParser.K_INPUT, 0); }
		public TerminalNode K_INSERT() { return getToken(CqlParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(CqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(CqlParser.K_IS, 0); }
		public TerminalNode K_JSON() { return getToken(CqlParser.K_JSON, 0); }
		public TerminalNode K_KEY() { return getToken(CqlParser.K_KEY, 0); }
		public TerminalNode K_KEYS() { return getToken(CqlParser.K_KEYS, 0); }
		public TerminalNode K_KEYSPACE() { return getToken(CqlParser.K_KEYSPACE, 0); }
		public TerminalNode K_KEYSPACES() { return getToken(CqlParser.K_KEYSPACES, 0); }
		public TerminalNode K_LANGUAGE() { return getToken(CqlParser.K_LANGUAGE, 0); }
		public TerminalNode K_LEVEL() { return getToken(CqlParser.K_LEVEL, 0); }
		public TerminalNode K_LIMIT() { return getToken(CqlParser.K_LIMIT, 0); }
		public TerminalNode K_LOCAL_ONE() { return getToken(CqlParser.K_LOCAL_ONE, 0); }
		public TerminalNode K_LOCAL_QUORUM() { return getToken(CqlParser.K_LOCAL_QUORUM, 0); }
		public TerminalNode K_LOGGED() { return getToken(CqlParser.K_LOGGED, 0); }
		public TerminalNode K_LOGIN() { return getToken(CqlParser.K_LOGIN, 0); }
		public TerminalNode K_MATERIALIZED() { return getToken(CqlParser.K_MATERIALIZED, 0); }
		public TerminalNode K_MODIFY() { return getToken(CqlParser.K_MODIFY, 0); }
		public TerminalNode K_NAN() { return getToken(CqlParser.K_NAN, 0); }
		public TerminalNode K_NORECURSIVE() { return getToken(CqlParser.K_NORECURSIVE, 0); }
		public TerminalNode K_NOSUPERUSER() { return getToken(CqlParser.K_NOSUPERUSER, 0); }
		public TerminalNode K_NOT() { return getToken(CqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(CqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(CqlParser.K_OF, 0); }
		public TerminalNode K_ON() { return getToken(CqlParser.K_ON, 0); }
		public TerminalNode K_ONE() { return getToken(CqlParser.K_ONE, 0); }
		public TerminalNode K_OPTIONS() { return getToken(CqlParser.K_OPTIONS, 0); }
		public TerminalNode K_OR() { return getToken(CqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(CqlParser.K_ORDER, 0); }
		public TerminalNode K_PARTITION() { return getToken(CqlParser.K_PARTITION, 0); }
		public TerminalNode K_PASSWORD() { return getToken(CqlParser.K_PASSWORD, 0); }
		public TerminalNode K_PER() { return getToken(CqlParser.K_PER, 0); }
		public TerminalNode K_PERMISSION() { return getToken(CqlParser.K_PERMISSION, 0); }
		public TerminalNode K_PERMISSIONS() { return getToken(CqlParser.K_PERMISSIONS, 0); }
		public TerminalNode K_PRIMARY() { return getToken(CqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUORUM() { return getToken(CqlParser.K_QUORUM, 0); }
		public TerminalNode K_RENAME() { return getToken(CqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(CqlParser.K_REPLACE, 0); }
		public TerminalNode K_REPLICATION() { return getToken(CqlParser.K_REPLICATION, 0); }
		public TerminalNode K_RETURNS() { return getToken(CqlParser.K_RETURNS, 0); }
		public TerminalNode K_REVOKE() { return getToken(CqlParser.K_REVOKE, 0); }
		public TerminalNode K_ROLE() { return getToken(CqlParser.K_ROLE, 0); }
		public TerminalNode K_ROLES() { return getToken(CqlParser.K_ROLES, 0); }
		public TerminalNode K_SCHEMA() { return getToken(CqlParser.K_SCHEMA, 0); }
		public TerminalNode K_SELECT() { return getToken(CqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(CqlParser.K_SET, 0); }
		public TerminalNode K_SFUNC() { return getToken(CqlParser.K_SFUNC, 0); }
		public TerminalNode K_STATIC() { return getToken(CqlParser.K_STATIC, 0); }
		public TerminalNode K_STORAGE() { return getToken(CqlParser.K_STORAGE, 0); }
		public TerminalNode K_STYPE() { return getToken(CqlParser.K_STYPE, 0); }
		public TerminalNode K_SUPERUSER() { return getToken(CqlParser.K_SUPERUSER, 0); }
		public TerminalNode K_TABLE() { return getToken(CqlParser.K_TABLE, 0); }
		public TerminalNode K_THREE() { return getToken(CqlParser.K_THREE, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(CqlParser.K_TIMESTAMP, 0); }
		public TerminalNode K_TO() { return getToken(CqlParser.K_TO, 0); }
		public TerminalNode K_TOKEN() { return getToken(CqlParser.K_TOKEN, 0); }
		public TerminalNode K_TRIGGER() { return getToken(CqlParser.K_TRIGGER, 0); }
		public TerminalNode K_TRUE() { return getToken(CqlParser.K_TRUE, 0); }
		public TerminalNode K_TRUNCATE() { return getToken(CqlParser.K_TRUNCATE, 0); }
		public TerminalNode K_TTL() { return getToken(CqlParser.K_TTL, 0); }
		public TerminalNode K_TWO() { return getToken(CqlParser.K_TWO, 0); }
		public TerminalNode K_TYPE() { return getToken(CqlParser.K_TYPE, 0); }
		public TerminalNode K_UNLOGGED() { return getToken(CqlParser.K_UNLOGGED, 0); }
		public TerminalNode K_UPDATE() { return getToken(CqlParser.K_UPDATE, 0); }
		public TerminalNode K_USE() { return getToken(CqlParser.K_USE, 0); }
		public TerminalNode K_USER() { return getToken(CqlParser.K_USER, 0); }
		public TerminalNode K_USING() { return getToken(CqlParser.K_USING, 0); }
		public TerminalNode K_UUID() { return getToken(CqlParser.K_UUID, 0); }
		public TerminalNode K_VALUES() { return getToken(CqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(CqlParser.K_VIEW, 0); }
		public TerminalNode K_WHERE() { return getToken(CqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(CqlParser.K_WITH, 0); }
		public TerminalNode K_WRITETIME() { return getToken(CqlParser.K_WRITETIME, 0); }
		public TerminalNode K_ASCII() { return getToken(CqlParser.K_ASCII, 0); }
		public TerminalNode K_BIGINT() { return getToken(CqlParser.K_BIGINT, 0); }
		public TerminalNode K_BLOB() { return getToken(CqlParser.K_BLOB, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(CqlParser.K_BOOLEAN, 0); }
		public TerminalNode K_COUNTER() { return getToken(CqlParser.K_COUNTER, 0); }
		public TerminalNode K_DATE() { return getToken(CqlParser.K_DATE, 0); }
		public TerminalNode K_DECIMAL() { return getToken(CqlParser.K_DECIMAL, 0); }
		public TerminalNode K_DOUBLE() { return getToken(CqlParser.K_DOUBLE, 0); }
		public TerminalNode K_FLOAT() { return getToken(CqlParser.K_FLOAT, 0); }
		public TerminalNode K_FROZEN() { return getToken(CqlParser.K_FROZEN, 0); }
		public TerminalNode K_INET() { return getToken(CqlParser.K_INET, 0); }
		public TerminalNode K_INT() { return getToken(CqlParser.K_INT, 0); }
		public TerminalNode K_LIST() { return getToken(CqlParser.K_LIST, 0); }
		public TerminalNode K_MAP() { return getToken(CqlParser.K_MAP, 0); }
		public TerminalNode K_SMALLINT() { return getToken(CqlParser.K_SMALLINT, 0); }
		public TerminalNode K_TEXT() { return getToken(CqlParser.K_TEXT, 0); }
		public TerminalNode K_TIMEUUID() { return getToken(CqlParser.K_TIMEUUID, 0); }
		public TerminalNode K_TIME() { return getToken(CqlParser.K_TIME, 0); }
		public TerminalNode K_TINYINT() { return getToken(CqlParser.K_TINYINT, 0); }
		public TerminalNode K_TUPLE() { return getToken(CqlParser.K_TUPLE, 0); }
		public TerminalNode K_VARCHAR() { return getToken(CqlParser.K_VARCHAR, 0); }
		public TerminalNode K_VARINT() { return getToken(CqlParser.K_VARINT, 0); }
		public TerminalNode K_USERS() { return getToken(CqlParser.K_USERS, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_id);
		try {
			setState(2529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2387);
				match(OBJECT_NAME);
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2388);
				match(K_ADD);
				setState(2389);
				match(K_AGGREGATE);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2390);
				match(K_ALL);
				}
				break;
			case K_ALLOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(2391);
				match(K_ALLOW);
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2392);
				match(K_ALTER);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 6);
				{
				setState(2393);
				match(K_AND);
				}
				break;
			case K_ANY:
				enterOuterAlt(_localctx, 7);
				{
				setState(2394);
				match(K_ANY);
				}
				break;
			case K_APPLY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2395);
				match(K_APPLY);
				}
				break;
			case K_AS:
				enterOuterAlt(_localctx, 9);
				{
				setState(2396);
				match(K_AS);
				}
				break;
			case K_ASC:
				enterOuterAlt(_localctx, 10);
				{
				setState(2397);
				match(K_ASC);
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2398);
				match(K_AUTHORIZE);
				}
				break;
			case K_BATCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(2399);
				match(K_BATCH);
				}
				break;
			case K_BEGIN:
				enterOuterAlt(_localctx, 13);
				{
				setState(2400);
				match(K_BEGIN);
				}
				break;
			case K_BY:
				enterOuterAlt(_localctx, 14);
				{
				setState(2401);
				match(K_BY);
				}
				break;
			case K_CALLED:
				enterOuterAlt(_localctx, 15);
				{
				setState(2402);
				match(K_CALLED);
				}
				break;
			case K_CLUSTERING:
				enterOuterAlt(_localctx, 16);
				{
				setState(2403);
				match(K_CLUSTERING);
				}
				break;
			case K_COLUMNFAMILY:
				enterOuterAlt(_localctx, 17);
				{
				setState(2404);
				match(K_COLUMNFAMILY);
				}
				break;
			case K_COMPACT:
				enterOuterAlt(_localctx, 18);
				{
				setState(2405);
				match(K_COMPACT);
				}
				break;
			case K_CONSISTENCY:
				enterOuterAlt(_localctx, 19);
				{
				setState(2406);
				match(K_CONSISTENCY);
				}
				break;
			case K_CONTAINS:
				enterOuterAlt(_localctx, 20);
				{
				setState(2407);
				match(K_CONTAINS);
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 21);
				{
				setState(2408);
				match(K_CREATE);
				}
				break;
			case K_CUSTOM:
				enterOuterAlt(_localctx, 22);
				{
				setState(2409);
				match(K_CUSTOM);
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 23);
				{
				setState(2410);
				match(K_DELETE);
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 24);
				{
				setState(2411);
				match(K_DESC);
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 25);
				{
				setState(2412);
				match(K_DESCRIBE);
				}
				break;
			case K_DISTINCT:
				enterOuterAlt(_localctx, 26);
				{
				setState(2413);
				match(K_DISTINCT);
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 27);
				{
				setState(2414);
				match(K_DROP);
				}
				break;
			case K_DURABLE_WRITES:
				enterOuterAlt(_localctx, 28);
				{
				setState(2415);
				match(K_DURABLE_WRITES);
				}
				break;
			case K_EACH_QUORUM:
				enterOuterAlt(_localctx, 29);
				{
				setState(2416);
				match(K_EACH_QUORUM);
				}
				break;
			case K_ENTRIES:
				enterOuterAlt(_localctx, 30);
				{
				setState(2417);
				match(K_ENTRIES);
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 31);
				{
				setState(2418);
				match(K_EXECUTE);
				}
				break;
			case K_EXISTS:
				enterOuterAlt(_localctx, 32);
				{
				setState(2419);
				match(K_EXISTS);
				}
				break;
			case K_FALSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(2420);
				match(K_FALSE);
				}
				break;
			case K_FILTERING:
				enterOuterAlt(_localctx, 34);
				{
				setState(2421);
				match(K_FILTERING);
				}
				break;
			case K_FINALFUNC:
				enterOuterAlt(_localctx, 35);
				{
				setState(2422);
				match(K_FINALFUNC);
				}
				break;
			case K_FROM:
				enterOuterAlt(_localctx, 36);
				{
				setState(2423);
				match(K_FROM);
				}
				break;
			case K_FULL:
				enterOuterAlt(_localctx, 37);
				{
				setState(2424);
				match(K_FULL);
				}
				break;
			case K_FUNCTION:
				enterOuterAlt(_localctx, 38);
				{
				setState(2425);
				match(K_FUNCTION);
				}
				break;
			case K_FUNCTIONS:
				enterOuterAlt(_localctx, 39);
				{
				setState(2426);
				match(K_FUNCTIONS);
				}
				break;
			case K_GRANT:
				enterOuterAlt(_localctx, 40);
				{
				setState(2427);
				match(K_GRANT);
				}
				break;
			case K_IF:
				enterOuterAlt(_localctx, 41);
				{
				setState(2428);
				match(K_IF);
				}
				break;
			case K_IN:
				enterOuterAlt(_localctx, 42);
				{
				setState(2429);
				match(K_IN);
				}
				break;
			case K_INDEX:
				enterOuterAlt(_localctx, 43);
				{
				setState(2430);
				match(K_INDEX);
				}
				break;
			case K_INFINITY:
				enterOuterAlt(_localctx, 44);
				{
				setState(2431);
				match(K_INFINITY);
				}
				break;
			case K_INITCOND:
				enterOuterAlt(_localctx, 45);
				{
				setState(2432);
				match(K_INITCOND);
				}
				break;
			case K_INPUT:
				enterOuterAlt(_localctx, 46);
				{
				setState(2433);
				match(K_INPUT);
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 47);
				{
				setState(2434);
				match(K_INSERT);
				}
				break;
			case K_INTO:
				enterOuterAlt(_localctx, 48);
				{
				setState(2435);
				match(K_INTO);
				}
				break;
			case K_IS:
				enterOuterAlt(_localctx, 49);
				{
				setState(2436);
				match(K_IS);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 50);
				{
				setState(2437);
				match(K_JSON);
				}
				break;
			case K_KEY:
				enterOuterAlt(_localctx, 51);
				{
				setState(2438);
				match(K_KEY);
				}
				break;
			case K_KEYS:
				enterOuterAlt(_localctx, 52);
				{
				setState(2439);
				match(K_KEYS);
				}
				break;
			case K_KEYSPACE:
				enterOuterAlt(_localctx, 53);
				{
				setState(2440);
				match(K_KEYSPACE);
				}
				break;
			case K_KEYSPACES:
				enterOuterAlt(_localctx, 54);
				{
				setState(2441);
				match(K_KEYSPACES);
				}
				break;
			case K_LANGUAGE:
				enterOuterAlt(_localctx, 55);
				{
				setState(2442);
				match(K_LANGUAGE);
				}
				break;
			case K_LEVEL:
				enterOuterAlt(_localctx, 56);
				{
				setState(2443);
				match(K_LEVEL);
				}
				break;
			case K_LIMIT:
				enterOuterAlt(_localctx, 57);
				{
				setState(2444);
				match(K_LIMIT);
				}
				break;
			case K_LOCAL_ONE:
				enterOuterAlt(_localctx, 58);
				{
				setState(2445);
				match(K_LOCAL_ONE);
				}
				break;
			case K_LOCAL_QUORUM:
				enterOuterAlt(_localctx, 59);
				{
				setState(2446);
				match(K_LOCAL_QUORUM);
				}
				break;
			case K_LOGGED:
				enterOuterAlt(_localctx, 60);
				{
				setState(2447);
				match(K_LOGGED);
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 61);
				{
				setState(2448);
				match(K_LOGIN);
				}
				break;
			case K_MATERIALIZED:
				enterOuterAlt(_localctx, 62);
				{
				setState(2449);
				match(K_MATERIALIZED);
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 63);
				{
				setState(2450);
				match(K_MODIFY);
				}
				break;
			case K_NAN:
				enterOuterAlt(_localctx, 64);
				{
				setState(2451);
				match(K_NAN);
				}
				break;
			case K_NORECURSIVE:
				enterOuterAlt(_localctx, 65);
				{
				setState(2452);
				match(K_NORECURSIVE);
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 66);
				{
				setState(2453);
				match(K_NOSUPERUSER);
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 67);
				{
				setState(2454);
				match(K_NOT);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 68);
				{
				setState(2455);
				match(K_NULL);
				}
				break;
			case K_OF:
				enterOuterAlt(_localctx, 69);
				{
				setState(2456);
				match(K_OF);
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 70);
				{
				setState(2457);
				match(K_ON);
				}
				break;
			case K_ONE:
				enterOuterAlt(_localctx, 71);
				{
				setState(2458);
				match(K_ONE);
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 72);
				{
				setState(2459);
				match(K_OPTIONS);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 73);
				{
				setState(2460);
				match(K_OR);
				}
				break;
			case K_ORDER:
				enterOuterAlt(_localctx, 74);
				{
				setState(2461);
				match(K_ORDER);
				}
				break;
			case K_PARTITION:
				enterOuterAlt(_localctx, 75);
				{
				setState(2462);
				match(K_PARTITION);
				}
				break;
			case K_PASSWORD:
				enterOuterAlt(_localctx, 76);
				{
				setState(2463);
				match(K_PASSWORD);
				}
				break;
			case K_PER:
				enterOuterAlt(_localctx, 77);
				{
				setState(2464);
				match(K_PER);
				}
				break;
			case K_PERMISSION:
				enterOuterAlt(_localctx, 78);
				{
				setState(2465);
				match(K_PERMISSION);
				}
				break;
			case K_PERMISSIONS:
				enterOuterAlt(_localctx, 79);
				{
				setState(2466);
				match(K_PERMISSIONS);
				}
				break;
			case K_PRIMARY:
				enterOuterAlt(_localctx, 80);
				{
				setState(2467);
				match(K_PRIMARY);
				}
				break;
			case K_QUORUM:
				enterOuterAlt(_localctx, 81);
				{
				setState(2468);
				match(K_QUORUM);
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 82);
				{
				setState(2469);
				match(K_RENAME);
				}
				break;
			case K_REPLACE:
				enterOuterAlt(_localctx, 83);
				{
				setState(2470);
				match(K_REPLACE);
				}
				break;
			case K_REPLICATION:
				enterOuterAlt(_localctx, 84);
				{
				setState(2471);
				match(K_REPLICATION);
				}
				break;
			case K_RETURNS:
				enterOuterAlt(_localctx, 85);
				{
				setState(2472);
				match(K_RETURNS);
				}
				break;
			case K_REVOKE:
				enterOuterAlt(_localctx, 86);
				{
				setState(2473);
				match(K_REVOKE);
				}
				break;
			case K_ROLE:
				enterOuterAlt(_localctx, 87);
				{
				setState(2474);
				match(K_ROLE);
				}
				break;
			case K_ROLES:
				enterOuterAlt(_localctx, 88);
				{
				setState(2475);
				match(K_ROLES);
				}
				break;
			case K_SCHEMA:
				enterOuterAlt(_localctx, 89);
				{
				setState(2476);
				match(K_SCHEMA);
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 90);
				{
				setState(2477);
				match(K_SELECT);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 91);
				{
				setState(2478);
				match(K_SET);
				}
				break;
			case K_SFUNC:
				enterOuterAlt(_localctx, 92);
				{
				setState(2479);
				match(K_SFUNC);
				}
				break;
			case K_STATIC:
				enterOuterAlt(_localctx, 93);
				{
				setState(2480);
				match(K_STATIC);
				}
				break;
			case K_STORAGE:
				enterOuterAlt(_localctx, 94);
				{
				setState(2481);
				match(K_STORAGE);
				}
				break;
			case K_STYPE:
				enterOuterAlt(_localctx, 95);
				{
				setState(2482);
				match(K_STYPE);
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 96);
				{
				setState(2483);
				match(K_SUPERUSER);
				}
				break;
			case K_TABLE:
				enterOuterAlt(_localctx, 97);
				{
				setState(2484);
				match(K_TABLE);
				}
				break;
			case K_THREE:
				enterOuterAlt(_localctx, 98);
				{
				setState(2485);
				match(K_THREE);
				}
				break;
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 99);
				{
				setState(2486);
				match(K_TIMESTAMP);
				}
				break;
			case K_TO:
				enterOuterAlt(_localctx, 100);
				{
				setState(2487);
				match(K_TO);
				}
				break;
			case K_TOKEN:
				enterOuterAlt(_localctx, 101);
				{
				setState(2488);
				match(K_TOKEN);
				}
				break;
			case K_TRIGGER:
				enterOuterAlt(_localctx, 102);
				{
				setState(2489);
				match(K_TRIGGER);
				}
				break;
			case K_TRUE:
				enterOuterAlt(_localctx, 103);
				{
				setState(2490);
				match(K_TRUE);
				}
				break;
			case K_TRUNCATE:
				enterOuterAlt(_localctx, 104);
				{
				setState(2491);
				match(K_TRUNCATE);
				}
				break;
			case K_TTL:
				enterOuterAlt(_localctx, 105);
				{
				setState(2492);
				match(K_TTL);
				}
				break;
			case K_TWO:
				enterOuterAlt(_localctx, 106);
				{
				setState(2493);
				match(K_TWO);
				}
				break;
			case K_TYPE:
				enterOuterAlt(_localctx, 107);
				{
				setState(2494);
				match(K_TYPE);
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 108);
				{
				setState(2495);
				match(K_UNLOGGED);
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 109);
				{
				setState(2496);
				match(K_UPDATE);
				}
				break;
			case K_USE:
				enterOuterAlt(_localctx, 110);
				{
				setState(2497);
				match(K_USE);
				}
				break;
			case K_USER:
				enterOuterAlt(_localctx, 111);
				{
				setState(2498);
				match(K_USER);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 112);
				{
				setState(2499);
				match(K_USING);
				}
				break;
			case K_UUID:
				enterOuterAlt(_localctx, 113);
				{
				setState(2500);
				match(K_UUID);
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 114);
				{
				setState(2501);
				match(K_VALUES);
				}
				break;
			case K_VIEW:
				enterOuterAlt(_localctx, 115);
				{
				setState(2502);
				match(K_VIEW);
				}
				break;
			case K_WHERE:
				enterOuterAlt(_localctx, 116);
				{
				setState(2503);
				match(K_WHERE);
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 117);
				{
				setState(2504);
				match(K_WITH);
				}
				break;
			case K_WRITETIME:
				enterOuterAlt(_localctx, 118);
				{
				setState(2505);
				match(K_WRITETIME);
				}
				break;
			case K_ASCII:
				enterOuterAlt(_localctx, 119);
				{
				setState(2506);
				match(K_ASCII);
				}
				break;
			case K_BIGINT:
				enterOuterAlt(_localctx, 120);
				{
				setState(2507);
				match(K_BIGINT);
				}
				break;
			case K_BLOB:
				enterOuterAlt(_localctx, 121);
				{
				setState(2508);
				match(K_BLOB);
				}
				break;
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 122);
				{
				setState(2509);
				match(K_BOOLEAN);
				}
				break;
			case K_COUNTER:
				enterOuterAlt(_localctx, 123);
				{
				setState(2510);
				match(K_COUNTER);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 124);
				{
				setState(2511);
				match(K_DATE);
				}
				break;
			case K_DECIMAL:
				enterOuterAlt(_localctx, 125);
				{
				setState(2512);
				match(K_DECIMAL);
				}
				break;
			case K_DOUBLE:
				enterOuterAlt(_localctx, 126);
				{
				setState(2513);
				match(K_DOUBLE);
				}
				break;
			case K_FLOAT:
				enterOuterAlt(_localctx, 127);
				{
				setState(2514);
				match(K_FLOAT);
				}
				break;
			case K_FROZEN:
				enterOuterAlt(_localctx, 128);
				{
				setState(2515);
				match(K_FROZEN);
				}
				break;
			case K_INET:
				enterOuterAlt(_localctx, 129);
				{
				setState(2516);
				match(K_INET);
				}
				break;
			case K_INT:
				enterOuterAlt(_localctx, 130);
				{
				setState(2517);
				match(K_INT);
				}
				break;
			case K_LIST:
				enterOuterAlt(_localctx, 131);
				{
				setState(2518);
				match(K_LIST);
				}
				break;
			case K_MAP:
				enterOuterAlt(_localctx, 132);
				{
				setState(2519);
				match(K_MAP);
				}
				break;
			case K_SMALLINT:
				enterOuterAlt(_localctx, 133);
				{
				setState(2520);
				match(K_SMALLINT);
				}
				break;
			case K_TEXT:
				enterOuterAlt(_localctx, 134);
				{
				setState(2521);
				match(K_TEXT);
				}
				break;
			case K_TIMEUUID:
				enterOuterAlt(_localctx, 135);
				{
				setState(2522);
				match(K_TIMEUUID);
				}
				break;
			case K_TIME:
				enterOuterAlt(_localctx, 136);
				{
				setState(2523);
				match(K_TIME);
				}
				break;
			case K_TINYINT:
				enterOuterAlt(_localctx, 137);
				{
				setState(2524);
				match(K_TINYINT);
				}
				break;
			case K_TUPLE:
				enterOuterAlt(_localctx, 138);
				{
				setState(2525);
				match(K_TUPLE);
				}
				break;
			case K_VARCHAR:
				enterOuterAlt(_localctx, 139);
				{
				setState(2526);
				match(K_VARCHAR);
				}
				break;
			case K_VARINT:
				enterOuterAlt(_localctx, 140);
				{
				setState(2527);
				match(K_VARINT);
				}
				break;
			case K_USERS:
				enterOuterAlt(_localctx, 141);
				{
				setState(2528);
				match(K_USERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b5\u09e6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119\t\u0119"+
		"\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d\4\u011e"+
		"\t\u011e\3\2\5\2\u023e\n\2\3\2\5\2\u0241\n\2\3\2\3\2\3\3\3\3\5\3\u0247"+
		"\n\3\3\3\3\3\3\3\7\3\u024c\n\3\f\3\16\3\u024f\13\3\3\3\3\3\5\3\u0253\n"+
		"\3\3\3\5\3\u0256\n\3\3\3\5\3\u0259\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0284"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0295"+
		"\n\t\3\t\5\t\u0298\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u029f\n\n\3\n\3\n\3\n\5"+
		"\n\u02a4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u02af\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02b9\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u02c8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u02d3\n\r\3\r\3\r\3\r\5\r\u02d8\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u02e3\n\r\3\r\3\r\5\r\u02e7\n\r\3\16\3\16\3\16\5\16"+
		"\u02ec\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u02f4\n\16\3\17\3\17\3"+
		"\17\5\17\u02f9\n\17\3\17\3\17\5\17\u02fd\n\17\3\20\3\20\3\20\5\20\u0302"+
		"\n\20\3\20\3\20\3\20\5\20\u0307\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0314\n\21\f\21\16\21\u0317\13\21\3\22\3\22"+
		"\3\22\5\22\u031c\n\22\3\22\3\22\3\22\5\22\u0321\n\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\5\23\u032b\n\23\3\23\3\23\3\23\5\23\u0330\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u033a\n\23\3\23\3\23\3\23"+
		"\5\23\u033f\n\23\3\23\3\23\3\23\5\23\u0344\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u034b\n\24\3\25\3\25\3\25\3\25\7\25\u0351\n\25\f\25\16\25\u0354"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u0360\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u036c\n\30"+
		"\3\31\3\31\5\31\u0370\n\31\3\31\3\31\5\31\u0374\n\31\3\31\3\31\3\31\5"+
		"\31\u0379\n\31\3\31\3\31\3\31\5\31\u037e\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u038f\n\33\f\33"+
		"\16\33\u0392\13\33\3\34\3\34\3\34\3\34\5\34\u0398\n\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\5\35\u03a0\n\35\3\35\3\35\5\35\u03a4\n\35\3\35\3\35\3"+
		"\35\5\35\u03a9\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u03bc\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u03c3\n\37\f\37\16\37\u03c6\13\37\3\37\3\37\3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\7!\u03d4\n!\f!\16!\u03d7\13!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u03e0\n\"\f\"\16\"\u03e3\13\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\5$\u03f0\n$\3%\3%\3%\3&\3&\5&\u03f7\n&\3\'\3\'\3\'\3\'\3\'\5\'\u03fe"+
		"\n\'\3\'\3\'\3\'\3(\3(\3(\5(\u0406\n(\3)\3)\3)\3*\3*\3*\3*\7*\u040f\n"+
		"*\f*\16*\u0412\13*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\5.\u0425\n.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u0430\n/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\7\64\u0445\n\64\f\64\16\64\u0448\13\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u0453\n\66\f\66\16\66\u0456\13\66\3\67\3\67"+
		"\3\67\3\67\5\67\u045c\n\67\38\38\38\38\38\78\u0463\n8\f8\168\u0466\13"+
		"8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0478\n9\3:\3:\3"+
		":\3:\3:\3:\5:\u0480\n:\3:\3:\3:\3:\5:\u0486\n:\3;\3;\3;\5;\u048b\n;\3"+
		";\3;\3<\3<\3<\5<\u0492\n<\3<\3<\3<\5<\u0497\n<\3<\3<\3=\3=\3=\3=\5=\u049f"+
		"\n=\3=\3=\3=\5=\u04a4\n=\3=\3=\3>\3>\3>\5>\u04ab\n>\3>\3>\3>\5>\u04b0"+
		"\n>\3>\3>\3?\3?\3?\5?\u04b7\n?\3?\3?\3?\5?\u04bc\n?\3?\3?\3@\3@\3@\5@"+
		"\u04c3\n@\3@\3@\3@\3@\3@\5@\u04ca\n@\3@\3@\3A\3A\3A\5A\u04d1\nA\3A\3A"+
		"\3B\3B\3B\5B\u04d8\nB\3B\3B\3B\5B\u04dd\nB\3B\3B\3C\3C\3C\5C\u04e4\nC"+
		"\3C\3C\3D\3D\3D\5D\u04eb\nD\3D\3D\3D\5D\u04f0\nD\3D\3D\3E\3E\3E\5E\u04f7"+
		"\nE\3E\3E\3E\5E\u04fc\nE\3E\3E\3E\3E\3E\5E\u0503\nE\3F\3F\5F\u0507\nF"+
		"\3G\3G\3G\3G\3G\3G\5G\u050f\nG\3G\3G\3H\3H\3H\3H\7H\u0517\nH\fH\16H\u051a"+
		"\13H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0525\nI\3J\3J\3K\3K\5K\u052b\nK\3"+
		"L\3L\3L\3L\3L\7L\u0532\nL\fL\16L\u0535\13L\3L\3L\3M\3M\3M\3M\3N\3N\3O"+
		"\3O\5O\u0541\nO\3P\3P\3P\3P\7P\u0547\nP\fP\16P\u054a\13P\3P\3P\3P\5P\u054f"+
		"\nP\3Q\3Q\3Q\5Q\u0554\nQ\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\5T\u0562"+
		"\nT\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\7X\u0574\nX\fX\16"+
		"X\u0577\13X\3Y\3Y\3Y\3Y\7Y\u057d\nY\fY\16Y\u0580\13Y\3Z\3Z\3[\3[\3\\\3"+
		"\\\3\\\3]\3]\5]\u058b\n]\3]\3]\5]\u058f\n]\3^\3^\5^\u0593\n^\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u05a1\n_\3`\3`\3`\3`\7`\u05a7\n`\f`\16"+
		"`\u05aa\13`\3a\3a\3a\3a\3a\3a\5a\u05b2\na\3b\3b\3b\3b\3c\3c\3c\3d\3d\5"+
		"d\u05bd\nd\3d\3d\3d\5d\u05c2\nd\3d\3d\3e\3e\3e\5e\u05c9\ne\3e\5e\u05cc"+
		"\ne\3e\3e\3e\3e\5e\u05d2\ne\3e\3e\3e\3e\3e\3f\3f\5f\u05db\nf\3g\3g\3g"+
		"\3g\5g\u05e1\ng\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3k\5k\u05f3"+
		"\nk\3k\3k\5k\u05f7\nk\3k\3k\5k\u05fb\nk\3k\3k\3k\5k\u0600\nk\3l\3l\3l"+
		"\3l\7l\u0606\nl\fl\16l\u0609\13l\3m\3m\3m\3m\3m\5m\u0610\nm\3m\3m\5m\u0614"+
		"\nm\3n\5n\u0617\nn\3n\3n\3n\3n\5n\u061d\nn\3n\3n\5n\u0621\nn\3n\3n\3n"+
		"\3n\3n\5n\u0628\nn\3o\3o\3o\3p\3p\3p\3p\7p\u0631\np\fp\16p\u0634\13p\3"+
		"q\3q\3q\3q\3r\3r\3r\3r\7r\u063e\nr\fr\16r\u0641\13r\3s\3s\3s\3s\3s\3s"+
		"\5s\u0649\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s"+
		"\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s"+
		"\3s\3s\3s\3s\3s\3s\3s\5s\u067c\ns\3t\3t\3t\3t\3t\7t\u0683\nt\ft\16t\u0686"+
		"\13t\5t\u0688\nt\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\7u\u0696\nu\fu\16"+
		"u\u0699\13u\3u\3u\3v\3v\3v\3v\3v\7v\u06a2\nv\fv\16v\u06a5\13v\3v\3v\3"+
		"w\3w\3w\3w\3w\7w\u06ae\nw\fw\16w\u06b1\13w\3w\3w\3x\3x\3x\3x\3x\7x\u06ba"+
		"\nx\fx\16x\u06bd\13x\3x\3x\3x\7x\u06c2\nx\fx\16x\u06c5\13x\5x\u06c7\n"+
		"x\3x\3x\3x\3x\7x\u06cd\nx\fx\16x\u06d0\13x\5x\u06d2\nx\3x\3x\3y\5y\u06d7"+
		"\ny\3y\3y\3y\3y\3y\5y\u06de\ny\3y\3y\5y\u06e2\ny\3y\3y\5y\u06e6\ny\3y"+
		"\5y\u06e9\ny\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u06fb"+
		"\nz\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0715\n"+
		"\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\7\u0082\u071f\n\u0082\f\u0082\16\u0082\u0722\13\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\7\u0083\u0728\n\u0083\f\u0083\16\u0083\u072b\13\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0733\n\u0084"+
		"\3\u0085\3\u0085\5\u0085\u0737\n\u0085\3\u0085\5\u0085\u073a\n\u0085\3"+
		"\u0085\3\u0085\3\u0085\5\u0085\u073f\n\u0085\3\u0085\5\u0085\u0742\n\u0085"+
		"\3\u0085\5\u0085\u0745\n\u0085\3\u0085\5\u0085\u0748\n\u0085\3\u0086\3"+
		"\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0758\n\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0761\n\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u076a\n\u008e"+
		"\3\u008e\3\u008e\3\u008e\7\u008e\u076f\n\u008e\f\u008e\16\u008e\u0772"+
		"\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u077c\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0782\n"+
		"\u008f\5\u008f\u0784\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u078a"+
		"\n\u0090\f\u0090\16\u0090\u078d\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u07a5\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\7\u0091\u07ae\n\u0091\f\u0091\16\u0091\u07b1\13\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u07ba\n\u0091"+
		"\f\u0091\16\u0091\u07bd\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\7\u0091\u07c6\n\u0091\f\u0091\16\u0091\u07c9\13\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u07d1\n\u0091"+
		"\f\u0091\16\u0091\u07d4\13\u0091\3\u0091\3\u0091\5\u0091\u07d8\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u07ec\n\u0094\3\u0094\3\u0094\5\u0094\u07f0\n\u0094\3\u0095\3"+
		"\u0095\3\u0095\5\u0095\u07f5\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5"+
		"\u0095\u07fb\n\u0095\7\u0095\u07fd\n\u0095\f\u0095\16\u0095\u0800\13\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u080b\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u081c\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u0823\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u082a\n"+
		"\u009e\3\u009f\3\u009f\5\u009f\u082e\n\u009f\3\u00a0\3\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u084c"+
		"\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0853\n\u00a1"+
		"\f\u00a1\16\u00a1\u0856\13\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5\u00a2"+
		"\u085c\n\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9"+
		"\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd"+
		"\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00db"+
		"\3\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00df\3\u00df"+
		"\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f1\3\u00f1"+
		"\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f6"+
		"\3\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00ff"+
		"\3\u00ff\3\u0100\3\u0100\3\u0101\3\u0101\3\u0102\3\u0102\3\u0103\3\u0103"+
		"\3\u0104\3\u0104\3\u0105\3\u0105\3\u0106\3\u0106\3\u0107\3\u0107\3\u0108"+
		"\3\u0108\3\u0109\3\u0109\3\u010a\3\u010a\3\u010b\3\u010b\3\u010c\3\u010c"+
		"\3\u010d\3\u010d\3\u010e\3\u010e\3\u010f\3\u010f\3\u0110\3\u0110\3\u0111"+
		"\3\u0111\3\u0112\3\u0112\3\u0113\3\u0113\3\u0114\3\u0114\3\u0115\3\u0115"+
		"\3\u0116\3\u0116\3\u0117\3\u0117\3\u0118\3\u0118\3\u0119\3\u0119\3\u011a"+
		"\3\u011a\3\u011b\3\u011b\3\u011c\3\u011c\3\u011d\3\u011d\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\5\u011e\u09e4\n\u011e\3\u011e"+
		"\2\2\u011f\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"+
		"\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa"+
		"\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2"+
		"\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da"+
		"\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2"+
		"\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a"+
		"\u020c\u020e\u0210\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222"+
		"\u0224\u0226\u0228\u022a\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a"+
		"\2\7\3\2\u00a8\u00a9\4\2\24\24\26\26\3\2\u00b0\u00b4\3\2\u00aa\u00ab\4"+
		"\299\u0082\u0082\2\u0a84\2\u023d\3\2\2\2\4\u024d\3\2\2\2\6\u025a\3\2\2"+
		"\2\b\u025c\3\2\2\2\n\u0283\3\2\2\2\f\u0285\3\2\2\2\16\u028c\3\2\2\2\20"+
		"\u028f\3\2\2\2\22\u0299\3\2\2\2\24\u02a5\3\2\2\2\26\u02b8\3\2\2\2\30\u02e6"+
		"\3\2\2\2\32\u02e8\3\2\2\2\34\u02f5\3\2\2\2\36\u02fe\3\2\2\2 \u030d\3\2"+
		"\2\2\"\u0318\3\2\2\2$\u0326\3\2\2\2&\u0345\3\2\2\2(\u034c\3\2\2\2*\u0355"+
		"\3\2\2\2,\u035a\3\2\2\2.\u035c\3\2\2\2\60\u036d\3\2\2\2\62\u0388\3\2\2"+
		"\2\64\u038a\3\2\2\2\66\u0397\3\2\2\28\u039d\3\2\2\2:\u03bb\3\2\2\2<\u03bd"+
		"\3\2\2\2>\u03c9\3\2\2\2@\u03cd\3\2\2\2B\u03da\3\2\2\2D\u03e6\3\2\2\2F"+
		"\u03e9\3\2\2\2H\u03f1\3\2\2\2J\u03f6\3\2\2\2L\u03f8\3\2\2\2N\u0405\3\2"+
		"\2\2P\u0407\3\2\2\2R\u040a\3\2\2\2T\u0413\3\2\2\2V\u0417\3\2\2\2X\u041a"+
		"\3\2\2\2Z\u041f\3\2\2\2\\\u042f\3\2\2\2^\u0431\3\2\2\2`\u0434\3\2\2\2"+
		"b\u0439\3\2\2\2d\u043d\3\2\2\2f\u0440\3\2\2\2h\u0449\3\2\2\2j\u044c\3"+
		"\2\2\2l\u0457\3\2\2\2n\u045d\3\2\2\2p\u0477\3\2\2\2r\u0479\3\2\2\2t\u0487"+
		"\3\2\2\2v\u048e\3\2\2\2x\u049a\3\2\2\2z\u04a7\3\2\2\2|\u04b3\3\2\2\2~"+
		"\u04bf\3\2\2\2\u0080\u04cd\3\2\2\2\u0082\u04d4\3\2\2\2\u0084\u04e0\3\2"+
		"\2\2\u0086\u04e7\3\2\2\2\u0088\u04f3\3\2\2\2\u008a\u0504\3\2\2\2\u008c"+
		"\u0508\3\2\2\2\u008e\u0512\3\2\2\2\u0090\u0524\3\2\2\2\u0092\u0526\3\2"+
		"\2\2\u0094\u052a\3\2\2\2\u0096\u052c\3\2\2\2\u0098\u0538\3\2\2\2\u009a"+
		"\u053c\3\2\2\2\u009c\u0540\3\2\2\2\u009e\u0542\3\2\2\2\u00a0\u0550\3\2"+
		"\2\2\u00a2\u0555\3\2\2\2\u00a4\u0558\3\2\2\2\u00a6\u0561\3\2\2\2\u00a8"+
		"\u0563\3\2\2\2\u00aa\u0565\3\2\2\2\u00ac\u0569\3\2\2\2\u00ae\u056f\3\2"+
		"\2\2\u00b0\u0578\3\2\2\2\u00b2\u0581\3\2\2\2\u00b4\u0583\3\2\2\2\u00b6"+
		"\u0585\3\2\2\2\u00b8\u0588\3\2\2\2\u00ba\u0592\3\2\2\2\u00bc\u0594\3\2"+
		"\2\2\u00be\u05a2\3\2\2\2\u00c0\u05b1\3\2\2\2\u00c2\u05b3\3\2\2\2\u00c4"+
		"\u05b7\3\2\2\2\u00c6\u05ba\3\2\2\2\u00c8\u05c5\3\2\2\2\u00ca\u05da\3\2"+
		"\2\2\u00cc\u05e0\3\2\2\2\u00ce\u05e2\3\2\2\2\u00d0\u05e7\3\2\2\2\u00d2"+
		"\u05ec\3\2\2\2\u00d4\u05f2\3\2\2\2\u00d6\u0601\3\2\2\2\u00d8\u0613\3\2"+
		"\2\2\u00da\u0616\3\2\2\2\u00dc\u0629\3\2\2\2\u00de\u062c\3\2\2\2\u00e0"+
		"\u0635\3\2\2\2\u00e2\u0639\3\2\2\2\u00e4\u067b\3\2\2\2\u00e6\u067d\3\2"+
		"\2\2\u00e8\u068b\3\2\2\2\u00ea\u069c\3\2\2\2\u00ec\u06a8\3\2\2\2\u00ee"+
		"\u06b4\3\2\2\2\u00f0\u06d6\3\2\2\2\u00f2\u06fa\3\2\2\2\u00f4\u06fc\3\2"+
		"\2\2\u00f6\u06ff\3\2\2\2\u00f8\u0702\3\2\2\2\u00fa\u0705\3\2\2\2\u00fc"+
		"\u0709\3\2\2\2\u00fe\u0714\3\2\2\2\u0100\u0716\3\2\2\2\u0102\u071a\3\2"+
		"\2\2\u0104\u0723\3\2\2\2\u0106\u0732\3\2\2\2\u0108\u0734\3\2\2\2\u010a"+
		"\u0749\3\2\2\2\u010c\u074c\3\2\2\2\u010e\u074f\3\2\2\2\u0110\u0757\3\2"+
		"\2\2\u0112\u0759\3\2\2\2\u0114\u075d\3\2\2\2\u0116\u0762\3\2\2\2\u0118"+
		"\u0765\3\2\2\2\u011a\u0769\3\2\2\2\u011c\u0783\3\2\2\2\u011e\u0785\3\2"+
		"\2\2\u0120\u07d7\3\2\2\2\u0122\u07d9\3\2\2\2\u0124\u07dd\3\2\2\2\u0126"+
		"\u07ef\3\2\2\2\u0128\u07f4\3\2\2\2\u012a\u080a\3\2\2\2\u012c\u080c\3\2"+
		"\2\2\u012e\u080e\3\2\2\2\u0130\u0810\3\2\2\2\u0132\u0812\3\2\2\2\u0134"+
		"\u0814\3\2\2\2\u0136\u081b\3\2\2\2\u0138\u0822\3\2\2\2\u013a\u0829\3\2"+
		"\2\2\u013c\u082b\3\2\2\2\u013e\u084b\3\2\2\2\u0140\u084d\3\2\2\2\u0142"+
		"\u085b\3\2\2\2\u0144\u085d\3\2\2\2\u0146\u085f\3\2\2\2\u0148\u0861\3\2"+
		"\2\2\u014a\u0863\3\2\2\2\u014c\u0865\3\2\2\2\u014e\u0867\3\2\2\2\u0150"+
		"\u0869\3\2\2\2\u0152\u086b\3\2\2\2\u0154\u086d\3\2\2\2\u0156\u086f\3\2"+
		"\2\2\u0158\u0871\3\2\2\2\u015a\u0873\3\2\2\2\u015c\u0876\3\2\2\2\u015e"+
		"\u0878\3\2\2\2\u0160\u087a\3\2\2\2\u0162\u087c\3\2\2\2\u0164\u087e\3\2"+
		"\2\2\u0166\u0881\3\2\2\2\u0168\u0883\3\2\2\2\u016a\u0885\3\2\2\2\u016c"+
		"\u0887\3\2\2\2\u016e\u0889\3\2\2\2\u0170\u088b\3\2\2\2\u0172\u088d\3\2"+
		"\2\2\u0174\u088f\3\2\2\2\u0176\u0891\3\2\2\2\u0178\u0893\3\2\2\2\u017a"+
		"\u0895\3\2\2\2\u017c\u0897\3\2\2\2\u017e\u0899\3\2\2\2\u0180\u089b\3\2"+
		"\2\2\u0182\u089d\3\2\2\2\u0184\u089f\3\2\2\2\u0186\u08a1\3\2\2\2\u0188"+
		"\u08a3\3\2\2\2\u018a\u08a5\3\2\2\2\u018c\u08a7\3\2\2\2\u018e\u08a9\3\2"+
		"\2\2\u0190\u08ab\3\2\2\2\u0192\u08ad\3\2\2\2\u0194\u08af\3\2\2\2\u0196"+
		"\u08b1\3\2\2\2\u0198\u08b3\3\2\2\2\u019a\u08b5\3\2\2\2\u019c\u08b7\3\2"+
		"\2\2\u019e\u08b9\3\2\2\2\u01a0\u08bb\3\2\2\2\u01a2\u08bd\3\2\2\2\u01a4"+
		"\u08bf\3\2\2\2\u01a6\u08c1\3\2\2\2\u01a8\u08c3\3\2\2\2\u01aa\u08c5\3\2"+
		"\2\2\u01ac\u08c7\3\2\2\2\u01ae\u08c9\3\2\2\2\u01b0\u08cb\3\2\2\2\u01b2"+
		"\u08cd\3\2\2\2\u01b4\u08cf\3\2\2\2\u01b6\u08d1\3\2\2\2\u01b8\u08d3\3\2"+
		"\2\2\u01ba\u08d5\3\2\2\2\u01bc\u08d7\3\2\2\2\u01be\u08d9\3\2\2\2\u01c0"+
		"\u08db\3\2\2\2\u01c2\u08dd\3\2\2\2\u01c4\u08df\3\2\2\2\u01c6\u08e1\3\2"+
		"\2\2\u01c8\u08e3\3\2\2\2\u01ca\u08e5\3\2\2\2\u01cc\u08e7\3\2\2\2\u01ce"+
		"\u08e9\3\2\2\2\u01d0\u08eb\3\2\2\2\u01d2\u08ed\3\2\2\2\u01d4\u08ef\3\2"+
		"\2\2\u01d6\u08f1\3\2\2\2\u01d8\u08f3\3\2\2\2\u01da\u08f5\3\2\2\2\u01dc"+
		"\u08f7\3\2\2\2\u01de\u08f9\3\2\2\2\u01e0\u08fb\3\2\2\2\u01e2\u08fd\3\2"+
		"\2\2\u01e4\u08ff\3\2\2\2\u01e6\u0901\3\2\2\2\u01e8\u0903\3\2\2\2\u01ea"+
		"\u0905\3\2\2\2\u01ec\u0907\3\2\2\2\u01ee\u0909\3\2\2\2\u01f0\u090b\3\2"+
		"\2\2\u01f2\u090d\3\2\2\2\u01f4\u090f\3\2\2\2\u01f6\u0911\3\2\2\2\u01f8"+
		"\u0913\3\2\2\2\u01fa\u0915\3\2\2\2\u01fc\u0917\3\2\2\2\u01fe\u0919\3\2"+
		"\2\2\u0200\u091b\3\2\2\2\u0202\u091d\3\2\2\2\u0204\u091f\3\2\2\2\u0206"+
		"\u0921\3\2\2\2\u0208\u0923\3\2\2\2\u020a\u0925\3\2\2\2\u020c\u0927\3\2"+
		"\2\2\u020e\u0929\3\2\2\2\u0210\u092b\3\2\2\2\u0212\u092d\3\2\2\2\u0214"+
		"\u092f\3\2\2\2\u0216\u0931\3\2\2\2\u0218\u0933\3\2\2\2\u021a\u0935\3\2"+
		"\2\2\u021c\u0937\3\2\2\2\u021e\u0939\3\2\2\2\u0220\u093b\3\2\2\2\u0222"+
		"\u093d\3\2\2\2\u0224\u093f\3\2\2\2\u0226\u0941\3\2\2\2\u0228\u0943\3\2"+
		"\2\2\u022a\u0945\3\2\2\2\u022c\u0947\3\2\2\2\u022e\u0949\3\2\2\2\u0230"+
		"\u094b\3\2\2\2\u0232\u094d\3\2\2\2\u0234\u094f\3\2\2\2\u0236\u0951\3\2"+
		"\2\2\u0238\u0953\3\2\2\2\u023a\u09e3\3\2\2\2\u023c\u023e\5\4\3\2\u023d"+
		"\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\7\25"+
		"\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\5\u0224\u0113\2\u0243\3\3\2\2\2\u0244\u0246\5\n\6\2\u0245\u0247"+
		"\7\25\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2"+
		"\u0248\u0249\5\6\4\2\u0249\u024c\3\2\2\2\u024a\u024c\5\b\5\2\u024b\u0244"+
		"\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u0258\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0255\5\n"+
		"\6\2\u0251\u0253\7\25\2\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0256\5\6\4\2\u0255\u0252\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0259\3\2\2\2\u0257\u0259\5\b\5\2\u0258\u0250\3\2\2\2\u0258"+
		"\u0257\3\2\2\2\u0259\5\3\2\2\2\u025a\u025b\7\n\2\2\u025b\7\3\2\2\2\u025c"+
		"\u025d\5\6\4\2\u025d\t\3\2\2\2\u025e\u0284\5\u00bc_\2\u025f\u0284\5r:"+
		"\2\u0260\u0284\5l\67\2\u0261\u0284\5Z.\2\u0262\u0284\5L\'\2\u0263\u0284"+
		"\5F$\2\u0264\u0284\5\u00b6\\\2\u0265\u0284\58\35\2\u0266\u0284\5\60\31"+
		"\2\u0267\u0284\5\u00c8e\2\u0268\u0284\5.\30\2\u0269\u0284\5$\23\2\u026a"+
		"\u0284\5\34\17\2\u026b\u0284\5\u0088E\2\u026c\u0284\5\"\22\2\u026d\u0284"+
		"\5\36\20\2\u026e\u0284\5\32\16\2\u026f\u0284\5\u00d4k\2\u0270\u0284\5"+
		"z>\2\u0271\u0284\5|?\2\u0272\u0284\5\u0086D\2\u0273\u0284\5\u0084C\2\u0274"+
		"\u0284\5x=\2\u0275\u0284\5\u0080A\2\u0276\u0284\5\u0082B\2\u0277\u0284"+
		"\5~@\2\u0278\u0284\5v<\2\u0279\u0284\5t;\2\u027a\u0284\5\24\13\2\u027b"+
		"\u0284\5\u00f0y\2\u027c\u0284\5\22\n\2\u027d\u0284\5\20\t\2\u027e\u0284"+
		"\5\f\7\2\u027f\u0284\5\u0108\u0085\2\u0280\u0284\5\u00c6d\2\u0281\u0284"+
		"\5\u00dan\2\u0282\u0284\5\u00c4c\2\u0283\u025e\3\2\2\2\u0283\u025f\3\2"+
		"\2\2\u0283\u0260\3\2\2\2\u0283\u0261\3\2\2\2\u0283\u0262\3\2\2\2\u0283"+
		"\u0263\3\2\2\2\u0283\u0264\3\2\2\2\u0283\u0265\3\2\2\2\u0283\u0266\3\2"+
		"\2\2\u0283\u0267\3\2\2\2\u0283\u0268\3\2\2\2\u0283\u0269\3\2\2\2\u0283"+
		"\u026a\3\2\2\2\u0283\u026b\3\2\2\2\u0283\u026c\3\2\2\2\u0283\u026d\3\2"+
		"\2\2\u0283\u026e\3\2\2\2\u0283\u026f\3\2\2\2\u0283\u0270\3\2\2\2\u0283"+
		"\u0271\3\2\2\2\u0283\u0272\3\2\2\2\u0283\u0273\3\2\2\2\u0283\u0274\3\2"+
		"\2\2\u0283\u0275\3\2\2\2\u0283\u0276\3\2\2\2\u0283\u0277\3\2\2\2\u0283"+
		"\u0278\3\2\2\2\u0283\u0279\3\2\2\2\u0283\u027a\3\2\2\2\u0283\u027b\3\2"+
		"\2\2\u0283\u027c\3\2\2\2\u0283\u027d\3\2\2\2\u0283\u027e\3\2\2\2\u0283"+
		"\u027f\3\2\2\2\u0283\u0280\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2"+
		"\2\2\u0284\13\3\2\2\2\u0285\u0286\5\u0222\u0112\2\u0286\u0287\5\26\f\2"+
		"\u0287\u0288\5\u01d6\u00ec\2\u0288\u0289\5\30\r\2\u0289\u028a\5\u019a"+
		"\u00ce\2\u028a\u028b\5\u0144\u00a3\2\u028b\r\3\2\2\2\u028c\u028d\5\u01c2"+
		"\u00e2\2\u028d\u028e\5\u0216\u010c\2\u028e\17\3\2\2\2\u028f\u0290\5\u01c2"+
		"\u00e2\2\u0290\u0294\5\u01f2\u00fa\2\u0291\u0292\5\u01d4\u00eb\2\u0292"+
		"\u0293\5\u0144\u00a3\2\u0293\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0298\5\u01ce\u00e8\2\u0297\u0296\3"+
		"\2\2\2\u0297\u0298\3\2\2\2\u0298\21\3\2\2\2\u0299\u029a\5\u01c2\u00e2"+
		"\2\u029a\u029e\5\26\f\2\u029b\u029c\5\u01d6\u00ec\2\u029c\u029d\5\30\r"+
		"\2\u029d\u029f\3\2\2\2\u029e\u029b\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a3"+
		"\3\2\2\2\u02a0\u02a1\5\u01d4\u00eb\2\u02a1\u02a2\5\u0144\u00a3\2\u02a2"+
		"\u02a4\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\23\3\2\2"+
		"\2\u02a5\u02a6\5\u01a2\u00d2\2\u02a6\u02a7\5\26\f\2\u02a7\u02a8\5\u01d6"+
		"\u00ec\2\u02a8\u02a9\5\30\r\2\u02a9\u02aa\5\u0204\u0103\2\u02aa\u02ab"+
		"\5\u0144\u00a3\2\u02ab\25\3\2\2\2\u02ac\u02af\5\u0162\u00b2\2\u02ad\u02af"+
		"\5\u0164\u00b3\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b9\3"+
		"\2\2\2\u02b0\u02b9\5\u0168\u00b5\2\u02b1\u02b9\5\u0172\u00ba\2\u02b2\u02b9"+
		"\5\u0188\u00c5\2\u02b3\u02b9\5\u0192\u00ca\2\u02b4\u02b9\5\u0182\u00c2"+
		"\2\u02b5\u02b9\5\u018c\u00c7\2\u02b6\u02b9\5\u01ca\u00e6\2\u02b7\u02b9"+
		"\5\u01f4\u00fb\2\u02b8\u02ae\3\2\2\2\u02b8\u02b0\3\2\2\2\u02b8\u02b1\3"+
		"\2\2\2\u02b8\u02b2\3\2\2\2\u02b8\u02b3\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b8"+
		"\u02b5\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\27\3\2\2"+
		"\2\u02ba\u02bb\5\u0162\u00b2\2\u02bb\u02bc\5\u01a0\u00d1\2\u02bc\u02e7"+
		"\3\2\2\2\u02bd\u02be\5\u0162\u00b2\2\u02be\u02bf\5\u01a0\u00d1\2\u02bf"+
		"\u02c0\5\u01a6\u00d4\2\u02c0\u02c1\5\u01ba\u00de\2\u02c1\u02c2\5\u0136"+
		"\u009c\2\u02c2\u02e7\3\2\2\2\u02c3\u02c7\5\u019e\u00d0\2\u02c4\u02c5\5"+
		"\u0136\u009c\2\u02c5\u02c6\7\20\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c4\3"+
		"\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\5\u0150\u00a9"+
		"\2\u02ca\u02e7\3\2\2\2\u02cb\u02cc\5\u0162\u00b2\2\u02cc\u02cd\5\u01bc"+
		"\u00df\2\u02cd\u02e7\3\2\2\2\u02ce\u02cf\5\u01ba\u00de\2\u02cf\u02d0\5"+
		"\u0136\u009c\2\u02d0\u02e7\3\2\2\2\u02d1\u02d3\5\u0200\u0101\2\u02d2\u02d1"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d7\3\2\2\2\u02d4\u02d5\5\u0136\u009c"+
		"\2\u02d5\u02d6\7\20\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d4\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02e7\5\u0138\u009d\2\u02da\u02db"+
		"\5\u0162\u00b2\2\u02db\u02dc\5\u01f2\u00fa\2\u02dc\u02e7\3\2\2\2\u02dd"+
		"\u02de\5\u01ea\u00f6\2\u02de\u02df\5\u0144\u00a3\2\u02df\u02e7\3\2\2\2"+
		"\u02e0\u02e3\5\u01ec\u00f7\2\u02e1\u02e3\5\u01ee\u00f8\2\u02e2\u02e0\3"+
		"\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\5\u01f0\u00f9"+
		"\2\u02e5\u02e7\3\2\2\2\u02e6\u02ba\3\2\2\2\u02e6\u02bd\3\2\2\2\u02e6\u02c3"+
		"\3\2\2\2\u02e6\u02cb\3\2\2\2\u02e6\u02ce\3\2\2\2\u02e6\u02d2\3\2\2\2\u02e6"+
		"\u02da\3\2\2\2\u02e6\u02dd\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7\31\3\2\2"+
		"\2\u02e8\u02e9\5\u0182\u00c2\2\u02e9\u02eb\5\u0214\u010b\2\u02ea\u02ec"+
		"\5\u00fa~\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2"+
		"\2\u02ed\u02ee\5\u0154\u00ab\2\u02ee\u02ef\5\u0220\u0111\2\u02ef\u02f0"+
		"\5\u01de\u00f0\2\u02f0\u02f3\5\u0130\u0099\2\u02f1\u02f4\5\u01fe\u0100"+
		"\2\u02f2\u02f4\5\u01cc\u00e7\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2"+
		"\u02f3\u02f4\3\2\2\2\u02f4\33\3\2\2\2\u02f5\u02f6\5\u0182\u00c2\2\u02f6"+
		"\u02f8\5\u01ea\u00f6\2\u02f7\u02f9\5\u00fa~\2\u02f8\u02f7\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\5\u0144\u00a3\2\u02fb\u02fd"+
		"\5n8\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\35\3\2\2\2\u02fe"+
		"\u02ff\5\u0182\u00c2\2\u02ff\u0301\5\u020c\u0107\2\u0300\u0302\5\u00fa"+
		"~\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0306\3\2\2\2\u0303"+
		"\u0304\5\u0136\u009c\2\u0304\u0305\7\20\2\2\u0305\u0307\3\2\2\2\u0306"+
		"\u0303\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\5\u014c"+
		"\u00a7\2\u0309\u030a\5\u0226\u0114\2\u030a\u030b\5 \21\2\u030b\u030c\5"+
		"\u0228\u0115\2\u030c\37\3\2\2\2\u030d\u030e\5\u013a\u009e\2\u030e\u0315"+
		"\5\u013c\u009f\2\u030f\u0310\5\u0236\u011c\2\u0310\u0311\5\u013a\u009e"+
		"\2\u0311\u0312\5\u013c\u009f\2\u0312\u0314\3\2\2\2\u0313\u030f\3\2\2\2"+
		"\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316!\3"+
		"\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\5\u0182\u00c2\2\u0319\u031b\5\u0206"+
		"\u0104\2\u031a\u031c\5\u00fa~\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2"+
		"\2\u031c\u0320\3\2\2\2\u031d\u031e\5\u0136\u009c\2\u031e\u031f\7\20\2"+
		"\2\u031f\u0321\3\2\2\2\u0320\u031d\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322"+
		"\3\2\2\2\u0322\u0323\5\u0146\u00a4\2\u0323\u0324\5\u0218\u010d\2\u0324"+
		"\u0325\5\u0148\u00a5\2\u0325#\3\2\2\2\u0326\u0327\5\u0182\u00c2\2\u0327"+
		"\u0328\5\u01c8\u00e5\2\u0328\u032a\5\u021c\u010f\2\u0329\u032b\5\u00fa"+
		"~\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032f\3\2\2\2\u032c"+
		"\u032d\5\u0136\u009c\2\u032d\u032e\7\20\2\2\u032e\u0330\3\2\2\2\u032f"+
		"\u032c\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\5\u014a"+
		"\u00a6\2\u0332\u0333\5\u016e\u00b8\2\u0333\u0334\5\u01f4\u00fb\2\u0334"+
		"\u0335\5\u0102\u0082\2\u0335\u0339\5\u019a\u00ce\2\u0336\u0337\5\u0136"+
		"\u009c\2\u0337\u0338\7\20\2\2\u0338\u033a\3\2\2\2\u0339\u0336\3\2\2\2"+
		"\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\5\u0138\u009d\2\u033c"+
		"\u033e\5&\24\2\u033d\u033f\5\u00a4S\2\u033e\u033d\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u0343\3\2\2\2\u0340\u0341\5\u0220\u0111\2\u0341\u0342\5"+
		",\27\2\u0342\u0344\3\2\2\2\u0343\u0340\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"%\3\2\2\2\u0345\u0346\5\u021e\u0110\2\u0346\u034a\5(\25\2\u0347\u0348"+
		"\5\u016a\u00b6\2\u0348\u0349\5\u011e\u0090\2\u0349\u034b\3\2\2\2\u034a"+
		"\u0347\3\2\2\2\u034a\u034b\3\2\2\2\u034b\'\3\2\2\2\u034c\u0352\5*\26\2"+
		"\u034d\u034e\5\u016a\u00b6\2\u034e\u034f\5*\26\2\u034f\u0351\3\2\2\2\u0350"+
		"\u034d\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353)\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\5\u013a\u009e\2\u0356"+
		"\u0357\5\u01b2\u00da\2\u0357\u0358\5\u01d0\u00e9\2\u0358\u0359\5\u01d2"+
		"\u00ea\2\u0359+\3\2\2\2\u035a\u035b\5\u008eH\2\u035b-\3\2\2\2\u035c\u035d"+
		"\5\u0182\u00c2\2\u035d\u035f\5\u01ba\u00de\2\u035e\u0360\5\u00fa~\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\5\u0136"+
		"\u009c\2\u0362\u0363\5\u0220\u0111\2\u0363\u0364\5\u01e6\u00f4\2\u0364"+
		"\u0365\7\u00b0\2\2\u0365\u0366\5\u022a\u0116\2\u0366\u0367\5\u00be`\2"+
		"\u0367\u036b\5\u022c\u0117\2\u0368\u0369\5\u016a\u00b6\2\u0369\u036a\5"+
		"\u00c2b\2\u036a\u036c\3\2\2\2\u036b\u0368\3\2\2\2\u036b\u036c\3\2\2\2"+
		"\u036c/\3\2\2\2\u036d\u036f\5\u0182\u00c2\2\u036e\u0370\5D#\2\u036f\u036e"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\5\u019e\u00d0"+
		"\2\u0372\u0374\5\u00fa~\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0378\3\2\2\2\u0375\u0376\5\u0136\u009c\2\u0376\u0377\7\20\2\2\u0377"+
		"\u0379\3\2\2\2\u0378\u0375\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u037b\5\u0150\u00a9\2\u037b\u037d\5\u0226\u0114\2\u037c\u037e"+
		"\5\64\33\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2"+
		"\u037f\u0380\5\u0228\u0115\2\u0380\u0381\5\66\34\2\u0381\u0382\5\u01e8"+
		"\u00f5\2\u0382\u0383\5\u013c\u009f\2\u0383\u0384\5\u01be\u00e0\2\u0384"+
		"\u0385\5\u0152\u00aa\2\u0385\u0386\5\u016e\u00b8\2\u0386\u0387\5\62\32"+
		"\2\u0387\61\3\2\2\2\u0388\u0389\t\2\2\2\u0389\63\3\2\2\2\u038a\u0390\5"+
		"\u015a\u00ae\2\u038b\u038c\5\u0236\u011c\2\u038c\u038d\5\u015a\u00ae\2"+
		"\u038d\u038f\3\2\2\2\u038e\u038b\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e"+
		"\3\2\2\2\u0390\u0391\3\2\2\2\u0391\65\3\2\2\2\u0392\u0390\3\2\2\2\u0393"+
		"\u0398\5\u017a\u00be\2\u0394\u0395\5\u01e8\u00f5\2\u0395\u0396\5\u01d2"+
		"\u00ea\2\u0396\u0398\3\2\2\2\u0397\u0393\3\2\2\2\u0397\u0394\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039a\5\u01d6\u00ec\2\u039a\u039b\5\u01d2\u00ea\2"+
		"\u039b\u039c\5\u01ac\u00d7\2\u039c\67\3\2\2\2\u039d\u039f\5\u0182\u00c2"+
		"\2\u039e\u03a0\5D#\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1"+
		"\3\2\2\2\u03a1\u03a3\5\u0160\u00b1\2\u03a2\u03a4\5\u00fa~\2\u03a3\u03a2"+
		"\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a8\3\2\2\2\u03a5\u03a6\5\u0136\u009c"+
		"\2\u03a6\u03a7\7\20\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a5\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\5\u014e\u00a8\2\u03ab\u03ac"+
		"\5\u0226\u0114\2\u03ac\u03ad\5\u013c\u009f\2\u03ad\u03ae\5\u0228\u0115"+
		"\2\u03ae\u03af\5\u01f8\u00fd\2\u03af\u03b0\5\u0150\u00a9\2\u03b0\u03b1"+
		"\5\u01fc\u00ff\2\u03b1\u03b2\5\u013c\u009f\2\u03b2\u03b3\5\u0198\u00cd"+
		"\2\u03b3\u03b4\5\u0150\u00a9\2\u03b4\u03b5\5\u01aa\u00d6\2\u03b5\u03b6"+
		"\5:\36\2\u03b69\3\2\2\2\u03b7\u03bc\5\u012a\u0096\2\u03b8\u03bc\5B\"\2"+
		"\u03b9\u03bc\5@!\2\u03ba\u03bc\5<\37\2\u03bb\u03b7\3\2\2\2\u03bb\u03b8"+
		"\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc;\3\2\2\2\u03bd"+
		"\u03be\5\u022a\u0116\2\u03be\u03c4\5> \2\u03bf\u03c0\5\u0236\u011c\2\u03c0"+
		"\u03c1\5> \2\u03c1\u03c3\3\2\2\2\u03c2\u03bf\3\2\2\2\u03c3\u03c6\3\2\2"+
		"\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c4"+
		"\3\2\2\2\u03c7\u03c8\5\u022c\u0117\2\u03c8=\3\2\2\2\u03c9\u03ca\5\u0158"+
		"\u00ad\2\u03ca\u03cb\7\13\2\2\u03cb\u03cc\5:\36\2\u03cc?\3\2\2\2\u03cd"+
		"\u03ce\5\u0226\u0114\2\u03ce\u03d5\5B\"\2\u03cf\u03d0\5\u0236\u011c\2"+
		"\u03d0\u03d1\5\u012a\u0096\2\u03d1\u03d4\3\2\2\2\u03d2\u03d4\5B\"\2\u03d3"+
		"\u03cf\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8"+
		"\u03d9\5\u0228\u0115\2\u03d9A\3\2\2\2\u03da\u03db\5\u0226\u0114\2\u03db"+
		"\u03e1\5\u012a\u0096\2\u03dc\u03dd\5\u0236\u011c\2\u03dd\u03de\5\u012a"+
		"\u0096\2\u03de\u03e0\3\2\2\2\u03df\u03dc\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1"+
		"\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e1\3\2"+
		"\2\2\u03e4\u03e5\5\u0228\u0115\2\u03e5C\3\2\2\2\u03e6\u03e7\5\u01da\u00ee"+
		"\2\u03e7\u03e8\5\u01e4\u00f3\2\u03e8E\3\2\2\2\u03e9\u03ea\5\u0168\u00b5"+
		"\2\u03ea\u03eb\5\u0214\u010b\2\u03eb\u03ec\5\u0154\u00ab\2\u03ec\u03ed"+
		"\5\u0220\u0111\2\u03ed\u03ef\5H%\2\u03ee\u03f0\5J&\2\u03ef\u03ee\3\2\2"+
		"\2\u03ef\u03f0\3\2\2\2\u03f0G\3\2\2\2\u03f1\u03f2\5\u01de\u00f0\2\u03f2"+
		"\u03f3\5\u0130\u0099\2\u03f3I\3\2\2\2\u03f4\u03f7\5\u01fe\u0100\2\u03f5"+
		"\u03f7\5\u01cc\u00e7\2\u03f6\u03f4\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7K"+
		"\3\2\2\2\u03f8\u03f9\5\u0168\u00b5\2\u03f9\u03fd\5\u020c\u0107\2\u03fa"+
		"\u03fb\5\u0136\u009c\2\u03fb\u03fc\7\20\2\2\u03fc\u03fe\3\2\2\2\u03fd"+
		"\u03fa\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\5\u014c"+
		"\u00a7\2\u0400\u0401\5N(\2\u0401M\3\2\2\2\u0402\u0406\5X-\2\u0403\u0406"+
		"\5V,\2\u0404\u0406\5P)\2\u0405\u0402\3\2\2\2\u0405\u0403\3\2\2\2\u0405"+
		"\u0404\3\2\2\2\u0406O\3\2\2\2\u0407\u0408\5\u01e2\u00f2\2\u0408\u0409"+
		"\5R*\2\u0409Q\3\2\2\2\u040a\u0410\5T+\2\u040b\u040c\5\u016a\u00b6\2\u040c"+
		"\u040d\5T+\2\u040d\u040f\3\2\2\2\u040e\u040b\3\2\2\2\u040f\u0412\3\2\2"+
		"\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411S\3\2\2\2\u0412\u0410"+
		"\3\2\2\2\u0413\u0414\5\u013a\u009e\2\u0414\u0415\5\u0204\u0103\2\u0415"+
		"\u0416\5\u013a\u009e\2\u0416U\3\2\2\2\u0417\u0418\5\u015e\u00b0\2\u0418"+
		"\u0419\5 \21\2\u0419W\3\2\2\2\u041a\u041b\5\u0168\u00b5\2\u041b\u041c"+
		"\5\u013a\u009e\2\u041c\u041d\5\u020c\u0107\2\u041d\u041e\5\u013c\u009f"+
		"\2\u041eY\3\2\2\2\u041f\u0420\5\u0168\u00b5\2\u0420\u0424\5\u0200\u0101"+
		"\2\u0421\u0422\5\u0136\u009c\2\u0422\u0423\7\20\2\2\u0423\u0425\3\2\2"+
		"\2\u0424\u0421\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427"+
		"\5\u0138\u009d\2\u0427\u0428\5\\/\2\u0428[\3\2\2\2\u0429\u0430\5h\65\2"+
		"\u042a\u0430\5d\63\2\u042b\u0430\5d\63\2\u042c\u0430\5b\62\2\u042d\u0430"+
		"\5`\61\2\u042e\u0430\5^\60\2\u042f\u0429\3\2\2\2\u042f\u042a\3\2\2\2\u042f"+
		"\u042b\3\2\2\2\u042f\u042c\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u042e\3\2"+
		"\2\2\u0430]\3\2\2\2\u0431\u0432\5\u0220\u0111\2\u0432\u0433\5\u008eH\2"+
		"\u0433_\3\2\2\2\u0434\u0435\5\u01e2\u00f2\2\u0435\u0436\5\u013a\u009e"+
		"\2\u0436\u0437\5\u0204\u0103\2\u0437\u0438\5\u013a\u009e\2\u0438a\3\2"+
		"\2\2\u0439\u043a\5\u018c\u00c7\2\u043a\u043b\5\u017e\u00c0\2\u043b\u043c"+
		"\5\u01fa\u00fe\2\u043cc\3\2\2\2\u043d\u043e\5\u018c\u00c7\2\u043e\u043f"+
		"\5f\64\2\u043fe\3\2\2\2\u0440\u0446\5\u013a\u009e\2\u0441\u0442\5\u0236"+
		"\u011c\2\u0442\u0443\5\u013a\u009e\2\u0443\u0445\3\2\2\2\u0444\u0441\3"+
		"\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"g\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u044a\5\u015e\u00b0\2\u044a\u044b"+
		"\5j\66\2\u044bi\3\2\2\2\u044c\u044d\5\u013a\u009e\2\u044d\u0454\5\u013c"+
		"\u009f\2\u044e\u044f\5\u0236\u011c\2\u044f\u0450\5\u013a\u009e\2\u0450"+
		"\u0451\5\u013c\u009f\2\u0451\u0453\3\2\2\2\u0452\u044e\3\2\2\2\u0453\u0456"+
		"\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455k\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0457\u0458\5\u0168\u00b5\2\u0458\u0459\5\u01ea\u00f6\2"+
		"\u0459\u045b\5\u0144\u00a3\2\u045a\u045c\5n8\2\u045b\u045a\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045cm\3\2\2\2\u045d\u045e\5\u0220\u0111\2\u045e\u0464"+
		"\5p9\2\u045f\u0460\5\u016a\u00b6\2\u0460\u0461\5p9\2\u0461\u0463\3\2\2"+
		"\2\u0462\u045f\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465"+
		"\3\2\2\2\u0465o\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u0468\5\u01de\u00f0"+
		"\2\u0468\u0469\7\u00b0\2\2\u0469\u046a\5\u0130\u0099\2\u046a\u0478\3\2"+
		"\2\2\u046b\u046c\5\u01c6\u00e4\2\u046c\u046d\7\u00b0\2\2\u046d\u046e\5"+
		"\u0132\u009a\2\u046e\u0478\3\2\2\2\u046f\u0470\5\u01fe\u0100\2\u0470\u0471"+
		"\7\u00b0\2\2\u0471\u0472\5\u0132\u009a\2\u0472\u0478\3\2\2\2\u0473\u0474"+
		"\5\u01d8\u00ed\2\u0474\u0475\7\u00b0\2\2\u0475\u0476\5\u0096L\2\u0476"+
		"\u0478\3\2\2\2\u0477\u0467\3\2\2\2\u0477\u046b\3\2\2\2\u0477\u046f\3\2"+
		"\2\2\u0477\u0473\3\2\2\2\u0478q\3\2\2\2\u0479\u047a\5\u0168\u00b5\2\u047a"+
		"\u047b\5\u01c8\u00e5\2\u047b\u047f\5\u021c\u010f\2\u047c\u047d\5\u0136"+
		"\u009c\2\u047d\u047e\7\20\2\2\u047e\u0480\3\2\2\2\u047f\u047c\3\2\2\2"+
		"\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0485\5\u014a\u00a6\2\u0482"+
		"\u0483\5\u0220\u0111\2\u0483\u0484\5\u008eH\2\u0484\u0486\3\2\2\2\u0485"+
		"\u0482\3\2\2\2\u0485\u0486\3\2\2\2\u0486s\3\2\2\2\u0487\u0488\5\u018c"+
		"\u00c7\2\u0488\u048a\5\u0214\u010b\2\u0489\u048b\5\u00fc\177\2\u048a\u0489"+
		"\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\5\u0154\u00ab"+
		"\2\u048du\3\2\2\2\u048e\u048f\5\u018c\u00c7\2\u048f\u0491\5\u020c\u0107"+
		"\2\u0490\u0492\5\u00fc\177\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
		"\u0496\3\2\2\2\u0493\u0494\5\u0136\u009c\2\u0494\u0495\7\20\2\2\u0495"+
		"\u0497\3\2\2\2\u0496\u0493\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2"+
		"\2\2\u0498\u0499\5\u014c\u00a7\2\u0499w\3\2\2\2\u049a\u049b\5\u018c\u00c7"+
		"\2\u049b\u049c\5\u01c8\u00e5\2\u049c\u049e\5\u021c\u010f\2\u049d\u049f"+
		"\5\u00fc\177\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a3\3\2"+
		"\2\2\u04a0\u04a1\5\u0136\u009c\2\u04a1\u04a2\7\20\2\2\u04a2\u04a4\3\2"+
		"\2\2\u04a3\u04a0\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a6\5\u014a\u00a6\2\u04a6y\3\2\2\2\u04a7\u04a8\5\u018c\u00c7\2\u04a8"+
		"\u04aa\5\u0160\u00b1\2\u04a9\u04ab\5\u00fc\177\2\u04aa\u04a9\3\2\2\2\u04aa"+
		"\u04ab\3\2\2\2\u04ab\u04af\3\2\2\2\u04ac\u04ad\5\u0136\u009c\2\u04ad\u04ae"+
		"\7\20\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ac\3\2\2\2\u04af\u04b0\3\2\2\2"+
		"\u04b0\u04b1\3\2\2\2\u04b1\u04b2\5\u014e\u00a8\2\u04b2{\3\2\2\2\u04b3"+
		"\u04b4\5\u018c\u00c7\2\u04b4\u04b6\5\u019e\u00d0\2\u04b5\u04b7\5\u00fc"+
		"\177\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04bb\3\2\2\2\u04b8"+
		"\u04b9\5\u0136\u009c\2\u04b9\u04ba\7\20\2\2\u04ba\u04bc\3\2\2\2\u04bb"+
		"\u04b8\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\5\u0150"+
		"\u00a9\2\u04be}\3\2\2\2\u04bf\u04c0\5\u018c\u00c7\2\u04c0\u04c2\5\u0206"+
		"\u0104\2\u04c1\u04c3\5\u00fc\177\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2"+
		"\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\5\u0146\u00a4\2\u04c5\u04c9\5\u01d6"+
		"\u00ec\2\u04c6\u04c7\5\u0136\u009c\2\u04c7\u04c8\7\20\2\2\u04c8\u04ca"+
		"\3\2\2\2\u04c9\u04c6\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb"+
		"\u04cc\5\u0138\u009d\2\u04cc\177\3\2\2\2\u04cd\u04ce\5\u018c\u00c7\2\u04ce"+
		"\u04d0\5\u01ea\u00f6\2\u04cf\u04d1\5\u00fc\177\2\u04d0\u04cf\3\2\2\2\u04d0"+
		"\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\5\u0144\u00a3\2\u04d3\u0081"+
		"\3\2\2\2\u04d4\u04d5\5\u018c\u00c7\2\u04d5\u04d7\5\u0200\u0101\2\u04d6"+
		"\u04d8\5\u00fc\177\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04dc"+
		"\3\2\2\2\u04d9\u04da\5\u0136\u009c\2\u04da\u04db\7\20\2\2\u04db\u04dd"+
		"\3\2\2\2\u04dc\u04d9\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04df\5\u0138\u009d\2\u04df\u0083\3\2\2\2\u04e0\u04e1\5\u018c\u00c7\2"+
		"\u04e1\u04e3\5\u01ba\u00de\2\u04e2\u04e4\5\u00fc\177\2\u04e3\u04e2\3\2"+
		"\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5\u0136\u009c"+
		"\2\u04e6\u0085\3\2\2\2\u04e7\u04e8\5\u018c\u00c7\2\u04e8\u04ea\5\u01a8"+
		"\u00d5\2\u04e9\u04eb\5\u00fc\177\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2"+
		"\2\2\u04eb\u04ef\3\2\2\2\u04ec\u04ed\5\u0136\u009c\2\u04ed\u04ee\7\20"+
		"\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04ec\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\5\u00caf\2\u04f2\u0087\3\2\2\2\u04f3\u04f4"+
		"\5\u0182\u00c2\2\u04f4\u04f6\5\u0200\u0101\2\u04f5\u04f7\5\u00fa~\2\u04f6"+
		"\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04fb\3\2\2\2\u04f8\u04f9\5\u0136"+
		"\u009c\2\u04f9\u04fa\7\20\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04f8\3\2\2\2"+
		"\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\5\u0138\u009d\2\u04fe"+
		"\u04ff\5\u0226\u0114\2\u04ff\u0500\5\u009eP\2\u0500\u0502\5\u0228\u0115"+
		"\2\u0501\u0503\5\u008aF\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0089\3\2\2\2\u0504\u0506\5\u0220\u0111\2\u0505\u0507\5\u008eH\2\u0506"+
		"\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u008b\3\2\2\2\u0508\u0509\5\u017c"+
		"\u00bf\2\u0509\u050a\5\u01dc\u00ef\2\u050a\u050b\5\u0178\u00bd\2\u050b"+
		"\u050c\5\u0226\u0114\2\u050c\u050e\5\u013a\u009e\2\u050d\u050f\5\u0142"+
		"\u00a2\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510"+
		"\u0511\5\u0228\u0115\2\u0511\u008d\3\2\2\2\u0512\u0518\5\u0090I\2\u0513"+
		"\u0514\5\u016a\u00b6\2\u0514\u0515\5\u0090I\2\u0515\u0517\3\2\2\2\u0516"+
		"\u0513\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2"+
		"\2\2\u0519\u008f\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051c\5\u0092J\2\u051c"+
		"\u051d\7\u00b0\2\2\u051d\u051e\5\u0094K\2\u051e\u0525\3\2\2\2\u051f\u0520"+
		"\5\u0092J\2\u0520\u0521\7\u00b0\2\2\u0521\u0522\5\u0096L\2\u0522\u0525"+
		"\3\2\2\2\u0523\u0525\5\u008cG\2\u0524\u051b\3\2\2\2\u0524\u051f\3\2\2"+
		"\2\u0524\u0523\3\2\2\2\u0525\u0091\3\2\2\2\u0526\u0527\5\u023a\u011e\2"+
		"\u0527\u0093\3\2\2\2\u0528\u052b\5\u0130\u0099\2\u0529\u052b\5\u012e\u0098"+
		"\2\u052a\u0528\3\2\2\2\u052a\u0529\3\2\2\2\u052b\u0095\3\2\2\2\u052c\u052d"+
		"\5\u022a\u0116\2\u052d\u0533\5\u0098M\2\u052e\u052f\5\u0236\u011c\2\u052f"+
		"\u0530\5\u0098M\2\u0530\u0532\3\2\2\2\u0531\u052e\3\2\2\2\u0532\u0535"+
		"\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0536\3\2\2\2\u0535"+
		"\u0533\3\2\2\2\u0536\u0537\5\u022c\u0117\2\u0537\u0097\3\2\2\2\u0538\u0539"+
		"\5\u009aN\2\u0539\u053a\7\13\2\2\u053a\u053b\5\u009cO\2\u053b\u0099\3"+
		"\2\2\2\u053c\u053d\5\u0130\u0099\2\u053d\u009b\3\2\2\2\u053e\u0541\5\u0130"+
		"\u0099\2\u053f\u0541\5\u012e\u0098\2\u0540\u053e\3\2\2\2\u0540\u053f\3"+
		"\2\2\2\u0541\u009d\3\2\2\2\u0542\u0548\5\u00a0Q\2\u0543\u0544\5\u0236"+
		"\u011c\2\u0544\u0545\5\u00a0Q\2\u0545\u0547\3\2\2\2\u0546\u0543\3\2\2"+
		"\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054e"+
		"\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u054c\5\u0236\u011c\2\u054c\u054d\5"+
		"\u00a4S\2\u054d\u054f\3\2\2\2\u054e\u054b\3\2\2\2\u054e\u054f\3\2\2\2"+
		"\u054f\u009f\3\2\2\2\u0550\u0551\5\u013a\u009e\2\u0551\u0553\5\u013c\u009f"+
		"\2\u0552\u0554\5\u00a2R\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554"+
		"\u00a1\3\2\2\2\u0555\u0556\5\u01e0\u00f1\2\u0556\u0557\5\u01b6\u00dc\2"+
		"\u0557\u00a3\3\2\2\2\u0558\u0559\5\u01e0\u00f1\2\u0559\u055a\5\u01b6\u00dc"+
		"\2\u055a\u055b\5\u0226\u0114\2\u055b\u055c\5\u00a6T\2\u055c\u055d\5\u0228"+
		"\u0115\2\u055d\u00a5\3\2\2\2\u055e\u0562\5\u00a8U\2\u055f\u0562\5\u00aa"+
		"V\2\u0560\u0562\5\u00acW\2\u0561\u055e\3\2\2\2\u0561\u055f\3\2\2\2\u0561"+
		"\u0560\3\2\2\2\u0562\u00a7\3\2\2\2\u0563\u0564\5\u013a\u009e\2\u0564\u00a9"+
		"\3\2\2\2\u0565\u0566\5\u00b2Z\2\u0566\u0567\5\u0236\u011c\2\u0567\u0568"+
		"\5\u00b0Y\2\u0568\u00ab\3\2\2\2\u0569\u056a\5\u0226\u0114\2\u056a\u056b"+
		"\5\u00aeX\2\u056b\u056c\5\u0228\u0115\2\u056c\u056d\5\u0236\u011c\2\u056d"+
		"\u056e\5\u00b0Y\2\u056e\u00ad\3\2\2\2\u056f\u0575\5\u00b2Z\2\u0570\u0571"+
		"\5\u0236\u011c\2\u0571\u0572\5\u00b2Z\2\u0572\u0574\3\2\2\2\u0573\u0570"+
		"\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576"+
		"\u00af\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u057e\5\u00b4[\2\u0579\u057a"+
		"\5\u0236\u011c\2\u057a\u057b\5\u00b4[\2\u057b\u057d\3\2\2\2\u057c\u0579"+
		"\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u00b1\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582\5\u013a\u009e\2\u0582\u00b3"+
		"\3\2\2\2\u0583\u0584\5\u013a\u009e\2\u0584\u00b5\3\2\2\2\u0585\u0586\5"+
		"\u016c\u00b7\2\u0586\u0587\5\u0174\u00bb\2\u0587\u00b7\3\2\2\2\u0588\u058a"+
		"\5\u0176\u00bc\2\u0589\u058b\5\u00ba^\2\u058a\u0589\3\2\2\2\u058a\u058b"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\5\u0174\u00bb\2\u058d\u058f\5"+
		"\u00f8}\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u00b9\3\2\2\2"+
		"\u0590\u0593\5\u01c4\u00e3\2\u0591\u0593\5\u020e\u0108\2\u0592\u0590\3"+
		"\2\2\2\u0592\u0591\3\2\2\2\u0593\u00bb\3\2\2\2\u0594\u0595\5\u0168\u00b5"+
		"\2\u0595\u0596\5\u01ba\u00de\2\u0596\u0597\5\u0136\u009c\2\u0597\u0598"+
		"\5\u0220\u0111\2\u0598\u0599\5\u01e6\u00f4\2\u0599\u059a\7\u00b0\2\2\u059a"+
		"\u059b\5\u022a\u0116\2\u059b\u059c\5\u00be`\2\u059c\u05a0\5\u022c\u0117"+
		"\2\u059d\u059e\5\u016a\u00b6\2\u059e\u059f\5\u00c2b\2\u059f\u05a1\3\2"+
		"\2\2\u05a0\u059d\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u00bd\3\2\2\2\u05a2"+
		"\u05a8\5\u00c0a\2\u05a3\u05a4\5\u0236\u011c\2\u05a4\u05a5\5\u00c0a\2\u05a5"+
		"\u05a7\3\2\2\2\u05a6\u05a3\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2"+
		"\2\2\u05a8\u05a9\3\2\2\2\u05a9\u00bf\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab"+
		"\u05ac\7\u00a9\2\2\u05ac\u05ad\7\13\2\2\u05ad\u05b2\7\u00a9\2\2\u05ae"+
		"\u05af\7\u00a9\2\2\u05af\u05b0\7\13\2\2\u05b0\u05b2\7\u00aa\2\2\u05b1"+
		"\u05ab\3\2\2\2\u05b1\u05ae\3\2\2\2\u05b2\u00c1\3\2\2\2\u05b3\u05b4\5\u018e"+
		"\u00c8\2\u05b4\u05b5\7\u00b0\2\2\u05b5\u05b6\5\u0132\u009a\2\u05b6\u00c3"+
		"\3\2\2\2\u05b7\u05b8\5\u0212\u010a\2\u05b8\u05b9\5\u0136\u009c\2\u05b9"+
		"\u00c5\3\2\2\2\u05ba\u05bc\5\u0208\u0105\2\u05bb\u05bd\5\u0200\u0101\2"+
		"\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05c1\3\2\2\2\u05be\u05bf"+
		"\5\u0136\u009c\2\u05bf\u05c0\7\20\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05be"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\5\u0138\u009d"+
		"\2\u05c4\u00c7\3\2\2\2\u05c5\u05c6\5\u0182\u00c2\2\u05c6\u05c8\5\u01a8"+
		"\u00d5\2\u05c7\u05c9\5\u00fa~\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2"+
		"\2\u05c9\u05cb\3\2\2\2\u05ca\u05cc\5\u00caf\2\u05cb\u05ca\3\2\2\2\u05cb"+
		"\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d1\5\u01d6\u00ec\2\u05ce\u05cf"+
		"\5\u0136\u009c\2\u05cf\u05d0\7\20\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05ce"+
		"\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\5\u0138\u009d"+
		"\2\u05d4\u05d5\5\u0226\u0114\2\u05d5\u05d6\5\u00ccg\2\u05d6\u05d7\5\u0228"+
		"\u0115\2\u05d7\u00c9\3\2\2\2\u05d8\u05db\5\u023a\u011e\2\u05d9\u05db\5"+
		"\u0130\u0099\2\u05da\u05d8\3\2\2\2\u05da\u05d9\3\2\2\2\u05db\u00cb\3\2"+
		"\2\2\u05dc\u05e1\5\u013a\u009e\2\u05dd\u05e1\5\u00ceh\2\u05de\u05e1\5"+
		"\u00d0i\2\u05df\u05e1\5\u00d2j\2\u05e0\u05dc\3\2\2\2\u05e0\u05dd\3\2\2"+
		"\2\u05e0\u05de\3\2\2\2\u05e0\u05df\3\2\2\2\u05e1\u00cd\3\2\2\2\u05e2\u05e3"+
		"\5\u01b8\u00dd\2\u05e3\u05e4\5\u0226\u0114\2\u05e4\u05e5\5\u013a\u009e"+
		"\2\u05e5\u05e6\5\u0228\u0115\2\u05e6\u00cf\3\2\2\2\u05e7\u05e8\5\u0190"+
		"\u00c9\2\u05e8\u05e9\5\u0226\u0114\2\u05e9\u05ea\5\u013a\u009e\2\u05ea"+
		"\u05eb\5\u0228\u0115\2\u05eb\u00d1\3\2\2\2\u05ec\u05ed\5\u019c\u00cf\2"+
		"\u05ed\u05ee\5\u0226\u0114\2\u05ee\u05ef\5\u013a\u009e\2\u05ef\u05f0\5"+
		"\u0228\u0115\2\u05f0\u00d3\3\2\2\2\u05f1\u05f3\5\u00b8]\2\u05f2\u05f1"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\5\u0184\u00c3"+
		"\2\u05f5\u05f7\5\u00d6l\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05fa\5\u010e\u0088\2\u05f9\u05fb\5\u00f8}\2\u05fa"+
		"\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05ff\5\u0116"+
		"\u008c\2\u05fd\u0600\5\u00fc\177\2\u05fe\u0600\5\u00dco\2\u05ff\u05fd"+
		"\3\2\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u00d5\3\2\2\2\u0601"+
		"\u0607\5\u00d8m\2\u0602\u0603\5\u0236\u011c\2\u0603\u0604\5\u00d8m\2\u0604"+
		"\u0606\3\2\2\2\u0605\u0602\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2"+
		"\2\2\u0607\u0608\3\2\2\2\u0608\u00d7\3\2\2\2\u0609\u0607\3\2\2\2\u060a"+
		"\u0614\5\u023a\u011e\2\u060b\u060c\5\u023a\u011e\2\u060c\u060f\7\7\2\2"+
		"\u060d\u0610\5\u0130\u0099\2\u060e\u0610\5\u012c\u0097\2\u060f\u060d\3"+
		"\2\2\2\u060f\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612\7\b\2\2\u0612"+
		"\u0614\3\2\2\2\u0613\u060a\3\2\2\2\u0613\u060b\3\2\2\2\u0614\u00d9\3\2"+
		"\2\2\u0615\u0617\5\u00b8]\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2\2\u0617"+
		"\u0618\3\2\2\2\u0618\u061c\5\u0210\u0109\2\u0619\u061a\5\u0136\u009c\2"+
		"\u061a\u061b\7\20\2\2\u061b\u061d\3\2\2\2\u061c\u0619\3\2\2\2\u061c\u061d"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\5\u0138\u009d\2\u061f\u0621\5"+
		"\u00f2z\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\3\2\2\2"+
		"\u0622\u0623\5\u01f6\u00fc\2\u0623\u0624\5\u00e2r\2\u0624\u0627\5\u0116"+
		"\u008c\2\u0625\u0628\5\u00fc\177\2\u0626\u0628\5\u00dco\2\u0627\u0625"+
		"\3\2\2\2\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u00db\3\2\2\2\u0629"+
		"\u062a\5\u01a4\u00d3\2\u062a\u062b\5\u00dep\2\u062b\u00dd\3\2\2\2\u062c"+
		"\u0632\5\u00e0q\2\u062d\u062e\5\u016a\u00b6\2\u062e\u062f\5\u00e0q\2\u062f"+
		"\u0631\3\2\2\2\u0630\u062d\3\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2"+
		"\2\2\u0632\u0633\3\2\2\2\u0633\u00df\3\2\2\2\u0634\u0632\3\2\2\2\u0635"+
		"\u0636\5\u023a\u011e\2\u0636\u0637\7\u00b0\2\2\u0637\u0638\5\u012a\u0096"+
		"\2\u0638\u00e1\3\2\2\2\u0639\u063f\5\u00e4s\2\u063a\u063b\5\u0236\u011c"+
		"\2\u063b\u063c\5\u00e4s\2\u063c\u063e\3\2\2\2\u063d\u063a\3\2\2\2\u063e"+
		"\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u00e3\3\2"+
		"\2\2\u0641\u063f\3\2\2\2\u0642\u0643\5\u023a\u011e\2\u0643\u0648\7\u00b0"+
		"\2\2\u0644\u0649\5\u012a\u0096\2\u0645\u0649\5\u00e8u\2\u0646\u0649\5"+
		"\u00e6t\2\u0647\u0649\5\u00ecw\2\u0648\u0644\3\2\2\2\u0648\u0645\3\2\2"+
		"\2\u0648\u0646\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u067c\3\2\2\2\u064a\u064b"+
		"\5\u023a\u011e\2\u064b\u064c\7\u00b0\2\2\u064c\u064d\5\u023a\u011e\2\u064d"+
		"\u064e\t\3\2\2\u064e\u064f\5\u012c\u0097\2\u064f\u067c\3\2\2\2\u0650\u0651"+
		"\5\u023a\u011e\2\u0651\u0652\7\u00b0\2\2\u0652\u0653\5\u023a\u011e\2\u0653"+
		"\u0654\t\3\2\2\u0654\u0655\5\u00e6t\2\u0655\u067c\3\2\2\2\u0656\u0657"+
		"\5\u023a\u011e\2\u0657\u0658\7\u00b0\2\2\u0658\u0659\5\u00e6t\2\u0659"+
		"\u065a\t\3\2\2\u065a\u065b\5\u023a\u011e\2\u065b\u067c\3\2\2\2\u065c\u065d"+
		"\5\u023a\u011e\2\u065d\u065e\7\u00b0\2\2\u065e\u065f\5\u023a\u011e\2\u065f"+
		"\u0660\t\3\2\2\u0660\u0661\5\u00e8u\2\u0661\u067c\3\2\2\2\u0662\u0663"+
		"\5\u023a\u011e\2\u0663\u0664\7\u00b0\2\2\u0664\u0665\5\u00e8u\2\u0665"+
		"\u0666\t\3\2\2\u0666\u0667\5\u023a\u011e\2\u0667\u067c\3\2\2\2\u0668\u0669"+
		"\5\u023a\u011e\2\u0669\u066a\7\u00b0\2\2\u066a\u066b\5\u023a\u011e\2\u066b"+
		"\u066c\t\3\2\2\u066c\u066d\5\u00ecw\2\u066d\u067c\3\2\2\2\u066e\u066f"+
		"\5\u023a\u011e\2\u066f\u0670\7\u00b0\2\2\u0670\u0671\5\u00ecw\2\u0671"+
		"\u0672\t\3\2\2\u0672\u0673\5\u023a\u011e\2\u0673\u067c\3\2\2\2\u0674\u0675"+
		"\5\u023a\u011e\2\u0675\u0676\5\u0232\u011a\2\u0676\u0677\5\u012c\u0097"+
		"\2\u0677\u0678\5\u0234\u011b\2\u0678\u0679\7\u00b0\2\2\u0679\u067a\5\u012a"+
		"\u0096\2\u067a\u067c\3\2\2\2\u067b\u0642\3\2\2\2\u067b\u064a\3\2\2\2\u067b"+
		"\u0650\3\2\2\2\u067b\u0656\3\2\2\2\u067b\u065c\3\2\2\2\u067b\u0662\3\2"+
		"\2\2\u067b\u0668\3\2\2\2\u067b\u066e\3\2\2\2\u067b\u0674\3\2\2\2\u067c"+
		"\u00e5\3\2\2\2\u067d\u0687\5\u022a\u0116\2\u067e\u0684\5\u012a\u0096\2"+
		"\u067f\u0680\5\u0236\u011c\2\u0680\u0681\5\u0106\u0084\2\u0681\u0683\3"+
		"\2\2\2\u0682\u067f\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684"+
		"\u0685\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u067e\3\2"+
		"\2\2\u0687\u0688\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\5\u022c\u0117"+
		"\2\u068a\u00e7\3\2\2\2\u068b\u068c\5\u022a\u0116\2\u068c\u068d\5\u012a"+
		"\u0096\2\u068d\u068e\5\u0238\u011d\2\u068e\u068f\5\u0106\u0084\2\u068f"+
		"\u0697\3\2\2\2\u0690\u0691\5\u0236\u011c\2\u0691\u0692\5\u012a\u0096\2"+
		"\u0692\u0693\5\u0238\u011d\2\u0693\u0694\5\u0106\u0084\2\u0694\u0696\3"+
		"\2\2\2\u0695\u0690\3\2\2\2\u0696\u0699\3\2\2\2\u0697\u0695\3\2\2\2\u0697"+
		"\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u0697\3\2\2\2\u069a\u069b\5\u022c"+
		"\u0117\2\u069b\u00e9\3\2\2\2\u069c\u069d\5\u022a\u0116\2\u069d\u06a3\5"+
		"\u0106\u0084\2\u069e\u069f\5\u0236\u011c\2\u069f\u06a0\5\u0106\u0084\2"+
		"\u06a0\u06a2\3\2\2\2\u06a1\u069e\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1"+
		"\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6"+
		"\u06a7\5\u022c\u0117\2\u06a7\u00eb\3\2\2\2\u06a8\u06a9\5\u0232\u011a\2"+
		"\u06a9\u06af\5\u012a\u0096\2\u06aa\u06ab\5\u0236\u011c\2\u06ab\u06ac\5"+
		"\u0106\u0084\2\u06ac\u06ae\3\2\2\2\u06ad\u06aa\3\2\2\2\u06ae\u06b1\3\2"+
		"\2\2\u06af\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\3\2\2\2\u06b1"+
		"\u06af\3\2\2\2\u06b2\u06b3\5\u0234\u011b\2\u06b3\u00ed\3\2\2\2\u06b4\u06d1"+
		"\5\u0226\u0114\2\u06b5\u06c6\5\u0106\u0084\2\u06b6\u06b7\5\u0236\u011c"+
		"\2\u06b7\u06b8\5\u0106\u0084\2\u06b8\u06ba\3\2\2\2\u06b9\u06b6\3\2\2\2"+
		"\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06c7"+
		"\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\5\u0236\u011c\2\u06bf\u06c0\5"+
		"\u00eex\2\u06c0\u06c2\3\2\2\2\u06c1\u06be\3\2\2\2\u06c2\u06c5\3\2\2\2"+
		"\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3"+
		"\3\2\2\2\u06c6\u06bb\3\2\2\2\u06c6\u06c3\3\2\2\2\u06c7\u06d2\3\2\2\2\u06c8"+
		"\u06ce\5\u00eex\2\u06c9\u06ca\5\u0236\u011c\2\u06ca\u06cb\5\u00eex\2\u06cb"+
		"\u06cd\3\2\2\2\u06cc\u06c9\3\2\2\2\u06cd\u06d0\3\2\2\2\u06ce\u06cc\3\2"+
		"\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1"+
		"\u06b5\3\2\2\2\u06d1\u06c8\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4\5\u0228"+
		"\u0115\2\u06d4\u00ef\3\2\2\2\u06d5\u06d7\5\u00b8]\2\u06d6\u06d5\3\2\2"+
		"\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9\5\u01ae\u00d8\2"+
		"\u06d9\u06dd\5\u01b0\u00d9\2\u06da\u06db\5\u0136\u009c\2\u06db\u06dc\7"+
		"\20\2\2\u06dc\u06de\3\2\2\2\u06dd\u06da\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u06df\3\2\2\2\u06df\u06e1\5\u0138\u009d\2\u06e0\u06e2\5\u0100\u0081\2"+
		"\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e5"+
		"\5\u00fe\u0080\2\u06e4\u06e6\5\u00fa~\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6"+
		"\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e9\5\u00f2z\2\u06e8\u06e7\3\2\2"+
		"\2\u06e8\u06e9\3\2\2\2\u06e9\u00f1\3\2\2\2\u06ea\u06eb\5\u0218\u010d\2"+
		"\u06eb\u06ec\5\u00f6|\2\u06ec\u06fb\3\2\2\2\u06ed\u06ee\5\u0218\u010d"+
		"\2\u06ee\u06ef\5\u00f6|\2\u06ef\u06f0\5\u016a\u00b6\2\u06f0\u06f1\5\u00f4"+
		"{\2\u06f1\u06fb\3\2\2\2\u06f2\u06f3\5\u0218\u010d\2\u06f3\u06f4\5\u00f4"+
		"{\2\u06f4\u06fb\3\2\2\2\u06f5\u06f6\5\u0218\u010d\2\u06f6\u06f7\5\u00f4"+
		"{\2\u06f7\u06f8\5\u016a\u00b6\2\u06f8\u06f9\5\u00f6|\2\u06f9\u06fb\3\2"+
		"\2\2\u06fa\u06ea\3\2\2\2\u06fa\u06ed\3\2\2\2\u06fa\u06f2\3\2\2\2\u06fa"+
		"\u06f5\3\2\2\2\u06fb\u00f3\3\2\2\2\u06fc\u06fd\5\u0202\u0102\2\u06fd\u06fe"+
		"\5\u012c\u0097\2\u06fe\u00f5\3\2\2\2\u06ff\u0700\5\u020a\u0106\2\u0700"+
		"\u0701\5\u012c\u0097\2\u0701\u00f7\3\2\2\2\u0702\u0703\5\u0218\u010d\2"+
		"\u0703\u0704\5\u00f4{\2\u0704\u00f9\3\2\2\2\u0705\u0706\5\u01a4\u00d3"+
		"\2\u0706\u0707\5\u01d0\u00e9\2\u0707\u0708\5\u0194\u00cb\2\u0708\u00fb"+
		"\3\2\2\2\u0709\u070a\5\u01a4\u00d3\2\u070a\u070b\5\u0194\u00cb\2\u070b"+
		"\u00fd\3\2\2\2\u070c\u070d\5\u021a\u010e\2\u070d\u070e\7\3\2\2\u070e\u070f"+
		"\5\u0104\u0083\2\u070f\u0710\7\4\2\2\u0710\u0715\3\2\2\2\u0711\u0712\5"+
		"\u01b4\u00db\2\u0712\u0713\5\u012a\u0096\2\u0713\u0715\3\2\2\2\u0714\u070c"+
		"\3\2\2\2\u0714\u0711\3\2\2\2\u0715\u00ff\3\2\2\2\u0716\u0717\7\3\2\2\u0717"+
		"\u0718\5\u0102\u0082\2\u0718\u0719\7\4\2\2\u0719\u0101\3\2\2\2\u071a\u0720"+
		"\5\u013a\u009e\2\u071b\u071c\5\u0236\u011c\2\u071c\u071d\5\u013a\u009e"+
		"\2\u071d\u071f\3\2\2\2\u071e\u071b\3\2\2\2\u071f\u0722\3\2\2\2\u0720\u071e"+
		"\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0103\3\2\2\2\u0722\u0720\3\2\2\2\u0723"+
		"\u0729\5\u0106\u0084\2\u0724\u0725\5\u0236\u011c\2\u0725\u0726\5\u0106"+
		"\u0084\2\u0726\u0728\3\2\2\2\u0727\u0724\3\2\2\2\u0728\u072b\3\2\2\2\u0729"+
		"\u0727\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u0105\3\2\2\2\u072b\u0729\3\2"+
		"\2\2\u072c\u0733\5\u012a\u0096\2\u072d\u0733\5\u00e8u\2\u072e\u0733\5"+
		"\u00e6t\2\u072f\u0733\5\u00ecw\2\u0730\u0733\5\u00eex\2\u0731\u0733\5"+
		"\u00eav\2\u0732\u072c\3\2\2\2\u0732\u072d\3\2\2\2\u0732\u072e\3\2\2\2"+
		"\u0732\u072f\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0731\3\2\2\2\u0733\u0107"+
		"\3\2\2\2\u0734\u0736\5\u01f4\u00fb\2\u0735\u0737\5\u0118\u008d\2\u0736"+
		"\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0739\3\2\2\2\u0738\u073a\5\u01b4"+
		"\u00db\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b"+
		"\u073c\5\u011a\u008e\2\u073c\u073e\5\u010e\u0088\2\u073d\u073f\5\u0116"+
		"\u008c\2\u073e\u073d\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0741\3\2\2\2\u0740"+
		"\u0742\5\u0112\u008a\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744"+
		"\3\2\2\2\u0743\u0745\5\u010c\u0087\2\u0744\u0743\3\2\2\2\u0744\u0745\3"+
		"\2\2\2\u0745\u0747\3\2\2\2\u0746\u0748\5\u010a\u0086\2\u0747\u0746\3\2"+
		"\2\2\u0747\u0748\3\2\2\2\u0748\u0109\3\2\2\2\u0749\u074a\5\u0166\u00b4"+
		"\2\u074a\u074b\5\u0196\u00cc\2\u074b\u010b\3\2\2\2\u074c\u074d\5\u01c0"+
		"\u00e1\2\u074d\u074e\5\u012c\u0097\2\u074e\u010d\3\2\2\2\u074f\u0750\5"+
		"\u019a\u00ce\2\u0750\u0751\5\u0110\u0089\2\u0751\u010f\3\2\2\2\u0752\u0758"+
		"\5\u023a\u011e\2\u0753\u0754\5\u023a\u011e\2\u0754\u0755\7\20\2\2\u0755"+
		"\u0756\5\u023a\u011e\2\u0756\u0758\3\2\2\2\u0757\u0752\3\2\2\2\u0757\u0753"+
		"\3\2\2\2\u0758\u0111\3\2\2\2\u0759\u075a\5\u01dc\u00ef\2\u075a\u075b\5"+
		"\u0178\u00bd\2\u075b\u075c\5\u0114\u008b\2\u075c\u0113\3\2\2\2\u075d\u0760"+
		"\5\u023a\u011e\2\u075e\u0761\5\u0170\u00b9\2\u075f\u0761\5\u0186\u00c4"+
		"\2\u0760\u075e\3\2\2\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0115"+
		"\3\2\2\2\u0762\u0763\5\u021e\u0110\2\u0763\u0764\5\u011e\u0090\2\u0764"+
		"\u0117\3\2\2\2\u0765\u0766\5\u018a\u00c6\2\u0766\u0119\3\2\2\2\u0767\u076a"+
		"\7\21\2\2\u0768\u076a\5\u011c\u008f\2\u0769\u0767\3\2\2\2\u0769\u0768"+
		"\3\2\2\2\u076a\u0770\3\2\2\2\u076b\u076c\5\u0236\u011c\2\u076c\u076d\5"+
		"\u011c\u008f\2\u076d\u076f\3\2\2\2\u076e\u076b\3\2\2\2\u076f\u0772\3\2"+
		"\2\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u011b\3\2\2\2\u0772"+
		"\u0770\3\2\2\2\u0773\u0774\5\u023a\u011e\2\u0774\u0775\7\20\2\2\u0775"+
		"\u0776\7\21\2\2\u0776\u0784\3\2\2\2\u0777\u077b\5\u023a\u011e\2\u0778"+
		"\u0779\5\u016e\u00b8\2\u0779\u077a\5\u023a\u011e\2\u077a\u077c\3\2\2\2"+
		"\u077b\u0778\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u0784\3\2\2\2\u077d\u0781"+
		"\5\u0126\u0094\2\u077e\u077f\5\u016e\u00b8\2\u077f\u0780\5\u023a\u011e"+
		"\2\u0780\u0782\3\2\2\2\u0781\u077e\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0784"+
		"\3\2\2\2\u0783\u0773\3\2\2\2\u0783\u0777\3\2\2\2\u0783\u077d\3\2\2\2\u0784"+
		"\u011d\3\2\2\2\u0785\u078b\5\u0120\u0091\2\u0786\u0787\5\u016a\u00b6\2"+
		"\u0787\u0788\5\u0120\u0091\2\u0788\u078a\3\2\2\2\u0789\u0786\3\2\2\2\u078a"+
		"\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u011f\3\2"+
		"\2\2\u078d\u078b\3\2\2\2\u078e\u078f\5\u023a\u011e\2\u078f\u0790\t\4\2"+
		"\2\u0790\u0791\5\u012a\u0096\2\u0791\u07d8\3\2\2\2\u0792\u0793\5\u023a"+
		"\u011e\2\u0793\u0794\7\20\2\2\u0794\u0795\5\u023a\u011e\2\u0795\u0796"+
		"\t\4\2\2\u0796\u0797\5\u012a\u0096\2\u0797\u07d8\3\2\2\2\u0798\u0799\5"+
		"\u0126\u0094\2\u0799\u079a\t\4\2\2\u079a\u079b\5\u012a\u0096\2\u079b\u07d8"+
		"\3\2\2\2\u079c\u079d\5\u0126\u0094\2\u079d\u079e\t\4\2\2\u079e\u079f\5"+
		"\u0126\u0094\2\u079f\u07d8\3\2\2\2\u07a0\u07a1\5\u023a\u011e\2\u07a1\u07a2"+
		"\5\u01a6\u00d4\2\u07a2\u07a4\7\3\2\2\u07a3\u07a5\5\u0128\u0095\2\u07a4"+
		"\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a7\7\4"+
		"\2\2\u07a7\u07d8\3\2\2\2\u07a8\u07a9\7\3\2\2\u07a9\u07af\5\u023a\u011e"+
		"\2\u07aa\u07ab\5\u0236\u011c\2\u07ab\u07ac\5\u023a\u011e\2\u07ac\u07ae"+
		"\3\2\2\2\u07ad\u07aa\3\2\2\2\u07ae\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07af"+
		"\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07af\3\2\2\2\u07b2\u07b3\7\4"+
		"\2\2\u07b3\u07b4\5\u01a6\u00d4\2\u07b4\u07b5\7\3\2\2\u07b5\u07bb\5\u00ee"+
		"x\2\u07b6\u07b7\5\u0236\u011c\2\u07b7\u07b8\5\u00eex\2\u07b8\u07ba\3\2"+
		"\2\2\u07b9\u07b6\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb"+
		"\u07bc\3\2\2\2\u07bc\u07be\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07bf\7\4"+
		"\2\2\u07bf\u07d8\3\2\2\2\u07c0\u07c1\7\3\2\2\u07c1\u07c7\5\u023a\u011e"+
		"\2\u07c2\u07c3\5\u0236\u011c\2\u07c3\u07c4\5\u023a\u011e\2\u07c4\u07c6"+
		"\3\2\2\2\u07c5\u07c2\3\2\2\2\u07c6\u07c9\3\2\2\2\u07c7\u07c5\3\2\2\2\u07c7"+
		"\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07c7\3\2\2\2\u07ca\u07cb\7\4"+
		"\2\2\u07cb\u07cc\t\4\2\2\u07cc\u07d2\5\u00eex\2\u07cd\u07ce\5\u0236\u011c"+
		"\2\u07ce\u07cf\5\u00eex\2\u07cf\u07d1\3\2\2\2\u07d0\u07cd\3\2\2\2\u07d1"+
		"\u07d4\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d8\3\2"+
		"\2\2\u07d4\u07d2\3\2\2\2\u07d5\u07d8\5\u0124\u0093\2\u07d6\u07d8\5\u0122"+
		"\u0092\2\u07d7\u078e\3\2\2\2\u07d7\u0792\3\2\2\2\u07d7\u0798\3\2\2\2\u07d7"+
		"\u079c\3\2\2\2\u07d7\u07a0\3\2\2\2\u07d7\u07a8\3\2\2\2\u07d7\u07c0\3\2"+
		"\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d6\3\2\2\2\u07d8\u0121\3\2\2\2\u07d9"+
		"\u07da\5\u023a\u011e\2\u07da\u07db\5\u0180\u00c1\2\u07db\u07dc\5\u012a"+
		"\u0096\2\u07dc\u0123\3\2\2\2\u07dd\u07de\5\u023a\u011e\2\u07de\u07df\5"+
		"\u0180\u00c1\2\u07df\u07e0\5\u01b6\u00dc\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2"+
		"\5\u012a\u0096\2\u07e2\u0125\3\2\2\2\u07e3\u07e4\5\u023a\u011e\2\u07e4"+
		"\u07e5\7\3\2\2\u07e5\u07e6\7\21\2\2\u07e6\u07e7\7\4\2\2\u07e7\u07f0\3"+
		"\2\2\2\u07e8\u07e9\5\u023a\u011e\2\u07e9\u07eb\7\3\2\2\u07ea\u07ec\5\u0128"+
		"\u0095\2\u07eb\u07ea\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed"+
		"\u07ee\7\4\2\2\u07ee\u07f0\3\2\2\2\u07ef\u07e3\3\2\2\2\u07ef\u07e8\3\2"+
		"\2\2\u07f0\u0127\3\2\2\2\u07f1\u07f5\5\u012a\u0096\2\u07f2\u07f5\5\u023a"+
		"\u011e\2\u07f3\u07f5\5\u0126\u0094\2\u07f4\u07f1\3\2\2\2\u07f4\u07f2\3"+
		"\2\2\2\u07f4\u07f3\3\2\2\2\u07f5\u07fe\3\2\2\2\u07f6\u07fa\5\u0236\u011c"+
		"\2\u07f7\u07fb\5\u012a\u0096\2\u07f8\u07fb\5\u023a\u011e\2\u07f9\u07fb"+
		"\5\u0126\u0094\2\u07fa\u07f7\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07f9\3"+
		"\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07f6\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe"+
		"\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0129\3\2\2\2\u0800\u07fe\3\2"+
		"\2\2\u0801\u080b\7\u00af\2\2\u0802\u080b\5\u0130\u0099\2\u0803\u080b\5"+
		"\u012c\u0097\2\u0804\u080b\5\u012e\u0098\2\u0805\u080b\5\u0134\u009b\2"+
		"\u0806\u080b\5\u0132\u009a\2\u0807\u080b\5\62\32\2\u0808\u080b\5\u01d2"+
		"\u00ea\2\u0809\u080b\5\u023a\u011e\2\u080a\u0801\3\2\2\2\u080a\u0802\3"+
		"\2\2\2\u080a\u0803\3\2\2\2\u080a\u0804\3\2\2\2\u080a\u0805\3\2\2\2\u080a"+
		"\u0806\3\2\2\2\u080a\u0807\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u0809\3\2"+
		"\2\2\u080b\u012b\3\2\2\2\u080c\u080d\7\u00aa\2\2\u080d\u012d\3\2\2\2\u080e"+
		"\u080f\t\5\2\2\u080f\u012f\3\2\2\2\u0810\u0811\7\u00a9\2\2\u0811\u0131"+
		"\3\2\2\2\u0812\u0813\t\6\2\2\u0813\u0133\3\2\2\2\u0814\u0815\7\u00ac\2"+
		"\2\u0815\u0135\3\2\2\2\u0816\u081c\5\u023a\u011e\2\u0817\u0818\7\27\2"+
		"\2\u0818\u0819\5\u023a\u011e\2\u0819\u081a\7\27\2\2\u081a\u081c\3\2\2"+
		"\2\u081b\u0816\3\2\2\2\u081b\u0817\3\2\2\2\u081c\u0137\3\2\2\2\u081d\u0823"+
		"\5\u023a\u011e\2\u081e\u081f\7\27\2\2\u081f\u0820\5\u023a\u011e\2\u0820"+
		"\u0821\7\27\2\2\u0821\u0823\3\2\2\2\u0822\u081d\3\2\2\2\u0822\u081e\3"+
		"\2\2\2\u0823\u0139\3\2\2\2\u0824\u082a\5\u023a\u011e\2\u0825\u0826\7\27"+
		"\2\2\u0826\u0827\5\u023a\u011e\2\u0827\u0828\7\27\2\2\u0828\u082a\3\2"+
		"\2\2\u0829\u0824\3\2\2\2\u0829\u0825\3\2\2\2\u082a\u013b\3\2\2\2\u082b"+
		"\u082d\5\u013e\u00a0\2\u082c\u082e\5\u0140\u00a1\2\u082d\u082c\3\2\2\2"+
		"\u082d\u082e\3\2\2\2\u082e\u013d\3\2\2\2\u082f\u084c\5\u023a\u011e\2\u0830"+
		"\u084c\7\u00a9\2\2\u0831\u084c\7~\2\2\u0832\u084c\7v\2\2\u0833\u084c\7"+
		"\u0092\2\2\u0834\u084c\7\u0093\2\2\u0835\u084c\7\u0094\2\2\u0836\u084c"+
		"\7\u0095\2\2\u0837\u084c\7\u0096\2\2\u0838\u084c\7\u0097\2\2\u0839\u084c"+
		"\7\u0098\2\2\u083a\u084c\7\u0099\2\2\u083b\u084c\7\u009a\2\2\u083c\u084c"+
		"\7\u009b\2\2\u083d\u084c\7\u009c\2\2\u083e\u084c\7\u009d\2\2\u083f\u084c"+
		"\7\u009e\2\2\u0840\u084c\7\u009f\2\2\u0841\u084c\7\u00a0\2\2\u0842\u084c"+
		"\7\u00a1\2\2\u0843\u084c\7\u00a3\2\2\u0844\u084c\7\u00a2\2\2\u0845\u084c"+
		"\7\u00a4\2\2\u0846\u084c\7\u00a5\2\2\u0847\u084c\7\u00a6\2\2\u0848\u084c"+
		"\7\u00a7\2\2\u0849\u084c\7~\2\2\u084a\u084c\7\u008c\2\2\u084b\u082f\3"+
		"\2\2\2\u084b\u0830\3\2\2\2\u084b\u0831\3\2\2\2\u084b\u0832\3\2\2\2\u084b"+
		"\u0833\3\2\2\2\u084b\u0834\3\2\2\2\u084b\u0835\3\2\2\2\u084b\u0836\3\2"+
		"\2\2\u084b\u0837\3\2\2\2\u084b\u0838\3\2\2\2\u084b\u0839\3\2\2\2\u084b"+
		"\u083a\3\2\2\2\u084b\u083b\3\2\2\2\u084b\u083c\3\2\2\2\u084b\u083d\3\2"+
		"\2\2\u084b\u083e\3\2\2\2\u084b\u083f\3\2\2\2\u084b\u0840\3\2\2\2\u084b"+
		"\u0841\3\2\2\2\u084b\u0842\3\2\2\2\u084b\u0843\3\2\2\2\u084b\u0844\3\2"+
		"\2\2\u084b\u0845\3\2\2\2\u084b\u0846\3\2\2\2\u084b\u0847\3\2\2\2\u084b"+
		"\u0848\3\2\2\2\u084b\u0849\3\2\2\2\u084b\u084a\3\2\2\2\u084c\u013f\3\2"+
		"\2\2\u084d\u084e\5\u022e\u0118\2\u084e\u0854\5\u013c\u009f\2\u084f\u0850"+
		"\5\u0236\u011c\2\u0850\u0851\5\u013c\u009f\2\u0851\u0853\3\2\2\2\u0852"+
		"\u084f\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0855\3\2"+
		"\2\2\u0855\u0857\3\2\2\2\u0856\u0854\3\2\2\2\u0857\u0858\5\u0230\u0119"+
		"\2\u0858\u0141\3\2\2\2\u0859\u085c\5\u0170\u00b9\2\u085a\u085c\5\u0186"+
		"\u00c4\2\u085b\u0859\3\2\2\2\u085b\u085a\3\2\2\2\u085c\u0143\3\2\2\2\u085d"+
		"\u085e\5\u023a\u011e\2\u085e\u0145\3\2\2\2\u085f\u0860\5\u023a\u011e\2"+
		"\u0860\u0147\3\2\2\2\u0861\u0862\5\u0130\u0099\2\u0862\u0149\3\2\2\2\u0863"+
		"\u0864\5\u023a\u011e\2\u0864\u014b\3\2\2\2\u0865\u0866\5\u023a\u011e\2"+
		"\u0866\u014d\3\2\2\2\u0867\u0868\5\u023a\u011e\2\u0868\u014f\3\2\2\2\u0869"+
		"\u086a\5\u023a\u011e\2\u086a\u0151\3\2\2\2\u086b\u086c\5\u023a\u011e\2"+
		"\u086c\u0153\3\2\2\2\u086d\u086e\5\u023a\u011e\2\u086e\u0155\3\2\2\2\u086f"+
		"\u0870\5\u0130\u0099\2\u0870\u0157\3\2\2\2\u0871\u0872\5\u023a\u011e\2"+
		"\u0872\u0159\3\2\2\2\u0873\u0874\5\u015c\u00af\2\u0874\u0875\5\u013c\u009f"+
		"\2\u0875\u015b\3\2\2\2\u0876\u0877\5\u023a\u011e\2\u0877\u015d\3\2\2\2"+
		"\u0878\u0879\7\31\2\2\u0879\u015f\3\2\2\2\u087a\u087b\7\32\2\2\u087b\u0161"+
		"\3\2\2\2\u087c\u087d\7\33\2\2\u087d\u0163\3\2\2\2\u087e\u087f\7\33\2\2"+
		"\u087f\u0880\7g\2\2\u0880\u0165\3\2\2\2\u0881\u0882\7\34\2\2\u0882\u0167"+
		"\3\2\2\2\u0883\u0884\7\35\2\2\u0884\u0169\3\2\2\2\u0885\u0886\7\36\2\2"+
		"\u0886\u016b\3\2\2\2\u0887\u0888\7 \2\2\u0888\u016d\3\2\2\2\u0889\u088a"+
		"\7!\2\2\u088a\u016f\3\2\2\2\u088b\u088c\7\"\2\2\u088c\u0171\3\2\2\2\u088d"+
		"\u088e\7#\2\2\u088e\u0173\3\2\2\2\u088f\u0890\7$\2\2\u0890\u0175\3\2\2"+
		"\2\u0891\u0892\7%\2\2\u0892\u0177\3\2\2\2\u0893\u0894\7&\2\2\u0894\u0179"+
		"\3\2\2\2\u0895\u0896\7\'\2\2\u0896\u017b\3\2\2\2\u0897\u0898\7(\2\2\u0898"+
		"\u017d\3\2\2\2\u0899\u089a\7*\2\2\u089a\u017f\3\2\2\2\u089b\u089c\7,\2"+
		"\2\u089c\u0181\3\2\2\2\u089d\u089e\7-\2\2\u089e\u0183\3\2\2\2\u089f\u08a0"+
		"\7/\2\2\u08a0\u0185\3\2\2\2\u08a1\u08a2\7\60\2\2\u08a2\u0187\3\2\2\2\u08a3"+
		"\u08a4\7\61\2\2\u08a4\u0189\3\2\2\2\u08a5\u08a6\7\62\2\2\u08a6\u018b\3"+
		"\2\2\2\u08a7\u08a8\7\63\2\2\u08a8\u018d\3\2\2\2\u08a9\u08aa\7\64\2\2\u08aa"+
		"\u018f\3\2\2\2\u08ab\u08ac\7\66\2\2\u08ac\u0191\3\2\2\2\u08ad\u08ae\7"+
		"\67\2\2\u08ae\u0193\3\2\2\2\u08af\u08b0\78\2\2\u08b0\u0195\3\2\2\2\u08b1"+
		"\u08b2\7:\2\2\u08b2\u0197\3\2\2\2\u08b3\u08b4\7;\2\2\u08b4\u0199\3\2\2"+
		"\2\u08b5\u08b6\7<\2\2\u08b6\u019b\3\2\2\2\u08b7\u08b8\7=\2\2\u08b8\u019d"+
		"\3\2\2\2\u08b9\u08ba\7>\2\2\u08ba\u019f\3\2\2\2\u08bb\u08bc\7?\2\2\u08bc"+
		"\u01a1\3\2\2\2\u08bd\u08be\7@\2\2\u08be\u01a3\3\2\2\2\u08bf\u08c0\7A\2"+
		"\2\u08c0\u01a5\3\2\2\2\u08c1\u08c2\7B\2\2\u08c2\u01a7\3\2\2\2\u08c3\u08c4"+
		"\7C\2\2\u08c4\u01a9\3\2\2\2\u08c5\u08c6\7E\2\2\u08c6\u01ab\3\2\2\2\u08c7"+
		"\u08c8\7F\2\2\u08c8\u01ad\3\2\2\2\u08c9\u08ca\7G\2\2\u08ca\u01af\3\2\2"+
		"\2\u08cb\u08cc\7H\2\2\u08cc\u01b1\3\2\2\2\u08cd\u08ce\7I\2\2\u08ce\u01b3"+
		"\3\2\2\2\u08cf\u08d0\7J\2\2\u08d0\u01b5\3\2\2\2\u08d1\u08d2\7K\2\2\u08d2"+
		"\u01b7\3\2\2\2\u08d3\u08d4\7L\2\2\u08d4\u01b9\3\2\2\2\u08d5\u08d6\7M\2"+
		"\2\u08d6\u01bb\3\2\2\2\u08d7\u08d8\7N\2\2\u08d8\u01bd\3\2\2\2\u08d9\u08da"+
		"\7O\2\2\u08da\u01bf\3\2\2\2\u08db\u08dc\7Q\2\2\u08dc\u01c1\3\2\2\2\u08dd"+
		"\u08de\7\u009e\2\2\u08de\u01c3\3\2\2\2\u08df\u08e0\7T\2\2\u08e0\u01c5"+
		"\3\2\2\2\u08e1\u08e2\7U\2\2\u08e2\u01c7\3\2\2\2\u08e3\u08e4\7V\2\2\u08e4"+
		"\u01c9\3\2\2\2\u08e5\u08e6\7W\2\2\u08e6\u01cb\3\2\2\2\u08e7\u08e8\7Z\2"+
		"\2\u08e8\u01cd\3\2\2\2\u08e9\u08ea\7Y\2\2\u08ea\u01cf\3\2\2\2\u08eb\u08ec"+
		"\7[\2\2\u08ec\u01d1\3\2\2\2\u08ed\u08ee\7\\\2\2\u08ee\u01d3\3\2\2\2\u08ef"+
		"\u08f0\7]\2\2\u08f0\u01d5\3\2\2\2\u08f1\u08f2\7^\2\2\u08f2\u01d7\3\2\2"+
		"\2\u08f3\u08f4\7`\2\2\u08f4\u01d9\3\2\2\2\u08f5\u08f6\7a\2\2\u08f6\u01db"+
		"\3\2\2\2\u08f7\u08f8\7b\2\2\u08f8\u01dd\3\2\2\2\u08f9\u08fa\7d\2\2\u08fa"+
		"\u01df\3\2\2\2\u08fb\u08fc\7h\2\2\u08fc\u01e1\3\2\2\2\u08fd\u08fe\7j\2"+
		"\2\u08fe\u01e3\3\2\2\2\u08ff\u0900\7k\2\2\u0900\u01e5\3\2\2\2\u0901\u0902"+
		"\7l\2\2\u0902\u01e7\3\2\2\2\u0903\u0904\7m\2\2\u0904\u01e9\3\2\2\2\u0905"+
		"\u0906\7o\2\2\u0906\u01eb\3\2\2\2\u0907\u0908\7q\2\2\u0908\u01ed\3\2\2"+
		"\2\u0909\u090a\7r\2\2\u090a\u01ef\3\2\2\2\u090b\u090c\7s\2\2\u090c\u01f1"+
		"\3\2\2\2\u090d\u090e\7p\2\2\u090e\u01f3\3\2\2\2\u090f\u0910\7u\2\2\u0910"+
		"\u01f5\3\2\2\2\u0911\u0912\7v\2\2\u0912\u01f7\3\2\2\2\u0913\u0914\7w\2"+
		"\2\u0914\u01f9\3\2\2\2\u0915\u0916\7y\2\2\u0916\u01fb\3\2\2\2\u0917\u0918"+
		"\7z\2\2\u0918\u01fd\3\2\2\2\u0919\u091a\7{\2\2\u091a\u01ff\3\2\2\2\u091b"+
		"\u091c\7|\2\2\u091c\u0201\3\2\2\2\u091d\u091e\7~\2\2\u091e\u0203\3\2\2"+
		"\2\u091f\u0920\7\177\2\2\u0920\u0205\3\2\2\2\u0921\u0922\7\u0081\2\2\u0922"+
		"\u0207\3\2\2\2\u0923\u0924\7\u0083\2\2\u0924\u0209\3\2\2\2\u0925\u0926"+
		"\7\u0084\2\2\u0926\u020b\3\2\2\2\u0927\u0928\7\u0086\2\2\u0928\u020d\3"+
		"\2\2\2\u0929\u092a\7\u0087\2\2\u092a\u020f\3\2\2\2\u092b\u092c\7\u0088"+
		"\2\2\u092c\u0211\3\2\2\2\u092d\u092e\7\u0089\2\2\u092e\u0213\3\2\2\2\u092f"+
		"\u0930\7\u008a\2\2\u0930\u0215\3\2\2\2\u0931\u0932\7\u00b5\2\2\u0932\u0217"+
		"\3\2\2\2\u0933\u0934\7\u008b\2\2\u0934\u0219\3\2\2\2\u0935\u0936\7\u008d"+
		"\2\2\u0936\u021b\3\2\2\2\u0937\u0938\7\u008e\2\2\u0938\u021d\3\2\2\2\u0939"+
		"\u093a\7\u008f\2\2\u093a\u021f\3\2\2\2\u093b\u093c\7\u0090\2\2\u093c\u0221"+
		"\3\2\2\2\u093d\u093e\7n\2\2\u093e\u0223\3\2\2\2\u093f\u0940\7\2\2\3\u0940"+
		"\u0225\3\2\2\2\u0941\u0942\7\3\2\2\u0942\u0227\3\2\2\2\u0943\u0944\7\4"+
		"\2\2\u0944\u0229\3\2\2\2\u0945\u0946\7\5\2\2\u0946\u022b\3\2\2\2\u0947"+
		"\u0948\7\6\2\2\u0948\u022d\3\2\2\2\u0949\u094a\7\u00b1\2\2\u094a\u022f"+
		"\3\2\2\2\u094b\u094c\7\u00b2\2\2\u094c\u0231\3\2\2\2\u094d\u094e\7\7\2"+
		"\2\u094e\u0233\3\2\2\2\u094f\u0950\7\b\2\2\u0950\u0235\3\2\2\2\u0951\u0952"+
		"\7\t\2\2\u0952\u0237\3\2\2\2\u0953\u0954\7\13\2\2\u0954\u0239\3\2\2\2"+
		"\u0955\u09e4\7\u00ae\2\2\u0956\u0957\7\31\2\2\u0957\u09e4\7\32\2\2\u0958"+
		"\u09e4\7\33\2\2\u0959\u09e4\7\34\2\2\u095a\u09e4\7\35\2\2\u095b\u09e4"+
		"\7\36\2\2\u095c\u09e4\7\37\2\2\u095d\u09e4\7 \2\2\u095e\u09e4\7!\2\2\u095f"+
		"\u09e4\7\"\2\2\u0960\u09e4\7#\2\2\u0961\u09e4\7$\2\2\u0962\u09e4\7%\2"+
		"\2\u0963\u09e4\7&\2\2\u0964\u09e4\7\'\2\2\u0965\u09e4\7(\2\2\u0966\u09e4"+
		"\7)\2\2\u0967\u09e4\7*\2\2\u0968\u09e4\7+\2\2\u0969\u09e4\7,\2\2\u096a"+
		"\u09e4\7-\2\2\u096b\u09e4\7.\2\2\u096c\u09e4\7/\2\2\u096d\u09e4\7\60\2"+
		"\2\u096e\u09e4\7\61\2\2\u096f\u09e4\7\62\2\2\u0970\u09e4\7\63\2\2\u0971"+
		"\u09e4\7\64\2\2\u0972\u09e4\7\65\2\2\u0973\u09e4\7\66\2\2\u0974\u09e4"+
		"\7\67\2\2\u0975\u09e4\78\2\2\u0976\u09e4\79\2\2\u0977\u09e4\7:\2\2\u0978"+
		"\u09e4\7;\2\2\u0979\u09e4\7<\2\2\u097a\u09e4\7=\2\2\u097b\u09e4\7>\2\2"+
		"\u097c\u09e4\7?\2\2\u097d\u09e4\7@\2\2\u097e\u09e4\7A\2\2\u097f\u09e4"+
		"\7B\2\2\u0980\u09e4\7C\2\2\u0981\u09e4\7D\2\2\u0982\u09e4\7E\2\2\u0983"+
		"\u09e4\7F\2\2\u0984\u09e4\7G\2\2\u0985\u09e4\7H\2\2\u0986\u09e4\7I\2\2"+
		"\u0987\u09e4\7J\2\2\u0988\u09e4\7K\2\2\u0989\u09e4\7L\2\2\u098a\u09e4"+
		"\7M\2\2\u098b\u09e4\7N\2\2\u098c\u09e4\7O\2\2\u098d\u09e4\7P\2\2\u098e"+
		"\u09e4\7Q\2\2\u098f\u09e4\7R\2\2\u0990\u09e4\7S\2\2\u0991\u09e4\7T\2\2"+
		"\u0992\u09e4\7U\2\2\u0993\u09e4\7V\2\2\u0994\u09e4\7W\2\2\u0995\u09e4"+
		"\7X\2\2\u0996\u09e4\7Y\2\2\u0997\u09e4\7Z\2\2\u0998\u09e4\7[\2\2\u0999"+
		"\u09e4\7\\\2\2\u099a\u09e4\7]\2\2\u099b\u09e4\7^\2\2\u099c\u09e4\7_\2"+
		"\2\u099d\u09e4\7`\2\2\u099e\u09e4\7a\2\2\u099f\u09e4\7b\2\2\u09a0\u09e4"+
		"\7c\2\2\u09a1\u09e4\7d\2\2\u09a2\u09e4\7e\2\2\u09a3\u09e4\7f\2\2\u09a4"+
		"\u09e4\7g\2\2\u09a5\u09e4\7h\2\2\u09a6\u09e4\7i\2\2\u09a7\u09e4\7j\2\2"+
		"\u09a8\u09e4\7k\2\2\u09a9\u09e4\7l\2\2\u09aa\u09e4\7m\2\2\u09ab\u09e4"+
		"\7n\2\2\u09ac\u09e4\7o\2\2\u09ad\u09e4\7p\2\2\u09ae\u09e4\7t\2\2\u09af"+
		"\u09e4\7u\2\2\u09b0\u09e4\7v\2\2\u09b1\u09e4\7w\2\2\u09b2\u09e4\7x\2\2"+
		"\u09b3\u09e4\7y\2\2\u09b4\u09e4\7z\2\2\u09b5\u09e4\7{\2\2\u09b6\u09e4"+
		"\7|\2\2\u09b7\u09e4\7}\2\2\u09b8\u09e4\7~\2\2\u09b9\u09e4\7\177\2\2\u09ba"+
		"\u09e4\7\u0080\2\2\u09bb\u09e4\7\u0081\2\2\u09bc\u09e4\7\u0082\2\2\u09bd"+
		"\u09e4\7\u0083\2\2\u09be\u09e4\7\u0084\2\2\u09bf\u09e4\7\u0085\2\2\u09c0"+
		"\u09e4\7\u0086\2\2\u09c1\u09e4\7\u0087\2\2\u09c2\u09e4\7\u0088\2\2\u09c3"+
		"\u09e4\7\u0089\2\2\u09c4\u09e4\7\u008a\2\2\u09c5\u09e4\7\u008b\2\2\u09c6"+
		"\u09e4\7\u008c\2\2\u09c7\u09e4\7\u008d\2\2\u09c8\u09e4\7\u008e\2\2\u09c9"+
		"\u09e4\7\u008f\2\2\u09ca\u09e4\7\u0090\2\2\u09cb\u09e4\7\u0091\2\2\u09cc"+
		"\u09e4\7\u0092\2\2\u09cd\u09e4\7\u0093\2\2\u09ce\u09e4\7\u0094\2\2\u09cf"+
		"\u09e4\7\u0095\2\2\u09d0\u09e4\7\u0096\2\2\u09d1\u09e4\7\u0097\2\2\u09d2"+
		"\u09e4\7\u0098\2\2\u09d3\u09e4\7\u0099\2\2\u09d4\u09e4\7\u009a\2\2\u09d5"+
		"\u09e4\7\u009b\2\2\u09d6\u09e4\7\u009c\2\2\u09d7\u09e4\7\u009d\2\2\u09d8"+
		"\u09e4\7\u009e\2\2\u09d9\u09e4\7\u009f\2\2\u09da\u09e4\7\u00a0\2\2\u09db"+
		"\u09e4\7\u00a1\2\2\u09dc\u09e4\7\u00a2\2\2\u09dd\u09e4\7\u00a3\2\2\u09de"+
		"\u09e4\7\u00a4\2\2\u09df\u09e4\7\u00a5\2\2\u09e0\u09e4\7\u00a6\2\2\u09e1"+
		"\u09e4\7\u00a7\2\2\u09e2\u09e4\7\u00b5\2\2\u09e3\u0955\3\2\2\2\u09e3\u0956"+
		"\3\2\2\2\u09e3\u0958\3\2\2\2\u09e3\u0959\3\2\2\2\u09e3\u095a\3\2\2\2\u09e3"+
		"\u095b\3\2\2\2\u09e3\u095c\3\2\2\2\u09e3\u095d\3\2\2\2\u09e3\u095e\3\2"+
		"\2\2\u09e3\u095f\3\2\2\2\u09e3\u0960\3\2\2\2\u09e3\u0961\3\2\2\2\u09e3"+
		"\u0962\3\2\2\2\u09e3\u0963\3\2\2\2\u09e3\u0964\3\2\2\2\u09e3\u0965\3\2"+
		"\2\2\u09e3\u0966\3\2\2\2\u09e3\u0967\3\2\2\2\u09e3\u0968\3\2\2\2\u09e3"+
		"\u0969\3\2\2\2\u09e3\u096a\3\2\2\2\u09e3\u096b\3\2\2\2\u09e3\u096c\3\2"+
		"\2\2\u09e3\u096d\3\2\2\2\u09e3\u096e\3\2\2\2\u09e3\u096f\3\2\2\2\u09e3"+
		"\u0970\3\2\2\2\u09e3\u0971\3\2\2\2\u09e3\u0972\3\2\2\2\u09e3\u0973\3\2"+
		"\2\2\u09e3\u0974\3\2\2\2\u09e3\u0975\3\2\2\2\u09e3\u0976\3\2\2\2\u09e3"+
		"\u0977\3\2\2\2\u09e3\u0978\3\2\2\2\u09e3\u0979\3\2\2\2\u09e3\u097a\3\2"+
		"\2\2\u09e3\u097b\3\2\2\2\u09e3\u097c\3\2\2\2\u09e3\u097d\3\2\2\2\u09e3"+
		"\u097e\3\2\2\2\u09e3\u097f\3\2\2\2\u09e3\u0980\3\2\2\2\u09e3\u0981\3\2"+
		"\2\2\u09e3\u0982\3\2\2\2\u09e3\u0983\3\2\2\2\u09e3\u0984\3\2\2\2\u09e3"+
		"\u0985\3\2\2\2\u09e3\u0986\3\2\2\2\u09e3\u0987\3\2\2\2\u09e3\u0988\3\2"+
		"\2\2\u09e3\u0989\3\2\2\2\u09e3\u098a\3\2\2\2\u09e3\u098b\3\2\2\2\u09e3"+
		"\u098c\3\2\2\2\u09e3\u098d\3\2\2\2\u09e3\u098e\3\2\2\2\u09e3\u098f\3\2"+
		"\2\2\u09e3\u0990\3\2\2\2\u09e3\u0991\3\2\2\2\u09e3\u0992\3\2\2\2\u09e3"+
		"\u0993\3\2\2\2\u09e3\u0994\3\2\2\2\u09e3\u0995\3\2\2\2\u09e3\u0996\3\2"+
		"\2\2\u09e3\u0997\3\2\2\2\u09e3\u0998\3\2\2\2\u09e3\u0999\3\2\2\2\u09e3"+
		"\u099a\3\2\2\2\u09e3\u099b\3\2\2\2\u09e3\u099c\3\2\2\2\u09e3\u099d\3\2"+
		"\2\2\u09e3\u099e\3\2\2\2\u09e3\u099f\3\2\2\2\u09e3\u09a0\3\2\2\2\u09e3"+
		"\u09a1\3\2\2\2\u09e3\u09a2\3\2\2\2\u09e3\u09a3\3\2\2\2\u09e3\u09a4\3\2"+
		"\2\2\u09e3\u09a5\3\2\2\2\u09e3\u09a6\3\2\2\2\u09e3\u09a7\3\2\2\2\u09e3"+
		"\u09a8\3\2\2\2\u09e3\u09a9\3\2\2\2\u09e3\u09aa\3\2\2\2\u09e3\u09ab\3\2"+
		"\2\2\u09e3\u09ac\3\2\2\2\u09e3\u09ad\3\2\2\2\u09e3\u09ae\3\2\2\2\u09e3"+
		"\u09af\3\2\2\2\u09e3\u09b0\3\2\2\2\u09e3\u09b1\3\2\2\2\u09e3\u09b2\3\2"+
		"\2\2\u09e3\u09b3\3\2\2\2\u09e3\u09b4\3\2\2\2\u09e3\u09b5\3\2\2\2\u09e3"+
		"\u09b6\3\2\2\2\u09e3\u09b7\3\2\2\2\u09e3\u09b8\3\2\2\2\u09e3\u09b9\3\2"+
		"\2\2\u09e3\u09ba\3\2\2\2\u09e3\u09bb\3\2\2\2\u09e3\u09bc\3\2\2\2\u09e3"+
		"\u09bd\3\2\2\2\u09e3\u09be\3\2\2\2\u09e3\u09bf\3\2\2\2\u09e3\u09c0\3\2"+
		"\2\2\u09e3\u09c1\3\2\2\2\u09e3\u09c2\3\2\2\2\u09e3\u09c3\3\2\2\2\u09e3"+
		"\u09c4\3\2\2\2\u09e3\u09c5\3\2\2\2\u09e3\u09c6\3\2\2\2\u09e3\u09c7\3\2"+
		"\2\2\u09e3\u09c8\3\2\2\2\u09e3\u09c9\3\2\2\2\u09e3\u09ca\3\2\2\2\u09e3"+
		"\u09cb\3\2\2\2\u09e3\u09cc\3\2\2\2\u09e3\u09cd\3\2\2\2\u09e3\u09ce\3\2"+
		"\2\2\u09e3\u09cf\3\2\2\2\u09e3\u09d0\3\2\2\2\u09e3\u09d1\3\2\2\2\u09e3"+
		"\u09d2\3\2\2\2\u09e3\u09d3\3\2\2\2\u09e3\u09d4\3\2\2\2\u09e3\u09d5\3\2"+
		"\2\2\u09e3\u09d6\3\2\2\2\u09e3\u09d7\3\2\2\2\u09e3\u09d8\3\2\2\2\u09e3"+
		"\u09d9\3\2\2\2\u09e3\u09da\3\2\2\2\u09e3\u09db\3\2\2\2\u09e3\u09dc\3\2"+
		"\2\2\u09e3\u09dd\3\2\2\2\u09e3\u09de\3\2\2\2\u09e3\u09df\3\2\2\2\u09e3"+
		"\u09e0\3\2\2\2\u09e3\u09e1\3\2\2\2\u09e3\u09e2\3\2\2\2\u09e4\u023b\3\2"+
		"\2\2\u00b7\u023d\u0240\u0246\u024b\u024d\u0252\u0255\u0258\u0283\u0294"+
		"\u0297\u029e\u02a3\u02ae\u02b8\u02c7\u02d2\u02d7\u02e2\u02e6\u02eb\u02f3"+
		"\u02f8\u02fc\u0301\u0306\u0315\u031b\u0320\u032a\u032f\u0339\u033e\u0343"+
		"\u034a\u0352\u035f\u036b\u036f\u0373\u0378\u037d\u0390\u0397\u039f\u03a3"+
		"\u03a8\u03bb\u03c4\u03d3\u03d5\u03e1\u03ef\u03f6\u03fd\u0405\u0410\u0424"+
		"\u042f\u0446\u0454\u045b\u0464\u0477\u047f\u0485\u048a\u0491\u0496\u049e"+
		"\u04a3\u04aa\u04af\u04b6\u04bb\u04c2\u04c9\u04d0\u04d7\u04dc\u04e3\u04ea"+
		"\u04ef\u04f6\u04fb\u0502\u0506\u050e\u0518\u0524\u052a\u0533\u0540\u0548"+
		"\u054e\u0553";
	private static final String _serializedATNSegment1 =
		"\u0561\u0575\u057e\u058a\u058e\u0592\u05a0\u05a8\u05b1\u05bc\u05c1\u05c8"+
		"\u05cb\u05d1\u05da\u05e0\u05f2\u05f6\u05fa\u05ff\u0607\u060f\u0613\u0616"+
		"\u061c\u0620\u0627\u0632\u063f\u0648\u067b\u0684\u0687\u0697\u06a3\u06af"+
		"\u06bb\u06c3\u06c6\u06ce\u06d1\u06d6\u06dd\u06e1\u06e5\u06e8\u06fa\u0714"+
		"\u0720\u0729\u0732\u0736\u0739\u073e\u0741\u0744\u0747\u0757\u0760\u0769"+
		"\u0770\u077b\u0781\u0783\u078b\u07a4\u07af\u07bb\u07c7\u07d2\u07d7\u07eb"+
		"\u07ef\u07f4\u07fa\u07fe\u080a\u081b\u0822\u0829\u082d\u084b\u0854\u085b"+
		"\u09e3";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}