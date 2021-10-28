// Generated from /home/maksym/.hackolade/plugins/Cassandra/reverse_engineering/grammars/CqlParser.g4 by ANTLR 4.8
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
		K_CREATE=43, K_CUSTOM=44, K_SEARCH=45, K_DELETE=46, K_DESC=47, K_DESCRIBE=48, 
		K_DISTINCT=49, K_DROP=50, K_DURABLE_WRITES=51, K_EACH_QUORUM=52, K_ENTRIES=53, 
		K_EXECUTE=54, K_EXISTS=55, K_FALSE=56, K_FILTERING=57, K_FINALFUNC=58, 
		K_FROM=59, K_FULL=60, K_FUNCTION=61, K_FUNCTIONS=62, K_GRANT=63, K_IF=64, 
		K_IN=65, K_INDEX=66, K_INFINITY=67, K_INITCOND=68, K_INPUT=69, K_INSERT=70, 
		K_INTO=71, K_IS=72, K_JSON=73, K_KEY=74, K_KEYS=75, K_KEYSPACE=76, K_KEYSPACES=77, 
		K_LANGUAGE=78, K_LEVEL=79, K_LIMIT=80, K_LOCAL_ONE=81, K_LOCAL_QUORUM=82, 
		K_LOGGED=83, K_LOGIN=84, K_MATERIALIZED=85, K_MODIFY=86, K_NAN=87, K_NORECURSIVE=88, 
		K_NOSUPERUSER=89, K_NOT=90, K_NULL=91, K_OF=92, K_ON=93, K_ONE=94, K_OPTIONS=95, 
		K_OR=96, K_ORDER=97, K_PARTITION=98, K_PASSWORD=99, K_PER=100, K_PERMISSION=101, 
		K_PERMISSIONS=102, K_PRIMARY=103, K_QUORUM=104, K_RENAME=105, K_REPLACE=106, 
		K_REPLICATION=107, K_RETURNS=108, K_REVOKE=109, K_ROLE=110, K_ROLES=111, 
		K_INTERNAL=112, K_LDAP=113, K_SCHEME=114, K_SCHEMA=115, K_SELECT=116, 
		K_SET=117, K_SFUNC=118, K_STATIC=119, K_STORAGE=120, K_STYPE=121, K_SUPERUSER=122, 
		K_TABLE=123, K_THREE=124, K_TIMESTAMP=125, K_TO=126, K_TOKEN=127, K_TRIGGER=128, 
		K_TRUE=129, K_TRUNCATE=130, K_TTL=131, K_TWO=132, K_TYPE=133, K_UNLOGGED=134, 
		K_UPDATE=135, K_USE=136, K_USER=137, K_USING=138, K_UUID=139, K_VALUES=140, 
		K_VIEW=141, K_WHERE=142, K_WITH=143, K_WRITETIME=144, K_ASCII=145, K_CASE_SENITIVE=146, 
		K_NORMALIZE=147, K_STORAGE_ATTACHED_INDEX=148, K_SPACE_SAVING_NO_JOIN=149, 
		K_SPACE_SAVING_ALL=150, K_SPACE_SAVING_SLOW_TRIE_PRECISION=151, K_DOC_VALUES=152, 
		K_COPY_FIELD=153, K_EXCLUDED=154, K_INDEXED=155, K_COLUMNS=156, K_PROFILES=157, 
		K_CONFIG=158, K_AUTOCOMMIT_TIME=159, K_DEFAULT_QUERY_FIELD=160, K_DIRECTORY_FACTORY=161, 
		K_FILTER_CACHE_LOW_WATERMARK=162, K_FILTER_CACHE_HIGH_WATERMARK=163, K_DIRECTORY_FACTORY_CLASS=164, 
		K_MERGE_MAX_THREAD_COUNT=165, K_MERGE_MAX_MERGE_COUNT=166, K_RAM_BUFFER_SIZE=167, 
		K_REALTIME=168, K_RECOVERY=169, K_REINDEX=170, K_LENIENT=171, K_STANDARD=172, 
		K_ENCRYPTED=173, K_BIGINT=174, K_BLOB=175, K_BOOLEAN=176, K_COUNTER=177, 
		K_DATE=178, K_DECIMAL=179, K_DOUBLE=180, K_FLOAT=181, K_FROZEN=182, K_INET=183, 
		K_INT=184, K_LIST=185, K_MAP=186, K_SMALLINT=187, K_TEXT=188, K_TIMEUUID=189, 
		K_TIME=190, K_TINYINT=191, K_TUPLE=192, K_VARCHAR=193, K_VARINT=194, CODE_BLOCK=195, 
		STRING_LITERAL=196, DECIMAL_LITERAL=197, FLOAT_LITERAL=198, HEXADECIMAL_LITERAL=199, 
		REAL_LITERAL=200, OBJECT_NAME=201, UUID=202, OPERATOR_EQ=203, OPERATOR_LT=204, 
		OPERATOR_GT=205, OPERATOR_LTE=206, OPERATOR_GTE=207, K_USERS=208;
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
		RULE_clusteringOrderColumns = 69, RULE_clusteringOrder = 70, RULE_tableOptions = 71, 
		RULE_tableOptionItem = 72, RULE_tableOptionName = 73, RULE_tableOptionValue = 74, 
		RULE_optionHash = 75, RULE_optionHashItem = 76, RULE_optionHashKey = 77, 
		RULE_optionHashValue = 78, RULE_columnDefinitionList = 79, RULE_columnDefinition = 80, 
		RULE_primaryKeyColumn = 81, RULE_primaryKeyElement = 82, RULE_primaryKeyDefinition = 83, 
		RULE_singlePrimaryKey = 84, RULE_compoundKey = 85, RULE_compositeKey = 86, 
		RULE_partitionKeyList = 87, RULE_clusteringKeyList = 88, RULE_partitionKey = 89, 
		RULE_clusteringKey = 90, RULE_applyBatch = 91, RULE_beginBatch = 92, RULE_batchType = 93, 
		RULE_alterKeyspace = 94, RULE_replicationList = 95, RULE_replicationListItem = 96, 
		RULE_durableWrites = 97, RULE_use = 98, RULE_truncate = 99, RULE_createIndex = 100, 
		RULE_createSearchIndex = 101, RULE_searchIndexConfigs = 102, RULE_directoryFactory = 103, 
		RULE_searchIndexOptions = 104, RULE_searchIndexProfiles = 105, RULE_searchIndexColumnList = 106, 
		RULE_searchIndexColumn = 107, RULE_indexName = 108, RULE_indexColumnSpec = 109, 
		RULE_indexKeysSpec = 110, RULE_indexEntriesSSpec = 111, RULE_indexFullSpec = 112, 
		RULE_indexValuesSpec = 113, RULE_deleteStatement = 114, RULE_deleteColumnList = 115, 
		RULE_deleteColumnItem = 116, RULE_update = 117, RULE_ifSpec = 118, RULE_ifConditionList = 119, 
		RULE_ifCondition = 120, RULE_assignments = 121, RULE_assignmentElement = 122, 
		RULE_assignmentSet = 123, RULE_assignmentMap = 124, RULE_assignmentMapExpression = 125, 
		RULE_assignmentList = 126, RULE_assignmentTuple = 127, RULE_insert = 128, 
		RULE_usingTtlTimestamp = 129, RULE_timestamp = 130, RULE_ttl = 131, RULE_usingTimestampSpec = 132, 
		RULE_ifNotExist = 133, RULE_ifExist = 134, RULE_insertValuesSpec = 135, 
		RULE_insertColumnSpec = 136, RULE_columnList = 137, RULE_expressionList = 138, 
		RULE_expression = 139, RULE_select = 140, RULE_allowFilteringSpec = 141, 
		RULE_limitSpec = 142, RULE_fromSpec = 143, RULE_fromSpecElement = 144, 
		RULE_orderSpec = 145, RULE_orderSpecElement = 146, RULE_whereSpec = 147, 
		RULE_distinctSpec = 148, RULE_selectElements = 149, RULE_selectElement = 150, 
		RULE_relationElements = 151, RULE_relationElement = 152, RULE_relalationContains = 153, 
		RULE_relalationContainsKey = 154, RULE_functionCall = 155, RULE_functionArgs = 156, 
		RULE_constant = 157, RULE_decimalLiteral = 158, RULE_floatLiteral = 159, 
		RULE_stringLiteral = 160, RULE_booleanLiteral = 161, RULE_hexadecimalLiteral = 162, 
		RULE_keyspace = 163, RULE_table = 164, RULE_column = 165, RULE_dataType = 166, 
		RULE_dataTypeName = 167, RULE_dataTypeDefinition = 168, RULE_orderDirection = 169, 
		RULE_role = 170, RULE_trigger = 171, RULE_triggerClass = 172, RULE_materializedView = 173, 
		RULE_type = 174, RULE_aggregate = 175, RULE_functionStatement = 176, RULE_language = 177, 
		RULE_user = 178, RULE_password = 179, RULE_hashKey = 180, RULE_param = 181, 
		RULE_paramName = 182, RULE_kwAdd = 183, RULE_kwAggregate = 184, RULE_kwAll = 185, 
		RULE_kwAllPermissions = 186, RULE_kwAllow = 187, RULE_kwAlter = 188, RULE_kwAnd = 189, 
		RULE_kwApply = 190, RULE_kwAs = 191, RULE_kwAsc = 192, RULE_kwAuthorize = 193, 
		RULE_kwBatch = 194, RULE_kwBegin = 195, RULE_kwBy = 196, RULE_kwCalled = 197, 
		RULE_kwClustering = 198, RULE_kwCompact = 199, RULE_kwContains = 200, 
		RULE_kwCreate = 201, RULE_kwDelete = 202, RULE_kwDesc = 203, RULE_kwDescibe = 204, 
		RULE_kwDistinct = 205, RULE_kwDrop = 206, RULE_kwDurableWrites = 207, 
		RULE_kwEntries = 208, RULE_kwExecute = 209, RULE_kwExists = 210, RULE_kwFiltering = 211, 
		RULE_kwFinalfunc = 212, RULE_kwFrom = 213, RULE_kwFull = 214, RULE_kwFunction = 215, 
		RULE_kwFunctions = 216, RULE_kwGrant = 217, RULE_kwIf = 218, RULE_kwIn = 219, 
		RULE_kwIndex = 220, RULE_kwCustom = 221, RULE_kwSearch = 222, RULE_kwAscii = 223, 
		RULE_kwNormalize = 224, RULE_kwStorageAttachedIndex = 225, RULE_kwSpaceSavingNoJoin = 226, 
		RULE_kwSpaceSavingAll = 227, RULE_kwSpaceSavingSlowTriePrecision = 228, 
		RULE_kwCopyField = 229, RULE_kwDocValues = 230, RULE_kwExcluded = 231, 
		RULE_kwIndexed = 232, RULE_kwColumns = 233, RULE_kwProfiles = 234, RULE_kwConfig = 235, 
		RULE_kwAutoCommitTime = 236, RULE_kwDefaultQueryField = 237, RULE_kwDirectoryFactory = 238, 
		RULE_kwFilterCacheLowWaterMark = 239, RULE_kwFilterCacheHighWaterMark = 240, 
		RULE_kwDirectoryFactoryClass = 241, RULE_kwMergeMaxThreadCount = 242, 
		RULE_kwMergeMaxMergeCount = 243, RULE_kwRamBufferSize = 244, RULE_kwRealtime = 245, 
		RULE_kwRecovery = 246, RULE_kwReindex = 247, RULE_kwLenient = 248, RULE_kwStandard = 249, 
		RULE_kwEncrypted = 250, RULE_kwCaseSensitive = 251, RULE_kwInitcond = 252, 
		RULE_kwInput = 253, RULE_kwInsert = 254, RULE_kwInto = 255, RULE_kwIs = 256, 
		RULE_kwJson = 257, RULE_kwKey = 258, RULE_kwKeys = 259, RULE_kwKeyspace = 260, 
		RULE_kwKeyspaces = 261, RULE_kwLanguage = 262, RULE_kwLimit = 263, RULE_kwList = 264, 
		RULE_kwLogged = 265, RULE_kwLogin = 266, RULE_kwMaterialized = 267, RULE_kwModify = 268, 
		RULE_kwNosuperuser = 269, RULE_kwNorecursive = 270, RULE_kwNot = 271, 
		RULE_kwNull = 272, RULE_kwOf = 273, RULE_kwOn = 274, RULE_kwOptions = 275, 
		RULE_kwOr = 276, RULE_kwOrder = 277, RULE_kwPassword = 278, RULE_kwPrimary = 279, 
		RULE_kwRename = 280, RULE_kwReplace = 281, RULE_kwReplication = 282, RULE_kwReturns = 283, 
		RULE_kwRole = 284, RULE_kwInternal = 285, RULE_kwLdap = 286, RULE_kwScheme = 287, 
		RULE_kwRoles = 288, RULE_kwSelect = 289, RULE_kwSet = 290, RULE_kwSfunc = 291, 
		RULE_kwStorage = 292, RULE_kwStype = 293, RULE_kwSuperuser = 294, RULE_kwTable = 295, 
		RULE_kwTimestamp = 296, RULE_kwTo = 297, RULE_kwTrigger = 298, RULE_kwTruncate = 299, 
		RULE_kwTtl = 300, RULE_kwType = 301, RULE_kwUnlogged = 302, RULE_kwUpdate = 303, 
		RULE_kwUse = 304, RULE_kwUser = 305, RULE_kwUsers = 306, RULE_kwUsing = 307, 
		RULE_kwValues = 308, RULE_kwView = 309, RULE_kwWhere = 310, RULE_kwWith = 311, 
		RULE_kwRevoke = 312, RULE_eof = 313, RULE_syntaxBracketLr = 314, RULE_syntaxBracketRr = 315, 
		RULE_syntaxBracketLc = 316, RULE_syntaxBracketRc = 317, RULE_syntaxBracketLa = 318, 
		RULE_syntaxBracketRa = 319, RULE_syntaxBracketLs = 320, RULE_syntaxBracketRs = 321, 
		RULE_syntaxComma = 322, RULE_syntaxColon = 323, RULE_id = 324;
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
			"dropKeyspace", "dropIndex", "createTable", "withElement", "clusteringOrderColumns", 
			"clusteringOrder", "tableOptions", "tableOptionItem", "tableOptionName", 
			"tableOptionValue", "optionHash", "optionHashItem", "optionHashKey", 
			"optionHashValue", "columnDefinitionList", "columnDefinition", "primaryKeyColumn", 
			"primaryKeyElement", "primaryKeyDefinition", "singlePrimaryKey", "compoundKey", 
			"compositeKey", "partitionKeyList", "clusteringKeyList", "partitionKey", 
			"clusteringKey", "applyBatch", "beginBatch", "batchType", "alterKeyspace", 
			"replicationList", "replicationListItem", "durableWrites", "use", "truncate", 
			"createIndex", "createSearchIndex", "searchIndexConfigs", "directoryFactory", 
			"searchIndexOptions", "searchIndexProfiles", "searchIndexColumnList", 
			"searchIndexColumn", "indexName", "indexColumnSpec", "indexKeysSpec", 
			"indexEntriesSSpec", "indexFullSpec", "indexValuesSpec", "deleteStatement", 
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
			"kwFunction", "kwFunctions", "kwGrant", "kwIf", "kwIn", "kwIndex", "kwCustom", 
			"kwSearch", "kwAscii", "kwNormalize", "kwStorageAttachedIndex", "kwSpaceSavingNoJoin", 
			"kwSpaceSavingAll", "kwSpaceSavingSlowTriePrecision", "kwCopyField", 
			"kwDocValues", "kwExcluded", "kwIndexed", "kwColumns", "kwProfiles", 
			"kwConfig", "kwAutoCommitTime", "kwDefaultQueryField", "kwDirectoryFactory", 
			"kwFilterCacheLowWaterMark", "kwFilterCacheHighWaterMark", "kwDirectoryFactoryClass", 
			"kwMergeMaxThreadCount", "kwMergeMaxMergeCount", "kwRamBufferSize", "kwRealtime", 
			"kwRecovery", "kwReindex", "kwLenient", "kwStandard", "kwEncrypted", 
			"kwCaseSensitive", "kwInitcond", "kwInput", "kwInsert", "kwInto", "kwIs", 
			"kwJson", "kwKey", "kwKeys", "kwKeyspace", "kwKeyspaces", "kwLanguage", 
			"kwLimit", "kwList", "kwLogged", "kwLogin", "kwMaterialized", "kwModify", 
			"kwNosuperuser", "kwNorecursive", "kwNot", "kwNull", "kwOf", "kwOn", 
			"kwOptions", "kwOr", "kwOrder", "kwPassword", "kwPrimary", "kwRename", 
			"kwReplace", "kwReplication", "kwReturns", "kwRole", "kwInternal", "kwLdap", 
			"kwScheme", "kwRoles", "kwSelect", "kwSet", "kwSfunc", "kwStorage", "kwStype", 
			"kwSuperuser", "kwTable", "kwTimestamp", "kwTo", "kwTrigger", "kwTruncate", 
			"kwTtl", "kwType", "kwUnlogged", "kwUpdate", "kwUse", "kwUser", "kwUsers", 
			"kwUsing", "kwValues", "kwView", "kwWhere", "kwWith", "kwRevoke", "eof", 
			"syntaxBracketLr", "syntaxBracketRr", "syntaxBracketLc", "syntaxBracketRc", 
			"syntaxBracketLa", "syntaxBracketRa", "syntaxBracketLs", "syntaxBracketRs", 
			"syntaxComma", "syntaxColon", "id"
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
			"K_COMPACT", "K_CONSISTENCY", "K_CONTAINS", "K_CREATE", "K_CUSTOM", "K_SEARCH", 
			"K_DELETE", "K_DESC", "K_DESCRIBE", "K_DISTINCT", "K_DROP", "K_DURABLE_WRITES", 
			"K_EACH_QUORUM", "K_ENTRIES", "K_EXECUTE", "K_EXISTS", "K_FALSE", "K_FILTERING", 
			"K_FINALFUNC", "K_FROM", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_GRANT", 
			"K_IF", "K_IN", "K_INDEX", "K_INFINITY", "K_INITCOND", "K_INPUT", "K_INSERT", 
			"K_INTO", "K_IS", "K_JSON", "K_KEY", "K_KEYS", "K_KEYSPACE", "K_KEYSPACES", 
			"K_LANGUAGE", "K_LEVEL", "K_LIMIT", "K_LOCAL_ONE", "K_LOCAL_QUORUM", 
			"K_LOGGED", "K_LOGIN", "K_MATERIALIZED", "K_MODIFY", "K_NAN", "K_NORECURSIVE", 
			"K_NOSUPERUSER", "K_NOT", "K_NULL", "K_OF", "K_ON", "K_ONE", "K_OPTIONS", 
			"K_OR", "K_ORDER", "K_PARTITION", "K_PASSWORD", "K_PER", "K_PERMISSION", 
			"K_PERMISSIONS", "K_PRIMARY", "K_QUORUM", "K_RENAME", "K_REPLACE", "K_REPLICATION", 
			"K_RETURNS", "K_REVOKE", "K_ROLE", "K_ROLES", "K_INTERNAL", "K_LDAP", 
			"K_SCHEME", "K_SCHEMA", "K_SELECT", "K_SET", "K_SFUNC", "K_STATIC", "K_STORAGE", 
			"K_STYPE", "K_SUPERUSER", "K_TABLE", "K_THREE", "K_TIMESTAMP", "K_TO", 
			"K_TOKEN", "K_TRIGGER", "K_TRUE", "K_TRUNCATE", "K_TTL", "K_TWO", "K_TYPE", 
			"K_UNLOGGED", "K_UPDATE", "K_USE", "K_USER", "K_USING", "K_UUID", "K_VALUES", 
			"K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", "K_ASCII", "K_CASE_SENITIVE", 
			"K_NORMALIZE", "K_STORAGE_ATTACHED_INDEX", "K_SPACE_SAVING_NO_JOIN", 
			"K_SPACE_SAVING_ALL", "K_SPACE_SAVING_SLOW_TRIE_PRECISION", "K_DOC_VALUES", 
			"K_COPY_FIELD", "K_EXCLUDED", "K_INDEXED", "K_COLUMNS", "K_PROFILES", 
			"K_CONFIG", "K_AUTOCOMMIT_TIME", "K_DEFAULT_QUERY_FIELD", "K_DIRECTORY_FACTORY", 
			"K_FILTER_CACHE_LOW_WATERMARK", "K_FILTER_CACHE_HIGH_WATERMARK", "K_DIRECTORY_FACTORY_CLASS", 
			"K_MERGE_MAX_THREAD_COUNT", "K_MERGE_MAX_MERGE_COUNT", "K_RAM_BUFFER_SIZE", 
			"K_REALTIME", "K_RECOVERY", "K_REINDEX", "K_LENIENT", "K_STANDARD", "K_ENCRYPTED", 
			"K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_COUNTER", "K_DATE", "K_DECIMAL", 
			"K_DOUBLE", "K_FLOAT", "K_FROZEN", "K_INET", "K_INT", "K_LIST", "K_MAP", 
			"K_SMALLINT", "K_TEXT", "K_TIMEUUID", "K_TIME", "K_TINYINT", "K_TUPLE", 
			"K_VARCHAR", "K_VARINT", "CODE_BLOCK", "STRING_LITERAL", "DECIMAL_LITERAL", 
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
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << K_ALTER) | (1L << K_APPLY) | (1L << K_BEGIN) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DROP) | (1L << K_GRANT))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_INSERT - 70)) | (1L << (K_REVOKE - 70)) | (1L << (K_SELECT - 70)) | (1L << (K_TRUNCATE - 70)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (K_UPDATE - 135)) | (1L << (K_USE - 135)) | (1L << (K_LIST - 135)))) != 0)) {
				{
				setState(650);
				cqls();
				}
			}

			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUSMINUS) {
				{
				setState(653);
				match(MINUSMINUS);
				}
			}

			setState(656);
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
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(665);
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
						setState(658);
						cql();
						setState(660);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUSMINUS) {
							{
							setState(659);
							match(MINUSMINUS);
							}
						}

						setState(662);
						statementSeparator();
						}
						break;
					case SEMI:
						{
						setState(664);
						empty();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(678);
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
				setState(670);
				cql();
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUSMINUS) {
						{
						setState(671);
						match(MINUSMINUS);
						}
					}

					setState(674);
					statementSeparator();
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(677);
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
			setState(680);
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
			setState(682);
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
		public CreateSearchIndexContext createSearchIndex() {
			return getRuleContext(CreateSearchIndexContext.class,0);
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
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				alterKeyspace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				alterMaterializedView();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				alterRole();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(687);
				alterTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				alterType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(689);
				alterUser();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(690);
				applyBatch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(691);
				createAggregate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(692);
				createFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(693);
				createIndex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(694);
				createSearchIndex();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(695);
				createKeyspace();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(696);
				createMaterializedView();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(697);
				createRole();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(698);
				createTable();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(699);
				createTrigger();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(700);
				createType();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(701);
				createUser();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(702);
				deleteStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(703);
				dropAggregate();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(704);
				dropFunction();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(705);
				dropIndex();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(706);
				dropKeyspace();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(707);
				dropMaterializedView();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(708);
				dropRole();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(709);
				dropTable();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(710);
				dropTrigger();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(711);
				dropType();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(712);
				dropUser();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(713);
				grant();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(714);
				insert();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(715);
				listPermissions();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(716);
				listRoles();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(717);
				revoke();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(718);
				select();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(719);
				truncate();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(720);
				update();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(721);
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
			setState(724);
			kwRevoke();
			setState(725);
			priviledge();
			setState(726);
			kwOn();
			setState(727);
			resource();
			setState(728);
			kwFrom();
			setState(729);
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
			setState(731);
			kwList();
			setState(732);
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
			setState(734);
			kwList();
			setState(735);
			kwRoles();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(736);
				kwOf();
				setState(737);
				role();
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NORECURSIVE) {
				{
				setState(741);
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
			setState(744);
			kwList();
			setState(745);
			priviledge();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(746);
				kwOn();
				setState(747);
				resource();
				}
			}

			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(751);
				kwOf();
				setState(752);
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
			setState(756);
			kwGrant();
			setState(757);
			priviledge();
			setState(758);
			kwOn();
			setState(759);
			resource();
			setState(760);
			kwTo();
			setState(761);
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
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(763);
					kwAll();
					}
					break;
				case 2:
					{
					setState(764);
					kwAllPermissions();
					}
					break;
				}
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				kwAlter();
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				kwAuthorize();
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				kwDescibe();
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
				kwExecute();
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(771);
				kwCreate();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(772);
				kwDrop();
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 8);
				{
				setState(773);
				kwModify();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(774);
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
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				kwAll();
				setState(778);
				kwFunctions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				kwAll();
				setState(781);
				kwFunctions();
				setState(782);
				kwIn();
				setState(783);
				kwKeyspace();
				setState(784);
				keyspace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				kwFunction();
				setState(790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(787);
					keyspace();
					setState(788);
					match(DOT);
					}
					break;
				}
				setState(792);
				functionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				kwAll();
				setState(795);
				kwKeyspaces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(797);
				kwKeyspace();
				setState(798);
				keyspace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(800);
					kwTable();
					}
					break;
				}
				setState(806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(803);
					keyspace();
					setState(804);
					match(DOT);
					}
					break;
				}
				setState(808);
				table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(809);
				kwAll();
				setState(810);
				kwRoles();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(812);
				kwRole();
				setState(813);
				role();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(817);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INTERNAL:
					{
					setState(815);
					kwInternal();
					}
					break;
				case K_LDAP:
					{
					setState(816);
					kwLdap();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(819);
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
			setState(823);
			kwCreate();
			setState(824);
			kwUser();
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(825);
				ifNotExist();
				}
				break;
			}
			setState(828);
			user();
			setState(829);
			kwWith();
			setState(830);
			kwPassword();
			setState(831);
			stringLiteral();
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				{
				setState(832);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				{
				setState(833);
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
			setState(836);
			kwCreate();
			setState(837);
			kwRole();
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(838);
				ifNotExist();
				}
				break;
			}
			setState(841);
			role();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(842);
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
			setState(845);
			kwCreate();
			setState(846);
			kwType();
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(847);
				ifNotExist();
				}
				break;
			}
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(850);
				keyspace();
				setState(851);
				match(DOT);
				}
				break;
			}
			setState(855);
			type();
			setState(856);
			syntaxBracketLr();
			setState(857);
			typeMemberColumnList();
			setState(858);
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
			setState(860);
			column();
			setState(861);
			dataType();
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(862);
				syntaxComma();
				setState(863);
				column();
				setState(864);
				dataType();
				}
				}
				setState(870);
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
			setState(871);
			kwCreate();
			setState(872);
			kwTrigger();
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(873);
				ifNotExist();
				}
				break;
			}
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(876);
				keyspace();
				setState(877);
				match(DOT);
				}
				break;
			}
			setState(881);
			trigger();
			setState(882);
			kwUsing();
			setState(883);
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
			setState(885);
			kwCreate();
			setState(886);
			kwMaterialized();
			setState(887);
			kwView();
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(888);
				ifNotExist();
				}
				break;
			}
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(891);
				keyspace();
				setState(892);
				match(DOT);
				}
				break;
			}
			setState(896);
			materializedView();
			setState(897);
			kwAs();
			setState(898);
			kwSelect();
			setState(899);
			columnList();
			setState(900);
			kwFrom();
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(901);
				keyspace();
				setState(902);
				match(DOT);
				}
				break;
			}
			setState(906);
			table();
			setState(907);
			materializedViewWhere();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(908);
				primaryKeyElement();
				}
			}

			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(911);
				kwWith();
				setState(912);
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
			setState(916);
			kwWhere();
			setState(917);
			columnNotNullList();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(918);
				kwAnd();
				setState(919);
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
			setState(923);
			columnNotNull();
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(924);
					kwAnd();
					setState(925);
					columnNotNull();
					}
					} 
				}
				setState(931);
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
			setState(932);
			column();
			setState(933);
			kwIs();
			setState(934);
			kwNot();
			setState(935);
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
			setState(937);
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
			setState(939);
			kwCreate();
			setState(940);
			kwKeyspace();
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(941);
				ifNotExist();
				}
				break;
			}
			setState(944);
			keyspace();
			setState(945);
			kwWith();
			setState(946);
			kwReplication();
			setState(947);
			match(OPERATOR_EQ);
			setState(948);
			syntaxBracketLc();
			setState(949);
			replicationList();
			setState(950);
			syntaxBracketRc();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(951);
				kwAnd();
				setState(952);
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
			setState(956);
			kwCreate();
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(957);
				orReplace();
				}
			}

			setState(960);
			kwFunction();
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(961);
				ifNotExist();
				}
				break;
			}
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(964);
				keyspace();
				setState(965);
				match(DOT);
				}
				break;
			}
			setState(969);
			functionStatement();
			setState(970);
			syntaxBracketLr();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_BIGINT - 174)) | (1L << (K_BLOB - 174)) | (1L << (K_BOOLEAN - 174)) | (1L << (K_COUNTER - 174)) | (1L << (K_DATE - 174)) | (1L << (K_DECIMAL - 174)) | (1L << (K_DOUBLE - 174)) | (1L << (K_FLOAT - 174)) | (1L << (K_FROZEN - 174)) | (1L << (K_INET - 174)) | (1L << (K_INT - 174)) | (1L << (K_LIST - 174)) | (1L << (K_MAP - 174)) | (1L << (K_SMALLINT - 174)) | (1L << (K_TEXT - 174)) | (1L << (K_TIMEUUID - 174)) | (1L << (K_TIME - 174)) | (1L << (K_TINYINT - 174)) | (1L << (K_TUPLE - 174)) | (1L << (K_VARCHAR - 174)) | (1L << (K_VARINT - 174)) | (1L << (OBJECT_NAME - 174)) | (1L << (K_USERS - 174)))) != 0)) {
				{
				setState(971);
				paramList();
				}
			}

			setState(974);
			syntaxBracketRr();
			setState(975);
			returnMode();
			setState(976);
			kwReturns();
			setState(977);
			dataType();
			setState(978);
			kwLanguage();
			setState(979);
			language();
			setState(980);
			kwAs();
			setState(981);
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
			setState(983);
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
			setState(985);
			param();
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(986);
				syntaxComma();
				setState(987);
				param();
				}
				}
				setState(993);
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
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CALLED:
				{
				setState(994);
				kwCalled();
				}
				break;
			case K_RETURNS:
				{
				setState(995);
				kwReturns();
				setState(996);
				kwNull();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1000);
			kwOn();
			setState(1001);
			kwNull();
			setState(1002);
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
			setState(1004);
			kwCreate();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(1005);
				orReplace();
				}
			}

			setState(1008);
			kwAggregate();
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(1009);
				ifNotExist();
				}
				break;
			}
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(1012);
				keyspace();
				setState(1013);
				match(DOT);
				}
				break;
			}
			setState(1017);
			aggregate();
			setState(1018);
			syntaxBracketLr();
			setState(1019);
			dataType();
			setState(1020);
			syntaxBracketRr();
			setState(1021);
			kwSfunc();
			setState(1022);
			functionStatement();
			setState(1023);
			kwStype();
			setState(1024);
			dataType();
			setState(1025);
			kwFinalfunc();
			setState(1026);
			functionStatement();
			setState(1027);
			kwInitcond();
			setState(1028);
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
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				initCondList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				initCondListNested();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
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
			setState(1036);
			syntaxBracketLc();
			setState(1037);
			initCondHashItem();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1038);
				syntaxComma();
				setState(1039);
				initCondHashItem();
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1046);
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
			setState(1048);
			hashKey();
			setState(1049);
			match(COLON);
			setState(1050);
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
			setState(1052);
			syntaxBracketLr();
			setState(1053);
			initCondList();
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LR_BRACKET || _la==COMMA) {
				{
				setState(1058);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(1054);
					syntaxComma();
					setState(1055);
					constant();
					}
					break;
				case LR_BRACKET:
					{
					setState(1057);
					initCondList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
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
			setState(1065);
			syntaxBracketLr();
			setState(1066);
			constant();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1067);
				syntaxComma();
				setState(1068);
				constant();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1075);
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
			setState(1077);
			kwOr();
			setState(1078);
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
			setState(1080);
			kwAlter();
			setState(1081);
			kwUser();
			setState(1082);
			user();
			setState(1083);
			kwWith();
			setState(1084);
			userPassword();
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOSUPERUSER || _la==K_SUPERUSER) {
				{
				setState(1085);
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
			setState(1088);
			kwPassword();
			setState(1089);
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
			setState(1093);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
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
			setState(1095);
			kwAlter();
			setState(1096);
			kwType();
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(1097);
				keyspace();
				setState(1098);
				match(DOT);
				}
				break;
			}
			setState(1102);
			type();
			setState(1103);
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
			setState(1108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				alterTypeAlterType();
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				alterTypeAdd();
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
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
			setState(1110);
			kwRename();
			setState(1111);
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
			setState(1113);
			alterTypeRenameItem();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1114);
				kwAnd();
				setState(1115);
				alterTypeRenameItem();
				}
				}
				setState(1121);
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
			setState(1122);
			column();
			setState(1123);
			kwTo();
			setState(1124);
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
			setState(1126);
			kwAdd();
			setState(1127);
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
			setState(1129);
			kwAlter();
			setState(1130);
			column();
			setState(1131);
			kwType();
			setState(1132);
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
			setState(1134);
			kwAlter();
			setState(1135);
			kwTable();
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(1136);
				keyspace();
				setState(1137);
				match(DOT);
				}
				break;
			}
			setState(1141);
			table();
			setState(1142);
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
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				alterTableAdd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				alterTableDropColumns();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				alterTableDropColumns();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				alterTableDropCompactStorage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1148);
				alterTableRename();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1149);
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
			setState(1152);
			kwWith();
			setState(1153);
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
			setState(1155);
			kwRename();
			setState(1156);
			column();
			setState(1157);
			kwTo();
			setState(1158);
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
			setState(1160);
			kwDrop();
			setState(1161);
			kwCompact();
			setState(1162);
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
			setState(1164);
			kwDrop();
			setState(1165);
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
			setState(1167);
			column();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1168);
				syntaxComma();
				setState(1169);
				column();
				}
				}
				setState(1175);
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
			setState(1176);
			kwAdd();
			setState(1177);
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
			setState(1179);
			column();
			setState(1180);
			dataType();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1181);
				syntaxComma();
				setState(1182);
				column();
				setState(1183);
				dataType();
				}
				}
				setState(1189);
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
			setState(1190);
			kwAlter();
			setState(1191);
			kwRole();
			setState(1192);
			role();
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1193);
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
			setState(1196);
			kwWith();
			{
			setState(1197);
			roleWithOptions();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1198);
				kwAnd();
				setState(1199);
				roleWithOptions();
				}
				}
				setState(1205);
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
			setState(1222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PASSWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				kwPassword();
				setState(1207);
				match(OPERATOR_EQ);
				setState(1208);
				stringLiteral();
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				kwLogin();
				setState(1211);
				match(OPERATOR_EQ);
				setState(1212);
				booleanLiteral();
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1214);
				kwSuperuser();
				setState(1215);
				match(OPERATOR_EQ);
				setState(1216);
				booleanLiteral();
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218);
				kwOptions();
				setState(1219);
				match(OPERATOR_EQ);
				setState(1220);
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
			setState(1224);
			kwAlter();
			setState(1225);
			kwMaterialized();
			setState(1226);
			kwView();
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
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
			materializedView();
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1233);
				kwWith();
				setState(1234);
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
			setState(1238);
			kwDrop();
			setState(1239);
			kwUser();
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1240);
				ifExist();
				}
				break;
			}
			setState(1243);
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
			setState(1245);
			kwDrop();
			setState(1246);
			kwType();
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1247);
				ifExist();
				}
				break;
			}
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1250);
				keyspace();
				setState(1251);
				match(DOT);
				}
				break;
			}
			setState(1255);
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
			setState(1257);
			kwDrop();
			setState(1258);
			kwMaterialized();
			setState(1259);
			kwView();
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(1260);
				ifExist();
				}
				break;
			}
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1263);
				keyspace();
				setState(1264);
				match(DOT);
				}
				break;
			}
			setState(1268);
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
			setState(1270);
			kwDrop();
			setState(1271);
			kwAggregate();
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1272);
				ifExist();
				}
				break;
			}
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1275);
				keyspace();
				setState(1276);
				match(DOT);
				}
				break;
			}
			setState(1280);
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
			setState(1282);
			kwDrop();
			setState(1283);
			kwFunction();
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(1284);
				ifExist();
				}
				break;
			}
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1287);
				keyspace();
				setState(1288);
				match(DOT);
				}
				break;
			}
			setState(1292);
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
			setState(1294);
			kwDrop();
			setState(1295);
			kwTrigger();
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1296);
				ifExist();
				}
				break;
			}
			setState(1299);
			trigger();
			setState(1300);
			kwOn();
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1301);
				keyspace();
				setState(1302);
				match(DOT);
				}
				break;
			}
			setState(1306);
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
			setState(1308);
			kwDrop();
			setState(1309);
			kwRole();
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1310);
				ifExist();
				}
				break;
			}
			setState(1313);
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
			setState(1315);
			kwDrop();
			setState(1316);
			kwTable();
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1317);
				ifExist();
				}
				break;
			}
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1320);
				keyspace();
				setState(1321);
				match(DOT);
				}
				break;
			}
			setState(1325);
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
			setState(1327);
			kwDrop();
			setState(1328);
			kwKeyspace();
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1329);
				ifExist();
				}
				break;
			}
			setState(1332);
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
			setState(1334);
			kwDrop();
			setState(1335);
			kwIndex();
			setState(1337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1336);
				ifExist();
				}
				break;
			}
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1339);
				keyspace();
				setState(1340);
				match(DOT);
				}
				break;
			}
			setState(1344);
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
			setState(1346);
			kwCreate();
			setState(1347);
			kwTable();
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(1348);
				ifNotExist();
				}
				break;
			}
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1351);
				keyspace();
				setState(1352);
				match(DOT);
				}
				break;
			}
			setState(1356);
			table();
			setState(1357);
			syntaxBracketLr();
			setState(1358);
			columnDefinitionList();
			setState(1359);
			syntaxBracketRr();
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1360);
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
			setState(1363);
			kwWith();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_BIGINT - 174)) | (1L << (K_BLOB - 174)) | (1L << (K_BOOLEAN - 174)) | (1L << (K_COUNTER - 174)) | (1L << (K_DATE - 174)) | (1L << (K_DECIMAL - 174)) | (1L << (K_DOUBLE - 174)) | (1L << (K_FLOAT - 174)) | (1L << (K_FROZEN - 174)) | (1L << (K_INET - 174)) | (1L << (K_INT - 174)) | (1L << (K_LIST - 174)) | (1L << (K_MAP - 174)) | (1L << (K_SMALLINT - 174)) | (1L << (K_TEXT - 174)) | (1L << (K_TIMEUUID - 174)) | (1L << (K_TIME - 174)) | (1L << (K_TINYINT - 174)) | (1L << (K_TUPLE - 174)) | (1L << (K_VARCHAR - 174)) | (1L << (K_VARINT - 174)) | (1L << (OBJECT_NAME - 174)) | (1L << (K_USERS - 174)))) != 0)) {
				{
				setState(1364);
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

	public static class ClusteringOrderColumnsContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<OrderDirectionContext> orderDirection() {
			return getRuleContexts(OrderDirectionContext.class);
		}
		public OrderDirectionContext orderDirection(int i) {
			return getRuleContext(OrderDirectionContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public ClusteringOrderColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusteringOrderColumns; }
	}

	public final ClusteringOrderColumnsContext clusteringOrderColumns() throws RecognitionException {
		ClusteringOrderColumnsContext _localctx = new ClusteringOrderColumnsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_clusteringOrderColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			column();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1368);
				orderDirection();
				}
			}

			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1371);
				syntaxComma();
				setState(1372);
				column();
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1373);
					orderDirection();
					}
				}

				}
				}
				setState(1380);
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
		public ClusteringOrderColumnsContext clusteringOrderColumns() {
			return getRuleContext(ClusteringOrderColumnsContext.class,0);
		}
		public SyntaxBracketRrContext syntaxBracketRr() {
			return getRuleContext(SyntaxBracketRrContext.class,0);
		}
		public ClusteringOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusteringOrder; }
	}

	public final ClusteringOrderContext clusteringOrder() throws RecognitionException {
		ClusteringOrderContext _localctx = new ClusteringOrderContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_clusteringOrder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			kwClustering();
			setState(1382);
			kwOrder();
			setState(1383);
			kwBy();
			setState(1384);
			syntaxBracketLr();
			setState(1385);
			clusteringOrderColumns();
			setState(1386);
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
		enterRule(_localctx, 142, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			tableOptionItem();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1389);
				kwAnd();
				setState(1390);
				tableOptionItem();
				}
				}
				setState(1396);
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
		enterRule(_localctx, 144, RULE_tableOptionItem);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				tableOptionName();
				setState(1398);
				match(OPERATOR_EQ);
				setState(1399);
				tableOptionValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				tableOptionName();
				setState(1402);
				match(OPERATOR_EQ);
				setState(1403);
				optionHash();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1405);
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
		enterRule(_localctx, 146, RULE_tableOptionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TableOptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptionValue; }
	}

	public final TableOptionValueContext tableOptionValue() throws RecognitionException {
		TableOptionValueContext _localctx = new TableOptionValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tableOptionValue);
		try {
			setState(1413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				stringLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				floatLiteral();
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
				enterOuterAlt(_localctx, 3);
				{
				setState(1412);
				id();
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
		enterRule(_localctx, 150, RULE_optionHash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			syntaxBracketLc();
			setState(1416);
			optionHashItem();
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1417);
				syntaxComma();
				setState(1418);
				optionHashItem();
				}
				}
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
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
		enterRule(_localctx, 152, RULE_optionHashItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			optionHashKey();
			setState(1428);
			match(COLON);
			setState(1429);
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
		enterRule(_localctx, 154, RULE_optionHashKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
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
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
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
		enterRule(_localctx, 156, RULE_optionHashValue);
		try {
			setState(1436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				stringLiteral();
				}
				break;
			case K_FALSE:
			case K_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				booleanLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1435);
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
		enterRule(_localctx, 158, RULE_columnDefinitionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1438);
			columnDefinition();
			}
			setState(1444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					syntaxComma();
					setState(1440);
					columnDefinition();
					}
					} 
				}
				setState(1446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1447);
				syntaxComma();
				setState(1448);
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
		enterRule(_localctx, 160, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			column();
			setState(1453);
			dataType();
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(1454);
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
		enterRule(_localctx, 162, RULE_primaryKeyColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			kwPrimary();
			setState(1458);
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
		enterRule(_localctx, 164, RULE_primaryKeyElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			kwPrimary();
			setState(1461);
			kwKey();
			setState(1462);
			syntaxBracketLr();
			setState(1463);
			primaryKeyDefinition();
			setState(1464);
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
		enterRule(_localctx, 166, RULE_primaryKeyDefinition);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				singlePrimaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				compoundKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
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
		enterRule(_localctx, 168, RULE_singlePrimaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
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
		enterRule(_localctx, 170, RULE_compoundKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			partitionKey();
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1474);
				syntaxComma();
				setState(1475);
				clusteringKeyList();
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
		enterRule(_localctx, 172, RULE_compositeKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			syntaxBracketLr();
			setState(1480);
			partitionKeyList();
			setState(1481);
			syntaxBracketRr();
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1482);
				syntaxComma();
				setState(1483);
				clusteringKeyList();
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
		enterRule(_localctx, 174, RULE_partitionKeyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1487);
			partitionKey();
			}
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1488);
				syntaxComma();
				setState(1489);
				partitionKey();
				}
				}
				setState(1495);
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
		enterRule(_localctx, 176, RULE_clusteringKeyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1496);
			clusteringKey();
			}
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1497);
				syntaxComma();
				setState(1498);
				clusteringKey();
				}
				}
				setState(1504);
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
		enterRule(_localctx, 178, RULE_partitionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
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
		enterRule(_localctx, 180, RULE_clusteringKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
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
		enterRule(_localctx, 182, RULE_applyBatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			kwApply();
			setState(1510);
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
		enterRule(_localctx, 184, RULE_beginBatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			kwBegin();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOGGED || _la==K_UNLOGGED) {
				{
				setState(1513);
				batchType();
				}
			}

			setState(1516);
			kwBatch();
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1517);
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
		enterRule(_localctx, 186, RULE_batchType);
		try {
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_LOGGED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				kwLogged();
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
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
		enterRule(_localctx, 188, RULE_alterKeyspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			kwAlter();
			setState(1525);
			kwKeyspace();
			setState(1526);
			keyspace();
			setState(1527);
			kwWith();
			setState(1528);
			kwReplication();
			setState(1529);
			match(OPERATOR_EQ);
			setState(1530);
			syntaxBracketLc();
			setState(1531);
			replicationList();
			setState(1532);
			syntaxBracketRc();
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(1533);
				kwAnd();
				setState(1534);
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
		enterRule(_localctx, 190, RULE_replicationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1538);
			replicationListItem();
			}
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1539);
				syntaxComma();
				setState(1540);
				replicationListItem();
				}
				}
				setState(1546);
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
		enterRule(_localctx, 192, RULE_replicationListItem);
		try {
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				match(STRING_LITERAL);
				setState(1548);
				match(COLON);
				setState(1549);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				match(STRING_LITERAL);
				setState(1551);
				match(COLON);
				setState(1552);
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
		enterRule(_localctx, 194, RULE_durableWrites);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			kwDurableWrites();
			setState(1556);
			match(OPERATOR_EQ);
			setState(1557);
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
		enterRule(_localctx, 196, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			kwUse();
			setState(1560);
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
		enterRule(_localctx, 198, RULE_truncate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			kwTruncate();
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1563);
				kwTable();
				}
				break;
			}
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1566);
				keyspace();
				setState(1567);
				match(DOT);
				}
				break;
			}
			setState(1571);
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
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	 
		public CreateIndexContext() { }
		public void copyFrom(CreateIndexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CustomIndexContext extends CreateIndexContext {
		public BooleanLiteralContext caseSensitiveOption;
		public BooleanLiteralContext normalizeOption;
		public BooleanLiteralContext asciiOption;
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwCustomContext kwCustom() {
			return getRuleContext(KwCustomContext.class,0);
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
		public KwUsingContext kwUsing() {
			return getRuleContext(KwUsingContext.class,0);
		}
		public KwStorageAttachedIndexContext kwStorageAttachedIndex() {
			return getRuleContext(KwStorageAttachedIndexContext.class,0);
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
		public KwWithContext kwWith() {
			return getRuleContext(KwWithContext.class,0);
		}
		public KwOptionsContext kwOptions() {
			return getRuleContext(KwOptionsContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(CqlParser.OPERATOR_EQ, 0); }
		public TerminalNode LC_BRACKET() { return getToken(CqlParser.LC_BRACKET, 0); }
		public KwCaseSensitiveContext kwCaseSensitive() {
			return getRuleContext(KwCaseSensitiveContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(CqlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CqlParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CqlParser.COMMA, i);
		}
		public KwNormalizeContext kwNormalize() {
			return getRuleContext(KwNormalizeContext.class,0);
		}
		public KwAsciiContext kwAscii() {
			return getRuleContext(KwAsciiContext.class,0);
		}
		public TerminalNode RC_BRACKET() { return getToken(CqlParser.RC_BRACKET, 0); }
		public List<BooleanLiteralContext> booleanLiteral() {
			return getRuleContexts(BooleanLiteralContext.class);
		}
		public BooleanLiteralContext booleanLiteral(int i) {
			return getRuleContext(BooleanLiteralContext.class,i);
		}
		public CustomIndexContext(CreateIndexContext ctx) { copyFrom(ctx); }
	}
	public static class SecondaryIndexContext extends CreateIndexContext {
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
		public SecondaryIndexContext(CreateIndexContext ctx) { copyFrom(ctx); }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_createIndex);
		int _la;
		try {
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new SecondaryIndexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				kwCreate();
				setState(1574);
				kwIndex();
				setState(1576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1575);
					ifNotExist();
					}
					break;
				}
				setState(1579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1578);
					indexName();
					}
					break;
				}
				setState(1581);
				kwOn();
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1582);
					keyspace();
					setState(1583);
					match(DOT);
					}
					break;
				}
				setState(1587);
				table();
				setState(1588);
				syntaxBracketLr();
				setState(1589);
				indexColumnSpec();
				setState(1590);
				syntaxBracketRr();
				}
				break;
			case 2:
				_localctx = new CustomIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				kwCreate();
				setState(1593);
				kwCustom();
				setState(1594);
				kwIndex();
				setState(1596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1595);
					ifNotExist();
					}
					break;
				}
				setState(1599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1598);
					indexName();
					}
					break;
				}
				setState(1601);
				kwOn();
				setState(1605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1602);
					keyspace();
					setState(1603);
					match(DOT);
					}
					break;
				}
				setState(1607);
				table();
				setState(1608);
				syntaxBracketLr();
				setState(1609);
				indexColumnSpec();
				setState(1610);
				syntaxBracketRr();
				setState(1611);
				kwUsing();
				setState(1612);
				kwStorageAttachedIndex();
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITH) {
					{
					setState(1613);
					kwWith();
					setState(1614);
					kwOptions();
					setState(1615);
					match(OPERATOR_EQ);
					setState(1616);
					match(LC_BRACKET);
					setState(1617);
					kwCaseSensitive();
					setState(1618);
					match(COLON);
					setState(1619);
					((CustomIndexContext)_localctx).caseSensitiveOption = booleanLiteral();
					setState(1620);
					match(COMMA);
					setState(1621);
					kwNormalize();
					setState(1622);
					match(COLON);
					setState(1623);
					((CustomIndexContext)_localctx).normalizeOption = booleanLiteral();
					setState(1624);
					match(COMMA);
					setState(1625);
					kwAscii();
					setState(1626);
					match(COLON);
					setState(1627);
					((CustomIndexContext)_localctx).asciiOption = booleanLiteral();
					setState(1628);
					match(RC_BRACKET);
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

	public static class CreateSearchIndexContext extends ParserRuleContext {
		public KwCreateContext kwCreate() {
			return getRuleContext(KwCreateContext.class,0);
		}
		public KwSearchContext kwSearch() {
			return getRuleContext(KwSearchContext.class,0);
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
		public IfNotExistContext ifNotExist() {
			return getRuleContext(IfNotExistContext.class,0);
		}
		public KeyspaceContext keyspace() {
			return getRuleContext(KeyspaceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CqlParser.DOT, 0); }
		public TerminalNode K_WITH() { return getToken(CqlParser.K_WITH, 0); }
		public KwColumnsContext kwColumns() {
			return getRuleContext(KwColumnsContext.class,0);
		}
		public SearchIndexColumnListContext searchIndexColumnList() {
			return getRuleContext(SearchIndexColumnListContext.class,0);
		}
		public KwProfilesContext kwProfiles() {
			return getRuleContext(KwProfilesContext.class,0);
		}
		public SearchIndexProfilesContext searchIndexProfiles() {
			return getRuleContext(SearchIndexProfilesContext.class,0);
		}
		public SearchIndexConfigsContext searchIndexConfigs() {
			return getRuleContext(SearchIndexConfigsContext.class,0);
		}
		public SearchIndexOptionsContext searchIndexOptions() {
			return getRuleContext(SearchIndexOptionsContext.class,0);
		}
		public List<KwAndContext> kwAnd() {
			return getRuleContexts(KwAndContext.class);
		}
		public KwAndContext kwAnd(int i) {
			return getRuleContext(KwAndContext.class,i);
		}
		public CreateSearchIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSearchIndex; }
	}

	public final CreateSearchIndexContext createSearchIndex() throws RecognitionException {
		CreateSearchIndexContext _localctx = new CreateSearchIndexContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_createSearchIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			kwCreate();
			setState(1635);
			kwSearch();
			setState(1636);
			kwIndex();
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1637);
				ifNotExist();
				}
			}

			setState(1640);
			kwOn();
			setState(1644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1641);
				keyspace();
				setState(1642);
				match(DOT);
				}
				break;
			}
			setState(1646);
			table();
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1647);
				match(K_WITH);
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMNS) {
					{
					setState(1648);
					kwColumns();
					setState(1649);
					searchIndexColumnList();
					}
				}

				setState(1659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AND) {
						{
						setState(1653);
						kwAnd();
						}
					}

					setState(1656);
					kwProfiles();
					setState(1657);
					searchIndexProfiles();
					}
					break;
				}
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1662);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AND) {
						{
						setState(1661);
						kwAnd();
						}
					}

					setState(1664);
					searchIndexConfigs();
					}
					break;
				}
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AND || _la==K_OPTIONS) {
					{
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AND) {
						{
						setState(1667);
						kwAnd();
						}
					}

					setState(1670);
					searchIndexOptions();
					}
				}

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

	public static class SearchIndexConfigsContext extends ParserRuleContext {
		public DecimalLiteralContext autoCommitTimeConfig;
		public StringLiteralContext defaultQueryFieldConfig;
		public DirectoryFactoryContext directoryFactoryConfig;
		public DecimalLiteralContext filterCacheLowWaterMarkConfig;
		public DecimalLiteralContext filterCacheHighWaterMarkConfig;
		public StringLiteralContext directoryFactoryClassConfig;
		public DecimalLiteralContext mergeMaxThreadCountConfig;
		public DecimalLiteralContext mergeMaxMergeCountConfig;
		public DecimalLiteralContext ramBufferSizeConfig;
		public BooleanLiteralContext realtimeConfig;
		public KwConfigContext kwConfig() {
			return getRuleContext(KwConfigContext.class,0);
		}
		public TerminalNode LC_BRACKET() { return getToken(CqlParser.LC_BRACKET, 0); }
		public TerminalNode RC_BRACKET() { return getToken(CqlParser.RC_BRACKET, 0); }
		public KwAutoCommitTimeContext kwAutoCommitTime() {
			return getRuleContext(KwAutoCommitTimeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(CqlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CqlParser.COLON, i);
		}
		public KwDefaultQueryFieldContext kwDefaultQueryField() {
			return getRuleContext(KwDefaultQueryFieldContext.class,0);
		}
		public KwDirectoryFactoryContext kwDirectoryFactory() {
			return getRuleContext(KwDirectoryFactoryContext.class,0);
		}
		public KwFilterCacheLowWaterMarkContext kwFilterCacheLowWaterMark() {
			return getRuleContext(KwFilterCacheLowWaterMarkContext.class,0);
		}
		public KwFilterCacheHighWaterMarkContext kwFilterCacheHighWaterMark() {
			return getRuleContext(KwFilterCacheHighWaterMarkContext.class,0);
		}
		public KwDirectoryFactoryClassContext kwDirectoryFactoryClass() {
			return getRuleContext(KwDirectoryFactoryClassContext.class,0);
		}
		public KwMergeMaxThreadCountContext kwMergeMaxThreadCount() {
			return getRuleContext(KwMergeMaxThreadCountContext.class,0);
		}
		public KwMergeMaxMergeCountContext kwMergeMaxMergeCount() {
			return getRuleContext(KwMergeMaxMergeCountContext.class,0);
		}
		public KwRamBufferSizeContext kwRamBufferSize() {
			return getRuleContext(KwRamBufferSizeContext.class,0);
		}
		public KwRealtimeContext kwRealtime() {
			return getRuleContext(KwRealtimeContext.class,0);
		}
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public DirectoryFactoryContext directoryFactory() {
			return getRuleContext(DirectoryFactoryContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public SearchIndexConfigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexConfigs; }
	}

	public final SearchIndexConfigsContext searchIndexConfigs() throws RecognitionException {
		SearchIndexConfigsContext _localctx = new SearchIndexConfigsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_searchIndexConfigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			kwConfig();
			setState(1676);
			match(LC_BRACKET);
			setState(1681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOCOMMIT_TIME) {
				{
				setState(1677);
				kwAutoCommitTime();
				setState(1678);
				match(COLON);
				setState(1679);
				((SearchIndexConfigsContext)_localctx).autoCommitTimeConfig = decimalLiteral();
				}
			}

			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1683);
					syntaxComma();
					}
				}

				setState(1686);
				kwDefaultQueryField();
				setState(1687);
				match(COLON);
				setState(1688);
				((SearchIndexConfigsContext)_localctx).defaultQueryFieldConfig = stringLiteral();
				}
				break;
			}
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1692);
					syntaxComma();
					}
				}

				setState(1695);
				kwDirectoryFactory();
				setState(1696);
				match(COLON);
				setState(1697);
				((SearchIndexConfigsContext)_localctx).directoryFactoryConfig = directoryFactory();
				}
				break;
			}
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1701);
					syntaxComma();
					}
				}

				setState(1704);
				kwFilterCacheLowWaterMark();
				setState(1705);
				match(COLON);
				setState(1706);
				((SearchIndexConfigsContext)_localctx).filterCacheLowWaterMarkConfig = decimalLiteral();
				}
				break;
			}
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1710);
					syntaxComma();
					}
				}

				setState(1713);
				kwFilterCacheHighWaterMark();
				setState(1714);
				match(COLON);
				setState(1715);
				((SearchIndexConfigsContext)_localctx).filterCacheHighWaterMarkConfig = decimalLiteral();
				}
				break;
			}
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1719);
					syntaxComma();
					}
				}

				setState(1722);
				kwDirectoryFactoryClass();
				setState(1723);
				match(COLON);
				setState(1724);
				((SearchIndexConfigsContext)_localctx).directoryFactoryClassConfig = stringLiteral();
				}
				break;
			}
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1728);
					syntaxComma();
					}
				}

				setState(1731);
				kwMergeMaxThreadCount();
				setState(1732);
				match(COLON);
				setState(1733);
				((SearchIndexConfigsContext)_localctx).mergeMaxThreadCountConfig = decimalLiteral();
				}
				break;
			}
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1737);
					syntaxComma();
					}
				}

				setState(1740);
				kwMergeMaxMergeCount();
				setState(1741);
				match(COLON);
				setState(1742);
				((SearchIndexConfigsContext)_localctx).mergeMaxMergeCountConfig = decimalLiteral();
				}
				break;
			}
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1746);
					syntaxComma();
					}
				}

				setState(1749);
				kwRamBufferSize();
				setState(1750);
				match(COLON);
				setState(1751);
				((SearchIndexConfigsContext)_localctx).ramBufferSizeConfig = decimalLiteral();
				}
				break;
			}
			setState(1762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_REALTIME) {
				{
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1755);
					syntaxComma();
					}
				}

				setState(1758);
				kwRealtime();
				setState(1759);
				match(COLON);
				setState(1760);
				((SearchIndexConfigsContext)_localctx).realtimeConfig = booleanLiteral();
				}
			}

			setState(1764);
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

	public static class DirectoryFactoryContext extends ParserRuleContext {
		public KwStandardContext kwStandard() {
			return getRuleContext(KwStandardContext.class,0);
		}
		public KwEncryptedContext kwEncrypted() {
			return getRuleContext(KwEncryptedContext.class,0);
		}
		public DirectoryFactoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryFactory; }
	}

	public final DirectoryFactoryContext directoryFactory() throws RecognitionException {
		DirectoryFactoryContext _localctx = new DirectoryFactoryContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_directoryFactory);
		try {
			setState(1768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STANDARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766);
				kwStandard();
				}
				break;
			case K_ENCRYPTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1767);
				kwEncrypted();
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

	public static class SearchIndexOptionsContext extends ParserRuleContext {
		public BooleanLiteralContext recoveryOption;
		public BooleanLiteralContext reindexOption;
		public BooleanLiteralContext lenientOption;
		public KwOptionsContext kwOptions() {
			return getRuleContext(KwOptionsContext.class,0);
		}
		public TerminalNode LC_BRACKET() { return getToken(CqlParser.LC_BRACKET, 0); }
		public TerminalNode RC_BRACKET() { return getToken(CqlParser.RC_BRACKET, 0); }
		public KwRecoveryContext kwRecovery() {
			return getRuleContext(KwRecoveryContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(CqlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CqlParser.COLON, i);
		}
		public KwReindexContext kwReindex() {
			return getRuleContext(KwReindexContext.class,0);
		}
		public KwLenientContext kwLenient() {
			return getRuleContext(KwLenientContext.class,0);
		}
		public List<BooleanLiteralContext> booleanLiteral() {
			return getRuleContexts(BooleanLiteralContext.class);
		}
		public BooleanLiteralContext booleanLiteral(int i) {
			return getRuleContext(BooleanLiteralContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public SearchIndexOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexOptions; }
	}

	public final SearchIndexOptionsContext searchIndexOptions() throws RecognitionException {
		SearchIndexOptionsContext _localctx = new SearchIndexOptionsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_searchIndexOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			kwOptions();
			setState(1771);
			match(LC_BRACKET);
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECOVERY) {
				{
				setState(1772);
				kwRecovery();
				setState(1773);
				match(COLON);
				setState(1774);
				((SearchIndexOptionsContext)_localctx).recoveryOption = booleanLiteral();
				}
			}

			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1778);
					syntaxComma();
					}
				}

				setState(1781);
				kwReindex();
				setState(1782);
				match(COLON);
				setState(1783);
				((SearchIndexOptionsContext)_localctx).reindexOption = booleanLiteral();
				}
				break;
			}
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_LENIENT) {
				{
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1787);
					syntaxComma();
					}
				}

				setState(1790);
				kwLenient();
				setState(1791);
				match(COLON);
				setState(1792);
				((SearchIndexOptionsContext)_localctx).lenientOption = booleanLiteral();
				}
			}

			setState(1796);
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

	public static class SearchIndexProfilesContext extends ParserRuleContext {
		public KwSpaceSavingAllContext kwSpaceSavingAll() {
			return getRuleContext(KwSpaceSavingAllContext.class,0);
		}
		public KwSpaceSavingNoJoinContext kwSpaceSavingNoJoin() {
			return getRuleContext(KwSpaceSavingNoJoinContext.class,0);
		}
		public KwSpaceSavingSlowTriePrecisionContext kwSpaceSavingSlowTriePrecision() {
			return getRuleContext(KwSpaceSavingSlowTriePrecisionContext.class,0);
		}
		public SearchIndexProfilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexProfiles; }
	}

	public final SearchIndexProfilesContext searchIndexProfiles() throws RecognitionException {
		SearchIndexProfilesContext _localctx = new SearchIndexProfilesContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_searchIndexProfiles);
		try {
			setState(1801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SPACE_SAVING_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				kwSpaceSavingAll();
				}
				break;
			case K_SPACE_SAVING_NO_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				kwSpaceSavingNoJoin();
				}
				break;
			case K_SPACE_SAVING_SLOW_TRIE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1800);
				kwSpaceSavingSlowTriePrecision();
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

	public static class SearchIndexColumnListContext extends ParserRuleContext {
		public List<SearchIndexColumnContext> searchIndexColumn() {
			return getRuleContexts(SearchIndexColumnContext.class);
		}
		public SearchIndexColumnContext searchIndexColumn(int i) {
			return getRuleContext(SearchIndexColumnContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public SearchIndexColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexColumnList; }
	}

	public final SearchIndexColumnListContext searchIndexColumnList() throws RecognitionException {
		SearchIndexColumnListContext _localctx = new SearchIndexColumnListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_searchIndexColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			searchIndexColumn();
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1804);
				syntaxComma();
				setState(1805);
				searchIndexColumn();
				}
				}
				setState(1811);
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

	public static class SearchIndexColumnContext extends ParserRuleContext {
		public BooleanLiteralContext copyFieldOption;
		public BooleanLiteralContext docValuesOption;
		public BooleanLiteralContext excludedOption;
		public BooleanLiteralContext indexedOption;
		public Token star;
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode LC_BRACKET() { return getToken(CqlParser.LC_BRACKET, 0); }
		public TerminalNode RC_BRACKET() { return getToken(CqlParser.RC_BRACKET, 0); }
		public KwCopyFieldContext kwCopyField() {
			return getRuleContext(KwCopyFieldContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(CqlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CqlParser.COLON, i);
		}
		public KwDocValuesContext kwDocValues() {
			return getRuleContext(KwDocValuesContext.class,0);
		}
		public KwExcludedContext kwExcluded() {
			return getRuleContext(KwExcludedContext.class,0);
		}
		public KwIndexedContext kwIndexed() {
			return getRuleContext(KwIndexedContext.class,0);
		}
		public List<BooleanLiteralContext> booleanLiteral() {
			return getRuleContexts(BooleanLiteralContext.class);
		}
		public BooleanLiteralContext booleanLiteral(int i) {
			return getRuleContext(BooleanLiteralContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public TerminalNode STAR() { return getToken(CqlParser.STAR, 0); }
		public SearchIndexColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexColumn; }
	}

	public final SearchIndexColumnContext searchIndexColumn() throws RecognitionException {
		SearchIndexColumnContext _localctx = new SearchIndexColumnContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_searchIndexColumn);
		int _la;
		try {
			setState(1888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DQUOTE:
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
				setState(1812);
				column();
				setState(1848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LC_BRACKET) {
					{
					setState(1813);
					match(LC_BRACKET);
					setState(1818);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_COPY_FIELD) {
						{
						setState(1814);
						kwCopyField();
						setState(1815);
						match(COLON);
						setState(1816);
						((SearchIndexColumnContext)_localctx).copyFieldOption = booleanLiteral();
						}
					}

					setState(1827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1821);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1820);
							syntaxComma();
							}
						}

						setState(1823);
						kwDocValues();
						setState(1824);
						match(COLON);
						setState(1825);
						((SearchIndexColumnContext)_localctx).docValuesOption = booleanLiteral();
						}
						break;
					}
					setState(1836);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						setState(1830);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1829);
							syntaxComma();
							}
						}

						setState(1832);
						kwExcluded();
						setState(1833);
						match(COLON);
						setState(1834);
						((SearchIndexColumnContext)_localctx).excludedOption = booleanLiteral();
						}
						break;
					}
					setState(1845);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA || _la==K_INDEXED) {
						{
						setState(1839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1838);
							syntaxComma();
							}
						}

						setState(1841);
						kwIndexed();
						setState(1842);
						match(COLON);
						setState(1843);
						((SearchIndexColumnContext)_localctx).indexedOption = booleanLiteral();
						}
					}

					setState(1847);
					match(RC_BRACKET);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1850);
				((SearchIndexColumnContext)_localctx).star = match(STAR);
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LC_BRACKET) {
					{
					setState(1851);
					match(LC_BRACKET);
					setState(1856);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_COPY_FIELD) {
						{
						setState(1852);
						kwCopyField();
						setState(1853);
						match(COLON);
						setState(1854);
						((SearchIndexColumnContext)_localctx).copyFieldOption = booleanLiteral();
						}
					}

					setState(1865);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						setState(1859);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1858);
							syntaxComma();
							}
						}

						setState(1861);
						kwDocValues();
						setState(1862);
						match(COLON);
						setState(1863);
						((SearchIndexColumnContext)_localctx).docValuesOption = booleanLiteral();
						}
						break;
					}
					setState(1874);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(1868);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1867);
							syntaxComma();
							}
						}

						setState(1870);
						kwExcluded();
						setState(1871);
						match(COLON);
						setState(1872);
						((SearchIndexColumnContext)_localctx).excludedOption = booleanLiteral();
						}
						break;
					}
					setState(1883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA || _la==K_INDEXED) {
						{
						setState(1877);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1876);
							syntaxComma();
							}
						}

						setState(1879);
						kwIndexed();
						setState(1880);
						match(COLON);
						setState(1881);
						((SearchIndexColumnContext)_localctx).indexedOption = booleanLiteral();
						}
					}

					setState(1885);
					match(RC_BRACKET);
					}
				}

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
		enterRule(_localctx, 216, RULE_indexName);
		try {
			setState(1892);
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
				setState(1890);
				id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1891);
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
		public IndexValuesSpecContext indexValuesSpec() {
			return getRuleContext(IndexValuesSpecContext.class,0);
		}
		public IndexColumnSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnSpec; }
	}

	public final IndexColumnSpecContext indexColumnSpec() throws RecognitionException {
		IndexColumnSpecContext _localctx = new IndexColumnSpecContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_indexColumnSpec);
		try {
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1894);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1895);
				indexKeysSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1896);
				indexEntriesSSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1897);
				indexFullSpec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1898);
				indexValuesSpec();
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
		enterRule(_localctx, 220, RULE_indexKeysSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			kwKeys();
			setState(1902);
			syntaxBracketLr();
			setState(1903);
			column();
			setState(1904);
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
		enterRule(_localctx, 222, RULE_indexEntriesSSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			kwEntries();
			setState(1907);
			syntaxBracketLr();
			setState(1908);
			column();
			setState(1909);
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
		enterRule(_localctx, 224, RULE_indexFullSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			kwFull();
			setState(1912);
			syntaxBracketLr();
			setState(1913);
			column();
			setState(1914);
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

	public static class IndexValuesSpecContext extends ParserRuleContext {
		public KwValuesContext kwValues() {
			return getRuleContext(KwValuesContext.class,0);
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
		public IndexValuesSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexValuesSpec; }
	}

	public final IndexValuesSpecContext indexValuesSpec() throws RecognitionException {
		IndexValuesSpecContext _localctx = new IndexValuesSpecContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_indexValuesSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			kwValues();
			setState(1917);
			syntaxBracketLr();
			setState(1918);
			column();
			setState(1919);
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
		enterRule(_localctx, 228, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1921);
				beginBatch();
				}
			}

			setState(1924);
			kwDelete();
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1925);
				deleteColumnList();
				}
				break;
			}
			setState(1928);
			fromSpec();
			setState(1930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1929);
				usingTimestampSpec();
				}
			}

			setState(1932);
			whereSpec();
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1933);
				ifExist();
				}
				break;
			case 2:
				{
				setState(1934);
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
		enterRule(_localctx, 230, RULE_deleteColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1937);
			deleteColumnItem();
			}
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1938);
				syntaxComma();
				setState(1939);
				deleteColumnItem();
				}
				}
				setState(1945);
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
		enterRule(_localctx, 232, RULE_deleteColumnItem);
		try {
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1947);
				id();
				setState(1948);
				match(LS_BRACKET);
				setState(1951);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(1949);
					stringLiteral();
					}
					break;
				case DECIMAL_LITERAL:
					{
					setState(1950);
					decimalLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1953);
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
		enterRule(_localctx, 234, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(1957);
				beginBatch();
				}
			}

			setState(1960);
			kwUpdate();
			setState(1964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1961);
				keyspace();
				setState(1962);
				match(DOT);
				}
				break;
			}
			setState(1966);
			table();
			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1967);
				usingTtlTimestamp();
				}
			}

			setState(1970);
			kwSet();
			setState(1971);
			assignments();
			setState(1972);
			whereSpec();
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1973);
				ifExist();
				}
				break;
			case 2:
				{
				setState(1974);
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
		enterRule(_localctx, 236, RULE_ifSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			kwIf();
			setState(1978);
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
		enterRule(_localctx, 238, RULE_ifConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1980);
			ifCondition();
			}
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1981);
				kwAnd();
				setState(1982);
				ifCondition();
				}
				}
				setState(1988);
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
		enterRule(_localctx, 240, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			id();
			setState(1990);
			match(OPERATOR_EQ);
			setState(1991);
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
		enterRule(_localctx, 242, RULE_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1993);
			assignmentElement();
			}
			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1994);
				syntaxComma();
				setState(1995);
				assignmentElement();
				}
				}
				setState(2001);
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
		enterRule(_localctx, 244, RULE_assignmentElement);
		int _la;
		try {
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2002);
				id();
				setState(2003);
				match(OPERATOR_EQ);
				setState(2008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(2004);
					constant();
					}
					break;
				case 2:
					{
					setState(2005);
					assignmentMap();
					}
					break;
				case 3:
					{
					setState(2006);
					assignmentSet();
					}
					break;
				case 4:
					{
					setState(2007);
					assignmentList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				id();
				setState(2011);
				match(OPERATOR_EQ);
				setState(2012);
				id();
				setState(2013);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2014);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				id();
				setState(2017);
				match(OPERATOR_EQ);
				setState(2018);
				id();
				setState(2019);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2020);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2022);
				id();
				setState(2023);
				match(OPERATOR_EQ);
				setState(2024);
				assignmentSet();
				setState(2025);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2026);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2028);
				id();
				setState(2029);
				match(OPERATOR_EQ);
				setState(2030);
				id();
				setState(2031);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2032);
				assignmentMap();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2034);
				id();
				setState(2035);
				match(OPERATOR_EQ);
				setState(2036);
				assignmentMap();
				setState(2037);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2038);
				id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2040);
				id();
				setState(2041);
				match(OPERATOR_EQ);
				setState(2042);
				id();
				setState(2043);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2044);
				assignmentList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2046);
				id();
				setState(2047);
				match(OPERATOR_EQ);
				setState(2048);
				assignmentList();
				setState(2049);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2050);
				id();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2052);
				id();
				setState(2053);
				syntaxBracketLs();
				setState(2054);
				decimalLiteral();
				setState(2055);
				syntaxBracketRs();
				setState(2056);
				match(OPERATOR_EQ);
				setState(2057);
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
		enterRule(_localctx, 246, RULE_assignmentSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			syntaxBracketLc();
			setState(2071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_BIGINT - 174)) | (1L << (K_BLOB - 174)) | (1L << (K_BOOLEAN - 174)) | (1L << (K_COUNTER - 174)) | (1L << (K_DATE - 174)) | (1L << (K_DECIMAL - 174)) | (1L << (K_DOUBLE - 174)) | (1L << (K_FLOAT - 174)) | (1L << (K_FROZEN - 174)) | (1L << (K_INET - 174)) | (1L << (K_INT - 174)) | (1L << (K_LIST - 174)) | (1L << (K_MAP - 174)) | (1L << (K_SMALLINT - 174)) | (1L << (K_TEXT - 174)) | (1L << (K_TIMEUUID - 174)) | (1L << (K_TIME - 174)) | (1L << (K_TINYINT - 174)) | (1L << (K_TUPLE - 174)) | (1L << (K_VARCHAR - 174)) | (1L << (K_VARINT - 174)) | (1L << (CODE_BLOCK - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (DECIMAL_LITERAL - 174)) | (1L << (FLOAT_LITERAL - 174)) | (1L << (HEXADECIMAL_LITERAL - 174)) | (1L << (OBJECT_NAME - 174)) | (1L << (UUID - 174)) | (1L << (K_USERS - 174)))) != 0)) {
				{
				setState(2062);
				constant();
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2063);
					syntaxComma();
					setState(2064);
					expression();
					}
					}
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2073);
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
		enterRule(_localctx, 248, RULE_assignmentMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			syntaxBracketLc();
			{
			setState(2076);
			constant();
			setState(2077);
			syntaxColon();
			setState(2078);
			expression();
			}
			setState(2087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2080);
				syntaxComma();
				setState(2081);
				constant();
				setState(2082);
				syntaxColon();
				setState(2083);
				expression();
				}
				}
				setState(2089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2090);
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
		enterRule(_localctx, 250, RULE_assignmentMapExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			syntaxBracketLc();
			setState(2093);
			expression();
			setState(2099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2094);
				syntaxComma();
				setState(2095);
				expression();
				}
				}
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2102);
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
		enterRule(_localctx, 252, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			syntaxBracketLs();
			setState(2105);
			constant();
			setState(2111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2106);
				syntaxComma();
				setState(2107);
				expression();
				}
				}
				setState(2113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2114);
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
		enterRule(_localctx, 254, RULE_assignmentTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			syntaxBracketLr();
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(2117);
				expression();
				setState(2134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(2123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2118);
						syntaxComma();
						setState(2119);
						expression();
						}
						}
						setState(2125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2126);
						syntaxComma();
						setState(2127);
						assignmentTuple();
						}
						}
						setState(2133);
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
				setState(2136);
				assignmentTuple();
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2137);
					syntaxComma();
					setState(2138);
					assignmentTuple();
					}
					}
					setState(2144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2147);
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
		enterRule(_localctx, 256, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(2149);
				beginBatch();
				}
			}

			setState(2152);
			kwInsert();
			setState(2153);
			kwInto();
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(2154);
				keyspace();
				setState(2155);
				match(DOT);
				}
				break;
			}
			setState(2159);
			table();
			setState(2161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(2160);
				insertColumnSpec();
				}
			}

			setState(2163);
			insertValuesSpec();
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(2164);
				ifNotExist();
				}
			}

			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(2167);
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
		enterRule(_localctx, 258, RULE_usingTtlTimestamp);
		try {
			setState(2186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				kwUsing();
				setState(2171);
				ttl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2173);
				kwUsing();
				setState(2174);
				ttl();
				setState(2175);
				kwAnd();
				setState(2176);
				timestamp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2178);
				kwUsing();
				setState(2179);
				timestamp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2181);
				kwUsing();
				setState(2182);
				timestamp();
				setState(2183);
				kwAnd();
				setState(2184);
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
		enterRule(_localctx, 260, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			kwTimestamp();
			setState(2189);
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
		enterRule(_localctx, 262, RULE_ttl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			kwTtl();
			setState(2192);
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
		enterRule(_localctx, 264, RULE_usingTimestampSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			kwUsing();
			setState(2195);
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
		enterRule(_localctx, 266, RULE_ifNotExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			kwIf();
			setState(2198);
			kwNot();
			setState(2199);
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
		enterRule(_localctx, 268, RULE_ifExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			kwIf();
			setState(2202);
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
		enterRule(_localctx, 270, RULE_insertValuesSpec);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(2204);
				kwValues();
				setState(2205);
				match(LR_BRACKET);
				setState(2206);
				expressionList();
				setState(2207);
				match(RR_BRACKET);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2209);
				kwJson();
				setState(2210);
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
		enterRule(_localctx, 272, RULE_insertColumnSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			match(LR_BRACKET);
			setState(2215);
			columnList();
			setState(2216);
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
		enterRule(_localctx, 274, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			column();
			setState(2224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2219);
				syntaxComma();
				setState(2220);
				column();
				}
				}
				setState(2226);
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
		enterRule(_localctx, 276, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			expression();
			setState(2233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2228);
				syntaxComma();
				setState(2229);
				expression();
				}
				}
				setState(2235);
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
		enterRule(_localctx, 278, RULE_expression);
		try {
			setState(2242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2236);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2237);
				assignmentMap();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2238);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2239);
				assignmentList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2240);
				assignmentTuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2241);
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
		enterRule(_localctx, 280, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			kwSelect();
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(2245);
				distinctSpec();
				}
				break;
			}
			setState(2249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(2248);
				kwJson();
				}
				break;
			}
			setState(2251);
			selectElements();
			setState(2252);
			fromSpec();
			setState(2254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(2253);
				whereSpec();
				}
			}

			setState(2257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(2256);
				orderSpec();
				}
			}

			setState(2260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(2259);
				limitSpec();
				}
			}

			setState(2263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALLOW) {
				{
				setState(2262);
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
		enterRule(_localctx, 282, RULE_allowFilteringSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			kwAllow();
			setState(2266);
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
		enterRule(_localctx, 284, RULE_limitSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			kwLimit();
			setState(2269);
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
		enterRule(_localctx, 286, RULE_fromSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			kwFrom();
			setState(2272);
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
		enterRule(_localctx, 288, RULE_fromSpecElement);
		try {
			setState(2279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2275);
				id();
				setState(2276);
				match(DOT);
				setState(2277);
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
		enterRule(_localctx, 290, RULE_orderSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			kwOrder();
			setState(2282);
			kwBy();
			setState(2283);
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
		enterRule(_localctx, 292, RULE_orderSpecElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			id();
			setState(2288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				{
				setState(2286);
				kwAsc();
				}
				break;
			case K_DESC:
				{
				setState(2287);
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
		enterRule(_localctx, 294, RULE_whereSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			kwWhere();
			setState(2291);
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
		enterRule(_localctx, 296, RULE_distinctSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
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
		enterRule(_localctx, 298, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(2295);
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
				setState(2296);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2299);
				syntaxComma();
				setState(2300);
				selectElement();
				}
				}
				setState(2306);
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
		enterRule(_localctx, 300, RULE_selectElement);
		int _la;
		try {
			setState(2323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2307);
				id();
				setState(2308);
				match(DOT);
				setState(2309);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
				id();
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(2312);
					kwAs();
					setState(2313);
					id();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2317);
				functionCall();
				setState(2321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(2318);
					kwAs();
					setState(2319);
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
		enterRule(_localctx, 302, RULE_relationElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2325);
			relationElement();
			}
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(2326);
				kwAnd();
				setState(2327);
				relationElement();
				}
				}
				setState(2333);
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
		enterRule(_localctx, 304, RULE_relationElement);
		int _la;
		try {
			setState(2407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				id();
				setState(2335);
				_la = _input.LA(1);
				if ( !(((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (OPERATOR_EQ - 203)) | (1L << (OPERATOR_LT - 203)) | (1L << (OPERATOR_GT - 203)) | (1L << (OPERATOR_LTE - 203)) | (1L << (OPERATOR_GTE - 203)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2336);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				id();
				setState(2339);
				match(DOT);
				setState(2340);
				id();
				setState(2341);
				_la = _input.LA(1);
				if ( !(((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (OPERATOR_EQ - 203)) | (1L << (OPERATOR_LT - 203)) | (1L << (OPERATOR_GT - 203)) | (1L << (OPERATOR_LTE - 203)) | (1L << (OPERATOR_GTE - 203)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2342);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2344);
				functionCall();
				setState(2345);
				_la = _input.LA(1);
				if ( !(((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (OPERATOR_EQ - 203)) | (1L << (OPERATOR_LT - 203)) | (1L << (OPERATOR_GT - 203)) | (1L << (OPERATOR_LTE - 203)) | (1L << (OPERATOR_GTE - 203)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2346);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2348);
				functionCall();
				setState(2349);
				_la = _input.LA(1);
				if ( !(((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (OPERATOR_EQ - 203)) | (1L << (OPERATOR_LT - 203)) | (1L << (OPERATOR_GT - 203)) | (1L << (OPERATOR_LTE - 203)) | (1L << (OPERATOR_GTE - 203)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2350);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2352);
				id();
				setState(2353);
				kwIn();
				setState(2354);
				match(LR_BRACKET);
				setState(2356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_BIGINT - 174)) | (1L << (K_BLOB - 174)) | (1L << (K_BOOLEAN - 174)) | (1L << (K_COUNTER - 174)) | (1L << (K_DATE - 174)) | (1L << (K_DECIMAL - 174)) | (1L << (K_DOUBLE - 174)) | (1L << (K_FLOAT - 174)) | (1L << (K_FROZEN - 174)) | (1L << (K_INET - 174)) | (1L << (K_INT - 174)) | (1L << (K_LIST - 174)) | (1L << (K_MAP - 174)) | (1L << (K_SMALLINT - 174)) | (1L << (K_TEXT - 174)) | (1L << (K_TIMEUUID - 174)) | (1L << (K_TIME - 174)) | (1L << (K_TINYINT - 174)) | (1L << (K_TUPLE - 174)) | (1L << (K_VARCHAR - 174)) | (1L << (K_VARINT - 174)) | (1L << (CODE_BLOCK - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (DECIMAL_LITERAL - 174)) | (1L << (FLOAT_LITERAL - 174)) | (1L << (HEXADECIMAL_LITERAL - 174)) | (1L << (OBJECT_NAME - 174)) | (1L << (UUID - 174)) | (1L << (K_USERS - 174)))) != 0)) {
					{
					setState(2355);
					functionArgs();
					}
				}

				setState(2358);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2360);
				match(LR_BRACKET);
				setState(2361);
				id();
				setState(2367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2362);
					syntaxComma();
					setState(2363);
					id();
					}
					}
					setState(2369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2370);
				match(RR_BRACKET);
				setState(2371);
				kwIn();
				setState(2372);
				match(LR_BRACKET);
				setState(2373);
				assignmentTuple();
				setState(2379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2374);
					syntaxComma();
					setState(2375);
					assignmentTuple();
					}
					}
					setState(2381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2382);
				match(RR_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2384);
				match(LR_BRACKET);
				setState(2385);
				id();
				setState(2391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2386);
					syntaxComma();
					setState(2387);
					id();
					}
					}
					setState(2393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2394);
				match(RR_BRACKET);
				setState(2395);
				_la = _input.LA(1);
				if ( !(((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (OPERATOR_EQ - 203)) | (1L << (OPERATOR_LT - 203)) | (1L << (OPERATOR_GT - 203)) | (1L << (OPERATOR_LTE - 203)) | (1L << (OPERATOR_GTE - 203)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(2396);
				assignmentTuple();
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2397);
					syntaxComma();
					setState(2398);
					assignmentTuple();
					}
					}
					setState(2404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2405);
				relalationContainsKey();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2406);
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
		enterRule(_localctx, 306, RULE_relalationContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			id();
			setState(2410);
			kwContains();
			setState(2411);
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
		enterRule(_localctx, 308, RULE_relalationContainsKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			id();
			{
			setState(2414);
			kwContains();
			setState(2415);
			kwKey();
			}
			setState(2417);
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
		enterRule(_localctx, 310, RULE_functionCall);
		int _la;
		try {
			setState(2431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2419);
				id();
				setState(2420);
				match(LR_BRACKET);
				setState(2421);
				match(STAR);
				setState(2422);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2424);
				id();
				setState(2425);
				match(LR_BRACKET);
				setState(2427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_BIGINT - 174)) | (1L << (K_BLOB - 174)) | (1L << (K_BOOLEAN - 174)) | (1L << (K_COUNTER - 174)) | (1L << (K_DATE - 174)) | (1L << (K_DECIMAL - 174)) | (1L << (K_DOUBLE - 174)) | (1L << (K_FLOAT - 174)) | (1L << (K_FROZEN - 174)) | (1L << (K_INET - 174)) | (1L << (K_INT - 174)) | (1L << (K_LIST - 174)) | (1L << (K_MAP - 174)) | (1L << (K_SMALLINT - 174)) | (1L << (K_TEXT - 174)) | (1L << (K_TIMEUUID - 174)) | (1L << (K_TIME - 174)) | (1L << (K_TINYINT - 174)) | (1L << (K_TUPLE - 174)) | (1L << (K_VARCHAR - 174)) | (1L << (K_VARINT - 174)) | (1L << (CODE_BLOCK - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (DECIMAL_LITERAL - 174)) | (1L << (FLOAT_LITERAL - 174)) | (1L << (HEXADECIMAL_LITERAL - 174)) | (1L << (OBJECT_NAME - 174)) | (1L << (UUID - 174)) | (1L << (K_USERS - 174)))) != 0)) {
					{
					setState(2426);
					functionArgs();
					}
				}

				setState(2429);
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
		enterRule(_localctx, 312, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(2433);
				constant();
				}
				break;
			case 2:
				{
				setState(2434);
				id();
				}
				break;
			case 3:
				{
				setState(2435);
				functionCall();
				}
				break;
			}
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2438);
				syntaxComma();
				setState(2442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(2439);
					constant();
					}
					break;
				case 2:
					{
					setState(2440);
					id();
					}
					break;
				case 3:
					{
					setState(2441);
					functionCall();
					}
					break;
				}
				}
				}
				setState(2448);
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
		enterRule(_localctx, 314, RULE_constant);
		try {
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2449);
				match(UUID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2450);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2451);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2452);
				floatLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2453);
				hexadecimalLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2454);
				booleanLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2455);
				codeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2456);
				kwNull();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2457);
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
		enterRule(_localctx, 316, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
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
		enterRule(_localctx, 318, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
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
		enterRule(_localctx, 320, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
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
		enterRule(_localctx, 322, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
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
		enterRule(_localctx, 324, RULE_hexadecimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
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
		enterRule(_localctx, 326, RULE_keyspace);
		try {
			setState(2475);
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
				setState(2470);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2471);
				match(DQUOTE);
				setState(2472);
				id();
				setState(2473);
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
		enterRule(_localctx, 328, RULE_table);
		try {
			setState(2482);
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
				setState(2477);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2478);
				match(DQUOTE);
				setState(2479);
				id();
				setState(2480);
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
		enterRule(_localctx, 330, RULE_column);
		try {
			setState(2489);
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
				setState(2484);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2485);
				match(DQUOTE);
				setState(2486);
				id();
				setState(2487);
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
		enterRule(_localctx, 332, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			dataTypeName();
			setState(2493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATOR_LT) {
				{
				setState(2492);
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
		enterRule(_localctx, 334, RULE_dataTypeName);
		try {
			setState(2523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2495);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2496);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2497);
				match(K_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2498);
				match(K_SET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2499);
				match(K_ASCII);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2500);
				match(K_BIGINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2501);
				match(K_BLOB);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2502);
				match(K_BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2503);
				match(K_COUNTER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2504);
				match(K_DATE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2505);
				match(K_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2506);
				match(K_DOUBLE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2507);
				match(K_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2508);
				match(K_FROZEN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2509);
				match(K_INET);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2510);
				match(K_INT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2511);
				match(K_LIST);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2512);
				match(K_MAP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2513);
				match(K_SMALLINT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2514);
				match(K_TEXT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2515);
				match(K_TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2516);
				match(K_TIMEUUID);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2517);
				match(K_TINYINT);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2518);
				match(K_TUPLE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2519);
				match(K_VARCHAR);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2520);
				match(K_VARINT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2521);
				match(K_TIMESTAMP);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2522);
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
		enterRule(_localctx, 336, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			syntaxBracketLa();
			setState(2526);
			dataType();
			setState(2532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2527);
				syntaxComma();
				setState(2528);
				dataType();
				}
				}
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2535);
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
		enterRule(_localctx, 338, RULE_orderDirection);
		try {
			setState(2539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2537);
				kwAsc();
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2538);
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
		enterRule(_localctx, 340, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2541);
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
		enterRule(_localctx, 342, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
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
		enterRule(_localctx, 344, RULE_triggerClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
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
		enterRule(_localctx, 346, RULE_materializedView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547);
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
		enterRule(_localctx, 348, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
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
		enterRule(_localctx, 350, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2551);
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
		enterRule(_localctx, 352, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2553);
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
		enterRule(_localctx, 354, RULE_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
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
		enterRule(_localctx, 356, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
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
		enterRule(_localctx, 358, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
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
		enterRule(_localctx, 360, RULE_hashKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2561);
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
		enterRule(_localctx, 362, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
			paramName();
			setState(2564);
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
		enterRule(_localctx, 364, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
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
		enterRule(_localctx, 366, RULE_kwAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
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
		enterRule(_localctx, 368, RULE_kwAggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
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
		enterRule(_localctx, 370, RULE_kwAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2572);
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
		enterRule(_localctx, 372, RULE_kwAllPermissions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			match(K_ALL);
			setState(2575);
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
		enterRule(_localctx, 374, RULE_kwAllow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
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
		enterRule(_localctx, 376, RULE_kwAlter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
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
		enterRule(_localctx, 378, RULE_kwAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2581);
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
		enterRule(_localctx, 380, RULE_kwApply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
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
		enterRule(_localctx, 382, RULE_kwAs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
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
		enterRule(_localctx, 384, RULE_kwAsc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587);
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
		enterRule(_localctx, 386, RULE_kwAuthorize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
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
		enterRule(_localctx, 388, RULE_kwBatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
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
		enterRule(_localctx, 390, RULE_kwBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
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
		enterRule(_localctx, 392, RULE_kwBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
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
		enterRule(_localctx, 394, RULE_kwCalled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
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
		enterRule(_localctx, 396, RULE_kwClustering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
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
		enterRule(_localctx, 398, RULE_kwCompact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2601);
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
		enterRule(_localctx, 400, RULE_kwContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2603);
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
		enterRule(_localctx, 402, RULE_kwCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2605);
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
		enterRule(_localctx, 404, RULE_kwDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2607);
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
		enterRule(_localctx, 406, RULE_kwDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
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
		enterRule(_localctx, 408, RULE_kwDescibe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611);
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
		enterRule(_localctx, 410, RULE_kwDistinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
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
		enterRule(_localctx, 412, RULE_kwDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
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
		enterRule(_localctx, 414, RULE_kwDurableWrites);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
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
		enterRule(_localctx, 416, RULE_kwEntries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
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
		enterRule(_localctx, 418, RULE_kwExecute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2621);
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
		enterRule(_localctx, 420, RULE_kwExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
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
		enterRule(_localctx, 422, RULE_kwFiltering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
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
		enterRule(_localctx, 424, RULE_kwFinalfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
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
		enterRule(_localctx, 426, RULE_kwFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
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
		enterRule(_localctx, 428, RULE_kwFull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
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
		enterRule(_localctx, 430, RULE_kwFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2633);
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
		enterRule(_localctx, 432, RULE_kwFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
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
		enterRule(_localctx, 434, RULE_kwGrant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2637);
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
		enterRule(_localctx, 436, RULE_kwIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
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
		enterRule(_localctx, 438, RULE_kwIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2641);
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
		enterRule(_localctx, 440, RULE_kwIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2643);
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

	public static class KwCustomContext extends ParserRuleContext {
		public TerminalNode K_CUSTOM() { return getToken(CqlParser.K_CUSTOM, 0); }
		public KwCustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwCustom; }
	}

	public final KwCustomContext kwCustom() throws RecognitionException {
		KwCustomContext _localctx = new KwCustomContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_kwCustom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2645);
			match(K_CUSTOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSearchContext extends ParserRuleContext {
		public TerminalNode K_SEARCH() { return getToken(CqlParser.K_SEARCH, 0); }
		public KwSearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSearch; }
	}

	public final KwSearchContext kwSearch() throws RecognitionException {
		KwSearchContext _localctx = new KwSearchContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_kwSearch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2647);
			match(K_SEARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAsciiContext extends ParserRuleContext {
		public TerminalNode K_ASCII() { return getToken(CqlParser.K_ASCII, 0); }
		public KwAsciiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAscii; }
	}

	public final KwAsciiContext kwAscii() throws RecognitionException {
		KwAsciiContext _localctx = new KwAsciiContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_kwAscii);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2649);
			match(K_ASCII);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNormalizeContext extends ParserRuleContext {
		public TerminalNode K_NORMALIZE() { return getToken(CqlParser.K_NORMALIZE, 0); }
		public KwNormalizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNormalize; }
	}

	public final KwNormalizeContext kwNormalize() throws RecognitionException {
		KwNormalizeContext _localctx = new KwNormalizeContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_kwNormalize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2651);
			match(K_NORMALIZE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwStorageAttachedIndexContext extends ParserRuleContext {
		public TerminalNode K_STORAGE_ATTACHED_INDEX() { return getToken(CqlParser.K_STORAGE_ATTACHED_INDEX, 0); }
		public KwStorageAttachedIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwStorageAttachedIndex; }
	}

	public final KwStorageAttachedIndexContext kwStorageAttachedIndex() throws RecognitionException {
		KwStorageAttachedIndexContext _localctx = new KwStorageAttachedIndexContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_kwStorageAttachedIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2653);
			match(K_STORAGE_ATTACHED_INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSpaceSavingNoJoinContext extends ParserRuleContext {
		public TerminalNode K_SPACE_SAVING_NO_JOIN() { return getToken(CqlParser.K_SPACE_SAVING_NO_JOIN, 0); }
		public KwSpaceSavingNoJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSpaceSavingNoJoin; }
	}

	public final KwSpaceSavingNoJoinContext kwSpaceSavingNoJoin() throws RecognitionException {
		KwSpaceSavingNoJoinContext _localctx = new KwSpaceSavingNoJoinContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_kwSpaceSavingNoJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(K_SPACE_SAVING_NO_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSpaceSavingAllContext extends ParserRuleContext {
		public TerminalNode K_SPACE_SAVING_ALL() { return getToken(CqlParser.K_SPACE_SAVING_ALL, 0); }
		public KwSpaceSavingAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSpaceSavingAll; }
	}

	public final KwSpaceSavingAllContext kwSpaceSavingAll() throws RecognitionException {
		KwSpaceSavingAllContext _localctx = new KwSpaceSavingAllContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_kwSpaceSavingAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(K_SPACE_SAVING_ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwSpaceSavingSlowTriePrecisionContext extends ParserRuleContext {
		public TerminalNode K_SPACE_SAVING_SLOW_TRIE_PRECISION() { return getToken(CqlParser.K_SPACE_SAVING_SLOW_TRIE_PRECISION, 0); }
		public KwSpaceSavingSlowTriePrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSpaceSavingSlowTriePrecision; }
	}

	public final KwSpaceSavingSlowTriePrecisionContext kwSpaceSavingSlowTriePrecision() throws RecognitionException {
		KwSpaceSavingSlowTriePrecisionContext _localctx = new KwSpaceSavingSlowTriePrecisionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_kwSpaceSavingSlowTriePrecision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2659);
			match(K_SPACE_SAVING_SLOW_TRIE_PRECISION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwCopyFieldContext extends ParserRuleContext {
		public TerminalNode K_COPY_FIELD() { return getToken(CqlParser.K_COPY_FIELD, 0); }
		public KwCopyFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwCopyField; }
	}

	public final KwCopyFieldContext kwCopyField() throws RecognitionException {
		KwCopyFieldContext _localctx = new KwCopyFieldContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_kwCopyField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2661);
			match(K_COPY_FIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDocValuesContext extends ParserRuleContext {
		public TerminalNode K_DOC_VALUES() { return getToken(CqlParser.K_DOC_VALUES, 0); }
		public KwDocValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDocValues; }
	}

	public final KwDocValuesContext kwDocValues() throws RecognitionException {
		KwDocValuesContext _localctx = new KwDocValuesContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_kwDocValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2663);
			match(K_DOC_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwExcludedContext extends ParserRuleContext {
		public TerminalNode K_EXCLUDED() { return getToken(CqlParser.K_EXCLUDED, 0); }
		public KwExcludedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwExcluded; }
	}

	public final KwExcludedContext kwExcluded() throws RecognitionException {
		KwExcludedContext _localctx = new KwExcludedContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_kwExcluded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			match(K_EXCLUDED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwIndexedContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(CqlParser.K_INDEXED, 0); }
		public KwIndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwIndexed; }
	}

	public final KwIndexedContext kwIndexed() throws RecognitionException {
		KwIndexedContext _localctx = new KwIndexedContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_kwIndexed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			match(K_INDEXED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwColumnsContext extends ParserRuleContext {
		public TerminalNode K_COLUMNS() { return getToken(CqlParser.K_COLUMNS, 0); }
		public KwColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwColumns; }
	}

	public final KwColumnsContext kwColumns() throws RecognitionException {
		KwColumnsContext _localctx = new KwColumnsContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_kwColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2669);
			match(K_COLUMNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwProfilesContext extends ParserRuleContext {
		public TerminalNode K_PROFILES() { return getToken(CqlParser.K_PROFILES, 0); }
		public KwProfilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwProfiles; }
	}

	public final KwProfilesContext kwProfiles() throws RecognitionException {
		KwProfilesContext _localctx = new KwProfilesContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_kwProfiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2671);
			match(K_PROFILES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwConfigContext extends ParserRuleContext {
		public TerminalNode K_CONFIG() { return getToken(CqlParser.K_CONFIG, 0); }
		public KwConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwConfig; }
	}

	public final KwConfigContext kwConfig() throws RecognitionException {
		KwConfigContext _localctx = new KwConfigContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_kwConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2673);
			match(K_CONFIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAutoCommitTimeContext extends ParserRuleContext {
		public TerminalNode K_AUTOCOMMIT_TIME() { return getToken(CqlParser.K_AUTOCOMMIT_TIME, 0); }
		public KwAutoCommitTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAutoCommitTime; }
	}

	public final KwAutoCommitTimeContext kwAutoCommitTime() throws RecognitionException {
		KwAutoCommitTimeContext _localctx = new KwAutoCommitTimeContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_kwAutoCommitTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2675);
			match(K_AUTOCOMMIT_TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDefaultQueryFieldContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT_QUERY_FIELD() { return getToken(CqlParser.K_DEFAULT_QUERY_FIELD, 0); }
		public KwDefaultQueryFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDefaultQueryField; }
	}

	public final KwDefaultQueryFieldContext kwDefaultQueryField() throws RecognitionException {
		KwDefaultQueryFieldContext _localctx = new KwDefaultQueryFieldContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_kwDefaultQueryField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			match(K_DEFAULT_QUERY_FIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDirectoryFactoryContext extends ParserRuleContext {
		public TerminalNode K_DIRECTORY_FACTORY() { return getToken(CqlParser.K_DIRECTORY_FACTORY, 0); }
		public KwDirectoryFactoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDirectoryFactory; }
	}

	public final KwDirectoryFactoryContext kwDirectoryFactory() throws RecognitionException {
		KwDirectoryFactoryContext _localctx = new KwDirectoryFactoryContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_kwDirectoryFactory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			match(K_DIRECTORY_FACTORY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFilterCacheLowWaterMarkContext extends ParserRuleContext {
		public TerminalNode K_FILTER_CACHE_LOW_WATERMARK() { return getToken(CqlParser.K_FILTER_CACHE_LOW_WATERMARK, 0); }
		public KwFilterCacheLowWaterMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFilterCacheLowWaterMark; }
	}

	public final KwFilterCacheLowWaterMarkContext kwFilterCacheLowWaterMark() throws RecognitionException {
		KwFilterCacheLowWaterMarkContext _localctx = new KwFilterCacheLowWaterMarkContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_kwFilterCacheLowWaterMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			match(K_FILTER_CACHE_LOW_WATERMARK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwFilterCacheHighWaterMarkContext extends ParserRuleContext {
		public TerminalNode K_FILTER_CACHE_HIGH_WATERMARK() { return getToken(CqlParser.K_FILTER_CACHE_HIGH_WATERMARK, 0); }
		public KwFilterCacheHighWaterMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwFilterCacheHighWaterMark; }
	}

	public final KwFilterCacheHighWaterMarkContext kwFilterCacheHighWaterMark() throws RecognitionException {
		KwFilterCacheHighWaterMarkContext _localctx = new KwFilterCacheHighWaterMarkContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_kwFilterCacheHighWaterMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
			match(K_FILTER_CACHE_HIGH_WATERMARK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwDirectoryFactoryClassContext extends ParserRuleContext {
		public TerminalNode K_DIRECTORY_FACTORY_CLASS() { return getToken(CqlParser.K_DIRECTORY_FACTORY_CLASS, 0); }
		public KwDirectoryFactoryClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwDirectoryFactoryClass; }
	}

	public final KwDirectoryFactoryClassContext kwDirectoryFactoryClass() throws RecognitionException {
		KwDirectoryFactoryClassContext _localctx = new KwDirectoryFactoryClassContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_kwDirectoryFactoryClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2685);
			match(K_DIRECTORY_FACTORY_CLASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwMergeMaxThreadCountContext extends ParserRuleContext {
		public TerminalNode K_MERGE_MAX_THREAD_COUNT() { return getToken(CqlParser.K_MERGE_MAX_THREAD_COUNT, 0); }
		public KwMergeMaxThreadCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwMergeMaxThreadCount; }
	}

	public final KwMergeMaxThreadCountContext kwMergeMaxThreadCount() throws RecognitionException {
		KwMergeMaxThreadCountContext _localctx = new KwMergeMaxThreadCountContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_kwMergeMaxThreadCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			match(K_MERGE_MAX_THREAD_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwMergeMaxMergeCountContext extends ParserRuleContext {
		public TerminalNode K_MERGE_MAX_MERGE_COUNT() { return getToken(CqlParser.K_MERGE_MAX_MERGE_COUNT, 0); }
		public KwMergeMaxMergeCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwMergeMaxMergeCount; }
	}

	public final KwMergeMaxMergeCountContext kwMergeMaxMergeCount() throws RecognitionException {
		KwMergeMaxMergeCountContext _localctx = new KwMergeMaxMergeCountContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_kwMergeMaxMergeCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2689);
			match(K_MERGE_MAX_MERGE_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRamBufferSizeContext extends ParserRuleContext {
		public TerminalNode K_RAM_BUFFER_SIZE() { return getToken(CqlParser.K_RAM_BUFFER_SIZE, 0); }
		public KwRamBufferSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRamBufferSize; }
	}

	public final KwRamBufferSizeContext kwRamBufferSize() throws RecognitionException {
		KwRamBufferSizeContext _localctx = new KwRamBufferSizeContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_kwRamBufferSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			match(K_RAM_BUFFER_SIZE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRealtimeContext extends ParserRuleContext {
		public TerminalNode K_REALTIME() { return getToken(CqlParser.K_REALTIME, 0); }
		public KwRealtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRealtime; }
	}

	public final KwRealtimeContext kwRealtime() throws RecognitionException {
		KwRealtimeContext _localctx = new KwRealtimeContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_kwRealtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			match(K_REALTIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwRecoveryContext extends ParserRuleContext {
		public TerminalNode K_RECOVERY() { return getToken(CqlParser.K_RECOVERY, 0); }
		public KwRecoveryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwRecovery; }
	}

	public final KwRecoveryContext kwRecovery() throws RecognitionException {
		KwRecoveryContext _localctx = new KwRecoveryContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_kwRecovery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			match(K_RECOVERY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwReindexContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(CqlParser.K_REINDEX, 0); }
		public KwReindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwReindex; }
	}

	public final KwReindexContext kwReindex() throws RecognitionException {
		KwReindexContext _localctx = new KwReindexContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_kwReindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			match(K_REINDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwLenientContext extends ParserRuleContext {
		public TerminalNode K_LENIENT() { return getToken(CqlParser.K_LENIENT, 0); }
		public KwLenientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwLenient; }
	}

	public final KwLenientContext kwLenient() throws RecognitionException {
		KwLenientContext _localctx = new KwLenientContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_kwLenient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2699);
			match(K_LENIENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwStandardContext extends ParserRuleContext {
		public TerminalNode K_STANDARD() { return getToken(CqlParser.K_STANDARD, 0); }
		public KwStandardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwStandard; }
	}

	public final KwStandardContext kwStandard() throws RecognitionException {
		KwStandardContext _localctx = new KwStandardContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_kwStandard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2701);
			match(K_STANDARD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwEncryptedContext extends ParserRuleContext {
		public TerminalNode K_ENCRYPTED() { return getToken(CqlParser.K_ENCRYPTED, 0); }
		public KwEncryptedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwEncrypted; }
	}

	public final KwEncryptedContext kwEncrypted() throws RecognitionException {
		KwEncryptedContext _localctx = new KwEncryptedContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_kwEncrypted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			match(K_ENCRYPTED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwCaseSensitiveContext extends ParserRuleContext {
		public TerminalNode K_CASE_SENITIVE() { return getToken(CqlParser.K_CASE_SENITIVE, 0); }
		public KwCaseSensitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwCaseSensitive; }
	}

	public final KwCaseSensitiveContext kwCaseSensitive() throws RecognitionException {
		KwCaseSensitiveContext _localctx = new KwCaseSensitiveContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_kwCaseSensitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(K_CASE_SENITIVE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 504, RULE_kwInitcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2707);
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
		enterRule(_localctx, 506, RULE_kwInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2709);
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
		enterRule(_localctx, 508, RULE_kwInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2711);
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
		enterRule(_localctx, 510, RULE_kwInto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2713);
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
		enterRule(_localctx, 512, RULE_kwIs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
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
		enterRule(_localctx, 514, RULE_kwJson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2717);
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
		enterRule(_localctx, 516, RULE_kwKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
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
		enterRule(_localctx, 518, RULE_kwKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2721);
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
		enterRule(_localctx, 520, RULE_kwKeyspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2723);
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
		enterRule(_localctx, 522, RULE_kwKeyspaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2725);
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
		enterRule(_localctx, 524, RULE_kwLanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2727);
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
		enterRule(_localctx, 526, RULE_kwLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2729);
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
		enterRule(_localctx, 528, RULE_kwList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2731);
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
		enterRule(_localctx, 530, RULE_kwLogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
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
		enterRule(_localctx, 532, RULE_kwLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2735);
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
		enterRule(_localctx, 534, RULE_kwMaterialized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
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
		enterRule(_localctx, 536, RULE_kwModify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
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
		enterRule(_localctx, 538, RULE_kwNosuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
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
		enterRule(_localctx, 540, RULE_kwNorecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2743);
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
		enterRule(_localctx, 542, RULE_kwNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
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
		enterRule(_localctx, 544, RULE_kwNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
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
		enterRule(_localctx, 546, RULE_kwOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2749);
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
		enterRule(_localctx, 548, RULE_kwOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
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
		enterRule(_localctx, 550, RULE_kwOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2753);
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
		enterRule(_localctx, 552, RULE_kwOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
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
		enterRule(_localctx, 554, RULE_kwOrder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
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
		enterRule(_localctx, 556, RULE_kwPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
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
		enterRule(_localctx, 558, RULE_kwPrimary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
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
		enterRule(_localctx, 560, RULE_kwRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
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
		enterRule(_localctx, 562, RULE_kwReplace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
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
		enterRule(_localctx, 564, RULE_kwReplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2767);
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
		enterRule(_localctx, 566, RULE_kwReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2769);
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
		enterRule(_localctx, 568, RULE_kwRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
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
		enterRule(_localctx, 570, RULE_kwInternal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2773);
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
		enterRule(_localctx, 572, RULE_kwLdap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2775);
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
		enterRule(_localctx, 574, RULE_kwScheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
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
		enterRule(_localctx, 576, RULE_kwRoles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
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
		enterRule(_localctx, 578, RULE_kwSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
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
		enterRule(_localctx, 580, RULE_kwSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
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
		enterRule(_localctx, 582, RULE_kwSfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
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
		enterRule(_localctx, 584, RULE_kwStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
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
		enterRule(_localctx, 586, RULE_kwStype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
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
		enterRule(_localctx, 588, RULE_kwSuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2791);
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
		enterRule(_localctx, 590, RULE_kwTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
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
		enterRule(_localctx, 592, RULE_kwTimestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
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
		enterRule(_localctx, 594, RULE_kwTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
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
		enterRule(_localctx, 596, RULE_kwTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
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
		enterRule(_localctx, 598, RULE_kwTruncate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
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
		enterRule(_localctx, 600, RULE_kwTtl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
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
		enterRule(_localctx, 602, RULE_kwType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
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
		enterRule(_localctx, 604, RULE_kwUnlogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
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
		enterRule(_localctx, 606, RULE_kwUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809);
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
		enterRule(_localctx, 608, RULE_kwUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
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
		enterRule(_localctx, 610, RULE_kwUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2813);
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
		enterRule(_localctx, 612, RULE_kwUsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
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
		enterRule(_localctx, 614, RULE_kwUsing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
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
		enterRule(_localctx, 616, RULE_kwValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2819);
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
		enterRule(_localctx, 618, RULE_kwView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
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
		enterRule(_localctx, 620, RULE_kwWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
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
		enterRule(_localctx, 622, RULE_kwWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
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
		enterRule(_localctx, 624, RULE_kwRevoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
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
		enterRule(_localctx, 626, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829);
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
		enterRule(_localctx, 628, RULE_syntaxBracketLr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2831);
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
		enterRule(_localctx, 630, RULE_syntaxBracketRr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2833);
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
		enterRule(_localctx, 632, RULE_syntaxBracketLc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2835);
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
		enterRule(_localctx, 634, RULE_syntaxBracketRc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2837);
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
		enterRule(_localctx, 636, RULE_syntaxBracketLa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839);
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
		enterRule(_localctx, 638, RULE_syntaxBracketRa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2841);
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
		enterRule(_localctx, 640, RULE_syntaxBracketLs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2843);
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
		enterRule(_localctx, 642, RULE_syntaxBracketRs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2845);
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
		enterRule(_localctx, 644, RULE_syntaxComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2847);
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
		enterRule(_localctx, 646, RULE_syntaxColon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
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
		enterRule(_localctx, 648, RULE_id);
		try {
			setState(2993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2851);
				match(OBJECT_NAME);
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2852);
				match(K_ADD);
				setState(2853);
				match(K_AGGREGATE);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2854);
				match(K_ALL);
				}
				break;
			case K_ALLOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(2855);
				match(K_ALLOW);
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(2856);
				match(K_ALTER);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 6);
				{
				setState(2857);
				match(K_AND);
				}
				break;
			case K_ANY:
				enterOuterAlt(_localctx, 7);
				{
				setState(2858);
				match(K_ANY);
				}
				break;
			case K_APPLY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2859);
				match(K_APPLY);
				}
				break;
			case K_AS:
				enterOuterAlt(_localctx, 9);
				{
				setState(2860);
				match(K_AS);
				}
				break;
			case K_ASC:
				enterOuterAlt(_localctx, 10);
				{
				setState(2861);
				match(K_ASC);
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2862);
				match(K_AUTHORIZE);
				}
				break;
			case K_BATCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(2863);
				match(K_BATCH);
				}
				break;
			case K_BEGIN:
				enterOuterAlt(_localctx, 13);
				{
				setState(2864);
				match(K_BEGIN);
				}
				break;
			case K_BY:
				enterOuterAlt(_localctx, 14);
				{
				setState(2865);
				match(K_BY);
				}
				break;
			case K_CALLED:
				enterOuterAlt(_localctx, 15);
				{
				setState(2866);
				match(K_CALLED);
				}
				break;
			case K_CLUSTERING:
				enterOuterAlt(_localctx, 16);
				{
				setState(2867);
				match(K_CLUSTERING);
				}
				break;
			case K_COLUMNFAMILY:
				enterOuterAlt(_localctx, 17);
				{
				setState(2868);
				match(K_COLUMNFAMILY);
				}
				break;
			case K_COMPACT:
				enterOuterAlt(_localctx, 18);
				{
				setState(2869);
				match(K_COMPACT);
				}
				break;
			case K_CONSISTENCY:
				enterOuterAlt(_localctx, 19);
				{
				setState(2870);
				match(K_CONSISTENCY);
				}
				break;
			case K_CONTAINS:
				enterOuterAlt(_localctx, 20);
				{
				setState(2871);
				match(K_CONTAINS);
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 21);
				{
				setState(2872);
				match(K_CREATE);
				}
				break;
			case K_CUSTOM:
				enterOuterAlt(_localctx, 22);
				{
				setState(2873);
				match(K_CUSTOM);
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 23);
				{
				setState(2874);
				match(K_DELETE);
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 24);
				{
				setState(2875);
				match(K_DESC);
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 25);
				{
				setState(2876);
				match(K_DESCRIBE);
				}
				break;
			case K_DISTINCT:
				enterOuterAlt(_localctx, 26);
				{
				setState(2877);
				match(K_DISTINCT);
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 27);
				{
				setState(2878);
				match(K_DROP);
				}
				break;
			case K_DURABLE_WRITES:
				enterOuterAlt(_localctx, 28);
				{
				setState(2879);
				match(K_DURABLE_WRITES);
				}
				break;
			case K_EACH_QUORUM:
				enterOuterAlt(_localctx, 29);
				{
				setState(2880);
				match(K_EACH_QUORUM);
				}
				break;
			case K_ENTRIES:
				enterOuterAlt(_localctx, 30);
				{
				setState(2881);
				match(K_ENTRIES);
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 31);
				{
				setState(2882);
				match(K_EXECUTE);
				}
				break;
			case K_EXISTS:
				enterOuterAlt(_localctx, 32);
				{
				setState(2883);
				match(K_EXISTS);
				}
				break;
			case K_FALSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(2884);
				match(K_FALSE);
				}
				break;
			case K_FILTERING:
				enterOuterAlt(_localctx, 34);
				{
				setState(2885);
				match(K_FILTERING);
				}
				break;
			case K_FINALFUNC:
				enterOuterAlt(_localctx, 35);
				{
				setState(2886);
				match(K_FINALFUNC);
				}
				break;
			case K_FROM:
				enterOuterAlt(_localctx, 36);
				{
				setState(2887);
				match(K_FROM);
				}
				break;
			case K_FULL:
				enterOuterAlt(_localctx, 37);
				{
				setState(2888);
				match(K_FULL);
				}
				break;
			case K_FUNCTION:
				enterOuterAlt(_localctx, 38);
				{
				setState(2889);
				match(K_FUNCTION);
				}
				break;
			case K_FUNCTIONS:
				enterOuterAlt(_localctx, 39);
				{
				setState(2890);
				match(K_FUNCTIONS);
				}
				break;
			case K_GRANT:
				enterOuterAlt(_localctx, 40);
				{
				setState(2891);
				match(K_GRANT);
				}
				break;
			case K_IF:
				enterOuterAlt(_localctx, 41);
				{
				setState(2892);
				match(K_IF);
				}
				break;
			case K_IN:
				enterOuterAlt(_localctx, 42);
				{
				setState(2893);
				match(K_IN);
				}
				break;
			case K_INDEX:
				enterOuterAlt(_localctx, 43);
				{
				setState(2894);
				match(K_INDEX);
				}
				break;
			case K_INFINITY:
				enterOuterAlt(_localctx, 44);
				{
				setState(2895);
				match(K_INFINITY);
				}
				break;
			case K_INITCOND:
				enterOuterAlt(_localctx, 45);
				{
				setState(2896);
				match(K_INITCOND);
				}
				break;
			case K_INPUT:
				enterOuterAlt(_localctx, 46);
				{
				setState(2897);
				match(K_INPUT);
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 47);
				{
				setState(2898);
				match(K_INSERT);
				}
				break;
			case K_INTO:
				enterOuterAlt(_localctx, 48);
				{
				setState(2899);
				match(K_INTO);
				}
				break;
			case K_IS:
				enterOuterAlt(_localctx, 49);
				{
				setState(2900);
				match(K_IS);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 50);
				{
				setState(2901);
				match(K_JSON);
				}
				break;
			case K_KEY:
				enterOuterAlt(_localctx, 51);
				{
				setState(2902);
				match(K_KEY);
				}
				break;
			case K_KEYS:
				enterOuterAlt(_localctx, 52);
				{
				setState(2903);
				match(K_KEYS);
				}
				break;
			case K_KEYSPACE:
				enterOuterAlt(_localctx, 53);
				{
				setState(2904);
				match(K_KEYSPACE);
				}
				break;
			case K_KEYSPACES:
				enterOuterAlt(_localctx, 54);
				{
				setState(2905);
				match(K_KEYSPACES);
				}
				break;
			case K_LANGUAGE:
				enterOuterAlt(_localctx, 55);
				{
				setState(2906);
				match(K_LANGUAGE);
				}
				break;
			case K_LEVEL:
				enterOuterAlt(_localctx, 56);
				{
				setState(2907);
				match(K_LEVEL);
				}
				break;
			case K_LIMIT:
				enterOuterAlt(_localctx, 57);
				{
				setState(2908);
				match(K_LIMIT);
				}
				break;
			case K_LOCAL_ONE:
				enterOuterAlt(_localctx, 58);
				{
				setState(2909);
				match(K_LOCAL_ONE);
				}
				break;
			case K_LOCAL_QUORUM:
				enterOuterAlt(_localctx, 59);
				{
				setState(2910);
				match(K_LOCAL_QUORUM);
				}
				break;
			case K_LOGGED:
				enterOuterAlt(_localctx, 60);
				{
				setState(2911);
				match(K_LOGGED);
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 61);
				{
				setState(2912);
				match(K_LOGIN);
				}
				break;
			case K_MATERIALIZED:
				enterOuterAlt(_localctx, 62);
				{
				setState(2913);
				match(K_MATERIALIZED);
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 63);
				{
				setState(2914);
				match(K_MODIFY);
				}
				break;
			case K_NAN:
				enterOuterAlt(_localctx, 64);
				{
				setState(2915);
				match(K_NAN);
				}
				break;
			case K_NORECURSIVE:
				enterOuterAlt(_localctx, 65);
				{
				setState(2916);
				match(K_NORECURSIVE);
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 66);
				{
				setState(2917);
				match(K_NOSUPERUSER);
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 67);
				{
				setState(2918);
				match(K_NOT);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 68);
				{
				setState(2919);
				match(K_NULL);
				}
				break;
			case K_OF:
				enterOuterAlt(_localctx, 69);
				{
				setState(2920);
				match(K_OF);
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 70);
				{
				setState(2921);
				match(K_ON);
				}
				break;
			case K_ONE:
				enterOuterAlt(_localctx, 71);
				{
				setState(2922);
				match(K_ONE);
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 72);
				{
				setState(2923);
				match(K_OPTIONS);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 73);
				{
				setState(2924);
				match(K_OR);
				}
				break;
			case K_ORDER:
				enterOuterAlt(_localctx, 74);
				{
				setState(2925);
				match(K_ORDER);
				}
				break;
			case K_PARTITION:
				enterOuterAlt(_localctx, 75);
				{
				setState(2926);
				match(K_PARTITION);
				}
				break;
			case K_PASSWORD:
				enterOuterAlt(_localctx, 76);
				{
				setState(2927);
				match(K_PASSWORD);
				}
				break;
			case K_PER:
				enterOuterAlt(_localctx, 77);
				{
				setState(2928);
				match(K_PER);
				}
				break;
			case K_PERMISSION:
				enterOuterAlt(_localctx, 78);
				{
				setState(2929);
				match(K_PERMISSION);
				}
				break;
			case K_PERMISSIONS:
				enterOuterAlt(_localctx, 79);
				{
				setState(2930);
				match(K_PERMISSIONS);
				}
				break;
			case K_PRIMARY:
				enterOuterAlt(_localctx, 80);
				{
				setState(2931);
				match(K_PRIMARY);
				}
				break;
			case K_QUORUM:
				enterOuterAlt(_localctx, 81);
				{
				setState(2932);
				match(K_QUORUM);
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 82);
				{
				setState(2933);
				match(K_RENAME);
				}
				break;
			case K_REPLACE:
				enterOuterAlt(_localctx, 83);
				{
				setState(2934);
				match(K_REPLACE);
				}
				break;
			case K_REPLICATION:
				enterOuterAlt(_localctx, 84);
				{
				setState(2935);
				match(K_REPLICATION);
				}
				break;
			case K_RETURNS:
				enterOuterAlt(_localctx, 85);
				{
				setState(2936);
				match(K_RETURNS);
				}
				break;
			case K_REVOKE:
				enterOuterAlt(_localctx, 86);
				{
				setState(2937);
				match(K_REVOKE);
				}
				break;
			case K_ROLE:
				enterOuterAlt(_localctx, 87);
				{
				setState(2938);
				match(K_ROLE);
				}
				break;
			case K_ROLES:
				enterOuterAlt(_localctx, 88);
				{
				setState(2939);
				match(K_ROLES);
				}
				break;
			case K_SCHEMA:
				enterOuterAlt(_localctx, 89);
				{
				setState(2940);
				match(K_SCHEMA);
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 90);
				{
				setState(2941);
				match(K_SELECT);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 91);
				{
				setState(2942);
				match(K_SET);
				}
				break;
			case K_SFUNC:
				enterOuterAlt(_localctx, 92);
				{
				setState(2943);
				match(K_SFUNC);
				}
				break;
			case K_STATIC:
				enterOuterAlt(_localctx, 93);
				{
				setState(2944);
				match(K_STATIC);
				}
				break;
			case K_STORAGE:
				enterOuterAlt(_localctx, 94);
				{
				setState(2945);
				match(K_STORAGE);
				}
				break;
			case K_STYPE:
				enterOuterAlt(_localctx, 95);
				{
				setState(2946);
				match(K_STYPE);
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 96);
				{
				setState(2947);
				match(K_SUPERUSER);
				}
				break;
			case K_TABLE:
				enterOuterAlt(_localctx, 97);
				{
				setState(2948);
				match(K_TABLE);
				}
				break;
			case K_THREE:
				enterOuterAlt(_localctx, 98);
				{
				setState(2949);
				match(K_THREE);
				}
				break;
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 99);
				{
				setState(2950);
				match(K_TIMESTAMP);
				}
				break;
			case K_TO:
				enterOuterAlt(_localctx, 100);
				{
				setState(2951);
				match(K_TO);
				}
				break;
			case K_TOKEN:
				enterOuterAlt(_localctx, 101);
				{
				setState(2952);
				match(K_TOKEN);
				}
				break;
			case K_TRIGGER:
				enterOuterAlt(_localctx, 102);
				{
				setState(2953);
				match(K_TRIGGER);
				}
				break;
			case K_TRUE:
				enterOuterAlt(_localctx, 103);
				{
				setState(2954);
				match(K_TRUE);
				}
				break;
			case K_TRUNCATE:
				enterOuterAlt(_localctx, 104);
				{
				setState(2955);
				match(K_TRUNCATE);
				}
				break;
			case K_TTL:
				enterOuterAlt(_localctx, 105);
				{
				setState(2956);
				match(K_TTL);
				}
				break;
			case K_TWO:
				enterOuterAlt(_localctx, 106);
				{
				setState(2957);
				match(K_TWO);
				}
				break;
			case K_TYPE:
				enterOuterAlt(_localctx, 107);
				{
				setState(2958);
				match(K_TYPE);
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 108);
				{
				setState(2959);
				match(K_UNLOGGED);
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 109);
				{
				setState(2960);
				match(K_UPDATE);
				}
				break;
			case K_USE:
				enterOuterAlt(_localctx, 110);
				{
				setState(2961);
				match(K_USE);
				}
				break;
			case K_USER:
				enterOuterAlt(_localctx, 111);
				{
				setState(2962);
				match(K_USER);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 112);
				{
				setState(2963);
				match(K_USING);
				}
				break;
			case K_UUID:
				enterOuterAlt(_localctx, 113);
				{
				setState(2964);
				match(K_UUID);
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 114);
				{
				setState(2965);
				match(K_VALUES);
				}
				break;
			case K_VIEW:
				enterOuterAlt(_localctx, 115);
				{
				setState(2966);
				match(K_VIEW);
				}
				break;
			case K_WHERE:
				enterOuterAlt(_localctx, 116);
				{
				setState(2967);
				match(K_WHERE);
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 117);
				{
				setState(2968);
				match(K_WITH);
				}
				break;
			case K_WRITETIME:
				enterOuterAlt(_localctx, 118);
				{
				setState(2969);
				match(K_WRITETIME);
				}
				break;
			case K_ASCII:
				enterOuterAlt(_localctx, 119);
				{
				setState(2970);
				match(K_ASCII);
				}
				break;
			case K_BIGINT:
				enterOuterAlt(_localctx, 120);
				{
				setState(2971);
				match(K_BIGINT);
				}
				break;
			case K_BLOB:
				enterOuterAlt(_localctx, 121);
				{
				setState(2972);
				match(K_BLOB);
				}
				break;
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 122);
				{
				setState(2973);
				match(K_BOOLEAN);
				}
				break;
			case K_COUNTER:
				enterOuterAlt(_localctx, 123);
				{
				setState(2974);
				match(K_COUNTER);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 124);
				{
				setState(2975);
				match(K_DATE);
				}
				break;
			case K_DECIMAL:
				enterOuterAlt(_localctx, 125);
				{
				setState(2976);
				match(K_DECIMAL);
				}
				break;
			case K_DOUBLE:
				enterOuterAlt(_localctx, 126);
				{
				setState(2977);
				match(K_DOUBLE);
				}
				break;
			case K_FLOAT:
				enterOuterAlt(_localctx, 127);
				{
				setState(2978);
				match(K_FLOAT);
				}
				break;
			case K_FROZEN:
				enterOuterAlt(_localctx, 128);
				{
				setState(2979);
				match(K_FROZEN);
				}
				break;
			case K_INET:
				enterOuterAlt(_localctx, 129);
				{
				setState(2980);
				match(K_INET);
				}
				break;
			case K_INT:
				enterOuterAlt(_localctx, 130);
				{
				setState(2981);
				match(K_INT);
				}
				break;
			case K_LIST:
				enterOuterAlt(_localctx, 131);
				{
				setState(2982);
				match(K_LIST);
				}
				break;
			case K_MAP:
				enterOuterAlt(_localctx, 132);
				{
				setState(2983);
				match(K_MAP);
				}
				break;
			case K_SMALLINT:
				enterOuterAlt(_localctx, 133);
				{
				setState(2984);
				match(K_SMALLINT);
				}
				break;
			case K_TEXT:
				enterOuterAlt(_localctx, 134);
				{
				setState(2985);
				match(K_TEXT);
				}
				break;
			case K_TIMEUUID:
				enterOuterAlt(_localctx, 135);
				{
				setState(2986);
				match(K_TIMEUUID);
				}
				break;
			case K_TIME:
				enterOuterAlt(_localctx, 136);
				{
				setState(2987);
				match(K_TIME);
				}
				break;
			case K_TINYINT:
				enterOuterAlt(_localctx, 137);
				{
				setState(2988);
				match(K_TINYINT);
				}
				break;
			case K_TUPLE:
				enterOuterAlt(_localctx, 138);
				{
				setState(2989);
				match(K_TUPLE);
				}
				break;
			case K_VARCHAR:
				enterOuterAlt(_localctx, 139);
				{
				setState(2990);
				match(K_VARCHAR);
				}
				break;
			case K_VARINT:
				enterOuterAlt(_localctx, 140);
				{
				setState(2991);
				match(K_VARINT);
				}
				break;
			case K_USERS:
				enterOuterAlt(_localctx, 141);
				{
				setState(2992);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00d2\u0bb6\4\2\t"+
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
		"\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122\t\u0122"+
		"\4\u0123\t\u0123\4\u0124\t\u0124\4\u0125\t\u0125\4\u0126\t\u0126\4\u0127"+
		"\t\u0127\4\u0128\t\u0128\4\u0129\t\u0129\4\u012a\t\u012a\4\u012b\t\u012b"+
		"\4\u012c\t\u012c\4\u012d\t\u012d\4\u012e\t\u012e\4\u012f\t\u012f\4\u0130"+
		"\t\u0130\4\u0131\t\u0131\4\u0132\t\u0132\4\u0133\t\u0133\4\u0134\t\u0134"+
		"\4\u0135\t\u0135\4\u0136\t\u0136\4\u0137\t\u0137\4\u0138\t\u0138\4\u0139"+
		"\t\u0139\4\u013a\t\u013a\4\u013b\t\u013b\4\u013c\t\u013c\4\u013d\t\u013d"+
		"\4\u013e\t\u013e\4\u013f\t\u013f\4\u0140\t\u0140\4\u0141\t\u0141\4\u0142"+
		"\t\u0142\4\u0143\t\u0143\4\u0144\t\u0144\4\u0145\t\u0145\4\u0146\t\u0146"+
		"\3\2\5\2\u028e\n\2\3\2\5\2\u0291\n\2\3\2\3\2\3\3\3\3\5\3\u0297\n\3\3\3"+
		"\3\3\3\3\7\3\u029c\n\3\f\3\16\3\u029f\13\3\3\3\3\3\5\3\u02a3\n\3\3\3\5"+
		"\3\u02a6\n\3\3\3\5\3\u02a9\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02d5\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u02e6"+
		"\n\t\3\t\5\t\u02e9\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u02f0\n\n\3\n\3\n\3\n\5"+
		"\n\u02f5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0300\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u030a\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0319\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0324\n\r\3\r\3\r\3\r\5\r\u0329\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0334\n\r\3\r\3\r\5\r\u0338\n\r\3\16\3\16\3\16\5\16"+
		"\u033d\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0345\n\16\3\17\3\17\3"+
		"\17\5\17\u034a\n\17\3\17\3\17\5\17\u034e\n\17\3\20\3\20\3\20\5\20\u0353"+
		"\n\20\3\20\3\20\3\20\5\20\u0358\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0365\n\21\f\21\16\21\u0368\13\21\3\22\3\22"+
		"\3\22\5\22\u036d\n\22\3\22\3\22\3\22\5\22\u0372\n\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\5\23\u037c\n\23\3\23\3\23\3\23\5\23\u0381\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u038b\n\23\3\23\3\23\3\23"+
		"\5\23\u0390\n\23\3\23\3\23\3\23\5\23\u0395\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u039c\n\24\3\25\3\25\3\25\3\25\7\25\u03a2\n\25\f\25\16\25\u03a5"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u03b1\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u03bd\n\30"+
		"\3\31\3\31\5\31\u03c1\n\31\3\31\3\31\5\31\u03c5\n\31\3\31\3\31\3\31\5"+
		"\31\u03ca\n\31\3\31\3\31\3\31\5\31\u03cf\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u03e0\n\33\f\33"+
		"\16\33\u03e3\13\33\3\34\3\34\3\34\3\34\5\34\u03e9\n\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\5\35\u03f1\n\35\3\35\3\35\5\35\u03f5\n\35\3\35\3\35\3"+
		"\35\5\35\u03fa\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u040d\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u0414\n\37\f\37\16\37\u0417\13\37\3\37\3\37\3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\7!\u0425\n!\f!\16!\u0428\13!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u0431\n\"\f\"\16\"\u0434\13\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\5$\u0441\n$\3%\3%\3%\3&\3&\5&\u0448\n&\3\'\3\'\3\'\3\'\3\'\5\'\u044f"+
		"\n\'\3\'\3\'\3\'\3(\3(\3(\5(\u0457\n(\3)\3)\3)\3*\3*\3*\3*\7*\u0460\n"+
		"*\f*\16*\u0463\13*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\5.\u0476\n.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u0481\n/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\7\64\u0496\n\64\f\64\16\64\u0499\13\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u04a4\n\66\f\66\16\66\u04a7\13\66\3\67\3\67"+
		"\3\67\3\67\5\67\u04ad\n\67\38\38\38\38\38\78\u04b4\n8\f8\168\u04b7\13"+
		"8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u04c9\n9\3:\3:\3"+
		":\3:\3:\3:\5:\u04d1\n:\3:\3:\3:\3:\5:\u04d7\n:\3;\3;\3;\5;\u04dc\n;\3"+
		";\3;\3<\3<\3<\5<\u04e3\n<\3<\3<\3<\5<\u04e8\n<\3<\3<\3=\3=\3=\3=\5=\u04f0"+
		"\n=\3=\3=\3=\5=\u04f5\n=\3=\3=\3>\3>\3>\5>\u04fc\n>\3>\3>\3>\5>\u0501"+
		"\n>\3>\3>\3?\3?\3?\5?\u0508\n?\3?\3?\3?\5?\u050d\n?\3?\3?\3@\3@\3@\5@"+
		"\u0514\n@\3@\3@\3@\3@\3@\5@\u051b\n@\3@\3@\3A\3A\3A\5A\u0522\nA\3A\3A"+
		"\3B\3B\3B\5B\u0529\nB\3B\3B\3B\5B\u052e\nB\3B\3B\3C\3C\3C\5C\u0535\nC"+
		"\3C\3C\3D\3D\3D\5D\u053c\nD\3D\3D\3D\5D\u0541\nD\3D\3D\3E\3E\3E\5E\u0548"+
		"\nE\3E\3E\3E\5E\u054d\nE\3E\3E\3E\3E\3E\5E\u0554\nE\3F\3F\5F\u0558\nF"+
		"\3G\3G\5G\u055c\nG\3G\3G\3G\5G\u0561\nG\7G\u0563\nG\fG\16G\u0566\13G\3"+
		"H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\7I\u0573\nI\fI\16I\u0576\13I\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\5J\u0581\nJ\3K\3K\3L\3L\3L\5L\u0588\nL\3M\3M\3M\3M"+
		"\3M\7M\u058f\nM\fM\16M\u0592\13M\3M\3M\3N\3N\3N\3N\3O\3O\3P\3P\3P\5P\u059f"+
		"\nP\3Q\3Q\3Q\3Q\7Q\u05a5\nQ\fQ\16Q\u05a8\13Q\3Q\3Q\3Q\5Q\u05ad\nQ\3R\3"+
		"R\3R\5R\u05b2\nR\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\5U\u05c0\nU\3V\3"+
		"V\3W\3W\3W\3W\5W\u05c8\nW\3X\3X\3X\3X\3X\3X\5X\u05d0\nX\3Y\3Y\3Y\3Y\7"+
		"Y\u05d6\nY\fY\16Y\u05d9\13Y\3Z\3Z\3Z\3Z\7Z\u05df\nZ\fZ\16Z\u05e2\13Z\3"+
		"[\3[\3\\\3\\\3]\3]\3]\3^\3^\5^\u05ed\n^\3^\3^\5^\u05f1\n^\3_\3_\5_\u05f5"+
		"\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0603\n`\3a\3a\3a\3a\7a\u0609"+
		"\na\fa\16a\u060c\13a\3b\3b\3b\3b\3b\3b\5b\u0614\nb\3c\3c\3c\3c\3d\3d\3"+
		"d\3e\3e\5e\u061f\ne\3e\3e\3e\5e\u0624\ne\3e\3e\3f\3f\3f\5f\u062b\nf\3"+
		"f\5f\u062e\nf\3f\3f\3f\3f\5f\u0634\nf\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u063f"+
		"\nf\3f\5f\u0642\nf\3f\3f\3f\3f\5f\u0648\nf\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0661\nf\5f\u0663\nf\3g"+
		"\3g\3g\3g\5g\u0669\ng\3g\3g\3g\3g\5g\u066f\ng\3g\3g\3g\3g\3g\5g\u0676"+
		"\ng\3g\5g\u0679\ng\3g\3g\3g\5g\u067e\ng\3g\5g\u0681\ng\3g\5g\u0684\ng"+
		"\3g\5g\u0687\ng\3g\5g\u068a\ng\5g\u068c\ng\3h\3h\3h\3h\3h\3h\5h\u0694"+
		"\nh\3h\5h\u0697\nh\3h\3h\3h\3h\5h\u069d\nh\3h\5h\u06a0\nh\3h\3h\3h\3h"+
		"\5h\u06a6\nh\3h\5h\u06a9\nh\3h\3h\3h\3h\5h\u06af\nh\3h\5h\u06b2\nh\3h"+
		"\3h\3h\3h\5h\u06b8\nh\3h\5h\u06bb\nh\3h\3h\3h\3h\5h\u06c1\nh\3h\5h\u06c4"+
		"\nh\3h\3h\3h\3h\5h\u06ca\nh\3h\5h\u06cd\nh\3h\3h\3h\3h\5h\u06d3\nh\3h"+
		"\5h\u06d6\nh\3h\3h\3h\3h\5h\u06dc\nh\3h\5h\u06df\nh\3h\3h\3h\3h\5h\u06e5"+
		"\nh\3h\3h\3i\3i\5i\u06eb\ni\3j\3j\3j\3j\3j\3j\5j\u06f3\nj\3j\5j\u06f6"+
		"\nj\3j\3j\3j\3j\5j\u06fc\nj\3j\5j\u06ff\nj\3j\3j\3j\3j\5j\u0705\nj\3j"+
		"\3j\3k\3k\3k\5k\u070c\nk\3l\3l\3l\3l\7l\u0712\nl\fl\16l\u0715\13l\3m\3"+
		"m\3m\3m\3m\3m\5m\u071d\nm\3m\5m\u0720\nm\3m\3m\3m\3m\5m\u0726\nm\3m\5"+
		"m\u0729\nm\3m\3m\3m\3m\5m\u072f\nm\3m\5m\u0732\nm\3m\3m\3m\3m\5m\u0738"+
		"\nm\3m\5m\u073b\nm\3m\3m\3m\3m\3m\3m\5m\u0743\nm\3m\5m\u0746\nm\3m\3m"+
		"\3m\3m\5m\u074c\nm\3m\5m\u074f\nm\3m\3m\3m\3m\5m\u0755\nm\3m\5m\u0758"+
		"\nm\3m\3m\3m\3m\5m\u075e\nm\3m\5m\u0761\nm\5m\u0763\nm\3n\3n\5n\u0767"+
		"\nn\3o\3o\3o\3o\3o\5o\u076e\no\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3r\3r\3r"+
		"\3r\3r\3s\3s\3s\3s\3s\3t\5t\u0785\nt\3t\3t\5t\u0789\nt\3t\3t\5t\u078d"+
		"\nt\3t\3t\3t\5t\u0792\nt\3u\3u\3u\3u\7u\u0798\nu\fu\16u\u079b\13u\3v\3"+
		"v\3v\3v\3v\5v\u07a2\nv\3v\3v\5v\u07a6\nv\3w\5w\u07a9\nw\3w\3w\3w\3w\5"+
		"w\u07af\nw\3w\3w\5w\u07b3\nw\3w\3w\3w\3w\3w\5w\u07ba\nw\3x\3x\3x\3y\3"+
		"y\3y\3y\7y\u07c3\ny\fy\16y\u07c6\13y\3z\3z\3z\3z\3{\3{\3{\3{\7{\u07d0"+
		"\n{\f{\16{\u07d3\13{\3|\3|\3|\3|\3|\3|\5|\u07db\n|\3|\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u080e\n"+
		"|\3}\3}\3}\3}\3}\7}\u0815\n}\f}\16}\u0818\13}\5}\u081a\n}\3}\3}\3~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\3~\7~\u0828\n~\f~\16~\u082b\13~\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\177\7\177\u0834\n\177\f\177\16\177\u0837\13\177\3\177\3"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0840\n\u0080\f\u0080"+
		"\16\u0080\u0843\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\7\u0081\u084c\n\u0081\f\u0081\16\u0081\u084f\13\u0081\3\u0081"+
		"\3\u0081\3\u0081\7\u0081\u0854\n\u0081\f\u0081\16\u0081\u0857\13\u0081"+
		"\5\u0081\u0859\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u085f\n"+
		"\u0081\f\u0081\16\u0081\u0862\13\u0081\5\u0081\u0864\n\u0081\3\u0081\3"+
		"\u0081\3\u0082\5\u0082\u0869\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\5\u0082\u0870\n\u0082\3\u0082\3\u0082\5\u0082\u0874\n\u0082\3\u0082"+
		"\3\u0082\5\u0082\u0878\n\u0082\3\u0082\5\u0082\u087b\n\u0082\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u088d\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u08a7\n\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b"+
		"\u08b1\n\u008b\f\u008b\16\u008b\u08b4\13\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\7\u008c\u08ba\n\u008c\f\u008c\16\u008c\u08bd\13\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u08c5\n\u008d\3\u008e"+
		"\3\u008e\5\u008e\u08c9\n\u008e\3\u008e\5\u008e\u08cc\n\u008e\3\u008e\3"+
		"\u008e\3\u008e\5\u008e\u08d1\n\u008e\3\u008e\5\u008e\u08d4\n\u008e\3\u008e"+
		"\5\u008e\u08d7\n\u008e\3\u008e\5\u008e\u08da\n\u008e\3\u008f\3\u008f\3"+
		"\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u08ea\n\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u08f3\n\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\5\u0097\u08fc\n\u0097\3\u0097"+
		"\3\u0097\3\u0097\7\u0097\u0901\n\u0097\f\u0097\16\u0097\u0904\13\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u090e\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0914\n\u0098\5"+
		"\u0098\u0916\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u091c\n\u0099"+
		"\f\u0099\16\u0099\u091f\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u0937\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u0940\n\u009a\f\u009a\16\u009a\u0943\13\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u094c\n\u009a\f\u009a"+
		"\16\u009a\u094f\13\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\7\u009a\u0958\n\u009a\f\u009a\16\u009a\u095b\13\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0963\n\u009a\f\u009a"+
		"\16\u009a\u0966\13\u009a\3\u009a\3\u009a\5\u009a\u096a\n\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u097e\n\u009d\3\u009d\3\u009d\5\u009d\u0982\n\u009d\3\u009e\3\u009e\3"+
		"\u009e\5\u009e\u0987\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u098d"+
		"\n\u009e\7\u009e\u098f\n\u009e\f\u009e\16\u009e\u0992\13\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u099d\n\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u09ae\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u09b5\n"+
		"\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09bc\n\u00a7\3"+
		"\u00a8\3\u00a8\5\u00a8\u09c0\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09de\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u09e5\n\u00aa\f\u00aa"+
		"\16\u00aa\u09e8\13\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\5\u00ab\u09ee"+
		"\n\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc"+
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
		"\3\u011b\3\u011b\3\u011c\3\u011c\3\u011d\3\u011d\3\u011e\3\u011e\3\u011f"+
		"\3\u011f\3\u0120\3\u0120\3\u0121\3\u0121\3\u0122\3\u0122\3\u0123\3\u0123"+
		"\3\u0124\3\u0124\3\u0125\3\u0125\3\u0126\3\u0126\3\u0127\3\u0127\3\u0128"+
		"\3\u0128\3\u0129\3\u0129\3\u012a\3\u012a\3\u012b\3\u012b\3\u012c\3\u012c"+
		"\3\u012d\3\u012d\3\u012e\3\u012e\3\u012f\3\u012f\3\u0130\3\u0130\3\u0131"+
		"\3\u0131\3\u0132\3\u0132\3\u0133\3\u0133\3\u0134\3\u0134\3\u0135\3\u0135"+
		"\3\u0136\3\u0136\3\u0137\3\u0137\3\u0138\3\u0138\3\u0139\3\u0139\3\u013a"+
		"\3\u013a\3\u013b\3\u013b\3\u013c\3\u013c\3\u013d\3\u013d\3\u013e\3\u013e"+
		"\3\u013f\3\u013f\3\u0140\3\u0140\3\u0141\3\u0141\3\u0142\3\u0142\3\u0143"+
		"\3\u0143\3\u0144\3\u0144\3\u0145\3\u0145\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146"+
		"\3\u0146\3\u0146\3\u0146\5\u0146\u0bb4\n\u0146\3\u0146\2\2\u0147\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6"+
		"\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e"+
		"\u0210\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226"+
		"\u0228\u022a\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a\u023c\u023e"+
		"\u0240\u0242\u0244\u0246\u0248\u024a\u024c\u024e\u0250\u0252\u0254\u0256"+
		"\u0258\u025a\u025c\u025e\u0260\u0262\u0264\u0266\u0268\u026a\u026c\u026e"+
		"\u0270\u0272\u0274\u0276\u0278\u027a\u027c\u027e\u0280\u0282\u0284\u0286"+
		"\u0288\u028a\2\7\3\2\u00c5\u00c6\4\2\24\24\26\26\3\2\u00cd\u00d1\3\2\u00c7"+
		"\u00c8\4\2::\u0083\u0083\2\u0c70\2\u028d\3\2\2\2\4\u029d\3\2\2\2\6\u02aa"+
		"\3\2\2\2\b\u02ac\3\2\2\2\n\u02d4\3\2\2\2\f\u02d6\3\2\2\2\16\u02dd\3\2"+
		"\2\2\20\u02e0\3\2\2\2\22\u02ea\3\2\2\2\24\u02f6\3\2\2\2\26\u0309\3\2\2"+
		"\2\30\u0337\3\2\2\2\32\u0339\3\2\2\2\34\u0346\3\2\2\2\36\u034f\3\2\2\2"+
		" \u035e\3\2\2\2\"\u0369\3\2\2\2$\u0377\3\2\2\2&\u0396\3\2\2\2(\u039d\3"+
		"\2\2\2*\u03a6\3\2\2\2,\u03ab\3\2\2\2.\u03ad\3\2\2\2\60\u03be\3\2\2\2\62"+
		"\u03d9\3\2\2\2\64\u03db\3\2\2\2\66\u03e8\3\2\2\28\u03ee\3\2\2\2:\u040c"+
		"\3\2\2\2<\u040e\3\2\2\2>\u041a\3\2\2\2@\u041e\3\2\2\2B\u042b\3\2\2\2D"+
		"\u0437\3\2\2\2F\u043a\3\2\2\2H\u0442\3\2\2\2J\u0447\3\2\2\2L\u0449\3\2"+
		"\2\2N\u0456\3\2\2\2P\u0458\3\2\2\2R\u045b\3\2\2\2T\u0464\3\2\2\2V\u0468"+
		"\3\2\2\2X\u046b\3\2\2\2Z\u0470\3\2\2\2\\\u0480\3\2\2\2^\u0482\3\2\2\2"+
		"`\u0485\3\2\2\2b\u048a\3\2\2\2d\u048e\3\2\2\2f\u0491\3\2\2\2h\u049a\3"+
		"\2\2\2j\u049d\3\2\2\2l\u04a8\3\2\2\2n\u04ae\3\2\2\2p\u04c8\3\2\2\2r\u04ca"+
		"\3\2\2\2t\u04d8\3\2\2\2v\u04df\3\2\2\2x\u04eb\3\2\2\2z\u04f8\3\2\2\2|"+
		"\u0504\3\2\2\2~\u0510\3\2\2\2\u0080\u051e\3\2\2\2\u0082\u0525\3\2\2\2"+
		"\u0084\u0531\3\2\2\2\u0086\u0538\3\2\2\2\u0088\u0544\3\2\2\2\u008a\u0555"+
		"\3\2\2\2\u008c\u0559\3\2\2\2\u008e\u0567\3\2\2\2\u0090\u056e\3\2\2\2\u0092"+
		"\u0580\3\2\2\2\u0094\u0582\3\2\2\2\u0096\u0587\3\2\2\2\u0098\u0589\3\2"+
		"\2\2\u009a\u0595\3\2\2\2\u009c\u0599\3\2\2\2\u009e\u059e\3\2\2\2\u00a0"+
		"\u05a0\3\2\2\2\u00a2\u05ae\3\2\2\2\u00a4\u05b3\3\2\2\2\u00a6\u05b6\3\2"+
		"\2\2\u00a8\u05bf\3\2\2\2\u00aa\u05c1\3\2\2\2\u00ac\u05c3\3\2\2\2\u00ae"+
		"\u05c9\3\2\2\2\u00b0\u05d1\3\2\2\2\u00b2\u05da\3\2\2\2\u00b4\u05e3\3\2"+
		"\2\2\u00b6\u05e5\3\2\2\2\u00b8\u05e7\3\2\2\2\u00ba\u05ea\3\2\2\2\u00bc"+
		"\u05f4\3\2\2\2\u00be\u05f6\3\2\2\2\u00c0\u0604\3\2\2\2\u00c2\u0613\3\2"+
		"\2\2\u00c4\u0615\3\2\2\2\u00c6\u0619\3\2\2\2\u00c8\u061c\3\2\2\2\u00ca"+
		"\u0662\3\2\2\2\u00cc\u0664\3\2\2\2\u00ce\u068d\3\2\2\2\u00d0\u06ea\3\2"+
		"\2\2\u00d2\u06ec\3\2\2\2\u00d4\u070b\3\2\2\2\u00d6\u070d\3\2\2\2\u00d8"+
		"\u0762\3\2\2\2\u00da\u0766\3\2\2\2\u00dc\u076d\3\2\2\2\u00de\u076f\3\2"+
		"\2\2\u00e0\u0774\3\2\2\2\u00e2\u0779\3\2\2\2\u00e4\u077e\3\2\2\2\u00e6"+
		"\u0784\3\2\2\2\u00e8\u0793\3\2\2\2\u00ea\u07a5\3\2\2\2\u00ec\u07a8\3\2"+
		"\2\2\u00ee\u07bb\3\2\2\2\u00f0\u07be\3\2\2\2\u00f2\u07c7\3\2\2\2\u00f4"+
		"\u07cb\3\2\2\2\u00f6\u080d\3\2\2\2\u00f8\u080f\3\2\2\2\u00fa\u081d\3\2"+
		"\2\2\u00fc\u082e\3\2\2\2\u00fe\u083a\3\2\2\2\u0100\u0846\3\2\2\2\u0102"+
		"\u0868\3\2\2\2\u0104\u088c\3\2\2\2\u0106\u088e\3\2\2\2\u0108\u0891\3\2"+
		"\2\2\u010a\u0894\3\2\2\2\u010c\u0897\3\2\2\2\u010e\u089b\3\2\2\2\u0110"+
		"\u08a6\3\2\2\2\u0112\u08a8\3\2\2\2\u0114\u08ac\3\2\2\2\u0116\u08b5\3\2"+
		"\2\2\u0118\u08c4\3\2\2\2\u011a\u08c6\3\2\2\2\u011c\u08db\3\2\2\2\u011e"+
		"\u08de\3\2\2\2\u0120\u08e1\3\2\2\2\u0122\u08e9\3\2\2\2\u0124\u08eb\3\2"+
		"\2\2\u0126\u08ef\3\2\2\2\u0128\u08f4\3\2\2\2\u012a\u08f7\3\2\2\2\u012c"+
		"\u08fb\3\2\2\2\u012e\u0915\3\2\2\2\u0130\u0917\3\2\2\2\u0132\u0969\3\2"+
		"\2\2\u0134\u096b\3\2\2\2\u0136\u096f\3\2\2\2\u0138\u0981\3\2\2\2\u013a"+
		"\u0986\3\2\2\2\u013c\u099c\3\2\2\2\u013e\u099e\3\2\2\2\u0140\u09a0\3\2"+
		"\2\2\u0142\u09a2\3\2\2\2\u0144\u09a4\3\2\2\2\u0146\u09a6\3\2\2\2\u0148"+
		"\u09ad\3\2\2\2\u014a\u09b4\3\2\2\2\u014c\u09bb\3\2\2\2\u014e\u09bd\3\2"+
		"\2\2\u0150\u09dd\3\2\2\2\u0152\u09df\3\2\2\2\u0154\u09ed\3\2\2\2\u0156"+
		"\u09ef\3\2\2\2\u0158\u09f1\3\2\2\2\u015a\u09f3\3\2\2\2\u015c\u09f5\3\2"+
		"\2\2\u015e\u09f7\3\2\2\2\u0160\u09f9\3\2\2\2\u0162\u09fb\3\2\2\2\u0164"+
		"\u09fd\3\2\2\2\u0166\u09ff\3\2\2\2\u0168\u0a01\3\2\2\2\u016a\u0a03\3\2"+
		"\2\2\u016c\u0a05\3\2\2\2\u016e\u0a08\3\2\2\2\u0170\u0a0a\3\2\2\2\u0172"+
		"\u0a0c\3\2\2\2\u0174\u0a0e\3\2\2\2\u0176\u0a10\3\2\2\2\u0178\u0a13\3\2"+
		"\2\2\u017a\u0a15\3\2\2\2\u017c\u0a17\3\2\2\2\u017e\u0a19\3\2\2\2\u0180"+
		"\u0a1b\3\2\2\2\u0182\u0a1d\3\2\2\2\u0184\u0a1f\3\2\2\2\u0186\u0a21\3\2"+
		"\2\2\u0188\u0a23\3\2\2\2\u018a\u0a25\3\2\2\2\u018c\u0a27\3\2\2\2\u018e"+
		"\u0a29\3\2\2\2\u0190\u0a2b\3\2\2\2\u0192\u0a2d\3\2\2\2\u0194\u0a2f\3\2"+
		"\2\2\u0196\u0a31\3\2\2\2\u0198\u0a33\3\2\2\2\u019a\u0a35\3\2\2\2\u019c"+
		"\u0a37\3\2\2\2\u019e\u0a39\3\2\2\2\u01a0\u0a3b\3\2\2\2\u01a2\u0a3d\3\2"+
		"\2\2\u01a4\u0a3f\3\2\2\2\u01a6\u0a41\3\2\2\2\u01a8\u0a43\3\2\2\2\u01aa"+
		"\u0a45\3\2\2\2\u01ac\u0a47\3\2\2\2\u01ae\u0a49\3\2\2\2\u01b0\u0a4b\3\2"+
		"\2\2\u01b2\u0a4d\3\2\2\2\u01b4\u0a4f\3\2\2\2\u01b6\u0a51\3\2\2\2\u01b8"+
		"\u0a53\3\2\2\2\u01ba\u0a55\3\2\2\2\u01bc\u0a57\3\2\2\2\u01be\u0a59\3\2"+
		"\2\2\u01c0\u0a5b\3\2\2\2\u01c2\u0a5d\3\2\2\2\u01c4\u0a5f\3\2\2\2\u01c6"+
		"\u0a61\3\2\2\2\u01c8\u0a63\3\2\2\2\u01ca\u0a65\3\2\2\2\u01cc\u0a67\3\2"+
		"\2\2\u01ce\u0a69\3\2\2\2\u01d0\u0a6b\3\2\2\2\u01d2\u0a6d\3\2\2\2\u01d4"+
		"\u0a6f\3\2\2\2\u01d6\u0a71\3\2\2\2\u01d8\u0a73\3\2\2\2\u01da\u0a75\3\2"+
		"\2\2\u01dc\u0a77\3\2\2\2\u01de\u0a79\3\2\2\2\u01e0\u0a7b\3\2\2\2\u01e2"+
		"\u0a7d\3\2\2\2\u01e4\u0a7f\3\2\2\2\u01e6\u0a81\3\2\2\2\u01e8\u0a83\3\2"+
		"\2\2\u01ea\u0a85\3\2\2\2\u01ec\u0a87\3\2\2\2\u01ee\u0a89\3\2\2\2\u01f0"+
		"\u0a8b\3\2\2\2\u01f2\u0a8d\3\2\2\2\u01f4\u0a8f\3\2\2\2\u01f6\u0a91\3\2"+
		"\2\2\u01f8\u0a93\3\2\2\2\u01fa\u0a95\3\2\2\2\u01fc\u0a97\3\2\2\2\u01fe"+
		"\u0a99\3\2\2\2\u0200\u0a9b\3\2\2\2\u0202\u0a9d\3\2\2\2\u0204\u0a9f\3\2"+
		"\2\2\u0206\u0aa1\3\2\2\2\u0208\u0aa3\3\2\2\2\u020a\u0aa5\3\2\2\2\u020c"+
		"\u0aa7\3\2\2\2\u020e\u0aa9\3\2\2\2\u0210\u0aab\3\2\2\2\u0212\u0aad\3\2"+
		"\2\2\u0214\u0aaf\3\2\2\2\u0216\u0ab1\3\2\2\2\u0218\u0ab3\3\2\2\2\u021a"+
		"\u0ab5\3\2\2\2\u021c\u0ab7\3\2\2\2\u021e\u0ab9\3\2\2\2\u0220\u0abb\3\2"+
		"\2\2\u0222\u0abd\3\2\2\2\u0224\u0abf\3\2\2\2\u0226\u0ac1\3\2\2\2\u0228"+
		"\u0ac3\3\2\2\2\u022a\u0ac5\3\2\2\2\u022c\u0ac7\3\2\2\2\u022e\u0ac9\3\2"+
		"\2\2\u0230\u0acb\3\2\2\2\u0232\u0acd\3\2\2\2\u0234\u0acf\3\2\2\2\u0236"+
		"\u0ad1\3\2\2\2\u0238\u0ad3\3\2\2\2\u023a\u0ad5\3\2\2\2\u023c\u0ad7\3\2"+
		"\2\2\u023e\u0ad9\3\2\2\2\u0240\u0adb\3\2\2\2\u0242\u0add\3\2\2\2\u0244"+
		"\u0adf\3\2\2\2\u0246\u0ae1\3\2\2\2\u0248\u0ae3\3\2\2\2\u024a\u0ae5\3\2"+
		"\2\2\u024c\u0ae7\3\2\2\2\u024e\u0ae9\3\2\2\2\u0250\u0aeb\3\2\2\2\u0252"+
		"\u0aed\3\2\2\2\u0254\u0aef\3\2\2\2\u0256\u0af1\3\2\2\2\u0258\u0af3\3\2"+
		"\2\2\u025a\u0af5\3\2\2\2\u025c\u0af7\3\2\2\2\u025e\u0af9\3\2\2\2\u0260"+
		"\u0afb\3\2\2\2\u0262\u0afd\3\2\2\2\u0264\u0aff\3\2\2\2\u0266\u0b01\3\2"+
		"\2\2\u0268\u0b03\3\2\2\2\u026a\u0b05\3\2\2\2\u026c\u0b07\3\2\2\2\u026e"+
		"\u0b09\3\2\2\2\u0270\u0b0b\3\2\2\2\u0272\u0b0d\3\2\2\2\u0274\u0b0f\3\2"+
		"\2\2\u0276\u0b11\3\2\2\2\u0278\u0b13\3\2\2\2\u027a\u0b15\3\2\2\2\u027c"+
		"\u0b17\3\2\2\2\u027e\u0b19\3\2\2\2\u0280\u0b1b\3\2\2\2\u0282\u0b1d\3\2"+
		"\2\2\u0284\u0b1f\3\2\2\2\u0286\u0b21\3\2\2\2\u0288\u0b23\3\2\2\2\u028a"+
		"\u0bb3\3\2\2\2\u028c\u028e\5\4\3\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0290\3\2\2\2\u028f\u0291\7\25\2\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\5\u0274\u013b\2\u0293\3"+
		"\3\2\2\2\u0294\u0296\5\n\6\2\u0295\u0297\7\25\2\2\u0296\u0295\3\2\2\2"+
		"\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\6\4\2\u0299\u029c"+
		"\3\2\2\2\u029a\u029c\5\b\5\2\u029b\u0294\3\2\2\2\u029b\u029a\3\2\2\2\u029c"+
		"\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a8\3\2"+
		"\2\2\u029f\u029d\3\2\2\2\u02a0\u02a5\5\n\6\2\u02a1\u02a3\7\25\2\2\u02a2"+
		"\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\5\6"+
		"\4\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7"+
		"\u02a9\5\b\5\2\u02a8\u02a0\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\5\3\2\2\2"+
		"\u02aa\u02ab\7\n\2\2\u02ab\7\3\2\2\2\u02ac\u02ad\5\6\4\2\u02ad\t\3\2\2"+
		"\2\u02ae\u02d5\5\u00be`\2\u02af\u02d5\5r:\2\u02b0\u02d5\5l\67\2\u02b1"+
		"\u02d5\5Z.\2\u02b2\u02d5\5L\'\2\u02b3\u02d5\5F$\2\u02b4\u02d5\5\u00b8"+
		"]\2\u02b5\u02d5\58\35\2\u02b6\u02d5\5\60\31\2\u02b7\u02d5\5\u00caf\2\u02b8"+
		"\u02d5\5\u00ccg\2\u02b9\u02d5\5.\30\2\u02ba\u02d5\5$\23\2\u02bb\u02d5"+
		"\5\34\17\2\u02bc\u02d5\5\u0088E\2\u02bd\u02d5\5\"\22\2\u02be\u02d5\5\36"+
		"\20\2\u02bf\u02d5\5\32\16\2\u02c0\u02d5\5\u00e6t\2\u02c1\u02d5\5z>\2\u02c2"+
		"\u02d5\5|?\2\u02c3\u02d5\5\u0086D\2\u02c4\u02d5\5\u0084C\2\u02c5\u02d5"+
		"\5x=\2\u02c6\u02d5\5\u0080A\2\u02c7\u02d5\5\u0082B\2\u02c8\u02d5\5~@\2"+
		"\u02c9\u02d5\5v<\2\u02ca\u02d5\5t;\2\u02cb\u02d5\5\24\13\2\u02cc\u02d5"+
		"\5\u0102\u0082\2\u02cd\u02d5\5\22\n\2\u02ce\u02d5\5\20\t\2\u02cf\u02d5"+
		"\5\f\7\2\u02d0\u02d5\5\u011a\u008e\2\u02d1\u02d5\5\u00c8e\2\u02d2\u02d5"+
		"\5\u00ecw\2\u02d3\u02d5\5\u00c6d\2\u02d4\u02ae\3\2\2\2\u02d4\u02af\3\2"+
		"\2\2\u02d4\u02b0\3\2\2\2\u02d4\u02b1\3\2\2\2\u02d4\u02b2\3\2\2\2\u02d4"+
		"\u02b3\3\2\2\2\u02d4\u02b4\3\2\2\2\u02d4\u02b5\3\2\2\2\u02d4\u02b6\3\2"+
		"\2\2\u02d4\u02b7\3\2\2\2\u02d4\u02b8\3\2\2\2\u02d4\u02b9\3\2\2\2\u02d4"+
		"\u02ba\3\2\2\2\u02d4\u02bb\3\2\2\2\u02d4\u02bc\3\2\2\2\u02d4\u02bd\3\2"+
		"\2\2\u02d4\u02be\3\2\2\2\u02d4\u02bf\3\2\2\2\u02d4\u02c0\3\2\2\2\u02d4"+
		"\u02c1\3\2\2\2\u02d4\u02c2\3\2\2\2\u02d4\u02c3\3\2\2\2\u02d4\u02c4\3\2"+
		"\2\2\u02d4\u02c5\3\2\2\2\u02d4\u02c6\3\2\2\2\u02d4\u02c7\3\2\2\2\u02d4"+
		"\u02c8\3\2\2\2\u02d4\u02c9\3\2\2\2\u02d4\u02ca\3\2\2\2\u02d4\u02cb\3\2"+
		"\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02cd\3\2\2\2\u02d4\u02ce\3\2\2\2\u02d4"+
		"\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d1\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d4\u02d3\3\2\2\2\u02d5\13\3\2\2\2\u02d6\u02d7\5\u0272\u013a\2"+
		"\u02d7\u02d8\5\26\f\2\u02d8\u02d9\5\u0226\u0114\2\u02d9\u02da\5\30\r\2"+
		"\u02da\u02db\5\u01ac\u00d7\2\u02db\u02dc\5\u0156\u00ac\2\u02dc\r\3\2\2"+
		"\2\u02dd\u02de\5\u0212\u010a\2\u02de\u02df\5\u0266\u0134\2\u02df\17\3"+
		"\2\2\2\u02e0\u02e1\5\u0212\u010a\2\u02e1\u02e5\5\u0242\u0122\2\u02e2\u02e3"+
		"\5\u0224\u0113\2\u02e3\u02e4\5\u0156\u00ac\2\u02e4\u02e6\3\2\2\2\u02e5"+
		"\u02e2\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e9\5\u021e"+
		"\u0110\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\21\3\2\2\2\u02ea"+
		"\u02eb\5\u0212\u010a\2\u02eb\u02ef\5\26\f\2\u02ec\u02ed\5\u0226\u0114"+
		"\2\u02ed\u02ee\5\30\r\2\u02ee\u02f0\3\2\2\2\u02ef\u02ec\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f4\3\2\2\2\u02f1\u02f2\5\u0224\u0113\2\u02f2\u02f3"+
		"\5\u0156\u00ac\2\u02f3\u02f5\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f4\u02f5\3"+
		"\2\2\2\u02f5\23\3\2\2\2\u02f6\u02f7\5\u01b4\u00db\2\u02f7\u02f8\5\26\f"+
		"\2\u02f8\u02f9\5\u0226\u0114\2\u02f9\u02fa\5\30\r\2\u02fa\u02fb\5\u0254"+
		"\u012b\2\u02fb\u02fc\5\u0156\u00ac\2\u02fc\25\3\2\2\2\u02fd\u0300\5\u0174"+
		"\u00bb\2\u02fe\u0300\5\u0176\u00bc\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3"+
		"\2\2\2\u0300\u030a\3\2\2\2\u0301\u030a\5\u017a\u00be\2\u0302\u030a\5\u0184"+
		"\u00c3\2\u0303\u030a\5\u019a\u00ce\2\u0304\u030a\5\u01a4\u00d3\2\u0305"+
		"\u030a\5\u0194\u00cb\2\u0306\u030a\5\u019e\u00d0\2\u0307\u030a\5\u021a"+
		"\u010e\2\u0308\u030a\5\u0244\u0123\2\u0309\u02ff\3\2\2\2\u0309\u0301\3"+
		"\2\2\2\u0309\u0302\3\2\2\2\u0309\u0303\3\2\2\2\u0309\u0304\3\2\2\2\u0309"+
		"\u0305\3\2\2\2\u0309\u0306\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u0308\3\2"+
		"\2\2\u030a\27\3\2\2\2\u030b\u030c\5\u0174\u00bb\2\u030c\u030d\5\u01b2"+
		"\u00da\2\u030d\u0338\3\2\2\2\u030e\u030f\5\u0174\u00bb\2\u030f\u0310\5"+
		"\u01b2\u00da\2\u0310\u0311\5\u01b8\u00dd\2\u0311\u0312\5\u020a\u0106\2"+
		"\u0312\u0313\5\u0148\u00a5\2\u0313\u0338\3\2\2\2\u0314\u0318\5\u01b0\u00d9"+
		"\2\u0315\u0316\5\u0148\u00a5\2\u0316\u0317\7\20\2\2\u0317\u0319\3\2\2"+
		"\2\u0318\u0315\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b"+
		"\5\u0162\u00b2\2\u031b\u0338\3\2\2\2\u031c\u031d\5\u0174\u00bb\2\u031d"+
		"\u031e\5\u020c\u0107\2\u031e\u0338\3\2\2\2\u031f\u0320\5\u020a\u0106\2"+
		"\u0320\u0321\5\u0148\u00a5\2\u0321\u0338\3\2\2\2\u0322\u0324\5\u0250\u0129"+
		"\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0328\3\2\2\2\u0325\u0326"+
		"\5\u0148\u00a5\2\u0326\u0327\7\20\2\2\u0327\u0329\3\2\2\2\u0328\u0325"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0338\5\u014a\u00a6"+
		"\2\u032b\u032c\5\u0174\u00bb\2\u032c\u032d\5\u0242\u0122\2\u032d\u0338"+
		"\3\2\2\2\u032e\u032f\5\u023a\u011e\2\u032f\u0330\5\u0156\u00ac\2\u0330"+
		"\u0338\3\2\2\2\u0331\u0334\5\u023c\u011f\2\u0332\u0334\5\u023e\u0120\2"+
		"\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336"+
		"\5\u0240\u0121\2\u0336\u0338\3\2\2\2\u0337\u030b\3\2\2\2\u0337\u030e\3"+
		"\2\2\2\u0337\u0314\3\2\2\2\u0337\u031c\3\2\2\2\u0337\u031f\3\2\2\2\u0337"+
		"\u0323\3\2\2\2\u0337\u032b\3\2\2\2\u0337\u032e\3\2\2\2\u0337\u0333\3\2"+
		"\2\2\u0338\31\3\2\2\2\u0339\u033a\5\u0194\u00cb\2\u033a\u033c\5\u0264"+
		"\u0133\2\u033b\u033d\5\u010c\u0087\2\u033c\u033b\3\2\2\2\u033c\u033d\3"+
		"\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\5\u0166\u00b4\2\u033f\u0340\5\u0270"+
		"\u0139\2\u0340\u0341\5\u022e\u0118\2\u0341\u0344\5\u0142\u00a2\2\u0342"+
		"\u0345\5\u024e\u0128\2\u0343\u0345\5\u021c\u010f\2\u0344\u0342\3\2\2\2"+
		"\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\33\3\2\2\2\u0346\u0347"+
		"\5\u0194\u00cb\2\u0347\u0349\5\u023a\u011e\2\u0348\u034a\5\u010c\u0087"+
		"\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\5\u0156\u00ac\2\u034c\u034e\5n8\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\35\3\2\2\2\u034f\u0350\5\u0194\u00cb\2\u0350\u0352\5\u025c"+
		"\u012f\2\u0351\u0353\5\u010c\u0087\2\u0352\u0351\3\2\2\2\u0352\u0353\3"+
		"\2\2\2\u0353\u0357\3\2\2\2\u0354\u0355\5\u0148\u00a5\2\u0355\u0356\7\20"+
		"\2\2\u0356\u0358\3\2\2\2\u0357\u0354\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035a\5\u015e\u00b0\2\u035a\u035b\5\u0276\u013c\2"+
		"\u035b\u035c\5 \21\2\u035c\u035d\5\u0278\u013d\2\u035d\37\3\2\2\2\u035e"+
		"\u035f\5\u014c\u00a7\2\u035f\u0366\5\u014e\u00a8\2\u0360\u0361\5\u0286"+
		"\u0144\2\u0361\u0362\5\u014c\u00a7\2\u0362\u0363\5\u014e\u00a8\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0360\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2"+
		"\2\2\u0366\u0367\3\2\2\2\u0367!\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a"+
		"\5\u0194\u00cb\2\u036a\u036c\5\u0256\u012c\2\u036b\u036d\5\u010c\u0087"+
		"\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0371\3\2\2\2\u036e\u036f"+
		"\5\u0148\u00a5\2\u036f\u0370\7\20\2\2\u0370\u0372\3\2\2\2\u0371\u036e"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\5\u0158\u00ad"+
		"\2\u0374\u0375\5\u0268\u0135\2\u0375\u0376\5\u015a\u00ae\2\u0376#\3\2"+
		"\2\2\u0377\u0378\5\u0194\u00cb\2\u0378\u0379\5\u0218\u010d\2\u0379\u037b"+
		"\5\u026c\u0137\2\u037a\u037c\5\u010c\u0087\2\u037b\u037a\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u0380\3\2\2\2\u037d\u037e\5\u0148\u00a5\2\u037e\u037f"+
		"\7\20\2\2\u037f\u0381\3\2\2\2\u0380\u037d\3\2\2\2\u0380\u0381\3\2\2\2"+
		"\u0381\u0382\3\2\2\2\u0382\u0383\5\u015c\u00af\2\u0383\u0384\5\u0180\u00c1"+
		"\2\u0384\u0385\5\u0244\u0123\2\u0385\u0386\5\u0114\u008b\2\u0386\u038a"+
		"\5\u01ac\u00d7\2\u0387\u0388\5\u0148\u00a5\2\u0388\u0389\7\20\2\2\u0389"+
		"\u038b\3\2\2\2\u038a\u0387\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2"+
		"\2\2\u038c\u038d\5\u014a\u00a6\2\u038d\u038f\5&\24\2\u038e\u0390\5\u00a6"+
		"T\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0394\3\2\2\2\u0391"+
		"\u0392\5\u0270\u0139\2\u0392\u0393\5,\27\2\u0393\u0395\3\2\2\2\u0394\u0391"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395%\3\2\2\2\u0396\u0397\5\u026e\u0138"+
		"\2\u0397\u039b\5(\25\2\u0398\u0399\5\u017c\u00bf\2\u0399\u039a\5\u0130"+
		"\u0099\2\u039a\u039c\3\2\2\2\u039b\u0398\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\'\3\2\2\2\u039d\u03a3\5*\26\2\u039e\u039f\5\u017c\u00bf\2\u039f\u03a0"+
		"\5*\26\2\u03a0\u03a2\3\2\2\2\u03a1\u039e\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4)\3\2\2\2\u03a5\u03a3\3\2\2\2"+
		"\u03a6\u03a7\5\u014c\u00a7\2\u03a7\u03a8\5\u0202\u0102\2\u03a8\u03a9\5"+
		"\u0220\u0111\2\u03a9\u03aa\5\u0222\u0112\2\u03aa+\3\2\2\2\u03ab\u03ac"+
		"\5\u0090I\2\u03ac-\3\2\2\2\u03ad\u03ae\5\u0194\u00cb\2\u03ae\u03b0\5\u020a"+
		"\u0106\2\u03af\u03b1\5\u010c\u0087\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3"+
		"\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\5\u0148\u00a5\2\u03b3\u03b4\5\u0270"+
		"\u0139\2\u03b4\u03b5\5\u0236\u011c\2\u03b5\u03b6\7\u00cd\2\2\u03b6\u03b7"+
		"\5\u027a\u013e\2\u03b7\u03b8\5\u00c0a\2\u03b8\u03bc\5\u027c\u013f\2\u03b9"+
		"\u03ba\5\u017c\u00bf\2\u03ba\u03bb\5\u00c4c\2\u03bb\u03bd\3\2\2\2\u03bc"+
		"\u03b9\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd/\3\2\2\2\u03be\u03c0\5\u0194"+
		"\u00cb\2\u03bf\u03c1\5D#\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c4\5\u01b0\u00d9\2\u03c3\u03c5\5\u010c\u0087\2"+
		"\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c9\3\2\2\2\u03c6\u03c7"+
		"\5\u0148\u00a5\2\u03c7\u03c8\7\20\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c6"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\5\u0162\u00b2"+
		"\2\u03cc\u03ce\5\u0276\u013c\2\u03cd\u03cf\5\64\33\2\u03ce\u03cd\3\2\2"+
		"\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\5\u0278\u013d\2"+
		"\u03d1\u03d2\5\66\34\2\u03d2\u03d3\5\u0238\u011d\2\u03d3\u03d4\5\u014e"+
		"\u00a8\2\u03d4\u03d5\5\u020e\u0108\2\u03d5\u03d6\5\u0164\u00b3\2\u03d6"+
		"\u03d7\5\u0180\u00c1\2\u03d7\u03d8\5\62\32\2\u03d8\61\3\2\2\2\u03d9\u03da"+
		"\t\2\2\2\u03da\63\3\2\2\2\u03db\u03e1\5\u016c\u00b7\2\u03dc\u03dd\5\u0286"+
		"\u0144\2\u03dd\u03de\5\u016c\u00b7\2\u03de\u03e0\3\2\2\2\u03df\u03dc\3"+
		"\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\65\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e9\5\u018c\u00c7\2\u03e5\u03e6"+
		"\5\u0238\u011d\2\u03e6\u03e7\5\u0222\u0112\2\u03e7\u03e9\3\2\2\2\u03e8"+
		"\u03e4\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\5\u0226"+
		"\u0114\2\u03eb\u03ec\5\u0222\u0112\2\u03ec\u03ed\5\u01fc\u00ff\2\u03ed"+
		"\67\3\2\2\2\u03ee\u03f0\5\u0194\u00cb\2\u03ef\u03f1\5D#\2\u03f0\u03ef"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5\u0172\u00ba"+
		"\2\u03f3\u03f5\5\u010c\u0087\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2"+
		"\u03f5\u03f9\3\2\2\2\u03f6\u03f7\5\u0148\u00a5\2\u03f7\u03f8\7\20\2\2"+
		"\u03f8\u03fa\3\2\2\2\u03f9\u03f6\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fc\5\u0160\u00b1\2\u03fc\u03fd\5\u0276\u013c\2\u03fd"+
		"\u03fe\5\u014e\u00a8\2\u03fe\u03ff\5\u0278\u013d\2\u03ff\u0400\5\u0248"+
		"\u0125\2\u0400\u0401\5\u0162\u00b2\2\u0401\u0402\5\u024c\u0127\2\u0402"+
		"\u0403\5\u014e\u00a8\2\u0403\u0404\5\u01aa\u00d6\2\u0404\u0405\5\u0162"+
		"\u00b2\2\u0405\u0406\5\u01fa\u00fe\2\u0406\u0407\5:\36\2\u04079\3\2\2"+
		"\2\u0408\u040d\5\u013c\u009f\2\u0409\u040d\5B\"\2\u040a\u040d\5@!\2\u040b"+
		"\u040d\5<\37\2\u040c\u0408\3\2\2\2\u040c\u0409\3\2\2\2\u040c\u040a\3\2"+
		"\2\2\u040c\u040b\3\2\2\2\u040d;\3\2\2\2\u040e\u040f\5\u027a\u013e\2\u040f"+
		"\u0415\5> \2\u0410\u0411\5\u0286\u0144\2\u0411\u0412\5> \2\u0412\u0414"+
		"\3\2\2\2\u0413\u0410\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u0419\5\u027c"+
		"\u013f\2\u0419=\3\2\2\2\u041a\u041b\5\u016a\u00b6\2\u041b\u041c\7\13\2"+
		"\2\u041c\u041d\5:\36\2\u041d?\3\2\2\2\u041e\u041f\5\u0276\u013c\2\u041f"+
		"\u0426\5B\"\2\u0420\u0421\5\u0286\u0144\2\u0421\u0422\5\u013c\u009f\2"+
		"\u0422\u0425\3\2\2\2\u0423\u0425\5B\"\2\u0424\u0420\3\2\2\2\u0424\u0423"+
		"\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042a\5\u0278\u013d\2\u042aA"+
		"\3\2\2\2\u042b\u042c\5\u0276\u013c\2\u042c\u0432\5\u013c\u009f\2\u042d"+
		"\u042e\5\u0286\u0144\2\u042e\u042f\5\u013c\u009f\2\u042f\u0431\3\2\2\2"+
		"\u0430\u042d\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\5\u0278\u013d"+
		"\2\u0436C\3\2\2\2\u0437\u0438\5\u022a\u0116\2\u0438\u0439\5\u0234\u011b"+
		"\2\u0439E\3\2\2\2\u043a\u043b\5\u017a\u00be\2\u043b\u043c\5\u0264\u0133"+
		"\2\u043c\u043d\5\u0166\u00b4\2\u043d\u043e\5\u0270\u0139\2\u043e\u0440"+
		"\5H%\2\u043f\u0441\5J&\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"G\3\2\2\2\u0442\u0443\5\u022e\u0118\2\u0443\u0444\5\u0142\u00a2\2\u0444"+
		"I\3\2\2\2\u0445\u0448\5\u024e\u0128\2\u0446\u0448\5\u021c\u010f\2\u0447"+
		"\u0445\3\2\2\2\u0447\u0446\3\2\2\2\u0448K\3\2\2\2\u0449\u044a\5\u017a"+
		"\u00be\2\u044a\u044e\5\u025c\u012f\2\u044b\u044c\5\u0148\u00a5\2\u044c"+
		"\u044d\7\20\2\2\u044d\u044f\3\2\2\2\u044e\u044b\3\2\2\2\u044e\u044f\3"+
		"\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\5\u015e\u00b0\2\u0451\u0452\5N"+
		"(\2\u0452M\3\2\2\2\u0453\u0457\5X-\2\u0454\u0457\5V,\2\u0455\u0457\5P"+
		")\2\u0456\u0453\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0455\3\2\2\2\u0457"+
		"O\3\2\2\2\u0458\u0459\5\u0232\u011a\2\u0459\u045a\5R*\2\u045aQ\3\2\2\2"+
		"\u045b\u0461\5T+\2\u045c\u045d\5\u017c\u00bf\2\u045d\u045e\5T+\2\u045e"+
		"\u0460\3\2\2\2\u045f\u045c\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2"+
		"\2\2\u0461\u0462\3\2\2\2\u0462S\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0465"+
		"\5\u014c\u00a7\2\u0465\u0466\5\u0254\u012b\2\u0466\u0467\5\u014c\u00a7"+
		"\2\u0467U\3\2\2\2\u0468\u0469\5\u0170\u00b9\2\u0469\u046a\5 \21\2\u046a"+
		"W\3\2\2\2\u046b\u046c\5\u017a\u00be\2\u046c\u046d\5\u014c\u00a7\2\u046d"+
		"\u046e\5\u025c\u012f\2\u046e\u046f\5\u014e\u00a8\2\u046fY\3\2\2\2\u0470"+
		"\u0471\5\u017a\u00be\2\u0471\u0475\5\u0250\u0129\2\u0472\u0473\5\u0148"+
		"\u00a5\2\u0473\u0474\7\20\2\2\u0474\u0476\3\2\2\2\u0475\u0472\3\2\2\2"+
		"\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\5\u014a\u00a6\2\u0478"+
		"\u0479\5\\/\2\u0479[\3\2\2\2\u047a\u0481\5h\65\2\u047b\u0481\5d\63\2\u047c"+
		"\u0481\5d\63\2\u047d\u0481\5b\62\2\u047e\u0481\5`\61\2\u047f\u0481\5^"+
		"\60\2\u0480\u047a\3\2\2\2\u0480\u047b\3\2\2\2\u0480\u047c\3\2\2\2\u0480"+
		"\u047d\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u047f\3\2\2\2\u0481]\3\2\2\2"+
		"\u0482\u0483\5\u0270\u0139\2\u0483\u0484\5\u0090I\2\u0484_\3\2\2\2\u0485"+
		"\u0486\5\u0232\u011a\2\u0486\u0487\5\u014c\u00a7\2\u0487\u0488\5\u0254"+
		"\u012b\2\u0488\u0489\5\u014c\u00a7\2\u0489a\3\2\2\2\u048a\u048b\5\u019e"+
		"\u00d0\2\u048b\u048c\5\u0190\u00c9\2\u048c\u048d\5\u024a\u0126\2\u048d"+
		"c\3\2\2\2\u048e\u048f\5\u019e\u00d0\2\u048f\u0490\5f\64\2\u0490e\3\2\2"+
		"\2\u0491\u0497\5\u014c\u00a7\2\u0492\u0493\5\u0286\u0144\2\u0493\u0494"+
		"\5\u014c\u00a7\2\u0494\u0496\3\2\2\2\u0495\u0492\3\2\2\2\u0496\u0499\3"+
		"\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498g\3\2\2\2\u0499\u0497"+
		"\3\2\2\2\u049a\u049b\5\u0170\u00b9\2\u049b\u049c\5j\66\2\u049ci\3\2\2"+
		"\2\u049d\u049e\5\u014c\u00a7\2\u049e\u04a5\5\u014e\u00a8\2\u049f\u04a0"+
		"\5\u0286\u0144\2\u04a0\u04a1\5\u014c\u00a7\2\u04a1\u04a2\5\u014e\u00a8"+
		"\2\u04a2\u04a4\3\2\2\2\u04a3\u049f\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6k\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8"+
		"\u04a9\5\u017a\u00be\2\u04a9\u04aa\5\u023a\u011e\2\u04aa\u04ac\5\u0156"+
		"\u00ac\2\u04ab\u04ad\5n8\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"m\3\2\2\2\u04ae\u04af\5\u0270\u0139\2\u04af\u04b5\5p9\2\u04b0\u04b1\5"+
		"\u017c\u00bf\2\u04b1\u04b2\5p9\2\u04b2\u04b4\3\2\2\2\u04b3\u04b0\3\2\2"+
		"\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6o"+
		"\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04b9\5\u022e\u0118\2\u04b9\u04ba\7"+
		"\u00cd\2\2\u04ba\u04bb\5\u0142\u00a2\2\u04bb\u04c9\3\2\2\2\u04bc\u04bd"+
		"\5\u0216\u010c\2\u04bd\u04be\7\u00cd\2\2\u04be\u04bf\5\u0144\u00a3\2\u04bf"+
		"\u04c9\3\2\2\2\u04c0\u04c1\5\u024e\u0128\2\u04c1\u04c2\7\u00cd\2\2\u04c2"+
		"\u04c3\5\u0144\u00a3\2\u04c3\u04c9\3\2\2\2\u04c4\u04c5\5\u0228\u0115\2"+
		"\u04c5\u04c6\7\u00cd\2\2\u04c6\u04c7\5\u0098M\2\u04c7\u04c9\3\2\2\2\u04c8"+
		"\u04b8\3\2\2\2\u04c8\u04bc\3\2\2\2\u04c8\u04c0\3\2\2\2\u04c8\u04c4\3\2"+
		"\2\2\u04c9q\3\2\2\2\u04ca\u04cb\5\u017a\u00be\2\u04cb\u04cc\5\u0218\u010d"+
		"\2\u04cc\u04d0\5\u026c\u0137\2\u04cd\u04ce\5\u0148\u00a5\2\u04ce\u04cf"+
		"\7\20\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04cd\3\2\2\2\u04d0\u04d1\3\2\2\2"+
		"\u04d1\u04d2\3\2\2\2\u04d2\u04d6\5\u015c\u00af\2\u04d3\u04d4\5\u0270\u0139"+
		"\2\u04d4\u04d5\5\u0090I\2\u04d5\u04d7\3\2\2\2\u04d6\u04d3\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7s\3\2\2\2\u04d8\u04d9\5\u019e\u00d0\2\u04d9\u04db"+
		"\5\u0264\u0133\2\u04da\u04dc\5\u010e\u0088\2\u04db\u04da\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\5\u0166\u00b4\2\u04deu"+
		"\3\2\2\2\u04df\u04e0\5\u019e\u00d0\2\u04e0\u04e2\5\u025c\u012f\2\u04e1"+
		"\u04e3\5\u010e\u0088\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e7"+
		"\3\2\2\2\u04e4\u04e5\5\u0148\u00a5\2\u04e5\u04e6\7\20\2\2\u04e6\u04e8"+
		"\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ea\5\u015e\u00b0\2\u04eaw\3\2\2\2\u04eb\u04ec\5\u019e\u00d0\2\u04ec"+
		"\u04ed\5\u0218\u010d\2\u04ed\u04ef\5\u026c\u0137\2\u04ee\u04f0\5\u010e"+
		"\u0088\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f4\3\2\2\2\u04f1"+
		"\u04f2\5\u0148\u00a5\2\u04f2\u04f3\7\20\2\2\u04f3\u04f5\3\2\2\2\u04f4"+
		"\u04f1\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\5\u015c"+
		"\u00af\2\u04f7y\3\2\2\2\u04f8\u04f9\5\u019e\u00d0\2\u04f9\u04fb\5\u0172"+
		"\u00ba\2\u04fa\u04fc\5\u010e\u0088\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3"+
		"\2\2\2\u04fc\u0500\3\2\2\2\u04fd\u04fe\5\u0148\u00a5\2\u04fe\u04ff\7\20"+
		"\2\2\u04ff\u0501\3\2\2\2\u0500\u04fd\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u0503\5\u0160\u00b1\2\u0503{\3\2\2\2\u0504\u0505"+
		"\5\u019e\u00d0\2\u0505\u0507\5\u01b0\u00d9\2\u0506\u0508\5\u010e\u0088"+
		"\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050c\3\2\2\2\u0509\u050a"+
		"\5\u0148\u00a5\2\u050a\u050b\7\20\2\2\u050b\u050d\3\2\2\2\u050c\u0509"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\5\u0162\u00b2"+
		"\2\u050f}\3\2\2\2\u0510\u0511\5\u019e\u00d0\2\u0511\u0513\5\u0256\u012c"+
		"\2\u0512\u0514\5\u010e\u0088\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2"+
		"\u0514\u0515\3\2\2\2\u0515\u0516\5\u0158\u00ad\2\u0516\u051a\5\u0226\u0114"+
		"\2\u0517\u0518\5\u0148\u00a5\2\u0518\u0519\7\20\2\2\u0519\u051b\3\2\2"+
		"\2\u051a\u0517\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d"+
		"\5\u014a\u00a6\2\u051d\177\3\2\2\2\u051e\u051f\5\u019e\u00d0\2\u051f\u0521"+
		"\5\u023a\u011e\2\u0520\u0522\5\u010e\u0088\2\u0521\u0520\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\5\u0156\u00ac\2\u0524\u0081"+
		"\3\2\2\2\u0525\u0526\5\u019e\u00d0\2\u0526\u0528\5\u0250\u0129\2\u0527"+
		"\u0529\5\u010e\u0088\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052d"+
		"\3\2\2\2\u052a\u052b\5\u0148\u00a5\2\u052b\u052c\7\20\2\2\u052c\u052e"+
		"\3\2\2\2\u052d\u052a\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0530\5\u014a\u00a6\2\u0530\u0083\3\2\2\2\u0531\u0532\5\u019e\u00d0\2"+
		"\u0532\u0534\5\u020a\u0106\2\u0533\u0535\5\u010e\u0088\2\u0534\u0533\3"+
		"\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\5\u0148\u00a5"+
		"\2\u0537\u0085\3\2\2\2\u0538\u0539\5\u019e\u00d0\2\u0539\u053b\5\u01ba"+
		"\u00de\2\u053a\u053c\5\u010e\u0088\2\u053b\u053a\3\2\2\2\u053b\u053c\3"+
		"\2\2\2\u053c\u0540\3\2\2\2\u053d\u053e\5\u0148\u00a5\2\u053e\u053f\7\20"+
		"\2\2\u053f\u0541\3\2\2\2\u0540\u053d\3\2\2\2\u0540\u0541\3\2\2\2\u0541"+
		"\u0542\3\2\2\2\u0542\u0543\5\u00dan\2\u0543\u0087\3\2\2\2\u0544\u0545"+
		"\5\u0194\u00cb\2\u0545\u0547\5\u0250\u0129\2\u0546\u0548\5\u010c\u0087"+
		"\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054c\3\2\2\2\u0549\u054a"+
		"\5\u0148\u00a5\2\u054a\u054b\7\20\2\2\u054b\u054d\3\2\2\2\u054c\u0549"+
		"\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\5\u014a\u00a6"+
		"\2\u054f\u0550\5\u0276\u013c\2\u0550\u0551\5\u00a0Q\2\u0551\u0553\5\u0278"+
		"\u013d\2\u0552\u0554\5\u008aF\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2"+
		"\2\u0554\u0089\3\2\2\2\u0555\u0557\5\u0270\u0139\2\u0556\u0558\5\u0090"+
		"I\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u008b\3\2\2\2\u0559"+
		"\u055b\5\u014c\u00a7\2\u055a\u055c\5\u0154\u00ab\2\u055b\u055a\3\2\2\2"+
		"\u055b\u055c\3\2\2\2\u055c\u0564\3\2\2\2\u055d\u055e\5\u0286\u0144\2\u055e"+
		"\u0560\5\u014c\u00a7\2\u055f\u0561\5\u0154\u00ab\2\u0560\u055f\3\2\2\2"+
		"\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u055d\3\2\2\2\u0563\u0566"+
		"\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u008d\3\2\2\2\u0566"+
		"\u0564\3\2\2\2\u0567\u0568\5\u018e\u00c8\2\u0568\u0569\5\u022c\u0117\2"+
		"\u0569\u056a\5\u018a\u00c6\2\u056a\u056b\5\u0276\u013c\2\u056b\u056c\5"+
		"\u008cG\2\u056c\u056d\5\u0278\u013d\2\u056d\u008f\3\2\2\2\u056e\u0574"+
		"\5\u0092J\2\u056f\u0570\5\u017c\u00bf\2\u0570\u0571\5\u0092J\2\u0571\u0573"+
		"\3\2\2\2\u0572\u056f\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574"+
		"\u0575\3\2\2\2\u0575\u0091\3\2\2\2\u0576\u0574\3\2\2\2\u0577\u0578\5\u0094"+
		"K\2\u0578\u0579\7\u00cd\2\2\u0579\u057a\5\u0096L\2\u057a\u0581\3\2\2\2"+
		"\u057b\u057c\5\u0094K\2\u057c\u057d\7\u00cd\2\2\u057d\u057e\5\u0098M\2"+
		"\u057e\u0581\3\2\2\2\u057f\u0581\5\u008eH\2\u0580\u0577\3\2\2\2\u0580"+
		"\u057b\3\2\2\2\u0580\u057f\3\2\2\2\u0581\u0093\3\2\2\2\u0582\u0583\5\u028a"+
		"\u0146\2\u0583\u0095\3\2\2\2\u0584\u0588\5\u0142\u00a2\2\u0585\u0588\5"+
		"\u0140\u00a1\2\u0586\u0588\5\u028a\u0146\2\u0587\u0584\3\2\2\2\u0587\u0585"+
		"\3\2\2\2\u0587\u0586\3\2\2\2\u0588\u0097\3\2\2\2\u0589\u058a\5\u027a\u013e"+
		"\2\u058a\u0590\5\u009aN\2\u058b\u058c\5\u0286\u0144\2\u058c\u058d\5\u009a"+
		"N\2\u058d\u058f\3\2\2\2\u058e\u058b\3\2\2\2\u058f\u0592\3\2\2\2\u0590"+
		"\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u0590\3\2"+
		"\2\2\u0593\u0594\5\u027c\u013f\2\u0594\u0099\3\2\2\2\u0595\u0596\5\u009c"+
		"O\2\u0596\u0597\7\13\2\2\u0597\u0598\5\u009eP\2\u0598\u009b\3\2\2\2\u0599"+
		"\u059a\5\u0142\u00a2\2\u059a\u009d\3\2\2\2\u059b\u059f\5\u0142\u00a2\2"+
		"\u059c\u059f\5\u0144\u00a3\2\u059d\u059f\5\u0140\u00a1\2\u059e\u059b\3"+
		"\2\2\2\u059e\u059c\3\2\2\2\u059e\u059d\3\2\2\2\u059f\u009f\3\2\2\2\u05a0"+
		"\u05a6\5\u00a2R\2\u05a1\u05a2\5\u0286\u0144\2\u05a2\u05a3\5\u00a2R\2\u05a3"+
		"\u05a5\3\2\2\2\u05a4\u05a1\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6\u05a4\3\2"+
		"\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05ac\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9"+
		"\u05aa\5\u0286\u0144\2\u05aa\u05ab\5\u00a6T\2\u05ab\u05ad\3\2\2\2\u05ac"+
		"\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u00a1\3\2\2\2\u05ae\u05af\5\u014c"+
		"\u00a7\2\u05af\u05b1\5\u014e\u00a8\2\u05b0\u05b2\5\u00a4S\2\u05b1\u05b0"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u00a3\3\2\2\2\u05b3\u05b4\5\u0230\u0119"+
		"\2\u05b4\u05b5\5\u0206\u0104\2\u05b5\u00a5\3\2\2\2\u05b6\u05b7\5\u0230"+
		"\u0119\2\u05b7\u05b8\5\u0206\u0104\2\u05b8\u05b9\5\u0276\u013c\2\u05b9"+
		"\u05ba\5\u00a8U\2\u05ba\u05bb\5\u0278\u013d\2\u05bb\u00a7\3\2\2\2\u05bc"+
		"\u05c0\5\u00aaV\2\u05bd\u05c0\5\u00acW\2\u05be\u05c0\5\u00aeX\2\u05bf"+
		"\u05bc\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05be\3\2\2\2\u05c0\u00a9\3\2"+
		"\2\2\u05c1\u05c2\5\u014c\u00a7\2\u05c2\u00ab\3\2\2\2\u05c3\u05c7\5\u00b4"+
		"[\2\u05c4\u05c5\5\u0286\u0144\2\u05c5\u05c6\5\u00b2Z\2\u05c6\u05c8\3\2"+
		"\2\2\u05c7\u05c4\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u00ad\3\2\2\2\u05c9"+
		"\u05ca\5\u0276\u013c\2\u05ca\u05cb\5\u00b0Y\2\u05cb\u05cf\5\u0278\u013d"+
		"\2\u05cc\u05cd\5\u0286\u0144\2\u05cd\u05ce\5\u00b2Z\2\u05ce\u05d0\3\2"+
		"\2\2\u05cf\u05cc\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u00af\3\2\2\2\u05d1"+
		"\u05d7\5\u00b4[\2\u05d2\u05d3\5\u0286\u0144\2\u05d3\u05d4\5\u00b4[\2\u05d4"+
		"\u05d6\3\2\2\2\u05d5\u05d2\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2"+
		"\2\2\u05d7\u05d8\3\2\2\2\u05d8\u00b1\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da"+
		"\u05e0\5\u00b6\\\2\u05db\u05dc\5\u0286\u0144\2\u05dc\u05dd\5\u00b6\\\2"+
		"\u05dd\u05df\3\2\2\2\u05de\u05db\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de"+
		"\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u00b3\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3"+
		"\u05e4\5\u014c\u00a7\2\u05e4\u00b5\3\2\2\2\u05e5\u05e6\5\u014c\u00a7\2"+
		"\u05e6\u00b7\3\2\2\2\u05e7\u05e8\5\u017e\u00c0\2\u05e8\u05e9\5\u0186\u00c4"+
		"\2\u05e9\u00b9\3\2\2\2\u05ea\u05ec\5\u0188\u00c5\2\u05eb\u05ed\5\u00bc"+
		"_\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05f0\5\u0186\u00c4\2\u05ef\u05f1\5\u010a\u0086\2\u05f0\u05ef\3\2\2\2"+
		"\u05f0\u05f1\3\2\2\2\u05f1\u00bb\3\2\2\2\u05f2\u05f5\5\u0214\u010b\2\u05f3"+
		"\u05f5\5\u025e\u0130\2\u05f4\u05f2\3\2\2\2\u05f4\u05f3\3\2\2\2\u05f5\u00bd"+
		"\3\2\2\2\u05f6\u05f7\5\u017a\u00be\2\u05f7\u05f8\5\u020a\u0106\2\u05f8"+
		"\u05f9\5\u0148\u00a5\2\u05f9\u05fa\5\u0270\u0139\2\u05fa\u05fb\5\u0236"+
		"\u011c\2\u05fb\u05fc\7\u00cd\2\2\u05fc\u05fd\5\u027a\u013e\2\u05fd\u05fe"+
		"\5\u00c0a\2\u05fe\u0602\5\u027c\u013f\2\u05ff\u0600\5\u017c\u00bf\2\u0600"+
		"\u0601\5\u00c4c\2\u0601\u0603\3\2\2\2\u0602\u05ff\3\2\2\2\u0602\u0603"+
		"\3\2\2\2\u0603\u00bf\3\2\2\2\u0604\u060a\5\u00c2b\2\u0605\u0606\5\u0286"+
		"\u0144\2\u0606\u0607\5\u00c2b\2\u0607\u0609\3\2\2\2\u0608\u0605\3\2\2"+
		"\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u00c1"+
		"\3\2\2\2\u060c\u060a\3\2\2\2\u060d\u060e\7\u00c6\2\2\u060e\u060f\7\13"+
		"\2\2\u060f\u0614\7\u00c6\2\2\u0610\u0611\7\u00c6\2\2\u0611\u0612\7\13"+
		"\2\2\u0612\u0614\7\u00c7\2\2\u0613\u060d\3\2\2\2\u0613\u0610\3\2\2\2\u0614"+
		"\u00c3\3\2\2\2\u0615\u0616\5\u01a0\u00d1\2\u0616\u0617\7\u00cd\2\2\u0617"+
		"\u0618\5\u0144\u00a3\2\u0618\u00c5\3\2\2\2\u0619\u061a\5\u0262\u0132\2"+
		"\u061a\u061b\5\u0148\u00a5\2\u061b\u00c7\3\2\2\2\u061c\u061e\5\u0258\u012d"+
		"\2\u061d\u061f\5\u0250\u0129\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2"+
		"\u061f\u0623\3\2\2\2\u0620\u0621\5\u0148\u00a5\2\u0621\u0622\7\20\2\2"+
		"\u0622\u0624\3\2\2\2\u0623\u0620\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625"+
		"\3\2\2\2\u0625\u0626\5\u014a\u00a6\2\u0626\u00c9\3\2\2\2\u0627\u0628\5"+
		"\u0194\u00cb\2\u0628\u062a\5\u01ba\u00de\2\u0629\u062b\5\u010c\u0087\2"+
		"\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062d\3\2\2\2\u062c\u062e"+
		"\5\u00dan\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2"+
		"\2\u062f\u0633\5\u0226\u0114\2\u0630\u0631\5\u0148\u00a5\2\u0631\u0632"+
		"\7\20\2\2\u0632\u0634\3\2\2\2\u0633\u0630\3\2\2\2\u0633\u0634\3\2\2\2"+
		"\u0634\u0635\3\2\2\2\u0635\u0636\5\u014a\u00a6\2\u0636\u0637\5\u0276\u013c"+
		"\2\u0637\u0638\5\u00dco\2\u0638\u0639\5\u0278\u013d\2\u0639\u0663\3\2"+
		"\2\2\u063a\u063b\5\u0194\u00cb\2\u063b\u063c\5\u01bc\u00df\2\u063c\u063e"+
		"\5\u01ba\u00de\2\u063d\u063f\5\u010c\u0087\2\u063e\u063d\3\2\2\2\u063e"+
		"\u063f\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u0642\5\u00dan\2\u0641\u0640"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0647\5\u0226\u0114"+
		"\2\u0644\u0645\5\u0148\u00a5\2\u0645\u0646\7\20\2\2\u0646\u0648\3\2\2"+
		"\2\u0647\u0644\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a"+
		"\5\u014a\u00a6\2\u064a\u064b\5\u0276\u013c\2\u064b\u064c\5\u00dco\2\u064c"+
		"\u064d\5\u0278\u013d\2\u064d\u064e\5\u0268\u0135\2\u064e\u0660\5\u01c4"+
		"\u00e3\2\u064f\u0650\5\u0270\u0139\2\u0650\u0651\5\u0228\u0115\2\u0651"+
		"\u0652\7\u00cd\2\2\u0652\u0653\7\5\2\2\u0653\u0654\5\u01f8\u00fd\2\u0654"+
		"\u0655\7\13\2\2\u0655\u0656\5\u0144\u00a3\2\u0656\u0657\7\t\2\2\u0657"+
		"\u0658\5\u01c2\u00e2\2\u0658\u0659\7\13\2\2\u0659\u065a\5\u0144\u00a3"+
		"\2\u065a\u065b\7\t\2\2\u065b\u065c\5\u01c0\u00e1\2\u065c\u065d\7\13\2"+
		"\2\u065d\u065e\5\u0144\u00a3\2\u065e\u065f\7\6\2\2\u065f\u0661\3\2\2\2"+
		"\u0660\u064f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0663\3\2\2\2\u0662\u0627"+
		"\3\2\2\2\u0662\u063a\3\2\2\2\u0663\u00cb\3\2\2\2\u0664\u0665\5\u0194\u00cb"+
		"\2\u0665\u0666\5\u01be\u00e0\2\u0666\u0668\5\u01ba\u00de\2\u0667\u0669"+
		"\5\u010c\u0087\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3"+
		"\2\2\2\u066a\u066e\5\u0226\u0114\2\u066b\u066c\5\u0148\u00a5\2\u066c\u066d"+
		"\7\20\2\2\u066d\u066f\3\2\2\2\u066e\u066b\3\2\2\2\u066e\u066f\3\2\2\2"+
		"\u066f\u0670\3\2\2\2\u0670\u068b\5\u014a\u00a6\2\u0671\u0675\7\u0091\2"+
		"\2\u0672\u0673\5\u01d4\u00eb\2\u0673\u0674\5\u00d6l\2\u0674\u0676\3\2"+
		"\2\2\u0675\u0672\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u067d\3\2\2\2\u0677"+
		"\u0679\5\u017c\u00bf\2\u0678\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a"+
		"\3\2\2\2\u067a\u067b\5\u01d6\u00ec\2\u067b\u067c\5\u00d4k\2\u067c\u067e"+
		"\3\2\2\2\u067d\u0678\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0683\3\2\2\2\u067f"+
		"\u0681\5\u017c\u00bf\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682"+
		"\3\2\2\2\u0682\u0684\5\u00ceh\2\u0683\u0680\3\2\2\2\u0683\u0684\3\2\2"+
		"\2\u0684\u0689\3\2\2\2\u0685\u0687\5\u017c\u00bf\2\u0686\u0685\3\2\2\2"+
		"\u0686\u0687\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a\5\u00d2j\2\u0689"+
		"\u0686\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u0671\3\2"+
		"\2\2\u068b\u068c\3\2\2\2\u068c\u00cd\3\2\2\2\u068d\u068e\5\u01d8\u00ed"+
		"\2\u068e\u0693\7\5\2\2\u068f\u0690\5\u01da\u00ee\2\u0690\u0691\7\13\2"+
		"\2\u0691\u0692\5\u013e\u00a0\2\u0692\u0694\3\2\2\2\u0693\u068f\3\2\2\2"+
		"\u0693\u0694\3\2\2\2\u0694\u069c\3\2\2\2\u0695\u0697\5\u0286\u0144\2\u0696"+
		"\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\5\u01dc"+
		"\u00ef\2\u0699\u069a\7\13\2\2\u069a\u069b\5\u0142\u00a2\2\u069b\u069d"+
		"\3\2\2\2\u069c\u0696\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a5\3\2\2\2\u069e"+
		"\u06a0\5\u0286\u0144\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1"+
		"\3\2\2\2\u06a1\u06a2\5\u01de\u00f0\2\u06a2\u06a3\7\13\2\2\u06a3\u06a4"+
		"\5\u00d0i\2\u06a4\u06a6\3\2\2\2\u06a5\u069f\3\2\2\2\u06a5\u06a6\3\2\2"+
		"\2\u06a6\u06ae\3\2\2\2\u06a7\u06a9\5\u0286\u0144\2\u06a8\u06a7\3\2\2\2"+
		"\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\5\u01e0\u00f1\2\u06ab"+
		"\u06ac\7\13\2\2\u06ac\u06ad\5\u013e\u00a0\2\u06ad\u06af\3\2\2\2\u06ae"+
		"\u06a8\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b7\3\2\2\2\u06b0\u06b2\5\u0286"+
		"\u0144\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3"+
		"\u06b4\5\u01e2\u00f2\2\u06b4\u06b5\7\13\2\2\u06b5\u06b6\5\u013e\u00a0"+
		"\2\u06b6\u06b8\3\2\2\2\u06b7\u06b1\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06c0"+
		"\3\2\2\2\u06b9\u06bb\5\u0286\u0144\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3"+
		"\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bd\5\u01e4\u00f3\2\u06bd\u06be\7\13"+
		"\2\2\u06be\u06bf\5\u0142\u00a2\2\u06bf\u06c1\3\2\2\2\u06c0\u06ba\3\2\2"+
		"\2\u06c0\u06c1\3\2\2\2\u06c1\u06c9\3\2\2\2\u06c2\u06c4\5\u0286\u0144\2"+
		"\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6"+
		"\5\u01e6\u00f4\2\u06c6\u06c7\7\13\2\2\u06c7\u06c8\5\u013e\u00a0\2\u06c8"+
		"\u06ca\3\2\2\2\u06c9\u06c3\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06d2\3\2"+
		"\2\2\u06cb\u06cd\5\u0286\u0144\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2"+
		"\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\5\u01e8\u00f5\2\u06cf\u06d0\7\13\2"+
		"\2\u06d0\u06d1\5\u013e\u00a0\2\u06d1\u06d3\3\2\2\2\u06d2\u06cc\3\2\2\2"+
		"\u06d2\u06d3\3\2\2\2\u06d3\u06db\3\2\2\2\u06d4\u06d6\5\u0286\u0144\2\u06d5"+
		"\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\5\u01ea"+
		"\u00f6\2\u06d8\u06d9\7\13\2\2\u06d9\u06da\5\u013e\u00a0\2\u06da\u06dc"+
		"\3\2\2\2\u06db\u06d5\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06e4\3\2\2\2\u06dd"+
		"\u06df\5\u0286\u0144\2\u06de\u06dd\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0"+
		"\3\2\2\2\u06e0\u06e1\5\u01ec\u00f7\2\u06e1\u06e2\7\13\2\2\u06e2\u06e3"+
		"\5\u0144\u00a3\2\u06e3\u06e5\3\2\2\2\u06e4\u06de\3\2\2\2\u06e4\u06e5\3"+
		"\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\7\6\2\2\u06e7\u00cf\3\2\2\2\u06e8"+
		"\u06eb\5\u01f4\u00fb\2\u06e9\u06eb\5\u01f6\u00fc\2\u06ea\u06e8\3\2\2\2"+
		"\u06ea\u06e9\3\2\2\2\u06eb\u00d1\3\2\2\2\u06ec\u06ed\5\u0228\u0115\2\u06ed"+
		"\u06f2\7\5\2\2\u06ee\u06ef\5\u01ee\u00f8\2\u06ef\u06f0\7\13\2\2\u06f0"+
		"\u06f1\5\u0144\u00a3\2\u06f1\u06f3\3\2\2\2\u06f2\u06ee\3\2\2\2\u06f2\u06f3"+
		"\3\2\2\2\u06f3\u06fb\3\2\2\2\u06f4\u06f6\5\u0286\u0144\2\u06f5\u06f4\3"+
		"\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\5\u01f0\u00f9"+
		"\2\u06f8\u06f9\7\13\2\2\u06f9\u06fa\5\u0144\u00a3\2\u06fa\u06fc\3\2\2"+
		"\2\u06fb\u06f5\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u0704\3\2\2\2\u06fd\u06ff"+
		"\5\u0286\u0144\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700\3"+
		"\2\2\2\u0700\u0701\5\u01f2\u00fa\2\u0701\u0702\7\13\2\2\u0702\u0703\5"+
		"\u0144\u00a3\2\u0703\u0705\3\2\2\2\u0704\u06fe\3\2\2\2\u0704\u0705\3\2"+
		"\2\2\u0705\u0706\3\2\2\2\u0706\u0707\7\6\2\2\u0707\u00d3\3\2\2\2\u0708"+
		"\u070c\5\u01c8\u00e5\2\u0709\u070c\5\u01c6\u00e4\2\u070a\u070c\5\u01ca"+
		"\u00e6\2\u070b\u0708\3\2\2\2\u070b\u0709\3\2\2\2\u070b\u070a\3\2\2\2\u070c"+
		"\u00d5\3\2\2\2\u070d\u0713\5\u00d8m\2\u070e\u070f\5\u0286\u0144\2\u070f"+
		"\u0710\5\u00d8m\2\u0710\u0712\3\2\2\2\u0711\u070e\3\2\2\2\u0712\u0715"+
		"\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u00d7\3\2\2\2\u0715"+
		"\u0713\3\2\2\2\u0716\u073a\5\u014c\u00a7\2\u0717\u071c\7\5\2\2\u0718\u0719"+
		"\5\u01cc\u00e7\2\u0719\u071a\7\13\2\2\u071a\u071b\5\u0144\u00a3\2\u071b"+
		"\u071d\3\2\2\2\u071c\u0718\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0725\3\2"+
		"\2\2\u071e\u0720\5\u0286\u0144\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2"+
		"\2\u0720\u0721\3\2\2\2\u0721\u0722\5\u01ce\u00e8\2\u0722\u0723\7\13\2"+
		"\2\u0723\u0724\5\u0144\u00a3\2\u0724\u0726\3\2\2\2\u0725\u071f\3\2\2\2"+
		"\u0725\u0726\3\2\2\2\u0726\u072e\3\2\2\2\u0727\u0729\5\u0286\u0144\2\u0728"+
		"\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b\5\u01d0"+
		"\u00e9\2\u072b\u072c\7\13\2\2\u072c\u072d\5\u0144\u00a3\2\u072d\u072f"+
		"\3\2\2\2\u072e\u0728\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0737\3\2\2\2\u0730"+
		"\u0732\5\u0286\u0144\2\u0731\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u0734\5\u01d2\u00ea\2\u0734\u0735\7\13\2\2\u0735\u0736"+
		"\5\u0144\u00a3\2\u0736\u0738\3\2\2\2\u0737\u0731\3\2\2\2\u0737\u0738\3"+
		"\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\7\6\2\2\u073a\u0717\3\2\2\2\u073a"+
		"\u073b\3\2\2\2\u073b\u0763\3\2\2\2\u073c\u0760\7\21\2\2\u073d\u0742\7"+
		"\5\2\2\u073e\u073f\5\u01cc\u00e7\2\u073f\u0740\7\13\2\2\u0740\u0741\5"+
		"\u0144\u00a3\2\u0741\u0743\3\2\2\2\u0742\u073e\3\2\2\2\u0742\u0743\3\2"+
		"\2\2\u0743\u074b\3\2\2\2\u0744\u0746\5\u0286\u0144\2\u0745\u0744\3\2\2"+
		"\2\u0745\u0746\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\5\u01ce\u00e8\2"+
		"\u0748\u0749\7\13\2\2\u0749\u074a\5\u0144\u00a3\2\u074a\u074c\3\2\2\2"+
		"\u074b\u0745\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u0754\3\2\2\2\u074d\u074f"+
		"\5\u0286\u0144\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\3"+
		"\2\2\2\u0750\u0751\5\u01d0\u00e9\2\u0751\u0752\7\13\2\2\u0752\u0753\5"+
		"\u0144\u00a3\2\u0753\u0755\3\2\2\2\u0754\u074e\3\2\2\2\u0754\u0755\3\2"+
		"\2\2\u0755\u075d\3\2\2\2\u0756\u0758\5\u0286\u0144\2\u0757\u0756\3\2\2"+
		"\2\u0757\u0758\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a\5\u01d2\u00ea\2"+
		"\u075a\u075b\7\13\2\2\u075b\u075c\5\u0144\u00a3\2\u075c\u075e\3\2\2\2"+
		"\u075d\u0757\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761"+
		"\7\6\2\2\u0760\u073d\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762"+
		"\u0716\3\2\2\2\u0762\u073c\3\2\2\2\u0763\u00d9\3\2\2\2\u0764\u0767\5\u028a"+
		"\u0146\2\u0765\u0767\5\u0142\u00a2\2\u0766\u0764\3\2\2\2\u0766\u0765\3"+
		"\2\2\2\u0767\u00db\3\2\2\2\u0768\u076e\5\u014c\u00a7\2\u0769\u076e\5\u00de"+
		"p\2\u076a\u076e\5\u00e0q\2\u076b\u076e\5\u00e2r\2\u076c\u076e\5\u00e4"+
		"s\2\u076d\u0768\3\2\2\2\u076d\u0769\3\2\2\2\u076d\u076a\3\2\2\2\u076d"+
		"\u076b\3\2\2\2\u076d\u076c\3\2\2\2\u076e\u00dd\3\2\2\2\u076f\u0770\5\u0208"+
		"\u0105\2\u0770\u0771\5\u0276\u013c\2\u0771\u0772\5\u014c\u00a7\2\u0772"+
		"\u0773\5\u0278\u013d\2\u0773\u00df\3\2\2\2\u0774\u0775\5\u01a2\u00d2\2"+
		"\u0775\u0776\5\u0276\u013c\2\u0776\u0777\5\u014c\u00a7\2\u0777\u0778\5"+
		"\u0278\u013d\2\u0778\u00e1\3\2\2\2\u0779\u077a\5\u01ae\u00d8\2\u077a\u077b"+
		"\5\u0276\u013c\2\u077b\u077c\5\u014c\u00a7\2\u077c\u077d\5\u0278\u013d"+
		"\2\u077d\u00e3\3\2\2\2\u077e\u077f\5\u026a\u0136\2\u077f\u0780\5\u0276"+
		"\u013c\2\u0780\u0781\5\u014c\u00a7\2\u0781\u0782\5\u0278\u013d\2\u0782"+
		"\u00e5\3\2\2\2\u0783\u0785\5\u00ba^\2\u0784\u0783\3\2\2\2\u0784\u0785"+
		"\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0788\5\u0196\u00cc\2\u0787\u0789\5"+
		"\u00e8u\2\u0788\u0787\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078a\3\2\2\2"+
		"\u078a\u078c\5\u0120\u0091\2\u078b\u078d\5\u010a\u0086\2\u078c\u078b\3"+
		"\2\2\2\u078c\u078d\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0791\5\u0128\u0095"+
		"\2\u078f\u0792\5\u010e\u0088\2\u0790\u0792\5\u00eex\2\u0791\u078f\3\2"+
		"\2\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u00e7\3\2\2\2\u0793"+
		"\u0799\5\u00eav\2\u0794\u0795\5\u0286\u0144\2\u0795\u0796\5\u00eav\2\u0796"+
		"\u0798\3\2\2\2\u0797\u0794\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u0797\3\2"+
		"\2\2\u0799\u079a\3\2\2\2\u079a\u00e9\3\2\2\2\u079b\u0799\3\2\2\2\u079c"+
		"\u07a6\5\u028a\u0146\2\u079d\u079e\5\u028a\u0146\2\u079e\u07a1\7\7\2\2"+
		"\u079f\u07a2\5\u0142\u00a2\2\u07a0\u07a2\5\u013e\u00a0\2\u07a1\u079f\3"+
		"\2\2\2\u07a1\u07a0\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\7\b\2\2\u07a4"+
		"\u07a6\3\2\2\2\u07a5\u079c\3\2\2\2\u07a5\u079d\3\2\2\2\u07a6\u00eb\3\2"+
		"\2\2\u07a7\u07a9\5\u00ba^\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9"+
		"\u07aa\3\2\2\2\u07aa\u07ae\5\u0260\u0131\2\u07ab\u07ac\5\u0148\u00a5\2"+
		"\u07ac\u07ad\7\20\2\2\u07ad\u07af\3\2\2\2\u07ae\u07ab\3\2\2\2\u07ae\u07af"+
		"\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\5\u014a\u00a6\2\u07b1\u07b3\5"+
		"\u0104\u0083\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2"+
		"\2\2\u07b4\u07b5\5\u0246\u0124\2\u07b5\u07b6\5\u00f4{\2\u07b6\u07b9\5"+
		"\u0128\u0095\2\u07b7\u07ba\5\u010e\u0088\2\u07b8\u07ba\5\u00eex\2\u07b9"+
		"\u07b7\3\2\2\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u00ed\3\2"+
		"\2\2\u07bb\u07bc\5\u01b6\u00dc\2\u07bc\u07bd\5\u00f0y\2\u07bd\u00ef\3"+
		"\2\2\2\u07be\u07c4\5\u00f2z\2\u07bf\u07c0\5\u017c\u00bf\2\u07c0\u07c1"+
		"\5\u00f2z\2\u07c1\u07c3\3\2\2\2\u07c2\u07bf\3\2\2\2\u07c3\u07c6\3\2\2"+
		"\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u00f1\3\2\2\2\u07c6\u07c4"+
		"\3\2\2\2\u07c7\u07c8\5\u028a\u0146\2\u07c8\u07c9\7\u00cd\2\2\u07c9\u07ca"+
		"\5\u013c\u009f\2\u07ca\u00f3\3\2\2\2\u07cb\u07d1\5\u00f6|\2\u07cc\u07cd"+
		"\5\u0286\u0144\2\u07cd\u07ce\5\u00f6|\2\u07ce\u07d0\3\2\2\2\u07cf\u07cc"+
		"\3\2\2\2\u07d0\u07d3\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2"+
		"\u00f5\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d4\u07d5\5\u028a\u0146\2\u07d5\u07da"+
		"\7\u00cd\2\2\u07d6\u07db\5\u013c\u009f\2\u07d7\u07db\5\u00fa~\2\u07d8"+
		"\u07db\5\u00f8}\2\u07d9\u07db\5\u00fe\u0080\2\u07da\u07d6\3\2\2\2\u07da"+
		"\u07d7\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07d9\3\2\2\2\u07db\u080e\3\2"+
		"\2\2\u07dc\u07dd\5\u028a\u0146\2\u07dd\u07de\7\u00cd\2\2\u07de\u07df\5"+
		"\u028a\u0146\2\u07df\u07e0\t\3\2\2\u07e0\u07e1\5\u013e\u00a0\2\u07e1\u080e"+
		"\3\2\2\2\u07e2\u07e3\5\u028a\u0146\2\u07e3\u07e4\7\u00cd\2\2\u07e4\u07e5"+
		"\5\u028a\u0146\2\u07e5\u07e6\t\3\2\2\u07e6\u07e7\5\u00f8}\2\u07e7\u080e"+
		"\3\2\2\2\u07e8\u07e9\5\u028a\u0146\2\u07e9\u07ea\7\u00cd\2\2\u07ea\u07eb"+
		"\5\u00f8}\2\u07eb\u07ec\t\3\2\2\u07ec\u07ed\5\u028a\u0146\2\u07ed\u080e"+
		"\3\2\2\2\u07ee\u07ef\5\u028a\u0146\2\u07ef\u07f0\7\u00cd\2\2\u07f0\u07f1"+
		"\5\u028a\u0146\2\u07f1\u07f2\t\3\2\2\u07f2\u07f3\5\u00fa~\2\u07f3\u080e"+
		"\3\2\2\2\u07f4\u07f5\5\u028a\u0146\2\u07f5\u07f6\7\u00cd\2\2\u07f6\u07f7"+
		"\5\u00fa~\2\u07f7\u07f8\t\3\2\2\u07f8\u07f9\5\u028a\u0146\2\u07f9\u080e"+
		"\3\2\2\2\u07fa\u07fb\5\u028a\u0146\2\u07fb\u07fc\7\u00cd\2\2\u07fc\u07fd"+
		"\5\u028a\u0146\2\u07fd\u07fe\t\3\2\2\u07fe\u07ff\5\u00fe\u0080\2\u07ff"+
		"\u080e\3\2\2\2\u0800\u0801\5\u028a\u0146\2\u0801\u0802\7\u00cd\2\2\u0802"+
		"\u0803\5\u00fe\u0080\2\u0803\u0804\t\3\2\2\u0804\u0805\5\u028a\u0146\2"+
		"\u0805\u080e\3\2\2\2\u0806\u0807\5\u028a\u0146\2\u0807\u0808\5\u0282\u0142"+
		"\2\u0808\u0809\5\u013e\u00a0\2\u0809\u080a\5\u0284\u0143\2\u080a\u080b"+
		"\7\u00cd\2\2\u080b\u080c\5\u013c\u009f\2\u080c\u080e\3\2\2\2\u080d\u07d4"+
		"\3\2\2\2\u080d\u07dc\3\2\2\2\u080d\u07e2\3\2\2\2\u080d\u07e8\3\2\2\2\u080d"+
		"\u07ee\3\2\2\2\u080d\u07f4\3\2\2\2\u080d\u07fa\3\2\2\2\u080d\u0800\3\2"+
		"\2\2\u080d\u0806\3\2\2\2\u080e\u00f7\3\2\2\2\u080f\u0819\5\u027a\u013e"+
		"\2\u0810\u0816\5\u013c\u009f\2\u0811\u0812\5\u0286\u0144\2\u0812\u0813"+
		"\5\u0118\u008d\2\u0813\u0815\3\2\2\2\u0814\u0811\3\2\2\2\u0815\u0818\3"+
		"\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u081a\3\2\2\2\u0818"+
		"\u0816\3\2\2\2\u0819\u0810\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081b\3\2"+
		"\2\2\u081b\u081c\5\u027c\u013f\2\u081c\u00f9\3\2\2\2\u081d\u081e\5\u027a"+
		"\u013e\2\u081e\u081f\5\u013c\u009f\2\u081f\u0820\5\u0288\u0145\2\u0820"+
		"\u0821\5\u0118\u008d\2\u0821\u0829\3\2\2\2\u0822\u0823\5\u0286\u0144\2"+
		"\u0823\u0824\5\u013c\u009f\2\u0824\u0825\5\u0288\u0145\2\u0825\u0826\5"+
		"\u0118\u008d\2\u0826\u0828\3\2\2\2\u0827\u0822\3\2\2\2\u0828\u082b\3\2"+
		"\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082c\3\2\2\2\u082b"+
		"\u0829\3\2\2\2\u082c\u082d\5\u027c\u013f\2\u082d\u00fb\3\2\2\2\u082e\u082f"+
		"\5\u027a\u013e\2\u082f\u0835\5\u0118\u008d\2\u0830\u0831\5\u0286\u0144"+
		"\2\u0831\u0832\5\u0118\u008d\2\u0832\u0834\3\2\2\2\u0833\u0830\3\2\2\2"+
		"\u0834\u0837\3\2\2\2\u0835\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0838"+
		"\3\2\2\2\u0837\u0835\3\2\2\2\u0838\u0839\5\u027c\u013f\2\u0839\u00fd\3"+
		"\2\2\2\u083a\u083b\5\u0282\u0142\2\u083b\u0841\5\u013c\u009f\2\u083c\u083d"+
		"\5\u0286\u0144\2\u083d\u083e\5\u0118\u008d\2\u083e\u0840\3\2\2\2\u083f"+
		"\u083c\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841\u0842\3\2"+
		"\2\2\u0842\u0844\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0845\5\u0284\u0143"+
		"\2\u0845\u00ff\3\2\2\2\u0846\u0863\5\u0276\u013c\2\u0847\u0858\5\u0118"+
		"\u008d\2\u0848\u0849\5\u0286\u0144\2\u0849\u084a\5\u0118\u008d\2\u084a"+
		"\u084c\3\2\2\2\u084b\u0848\3\2\2\2\u084c\u084f\3\2\2\2\u084d\u084b\3\2"+
		"\2\2\u084d\u084e\3\2\2\2\u084e\u0859\3\2\2\2\u084f\u084d\3\2\2\2\u0850"+
		"\u0851\5\u0286\u0144\2\u0851\u0852\5\u0100\u0081\2\u0852\u0854\3\2\2\2"+
		"\u0853\u0850\3\2\2\2\u0854\u0857\3\2\2\2\u0855\u0853\3\2\2\2\u0855\u0856"+
		"\3\2\2\2\u0856\u0859\3\2\2\2\u0857\u0855\3\2\2\2\u0858\u084d\3\2\2\2\u0858"+
		"\u0855\3\2\2\2\u0859\u0864\3\2\2\2\u085a\u0860\5\u0100\u0081\2\u085b\u085c"+
		"\5\u0286\u0144\2\u085c\u085d\5\u0100\u0081\2\u085d\u085f\3\2\2\2\u085e"+
		"\u085b\3\2\2\2\u085f\u0862\3\2\2\2\u0860\u085e\3\2\2\2\u0860\u0861\3\2"+
		"\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0863\u0847\3\2\2\2\u0863"+
		"\u085a\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\5\u0278\u013d\2\u0866\u0101"+
		"\3\2\2\2\u0867\u0869\5\u00ba^\2\u0868\u0867\3\2\2\2\u0868\u0869\3\2\2"+
		"\2\u0869\u086a\3\2\2\2\u086a\u086b\5\u01fe\u0100\2\u086b\u086f\5\u0200"+
		"\u0101\2\u086c\u086d\5\u0148\u00a5\2\u086d\u086e\7\20\2\2\u086e\u0870"+
		"\3\2\2\2\u086f\u086c\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871"+
		"\u0873\5\u014a\u00a6\2\u0872\u0874\5\u0112\u008a\2\u0873\u0872\3\2\2\2"+
		"\u0873\u0874\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\5\u0110\u0089\2\u0876"+
		"\u0878\5\u010c\u0087\2\u0877\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a"+
		"\3\2\2\2\u0879\u087b\5\u0104\u0083\2\u087a\u0879\3\2\2\2\u087a\u087b\3"+
		"\2\2\2\u087b\u0103\3\2\2\2\u087c\u087d\5\u0268\u0135\2\u087d\u087e\5\u0108"+
		"\u0085\2\u087e\u088d\3\2\2\2\u087f\u0880\5\u0268\u0135\2\u0880\u0881\5"+
		"\u0108\u0085\2\u0881\u0882\5\u017c\u00bf\2\u0882\u0883\5\u0106\u0084\2"+
		"\u0883\u088d\3\2\2\2\u0884\u0885\5\u0268\u0135\2\u0885\u0886\5\u0106\u0084"+
		"\2\u0886\u088d\3\2\2\2\u0887\u0888\5\u0268\u0135\2\u0888\u0889\5\u0106"+
		"\u0084\2\u0889\u088a\5\u017c\u00bf\2\u088a\u088b\5\u0108\u0085\2\u088b"+
		"\u088d\3\2\2\2\u088c\u087c\3\2\2\2\u088c\u087f\3\2\2\2\u088c\u0884\3\2"+
		"\2\2\u088c\u0887\3\2\2\2\u088d\u0105\3\2\2\2\u088e\u088f\5\u0252\u012a"+
		"\2\u088f\u0890\5\u013e\u00a0\2\u0890\u0107\3\2\2\2\u0891\u0892\5\u025a"+
		"\u012e\2\u0892\u0893\5\u013e\u00a0\2\u0893\u0109\3\2\2\2\u0894\u0895\5"+
		"\u0268\u0135\2\u0895\u0896\5\u0106\u0084\2\u0896\u010b\3\2\2\2\u0897\u0898"+
		"\5\u01b6\u00dc\2\u0898\u0899\5\u0220\u0111\2\u0899\u089a\5\u01a6\u00d4"+
		"\2\u089a\u010d\3\2\2\2\u089b\u089c\5\u01b6\u00dc\2\u089c\u089d\5\u01a6"+
		"\u00d4\2\u089d\u010f\3\2\2\2\u089e\u089f\5\u026a\u0136\2\u089f\u08a0\7"+
		"\3\2\2\u08a0\u08a1\5\u0116\u008c\2\u08a1\u08a2\7\4\2\2\u08a2\u08a7\3\2"+
		"\2\2\u08a3\u08a4\5\u0204\u0103\2\u08a4\u08a5\5\u013c\u009f\2\u08a5\u08a7"+
		"\3\2\2\2\u08a6\u089e\3\2\2\2\u08a6\u08a3\3\2\2\2\u08a7\u0111\3\2\2\2\u08a8"+
		"\u08a9\7\3\2\2\u08a9\u08aa\5\u0114\u008b\2\u08aa\u08ab\7\4\2\2\u08ab\u0113"+
		"\3\2\2\2\u08ac\u08b2\5\u014c\u00a7\2\u08ad\u08ae\5\u0286\u0144\2\u08ae"+
		"\u08af\5\u014c\u00a7\2\u08af\u08b1\3\2\2\2\u08b0\u08ad\3\2\2\2\u08b1\u08b4"+
		"\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u0115\3\2\2\2\u08b4"+
		"\u08b2\3\2\2\2\u08b5\u08bb\5\u0118\u008d\2\u08b6\u08b7\5\u0286\u0144\2"+
		"\u08b7\u08b8\5\u0118\u008d\2\u08b8\u08ba\3\2\2\2\u08b9\u08b6\3\2\2\2\u08ba"+
		"\u08bd\3\2\2\2\u08bb\u08b9\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u0117\3\2"+
		"\2\2\u08bd\u08bb\3\2\2\2\u08be\u08c5\5\u013c\u009f\2\u08bf\u08c5\5\u00fa"+
		"~\2\u08c0\u08c5\5\u00f8}\2\u08c1\u08c5\5\u00fe\u0080\2\u08c2\u08c5\5\u0100"+
		"\u0081\2\u08c3\u08c5\5\u00fc\177\2\u08c4\u08be\3\2\2\2\u08c4\u08bf\3\2"+
		"\2\2\u08c4\u08c0\3\2\2\2\u08c4\u08c1\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4"+
		"\u08c3\3\2\2\2\u08c5\u0119\3\2\2\2\u08c6\u08c8\5\u0244\u0123\2\u08c7\u08c9"+
		"\5\u012a\u0096\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb\3"+
		"\2\2\2\u08ca\u08cc\5\u0204\u0103\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3\2"+
		"\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08ce\5\u012c\u0097\2\u08ce\u08d0\5\u0120"+
		"\u0091\2\u08cf\u08d1\5\u0128\u0095\2\u08d0\u08cf\3\2\2\2\u08d0\u08d1\3"+
		"\2\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08d4\5\u0124\u0093\2\u08d3\u08d2\3\2"+
		"\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\3\2\2\2\u08d5\u08d7\5\u011e\u0090"+
		"\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08da"+
		"\5\u011c\u008f\2\u08d9\u08d8\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u011b\3"+
		"\2\2\2\u08db\u08dc\5\u0178\u00bd\2\u08dc\u08dd\5\u01a8\u00d5\2\u08dd\u011d"+
		"\3\2\2\2\u08de\u08df\5\u0210\u0109\2\u08df\u08e0\5\u013e\u00a0\2\u08e0"+
		"\u011f\3\2\2\2\u08e1\u08e2\5\u01ac\u00d7\2\u08e2\u08e3\5\u0122\u0092\2"+
		"\u08e3\u0121\3\2\2\2\u08e4\u08ea\5\u028a\u0146\2\u08e5\u08e6\5\u028a\u0146"+
		"\2\u08e6\u08e7\7\20\2\2\u08e7\u08e8\5\u028a\u0146\2\u08e8\u08ea\3\2\2"+
		"\2\u08e9\u08e4\3\2\2\2\u08e9\u08e5\3\2\2\2\u08ea\u0123\3\2\2\2\u08eb\u08ec"+
		"\5\u022c\u0117\2\u08ec\u08ed\5\u018a\u00c6\2\u08ed\u08ee\5\u0126\u0094"+
		"\2\u08ee\u0125\3\2\2\2\u08ef\u08f2\5\u028a\u0146\2\u08f0\u08f3\5\u0182"+
		"\u00c2\2\u08f1\u08f3\5\u0198\u00cd\2\u08f2\u08f0\3\2\2\2\u08f2\u08f1\3"+
		"\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u0127\3\2\2\2\u08f4\u08f5\5\u026e\u0138"+
		"\2\u08f5\u08f6\5\u0130\u0099\2\u08f6\u0129\3\2\2\2\u08f7\u08f8\5\u019c"+
		"\u00cf\2\u08f8\u012b\3\2\2\2\u08f9\u08fc\7\21\2\2\u08fa\u08fc\5\u012e"+
		"\u0098\2\u08fb\u08f9\3\2\2\2\u08fb\u08fa\3\2\2\2\u08fc\u0902\3\2\2\2\u08fd"+
		"\u08fe\5\u0286\u0144\2\u08fe\u08ff\5\u012e\u0098\2\u08ff\u0901\3\2\2\2"+
		"\u0900\u08fd\3\2\2\2\u0901\u0904\3\2\2\2\u0902\u0900\3\2\2\2\u0902\u0903"+
		"\3\2\2\2\u0903\u012d\3\2\2\2\u0904\u0902\3\2\2\2\u0905\u0906\5\u028a\u0146"+
		"\2\u0906\u0907\7\20\2\2\u0907\u0908\7\21\2\2\u0908\u0916\3\2\2\2\u0909"+
		"\u090d\5\u028a\u0146\2\u090a\u090b\5\u0180\u00c1\2\u090b\u090c\5\u028a"+
		"\u0146\2\u090c\u090e\3\2\2\2\u090d\u090a\3\2\2\2\u090d\u090e\3\2\2\2\u090e"+
		"\u0916\3\2\2\2\u090f\u0913\5\u0138\u009d\2\u0910\u0911\5\u0180\u00c1\2"+
		"\u0911\u0912\5\u028a\u0146\2\u0912\u0914\3\2\2\2\u0913\u0910\3\2\2\2\u0913"+
		"\u0914\3\2\2\2\u0914\u0916\3\2\2\2\u0915\u0905\3\2\2\2\u0915\u0909\3\2"+
		"\2\2\u0915\u090f\3\2\2\2\u0916\u012f\3\2\2\2\u0917\u091d\5\u0132\u009a"+
		"\2\u0918\u0919\5\u017c\u00bf\2\u0919\u091a\5\u0132\u009a\2\u091a\u091c"+
		"\3\2\2\2\u091b\u0918\3\2\2\2\u091c\u091f\3\2\2\2\u091d\u091b\3\2\2\2\u091d"+
		"\u091e\3\2\2\2\u091e\u0131\3\2\2\2\u091f\u091d\3\2\2\2\u0920\u0921\5\u028a"+
		"\u0146\2\u0921\u0922\t\4\2\2\u0922\u0923\5\u013c\u009f\2\u0923\u096a\3"+
		"\2\2\2\u0924\u0925\5\u028a\u0146\2\u0925\u0926\7\20\2\2\u0926\u0927\5"+
		"\u028a\u0146\2\u0927\u0928\t\4\2\2\u0928\u0929\5\u013c\u009f\2\u0929\u096a"+
		"\3\2\2\2\u092a\u092b\5\u0138\u009d\2\u092b\u092c\t\4\2\2\u092c\u092d\5"+
		"\u013c\u009f\2\u092d\u096a\3\2\2\2\u092e\u092f\5\u0138\u009d\2\u092f\u0930"+
		"\t\4\2\2\u0930\u0931\5\u0138\u009d\2\u0931\u096a\3\2\2\2\u0932\u0933\5"+
		"\u028a\u0146\2\u0933\u0934\5\u01b8\u00dd\2\u0934\u0936\7\3\2\2\u0935\u0937"+
		"\5\u013a\u009e\2\u0936\u0935\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0938\3"+
		"\2\2\2\u0938\u0939\7\4\2\2\u0939\u096a\3\2\2\2\u093a\u093b\7\3\2\2\u093b"+
		"\u0941\5\u028a\u0146\2\u093c\u093d\5\u0286\u0144\2\u093d\u093e\5\u028a"+
		"\u0146\2\u093e\u0940\3\2\2\2\u093f\u093c\3\2\2\2\u0940\u0943\3\2\2\2\u0941"+
		"\u093f\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u0941\3\2"+
		"\2\2\u0944\u0945\7\4\2\2\u0945\u0946\5\u01b8\u00dd\2\u0946\u0947\7\3\2"+
		"\2\u0947\u094d\5\u0100\u0081\2\u0948\u0949\5\u0286\u0144\2\u0949\u094a"+
		"\5\u0100\u0081\2\u094a\u094c\3\2\2\2\u094b\u0948\3\2\2\2\u094c\u094f\3"+
		"\2\2\2\u094d\u094b\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u0950\3\2\2\2\u094f"+
		"\u094d\3\2\2\2\u0950\u0951\7\4\2\2\u0951\u096a\3\2\2\2\u0952\u0953\7\3"+
		"\2\2\u0953\u0959\5\u028a\u0146\2\u0954\u0955\5\u0286\u0144\2\u0955\u0956"+
		"\5\u028a\u0146\2\u0956\u0958\3\2\2\2\u0957\u0954\3\2\2\2\u0958\u095b\3"+
		"\2\2\2\u0959\u0957\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095c\3\2\2\2\u095b"+
		"\u0959\3\2\2\2\u095c\u095d\7\4\2\2\u095d\u095e\t\4\2\2\u095e\u0964\5\u0100"+
		"\u0081\2\u095f\u0960\5\u0286\u0144\2\u0960\u0961\5\u0100\u0081\2\u0961"+
		"\u0963\3\2\2\2\u0962\u095f\3\2\2\2\u0963\u0966\3\2\2\2\u0964\u0962\3\2"+
		"\2\2\u0964\u0965\3\2\2\2\u0965\u096a\3\2\2\2\u0966\u0964\3\2\2\2\u0967"+
		"\u096a\5\u0136\u009c\2\u0968\u096a\5\u0134\u009b\2\u0969\u0920\3\2\2\2"+
		"\u0969\u0924\3\2\2\2\u0969\u092a\3\2\2\2\u0969\u092e\3\2\2\2\u0969\u0932"+
		"\3\2\2\2\u0969\u093a\3\2\2\2\u0969\u0952\3\2\2\2\u0969\u0967\3\2\2\2\u0969"+
		"\u0968\3\2\2\2\u096a\u0133\3\2\2\2\u096b\u096c\5\u028a\u0146\2\u096c\u096d"+
		"\5\u0192\u00ca\2\u096d\u096e\5\u013c\u009f\2\u096e\u0135\3\2\2\2\u096f"+
		"\u0970\5\u028a\u0146\2\u0970\u0971\5\u0192\u00ca\2\u0971\u0972\5\u0206"+
		"\u0104\2\u0972\u0973\3\2\2\2\u0973\u0974\5\u013c\u009f\2\u0974\u0137\3"+
		"\2\2\2\u0975\u0976\5\u028a\u0146\2\u0976\u0977\7\3\2\2\u0977\u0978\7\21"+
		"\2\2\u0978\u0979\7\4\2\2\u0979\u0982\3\2\2\2\u097a\u097b\5\u028a\u0146"+
		"\2\u097b\u097d\7\3\2\2\u097c\u097e\5\u013a\u009e\2\u097d\u097c\3\2\2\2"+
		"\u097d\u097e\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0980\7\4\2\2\u0980\u0982"+
		"\3\2\2\2\u0981\u0975\3\2\2\2\u0981\u097a\3\2\2\2\u0982\u0139\3\2\2\2\u0983"+
		"\u0987\5\u013c\u009f\2\u0984\u0987\5\u028a\u0146\2\u0985\u0987\5\u0138"+
		"\u009d\2\u0986\u0983\3\2\2\2\u0986\u0984\3\2\2\2\u0986\u0985\3\2\2\2\u0987"+
		"\u0990\3\2\2\2\u0988\u098c\5\u0286\u0144\2\u0989\u098d\5\u013c\u009f\2"+
		"\u098a\u098d\5\u028a\u0146\2\u098b\u098d\5\u0138\u009d\2\u098c\u0989\3"+
		"\2\2\2\u098c\u098a\3\2\2\2\u098c\u098b\3\2\2\2\u098d\u098f\3\2\2\2\u098e"+
		"\u0988\3\2\2\2\u098f\u0992\3\2\2\2\u0990\u098e\3\2\2\2\u0990\u0991\3\2"+
		"\2\2\u0991\u013b\3\2\2\2\u0992\u0990\3\2\2\2\u0993\u099d\7\u00cc\2\2\u0994"+
		"\u099d\5\u0142\u00a2\2\u0995\u099d\5\u013e\u00a0\2\u0996\u099d\5\u0140"+
		"\u00a1\2\u0997\u099d\5\u0146\u00a4\2\u0998\u099d\5\u0144\u00a3\2\u0999"+
		"\u099d\5\62\32\2\u099a\u099d\5\u0222\u0112\2\u099b\u099d\5\u028a\u0146"+
		"\2\u099c\u0993\3\2\2\2\u099c\u0994\3\2\2\2\u099c\u0995\3\2\2\2\u099c\u0996"+
		"\3\2\2\2\u099c\u0997\3\2\2\2\u099c\u0998\3\2\2\2\u099c\u0999\3\2\2\2\u099c"+
		"\u099a\3\2\2\2\u099c\u099b\3\2\2\2\u099d\u013d\3\2\2\2\u099e\u099f\7\u00c7"+
		"\2\2\u099f\u013f\3\2\2\2\u09a0\u09a1\t\5\2\2\u09a1\u0141\3\2\2\2\u09a2"+
		"\u09a3\7\u00c6\2\2\u09a3\u0143\3\2\2\2\u09a4\u09a5\t\6\2\2\u09a5\u0145"+
		"\3\2\2\2\u09a6\u09a7\7\u00c9\2\2\u09a7\u0147\3\2\2\2\u09a8\u09ae\5\u028a"+
		"\u0146\2\u09a9\u09aa\7\27\2\2\u09aa\u09ab\5\u028a\u0146\2\u09ab\u09ac"+
		"\7\27\2\2\u09ac\u09ae\3\2\2\2\u09ad\u09a8\3\2\2\2\u09ad\u09a9\3\2\2\2"+
		"\u09ae\u0149\3\2\2\2\u09af\u09b5\5\u028a\u0146\2\u09b0\u09b1\7\27\2\2"+
		"\u09b1\u09b2\5\u028a\u0146\2\u09b2\u09b3\7\27\2\2\u09b3\u09b5\3\2\2\2"+
		"\u09b4\u09af\3\2\2\2\u09b4\u09b0\3\2\2\2\u09b5\u014b\3\2\2\2\u09b6\u09bc"+
		"\5\u028a\u0146\2\u09b7\u09b8\7\27\2\2\u09b8\u09b9\5\u028a\u0146\2\u09b9"+
		"\u09ba\7\27\2\2\u09ba\u09bc\3\2\2\2\u09bb\u09b6\3\2\2\2\u09bb\u09b7\3"+
		"\2\2\2\u09bc\u014d\3\2\2\2\u09bd\u09bf\5\u0150\u00a9\2\u09be\u09c0\5\u0152"+
		"\u00aa\2\u09bf\u09be\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u014f\3\2\2\2\u09c1"+
		"\u09de\5\u028a\u0146\2\u09c2\u09de\7\u00c6\2\2\u09c3\u09de\7\177\2\2\u09c4"+
		"\u09de\7w\2\2\u09c5\u09de\7\u0093\2\2\u09c6\u09de\7\u00b0\2\2\u09c7\u09de"+
		"\7\u00b1\2\2\u09c8\u09de\7\u00b2\2\2\u09c9\u09de\7\u00b3\2\2\u09ca\u09de"+
		"\7\u00b4\2\2\u09cb\u09de\7\u00b5\2\2\u09cc\u09de\7\u00b6\2\2\u09cd\u09de"+
		"\7\u00b7\2\2\u09ce\u09de\7\u00b8\2\2\u09cf\u09de\7\u00b9\2\2\u09d0\u09de"+
		"\7\u00ba\2\2\u09d1\u09de\7\u00bb\2\2\u09d2\u09de\7\u00bc\2\2\u09d3\u09de"+
		"\7\u00bd\2\2\u09d4\u09de\7\u00be\2\2\u09d5\u09de\7\u00c0\2\2";
	private static final String _serializedATNSegment1 =
		"\u09d6\u09de\7\u00bf\2\2\u09d7\u09de\7\u00c1\2\2\u09d8\u09de\7\u00c2\2"+
		"\2\u09d9\u09de\7\u00c3\2\2\u09da\u09de\7\u00c4\2\2\u09db\u09de\7\177\2"+
		"\2\u09dc\u09de\7\u008d\2\2\u09dd\u09c1\3\2\2\2\u09dd\u09c2\3\2\2\2\u09dd"+
		"\u09c3\3\2\2\2\u09dd\u09c4\3\2\2\2\u09dd\u09c5\3\2\2\2\u09dd\u09c6\3\2"+
		"\2\2\u09dd\u09c7\3\2\2\2\u09dd\u09c8\3\2\2\2\u09dd\u09c9\3\2\2\2\u09dd"+
		"\u09ca\3\2\2\2\u09dd\u09cb\3\2\2\2\u09dd\u09cc\3\2\2\2\u09dd\u09cd\3\2"+
		"\2\2\u09dd\u09ce\3\2\2\2\u09dd\u09cf\3\2\2\2\u09dd\u09d0\3\2\2\2\u09dd"+
		"\u09d1\3\2\2\2\u09dd\u09d2\3\2\2\2\u09dd\u09d3\3\2\2\2\u09dd\u09d4\3\2"+
		"\2\2\u09dd\u09d5\3\2\2\2\u09dd\u09d6\3\2\2\2\u09dd\u09d7\3\2\2\2\u09dd"+
		"\u09d8\3\2\2\2\u09dd\u09d9\3\2\2\2\u09dd\u09da\3\2\2\2\u09dd\u09db\3\2"+
		"\2\2\u09dd\u09dc\3\2\2\2\u09de\u0151\3\2\2\2\u09df\u09e0\5\u027e\u0140"+
		"\2\u09e0\u09e6\5\u014e\u00a8\2\u09e1\u09e2\5\u0286\u0144\2\u09e2\u09e3"+
		"\5\u014e\u00a8\2\u09e3\u09e5\3\2\2\2\u09e4\u09e1\3\2\2\2\u09e5\u09e8\3"+
		"\2\2\2\u09e6\u09e4\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e9\3\2\2\2\u09e8"+
		"\u09e6\3\2\2\2\u09e9\u09ea\5\u0280\u0141\2\u09ea\u0153\3\2\2\2\u09eb\u09ee"+
		"\5\u0182\u00c2\2\u09ec\u09ee\5\u0198\u00cd\2\u09ed\u09eb\3\2\2\2\u09ed"+
		"\u09ec\3\2\2\2\u09ee\u0155\3\2\2\2\u09ef\u09f0\5\u028a\u0146\2\u09f0\u0157"+
		"\3\2\2\2\u09f1\u09f2\5\u028a\u0146\2\u09f2\u0159\3\2\2\2\u09f3\u09f4\5"+
		"\u0142\u00a2\2\u09f4\u015b\3\2\2\2\u09f5\u09f6\5\u028a\u0146\2\u09f6\u015d"+
		"\3\2\2\2\u09f7\u09f8\5\u028a\u0146\2\u09f8\u015f\3\2\2\2\u09f9\u09fa\5"+
		"\u028a\u0146\2\u09fa\u0161\3\2\2\2\u09fb\u09fc\5\u028a\u0146\2\u09fc\u0163"+
		"\3\2\2\2\u09fd\u09fe\5\u028a\u0146\2\u09fe\u0165\3\2\2\2\u09ff\u0a00\5"+
		"\u028a\u0146\2\u0a00\u0167\3\2\2\2\u0a01\u0a02\5\u0142\u00a2\2\u0a02\u0169"+
		"\3\2\2\2\u0a03\u0a04\5\u028a\u0146\2\u0a04\u016b\3\2\2\2\u0a05\u0a06\5"+
		"\u016e\u00b8\2\u0a06\u0a07\5\u014e\u00a8\2\u0a07\u016d\3\2\2\2\u0a08\u0a09"+
		"\5\u028a\u0146\2\u0a09\u016f\3\2\2\2\u0a0a\u0a0b\7\31\2\2\u0a0b\u0171"+
		"\3\2\2\2\u0a0c\u0a0d\7\32\2\2\u0a0d\u0173\3\2\2\2\u0a0e\u0a0f\7\33\2\2"+
		"\u0a0f\u0175\3\2\2\2\u0a10\u0a11\7\33\2\2\u0a11\u0a12\7h\2\2\u0a12\u0177"+
		"\3\2\2\2\u0a13\u0a14\7\34\2\2\u0a14\u0179\3\2\2\2\u0a15\u0a16\7\35\2\2"+
		"\u0a16\u017b\3\2\2\2\u0a17\u0a18\7\36\2\2\u0a18\u017d\3\2\2\2\u0a19\u0a1a"+
		"\7 \2\2\u0a1a\u017f\3\2\2\2\u0a1b\u0a1c\7!\2\2\u0a1c\u0181\3\2\2\2\u0a1d"+
		"\u0a1e\7\"\2\2\u0a1e\u0183\3\2\2\2\u0a1f\u0a20\7#\2\2\u0a20\u0185\3\2"+
		"\2\2\u0a21\u0a22\7$\2\2\u0a22\u0187\3\2\2\2\u0a23\u0a24\7%\2\2\u0a24\u0189"+
		"\3\2\2\2\u0a25\u0a26\7&\2\2\u0a26\u018b\3\2\2\2\u0a27\u0a28\7\'\2\2\u0a28"+
		"\u018d\3\2\2\2\u0a29\u0a2a\7(\2\2\u0a2a\u018f\3\2\2\2\u0a2b\u0a2c\7*\2"+
		"\2\u0a2c\u0191\3\2\2\2\u0a2d\u0a2e\7,\2\2\u0a2e\u0193\3\2\2\2\u0a2f\u0a30"+
		"\7-\2\2\u0a30\u0195\3\2\2\2\u0a31\u0a32\7\60\2\2\u0a32\u0197\3\2\2\2\u0a33"+
		"\u0a34\7\61\2\2\u0a34\u0199\3\2\2\2\u0a35\u0a36\7\62\2\2\u0a36\u019b\3"+
		"\2\2\2\u0a37\u0a38\7\63\2\2\u0a38\u019d\3\2\2\2\u0a39\u0a3a\7\64\2\2\u0a3a"+
		"\u019f\3\2\2\2\u0a3b\u0a3c\7\65\2\2\u0a3c\u01a1\3\2\2\2\u0a3d\u0a3e\7"+
		"\67\2\2\u0a3e\u01a3\3\2\2\2\u0a3f\u0a40\78\2\2\u0a40\u01a5\3\2\2\2\u0a41"+
		"\u0a42\79\2\2\u0a42\u01a7\3\2\2\2\u0a43\u0a44\7;\2\2\u0a44\u01a9\3\2\2"+
		"\2\u0a45\u0a46\7<\2\2\u0a46\u01ab\3\2\2\2\u0a47\u0a48\7=\2\2\u0a48\u01ad"+
		"\3\2\2\2\u0a49\u0a4a\7>\2\2\u0a4a\u01af\3\2\2\2\u0a4b\u0a4c\7?\2\2\u0a4c"+
		"\u01b1\3\2\2\2\u0a4d\u0a4e\7@\2\2\u0a4e\u01b3\3\2\2\2\u0a4f\u0a50\7A\2"+
		"\2\u0a50\u01b5\3\2\2\2\u0a51\u0a52\7B\2\2\u0a52\u01b7\3\2\2\2\u0a53\u0a54"+
		"\7C\2\2\u0a54\u01b9\3\2\2\2\u0a55\u0a56\7D\2\2\u0a56\u01bb\3\2\2\2\u0a57"+
		"\u0a58\7.\2\2\u0a58\u01bd\3\2\2\2\u0a59\u0a5a\7/\2\2\u0a5a\u01bf\3\2\2"+
		"\2\u0a5b\u0a5c\7\u0093\2\2\u0a5c\u01c1\3\2\2\2\u0a5d\u0a5e\7\u0095\2\2"+
		"\u0a5e\u01c3\3\2\2\2\u0a5f\u0a60\7\u0096\2\2\u0a60\u01c5\3\2\2\2\u0a61"+
		"\u0a62\7\u0097\2\2\u0a62\u01c7\3\2\2\2\u0a63\u0a64\7\u0098\2\2\u0a64\u01c9"+
		"\3\2\2\2\u0a65\u0a66\7\u0099\2\2\u0a66\u01cb\3\2\2\2\u0a67\u0a68\7\u009b"+
		"\2\2\u0a68\u01cd\3\2\2\2\u0a69\u0a6a\7\u009a\2\2\u0a6a\u01cf\3\2\2\2\u0a6b"+
		"\u0a6c\7\u009c\2\2\u0a6c\u01d1\3\2\2\2\u0a6d\u0a6e\7\u009d\2\2\u0a6e\u01d3"+
		"\3\2\2\2\u0a6f\u0a70\7\u009e\2\2\u0a70\u01d5\3\2\2\2\u0a71\u0a72\7\u009f"+
		"\2\2\u0a72\u01d7\3\2\2\2\u0a73\u0a74\7\u00a0\2\2\u0a74\u01d9\3\2\2\2\u0a75"+
		"\u0a76\7\u00a1\2\2\u0a76\u01db\3\2\2\2\u0a77\u0a78\7\u00a2\2\2\u0a78\u01dd"+
		"\3\2\2\2\u0a79\u0a7a\7\u00a3\2\2\u0a7a\u01df\3\2\2\2\u0a7b\u0a7c\7\u00a4"+
		"\2\2\u0a7c\u01e1\3\2\2\2\u0a7d\u0a7e\7\u00a5\2\2\u0a7e\u01e3\3\2\2\2\u0a7f"+
		"\u0a80\7\u00a6\2\2\u0a80\u01e5\3\2\2\2\u0a81\u0a82\7\u00a7\2\2\u0a82\u01e7"+
		"\3\2\2\2\u0a83\u0a84\7\u00a8\2\2\u0a84\u01e9\3\2\2\2\u0a85\u0a86\7\u00a9"+
		"\2\2\u0a86\u01eb\3\2\2\2\u0a87\u0a88\7\u00aa\2\2\u0a88\u01ed\3\2\2\2\u0a89"+
		"\u0a8a\7\u00ab\2\2\u0a8a\u01ef\3\2\2\2\u0a8b\u0a8c\7\u00ac\2\2\u0a8c\u01f1"+
		"\3\2\2\2\u0a8d\u0a8e\7\u00ad\2\2\u0a8e\u01f3\3\2\2\2\u0a8f\u0a90\7\u00ae"+
		"\2\2\u0a90\u01f5\3\2\2\2\u0a91\u0a92\7\u00af\2\2\u0a92\u01f7\3\2\2\2\u0a93"+
		"\u0a94\7\u0094\2\2\u0a94\u01f9\3\2\2\2\u0a95\u0a96\7F\2\2\u0a96\u01fb"+
		"\3\2\2\2\u0a97\u0a98\7G\2\2\u0a98\u01fd\3\2\2\2\u0a99\u0a9a\7H\2\2\u0a9a"+
		"\u01ff\3\2\2\2\u0a9b\u0a9c\7I\2\2\u0a9c\u0201\3\2\2\2\u0a9d\u0a9e\7J\2"+
		"\2\u0a9e\u0203\3\2\2\2\u0a9f\u0aa0\7K\2\2\u0aa0\u0205\3\2\2\2\u0aa1\u0aa2"+
		"\7L\2\2\u0aa2\u0207\3\2\2\2\u0aa3\u0aa4\7M\2\2\u0aa4\u0209\3\2\2\2\u0aa5"+
		"\u0aa6\7N\2\2\u0aa6\u020b\3\2\2\2\u0aa7\u0aa8\7O\2\2\u0aa8\u020d\3\2\2"+
		"\2\u0aa9\u0aaa\7P\2\2\u0aaa\u020f\3\2\2\2\u0aab\u0aac\7R\2\2\u0aac\u0211"+
		"\3\2\2\2\u0aad\u0aae\7\u00bb\2\2\u0aae\u0213\3\2\2\2\u0aaf\u0ab0\7U\2"+
		"\2\u0ab0\u0215\3\2\2\2\u0ab1\u0ab2\7V\2\2\u0ab2\u0217\3\2\2\2\u0ab3\u0ab4"+
		"\7W\2\2\u0ab4\u0219\3\2\2\2\u0ab5\u0ab6\7X\2\2\u0ab6\u021b\3\2\2\2\u0ab7"+
		"\u0ab8\7[\2\2\u0ab8\u021d\3\2\2\2\u0ab9\u0aba\7Z\2\2\u0aba\u021f\3\2\2"+
		"\2\u0abb\u0abc\7\\\2\2\u0abc\u0221\3\2\2\2\u0abd\u0abe\7]\2\2\u0abe\u0223"+
		"\3\2\2\2\u0abf\u0ac0\7^\2\2\u0ac0\u0225\3\2\2\2\u0ac1\u0ac2\7_\2\2\u0ac2"+
		"\u0227\3\2\2\2\u0ac3\u0ac4\7a\2\2\u0ac4\u0229\3\2\2\2\u0ac5\u0ac6\7b\2"+
		"\2\u0ac6\u022b\3\2\2\2\u0ac7\u0ac8\7c\2\2\u0ac8\u022d\3\2\2\2\u0ac9\u0aca"+
		"\7e\2\2\u0aca\u022f\3\2\2\2\u0acb\u0acc\7i\2\2\u0acc\u0231\3\2\2\2\u0acd"+
		"\u0ace\7k\2\2\u0ace\u0233\3\2\2\2\u0acf\u0ad0\7l\2\2\u0ad0\u0235\3\2\2"+
		"\2\u0ad1\u0ad2\7m\2\2\u0ad2\u0237\3\2\2\2\u0ad3\u0ad4\7n\2\2\u0ad4\u0239"+
		"\3\2\2\2\u0ad5\u0ad6\7p\2\2\u0ad6\u023b\3\2\2\2\u0ad7\u0ad8\7r\2\2\u0ad8"+
		"\u023d\3\2\2\2\u0ad9\u0ada\7s\2\2\u0ada\u023f\3\2\2\2\u0adb\u0adc\7t\2"+
		"\2\u0adc\u0241\3\2\2\2\u0add\u0ade\7q\2\2\u0ade\u0243\3\2\2\2\u0adf\u0ae0"+
		"\7v\2\2\u0ae0\u0245\3\2\2\2\u0ae1\u0ae2\7w\2\2\u0ae2\u0247\3\2\2\2\u0ae3"+
		"\u0ae4\7x\2\2\u0ae4\u0249\3\2\2\2\u0ae5\u0ae6\7z\2\2\u0ae6\u024b\3\2\2"+
		"\2\u0ae7\u0ae8\7{\2\2\u0ae8\u024d\3\2\2\2\u0ae9\u0aea\7|\2\2\u0aea\u024f"+
		"\3\2\2\2\u0aeb\u0aec\7}\2\2\u0aec\u0251\3\2\2\2\u0aed\u0aee\7\177\2\2"+
		"\u0aee\u0253\3\2\2\2\u0aef\u0af0\7\u0080\2\2\u0af0\u0255\3\2\2\2\u0af1"+
		"\u0af2\7\u0082\2\2\u0af2\u0257\3\2\2\2\u0af3\u0af4\7\u0084\2\2\u0af4\u0259"+
		"\3\2\2\2\u0af5\u0af6\7\u0085\2\2\u0af6\u025b\3\2\2\2\u0af7\u0af8\7\u0087"+
		"\2\2\u0af8\u025d\3\2\2\2\u0af9\u0afa\7\u0088\2\2\u0afa\u025f\3\2\2\2\u0afb"+
		"\u0afc\7\u0089\2\2\u0afc\u0261\3\2\2\2\u0afd\u0afe\7\u008a\2\2\u0afe\u0263"+
		"\3\2\2\2\u0aff\u0b00\7\u008b\2\2\u0b00\u0265\3\2\2\2\u0b01\u0b02\7\u00d2"+
		"\2\2\u0b02\u0267\3\2\2\2\u0b03\u0b04\7\u008c\2\2\u0b04\u0269\3\2\2\2\u0b05"+
		"\u0b06\7\u008e\2\2\u0b06\u026b\3\2\2\2\u0b07\u0b08\7\u008f\2\2\u0b08\u026d"+
		"\3\2\2\2\u0b09\u0b0a\7\u0090\2\2\u0b0a\u026f\3\2\2\2\u0b0b\u0b0c\7\u0091"+
		"\2\2\u0b0c\u0271\3\2\2\2\u0b0d\u0b0e\7o\2\2\u0b0e\u0273\3\2\2\2\u0b0f"+
		"\u0b10\7\2\2\3\u0b10\u0275\3\2\2\2\u0b11\u0b12\7\3\2\2\u0b12\u0277\3\2"+
		"\2\2\u0b13\u0b14\7\4\2\2\u0b14\u0279\3\2\2\2\u0b15\u0b16\7\5\2\2\u0b16"+
		"\u027b\3\2\2\2\u0b17\u0b18\7\6\2\2\u0b18\u027d\3\2\2\2\u0b19\u0b1a\7\u00ce"+
		"\2\2\u0b1a\u027f\3\2\2\2\u0b1b\u0b1c\7\u00cf\2\2\u0b1c\u0281\3\2\2\2\u0b1d"+
		"\u0b1e\7\7\2\2\u0b1e\u0283\3\2\2\2\u0b1f\u0b20\7\b\2\2\u0b20\u0285\3\2"+
		"\2\2\u0b21\u0b22\7\t\2\2\u0b22\u0287\3\2\2\2\u0b23\u0b24\7\13\2\2\u0b24"+
		"\u0289\3\2\2\2\u0b25\u0bb4\7\u00cb\2\2\u0b26\u0b27\7\31\2\2\u0b27\u0bb4"+
		"\7\32\2\2\u0b28\u0bb4\7\33\2\2\u0b29\u0bb4\7\34\2\2\u0b2a\u0bb4\7\35\2"+
		"\2\u0b2b\u0bb4\7\36\2\2\u0b2c\u0bb4\7\37\2\2\u0b2d\u0bb4\7 \2\2\u0b2e"+
		"\u0bb4\7!\2\2\u0b2f\u0bb4\7\"\2\2\u0b30\u0bb4\7#\2\2\u0b31\u0bb4\7$\2"+
		"\2\u0b32\u0bb4\7%\2\2\u0b33\u0bb4\7&\2\2\u0b34\u0bb4\7\'\2\2\u0b35\u0bb4"+
		"\7(\2\2\u0b36\u0bb4\7)\2\2\u0b37\u0bb4\7*\2\2\u0b38\u0bb4\7+\2\2\u0b39"+
		"\u0bb4\7,\2\2\u0b3a\u0bb4\7-\2\2\u0b3b\u0bb4\7.\2\2\u0b3c\u0bb4\7\60\2"+
		"\2\u0b3d\u0bb4\7\61\2\2\u0b3e\u0bb4\7\62\2\2\u0b3f\u0bb4\7\63\2\2\u0b40"+
		"\u0bb4\7\64\2\2\u0b41\u0bb4\7\65\2\2\u0b42\u0bb4\7\66\2\2\u0b43\u0bb4"+
		"\7\67\2\2\u0b44\u0bb4\78\2\2\u0b45\u0bb4\79\2\2\u0b46\u0bb4\7:\2\2\u0b47"+
		"\u0bb4\7;\2\2\u0b48\u0bb4\7<\2\2\u0b49\u0bb4\7=\2\2\u0b4a\u0bb4\7>\2\2"+
		"\u0b4b\u0bb4\7?\2\2\u0b4c\u0bb4\7@\2\2\u0b4d\u0bb4\7A\2\2\u0b4e\u0bb4"+
		"\7B\2\2\u0b4f\u0bb4\7C\2\2\u0b50\u0bb4\7D\2\2\u0b51\u0bb4\7E\2\2\u0b52"+
		"\u0bb4\7F\2\2\u0b53\u0bb4\7G\2\2\u0b54\u0bb4\7H\2\2\u0b55\u0bb4\7I\2\2"+
		"\u0b56\u0bb4\7J\2\2\u0b57\u0bb4\7K\2\2\u0b58\u0bb4\7L\2\2\u0b59\u0bb4"+
		"\7M\2\2\u0b5a\u0bb4\7N\2\2\u0b5b\u0bb4\7O\2\2\u0b5c\u0bb4\7P\2\2\u0b5d"+
		"\u0bb4\7Q\2\2\u0b5e\u0bb4\7R\2\2\u0b5f\u0bb4\7S\2\2\u0b60\u0bb4\7T\2\2"+
		"\u0b61\u0bb4\7U\2\2\u0b62\u0bb4\7V\2\2\u0b63\u0bb4\7W\2\2\u0b64\u0bb4"+
		"\7X\2\2\u0b65\u0bb4\7Y\2\2\u0b66\u0bb4\7Z\2\2\u0b67\u0bb4\7[\2\2\u0b68"+
		"\u0bb4\7\\\2\2\u0b69\u0bb4\7]\2\2\u0b6a\u0bb4\7^\2\2\u0b6b\u0bb4\7_\2"+
		"\2\u0b6c\u0bb4\7`\2\2\u0b6d\u0bb4\7a\2\2\u0b6e\u0bb4\7b\2\2\u0b6f\u0bb4"+
		"\7c\2\2\u0b70\u0bb4\7d\2\2\u0b71\u0bb4\7e\2\2\u0b72\u0bb4\7f\2\2\u0b73"+
		"\u0bb4\7g\2\2\u0b74\u0bb4\7h\2\2\u0b75\u0bb4\7i\2\2\u0b76\u0bb4\7j\2\2"+
		"\u0b77\u0bb4\7k\2\2\u0b78\u0bb4\7l\2\2\u0b79\u0bb4\7m\2\2\u0b7a\u0bb4"+
		"\7n\2\2\u0b7b\u0bb4\7o\2\2\u0b7c\u0bb4\7p\2\2\u0b7d\u0bb4\7q\2\2\u0b7e"+
		"\u0bb4\7u\2\2\u0b7f\u0bb4\7v\2\2\u0b80\u0bb4\7w\2\2\u0b81\u0bb4\7x\2\2"+
		"\u0b82\u0bb4\7y\2\2\u0b83\u0bb4\7z\2\2\u0b84\u0bb4\7{\2\2\u0b85\u0bb4"+
		"\7|\2\2\u0b86\u0bb4\7}\2\2\u0b87\u0bb4\7~\2\2\u0b88\u0bb4\7\177\2\2\u0b89"+
		"\u0bb4\7\u0080\2\2\u0b8a\u0bb4\7\u0081\2\2\u0b8b\u0bb4\7\u0082\2\2\u0b8c"+
		"\u0bb4\7\u0083\2\2\u0b8d\u0bb4\7\u0084\2\2\u0b8e\u0bb4\7\u0085\2\2\u0b8f"+
		"\u0bb4\7\u0086\2\2\u0b90\u0bb4\7\u0087\2\2\u0b91\u0bb4\7\u0088\2\2\u0b92"+
		"\u0bb4\7\u0089\2\2\u0b93\u0bb4\7\u008a\2\2\u0b94\u0bb4\7\u008b\2\2\u0b95"+
		"\u0bb4\7\u008c\2\2\u0b96\u0bb4\7\u008d\2\2\u0b97\u0bb4\7\u008e\2\2\u0b98"+
		"\u0bb4\7\u008f\2\2\u0b99\u0bb4\7\u0090\2\2\u0b9a\u0bb4\7\u0091\2\2\u0b9b"+
		"\u0bb4\7\u0092\2\2\u0b9c\u0bb4\7\u0093\2\2\u0b9d\u0bb4\7\u00b0\2\2\u0b9e"+
		"\u0bb4\7\u00b1\2\2\u0b9f\u0bb4\7\u00b2\2\2\u0ba0\u0bb4\7\u00b3\2\2\u0ba1"+
		"\u0bb4\7\u00b4\2\2\u0ba2\u0bb4\7\u00b5\2\2\u0ba3\u0bb4\7\u00b6\2\2\u0ba4"+
		"\u0bb4\7\u00b7\2\2\u0ba5\u0bb4\7\u00b8\2\2\u0ba6\u0bb4\7\u00b9\2\2\u0ba7"+
		"\u0bb4\7\u00ba\2\2\u0ba8\u0bb4\7\u00bb\2\2\u0ba9\u0bb4\7\u00bc\2\2\u0baa"+
		"\u0bb4\7\u00bd\2\2\u0bab\u0bb4\7\u00be\2\2\u0bac\u0bb4\7\u00bf\2\2\u0bad"+
		"\u0bb4\7\u00c0\2\2\u0bae\u0bb4\7\u00c1\2\2\u0baf\u0bb4\7\u00c2\2\2\u0bb0"+
		"\u0bb4\7\u00c3\2\2\u0bb1\u0bb4\7\u00c4\2\2\u0bb2\u0bb4\7\u00d2\2\2\u0bb3"+
		"\u0b25\3\2\2\2\u0bb3\u0b26\3\2\2\2\u0bb3\u0b28\3\2\2\2\u0bb3\u0b29\3\2"+
		"\2\2\u0bb3\u0b2a\3\2\2\2\u0bb3\u0b2b\3\2\2\2\u0bb3\u0b2c\3\2\2\2\u0bb3"+
		"\u0b2d\3\2\2\2\u0bb3\u0b2e\3\2\2\2\u0bb3\u0b2f\3\2\2\2\u0bb3\u0b30\3\2"+
		"\2\2\u0bb3\u0b31\3\2\2\2\u0bb3\u0b32\3\2\2\2\u0bb3\u0b33\3\2\2\2\u0bb3"+
		"\u0b34\3\2\2\2\u0bb3\u0b35\3\2\2\2\u0bb3\u0b36\3\2\2\2\u0bb3\u0b37\3\2"+
		"\2\2\u0bb3\u0b38\3\2\2\2\u0bb3\u0b39\3\2\2\2\u0bb3\u0b3a\3\2\2\2\u0bb3"+
		"\u0b3b\3\2\2\2\u0bb3\u0b3c\3\2\2\2\u0bb3\u0b3d\3\2\2\2\u0bb3\u0b3e\3\2"+
		"\2\2\u0bb3\u0b3f\3\2\2\2\u0bb3\u0b40\3\2\2\2\u0bb3\u0b41\3\2\2\2\u0bb3"+
		"\u0b42\3\2\2\2\u0bb3\u0b43\3\2\2\2\u0bb3\u0b44\3\2\2\2\u0bb3\u0b45\3\2"+
		"\2\2\u0bb3\u0b46\3\2\2\2\u0bb3\u0b47\3\2\2\2\u0bb3\u0b48\3\2\2\2\u0bb3"+
		"\u0b49\3\2\2\2\u0bb3\u0b4a\3\2\2\2\u0bb3\u0b4b\3\2\2\2\u0bb3\u0b4c\3\2"+
		"\2\2\u0bb3\u0b4d\3\2\2\2\u0bb3\u0b4e\3\2\2\2\u0bb3\u0b4f\3\2\2\2\u0bb3"+
		"\u0b50\3\2\2\2\u0bb3\u0b51\3\2\2\2\u0bb3\u0b52\3\2\2\2\u0bb3\u0b53\3\2"+
		"\2\2\u0bb3\u0b54\3\2\2\2\u0bb3\u0b55\3\2\2\2\u0bb3\u0b56\3\2\2\2\u0bb3"+
		"\u0b57\3\2\2\2\u0bb3\u0b58\3\2\2\2\u0bb3\u0b59\3\2\2\2\u0bb3\u0b5a\3\2"+
		"\2\2\u0bb3\u0b5b\3\2\2\2\u0bb3\u0b5c\3\2\2\2\u0bb3\u0b5d\3\2\2\2\u0bb3"+
		"\u0b5e\3\2\2\2\u0bb3\u0b5f\3\2\2\2\u0bb3\u0b60\3\2\2\2\u0bb3\u0b61\3\2"+
		"\2\2\u0bb3\u0b62\3\2\2\2\u0bb3\u0b63\3\2\2\2\u0bb3\u0b64\3\2\2\2\u0bb3"+
		"\u0b65\3\2\2\2\u0bb3\u0b66\3\2\2\2\u0bb3\u0b67\3\2\2\2\u0bb3\u0b68\3\2"+
		"\2\2\u0bb3\u0b69\3\2\2\2\u0bb3\u0b6a\3\2\2\2\u0bb3\u0b6b\3\2\2\2\u0bb3"+
		"\u0b6c\3\2\2\2\u0bb3\u0b6d\3\2\2\2\u0bb3\u0b6e\3\2\2\2\u0bb3\u0b6f\3\2"+
		"\2\2\u0bb3\u0b70\3\2\2\2\u0bb3\u0b71\3\2\2\2\u0bb3\u0b72\3\2\2\2\u0bb3"+
		"\u0b73\3\2\2\2\u0bb3\u0b74\3\2\2\2\u0bb3\u0b75\3\2\2\2\u0bb3\u0b76\3\2"+
		"\2\2\u0bb3\u0b77\3\2\2\2\u0bb3\u0b78\3\2\2\2\u0bb3\u0b79\3\2\2\2\u0bb3"+
		"\u0b7a\3\2\2\2\u0bb3\u0b7b\3\2\2\2\u0bb3\u0b7c\3\2\2\2\u0bb3\u0b7d\3\2"+
		"\2\2\u0bb3\u0b7e\3\2\2\2\u0bb3\u0b7f\3\2\2\2\u0bb3\u0b80\3\2\2\2\u0bb3"+
		"\u0b81\3\2\2\2\u0bb3\u0b82\3\2\2\2\u0bb3\u0b83\3\2\2\2\u0bb3\u0b84\3\2"+
		"\2\2\u0bb3\u0b85\3\2\2\2\u0bb3\u0b86\3\2\2\2\u0bb3\u0b87\3\2\2\2\u0bb3"+
		"\u0b88\3\2\2\2\u0bb3\u0b89\3\2\2\2\u0bb3\u0b8a\3\2\2\2\u0bb3\u0b8b\3\2"+
		"\2\2\u0bb3\u0b8c\3\2\2\2\u0bb3\u0b8d\3\2\2\2\u0bb3\u0b8e\3\2\2\2\u0bb3"+
		"\u0b8f\3\2\2\2\u0bb3\u0b90\3\2\2\2\u0bb3\u0b91\3\2\2\2\u0bb3\u0b92\3\2"+
		"\2\2\u0bb3\u0b93\3\2\2\2\u0bb3\u0b94\3\2\2\2\u0bb3\u0b95\3\2\2\2\u0bb3"+
		"\u0b96\3\2\2\2\u0bb3\u0b97\3\2\2\2\u0bb3\u0b98\3\2\2\2\u0bb3\u0b99\3\2"+
		"\2\2\u0bb3\u0b9a\3\2\2\2\u0bb3\u0b9b\3\2\2\2\u0bb3\u0b9c\3\2\2\2\u0bb3"+
		"\u0b9d\3\2\2\2\u0bb3\u0b9e\3\2\2\2\u0bb3\u0b9f\3\2\2\2\u0bb3\u0ba0\3\2"+
		"\2\2\u0bb3\u0ba1\3\2\2\2\u0bb3\u0ba2\3\2\2\2\u0bb3\u0ba3\3\2\2\2\u0bb3"+
		"\u0ba4\3\2\2\2\u0bb3\u0ba5\3\2\2\2\u0bb3\u0ba6\3\2\2\2\u0bb3\u0ba7\3\2"+
		"\2\2\u0bb3\u0ba8\3\2\2\2\u0bb3\u0ba9\3\2\2\2\u0bb3\u0baa\3\2\2\2\u0bb3"+
		"\u0bab\3\2\2\2\u0bb3\u0bac\3\2\2\2\u0bb3\u0bad\3\2\2\2\u0bb3\u0bae\3\2"+
		"\2\2\u0bb3\u0baf\3\2\2\2\u0bb3\u0bb0\3\2\2\2\u0bb3\u0bb1\3\2\2\2\u0bb3"+
		"\u0bb2\3\2\2\2\u0bb4\u028b\3\2\2\2\u00f6\u028d\u0290\u0296\u029b\u029d"+
		"\u02a2\u02a5\u02a8\u02d4\u02e5\u02e8\u02ef\u02f4\u02ff\u0309\u0318\u0323"+
		"\u0328\u0333\u0337\u033c\u0344\u0349\u034d\u0352\u0357\u0366\u036c\u0371"+
		"\u037b\u0380\u038a\u038f\u0394\u039b\u03a3\u03b0\u03bc\u03c0\u03c4\u03c9"+
		"\u03ce\u03e1\u03e8\u03f0\u03f4\u03f9\u040c\u0415\u0424\u0426\u0432\u0440"+
		"\u0447\u044e\u0456\u0461\u0475\u0480\u0497\u04a5\u04ac\u04b5\u04c8\u04d0"+
		"\u04d6\u04db\u04e2\u04e7\u04ef\u04f4\u04fb\u0500\u0507\u050c\u0513\u051a"+
		"\u0521\u0528\u052d\u0534\u053b\u0540\u0547\u054c\u0553\u0557\u055b\u0560"+
		"\u0564\u0574\u0580\u0587\u0590\u059e\u05a6\u05ac\u05b1\u05bf\u05c7\u05cf"+
		"\u05d7\u05e0\u05ec\u05f0\u05f4\u0602\u060a\u0613\u061e\u0623\u062a\u062d"+
		"\u0633\u063e\u0641\u0647\u0660\u0662\u0668\u066e\u0675\u0678\u067d\u0680"+
		"\u0683\u0686\u0689\u068b\u0693\u0696\u069c\u069f\u06a5\u06a8\u06ae\u06b1"+
		"\u06b7\u06ba\u06c0\u06c3\u06c9\u06cc\u06d2\u06d5\u06db\u06de\u06e4\u06ea"+
		"\u06f2\u06f5\u06fb\u06fe\u0704\u070b\u0713\u071c\u071f\u0725\u0728\u072e"+
		"\u0731\u0737\u073a\u0742\u0745\u074b\u074e\u0754\u0757\u075d\u0760\u0762"+
		"\u0766\u076d\u0784\u0788\u078c\u0791\u0799\u07a1\u07a5\u07a8\u07ae\u07b2"+
		"\u07b9\u07c4\u07d1\u07da\u080d\u0816\u0819\u0829\u0835\u0841\u084d\u0855"+
		"\u0858\u0860\u0863\u0868\u086f\u0873\u0877\u087a\u088c\u08a6\u08b2\u08bb"+
		"\u08c4\u08c8\u08cb\u08d0\u08d3\u08d6\u08d9\u08e9\u08f2\u08fb\u0902\u090d"+
		"\u0913\u0915\u091d\u0936\u0941\u094d\u0959\u0964\u0969\u097d\u0981\u0986"+
		"\u098c\u0990\u099c\u09ad\u09b4\u09bb\u09bf\u09dd\u09e6\u09ed\u0bb3";
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