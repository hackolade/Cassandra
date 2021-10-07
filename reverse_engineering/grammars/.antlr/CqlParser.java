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
		K_NORMALIZE=147, K_ANALYZED=148, K_IS_LITERAL=149, K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB=150, 
		K_TOKENIZATION_ENABLE_STEMMING=151, K_TOKENIZATION_SKIP_STOP_WORDS=152, 
		K_TOKENIZATION_LOCALE=153, K_TOKENIZATION_NORMALIZE_LOWERCASE=154, K_TOKENIZATION_NORMALIZE_UPPERCASE=155, 
		K_NORMALIZE_LOWERCASE=156, K_NORMALIZE_UPPERCASE=157, K_MODE=158, K_ANALYZER_CLASS=159, 
		K_STORAGE_ATTACHED_INDEX=160, K_SASI_INDEX=161, K_SPACE_SAVING_NO_JOIN=162, 
		K_SPACE_SAVING_ALL=163, K_SPACE_SAVING_SLOW_TRIE_PRECISION=164, K_SPACE_SAVING_NO_TEXT_FIELD=165, 
		K_DOC_VALUES=166, K_COPY_FIELD=167, K_EXCLUDED=168, K_INDEXED=169, K_COLUMNS=170, 
		K_PROFILES=171, K_CONFIG=172, K_AUTOCOMMIT_TIME=173, K_DEFAULT_QUERY_FIELD=174, 
		K_DIRECTORY_FACTORY=175, K_FILTER_CACHE_LOW_WATERMARK=176, K_FILTER_CACHE_HIGH_WATERMARK=177, 
		K_DIRECTORY_FACTORY_CLASS=178, K_MERGE_MAX_THREAD_COUNT=179, K_MERGE_MAX_MERGE_COUNT=180, 
		K_RAM_BUFFER_SIZE=181, K_REALTIME=182, K_RECOVERY=183, K_REINDEX=184, 
		K_LENIENT=185, K_STANDARD=186, K_ENCRYPTED=187, K_BIGINT=188, K_BLOB=189, 
		K_BOOLEAN=190, K_COUNTER=191, K_DATE=192, K_DECIMAL=193, K_DOUBLE=194, 
		K_FLOAT=195, K_FROZEN=196, K_INET=197, K_INT=198, K_LIST=199, K_MAP=200, 
		K_SMALLINT=201, K_TEXT=202, K_TIMEUUID=203, K_TIME=204, K_TINYINT=205, 
		K_TUPLE=206, K_VARCHAR=207, K_VARINT=208, CODE_BLOCK=209, STRING_LITERAL=210, 
		DECIMAL_LITERAL=211, FLOAT_LITERAL=212, HEXADECIMAL_LITERAL=213, REAL_LITERAL=214, 
		OBJECT_NAME=215, UUID=216, OPERATOR_EQ=217, OPERATOR_LT=218, OPERATOR_GT=219, 
		OPERATOR_LTE=220, OPERATOR_GTE=221, K_USERS=222;
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
		RULE_customIndexOption = 101, RULE_createSearchIndex = 102, RULE_searchIndexConfigs = 103, 
		RULE_directoryFactory = 104, RULE_searchIndexOptions = 105, RULE_searchIndexProfile = 106, 
		RULE_searchIndexProfiles = 107, RULE_searchIndexColumnList = 108, RULE_searchIndexColumn = 109, 
		RULE_indexName = 110, RULE_indexColumnSpec = 111, RULE_indexKeysSpec = 112, 
		RULE_indexEntriesSSpec = 113, RULE_indexFullSpec = 114, RULE_indexValuesSpec = 115, 
		RULE_deleteStatement = 116, RULE_deleteColumnList = 117, RULE_deleteColumnItem = 118, 
		RULE_update = 119, RULE_ifSpec = 120, RULE_ifConditionList = 121, RULE_ifCondition = 122, 
		RULE_assignments = 123, RULE_assignmentElement = 124, RULE_assignmentSet = 125, 
		RULE_assignmentMap = 126, RULE_assignmentMapExpression = 127, RULE_assignmentList = 128, 
		RULE_assignmentTuple = 129, RULE_insert = 130, RULE_usingTtlTimestamp = 131, 
		RULE_timestamp = 132, RULE_ttl = 133, RULE_usingTimestampSpec = 134, RULE_ifNotExist = 135, 
		RULE_ifExist = 136, RULE_insertValuesSpec = 137, RULE_insertColumnSpec = 138, 
		RULE_columnList = 139, RULE_expressionList = 140, RULE_expression = 141, 
		RULE_select = 142, RULE_allowFilteringSpec = 143, RULE_limitSpec = 144, 
		RULE_fromSpec = 145, RULE_fromSpecElement = 146, RULE_orderSpec = 147, 
		RULE_orderSpecElement = 148, RULE_whereSpec = 149, RULE_distinctSpec = 150, 
		RULE_selectElements = 151, RULE_selectElement = 152, RULE_relationElements = 153, 
		RULE_relationElement = 154, RULE_relalationContains = 155, RULE_relalationContainsKey = 156, 
		RULE_functionCall = 157, RULE_functionArgs = 158, RULE_constant = 159, 
		RULE_decimalLiteral = 160, RULE_floatLiteral = 161, RULE_stringLiteral = 162, 
		RULE_booleanLiteral = 163, RULE_hexadecimalLiteral = 164, RULE_keyspace = 165, 
		RULE_table = 166, RULE_column = 167, RULE_dataType = 168, RULE_dataTypeName = 169, 
		RULE_dataTypeDefinition = 170, RULE_orderDirection = 171, RULE_role = 172, 
		RULE_trigger = 173, RULE_triggerClass = 174, RULE_materializedView = 175, 
		RULE_type = 176, RULE_aggregate = 177, RULE_functionStatement = 178, RULE_language = 179, 
		RULE_user = 180, RULE_password = 181, RULE_hashKey = 182, RULE_param = 183, 
		RULE_paramName = 184, RULE_kwAdd = 185, RULE_kwAggregate = 186, RULE_kwAll = 187, 
		RULE_kwAllPermissions = 188, RULE_kwAllow = 189, RULE_kwAlter = 190, RULE_kwAnd = 191, 
		RULE_kwApply = 192, RULE_kwAs = 193, RULE_kwAsc = 194, RULE_kwAuthorize = 195, 
		RULE_kwBatch = 196, RULE_kwBegin = 197, RULE_kwBy = 198, RULE_kwCalled = 199, 
		RULE_kwClustering = 200, RULE_kwCompact = 201, RULE_kwContains = 202, 
		RULE_kwCreate = 203, RULE_kwDelete = 204, RULE_kwDesc = 205, RULE_kwDescibe = 206, 
		RULE_kwDistinct = 207, RULE_kwDrop = 208, RULE_kwDurableWrites = 209, 
		RULE_kwEntries = 210, RULE_kwExecute = 211, RULE_kwExists = 212, RULE_kwFiltering = 213, 
		RULE_kwFinalfunc = 214, RULE_kwFrom = 215, RULE_kwFull = 216, RULE_kwFunction = 217, 
		RULE_kwFunctions = 218, RULE_kwGrant = 219, RULE_kwIf = 220, RULE_kwIn = 221, 
		RULE_kwIndex = 222, RULE_kwCustom = 223, RULE_kwSearch = 224, RULE_kwAscii = 225, 
		RULE_kwNormalize = 226, RULE_kwAnalyzed = 227, RULE_kwIsLiteral = 228, 
		RULE_kwMaxCompactionFlushMemoryInMb = 229, RULE_kwTokenizationEnableStemming = 230, 
		RULE_kwTokenizationSkipStopWords = 231, RULE_kwTokenizationLocale = 232, 
		RULE_kwTokenizationNormalizeLowercase = 233, RULE_kwTokenizationNormalizeUppercase = 234, 
		RULE_kwNormalizeLowercase = 235, RULE_kwNormalizeUppercase = 236, RULE_kwMode = 237, 
		RULE_kwAnalyzerClass = 238, RULE_kwStorageAttachedIndex = 239, RULE_kwSASIIndex = 240, 
		RULE_kwSpaceSavingNoJoin = 241, RULE_kwSpaceSavingAll = 242, RULE_kwSpaceSavingSlowTriePrecision = 243, 
		RULE_kwSpaceSavingNoTextField = 244, RULE_kwCopyField = 245, RULE_kwDocValues = 246, 
		RULE_kwExcluded = 247, RULE_kwIndexed = 248, RULE_kwColumns = 249, RULE_kwProfiles = 250, 
		RULE_kwConfig = 251, RULE_kwAutoCommitTime = 252, RULE_kwDefaultQueryField = 253, 
		RULE_kwDirectoryFactory = 254, RULE_kwFilterCacheLowWaterMark = 255, RULE_kwFilterCacheHighWaterMark = 256, 
		RULE_kwDirectoryFactoryClass = 257, RULE_kwMergeMaxThreadCount = 258, 
		RULE_kwMergeMaxMergeCount = 259, RULE_kwRamBufferSize = 260, RULE_kwRealtime = 261, 
		RULE_kwRecovery = 262, RULE_kwReindex = 263, RULE_kwLenient = 264, RULE_kwStandard = 265, 
		RULE_kwEncrypted = 266, RULE_kwCaseSensitive = 267, RULE_kwInitcond = 268, 
		RULE_kwInput = 269, RULE_kwInsert = 270, RULE_kwInto = 271, RULE_kwIs = 272, 
		RULE_kwJson = 273, RULE_kwKey = 274, RULE_kwKeys = 275, RULE_kwKeyspace = 276, 
		RULE_kwKeyspaces = 277, RULE_kwLanguage = 278, RULE_kwLimit = 279, RULE_kwList = 280, 
		RULE_kwLogged = 281, RULE_kwLogin = 282, RULE_kwMaterialized = 283, RULE_kwModify = 284, 
		RULE_kwNosuperuser = 285, RULE_kwNorecursive = 286, RULE_kwNot = 287, 
		RULE_kwNull = 288, RULE_kwOf = 289, RULE_kwOn = 290, RULE_kwOptions = 291, 
		RULE_kwOr = 292, RULE_kwOrder = 293, RULE_kwPassword = 294, RULE_kwPrimary = 295, 
		RULE_kwRename = 296, RULE_kwReplace = 297, RULE_kwReplication = 298, RULE_kwReturns = 299, 
		RULE_kwRole = 300, RULE_kwInternal = 301, RULE_kwLdap = 302, RULE_kwScheme = 303, 
		RULE_kwRoles = 304, RULE_kwSelect = 305, RULE_kwSet = 306, RULE_kwSfunc = 307, 
		RULE_kwStorage = 308, RULE_kwStype = 309, RULE_kwSuperuser = 310, RULE_kwTable = 311, 
		RULE_kwTimestamp = 312, RULE_kwTo = 313, RULE_kwTrigger = 314, RULE_kwTruncate = 315, 
		RULE_kwTtl = 316, RULE_kwType = 317, RULE_kwUnlogged = 318, RULE_kwUpdate = 319, 
		RULE_kwUse = 320, RULE_kwUser = 321, RULE_kwUsers = 322, RULE_kwUsing = 323, 
		RULE_kwValues = 324, RULE_kwView = 325, RULE_kwWhere = 326, RULE_kwWith = 327, 
		RULE_kwRevoke = 328, RULE_eof = 329, RULE_syntaxBracketLr = 330, RULE_syntaxBracketRr = 331, 
		RULE_syntaxBracketLc = 332, RULE_syntaxBracketRc = 333, RULE_syntaxBracketLa = 334, 
		RULE_syntaxBracketRa = 335, RULE_syntaxBracketLs = 336, RULE_syntaxBracketRs = 337, 
		RULE_syntaxComma = 338, RULE_syntaxColon = 339, RULE_id = 340;
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
			"createIndex", "customIndexOption", "createSearchIndex", "searchIndexConfigs", 
			"directoryFactory", "searchIndexOptions", "searchIndexProfile", "searchIndexProfiles", 
			"searchIndexColumnList", "searchIndexColumn", "indexName", "indexColumnSpec", 
			"indexKeysSpec", "indexEntriesSSpec", "indexFullSpec", "indexValuesSpec", 
			"deleteStatement", "deleteColumnList", "deleteColumnItem", "update", 
			"ifSpec", "ifConditionList", "ifCondition", "assignments", "assignmentElement", 
			"assignmentSet", "assignmentMap", "assignmentMapExpression", "assignmentList", 
			"assignmentTuple", "insert", "usingTtlTimestamp", "timestamp", "ttl", 
			"usingTimestampSpec", "ifNotExist", "ifExist", "insertValuesSpec", "insertColumnSpec", 
			"columnList", "expressionList", "expression", "select", "allowFilteringSpec", 
			"limitSpec", "fromSpec", "fromSpecElement", "orderSpec", "orderSpecElement", 
			"whereSpec", "distinctSpec", "selectElements", "selectElement", "relationElements", 
			"relationElement", "relalationContains", "relalationContainsKey", "functionCall", 
			"functionArgs", "constant", "decimalLiteral", "floatLiteral", "stringLiteral", 
			"booleanLiteral", "hexadecimalLiteral", "keyspace", "table", "column", 
			"dataType", "dataTypeName", "dataTypeDefinition", "orderDirection", "role", 
			"trigger", "triggerClass", "materializedView", "type", "aggregate", "functionStatement", 
			"language", "user", "password", "hashKey", "param", "paramName", "kwAdd", 
			"kwAggregate", "kwAll", "kwAllPermissions", "kwAllow", "kwAlter", "kwAnd", 
			"kwApply", "kwAs", "kwAsc", "kwAuthorize", "kwBatch", "kwBegin", "kwBy", 
			"kwCalled", "kwClustering", "kwCompact", "kwContains", "kwCreate", "kwDelete", 
			"kwDesc", "kwDescibe", "kwDistinct", "kwDrop", "kwDurableWrites", "kwEntries", 
			"kwExecute", "kwExists", "kwFiltering", "kwFinalfunc", "kwFrom", "kwFull", 
			"kwFunction", "kwFunctions", "kwGrant", "kwIf", "kwIn", "kwIndex", "kwCustom", 
			"kwSearch", "kwAscii", "kwNormalize", "kwAnalyzed", "kwIsLiteral", "kwMaxCompactionFlushMemoryInMb", 
			"kwTokenizationEnableStemming", "kwTokenizationSkipStopWords", "kwTokenizationLocale", 
			"kwTokenizationNormalizeLowercase", "kwTokenizationNormalizeUppercase", 
			"kwNormalizeLowercase", "kwNormalizeUppercase", "kwMode", "kwAnalyzerClass", 
			"kwStorageAttachedIndex", "kwSASIIndex", "kwSpaceSavingNoJoin", "kwSpaceSavingAll", 
			"kwSpaceSavingSlowTriePrecision", "kwSpaceSavingNoTextField", "kwCopyField", 
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
			"K_NORMALIZE", "K_ANALYZED", "K_IS_LITERAL", "K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB", 
			"K_TOKENIZATION_ENABLE_STEMMING", "K_TOKENIZATION_SKIP_STOP_WORDS", "K_TOKENIZATION_LOCALE", 
			"K_TOKENIZATION_NORMALIZE_LOWERCASE", "K_TOKENIZATION_NORMALIZE_UPPERCASE", 
			"K_NORMALIZE_LOWERCASE", "K_NORMALIZE_UPPERCASE", "K_MODE", "K_ANALYZER_CLASS", 
			"K_STORAGE_ATTACHED_INDEX", "K_SASI_INDEX", "K_SPACE_SAVING_NO_JOIN", 
			"K_SPACE_SAVING_ALL", "K_SPACE_SAVING_SLOW_TRIE_PRECISION", "K_SPACE_SAVING_NO_TEXT_FIELD", 
			"K_DOC_VALUES", "K_COPY_FIELD", "K_EXCLUDED", "K_INDEXED", "K_COLUMNS", 
			"K_PROFILES", "K_CONFIG", "K_AUTOCOMMIT_TIME", "K_DEFAULT_QUERY_FIELD", 
			"K_DIRECTORY_FACTORY", "K_FILTER_CACHE_LOW_WATERMARK", "K_FILTER_CACHE_HIGH_WATERMARK", 
			"K_DIRECTORY_FACTORY_CLASS", "K_MERGE_MAX_THREAD_COUNT", "K_MERGE_MAX_MERGE_COUNT", 
			"K_RAM_BUFFER_SIZE", "K_REALTIME", "K_RECOVERY", "K_REINDEX", "K_LENIENT", 
			"K_STANDARD", "K_ENCRYPTED", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_COUNTER", 
			"K_DATE", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_FROZEN", "K_INET", "K_INT", 
			"K_LIST", "K_MAP", "K_SMALLINT", "K_TEXT", "K_TIMEUUID", "K_TIME", "K_TINYINT", 
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
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (SEMI - 8)) | (1L << (K_ALTER - 8)) | (1L << (K_APPLY - 8)) | (1L << (K_BEGIN - 8)) | (1L << (K_CREATE - 8)) | (1L << (K_DELETE - 8)) | (1L << (K_DROP - 8)) | (1L << (K_GRANT - 8)) | (1L << (K_INSERT - 8)))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (K_REVOKE - 109)) | (1L << (K_SELECT - 109)) | (1L << (K_TRUNCATE - 109)) | (1L << (K_UPDATE - 109)) | (1L << (K_USE - 109)))) != 0) || _la==K_LIST) {
				{
				setState(682);
				cqls();
				}
			}

			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUSMINUS) {
				{
				setState(685);
				match(MINUSMINUS);
				}
			}

			setState(688);
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
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(697);
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
						setState(690);
						cql();
						setState(692);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUSMINUS) {
							{
							setState(691);
							match(MINUSMINUS);
							}
						}

						setState(694);
						statementSeparator();
						}
						break;
					case SEMI:
						{
						setState(696);
						empty();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(710);
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
				setState(702);
				cql();
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUSMINUS) {
						{
						setState(703);
						match(MINUSMINUS);
						}
					}

					setState(706);
					statementSeparator();
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(709);
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
			setState(712);
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
			setState(714);
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
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				alterKeyspace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				alterMaterializedView();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				alterRole();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(719);
				alterTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(720);
				alterType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(721);
				alterUser();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(722);
				applyBatch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(723);
				createAggregate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(724);
				createFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(725);
				createIndex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(726);
				createSearchIndex();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(727);
				createKeyspace();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(728);
				createMaterializedView();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(729);
				createRole();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(730);
				createTable();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(731);
				createTrigger();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(732);
				createType();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(733);
				createUser();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(734);
				deleteStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(735);
				dropAggregate();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(736);
				dropFunction();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(737);
				dropIndex();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(738);
				dropKeyspace();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(739);
				dropMaterializedView();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(740);
				dropRole();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(741);
				dropTable();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(742);
				dropTrigger();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(743);
				dropType();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(744);
				dropUser();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(745);
				grant();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(746);
				insert();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(747);
				listPermissions();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(748);
				listRoles();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(749);
				revoke();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(750);
				select();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(751);
				truncate();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(752);
				update();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(753);
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
			setState(756);
			kwRevoke();
			setState(757);
			priviledge();
			setState(758);
			kwOn();
			setState(759);
			resource();
			setState(760);
			kwFrom();
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
			setState(763);
			kwList();
			setState(764);
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
			setState(766);
			kwList();
			setState(767);
			kwRoles();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(768);
				kwOf();
				setState(769);
				role();
				}
			}

			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NORECURSIVE) {
				{
				setState(773);
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
			setState(776);
			kwList();
			setState(777);
			priviledge();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(778);
				kwOn();
				setState(779);
				resource();
				}
			}

			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OF) {
				{
				setState(783);
				kwOf();
				setState(784);
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
			setState(788);
			kwGrant();
			setState(789);
			priviledge();
			setState(790);
			kwOn();
			setState(791);
			resource();
			setState(792);
			kwTo();
			setState(793);
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
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(795);
					kwAll();
					}
					break;
				case 2:
					{
					setState(796);
					kwAllPermissions();
					}
					break;
				}
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				kwAlter();
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				kwAuthorize();
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				kwDescibe();
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				kwExecute();
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(803);
				kwCreate();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(804);
				kwDrop();
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 8);
				{
				setState(805);
				kwModify();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(806);
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
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				kwAll();
				setState(810);
				kwFunctions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				kwAll();
				setState(813);
				kwFunctions();
				setState(814);
				kwIn();
				setState(815);
				kwKeyspace();
				setState(816);
				keyspace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				kwFunction();
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(819);
					keyspace();
					setState(820);
					match(DOT);
					}
					break;
				}
				setState(824);
				functionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				kwAll();
				setState(827);
				kwKeyspaces();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(829);
				kwKeyspace();
				setState(830);
				keyspace();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(832);
					kwTable();
					}
					break;
				}
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(835);
					keyspace();
					setState(836);
					match(DOT);
					}
					break;
				}
				setState(840);
				table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(841);
				kwAll();
				setState(842);
				kwRoles();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(844);
				kwRole();
				setState(845);
				role();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(849);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INTERNAL:
					{
					setState(847);
					kwInternal();
					}
					break;
				case K_LDAP:
					{
					setState(848);
					kwLdap();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(851);
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
			setState(855);
			kwCreate();
			setState(856);
			kwUser();
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(857);
				ifNotExist();
				}
				break;
			}
			setState(860);
			user();
			setState(861);
			kwWith();
			setState(862);
			kwPassword();
			setState(863);
			stringLiteral();
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				{
				setState(864);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				{
				setState(865);
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
			setState(868);
			kwCreate();
			setState(869);
			kwRole();
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(870);
				ifNotExist();
				}
				break;
			}
			setState(873);
			role();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(874);
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
			setState(877);
			kwCreate();
			setState(878);
			kwType();
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(879);
				ifNotExist();
				}
				break;
			}
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(882);
				keyspace();
				setState(883);
				match(DOT);
				}
				break;
			}
			setState(887);
			type();
			setState(888);
			syntaxBracketLr();
			setState(889);
			typeMemberColumnList();
			setState(890);
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
			setState(892);
			column();
			setState(893);
			dataType();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(894);
				syntaxComma();
				setState(895);
				column();
				setState(896);
				dataType();
				}
				}
				setState(902);
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
			setState(903);
			kwCreate();
			setState(904);
			kwTrigger();
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(905);
				ifNotExist();
				}
				break;
			}
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(908);
				keyspace();
				setState(909);
				match(DOT);
				}
				break;
			}
			setState(913);
			trigger();
			setState(914);
			kwUsing();
			setState(915);
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
			setState(917);
			kwCreate();
			setState(918);
			kwMaterialized();
			setState(919);
			kwView();
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(920);
				ifNotExist();
				}
				break;
			}
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(923);
				keyspace();
				setState(924);
				match(DOT);
				}
				break;
			}
			setState(928);
			materializedView();
			setState(929);
			kwAs();
			setState(930);
			kwSelect();
			setState(931);
			columnList();
			setState(932);
			kwFrom();
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(933);
				keyspace();
				setState(934);
				match(DOT);
				}
				break;
			}
			setState(938);
			table();
			setState(939);
			materializedViewWhere();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(940);
				primaryKeyElement();
				}
			}

			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(943);
				kwWith();
				setState(944);
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
			setState(948);
			kwWhere();
			setState(949);
			columnNotNullList();
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(950);
				kwAnd();
				setState(951);
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
			setState(955);
			columnNotNull();
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					kwAnd();
					setState(957);
					columnNotNull();
					}
					} 
				}
				setState(963);
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
			setState(964);
			column();
			setState(965);
			kwIs();
			setState(966);
			kwNot();
			setState(967);
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
			setState(969);
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
			setState(971);
			kwCreate();
			setState(972);
			kwKeyspace();
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(973);
				ifNotExist();
				}
				break;
			}
			setState(976);
			keyspace();
			setState(977);
			kwWith();
			setState(978);
			kwReplication();
			setState(979);
			match(OPERATOR_EQ);
			setState(980);
			syntaxBracketLc();
			setState(981);
			replicationList();
			setState(982);
			syntaxBracketRc();
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(983);
				kwAnd();
				setState(984);
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
			setState(988);
			kwCreate();
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(989);
				orReplace();
				}
			}

			setState(992);
			kwFunction();
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(993);
				ifNotExist();
				}
				break;
			}
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(996);
				keyspace();
				setState(997);
				match(DOT);
				}
				break;
			}
			setState(1001);
			functionStatement();
			setState(1002);
			syntaxBracketLr();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (K_BIGINT - 188)) | (1L << (K_BLOB - 188)) | (1L << (K_BOOLEAN - 188)) | (1L << (K_COUNTER - 188)) | (1L << (K_DATE - 188)) | (1L << (K_DECIMAL - 188)) | (1L << (K_DOUBLE - 188)) | (1L << (K_FLOAT - 188)) | (1L << (K_FROZEN - 188)) | (1L << (K_INET - 188)) | (1L << (K_INT - 188)) | (1L << (K_LIST - 188)) | (1L << (K_MAP - 188)) | (1L << (K_SMALLINT - 188)) | (1L << (K_TEXT - 188)) | (1L << (K_TIMEUUID - 188)) | (1L << (K_TIME - 188)) | (1L << (K_TINYINT - 188)) | (1L << (K_TUPLE - 188)) | (1L << (K_VARCHAR - 188)) | (1L << (K_VARINT - 188)) | (1L << (OBJECT_NAME - 188)) | (1L << (K_USERS - 188)))) != 0)) {
				{
				setState(1003);
				paramList();
				}
			}

			setState(1006);
			syntaxBracketRr();
			setState(1007);
			returnMode();
			setState(1008);
			kwReturns();
			setState(1009);
			dataType();
			setState(1010);
			kwLanguage();
			setState(1011);
			language();
			setState(1012);
			kwAs();
			setState(1013);
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
			setState(1015);
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
			setState(1017);
			param();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1018);
				syntaxComma();
				setState(1019);
				param();
				}
				}
				setState(1025);
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
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CALLED:
				{
				setState(1026);
				kwCalled();
				}
				break;
			case K_RETURNS:
				{
				setState(1027);
				kwReturns();
				setState(1028);
				kwNull();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1032);
			kwOn();
			setState(1033);
			kwNull();
			setState(1034);
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
			setState(1036);
			kwCreate();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OR) {
				{
				setState(1037);
				orReplace();
				}
			}

			setState(1040);
			kwAggregate();
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(1041);
				ifNotExist();
				}
				break;
			}
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(1044);
				keyspace();
				setState(1045);
				match(DOT);
				}
				break;
			}
			setState(1049);
			aggregate();
			setState(1050);
			syntaxBracketLr();
			setState(1051);
			dataType();
			setState(1052);
			syntaxBracketRr();
			setState(1053);
			kwSfunc();
			setState(1054);
			functionStatement();
			setState(1055);
			kwStype();
			setState(1056);
			dataType();
			setState(1057);
			kwFinalfunc();
			setState(1058);
			functionStatement();
			setState(1059);
			kwInitcond();
			setState(1060);
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
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				initCondList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				initCondListNested();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
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
			setState(1068);
			syntaxBracketLc();
			setState(1069);
			initCondHashItem();
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1070);
				syntaxComma();
				setState(1071);
				initCondHashItem();
				}
				}
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1078);
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
			setState(1080);
			hashKey();
			setState(1081);
			match(COLON);
			setState(1082);
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
			setState(1084);
			syntaxBracketLr();
			setState(1085);
			initCondList();
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LR_BRACKET || _la==COMMA) {
				{
				setState(1090);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(1086);
					syntaxComma();
					setState(1087);
					constant();
					}
					break;
				case LR_BRACKET:
					{
					setState(1089);
					initCondList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1095);
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
			setState(1097);
			syntaxBracketLr();
			setState(1098);
			constant();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1099);
				syntaxComma();
				setState(1100);
				constant();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1107);
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
			setState(1109);
			kwOr();
			setState(1110);
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
			setState(1112);
			kwAlter();
			setState(1113);
			kwUser();
			setState(1114);
			user();
			setState(1115);
			kwWith();
			setState(1116);
			userPassword();
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOSUPERUSER || _la==K_SUPERUSER) {
				{
				setState(1117);
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
			setState(1120);
			kwPassword();
			setState(1121);
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
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				kwSuperuser();
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
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
			setState(1127);
			kwAlter();
			setState(1128);
			kwType();
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(1129);
				keyspace();
				setState(1130);
				match(DOT);
				}
				break;
			}
			setState(1134);
			type();
			setState(1135);
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
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				alterTypeAlterType();
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				alterTypeAdd();
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
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
			setState(1142);
			kwRename();
			setState(1143);
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
			setState(1145);
			alterTypeRenameItem();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1146);
				kwAnd();
				setState(1147);
				alterTypeRenameItem();
				}
				}
				setState(1153);
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
			setState(1154);
			column();
			setState(1155);
			kwTo();
			setState(1156);
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
			setState(1158);
			kwAdd();
			setState(1159);
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
			setState(1161);
			kwAlter();
			setState(1162);
			column();
			setState(1163);
			kwType();
			setState(1164);
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
			setState(1166);
			kwAlter();
			setState(1167);
			kwTable();
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(1168);
				keyspace();
				setState(1169);
				match(DOT);
				}
				break;
			}
			setState(1173);
			table();
			setState(1174);
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
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				alterTableAdd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				alterTableDropColumns();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				alterTableDropColumns();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1179);
				alterTableDropCompactStorage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1180);
				alterTableRename();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1181);
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
			setState(1184);
			kwWith();
			setState(1185);
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
			setState(1187);
			kwRename();
			setState(1188);
			column();
			setState(1189);
			kwTo();
			setState(1190);
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
			setState(1192);
			kwDrop();
			setState(1193);
			kwCompact();
			setState(1194);
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
			setState(1196);
			kwDrop();
			setState(1197);
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
			setState(1199);
			column();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1200);
				syntaxComma();
				setState(1201);
				column();
				}
				}
				setState(1207);
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
			setState(1208);
			kwAdd();
			setState(1209);
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
			setState(1211);
			column();
			setState(1212);
			dataType();
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1213);
				syntaxComma();
				setState(1214);
				column();
				setState(1215);
				dataType();
				}
				}
				setState(1221);
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
			setState(1222);
			kwAlter();
			setState(1223);
			kwRole();
			setState(1224);
			role();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1225);
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
			setState(1228);
			kwWith();
			{
			setState(1229);
			roleWithOptions();
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1230);
				kwAnd();
				setState(1231);
				roleWithOptions();
				}
				}
				setState(1237);
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
			setState(1254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PASSWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				kwPassword();
				setState(1239);
				match(OPERATOR_EQ);
				setState(1240);
				stringLiteral();
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				kwLogin();
				setState(1243);
				match(OPERATOR_EQ);
				setState(1244);
				booleanLiteral();
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1246);
				kwSuperuser();
				setState(1247);
				match(OPERATOR_EQ);
				setState(1248);
				booleanLiteral();
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				kwOptions();
				setState(1251);
				match(OPERATOR_EQ);
				setState(1252);
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
			setState(1256);
			kwAlter();
			setState(1257);
			kwMaterialized();
			setState(1258);
			kwView();
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(1259);
				keyspace();
				setState(1260);
				match(DOT);
				}
				break;
			}
			setState(1264);
			materializedView();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1265);
				kwWith();
				setState(1266);
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
			setState(1270);
			kwDrop();
			setState(1271);
			kwUser();
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1272);
				ifExist();
				}
				break;
			}
			setState(1275);
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
			setState(1277);
			kwDrop();
			setState(1278);
			kwType();
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1279);
				ifExist();
				}
				break;
			}
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1282);
				keyspace();
				setState(1283);
				match(DOT);
				}
				break;
			}
			setState(1287);
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
			setState(1289);
			kwDrop();
			setState(1290);
			kwMaterialized();
			setState(1291);
			kwView();
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(1292);
				ifExist();
				}
				break;
			}
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1295);
				keyspace();
				setState(1296);
				match(DOT);
				}
				break;
			}
			setState(1300);
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
			setState(1302);
			kwDrop();
			setState(1303);
			kwAggregate();
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1304);
				ifExist();
				}
				break;
			}
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1307);
				keyspace();
				setState(1308);
				match(DOT);
				}
				break;
			}
			setState(1312);
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
			setState(1314);
			kwDrop();
			setState(1315);
			kwFunction();
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(1316);
				ifExist();
				}
				break;
			}
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1319);
				keyspace();
				setState(1320);
				match(DOT);
				}
				break;
			}
			setState(1324);
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
			setState(1326);
			kwDrop();
			setState(1327);
			kwTrigger();
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1328);
				ifExist();
				}
				break;
			}
			setState(1331);
			trigger();
			setState(1332);
			kwOn();
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1333);
				keyspace();
				setState(1334);
				match(DOT);
				}
				break;
			}
			setState(1338);
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
			setState(1340);
			kwDrop();
			setState(1341);
			kwRole();
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1342);
				ifExist();
				}
				break;
			}
			setState(1345);
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
			setState(1347);
			kwDrop();
			setState(1348);
			kwTable();
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1349);
				ifExist();
				}
				break;
			}
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1352);
				keyspace();
				setState(1353);
				match(DOT);
				}
				break;
			}
			setState(1357);
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
			setState(1359);
			kwDrop();
			setState(1360);
			kwKeyspace();
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1361);
				ifExist();
				}
				break;
			}
			setState(1364);
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
			setState(1366);
			kwDrop();
			setState(1367);
			kwIndex();
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1368);
				ifExist();
				}
				break;
			}
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1371);
				keyspace();
				setState(1372);
				match(DOT);
				}
				break;
			}
			setState(1376);
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
			setState(1378);
			kwCreate();
			setState(1379);
			kwTable();
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(1380);
				ifNotExist();
				}
				break;
			}
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1383);
				keyspace();
				setState(1384);
				match(DOT);
				}
				break;
			}
			setState(1388);
			table();
			setState(1389);
			syntaxBracketLr();
			setState(1390);
			columnDefinitionList();
			setState(1391);
			syntaxBracketRr();
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1392);
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
			setState(1395);
			kwWith();
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (K_BIGINT - 188)) | (1L << (K_BLOB - 188)) | (1L << (K_BOOLEAN - 188)) | (1L << (K_COUNTER - 188)) | (1L << (K_DATE - 188)) | (1L << (K_DECIMAL - 188)) | (1L << (K_DOUBLE - 188)) | (1L << (K_FLOAT - 188)) | (1L << (K_FROZEN - 188)) | (1L << (K_INET - 188)) | (1L << (K_INT - 188)) | (1L << (K_LIST - 188)) | (1L << (K_MAP - 188)) | (1L << (K_SMALLINT - 188)) | (1L << (K_TEXT - 188)) | (1L << (K_TIMEUUID - 188)) | (1L << (K_TIME - 188)) | (1L << (K_TINYINT - 188)) | (1L << (K_TUPLE - 188)) | (1L << (K_VARCHAR - 188)) | (1L << (K_VARINT - 188)) | (1L << (OBJECT_NAME - 188)) | (1L << (K_USERS - 188)))) != 0)) {
				{
				setState(1396);
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
			setState(1399);
			column();
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1400);
				orderDirection();
				}
			}

			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1403);
				syntaxComma();
				setState(1404);
				column();
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1405);
					orderDirection();
					}
				}

				}
				}
				setState(1412);
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
			setState(1413);
			kwClustering();
			setState(1414);
			kwOrder();
			setState(1415);
			kwBy();
			setState(1416);
			syntaxBracketLr();
			setState(1417);
			clusteringOrderColumns();
			setState(1418);
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
			setState(1420);
			tableOptionItem();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(1421);
				kwAnd();
				setState(1422);
				tableOptionItem();
				}
				}
				setState(1428);
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
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				tableOptionName();
				setState(1430);
				match(OPERATOR_EQ);
				setState(1431);
				tableOptionValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				tableOptionName();
				setState(1434);
				match(OPERATOR_EQ);
				setState(1435);
				optionHash();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
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
			setState(1440);
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
			setState(1445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				stringLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
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
				setState(1444);
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
			setState(1447);
			syntaxBracketLc();
			setState(1448);
			optionHashItem();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1449);
				syntaxComma();
				setState(1450);
				optionHashItem();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1457);
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
			setState(1459);
			optionHashKey();
			setState(1460);
			match(COLON);
			setState(1461);
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
			setState(1463);
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
			setState(1468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				stringLiteral();
				}
				break;
			case K_FALSE:
			case K_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				booleanLiteral();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
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
			setState(1470);
			columnDefinition();
			}
			setState(1476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1471);
					syntaxComma();
					setState(1472);
					columnDefinition();
					}
					} 
				}
				setState(1478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1479);
				syntaxComma();
				setState(1480);
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
			setState(1484);
			column();
			setState(1485);
			dataType();
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY) {
				{
				setState(1486);
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
			setState(1489);
			kwPrimary();
			setState(1490);
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
			setState(1492);
			kwPrimary();
			setState(1493);
			kwKey();
			setState(1494);
			syntaxBracketLr();
			setState(1495);
			primaryKeyDefinition();
			setState(1496);
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
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				singlePrimaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				compoundKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500);
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
			setState(1503);
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
			setState(1505);
			partitionKey();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1506);
				syntaxComma();
				setState(1507);
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
			setState(1511);
			syntaxBracketLr();
			setState(1512);
			partitionKeyList();
			setState(1513);
			syntaxBracketRr();
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1514);
				syntaxComma();
				setState(1515);
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
			setState(1519);
			partitionKey();
			}
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1520);
				syntaxComma();
				setState(1521);
				partitionKey();
				}
				}
				setState(1527);
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
			setState(1528);
			clusteringKey();
			}
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1529);
				syntaxComma();
				setState(1530);
				clusteringKey();
				}
				}
				setState(1536);
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
			setState(1537);
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
			setState(1539);
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
			setState(1541);
			kwApply();
			setState(1542);
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
			setState(1544);
			kwBegin();
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOGGED || _la==K_UNLOGGED) {
				{
				setState(1545);
				batchType();
				}
			}

			setState(1548);
			kwBatch();
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(1549);
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
			setState(1554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_LOGGED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1552);
				kwLogged();
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
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
			setState(1556);
			kwAlter();
			setState(1557);
			kwKeyspace();
			setState(1558);
			keyspace();
			setState(1559);
			kwWith();
			setState(1560);
			kwReplication();
			setState(1561);
			match(OPERATOR_EQ);
			setState(1562);
			syntaxBracketLc();
			setState(1563);
			replicationList();
			setState(1564);
			syntaxBracketRc();
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AND) {
				{
				setState(1565);
				kwAnd();
				setState(1566);
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
			setState(1570);
			replicationListItem();
			}
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1571);
				syntaxComma();
				setState(1572);
				replicationListItem();
				}
				}
				setState(1578);
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
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				match(STRING_LITERAL);
				setState(1580);
				match(COLON);
				setState(1581);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				match(STRING_LITERAL);
				setState(1583);
				match(COLON);
				setState(1584);
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
			setState(1587);
			kwDurableWrites();
			setState(1588);
			match(OPERATOR_EQ);
			setState(1589);
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
			setState(1591);
			kwUse();
			setState(1592);
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
			setState(1594);
			kwTruncate();
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1595);
				kwTable();
				}
				break;
			}
			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1598);
				keyspace();
				setState(1599);
				match(DOT);
				}
				break;
			}
			setState(1603);
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
		public KwSASIIndexContext kwSASIIndex() {
			return getRuleContext(KwSASIIndexContext.class,0);
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
		public TerminalNode RC_BRACKET() { return getToken(CqlParser.RC_BRACKET, 0); }
		public List<CustomIndexOptionContext> customIndexOption() {
			return getRuleContexts(CustomIndexOptionContext.class);
		}
		public CustomIndexOptionContext customIndexOption(int i) {
			return getRuleContext(CustomIndexOptionContext.class,i);
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
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new SecondaryIndexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				kwCreate();
				setState(1606);
				kwIndex();
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1607);
					ifNotExist();
					}
					break;
				}
				setState(1611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1610);
					indexName();
					}
					break;
				}
				setState(1613);
				kwOn();
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1614);
					keyspace();
					setState(1615);
					match(DOT);
					}
					break;
				}
				setState(1619);
				table();
				setState(1620);
				syntaxBracketLr();
				setState(1621);
				indexColumnSpec();
				setState(1622);
				syntaxBracketRr();
				}
				break;
			case 2:
				_localctx = new CustomIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				kwCreate();
				setState(1625);
				kwCustom();
				setState(1626);
				kwIndex();
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1627);
					ifNotExist();
					}
					break;
				}
				setState(1631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1630);
					indexName();
					}
					break;
				}
				setState(1633);
				kwOn();
				setState(1637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1634);
					keyspace();
					setState(1635);
					match(DOT);
					}
					break;
				}
				setState(1639);
				table();
				setState(1640);
				syntaxBracketLr();
				setState(1641);
				indexColumnSpec();
				setState(1642);
				syntaxBracketRr();
				setState(1643);
				kwUsing();
				setState(1646);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_STORAGE_ATTACHED_INDEX:
					{
					setState(1644);
					kwStorageAttachedIndex();
					}
					break;
				case K_SASI_INDEX:
					{
					setState(1645);
					kwSASIIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITH) {
					{
					setState(1648);
					kwWith();
					setState(1649);
					kwOptions();
					setState(1650);
					match(OPERATOR_EQ);
					setState(1651);
					match(LC_BRACKET);
					setState(1653); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1652);
						customIndexOption();
						}
						}
						setState(1655); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (K_ASCII - 145)) | (1L << (K_CASE_SENITIVE - 145)) | (1L << (K_NORMALIZE - 145)) | (1L << (K_ANALYZED - 145)) | (1L << (K_IS_LITERAL - 145)) | (1L << (K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB - 145)) | (1L << (K_TOKENIZATION_ENABLE_STEMMING - 145)) | (1L << (K_TOKENIZATION_SKIP_STOP_WORDS - 145)) | (1L << (K_TOKENIZATION_LOCALE - 145)) | (1L << (K_TOKENIZATION_NORMALIZE_LOWERCASE - 145)) | (1L << (K_TOKENIZATION_NORMALIZE_UPPERCASE - 145)) | (1L << (K_NORMALIZE_LOWERCASE - 145)) | (1L << (K_NORMALIZE_UPPERCASE - 145)) | (1L << (K_MODE - 145)) | (1L << (K_ANALYZER_CLASS - 145)))) != 0) );
					setState(1657);
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

	public static class CustomIndexOptionContext extends ParserRuleContext {
		public BooleanLiteralContext caseSensitiveOption;
		public BooleanLiteralContext normalizeOption;
		public BooleanLiteralContext asciiOption;
		public BooleanLiteralContext analyzedOption;
		public BooleanLiteralContext isLiteralOption;
		public BooleanLiteralContext tokenizationEnableStemmingOption;
		public BooleanLiteralContext tokenizationNormalizeLowercaseOption;
		public BooleanLiteralContext tokenizationNormalizeUppercaseOption;
		public BooleanLiteralContext normalizeUppercaseOption;
		public BooleanLiteralContext normalizeLowercaseOption;
		public StringLiteralContext maxCompactionFlushMemoryInMbOption;
		public StringLiteralContext modeOption;
		public StringLiteralContext analyzerClassOption;
		public StringLiteralContext tokenizationLocaleOption;
		public StringLiteralContext tokenizationSkipStopWordsOption;
		public KwCaseSensitiveContext kwCaseSensitive() {
			return getRuleContext(KwCaseSensitiveContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CqlParser.COLON, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CqlParser.COMMA, 0); }
		public KwNormalizeContext kwNormalize() {
			return getRuleContext(KwNormalizeContext.class,0);
		}
		public KwAsciiContext kwAscii() {
			return getRuleContext(KwAsciiContext.class,0);
		}
		public KwAnalyzedContext kwAnalyzed() {
			return getRuleContext(KwAnalyzedContext.class,0);
		}
		public KwIsLiteralContext kwIsLiteral() {
			return getRuleContext(KwIsLiteralContext.class,0);
		}
		public KwTokenizationEnableStemmingContext kwTokenizationEnableStemming() {
			return getRuleContext(KwTokenizationEnableStemmingContext.class,0);
		}
		public KwTokenizationNormalizeLowercaseContext kwTokenizationNormalizeLowercase() {
			return getRuleContext(KwTokenizationNormalizeLowercaseContext.class,0);
		}
		public KwTokenizationNormalizeUppercaseContext kwTokenizationNormalizeUppercase() {
			return getRuleContext(KwTokenizationNormalizeUppercaseContext.class,0);
		}
		public KwNormalizeUppercaseContext kwNormalizeUppercase() {
			return getRuleContext(KwNormalizeUppercaseContext.class,0);
		}
		public KwNormalizeLowercaseContext kwNormalizeLowercase() {
			return getRuleContext(KwNormalizeLowercaseContext.class,0);
		}
		public KwMaxCompactionFlushMemoryInMbContext kwMaxCompactionFlushMemoryInMb() {
			return getRuleContext(KwMaxCompactionFlushMemoryInMbContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public KwModeContext kwMode() {
			return getRuleContext(KwModeContext.class,0);
		}
		public KwAnalyzerClassContext kwAnalyzerClass() {
			return getRuleContext(KwAnalyzerClassContext.class,0);
		}
		public KwTokenizationLocaleContext kwTokenizationLocale() {
			return getRuleContext(KwTokenizationLocaleContext.class,0);
		}
		public KwTokenizationSkipStopWordsContext kwTokenizationSkipStopWords() {
			return getRuleContext(KwTokenizationSkipStopWordsContext.class,0);
		}
		public CustomIndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customIndexOption; }
	}

	public final CustomIndexOptionContext customIndexOption() throws RecognitionException {
		CustomIndexOptionContext _localctx = new CustomIndexOptionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_customIndexOption);
		int _la;
		try {
			setState(1753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CASE_SENITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				kwCaseSensitive();
				setState(1664);
				match(COLON);
				setState(1665);
				((CustomIndexOptionContext)_localctx).caseSensitiveOption = booleanLiteral();
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1666);
					match(COMMA);
					}
				}

				}
				break;
			case K_NORMALIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				kwNormalize();
				setState(1670);
				match(COLON);
				setState(1671);
				((CustomIndexOptionContext)_localctx).normalizeOption = booleanLiteral();
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1672);
					match(COMMA);
					}
				}

				}
				break;
			case K_ASCII:
				enterOuterAlt(_localctx, 3);
				{
				setState(1675);
				kwAscii();
				setState(1676);
				match(COLON);
				setState(1677);
				((CustomIndexOptionContext)_localctx).asciiOption = booleanLiteral();
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1678);
					match(COMMA);
					}
				}

				}
				break;
			case K_ANALYZED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1681);
				kwAnalyzed();
				setState(1682);
				match(COLON);
				setState(1683);
				((CustomIndexOptionContext)_localctx).analyzedOption = booleanLiteral();
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1684);
					match(COMMA);
					}
				}

				}
				break;
			case K_IS_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1687);
				kwIsLiteral();
				setState(1688);
				match(COLON);
				setState(1689);
				((CustomIndexOptionContext)_localctx).isLiteralOption = booleanLiteral();
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1690);
					match(COMMA);
					}
				}

				}
				break;
			case K_TOKENIZATION_ENABLE_STEMMING:
				enterOuterAlt(_localctx, 6);
				{
				setState(1693);
				kwTokenizationEnableStemming();
				setState(1694);
				match(COLON);
				setState(1695);
				((CustomIndexOptionContext)_localctx).tokenizationEnableStemmingOption = booleanLiteral();
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1696);
					match(COMMA);
					}
				}

				}
				break;
			case K_TOKENIZATION_NORMALIZE_LOWERCASE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1699);
				kwTokenizationNormalizeLowercase();
				setState(1700);
				match(COLON);
				setState(1701);
				((CustomIndexOptionContext)_localctx).tokenizationNormalizeLowercaseOption = booleanLiteral();
				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1702);
					match(COMMA);
					}
				}

				}
				break;
			case K_TOKENIZATION_NORMALIZE_UPPERCASE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1705);
				kwTokenizationNormalizeUppercase();
				setState(1706);
				match(COLON);
				setState(1707);
				((CustomIndexOptionContext)_localctx).tokenizationNormalizeUppercaseOption = booleanLiteral();
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1708);
					match(COMMA);
					}
				}

				}
				break;
			case K_NORMALIZE_UPPERCASE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1711);
				kwNormalizeUppercase();
				setState(1712);
				match(COLON);
				setState(1713);
				((CustomIndexOptionContext)_localctx).normalizeUppercaseOption = booleanLiteral();
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1714);
					match(COMMA);
					}
				}

				}
				break;
			case K_NORMALIZE_LOWERCASE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1717);
				kwNormalizeLowercase();
				setState(1718);
				match(COLON);
				setState(1719);
				((CustomIndexOptionContext)_localctx).normalizeLowercaseOption = booleanLiteral();
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1720);
					match(COMMA);
					}
				}

				}
				break;
			case K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB:
				enterOuterAlt(_localctx, 11);
				{
				setState(1723);
				kwMaxCompactionFlushMemoryInMb();
				setState(1724);
				match(COLON);
				setState(1725);
				((CustomIndexOptionContext)_localctx).maxCompactionFlushMemoryInMbOption = stringLiteral();
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1726);
					match(COMMA);
					}
				}

				}
				break;
			case K_MODE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1729);
				kwMode();
				setState(1730);
				match(COLON);
				setState(1731);
				((CustomIndexOptionContext)_localctx).modeOption = stringLiteral();
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1732);
					match(COMMA);
					}
				}

				}
				break;
			case K_ANALYZER_CLASS:
				enterOuterAlt(_localctx, 13);
				{
				setState(1735);
				kwAnalyzerClass();
				setState(1736);
				match(COLON);
				setState(1737);
				((CustomIndexOptionContext)_localctx).analyzerClassOption = stringLiteral();
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1738);
					match(COMMA);
					}
				}

				}
				break;
			case K_TOKENIZATION_LOCALE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1741);
				kwTokenizationLocale();
				setState(1742);
				match(COLON);
				setState(1743);
				((CustomIndexOptionContext)_localctx).tokenizationLocaleOption = stringLiteral();
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1744);
					match(COMMA);
					}
				}

				}
				break;
			case K_TOKENIZATION_SKIP_STOP_WORDS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1747);
				kwTokenizationSkipStopWords();
				setState(1748);
				match(COLON);
				setState(1749);
				((CustomIndexOptionContext)_localctx).tokenizationSkipStopWordsOption = stringLiteral();
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1750);
					match(COMMA);
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
		enterRule(_localctx, 204, RULE_createSearchIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			kwCreate();
			setState(1756);
			kwSearch();
			setState(1757);
			kwIndex();
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1758);
				ifNotExist();
				}
			}

			setState(1761);
			kwOn();
			setState(1765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1762);
				keyspace();
				setState(1763);
				match(DOT);
				}
				break;
			}
			setState(1767);
			table();
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1768);
				match(K_WITH);
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMNS) {
					{
					setState(1769);
					kwColumns();
					setState(1770);
					searchIndexColumnList();
					}
				}

				setState(1780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1775);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AND) {
						{
						setState(1774);
						kwAnd();
						}
					}

					setState(1777);
					kwProfiles();
					setState(1778);
					searchIndexProfiles();
					}
					break;
				}
				setState(1786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AND) {
						{
						setState(1782);
						kwAnd();
						}
					}

					setState(1785);
					searchIndexConfigs();
					}
					break;
				}
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AND || _la==K_OPTIONS) {
					{
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AND) {
						{
						setState(1788);
						kwAnd();
						}
					}

					setState(1791);
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
		enterRule(_localctx, 206, RULE_searchIndexConfigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			kwConfig();
			setState(1797);
			match(LC_BRACKET);
			setState(1802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOCOMMIT_TIME) {
				{
				setState(1798);
				kwAutoCommitTime();
				setState(1799);
				match(COLON);
				setState(1800);
				((SearchIndexConfigsContext)_localctx).autoCommitTimeConfig = decimalLiteral();
				}
			}

			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1804);
					syntaxComma();
					}
				}

				setState(1807);
				kwDefaultQueryField();
				setState(1808);
				match(COLON);
				setState(1809);
				((SearchIndexConfigsContext)_localctx).defaultQueryFieldConfig = stringLiteral();
				}
				break;
			}
			setState(1820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1813);
					syntaxComma();
					}
				}

				setState(1816);
				kwDirectoryFactory();
				setState(1817);
				match(COLON);
				setState(1818);
				((SearchIndexConfigsContext)_localctx).directoryFactoryConfig = directoryFactory();
				}
				break;
			}
			setState(1829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1822);
					syntaxComma();
					}
				}

				setState(1825);
				kwFilterCacheLowWaterMark();
				setState(1826);
				match(COLON);
				setState(1827);
				((SearchIndexConfigsContext)_localctx).filterCacheLowWaterMarkConfig = decimalLiteral();
				}
				break;
			}
			setState(1838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1831);
					syntaxComma();
					}
				}

				setState(1834);
				kwFilterCacheHighWaterMark();
				setState(1835);
				match(COLON);
				setState(1836);
				((SearchIndexConfigsContext)_localctx).filterCacheHighWaterMarkConfig = decimalLiteral();
				}
				break;
			}
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1840);
					syntaxComma();
					}
				}

				setState(1843);
				kwDirectoryFactoryClass();
				setState(1844);
				match(COLON);
				setState(1845);
				((SearchIndexConfigsContext)_localctx).directoryFactoryClassConfig = stringLiteral();
				}
				break;
			}
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1849);
					syntaxComma();
					}
				}

				setState(1852);
				kwMergeMaxThreadCount();
				setState(1853);
				match(COLON);
				setState(1854);
				((SearchIndexConfigsContext)_localctx).mergeMaxThreadCountConfig = decimalLiteral();
				}
				break;
			}
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
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
				kwMergeMaxMergeCount();
				setState(1862);
				match(COLON);
				setState(1863);
				((SearchIndexConfigsContext)_localctx).mergeMaxMergeCountConfig = decimalLiteral();
				}
				break;
			}
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
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
				kwRamBufferSize();
				setState(1871);
				match(COLON);
				setState(1872);
				((SearchIndexConfigsContext)_localctx).ramBufferSizeConfig = decimalLiteral();
				}
				break;
			}
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_REALTIME) {
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
				kwRealtime();
				setState(1880);
				match(COLON);
				setState(1881);
				((SearchIndexConfigsContext)_localctx).realtimeConfig = booleanLiteral();
				}
			}

			setState(1885);
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
		enterRule(_localctx, 208, RULE_directoryFactory);
		try {
			setState(1889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STANDARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				kwStandard();
				}
				break;
			case K_ENCRYPTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
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
		enterRule(_localctx, 210, RULE_searchIndexOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			kwOptions();
			setState(1892);
			match(LC_BRACKET);
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECOVERY) {
				{
				setState(1893);
				kwRecovery();
				setState(1894);
				match(COLON);
				setState(1895);
				((SearchIndexOptionsContext)_localctx).recoveryOption = booleanLiteral();
				}
			}

			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1899);
					syntaxComma();
					}
				}

				setState(1902);
				kwReindex();
				setState(1903);
				match(COLON);
				setState(1904);
				((SearchIndexOptionsContext)_localctx).reindexOption = booleanLiteral();
				}
				break;
			}
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_LENIENT) {
				{
				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1908);
					syntaxComma();
					}
				}

				setState(1911);
				kwLenient();
				setState(1912);
				match(COLON);
				setState(1913);
				((SearchIndexOptionsContext)_localctx).lenientOption = booleanLiteral();
				}
			}

			setState(1917);
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

	public static class SearchIndexProfileContext extends ParserRuleContext {
		public KwSpaceSavingAllContext kwSpaceSavingAll() {
			return getRuleContext(KwSpaceSavingAllContext.class,0);
		}
		public KwSpaceSavingNoJoinContext kwSpaceSavingNoJoin() {
			return getRuleContext(KwSpaceSavingNoJoinContext.class,0);
		}
		public KwSpaceSavingSlowTriePrecisionContext kwSpaceSavingSlowTriePrecision() {
			return getRuleContext(KwSpaceSavingSlowTriePrecisionContext.class,0);
		}
		public KwSpaceSavingNoTextFieldContext kwSpaceSavingNoTextField() {
			return getRuleContext(KwSpaceSavingNoTextFieldContext.class,0);
		}
		public SearchIndexProfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexProfile; }
	}

	public final SearchIndexProfileContext searchIndexProfile() throws RecognitionException {
		SearchIndexProfileContext _localctx = new SearchIndexProfileContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_searchIndexProfile);
		try {
			setState(1923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SPACE_SAVING_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				kwSpaceSavingAll();
				}
				break;
			case K_SPACE_SAVING_NO_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				kwSpaceSavingNoJoin();
				}
				break;
			case K_SPACE_SAVING_SLOW_TRIE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1921);
				kwSpaceSavingSlowTriePrecision();
				}
				break;
			case K_SPACE_SAVING_NO_TEXT_FIELD:
				enterOuterAlt(_localctx, 4);
				{
				setState(1922);
				kwSpaceSavingNoTextField();
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

	public static class SearchIndexProfilesContext extends ParserRuleContext {
		public List<SearchIndexProfileContext> searchIndexProfile() {
			return getRuleContexts(SearchIndexProfileContext.class);
		}
		public SearchIndexProfileContext searchIndexProfile(int i) {
			return getRuleContext(SearchIndexProfileContext.class,i);
		}
		public List<SyntaxCommaContext> syntaxComma() {
			return getRuleContexts(SyntaxCommaContext.class);
		}
		public SyntaxCommaContext syntaxComma(int i) {
			return getRuleContext(SyntaxCommaContext.class,i);
		}
		public SearchIndexProfilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIndexProfiles; }
	}

	public final SearchIndexProfilesContext searchIndexProfiles() throws RecognitionException {
		SearchIndexProfilesContext _localctx = new SearchIndexProfilesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_searchIndexProfiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			searchIndexProfile();
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1926);
				syntaxComma();
				setState(1927);
				searchIndexProfile();
				}
				}
				setState(1933);
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
		enterRule(_localctx, 216, RULE_searchIndexColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			searchIndexColumn();
			setState(1940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1935);
				syntaxComma();
				setState(1936);
				searchIndexColumn();
				}
				}
				setState(1942);
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
		enterRule(_localctx, 218, RULE_searchIndexColumn);
		int _la;
		try {
			setState(2019);
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
				setState(1943);
				column();
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LC_BRACKET) {
					{
					setState(1944);
					match(LC_BRACKET);
					setState(1949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_COPY_FIELD) {
						{
						setState(1945);
						kwCopyField();
						setState(1946);
						match(COLON);
						setState(1947);
						((SearchIndexColumnContext)_localctx).copyFieldOption = booleanLiteral();
						}
					}

					setState(1958);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(1952);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1951);
							syntaxComma();
							}
						}

						setState(1954);
						kwDocValues();
						setState(1955);
						match(COLON);
						setState(1956);
						((SearchIndexColumnContext)_localctx).docValuesOption = booleanLiteral();
						}
						break;
					}
					setState(1967);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(1961);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1960);
							syntaxComma();
							}
						}

						setState(1963);
						kwExcluded();
						setState(1964);
						match(COLON);
						setState(1965);
						((SearchIndexColumnContext)_localctx).excludedOption = booleanLiteral();
						}
						break;
					}
					setState(1976);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA || _la==K_INDEXED) {
						{
						setState(1970);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1969);
							syntaxComma();
							}
						}

						setState(1972);
						kwIndexed();
						setState(1973);
						match(COLON);
						setState(1974);
						((SearchIndexColumnContext)_localctx).indexedOption = booleanLiteral();
						}
					}

					setState(1978);
					match(RC_BRACKET);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1981);
				((SearchIndexColumnContext)_localctx).star = match(STAR);
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LC_BRACKET) {
					{
					setState(1982);
					match(LC_BRACKET);
					setState(1987);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_COPY_FIELD) {
						{
						setState(1983);
						kwCopyField();
						setState(1984);
						match(COLON);
						setState(1985);
						((SearchIndexColumnContext)_localctx).copyFieldOption = booleanLiteral();
						}
					}

					setState(1996);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1990);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1989);
							syntaxComma();
							}
						}

						setState(1992);
						kwDocValues();
						setState(1993);
						match(COLON);
						setState(1994);
						((SearchIndexColumnContext)_localctx).docValuesOption = booleanLiteral();
						}
						break;
					}
					setState(2005);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1999);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(1998);
							syntaxComma();
							}
						}

						setState(2001);
						kwExcluded();
						setState(2002);
						match(COLON);
						setState(2003);
						((SearchIndexColumnContext)_localctx).excludedOption = booleanLiteral();
						}
						break;
					}
					setState(2014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA || _la==K_INDEXED) {
						{
						setState(2008);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(2007);
							syntaxComma();
							}
						}

						setState(2010);
						kwIndexed();
						setState(2011);
						match(COLON);
						setState(2012);
						((SearchIndexColumnContext)_localctx).indexedOption = booleanLiteral();
						}
					}

					setState(2016);
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
		enterRule(_localctx, 220, RULE_indexName);
		try {
			setState(2023);
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
				setState(2021);
				id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2022);
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
		enterRule(_localctx, 222, RULE_indexColumnSpec);
		try {
			setState(2030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2025);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2026);
				indexKeysSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2027);
				indexEntriesSSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2028);
				indexFullSpec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2029);
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
		enterRule(_localctx, 224, RULE_indexKeysSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			kwKeys();
			setState(2033);
			syntaxBracketLr();
			setState(2034);
			column();
			setState(2035);
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
		enterRule(_localctx, 226, RULE_indexEntriesSSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			kwEntries();
			setState(2038);
			syntaxBracketLr();
			setState(2039);
			column();
			setState(2040);
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
		enterRule(_localctx, 228, RULE_indexFullSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			kwFull();
			setState(2043);
			syntaxBracketLr();
			setState(2044);
			column();
			setState(2045);
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
		enterRule(_localctx, 230, RULE_indexValuesSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			kwValues();
			setState(2048);
			syntaxBracketLr();
			setState(2049);
			column();
			setState(2050);
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
		enterRule(_localctx, 232, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(2052);
				beginBatch();
				}
			}

			setState(2055);
			kwDelete();
			setState(2057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(2056);
				deleteColumnList();
				}
				break;
			}
			setState(2059);
			fromSpec();
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(2060);
				usingTimestampSpec();
				}
			}

			setState(2063);
			whereSpec();
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(2064);
				ifExist();
				}
				break;
			case 2:
				{
				setState(2065);
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
		enterRule(_localctx, 234, RULE_deleteColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2068);
			deleteColumnItem();
			}
			setState(2074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2069);
				syntaxComma();
				setState(2070);
				deleteColumnItem();
				}
				}
				setState(2076);
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
		enterRule(_localctx, 236, RULE_deleteColumnItem);
		try {
			setState(2086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2077);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2078);
				id();
				setState(2079);
				match(LS_BRACKET);
				setState(2082);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(2080);
					stringLiteral();
					}
					break;
				case DECIMAL_LITERAL:
					{
					setState(2081);
					decimalLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2084);
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
		enterRule(_localctx, 238, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(2088);
				beginBatch();
				}
			}

			setState(2091);
			kwUpdate();
			setState(2095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(2092);
				keyspace();
				setState(2093);
				match(DOT);
				}
				break;
			}
			setState(2097);
			table();
			setState(2099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(2098);
				usingTtlTimestamp();
				}
			}

			setState(2101);
			kwSet();
			setState(2102);
			assignments();
			setState(2103);
			whereSpec();
			setState(2106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(2104);
				ifExist();
				}
				break;
			case 2:
				{
				setState(2105);
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
		enterRule(_localctx, 240, RULE_ifSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			kwIf();
			setState(2109);
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
		enterRule(_localctx, 242, RULE_ifConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2111);
			ifCondition();
			}
			setState(2117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(2112);
				kwAnd();
				setState(2113);
				ifCondition();
				}
				}
				setState(2119);
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
		enterRule(_localctx, 244, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			id();
			setState(2121);
			match(OPERATOR_EQ);
			setState(2122);
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
		enterRule(_localctx, 246, RULE_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2124);
			assignmentElement();
			}
			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2125);
				syntaxComma();
				setState(2126);
				assignmentElement();
				}
				}
				setState(2132);
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
		enterRule(_localctx, 248, RULE_assignmentElement);
		int _la;
		try {
			setState(2190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2133);
				id();
				setState(2134);
				match(OPERATOR_EQ);
				setState(2139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(2135);
					constant();
					}
					break;
				case 2:
					{
					setState(2136);
					assignmentMap();
					}
					break;
				case 3:
					{
					setState(2137);
					assignmentSet();
					}
					break;
				case 4:
					{
					setState(2138);
					assignmentList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				id();
				setState(2142);
				match(OPERATOR_EQ);
				setState(2143);
				id();
				setState(2144);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2145);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2147);
				id();
				setState(2148);
				match(OPERATOR_EQ);
				setState(2149);
				id();
				setState(2150);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2151);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2153);
				id();
				setState(2154);
				match(OPERATOR_EQ);
				setState(2155);
				assignmentSet();
				setState(2156);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2157);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2159);
				id();
				setState(2160);
				match(OPERATOR_EQ);
				setState(2161);
				id();
				setState(2162);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2163);
				assignmentMap();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2165);
				id();
				setState(2166);
				match(OPERATOR_EQ);
				setState(2167);
				assignmentMap();
				setState(2168);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2169);
				id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2171);
				id();
				setState(2172);
				match(OPERATOR_EQ);
				setState(2173);
				id();
				setState(2174);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2175);
				assignmentList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2177);
				id();
				setState(2178);
				match(OPERATOR_EQ);
				setState(2179);
				assignmentList();
				setState(2180);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2181);
				id();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2183);
				id();
				setState(2184);
				syntaxBracketLs();
				setState(2185);
				decimalLiteral();
				setState(2186);
				syntaxBracketRs();
				setState(2187);
				match(OPERATOR_EQ);
				setState(2188);
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
		enterRule(_localctx, 250, RULE_assignmentSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			syntaxBracketLc();
			setState(2202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (K_BIGINT - 188)) | (1L << (K_BLOB - 188)) | (1L << (K_BOOLEAN - 188)) | (1L << (K_COUNTER - 188)) | (1L << (K_DATE - 188)) | (1L << (K_DECIMAL - 188)) | (1L << (K_DOUBLE - 188)) | (1L << (K_FLOAT - 188)) | (1L << (K_FROZEN - 188)) | (1L << (K_INET - 188)) | (1L << (K_INT - 188)) | (1L << (K_LIST - 188)) | (1L << (K_MAP - 188)) | (1L << (K_SMALLINT - 188)) | (1L << (K_TEXT - 188)) | (1L << (K_TIMEUUID - 188)) | (1L << (K_TIME - 188)) | (1L << (K_TINYINT - 188)) | (1L << (K_TUPLE - 188)) | (1L << (K_VARCHAR - 188)) | (1L << (K_VARINT - 188)) | (1L << (CODE_BLOCK - 188)) | (1L << (STRING_LITERAL - 188)) | (1L << (DECIMAL_LITERAL - 188)) | (1L << (FLOAT_LITERAL - 188)) | (1L << (HEXADECIMAL_LITERAL - 188)) | (1L << (OBJECT_NAME - 188)) | (1L << (UUID - 188)) | (1L << (K_USERS - 188)))) != 0)) {
				{
				setState(2193);
				constant();
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2194);
					syntaxComma();
					setState(2195);
					expression();
					}
					}
					setState(2201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2204);
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
		enterRule(_localctx, 252, RULE_assignmentMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			syntaxBracketLc();
			{
			setState(2207);
			constant();
			setState(2208);
			syntaxColon();
			setState(2209);
			expression();
			}
			setState(2218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2211);
				syntaxComma();
				setState(2212);
				constant();
				setState(2213);
				syntaxColon();
				setState(2214);
				expression();
				}
				}
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2221);
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
		enterRule(_localctx, 254, RULE_assignmentMapExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			syntaxBracketLc();
			setState(2224);
			expression();
			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2225);
				syntaxComma();
				setState(2226);
				expression();
				}
				}
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2233);
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
		enterRule(_localctx, 256, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			syntaxBracketLs();
			setState(2236);
			constant();
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2237);
				syntaxComma();
				setState(2238);
				expression();
				}
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2245);
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
		enterRule(_localctx, 258, RULE_assignmentTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			syntaxBracketLr();
			setState(2276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(2248);
				expression();
				setState(2265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(2254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2249);
						syntaxComma();
						setState(2250);
						expression();
						}
						}
						setState(2256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2257);
						syntaxComma();
						setState(2258);
						assignmentTuple();
						}
						}
						setState(2264);
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
				setState(2267);
				assignmentTuple();
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2268);
					syntaxComma();
					setState(2269);
					assignmentTuple();
					}
					}
					setState(2275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2278);
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
		enterRule(_localctx, 260, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BEGIN) {
				{
				setState(2280);
				beginBatch();
				}
			}

			setState(2283);
			kwInsert();
			setState(2284);
			kwInto();
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(2285);
				keyspace();
				setState(2286);
				match(DOT);
				}
				break;
			}
			setState(2290);
			table();
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(2291);
				insertColumnSpec();
				}
			}

			setState(2294);
			insertValuesSpec();
			setState(2296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(2295);
				ifNotExist();
				}
			}

			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_USING) {
				{
				setState(2298);
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
		enterRule(_localctx, 262, RULE_usingTtlTimestamp);
		try {
			setState(2317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2301);
				kwUsing();
				setState(2302);
				ttl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2304);
				kwUsing();
				setState(2305);
				ttl();
				setState(2306);
				kwAnd();
				setState(2307);
				timestamp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2309);
				kwUsing();
				setState(2310);
				timestamp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2312);
				kwUsing();
				setState(2313);
				timestamp();
				setState(2314);
				kwAnd();
				setState(2315);
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
		enterRule(_localctx, 264, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			kwTimestamp();
			setState(2320);
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
		enterRule(_localctx, 266, RULE_ttl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			kwTtl();
			setState(2323);
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
		enterRule(_localctx, 268, RULE_usingTimestampSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			kwUsing();
			setState(2326);
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
		enterRule(_localctx, 270, RULE_ifNotExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			kwIf();
			setState(2329);
			kwNot();
			setState(2330);
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
		enterRule(_localctx, 272, RULE_ifExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			kwIf();
			setState(2333);
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
		enterRule(_localctx, 274, RULE_insertValuesSpec);
		try {
			setState(2343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				kwValues();
				setState(2336);
				match(LR_BRACKET);
				setState(2337);
				expressionList();
				setState(2338);
				match(RR_BRACKET);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
				kwJson();
				setState(2341);
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
		enterRule(_localctx, 276, RULE_insertColumnSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			match(LR_BRACKET);
			setState(2346);
			columnList();
			setState(2347);
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
		enterRule(_localctx, 278, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			column();
			setState(2355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2350);
				syntaxComma();
				setState(2351);
				column();
				}
				}
				setState(2357);
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
		enterRule(_localctx, 280, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			expression();
			setState(2364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2359);
				syntaxComma();
				setState(2360);
				expression();
				}
				}
				setState(2366);
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
		enterRule(_localctx, 282, RULE_expression);
		try {
			setState(2373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2367);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2368);
				assignmentMap();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2369);
				assignmentSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2370);
				assignmentList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2371);
				assignmentTuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2372);
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
		enterRule(_localctx, 284, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			kwSelect();
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(2376);
				distinctSpec();
				}
				break;
			}
			setState(2380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2379);
				kwJson();
				}
				break;
			}
			setState(2382);
			selectElements();
			setState(2383);
			fromSpec();
			setState(2385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(2384);
				whereSpec();
				}
			}

			setState(2388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(2387);
				orderSpec();
				}
			}

			setState(2391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(2390);
				limitSpec();
				}
			}

			setState(2394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALLOW) {
				{
				setState(2393);
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
		enterRule(_localctx, 286, RULE_allowFilteringSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			kwAllow();
			setState(2397);
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
		enterRule(_localctx, 288, RULE_limitSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
			kwLimit();
			setState(2400);
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
		enterRule(_localctx, 290, RULE_fromSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			kwFrom();
			setState(2403);
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
		enterRule(_localctx, 292, RULE_fromSpecElement);
		try {
			setState(2410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2405);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				id();
				setState(2407);
				match(DOT);
				setState(2408);
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
		enterRule(_localctx, 294, RULE_orderSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			kwOrder();
			setState(2413);
			kwBy();
			setState(2414);
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
		enterRule(_localctx, 296, RULE_orderSpecElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			id();
			setState(2419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				{
				setState(2417);
				kwAsc();
				}
				break;
			case K_DESC:
				{
				setState(2418);
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
		enterRule(_localctx, 298, RULE_whereSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
			kwWhere();
			setState(2422);
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
		enterRule(_localctx, 300, RULE_distinctSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
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
		enterRule(_localctx, 302, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(2426);
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
				setState(2427);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2430);
				syntaxComma();
				setState(2431);
				selectElement();
				}
				}
				setState(2437);
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
		enterRule(_localctx, 304, RULE_selectElement);
		int _la;
		try {
			setState(2454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2438);
				id();
				setState(2439);
				match(DOT);
				setState(2440);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2442);
				id();
				setState(2446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(2443);
					kwAs();
					setState(2444);
					id();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2448);
				functionCall();
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(2449);
					kwAs();
					setState(2450);
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
		enterRule(_localctx, 306, RULE_relationElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2456);
			relationElement();
			}
			setState(2462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND) {
				{
				{
				setState(2457);
				kwAnd();
				setState(2458);
				relationElement();
				}
				}
				setState(2464);
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
		enterRule(_localctx, 308, RULE_relationElement);
		int _la;
		try {
			setState(2538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2465);
				id();
				setState(2466);
				_la = _input.LA(1);
				if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OPERATOR_EQ - 217)) | (1L << (OPERATOR_LT - 217)) | (1L << (OPERATOR_GT - 217)) | (1L << (OPERATOR_LTE - 217)) | (1L << (OPERATOR_GTE - 217)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2467);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2469);
				id();
				setState(2470);
				match(DOT);
				setState(2471);
				id();
				setState(2472);
				_la = _input.LA(1);
				if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OPERATOR_EQ - 217)) | (1L << (OPERATOR_LT - 217)) | (1L << (OPERATOR_GT - 217)) | (1L << (OPERATOR_LTE - 217)) | (1L << (OPERATOR_GTE - 217)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2473);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2475);
				functionCall();
				setState(2476);
				_la = _input.LA(1);
				if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OPERATOR_EQ - 217)) | (1L << (OPERATOR_LT - 217)) | (1L << (OPERATOR_GT - 217)) | (1L << (OPERATOR_LTE - 217)) | (1L << (OPERATOR_GTE - 217)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2477);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2479);
				functionCall();
				setState(2480);
				_la = _input.LA(1);
				if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OPERATOR_EQ - 217)) | (1L << (OPERATOR_LT - 217)) | (1L << (OPERATOR_GT - 217)) | (1L << (OPERATOR_LTE - 217)) | (1L << (OPERATOR_GTE - 217)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2481);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2483);
				id();
				setState(2484);
				kwIn();
				setState(2485);
				match(LR_BRACKET);
				setState(2487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (K_BIGINT - 188)) | (1L << (K_BLOB - 188)) | (1L << (K_BOOLEAN - 188)) | (1L << (K_COUNTER - 188)) | (1L << (K_DATE - 188)) | (1L << (K_DECIMAL - 188)) | (1L << (K_DOUBLE - 188)) | (1L << (K_FLOAT - 188)) | (1L << (K_FROZEN - 188)) | (1L << (K_INET - 188)) | (1L << (K_INT - 188)) | (1L << (K_LIST - 188)) | (1L << (K_MAP - 188)) | (1L << (K_SMALLINT - 188)) | (1L << (K_TEXT - 188)) | (1L << (K_TIMEUUID - 188)) | (1L << (K_TIME - 188)) | (1L << (K_TINYINT - 188)) | (1L << (K_TUPLE - 188)) | (1L << (K_VARCHAR - 188)) | (1L << (K_VARINT - 188)) | (1L << (CODE_BLOCK - 188)) | (1L << (STRING_LITERAL - 188)) | (1L << (DECIMAL_LITERAL - 188)) | (1L << (FLOAT_LITERAL - 188)) | (1L << (HEXADECIMAL_LITERAL - 188)) | (1L << (OBJECT_NAME - 188)) | (1L << (UUID - 188)) | (1L << (K_USERS - 188)))) != 0)) {
					{
					setState(2486);
					functionArgs();
					}
				}

				setState(2489);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2491);
				match(LR_BRACKET);
				setState(2492);
				id();
				setState(2498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2493);
					syntaxComma();
					setState(2494);
					id();
					}
					}
					setState(2500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2501);
				match(RR_BRACKET);
				setState(2502);
				kwIn();
				setState(2503);
				match(LR_BRACKET);
				setState(2504);
				assignmentTuple();
				setState(2510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2505);
					syntaxComma();
					setState(2506);
					assignmentTuple();
					}
					}
					setState(2512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2513);
				match(RR_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2515);
				match(LR_BRACKET);
				setState(2516);
				id();
				setState(2522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2517);
					syntaxComma();
					setState(2518);
					id();
					}
					}
					setState(2524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2525);
				match(RR_BRACKET);
				setState(2526);
				_la = _input.LA(1);
				if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OPERATOR_EQ - 217)) | (1L << (OPERATOR_LT - 217)) | (1L << (OPERATOR_GT - 217)) | (1L << (OPERATOR_LTE - 217)) | (1L << (OPERATOR_GTE - 217)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(2527);
				assignmentTuple();
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2528);
					syntaxComma();
					setState(2529);
					assignmentTuple();
					}
					}
					setState(2535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2536);
				relalationContainsKey();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2537);
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
		enterRule(_localctx, 310, RULE_relalationContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			id();
			setState(2541);
			kwContains();
			setState(2542);
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
		enterRule(_localctx, 312, RULE_relalationContainsKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			id();
			{
			setState(2545);
			kwContains();
			setState(2546);
			kwKey();
			}
			setState(2548);
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
		enterRule(_localctx, 314, RULE_functionCall);
		int _la;
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2550);
				id();
				setState(2551);
				match(LR_BRACKET);
				setState(2552);
				match(STAR);
				setState(2553);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2555);
				id();
				setState(2556);
				match(LR_BRACKET);
				setState(2558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (K_ADD - 23)) | (1L << (K_ALL - 23)) | (1L << (K_ALLOW - 23)) | (1L << (K_ALTER - 23)) | (1L << (K_AND - 23)) | (1L << (K_ANY - 23)) | (1L << (K_APPLY - 23)) | (1L << (K_AS - 23)) | (1L << (K_ASC - 23)) | (1L << (K_AUTHORIZE - 23)) | (1L << (K_BATCH - 23)) | (1L << (K_BEGIN - 23)) | (1L << (K_BY - 23)) | (1L << (K_CALLED - 23)) | (1L << (K_CLUSTERING - 23)) | (1L << (K_COLUMNFAMILY - 23)) | (1L << (K_COMPACT - 23)) | (1L << (K_CONSISTENCY - 23)) | (1L << (K_CONTAINS - 23)) | (1L << (K_CREATE - 23)) | (1L << (K_CUSTOM - 23)) | (1L << (K_DELETE - 23)) | (1L << (K_DESC - 23)) | (1L << (K_DESCRIBE - 23)) | (1L << (K_DISTINCT - 23)) | (1L << (K_DROP - 23)) | (1L << (K_DURABLE_WRITES - 23)) | (1L << (K_EACH_QUORUM - 23)) | (1L << (K_ENTRIES - 23)) | (1L << (K_EXECUTE - 23)) | (1L << (K_EXISTS - 23)) | (1L << (K_FALSE - 23)) | (1L << (K_FILTERING - 23)) | (1L << (K_FINALFUNC - 23)) | (1L << (K_FROM - 23)) | (1L << (K_FULL - 23)) | (1L << (K_FUNCTION - 23)) | (1L << (K_FUNCTIONS - 23)) | (1L << (K_GRANT - 23)) | (1L << (K_IF - 23)) | (1L << (K_IN - 23)) | (1L << (K_INDEX - 23)) | (1L << (K_INFINITY - 23)) | (1L << (K_INITCOND - 23)) | (1L << (K_INPUT - 23)) | (1L << (K_INSERT - 23)) | (1L << (K_INTO - 23)) | (1L << (K_IS - 23)) | (1L << (K_JSON - 23)) | (1L << (K_KEY - 23)) | (1L << (K_KEYS - 23)) | (1L << (K_KEYSPACE - 23)) | (1L << (K_KEYSPACES - 23)) | (1L << (K_LANGUAGE - 23)) | (1L << (K_LEVEL - 23)) | (1L << (K_LIMIT - 23)) | (1L << (K_LOCAL_ONE - 23)) | (1L << (K_LOCAL_QUORUM - 23)) | (1L << (K_LOGGED - 23)) | (1L << (K_LOGIN - 23)) | (1L << (K_MATERIALIZED - 23)) | (1L << (K_MODIFY - 23)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_NAN - 87)) | (1L << (K_NORECURSIVE - 87)) | (1L << (K_NOSUPERUSER - 87)) | (1L << (K_NOT - 87)) | (1L << (K_NULL - 87)) | (1L << (K_OF - 87)) | (1L << (K_ON - 87)) | (1L << (K_ONE - 87)) | (1L << (K_OPTIONS - 87)) | (1L << (K_OR - 87)) | (1L << (K_ORDER - 87)) | (1L << (K_PARTITION - 87)) | (1L << (K_PASSWORD - 87)) | (1L << (K_PER - 87)) | (1L << (K_PERMISSION - 87)) | (1L << (K_PERMISSIONS - 87)) | (1L << (K_PRIMARY - 87)) | (1L << (K_QUORUM - 87)) | (1L << (K_RENAME - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_REPLICATION - 87)) | (1L << (K_RETURNS - 87)) | (1L << (K_REVOKE - 87)) | (1L << (K_ROLE - 87)) | (1L << (K_ROLES - 87)) | (1L << (K_SCHEMA - 87)) | (1L << (K_SELECT - 87)) | (1L << (K_SET - 87)) | (1L << (K_SFUNC - 87)) | (1L << (K_STATIC - 87)) | (1L << (K_STORAGE - 87)) | (1L << (K_STYPE - 87)) | (1L << (K_SUPERUSER - 87)) | (1L << (K_TABLE - 87)) | (1L << (K_THREE - 87)) | (1L << (K_TIMESTAMP - 87)) | (1L << (K_TO - 87)) | (1L << (K_TOKEN - 87)) | (1L << (K_TRIGGER - 87)) | (1L << (K_TRUE - 87)) | (1L << (K_TRUNCATE - 87)) | (1L << (K_TTL - 87)) | (1L << (K_TWO - 87)) | (1L << (K_TYPE - 87)) | (1L << (K_UNLOGGED - 87)) | (1L << (K_UPDATE - 87)) | (1L << (K_USE - 87)) | (1L << (K_USER - 87)) | (1L << (K_USING - 87)) | (1L << (K_UUID - 87)) | (1L << (K_VALUES - 87)) | (1L << (K_VIEW - 87)) | (1L << (K_WHERE - 87)) | (1L << (K_WITH - 87)) | (1L << (K_WRITETIME - 87)) | (1L << (K_ASCII - 87)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (K_BIGINT - 188)) | (1L << (K_BLOB - 188)) | (1L << (K_BOOLEAN - 188)) | (1L << (K_COUNTER - 188)) | (1L << (K_DATE - 188)) | (1L << (K_DECIMAL - 188)) | (1L << (K_DOUBLE - 188)) | (1L << (K_FLOAT - 188)) | (1L << (K_FROZEN - 188)) | (1L << (K_INET - 188)) | (1L << (K_INT - 188)) | (1L << (K_LIST - 188)) | (1L << (K_MAP - 188)) | (1L << (K_SMALLINT - 188)) | (1L << (K_TEXT - 188)) | (1L << (K_TIMEUUID - 188)) | (1L << (K_TIME - 188)) | (1L << (K_TINYINT - 188)) | (1L << (K_TUPLE - 188)) | (1L << (K_VARCHAR - 188)) | (1L << (K_VARINT - 188)) | (1L << (CODE_BLOCK - 188)) | (1L << (STRING_LITERAL - 188)) | (1L << (DECIMAL_LITERAL - 188)) | (1L << (FLOAT_LITERAL - 188)) | (1L << (HEXADECIMAL_LITERAL - 188)) | (1L << (OBJECT_NAME - 188)) | (1L << (UUID - 188)) | (1L << (K_USERS - 188)))) != 0)) {
					{
					setState(2557);
					functionArgs();
					}
				}

				setState(2560);
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
		enterRule(_localctx, 316, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2564);
				constant();
				}
				break;
			case 2:
				{
				setState(2565);
				id();
				}
				break;
			case 3:
				{
				setState(2566);
				functionCall();
				}
				break;
			}
			setState(2577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2569);
				syntaxComma();
				setState(2573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2570);
					constant();
					}
					break;
				case 2:
					{
					setState(2571);
					id();
					}
					break;
				case 3:
					{
					setState(2572);
					functionCall();
					}
					break;
				}
				}
				}
				setState(2579);
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
		enterRule(_localctx, 318, RULE_constant);
		try {
			setState(2589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2580);
				match(UUID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2581);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2582);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2583);
				floatLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2584);
				hexadecimalLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2585);
				booleanLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2586);
				codeBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2587);
				kwNull();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2588);
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
		enterRule(_localctx, 320, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
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
		enterRule(_localctx, 322, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
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
		enterRule(_localctx, 324, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
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
		enterRule(_localctx, 326, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
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
		enterRule(_localctx, 328, RULE_hexadecimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
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
		enterRule(_localctx, 330, RULE_keyspace);
		try {
			setState(2606);
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
				setState(2601);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				match(DQUOTE);
				setState(2603);
				id();
				setState(2604);
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
		enterRule(_localctx, 332, RULE_table);
		try {
			setState(2613);
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
				setState(2608);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2609);
				match(DQUOTE);
				setState(2610);
				id();
				setState(2611);
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
		enterRule(_localctx, 334, RULE_column);
		try {
			setState(2620);
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
				setState(2615);
				id();
				}
				break;
			case DQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2616);
				match(DQUOTE);
				setState(2617);
				id();
				setState(2618);
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
		enterRule(_localctx, 336, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			dataTypeName();
			setState(2624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATOR_LT) {
				{
				setState(2623);
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
		enterRule(_localctx, 338, RULE_dataTypeName);
		try {
			setState(2654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2626);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2627);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2628);
				match(K_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2629);
				match(K_SET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2630);
				match(K_ASCII);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2631);
				match(K_BIGINT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2632);
				match(K_BLOB);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2633);
				match(K_BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2634);
				match(K_COUNTER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2635);
				match(K_DATE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2636);
				match(K_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2637);
				match(K_DOUBLE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2638);
				match(K_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2639);
				match(K_FROZEN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2640);
				match(K_INET);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2641);
				match(K_INT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2642);
				match(K_LIST);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2643);
				match(K_MAP);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2644);
				match(K_SMALLINT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2645);
				match(K_TEXT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2646);
				match(K_TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2647);
				match(K_TIMEUUID);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2648);
				match(K_TINYINT);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2649);
				match(K_TUPLE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2650);
				match(K_VARCHAR);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2651);
				match(K_VARINT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2652);
				match(K_TIMESTAMP);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2653);
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
		enterRule(_localctx, 340, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2656);
			syntaxBracketLa();
			setState(2657);
			dataType();
			setState(2663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2658);
				syntaxComma();
				setState(2659);
				dataType();
				}
				}
				setState(2665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2666);
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
		enterRule(_localctx, 342, RULE_orderDirection);
		try {
			setState(2670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2668);
				kwAsc();
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2669);
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
		enterRule(_localctx, 344, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
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
		enterRule(_localctx, 346, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
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
		enterRule(_localctx, 348, RULE_triggerClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
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
		enterRule(_localctx, 350, RULE_materializedView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
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
		enterRule(_localctx, 352, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2680);
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
		enterRule(_localctx, 354, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2682);
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
		enterRule(_localctx, 356, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
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
		enterRule(_localctx, 358, RULE_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
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
		enterRule(_localctx, 360, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2688);
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
		enterRule(_localctx, 362, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
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
		enterRule(_localctx, 364, RULE_hashKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2692);
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
		enterRule(_localctx, 366, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2694);
			paramName();
			setState(2695);
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
		enterRule(_localctx, 368, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
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
		enterRule(_localctx, 370, RULE_kwAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2699);
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
		enterRule(_localctx, 372, RULE_kwAggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2701);
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
		enterRule(_localctx, 374, RULE_kwAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
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
		enterRule(_localctx, 376, RULE_kwAllPermissions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(K_ALL);
			setState(2706);
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
		enterRule(_localctx, 378, RULE_kwAllow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2708);
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
		enterRule(_localctx, 380, RULE_kwAlter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2710);
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
		enterRule(_localctx, 382, RULE_kwAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
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
		enterRule(_localctx, 384, RULE_kwApply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2714);
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
		enterRule(_localctx, 386, RULE_kwAs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2716);
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
		enterRule(_localctx, 388, RULE_kwAsc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2718);
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
		enterRule(_localctx, 390, RULE_kwAuthorize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2720);
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
		enterRule(_localctx, 392, RULE_kwBatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
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
		enterRule(_localctx, 394, RULE_kwBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
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
		enterRule(_localctx, 396, RULE_kwBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2726);
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
		enterRule(_localctx, 398, RULE_kwCalled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2728);
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
		enterRule(_localctx, 400, RULE_kwClustering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2730);
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
		enterRule(_localctx, 402, RULE_kwCompact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
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
		enterRule(_localctx, 404, RULE_kwContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2734);
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
		enterRule(_localctx, 406, RULE_kwCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2736);
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
		enterRule(_localctx, 408, RULE_kwDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2738);
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
		enterRule(_localctx, 410, RULE_kwDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2740);
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
		enterRule(_localctx, 412, RULE_kwDescibe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2742);
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
		enterRule(_localctx, 414, RULE_kwDistinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2744);
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
		enterRule(_localctx, 416, RULE_kwDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2746);
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
		enterRule(_localctx, 418, RULE_kwDurableWrites);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748);
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
		enterRule(_localctx, 420, RULE_kwEntries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
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
		enterRule(_localctx, 422, RULE_kwExecute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2752);
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
		enterRule(_localctx, 424, RULE_kwExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2754);
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
		enterRule(_localctx, 426, RULE_kwFiltering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2756);
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
		enterRule(_localctx, 428, RULE_kwFinalfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2758);
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
		enterRule(_localctx, 430, RULE_kwFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
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
		enterRule(_localctx, 432, RULE_kwFull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2762);
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
		enterRule(_localctx, 434, RULE_kwFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2764);
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
		enterRule(_localctx, 436, RULE_kwFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
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
		enterRule(_localctx, 438, RULE_kwGrant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
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
		enterRule(_localctx, 440, RULE_kwIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
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
		enterRule(_localctx, 442, RULE_kwIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
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
		enterRule(_localctx, 444, RULE_kwIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2774);
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
		enterRule(_localctx, 446, RULE_kwCustom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776);
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
		enterRule(_localctx, 448, RULE_kwSearch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
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
		enterRule(_localctx, 450, RULE_kwAscii);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
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
		enterRule(_localctx, 452, RULE_kwNormalize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2782);
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

	public static class KwAnalyzedContext extends ParserRuleContext {
		public TerminalNode K_ANALYZED() { return getToken(CqlParser.K_ANALYZED, 0); }
		public KwAnalyzedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAnalyzed; }
	}

	public final KwAnalyzedContext kwAnalyzed() throws RecognitionException {
		KwAnalyzedContext _localctx = new KwAnalyzedContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_kwAnalyzed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2784);
			match(K_ANALYZED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwIsLiteralContext extends ParserRuleContext {
		public TerminalNode K_IS_LITERAL() { return getToken(CqlParser.K_IS_LITERAL, 0); }
		public KwIsLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwIsLiteral; }
	}

	public final KwIsLiteralContext kwIsLiteral() throws RecognitionException {
		KwIsLiteralContext _localctx = new KwIsLiteralContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_kwIsLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			match(K_IS_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwMaxCompactionFlushMemoryInMbContext extends ParserRuleContext {
		public TerminalNode K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB() { return getToken(CqlParser.K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB, 0); }
		public KwMaxCompactionFlushMemoryInMbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwMaxCompactionFlushMemoryInMb; }
	}

	public final KwMaxCompactionFlushMemoryInMbContext kwMaxCompactionFlushMemoryInMb() throws RecognitionException {
		KwMaxCompactionFlushMemoryInMbContext _localctx = new KwMaxCompactionFlushMemoryInMbContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_kwMaxCompactionFlushMemoryInMb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2788);
			match(K_MAX_COMPACTION_FLUSH_MEMORY_IN_MB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTokenizationEnableStemmingContext extends ParserRuleContext {
		public TerminalNode K_TOKENIZATION_ENABLE_STEMMING() { return getToken(CqlParser.K_TOKENIZATION_ENABLE_STEMMING, 0); }
		public KwTokenizationEnableStemmingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTokenizationEnableStemming; }
	}

	public final KwTokenizationEnableStemmingContext kwTokenizationEnableStemming() throws RecognitionException {
		KwTokenizationEnableStemmingContext _localctx = new KwTokenizationEnableStemmingContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_kwTokenizationEnableStemming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			match(K_TOKENIZATION_ENABLE_STEMMING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTokenizationSkipStopWordsContext extends ParserRuleContext {
		public TerminalNode K_TOKENIZATION_SKIP_STOP_WORDS() { return getToken(CqlParser.K_TOKENIZATION_SKIP_STOP_WORDS, 0); }
		public KwTokenizationSkipStopWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTokenizationSkipStopWords; }
	}

	public final KwTokenizationSkipStopWordsContext kwTokenizationSkipStopWords() throws RecognitionException {
		KwTokenizationSkipStopWordsContext _localctx = new KwTokenizationSkipStopWordsContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_kwTokenizationSkipStopWords);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			match(K_TOKENIZATION_SKIP_STOP_WORDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTokenizationLocaleContext extends ParserRuleContext {
		public TerminalNode K_TOKENIZATION_LOCALE() { return getToken(CqlParser.K_TOKENIZATION_LOCALE, 0); }
		public KwTokenizationLocaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTokenizationLocale; }
	}

	public final KwTokenizationLocaleContext kwTokenizationLocale() throws RecognitionException {
		KwTokenizationLocaleContext _localctx = new KwTokenizationLocaleContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_kwTokenizationLocale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
			match(K_TOKENIZATION_LOCALE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTokenizationNormalizeLowercaseContext extends ParserRuleContext {
		public TerminalNode K_TOKENIZATION_NORMALIZE_LOWERCASE() { return getToken(CqlParser.K_TOKENIZATION_NORMALIZE_LOWERCASE, 0); }
		public KwTokenizationNormalizeLowercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTokenizationNormalizeLowercase; }
	}

	public final KwTokenizationNormalizeLowercaseContext kwTokenizationNormalizeLowercase() throws RecognitionException {
		KwTokenizationNormalizeLowercaseContext _localctx = new KwTokenizationNormalizeLowercaseContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_kwTokenizationNormalizeLowercase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2796);
			match(K_TOKENIZATION_NORMALIZE_LOWERCASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwTokenizationNormalizeUppercaseContext extends ParserRuleContext {
		public TerminalNode K_TOKENIZATION_NORMALIZE_UPPERCASE() { return getToken(CqlParser.K_TOKENIZATION_NORMALIZE_UPPERCASE, 0); }
		public KwTokenizationNormalizeUppercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwTokenizationNormalizeUppercase; }
	}

	public final KwTokenizationNormalizeUppercaseContext kwTokenizationNormalizeUppercase() throws RecognitionException {
		KwTokenizationNormalizeUppercaseContext _localctx = new KwTokenizationNormalizeUppercaseContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_kwTokenizationNormalizeUppercase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			match(K_TOKENIZATION_NORMALIZE_UPPERCASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNormalizeLowercaseContext extends ParserRuleContext {
		public TerminalNode K_NORMALIZE_LOWERCASE() { return getToken(CqlParser.K_NORMALIZE_LOWERCASE, 0); }
		public KwNormalizeLowercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNormalizeLowercase; }
	}

	public final KwNormalizeLowercaseContext kwNormalizeLowercase() throws RecognitionException {
		KwNormalizeLowercaseContext _localctx = new KwNormalizeLowercaseContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_kwNormalizeLowercase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2800);
			match(K_NORMALIZE_LOWERCASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwNormalizeUppercaseContext extends ParserRuleContext {
		public TerminalNode K_NORMALIZE_UPPERCASE() { return getToken(CqlParser.K_NORMALIZE_UPPERCASE, 0); }
		public KwNormalizeUppercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwNormalizeUppercase; }
	}

	public final KwNormalizeUppercaseContext kwNormalizeUppercase() throws RecognitionException {
		KwNormalizeUppercaseContext _localctx = new KwNormalizeUppercaseContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_kwNormalizeUppercase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			match(K_NORMALIZE_UPPERCASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwModeContext extends ParserRuleContext {
		public TerminalNode K_MODE() { return getToken(CqlParser.K_MODE, 0); }
		public KwModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwMode; }
	}

	public final KwModeContext kwMode() throws RecognitionException {
		KwModeContext _localctx = new KwModeContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_kwMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2804);
			match(K_MODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwAnalyzerClassContext extends ParserRuleContext {
		public TerminalNode K_ANALYZER_CLASS() { return getToken(CqlParser.K_ANALYZER_CLASS, 0); }
		public KwAnalyzerClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwAnalyzerClass; }
	}

	public final KwAnalyzerClassContext kwAnalyzerClass() throws RecognitionException {
		KwAnalyzerClassContext _localctx = new KwAnalyzerClassContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_kwAnalyzerClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2806);
			match(K_ANALYZER_CLASS);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 478, RULE_kwStorageAttachedIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2808);
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

	public static class KwSASIIndexContext extends ParserRuleContext {
		public TerminalNode K_SASI_INDEX() { return getToken(CqlParser.K_SASI_INDEX, 0); }
		public KwSASIIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSASIIndex; }
	}

	public final KwSASIIndexContext kwSASIIndex() throws RecognitionException {
		KwSASIIndexContext _localctx = new KwSASIIndexContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_kwSASIIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2810);
			match(K_SASI_INDEX);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 482, RULE_kwSpaceSavingNoJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812);
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
		enterRule(_localctx, 484, RULE_kwSpaceSavingAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2814);
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
		enterRule(_localctx, 486, RULE_kwSpaceSavingSlowTriePrecision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
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

	public static class KwSpaceSavingNoTextFieldContext extends ParserRuleContext {
		public TerminalNode K_SPACE_SAVING_NO_TEXT_FIELD() { return getToken(CqlParser.K_SPACE_SAVING_NO_TEXT_FIELD, 0); }
		public KwSpaceSavingNoTextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSpaceSavingNoTextField; }
	}

	public final KwSpaceSavingNoTextFieldContext kwSpaceSavingNoTextField() throws RecognitionException {
		KwSpaceSavingNoTextFieldContext _localctx = new KwSpaceSavingNoTextFieldContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_kwSpaceSavingNoTextField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2818);
			match(K_SPACE_SAVING_NO_TEXT_FIELD);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 490, RULE_kwCopyField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
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
		enterRule(_localctx, 492, RULE_kwDocValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2822);
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
		enterRule(_localctx, 494, RULE_kwExcluded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2824);
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
		enterRule(_localctx, 496, RULE_kwIndexed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2826);
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
		enterRule(_localctx, 498, RULE_kwColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2828);
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
		enterRule(_localctx, 500, RULE_kwProfiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2830);
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
		enterRule(_localctx, 502, RULE_kwConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
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
		enterRule(_localctx, 504, RULE_kwAutoCommitTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2834);
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
		enterRule(_localctx, 506, RULE_kwDefaultQueryField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2836);
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
		enterRule(_localctx, 508, RULE_kwDirectoryFactory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
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
		enterRule(_localctx, 510, RULE_kwFilterCacheLowWaterMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
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
		enterRule(_localctx, 512, RULE_kwFilterCacheHighWaterMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
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
		enterRule(_localctx, 514, RULE_kwDirectoryFactoryClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2844);
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
		enterRule(_localctx, 516, RULE_kwMergeMaxThreadCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
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
		enterRule(_localctx, 518, RULE_kwMergeMaxMergeCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
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
		enterRule(_localctx, 520, RULE_kwRamBufferSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2850);
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
		enterRule(_localctx, 522, RULE_kwRealtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2852);
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
		enterRule(_localctx, 524, RULE_kwRecovery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2854);
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
		enterRule(_localctx, 526, RULE_kwReindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2856);
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
		enterRule(_localctx, 528, RULE_kwLenient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2858);
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
		enterRule(_localctx, 530, RULE_kwStandard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2860);
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
		enterRule(_localctx, 532, RULE_kwEncrypted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2862);
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
		enterRule(_localctx, 534, RULE_kwCaseSensitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2864);
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
		enterRule(_localctx, 536, RULE_kwInitcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2866);
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
		enterRule(_localctx, 538, RULE_kwInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2868);
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
		enterRule(_localctx, 540, RULE_kwInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2870);
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
		enterRule(_localctx, 542, RULE_kwInto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2872);
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
		enterRule(_localctx, 544, RULE_kwIs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
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
		enterRule(_localctx, 546, RULE_kwJson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2876);
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
		enterRule(_localctx, 548, RULE_kwKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2878);
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
		enterRule(_localctx, 550, RULE_kwKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2880);
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
		enterRule(_localctx, 552, RULE_kwKeyspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
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
		enterRule(_localctx, 554, RULE_kwKeyspaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
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
		enterRule(_localctx, 556, RULE_kwLanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
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
		enterRule(_localctx, 558, RULE_kwLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
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
		enterRule(_localctx, 560, RULE_kwList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2890);
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
		enterRule(_localctx, 562, RULE_kwLogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2892);
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
		enterRule(_localctx, 564, RULE_kwLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2894);
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
		enterRule(_localctx, 566, RULE_kwMaterialized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2896);
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
		enterRule(_localctx, 568, RULE_kwModify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
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
		enterRule(_localctx, 570, RULE_kwNosuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2900);
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
		enterRule(_localctx, 572, RULE_kwNorecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2902);
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
		enterRule(_localctx, 574, RULE_kwNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2904);
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
		enterRule(_localctx, 576, RULE_kwNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2906);
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
		enterRule(_localctx, 578, RULE_kwOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2908);
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
		enterRule(_localctx, 580, RULE_kwOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2910);
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
		enterRule(_localctx, 582, RULE_kwOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
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
		enterRule(_localctx, 584, RULE_kwOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2914);
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
		enterRule(_localctx, 586, RULE_kwOrder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2916);
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
		enterRule(_localctx, 588, RULE_kwPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2918);
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
		enterRule(_localctx, 590, RULE_kwPrimary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2920);
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
		enterRule(_localctx, 592, RULE_kwRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2922);
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
		enterRule(_localctx, 594, RULE_kwReplace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2924);
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
		enterRule(_localctx, 596, RULE_kwReplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2926);
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
		enterRule(_localctx, 598, RULE_kwReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2928);
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
		enterRule(_localctx, 600, RULE_kwRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2930);
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
		enterRule(_localctx, 602, RULE_kwInternal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2932);
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
		enterRule(_localctx, 604, RULE_kwLdap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2934);
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
		enterRule(_localctx, 606, RULE_kwScheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2936);
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
		enterRule(_localctx, 608, RULE_kwRoles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2938);
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
		enterRule(_localctx, 610, RULE_kwSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2940);
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
		enterRule(_localctx, 612, RULE_kwSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2942);
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
		enterRule(_localctx, 614, RULE_kwSfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2944);
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
		enterRule(_localctx, 616, RULE_kwStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2946);
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
		enterRule(_localctx, 618, RULE_kwStype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2948);
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
		enterRule(_localctx, 620, RULE_kwSuperuser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2950);
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
		enterRule(_localctx, 622, RULE_kwTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2952);
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
		enterRule(_localctx, 624, RULE_kwTimestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2954);
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
		enterRule(_localctx, 626, RULE_kwTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2956);
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
		enterRule(_localctx, 628, RULE_kwTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2958);
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
		enterRule(_localctx, 630, RULE_kwTruncate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2960);
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
		enterRule(_localctx, 632, RULE_kwTtl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2962);
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
		enterRule(_localctx, 634, RULE_kwType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2964);
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
		enterRule(_localctx, 636, RULE_kwUnlogged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2966);
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
		enterRule(_localctx, 638, RULE_kwUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2968);
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
		enterRule(_localctx, 640, RULE_kwUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2970);
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
		enterRule(_localctx, 642, RULE_kwUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972);
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
		enterRule(_localctx, 644, RULE_kwUsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2974);
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
		enterRule(_localctx, 646, RULE_kwUsing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2976);
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
		enterRule(_localctx, 648, RULE_kwValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2978);
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
		enterRule(_localctx, 650, RULE_kwView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2980);
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
		enterRule(_localctx, 652, RULE_kwWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2982);
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
		enterRule(_localctx, 654, RULE_kwWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2984);
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
		enterRule(_localctx, 656, RULE_kwRevoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2986);
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
		enterRule(_localctx, 658, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2988);
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
		enterRule(_localctx, 660, RULE_syntaxBracketLr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2990);
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
		enterRule(_localctx, 662, RULE_syntaxBracketRr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2992);
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
		enterRule(_localctx, 664, RULE_syntaxBracketLc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2994);
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
		enterRule(_localctx, 666, RULE_syntaxBracketRc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
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
		enterRule(_localctx, 668, RULE_syntaxBracketLa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2998);
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
		enterRule(_localctx, 670, RULE_syntaxBracketRa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3000);
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
		enterRule(_localctx, 672, RULE_syntaxBracketLs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3002);
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
		enterRule(_localctx, 674, RULE_syntaxBracketRs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3004);
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
		enterRule(_localctx, 676, RULE_syntaxComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3006);
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
		enterRule(_localctx, 678, RULE_syntaxColon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3008);
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
		enterRule(_localctx, 680, RULE_id);
		try {
			setState(3152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(3010);
				match(OBJECT_NAME);
				}
				break;
			case K_ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(3011);
				match(K_ADD);
				setState(3012);
				match(K_AGGREGATE);
				}
				break;
			case K_ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(3013);
				match(K_ALL);
				}
				break;
			case K_ALLOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(3014);
				match(K_ALLOW);
				}
				break;
			case K_ALTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(3015);
				match(K_ALTER);
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 6);
				{
				setState(3016);
				match(K_AND);
				}
				break;
			case K_ANY:
				enterOuterAlt(_localctx, 7);
				{
				setState(3017);
				match(K_ANY);
				}
				break;
			case K_APPLY:
				enterOuterAlt(_localctx, 8);
				{
				setState(3018);
				match(K_APPLY);
				}
				break;
			case K_AS:
				enterOuterAlt(_localctx, 9);
				{
				setState(3019);
				match(K_AS);
				}
				break;
			case K_ASC:
				enterOuterAlt(_localctx, 10);
				{
				setState(3020);
				match(K_ASC);
				}
				break;
			case K_AUTHORIZE:
				enterOuterAlt(_localctx, 11);
				{
				setState(3021);
				match(K_AUTHORIZE);
				}
				break;
			case K_BATCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(3022);
				match(K_BATCH);
				}
				break;
			case K_BEGIN:
				enterOuterAlt(_localctx, 13);
				{
				setState(3023);
				match(K_BEGIN);
				}
				break;
			case K_BY:
				enterOuterAlt(_localctx, 14);
				{
				setState(3024);
				match(K_BY);
				}
				break;
			case K_CALLED:
				enterOuterAlt(_localctx, 15);
				{
				setState(3025);
				match(K_CALLED);
				}
				break;
			case K_CLUSTERING:
				enterOuterAlt(_localctx, 16);
				{
				setState(3026);
				match(K_CLUSTERING);
				}
				break;
			case K_COLUMNFAMILY:
				enterOuterAlt(_localctx, 17);
				{
				setState(3027);
				match(K_COLUMNFAMILY);
				}
				break;
			case K_COMPACT:
				enterOuterAlt(_localctx, 18);
				{
				setState(3028);
				match(K_COMPACT);
				}
				break;
			case K_CONSISTENCY:
				enterOuterAlt(_localctx, 19);
				{
				setState(3029);
				match(K_CONSISTENCY);
				}
				break;
			case K_CONTAINS:
				enterOuterAlt(_localctx, 20);
				{
				setState(3030);
				match(K_CONTAINS);
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 21);
				{
				setState(3031);
				match(K_CREATE);
				}
				break;
			case K_CUSTOM:
				enterOuterAlt(_localctx, 22);
				{
				setState(3032);
				match(K_CUSTOM);
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 23);
				{
				setState(3033);
				match(K_DELETE);
				}
				break;
			case K_DESC:
				enterOuterAlt(_localctx, 24);
				{
				setState(3034);
				match(K_DESC);
				}
				break;
			case K_DESCRIBE:
				enterOuterAlt(_localctx, 25);
				{
				setState(3035);
				match(K_DESCRIBE);
				}
				break;
			case K_DISTINCT:
				enterOuterAlt(_localctx, 26);
				{
				setState(3036);
				match(K_DISTINCT);
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 27);
				{
				setState(3037);
				match(K_DROP);
				}
				break;
			case K_DURABLE_WRITES:
				enterOuterAlt(_localctx, 28);
				{
				setState(3038);
				match(K_DURABLE_WRITES);
				}
				break;
			case K_EACH_QUORUM:
				enterOuterAlt(_localctx, 29);
				{
				setState(3039);
				match(K_EACH_QUORUM);
				}
				break;
			case K_ENTRIES:
				enterOuterAlt(_localctx, 30);
				{
				setState(3040);
				match(K_ENTRIES);
				}
				break;
			case K_EXECUTE:
				enterOuterAlt(_localctx, 31);
				{
				setState(3041);
				match(K_EXECUTE);
				}
				break;
			case K_EXISTS:
				enterOuterAlt(_localctx, 32);
				{
				setState(3042);
				match(K_EXISTS);
				}
				break;
			case K_FALSE:
				enterOuterAlt(_localctx, 33);
				{
				setState(3043);
				match(K_FALSE);
				}
				break;
			case K_FILTERING:
				enterOuterAlt(_localctx, 34);
				{
				setState(3044);
				match(K_FILTERING);
				}
				break;
			case K_FINALFUNC:
				enterOuterAlt(_localctx, 35);
				{
				setState(3045);
				match(K_FINALFUNC);
				}
				break;
			case K_FROM:
				enterOuterAlt(_localctx, 36);
				{
				setState(3046);
				match(K_FROM);
				}
				break;
			case K_FULL:
				enterOuterAlt(_localctx, 37);
				{
				setState(3047);
				match(K_FULL);
				}
				break;
			case K_FUNCTION:
				enterOuterAlt(_localctx, 38);
				{
				setState(3048);
				match(K_FUNCTION);
				}
				break;
			case K_FUNCTIONS:
				enterOuterAlt(_localctx, 39);
				{
				setState(3049);
				match(K_FUNCTIONS);
				}
				break;
			case K_GRANT:
				enterOuterAlt(_localctx, 40);
				{
				setState(3050);
				match(K_GRANT);
				}
				break;
			case K_IF:
				enterOuterAlt(_localctx, 41);
				{
				setState(3051);
				match(K_IF);
				}
				break;
			case K_IN:
				enterOuterAlt(_localctx, 42);
				{
				setState(3052);
				match(K_IN);
				}
				break;
			case K_INDEX:
				enterOuterAlt(_localctx, 43);
				{
				setState(3053);
				match(K_INDEX);
				}
				break;
			case K_INFINITY:
				enterOuterAlt(_localctx, 44);
				{
				setState(3054);
				match(K_INFINITY);
				}
				break;
			case K_INITCOND:
				enterOuterAlt(_localctx, 45);
				{
				setState(3055);
				match(K_INITCOND);
				}
				break;
			case K_INPUT:
				enterOuterAlt(_localctx, 46);
				{
				setState(3056);
				match(K_INPUT);
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 47);
				{
				setState(3057);
				match(K_INSERT);
				}
				break;
			case K_INTO:
				enterOuterAlt(_localctx, 48);
				{
				setState(3058);
				match(K_INTO);
				}
				break;
			case K_IS:
				enterOuterAlt(_localctx, 49);
				{
				setState(3059);
				match(K_IS);
				}
				break;
			case K_JSON:
				enterOuterAlt(_localctx, 50);
				{
				setState(3060);
				match(K_JSON);
				}
				break;
			case K_KEY:
				enterOuterAlt(_localctx, 51);
				{
				setState(3061);
				match(K_KEY);
				}
				break;
			case K_KEYS:
				enterOuterAlt(_localctx, 52);
				{
				setState(3062);
				match(K_KEYS);
				}
				break;
			case K_KEYSPACE:
				enterOuterAlt(_localctx, 53);
				{
				setState(3063);
				match(K_KEYSPACE);
				}
				break;
			case K_KEYSPACES:
				enterOuterAlt(_localctx, 54);
				{
				setState(3064);
				match(K_KEYSPACES);
				}
				break;
			case K_LANGUAGE:
				enterOuterAlt(_localctx, 55);
				{
				setState(3065);
				match(K_LANGUAGE);
				}
				break;
			case K_LEVEL:
				enterOuterAlt(_localctx, 56);
				{
				setState(3066);
				match(K_LEVEL);
				}
				break;
			case K_LIMIT:
				enterOuterAlt(_localctx, 57);
				{
				setState(3067);
				match(K_LIMIT);
				}
				break;
			case K_LOCAL_ONE:
				enterOuterAlt(_localctx, 58);
				{
				setState(3068);
				match(K_LOCAL_ONE);
				}
				break;
			case K_LOCAL_QUORUM:
				enterOuterAlt(_localctx, 59);
				{
				setState(3069);
				match(K_LOCAL_QUORUM);
				}
				break;
			case K_LOGGED:
				enterOuterAlt(_localctx, 60);
				{
				setState(3070);
				match(K_LOGGED);
				}
				break;
			case K_LOGIN:
				enterOuterAlt(_localctx, 61);
				{
				setState(3071);
				match(K_LOGIN);
				}
				break;
			case K_MATERIALIZED:
				enterOuterAlt(_localctx, 62);
				{
				setState(3072);
				match(K_MATERIALIZED);
				}
				break;
			case K_MODIFY:
				enterOuterAlt(_localctx, 63);
				{
				setState(3073);
				match(K_MODIFY);
				}
				break;
			case K_NAN:
				enterOuterAlt(_localctx, 64);
				{
				setState(3074);
				match(K_NAN);
				}
				break;
			case K_NORECURSIVE:
				enterOuterAlt(_localctx, 65);
				{
				setState(3075);
				match(K_NORECURSIVE);
				}
				break;
			case K_NOSUPERUSER:
				enterOuterAlt(_localctx, 66);
				{
				setState(3076);
				match(K_NOSUPERUSER);
				}
				break;
			case K_NOT:
				enterOuterAlt(_localctx, 67);
				{
				setState(3077);
				match(K_NOT);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 68);
				{
				setState(3078);
				match(K_NULL);
				}
				break;
			case K_OF:
				enterOuterAlt(_localctx, 69);
				{
				setState(3079);
				match(K_OF);
				}
				break;
			case K_ON:
				enterOuterAlt(_localctx, 70);
				{
				setState(3080);
				match(K_ON);
				}
				break;
			case K_ONE:
				enterOuterAlt(_localctx, 71);
				{
				setState(3081);
				match(K_ONE);
				}
				break;
			case K_OPTIONS:
				enterOuterAlt(_localctx, 72);
				{
				setState(3082);
				match(K_OPTIONS);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 73);
				{
				setState(3083);
				match(K_OR);
				}
				break;
			case K_ORDER:
				enterOuterAlt(_localctx, 74);
				{
				setState(3084);
				match(K_ORDER);
				}
				break;
			case K_PARTITION:
				enterOuterAlt(_localctx, 75);
				{
				setState(3085);
				match(K_PARTITION);
				}
				break;
			case K_PASSWORD:
				enterOuterAlt(_localctx, 76);
				{
				setState(3086);
				match(K_PASSWORD);
				}
				break;
			case K_PER:
				enterOuterAlt(_localctx, 77);
				{
				setState(3087);
				match(K_PER);
				}
				break;
			case K_PERMISSION:
				enterOuterAlt(_localctx, 78);
				{
				setState(3088);
				match(K_PERMISSION);
				}
				break;
			case K_PERMISSIONS:
				enterOuterAlt(_localctx, 79);
				{
				setState(3089);
				match(K_PERMISSIONS);
				}
				break;
			case K_PRIMARY:
				enterOuterAlt(_localctx, 80);
				{
				setState(3090);
				match(K_PRIMARY);
				}
				break;
			case K_QUORUM:
				enterOuterAlt(_localctx, 81);
				{
				setState(3091);
				match(K_QUORUM);
				}
				break;
			case K_RENAME:
				enterOuterAlt(_localctx, 82);
				{
				setState(3092);
				match(K_RENAME);
				}
				break;
			case K_REPLACE:
				enterOuterAlt(_localctx, 83);
				{
				setState(3093);
				match(K_REPLACE);
				}
				break;
			case K_REPLICATION:
				enterOuterAlt(_localctx, 84);
				{
				setState(3094);
				match(K_REPLICATION);
				}
				break;
			case K_RETURNS:
				enterOuterAlt(_localctx, 85);
				{
				setState(3095);
				match(K_RETURNS);
				}
				break;
			case K_REVOKE:
				enterOuterAlt(_localctx, 86);
				{
				setState(3096);
				match(K_REVOKE);
				}
				break;
			case K_ROLE:
				enterOuterAlt(_localctx, 87);
				{
				setState(3097);
				match(K_ROLE);
				}
				break;
			case K_ROLES:
				enterOuterAlt(_localctx, 88);
				{
				setState(3098);
				match(K_ROLES);
				}
				break;
			case K_SCHEMA:
				enterOuterAlt(_localctx, 89);
				{
				setState(3099);
				match(K_SCHEMA);
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 90);
				{
				setState(3100);
				match(K_SELECT);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 91);
				{
				setState(3101);
				match(K_SET);
				}
				break;
			case K_SFUNC:
				enterOuterAlt(_localctx, 92);
				{
				setState(3102);
				match(K_SFUNC);
				}
				break;
			case K_STATIC:
				enterOuterAlt(_localctx, 93);
				{
				setState(3103);
				match(K_STATIC);
				}
				break;
			case K_STORAGE:
				enterOuterAlt(_localctx, 94);
				{
				setState(3104);
				match(K_STORAGE);
				}
				break;
			case K_STYPE:
				enterOuterAlt(_localctx, 95);
				{
				setState(3105);
				match(K_STYPE);
				}
				break;
			case K_SUPERUSER:
				enterOuterAlt(_localctx, 96);
				{
				setState(3106);
				match(K_SUPERUSER);
				}
				break;
			case K_TABLE:
				enterOuterAlt(_localctx, 97);
				{
				setState(3107);
				match(K_TABLE);
				}
				break;
			case K_THREE:
				enterOuterAlt(_localctx, 98);
				{
				setState(3108);
				match(K_THREE);
				}
				break;
			case K_TIMESTAMP:
				enterOuterAlt(_localctx, 99);
				{
				setState(3109);
				match(K_TIMESTAMP);
				}
				break;
			case K_TO:
				enterOuterAlt(_localctx, 100);
				{
				setState(3110);
				match(K_TO);
				}
				break;
			case K_TOKEN:
				enterOuterAlt(_localctx, 101);
				{
				setState(3111);
				match(K_TOKEN);
				}
				break;
			case K_TRIGGER:
				enterOuterAlt(_localctx, 102);
				{
				setState(3112);
				match(K_TRIGGER);
				}
				break;
			case K_TRUE:
				enterOuterAlt(_localctx, 103);
				{
				setState(3113);
				match(K_TRUE);
				}
				break;
			case K_TRUNCATE:
				enterOuterAlt(_localctx, 104);
				{
				setState(3114);
				match(K_TRUNCATE);
				}
				break;
			case K_TTL:
				enterOuterAlt(_localctx, 105);
				{
				setState(3115);
				match(K_TTL);
				}
				break;
			case K_TWO:
				enterOuterAlt(_localctx, 106);
				{
				setState(3116);
				match(K_TWO);
				}
				break;
			case K_TYPE:
				enterOuterAlt(_localctx, 107);
				{
				setState(3117);
				match(K_TYPE);
				}
				break;
			case K_UNLOGGED:
				enterOuterAlt(_localctx, 108);
				{
				setState(3118);
				match(K_UNLOGGED);
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 109);
				{
				setState(3119);
				match(K_UPDATE);
				}
				break;
			case K_USE:
				enterOuterAlt(_localctx, 110);
				{
				setState(3120);
				match(K_USE);
				}
				break;
			case K_USER:
				enterOuterAlt(_localctx, 111);
				{
				setState(3121);
				match(K_USER);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 112);
				{
				setState(3122);
				match(K_USING);
				}
				break;
			case K_UUID:
				enterOuterAlt(_localctx, 113);
				{
				setState(3123);
				match(K_UUID);
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 114);
				{
				setState(3124);
				match(K_VALUES);
				}
				break;
			case K_VIEW:
				enterOuterAlt(_localctx, 115);
				{
				setState(3125);
				match(K_VIEW);
				}
				break;
			case K_WHERE:
				enterOuterAlt(_localctx, 116);
				{
				setState(3126);
				match(K_WHERE);
				}
				break;
			case K_WITH:
				enterOuterAlt(_localctx, 117);
				{
				setState(3127);
				match(K_WITH);
				}
				break;
			case K_WRITETIME:
				enterOuterAlt(_localctx, 118);
				{
				setState(3128);
				match(K_WRITETIME);
				}
				break;
			case K_ASCII:
				enterOuterAlt(_localctx, 119);
				{
				setState(3129);
				match(K_ASCII);
				}
				break;
			case K_BIGINT:
				enterOuterAlt(_localctx, 120);
				{
				setState(3130);
				match(K_BIGINT);
				}
				break;
			case K_BLOB:
				enterOuterAlt(_localctx, 121);
				{
				setState(3131);
				match(K_BLOB);
				}
				break;
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 122);
				{
				setState(3132);
				match(K_BOOLEAN);
				}
				break;
			case K_COUNTER:
				enterOuterAlt(_localctx, 123);
				{
				setState(3133);
				match(K_COUNTER);
				}
				break;
			case K_DATE:
				enterOuterAlt(_localctx, 124);
				{
				setState(3134);
				match(K_DATE);
				}
				break;
			case K_DECIMAL:
				enterOuterAlt(_localctx, 125);
				{
				setState(3135);
				match(K_DECIMAL);
				}
				break;
			case K_DOUBLE:
				enterOuterAlt(_localctx, 126);
				{
				setState(3136);
				match(K_DOUBLE);
				}
				break;
			case K_FLOAT:
				enterOuterAlt(_localctx, 127);
				{
				setState(3137);
				match(K_FLOAT);
				}
				break;
			case K_FROZEN:
				enterOuterAlt(_localctx, 128);
				{
				setState(3138);
				match(K_FROZEN);
				}
				break;
			case K_INET:
				enterOuterAlt(_localctx, 129);
				{
				setState(3139);
				match(K_INET);
				}
				break;
			case K_INT:
				enterOuterAlt(_localctx, 130);
				{
				setState(3140);
				match(K_INT);
				}
				break;
			case K_LIST:
				enterOuterAlt(_localctx, 131);
				{
				setState(3141);
				match(K_LIST);
				}
				break;
			case K_MAP:
				enterOuterAlt(_localctx, 132);
				{
				setState(3142);
				match(K_MAP);
				}
				break;
			case K_SMALLINT:
				enterOuterAlt(_localctx, 133);
				{
				setState(3143);
				match(K_SMALLINT);
				}
				break;
			case K_TEXT:
				enterOuterAlt(_localctx, 134);
				{
				setState(3144);
				match(K_TEXT);
				}
				break;
			case K_TIMEUUID:
				enterOuterAlt(_localctx, 135);
				{
				setState(3145);
				match(K_TIMEUUID);
				}
				break;
			case K_TIME:
				enterOuterAlt(_localctx, 136);
				{
				setState(3146);
				match(K_TIME);
				}
				break;
			case K_TINYINT:
				enterOuterAlt(_localctx, 137);
				{
				setState(3147);
				match(K_TINYINT);
				}
				break;
			case K_TUPLE:
				enterOuterAlt(_localctx, 138);
				{
				setState(3148);
				match(K_TUPLE);
				}
				break;
			case K_VARCHAR:
				enterOuterAlt(_localctx, 139);
				{
				setState(3149);
				match(K_VARCHAR);
				}
				break;
			case K_VARINT:
				enterOuterAlt(_localctx, 140);
				{
				setState(3150);
				match(K_VARINT);
				}
				break;
			case K_USERS:
				enterOuterAlt(_localctx, 141);
				{
				setState(3151);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e0\u0c55\4\2\t"+
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
		"\4\u0147\t\u0147\4\u0148\t\u0148\4\u0149\t\u0149\4\u014a\t\u014a\4\u014b"+
		"\t\u014b\4\u014c\t\u014c\4\u014d\t\u014d\4\u014e\t\u014e\4\u014f\t\u014f"+
		"\4\u0150\t\u0150\4\u0151\t\u0151\4\u0152\t\u0152\4\u0153\t\u0153\4\u0154"+
		"\t\u0154\4\u0155\t\u0155\4\u0156\t\u0156\3\2\5\2\u02ae\n\2\3\2\5\2\u02b1"+
		"\n\2\3\2\3\2\3\3\3\3\5\3\u02b7\n\3\3\3\3\3\3\3\7\3\u02bc\n\3\f\3\16\3"+
		"\u02bf\13\3\3\3\3\3\5\3\u02c3\n\3\3\3\5\3\u02c6\n\3\3\3\5\3\u02c9\n\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02f5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0306\n\t\3\t\5\t\u0309\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0310\n\n\3\n\3\n\3\n\5\n\u0315\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0320\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u032a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0339\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0344\n\r\3\r\3"+
		"\r\3\r\5\r\u0349\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0354\n\r"+
		"\3\r\3\r\5\r\u0358\n\r\3\16\3\16\3\16\5\16\u035d\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0365\n\16\3\17\3\17\3\17\5\17\u036a\n\17\3\17\3\17"+
		"\5\17\u036e\n\17\3\20\3\20\3\20\5\20\u0373\n\20\3\20\3\20\3\20\5\20\u0378"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0385"+
		"\n\21\f\21\16\21\u0388\13\21\3\22\3\22\3\22\5\22\u038d\n\22\3\22\3\22"+
		"\3\22\5\22\u0392\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u039c"+
		"\n\23\3\23\3\23\3\23\5\23\u03a1\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u03ab\n\23\3\23\3\23\3\23\5\23\u03b0\n\23\3\23\3\23\3\23\5"+
		"\23\u03b5\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u03bc\n\24\3\25\3\25\3\25"+
		"\3\25\7\25\u03c2\n\25\f\25\16\25\u03c5\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\5\30\u03d1\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u03dd\n\30\3\31\3\31\5\31\u03e1\n\31\3\31\3"+
		"\31\5\31\u03e5\n\31\3\31\3\31\3\31\5\31\u03ea\n\31\3\31\3\31\3\31\5\31"+
		"\u03ef\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\7\33\u0400\n\33\f\33\16\33\u0403\13\33\3\34\3\34\3\34"+
		"\3\34\5\34\u0409\n\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u0411\n\35\3"+
		"\35\3\35\5\35\u0415\n\35\3\35\3\35\3\35\5\35\u041a\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u042d\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u0434\n\37\f\37\16\37\u0437"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u0445\n!\f!\16!\u0448"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0451\n\"\f\"\16\"\u0454\13\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0461\n$\3%\3%\3%\3&\3&\5&\u0468\n&\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u046f\n\'\3\'\3\'\3\'\3(\3(\3(\5(\u0477\n(\3)\3"+
		")\3)\3*\3*\3*\3*\7*\u0480\n*\f*\16*\u0483\13*\3+\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0496\n.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/"+
		"\u04a1\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u04b6\n\64\f\64\16\64\u04b9\13"+
		"\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u04c4\n\66\f\66"+
		"\16\66\u04c7\13\66\3\67\3\67\3\67\3\67\5\67\u04cd\n\67\38\38\38\38\38"+
		"\78\u04d4\n8\f8\168\u04d7\138\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\59\u04e9\n9\3:\3:\3:\3:\3:\3:\5:\u04f1\n:\3:\3:\3:\3:\5:\u04f7"+
		"\n:\3;\3;\3;\5;\u04fc\n;\3;\3;\3<\3<\3<\5<\u0503\n<\3<\3<\3<\5<\u0508"+
		"\n<\3<\3<\3=\3=\3=\3=\5=\u0510\n=\3=\3=\3=\5=\u0515\n=\3=\3=\3>\3>\3>"+
		"\5>\u051c\n>\3>\3>\3>\5>\u0521\n>\3>\3>\3?\3?\3?\5?\u0528\n?\3?\3?\3?"+
		"\5?\u052d\n?\3?\3?\3@\3@\3@\5@\u0534\n@\3@\3@\3@\3@\3@\5@\u053b\n@\3@"+
		"\3@\3A\3A\3A\5A\u0542\nA\3A\3A\3B\3B\3B\5B\u0549\nB\3B\3B\3B\5B\u054e"+
		"\nB\3B\3B\3C\3C\3C\5C\u0555\nC\3C\3C\3D\3D\3D\5D\u055c\nD\3D\3D\3D\5D"+
		"\u0561\nD\3D\3D\3E\3E\3E\5E\u0568\nE\3E\3E\3E\5E\u056d\nE\3E\3E\3E\3E"+
		"\3E\5E\u0574\nE\3F\3F\5F\u0578\nF\3G\3G\5G\u057c\nG\3G\3G\3G\5G\u0581"+
		"\nG\7G\u0583\nG\fG\16G\u0586\13G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\7I\u0593"+
		"\nI\fI\16I\u0596\13I\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u05a1\nJ\3K\3K\3L\3"+
		"L\3L\5L\u05a8\nL\3M\3M\3M\3M\3M\7M\u05af\nM\fM\16M\u05b2\13M\3M\3M\3N"+
		"\3N\3N\3N\3O\3O\3P\3P\3P\5P\u05bf\nP\3Q\3Q\3Q\3Q\7Q\u05c5\nQ\fQ\16Q\u05c8"+
		"\13Q\3Q\3Q\3Q\5Q\u05cd\nQ\3R\3R\3R\5R\u05d2\nR\3S\3S\3S\3T\3T\3T\3T\3"+
		"T\3T\3U\3U\3U\5U\u05e0\nU\3V\3V\3W\3W\3W\3W\5W\u05e8\nW\3X\3X\3X\3X\3"+
		"X\3X\5X\u05f0\nX\3Y\3Y\3Y\3Y\7Y\u05f6\nY\fY\16Y\u05f9\13Y\3Z\3Z\3Z\3Z"+
		"\7Z\u05ff\nZ\fZ\16Z\u0602\13Z\3[\3[\3\\\3\\\3]\3]\3]\3^\3^\5^\u060d\n"+
		"^\3^\3^\5^\u0611\n^\3_\3_\5_\u0615\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\5`\u0623\n`\3a\3a\3a\3a\7a\u0629\na\fa\16a\u062c\13a\3b\3b\3b\3b"+
		"\3b\3b\5b\u0634\nb\3c\3c\3c\3c\3d\3d\3d\3e\3e\5e\u063f\ne\3e\3e\3e\5e"+
		"\u0644\ne\3e\3e\3f\3f\3f\5f\u064b\nf\3f\5f\u064e\nf\3f\3f\3f\3f\5f\u0654"+
		"\nf\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u065f\nf\3f\5f\u0662\nf\3f\3f\3f\3f"+
		"\5f\u0668\nf\3f\3f\3f\3f\3f\3f\3f\5f\u0671\nf\3f\3f\3f\3f\3f\6f\u0678"+
		"\nf\rf\16f\u0679\3f\3f\5f\u067e\nf\5f\u0680\nf\3g\3g\3g\3g\5g\u0686\n"+
		"g\3g\3g\3g\3g\5g\u068c\ng\3g\3g\3g\3g\5g\u0692\ng\3g\3g\3g\3g\5g\u0698"+
		"\ng\3g\3g\3g\3g\5g\u069e\ng\3g\3g\3g\3g\5g\u06a4\ng\3g\3g\3g\3g\5g\u06aa"+
		"\ng\3g\3g\3g\3g\5g\u06b0\ng\3g\3g\3g\3g\5g\u06b6\ng\3g\3g\3g\3g\5g\u06bc"+
		"\ng\3g\3g\3g\3g\5g\u06c2\ng\3g\3g\3g\3g\5g\u06c8\ng\3g\3g\3g\3g\5g\u06ce"+
		"\ng\3g\3g\3g\3g\5g\u06d4\ng\3g\3g\3g\3g\5g\u06da\ng\5g\u06dc\ng\3h\3h"+
		"\3h\3h\5h\u06e2\nh\3h\3h\3h\3h\5h\u06e8\nh\3h\3h\3h\3h\3h\5h\u06ef\nh"+
		"\3h\5h\u06f2\nh\3h\3h\3h\5h\u06f7\nh\3h\5h\u06fa\nh\3h\5h\u06fd\nh\3h"+
		"\5h\u0700\nh\3h\5h\u0703\nh\5h\u0705\nh\3i\3i\3i\3i\3i\3i\5i\u070d\ni"+
		"\3i\5i\u0710\ni\3i\3i\3i\3i\5i\u0716\ni\3i\5i\u0719\ni\3i\3i\3i\3i\5i"+
		"\u071f\ni\3i\5i\u0722\ni\3i\3i\3i\3i\5i\u0728\ni\3i\5i\u072b\ni\3i\3i"+
		"\3i\3i\5i\u0731\ni\3i\5i\u0734\ni\3i\3i\3i\3i\5i\u073a\ni\3i\5i\u073d"+
		"\ni\3i\3i\3i\3i\5i\u0743\ni\3i\5i\u0746\ni\3i\3i\3i\3i\5i\u074c\ni\3i"+
		"\5i\u074f\ni\3i\3i\3i\3i\5i\u0755\ni\3i\5i\u0758\ni\3i\3i\3i\3i\5i\u075e"+
		"\ni\3i\3i\3j\3j\5j\u0764\nj\3k\3k\3k\3k\3k\3k\5k\u076c\nk\3k\5k\u076f"+
		"\nk\3k\3k\3k\3k\5k\u0775\nk\3k\5k\u0778\nk\3k\3k\3k\3k\5k\u077e\nk\3k"+
		"\3k\3l\3l\3l\3l\5l\u0786\nl\3m\3m\3m\3m\7m\u078c\nm\fm\16m\u078f\13m\3"+
		"n\3n\3n\3n\7n\u0795\nn\fn\16n\u0798\13n\3o\3o\3o\3o\3o\3o\5o\u07a0\no"+
		"\3o\5o\u07a3\no\3o\3o\3o\3o\5o\u07a9\no\3o\5o\u07ac\no\3o\3o\3o\3o\5o"+
		"\u07b2\no\3o\5o\u07b5\no\3o\3o\3o\3o\5o\u07bb\no\3o\5o\u07be\no\3o\3o"+
		"\3o\3o\3o\3o\5o\u07c6\no\3o\5o\u07c9\no\3o\3o\3o\3o\5o\u07cf\no\3o\5o"+
		"\u07d2\no\3o\3o\3o\3o\5o\u07d8\no\3o\5o\u07db\no\3o\3o\3o\3o\5o\u07e1"+
		"\no\3o\5o\u07e4\no\5o\u07e6\no\3p\3p\5p\u07ea\np\3q\3q\3q\3q\3q\5q\u07f1"+
		"\nq\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3v\5v"+
		"\u0808\nv\3v\3v\5v\u080c\nv\3v\3v\5v\u0810\nv\3v\3v\3v\5v\u0815\nv\3w"+
		"\3w\3w\3w\7w\u081b\nw\fw\16w\u081e\13w\3x\3x\3x\3x\3x\5x\u0825\nx\3x\3"+
		"x\5x\u0829\nx\3y\5y\u082c\ny\3y\3y\3y\3y\5y\u0832\ny\3y\3y\5y\u0836\n"+
		"y\3y\3y\3y\3y\3y\5y\u083d\ny\3z\3z\3z\3{\3{\3{\3{\7{\u0846\n{\f{\16{\u0849"+
		"\13{\3|\3|\3|\3|\3}\3}\3}\3}\7}\u0853\n}\f}\16}\u0856\13}\3~\3~\3~\3~"+
		"\3~\3~\5~\u085e\n~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0891\n~\3\177\3\177\3\177\3\177\3\177"+
		"\7\177\u0898\n\177\f\177\16\177\u089b\13\177\5\177\u089d\n\177\3\177\3"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\7\u0080\u08ab\n\u0080\f\u0080\16\u0080\u08ae\13\u0080\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u08b7\n"+
		"\u0081\f\u0081\16\u0081\u08ba\13\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\7\u0082\u08c3\n\u0082\f\u0082\16\u0082\u08c6"+
		"\13\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083"+
		"\u08cf\n\u0083\f\u0083\16\u0083\u08d2\13\u0083\3\u0083\3\u0083\3\u0083"+
		"\7\u0083\u08d7\n\u0083\f\u0083\16\u0083\u08da\13\u0083\5\u0083\u08dc\n"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u08e2\n\u0083\f\u0083\16"+
		"\u0083\u08e5\13\u0083\5\u0083\u08e7\n\u0083\3\u0083\3\u0083\3\u0084\5"+
		"\u0084\u08ec\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u08f3"+
		"\n\u0084\3\u0084\3\u0084\5\u0084\u08f7\n\u0084\3\u0084\3\u0084\5\u0084"+
		"\u08fb\n\u0084\3\u0084\5\u0084\u08fe\n\u0084\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0910\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u092a\n\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u0934\n\u008d"+
		"\f\u008d\16\u008d\u0937\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u093d\n\u008e\f\u008e\16\u008e\u0940\13\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u0948\n\u008f\3\u0090\3\u0090\5\u0090"+
		"\u094c\n\u0090\3\u0090\5\u0090\u094f\n\u0090\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u0954\n\u0090\3\u0090\5\u0090\u0957\n\u0090\3\u0090\5\u0090\u095a"+
		"\n\u0090\3\u0090\5\u0090\u095d\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u096d\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u0976\n\u0096\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\5\u0099\u097f\n\u0099\3\u0099\3\u0099\3\u0099"+
		"\7\u0099\u0984\n\u0099\f\u0099\16\u0099\u0987\13\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0991\n\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0997\n\u009a\5\u009a\u0999\n"+
		"\u009a\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u099f\n\u009b\f\u009b\16"+
		"\u009b\u09a2\13\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u09ba"+
		"\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c"+
		"\u09c3\n\u009c\f\u009c\16\u009c\u09c6\13\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u09cf\n\u009c\f\u009c\16\u009c"+
		"\u09d2\13\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\7\u009c\u09db\n\u009c\f\u009c\16\u009c\u09de\13\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u09e6\n\u009c\f\u009c\16\u009c"+
		"\u09e9\13\u009c\3\u009c\3\u009c\5\u009c\u09ed\n\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a01"+
		"\n\u009f\3\u009f\3\u009f\5\u009f\u0a05\n\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0a0a\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0a10\n"+
		"\u00a0\7\u00a0\u0a12\n\u00a0\f\u00a0\16\u00a0\u0a15\13\u00a0\3\u00a1\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1"+
		"\u0a20\n\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u0a31\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0a38\n"+
		"\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a3f\n\u00a9\3"+
		"\u00aa\3\u00aa\5\u00aa\u0a43\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a61\n\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u0a68\n\u00ac\f\u00ac"+
		"\16\u00ac\u0a6b\13\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u0a71"+
		"\n\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4\3\u00d4"+
		"\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d9"+
		"\3\u00d9\3\u00da\3\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd"+
		"\3\u00de\3\u00de\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e2"+
		"\3\u00e2\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00eb"+
		"\3\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ef\3\u00ef"+
		"\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f4"+
		"\3\u00f4\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8"+
		"\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd"+
		"\3\u00fd\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0101\3\u0101"+
		"\3\u0102\3\u0102\3\u0103\3\u0103\3\u0104\3\u0104\3\u0105\3\u0105\3\u0106"+
		"\3\u0106\3\u0107\3\u0107\3\u0108\3\u0108\3\u0109\3\u0109\3\u010a\3\u010a"+
		"\3\u010b\3\u010b\3\u010c\3\u010c\3\u010d\3\u010d\3\u010e\3\u010e\3\u010f"+
		"\3\u010f\3\u0110\3\u0110\3\u0111\3\u0111\3\u0112\3\u0112\3\u0113\3\u0113"+
		"\3\u0114\3\u0114\3\u0115\3\u0115\3\u0116\3\u0116\3\u0117\3\u0117\3\u0118"+
		"\3\u0118\3\u0119\3\u0119\3\u011a\3\u011a\3\u011b\3\u011b\3\u011c\3\u011c"+
		"\3\u011d\3\u011d\3\u011e\3\u011e\3\u011f\3\u011f\3\u0120\3\u0120\3\u0121"+
		"\3\u0121\3\u0122\3\u0122\3\u0123\3\u0123\3\u0124\3\u0124\3\u0125\3\u0125"+
		"\3\u0126\3\u0126\3\u0127\3\u0127\3\u0128\3\u0128\3\u0129\3\u0129\3\u012a"+
		"\3\u012a\3\u012b\3\u012b\3\u012c\3\u012c\3\u012d\3\u012d\3\u012e\3\u012e"+
		"\3\u012f\3\u012f\3\u0130\3\u0130\3\u0131\3\u0131\3\u0132\3\u0132\3\u0133"+
		"\3\u0133\3\u0134\3\u0134\3\u0135\3\u0135\3\u0136\3\u0136\3\u0137\3\u0137"+
		"\3\u0138\3\u0138\3\u0139\3\u0139\3\u013a\3\u013a\3\u013b\3\u013b\3\u013c"+
		"\3\u013c\3\u013d\3\u013d\3\u013e\3\u013e\3\u013f\3\u013f\3\u0140\3\u0140"+
		"\3\u0141\3\u0141\3\u0142\3\u0142\3\u0143\3\u0143\3\u0144\3\u0144\3\u0145"+
		"\3\u0145\3\u0146\3\u0146\3\u0147\3\u0147\3\u0148\3\u0148\3\u0149\3\u0149"+
		"\3\u014a\3\u014a\3\u014b\3\u014b\3\u014c\3\u014c\3\u014d\3\u014d\3\u014e"+
		"\3\u014e\3\u014f\3\u014f\3\u0150\3\u0150\3\u0151\3\u0151\3\u0152\3\u0152"+
		"\3\u0153\3\u0153\3\u0154\3\u0154\3\u0155\3\u0155\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\3\u0156\3\u0156\3\u0156\5\u0156\u0c53\n\u0156\3\u0156\2\2\u0157"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc"+
		"\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4"+
		"\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c"+
		"\u020e\u0210\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224"+
		"\u0226\u0228\u022a\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a\u023c"+
		"\u023e\u0240\u0242\u0244\u0246\u0248\u024a\u024c\u024e\u0250\u0252\u0254"+
		"\u0256\u0258\u025a\u025c\u025e\u0260\u0262\u0264\u0266\u0268\u026a\u026c"+
		"\u026e\u0270\u0272\u0274\u0276\u0278\u027a\u027c\u027e\u0280\u0282\u0284"+
		"\u0286\u0288\u028a\u028c\u028e\u0290\u0292\u0294\u0296\u0298\u029a\u029c"+
		"\u029e\u02a0\u02a2\u02a4\u02a6\u02a8\u02aa\2\7\3\2\u00d3\u00d4\4\2\24"+
		"\24\26\26\3\2\u00db\u00df\3\2\u00d5\u00d6\4\2::\u0083\u0083\2\u0d20\2"+
		"\u02ad\3\2\2\2\4\u02bd\3\2\2\2\6\u02ca\3\2\2\2\b\u02cc\3\2\2\2\n\u02f4"+
		"\3\2\2\2\f\u02f6\3\2\2\2\16\u02fd\3\2\2\2\20\u0300\3\2\2\2\22\u030a\3"+
		"\2\2\2\24\u0316\3\2\2\2\26\u0329\3\2\2\2\30\u0357\3\2\2\2\32\u0359\3\2"+
		"\2\2\34\u0366\3\2\2\2\36\u036f\3\2\2\2 \u037e\3\2\2\2\"\u0389\3\2\2\2"+
		"$\u0397\3\2\2\2&\u03b6\3\2\2\2(\u03bd\3\2\2\2*\u03c6\3\2\2\2,\u03cb\3"+
		"\2\2\2.\u03cd\3\2\2\2\60\u03de\3\2\2\2\62\u03f9\3\2\2\2\64\u03fb\3\2\2"+
		"\2\66\u0408\3\2\2\28\u040e\3\2\2\2:\u042c\3\2\2\2<\u042e\3\2\2\2>\u043a"+
		"\3\2\2\2@\u043e\3\2\2\2B\u044b\3\2\2\2D\u0457\3\2\2\2F\u045a\3\2\2\2H"+
		"\u0462\3\2\2\2J\u0467\3\2\2\2L\u0469\3\2\2\2N\u0476\3\2\2\2P\u0478\3\2"+
		"\2\2R\u047b\3\2\2\2T\u0484\3\2\2\2V\u0488\3\2\2\2X\u048b\3\2\2\2Z\u0490"+
		"\3\2\2\2\\\u04a0\3\2\2\2^\u04a2\3\2\2\2`\u04a5\3\2\2\2b\u04aa\3\2\2\2"+
		"d\u04ae\3\2\2\2f\u04b1\3\2\2\2h\u04ba\3\2\2\2j\u04bd\3\2\2\2l\u04c8\3"+
		"\2\2\2n\u04ce\3\2\2\2p\u04e8\3\2\2\2r\u04ea\3\2\2\2t\u04f8\3\2\2\2v\u04ff"+
		"\3\2\2\2x\u050b\3\2\2\2z\u0518\3\2\2\2|\u0524\3\2\2\2~\u0530\3\2\2\2\u0080"+
		"\u053e\3\2\2\2\u0082\u0545\3\2\2\2\u0084\u0551\3\2\2\2\u0086\u0558\3\2"+
		"\2\2\u0088\u0564\3\2\2\2\u008a\u0575\3\2\2\2\u008c\u0579\3\2\2\2\u008e"+
		"\u0587\3\2\2\2\u0090\u058e\3\2\2\2\u0092\u05a0\3\2\2\2\u0094\u05a2\3\2"+
		"\2\2\u0096\u05a7\3\2\2\2\u0098\u05a9\3\2\2\2\u009a\u05b5\3\2\2\2\u009c"+
		"\u05b9\3\2\2\2\u009e\u05be\3\2\2\2\u00a0\u05c0\3\2\2\2\u00a2\u05ce\3\2"+
		"\2\2\u00a4\u05d3\3\2\2\2\u00a6\u05d6\3\2\2\2\u00a8\u05df\3\2\2\2\u00aa"+
		"\u05e1\3\2\2\2\u00ac\u05e3\3\2\2\2\u00ae\u05e9\3\2\2\2\u00b0\u05f1\3\2"+
		"\2\2\u00b2\u05fa\3\2\2\2\u00b4\u0603\3\2\2\2\u00b6\u0605\3\2\2\2\u00b8"+
		"\u0607\3\2\2\2\u00ba\u060a\3\2\2\2\u00bc\u0614\3\2\2\2\u00be\u0616\3\2"+
		"\2\2\u00c0\u0624\3\2\2\2\u00c2\u0633\3\2\2\2\u00c4\u0635\3\2\2\2\u00c6"+
		"\u0639\3\2\2\2\u00c8\u063c\3\2\2\2\u00ca\u067f\3\2\2\2\u00cc\u06db\3\2"+
		"\2\2\u00ce\u06dd\3\2\2\2\u00d0\u0706\3\2\2\2\u00d2\u0763\3\2\2\2\u00d4"+
		"\u0765\3\2\2\2\u00d6\u0785\3\2\2\2\u00d8\u0787\3\2\2\2\u00da\u0790\3\2"+
		"\2\2\u00dc\u07e5\3\2\2\2\u00de\u07e9\3\2\2\2\u00e0\u07f0\3\2\2\2\u00e2"+
		"\u07f2\3\2\2\2\u00e4\u07f7\3\2\2\2\u00e6\u07fc\3\2\2\2\u00e8\u0801\3\2"+
		"\2\2\u00ea\u0807\3\2\2\2\u00ec\u0816\3\2\2\2\u00ee\u0828\3\2\2\2\u00f0"+
		"\u082b\3\2\2\2\u00f2\u083e\3\2\2\2\u00f4\u0841\3\2\2\2\u00f6\u084a\3\2"+
		"\2\2\u00f8\u084e\3\2\2\2\u00fa\u0890\3\2\2\2\u00fc\u0892\3\2\2\2\u00fe"+
		"\u08a0\3\2\2\2\u0100\u08b1\3\2\2\2\u0102\u08bd\3\2\2\2\u0104\u08c9\3\2"+
		"\2\2\u0106\u08eb\3\2\2\2\u0108\u090f\3\2\2\2\u010a\u0911\3\2\2\2\u010c"+
		"\u0914\3\2\2\2\u010e\u0917\3\2\2\2\u0110\u091a\3\2\2\2\u0112\u091e\3\2"+
		"\2\2\u0114\u0929\3\2\2\2\u0116\u092b\3\2\2\2\u0118\u092f\3\2\2\2\u011a"+
		"\u0938\3\2\2\2\u011c\u0947\3\2\2\2\u011e\u0949\3\2\2\2\u0120\u095e\3\2"+
		"\2\2\u0122\u0961\3\2\2\2\u0124\u0964\3\2\2\2\u0126\u096c\3\2\2\2\u0128"+
		"\u096e\3\2\2\2\u012a\u0972\3\2\2\2\u012c\u0977\3\2\2\2\u012e\u097a\3\2"+
		"\2\2\u0130\u097e\3\2\2\2\u0132\u0998\3\2\2\2\u0134\u099a\3\2\2\2\u0136"+
		"\u09ec\3\2\2\2\u0138\u09ee\3\2\2\2\u013a\u09f2\3\2\2\2\u013c\u0a04\3\2"+
		"\2\2\u013e\u0a09\3\2\2\2\u0140\u0a1f\3\2\2\2\u0142\u0a21\3\2\2\2\u0144"+
		"\u0a23\3\2\2\2\u0146\u0a25\3\2\2\2\u0148\u0a27\3\2\2\2\u014a\u0a29\3\2"+
		"\2\2\u014c\u0a30\3\2\2\2\u014e\u0a37\3\2\2\2\u0150\u0a3e\3\2\2\2\u0152"+
		"\u0a40\3\2\2\2\u0154\u0a60\3\2\2\2\u0156\u0a62\3\2\2\2\u0158\u0a70\3\2"+
		"\2\2\u015a\u0a72\3\2\2\2\u015c\u0a74\3\2\2\2\u015e\u0a76\3\2\2\2\u0160"+
		"\u0a78\3\2\2\2\u0162\u0a7a\3\2\2\2\u0164\u0a7c\3\2\2\2\u0166\u0a7e\3\2"+
		"\2\2\u0168\u0a80\3\2\2\2\u016a\u0a82\3\2\2\2\u016c\u0a84\3\2\2\2\u016e"+
		"\u0a86\3\2\2\2\u0170\u0a88\3\2\2\2\u0172\u0a8b\3\2\2\2\u0174\u0a8d\3\2"+
		"\2\2\u0176\u0a8f\3\2\2\2\u0178\u0a91\3\2\2\2\u017a\u0a93\3\2\2\2\u017c"+
		"\u0a96\3\2\2\2\u017e\u0a98\3\2\2\2\u0180\u0a9a\3\2\2\2\u0182\u0a9c\3\2"+
		"\2\2\u0184\u0a9e\3\2\2\2\u0186\u0aa0\3\2\2\2\u0188\u0aa2\3\2\2\2\u018a"+
		"\u0aa4\3\2\2\2\u018c\u0aa6\3\2\2\2\u018e\u0aa8\3\2\2\2\u0190\u0aaa\3\2"+
		"\2\2\u0192\u0aac\3\2\2\2\u0194\u0aae\3\2\2\2\u0196\u0ab0\3\2\2\2\u0198"+
		"\u0ab2\3\2\2\2\u019a\u0ab4\3\2\2\2\u019c\u0ab6\3\2\2\2\u019e\u0ab8\3\2"+
		"\2\2\u01a0\u0aba\3\2\2\2\u01a2\u0abc\3\2\2\2\u01a4\u0abe\3\2\2\2\u01a6"+
		"\u0ac0\3\2\2\2\u01a8\u0ac2\3\2\2\2\u01aa\u0ac4\3\2\2\2\u01ac\u0ac6\3\2"+
		"\2\2\u01ae\u0ac8\3\2\2\2\u01b0\u0aca\3\2\2\2\u01b2\u0acc\3\2\2\2\u01b4"+
		"\u0ace\3\2\2\2\u01b6\u0ad0\3\2\2\2\u01b8\u0ad2\3\2\2\2\u01ba\u0ad4\3\2"+
		"\2\2\u01bc\u0ad6\3\2\2\2\u01be\u0ad8\3\2\2\2\u01c0\u0ada\3\2\2\2\u01c2"+
		"\u0adc\3\2\2\2\u01c4\u0ade\3\2\2\2\u01c6\u0ae0\3\2\2\2\u01c8\u0ae2\3\2"+
		"\2\2\u01ca\u0ae4\3\2\2\2\u01cc\u0ae6\3\2\2\2\u01ce\u0ae8\3\2\2\2\u01d0"+
		"\u0aea\3\2\2\2\u01d2\u0aec\3\2\2\2\u01d4\u0aee\3\2\2\2\u01d6\u0af0\3\2"+
		"\2\2\u01d8\u0af2\3\2\2\2\u01da\u0af4\3\2\2\2\u01dc\u0af6\3\2\2\2\u01de"+
		"\u0af8\3\2\2\2\u01e0\u0afa\3\2\2\2\u01e2\u0afc\3\2\2\2\u01e4\u0afe\3\2"+
		"\2\2\u01e6\u0b00\3\2\2\2\u01e8\u0b02\3\2\2\2\u01ea\u0b04\3\2\2\2\u01ec"+
		"\u0b06\3\2\2\2\u01ee\u0b08\3\2\2\2\u01f0\u0b0a\3\2\2\2\u01f2\u0b0c\3\2"+
		"\2\2\u01f4\u0b0e\3\2\2\2\u01f6\u0b10\3\2\2\2\u01f8\u0b12\3\2\2\2\u01fa"+
		"\u0b14\3\2\2\2\u01fc\u0b16\3\2\2\2\u01fe\u0b18\3\2\2\2\u0200\u0b1a\3\2"+
		"\2\2\u0202\u0b1c\3\2\2\2\u0204\u0b1e\3\2\2\2\u0206\u0b20\3\2\2\2\u0208"+
		"\u0b22\3\2\2\2\u020a\u0b24\3\2\2\2\u020c\u0b26\3\2\2\2\u020e\u0b28\3\2"+
		"\2\2\u0210\u0b2a\3\2\2\2\u0212\u0b2c\3\2\2\2\u0214\u0b2e\3\2\2\2\u0216"+
		"\u0b30\3\2\2\2\u0218\u0b32\3\2\2\2\u021a\u0b34\3\2\2\2\u021c\u0b36\3\2"+
		"\2\2\u021e\u0b38\3\2\2\2\u0220\u0b3a\3\2\2\2\u0222\u0b3c\3\2\2\2\u0224"+
		"\u0b3e\3\2\2\2\u0226\u0b40\3\2\2\2\u0228\u0b42\3\2\2\2\u022a\u0b44\3\2"+
		"\2\2\u022c\u0b46\3\2\2\2\u022e\u0b48\3\2\2\2\u0230\u0b4a\3\2\2\2\u0232"+
		"\u0b4c\3\2\2\2\u0234\u0b4e\3\2\2\2\u0236\u0b50\3\2\2\2\u0238\u0b52\3\2"+
		"\2\2\u023a\u0b54\3\2\2\2\u023c\u0b56\3\2\2\2\u023e\u0b58\3\2\2\2\u0240"+
		"\u0b5a\3\2\2\2\u0242\u0b5c\3\2\2\2\u0244\u0b5e\3\2\2\2\u0246\u0b60\3\2"+
		"\2\2\u0248\u0b62\3\2\2\2\u024a\u0b64\3\2\2\2\u024c\u0b66\3\2\2\2\u024e"+
		"\u0b68\3\2\2\2\u0250\u0b6a\3\2\2\2\u0252\u0b6c\3\2\2\2\u0254\u0b6e\3\2"+
		"\2\2\u0256\u0b70\3\2\2\2\u0258\u0b72\3\2\2\2\u025a\u0b74\3\2\2\2\u025c"+
		"\u0b76\3\2\2\2\u025e\u0b78\3\2\2\2\u0260\u0b7a\3\2\2\2\u0262\u0b7c\3\2"+
		"\2\2\u0264\u0b7e\3\2\2\2\u0266\u0b80\3\2\2\2\u0268\u0b82\3\2\2\2\u026a"+
		"\u0b84\3\2\2\2\u026c\u0b86\3\2\2\2\u026e\u0b88\3\2\2\2\u0270\u0b8a\3\2"+
		"\2\2\u0272\u0b8c\3\2\2\2\u0274\u0b8e\3\2\2\2\u0276\u0b90\3\2\2\2\u0278"+
		"\u0b92\3\2\2\2\u027a\u0b94\3\2\2\2\u027c\u0b96\3\2\2\2\u027e\u0b98\3\2"+
		"\2\2\u0280\u0b9a\3\2\2\2\u0282\u0b9c\3\2\2\2\u0284\u0b9e\3\2\2\2\u0286"+
		"\u0ba0\3\2\2\2\u0288\u0ba2\3\2\2\2\u028a\u0ba4\3\2\2\2\u028c\u0ba6\3\2"+
		"\2\2\u028e\u0ba8\3\2\2\2\u0290\u0baa\3\2\2\2\u0292\u0bac\3\2\2\2\u0294"+
		"\u0bae\3\2\2\2\u0296\u0bb0\3\2\2\2\u0298\u0bb2\3\2\2\2\u029a\u0bb4\3\2"+
		"\2\2\u029c\u0bb6\3\2\2\2\u029e\u0bb8\3\2\2\2\u02a0\u0bba\3\2\2\2\u02a2"+
		"\u0bbc\3\2\2\2\u02a4\u0bbe\3\2\2\2\u02a6\u0bc0\3\2\2\2\u02a8\u0bc2\3\2"+
		"\2\2\u02aa\u0c52\3\2\2\2\u02ac\u02ae\5\4\3\2\u02ad\u02ac\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02b1\7\25\2\2\u02b0\u02af\3"+
		"\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\5\u0294\u014b"+
		"\2\u02b3\3\3\2\2\2\u02b4\u02b6\5\n\6\2\u02b5\u02b7\7\25\2\2\u02b6\u02b5"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\5\6\4\2\u02b9"+
		"\u02bc\3\2\2\2\u02ba\u02bc\5\b\5\2\u02bb\u02b4\3\2\2\2\u02bb\u02ba\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c8\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c5\5\n\6\2\u02c1\u02c3\7\25"+
		"\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c6\5\6\4\2\u02c5\u02c2\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c9\3\2"+
		"\2\2\u02c7\u02c9\5\b\5\2\u02c8\u02c0\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9"+
		"\5\3\2\2\2\u02ca\u02cb\7\n\2\2\u02cb\7\3\2\2\2\u02cc\u02cd\5\6\4\2\u02cd"+
		"\t\3\2\2\2\u02ce\u02f5\5\u00be`\2\u02cf\u02f5\5r:\2\u02d0\u02f5\5l\67"+
		"\2\u02d1\u02f5\5Z.\2\u02d2\u02f5\5L\'\2\u02d3\u02f5\5F$\2\u02d4\u02f5"+
		"\5\u00b8]\2\u02d5\u02f5\58\35\2\u02d6\u02f5\5\60\31\2\u02d7\u02f5\5\u00ca"+
		"f\2\u02d8\u02f5\5\u00ceh\2\u02d9\u02f5\5.\30\2\u02da\u02f5\5$\23\2\u02db"+
		"\u02f5\5\34\17\2\u02dc\u02f5\5\u0088E\2\u02dd\u02f5\5\"\22\2\u02de\u02f5"+
		"\5\36\20\2\u02df\u02f5\5\32\16\2\u02e0\u02f5\5\u00eav\2\u02e1\u02f5\5"+
		"z>\2\u02e2\u02f5\5|?\2\u02e3\u02f5\5\u0086D\2\u02e4\u02f5\5\u0084C\2\u02e5"+
		"\u02f5\5x=\2\u02e6\u02f5\5\u0080A\2\u02e7\u02f5\5\u0082B\2\u02e8\u02f5"+
		"\5~@\2\u02e9\u02f5\5v<\2\u02ea\u02f5\5t;\2\u02eb\u02f5\5\24\13\2\u02ec"+
		"\u02f5\5\u0106\u0084\2\u02ed\u02f5\5\22\n\2\u02ee\u02f5\5\20\t\2\u02ef"+
		"\u02f5\5\f\7\2\u02f0\u02f5\5\u011e\u0090\2\u02f1\u02f5\5\u00c8e\2\u02f2"+
		"\u02f5\5\u00f0y\2\u02f3\u02f5\5\u00c6d\2\u02f4\u02ce\3\2\2\2\u02f4\u02cf"+
		"\3\2\2\2\u02f4\u02d0\3\2\2\2\u02f4\u02d1\3\2\2\2\u02f4\u02d2\3\2\2\2\u02f4"+
		"\u02d3\3\2\2\2\u02f4\u02d4\3\2\2\2\u02f4\u02d5\3\2\2\2\u02f4\u02d6\3\2"+
		"\2\2\u02f4\u02d7\3\2\2\2\u02f4\u02d8\3\2\2\2\u02f4\u02d9\3\2\2\2\u02f4"+
		"\u02da\3\2\2\2\u02f4\u02db\3\2\2\2\u02f4\u02dc\3\2\2\2\u02f4\u02dd\3\2"+
		"\2\2\u02f4\u02de\3\2\2\2\u02f4\u02df\3\2\2\2\u02f4\u02e0\3\2\2\2\u02f4"+
		"\u02e1\3\2\2\2\u02f4\u02e2\3\2\2\2\u02f4\u02e3\3\2\2\2\u02f4\u02e4\3\2"+
		"\2\2\u02f4\u02e5\3\2\2\2\u02f4\u02e6\3\2\2\2\u02f4\u02e7\3\2\2\2\u02f4"+
		"\u02e8\3\2\2\2\u02f4\u02e9\3\2\2\2\u02f4\u02ea\3\2\2\2\u02f4\u02eb\3\2"+
		"\2\2\u02f4\u02ec\3\2\2\2\u02f4\u02ed\3\2\2\2\u02f4\u02ee\3\2\2\2\u02f4"+
		"\u02ef\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f4\u02f2\3\2"+
		"\2\2\u02f4\u02f3\3\2\2\2\u02f5\13\3\2\2\2\u02f6\u02f7\5\u0292\u014a\2"+
		"\u02f7\u02f8\5\26\f\2\u02f8\u02f9\5\u0246\u0124\2\u02f9\u02fa\5\30\r\2"+
		"\u02fa\u02fb\5\u01b0\u00d9\2\u02fb\u02fc\5\u015a\u00ae\2\u02fc\r\3\2\2"+
		"\2\u02fd\u02fe\5\u0232\u011a\2\u02fe\u02ff\5\u0286\u0144\2\u02ff\17\3"+
		"\2\2\2\u0300\u0301\5\u0232\u011a\2\u0301\u0305\5\u0262\u0132\2\u0302\u0303"+
		"\5\u0244\u0123\2\u0303\u0304\5\u015a\u00ae\2\u0304\u0306\3\2\2\2\u0305"+
		"\u0302\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309\5\u023e"+
		"\u0120\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\21\3\2\2\2\u030a"+
		"\u030b\5\u0232\u011a\2\u030b\u030f\5\26\f\2\u030c\u030d\5\u0246\u0124"+
		"\2\u030d\u030e\5\30\r\2\u030e\u0310\3\2\2\2\u030f\u030c\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0314\3\2\2\2\u0311\u0312\5\u0244\u0123\2\u0312\u0313"+
		"\5\u015a\u00ae\2\u0313\u0315\3\2\2\2\u0314\u0311\3\2\2\2\u0314\u0315\3"+
		"\2\2\2\u0315\23\3\2\2\2\u0316\u0317\5\u01b8\u00dd\2\u0317\u0318\5\26\f"+
		"\2\u0318\u0319\5\u0246\u0124\2\u0319\u031a\5\30\r\2\u031a\u031b\5\u0274"+
		"\u013b\2\u031b\u031c\5\u015a\u00ae\2\u031c\25\3\2\2\2\u031d\u0320\5\u0178"+
		"\u00bd\2\u031e\u0320\5\u017a\u00be\2\u031f\u031d\3\2\2\2\u031f\u031e\3"+
		"\2\2\2\u0320\u032a\3\2\2\2\u0321\u032a\5\u017e\u00c0\2\u0322\u032a\5\u0188"+
		"\u00c5\2\u0323\u032a\5\u019e\u00d0\2\u0324\u032a\5\u01a8\u00d5\2\u0325"+
		"\u032a\5\u0198\u00cd\2\u0326\u032a\5\u01a2\u00d2\2\u0327\u032a\5\u023a"+
		"\u011e\2\u0328\u032a\5\u0264\u0133\2\u0329\u031f\3\2\2\2\u0329\u0321\3"+
		"\2\2\2\u0329\u0322\3\2\2\2\u0329\u0323\3\2\2\2\u0329\u0324\3\2\2\2\u0329"+
		"\u0325\3\2\2\2\u0329\u0326\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u0328\3\2"+
		"\2\2\u032a\27\3\2\2\2\u032b\u032c\5\u0178\u00bd\2\u032c\u032d\5\u01b6"+
		"\u00dc\2\u032d\u0358\3\2\2\2\u032e\u032f\5\u0178\u00bd\2\u032f\u0330\5"+
		"\u01b6\u00dc\2\u0330\u0331\5\u01bc\u00df\2\u0331\u0332\5\u022a\u0116\2"+
		"\u0332\u0333\5\u014c\u00a7\2\u0333\u0358\3\2\2\2\u0334\u0338\5\u01b4\u00db"+
		"\2\u0335\u0336\5\u014c\u00a7\2\u0336\u0337\7\20\2\2\u0337\u0339\3\2\2"+
		"\2\u0338\u0335\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b"+
		"\5\u0166\u00b4\2\u033b\u0358\3\2\2\2\u033c\u033d\5\u0178\u00bd\2\u033d"+
		"\u033e\5\u022c\u0117\2\u033e\u0358\3\2\2\2\u033f\u0340\5\u022a\u0116\2"+
		"\u0340\u0341\5\u014c\u00a7\2\u0341\u0358\3\2\2\2\u0342\u0344\5\u0270\u0139"+
		"\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0348\3\2\2\2\u0345\u0346"+
		"\5\u014c\u00a7\2\u0346\u0347\7\20\2\2\u0347\u0349\3\2\2\2\u0348\u0345"+
		"\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0358\5\u014e\u00a8"+
		"\2\u034b\u034c\5\u0178\u00bd\2\u034c\u034d\5\u0262\u0132\2\u034d\u0358"+
		"\3\2\2\2\u034e\u034f\5\u025a\u012e\2\u034f\u0350\5\u015a\u00ae\2\u0350"+
		"\u0358\3\2\2\2\u0351\u0354\5\u025c\u012f\2\u0352\u0354\5\u025e\u0130\2"+
		"\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356"+
		"\5\u0260\u0131\2\u0356\u0358\3\2\2\2\u0357\u032b\3\2\2\2\u0357\u032e\3"+
		"\2\2\2\u0357\u0334\3\2\2\2\u0357\u033c\3\2\2\2\u0357\u033f\3\2\2\2\u0357"+
		"\u0343\3\2\2\2\u0357\u034b\3\2\2\2\u0357\u034e\3\2\2\2\u0357\u0353\3\2"+
		"\2\2\u0358\31\3\2\2\2\u0359\u035a\5\u0198\u00cd\2\u035a\u035c\5\u0284"+
		"\u0143\2\u035b\u035d\5\u0110\u0089\2\u035c\u035b\3\2\2\2\u035c\u035d\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\5\u016a\u00b6\2\u035f\u0360\5\u0290"+
		"\u0149\2\u0360\u0361\5\u024e\u0128\2\u0361\u0364\5\u0146\u00a4\2\u0362"+
		"\u0365\5\u026e\u0138\2\u0363\u0365\5\u023c\u011f\2\u0364\u0362\3\2\2\2"+
		"\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\33\3\2\2\2\u0366\u0367"+
		"\5\u0198\u00cd\2\u0367\u0369\5\u025a\u012e\2\u0368\u036a\5\u0110\u0089"+
		"\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d"+
		"\5\u015a\u00ae\2\u036c\u036e\5n8\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2"+
		"\2\2\u036e\35\3\2\2\2\u036f\u0370\5\u0198\u00cd\2\u0370\u0372\5\u027c"+
		"\u013f\2\u0371\u0373\5\u0110\u0089\2\u0372\u0371\3\2\2\2\u0372\u0373\3"+
		"\2\2\2\u0373\u0377\3\2\2\2\u0374\u0375\5\u014c\u00a7\2\u0375\u0376\7\20"+
		"\2\2\u0376\u0378\3\2\2\2\u0377\u0374\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037a\5\u0162\u00b2\2\u037a\u037b\5\u0296\u014c\2"+
		"\u037b\u037c\5 \21\2\u037c\u037d\5\u0298\u014d\2\u037d\37\3\2\2\2\u037e"+
		"\u037f\5\u0150\u00a9\2\u037f\u0386\5\u0152\u00aa\2\u0380\u0381\5\u02a6"+
		"\u0154\2\u0381\u0382\5\u0150\u00a9\2\u0382\u0383\5\u0152\u00aa\2\u0383"+
		"\u0385\3\2\2\2\u0384\u0380\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2"+
		"\2\2\u0386\u0387\3\2\2\2\u0387!\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a"+
		"\5\u0198\u00cd\2\u038a\u038c\5\u0276\u013c\2\u038b\u038d\5\u0110\u0089"+
		"\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0391\3\2\2\2\u038e\u038f"+
		"\5\u014c\u00a7\2\u038f\u0390\7\20\2\2\u0390\u0392\3\2\2\2\u0391\u038e"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\5\u015c\u00af"+
		"\2\u0394\u0395\5\u0288\u0145\2\u0395\u0396\5\u015e\u00b0\2\u0396#\3\2"+
		"\2\2\u0397\u0398\5\u0198\u00cd\2\u0398\u0399\5\u0238\u011d\2\u0399\u039b"+
		"\5\u028c\u0147\2\u039a\u039c\5\u0110\u0089\2\u039b\u039a\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u03a0\3\2\2\2\u039d\u039e\5\u014c\u00a7\2\u039e\u039f"+
		"\7\20\2\2\u039f\u03a1\3\2\2\2\u03a0\u039d\3\2\2\2\u03a0\u03a1\3\2\2\2"+
		"\u03a1\u03a2\3\2\2\2\u03a2\u03a3\5\u0160\u00b1\2\u03a3\u03a4\5\u0184\u00c3"+
		"\2\u03a4\u03a5\5\u0264\u0133\2\u03a5\u03a6\5\u0118\u008d\2\u03a6\u03aa"+
		"\5\u01b0\u00d9\2\u03a7\u03a8\5\u014c\u00a7\2\u03a8\u03a9\7\20\2\2\u03a9"+
		"\u03ab\3\2\2\2\u03aa\u03a7\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03ad\5\u014e\u00a8\2\u03ad\u03af\5&\24\2\u03ae\u03b0\5\u00a6"+
		"T\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b4\3\2\2\2\u03b1"+
		"\u03b2\5\u0290\u0149\2\u03b2\u03b3\5,\27\2\u03b3\u03b5\3\2\2\2\u03b4\u03b1"+
		"\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5%\3\2\2\2\u03b6\u03b7\5\u028e\u0148"+
		"\2\u03b7\u03bb\5(\25\2\u03b8\u03b9\5\u0180\u00c1\2\u03b9\u03ba\5\u0134"+
		"\u009b\2\u03ba\u03bc\3\2\2\2\u03bb\u03b8\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\'\3\2\2\2\u03bd\u03c3\5*\26\2\u03be\u03bf\5\u0180\u00c1\2\u03bf\u03c0"+
		"\5*\26\2\u03c0\u03c2\3\2\2\2\u03c1\u03be\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4)\3\2\2\2\u03c5\u03c3\3\2\2\2"+
		"\u03c6\u03c7\5\u0150\u00a9\2\u03c7\u03c8\5\u0222\u0112\2\u03c8\u03c9\5"+
		"\u0240\u0121\2\u03c9\u03ca\5\u0242\u0122\2\u03ca+\3\2\2\2\u03cb\u03cc"+
		"\5\u0090I\2\u03cc-\3\2\2\2\u03cd\u03ce\5\u0198\u00cd\2\u03ce\u03d0\5\u022a"+
		"\u0116\2\u03cf\u03d1\5\u0110\u0089\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3"+
		"\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\5\u014c\u00a7\2\u03d3\u03d4\5\u0290"+
		"\u0149\2\u03d4\u03d5\5\u0256\u012c\2\u03d5\u03d6\7\u00db\2\2\u03d6\u03d7"+
		"\5\u029a\u014e\2\u03d7\u03d8\5\u00c0a\2\u03d8\u03dc\5\u029c\u014f\2\u03d9"+
		"\u03da\5\u0180\u00c1\2\u03da\u03db\5\u00c4c\2\u03db\u03dd\3\2\2\2\u03dc"+
		"\u03d9\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd/\3\2\2\2\u03de\u03e0\5\u0198"+
		"\u00cd\2\u03df\u03e1\5D#\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2\u03e4\5\u01b4\u00db\2\u03e3\u03e5\5\u0110\u0089\2"+
		"\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e9\3\2\2\2\u03e6\u03e7"+
		"\5\u014c\u00a7\2\u03e7\u03e8\7\20\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e6"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\5\u0166\u00b4"+
		"\2\u03ec\u03ee\5\u0296\u014c\2\u03ed\u03ef\5\64\33\2\u03ee\u03ed\3\2\2"+
		"\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\5\u0298\u014d\2"+
		"\u03f1\u03f2\5\66\34\2\u03f2\u03f3\5\u0258\u012d\2\u03f3\u03f4\5\u0152"+
		"\u00aa\2\u03f4\u03f5\5\u022e\u0118\2\u03f5\u03f6\5\u0168\u00b5\2\u03f6"+
		"\u03f7\5\u0184\u00c3\2\u03f7\u03f8\5\62\32\2\u03f8\61\3\2\2\2\u03f9\u03fa"+
		"\t\2\2\2\u03fa\63\3\2\2\2\u03fb\u0401\5\u0170\u00b9\2\u03fc\u03fd\5\u02a6"+
		"\u0154\2\u03fd\u03fe\5\u0170\u00b9\2\u03fe\u0400\3\2\2\2\u03ff\u03fc\3"+
		"\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\65\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0409\5\u0190\u00c9\2\u0405\u0406"+
		"\5\u0258\u012d\2\u0406\u0407\5\u0242\u0122\2\u0407\u0409\3\2\2\2\u0408"+
		"\u0404\3\2\2\2\u0408\u0405\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\5\u0246"+
		"\u0124\2\u040b\u040c\5\u0242\u0122\2\u040c\u040d\5\u021c\u010f\2\u040d"+
		"\67\3\2\2\2\u040e\u0410\5\u0198\u00cd\2\u040f\u0411\5D#\2\u0410\u040f"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\5\u0176\u00bc"+
		"\2\u0413\u0415\5\u0110\u0089\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2"+
		"\u0415\u0419\3\2\2\2\u0416\u0417\5\u014c\u00a7\2\u0417\u0418\7\20\2\2"+
		"\u0418\u041a\3\2\2\2\u0419\u0416\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u041c\5\u0164\u00b3\2\u041c\u041d\5\u0296\u014c\2\u041d"+
		"\u041e\5\u0152\u00aa\2\u041e\u041f\5\u0298\u014d\2\u041f\u0420\5\u0268"+
		"\u0135\2\u0420\u0421\5\u0166\u00b4\2\u0421\u0422\5\u026c\u0137\2\u0422"+
		"\u0423\5\u0152\u00aa\2\u0423\u0424\5\u01ae\u00d8\2\u0424\u0425\5\u0166"+
		"\u00b4\2\u0425\u0426\5\u021a\u010e\2\u0426\u0427\5:\36\2\u04279\3\2\2"+
		"\2\u0428\u042d\5\u0140\u00a1\2\u0429\u042d\5B\"\2\u042a\u042d\5@!\2\u042b"+
		"\u042d\5<\37\2\u042c\u0428\3\2\2\2\u042c\u0429\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042c\u042b\3\2\2\2\u042d;\3\2\2\2\u042e\u042f\5\u029a\u014e\2\u042f"+
		"\u0435\5> \2\u0430\u0431\5\u02a6\u0154\2\u0431\u0432\5> \2\u0432\u0434"+
		"\3\2\2\2\u0433\u0430\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u0439\5\u029c"+
		"\u014f\2\u0439=\3\2\2\2\u043a\u043b\5\u016e\u00b8\2\u043b\u043c\7\13\2"+
		"\2\u043c\u043d\5:\36\2\u043d?\3\2\2\2\u043e\u043f\5\u0296\u014c\2\u043f"+
		"\u0446\5B\"\2\u0440\u0441\5\u02a6\u0154\2\u0441\u0442\5\u0140\u00a1\2"+
		"\u0442\u0445\3\2\2\2\u0443\u0445\5B\"\2\u0444\u0440\3\2\2\2\u0444\u0443"+
		"\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u0449\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u044a\5\u0298\u014d\2\u044aA"+
		"\3\2\2\2\u044b\u044c\5\u0296\u014c\2\u044c\u0452\5\u0140\u00a1\2\u044d"+
		"\u044e\5\u02a6\u0154\2\u044e\u044f\5\u0140\u00a1\2\u044f\u0451\3\2\2\2"+
		"\u0450\u044d\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453"+
		"\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0456\5\u0298\u014d"+
		"\2\u0456C\3\2\2\2\u0457\u0458\5\u024a\u0126\2\u0458\u0459\5\u0254\u012b"+
		"\2\u0459E\3\2\2\2\u045a\u045b\5\u017e\u00c0\2\u045b\u045c\5\u0284\u0143"+
		"\2\u045c\u045d\5\u016a\u00b6\2\u045d\u045e\5\u0290\u0149\2\u045e\u0460"+
		"\5H%\2\u045f\u0461\5J&\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"G\3\2\2\2\u0462\u0463\5\u024e\u0128\2\u0463\u0464\5\u0146\u00a4\2\u0464"+
		"I\3\2\2\2\u0465\u0468\5\u026e\u0138\2\u0466\u0468\5\u023c\u011f\2\u0467"+
		"\u0465\3\2\2\2\u0467\u0466\3\2\2\2\u0468K\3\2\2\2\u0469\u046a\5\u017e"+
		"\u00c0\2\u046a\u046e\5\u027c\u013f\2\u046b\u046c\5\u014c\u00a7\2\u046c"+
		"\u046d\7\20\2\2\u046d\u046f\3\2\2\2\u046e\u046b\3\2\2\2\u046e\u046f\3"+
		"\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\5\u0162\u00b2\2\u0471\u0472\5N"+
		"(\2\u0472M\3\2\2\2\u0473\u0477\5X-\2\u0474\u0477\5V,\2\u0475\u0477\5P"+
		")\2\u0476\u0473\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0475\3\2\2\2\u0477"+
		"O\3\2\2\2\u0478\u0479\5\u0252\u012a\2\u0479\u047a\5R*\2\u047aQ\3\2\2\2"+
		"\u047b\u0481\5T+\2\u047c\u047d\5\u0180\u00c1\2\u047d\u047e\5T+\2\u047e"+
		"\u0480\3\2\2\2\u047f\u047c\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2"+
		"\2\2\u0481\u0482\3\2\2\2\u0482S\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u0485"+
		"\5\u0150\u00a9\2\u0485\u0486\5\u0274\u013b\2\u0486\u0487\5\u0150\u00a9"+
		"\2\u0487U\3\2\2\2\u0488\u0489\5\u0174\u00bb\2\u0489\u048a\5 \21\2\u048a"+
		"W\3\2\2\2\u048b\u048c\5\u017e\u00c0\2\u048c\u048d\5\u0150\u00a9\2\u048d"+
		"\u048e\5\u027c\u013f\2\u048e\u048f\5\u0152\u00aa\2\u048fY\3\2\2\2\u0490"+
		"\u0491\5\u017e\u00c0\2\u0491\u0495\5\u0270\u0139\2\u0492\u0493\5\u014c"+
		"\u00a7\2\u0493\u0494\7\20\2\2\u0494\u0496\3\2\2\2\u0495\u0492\3\2\2\2"+
		"\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\5\u014e\u00a8\2\u0498"+
		"\u0499\5\\/\2\u0499[\3\2\2\2\u049a\u04a1\5h\65\2\u049b\u04a1\5d\63\2\u049c"+
		"\u04a1\5d\63\2\u049d\u04a1\5b\62\2\u049e\u04a1\5`\61\2\u049f\u04a1\5^"+
		"\60\2\u04a0\u049a\3\2\2\2\u04a0\u049b\3\2\2\2\u04a0\u049c\3\2\2\2\u04a0"+
		"\u049d\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1]\3\2\2\2"+
		"\u04a2\u04a3\5\u0290\u0149\2\u04a3\u04a4\5\u0090I\2\u04a4_\3\2\2\2\u04a5"+
		"\u04a6\5\u0252\u012a\2\u04a6\u04a7\5\u0150\u00a9\2\u04a7\u04a8\5\u0274"+
		"\u013b\2\u04a8\u04a9\5\u0150\u00a9\2\u04a9a\3\2\2\2\u04aa\u04ab\5\u01a2"+
		"\u00d2\2\u04ab\u04ac\5\u0194\u00cb\2\u04ac\u04ad\5\u026a\u0136\2\u04ad"+
		"c\3\2\2\2\u04ae\u04af\5\u01a2\u00d2\2\u04af\u04b0\5f\64\2\u04b0e\3\2\2"+
		"\2\u04b1\u04b7\5\u0150\u00a9\2\u04b2\u04b3\5\u02a6\u0154\2\u04b3\u04b4"+
		"\5\u0150\u00a9\2\u04b4\u04b6\3\2\2\2\u04b5\u04b2\3\2\2\2\u04b6\u04b9\3"+
		"\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8g\3\2\2\2\u04b9\u04b7"+
		"\3\2\2\2\u04ba\u04bb\5\u0174\u00bb\2\u04bb\u04bc\5j\66\2\u04bci\3\2\2"+
		"\2\u04bd\u04be\5\u0150\u00a9\2\u04be\u04c5\5\u0152\u00aa\2\u04bf\u04c0"+
		"\5\u02a6\u0154\2\u04c0\u04c1\5\u0150\u00a9\2\u04c1\u04c2\5\u0152\u00aa"+
		"\2\u04c2\u04c4\3\2\2\2\u04c3\u04bf\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3"+
		"\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6k\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8"+
		"\u04c9\5\u017e\u00c0\2\u04c9\u04ca\5\u025a\u012e\2\u04ca\u04cc\5\u015a"+
		"\u00ae\2\u04cb\u04cd\5n8\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"m\3\2\2\2\u04ce\u04cf\5\u0290\u0149\2\u04cf\u04d5\5p9\2\u04d0\u04d1\5"+
		"\u0180\u00c1\2\u04d1\u04d2\5p9\2\u04d2\u04d4\3\2\2\2\u04d3\u04d0\3\2\2"+
		"\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6o"+
		"\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04d9\5\u024e\u0128\2\u04d9\u04da\7"+
		"\u00db\2\2\u04da\u04db\5\u0146\u00a4\2\u04db\u04e9\3\2\2\2\u04dc\u04dd"+
		"\5\u0236\u011c\2\u04dd\u04de\7\u00db\2\2\u04de\u04df\5\u0148\u00a5\2\u04df"+
		"\u04e9\3\2\2\2\u04e0\u04e1\5\u026e\u0138\2\u04e1\u04e2\7\u00db\2\2\u04e2"+
		"\u04e3\5\u0148\u00a5\2\u04e3\u04e9\3\2\2\2\u04e4\u04e5\5\u0248\u0125\2"+
		"\u04e5\u04e6\7\u00db\2\2\u04e6\u04e7\5\u0098M\2\u04e7\u04e9\3\2\2\2\u04e8"+
		"\u04d8\3\2\2\2\u04e8\u04dc\3\2\2\2\u04e8\u04e0\3\2\2\2\u04e8\u04e4\3\2"+
		"\2\2\u04e9q\3\2\2\2\u04ea\u04eb\5\u017e\u00c0\2\u04eb\u04ec\5\u0238\u011d"+
		"\2\u04ec\u04f0\5\u028c\u0147\2\u04ed\u04ee\5\u014c\u00a7\2\u04ee\u04ef"+
		"\7\20\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ed\3\2\2\2\u04f0\u04f1\3\2\2\2"+
		"\u04f1\u04f2\3\2\2\2\u04f2\u04f6\5\u0160\u00b1\2\u04f3\u04f4\5\u0290\u0149"+
		"\2\u04f4\u04f5\5\u0090I\2\u04f5\u04f7\3\2\2\2\u04f6\u04f3\3\2\2\2\u04f6"+
		"\u04f7\3\2\2\2\u04f7s\3\2\2\2\u04f8\u04f9\5\u01a2\u00d2\2\u04f9\u04fb"+
		"\5\u0284\u0143\2\u04fa\u04fc\5\u0112\u008a\2\u04fb\u04fa\3\2\2\2\u04fb"+
		"\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\5\u016a\u00b6\2\u04feu"+
		"\3\2\2\2\u04ff\u0500\5\u01a2\u00d2\2\u0500\u0502\5\u027c\u013f\2\u0501"+
		"\u0503\5\u0112\u008a\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0507"+
		"\3\2\2\2\u0504\u0505\5\u014c\u00a7\2\u0505\u0506\7\20\2\2\u0506\u0508"+
		"\3\2\2\2\u0507\u0504\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050a\5\u0162\u00b2\2\u050aw\3\2\2\2\u050b\u050c\5\u01a2\u00d2\2\u050c"+
		"\u050d\5\u0238\u011d\2\u050d\u050f\5\u028c\u0147\2\u050e\u0510\5\u0112"+
		"\u008a\2\u050f\u050e\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0514\3\2\2\2\u0511"+
		"\u0512\5\u014c\u00a7\2\u0512\u0513\7\20\2\2\u0513\u0515\3\2\2\2\u0514"+
		"\u0511\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\5\u0160"+
		"\u00b1\2\u0517y\3\2\2\2\u0518\u0519\5\u01a2\u00d2\2\u0519\u051b\5\u0176"+
		"\u00bc\2\u051a\u051c\5\u0112\u008a\2\u051b\u051a\3\2\2\2\u051b\u051c\3"+
		"\2\2\2\u051c\u0520\3\2\2\2\u051d\u051e\5\u014c\u00a7\2\u051e\u051f\7\20"+
		"\2\2\u051f\u0521\3\2\2\2\u0520\u051d\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u0523\5\u0164\u00b3\2\u0523{\3\2\2\2\u0524\u0525"+
		"\5\u01a2\u00d2\2\u0525\u0527\5\u01b4\u00db\2\u0526\u0528\5\u0112\u008a"+
		"\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052c\3\2\2\2\u0529\u052a"+
		"\5\u014c\u00a7\2\u052a\u052b\7\20\2\2\u052b\u052d\3\2\2\2\u052c\u0529"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\5\u0166\u00b4"+
		"\2\u052f}\3\2\2\2\u0530\u0531\5\u01a2\u00d2\2\u0531\u0533\5\u0276\u013c"+
		"\2\u0532\u0534\5\u0112\u008a\2\u0533\u0532\3\2\2\2\u0533\u0534\3\2\2\2"+
		"\u0534\u0535\3\2\2\2\u0535\u0536\5\u015c\u00af\2\u0536\u053a\5\u0246\u0124"+
		"\2\u0537\u0538\5\u014c\u00a7\2\u0538\u0539\7\20\2\2\u0539\u053b\3\2\2"+
		"\2\u053a\u0537\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d"+
		"\5\u014e\u00a8\2\u053d\177\3\2\2\2\u053e\u053f\5\u01a2\u00d2\2\u053f\u0541"+
		"\5\u025a\u012e\2\u0540\u0542\5\u0112\u008a\2\u0541\u0540\3\2\2\2\u0541"+
		"\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\5\u015a\u00ae\2\u0544\u0081"+
		"\3\2\2\2\u0545\u0546\5\u01a2\u00d2\2\u0546\u0548\5\u0270\u0139\2\u0547"+
		"\u0549\5\u0112\u008a\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054d"+
		"\3\2\2\2\u054a\u054b\5\u014c\u00a7\2\u054b\u054c\7\20\2\2\u054c\u054e"+
		"\3\2\2\2\u054d\u054a\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0550\5\u014e\u00a8\2\u0550\u0083\3\2\2\2\u0551\u0552\5\u01a2\u00d2\2"+
		"\u0552\u0554\5\u022a\u0116\2\u0553\u0555\5\u0112\u008a\2\u0554\u0553\3"+
		"\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\5\u014c\u00a7"+
		"\2\u0557\u0085\3\2\2\2\u0558\u0559\5\u01a2\u00d2\2\u0559\u055b\5\u01be"+
		"\u00e0\2\u055a\u055c\5\u0112\u008a\2\u055b\u055a\3\2\2\2\u055b\u055c\3"+
		"\2\2\2\u055c\u0560\3\2\2\2\u055d\u055e\5\u014c\u00a7\2\u055e\u055f\7\20"+
		"\2\2\u055f\u0561\3\2\2\2\u0560\u055d\3\2\2\2\u0560\u0561\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u0563\5\u00dep\2\u0563\u0087\3\2\2\2\u0564\u0565"+
		"\5\u0198\u00cd\2\u0565\u0567\5\u0270\u0139\2\u0566\u0568\5\u0110\u0089"+
		"\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056c\3\2\2\2\u0569\u056a"+
		"\5\u014c\u00a7\2\u056a\u056b\7\20\2\2\u056b\u056d\3\2\2\2\u056c\u0569"+
		"\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\5\u014e\u00a8"+
		"\2\u056f\u0570\5\u0296\u014c\2\u0570\u0571\5\u00a0Q\2\u0571\u0573\5\u0298"+
		"\u014d\2\u0572\u0574\5\u008aF\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u0089\3\2\2\2\u0575\u0577\5\u0290\u0149\2\u0576\u0578\5\u0090"+
		"I\2\u0577\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u008b\3\2\2\2\u0579"+
		"\u057b\5\u0150\u00a9\2\u057a\u057c\5\u0158\u00ad\2\u057b\u057a\3\2\2\2"+
		"\u057b\u057c\3\2\2\2\u057c\u0584\3\2\2\2\u057d\u057e\5\u02a6\u0154\2\u057e"+
		"\u0580\5\u0150\u00a9\2\u057f\u0581\5\u0158\u00ad\2\u0580\u057f\3\2\2\2"+
		"\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u057d\3\2\2\2\u0583\u0586"+
		"\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u008d\3\2\2\2\u0586"+
		"\u0584\3\2\2\2\u0587\u0588\5\u0192\u00ca\2\u0588\u0589\5\u024c\u0127\2"+
		"\u0589\u058a\5\u018e\u00c8\2\u058a\u058b\5\u0296\u014c\2\u058b\u058c\5"+
		"\u008cG\2\u058c\u058d\5\u0298\u014d\2\u058d\u008f\3\2\2\2\u058e\u0594"+
		"\5\u0092J\2\u058f\u0590\5\u0180\u00c1\2\u0590\u0591\5\u0092J\2\u0591\u0593"+
		"\3\2\2\2\u0592\u058f\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u0091\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\5\u0094"+
		"K\2\u0598\u0599\7\u00db\2\2\u0599\u059a\5\u0096L\2\u059a\u05a1\3\2\2\2"+
		"\u059b\u059c\5\u0094K\2\u059c\u059d\7\u00db\2\2\u059d\u059e\5\u0098M\2"+
		"\u059e\u05a1\3\2\2\2\u059f\u05a1\5\u008eH\2\u05a0\u0597\3\2\2\2\u05a0"+
		"\u059b\3\2\2\2\u05a0\u059f\3\2\2\2\u05a1\u0093\3\2\2\2\u05a2\u05a3\5\u02aa"+
		"\u0156\2\u05a3\u0095\3\2\2\2\u05a4\u05a8\5\u0146\u00a4\2\u05a5\u05a8\5"+
		"\u0144\u00a3\2\u05a6\u05a8\5\u02aa\u0156\2\u05a7\u05a4\3\2\2\2\u05a7\u05a5"+
		"\3\2\2\2\u05a7\u05a6\3\2\2\2\u05a8\u0097\3\2\2\2\u05a9\u05aa\5\u029a\u014e"+
		"\2\u05aa\u05b0\5\u009aN\2\u05ab\u05ac\5\u02a6\u0154\2\u05ac\u05ad\5\u009a"+
		"N\2\u05ad\u05af\3\2\2\2\u05ae\u05ab\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0"+
		"\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2"+
		"\2\2\u05b3\u05b4\5\u029c\u014f\2\u05b4\u0099\3\2\2\2\u05b5\u05b6\5\u009c"+
		"O\2\u05b6\u05b7\7\13\2\2\u05b7\u05b8\5\u009eP\2\u05b8\u009b\3\2\2\2\u05b9"+
		"\u05ba\5\u0146\u00a4\2\u05ba\u009d\3\2\2\2\u05bb\u05bf\5\u0146\u00a4\2"+
		"\u05bc\u05bf\5\u0148\u00a5\2\u05bd\u05bf\5\u0144\u00a3\2\u05be\u05bb\3"+
		"\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bd\3\2\2\2\u05bf\u009f\3\2\2\2\u05c0"+
		"\u05c6\5\u00a2R\2\u05c1\u05c2\5\u02a6\u0154\2\u05c2\u05c3\5\u00a2R\2\u05c3"+
		"\u05c5\3\2\2\2\u05c4\u05c1\3\2\2\2\u05c5\u05c8\3\2\2\2\u05c6\u05c4\3\2"+
		"\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05cc\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9"+
		"\u05ca\5\u02a6\u0154\2\u05ca\u05cb\5\u00a6T\2\u05cb\u05cd\3\2\2\2\u05cc"+
		"\u05c9\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u00a1\3\2\2\2\u05ce\u05cf\5\u0150"+
		"\u00a9\2\u05cf\u05d1\5\u0152\u00aa\2\u05d0\u05d2\5\u00a4S\2\u05d1\u05d0"+
		"\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u00a3\3\2\2\2\u05d3\u05d4\5\u0250\u0129"+
		"\2\u05d4\u05d5\5\u0226\u0114\2\u05d5\u00a5\3\2\2\2\u05d6\u05d7\5\u0250"+
		"\u0129\2\u05d7\u05d8\5\u0226\u0114\2\u05d8\u05d9\5\u0296\u014c\2\u05d9"+
		"\u05da\5\u00a8U\2\u05da\u05db\5\u0298\u014d\2\u05db\u00a7\3\2\2\2\u05dc"+
		"\u05e0\5\u00aaV\2\u05dd\u05e0\5\u00acW\2\u05de\u05e0\5\u00aeX\2\u05df"+
		"\u05dc\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05de\3\2\2\2\u05e0\u00a9\3\2"+
		"\2\2\u05e1\u05e2\5\u0150\u00a9\2\u05e2\u00ab\3\2\2\2\u05e3\u05e7\5\u00b4"+
		"[\2\u05e4\u05e5\5\u02a6\u0154\2\u05e5\u05e6\5\u00b2Z\2\u05e6\u05e8\3\2"+
		"\2\2\u05e7\u05e4\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u00ad\3\2\2\2\u05e9"+
		"\u05ea\5\u0296\u014c\2\u05ea\u05eb\5\u00b0Y\2\u05eb\u05ef\5\u0298\u014d"+
		"\2\u05ec\u05ed\5\u02a6\u0154\2\u05ed\u05ee\5\u00b2Z\2\u05ee\u05f0\3\2"+
		"\2\2\u05ef\u05ec\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u00af\3\2\2\2\u05f1"+
		"\u05f7\5\u00b4[\2\u05f2\u05f3\5\u02a6\u0154\2\u05f3\u05f4\5\u00b4[\2\u05f4"+
		"\u05f6\3\2\2\2\u05f5\u05f2\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5\3\2"+
		"\2\2\u05f7\u05f8\3\2\2\2\u05f8\u00b1\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa"+
		"\u0600\5\u00b6\\\2\u05fb\u05fc\5\u02a6\u0154\2\u05fc\u05fd\5\u00b6\\\2"+
		"\u05fd\u05ff\3\2\2\2\u05fe\u05fb\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe"+
		"\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u00b3\3\2\2\2\u0602\u0600\3\2\2\2\u0603"+
		"\u0604\5\u0150\u00a9\2\u0604\u00b5\3\2\2\2\u0605\u0606\5\u0150\u00a9\2"+
		"\u0606\u00b7\3\2\2\2\u0607\u0608\5\u0182\u00c2\2\u0608\u0609\5\u018a\u00c6"+
		"\2\u0609\u00b9\3\2\2\2\u060a\u060c\5\u018c\u00c7\2\u060b\u060d\5\u00bc"+
		"_\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\3\2\2\2\u060e"+
		"\u0610\5\u018a\u00c6\2\u060f\u0611\5\u010e\u0088\2\u0610\u060f\3\2\2\2"+
		"\u0610\u0611\3\2\2\2\u0611\u00bb\3\2\2\2\u0612\u0615\5\u0234\u011b\2\u0613"+
		"\u0615\5\u027e\u0140\2\u0614\u0612\3\2\2\2\u0614\u0613\3\2\2\2\u0615\u00bd"+
		"\3\2\2\2\u0616\u0617\5\u017e\u00c0\2\u0617\u0618\5\u022a\u0116\2\u0618"+
		"\u0619\5\u014c\u00a7\2\u0619\u061a\5\u0290\u0149\2\u061a\u061b\5\u0256"+
		"\u012c\2\u061b\u061c\7\u00db\2\2\u061c\u061d\5\u029a\u014e\2\u061d\u061e"+
		"\5\u00c0a\2\u061e\u0622\5\u029c\u014f\2\u061f\u0620\5\u0180\u00c1\2\u0620"+
		"\u0621\5\u00c4c\2\u0621\u0623\3\2\2\2\u0622\u061f\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u00bf\3\2\2\2\u0624\u062a\5\u00c2b\2\u0625\u0626\5\u02a6"+
		"\u0154\2\u0626\u0627\5\u00c2b\2\u0627\u0629\3\2\2\2\u0628\u0625\3\2\2"+
		"\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u00c1"+
		"\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u062e\7\u00d4\2\2\u062e\u062f\7\13"+
		"\2\2\u062f\u0634\7\u00d4\2\2\u0630\u0631\7\u00d4\2\2\u0631\u0632\7\13"+
		"\2\2\u0632\u0634\7\u00d5\2\2\u0633\u062d\3\2\2\2\u0633\u0630\3\2\2\2\u0634"+
		"\u00c3\3\2\2\2\u0635\u0636\5\u01a4\u00d3\2\u0636\u0637\7\u00db\2\2\u0637"+
		"\u0638\5\u0148\u00a5\2\u0638\u00c5\3\2\2\2\u0639\u063a\5\u0282\u0142\2"+
		"\u063a\u063b\5\u014c\u00a7\2\u063b\u00c7\3\2\2\2\u063c\u063e\5\u0278\u013d"+
		"\2\u063d\u063f\5\u0270\u0139\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2"+
		"\u063f\u0643\3\2\2\2\u0640\u0641\5\u014c\u00a7\2\u0641\u0642\7\20\2\2"+
		"\u0642\u0644\3\2\2\2\u0643\u0640\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645"+
		"\3\2\2\2\u0645\u0646\5\u014e\u00a8\2\u0646\u00c9\3\2\2\2\u0647\u0648\5"+
		"\u0198\u00cd\2\u0648\u064a\5\u01be\u00e0\2\u0649\u064b\5\u0110\u0089\2"+
		"\u064a\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2\2\2\u064c\u064e"+
		"\5\u00dep\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2"+
		"\2\u064f\u0653\5\u0246\u0124\2\u0650\u0651\5\u014c\u00a7\2\u0651\u0652"+
		"\7\20\2\2\u0652\u0654\3\2\2\2\u0653\u0650\3\2\2\2\u0653\u0654\3\2\2\2"+
		"\u0654\u0655\3\2\2\2\u0655\u0656\5\u014e\u00a8\2\u0656\u0657\5\u0296\u014c"+
		"\2\u0657\u0658\5\u00e0q\2\u0658\u0659\5\u0298\u014d\2\u0659\u0680\3\2"+
		"\2\2\u065a\u065b\5\u0198\u00cd\2\u065b\u065c\5\u01c0\u00e1\2\u065c\u065e"+
		"\5\u01be\u00e0\2\u065d\u065f\5\u0110\u0089\2\u065e\u065d\3\2\2\2\u065e"+
		"\u065f\3\2\2\2\u065f\u0661\3\2\2\2\u0660\u0662\5\u00dep\2\u0661\u0660"+
		"\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0667\5\u0246\u0124"+
		"\2\u0664\u0665\5\u014c\u00a7\2\u0665\u0666\7\20\2\2\u0666\u0668\3\2\2"+
		"\2\u0667\u0664\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a"+
		"\5\u014e\u00a8\2\u066a\u066b\5\u0296\u014c\2\u066b\u066c\5\u00e0q\2\u066c"+
		"\u066d\5\u0298\u014d\2\u066d\u0670\5\u0288\u0145\2\u066e\u0671\5\u01e0"+
		"\u00f1\2\u066f\u0671\5\u01e2\u00f2\2\u0670\u066e\3\2\2\2\u0670\u066f\3"+
		"\2\2\2\u0671\u067d\3\2\2\2\u0672\u0673\5\u0290\u0149\2\u0673\u0674\5\u0248"+
		"\u0125\2\u0674\u0675\7\u00db\2\2\u0675\u0677\7\5\2\2\u0676\u0678\5\u00cc"+
		"g\2\u0677\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u0677\3\2\2\2\u0679"+
		"\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\7\6\2\2\u067c\u067e\3\2"+
		"\2\2\u067d\u0672\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f"+
		"\u0647\3\2\2\2\u067f\u065a\3\2\2\2\u0680\u00cb\3\2\2\2\u0681\u0682\5\u0218"+
		"\u010d\2\u0682\u0683\7\13\2\2\u0683\u0685\5\u0148\u00a5\2\u0684\u0686"+
		"\7\t\2\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u06dc\3\2\2\2\u0687"+
		"\u0688\5\u01c6\u00e4\2\u0688\u0689\7\13\2\2\u0689\u068b\5\u0148\u00a5"+
		"\2\u068a\u068c\7\t\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u06dc"+
		"\3\2\2\2\u068d\u068e\5\u01c4\u00e3\2\u068e\u068f\7\13\2\2\u068f\u0691"+
		"\5\u0148\u00a5\2\u0690\u0692\7\t\2\2\u0691\u0690\3\2\2\2\u0691\u0692\3"+
		"\2\2\2\u0692\u06dc\3\2\2\2\u0693\u0694\5\u01c8\u00e5\2\u0694\u0695\7\13"+
		"\2\2\u0695\u0697\5\u0148\u00a5\2\u0696\u0698\7\t\2\2\u0697\u0696\3\2\2"+
		"\2\u0697\u0698\3\2\2\2\u0698\u06dc\3\2\2\2\u0699\u069a\5\u01ca\u00e6\2"+
		"\u069a\u069b\7\13\2\2\u069b\u069d\5\u0148\u00a5\2\u069c\u069e\7\t\2\2"+
		"\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06dc\3\2\2\2\u069f\u06a0"+
		"\5\u01ce\u00e8\2\u06a0\u06a1\7\13\2\2\u06a1\u06a3\5\u0148\u00a5\2\u06a2"+
		"\u06a4\7\t\2\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06dc\3\2"+
		"\2\2\u06a5\u06a6\5\u01d4\u00eb\2\u06a6\u06a7\7\13\2\2\u06a7\u06a9\5\u0148"+
		"\u00a5\2\u06a8\u06aa\7\t\2\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06dc\3\2\2\2\u06ab\u06ac\5\u01d6\u00ec\2\u06ac\u06ad\7\13\2\2\u06ad"+
		"\u06af\5\u0148\u00a5\2\u06ae\u06b0\7\t\2\2\u06af\u06ae\3\2\2\2\u06af\u06b0"+
		"\3\2\2\2\u06b0\u06dc\3\2\2\2\u06b1\u06b2\5\u01da\u00ee\2\u06b2\u06b3\7"+
		"\13\2\2\u06b3\u06b5\5\u0148\u00a5\2\u06b4\u06b6\7\t\2\2\u06b5\u06b4\3"+
		"\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06dc\3\2\2\2\u06b7\u06b8\5\u01d8\u00ed"+
		"\2\u06b8\u06b9\7\13\2\2\u06b9\u06bb\5\u0148\u00a5\2\u06ba\u06bc\7\t\2"+
		"\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06dc\3\2\2\2\u06bd\u06be"+
		"\5\u01cc\u00e7\2\u06be\u06bf\7\13\2\2\u06bf\u06c1\5\u0146\u00a4\2\u06c0"+
		"\u06c2\7\t\2\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06dc\3\2"+
		"\2\2\u06c3\u06c4\5\u01dc\u00ef\2\u06c4\u06c5\7\13\2\2\u06c5\u06c7\5\u0146"+
		"\u00a4\2\u06c6\u06c8\7\t\2\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8"+
		"\u06dc\3\2\2\2\u06c9\u06ca\5\u01de\u00f0\2\u06ca\u06cb\7\13\2\2\u06cb"+
		"\u06cd\5\u0146\u00a4\2\u06cc\u06ce\7\t\2\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce"+
		"\3\2\2\2\u06ce\u06dc\3\2\2\2\u06cf\u06d0\5\u01d2\u00ea\2\u06d0\u06d1\7"+
		"\13\2\2\u06d1\u06d3\5\u0146\u00a4\2\u06d2\u06d4\7\t\2\2\u06d3\u06d2\3"+
		"\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06dc\3\2\2\2\u06d5\u06d6\5\u01d0\u00e9"+
		"\2\u06d6\u06d7\7\13\2\2\u06d7\u06d9\5\u0146\u00a4\2\u06d8\u06da\7\t\2"+
		"\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u0681"+
		"\3\2\2\2\u06db\u0687\3\2\2\2\u06db\u068d\3\2\2\2\u06db\u0693\3\2\2\2\u06db"+
		"\u0699\3\2\2\2\u06db\u069f\3\2\2\2\u06db\u06a5\3\2\2\2\u06db\u06ab\3\2"+
		"\2\2\u06db\u06b1\3\2\2\2\u06db\u06b7\3\2\2\2\u06db\u06bd\3\2\2\2\u06db"+
		"\u06c3\3\2\2\2\u06db\u06c9\3\2\2\2\u06db\u06cf\3\2\2\2\u06db\u06d5\3\2"+
		"\2\2\u06dc\u00cd\3\2\2\2\u06dd\u06de\5\u0198\u00cd\2\u06de\u06df\5\u01c2"+
		"\u00e2\2\u06df\u06e1\5\u01be\u00e0\2\u06e0\u06e2\5\u0110\u0089\2\u06e1"+
		"\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e7\5\u0246"+
		"\u0124\2\u06e4\u06e5\5\u014c\u00a7\2\u06e5\u06e6\7\20\2\2\u06e6\u06e8"+
		"\3\2\2\2\u06e7\u06e4\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9"+
		"\u0704\5\u014e\u00a8\2\u06ea\u06ee\7\u0091\2\2\u06eb\u06ec\5\u01f4\u00fb"+
		"\2\u06ec\u06ed\5\u00dan\2\u06ed\u06ef\3\2\2\2\u06ee\u06eb\3\2\2\2\u06ee"+
		"\u06ef\3\2\2\2\u06ef\u06f6\3\2\2\2\u06f0\u06f2\5\u0180\u00c1\2\u06f1\u06f0"+
		"\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\5\u01f6\u00fc"+
		"\2\u06f4\u06f5\5\u00d8m\2\u06f5\u06f7\3\2\2\2\u06f6\u06f1\3\2\2\2\u06f6"+
		"\u06f7\3\2\2\2\u06f7\u06fc\3\2\2\2\u06f8\u06fa\5\u0180\u00c1\2\u06f9\u06f8"+
		"\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd\5\u00d0i"+
		"\2\u06fc\u06f9\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u0702\3\2\2\2\u06fe\u0700"+
		"\5\u0180\u00c1\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0701\3"+
		"\2\2\2\u0701\u0703\5\u00d4k\2\u0702\u06ff\3\2\2\2\u0702\u0703\3\2\2\2"+
		"\u0703\u0705\3\2\2\2\u0704\u06ea\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u00cf"+
		"\3\2\2\2\u0706\u0707\5\u01f8\u00fd\2\u0707\u070c\7\5\2\2\u0708\u0709\5"+
		"\u01fa\u00fe\2\u0709\u070a\7\13\2\2\u070a\u070b\5\u0142\u00a2\2\u070b"+
		"\u070d\3\2\2\2\u070c\u0708\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u0715\3\2"+
		"\2\2\u070e\u0710\5\u02a6\u0154\2\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2"+
		"\2\u0710\u0711\3\2\2\2\u0711\u0712\5\u01fc\u00ff\2\u0712\u0713\7\13\2"+
		"\2\u0713\u0714\5\u0146\u00a4\2\u0714\u0716\3\2\2\2\u0715\u070f\3\2\2\2"+
		"\u0715\u0716\3\2\2\2\u0716\u071e\3\2\2\2\u0717\u0719\5\u02a6\u0154\2\u0718"+
		"\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\5\u01fe"+
		"\u0100\2\u071b\u071c\7\13\2\2\u071c\u071d\5\u00d2j\2\u071d\u071f\3\2\2"+
		"\2\u071e\u0718\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0727\3\2\2\2\u0720\u0722"+
		"\5\u02a6\u0154\2\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\3"+
		"\2\2\2\u0723\u0724\5\u0200\u0101\2\u0724\u0725\7\13\2\2\u0725\u0726\5"+
		"\u0142\u00a2\2\u0726\u0728\3\2\2\2\u0727\u0721\3\2\2\2\u0727\u0728\3\2"+
		"\2\2\u0728\u0730\3\2\2\2\u0729\u072b\5\u02a6\u0154\2\u072a\u0729\3\2\2"+
		"\2\u072a\u072b\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\5\u0202\u0102\2"+
		"\u072d\u072e\7\13\2\2\u072e\u072f\5\u0142\u00a2\2\u072f\u0731\3\2\2\2"+
		"\u0730\u072a\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0739\3\2\2\2\u0732\u0734"+
		"\5\u02a6\u0154\2\u0733\u0732\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0735\3"+
		"\2\2\2\u0735\u0736\5\u0204\u0103\2\u0736\u0737\7\13\2\2\u0737\u0738\5"+
		"\u0146\u00a4\2\u0738\u073a\3\2\2\2\u0739\u0733\3\2\2\2\u0739\u073a\3\2"+
		"\2\2\u073a\u0742\3\2\2\2\u073b\u073d\5\u02a6\u0154\2\u073c\u073b\3\2\2"+
		"\2\u073c\u073d\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u073f\5\u0206\u0104\2"+
		"\u073f\u0740\7\13\2\2\u0740\u0741\5\u0142\u00a2\2\u0741\u0743\3\2\2\2"+
		"\u0742\u073c\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u074b\3\2\2\2\u0744\u0746"+
		"\5\u02a6\u0154\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0747\3"+
		"\2\2\2\u0747\u0748\5\u0208\u0105\2\u0748\u0749\7\13\2\2\u0749\u074a\5"+
		"\u0142\u00a2\2\u074a\u074c\3\2\2\2\u074b\u0745\3\2\2\2\u074b\u074c\3\2"+
		"\2\2\u074c\u0754\3\2\2\2\u074d\u074f\5\u02a6\u0154\2\u074e\u074d\3\2\2"+
		"\2\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\5\u020a\u0106\2"+
		"\u0751\u0752\7\13\2\2\u0752\u0753\5\u0142\u00a2\2\u0753\u0755\3\2\2\2"+
		"\u0754\u074e\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u075d\3\2\2\2\u0756\u0758"+
		"\5\u02a6\u0154\2\u0757\u0756\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\3"+
		"\2\2\2\u0759\u075a\5\u020c\u0107\2\u075a\u075b\7\13\2\2\u075b\u075c\5"+
		"\u0148\u00a5\2\u075c\u075e\3\2\2\2\u075d\u0757\3\2\2\2\u075d\u075e\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u0760\7\6\2\2\u0760\u00d1\3\2\2\2\u0761"+
		"\u0764\5\u0214\u010b\2\u0762\u0764\5\u0216\u010c\2\u0763\u0761\3\2\2\2"+
		"\u0763\u0762\3\2\2\2\u0764\u00d3\3\2\2\2\u0765\u0766\5\u0248\u0125\2\u0766"+
		"\u076b\7\5\2\2\u0767\u0768\5\u020e\u0108\2\u0768\u0769\7\13\2\2\u0769"+
		"\u076a\5\u0148\u00a5\2\u076a\u076c\3\2\2\2\u076b\u0767\3\2\2\2\u076b\u076c"+
		"\3\2\2\2\u076c\u0774\3\2\2\2\u076d\u076f\5\u02a6\u0154\2\u076e\u076d\3"+
		"\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\5\u0210\u0109"+
		"\2\u0771\u0772\7\13\2\2\u0772\u0773\5\u0148\u00a5\2\u0773\u0775\3\2\2"+
		"\2\u0774\u076e\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u077d\3\2\2\2\u0776\u0778"+
		"\5\u02a6\u0154\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779\3"+
		"\2\2\2\u0779\u077a\5\u0212\u010a\2\u077a\u077b\7\13\2\2\u077b\u077c\5"+
		"\u0148\u00a5\2\u077c\u077e\3\2\2\2\u077d\u0777\3\2\2\2\u077d\u077e\3\2"+
		"\2\2\u077e\u077f\3\2\2\2\u077f\u0780\7\6\2\2\u0780\u00d5\3\2\2\2\u0781"+
		"\u0786\5\u01e6\u00f4\2\u0782\u0786\5\u01e4\u00f3\2\u0783\u0786\5\u01e8"+
		"\u00f5\2\u0784\u0786\5\u01ea\u00f6\2\u0785\u0781\3\2\2\2\u0785\u0782\3"+
		"\2\2\2\u0785\u0783\3\2\2\2\u0785\u0784\3\2\2\2\u0786\u00d7\3\2\2\2\u0787"+
		"\u078d\5\u00d6l\2\u0788\u0789\5\u02a6\u0154\2\u0789\u078a\5\u00d6l\2\u078a"+
		"\u078c\3\2\2\2\u078b\u0788\3\2\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2"+
		"\2\2\u078d\u078e\3\2\2\2\u078e\u00d9\3\2\2\2\u078f\u078d\3\2\2\2\u0790"+
		"\u0796\5\u00dco\2\u0791\u0792\5\u02a6\u0154\2\u0792\u0793\5\u00dco\2\u0793"+
		"\u0795\3\2\2\2\u0794\u0791\3\2\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2"+
		"\2\2\u0796\u0797\3\2\2\2\u0797\u00db\3\2\2\2\u0798\u0796\3\2\2\2\u0799"+
		"\u07bd\5\u0150\u00a9\2\u079a\u079f\7\5\2\2\u079b\u079c\5\u01ec\u00f7\2"+
		"\u079c\u079d\7\13\2\2\u079d\u079e\5\u0148\u00a5\2\u079e\u07a0\3\2\2\2"+
		"\u079f\u079b\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a8\3\2\2\2\u07a1\u07a3"+
		"\5\u02a6\u0154\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\3"+
		"\2\2\2\u07a4\u07a5\5\u01ee\u00f8\2\u07a5\u07a6\7\13\2\2\u07a6\u07a7\5"+
		"\u0148\u00a5\2\u07a7\u07a9\3\2\2\2\u07a8\u07a2\3\2\2\2\u07a8\u07a9\3\2"+
		"\2\2\u07a9\u07b1\3\2\2\2\u07aa\u07ac\5\u02a6\u0154\2\u07ab\u07aa\3\2\2"+
		"\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\5\u01f0\u00f9\2"+
		"\u07ae\u07af\7\13\2\2\u07af\u07b0\5\u0148\u00a5\2\u07b0\u07b2\3\2\2\2"+
		"\u07b1\u07ab\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07ba\3\2\2\2\u07b3\u07b5"+
		"\5\u02a6\u0154\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3"+
		"\2\2\2\u07b6\u07b7\5\u01f2\u00fa\2\u07b7\u07b8\7\13\2\2\u07b8\u07b9\5"+
		"\u0148\u00a5\2\u07b9\u07bb\3\2\2\2\u07ba\u07b4\3\2\2\2\u07ba\u07bb\3\2"+
		"\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be\7\6\2\2\u07bd\u079a\3\2\2\2\u07bd"+
		"\u07be\3\2\2\2\u07be\u07e6\3\2\2\2\u07bf\u07e3\7\21\2\2\u07c0\u07c5\7"+
		"\5\2\2\u07c1\u07c2\5\u01ec\u00f7\2\u07c2\u07c3\7\13\2\2\u07c3\u07c4\5"+
		"\u0148\u00a5\2\u07c4\u07c6\3\2\2\2\u07c5\u07c1\3\2\2\2\u07c5\u07c6\3\2"+
		"\2\2\u07c6\u07ce\3\2\2\2\u07c7\u07c9\5\u02a6\u0154\2\u07c8\u07c7\3\2\2"+
		"\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\5\u01ee\u00f8\2"+
		"\u07cb\u07cc\7\13\2\2\u07cc\u07cd\5\u0148\u00a5\2\u07cd\u07cf\3\2\2\2"+
		"\u07ce\u07c8\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d7\3\2\2\2\u07d0\u07d2"+
		"\5\u02a6\u0154\2\u07d1\u07d0\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3"+
		"\2\2\2\u07d3\u07d4\5\u01f0\u00f9\2\u07d4\u07d5\7\13\2\2\u07d5\u07d6\5"+
		"\u0148\u00a5\2\u07d6\u07d8\3\2\2\2\u07d7\u07d1\3\2\2\2\u07d7\u07d8\3\2"+
		"\2\2\u07d8\u07e0\3\2\2\2\u07d9\u07db\5\u02a6\u0154\2\u07da\u07d9\3\2\2"+
		"\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\5\u01f2\u00fa\2"+
		"\u07dd\u07de\7\13\2\2\u07de\u07df\5\u0148\u00a5\2\u07df\u07e1\3\2\2\2"+
		"\u07e0\u07da\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4"+
		"\7\6\2\2\u07e3\u07c0\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5"+
		"\u0799\3\2\2\2\u07e5\u07bf\3\2\2\2\u07e6\u00dd\3\2\2\2\u07e7\u07ea\5\u02aa"+
		"\u0156\2\u07e8\u07ea\5\u0146\u00a4\2\u07e9\u07e7\3\2\2\2\u07e9\u07e8\3"+
		"\2\2\2\u07ea\u00df\3\2\2\2\u07eb\u07f1\5\u0150\u00a9\2\u07ec\u07f1\5\u00e2"+
		"r\2\u07ed\u07f1\5\u00e4s\2\u07ee\u07f1\5\u00e6t\2\u07ef\u07f1\5\u00e8"+
		"u\2\u07f0\u07eb\3\2\2\2\u07f0\u07ec\3\2\2\2\u07f0\u07ed\3\2\2\2\u07f0"+
		"\u07ee\3\2\2\2\u07f0\u07ef\3\2\2\2\u07f1\u00e1\3\2\2\2\u07f2\u07f3\5\u0228"+
		"\u0115\2\u07f3\u07f4\5\u0296\u014c\2\u07f4\u07f5\5\u0150\u00a9\2\u07f5"+
		"\u07f6\5\u0298\u014d\2\u07f6\u00e3\3\2\2\2\u07f7\u07f8\5\u01a6\u00d4\2"+
		"\u07f8\u07f9\5\u0296\u014c\2\u07f9\u07fa\5\u0150\u00a9\2\u07fa\u07fb\5"+
		"\u0298\u014d\2\u07fb\u00e5\3\2\2\2\u07fc\u07fd\5\u01b2\u00da\2\u07fd\u07fe"+
		"\5\u0296\u014c\2\u07fe\u07ff\5\u0150\u00a9\2\u07ff\u0800\5\u0298\u014d"+
		"\2\u0800\u00e7\3\2\2\2\u0801\u0802\5\u028a\u0146\2\u0802\u0803\5\u0296"+
		"\u014c\2\u0803\u0804\5\u0150\u00a9\2\u0804\u0805\5\u0298\u014d\2\u0805"+
		"\u00e9\3\2\2\2\u0806\u0808\5\u00ba^\2\u0807\u0806\3\2\2\2\u0807\u0808"+
		"\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b\5\u019a\u00ce\2\u080a\u080c\5"+
		"\u00ecw\2\u080b\u080a\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080d\3\2\2\2"+
		"\u080d\u080f\5\u0124\u0093\2\u080e\u0810\5\u010e\u0088\2\u080f\u080e\3"+
		"\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0814\5\u012c\u0097"+
		"\2\u0812\u0815\5\u0112\u008a\2\u0813\u0815\5\u00f2z\2\u0814\u0812\3\2"+
		"\2\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u00eb\3\2\2\2\u0816"+
		"\u081c\5\u00eex\2\u0817\u0818\5\u02a6\u0154\2\u0818\u0819\5\u00eex\2\u0819"+
		"\u081b\3\2\2\2\u081a\u0817\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2"+
		"\2\2\u081c\u081d\3\2\2\2\u081d\u00ed\3\2\2\2\u081e\u081c\3\2\2\2\u081f"+
		"\u0829\5\u02aa\u0156\2\u0820\u0821\5\u02aa\u0156\2\u0821\u0824\7\7\2\2"+
		"\u0822\u0825\5\u0146\u00a4\2\u0823\u0825\5\u0142\u00a2\2\u0824\u0822\3"+
		"\2\2\2\u0824\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0827\7\b\2\2\u0827"+
		"\u0829\3\2\2\2\u0828\u081f\3\2\2\2\u0828\u0820\3\2\2\2\u0829\u00ef\3\2"+
		"\2\2\u082a\u082c\5\u00ba^\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c"+
		"\u082d\3\2\2\2\u082d\u0831\5\u0280\u0141\2\u082e\u082f\5\u014c\u00a7\2"+
		"\u082f\u0830\7\20\2\2\u0830\u0832\3\2\2\2\u0831\u082e\3\2\2\2\u0831\u0832"+
		"\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\5\u014e\u00a8\2\u0834\u0836\5"+
		"\u0108\u0085\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\3\2"+
		"\2\2\u0837\u0838\5\u0266\u0134\2\u0838\u0839\5\u00f8}\2\u0839\u083c\5"+
		"\u012c\u0097\2\u083a\u083d\5\u0112\u008a\2\u083b\u083d\5\u00f2z\2\u083c"+
		"\u083a\3\2\2\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u00f1\3\2"+
		"\2\2\u083e\u083f\5\u01ba\u00de\2\u083f\u0840\5\u00f4{\2\u0840\u00f3\3"+
		"\2\2\2\u0841\u0847\5\u00f6|\2\u0842\u0843\5\u0180\u00c1\2\u0843\u0844"+
		"\5\u00f6|\2\u0844\u0846\3\2\2\2\u0845\u0842\3\2\2\2\u0846\u0849\3\2\2"+
		"\2\u0847\u0845\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u00f5\3\2\2\2\u0849\u0847"+
		"\3\2\2\2\u084a\u084b\5\u02aa\u0156\2\u084b\u084c\7\u00db\2\2\u084c\u084d"+
		"\5\u0140\u00a1\2\u084d\u00f7\3\2\2\2\u084e\u0854\5\u00fa~\2\u084f\u0850"+
		"\5\u02a6\u0154\2\u0850\u0851\5\u00fa~\2\u0851\u0853\3\2\2\2\u0852\u084f"+
		"\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855"+
		"\u00f9\3\2\2\2\u0856\u0854\3\2\2\2\u0857\u0858\5\u02aa\u0156\2\u0858\u085d"+
		"\7\u00db\2\2\u0859\u085e\5\u0140\u00a1\2\u085a\u085e\5\u00fe\u0080\2\u085b"+
		"\u085e\5\u00fc\177\2\u085c\u085e\5\u0102\u0082\2\u085d\u0859\3\2\2\2\u085d"+
		"\u085a\3\2\2\2\u085d\u085b\3\2\2\2\u085d\u085c\3\2\2\2\u085e\u0891\3\2"+
		"\2\2\u085f\u0860\5\u02aa\u0156\2\u0860\u0861\7\u00db\2\2\u0861\u0862\5"+
		"\u02aa\u0156\2\u0862\u0863\t\3\2\2\u0863\u0864\5\u0142\u00a2\2\u0864\u0891"+
		"\3\2\2\2\u0865\u0866\5\u02aa\u0156\2\u0866\u0867\7\u00db\2\2\u0867\u0868"+
		"\5\u02aa\u0156\2\u0868\u0869\t\3\2\2\u0869\u086a\5\u00fc\177\2\u086a\u0891"+
		"\3\2\2\2\u086b\u086c\5\u02aa\u0156\2\u086c\u086d\7\u00db\2\2\u086d\u086e"+
		"\5\u00fc\177\2\u086e\u086f\t\3\2\2\u086f\u0870\5\u02aa\u0156\2\u0870\u0891"+
		"\3\2\2\2\u0871\u0872\5\u02aa\u0156\2\u0872\u0873\7\u00db\2\2\u0873\u0874"+
		"\5\u02aa\u0156\2\u0874\u0875\t\3\2\2\u0875\u0876\5\u00fe\u0080\2\u0876"+
		"\u0891\3\2\2\2\u0877\u0878\5\u02aa\u0156\2\u0878\u0879\7\u00db\2\2\u0879"+
		"\u087a\5\u00fe\u0080\2\u087a\u087b\t\3\2\2\u087b\u087c\5\u02aa\u0156\2"+
		"\u087c\u0891\3\2\2\2\u087d\u087e\5\u02aa\u0156\2\u087e\u087f\7\u00db\2"+
		"\2\u087f\u0880\5\u02aa\u0156\2\u0880\u0881\t\3\2\2\u0881\u0882\5\u0102"+
		"\u0082\2\u0882\u0891\3\2\2\2\u0883\u0884\5\u02aa\u0156\2\u0884\u0885\7"+
		"\u00db\2\2\u0885\u0886\5\u0102\u0082\2\u0886\u0887\t\3\2\2\u0887\u0888"+
		"\5\u02aa\u0156\2\u0888\u0891\3\2\2\2\u0889\u088a\5\u02aa\u0156\2\u088a"+
		"\u088b\5\u02a2\u0152\2\u088b\u088c\5\u0142\u00a2\2\u088c\u088d\5\u02a4"+
		"\u0153\2\u088d\u088e\7\u00db\2\2\u088e\u088f\5\u0140\u00a1\2\u088f\u0891"+
		"\3\2\2\2\u0890\u0857\3\2\2\2\u0890\u085f\3\2\2\2\u0890\u0865\3\2\2\2\u0890"+
		"\u086b\3\2\2\2\u0890\u0871\3\2\2\2\u0890\u0877\3\2\2\2\u0890\u087d\3\2"+
		"\2\2\u0890\u0883\3\2\2\2\u0890\u0889\3\2\2\2\u0891\u00fb\3\2\2\2\u0892"+
		"\u089c\5\u029a\u014e\2\u0893\u0899\5\u0140\u00a1\2\u0894\u0895\5\u02a6"+
		"\u0154\2\u0895\u0896\5\u011c\u008f\2\u0896\u0898\3\2\2\2\u0897\u0894\3"+
		"\2\2\2\u0898\u089b\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u089a\3\2\2\2\u089a"+
		"\u089d\3\2\2\2\u089b\u0899\3\2\2\2\u089c\u0893\3\2\2\2\u089c\u089d\3\2"+
		"\2\2\u089d\u089e\3\2\2\2\u089e\u089f\5\u029c\u014f\2\u089f\u00fd\3\2\2"+
		"\2\u08a0\u08a1\5\u029a\u014e\2\u08a1\u08a2\5\u0140\u00a1\2\u08a2\u08a3"+
		"\5\u02a8\u0155\2\u08a3\u08a4\5\u011c\u008f\2\u08a4\u08ac\3\2\2\2\u08a5"+
		"\u08a6\5\u02a6\u0154\2\u08a6\u08a7\5\u0140\u00a1\2\u08a7\u08a8\5\u02a8"+
		"\u0155\2\u08a8\u08a9\5\u011c\u008f\2\u08a9\u08ab\3\2\2\2\u08aa\u08a5\3"+
		"\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad"+
		"\u08af\3\2\2\2\u08ae\u08ac\3\2\2\2\u08af\u08b0\5\u029c\u014f\2\u08b0\u00ff"+
		"\3\2\2\2\u08b1\u08b2\5\u029a\u014e\2\u08b2\u08b8\5\u011c\u008f\2\u08b3"+
		"\u08b4\5\u02a6\u0154\2\u08b4\u08b5\5\u011c\u008f\2\u08b5\u08b7\3\2\2\2"+
		"\u08b6\u08b3\3\2\2\2\u08b7\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9"+
		"\3\2\2\2\u08b9\u08bb\3\2\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08bc\5\u029c\u014f"+
		"\2\u08bc\u0101\3\2\2\2\u08bd\u08be\5\u02a2\u0152\2\u08be\u08c4\5\u0140"+
		"\u00a1\2\u08bf\u08c0\5\u02a6\u0154\2\u08c0\u08c1\5\u011c\u008f\2\u08c1"+
		"\u08c3\3\2\2\2\u08c2\u08bf\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2"+
		"\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c7\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7"+
		"\u08c8\5\u02a4\u0153\2\u08c8\u0103\3\2\2\2\u08c9\u08e6\5\u0296\u014c\2"+
		"\u08ca\u08db\5\u011c\u008f\2\u08cb\u08cc\5\u02a6\u0154\2\u08cc\u08cd\5"+
		"\u011c\u008f\2\u08cd\u08cf\3\2\2\2\u08ce\u08cb\3\2\2\2\u08cf\u08d2\3\2"+
		"\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08dc\3\2\2\2\u08d2"+
		"\u08d0\3\2\2\2\u08d3\u08d4\5\u02a6\u0154\2\u08d4\u08d5\5\u0104\u0083\2"+
		"\u08d5\u08d7\3\2\2\2\u08d6\u08d3\3\2\2\2\u08d7\u08da\3\2\2\2\u08d8\u08d6"+
		"\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08dc\3\2\2\2\u08da\u08d8\3\2\2\2\u08db"+
		"\u08d0\3\2\2\2\u08db\u08d8\3\2\2\2\u08dc\u08e7\3\2\2\2\u08dd\u08e3\5\u0104"+
		"\u0083\2\u08de\u08df\5\u02a6\u0154\2\u08df\u08e0\5\u0104\u0083\2\u08e0"+
		"\u08e2\3\2\2\2\u08e1\u08de\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2"+
		"\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6"+
		"\u08ca\3\2\2\2\u08e6\u08dd\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\5\u0298"+
		"\u014d\2\u08e9\u0105\3\2\2\2\u08ea\u08ec\5\u00ba^\2\u08eb\u08ea\3\2\2"+
		"\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\5\u021e\u0110\2"+
		"\u08ee\u08f2\5\u0220\u0111\2\u08ef\u08f0\5\u014c\u00a7\2\u08f0\u08f1\7"+
		"\20\2\2\u08f1\u08f3\3\2\2\2\u08f2\u08ef\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3"+
		"\u08f4\3\2\2\2\u08f4\u08f6\5\u014e\u00a8\2\u08f5\u08f7\5\u0116\u008c\2"+
		"\u08f6\u08f5\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08fa"+
		"\5\u0114\u008b\2\u08f9\u08fb\5\u0110\u0089\2\u08fa\u08f9\3\2\2\2\u08fa"+
		"\u08fb\3\2\2\2\u08fb\u08fd\3\2\2\2\u08fc\u08fe\5\u0108\u0085\2\u08fd\u08fc"+
		"\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0107\3\2\2\2\u08ff\u0900\5\u0288\u0145"+
		"\2\u0900\u0901\5\u010c\u0087\2\u0901\u0910\3\2\2\2\u0902\u0903\5\u0288"+
		"\u0145\2\u0903\u0904\5\u010c\u0087\2\u0904\u0905\5\u0180\u00c1\2\u0905"+
		"\u0906\5\u010a\u0086\2\u0906\u0910\3\2\2\2\u0907\u0908\5\u0288\u0145\2"+
		"\u0908\u0909\5\u010a\u0086\2\u0909\u0910\3\2\2\2\u090a\u090b\5\u0288\u0145"+
		"\2\u090b\u090c\5\u010a\u0086\2\u090c\u090d\5\u0180\u00c1\2\u090d\u090e"+
		"\5\u010c\u0087\2\u090e\u0910\3\2\2\2\u090f\u08ff\3\2\2\2\u090f\u0902\3"+
		"\2\2\2\u090f\u0907\3\2\2\2\u090f\u090a\3\2\2\2\u0910\u0109\3\2\2\2\u0911"+
		"\u0912\5\u0272\u013a\2\u0912\u0913\5\u0142\u00a2\2\u0913\u010b\3\2\2\2"+
		"\u0914\u0915\5\u027a\u013e\2\u0915\u0916\5\u0142\u00a2\2\u0916\u010d\3"+
		"\2\2\2\u0917\u0918\5\u0288\u0145\2\u0918\u0919\5\u010a\u0086\2\u0919\u010f"+
		"\3\2\2\2\u091a\u091b\5\u01ba\u00de\2\u091b\u091c\5\u0240\u0121\2\u091c"+
		"\u091d\5\u01aa\u00d6\2\u091d\u0111\3\2\2\2\u091e\u091f\5\u01ba\u00de\2"+
		"\u091f\u0920\5\u01aa\u00d6\2\u0920\u0113\3\2\2\2\u0921\u0922\5\u028a\u0146"+
		"\2\u0922\u0923\7\3\2\2\u0923\u0924\5\u011a\u008e\2\u0924\u0925\7\4\2\2"+
		"\u0925\u092a\3\2\2\2\u0926\u0927\5\u0224\u0113\2\u0927\u0928\5\u0140\u00a1"+
		"\2\u0928\u092a\3\2\2\2\u0929\u0921\3\2\2\2\u0929\u0926\3\2\2\2\u092a\u0115"+
		"\3\2\2\2\u092b\u092c\7\3\2\2\u092c\u092d\5\u0118\u008d\2\u092d\u092e\7"+
		"\4\2\2\u092e\u0117\3\2\2\2\u092f\u0935\5\u0150\u00a9\2\u0930\u0931\5\u02a6"+
		"\u0154\2\u0931\u0932\5\u0150\u00a9\2\u0932\u0934\3\2\2\2\u0933\u0930\3"+
		"\2\2\2\u0934\u0937\3\2\2\2\u0935\u0933\3\2\2\2\u0935\u0936\3\2\2\2\u0936"+
		"\u0119\3\2\2\2\u0937\u0935\3\2\2\2\u0938\u093e\5\u011c\u008f\2\u0939\u093a"+
		"\5\u02a6\u0154\2\u093a\u093b\5\u011c\u008f\2\u093b\u093d\3\2\2\2\u093c"+
		"\u0939\3\2\2\2\u093d\u0940\3\2\2\2\u093e\u093c\3\2\2\2\u093e\u093f\3\2"+
		"\2\2\u093f\u011b\3\2\2\2\u0940\u093e\3\2\2\2\u0941\u0948\5\u0140\u00a1"+
		"\2\u0942\u0948\5\u00fe\u0080\2\u0943\u0948\5\u00fc\177\2\u0944\u0948\5"+
		"\u0102\u0082\2\u0945\u0948\5\u0104\u0083\2\u0946\u0948\5\u0100\u0081\2"+
		"\u0947\u0941\3\2\2\2\u0947\u0942\3\2\2\2\u0947\u0943\3\2\2\2\u0947\u0944"+
		"\3\2\2\2\u0947\u0945\3\2\2\2\u0947\u0946\3\2\2\2\u0948\u011d\3\2\2\2\u0949"+
		"\u094b\5\u0264\u0133\2\u094a\u094c\5\u012e\u0098\2\u094b\u094a\3\2\2\2"+
		"\u094b\u094c\3\2\2\2\u094c\u094e\3\2\2\2\u094d\u094f\5\u0224\u0113\2\u094e"+
		"\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\5\u0130"+
		"\u0099\2\u0951\u0953\5\u0124\u0093\2\u0952\u0954\5\u012c\u0097\2\u0953"+
		"\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0956\3\2\2\2\u0955\u0957\5\u0128"+
		"\u0095\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0959\3\2\2\2\u0958"+
		"\u095a\5\u0122\u0092\2\u0959\u0958\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095c"+
		"\3\2\2\2\u095b\u095d\5\u0120\u0091\2\u095c\u095b\3\2\2\2\u095c\u095d\3"+
		"\2\2\2\u095d\u011f\3\2\2\2\u095e\u095f\5\u017c\u00bf\2\u095f\u0960\5\u01ac"+
		"\u00d7\2\u0960\u0121\3\2\2\2\u0961\u0962\5\u0230\u0119\2\u0962\u0963\5"+
		"\u0142\u00a2\2\u0963\u0123\3\2\2\2\u0964\u0965\5\u01b0\u00d9\2\u0965\u0966"+
		"\5\u0126\u0094\2\u0966\u0125\3\2\2\2\u0967\u096d\5\u02aa\u0156\2\u0968"+
		"\u0969\5\u02aa\u0156\2\u0969\u096a\7\20\2\2\u096a\u096b\5\u02aa\u0156"+
		"\2\u096b\u096d\3\2\2\2\u096c\u0967\3\2\2\2\u096c\u0968\3\2\2\2\u096d\u0127"+
		"\3\2\2\2\u096e\u096f\5\u024c\u0127\2\u096f\u0970\5\u018e\u00c8\2\u0970"+
		"\u0971\5\u012a\u0096\2\u0971\u0129\3\2\2\2\u0972\u0975\5\u02aa\u0156\2"+
		"\u0973\u0976\5\u0186\u00c4\2\u0974\u0976\5\u019c\u00cf\2\u0975\u0973\3"+
		"\2\2\2\u0975\u0974\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u012b\3\2\2\2\u0977"+
		"\u0978\5\u028e\u0148\2\u0978\u0979\5\u0134\u009b\2\u0979\u012d\3\2\2\2"+
		"\u097a\u097b\5\u01a0\u00d1\2\u097b\u012f\3\2\2\2\u097c\u097f\7\21\2\2"+
		"\u097d\u097f\5\u0132\u009a\2\u097e\u097c\3\2\2\2\u097e\u097d\3\2\2\2\u097f"+
		"\u0985\3\2\2\2\u0980\u0981\5\u02a6\u0154\2\u0981\u0982\5\u0132\u009a\2"+
		"\u0982\u0984\3\2\2\2\u0983\u0980\3\2\2\2\u0984\u0987\3\2\2\2\u0985\u0983"+
		"\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0131\3\2\2\2\u0987\u0985\3\2\2\2\u0988"+
		"\u0989\5\u02aa\u0156\2\u0989\u098a\7\20\2\2\u098a\u098b\7\21\2\2\u098b"+
		"\u0999\3\2\2\2\u098c\u0990\5\u02aa\u0156\2\u098d\u098e\5\u0184\u00c3\2"+
		"\u098e\u098f\5\u02aa\u0156\2\u098f\u0991\3\2\2\2\u0990\u098d\3\2\2\2\u0990"+
		"\u0991\3\2\2\2\u0991\u0999\3\2\2\2\u0992\u0996\5\u013c\u009f\2\u0993\u0994"+
		"\5\u0184\u00c3\2\u0994\u0995\5\u02aa\u0156\2\u0995\u0997\3\2\2\2\u0996"+
		"\u0993\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0999\3\2\2\2\u0998\u0988\3\2"+
		"\2\2\u0998\u098c\3\2\2\2\u0998\u0992\3\2\2\2\u0999\u0133\3\2\2\2\u099a"+
		"\u09a0\5\u0136\u009c\2\u099b\u099c\5\u0180\u00c1\2\u099c\u099d\5\u0136"+
		"\u009c\2\u099d\u099f\3\2\2\2\u099e\u099b\3\2\2\2\u099f\u09a2\3\2\2\2\u09a0"+
		"\u099e\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u0135\3\2\2\2\u09a2\u09a0\3\2"+
		"\2\2\u09a3\u09a4\5\u02aa\u0156\2\u09a4\u09a5\t\4\2\2\u09a5\u09a6\5\u0140"+
		"\u00a1\2\u09a6\u09ed\3\2\2\2\u09a7\u09a8\5\u02aa\u0156\2\u09a8\u09a9\7"+
		"\20\2\2\u09a9\u09aa\5\u02aa\u0156";
	private static final String _serializedATNSegment1 =
		"\2\u09aa\u09ab\t\4\2\2\u09ab\u09ac\5\u0140\u00a1\2\u09ac\u09ed\3\2\2\2"+
		"\u09ad\u09ae\5\u013c\u009f\2\u09ae\u09af\t\4\2\2\u09af\u09b0\5\u0140\u00a1"+
		"\2\u09b0\u09ed\3\2\2\2\u09b1\u09b2\5\u013c\u009f\2\u09b2\u09b3\t\4\2\2"+
		"\u09b3\u09b4\5\u013c\u009f\2\u09b4\u09ed\3\2\2\2\u09b5\u09b6\5\u02aa\u0156"+
		"\2\u09b6\u09b7\5\u01bc\u00df\2\u09b7\u09b9\7\3\2\2\u09b8\u09ba\5\u013e"+
		"\u00a0\2\u09b9\u09b8\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb"+
		"\u09bc\7\4\2\2\u09bc\u09ed\3\2\2\2\u09bd\u09be\7\3\2\2\u09be\u09c4\5\u02aa"+
		"\u0156\2\u09bf\u09c0\5\u02a6\u0154\2\u09c0\u09c1\5\u02aa\u0156\2\u09c1"+
		"\u09c3\3\2\2\2\u09c2\u09bf\3\2\2\2\u09c3\u09c6\3\2\2\2\u09c4\u09c2\3\2"+
		"\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c7\3\2\2\2\u09c6\u09c4\3\2\2\2\u09c7"+
		"\u09c8\7\4\2\2\u09c8\u09c9\5\u01bc\u00df\2\u09c9\u09ca\7\3\2\2\u09ca\u09d0"+
		"\5\u0104\u0083\2\u09cb\u09cc\5\u02a6\u0154\2\u09cc\u09cd\5\u0104\u0083"+
		"\2\u09cd\u09cf\3\2\2\2\u09ce\u09cb\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0\u09ce"+
		"\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d3\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d3"+
		"\u09d4\7\4\2\2\u09d4\u09ed\3\2\2\2\u09d5\u09d6\7\3\2\2\u09d6\u09dc\5\u02aa"+
		"\u0156\2\u09d7\u09d8\5\u02a6\u0154\2\u09d8\u09d9\5\u02aa\u0156\2\u09d9"+
		"\u09db\3\2\2\2\u09da\u09d7\3\2\2\2\u09db\u09de\3\2\2\2\u09dc\u09da\3\2"+
		"\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09df\3\2\2\2\u09de\u09dc\3\2\2\2\u09df"+
		"\u09e0\7\4\2\2\u09e0\u09e1\t\4\2\2\u09e1\u09e7\5\u0104\u0083\2\u09e2\u09e3"+
		"\5\u02a6\u0154\2\u09e3\u09e4\5\u0104\u0083\2\u09e4\u09e6\3\2\2\2\u09e5"+
		"\u09e2\3\2\2\2\u09e6\u09e9\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e7\u09e8\3\2"+
		"\2\2\u09e8\u09ed\3\2\2\2\u09e9\u09e7\3\2\2\2\u09ea\u09ed\5\u013a\u009e"+
		"\2\u09eb\u09ed\5\u0138\u009d\2\u09ec\u09a3\3\2\2\2\u09ec\u09a7\3\2\2\2"+
		"\u09ec\u09ad\3\2\2\2\u09ec\u09b1\3\2\2\2\u09ec\u09b5\3\2\2\2\u09ec\u09bd"+
		"\3\2\2\2\u09ec\u09d5\3\2\2\2\u09ec\u09ea\3\2\2\2\u09ec\u09eb\3\2\2\2\u09ed"+
		"\u0137\3\2\2\2\u09ee\u09ef\5\u02aa\u0156\2\u09ef\u09f0\5\u0196\u00cc\2"+
		"\u09f0\u09f1\5\u0140\u00a1\2\u09f1\u0139\3\2\2\2\u09f2\u09f3\5\u02aa\u0156"+
		"\2\u09f3\u09f4\5\u0196\u00cc\2\u09f4\u09f5\5\u0226\u0114\2\u09f5\u09f6"+
		"\3\2\2\2\u09f6\u09f7\5\u0140\u00a1\2\u09f7\u013b\3\2\2\2\u09f8\u09f9\5"+
		"\u02aa\u0156\2\u09f9\u09fa\7\3\2\2\u09fa\u09fb\7\21\2\2\u09fb\u09fc\7"+
		"\4\2\2\u09fc\u0a05\3\2\2\2\u09fd\u09fe\5\u02aa\u0156\2\u09fe\u0a00\7\3"+
		"\2\2\u09ff\u0a01\5\u013e\u00a0\2\u0a00\u09ff\3\2\2\2\u0a00\u0a01\3\2\2"+
		"\2\u0a01\u0a02\3\2\2\2\u0a02\u0a03\7\4\2\2\u0a03\u0a05\3\2\2\2\u0a04\u09f8"+
		"\3\2\2\2\u0a04\u09fd\3\2\2\2\u0a05\u013d\3\2\2\2\u0a06\u0a0a\5\u0140\u00a1"+
		"\2\u0a07\u0a0a\5\u02aa\u0156\2\u0a08\u0a0a\5\u013c\u009f\2\u0a09\u0a06"+
		"\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a09\u0a08\3\2\2\2\u0a0a\u0a13\3\2\2\2\u0a0b"+
		"\u0a0f\5\u02a6\u0154\2\u0a0c\u0a10\5\u0140\u00a1\2\u0a0d\u0a10\5\u02aa"+
		"\u0156\2\u0a0e\u0a10\5\u013c\u009f\2\u0a0f\u0a0c\3\2\2\2\u0a0f\u0a0d\3"+
		"\2\2\2\u0a0f\u0a0e\3\2\2\2\u0a10\u0a12\3\2\2\2\u0a11\u0a0b\3\2\2\2\u0a12"+
		"\u0a15\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u013f\3\2"+
		"\2\2\u0a15\u0a13\3\2\2\2\u0a16\u0a20\7\u00da\2\2\u0a17\u0a20\5\u0146\u00a4"+
		"\2\u0a18\u0a20\5\u0142\u00a2\2\u0a19\u0a20\5\u0144\u00a3\2\u0a1a\u0a20"+
		"\5\u014a\u00a6\2\u0a1b\u0a20\5\u0148\u00a5\2\u0a1c\u0a20\5\62\32\2\u0a1d"+
		"\u0a20\5\u0242\u0122\2\u0a1e\u0a20\5\u02aa\u0156\2\u0a1f\u0a16\3\2\2\2"+
		"\u0a1f\u0a17\3\2\2\2\u0a1f\u0a18\3\2\2\2\u0a1f\u0a19\3\2\2\2\u0a1f\u0a1a"+
		"\3\2\2\2\u0a1f\u0a1b\3\2\2\2\u0a1f\u0a1c\3\2\2\2\u0a1f\u0a1d\3\2\2\2\u0a1f"+
		"\u0a1e\3\2\2\2\u0a20\u0141\3\2\2\2\u0a21\u0a22\7\u00d5\2\2\u0a22\u0143"+
		"\3\2\2\2\u0a23\u0a24\t\5\2\2\u0a24\u0145\3\2\2\2\u0a25\u0a26\7\u00d4\2"+
		"\2\u0a26\u0147\3\2\2\2\u0a27\u0a28\t\6\2\2\u0a28\u0149\3\2\2\2\u0a29\u0a2a"+
		"\7\u00d7\2\2\u0a2a\u014b\3\2\2\2\u0a2b\u0a31\5\u02aa\u0156\2\u0a2c\u0a2d"+
		"\7\27\2\2\u0a2d\u0a2e\5\u02aa\u0156\2\u0a2e\u0a2f\7\27\2\2\u0a2f\u0a31"+
		"\3\2\2\2\u0a30\u0a2b\3\2\2\2\u0a30\u0a2c\3\2\2\2\u0a31\u014d\3\2\2\2\u0a32"+
		"\u0a38\5\u02aa\u0156\2\u0a33\u0a34\7\27\2\2\u0a34\u0a35\5\u02aa\u0156"+
		"\2\u0a35\u0a36\7\27\2\2\u0a36\u0a38\3\2\2\2\u0a37\u0a32\3\2\2\2\u0a37"+
		"\u0a33\3\2\2\2\u0a38\u014f\3\2\2\2\u0a39\u0a3f\5\u02aa\u0156\2\u0a3a\u0a3b"+
		"\7\27\2\2\u0a3b\u0a3c\5\u02aa\u0156\2\u0a3c\u0a3d\7\27\2\2\u0a3d\u0a3f"+
		"\3\2\2\2\u0a3e\u0a39\3\2\2\2\u0a3e\u0a3a\3\2\2\2\u0a3f\u0151\3\2\2\2\u0a40"+
		"\u0a42\5\u0154\u00ab\2\u0a41\u0a43\5\u0156\u00ac\2\u0a42\u0a41\3\2\2\2"+
		"\u0a42\u0a43\3\2\2\2\u0a43\u0153\3\2\2\2\u0a44\u0a61\5\u02aa\u0156\2\u0a45"+
		"\u0a61\7\u00d4\2\2\u0a46\u0a61\7\177\2\2\u0a47\u0a61\7w\2\2\u0a48\u0a61"+
		"\7\u0093\2\2\u0a49\u0a61\7\u00be\2\2\u0a4a\u0a61\7\u00bf\2\2\u0a4b\u0a61"+
		"\7\u00c0\2\2\u0a4c\u0a61\7\u00c1\2\2\u0a4d\u0a61\7\u00c2\2\2\u0a4e\u0a61"+
		"\7\u00c3\2\2\u0a4f\u0a61\7\u00c4\2\2\u0a50\u0a61\7\u00c5\2\2\u0a51\u0a61"+
		"\7\u00c6\2\2\u0a52\u0a61\7\u00c7\2\2\u0a53\u0a61\7\u00c8\2\2\u0a54\u0a61"+
		"\7\u00c9\2\2\u0a55\u0a61\7\u00ca\2\2\u0a56\u0a61\7\u00cb\2\2\u0a57\u0a61"+
		"\7\u00cc\2\2\u0a58\u0a61\7\u00ce\2\2\u0a59\u0a61\7\u00cd\2\2\u0a5a\u0a61"+
		"\7\u00cf\2\2\u0a5b\u0a61\7\u00d0\2\2\u0a5c\u0a61\7\u00d1\2\2\u0a5d\u0a61"+
		"\7\u00d2\2\2\u0a5e\u0a61\7\177\2\2\u0a5f\u0a61\7\u008d\2\2\u0a60\u0a44"+
		"\3\2\2\2\u0a60\u0a45\3\2\2\2\u0a60\u0a46\3\2\2\2\u0a60\u0a47\3\2\2\2\u0a60"+
		"\u0a48\3\2\2\2\u0a60\u0a49\3\2\2\2\u0a60\u0a4a\3\2\2\2\u0a60\u0a4b\3\2"+
		"\2\2\u0a60\u0a4c\3\2\2\2\u0a60\u0a4d\3\2\2\2\u0a60\u0a4e\3\2\2\2\u0a60"+
		"\u0a4f\3\2\2\2\u0a60\u0a50\3\2\2\2\u0a60\u0a51\3\2\2\2\u0a60\u0a52\3\2"+
		"\2\2\u0a60\u0a53\3\2\2\2\u0a60\u0a54\3\2\2\2\u0a60\u0a55\3\2\2\2\u0a60"+
		"\u0a56\3\2\2\2\u0a60\u0a57\3\2\2\2\u0a60\u0a58\3\2\2\2\u0a60\u0a59\3\2"+
		"\2\2\u0a60\u0a5a\3\2\2\2\u0a60\u0a5b\3\2\2\2\u0a60\u0a5c\3\2\2\2\u0a60"+
		"\u0a5d\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a60\u0a5f\3\2\2\2\u0a61\u0155\3\2"+
		"\2\2\u0a62\u0a63\5\u029e\u0150\2\u0a63\u0a69\5\u0152\u00aa\2\u0a64\u0a65"+
		"\5\u02a6\u0154\2\u0a65\u0a66\5\u0152\u00aa\2\u0a66\u0a68\3\2\2\2\u0a67"+
		"\u0a64\3\2\2\2\u0a68\u0a6b\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a69\u0a6a\3\2"+
		"\2\2\u0a6a\u0a6c\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6d\5\u02a0\u0151"+
		"\2\u0a6d\u0157\3\2\2\2\u0a6e\u0a71\5\u0186\u00c4\2\u0a6f\u0a71\5\u019c"+
		"\u00cf\2\u0a70\u0a6e\3\2\2\2\u0a70\u0a6f\3\2\2\2\u0a71\u0159\3\2\2\2\u0a72"+
		"\u0a73\5\u02aa\u0156\2\u0a73\u015b\3\2\2\2\u0a74\u0a75\5\u02aa\u0156\2"+
		"\u0a75\u015d\3\2\2\2\u0a76\u0a77\5\u0146\u00a4\2\u0a77\u015f\3\2\2\2\u0a78"+
		"\u0a79\5\u02aa\u0156\2\u0a79\u0161\3\2\2\2\u0a7a\u0a7b\5\u02aa\u0156\2"+
		"\u0a7b\u0163\3\2\2\2\u0a7c\u0a7d\5\u02aa\u0156\2\u0a7d\u0165\3\2\2\2\u0a7e"+
		"\u0a7f\5\u02aa\u0156\2\u0a7f\u0167\3\2\2\2\u0a80\u0a81\5\u02aa\u0156\2"+
		"\u0a81\u0169\3\2\2\2\u0a82\u0a83\5\u02aa\u0156\2\u0a83\u016b\3\2\2\2\u0a84"+
		"\u0a85\5\u0146\u00a4\2\u0a85\u016d\3\2\2\2\u0a86\u0a87\5\u02aa\u0156\2"+
		"\u0a87\u016f\3\2\2\2\u0a88\u0a89\5\u0172\u00ba\2\u0a89\u0a8a\5\u0152\u00aa"+
		"\2\u0a8a\u0171\3\2\2\2\u0a8b\u0a8c\5\u02aa\u0156\2\u0a8c\u0173\3\2\2\2"+
		"\u0a8d\u0a8e\7\31\2\2\u0a8e\u0175\3\2\2\2\u0a8f\u0a90\7\32\2\2\u0a90\u0177"+
		"\3\2\2\2\u0a91\u0a92\7\33\2\2\u0a92\u0179\3\2\2\2\u0a93\u0a94\7\33\2\2"+
		"\u0a94\u0a95\7h\2\2\u0a95\u017b\3\2\2\2\u0a96\u0a97\7\34\2\2\u0a97\u017d"+
		"\3\2\2\2\u0a98\u0a99\7\35\2\2\u0a99\u017f\3\2\2\2\u0a9a\u0a9b\7\36\2\2"+
		"\u0a9b\u0181\3\2\2\2\u0a9c\u0a9d\7 \2\2\u0a9d\u0183\3\2\2\2\u0a9e\u0a9f"+
		"\7!\2\2\u0a9f\u0185\3\2\2\2\u0aa0\u0aa1\7\"\2\2\u0aa1\u0187\3\2\2\2\u0aa2"+
		"\u0aa3\7#\2\2\u0aa3\u0189\3\2\2\2\u0aa4\u0aa5\7$\2\2\u0aa5\u018b\3\2\2"+
		"\2\u0aa6\u0aa7\7%\2\2\u0aa7\u018d\3\2\2\2\u0aa8\u0aa9\7&\2\2\u0aa9\u018f"+
		"\3\2\2\2\u0aaa\u0aab\7\'\2\2\u0aab\u0191\3\2\2\2\u0aac\u0aad\7(\2\2\u0aad"+
		"\u0193\3\2\2\2\u0aae\u0aaf\7*\2\2\u0aaf\u0195\3\2\2\2\u0ab0\u0ab1\7,\2"+
		"\2\u0ab1\u0197\3\2\2\2\u0ab2\u0ab3\7-\2\2\u0ab3\u0199\3\2\2\2\u0ab4\u0ab5"+
		"\7\60\2\2\u0ab5\u019b\3\2\2\2\u0ab6\u0ab7\7\61\2\2\u0ab7\u019d\3\2\2\2"+
		"\u0ab8\u0ab9\7\62\2\2\u0ab9\u019f\3\2\2\2\u0aba\u0abb\7\63\2\2\u0abb\u01a1"+
		"\3\2\2\2\u0abc\u0abd\7\64\2\2\u0abd\u01a3\3\2\2\2\u0abe\u0abf\7\65\2\2"+
		"\u0abf\u01a5\3\2\2\2\u0ac0\u0ac1\7\67\2\2\u0ac1\u01a7\3\2\2\2\u0ac2\u0ac3"+
		"\78\2\2\u0ac3\u01a9\3\2\2\2\u0ac4\u0ac5\79\2\2\u0ac5\u01ab\3\2\2\2\u0ac6"+
		"\u0ac7\7;\2\2\u0ac7\u01ad\3\2\2\2\u0ac8\u0ac9\7<\2\2\u0ac9\u01af\3\2\2"+
		"\2\u0aca\u0acb\7=\2\2\u0acb\u01b1\3\2\2\2\u0acc\u0acd\7>\2\2\u0acd\u01b3"+
		"\3\2\2\2\u0ace\u0acf\7?\2\2\u0acf\u01b5\3\2\2\2\u0ad0\u0ad1\7@\2\2\u0ad1"+
		"\u01b7\3\2\2\2\u0ad2\u0ad3\7A\2\2\u0ad3\u01b9\3\2\2\2\u0ad4\u0ad5\7B\2"+
		"\2\u0ad5\u01bb\3\2\2\2\u0ad6\u0ad7\7C\2\2\u0ad7\u01bd\3\2\2\2\u0ad8\u0ad9"+
		"\7D\2\2\u0ad9\u01bf\3\2\2\2\u0ada\u0adb\7.\2\2\u0adb\u01c1\3\2\2\2\u0adc"+
		"\u0add\7/\2\2\u0add\u01c3\3\2\2\2\u0ade\u0adf\7\u0093\2\2\u0adf\u01c5"+
		"\3\2\2\2\u0ae0\u0ae1\7\u0095\2\2\u0ae1\u01c7\3\2\2\2\u0ae2\u0ae3\7\u0096"+
		"\2\2\u0ae3\u01c9\3\2\2\2\u0ae4\u0ae5\7\u0097\2\2\u0ae5\u01cb\3\2\2\2\u0ae6"+
		"\u0ae7\7\u0098\2\2\u0ae7\u01cd\3\2\2\2\u0ae8\u0ae9\7\u0099\2\2\u0ae9\u01cf"+
		"\3\2\2\2\u0aea\u0aeb\7\u009a\2\2\u0aeb\u01d1\3\2\2\2\u0aec\u0aed\7\u009b"+
		"\2\2\u0aed\u01d3\3\2\2\2\u0aee\u0aef\7\u009c\2\2\u0aef\u01d5\3\2\2\2\u0af0"+
		"\u0af1\7\u009d\2\2\u0af1\u01d7\3\2\2\2\u0af2\u0af3\7\u009e\2\2\u0af3\u01d9"+
		"\3\2\2\2\u0af4\u0af5\7\u009f\2\2\u0af5\u01db\3\2\2\2\u0af6\u0af7\7\u00a0"+
		"\2\2\u0af7\u01dd\3\2\2\2\u0af8\u0af9\7\u00a1\2\2\u0af9\u01df\3\2\2\2\u0afa"+
		"\u0afb\7\u00a2\2\2\u0afb\u01e1\3\2\2\2\u0afc\u0afd\7\u00a3\2\2\u0afd\u01e3"+
		"\3\2\2\2\u0afe\u0aff\7\u00a4\2\2\u0aff\u01e5\3\2\2\2\u0b00\u0b01\7\u00a5"+
		"\2\2\u0b01\u01e7\3\2\2\2\u0b02\u0b03\7\u00a6\2\2\u0b03\u01e9\3\2\2\2\u0b04"+
		"\u0b05\7\u00a7\2\2\u0b05\u01eb\3\2\2\2\u0b06\u0b07\7\u00a9\2\2\u0b07\u01ed"+
		"\3\2\2\2\u0b08\u0b09\7\u00a8\2\2\u0b09\u01ef\3\2\2\2\u0b0a\u0b0b\7\u00aa"+
		"\2\2\u0b0b\u01f1\3\2\2\2\u0b0c\u0b0d\7\u00ab\2\2\u0b0d\u01f3\3\2\2\2\u0b0e"+
		"\u0b0f\7\u00ac\2\2\u0b0f\u01f5\3\2\2\2\u0b10\u0b11\7\u00ad\2\2\u0b11\u01f7"+
		"\3\2\2\2\u0b12\u0b13\7\u00ae\2\2\u0b13\u01f9\3\2\2\2\u0b14\u0b15\7\u00af"+
		"\2\2\u0b15\u01fb\3\2\2\2\u0b16\u0b17\7\u00b0\2\2\u0b17\u01fd\3\2\2\2\u0b18"+
		"\u0b19\7\u00b1\2\2\u0b19\u01ff\3\2\2\2\u0b1a\u0b1b\7\u00b2\2\2\u0b1b\u0201"+
		"\3\2\2\2\u0b1c\u0b1d\7\u00b3\2\2\u0b1d\u0203\3\2\2\2\u0b1e\u0b1f\7\u00b4"+
		"\2\2\u0b1f\u0205\3\2\2\2\u0b20\u0b21\7\u00b5\2\2\u0b21\u0207\3\2\2\2\u0b22"+
		"\u0b23\7\u00b6\2\2\u0b23\u0209\3\2\2\2\u0b24\u0b25\7\u00b7\2\2\u0b25\u020b"+
		"\3\2\2\2\u0b26\u0b27\7\u00b8\2\2\u0b27\u020d\3\2\2\2\u0b28\u0b29\7\u00b9"+
		"\2\2\u0b29\u020f\3\2\2\2\u0b2a\u0b2b\7\u00ba\2\2\u0b2b\u0211\3\2\2\2\u0b2c"+
		"\u0b2d\7\u00bb\2\2\u0b2d\u0213\3\2\2\2\u0b2e\u0b2f\7\u00bc\2\2\u0b2f\u0215"+
		"\3\2\2\2\u0b30\u0b31\7\u00bd\2\2\u0b31\u0217\3\2\2\2\u0b32\u0b33\7\u0094"+
		"\2\2\u0b33\u0219\3\2\2\2\u0b34\u0b35\7F\2\2\u0b35\u021b\3\2\2\2\u0b36"+
		"\u0b37\7G\2\2\u0b37\u021d\3\2\2\2\u0b38\u0b39\7H\2\2\u0b39\u021f\3\2\2"+
		"\2\u0b3a\u0b3b\7I\2\2\u0b3b\u0221\3\2\2\2\u0b3c\u0b3d\7J\2\2\u0b3d\u0223"+
		"\3\2\2\2\u0b3e\u0b3f\7K\2\2\u0b3f\u0225\3\2\2\2\u0b40\u0b41\7L\2\2\u0b41"+
		"\u0227\3\2\2\2\u0b42\u0b43\7M\2\2\u0b43\u0229\3\2\2\2\u0b44\u0b45\7N\2"+
		"\2\u0b45\u022b\3\2\2\2\u0b46\u0b47\7O\2\2\u0b47\u022d\3\2\2\2\u0b48\u0b49"+
		"\7P\2\2\u0b49\u022f\3\2\2\2\u0b4a\u0b4b\7R\2\2\u0b4b\u0231\3\2\2\2\u0b4c"+
		"\u0b4d\7\u00c9\2\2\u0b4d\u0233\3\2\2\2\u0b4e\u0b4f\7U\2\2\u0b4f\u0235"+
		"\3\2\2\2\u0b50\u0b51\7V\2\2\u0b51\u0237\3\2\2\2\u0b52\u0b53\7W\2\2\u0b53"+
		"\u0239\3\2\2\2\u0b54\u0b55\7X\2\2\u0b55\u023b\3\2\2\2\u0b56\u0b57\7[\2"+
		"\2\u0b57\u023d\3\2\2\2\u0b58\u0b59\7Z\2\2\u0b59\u023f\3\2\2\2\u0b5a\u0b5b"+
		"\7\\\2\2\u0b5b\u0241\3\2\2\2\u0b5c\u0b5d\7]\2\2\u0b5d\u0243\3\2\2\2\u0b5e"+
		"\u0b5f\7^\2\2\u0b5f\u0245\3\2\2\2\u0b60\u0b61\7_\2\2\u0b61\u0247\3\2\2"+
		"\2\u0b62\u0b63\7a\2\2\u0b63\u0249\3\2\2\2\u0b64\u0b65\7b\2\2\u0b65\u024b"+
		"\3\2\2\2\u0b66\u0b67\7c\2\2\u0b67\u024d\3\2\2\2\u0b68\u0b69\7e\2\2\u0b69"+
		"\u024f\3\2\2\2\u0b6a\u0b6b\7i\2\2\u0b6b\u0251\3\2\2\2\u0b6c\u0b6d\7k\2"+
		"\2\u0b6d\u0253\3\2\2\2\u0b6e\u0b6f\7l\2\2\u0b6f\u0255\3\2\2\2\u0b70\u0b71"+
		"\7m\2\2\u0b71\u0257\3\2\2\2\u0b72\u0b73\7n\2\2\u0b73\u0259\3\2\2\2\u0b74"+
		"\u0b75\7p\2\2\u0b75\u025b\3\2\2\2\u0b76\u0b77\7r\2\2\u0b77\u025d\3\2\2"+
		"\2\u0b78\u0b79\7s\2\2\u0b79\u025f\3\2\2\2\u0b7a\u0b7b\7t\2\2\u0b7b\u0261"+
		"\3\2\2\2\u0b7c\u0b7d\7q\2\2\u0b7d\u0263\3\2\2\2\u0b7e\u0b7f\7v\2\2\u0b7f"+
		"\u0265\3\2\2\2\u0b80\u0b81\7w\2\2\u0b81\u0267\3\2\2\2\u0b82\u0b83\7x\2"+
		"\2\u0b83\u0269\3\2\2\2\u0b84\u0b85\7z\2\2\u0b85\u026b\3\2\2\2\u0b86\u0b87"+
		"\7{\2\2\u0b87\u026d\3\2\2\2\u0b88\u0b89\7|\2\2\u0b89\u026f\3\2\2\2\u0b8a"+
		"\u0b8b\7}\2\2\u0b8b\u0271\3\2\2\2\u0b8c\u0b8d\7\177\2\2\u0b8d\u0273\3"+
		"\2\2\2\u0b8e\u0b8f\7\u0080\2\2\u0b8f\u0275\3\2\2\2\u0b90\u0b91\7\u0082"+
		"\2\2\u0b91\u0277\3\2\2\2\u0b92\u0b93\7\u0084\2\2\u0b93\u0279\3\2\2\2\u0b94"+
		"\u0b95\7\u0085\2\2\u0b95\u027b\3\2\2\2\u0b96\u0b97\7\u0087\2\2\u0b97\u027d"+
		"\3\2\2\2\u0b98\u0b99\7\u0088\2\2\u0b99\u027f\3\2\2\2\u0b9a\u0b9b\7\u0089"+
		"\2\2\u0b9b\u0281\3\2\2\2\u0b9c\u0b9d\7\u008a\2\2\u0b9d\u0283\3\2\2\2\u0b9e"+
		"\u0b9f\7\u008b\2\2\u0b9f\u0285\3\2\2\2\u0ba0\u0ba1\7\u00e0\2\2\u0ba1\u0287"+
		"\3\2\2\2\u0ba2\u0ba3\7\u008c\2\2\u0ba3\u0289\3\2\2\2\u0ba4\u0ba5\7\u008e"+
		"\2\2\u0ba5\u028b\3\2\2\2\u0ba6\u0ba7\7\u008f\2\2\u0ba7\u028d\3\2\2\2\u0ba8"+
		"\u0ba9\7\u0090\2\2\u0ba9\u028f\3\2\2\2\u0baa\u0bab\7\u0091\2\2\u0bab\u0291"+
		"\3\2\2\2\u0bac\u0bad\7o\2\2\u0bad\u0293\3\2\2\2\u0bae\u0baf\7\2\2\3\u0baf"+
		"\u0295\3\2\2\2\u0bb0\u0bb1\7\3\2\2\u0bb1\u0297\3\2\2\2\u0bb2\u0bb3\7\4"+
		"\2\2\u0bb3\u0299\3\2\2\2\u0bb4\u0bb5\7\5\2\2\u0bb5\u029b\3\2\2\2\u0bb6"+
		"\u0bb7\7\6\2\2\u0bb7\u029d\3\2\2\2\u0bb8\u0bb9\7\u00dc\2\2\u0bb9\u029f"+
		"\3\2\2\2\u0bba\u0bbb\7\u00dd\2\2\u0bbb\u02a1\3\2\2\2\u0bbc\u0bbd\7\7\2"+
		"\2\u0bbd\u02a3\3\2\2\2\u0bbe\u0bbf\7\b\2\2\u0bbf\u02a5\3\2\2\2\u0bc0\u0bc1"+
		"\7\t\2\2\u0bc1\u02a7\3\2\2\2\u0bc2\u0bc3\7\13\2\2\u0bc3\u02a9\3\2\2\2"+
		"\u0bc4\u0c53\7\u00d9\2\2\u0bc5\u0bc6\7\31\2\2\u0bc6\u0c53\7\32\2\2\u0bc7"+
		"\u0c53\7\33\2\2\u0bc8\u0c53\7\34\2\2\u0bc9\u0c53\7\35\2\2\u0bca\u0c53"+
		"\7\36\2\2\u0bcb\u0c53\7\37\2\2\u0bcc\u0c53\7 \2\2\u0bcd\u0c53\7!\2\2\u0bce"+
		"\u0c53\7\"\2\2\u0bcf\u0c53\7#\2\2\u0bd0\u0c53\7$\2\2\u0bd1\u0c53\7%\2"+
		"\2\u0bd2\u0c53\7&\2\2\u0bd3\u0c53\7\'\2\2\u0bd4\u0c53\7(\2\2\u0bd5\u0c53"+
		"\7)\2\2\u0bd6\u0c53\7*\2\2\u0bd7\u0c53\7+\2\2\u0bd8\u0c53\7,\2\2\u0bd9"+
		"\u0c53\7-\2\2\u0bda\u0c53\7.\2\2\u0bdb\u0c53\7\60\2\2\u0bdc\u0c53\7\61"+
		"\2\2\u0bdd\u0c53\7\62\2\2\u0bde\u0c53\7\63\2\2\u0bdf\u0c53\7\64\2\2\u0be0"+
		"\u0c53\7\65\2\2\u0be1\u0c53\7\66\2\2\u0be2\u0c53\7\67\2\2\u0be3\u0c53"+
		"\78\2\2\u0be4\u0c53\79\2\2\u0be5\u0c53\7:\2\2\u0be6\u0c53\7;\2\2\u0be7"+
		"\u0c53\7<\2\2\u0be8\u0c53\7=\2\2\u0be9\u0c53\7>\2\2\u0bea\u0c53\7?\2\2"+
		"\u0beb\u0c53\7@\2\2\u0bec\u0c53\7A\2\2\u0bed\u0c53\7B\2\2\u0bee\u0c53"+
		"\7C\2\2\u0bef\u0c53\7D\2\2\u0bf0\u0c53\7E\2\2\u0bf1\u0c53\7F\2\2\u0bf2"+
		"\u0c53\7G\2\2\u0bf3\u0c53\7H\2\2\u0bf4\u0c53\7I\2\2\u0bf5\u0c53\7J\2\2"+
		"\u0bf6\u0c53\7K\2\2\u0bf7\u0c53\7L\2\2\u0bf8\u0c53\7M\2\2\u0bf9\u0c53"+
		"\7N\2\2\u0bfa\u0c53\7O\2\2\u0bfb\u0c53\7P\2\2\u0bfc\u0c53\7Q\2\2\u0bfd"+
		"\u0c53\7R\2\2\u0bfe\u0c53\7S\2\2\u0bff\u0c53\7T\2\2\u0c00\u0c53\7U\2\2"+
		"\u0c01\u0c53\7V\2\2\u0c02\u0c53\7W\2\2\u0c03\u0c53\7X\2\2\u0c04\u0c53"+
		"\7Y\2\2\u0c05\u0c53\7Z\2\2\u0c06\u0c53\7[\2\2\u0c07\u0c53\7\\\2\2\u0c08"+
		"\u0c53\7]\2\2\u0c09\u0c53\7^\2\2\u0c0a\u0c53\7_\2\2\u0c0b\u0c53\7`\2\2"+
		"\u0c0c\u0c53\7a\2\2\u0c0d\u0c53\7b\2\2\u0c0e\u0c53\7c\2\2\u0c0f\u0c53"+
		"\7d\2\2\u0c10\u0c53\7e\2\2\u0c11\u0c53\7f\2\2\u0c12\u0c53\7g\2\2\u0c13"+
		"\u0c53\7h\2\2\u0c14\u0c53\7i\2\2\u0c15\u0c53\7j\2\2\u0c16\u0c53\7k\2\2"+
		"\u0c17\u0c53\7l\2\2\u0c18\u0c53\7m\2\2\u0c19\u0c53\7n\2\2\u0c1a\u0c53"+
		"\7o\2\2\u0c1b\u0c53\7p\2\2\u0c1c\u0c53\7q\2\2\u0c1d\u0c53\7u\2\2\u0c1e"+
		"\u0c53\7v\2\2\u0c1f\u0c53\7w\2\2\u0c20\u0c53\7x\2\2\u0c21\u0c53\7y\2\2"+
		"\u0c22\u0c53\7z\2\2\u0c23\u0c53\7{\2\2\u0c24\u0c53\7|\2\2\u0c25\u0c53"+
		"\7}\2\2\u0c26\u0c53\7~\2\2\u0c27\u0c53\7\177\2\2\u0c28\u0c53\7\u0080\2"+
		"\2\u0c29\u0c53\7\u0081\2\2\u0c2a\u0c53\7\u0082\2\2\u0c2b\u0c53\7\u0083"+
		"\2\2\u0c2c\u0c53\7\u0084\2\2\u0c2d\u0c53\7\u0085\2\2\u0c2e\u0c53\7\u0086"+
		"\2\2\u0c2f\u0c53\7\u0087\2\2\u0c30\u0c53\7\u0088\2\2\u0c31\u0c53\7\u0089"+
		"\2\2\u0c32\u0c53\7\u008a\2\2\u0c33\u0c53\7\u008b\2\2\u0c34\u0c53\7\u008c"+
		"\2\2\u0c35\u0c53\7\u008d\2\2\u0c36\u0c53\7\u008e\2\2\u0c37\u0c53\7\u008f"+
		"\2\2\u0c38\u0c53\7\u0090\2\2\u0c39\u0c53\7\u0091\2\2\u0c3a\u0c53\7\u0092"+
		"\2\2\u0c3b\u0c53\7\u0093\2\2\u0c3c\u0c53\7\u00be\2\2\u0c3d\u0c53\7\u00bf"+
		"\2\2\u0c3e\u0c53\7\u00c0\2\2\u0c3f\u0c53\7\u00c1\2\2\u0c40\u0c53\7\u00c2"+
		"\2\2\u0c41\u0c53\7\u00c3\2\2\u0c42\u0c53\7\u00c4\2\2\u0c43\u0c53\7\u00c5"+
		"\2\2\u0c44\u0c53\7\u00c6\2\2\u0c45\u0c53\7\u00c7\2\2\u0c46\u0c53\7\u00c8"+
		"\2\2\u0c47\u0c53\7\u00c9\2\2\u0c48\u0c53\7\u00ca\2\2\u0c49\u0c53\7\u00cb"+
		"\2\2\u0c4a\u0c53\7\u00cc\2\2\u0c4b\u0c53\7\u00cd\2\2\u0c4c\u0c53\7\u00ce"+
		"\2\2\u0c4d\u0c53\7\u00cf\2\2\u0c4e\u0c53\7\u00d0\2\2\u0c4f\u0c53\7\u00d1"+
		"\2\2\u0c50\u0c53\7\u00d2\2\2\u0c51\u0c53\7\u00e0\2\2\u0c52\u0bc4\3\2\2"+
		"\2\u0c52\u0bc5\3\2\2\2\u0c52\u0bc7\3\2\2\2\u0c52\u0bc8\3\2\2\2\u0c52\u0bc9"+
		"\3\2\2\2\u0c52\u0bca\3\2\2\2\u0c52\u0bcb\3\2\2\2\u0c52\u0bcc\3\2\2\2\u0c52"+
		"\u0bcd\3\2\2\2\u0c52\u0bce\3\2\2\2\u0c52\u0bcf\3\2\2\2\u0c52\u0bd0\3\2"+
		"\2\2\u0c52\u0bd1\3\2\2\2\u0c52\u0bd2\3\2\2\2\u0c52\u0bd3\3\2\2\2\u0c52"+
		"\u0bd4\3\2\2\2\u0c52\u0bd5\3\2\2\2\u0c52\u0bd6\3\2\2\2\u0c52\u0bd7\3\2"+
		"\2\2\u0c52\u0bd8\3\2\2\2\u0c52\u0bd9\3\2\2\2\u0c52\u0bda\3\2\2\2\u0c52"+
		"\u0bdb\3\2\2\2\u0c52\u0bdc\3\2\2\2\u0c52\u0bdd\3\2\2\2\u0c52\u0bde\3\2"+
		"\2\2\u0c52\u0bdf\3\2\2\2\u0c52\u0be0\3\2\2\2\u0c52\u0be1\3\2\2\2\u0c52"+
		"\u0be2\3\2\2\2\u0c52\u0be3\3\2\2\2\u0c52\u0be4\3\2\2\2\u0c52\u0be5\3\2"+
		"\2\2\u0c52\u0be6\3\2\2\2\u0c52\u0be7\3\2\2\2\u0c52\u0be8\3\2\2\2\u0c52"+
		"\u0be9\3\2\2\2\u0c52\u0bea\3\2\2\2\u0c52\u0beb\3\2\2\2\u0c52\u0bec\3\2"+
		"\2\2\u0c52\u0bed\3\2\2\2\u0c52\u0bee\3\2\2\2\u0c52\u0bef\3\2\2\2\u0c52"+
		"\u0bf0\3\2\2\2\u0c52\u0bf1\3\2\2\2\u0c52\u0bf2\3\2\2\2\u0c52\u0bf3\3\2"+
		"\2\2\u0c52\u0bf4\3\2\2\2\u0c52\u0bf5\3\2\2\2\u0c52\u0bf6\3\2\2\2\u0c52"+
		"\u0bf7\3\2\2\2\u0c52\u0bf8\3\2\2\2\u0c52\u0bf9\3\2\2\2\u0c52\u0bfa\3\2"+
		"\2\2\u0c52\u0bfb\3\2\2\2\u0c52\u0bfc\3\2\2\2\u0c52\u0bfd\3\2\2\2\u0c52"+
		"\u0bfe\3\2\2\2\u0c52\u0bff\3\2\2\2\u0c52\u0c00\3\2\2\2\u0c52\u0c01\3\2"+
		"\2\2\u0c52\u0c02\3\2\2\2\u0c52\u0c03\3\2\2\2\u0c52\u0c04\3\2\2\2\u0c52"+
		"\u0c05\3\2\2\2\u0c52\u0c06\3\2\2\2\u0c52\u0c07\3\2\2\2\u0c52\u0c08\3\2"+
		"\2\2\u0c52\u0c09\3\2\2\2\u0c52\u0c0a\3\2\2\2\u0c52\u0c0b\3\2\2\2\u0c52"+
		"\u0c0c\3\2\2\2\u0c52\u0c0d\3\2\2\2\u0c52\u0c0e\3\2\2\2\u0c52\u0c0f\3\2"+
		"\2\2\u0c52\u0c10\3\2\2\2\u0c52\u0c11\3\2\2\2\u0c52\u0c12\3\2\2\2\u0c52"+
		"\u0c13\3\2\2\2\u0c52\u0c14\3\2\2\2\u0c52\u0c15\3\2\2\2\u0c52\u0c16\3\2"+
		"\2\2\u0c52\u0c17\3\2\2\2\u0c52\u0c18\3\2\2\2\u0c52\u0c19\3\2\2\2\u0c52"+
		"\u0c1a\3\2\2\2\u0c52\u0c1b\3\2\2\2\u0c52\u0c1c\3\2\2\2\u0c52\u0c1d\3\2"+
		"\2\2\u0c52\u0c1e\3\2\2\2\u0c52\u0c1f\3\2\2\2\u0c52\u0c20\3\2\2\2\u0c52"+
		"\u0c21\3\2\2\2\u0c52\u0c22\3\2\2\2\u0c52\u0c23\3\2\2\2\u0c52\u0c24\3\2"+
		"\2\2\u0c52\u0c25\3\2\2\2\u0c52\u0c26\3\2\2\2\u0c52\u0c27\3\2\2\2\u0c52"+
		"\u0c28\3\2\2\2\u0c52\u0c29\3\2\2\2\u0c52\u0c2a\3\2\2\2\u0c52\u0c2b\3\2"+
		"\2\2\u0c52\u0c2c\3\2\2\2\u0c52\u0c2d\3\2\2\2\u0c52\u0c2e\3\2\2\2\u0c52"+
		"\u0c2f\3\2\2\2\u0c52\u0c30\3\2\2\2\u0c52\u0c31\3\2\2\2\u0c52\u0c32\3\2"+
		"\2\2\u0c52\u0c33\3\2\2\2\u0c52\u0c34\3\2\2\2\u0c52\u0c35\3\2\2\2\u0c52"+
		"\u0c36\3\2\2\2\u0c52\u0c37\3\2\2\2\u0c52\u0c38\3\2\2\2\u0c52\u0c39\3\2"+
		"\2\2\u0c52\u0c3a\3\2\2\2\u0c52\u0c3b\3\2\2\2\u0c52\u0c3c\3\2\2\2\u0c52"+
		"\u0c3d\3\2\2\2\u0c52\u0c3e\3\2\2\2\u0c52\u0c3f\3\2\2\2\u0c52\u0c40\3\2"+
		"\2\2\u0c52\u0c41\3\2\2\2\u0c52\u0c42\3\2\2\2\u0c52\u0c43\3\2\2\2\u0c52"+
		"\u0c44\3\2\2\2\u0c52\u0c45\3\2\2\2\u0c52\u0c46\3\2\2\2\u0c52\u0c47\3\2"+
		"\2\2\u0c52\u0c48\3\2\2\2\u0c52\u0c49\3\2\2\2\u0c52\u0c4a\3\2\2\2\u0c52"+
		"\u0c4b\3\2\2\2\u0c52\u0c4c\3\2\2\2\u0c52\u0c4d\3\2\2\2\u0c52\u0c4e\3\2"+
		"\2\2\u0c52\u0c4f\3\2\2\2\u0c52\u0c50\3\2\2\2\u0c52\u0c51\3\2\2\2\u0c53"+
		"\u02ab\3\2\2\2\u0109\u02ad\u02b0\u02b6\u02bb\u02bd\u02c2\u02c5\u02c8\u02f4"+
		"\u0305\u0308\u030f\u0314\u031f\u0329\u0338\u0343\u0348\u0353\u0357\u035c"+
		"\u0364\u0369\u036d\u0372\u0377\u0386\u038c\u0391\u039b\u03a0\u03aa\u03af"+
		"\u03b4\u03bb\u03c3\u03d0\u03dc\u03e0\u03e4\u03e9\u03ee\u0401\u0408\u0410"+
		"\u0414\u0419\u042c\u0435\u0444\u0446\u0452\u0460\u0467\u046e\u0476\u0481"+
		"\u0495\u04a0\u04b7\u04c5\u04cc\u04d5\u04e8\u04f0\u04f6\u04fb\u0502\u0507"+
		"\u050f\u0514\u051b\u0520\u0527\u052c\u0533\u053a\u0541\u0548\u054d\u0554"+
		"\u055b\u0560\u0567\u056c\u0573\u0577\u057b\u0580\u0584\u0594\u05a0\u05a7"+
		"\u05b0\u05be\u05c6\u05cc\u05d1\u05df\u05e7\u05ef\u05f7\u0600\u060c\u0610"+
		"\u0614\u0622\u062a\u0633\u063e\u0643\u064a\u064d\u0653\u065e\u0661\u0667"+
		"\u0670\u0679\u067d\u067f\u0685\u068b\u0691\u0697\u069d\u06a3\u06a9\u06af"+
		"\u06b5\u06bb\u06c1\u06c7\u06cd\u06d3\u06d9\u06db\u06e1\u06e7\u06ee\u06f1"+
		"\u06f6\u06f9\u06fc\u06ff\u0702\u0704\u070c\u070f\u0715\u0718\u071e\u0721"+
		"\u0727\u072a\u0730\u0733\u0739\u073c\u0742\u0745\u074b\u074e\u0754\u0757"+
		"\u075d\u0763\u076b\u076e\u0774\u0777\u077d\u0785\u078d\u0796\u079f\u07a2"+
		"\u07a8\u07ab\u07b1\u07b4\u07ba\u07bd\u07c5\u07c8\u07ce\u07d1\u07d7\u07da"+
		"\u07e0\u07e3\u07e5\u07e9\u07f0\u0807\u080b\u080f\u0814\u081c\u0824\u0828"+
		"\u082b\u0831\u0835\u083c\u0847\u0854\u085d\u0890\u0899\u089c\u08ac\u08b8"+
		"\u08c4\u08d0\u08d8\u08db\u08e3\u08e6\u08eb\u08f2\u08f6\u08fa\u08fd\u090f"+
		"\u0929\u0935\u093e\u0947\u094b\u094e\u0953\u0956\u0959\u095c\u096c\u0975"+
		"\u097e\u0985\u0990\u0996\u0998\u09a0\u09b9\u09c4\u09d0\u09dc\u09e7\u09ec"+
		"\u0a00\u0a04\u0a09\u0a0f\u0a13\u0a1f\u0a30\u0a37\u0a3e\u0a42\u0a60\u0a69"+
		"\u0a70\u0c52";
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