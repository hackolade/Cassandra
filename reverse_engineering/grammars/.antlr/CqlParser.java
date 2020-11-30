// Generated from /home/mikhail/code/Cassandra/reverse_engineering/grammars/CqlParser.g4 by ANTLR 4.8
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
		K_SCHEMA=111, K_SELECT=112, K_SET=113, K_SFUNC=114, K_STATIC=115, K_STORAGE=116, 
		K_STYPE=117, K_SUPERUSER=118, K_TABLE=119, K_THREE=120, K_TIMESTAMP=121, 
		K_TO=122, K_TOKEN=123, K_TRIGGER=124, K_TRUE=125, K_TRUNCATE=126, K_TTL=127, 
		K_TWO=128, K_TYPE=129, K_UNLOGGED=130, K_UPDATE=131, K_USE=132, K_USER=133, 
		K_USING=134, K_UUID=135, K_VALUES=136, K_VIEW=137, K_WHERE=138, K_WITH=139, 
		K_WRITETIME=140, K_ASCII=141, K_BIGINT=142, K_BLOB=143, K_BOOLEAN=144, 
		K_COUNTER=145, K_DATE=146, K_DECIMAL=147, K_DOUBLE=148, K_FLOAT=149, K_FROZEN=150, 
		K_INET=151, K_INT=152, K_LIST=153, K_MAP=154, K_SMALLINT=155, K_TEXT=156, 
		K_TIMEUUID=157, K_TIME=158, K_TINYINT=159, K_TUPLE=160, K_VARCHAR=161, 
		K_VARINT=162, CODE_BLOCK=163, STRING_LITERAL=164, DECIMAL_LITERAL=165, 
		FLOAT_LITERAL=166, HEXADECIMAL_LITERAL=167, REAL_LITERAL=168, OBJECT_NAME=169, 
		UUID=170, OPERATOR_EQ=171, OPERATOR_LT=172, OPERATOR_GT=173, OPERATOR_LTE=174, 
		OPERATOR_GTE=175, K_USERS=176;
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
		RULE_kwReplication = 242, RULE_kwReturns = 243, RULE_kwRole = 244, RULE_kwRoles = 245, 
		RULE_kwSelect = 246, RULE_kwSet = 247, RULE_kwSfunc = 248, RULE_kwStorage = 249, 
		RULE_kwStype = 250, RULE_kwSuperuser = 251, RULE_kwTable = 252, RULE_kwTimestamp = 253, 
		RULE_kwTo = 254, RULE_kwTrigger = 255, RULE_kwTruncate = 256, RULE_kwTtl = 257, 
		RULE_kwType = 258, RULE_kwUnlogged = 259, RULE_kwUpdate = 260, RULE_kwUse = 261, 
		RULE_kwUser = 262, RULE_kwUsers = 263, RULE_kwUsing = 264, RULE_kwValues = 265, 
		RULE_kwView = 266, RULE_kwWhere = 267, RULE_kwWith = 268, RULE_kwRevoke = 269, 
		RULE_eof = 270, RULE_syntaxBracketLr = 271, RULE_syntaxBracketRr = 272, 
		RULE_syntaxBracketLc = 273, RULE_syntaxBracketRc = 274, RULE_syntaxBracketLa = 275, 
		RULE_syntaxBracketRa = 276, RULE_syntaxBracketLs = 277, RULE_syntaxBracketRs = 278, 
		RULE_syntaxComma = 279, RULE_syntaxColon = 280, RULE_id = 281;
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
			"kwRoles", "kwSelect", "kwSet", "kwSfunc", "kwStorage", "kwStype", "kwSuperuser", 
			"kwTable", "kwTimestamp", "kwTo", "kwTrigger", "kwTruncate", "kwTtl", 
			"kwType", "kwUnlogged", "kwUpdate", "kwUse", "kwUser", "kwUsers", "kwUsing", 
			"kwValues", "kwView", "kwWhere", "kwWith", "kwRevoke", "eof", "syntaxBracketLr", 
			"syntaxBracketRr", "syntaxBracketLc", "syntaxBracketRc", "syntaxBracketLa", 
			"syntaxBracketRa", "syntaxBracketLs", "syntaxBracketRs", "syntaxComma", 
			"syntaxColon", "id"
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
			"K_REVOKE", "K_ROLE", "K_ROLES", "K_SCHEMA", "K_SELECT", "K_SET", "K_SFUNC", 
			"K_STATIC", "K_STORAGE", "K_STYPE", "K_SUPERUSER", "K_TABLE", "K_THREE", 
			"K_TIMESTAMP", "K_TO", "K_TOKEN", "K_TRIGGER", "K_TRUE", "K_TRUNCATE", 
			"K_TTL", "K_TWO", "K_TYPE", "K_UNLOGGED", "K_UPDATE", "K_USE", "K_USER", 
			"K_USING", "K_UUID", "K_VALUES", "K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", 
			"K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_COUNTER", "K_DATE", 
			"K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_FROZEN", "K_INET", "K_INT", "K_LIST", 
			"K_MAP", "K_SMALLINT", "K_TEXT", "K_TIMEUUID", "K_TIME", "K_TINYINT", 
			"K_TUPLE", "K_VARCHAR", "K_VARINT", "CODE_BLOCK", "STRING_LITERAL", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "HEXADECIMAL_LITERAL", "REAL_LITERAL", "OBJECT_NAME", 
			"UUID", "OPERATOR_EQ", "OPERATOR_LT", "OPERATOR_GT", "OPERATOR_LTE", 
			"OPERATOR_GTE", "K_USERS"
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
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (SEMI - 8)) | (1L << (K_ALTER - 8)) | (1L << (K_APPLY - 8)) | (1L << (K_BEGIN - 8)) | (1L << (K_CREATE - 8)) | (1L << (K_DELETE - 8)) | (1L << (K_DROP - 8)) | (1L << (K_GRANT - 8)) | (1L << (K_INSERT - 8)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (K_REVOKE - 108)) | (1L << (K_SELECT - 108)) | (1L << (K_TRUNCATE - 108)) | (1L << (K_UPDATE - 108)) | (1L << (K_USE - 108)) | (1L << (K_LIST - 108)))) != 0)) {
				{
				setState(564);
				cqls();
				}
			}

			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUSMINUS) {
				{
				setState(567);
				match(MINUSMINUS);
				}
			}

			setState(570);
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
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(579);
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
						setState(572);
						cql();
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
						statementSeparator();
						}
						break;
					case SEMI:
						{
						setState(578);
						empty();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(592);
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
				setState(584);
				cql();
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUSMINUS) {
						{
						setState(585);
						match(MINUSMINUS);
						}
					}

					setState(588);
					statementSeparator();
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(591);
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
			setState(594);
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
			setState(596);
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
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				alterKeyspace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				alterMaterializedView();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				alterRole();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				alterTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(602);
				alterType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(603);
				alterUser();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(604);
				applyBatch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(605);
				createAggregate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(606);
				createFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(607);
				createIndex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(608);
				createKeyspace();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(609);
				createMaterializedView();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(610);
				createRole();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(611);
				createTable();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(612);
				createTrigger();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(613);
				createType();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(614);
				createUser();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(615);
				deleteStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(616);
				dropAggregate();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(617);
				dropFunction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(618);
				dropIndex();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(619);
				dropKeyspace();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(620);
				dropMaterializedView();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(621);
				dropRole();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(622);
				dropTable();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(623);
				dropTrigger();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(624);
				dropType();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(625);
				dropUser();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(626);
				grant();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(627);
				insert();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(628);
				listPermissions();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(629);
				listRoles();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(630);
				revoke();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(631);
				select();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(632);
				truncate();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(633);
				update();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(634);
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
			setState(637);
			kwRevoke();
			setState(638);
			priviledge();
			setState(639);
			kwOn();
			setState(640);
			resource();
			setState(641);
			kwFrom();
			setState(642);
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
			setState(644);
			kwList();
			setState(645);
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
			setState(647);
			kwList();
			setState(648);
			kwRoles();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(649);
				kwOf();
				setState(650);
				role();
				}
			}

			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NORECURSIVE) {
				{
				setState(654);
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
			setState(657);
			kwList();
			setState(658);
			priviledge();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(659);
				kwOn();
				setState(660);
				resource();
				}
			}

			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(664);
				kwOf();
				setState(665);
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
			setState(669);
			kwGrant();
			setState(670);
			priviledge();
			setState(671);
			kwOn();
			setState(672);
			resource();
			setState(673);
			kwTo();
			setState(674);
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
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(676);
					kwAll();
					}
					break;
				case 2:
					{
					setState(677);
					kwAllPermissions();
					}
					break;
				}
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				kwAlter();
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				kwAuthorize();
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				kwDescibe();
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(683);
				kwExecute();
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(684);
				kwCreate();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(685);
				kwDrop();
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 8);
				{
				setState(686);
				kwModify();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(687);
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
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resource);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				kwAll();
				setState(691);
				kwFunctions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				kwAll();
				setState(694);
				kwFunctions();
				setState(695);
				kwIn();
				setState(696);
				kwKeyspace();
				setState(697);
				keyspace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				kwFunction();
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(700);
					keyspace();
					setState(701);
					match(DOT);
					}
					break;
				}
				setState(705);
				functionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(707);
				kwAll();
				setState(708);
				kwKeyspaces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(710);
				kwKeyspace();
				setState(711);
				keyspace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(713);
					kwTable();
					}
					break;
				}
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(716);
					keyspace();
					setState(717);
					match(DOT);
					}
					break;
				}
				setState(721);
				table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(722);
				kwAll();
				setState(723);
				kwRoles();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(725);
				kwRole();
				setState(726);
				role();
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
			setState(730);
			kwCreate();
			setState(731);
			kwUser();
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(732);
				ifNotExist();
				}
				break;
			}
			setState(735);
			user();
			setState(736);
			kwWith();
			setState(737);
			kwPassword();
			setState(738);
			stringLiteral();
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				{
				setState(739);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				{
				setState(740);
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
			setState(743);
			kwCreate();
			setState(744);
			kwRole();
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(745);
				ifNotExist();
				}
				break;
			}
			setState(748);
			role();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(749);
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
			setState(752);
			kwCreate();
			setState(753);
			kwType();
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(754);
				ifNotExist();
				}
				break;
			}
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(757);
				keyspace();
				setState(758);
				match(DOT);
				}
				break;
			}
			setState(762);
			type();
			setState(763);
			syntaxBracketLr();
			setState(764);
			typeMemberColumnList();
			setState(765);
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
			setState(767);
			column();
			setState(768);
			dataType();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769);
				syntaxComma();
				setState(770);
				column();
				setState(771);
				dataType();
				}
				}
				setState(777);
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
			setState(778);
			kwCreate();
			setState(779);
			kwTrigger();
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(780);
				ifNotExist();
				}
				break;
			}
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(783);
				keyspace();
				setState(784);
				match(DOT);
				}
				break;
			}
			setState(788);
			trigger();
			setState(789);
			kwUsing();
			setState(790);
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
			setState(792);
			kwCreate();
			setState(793);
			kwMaterialized();
			setState(794);
			kwView();
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(795);
				ifNotExist();
				}
				break;
			}
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(798);
				keyspace();
				setState(799);
				match(DOT);
				}
				break;
			}
			setState(803);
			materializedView();
			setState(804);
			kwAs();
			setState(805);
			kwSelect();
			setState(806);
			columnList();
			setState(807);
			kwFrom();
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(808);
				keyspace();
				setState(809);
				match(DOT);
				}
				break;
			}
			setState(813);
			table();
			setState(814);
			materializedViewWhere();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(815);
				primaryKeyElement();
				}
			}

			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(818);
				kwWith();
				setState(819);
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
			setState(823);
			kwWhere();
			setState(824);
			columnNotNullList();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(825);
				kwAnd();
				setState(826);
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
			setState(830);
			columnNotNull();
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(831);
					kwAnd();
					setState(832);
					columnNotNull();
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			setState(839);
			column();
			setState(840);
			kwIs();
			setState(841);
			kwNot();
			setState(842);
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
			setState(844);
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
			setState(846);
			kwCreate();
			setState(847);
			kwKeyspace();
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(848);
				ifNotExist();
				}
				break;
			}
			setState(851);
			keyspace();
			setState(852);
			kwWith();
			setState(853);
			kwReplication();
			setState(854);
			match(OPERATOR_EQ);
			setState(855);
			syntaxBracketLc();
			setState(856);
			replicationList();
			setState(857);
			syntaxBracketRc();
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(858);
				kwAnd();
				setState(859);
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
			setState(863);
			kwCreate();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(864);
				orReplace();
				}
			}

			setState(867);
			kwFunction();
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(868);
				ifNotExist();
				}
				break;
			}
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(871);
				keyspace();
				setState(872);
				match(DOT);
				}
				break;
			}
			setState(876);
			functionStatement();
			setState(877);
			syntaxBracketLr();
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)) | (1L << (K_TRUE - 64)) | (1L << (K_TRUNCATE - 64)) | (1L << (K_TTL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (K_USERS - 128)))) != 0)) {
				{
				setState(878);
				paramList();
				}
			}

			setState(881);
			syntaxBracketRr();
			setState(882);
			returnMode();
			setState(883);
			kwReturns();
			setState(884);
			dataType();
			setState(885);
			kwLanguage();
			setState(886);
			language();
			setState(887);
			kwAs();
			setState(888);
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
			setState(890);
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
			setState(892);
			param();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(893);
				syntaxComma();
				setState(894);
				param();
				}
				}
				setState(900);
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
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CALLED:
				{
				setState(901);
				kwCalled();
				}
				break;
			case K_RETURNS:
				{
				setState(902);
				kwReturns();
				setState(903);
				kwNull();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(907);
			kwOn();
			setState(908);
			kwNull();
			setState(909);
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
			setState(911);
			kwCreate();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(912);
				orReplace();
				}
			}

			setState(915);
			kwAggregate();
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(916);
				ifNotExist();
				}
				break;
			}
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(919);
				keyspace();
				setState(920);
				match(DOT);
				}
				break;
			}
			setState(924);
			aggregate();
			setState(925);
			syntaxBracketLr();
			setState(926);
			dataType();
			setState(927);
			syntaxBracketRr();
			setState(928);
			kwSfunc();
			setState(929);
			functionStatement();
			setState(930);
			kwStype();
			setState(931);
			dataType();
			setState(932);
			kwFinalfunc();
			setState(933);
			functionStatement();
			setState(934);
			kwInitcond();
			setState(935);
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
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				initCondList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				initCondListNested();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
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
			setState(943);
			syntaxBracketLc();
			setState(944);
			initCondHashItem();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(945);
				syntaxComma();
				setState(946);
				initCondHashItem();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953);
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
			setState(955);
			hashKey();
			setState(956);
			match(COLON);
			setState(957);
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
			setState(959);
			syntaxBracketLr();
			setState(960);
			initCondList();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LR_BRACKET || _la==COMMA) {
				{
				setState(965);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(961);
					syntaxComma();
					setState(962);
					constant();
					}
					break;
				case LR_BRACKET:
					{
					setState(964);
					initCondList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
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
			setState(972);
			syntaxBracketLr();
			setState(973);
			constant();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(974);
				syntaxComma();
				setState(975);
				constant();
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
			setState(984);
			kwOr();
			setState(985);
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
			setState(987);
			kwAlter();
			setState(988);
			kwUser();
			setState(989);
			user();
			setState(990);
			kwWith();
			setState(991);
			userPassword();
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOSUPERUSER || _la==K_SUPERUSER) {
				{
				setState(992);
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
			setState(995);
			kwPassword();
			setState(996);
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
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
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
			setState(1002);
			kwAlter();
			setState(1003);
			kwType();
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(1004);
				keyspace();
				setState(1005);
				match(DOT);
				}
				break;
			}
			setState(1009);
			type();
			setState(1010);
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
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				alterTypeAlterType();
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				alterTypeAdd();
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
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
			setState(1017);
			kwRename();
			setState(1018);
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
			setState(1020);
			alterTypeRenameItem();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1021);
				kwAnd();
				setState(1022);
				alterTypeRenameItem();
				}
				}
				setState(1028);
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
			setState(1029);
			column();
			setState(1030);
			kwTo();
			setState(1031);
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
			setState(1033);
			kwAdd();
			setState(1034);
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
			setState(1036);
			kwAlter();
			setState(1037);
			column();
			setState(1038);
			kwType();
			setState(1039);
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
			setState(1041);
			kwAlter();
			setState(1042);
			kwTable();
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(1043);
				keyspace();
				setState(1044);
				match(DOT);
				}
				break;
			}
			setState(1048);
			table();
			setState(1049);
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
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				alterTableAdd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				alterTableDropColumns();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
				alterTableDropColumns();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1054);
				alterTableDropCompactStorage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				alterTableRename();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1056);
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
			setState(1059);
			kwWith();
			setState(1060);
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
			setState(1062);
			kwRename();
			setState(1063);
			column();
			setState(1064);
			kwTo();
			setState(1065);
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
			setState(1067);
			kwDrop();
			setState(1068);
			kwCompact();
			setState(1069);
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
			setState(1071);
			kwDrop();
			setState(1072);
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
			setState(1074);
			column();
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1075);
				syntaxComma();
				setState(1076);
				column();
				}
				}
				setState(1082);
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
			setState(1083);
			kwAdd();
			setState(1084);
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
			setState(1086);
			column();
			setState(1087);
			dataType();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1088);
				syntaxComma();
				setState(1089);
				column();
				setState(1090);
				dataType();
				}
				}
				setState(1096);
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
			setState(1097);
			kwAlter();
			setState(1098);
			kwRole();
			setState(1099);
			role();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1100);
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
			setState(1103);
			kwWith();
			{
			setState(1104);
			roleWithOptions();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1105);
				kwAnd();
				setState(1106);
				roleWithOptions();
				}
				}
				setState(1112);
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
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PASSWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				kwPassword();
				setState(1114);
				match(OPERATOR_EQ);
				setState(1115);
				stringLiteral();
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				kwLogin();
				setState(1118);
				match(OPERATOR_EQ);
				setState(1119);
				booleanLiteral();
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				kwSuperuser();
				setState(1122);
				match(OPERATOR_EQ);
				setState(1123);
				booleanLiteral();
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1125);
				kwOptions();
				setState(1126);
				match(OPERATOR_EQ);
				setState(1127);
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
			setState(1131);
			kwAlter();
			setState(1132);
			kwMaterialized();
			setState(1133);
			kwView();
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(1134);
				keyspace();
				setState(1135);
				match(DOT);
				}
				break;
			}
			setState(1139);
			materializedView();
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1140);
				kwWith();
				setState(1141);
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
			setState(1145);
			kwDrop();
			setState(1146);
			kwUser();
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(1147);
				ifExist();
				}
				break;
			}
			setState(1150);
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
			setState(1152);
			kwDrop();
			setState(1153);
			kwType();
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1154);
				ifExist();
				}
				break;
			}
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1157);
				keyspace();
				setState(1158);
				match(DOT);
				}
				break;
			}
			setState(1162);
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
			setState(1164);
			kwDrop();
			setState(1165);
			kwMaterialized();
			setState(1166);
			kwView();
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1167);
				ifExist();
				}
				break;
			}
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(1170);
				keyspace();
				setState(1171);
				match(DOT);
				}
				break;
			}
			setState(1175);
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
			setState(1177);
			kwDrop();
			setState(1178);
			kwAggregate();
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1179);
				ifExist();
				}
				break;
			}
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
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
			setState(1189);
			kwDrop();
			setState(1190);
			kwFunction();
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1191);
				ifExist();
				}
				break;
			}
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
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
			setState(1201);
			kwDrop();
			setState(1202);
			kwTrigger();
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1203);
				ifExist();
				}
				break;
			}
			setState(1206);
			trigger();
			setState(1207);
			kwOn();
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1208);
				keyspace();
				setState(1209);
				match(DOT);
				}
				break;
			}
			setState(1213);
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
			setState(1215);
			kwDrop();
			setState(1216);
			kwRole();
			setState(1218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1217);
				ifExist();
				}
				break;
			}
			setState(1220);
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
			setState(1222);
			kwDrop();
			setState(1223);
			kwTable();
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1224);
				ifExist();
				}
				break;
			}
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1227);
				keyspace();
				setState(1228);
				match(DOT);
				}
				break;
			}
			setState(1232);
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
			setState(1234);
			kwDrop();
			setState(1235);
			kwKeyspace();
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1236);
				ifExist();
				}
				break;
			}
			setState(1239);
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
			setState(1241);
			kwDrop();
			setState(1242);
			kwIndex();
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1243);
				ifExist();
				}
				break;
			}
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1246);
				keyspace();
				setState(1247);
				match(DOT);
				}
				break;
			}
			setState(1251);
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
			setState(1253);
			kwCreate();
			setState(1254);
			kwTable();
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1255);
				ifNotExist();
				}
				break;
			}
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
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
			table();
			setState(1264);
			syntaxBracketLr();
			setState(1265);
			columnDefinitionList();
			setState(1266);
			syntaxBracketRr();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1267);
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
			setState(1270);
			kwWith();
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)) | (1L << (K_TRUE - 64)) | (1L << (K_TRUNCATE - 64)) | (1L << (K_TTL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (K_USERS - 128)))) != 0)) {
				{
				setState(1271);
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
			setState(1274);
			kwClustering();
			setState(1275);
			kwOrder();
			setState(1276);
			kwBy();
			setState(1277);
			syntaxBracketLr();
			setState(1278);
			column();
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1279);
				orderDirection();
				}
			}

			setState(1282);
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
			setState(1284);
			tableOptionItem();
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1285);
				kwAnd();
				setState(1286);
				tableOptionItem();
				}
				}
				setState(1292);
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
			setState(1302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				tableOptionName();
				setState(1294);
				match(OPERATOR_EQ);
				setState(1295);
				tableOptionValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				tableOptionName();
				setState(1298);
				match(OPERATOR_EQ);
				setState(1299);
				optionHash();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1301);
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
			setState(1304);
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
			setState(1308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				stringLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
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
			setState(1310);
			syntaxBracketLc();
			setState(1311);
			optionHashItem();
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1312);
				syntaxComma();
				setState(1313);
				optionHashItem();
				}
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1320);
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
			setState(1322);
			optionHashKey();
			setState(1323);
			match(COLON);
			setState(1324);
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
			setState(1326);
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
			setState(1330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				stringLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
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
			setState(1332);
			columnDefinition();
			}
			setState(1338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1333);
					syntaxComma();
					setState(1334);
					columnDefinition();
					}
					} 
				}
				setState(1340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1341);
				syntaxComma();
				setState(1342);
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
			setState(1346);
			column();
			setState(1347);
			dataType();
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(1348);
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
			setState(1351);
			kwPrimary();
			setState(1352);
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
			setState(1354);
			kwPrimary();
			setState(1355);
			kwKey();
			setState(1356);
			syntaxBracketLr();
			setState(1357);
			primaryKeyDefinition();
			setState(1358);
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
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				singlePrimaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				compoundKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
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
			setState(1365);
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
			setState(1367);
			partitionKey();
			{
			setState(1368);
			syntaxComma();
			setState(1369);
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
			setState(1371);
			syntaxBracketLr();
			setState(1372);
			partitionKeyList();
			setState(1373);
			syntaxBracketRr();
			{
			setState(1374);
			syntaxComma();
			setState(1375);
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
			setState(1377);
			partitionKey();
			}
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1378);
				syntaxComma();
				setState(1379);
				partitionKey();
				}
				}
				setState(1385);
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
			setState(1386);
			clusteringKey();
			}
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1387);
				syntaxComma();
				setState(1388);
				clusteringKey();
				}
				}
				setState(1394);
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
			setState(1395);
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
			setState(1397);
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
			setState(1399);
			kwApply();
			setState(1400);
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
			setState(1402);
			kwBegin();
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOGGED || _la==K_UNLOGGED) {
				{
				setState(1403);
				batchType();
				}
			}

			setState(1406);
			kwBatch();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1407);
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
			setState(1412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_LOGGED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				kwLogged();
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
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
			setState(1414);
			kwAlter();
			setState(1415);
			kwKeyspace();
			setState(1416);
			keyspace();
			setState(1417);
			kwWith();
			setState(1418);
			kwReplication();
			setState(1419);
			match(OPERATOR_EQ);
			setState(1420);
			syntaxBracketLc();
			setState(1421);
			replicationList();
			setState(1422);
			syntaxBracketRc();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(1423);
				kwAnd();
				setState(1424);
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
			setState(1428);
			replicationListItem();
			}
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1429);
				syntaxComma();
				setState(1430);
				replicationListItem();
				}
				}
				setState(1436);
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
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				match(STRING_LITERAL);
				setState(1438);
				match(COLON);
				setState(1439);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				match(STRING_LITERAL);
				setState(1441);
				match(COLON);
				setState(1442);
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
			setState(1445);
			kwDurableWrites();
			setState(1446);
			match(OPERATOR_EQ);
			setState(1447);
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
			setState(1449);
			kwUse();
			setState(1450);
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
			setState(1452);
			kwTruncate();
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1453);
				kwTable();
				}
				break;
			}
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1456);
				keyspace();
				setState(1457);
				match(DOT);
				}
				break;
			}
			setState(1461);
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
			setState(1463);
			kwCreate();
			setState(1464);
			kwIndex();
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1465);
				ifNotExist();
				}
				break;
			}
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1468);
				indexName();
				}
				break;
			}
			setState(1471);
			kwOn();
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1472);
				keyspace();
				setState(1473);
				match(DOT);
				}
				break;
			}
			setState(1477);
			table();
			setState(1478);
			syntaxBracketLr();
			setState(1479);
			indexColumnSpec();
			setState(1480);
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
			setState(1484);
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
				setState(1482);
				id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
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
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				indexKeysSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				indexEntriesSSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1489);
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
			setState(1492);
			kwKeys();
			setState(1493);
			syntaxBracketLr();
			setState(1494);
			column();
			setState(1495);
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
			setState(1497);
			kwEntries();
			setState(1498);
			syntaxBracketLr();
			setState(1499);
			column();
			setState(1500);
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
			setState(1502);
			kwFull();
			setState(1503);
			syntaxBracketLr();
			setState(1504);
			column();
			setState(1505);
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
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1507);
				beginBatch();
				}
			}

			setState(1510);
			kwDelete();
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1511);
				deleteColumnList();
				}
				break;
			}
			setState(1514);
			fromSpec();
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1515);
				usingTimestampSpec();
				}
			}

			setState(1518);
			whereSpec();
			setState(1521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1519);
				ifExist();
				}
				break;
			case 2:
				{
				setState(1520);
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
			setState(1523);
			deleteColumnItem();
			}
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1524);
				syntaxComma();
				setState(1525);
				deleteColumnItem();
				}
				}
				setState(1531);
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
			setState(1541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				id();
				setState(1534);
				match(LS_BRACKET);
				setState(1537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(1535);
					stringLiteral();
					}
					break;
				case DECIMAL_LITERAL:
					{
					setState(1536);
					decimalLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1539);
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
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1543);
				beginBatch();
				}
			}

			setState(1546);
			kwUpdate();
			setState(1550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1547);
				keyspace();
				setState(1548);
				match(DOT);
				}
				break;
			}
			setState(1552);
			table();
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1553);
				usingTtlTimestamp();
				}
			}

			setState(1556);
			kwSet();
			setState(1557);
			assignments();
			setState(1558);
			whereSpec();
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1559);
				ifExist();
				}
				break;
			case 2:
				{
				setState(1560);
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
			setState(1563);
			kwIf();
			setState(1564);
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
			setState(1566);
			ifCondition();
			}
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1567);
				kwAnd();
				setState(1568);
				ifCondition();
				}
				}
				setState(1574);
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
			setState(1575);
			id();
			setState(1576);
			match(OPERATOR_EQ);
			setState(1577);
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
			setState(1579);
			assignmentElement();
			}
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1580);
				syntaxComma();
				setState(1581);
				assignmentElement();
				}
				}
				setState(1587);
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
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1588);
				id();
				setState(1589);
				match(OPERATOR_EQ);
				setState(1594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1590);
					constant();
					}
					break;
				case 2:
					{
					setState(1591);
					assignmentMap();
					}
					break;
				case 3:
					{
					setState(1592);
					assignmentSet();
					}
					break;
				case 4:
					{
					setState(1593);
					assignmentList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				id();
				setState(1597);
				match(OPERATOR_EQ);
				setState(1598);
				id();
				setState(1599);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1600);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1602);
				id();
				setState(1603);
				match(OPERATOR_EQ);
				setState(1604);
				id();
				setState(1605);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1606);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1608);
				id();
				setState(1609);
				match(OPERATOR_EQ);
				setState(1610);
				assignmentSet();
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
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
				assignmentMap();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1620);
				id();
				setState(1621);
				match(OPERATOR_EQ);
				setState(1622);
				assignmentMap();
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
			case 7:
				enterOuterAlt(_localctx, 7);
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
				assignmentList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1632);
				id();
				setState(1633);
				match(OPERATOR_EQ);
				setState(1634);
				assignmentList();
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1638);
				id();
				setState(1639);
				syntaxBracketLs();
				setState(1640);
				decimalLiteral();
				setState(1641);
				syntaxBracketRs();
				setState(1642);
				match(OPERATOR_EQ);
				setState(1643);
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
			setState(1647);
			syntaxBracketLc();
			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)) | (1L << (K_TRUE - 64)) | (1L << (K_TRUNCATE - 64)) | (1L << (K_TTL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (CODE_BLOCK - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (FLOAT_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (UUID - 128)) | (1L << (K_USERS - 128)))) != 0)) {
				{
				setState(1648);
				constant();
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1649);
					syntaxComma();
					setState(1650);
					expression();
					}
					}
					setState(1656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1659);
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
			setState(1661);
			syntaxBracketLc();
			{
			setState(1662);
			constant();
			setState(1663);
			syntaxColon();
			setState(1664);
			expression();
			}
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1666);
				syntaxComma();
				setState(1667);
				constant();
				setState(1668);
				syntaxColon();
				setState(1669);
				expression();
				}
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1676);
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
			setState(1678);
			syntaxBracketLc();
			setState(1679);
			expression();
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1680);
				syntaxComma();
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
			setState(1690);
			syntaxBracketLs();
			setState(1691);
			constant();
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
			setState(1702);
			syntaxBracketLr();
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1703);
				expression();
				setState(1720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
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
					}
					break;
				case 2:
					{
					setState(1717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1712);
						syntaxComma();
						setState(1713);
						assignmentTuple();
						}
						}
						setState(1719);
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
				setState(1722);
				assignmentTuple();
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1723);
					syntaxComma();
					setState(1724);
					assignmentTuple();
					}
					}
					setState(1730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1733);
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
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1735);
				beginBatch();
				}
			}

			setState(1738);
			kwInsert();
			setState(1739);
			kwInto();
			setState(1743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1740);
				keyspace();
				setState(1741);
				match(DOT);
				}
				break;
			}
			setState(1745);
			table();
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(1746);
				insertColumnSpec();
				}
			}

			setState(1749);
			insertValuesSpec();
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1750);
				ifNotExist();
				}
			}

			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1753);
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
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				kwUsing();
				setState(1757);
				ttl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1759);
				kwUsing();
				setState(1760);
				ttl();
				setState(1761);
				kwAnd();
				setState(1762);
				timestamp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1764);
				kwUsing();
				setState(1765);
				timestamp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1767);
				kwUsing();
				setState(1768);
				timestamp();
				setState(1769);
				kwAnd();
				setState(1770);
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
			setState(1774);
			kwTimestamp();
			setState(1775);
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
			setState(1777);
			kwTtl();
			setState(1778);
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
			setState(1780);
			kwUsing();
			setState(1781);
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
			setState(1783);
			kwIf();
			setState(1784);
			kwNot();
			setState(1785);
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
			setState(1787);
			kwIf();
			setState(1788);
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
			setState(1798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(1790);
				kwValues();
				setState(1791);
				match(LR_BRACKET);
				setState(1792);
				expressionList();
				setState(1793);
				match(RR_BRACKET);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1795);
				kwJson();
				setState(1796);
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
			setState(1800);
			match(LR_BRACKET);
			setState(1801);
			columnList();
			setState(1802);
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
			setState(1804);
			column();
			setState(1810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1805);
				syntaxComma();
				setState(1806);
				column();
				}
				}
				setState(1812);
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
			setState(1813);
			expression();
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1814);
				syntaxComma();
				setState(1815);
				expression();
				}
				}
				setState(1821);
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
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1823);
				assignmentMap();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1824);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1825);
				assignmentList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1826);
				assignmentTuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1827);
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
			setState(1830);
			kwSelect();
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1831);
				distinctSpec();
				}
				break;
			}
			setState(1835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1834);
				kwJson();
				}
				break;
			}
			setState(1837);
			selectElements();
			setState(1838);
			fromSpec();
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1839);
				whereSpec();
				}
			}

			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1842);
				orderSpec();
				}
			}

			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1845);
				limitSpec();
				}
			}

			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALLOW) {
				{
				setState(1848);
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
			setState(1851);
			kwAllow();
			setState(1852);
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
			setState(1854);
			kwLimit();
			setState(1855);
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
			setState(1857);
			kwFrom();
			setState(1858);
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
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1860);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				id();
				setState(1862);
				match(DOT);
				setState(1863);
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
			setState(1867);
			kwOrder();
			setState(1868);
			kwBy();
			setState(1869);
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
			setState(1871);
			id();
			setState(1874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				{
				setState(1872);
				kwAsc();
				}
				break;
			case K_DESC:
				{
				setState(1873);
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
			setState(1876);
			kwWhere();
			setState(1877);
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
			setState(1879);
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
			setState(1883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(1881);
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
				setState(1882);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1885);
				syntaxComma();
				setState(1886);
				selectElement();
				}
				}
				setState(1892);
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
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1893);
				id();
				setState(1894);
				match(DOT);
				setState(1895);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1897);
				id();
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1898);
					kwAs();
					setState(1899);
					id();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1903);
				functionCall();
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1904);
					kwAs();
					setState(1905);
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
			setState(1911);
			relationElement();
			}
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1912);
				kwAnd();
				setState(1913);
				relationElement();
				}
				}
				setState(1919);
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
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				id();
				setState(1921);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (OPERATOR_EQ - 171)) | (1L << (OPERATOR_LT - 171)) | (1L << (OPERATOR_GT - 171)) | (1L << (OPERATOR_LTE - 171)) | (1L << (OPERATOR_GTE - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1922);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				id();
				setState(1925);
				match(DOT);
				setState(1926);
				id();
				setState(1927);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (OPERATOR_EQ - 171)) | (1L << (OPERATOR_LT - 171)) | (1L << (OPERATOR_GT - 171)) | (1L << (OPERATOR_LTE - 171)) | (1L << (OPERATOR_GTE - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1928);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1930);
				functionCall();
				setState(1931);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (OPERATOR_EQ - 171)) | (1L << (OPERATOR_LT - 171)) | (1L << (OPERATOR_GT - 171)) | (1L << (OPERATOR_LTE - 171)) | (1L << (OPERATOR_GTE - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1932);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1934);
				functionCall();
				setState(1935);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (OPERATOR_EQ - 171)) | (1L << (OPERATOR_LT - 171)) | (1L << (OPERATOR_GT - 171)) | (1L << (OPERATOR_LTE - 171)) | (1L << (OPERATOR_GTE - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1936);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1938);
				id();
				setState(1939);
				kwIn();
				setState(1940);
				match(LR_BRACKET);
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)) | (1L << (K_TRUE - 64)) | (1L << (K_TRUNCATE - 64)) | (1L << (K_TTL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (CODE_BLOCK - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (FLOAT_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (UUID - 128)) | (1L << (K_USERS - 128)))) != 0)) {
					{
					setState(1941);
					functionArgs();
					}
				}

				setState(1944);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1946);
				match(LR_BRACKET);
				setState(1947);
				id();
				setState(1953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1948);
					syntaxComma();
					setState(1949);
					id();
					}
					}
					setState(1955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1956);
				match(RR_BRACKET);
				setState(1957);
				kwIn();
				setState(1958);
				match(LR_BRACKET);
				setState(1959);
				assignmentTuple();
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1960);
					syntaxComma();
					setState(1961);
					assignmentTuple();
					}
					}
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1968);
				match(RR_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1970);
				match(LR_BRACKET);
				setState(1971);
				id();
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1972);
					syntaxComma();
					setState(1973);
					id();
					}
					}
					setState(1979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1980);
				match(RR_BRACKET);
				setState(1981);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (OPERATOR_EQ - 171)) | (1L << (OPERATOR_LT - 171)) | (1L << (OPERATOR_GT - 171)) | (1L << (OPERATOR_LTE - 171)) | (1L << (OPERATOR_GTE - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(1982);
				assignmentTuple();
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1983);
					syntaxComma();
					setState(1984);
					assignmentTuple();
					}
					}
					setState(1990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1991);
				relalationContainsKey();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1992);
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
			setState(1995);
			id();
			setState(1996);
			kwContains();
			setState(1997);
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
			setState(1999);
			id();
			{
			setState(2000);
			kwContains();
			setState(2001);
			kwKey();
			}
			setState(2003);
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
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				id();
				setState(2006);
				match(LR_BRACKET);
				setState(2007);
				match(STAR);
				setState(2008);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				id();
				setState(2011);
				match(LR_BRACKET);
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALLOW) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_ANY) | (1L << K_APPLY) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTHORIZE) | (1L << K_BATCH) | (1L << K_BEGIN) | (1L << K_BY) | (1L << K_CALLED) | (1L << K_CLUSTERING) | (1L << K_COLUMNFAMILY) | (1L << K_COMPACT) | (1L << K_CONSISTENCY) | (1L << K_CONTAINS) | (1L << K_CREATE) | (1L << K_CUSTOM) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DESCRIBE) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_DURABLE_WRITES) | (1L << K_EACH_QUORUM) | (1L << K_ENTRIES) | (1L << K_EXECUTE) | (1L << K_EXISTS) | (1L << K_FALSE) | (1L << K_FILTERING) | (1L << K_FINALFUNC) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_FUNCTION) | (1L << K_FUNCTIONS) | (1L << K_GRANT) | (1L << K_IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INFINITY - 64)) | (1L << (K_INITCOND - 64)) | (1L << (K_INPUT - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_JSON - 64)) | (1L << (K_KEY - 64)) | (1L << (K_KEYS - 64)) | (1L << (K_KEYSPACE - 64)) | (1L << (K_KEYSPACES - 64)) | (1L << (K_LANGUAGE - 64)) | (1L << (K_LEVEL - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_LOCAL_ONE - 64)) | (1L << (K_LOCAL_QUORUM - 64)) | (1L << (K_LOGGED - 64)) | (1L << (K_LOGIN - 64)) | (1L << (K_MATERIALIZED - 64)) | (1L << (K_MODIFY - 64)) | (1L << (K_NAN - 64)) | (1L << (K_NORECURSIVE - 64)) | (1L << (K_NOSUPERUSER - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_ON - 64)) | (1L << (K_ONE - 64)) | (1L << (K_OPTIONS - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_PARTITION - 64)) | (1L << (K_PASSWORD - 64)) | (1L << (K_PER - 64)) | (1L << (K_PERMISSION - 64)) | (1L << (K_PERMISSIONS - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUORUM - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_REPLICATION - 64)) | (1L << (K_RETURNS - 64)) | (1L << (K_REVOKE - 64)) | (1L << (K_ROLE - 64)) | (1L << (K_ROLES - 64)) | (1L << (K_SCHEMA - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_SFUNC - 64)) | (1L << (K_STATIC - 64)) | (1L << (K_STORAGE - 64)) | (1L << (K_STYPE - 64)) | (1L << (K_SUPERUSER - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THREE - 64)) | (1L << (K_TIMESTAMP - 64)) | (1L << (K_TO - 64)) | (1L << (K_TOKEN - 64)) | (1L << (K_TRIGGER - 64)) | (1L << (K_TRUE - 64)) | (1L << (K_TRUNCATE - 64)) | (1L << (K_TTL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_TWO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNLOGGED - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_USER - 128)) | (1L << (K_USING - 128)) | (1L << (K_UUID - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WRITETIME - 128)) | (1L << (K_ASCII - 128)) | (1L << (K_BIGINT - 128)) | (1L << (K_BLOB - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_COUNTER - 128)) | (1L << (K_DATE - 128)) | (1L << (K_DECIMAL - 128)) | (1L << (K_DOUBLE - 128)) | (1L << (K_FLOAT - 128)) | (1L << (K_FROZEN - 128)) | (1L << (K_INET - 128)) | (1L << (K_INT - 128)) | (1L << (K_LIST - 128)) | (1L << (K_MAP - 128)) | (1L << (K_SMALLINT - 128)) | (1L << (K_TEXT - 128)) | (1L << (K_TIMEUUID - 128)) | (1L << (K_TIME - 128)) | (1L << (K_TINYINT - 128)) | (1L << (K_TUPLE - 128)) | (1L << (K_VARCHAR - 128)) | (1L << (K_VARINT - 128)) | (1L << (CODE_BLOCK - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (FLOAT_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (OBJECT_NAME - 128)) | (1L << (UUID - 128)) | (1L << (K_USERS - 128)))) != 0)) {
					{
					setState(2012);
					functionArgs();
					}
				}

				setState(2015);
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
			setState(2022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(2019);
				constant();
				}
				break;
			case 2:
				{
				setState(2020);
				id();
				}
				break;
			case 3:
				{
				setState(2021);
				functionCall();
				}
				break;
			}
			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2024);
				syntaxComma();
				setState(2028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(2025);
					constant();
					}
					break;
				case 2:
					{
					setState(2026);
					id();
					}
					break;
				case 3:
					{
					setState(2027);
					functionCall();
					}
					break;
				}
				}
				}
				setState(2034);
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
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(UUID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2037);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2038);
				floatLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2039);
				hexadecimalLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2040);
				booleanLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2041);
				codeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2042);
				kwNull();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2043);
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
			setState(2046);
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
			setState(2048);
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
			setState(2050);
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
			setState(2052);
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
			setState(2054);
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
			setState(2061);
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
				setState(2056);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				match(DQUOTE);
				setState(2058);
				id();
				setState(2059);
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
			setState(2068);
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
				setState(2063);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				match(DQUOTE);
				setState(2065);
				id();
				setState(2066);
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
			setState(2075);
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
				setState(2070);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(DQUOTE);
				setState(2072);
				id();
				setState(2073);
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
			setState(2077);
			dataTypeName();
			setState(2079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATOR_LT) {
				{
				setState(2078);
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
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2081);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2083);
				match(K_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2084);
				match(K_SET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2085);
				match(K_ASCII);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2086);
				match(K_BIGINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2087);
				match(K_BLOB);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2088);
				match(K_BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2089);
				match(K_COUNTER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2090);
				match(K_DATE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2091);
				match(K_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2092);
				match(K_DOUBLE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2093);
				match(K_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2094);
				match(K_FROZEN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2095);
				match(K_INET);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2096);
				match(K_INT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2097);
				match(K_LIST);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2098);
				match(K_MAP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2099);
				match(K_SMALLINT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2100);
				match(K_TEXT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2101);
				match(K_TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2102);
				match(K_TIMEUUID);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2103);
				match(K_TINYINT);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2104);
				match(K_TUPLE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2105);
				match(K_VARCHAR);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2106);
				match(K_VARINT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2107);
				match(K_TIMESTAMP);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2108);
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
			setState(2111);
			syntaxBracketLa();
			setState(2112);
			dataType();
			setState(2118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2113);
				syntaxComma();
				setState(2114);
				dataType();
				}
				}
				setState(2120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2121);
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
			setState(2125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2123);
				kwAsc();
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2124);
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
			setState(2127);
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
			setState(2129);
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
			setState(2131);
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
			setState(2133);
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
			setState(2135);
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
			setState(2137);
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
			setState(2143);
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
			setState(2145);
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
			setState(2149);
			paramName();
			setState(2150);
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
			setState(2152);
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
			setState(2154);
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
			setState(2156);
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
			setState(2158);
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
			setState(2160);
			match(K_ALL);
			setState(2161);
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
			setState(2163);
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
			setState(2165);
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
			setState(2167);
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
			setState(2169);
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
			setState(2171);
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
			setState(2173);
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
			setState(2175);
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
			setState(2177);
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
			setState(2179);
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
			setState(2181);
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
			setState(2183);
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
			setState(2185);
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
			setState(2187);
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
			setState(2189);
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
			setState(2191);
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
			setState(2193);
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
			setState(2195);
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
			setState(2197);
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
			setState(2199);
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
			setState(2201);
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
			setState(2203);
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
			setState(2205);
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
			setState(2207);
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
			setState(2209);
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
			setState(2211);
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
			setState(2213);
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
			setState(2215);
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
			setState(2217);
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
			setState(2219);
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
			setState(2221);
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
			setState(2223);
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
			setState(2225);
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
			setState(2227);
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
			setState(2229);
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
			setState(2231);
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
			setState(2233);
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
			setState(2235);
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
			setState(2237);
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
			setState(2239);
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
			setState(2241);
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
			setState(2243);
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
			setState(2245);
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
			setState(2247);
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
			setState(2249);
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
			setState(2251);
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
			setState(2253);
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
			setState(2255);
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
			setState(2257);
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
			setState(2259);
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
			setState(2261);
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
			setState(2263);
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
			setState(2265);
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
			setState(2267);
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
			setState(2269);
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
			setState(2271);
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
			setState(2273);
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
			setState(2275);
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
			setState(2277);
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
			setState(2279);
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
			setState(2281);
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
			setState(2283);
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
			setState(2285);
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
			setState(2287);
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
			setState(2289);
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
			setState(2291);
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
			setState(2293);
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
			setState(2295);
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

	public static class KwRolesContext extends ParserRuleContext {
		public TerminalNode K_ROLES() { return getToken(CqlParser.K_ROLES, 0); }
		public KwRolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRoles; }
	}

	public final KwRolesContext kwRoles() throws RecognitionException {
		KwRolesContext _localctx = new KwRolesContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_kwRoles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
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
		enterRule(_localctx, 492, RULE_kwSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
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
		enterRule(_localctx, 494, RULE_kwSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
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
		enterRule(_localctx, 496, RULE_kwSfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
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
		enterRule(_localctx, 498, RULE_kwStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
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
		enterRule(_localctx, 500, RULE_kwStype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
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
		enterRule(_localctx, 502, RULE_kwSuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
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
		enterRule(_localctx, 504, RULE_kwTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
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
		enterRule(_localctx, 506, RULE_kwTimestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
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
		enterRule(_localctx, 508, RULE_kwTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
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
		enterRule(_localctx, 510, RULE_kwTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
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
		enterRule(_localctx, 512, RULE_kwTruncate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
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
		enterRule(_localctx, 514, RULE_kwTtl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
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
		enterRule(_localctx, 516, RULE_kwType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
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
		enterRule(_localctx, 518, RULE_kwUnlogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
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
		enterRule(_localctx, 520, RULE_kwUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
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
		enterRule(_localctx, 522, RULE_kwUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
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
		enterRule(_localctx, 524, RULE_kwUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
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
		enterRule(_localctx, 526, RULE_kwUsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
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
		enterRule(_localctx, 528, RULE_kwUsing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
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
		enterRule(_localctx, 530, RULE_kwValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
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
		enterRule(_localctx, 532, RULE_kwView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
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
		enterRule(_localctx, 534, RULE_kwWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
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
		enterRule(_localctx, 536, RULE_kwWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
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
		enterRule(_localctx, 538, RULE_kwRevoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
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
		enterRule(_localctx, 540, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
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
		enterRule(_localctx, 542, RULE_syntaxBracketLr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
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
		enterRule(_localctx, 544, RULE_syntaxBracketRr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
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
		enterRule(_localctx, 546, RULE_syntaxBracketLc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
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
		enterRule(_localctx, 548, RULE_syntaxBracketRc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
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
		enterRule(_localctx, 550, RULE_syntaxBracketLa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
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
		enterRule(_localctx, 552, RULE_syntaxBracketRa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
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
		enterRule(_localctx, 554, RULE_syntaxBracketLs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
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
		enterRule(_localctx, 556, RULE_syntaxBracketRs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
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
		enterRule(_localctx, 558, RULE_syntaxComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
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
		enterRule(_localctx, 560, RULE_syntaxColon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
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
		enterRule(_localctx, 562, RULE_id);
		try {
			setState(2511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2369);
				match(OBJECT_NAME);
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2370);
				match(K_ADD);
				setState(2371);
				match(K_AGGREGATE);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2372);
				match(K_ALL);
				}
				break;
			case K_ALLOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(2373);
				match(K_ALLOW);
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2374);
				match(K_ALTER);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 6);
				{
				setState(2375);
				match(K_AND);
				}
				break;
			case K_ANY:
				enterOuterAlt(_localctx, 7);
				{
				setState(2376);
				match(K_ANY);
				}
				break;
			case K_APPLY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2377);
				match(K_APPLY);
				}
				break;
			case K_AS:
				enterOuterAlt(_localctx, 9);
				{
				setState(2378);
				match(K_AS);
				}
				break;
			case K_ASC:
				enterOuterAlt(_localctx, 10);
				{
				setState(2379);
				match(K_ASC);
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2380);
				match(K_AUTHORIZE);
				}
				break;
			case K_BATCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(2381);
				match(K_BATCH);
				}
				break;
			case K_BEGIN:
				enterOuterAlt(_localctx, 13);
				{
				setState(2382);
				match(K_BEGIN);
				}
				break;
			case K_BY:
				enterOuterAlt(_localctx, 14);
				{
				setState(2383);
				match(K_BY);
				}
				break;
			case K_CALLED:
				enterOuterAlt(_localctx, 15);
				{
				setState(2384);
				match(K_CALLED);
				}
				break;
			case K_CLUSTERING:
				enterOuterAlt(_localctx, 16);
				{
				setState(2385);
				match(K_CLUSTERING);
				}
				break;
			case K_COLUMNFAMILY:
				enterOuterAlt(_localctx, 17);
				{
				setState(2386);
				match(K_COLUMNFAMILY);
				}
				break;
			case K_COMPACT:
				enterOuterAlt(_localctx, 18);
				{
				setState(2387);
				match(K_COMPACT);
				}
				break;
			case K_CONSISTENCY:
				enterOuterAlt(_localctx, 19);
				{
				setState(2388);
				match(K_CONSISTENCY);
				}
				break;
			case K_CONTAINS:
				enterOuterAlt(_localctx, 20);
				{
				setState(2389);
				match(K_CONTAINS);
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 21);
				{
				setState(2390);
				match(K_CREATE);
				}
				break;
			case K_CUSTOM:
				enterOuterAlt(_localctx, 22);
				{
				setState(2391);
				match(K_CUSTOM);
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 23);
				{
				setState(2392);
				match(K_DELETE);
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 24);
				{
				setState(2393);
				match(K_DESC);
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 25);
				{
				setState(2394);
				match(K_DESCRIBE);
				}
				break;
			case K_DISTINCT:
				enterOuterAlt(_localctx, 26);
				{
				setState(2395);
				match(K_DISTINCT);
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 27);
				{
				setState(2396);
				match(K_DROP);
				}
				break;
			case K_DURABLE_WRITES:
				enterOuterAlt(_localctx, 28);
				{
				setState(2397);
				match(K_DURABLE_WRITES);
				}
				break;
			case K_EACH_QUORUM:
				enterOuterAlt(_localctx, 29);
				{
				setState(2398);
				match(K_EACH_QUORUM);
				}
				break;
			case K_ENTRIES:
				enterOuterAlt(_localctx, 30);
				{
				setState(2399);
				match(K_ENTRIES);
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 31);
				{
				setState(2400);
				match(K_EXECUTE);
				}
				break;
			case K_EXISTS:
				enterOuterAlt(_localctx, 32);
				{
				setState(2401);
				match(K_EXISTS);
				}
				break;
			case K_FALSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(2402);
				match(K_FALSE);
				}
				break;
			case K_FILTERING:
				enterOuterAlt(_localctx, 34);
				{
				setState(2403);
				match(K_FILTERING);
				}
				break;
			case K_FINALFUNC:
				enterOuterAlt(_localctx, 35);
				{
				setState(2404);
				match(K_FINALFUNC);
				}
				break;
			case K_FROM:
				enterOuterAlt(_localctx, 36);
				{
				setState(2405);
				match(K_FROM);
				}
				break;
			case K_FULL:
				enterOuterAlt(_localctx, 37);
				{
				setState(2406);
				match(K_FULL);
				}
				break;
			case K_FUNCTION:
				enterOuterAlt(_localctx, 38);
				{
				setState(2407);
				match(K_FUNCTION);
				}
				break;
			case K_FUNCTIONS:
				enterOuterAlt(_localctx, 39);
				{
				setState(2408);
				match(K_FUNCTIONS);
				}
				break;
			case K_GRANT:
				enterOuterAlt(_localctx, 40);
				{
				setState(2409);
				match(K_GRANT);
				}
				break;
			case K_IF:
				enterOuterAlt(_localctx, 41);
				{
				setState(2410);
				match(K_IF);
				}
				break;
			case K_IN:
				enterOuterAlt(_localctx, 42);
				{
				setState(2411);
				match(K_IN);
				}
				break;
			case K_INDEX:
				enterOuterAlt(_localctx, 43);
				{
				setState(2412);
				match(K_INDEX);
				}
				break;
			case K_INFINITY:
				enterOuterAlt(_localctx, 44);
				{
				setState(2413);
				match(K_INFINITY);
				}
				break;
			case K_INITCOND:
				enterOuterAlt(_localctx, 45);
				{
				setState(2414);
				match(K_INITCOND);
				}
				break;
			case K_INPUT:
				enterOuterAlt(_localctx, 46);
				{
				setState(2415);
				match(K_INPUT);
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 47);
				{
				setState(2416);
				match(K_INSERT);
				}
				break;
			case K_INTO:
				enterOuterAlt(_localctx, 48);
				{
				setState(2417);
				match(K_INTO);
				}
				break;
			case K_IS:
				enterOuterAlt(_localctx, 49);
				{
				setState(2418);
				match(K_IS);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 50);
				{
				setState(2419);
				match(K_JSON);
				}
				break;
			case K_KEY:
				enterOuterAlt(_localctx, 51);
				{
				setState(2420);
				match(K_KEY);
				}
				break;
			case K_KEYS:
				enterOuterAlt(_localctx, 52);
				{
				setState(2421);
				match(K_KEYS);
				}
				break;
			case K_KEYSPACE:
				enterOuterAlt(_localctx, 53);
				{
				setState(2422);
				match(K_KEYSPACE);
				}
				break;
			case K_KEYSPACES:
				enterOuterAlt(_localctx, 54);
				{
				setState(2423);
				match(K_KEYSPACES);
				}
				break;
			case K_LANGUAGE:
				enterOuterAlt(_localctx, 55);
				{
				setState(2424);
				match(K_LANGUAGE);
				}
				break;
			case K_LEVEL:
				enterOuterAlt(_localctx, 56);
				{
				setState(2425);
				match(K_LEVEL);
				}
				break;
			case K_LIMIT:
				enterOuterAlt(_localctx, 57);
				{
				setState(2426);
				match(K_LIMIT);
				}
				break;
			case K_LOCAL_ONE:
				enterOuterAlt(_localctx, 58);
				{
				setState(2427);
				match(K_LOCAL_ONE);
				}
				break;
			case K_LOCAL_QUORUM:
				enterOuterAlt(_localctx, 59);
				{
				setState(2428);
				match(K_LOCAL_QUORUM);
				}
				break;
			case K_LOGGED:
				enterOuterAlt(_localctx, 60);
				{
				setState(2429);
				match(K_LOGGED);
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 61);
				{
				setState(2430);
				match(K_LOGIN);
				}
				break;
			case K_MATERIALIZED:
				enterOuterAlt(_localctx, 62);
				{
				setState(2431);
				match(K_MATERIALIZED);
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 63);
				{
				setState(2432);
				match(K_MODIFY);
				}
				break;
			case K_NAN:
				enterOuterAlt(_localctx, 64);
				{
				setState(2433);
				match(K_NAN);
				}
				break;
			case K_NORECURSIVE:
				enterOuterAlt(_localctx, 65);
				{
				setState(2434);
				match(K_NORECURSIVE);
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 66);
				{
				setState(2435);
				match(K_NOSUPERUSER);
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 67);
				{
				setState(2436);
				match(K_NOT);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 68);
				{
				setState(2437);
				match(K_NULL);
				}
				break;
			case K_OF:
				enterOuterAlt(_localctx, 69);
				{
				setState(2438);
				match(K_OF);
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 70);
				{
				setState(2439);
				match(K_ON);
				}
				break;
			case K_ONE:
				enterOuterAlt(_localctx, 71);
				{
				setState(2440);
				match(K_ONE);
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 72);
				{
				setState(2441);
				match(K_OPTIONS);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 73);
				{
				setState(2442);
				match(K_OR);
				}
				break;
			case K_ORDER:
				enterOuterAlt(_localctx, 74);
				{
				setState(2443);
				match(K_ORDER);
				}
				break;
			case K_PARTITION:
				enterOuterAlt(_localctx, 75);
				{
				setState(2444);
				match(K_PARTITION);
				}
				break;
			case K_PASSWORD:
				enterOuterAlt(_localctx, 76);
				{
				setState(2445);
				match(K_PASSWORD);
				}
				break;
			case K_PER:
				enterOuterAlt(_localctx, 77);
				{
				setState(2446);
				match(K_PER);
				}
				break;
			case K_PERMISSION:
				enterOuterAlt(_localctx, 78);
				{
				setState(2447);
				match(K_PERMISSION);
				}
				break;
			case K_PERMISSIONS:
				enterOuterAlt(_localctx, 79);
				{
				setState(2448);
				match(K_PERMISSIONS);
				}
				break;
			case K_PRIMARY:
				enterOuterAlt(_localctx, 80);
				{
				setState(2449);
				match(K_PRIMARY);
				}
				break;
			case K_QUORUM:
				enterOuterAlt(_localctx, 81);
				{
				setState(2450);
				match(K_QUORUM);
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 82);
				{
				setState(2451);
				match(K_RENAME);
				}
				break;
			case K_REPLACE:
				enterOuterAlt(_localctx, 83);
				{
				setState(2452);
				match(K_REPLACE);
				}
				break;
			case K_REPLICATION:
				enterOuterAlt(_localctx, 84);
				{
				setState(2453);
				match(K_REPLICATION);
				}
				break;
			case K_RETURNS:
				enterOuterAlt(_localctx, 85);
				{
				setState(2454);
				match(K_RETURNS);
				}
				break;
			case K_REVOKE:
				enterOuterAlt(_localctx, 86);
				{
				setState(2455);
				match(K_REVOKE);
				}
				break;
			case K_ROLE:
				enterOuterAlt(_localctx, 87);
				{
				setState(2456);
				match(K_ROLE);
				}
				break;
			case K_ROLES:
				enterOuterAlt(_localctx, 88);
				{
				setState(2457);
				match(K_ROLES);
				}
				break;
			case K_SCHEMA:
				enterOuterAlt(_localctx, 89);
				{
				setState(2458);
				match(K_SCHEMA);
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 90);
				{
				setState(2459);
				match(K_SELECT);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 91);
				{
				setState(2460);
				match(K_SET);
				}
				break;
			case K_SFUNC:
				enterOuterAlt(_localctx, 92);
				{
				setState(2461);
				match(K_SFUNC);
				}
				break;
			case K_STATIC:
				enterOuterAlt(_localctx, 93);
				{
				setState(2462);
				match(K_STATIC);
				}
				break;
			case K_STORAGE:
				enterOuterAlt(_localctx, 94);
				{
				setState(2463);
				match(K_STORAGE);
				}
				break;
			case K_STYPE:
				enterOuterAlt(_localctx, 95);
				{
				setState(2464);
				match(K_STYPE);
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 96);
				{
				setState(2465);
				match(K_SUPERUSER);
				}
				break;
			case K_TABLE:
				enterOuterAlt(_localctx, 97);
				{
				setState(2466);
				match(K_TABLE);
				}
				break;
			case K_THREE:
				enterOuterAlt(_localctx, 98);
				{
				setState(2467);
				match(K_THREE);
				}
				break;
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 99);
				{
				setState(2468);
				match(K_TIMESTAMP);
				}
				break;
			case K_TO:
				enterOuterAlt(_localctx, 100);
				{
				setState(2469);
				match(K_TO);
				}
				break;
			case K_TOKEN:
				enterOuterAlt(_localctx, 101);
				{
				setState(2470);
				match(K_TOKEN);
				}
				break;
			case K_TRIGGER:
				enterOuterAlt(_localctx, 102);
				{
				setState(2471);
				match(K_TRIGGER);
				}
				break;
			case K_TRUE:
				enterOuterAlt(_localctx, 103);
				{
				setState(2472);
				match(K_TRUE);
				}
				break;
			case K_TRUNCATE:
				enterOuterAlt(_localctx, 104);
				{
				setState(2473);
				match(K_TRUNCATE);
				}
				break;
			case K_TTL:
				enterOuterAlt(_localctx, 105);
				{
				setState(2474);
				match(K_TTL);
				}
				break;
			case K_TWO:
				enterOuterAlt(_localctx, 106);
				{
				setState(2475);
				match(K_TWO);
				}
				break;
			case K_TYPE:
				enterOuterAlt(_localctx, 107);
				{
				setState(2476);
				match(K_TYPE);
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 108);
				{
				setState(2477);
				match(K_UNLOGGED);
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 109);
				{
				setState(2478);
				match(K_UPDATE);
				}
				break;
			case K_USE:
				enterOuterAlt(_localctx, 110);
				{
				setState(2479);
				match(K_USE);
				}
				break;
			case K_USER:
				enterOuterAlt(_localctx, 111);
				{
				setState(2480);
				match(K_USER);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 112);
				{
				setState(2481);
				match(K_USING);
				}
				break;
			case K_UUID:
				enterOuterAlt(_localctx, 113);
				{
				setState(2482);
				match(K_UUID);
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 114);
				{
				setState(2483);
				match(K_VALUES);
				}
				break;
			case K_VIEW:
				enterOuterAlt(_localctx, 115);
				{
				setState(2484);
				match(K_VIEW);
				}
				break;
			case K_WHERE:
				enterOuterAlt(_localctx, 116);
				{
				setState(2485);
				match(K_WHERE);
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 117);
				{
				setState(2486);
				match(K_WITH);
				}
				break;
			case K_WRITETIME:
				enterOuterAlt(_localctx, 118);
				{
				setState(2487);
				match(K_WRITETIME);
				}
				break;
			case K_ASCII:
				enterOuterAlt(_localctx, 119);
				{
				setState(2488);
				match(K_ASCII);
				}
				break;
			case K_BIGINT:
				enterOuterAlt(_localctx, 120);
				{
				setState(2489);
				match(K_BIGINT);
				}
				break;
			case K_BLOB:
				enterOuterAlt(_localctx, 121);
				{
				setState(2490);
				match(K_BLOB);
				}
				break;
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 122);
				{
				setState(2491);
				match(K_BOOLEAN);
				}
				break;
			case K_COUNTER:
				enterOuterAlt(_localctx, 123);
				{
				setState(2492);
				match(K_COUNTER);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 124);
				{
				setState(2493);
				match(K_DATE);
				}
				break;
			case K_DECIMAL:
				enterOuterAlt(_localctx, 125);
				{
				setState(2494);
				match(K_DECIMAL);
				}
				break;
			case K_DOUBLE:
				enterOuterAlt(_localctx, 126);
				{
				setState(2495);
				match(K_DOUBLE);
				}
				break;
			case K_FLOAT:
				enterOuterAlt(_localctx, 127);
				{
				setState(2496);
				match(K_FLOAT);
				}
				break;
			case K_FROZEN:
				enterOuterAlt(_localctx, 128);
				{
				setState(2497);
				match(K_FROZEN);
				}
				break;
			case K_INET:
				enterOuterAlt(_localctx, 129);
				{
				setState(2498);
				match(K_INET);
				}
				break;
			case K_INT:
				enterOuterAlt(_localctx, 130);
				{
				setState(2499);
				match(K_INT);
				}
				break;
			case K_LIST:
				enterOuterAlt(_localctx, 131);
				{
				setState(2500);
				match(K_LIST);
				}
				break;
			case K_MAP:
				enterOuterAlt(_localctx, 132);
				{
				setState(2501);
				match(K_MAP);
				}
				break;
			case K_SMALLINT:
				enterOuterAlt(_localctx, 133);
				{
				setState(2502);
				match(K_SMALLINT);
				}
				break;
			case K_TEXT:
				enterOuterAlt(_localctx, 134);
				{
				setState(2503);
				match(K_TEXT);
				}
				break;
			case K_TIMEUUID:
				enterOuterAlt(_localctx, 135);
				{
				setState(2504);
				match(K_TIMEUUID);
				}
				break;
			case K_TIME:
				enterOuterAlt(_localctx, 136);
				{
				setState(2505);
				match(K_TIME);
				}
				break;
			case K_TINYINT:
				enterOuterAlt(_localctx, 137);
				{
				setState(2506);
				match(K_TINYINT);
				}
				break;
			case K_TUPLE:
				enterOuterAlt(_localctx, 138);
				{
				setState(2507);
				match(K_TUPLE);
				}
				break;
			case K_VARCHAR:
				enterOuterAlt(_localctx, 139);
				{
				setState(2508);
				match(K_VARCHAR);
				}
				break;
			case K_VARINT:
				enterOuterAlt(_localctx, 140);
				{
				setState(2509);
				match(K_VARINT);
				}
				break;
			case K_USERS:
				enterOuterAlt(_localctx, 141);
				{
				setState(2510);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b2\u09d4\4\2\t"+
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
		"\4\u011a\t\u011a\4\u011b\t\u011b\3\2\5\2\u0238\n\2\3\2\5\2\u023b\n\2\3"+
		"\2\3\2\3\3\3\3\5\3\u0241\n\3\3\3\3\3\3\3\7\3\u0246\n\3\f\3\16\3\u0249"+
		"\13\3\3\3\3\3\5\3\u024d\n\3\3\3\5\3\u0250\n\3\3\3\5\3\u0253\n\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u027e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t\u028f\n\t\3\t\5\t\u0292\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0299\n\n\3\n\3\n\3\n\5\n\u029e\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\5\f\u02a9\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u02b3"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u02c2\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u02cd\n\r\3\r\3\r\3\r\5\r\u02d2"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u02db\n\r\3\16\3\16\3\16\5\16\u02e0"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u02e8\n\16\3\17\3\17\3\17\5\17"+
		"\u02ed\n\17\3\17\3\17\5\17\u02f1\n\17\3\20\3\20\3\20\5\20\u02f6\n\20\3"+
		"\20\3\20\3\20\5\20\u02fb\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0308\n\21\f\21\16\21\u030b\13\21\3\22\3\22\3\22"+
		"\5\22\u0310\n\22\3\22\3\22\3\22\5\22\u0315\n\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\5\23\u031f\n\23\3\23\3\23\3\23\5\23\u0324\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u032e\n\23\3\23\3\23\3\23\5\23"+
		"\u0333\n\23\3\23\3\23\3\23\5\23\u0338\n\23\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u033f\n\24\3\25\3\25\3\25\3\25\7\25\u0345\n\25\f\25\16\25\u0348\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u0354\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0360\n\30\3\31"+
		"\3\31\5\31\u0364\n\31\3\31\3\31\5\31\u0368\n\31\3\31\3\31\3\31\5\31\u036d"+
		"\n\31\3\31\3\31\3\31\5\31\u0372\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0383\n\33\f\33\16\33\u0386"+
		"\13\33\3\34\3\34\3\34\3\34\5\34\u038c\n\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\5\35\u0394\n\35\3\35\3\35\5\35\u0398\n\35\3\35\3\35\3\35\5\35\u039d"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u03b0\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u03b7"+
		"\n\37\f\37\16\37\u03ba\13\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7"+
		"!\u03c8\n!\f!\16!\u03cb\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u03d4\n\"\f"+
		"\"\16\"\u03d7\13\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u03e4\n$\3%\3"+
		"%\3%\3&\3&\5&\u03eb\n&\3\'\3\'\3\'\3\'\3\'\5\'\u03f2\n\'\3\'\3\'\3\'\3"+
		"(\3(\3(\5(\u03fa\n(\3)\3)\3)\3*\3*\3*\3*\7*\u0403\n*\f*\16*\u0406\13*"+
		"\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0419\n.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3/\5/\u0424\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0439"+
		"\n\64\f\64\16\64\u043c\13\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\7\66\u0447\n\66\f\66\16\66\u044a\13\66\3\67\3\67\3\67\3\67\5\67\u0450"+
		"\n\67\38\38\38\38\38\78\u0457\n8\f8\168\u045a\138\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\59\u046c\n9\3:\3:\3:\3:\3:\3:\5:\u0474\n"+
		":\3:\3:\3:\3:\5:\u047a\n:\3;\3;\3;\5;\u047f\n;\3;\3;\3<\3<\3<\5<\u0486"+
		"\n<\3<\3<\3<\5<\u048b\n<\3<\3<\3=\3=\3=\3=\5=\u0493\n=\3=\3=\3=\5=\u0498"+
		"\n=\3=\3=\3>\3>\3>\5>\u049f\n>\3>\3>\3>\5>\u04a4\n>\3>\3>\3?\3?\3?\5?"+
		"\u04ab\n?\3?\3?\3?\5?\u04b0\n?\3?\3?\3@\3@\3@\5@\u04b7\n@\3@\3@\3@\3@"+
		"\3@\5@\u04be\n@\3@\3@\3A\3A\3A\5A\u04c5\nA\3A\3A\3B\3B\3B\5B\u04cc\nB"+
		"\3B\3B\3B\5B\u04d1\nB\3B\3B\3C\3C\3C\5C\u04d8\nC\3C\3C\3D\3D\3D\5D\u04df"+
		"\nD\3D\3D\3D\5D\u04e4\nD\3D\3D\3E\3E\3E\5E\u04eb\nE\3E\3E\3E\5E\u04f0"+
		"\nE\3E\3E\3E\3E\3E\5E\u04f7\nE\3F\3F\5F\u04fb\nF\3G\3G\3G\3G\3G\3G\5G"+
		"\u0503\nG\3G\3G\3H\3H\3H\3H\7H\u050b\nH\fH\16H\u050e\13H\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\5I\u0519\nI\3J\3J\3K\3K\5K\u051f\nK\3L\3L\3L\3L\3L\7L\u0526"+
		"\nL\fL\16L\u0529\13L\3L\3L\3M\3M\3M\3M\3N\3N\3O\3O\5O\u0535\nO\3P\3P\3"+
		"P\3P\7P\u053b\nP\fP\16P\u053e\13P\3P\3P\3P\5P\u0543\nP\3Q\3Q\3Q\5Q\u0548"+
		"\nQ\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\5T\u0556\nT\3U\3U\3V\3V\3V\3V"+
		"\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\7X\u0568\nX\fX\16X\u056b\13X\3Y\3Y\3Y\3"+
		"Y\7Y\u0571\nY\fY\16Y\u0574\13Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3]\3]\5]\u057f"+
		"\n]\3]\3]\5]\u0583\n]\3^\3^\5^\u0587\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\5_\u0595\n_\3`\3`\3`\3`\7`\u059b\n`\f`\16`\u059e\13`\3a\3a\3a\3"+
		"a\3a\3a\5a\u05a6\na\3b\3b\3b\3b\3c\3c\3c\3d\3d\5d\u05b1\nd\3d\3d\3d\5"+
		"d\u05b6\nd\3d\3d\3e\3e\3e\5e\u05bd\ne\3e\5e\u05c0\ne\3e\3e\3e\3e\5e\u05c6"+
		"\ne\3e\3e\3e\3e\3e\3f\3f\5f\u05cf\nf\3g\3g\3g\3g\5g\u05d5\ng\3h\3h\3h"+
		"\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3k\5k\u05e7\nk\3k\3k\5k\u05eb\nk"+
		"\3k\3k\5k\u05ef\nk\3k\3k\3k\5k\u05f4\nk\3l\3l\3l\3l\7l\u05fa\nl\fl\16"+
		"l\u05fd\13l\3m\3m\3m\3m\3m\5m\u0604\nm\3m\3m\5m\u0608\nm\3n\5n\u060b\n"+
		"n\3n\3n\3n\3n\5n\u0611\nn\3n\3n\5n\u0615\nn\3n\3n\3n\3n\3n\5n\u061c\n"+
		"n\3o\3o\3o\3p\3p\3p\3p\7p\u0625\np\fp\16p\u0628\13p\3q\3q\3q\3q\3r\3r"+
		"\3r\3r\7r\u0632\nr\fr\16r\u0635\13r\3s\3s\3s\3s\3s\3s\5s\u063d\ns\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\5s\u0670\ns\3t\3t\3t\3t\3t\7t\u0677\nt\ft\16t\u067a\13t\5t\u067c"+
		"\nt\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\7u\u068a\nu\fu\16u\u068d\13u\3"+
		"u\3u\3v\3v\3v\3v\3v\7v\u0696\nv\fv\16v\u0699\13v\3v\3v\3w\3w\3w\3w\3w"+
		"\7w\u06a2\nw\fw\16w\u06a5\13w\3w\3w\3x\3x\3x\3x\3x\7x\u06ae\nx\fx\16x"+
		"\u06b1\13x\3x\3x\3x\7x\u06b6\nx\fx\16x\u06b9\13x\5x\u06bb\nx\3x\3x\3x"+
		"\3x\7x\u06c1\nx\fx\16x\u06c4\13x\5x\u06c6\nx\3x\3x\3y\5y\u06cb\ny\3y\3"+
		"y\3y\3y\3y\5y\u06d2\ny\3y\3y\5y\u06d6\ny\3y\3y\5y\u06da\ny\3y\5y\u06dd"+
		"\ny\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u06ef\nz\3{\3{"+
		"\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0709\n\u0080\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082"+
		"\u0713\n\u0082\f\u0082\16\u0082\u0716\13\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u071c\n\u0083\f\u0083\16\u0083\u071f\13\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0727\n\u0084\3\u0085"+
		"\3\u0085\5\u0085\u072b\n\u0085\3\u0085\5\u0085\u072e\n\u0085\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u0733\n\u0085\3\u0085\5\u0085\u0736\n\u0085\3\u0085"+
		"\5\u0085\u0739\n\u0085\3\u0085\5\u0085\u073c\n\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u074c\n\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0755\n\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u075e\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\7\u008e\u0763\n\u008e\f\u008e\16\u008e\u0766\13\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u0770\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0776\n\u008f\5"+
		"\u008f\u0778\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u077e\n\u0090"+
		"\f\u0090\16\u0090\u0781\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0799\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u07a2\n\u0091\f\u0091\16\u0091\u07a5\13\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u07ae\n\u0091\f\u0091"+
		"\16\u0091\u07b1\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\7\u0091\u07ba\n\u0091\f\u0091\16\u0091\u07bd\13\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u07c5\n\u0091\f\u0091"+
		"\16\u0091\u07c8\13\u0091\3\u0091\3\u0091\5\u0091\u07cc\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u07e0\n\u0094\3\u0094\3\u0094\5\u0094\u07e4\n\u0094\3\u0095\3\u0095\3"+
		"\u0095\5\u0095\u07e9\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u07ef"+
		"\n\u0095\7\u0095\u07f1\n\u0095\f\u0095\16\u0095\u07f4\13\u0095\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u07ff\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c"+
		"\u0810\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0817\n"+
		"\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u081e\n\u009e\3"+
		"\u009f\3\u009f\5\u009f\u0822\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0840\n\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0847\n\u00a1\f\u00a1"+
		"\16\u00a1\u084a\13\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5\u00a2\u0850"+
		"\n\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c5"+
		"\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9"+
		"\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce"+
		"\3\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00db\3\u00db"+
		"\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e9"+
		"\3\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f6\3\u00f6"+
		"\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fb"+
		"\3\u00fb\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00ff\3\u00ff"+
		"\3\u0100\3\u0100\3\u0101\3\u0101\3\u0102\3\u0102\3\u0103\3\u0103\3\u0104"+
		"\3\u0104\3\u0105\3\u0105\3\u0106\3\u0106\3\u0107\3\u0107\3\u0108\3\u0108"+
		"\3\u0109\3\u0109\3\u010a\3\u010a\3\u010b\3\u010b\3\u010c\3\u010c\3\u010d"+
		"\3\u010d\3\u010e\3\u010e\3\u010f\3\u010f\3\u0110\3\u0110\3\u0111\3\u0111"+
		"\3\u0112\3\u0112\3\u0113\3\u0113\3\u0114\3\u0114\3\u0115\3\u0115\3\u0116"+
		"\3\u0116\3\u0117\3\u0117\3\u0118\3\u0118\3\u0119\3\u0119\3\u011a\3\u011a"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\5\u011b\u09d2"+
		"\n\u011b\3\u011b\2\2\u011c\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec"+
		"\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204"+
		"\u0206\u0208\u020a\u020c\u020e\u0210\u0212\u0214\u0216\u0218\u021a\u021c"+
		"\u021e\u0220\u0222\u0224\u0226\u0228\u022a\u022c\u022e\u0230\u0232\u0234"+
		"\2\7\3\2\u00a5\u00a6\4\2\24\24\26\26\3\2\u00ad\u00b1\3\2\u00a7\u00a8\4"+
		"\299\177\177\2\u0a73\2\u0237\3\2\2\2\4\u0247\3\2\2\2\6\u0254\3\2\2\2\b"+
		"\u0256\3\2\2\2\n\u027d\3\2\2\2\f\u027f\3\2\2\2\16\u0286\3\2\2\2\20\u0289"+
		"\3\2\2\2\22\u0293\3\2\2\2\24\u029f\3\2\2\2\26\u02b2\3\2\2\2\30\u02da\3"+
		"\2\2\2\32\u02dc\3\2\2\2\34\u02e9\3\2\2\2\36\u02f2\3\2\2\2 \u0301\3\2\2"+
		"\2\"\u030c\3\2\2\2$\u031a\3\2\2\2&\u0339\3\2\2\2(\u0340\3\2\2\2*\u0349"+
		"\3\2\2\2,\u034e\3\2\2\2.\u0350\3\2\2\2\60\u0361\3\2\2\2\62\u037c\3\2\2"+
		"\2\64\u037e\3\2\2\2\66\u038b\3\2\2\28\u0391\3\2\2\2:\u03af\3\2\2\2<\u03b1"+
		"\3\2\2\2>\u03bd\3\2\2\2@\u03c1\3\2\2\2B\u03ce\3\2\2\2D\u03da\3\2\2\2F"+
		"\u03dd\3\2\2\2H\u03e5\3\2\2\2J\u03ea\3\2\2\2L\u03ec\3\2\2\2N\u03f9\3\2"+
		"\2\2P\u03fb\3\2\2\2R\u03fe\3\2\2\2T\u0407\3\2\2\2V\u040b\3\2\2\2X\u040e"+
		"\3\2\2\2Z\u0413\3\2\2\2\\\u0423\3\2\2\2^\u0425\3\2\2\2`\u0428\3\2\2\2"+
		"b\u042d\3\2\2\2d\u0431\3\2\2\2f\u0434\3\2\2\2h\u043d\3\2\2\2j\u0440\3"+
		"\2\2\2l\u044b\3\2\2\2n\u0451\3\2\2\2p\u046b\3\2\2\2r\u046d\3\2\2\2t\u047b"+
		"\3\2\2\2v\u0482\3\2\2\2x\u048e\3\2\2\2z\u049b\3\2\2\2|\u04a7\3\2\2\2~"+
		"\u04b3\3\2\2\2\u0080\u04c1\3\2\2\2\u0082\u04c8\3\2\2\2\u0084\u04d4\3\2"+
		"\2\2\u0086\u04db\3\2\2\2\u0088\u04e7\3\2\2\2\u008a\u04f8\3\2\2\2\u008c"+
		"\u04fc\3\2\2\2\u008e\u0506\3\2\2\2\u0090\u0518\3\2\2\2\u0092\u051a\3\2"+
		"\2\2\u0094\u051e\3\2\2\2\u0096\u0520\3\2\2\2\u0098\u052c\3\2\2\2\u009a"+
		"\u0530\3\2\2\2\u009c\u0534\3\2\2\2\u009e\u0536\3\2\2\2\u00a0\u0544\3\2"+
		"\2\2\u00a2\u0549\3\2\2\2\u00a4\u054c\3\2\2\2\u00a6\u0555\3\2\2\2\u00a8"+
		"\u0557\3\2\2\2\u00aa\u0559\3\2\2\2\u00ac\u055d\3\2\2\2\u00ae\u0563\3\2"+
		"\2\2\u00b0\u056c\3\2\2\2\u00b2\u0575\3\2\2\2\u00b4\u0577\3\2\2\2\u00b6"+
		"\u0579\3\2\2\2\u00b8\u057c\3\2\2\2\u00ba\u0586\3\2\2\2\u00bc\u0588\3\2"+
		"\2\2\u00be\u0596\3\2\2\2\u00c0\u05a5\3\2\2\2\u00c2\u05a7\3\2\2\2\u00c4"+
		"\u05ab\3\2\2\2\u00c6\u05ae\3\2\2\2\u00c8\u05b9\3\2\2\2\u00ca\u05ce\3\2"+
		"\2\2\u00cc\u05d4\3\2\2\2\u00ce\u05d6\3\2\2\2\u00d0\u05db\3\2\2\2\u00d2"+
		"\u05e0\3\2\2\2\u00d4\u05e6\3\2\2\2\u00d6\u05f5\3\2\2\2\u00d8\u0607\3\2"+
		"\2\2\u00da\u060a\3\2\2\2\u00dc\u061d\3\2\2\2\u00de\u0620\3\2\2\2\u00e0"+
		"\u0629\3\2\2\2\u00e2\u062d\3\2\2\2\u00e4\u066f\3\2\2\2\u00e6\u0671\3\2"+
		"\2\2\u00e8\u067f\3\2\2\2\u00ea\u0690\3\2\2\2\u00ec\u069c\3\2\2\2\u00ee"+
		"\u06a8\3\2\2\2\u00f0\u06ca\3\2\2\2\u00f2\u06ee\3\2\2\2\u00f4\u06f0\3\2"+
		"\2\2\u00f6\u06f3\3\2\2\2\u00f8\u06f6\3\2\2\2\u00fa\u06f9\3\2\2\2\u00fc"+
		"\u06fd\3\2\2\2\u00fe\u0708\3\2\2\2\u0100\u070a\3\2\2\2\u0102\u070e\3\2"+
		"\2\2\u0104\u0717\3\2\2\2\u0106\u0726\3\2\2\2\u0108\u0728\3\2\2\2\u010a"+
		"\u073d\3\2\2\2\u010c\u0740\3\2\2\2\u010e\u0743\3\2\2\2\u0110\u074b\3\2"+
		"\2\2\u0112\u074d\3\2\2\2\u0114\u0751\3\2\2\2\u0116\u0756\3\2\2\2\u0118"+
		"\u0759\3\2\2\2\u011a\u075d\3\2\2\2\u011c\u0777\3\2\2\2\u011e\u0779\3\2"+
		"\2\2\u0120\u07cb\3\2\2\2\u0122\u07cd\3\2\2\2\u0124\u07d1\3\2\2\2\u0126"+
		"\u07e3\3\2\2\2\u0128\u07e8\3\2\2\2\u012a\u07fe\3\2\2\2\u012c\u0800\3\2"+
		"\2\2\u012e\u0802\3\2\2\2\u0130\u0804\3\2\2\2\u0132\u0806\3\2\2\2\u0134"+
		"\u0808\3\2\2\2\u0136\u080f\3\2\2\2\u0138\u0816\3\2\2\2\u013a\u081d\3\2"+
		"\2\2\u013c\u081f\3\2\2\2\u013e\u083f\3\2\2\2\u0140\u0841\3\2\2\2\u0142"+
		"\u084f\3\2\2\2\u0144\u0851\3\2\2\2\u0146\u0853\3\2\2\2\u0148\u0855\3\2"+
		"\2\2\u014a\u0857\3\2\2\2\u014c\u0859\3\2\2\2\u014e\u085b\3\2\2\2\u0150"+
		"\u085d\3\2\2\2\u0152\u085f\3\2\2\2\u0154\u0861\3\2\2\2\u0156\u0863\3\2"+
		"\2\2\u0158\u0865\3\2\2\2\u015a\u0867\3\2\2\2\u015c\u086a\3\2\2\2\u015e"+
		"\u086c\3\2\2\2\u0160\u086e\3\2\2\2\u0162\u0870\3\2\2\2\u0164\u0872\3\2"+
		"\2\2\u0166\u0875\3\2\2\2\u0168\u0877\3\2\2\2\u016a\u0879\3\2\2\2\u016c"+
		"\u087b\3\2\2\2\u016e\u087d\3\2\2\2\u0170\u087f\3\2\2\2\u0172\u0881\3\2"+
		"\2\2\u0174\u0883\3\2\2\2\u0176\u0885\3\2\2\2\u0178\u0887\3\2\2\2\u017a"+
		"\u0889\3\2\2\2\u017c\u088b\3\2\2\2\u017e\u088d\3\2\2\2\u0180\u088f\3\2"+
		"\2\2\u0182\u0891\3\2\2\2\u0184\u0893\3\2\2\2\u0186\u0895\3\2\2\2\u0188"+
		"\u0897\3\2\2\2\u018a\u0899\3\2\2\2\u018c\u089b\3\2\2\2\u018e\u089d\3\2"+
		"\2\2\u0190\u089f\3\2\2\2\u0192\u08a1\3\2\2\2\u0194\u08a3\3\2\2\2\u0196"+
		"\u08a5\3\2\2\2\u0198\u08a7\3\2\2\2\u019a\u08a9\3\2\2\2\u019c\u08ab\3\2"+
		"\2\2\u019e\u08ad\3\2\2\2\u01a0\u08af\3\2\2\2\u01a2\u08b1\3\2\2\2\u01a4"+
		"\u08b3\3\2\2\2\u01a6\u08b5\3\2\2\2\u01a8\u08b7\3\2\2\2\u01aa\u08b9\3\2"+
		"\2\2\u01ac\u08bb\3\2\2\2\u01ae\u08bd\3\2\2\2\u01b0\u08bf\3\2\2\2\u01b2"+
		"\u08c1\3\2\2\2\u01b4\u08c3\3\2\2\2\u01b6\u08c5\3\2\2\2\u01b8\u08c7\3\2"+
		"\2\2\u01ba\u08c9\3\2\2\2\u01bc\u08cb\3\2\2\2\u01be\u08cd\3\2\2\2\u01c0"+
		"\u08cf\3\2\2\2\u01c2\u08d1\3\2\2\2\u01c4\u08d3\3\2\2\2\u01c6\u08d5\3\2"+
		"\2\2\u01c8\u08d7\3\2\2\2\u01ca\u08d9\3\2\2\2\u01cc\u08db\3\2\2\2\u01ce"+
		"\u08dd\3\2\2\2\u01d0\u08df\3\2\2\2\u01d2\u08e1\3\2\2\2\u01d4\u08e3\3\2"+
		"\2\2\u01d6\u08e5\3\2\2\2\u01d8\u08e7\3\2\2\2\u01da\u08e9\3\2\2\2\u01dc"+
		"\u08eb\3\2\2\2\u01de\u08ed\3\2\2\2\u01e0\u08ef\3\2\2\2\u01e2\u08f1\3\2"+
		"\2\2\u01e4\u08f3\3\2\2\2\u01e6\u08f5\3\2\2\2\u01e8\u08f7\3\2\2\2\u01ea"+
		"\u08f9\3\2\2\2\u01ec\u08fb\3\2\2\2\u01ee\u08fd\3\2\2\2\u01f0\u08ff\3\2"+
		"\2\2\u01f2\u0901\3\2\2\2\u01f4\u0903\3\2\2\2\u01f6\u0905\3\2\2\2\u01f8"+
		"\u0907\3\2\2\2\u01fa\u0909\3\2\2\2\u01fc\u090b\3\2\2\2\u01fe\u090d\3\2"+
		"\2\2\u0200\u090f\3\2\2\2\u0202\u0911\3\2\2\2\u0204\u0913\3\2\2\2\u0206"+
		"\u0915\3\2\2\2\u0208\u0917\3\2\2\2\u020a\u0919\3\2\2\2\u020c\u091b\3\2"+
		"\2\2\u020e\u091d\3\2\2\2\u0210\u091f\3\2\2\2\u0212\u0921\3\2\2\2\u0214"+
		"\u0923\3\2\2\2\u0216\u0925\3\2\2\2\u0218\u0927\3\2\2\2\u021a\u0929\3\2"+
		"\2\2\u021c\u092b\3\2\2\2\u021e\u092d\3\2\2\2\u0220\u092f\3\2\2\2\u0222"+
		"\u0931\3\2\2\2\u0224\u0933\3\2\2\2\u0226\u0935\3\2\2\2\u0228\u0937\3\2"+
		"\2\2\u022a\u0939\3\2\2\2\u022c\u093b\3\2\2\2\u022e\u093d\3\2\2\2\u0230"+
		"\u093f\3\2\2\2\u0232\u0941\3\2\2\2\u0234\u09d1\3\2\2\2\u0236\u0238\5\4"+
		"\3\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239"+
		"\u023b\7\25\2\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3"+
		"\2\2\2\u023c\u023d\5\u021e\u0110\2\u023d\3\3\2\2\2\u023e\u0240\5\n\6\2"+
		"\u023f\u0241\7\25\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0243\5\6\4\2\u0243\u0246\3\2\2\2\u0244\u0246\5\b\5\2\u0245"+
		"\u023e\3\2\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u0252\3\2\2\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024f\5\n\6\2\u024b\u024d\7\25\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\5\6\4\2\u024f\u024c\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u0253\5\b\5\2\u0252\u024a\3\2"+
		"\2\2\u0252\u0251\3\2\2\2\u0253\5\3\2\2\2\u0254\u0255\7\n\2\2\u0255\7\3"+
		"\2\2\2\u0256\u0257\5\6\4\2\u0257\t\3\2\2\2\u0258\u027e\5\u00bc_\2\u0259"+
		"\u027e\5r:\2\u025a\u027e\5l\67\2\u025b\u027e\5Z.\2\u025c\u027e\5L\'\2"+
		"\u025d\u027e\5F$\2\u025e\u027e\5\u00b6\\\2\u025f\u027e\58\35\2\u0260\u027e"+
		"\5\60\31\2\u0261\u027e\5\u00c8e\2\u0262\u027e\5.\30\2\u0263\u027e\5$\23"+
		"\2\u0264\u027e\5\34\17\2\u0265\u027e\5\u0088E\2\u0266\u027e\5\"\22\2\u0267"+
		"\u027e\5\36\20\2\u0268\u027e\5\32\16\2\u0269\u027e\5\u00d4k\2\u026a\u027e"+
		"\5z>\2\u026b\u027e\5|?\2\u026c\u027e\5\u0086D\2\u026d\u027e\5\u0084C\2"+
		"\u026e\u027e\5x=\2\u026f\u027e\5\u0080A\2\u0270\u027e\5\u0082B\2\u0271"+
		"\u027e\5~@\2\u0272\u027e\5v<\2\u0273\u027e\5t;\2\u0274\u027e\5\24\13\2"+
		"\u0275\u027e\5\u00f0y\2\u0276\u027e\5\22\n\2\u0277\u027e\5\20\t\2\u0278"+
		"\u027e\5\f\7\2\u0279\u027e\5\u0108\u0085\2\u027a\u027e\5\u00c6d\2\u027b"+
		"\u027e\5\u00dan\2\u027c\u027e\5\u00c4c\2\u027d\u0258\3\2\2\2\u027d\u0259"+
		"\3\2\2\2\u027d\u025a\3\2\2\2\u027d\u025b\3\2\2\2\u027d\u025c\3\2\2\2\u027d"+
		"\u025d\3\2\2\2\u027d\u025e\3\2\2\2\u027d\u025f\3\2\2\2\u027d\u0260\3\2"+
		"\2\2\u027d\u0261\3\2\2\2\u027d\u0262\3\2\2\2\u027d\u0263\3\2\2\2\u027d"+
		"\u0264\3\2\2\2\u027d\u0265\3\2\2\2\u027d\u0266\3\2\2\2\u027d\u0267\3\2"+
		"\2\2\u027d\u0268\3\2\2\2\u027d\u0269\3\2\2\2\u027d\u026a\3\2\2\2\u027d"+
		"\u026b\3\2\2\2\u027d\u026c\3\2\2\2\u027d\u026d\3\2\2\2\u027d\u026e\3\2"+
		"\2\2\u027d\u026f\3\2\2\2\u027d\u0270\3\2\2\2\u027d\u0271\3\2\2\2\u027d"+
		"\u0272\3\2\2\2\u027d\u0273\3\2\2\2\u027d\u0274\3\2\2\2\u027d\u0275\3\2"+
		"\2\2\u027d\u0276\3\2\2\2\u027d\u0277\3\2\2\2\u027d\u0278\3\2\2\2\u027d"+
		"\u0279\3\2\2\2\u027d\u027a\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2"+
		"\2\2\u027e\13\3\2\2\2\u027f\u0280\5\u021c\u010f\2\u0280\u0281\5\26\f\2"+
		"\u0281\u0282\5\u01d6\u00ec\2\u0282\u0283\5\30\r\2\u0283\u0284\5\u019a"+
		"\u00ce\2\u0284\u0285\5\u0144\u00a3\2\u0285\r\3\2\2\2\u0286\u0287\5\u01c2"+
		"\u00e2\2\u0287\u0288\5\u0210\u0109\2\u0288\17\3\2\2\2\u0289\u028a\5\u01c2"+
		"\u00e2\2\u028a\u028e\5\u01ec\u00f7\2\u028b\u028c\5\u01d4\u00eb\2\u028c"+
		"\u028d\5\u0144\u00a3\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0292\5\u01ce\u00e8\2\u0291\u0290\3"+
		"\2\2\2\u0291\u0292\3\2\2\2\u0292\21\3\2\2\2\u0293\u0294\5\u01c2\u00e2"+
		"\2\u0294\u0298\5\26\f\2\u0295\u0296\5\u01d6\u00ec\2\u0296\u0297\5\30\r"+
		"\2\u0297\u0299\3\2\2\2\u0298\u0295\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029d"+
		"\3\2\2\2\u029a\u029b\5\u01d4\u00eb\2\u029b\u029c\5\u0144\u00a3\2\u029c"+
		"\u029e\3\2\2\2\u029d\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\23\3\2\2"+
		"\2\u029f\u02a0\5\u01a2\u00d2\2\u02a0\u02a1\5\26\f\2\u02a1\u02a2\5\u01d6"+
		"\u00ec\2\u02a2\u02a3\5\30\r\2\u02a3\u02a4\5\u01fe\u0100\2\u02a4\u02a5"+
		"\5\u0144\u00a3\2\u02a5\25\3\2\2\2\u02a6\u02a9\5\u0162\u00b2\2\u02a7\u02a9"+
		"\5\u0164\u00b3\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02b3\3"+
		"\2\2\2\u02aa\u02b3\5\u0168\u00b5\2\u02ab\u02b3\5\u0172\u00ba\2\u02ac\u02b3"+
		"\5\u0188\u00c5\2\u02ad\u02b3\5\u0192\u00ca\2\u02ae\u02b3\5\u0182\u00c2"+
		"\2\u02af\u02b3\5\u018c\u00c7\2\u02b0\u02b3\5\u01ca\u00e6\2\u02b1\u02b3"+
		"\5\u01ee\u00f8\2\u02b2\u02a8\3\2\2\2\u02b2\u02aa\3\2\2\2\u02b2\u02ab\3"+
		"\2\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b2\u02ae\3\2\2\2\u02b2"+
		"\u02af\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3\27\3\2\2"+
		"\2\u02b4\u02b5\5\u0162\u00b2\2\u02b5\u02b6\5\u01a0\u00d1\2\u02b6\u02db"+
		"\3\2\2\2\u02b7\u02b8\5\u0162\u00b2\2\u02b8\u02b9\5\u01a0\u00d1\2\u02b9"+
		"\u02ba\5\u01a6\u00d4\2\u02ba\u02bb\5\u01ba\u00de\2\u02bb\u02bc\5\u0136"+
		"\u009c\2\u02bc\u02db\3\2\2\2\u02bd\u02c1\5\u019e\u00d0\2\u02be\u02bf\5"+
		"\u0136\u009c\2\u02bf\u02c0\7\20\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02be\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\5\u0150\u00a9"+
		"\2\u02c4\u02db\3\2\2\2\u02c5\u02c6\5\u0162\u00b2\2\u02c6\u02c7\5\u01bc"+
		"\u00df\2\u02c7\u02db\3\2\2\2\u02c8\u02c9\5\u01ba\u00de\2\u02c9\u02ca\5"+
		"\u0136\u009c\2\u02ca\u02db\3\2\2\2\u02cb\u02cd\5\u01fa\u00fe\2\u02cc\u02cb"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d1\3\2\2\2\u02ce\u02cf\5\u0136\u009c"+
		"\2\u02cf\u02d0\7\20\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02db\5\u0138\u009d\2\u02d4\u02d5"+
		"\5\u0162\u00b2\2\u02d5\u02d6\5\u01ec\u00f7\2\u02d6\u02db\3\2\2\2\u02d7"+
		"\u02d8\5\u01ea\u00f6\2\u02d8\u02d9\5\u0144\u00a3\2\u02d9\u02db\3\2\2\2"+
		"\u02da\u02b4\3\2\2\2\u02da\u02b7\3\2\2\2\u02da\u02bd\3\2\2\2\u02da\u02c5"+
		"\3\2\2\2\u02da\u02c8\3\2\2\2\u02da\u02cc\3\2\2\2\u02da\u02d4\3\2\2\2\u02da"+
		"\u02d7\3\2\2\2\u02db\31\3\2\2\2\u02dc\u02dd\5\u0182\u00c2\2\u02dd\u02df"+
		"\5\u020e\u0108\2\u02de\u02e0\5\u00fa~\2\u02df\u02de\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\5\u0154\u00ab\2\u02e2\u02e3\5"+
		"\u021a\u010e\2\u02e3\u02e4\5\u01de\u00f0\2\u02e4\u02e7\5\u0130\u0099\2"+
		"\u02e5\u02e8\5\u01f8\u00fd\2\u02e6\u02e8\5\u01cc\u00e7\2\u02e7\u02e5\3"+
		"\2\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\33\3\2\2\2\u02e9"+
		"\u02ea\5\u0182\u00c2\2\u02ea\u02ec\5\u01ea\u00f6\2\u02eb\u02ed\5\u00fa"+
		"~\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f0\5\u0144\u00a3\2\u02ef\u02f1\5n8\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1"+
		"\3\2\2\2\u02f1\35\3\2\2\2\u02f2\u02f3\5\u0182\u00c2\2\u02f3\u02f5\5\u0206"+
		"\u0104\2\u02f4\u02f6\5\u00fa~\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2"+
		"\2\u02f6\u02fa\3\2\2\2\u02f7\u02f8\5\u0136\u009c\2\u02f8\u02f9\7\20\2"+
		"\2\u02f9\u02fb\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fd\5\u014c\u00a7\2\u02fd\u02fe\5\u0220\u0111\2\u02fe"+
		"\u02ff\5 \21\2\u02ff\u0300\5\u0222\u0112\2\u0300\37\3\2\2\2\u0301\u0302"+
		"\5\u013a\u009e\2\u0302\u0309\5\u013c\u009f\2\u0303\u0304\5\u0230\u0119"+
		"\2\u0304\u0305\5\u013a\u009e\2\u0305\u0306\5\u013c\u009f\2\u0306\u0308"+
		"\3\2\2\2\u0307\u0303\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a!\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\5\u0182"+
		"\u00c2\2\u030d\u030f\5\u0200\u0101\2\u030e\u0310\5\u00fa~\2\u030f\u030e"+
		"\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0314\3\2\2\2\u0311\u0312\5\u0136\u009c"+
		"\2\u0312\u0313\7\20\2\2\u0313\u0315\3\2\2\2\u0314\u0311\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\5\u0146\u00a4\2\u0317\u0318"+
		"\5\u0212\u010a\2\u0318\u0319\5\u0148\u00a5\2\u0319#\3\2\2\2\u031a\u031b"+
		"\5\u0182\u00c2\2\u031b\u031c\5\u01c8\u00e5\2\u031c\u031e\5\u0216\u010c"+
		"\2\u031d\u031f\5\u00fa~\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0323\3\2\2\2\u0320\u0321\5\u0136\u009c\2\u0321\u0322\7\20\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0320\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0326\5\u014a\u00a6\2\u0326\u0327\5\u016e\u00b8\2\u0327\u0328"+
		"\5\u01ee\u00f8\2\u0328\u0329\5\u0102\u0082\2\u0329\u032d\5\u019a\u00ce"+
		"\2\u032a\u032b\5\u0136\u009c\2\u032b\u032c\7\20\2\2\u032c\u032e\3\2\2"+
		"\2\u032d\u032a\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330"+
		"\5\u0138\u009d\2\u0330\u0332\5&\24\2\u0331\u0333\5\u00a4S\2\u0332\u0331"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0337\3\2\2\2\u0334\u0335\5\u021a\u010e"+
		"\2\u0335\u0336\5,\27\2\u0336\u0338\3\2\2\2\u0337\u0334\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338%\3\2\2\2\u0339\u033a\5\u0218\u010d\2\u033a\u033e\5(\25"+
		"\2\u033b\u033c\5\u016a\u00b6\2\u033c\u033d\5\u011e\u0090\2\u033d\u033f"+
		"\3\2\2\2\u033e\u033b\3\2\2\2\u033e\u033f\3\2\2\2\u033f\'\3\2\2\2\u0340"+
		"\u0346\5*\26\2\u0341\u0342\5\u016a\u00b6\2\u0342\u0343\5*\26\2\u0343\u0345"+
		"\3\2\2\2\u0344\u0341\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347)\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a\5\u013a"+
		"\u009e\2\u034a\u034b\5\u01b2\u00da\2\u034b\u034c\5\u01d0\u00e9\2\u034c"+
		"\u034d\5\u01d2\u00ea\2\u034d+\3\2\2\2\u034e\u034f\5\u008eH\2\u034f-\3"+
		"\2\2\2\u0350\u0351\5\u0182\u00c2\2\u0351\u0353\5\u01ba\u00de\2\u0352\u0354"+
		"\5\u00fa~\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2"+
		"\2\u0355\u0356\5\u0136\u009c\2\u0356\u0357\5\u021a\u010e\2\u0357\u0358"+
		"\5\u01e6\u00f4\2\u0358\u0359\7\u00ad\2\2\u0359\u035a\5\u0224\u0113\2\u035a"+
		"\u035b\5\u00be`\2\u035b\u035f\5\u0226\u0114\2\u035c\u035d\5\u016a\u00b6"+
		"\2\u035d\u035e\5\u00c2b\2\u035e\u0360\3\2\2\2\u035f\u035c\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360/\3\2\2\2\u0361\u0363\5\u0182\u00c2\2\u0362\u0364"+
		"\5D#\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0367\5\u019e\u00d0\2\u0366\u0368\5\u00fa~\2\u0367\u0366\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036c\3\2\2\2\u0369\u036a\5\u0136\u009c\2\u036a\u036b"+
		"\7\20\2\2\u036b\u036d\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036d\3\2\2\2"+
		"\u036d\u036e\3\2\2\2\u036e\u036f\5\u0150\u00a9\2\u036f\u0371\5\u0220\u0111"+
		"\2\u0370\u0372\5\64\33\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0374\5\u0222\u0112\2\u0374\u0375\5\66\34\2\u0375"+
		"\u0376\5\u01e8\u00f5\2\u0376\u0377\5\u013c\u009f\2\u0377\u0378\5\u01be"+
		"\u00e0\2\u0378\u0379\5\u0152\u00aa\2\u0379\u037a\5\u016e\u00b8\2\u037a"+
		"\u037b\5\62\32\2\u037b\61\3\2\2\2\u037c\u037d\t\2\2\2\u037d\63\3\2\2\2"+
		"\u037e\u0384\5\u015a\u00ae\2\u037f\u0380\5\u0230\u0119\2\u0380\u0381\5"+
		"\u015a\u00ae\2\u0381\u0383\3\2\2\2\u0382\u037f\3\2\2\2\u0383\u0386\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\65\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0387\u038c\5\u017a\u00be\2\u0388\u0389\5\u01e8\u00f5\2\u0389"+
		"\u038a\5\u01d2\u00ea\2\u038a\u038c\3\2\2\2\u038b\u0387\3\2\2\2\u038b\u0388"+
		"\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\5\u01d6\u00ec\2\u038e\u038f\5"+
		"\u01d2\u00ea\2\u038f\u0390\5\u01ac\u00d7\2\u0390\67\3\2\2\2\u0391\u0393"+
		"\5\u0182\u00c2\2\u0392\u0394\5D#\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0397\5\u0160\u00b1\2\u0396\u0398\5\u00fa"+
		"~\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039c\3\2\2\2\u0399"+
		"\u039a\5\u0136\u009c\2\u039a\u039b\7\20\2\2\u039b\u039d\3\2\2\2\u039c"+
		"\u0399\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\5\u014e"+
		"\u00a8\2\u039f\u03a0\5\u0220\u0111\2\u03a0\u03a1\5\u013c\u009f\2\u03a1"+
		"\u03a2\5\u0222\u0112\2\u03a2\u03a3\5\u01f2\u00fa\2\u03a3\u03a4\5\u0150"+
		"\u00a9\2\u03a4\u03a5\5\u01f6\u00fc\2\u03a5\u03a6\5\u013c\u009f\2\u03a6"+
		"\u03a7\5\u0198\u00cd\2\u03a7\u03a8\5\u0150\u00a9\2\u03a8\u03a9\5\u01aa"+
		"\u00d6\2\u03a9\u03aa\5:\36\2\u03aa9\3\2\2\2\u03ab\u03b0\5\u012a\u0096"+
		"\2\u03ac\u03b0\5B\"\2\u03ad\u03b0\5@!\2\u03ae\u03b0\5<\37\2\u03af\u03ab"+
		"\3\2\2\2\u03af\u03ac\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03ae\3\2\2\2\u03b0"+
		";\3\2\2\2\u03b1\u03b2\5\u0224\u0113\2\u03b2\u03b8\5> \2\u03b3\u03b4\5"+
		"\u0230\u0119\2\u03b4\u03b5\5> \2\u03b5\u03b7\3\2\2\2\u03b6\u03b3\3\2\2"+
		"\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb"+
		"\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\5\u0226\u0114\2\u03bc=\3\2\2"+
		"\2\u03bd\u03be\5\u0158\u00ad\2\u03be\u03bf\7\13\2\2\u03bf\u03c0\5:\36"+
		"\2\u03c0?\3\2\2\2\u03c1\u03c2\5\u0220\u0111\2\u03c2\u03c9\5B\"\2\u03c3"+
		"\u03c4\5\u0230\u0119\2\u03c4\u03c5\5\u012a\u0096\2\u03c5\u03c8\3\2\2\2"+
		"\u03c6\u03c8\5B\"\2\u03c7\u03c3\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cc\u03cd\5\u0222\u0112\2\u03cdA\3\2\2\2\u03ce\u03cf"+
		"\5\u0220\u0111\2\u03cf\u03d5\5\u012a\u0096\2\u03d0\u03d1\5\u0230\u0119"+
		"\2\u03d1\u03d2\5\u012a\u0096\2\u03d2\u03d4\3\2\2\2\u03d3\u03d0\3\2\2\2"+
		"\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03d9\5\u0222\u0112\2\u03d9C\3\2\2"+
		"\2\u03da\u03db\5\u01da\u00ee\2\u03db\u03dc\5\u01e4\u00f3\2\u03dcE\3\2"+
		"\2\2\u03dd\u03de\5\u0168\u00b5\2\u03de\u03df\5\u020e\u0108\2\u03df\u03e0"+
		"\5\u0154\u00ab\2\u03e0\u03e1\5\u021a\u010e\2\u03e1\u03e3\5H%\2\u03e2\u03e4"+
		"\5J&\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4G\3\2\2\2\u03e5\u03e6"+
		"\5\u01de\u00f0\2\u03e6\u03e7\5\u0130\u0099\2\u03e7I\3\2\2\2\u03e8\u03eb"+
		"\5\u01f8\u00fd\2\u03e9\u03eb\5\u01cc\u00e7\2\u03ea\u03e8\3\2\2\2\u03ea"+
		"\u03e9\3\2\2\2\u03ebK\3\2\2\2\u03ec\u03ed\5\u0168\u00b5\2\u03ed\u03f1"+
		"\5\u0206\u0104\2\u03ee\u03ef\5\u0136\u009c\2\u03ef\u03f0\7\20\2\2\u03f0"+
		"\u03f2\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2"+
		"\2\2\u03f3\u03f4\5\u014c\u00a7\2\u03f4\u03f5\5N(\2\u03f5M\3\2\2\2\u03f6"+
		"\u03fa\5X-\2\u03f7\u03fa\5V,\2\u03f8\u03fa\5P)\2\u03f9\u03f6\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03f9\u03f8\3\2\2\2\u03faO\3\2\2\2\u03fb\u03fc\5\u01e2"+
		"\u00f2\2\u03fc\u03fd\5R*\2\u03fdQ\3\2\2\2\u03fe\u0404\5T+\2\u03ff\u0400"+
		"\5\u016a\u00b6\2\u0400\u0401\5T+\2\u0401\u0403\3\2\2\2\u0402\u03ff\3\2"+
		"\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405"+
		"S\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u0408\5\u013a\u009e\2\u0408\u0409"+
		"\5\u01fe\u0100\2\u0409\u040a\5\u013a\u009e\2\u040aU\3\2\2\2\u040b\u040c"+
		"\5\u015e\u00b0\2\u040c\u040d\5 \21\2\u040dW\3\2\2\2\u040e\u040f\5\u0168"+
		"\u00b5\2\u040f\u0410\5\u013a\u009e\2\u0410\u0411\5\u0206\u0104\2\u0411"+
		"\u0412\5\u013c\u009f\2\u0412Y\3\2\2\2\u0413\u0414\5\u0168\u00b5\2\u0414"+
		"\u0418\5\u01fa\u00fe\2\u0415\u0416\5\u0136\u009c\2\u0416\u0417\7\20\2"+
		"\2\u0417\u0419\3\2\2\2\u0418\u0415\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u041b\5\u0138\u009d\2\u041b\u041c\5\\/\2\u041c[\3\2\2\2"+
		"\u041d\u0424\5h\65\2\u041e\u0424\5d\63\2\u041f\u0424\5d\63\2\u0420\u0424"+
		"\5b\62\2\u0421\u0424\5`\61\2\u0422\u0424\5^\60\2\u0423\u041d\3\2\2\2\u0423"+
		"\u041e\3\2\2\2\u0423\u041f\3\2\2\2\u0423\u0420\3\2\2\2\u0423\u0421\3\2"+
		"\2\2\u0423\u0422\3\2\2\2\u0424]\3\2\2\2\u0425\u0426\5\u021a\u010e\2\u0426"+
		"\u0427\5\u008eH\2\u0427_\3\2\2\2\u0428\u0429\5\u01e2\u00f2\2\u0429\u042a"+
		"\5\u013a\u009e\2\u042a\u042b\5\u01fe\u0100\2\u042b\u042c\5\u013a\u009e"+
		"\2\u042ca\3\2\2\2\u042d\u042e\5\u018c\u00c7\2\u042e\u042f\5\u017e\u00c0"+
		"\2\u042f\u0430\5\u01f4\u00fb\2\u0430c\3\2\2\2\u0431\u0432\5\u018c\u00c7"+
		"\2\u0432\u0433\5f\64\2\u0433e\3\2\2\2\u0434\u043a\5\u013a\u009e\2\u0435"+
		"\u0436\5\u0230\u0119\2\u0436\u0437\5\u013a\u009e\2\u0437\u0439\3\2\2\2"+
		"\u0438\u0435\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043bg\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\5\u015e\u00b0"+
		"\2\u043e\u043f\5j\66\2\u043fi\3\2\2\2\u0440\u0441\5\u013a\u009e\2\u0441"+
		"\u0448\5\u013c\u009f\2\u0442\u0443\5\u0230\u0119\2\u0443\u0444\5\u013a"+
		"\u009e\2\u0444\u0445\5\u013c\u009f\2\u0445\u0447\3\2\2\2\u0446\u0442\3"+
		"\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"k\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\5\u0168\u00b5\2\u044c\u044d"+
		"\5\u01ea\u00f6\2\u044d\u044f\5\u0144\u00a3\2\u044e\u0450\5n8\2\u044f\u044e"+
		"\3\2\2\2\u044f\u0450\3\2\2\2\u0450m\3\2\2\2\u0451\u0452\5\u021a\u010e"+
		"\2\u0452\u0458\5p9\2\u0453\u0454\5\u016a\u00b6\2\u0454\u0455\5p9\2\u0455"+
		"\u0457\3\2\2\2\u0456\u0453\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2"+
		"\2\2\u0458\u0459\3\2\2\2\u0459o\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u045c"+
		"\5\u01de\u00f0\2\u045c\u045d\7\u00ad\2\2\u045d\u045e\5\u0130\u0099\2\u045e"+
		"\u046c\3\2\2\2\u045f\u0460\5\u01c6\u00e4\2\u0460\u0461\7\u00ad\2\2\u0461"+
		"\u0462\5\u0132\u009a\2\u0462\u046c\3\2\2\2\u0463\u0464\5\u01f8\u00fd\2"+
		"\u0464\u0465\7\u00ad\2\2\u0465\u0466\5\u0132\u009a\2\u0466\u046c\3\2\2"+
		"\2\u0467\u0468\5\u01d8\u00ed\2\u0468\u0469\7\u00ad\2\2\u0469\u046a\5\u0096"+
		"L\2\u046a\u046c\3\2\2\2\u046b\u045b\3\2\2\2\u046b\u045f\3\2\2\2\u046b"+
		"\u0463\3\2\2\2\u046b\u0467\3\2\2\2\u046cq\3\2\2\2\u046d\u046e\5\u0168"+
		"\u00b5\2\u046e\u046f\5\u01c8\u00e5\2\u046f\u0473\5\u0216\u010c\2\u0470"+
		"\u0471\5\u0136\u009c\2\u0471\u0472\7\20\2\2\u0472\u0474\3\2\2\2\u0473"+
		"\u0470\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0479\5\u014a"+
		"\u00a6\2\u0476\u0477\5\u021a\u010e\2\u0477\u0478\5\u008eH\2\u0478\u047a"+
		"\3\2\2\2\u0479\u0476\3\2\2\2\u0479\u047a\3\2\2\2\u047as\3\2\2\2\u047b"+
		"\u047c\5\u018c\u00c7\2\u047c\u047e\5\u020e\u0108\2\u047d\u047f\5\u00fc"+
		"\177\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\5\u0154\u00ab\2\u0481u\3\2\2\2\u0482\u0483\5\u018c\u00c7\2\u0483"+
		"\u0485\5\u0206\u0104\2\u0484\u0486\5\u00fc\177\2\u0485\u0484\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u048a\3\2\2\2\u0487\u0488\5\u0136\u009c\2\u0488\u0489"+
		"\7\20\2\2\u0489\u048b\3\2\2\2\u048a\u0487\3\2\2\2\u048a\u048b\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u048d\5\u014c\u00a7\2\u048dw\3\2\2\2\u048e"+
		"\u048f\5\u018c\u00c7\2\u048f\u0490\5\u01c8\u00e5\2\u0490\u0492\5\u0216"+
		"\u010c\2\u0491\u0493\5\u00fc\177\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0497\3\2\2\2\u0494\u0495\5\u0136\u009c\2\u0495\u0496\7\20"+
		"\2\2\u0496\u0498\3\2\2\2\u0497\u0494\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u049a\5\u014a\u00a6\2\u049ay\3\2\2\2\u049b\u049c"+
		"\5\u018c\u00c7\2\u049c\u049e\5\u0160\u00b1\2\u049d\u049f\5\u00fc\177\2"+
		"\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a3\3\2\2\2\u04a0\u04a1"+
		"\5\u0136\u009c\2\u04a1\u04a2\7\20\2\2\u04a2\u04a4\3\2\2\2\u04a3\u04a0"+
		"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\5\u014e\u00a8"+
		"\2\u04a6{\3\2\2\2\u04a7\u04a8\5\u018c\u00c7\2\u04a8\u04aa\5\u019e\u00d0"+
		"\2\u04a9\u04ab\5\u00fc\177\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04af\3\2\2\2\u04ac\u04ad\5\u0136\u009c\2\u04ad\u04ae\7\20\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u04ac\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2"+
		"\2\2\u04b1\u04b2\5\u0150\u00a9\2\u04b2}\3\2\2\2\u04b3\u04b4\5\u018c\u00c7"+
		"\2\u04b4\u04b6\5\u0200\u0101\2\u04b5\u04b7\5\u00fc\177\2\u04b6\u04b5\3"+
		"\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\5\u0146\u00a4"+
		"\2\u04b9\u04bd\5\u01d6\u00ec\2\u04ba\u04bb\5\u0136\u009c\2\u04bb\u04bc"+
		"\7\20\2\2\u04bc\u04be\3\2\2\2\u04bd\u04ba\3\2\2\2\u04bd\u04be\3\2\2\2"+
		"\u04be\u04bf\3\2\2\2\u04bf\u04c0\5\u0138\u009d\2\u04c0\177\3\2\2\2\u04c1"+
		"\u04c2\5\u018c\u00c7\2\u04c2\u04c4\5\u01ea\u00f6\2\u04c3\u04c5\5\u00fc"+
		"\177\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c7\5\u0144\u00a3\2\u04c7\u0081\3\2\2\2\u04c8\u04c9\5\u018c\u00c7\2"+
		"\u04c9\u04cb\5\u01fa\u00fe\2\u04ca\u04cc\5\u00fc\177\2\u04cb\u04ca\3\2"+
		"\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d0\3\2\2\2\u04cd\u04ce\5\u0136\u009c"+
		"\2\u04ce\u04cf\7\20\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04cd\3\2\2\2\u04d0"+
		"\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\5\u0138\u009d\2\u04d3\u0083"+
		"\3\2\2\2\u04d4\u04d5\5\u018c\u00c7\2\u04d5\u04d7\5\u01ba\u00de\2\u04d6"+
		"\u04d8\5\u00fc\177\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04da\5\u0136\u009c\2\u04da\u0085\3\2\2\2\u04db\u04dc\5"+
		"\u018c\u00c7\2\u04dc\u04de\5\u01a8\u00d5\2\u04dd\u04df\5\u00fc\177\2\u04de"+
		"\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e3\3\2\2\2\u04e0\u04e1\5\u0136"+
		"\u009c\2\u04e1\u04e2\7\20\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04e0\3\2\2\2"+
		"\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5\u00caf\2\u04e6"+
		"\u0087\3\2\2\2\u04e7\u04e8\5\u0182\u00c2\2\u04e8\u04ea\5\u01fa\u00fe\2"+
		"\u04e9\u04eb\5\u00fa~\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ef\3\2\2\2\u04ec\u04ed\5\u0136\u009c\2\u04ed\u04ee\7\20\2\2\u04ee"+
		"\u04f0\3\2\2\2\u04ef\u04ec\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\3\2"+
		"\2\2\u04f1\u04f2\5\u0138\u009d\2\u04f2\u04f3\5\u0220\u0111\2\u04f3\u04f4"+
		"\5\u009eP\2\u04f4\u04f6\5\u0222\u0112\2\u04f5\u04f7\5\u008aF\2\u04f6\u04f5"+
		"\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u0089\3\2\2\2\u04f8\u04fa\5\u021a\u010e"+
		"\2\u04f9\u04fb\5\u008eH\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u008b\3\2\2\2\u04fc\u04fd\5\u017c\u00bf\2\u04fd\u04fe\5\u01dc\u00ef\2"+
		"\u04fe\u04ff\5\u0178\u00bd\2\u04ff\u0500\5\u0220\u0111\2\u0500\u0502\5"+
		"\u013a\u009e\2\u0501\u0503\5\u0142\u00a2\2\u0502\u0501\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\5\u0222\u0112\2\u0505\u008d\3"+
		"\2\2\2\u0506\u050c\5\u0090I\2\u0507\u0508\5\u016a\u00b6\2\u0508\u0509"+
		"\5\u0090I\2\u0509\u050b\3\2\2\2\u050a\u0507\3\2\2\2\u050b\u050e\3\2\2"+
		"\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u008f\3\2\2\2\u050e\u050c"+
		"\3\2\2\2\u050f\u0510\5\u0092J\2\u0510\u0511\7\u00ad\2\2\u0511\u0512\5"+
		"\u0094K\2\u0512\u0519\3\2\2\2\u0513\u0514\5\u0092J\2\u0514\u0515\7\u00ad"+
		"\2\2\u0515\u0516\5\u0096L\2\u0516\u0519\3\2\2\2\u0517\u0519\5\u008cG\2"+
		"\u0518\u050f\3\2\2\2\u0518\u0513\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u0091"+
		"\3\2\2\2\u051a\u051b\5\u0234\u011b\2\u051b\u0093\3\2\2\2\u051c\u051f\5"+
		"\u0130\u0099\2\u051d\u051f\5\u012e\u0098\2\u051e\u051c\3\2\2\2\u051e\u051d"+
		"\3\2\2\2\u051f\u0095\3\2\2\2\u0520\u0521\5\u0224\u0113\2\u0521\u0527\5"+
		"\u0098M\2\u0522\u0523\5\u0230\u0119\2\u0523\u0524\5\u0098M\2\u0524\u0526"+
		"\3\2\2\2\u0525\u0522\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u052a\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u052b\5\u0226"+
		"\u0114\2\u052b\u0097\3\2\2\2\u052c\u052d\5\u009aN\2\u052d\u052e\7\13\2"+
		"\2\u052e\u052f\5\u009cO\2\u052f\u0099\3\2\2\2\u0530\u0531\5\u0130\u0099"+
		"\2\u0531\u009b\3\2\2\2\u0532\u0535\5\u0130\u0099\2\u0533\u0535\5\u012e"+
		"\u0098\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535\u009d\3\2\2\2\u0536"+
		"\u053c\5\u00a0Q\2\u0537\u0538\5\u0230\u0119\2\u0538\u0539\5\u00a0Q\2\u0539"+
		"\u053b\3\2\2\2\u053a\u0537\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2"+
		"\2\2\u053c\u053d\3\2\2\2\u053d\u0542\3\2\2\2\u053e\u053c\3\2\2\2\u053f"+
		"\u0540\5\u0230\u0119\2\u0540\u0541\5\u00a4S\2\u0541\u0543\3\2\2\2\u0542"+
		"\u053f\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u009f\3\2\2\2\u0544\u0545\5\u013a"+
		"\u009e\2\u0545\u0547\5\u013c\u009f\2\u0546\u0548\5\u00a2R\2\u0547\u0546"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u00a1\3\2\2\2\u0549\u054a\5\u01e0\u00f1"+
		"\2\u054a\u054b\5\u01b6\u00dc\2\u054b\u00a3\3\2\2\2\u054c\u054d\5\u01e0"+
		"\u00f1\2\u054d\u054e\5\u01b6\u00dc\2\u054e\u054f\5\u0220\u0111\2\u054f"+
		"\u0550\5\u00a6T\2\u0550\u0551\5\u0222\u0112\2\u0551\u00a5\3\2\2\2\u0552"+
		"\u0556\5\u00a8U\2\u0553\u0556\5\u00aaV\2\u0554\u0556\5\u00acW\2\u0555"+
		"\u0552\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0554\3\2\2\2\u0556\u00a7\3\2"+
		"\2\2\u0557\u0558\5\u013a\u009e\2\u0558\u00a9\3\2\2\2\u0559\u055a\5\u00b2"+
		"Z\2\u055a\u055b\5\u0230\u0119\2\u055b\u055c\5\u00b0Y\2\u055c\u00ab\3\2"+
		"\2\2\u055d\u055e\5\u0220\u0111\2\u055e\u055f\5\u00aeX\2\u055f\u0560\5"+
		"\u0222\u0112\2\u0560\u0561\5\u0230\u0119\2\u0561\u0562\5\u00b0Y\2\u0562"+
		"\u00ad\3\2\2\2\u0563\u0569\5\u00b2Z\2\u0564\u0565\5\u0230\u0119\2\u0565"+
		"\u0566\5\u00b2Z\2\u0566\u0568\3\2\2\2\u0567\u0564\3\2\2\2\u0568\u056b"+
		"\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u00af\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056c\u0572\5\u00b4[\2\u056d\u056e\5\u0230\u0119\2\u056e"+
		"\u056f\5\u00b4[\2\u056f\u0571\3\2\2\2\u0570\u056d\3\2\2\2\u0571\u0574"+
		"\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u00b1\3\2\2\2\u0574"+
		"\u0572\3\2\2\2\u0575\u0576\5\u013a\u009e\2\u0576\u00b3\3\2\2\2\u0577\u0578"+
		"\5\u013a\u009e\2\u0578\u00b5\3\2\2\2\u0579\u057a\5\u016c\u00b7\2\u057a"+
		"\u057b\5\u0174\u00bb\2\u057b\u00b7\3\2\2\2\u057c\u057e\5\u0176\u00bc\2"+
		"\u057d\u057f\5\u00ba^\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u0580\3\2\2\2\u0580\u0582\5\u0174\u00bb\2\u0581\u0583\5\u00f8}\2\u0582"+
		"\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u00b9\3\2\2\2\u0584\u0587\5\u01c4"+
		"\u00e3\2\u0585\u0587\5\u0208\u0105\2\u0586\u0584\3\2\2\2\u0586\u0585\3"+
		"\2\2\2\u0587\u00bb\3\2\2\2\u0588\u0589\5\u0168\u00b5\2\u0589\u058a\5\u01ba"+
		"\u00de\2\u058a\u058b\5\u0136\u009c\2\u058b\u058c\5\u021a\u010e\2\u058c"+
		"\u058d\5\u01e6\u00f4\2\u058d\u058e\7\u00ad\2\2\u058e\u058f\5\u0224\u0113"+
		"\2\u058f\u0590\5\u00be`\2\u0590\u0594\5\u0226\u0114\2\u0591\u0592\5\u016a"+
		"\u00b6\2\u0592\u0593\5\u00c2b\2\u0593\u0595\3\2\2\2\u0594\u0591\3\2\2"+
		"\2\u0594\u0595\3\2\2\2\u0595\u00bd\3\2\2\2\u0596\u059c\5\u00c0a\2\u0597"+
		"\u0598\5\u0230\u0119\2\u0598\u0599\5\u00c0a\2\u0599\u059b\3\2\2\2\u059a"+
		"\u0597\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2"+
		"\2\2\u059d\u00bf\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a0\7\u00a6\2\2\u05a0"+
		"\u05a1\7\13\2\2\u05a1\u05a6\7\u00a6\2\2\u05a2\u05a3\7\u00a6\2\2\u05a3"+
		"\u05a4\7\13\2\2\u05a4\u05a6\7\u00a7\2\2\u05a5\u059f\3\2\2\2\u05a5\u05a2"+
		"\3\2\2\2\u05a6\u00c1\3\2\2\2\u05a7\u05a8\5\u018e\u00c8\2\u05a8\u05a9\7"+
		"\u00ad\2\2\u05a9\u05aa\5\u0132\u009a\2\u05aa\u00c3\3\2\2\2\u05ab\u05ac"+
		"\5\u020c\u0107\2\u05ac\u05ad\5\u0136\u009c\2\u05ad\u00c5\3\2\2\2\u05ae"+
		"\u05b0\5\u0202\u0102\2\u05af\u05b1\5\u01fa\u00fe\2\u05b0\u05af\3\2\2\2"+
		"\u05b0\u05b1\3\2\2\2\u05b1\u05b5\3\2\2\2\u05b2\u05b3\5\u0136\u009c\2\u05b3"+
		"\u05b4\7\20\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b2\3\2\2\2\u05b5\u05b6\3"+
		"\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\5\u0138\u009d\2\u05b8\u00c7\3\2"+
		"\2\2\u05b9\u05ba\5\u0182\u00c2\2\u05ba\u05bc\5\u01a8\u00d5\2\u05bb\u05bd"+
		"\5\u00fa~\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2"+
		"\2\u05be\u05c0\5\u00caf\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c1\3\2\2\2\u05c1\u05c5\5\u01d6\u00ec\2\u05c2\u05c3\5\u0136\u009c\2"+
		"\u05c3\u05c4\7\20\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c2\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\5\u0138\u009d\2\u05c8\u05c9\5"+
		"\u0220\u0111\2\u05c9\u05ca\5\u00ccg\2\u05ca\u05cb\5\u0222\u0112\2\u05cb"+
		"\u00c9\3\2\2\2\u05cc\u05cf\5\u0234\u011b\2\u05cd\u05cf\5\u0130\u0099\2"+
		"\u05ce\u05cc\3\2\2\2\u05ce\u05cd\3\2\2\2\u05cf\u00cb\3\2\2\2\u05d0\u05d5"+
		"\5\u013a\u009e\2\u05d1\u05d5\5\u00ceh\2\u05d2\u05d5\5\u00d0i\2\u05d3\u05d5"+
		"\5\u00d2j\2\u05d4\u05d0\3\2\2\2\u05d4\u05d1\3\2\2\2\u05d4\u05d2\3\2\2"+
		"\2\u05d4\u05d3\3\2\2\2\u05d5\u00cd\3\2\2\2\u05d6\u05d7\5\u01b8\u00dd\2"+
		"\u05d7\u05d8\5\u0220\u0111\2\u05d8\u05d9\5\u013a\u009e\2\u05d9\u05da\5"+
		"\u0222\u0112\2\u05da\u00cf\3\2\2\2\u05db\u05dc\5\u0190\u00c9\2\u05dc\u05dd"+
		"\5\u0220\u0111\2\u05dd\u05de\5\u013a\u009e\2\u05de\u05df\5\u0222\u0112"+
		"\2\u05df\u00d1\3\2\2\2\u05e0\u05e1\5\u019c\u00cf\2\u05e1\u05e2\5\u0220"+
		"\u0111\2\u05e2\u05e3\5\u013a\u009e\2\u05e3\u05e4\5\u0222\u0112\2\u05e4"+
		"\u00d3\3\2\2\2\u05e5\u05e7\5\u00b8]\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ea\5\u0184\u00c3\2\u05e9\u05eb\5"+
		"\u00d6l\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2"+
		"\u05ec\u05ee\5\u010e\u0088\2\u05ed\u05ef\5\u00f8}\2\u05ee\u05ed\3\2\2"+
		"\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f3\5\u0116\u008c\2"+
		"\u05f1\u05f4\5\u00fc\177\2\u05f2\u05f4\5\u00dco\2\u05f3\u05f1\3\2\2\2"+
		"\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u00d5\3\2\2\2\u05f5\u05fb"+
		"\5\u00d8m\2\u05f6\u05f7\5\u0230\u0119\2\u05f7\u05f8\5\u00d8m\2\u05f8\u05fa"+
		"\3\2\2\2\u05f9\u05f6\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u00d7\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0608\5\u0234"+
		"\u011b\2\u05ff\u0600\5\u0234\u011b\2\u0600\u0603\7\7\2\2\u0601\u0604\5"+
		"\u0130\u0099\2\u0602\u0604\5\u012c\u0097\2\u0603\u0601\3\2\2\2\u0603\u0602"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\7\b\2\2\u0606\u0608\3\2\2\2\u0607"+
		"\u05fe\3\2\2\2\u0607\u05ff\3\2\2\2\u0608\u00d9\3\2\2\2\u0609\u060b\5\u00b8"+
		"]\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c"+
		"\u0610\5\u020a\u0106\2\u060d\u060e\5\u0136\u009c\2\u060e\u060f\7\20\2"+
		"\2\u060f\u0611\3\2\2\2\u0610\u060d\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612"+
		"\3\2\2\2\u0612\u0614\5\u0138\u009d\2\u0613\u0615\5\u00f2z\2\u0614\u0613"+
		"\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\5\u01f0\u00f9"+
		"\2\u0617\u0618\5\u00e2r\2\u0618\u061b\5\u0116\u008c\2\u0619\u061c\5\u00fc"+
		"\177\2\u061a\u061c\5\u00dco\2\u061b\u0619\3\2\2\2\u061b\u061a\3\2\2\2"+
		"\u061b\u061c\3\2\2\2\u061c\u00db\3\2\2\2\u061d\u061e\5\u01a4\u00d3\2\u061e"+
		"\u061f\5\u00dep\2\u061f\u00dd\3\2\2\2\u0620\u0626\5\u00e0q\2\u0621\u0622"+
		"\5\u016a\u00b6\2\u0622\u0623\5\u00e0q\2\u0623\u0625\3\2\2\2\u0624\u0621"+
		"\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627"+
		"\u00df\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u062a\5\u0234\u011b\2\u062a\u062b"+
		"\7\u00ad\2\2\u062b\u062c\5\u012a\u0096\2\u062c\u00e1\3\2\2\2\u062d\u0633"+
		"\5\u00e4s\2\u062e\u062f\5\u0230\u0119\2\u062f\u0630\5\u00e4s\2\u0630\u0632"+
		"\3\2\2\2\u0631\u062e\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631\3\2\2\2\u0633"+
		"\u0634\3\2\2\2\u0634\u00e3\3\2\2\2\u0635\u0633\3\2\2\2\u0636\u0637\5\u0234"+
		"\u011b\2\u0637\u063c\7\u00ad\2\2\u0638\u063d\5\u012a\u0096\2\u0639\u063d"+
		"\5\u00e8u\2\u063a\u063d\5\u00e6t\2\u063b\u063d\5\u00ecw\2\u063c\u0638"+
		"\3\2\2\2\u063c\u0639\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063b\3\2\2\2\u063d"+
		"\u0670\3\2\2\2\u063e\u063f\5\u0234\u011b\2\u063f\u0640\7\u00ad\2\2\u0640"+
		"\u0641\5\u0234\u011b\2\u0641\u0642\t\3\2\2\u0642\u0643\5\u012c\u0097\2"+
		"\u0643\u0670\3\2\2\2\u0644\u0645\5\u0234\u011b\2\u0645\u0646\7\u00ad\2"+
		"\2\u0646\u0647\5\u0234\u011b\2\u0647\u0648\t\3\2\2\u0648\u0649\5\u00e6"+
		"t\2\u0649\u0670\3\2\2\2\u064a\u064b\5\u0234\u011b\2\u064b\u064c\7\u00ad"+
		"\2\2\u064c\u064d\5\u00e6t\2\u064d\u064e\t\3\2\2\u064e\u064f\5\u0234\u011b"+
		"\2\u064f\u0670\3\2\2\2\u0650\u0651\5\u0234\u011b\2\u0651\u0652\7\u00ad"+
		"\2\2\u0652\u0653\5\u0234\u011b\2\u0653\u0654\t\3\2\2\u0654\u0655\5\u00e8"+
		"u\2\u0655\u0670\3\2\2\2\u0656\u0657\5\u0234\u011b\2\u0657\u0658\7\u00ad"+
		"\2\2\u0658\u0659\5\u00e8u\2\u0659\u065a\t\3\2\2\u065a\u065b\5\u0234\u011b"+
		"\2\u065b\u0670\3\2\2\2\u065c\u065d\5\u0234\u011b\2\u065d\u065e\7\u00ad"+
		"\2\2\u065e\u065f\5\u0234\u011b\2\u065f\u0660\t\3\2\2\u0660\u0661\5\u00ec"+
		"w\2\u0661\u0670\3\2\2\2\u0662\u0663\5\u0234\u011b\2\u0663\u0664\7\u00ad"+
		"\2\2\u0664\u0665\5\u00ecw\2\u0665\u0666\t\3\2\2\u0666\u0667\5\u0234\u011b"+
		"\2\u0667\u0670\3\2\2\2\u0668\u0669\5\u0234\u011b\2\u0669\u066a\5\u022c"+
		"\u0117\2\u066a\u066b\5\u012c\u0097\2\u066b\u066c\5\u022e\u0118\2\u066c"+
		"\u066d\7\u00ad\2\2\u066d\u066e\5\u012a\u0096\2\u066e\u0670\3\2\2\2\u066f"+
		"\u0636\3\2\2\2\u066f\u063e\3\2\2\2\u066f\u0644\3\2\2\2\u066f\u064a\3\2"+
		"\2\2\u066f\u0650\3\2\2\2\u066f\u0656\3\2\2\2\u066f\u065c\3\2\2\2\u066f"+
		"\u0662\3\2\2\2\u066f\u0668\3\2\2\2\u0670\u00e5\3\2\2\2\u0671\u067b\5\u0224"+
		"\u0113\2\u0672\u0678\5\u012a\u0096\2\u0673\u0674\5\u0230\u0119\2\u0674"+
		"\u0675\5\u0106\u0084\2\u0675\u0677\3\2\2\2\u0676\u0673\3\2\2\2\u0677\u067a"+
		"\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067c\3\2\2\2\u067a"+
		"\u0678\3\2\2\2\u067b\u0672\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\3\2"+
		"\2\2\u067d\u067e\5\u0226\u0114\2\u067e\u00e7\3\2\2\2\u067f\u0680\5\u0224"+
		"\u0113\2\u0680\u0681\5\u012a\u0096\2\u0681\u0682\5\u0232\u011a\2\u0682"+
		"\u0683\5\u0106\u0084\2\u0683\u068b\3\2\2\2\u0684\u0685\5\u0230\u0119\2"+
		"\u0685\u0686\5\u012a\u0096\2\u0686\u0687\5\u0232\u011a\2\u0687\u0688\5"+
		"\u0106\u0084\2\u0688\u068a\3\2\2\2\u0689\u0684\3\2\2\2\u068a\u068d\3\2"+
		"\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068e\u068f\5\u0226\u0114\2\u068f\u00e9\3\2\2\2\u0690\u0691"+
		"\5\u0224\u0113\2\u0691\u0697\5\u0106\u0084\2\u0692\u0693\5\u0230\u0119"+
		"\2\u0693\u0694\5\u0106\u0084\2\u0694\u0696\3\2\2\2\u0695\u0692\3\2\2\2"+
		"\u0696\u0699\3\2\2\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a"+
		"\3\2\2\2\u0699\u0697\3\2\2\2\u069a\u069b\5\u0226\u0114\2\u069b\u00eb\3"+
		"\2\2\2\u069c\u069d\5\u022c\u0117\2\u069d\u06a3\5\u012a\u0096\2\u069e\u069f"+
		"\5\u0230\u0119\2\u069f\u06a0\5\u0106\u0084\2\u06a0\u06a2\3\2\2\2\u06a1"+
		"\u069e\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2"+
		"\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06a7\5\u022e\u0118"+
		"\2\u06a7\u00ed\3\2\2\2\u06a8\u06c5\5\u0220\u0111\2\u06a9\u06ba\5\u0106"+
		"\u0084\2\u06aa\u06ab\5\u0230\u0119\2\u06ab\u06ac\5\u0106\u0084\2\u06ac"+
		"\u06ae\3\2\2\2\u06ad\u06aa\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2"+
		"\2\2\u06af\u06b0\3\2\2\2\u06b0\u06bb\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2"+
		"\u06b3\5\u0230\u0119\2\u06b3\u06b4\5\u00eex\2\u06b4\u06b6\3\2\2\2\u06b5"+
		"\u06b2\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2"+
		"\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06af\3\2\2\2\u06ba"+
		"\u06b7\3\2\2\2\u06bb\u06c6\3\2\2\2\u06bc\u06c2\5\u00eex\2\u06bd\u06be"+
		"\5\u0230\u0119\2\u06be\u06bf\5\u00eex\2\u06bf\u06c1\3\2\2\2\u06c0\u06bd"+
		"\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3"+
		"\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06a9\3\2\2\2\u06c5\u06bc\3\2"+
		"\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\5\u0222\u0112\2\u06c8\u00ef\3\2\2"+
		"\2\u06c9\u06cb\5\u00b8]\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb"+
		"\u06cc\3\2\2\2\u06cc\u06cd\5\u01ae\u00d8\2\u06cd\u06d1\5\u01b0\u00d9\2"+
		"\u06ce\u06cf\5\u0136\u009c\2\u06cf\u06d0\7\20\2\2\u06d0\u06d2\3\2\2\2"+
		"\u06d1\u06ce\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5"+
		"\5\u0138\u009d\2\u06d4\u06d6\5\u0100\u0081\2\u06d5\u06d4\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9\5\u00fe\u0080\2\u06d8\u06da"+
		"\5\u00fa~\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2"+
		"\2\u06db\u06dd\5\u00f2z\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd"+
		"\u00f1\3\2\2\2\u06de\u06df\5\u0212\u010a\2\u06df\u06e0\5\u00f6|\2\u06e0"+
		"\u06ef\3\2\2\2\u06e1\u06e2\5\u0212\u010a\2\u06e2\u06e3\5\u00f6|\2\u06e3"+
		"\u06e4\5\u016a\u00b6\2\u06e4\u06e5\5\u00f4{\2\u06e5\u06ef\3\2\2\2\u06e6"+
		"\u06e7\5\u0212\u010a\2\u06e7\u06e8\5\u00f4{\2\u06e8\u06ef\3\2\2\2\u06e9"+
		"\u06ea\5\u0212\u010a\2\u06ea\u06eb\5\u00f4{\2\u06eb\u06ec\5\u016a\u00b6"+
		"\2\u06ec\u06ed\5\u00f6|\2\u06ed\u06ef\3\2\2\2\u06ee\u06de\3\2\2\2\u06ee"+
		"\u06e1\3\2\2\2\u06ee\u06e6\3\2\2\2\u06ee\u06e9\3\2\2\2\u06ef\u00f3\3\2"+
		"\2\2\u06f0\u06f1\5\u01fc\u00ff\2\u06f1\u06f2\5\u012c\u0097\2\u06f2\u00f5"+
		"\3\2\2\2\u06f3\u06f4\5\u0204\u0103\2\u06f4\u06f5\5\u012c\u0097\2\u06f5"+
		"\u00f7\3\2\2\2\u06f6\u06f7\5\u0212\u010a\2\u06f7\u06f8\5\u00f4{\2\u06f8"+
		"\u00f9\3\2\2\2\u06f9\u06fa\5\u01a4\u00d3\2\u06fa\u06fb\5\u01d0\u00e9\2"+
		"\u06fb\u06fc\5\u0194\u00cb\2\u06fc\u00fb\3\2\2\2\u06fd\u06fe\5\u01a4\u00d3"+
		"\2\u06fe\u06ff\5\u0194\u00cb\2\u06ff\u00fd\3\2\2\2\u0700\u0701\5\u0214"+
		"\u010b\2\u0701\u0702\7\3\2\2\u0702\u0703\5\u0104\u0083\2\u0703\u0704\7"+
		"\4\2\2\u0704\u0709\3\2\2\2\u0705\u0706\5\u01b4\u00db\2\u0706\u0707\5\u012a"+
		"\u0096\2\u0707\u0709\3\2\2\2\u0708\u0700\3\2\2\2\u0708\u0705\3\2\2\2\u0709"+
		"\u00ff\3\2\2\2\u070a\u070b\7\3\2\2\u070b\u070c\5\u0102\u0082\2\u070c\u070d"+
		"\7\4\2\2\u070d\u0101\3\2\2\2\u070e\u0714\5\u013a\u009e\2\u070f\u0710\5"+
		"\u0230\u0119\2\u0710\u0711\5\u013a\u009e\2\u0711\u0713\3\2\2\2\u0712\u070f"+
		"\3\2\2\2\u0713\u0716\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u0103\3\2\2\2\u0716\u0714\3\2\2\2\u0717\u071d\5\u0106\u0084\2\u0718\u0719"+
		"\5\u0230\u0119\2\u0719\u071a\5\u0106\u0084\2\u071a\u071c\3\2\2\2\u071b"+
		"\u0718\3\2\2\2\u071c\u071f\3\2\2\2\u071d\u071b\3\2\2\2\u071d\u071e\3\2"+
		"\2\2\u071e\u0105\3\2\2\2\u071f\u071d\3\2\2\2\u0720\u0727\5\u012a\u0096"+
		"\2\u0721\u0727\5\u00e8u\2\u0722\u0727\5\u00e6t\2\u0723\u0727\5\u00ecw"+
		"\2\u0724\u0727\5\u00eex\2\u0725\u0727\5\u00eav\2\u0726\u0720\3\2\2\2\u0726"+
		"\u0721\3\2\2\2\u0726\u0722\3\2\2\2\u0726\u0723\3\2\2\2\u0726\u0724\3\2"+
		"\2\2\u0726\u0725\3\2\2\2\u0727\u0107\3\2\2\2\u0728\u072a\5\u01ee\u00f8"+
		"\2\u0729\u072b\5\u0118\u008d\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2"+
		"\u072b\u072d\3\2\2\2\u072c\u072e\5\u01b4\u00db\2\u072d\u072c\3\2\2\2\u072d"+
		"\u072e\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0730\5\u011a\u008e\2\u0730\u0732"+
		"\5\u010e\u0088\2\u0731\u0733\5\u0116\u008c\2\u0732\u0731\3\2\2\2\u0732"+
		"\u0733\3\2\2\2\u0733\u0735\3\2\2\2\u0734\u0736\5\u0112\u008a\2\u0735\u0734"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737\u0739\5\u010c\u0087"+
		"\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\3\2\2\2\u073a\u073c"+
		"\5\u010a\u0086\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0109\3"+
		"\2\2\2\u073d\u073e\5\u0166\u00b4\2\u073e\u073f\5\u0196\u00cc\2\u073f\u010b"+
		"\3\2\2\2\u0740\u0741\5\u01c0\u00e1\2\u0741\u0742\5\u012c\u0097\2\u0742"+
		"\u010d\3\2\2\2\u0743\u0744\5\u019a\u00ce\2\u0744\u0745\5\u0110\u0089\2"+
		"\u0745\u010f\3\2\2\2\u0746\u074c\5\u0234\u011b\2\u0747\u0748\5\u0234\u011b"+
		"\2\u0748\u0749\7\20\2\2\u0749\u074a\5\u0234\u011b\2\u074a\u074c\3\2\2"+
		"\2\u074b\u0746\3\2\2\2\u074b\u0747\3\2\2\2\u074c\u0111\3\2\2\2\u074d\u074e"+
		"\5\u01dc\u00ef\2\u074e\u074f\5\u0178\u00bd\2\u074f\u0750\5\u0114\u008b"+
		"\2\u0750\u0113\3\2\2\2\u0751\u0754\5\u0234\u011b\2\u0752\u0755\5\u0170"+
		"\u00b9\2\u0753\u0755\5\u0186\u00c4\2\u0754\u0752\3\2\2\2\u0754\u0753\3"+
		"\2\2\2\u0754\u0755\3\2\2\2\u0755\u0115\3\2\2\2\u0756\u0757\5\u0218\u010d"+
		"\2\u0757\u0758\5\u011e\u0090\2\u0758\u0117\3\2\2\2\u0759\u075a\5\u018a"+
		"\u00c6\2\u075a\u0119\3\2\2\2\u075b\u075e\7\21\2\2\u075c\u075e\5\u011c"+
		"\u008f\2\u075d\u075b\3\2\2\2\u075d\u075c\3\2\2\2\u075e\u0764\3\2\2\2\u075f"+
		"\u0760\5\u0230\u0119\2\u0760\u0761\5\u011c\u008f\2\u0761\u0763\3\2\2\2"+
		"\u0762\u075f\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0762\3\2\2\2\u0764\u0765"+
		"\3\2\2\2\u0765\u011b\3\2\2\2\u0766\u0764\3\2\2\2\u0767\u0768\5\u0234\u011b"+
		"\2\u0768\u0769\7\20\2\2\u0769\u076a\7\21\2\2\u076a\u0778\3\2\2\2\u076b"+
		"\u076f\5\u0234\u011b\2\u076c\u076d\5\u016e\u00b8\2\u076d\u076e\5\u0234"+
		"\u011b\2\u076e\u0770\3\2\2\2\u076f\u076c\3\2\2\2\u076f\u0770\3\2\2\2\u0770"+
		"\u0778\3\2\2\2\u0771\u0775\5\u0126\u0094\2\u0772\u0773\5\u016e\u00b8\2"+
		"\u0773\u0774\5\u0234\u011b\2\u0774\u0776\3\2\2\2\u0775\u0772\3\2\2\2\u0775"+
		"\u0776\3\2\2\2\u0776\u0778\3\2\2\2\u0777\u0767\3\2\2\2\u0777\u076b\3\2"+
		"\2\2\u0777\u0771\3\2\2\2\u0778\u011d\3\2\2\2\u0779\u077f\5\u0120\u0091"+
		"\2\u077a\u077b\5\u016a\u00b6\2\u077b\u077c\5\u0120\u0091\2\u077c\u077e"+
		"\3\2\2\2\u077d\u077a\3\2\2\2\u077e\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f"+
		"\u0780\3\2\2\2\u0780\u011f\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0783\5\u0234"+
		"\u011b\2\u0783\u0784\t\4\2\2\u0784\u0785\5\u012a\u0096\2\u0785\u07cc\3"+
		"\2\2\2\u0786\u0787\5\u0234\u011b\2\u0787\u0788\7\20\2\2\u0788\u0789\5"+
		"\u0234\u011b\2\u0789\u078a\t\4\2\2\u078a\u078b\5\u012a\u0096\2\u078b\u07cc"+
		"\3\2\2\2\u078c\u078d\5\u0126\u0094\2\u078d\u078e\t\4\2\2\u078e\u078f\5"+
		"\u012a\u0096\2\u078f\u07cc\3\2\2\2\u0790\u0791\5\u0126\u0094\2\u0791\u0792"+
		"\t\4\2\2\u0792\u0793\5\u0126\u0094\2\u0793\u07cc\3\2\2\2\u0794\u0795\5"+
		"\u0234\u011b\2\u0795\u0796\5\u01a6\u00d4\2\u0796\u0798\7\3\2\2\u0797\u0799"+
		"\5\u0128\u0095\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a\3"+
		"\2\2\2\u079a\u079b\7\4\2\2\u079b\u07cc\3\2\2\2\u079c\u079d\7\3\2\2\u079d"+
		"\u07a3\5\u0234\u011b\2\u079e\u079f\5\u0230\u0119\2\u079f\u07a0\5\u0234"+
		"\u011b\2\u07a0\u07a2\3\2\2\2\u07a1\u079e\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3"+
		"\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6\3\2\2\2\u07a5\u07a3\3\2"+
		"\2\2\u07a6\u07a7\7\4\2\2\u07a7\u07a8\5\u01a6\u00d4\2\u07a8\u07a9\7\3\2"+
		"\2\u07a9\u07af\5\u00eex\2\u07aa\u07ab\5\u0230\u0119\2\u07ab\u07ac\5\u00ee"+
		"x\2\u07ac\u07ae\3\2\2\2\u07ad\u07aa\3\2\2\2\u07ae\u07b1\3\2\2\2\u07af"+
		"\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07af\3\2"+
		"\2\2\u07b2\u07b3\7\4\2\2\u07b3\u07cc\3\2\2\2\u07b4\u07b5\7\3\2\2\u07b5"+
		"\u07bb\5\u0234\u011b\2\u07b6\u07b7\5\u0230\u0119\2\u07b7\u07b8\5\u0234"+
		"\u011b\2\u07b8\u07ba\3\2\2\2\u07b9\u07b6\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb"+
		"\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be\3\2\2\2\u07bd\u07bb\3\2"+
		"\2\2\u07be\u07bf\7\4\2\2\u07bf\u07c0\t\4\2\2\u07c0\u07c6\5\u00eex\2\u07c1"+
		"\u07c2\5\u0230\u0119\2\u07c2\u07c3\5\u00eex\2\u07c3\u07c5\3\2\2\2\u07c4"+
		"\u07c1\3\2\2\2\u07c5\u07c8\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c7\3\2"+
		"\2\2\u07c7\u07cc\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c9\u07cc\5\u0124\u0093"+
		"\2\u07ca\u07cc\5\u0122\u0092\2\u07cb\u0782\3\2\2\2\u07cb\u0786\3\2\2\2"+
		"\u07cb\u078c\3\2\2\2\u07cb\u0790\3\2\2\2\u07cb\u0794\3\2\2\2\u07cb\u079c"+
		"\3\2\2\2\u07cb\u07b4\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb\u07ca\3\2\2\2\u07cc"+
		"\u0121\3\2\2\2\u07cd\u07ce\5\u0234\u011b\2\u07ce\u07cf\5\u0180\u00c1\2"+
		"\u07cf\u07d0\5\u012a\u0096\2\u07d0\u0123\3\2\2\2\u07d1\u07d2\5\u0234\u011b"+
		"\2\u07d2\u07d3\5\u0180\u00c1\2\u07d3\u07d4\5\u01b6\u00dc\2\u07d4\u07d5"+
		"\3\2\2\2\u07d5\u07d6\5\u012a\u0096\2\u07d6\u0125\3\2\2\2\u07d7\u07d8\5"+
		"\u0234\u011b\2\u07d8\u07d9\7\3\2\2\u07d9\u07da\7\21\2\2\u07da\u07db\7"+
		"\4\2\2\u07db\u07e4\3\2\2\2\u07dc\u07dd\5\u0234\u011b\2\u07dd\u07df\7\3"+
		"\2\2\u07de\u07e0\5\u0128\u0095\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2"+
		"\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\7\4\2\2\u07e2\u07e4\3\2\2\2\u07e3\u07d7"+
		"\3\2\2\2\u07e3\u07dc\3\2\2\2\u07e4\u0127\3\2\2\2\u07e5\u07e9\5\u012a\u0096"+
		"\2\u07e6\u07e9\5\u0234\u011b\2\u07e7\u07e9\5\u0126\u0094\2\u07e8\u07e5"+
		"\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e8\u07e7\3\2\2\2\u07e9\u07f2\3\2\2\2\u07ea"+
		"\u07ee\5\u0230\u0119\2\u07eb\u07ef\5\u012a\u0096\2\u07ec\u07ef\5\u0234"+
		"\u011b\2\u07ed\u07ef\5\u0126\u0094\2\u07ee\u07eb\3\2\2\2\u07ee\u07ec\3"+
		"\2\2\2\u07ee\u07ed\3\2\2\2\u07ef\u07f1\3\2\2\2\u07f0\u07ea\3\2\2\2\u07f1"+
		"\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u0129\3\2"+
		"\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07ff\7\u00ac\2\2\u07f6\u07ff\5\u0130\u0099"+
		"\2\u07f7\u07ff\5\u012c\u0097\2\u07f8\u07ff\5\u012e\u0098\2\u07f9\u07ff"+
		"\5\u0134\u009b\2\u07fa\u07ff\5\u0132\u009a\2\u07fb\u07ff\5\62\32\2\u07fc"+
		"\u07ff\5\u01d2\u00ea\2\u07fd\u07ff\5\u0234\u011b\2\u07fe\u07f5\3\2\2\2"+
		"\u07fe\u07f6\3\2\2\2\u07fe\u07f7\3\2\2\2\u07fe\u07f8\3\2\2\2\u07fe\u07f9"+
		"\3\2\2\2\u07fe\u07fa\3\2\2\2\u07fe\u07fb\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe"+
		"\u07fd\3\2\2\2\u07ff\u012b\3\2\2\2\u0800\u0801\7\u00a7\2\2\u0801\u012d"+
		"\3\2\2\2\u0802\u0803\t\5\2\2\u0803\u012f\3\2\2\2\u0804\u0805\7\u00a6\2"+
		"\2\u0805\u0131\3\2\2\2\u0806\u0807\t\6\2\2\u0807\u0133\3\2\2\2\u0808\u0809"+
		"\7\u00a9\2\2\u0809\u0135\3\2\2\2\u080a\u0810\5\u0234\u011b\2\u080b\u080c"+
		"\7\27\2\2\u080c\u080d\5\u0234\u011b\2\u080d\u080e\7\27\2\2\u080e\u0810"+
		"\3\2\2\2\u080f\u080a\3\2\2\2\u080f\u080b\3\2\2\2\u0810\u0137\3\2\2\2\u0811"+
		"\u0817\5\u0234\u011b\2\u0812\u0813\7\27\2\2\u0813\u0814\5\u0234\u011b"+
		"\2\u0814\u0815\7\27\2\2\u0815\u0817\3\2\2\2\u0816\u0811\3\2\2\2\u0816"+
		"\u0812\3\2\2\2\u0817\u0139\3\2\2\2\u0818\u081e\5\u0234\u011b\2\u0819\u081a"+
		"\7\27\2\2\u081a\u081b\5\u0234\u011b\2\u081b\u081c\7\27\2\2\u081c\u081e"+
		"\3\2\2\2\u081d\u0818\3\2\2\2\u081d\u0819\3\2\2\2\u081e\u013b\3\2\2\2\u081f"+
		"\u0821\5\u013e\u00a0\2\u0820\u0822\5\u0140\u00a1\2\u0821\u0820\3\2\2\2"+
		"\u0821\u0822\3\2\2\2\u0822\u013d\3\2\2\2\u0823\u0840\5\u0234\u011b\2\u0824"+
		"\u0840\7\u00a6\2\2\u0825\u0840\7{\2\2\u0826\u0840\7s\2\2\u0827\u0840\7"+
		"\u008f\2\2\u0828\u0840\7\u0090\2\2\u0829\u0840\7\u0091\2\2\u082a\u0840"+
		"\7\u0092\2\2\u082b\u0840\7\u0093\2\2\u082c\u0840\7\u0094\2\2\u082d\u0840"+
		"\7\u0095\2\2\u082e\u0840\7\u0096\2\2\u082f\u0840\7\u0097\2\2\u0830\u0840"+
		"\7\u0098\2\2\u0831\u0840\7\u0099\2\2\u0832\u0840\7\u009a\2\2\u0833\u0840"+
		"\7\u009b\2\2\u0834\u0840\7\u009c\2\2\u0835\u0840\7\u009d\2\2\u0836\u0840"+
		"\7\u009e\2\2\u0837\u0840\7\u00a0\2\2\u0838\u0840\7\u009f\2\2\u0839\u0840"+
		"\7\u00a1\2\2\u083a\u0840\7\u00a2\2\2\u083b\u0840\7\u00a3\2\2\u083c\u0840"+
		"\7\u00a4\2\2\u083d\u0840\7{\2\2\u083e\u0840\7\u0089\2\2\u083f\u0823\3"+
		"\2\2\2\u083f\u0824\3\2\2\2\u083f\u0825\3\2\2\2\u083f\u0826\3\2\2\2\u083f"+
		"\u0827\3\2\2\2\u083f\u0828\3\2\2\2\u083f\u0829\3\2\2\2\u083f\u082a\3\2"+
		"\2\2\u083f\u082b\3\2\2\2\u083f\u082c\3\2\2\2\u083f\u082d\3\2\2\2\u083f"+
		"\u082e\3\2\2\2\u083f\u082f\3\2\2\2\u083f\u0830\3\2\2\2\u083f\u0831\3\2"+
		"\2\2\u083f\u0832\3\2\2\2\u083f\u0833\3\2\2\2\u083f\u0834\3\2\2\2\u083f"+
		"\u0835\3\2\2\2\u083f\u0836\3\2\2\2\u083f\u0837\3\2\2\2\u083f\u0838\3\2"+
		"\2\2\u083f\u0839\3\2\2\2\u083f\u083a\3\2\2\2\u083f\u083b\3\2\2\2\u083f"+
		"\u083c\3\2\2\2\u083f\u083d\3\2\2\2\u083f\u083e\3\2\2\2\u0840\u013f\3\2"+
		"\2\2\u0841\u0842\5\u0228\u0115\2\u0842\u0848\5\u013c\u009f\2\u0843\u0844"+
		"\5\u0230\u0119\2\u0844\u0845\5\u013c\u009f\2\u0845\u0847\3\2\2\2\u0846"+
		"\u0843\3\2\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2"+
		"\2\2\u0849\u084b\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084c\5\u022a\u0116"+
		"\2\u084c\u0141\3\2\2\2\u084d\u0850\5\u0170\u00b9\2\u084e\u0850\5\u0186"+
		"\u00c4\2\u084f\u084d\3\2\2\2\u084f\u084e\3\2\2\2\u0850\u0143\3\2\2\2\u0851"+
		"\u0852\5\u0234\u011b\2\u0852\u0145\3\2\2\2\u0853\u0854\5\u0234\u011b\2"+
		"\u0854\u0147\3\2\2\2\u0855\u0856\5\u0130\u0099\2\u0856\u0149\3\2\2\2\u0857"+
		"\u0858\5\u0234\u011b\2\u0858\u014b\3\2\2\2\u0859\u085a\5\u0234\u011b\2"+
		"\u085a\u014d\3\2\2\2\u085b\u085c\5\u0234\u011b\2\u085c\u014f\3\2\2\2\u085d"+
		"\u085e\5\u0234\u011b\2\u085e\u0151\3\2\2\2\u085f\u0860\5\u0234\u011b\2"+
		"\u0860\u0153\3\2\2\2\u0861\u0862\5\u0234\u011b\2\u0862\u0155\3\2\2\2\u0863"+
		"\u0864\5\u0130\u0099\2\u0864\u0157\3\2\2\2\u0865\u0866\5\u0234\u011b\2"+
		"\u0866\u0159\3\2\2\2\u0867\u0868\5\u015c\u00af\2\u0868\u0869\5\u013c\u009f"+
		"\2\u0869\u015b\3\2\2\2\u086a\u086b\5\u0234\u011b\2\u086b\u015d\3\2\2\2"+
		"\u086c\u086d\7\31\2\2\u086d\u015f\3\2\2\2\u086e\u086f\7\32\2\2\u086f\u0161"+
		"\3\2\2\2\u0870\u0871\7\33\2\2\u0871\u0163\3\2\2\2\u0872\u0873\7\33\2\2"+
		"\u0873\u0874\7g\2\2\u0874\u0165\3\2\2\2\u0875\u0876\7\34\2\2\u0876\u0167"+
		"\3\2\2\2\u0877\u0878\7\35\2\2\u0878\u0169\3\2\2\2\u0879\u087a\7\36\2\2"+
		"\u087a\u016b\3\2\2\2\u087b\u087c\7 \2\2\u087c\u016d\3\2\2\2\u087d\u087e"+
		"\7!\2\2\u087e\u016f\3\2\2\2\u087f\u0880\7\"\2\2\u0880\u0171\3\2\2\2\u0881"+
		"\u0882\7#\2\2\u0882\u0173\3\2\2\2\u0883\u0884\7$\2\2\u0884\u0175\3\2\2"+
		"\2\u0885\u0886\7%\2\2\u0886\u0177\3\2\2\2\u0887\u0888\7&\2\2\u0888\u0179"+
		"\3\2\2\2\u0889\u088a\7\'\2\2\u088a\u017b\3\2\2\2\u088b\u088c\7(\2\2\u088c"+
		"\u017d\3\2\2\2\u088d\u088e\7*\2\2\u088e\u017f\3\2\2\2\u088f\u0890\7,\2"+
		"\2\u0890\u0181\3\2\2\2\u0891\u0892\7-\2\2\u0892\u0183\3\2\2\2\u0893\u0894"+
		"\7/\2\2\u0894\u0185\3\2\2\2\u0895\u0896\7\60\2\2\u0896\u0187\3\2\2\2\u0897"+
		"\u0898\7\61\2\2\u0898\u0189\3\2\2\2\u0899\u089a\7\62\2\2\u089a\u018b\3"+
		"\2\2\2\u089b\u089c\7\63\2\2\u089c\u018d\3\2\2\2\u089d\u089e\7\64\2\2\u089e"+
		"\u018f\3\2\2\2\u089f\u08a0\7\66\2\2\u08a0\u0191\3\2\2\2\u08a1\u08a2\7"+
		"\67\2\2\u08a2\u0193\3\2\2\2\u08a3\u08a4\78\2\2\u08a4\u0195\3\2\2\2\u08a5"+
		"\u08a6\7:\2\2\u08a6\u0197\3\2\2\2\u08a7\u08a8\7;\2\2\u08a8\u0199\3\2\2"+
		"\2\u08a9\u08aa\7<\2\2\u08aa\u019b\3\2\2\2\u08ab\u08ac\7=\2\2\u08ac\u019d"+
		"\3\2\2\2\u08ad\u08ae\7>\2\2\u08ae\u019f\3\2\2\2\u08af\u08b0\7?\2\2\u08b0"+
		"\u01a1\3\2\2\2\u08b1\u08b2\7@\2\2\u08b2\u01a3\3\2\2\2\u08b3\u08b4\7A\2"+
		"\2\u08b4\u01a5\3\2\2\2\u08b5\u08b6\7B\2\2\u08b6\u01a7\3\2\2\2\u08b7\u08b8"+
		"\7C\2\2\u08b8\u01a9\3\2\2\2\u08b9\u08ba\7E\2\2\u08ba\u01ab\3\2\2\2\u08bb"+
		"\u08bc\7F\2\2\u08bc\u01ad\3\2\2\2\u08bd\u08be\7G\2\2\u08be\u01af\3\2\2"+
		"\2\u08bf\u08c0\7H\2\2\u08c0\u01b1\3\2\2\2\u08c1\u08c2\7I\2\2\u08c2\u01b3"+
		"\3\2\2\2\u08c3\u08c4\7J\2\2\u08c4\u01b5\3\2\2\2\u08c5\u08c6\7K\2\2\u08c6"+
		"\u01b7\3\2\2\2\u08c7\u08c8\7L\2\2\u08c8\u01b9\3\2\2\2\u08c9\u08ca\7M\2"+
		"\2\u08ca\u01bb\3\2\2\2\u08cb\u08cc\7N\2\2\u08cc\u01bd\3\2\2\2\u08cd\u08ce"+
		"\7O\2\2\u08ce\u01bf\3\2\2\2\u08cf\u08d0\7Q\2\2\u08d0\u01c1\3\2\2\2\u08d1"+
		"\u08d2\7\u009b\2\2\u08d2\u01c3\3\2\2\2\u08d3\u08d4\7T\2\2\u08d4\u01c5"+
		"\3\2\2\2\u08d5\u08d6\7U\2\2\u08d6\u01c7\3\2\2\2\u08d7\u08d8\7V\2\2\u08d8"+
		"\u01c9\3\2\2\2\u08d9\u08da\7W\2\2\u08da\u01cb\3\2\2\2\u08db\u08dc\7Z\2"+
		"\2\u08dc\u01cd\3\2\2\2\u08dd\u08de\7Y\2\2\u08de\u01cf\3\2\2\2\u08df\u08e0"+
		"\7[\2\2\u08e0\u01d1\3\2\2\2\u08e1\u08e2\7\\\2\2\u08e2\u01d3\3\2\2\2\u08e3"+
		"\u08e4\7]\2\2\u08e4\u01d5\3\2\2\2\u08e5\u08e6\7^\2\2\u08e6\u01d7\3\2\2"+
		"\2\u08e7\u08e8\7`\2\2\u08e8\u01d9\3\2\2\2\u08e9\u08ea\7a\2\2\u08ea\u01db"+
		"\3\2\2\2\u08eb\u08ec\7b\2\2\u08ec\u01dd\3\2\2\2\u08ed\u08ee\7d\2\2\u08ee"+
		"\u01df\3\2\2\2\u08ef\u08f0\7h\2\2\u08f0\u01e1\3\2\2\2\u08f1\u08f2\7j\2"+
		"\2\u08f2\u01e3\3\2\2\2\u08f3\u08f4\7k\2\2\u08f4\u01e5\3\2\2\2\u08f5\u08f6"+
		"\7l\2\2\u08f6\u01e7\3\2\2\2\u08f7\u08f8\7m\2\2\u08f8\u01e9\3\2\2\2\u08f9"+
		"\u08fa\7o\2\2\u08fa\u01eb\3\2\2\2\u08fb\u08fc\7p\2\2\u08fc\u01ed\3\2\2"+
		"\2\u08fd\u08fe\7r\2\2\u08fe\u01ef\3\2\2\2\u08ff\u0900\7s\2\2\u0900\u01f1"+
		"\3\2\2\2\u0901\u0902\7t\2\2\u0902\u01f3\3\2\2\2\u0903\u0904\7v\2\2\u0904"+
		"\u01f5\3\2\2\2\u0905\u0906\7w\2\2\u0906\u01f7\3\2\2\2\u0907\u0908\7x\2"+
		"\2\u0908\u01f9\3\2\2\2\u0909\u090a\7y\2\2\u090a\u01fb\3\2\2\2\u090b\u090c"+
		"\7{\2\2\u090c\u01fd\3\2\2\2\u090d\u090e\7|\2\2\u090e\u01ff\3\2\2\2\u090f"+
		"\u0910\7~\2\2\u0910\u0201\3\2\2\2\u0911\u0912\7\u0080\2\2\u0912\u0203"+
		"\3\2\2\2\u0913\u0914\7\u0081\2\2\u0914\u0205\3\2\2\2\u0915\u0916\7\u0083"+
		"\2\2\u0916\u0207\3\2\2\2\u0917\u0918\7\u0084\2\2\u0918\u0209\3\2\2\2\u0919"+
		"\u091a\7\u0085\2\2\u091a\u020b\3\2\2\2\u091b\u091c\7\u0086\2\2\u091c\u020d"+
		"\3\2\2\2\u091d\u091e\7\u0087\2\2\u091e\u020f\3\2\2\2\u091f\u0920\7\u00b2"+
		"\2\2\u0920\u0211\3\2\2\2\u0921\u0922\7\u0088\2\2\u0922\u0213\3\2\2\2\u0923"+
		"\u0924\7\u008a\2\2\u0924\u0215\3\2\2\2\u0925\u0926\7\u008b\2\2\u0926\u0217"+
		"\3\2\2\2\u0927\u0928\7\u008c\2\2\u0928\u0219\3\2\2\2\u0929\u092a\7\u008d"+
		"\2\2\u092a\u021b\3\2\2\2\u092b\u092c\7n\2\2\u092c\u021d\3\2\2\2\u092d"+
		"\u092e\7\2\2\3\u092e\u021f\3\2\2\2\u092f\u0930\7\3\2\2\u0930\u0221\3\2"+
		"\2\2\u0931\u0932\7\4\2\2\u0932\u0223\3\2\2\2\u0933\u0934\7\5\2\2\u0934"+
		"\u0225\3\2\2\2\u0935\u0936\7\6\2\2\u0936\u0227\3\2\2\2\u0937\u0938\7\u00ae"+
		"\2\2\u0938\u0229\3\2\2\2\u0939\u093a\7\u00af\2\2\u093a\u022b\3\2\2\2\u093b"+
		"\u093c\7\7\2\2\u093c\u022d\3\2\2\2\u093d\u093e\7\b\2\2\u093e\u022f\3\2"+
		"\2\2\u093f\u0940\7\t\2\2\u0940\u0231\3\2\2\2\u0941\u0942\7\13\2\2\u0942"+
		"\u0233\3\2\2\2\u0943\u09d2\7\u00ab\2\2\u0944\u0945\7\31\2\2\u0945\u09d2"+
		"\7\32\2\2\u0946\u09d2\7\33\2\2\u0947\u09d2\7\34\2\2\u0948\u09d2\7\35\2"+
		"\2\u0949\u09d2\7\36\2\2\u094a\u09d2\7\37\2\2\u094b\u09d2\7 \2\2\u094c"+
		"\u09d2\7!\2\2\u094d\u09d2\7\"\2\2\u094e\u09d2\7#\2\2\u094f\u09d2\7$\2"+
		"\2\u0950\u09d2\7%\2\2\u0951\u09d2\7&\2\2\u0952\u09d2\7\'\2\2\u0953\u09d2"+
		"\7(\2\2\u0954\u09d2\7)\2\2\u0955\u09d2\7*\2\2\u0956\u09d2\7+\2\2\u0957"+
		"\u09d2\7,\2\2\u0958\u09d2\7-\2\2\u0959\u09d2\7.\2\2\u095a\u09d2\7/\2\2"+
		"\u095b\u09d2\7\60\2\2\u095c\u09d2\7\61\2\2\u095d\u09d2\7\62\2\2\u095e"+
		"\u09d2\7\63\2\2\u095f\u09d2\7\64\2\2\u0960\u09d2\7\65\2\2\u0961\u09d2"+
		"\7\66\2\2\u0962\u09d2\7\67\2\2\u0963\u09d2\78\2\2\u0964\u09d2\79\2\2\u0965"+
		"\u09d2\7:\2\2\u0966\u09d2\7;\2\2\u0967\u09d2\7<\2\2\u0968\u09d2\7=\2\2"+
		"\u0969\u09d2\7>\2\2\u096a\u09d2\7?\2\2\u096b\u09d2\7@\2\2\u096c\u09d2"+
		"\7A\2\2\u096d\u09d2\7B\2\2\u096e\u09d2\7C\2\2\u096f\u09d2\7D\2\2\u0970"+
		"\u09d2\7E\2\2\u0971\u09d2\7F\2\2\u0972\u09d2\7G\2\2\u0973\u09d2\7H\2\2"+
		"\u0974\u09d2\7I\2\2\u0975\u09d2\7J\2\2\u0976\u09d2\7K\2\2\u0977\u09d2"+
		"\7L\2\2\u0978\u09d2\7M\2\2\u0979\u09d2\7N\2\2\u097a\u09d2\7O\2\2\u097b"+
		"\u09d2\7P\2\2\u097c\u09d2\7Q\2\2\u097d\u09d2\7R\2\2\u097e\u09d2\7S\2\2"+
		"\u097f\u09d2\7T\2\2\u0980\u09d2\7U\2\2\u0981\u09d2\7V\2\2\u0982\u09d2"+
		"\7W\2\2\u0983\u09d2\7X\2\2\u0984\u09d2\7Y\2\2\u0985\u09d2\7Z\2\2\u0986"+
		"\u09d2\7[\2\2\u0987\u09d2\7\\\2\2\u0988\u09d2\7]\2\2\u0989\u09d2\7^\2"+
		"\2\u098a\u09d2\7_\2\2\u098b\u09d2\7`\2\2\u098c\u09d2\7a\2\2\u098d\u09d2"+
		"\7b\2\2\u098e\u09d2\7c\2\2\u098f\u09d2\7d\2\2\u0990\u09d2\7e\2\2\u0991"+
		"\u09d2\7f\2\2\u0992\u09d2\7g\2\2\u0993\u09d2\7h\2\2\u0994\u09d2\7i\2\2"+
		"\u0995\u09d2\7j\2\2\u0996\u09d2\7k\2\2\u0997\u09d2\7l\2\2\u0998\u09d2"+
		"\7m\2\2\u0999\u09d2\7n\2\2\u099a\u09d2\7o\2\2\u099b\u09d2\7p\2\2\u099c"+
		"\u09d2\7q\2\2\u099d\u09d2\7r\2\2\u099e\u09d2\7s\2\2\u099f\u09d2\7t\2\2"+
		"\u09a0\u09d2\7u\2\2\u09a1\u09d2\7v\2\2\u09a2\u09d2\7w\2\2\u09a3\u09d2"+
		"\7x\2\2\u09a4\u09d2\7y\2\2\u09a5\u09d2\7z\2\2\u09a6\u09d2\7{\2\2\u09a7"+
		"\u09d2\7|\2\2\u09a8\u09d2\7}\2\2\u09a9\u09d2\7~\2\2\u09aa\u09d2\7\177"+
		"\2\2\u09ab\u09d2\7\u0080\2\2\u09ac\u09d2\7\u0081\2\2\u09ad\u09d2\7\u0082"+
		"\2\2\u09ae\u09d2\7\u0083\2\2\u09af\u09d2\7\u0084\2\2\u09b0\u09d2\7\u0085"+
		"\2\2\u09b1\u09d2\7\u0086\2\2\u09b2\u09d2\7\u0087\2\2\u09b3\u09d2\7\u0088"+
		"\2\2\u09b4\u09d2\7\u0089\2\2\u09b5\u09d2\7\u008a\2\2\u09b6\u09d2\7\u008b"+
		"\2\2\u09b7\u09d2\7\u008c\2\2\u09b8\u09d2\7\u008d\2\2\u09b9\u09d2\7\u008e"+
		"\2\2\u09ba\u09d2\7\u008f\2\2\u09bb\u09d2\7\u0090\2\2\u09bc\u09d2\7\u0091"+
		"\2\2\u09bd\u09d2\7\u0092\2\2\u09be\u09d2\7\u0093\2\2\u09bf\u09d2\7\u0094"+
		"\2\2\u09c0\u09d2\7\u0095\2\2\u09c1\u09d2\7\u0096\2\2\u09c2\u09d2\7\u0097"+
		"\2\2\u09c3\u09d2\7\u0098\2\2\u09c4\u09d2\7\u0099\2\2\u09c5\u09d2\7\u009a"+
		"\2\2\u09c6\u09d2\7\u009b\2\2\u09c7\u09d2\7\u009c\2\2\u09c8\u09d2\7\u009d"+
		"\2\2\u09c9\u09d2\7\u009e\2\2\u09ca\u09d2\7\u009f\2\2\u09cb\u09d2\7\u00a0"+
		"\2\2\u09cc\u09d2\7\u00a1\2\2\u09cd\u09d2\7\u00a2\2\2\u09ce\u09d2\7\u00a3"+
		"\2\2\u09cf\u09d2\7\u00a4\2\2\u09d0\u09d2\7\u00b2\2\2\u09d1\u0943\3\2\2"+
		"\2\u09d1\u0944\3\2\2\2\u09d1\u0946\3\2\2\2\u09d1\u0947\3\2\2\2\u09d1\u0948"+
		"\3\2\2\2\u09d1\u0949\3\2\2\2\u09d1\u094a\3\2\2\2\u09d1\u094b\3\2\2\2\u09d1"+
		"\u094c\3\2\2\2\u09d1\u094d\3\2\2\2\u09d1\u094e\3\2\2\2\u09d1\u094f\3\2"+
		"\2\2\u09d1\u0950\3\2\2\2\u09d1\u0951\3\2\2\2\u09d1\u0952\3\2\2\2\u09d1"+
		"\u0953\3\2\2\2\u09d1\u0954\3\2\2\2\u09d1\u0955\3\2\2\2\u09d1\u0956\3\2"+
		"\2\2\u09d1\u0957\3\2\2\2\u09d1\u0958\3\2\2\2\u09d1\u0959\3\2\2\2\u09d1"+
		"\u095a\3\2\2\2\u09d1\u095b\3\2\2\2\u09d1\u095c\3\2\2\2\u09d1\u095d\3\2"+
		"\2\2\u09d1\u095e\3\2\2\2\u09d1\u095f\3\2\2\2\u09d1\u0960\3\2\2\2\u09d1"+
		"\u0961\3\2\2\2\u09d1\u0962\3\2\2\2\u09d1\u0963\3\2\2\2\u09d1\u0964\3\2"+
		"\2\2\u09d1\u0965\3\2\2\2\u09d1\u0966\3\2\2\2\u09d1\u0967\3\2\2\2\u09d1"+
		"\u0968\3\2\2\2\u09d1\u0969\3\2\2\2\u09d1\u096a\3\2\2\2\u09d1\u096b\3\2"+
		"\2\2\u09d1\u096c\3\2\2\2\u09d1\u096d\3\2\2\2\u09d1\u096e\3\2\2\2\u09d1"+
		"\u096f\3\2\2\2\u09d1\u0970\3\2\2\2\u09d1\u0971\3\2\2\2\u09d1\u0972\3\2"+
		"\2\2\u09d1\u0973\3\2\2\2\u09d1\u0974\3\2\2\2\u09d1\u0975\3\2\2\2\u09d1"+
		"\u0976\3\2\2\2\u09d1\u0977\3\2\2\2\u09d1\u0978\3\2\2\2\u09d1\u0979\3\2"+
		"\2\2\u09d1\u097a\3\2\2\2\u09d1\u097b\3\2\2\2\u09d1\u097c\3\2\2\2\u09d1"+
		"\u097d\3\2\2\2\u09d1\u097e\3\2\2\2\u09d1\u097f\3\2\2\2\u09d1\u0980\3\2"+
		"\2\2\u09d1\u0981\3\2\2\2\u09d1\u0982\3\2\2\2\u09d1\u0983\3\2\2\2\u09d1"+
		"\u0984\3\2\2\2\u09d1\u0985\3\2\2\2\u09d1\u0986\3\2\2\2\u09d1\u0987\3\2"+
		"\2\2\u09d1\u0988\3\2\2\2\u09d1\u0989\3\2\2\2\u09d1\u098a\3\2\2\2\u09d1"+
		"\u098b\3\2\2\2\u09d1\u098c\3\2\2\2\u09d1\u098d\3\2\2\2\u09d1\u098e\3\2"+
		"\2\2\u09d1\u098f\3\2\2\2\u09d1\u0990\3\2\2\2\u09d1\u0991\3\2\2\2\u09d1"+
		"\u0992\3\2\2\2\u09d1\u0993\3\2\2\2\u09d1\u0994\3\2\2\2\u09d1\u0995\3\2"+
		"\2\2\u09d1\u0996\3\2\2\2\u09d1\u0997\3\2\2\2\u09d1\u0998\3\2\2\2\u09d1"+
		"\u0999\3\2\2\2\u09d1\u099a\3\2\2\2\u09d1\u099b\3\2\2\2\u09d1\u099c\3\2"+
		"\2\2\u09d1\u099d\3\2\2\2\u09d1\u099e\3\2\2\2\u09d1\u099f\3\2\2\2\u09d1"+
		"\u09a0\3\2\2\2\u09d1\u09a1\3\2\2\2\u09d1\u09a2\3\2\2\2\u09d1\u09a3\3\2"+
		"\2\2\u09d1\u09a4\3\2\2\2\u09d1\u09a5\3\2\2\2\u09d1\u09a6\3\2\2\2\u09d1"+
		"\u09a7\3\2\2\2\u09d1\u09a8\3\2\2\2\u09d1\u09a9\3\2\2\2\u09d1\u09aa\3\2"+
		"\2\2\u09d1\u09ab\3\2\2\2\u09d1\u09ac\3\2\2\2\u09d1\u09ad\3\2\2\2\u09d1"+
		"\u09ae\3\2\2\2\u09d1\u09af\3\2\2\2\u09d1\u09b0\3\2\2\2\u09d1\u09b1\3\2"+
		"\2\2\u09d1\u09b2\3\2\2\2\u09d1\u09b3\3\2\2\2\u09d1\u09b4\3\2\2\2\u09d1"+
		"\u09b5\3\2\2\2\u09d1\u09b6\3\2\2\2\u09d1\u09b7\3\2\2\2\u09d1\u09b8\3\2"+
		"\2\2\u09d1\u09b9\3\2\2\2\u09d1\u09ba\3\2\2\2\u09d1\u09bb\3\2\2\2\u09d1"+
		"\u09bc\3\2\2\2\u09d1\u09bd\3\2\2\2\u09d1\u09be\3\2\2\2\u09d1\u09bf\3\2"+
		"\2\2\u09d1\u09c0\3\2\2\2\u09d1\u09c1\3\2\2\2\u09d1\u09c2\3\2\2\2\u09d1"+
		"\u09c3\3\2\2\2\u09d1\u09c4\3\2\2\2\u09d1\u09c5\3\2\2\2\u09d1\u09c6\3\2"+
		"\2\2\u09d1\u09c7\3\2\2\2\u09d1\u09c8\3\2\2\2\u09d1\u09c9\3\2\2\2\u09d1"+
		"\u09ca\3\2\2\2\u09d1\u09cb\3\2\2\2\u09d1\u09cc\3\2\2\2\u09d1\u09cd\3\2"+
		"\2\2\u09d1\u09ce\3\2\2\2\u09d1\u09cf\3\2\2\2\u09d1\u09d0\3\2\2\2\u09d2"+
		"\u0235\3\2\2\2\u00b6\u0237\u023a\u0240\u0245\u0247\u024c\u024f\u0252\u027d"+
		"\u028e\u0291\u0298\u029d\u02a8\u02b2\u02c1\u02cc\u02d1\u02da\u02df\u02e7"+
		"\u02ec\u02f0\u02f5\u02fa\u0309\u030f\u0314\u031e\u0323\u032d\u0332\u0337"+
		"\u033e\u0346\u0353\u035f\u0363\u0367\u036c\u0371\u0384\u038b\u0393\u0397"+
		"\u039c\u03af\u03b8\u03c7\u03c9\u03d5\u03e3\u03ea\u03f1\u03f9\u0404\u0418"+
		"\u0423\u043a\u0448\u044f\u0458\u046b\u0473\u0479\u047e\u0485\u048a\u0492"+
		"\u0497\u049e\u04a3\u04aa\u04af\u04b6\u04bd\u04c4\u04cb\u04d0\u04d7\u04de"+
		"\u04e3\u04ea\u04ef\u04f6\u04fa\u0502\u050c\u0518\u051e\u0527\u0534\u053c"+
		"\u0542\u0547\u0555\u0569\u0572\u057e\u0582\u0586\u0594\u059c\u05a5\u05b0"+
		"\u05b5\u05bc\u05bf\u05c5\u05ce\u05d4\u05e6\u05ea\u05ee\u05f3\u05fb\u0603"+
		"\u0607\u060a\u0610\u0614\u061b\u0626\u0633\u063c\u066f\u0678\u067b\u068b"+
		"\u0697\u06a3\u06af\u06b7\u06ba\u06c2\u06c5\u06ca\u06d1\u06d5\u06d9\u06dc"+
		"\u06ee\u0708\u0714\u071d\u0726\u072a\u072d\u0732\u0735\u0738\u073b\u074b"+
		"\u0754\u075d\u0764\u076f\u0775\u0777\u077f\u0798\u07a3\u07af\u07bb\u07c6"+
		"\u07cb\u07df\u07e3\u07e8\u07ee\u07f2\u07fe\u080f\u0816\u081d\u0821\u083f"+
		"\u0848\u084f\u09d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}