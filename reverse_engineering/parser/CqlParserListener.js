// Generated from grammars/CqlParser.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by CqlParser.
function CqlParserListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

CqlParserListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
CqlParserListener.prototype.constructor = CqlParserListener;

// Enter a parse tree produced by CqlParser#root.
CqlParserListener.prototype.enterRoot = function(ctx) {
};

// Exit a parse tree produced by CqlParser#root.
CqlParserListener.prototype.exitRoot = function(ctx) {
};


// Enter a parse tree produced by CqlParser#cqls.
CqlParserListener.prototype.enterCqls = function(ctx) {
};

// Exit a parse tree produced by CqlParser#cqls.
CqlParserListener.prototype.exitCqls = function(ctx) {
};


// Enter a parse tree produced by CqlParser#statementSeparator.
CqlParserListener.prototype.enterStatementSeparator = function(ctx) {
};

// Exit a parse tree produced by CqlParser#statementSeparator.
CqlParserListener.prototype.exitStatementSeparator = function(ctx) {
};


// Enter a parse tree produced by CqlParser#empty.
CqlParserListener.prototype.enterEmpty = function(ctx) {
};

// Exit a parse tree produced by CqlParser#empty.
CqlParserListener.prototype.exitEmpty = function(ctx) {
};


// Enter a parse tree produced by CqlParser#cql.
CqlParserListener.prototype.enterCql = function(ctx) {
};

// Exit a parse tree produced by CqlParser#cql.
CqlParserListener.prototype.exitCql = function(ctx) {
};


// Enter a parse tree produced by CqlParser#revoke.
CqlParserListener.prototype.enterRevoke = function(ctx) {
};

// Exit a parse tree produced by CqlParser#revoke.
CqlParserListener.prototype.exitRevoke = function(ctx) {
};


// Enter a parse tree produced by CqlParser#listUsers.
CqlParserListener.prototype.enterListUsers = function(ctx) {
};

// Exit a parse tree produced by CqlParser#listUsers.
CqlParserListener.prototype.exitListUsers = function(ctx) {
};


// Enter a parse tree produced by CqlParser#listRoles.
CqlParserListener.prototype.enterListRoles = function(ctx) {
};

// Exit a parse tree produced by CqlParser#listRoles.
CqlParserListener.prototype.exitListRoles = function(ctx) {
};


// Enter a parse tree produced by CqlParser#listPermissions.
CqlParserListener.prototype.enterListPermissions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#listPermissions.
CqlParserListener.prototype.exitListPermissions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#grant.
CqlParserListener.prototype.enterGrant = function(ctx) {
};

// Exit a parse tree produced by CqlParser#grant.
CqlParserListener.prototype.exitGrant = function(ctx) {
};


// Enter a parse tree produced by CqlParser#priviledge.
CqlParserListener.prototype.enterPriviledge = function(ctx) {
};

// Exit a parse tree produced by CqlParser#priviledge.
CqlParserListener.prototype.exitPriviledge = function(ctx) {
};


// Enter a parse tree produced by CqlParser#resource.
CqlParserListener.prototype.enterResource = function(ctx) {
};

// Exit a parse tree produced by CqlParser#resource.
CqlParserListener.prototype.exitResource = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createUser.
CqlParserListener.prototype.enterCreateUser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createUser.
CqlParserListener.prototype.exitCreateUser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createRole.
CqlParserListener.prototype.enterCreateRole = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createRole.
CqlParserListener.prototype.exitCreateRole = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createType.
CqlParserListener.prototype.enterCreateType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createType.
CqlParserListener.prototype.exitCreateType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#typeMemberColumnList.
CqlParserListener.prototype.enterTypeMemberColumnList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#typeMemberColumnList.
CqlParserListener.prototype.exitTypeMemberColumnList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createTrigger.
CqlParserListener.prototype.enterCreateTrigger = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createTrigger.
CqlParserListener.prototype.exitCreateTrigger = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createMaterializedView.
CqlParserListener.prototype.enterCreateMaterializedView = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createMaterializedView.
CqlParserListener.prototype.exitCreateMaterializedView = function(ctx) {
};


// Enter a parse tree produced by CqlParser#materializedViewWhere.
CqlParserListener.prototype.enterMaterializedViewWhere = function(ctx) {
};

// Exit a parse tree produced by CqlParser#materializedViewWhere.
CqlParserListener.prototype.exitMaterializedViewWhere = function(ctx) {
};


// Enter a parse tree produced by CqlParser#columnNotNullList.
CqlParserListener.prototype.enterColumnNotNullList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#columnNotNullList.
CqlParserListener.prototype.exitColumnNotNullList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#columnNotNull.
CqlParserListener.prototype.enterColumnNotNull = function(ctx) {
};

// Exit a parse tree produced by CqlParser#columnNotNull.
CqlParserListener.prototype.exitColumnNotNull = function(ctx) {
};


// Enter a parse tree produced by CqlParser#materializedViewOptions.
CqlParserListener.prototype.enterMaterializedViewOptions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#materializedViewOptions.
CqlParserListener.prototype.exitMaterializedViewOptions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createKeyspace.
CqlParserListener.prototype.enterCreateKeyspace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createKeyspace.
CqlParserListener.prototype.exitCreateKeyspace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createFunction.
CqlParserListener.prototype.enterCreateFunction = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createFunction.
CqlParserListener.prototype.exitCreateFunction = function(ctx) {
};


// Enter a parse tree produced by CqlParser#codeBlock.
CqlParserListener.prototype.enterCodeBlock = function(ctx) {
};

// Exit a parse tree produced by CqlParser#codeBlock.
CqlParserListener.prototype.exitCodeBlock = function(ctx) {
};


// Enter a parse tree produced by CqlParser#paramList.
CqlParserListener.prototype.enterParamList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#paramList.
CqlParserListener.prototype.exitParamList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#returnMode.
CqlParserListener.prototype.enterReturnMode = function(ctx) {
};

// Exit a parse tree produced by CqlParser#returnMode.
CqlParserListener.prototype.exitReturnMode = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createAggregate.
CqlParserListener.prototype.enterCreateAggregate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createAggregate.
CqlParserListener.prototype.exitCreateAggregate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#initCondDefinition.
CqlParserListener.prototype.enterInitCondDefinition = function(ctx) {
};

// Exit a parse tree produced by CqlParser#initCondDefinition.
CqlParserListener.prototype.exitInitCondDefinition = function(ctx) {
};


// Enter a parse tree produced by CqlParser#initCondHash.
CqlParserListener.prototype.enterInitCondHash = function(ctx) {
};

// Exit a parse tree produced by CqlParser#initCondHash.
CqlParserListener.prototype.exitInitCondHash = function(ctx) {
};


// Enter a parse tree produced by CqlParser#initCondHashItem.
CqlParserListener.prototype.enterInitCondHashItem = function(ctx) {
};

// Exit a parse tree produced by CqlParser#initCondHashItem.
CqlParserListener.prototype.exitInitCondHashItem = function(ctx) {
};


// Enter a parse tree produced by CqlParser#initCondListNested.
CqlParserListener.prototype.enterInitCondListNested = function(ctx) {
};

// Exit a parse tree produced by CqlParser#initCondListNested.
CqlParserListener.prototype.exitInitCondListNested = function(ctx) {
};


// Enter a parse tree produced by CqlParser#initCondList.
CqlParserListener.prototype.enterInitCondList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#initCondList.
CqlParserListener.prototype.exitInitCondList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#orReplace.
CqlParserListener.prototype.enterOrReplace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#orReplace.
CqlParserListener.prototype.exitOrReplace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterUser.
CqlParserListener.prototype.enterAlterUser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterUser.
CqlParserListener.prototype.exitAlterUser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#userPassword.
CqlParserListener.prototype.enterUserPassword = function(ctx) {
};

// Exit a parse tree produced by CqlParser#userPassword.
CqlParserListener.prototype.exitUserPassword = function(ctx) {
};


// Enter a parse tree produced by CqlParser#userSuperUser.
CqlParserListener.prototype.enterUserSuperUser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#userSuperUser.
CqlParserListener.prototype.exitUserSuperUser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterType.
CqlParserListener.prototype.enterAlterType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterType.
CqlParserListener.prototype.exitAlterType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTypeOperation.
CqlParserListener.prototype.enterAlterTypeOperation = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTypeOperation.
CqlParserListener.prototype.exitAlterTypeOperation = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTypeRename.
CqlParserListener.prototype.enterAlterTypeRename = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTypeRename.
CqlParserListener.prototype.exitAlterTypeRename = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTypeRenameList.
CqlParserListener.prototype.enterAlterTypeRenameList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTypeRenameList.
CqlParserListener.prototype.exitAlterTypeRenameList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTypeRenameItem.
CqlParserListener.prototype.enterAlterTypeRenameItem = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTypeRenameItem.
CqlParserListener.prototype.exitAlterTypeRenameItem = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTypeAdd.
CqlParserListener.prototype.enterAlterTypeAdd = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTypeAdd.
CqlParserListener.prototype.exitAlterTypeAdd = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTypeAlterType.
CqlParserListener.prototype.enterAlterTypeAlterType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTypeAlterType.
CqlParserListener.prototype.exitAlterTypeAlterType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTable.
CqlParserListener.prototype.enterAlterTable = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTable.
CqlParserListener.prototype.exitAlterTable = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableOperation.
CqlParserListener.prototype.enterAlterTableOperation = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableOperation.
CqlParserListener.prototype.exitAlterTableOperation = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableWith.
CqlParserListener.prototype.enterAlterTableWith = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableWith.
CqlParserListener.prototype.exitAlterTableWith = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableRename.
CqlParserListener.prototype.enterAlterTableRename = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableRename.
CqlParserListener.prototype.exitAlterTableRename = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableDropCompactStorage.
CqlParserListener.prototype.enterAlterTableDropCompactStorage = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableDropCompactStorage.
CqlParserListener.prototype.exitAlterTableDropCompactStorage = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableDropColumns.
CqlParserListener.prototype.enterAlterTableDropColumns = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableDropColumns.
CqlParserListener.prototype.exitAlterTableDropColumns = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableDropColumnList.
CqlParserListener.prototype.enterAlterTableDropColumnList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableDropColumnList.
CqlParserListener.prototype.exitAlterTableDropColumnList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableAdd.
CqlParserListener.prototype.enterAlterTableAdd = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableAdd.
CqlParserListener.prototype.exitAlterTableAdd = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterTableColumnDefinition.
CqlParserListener.prototype.enterAlterTableColumnDefinition = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterTableColumnDefinition.
CqlParserListener.prototype.exitAlterTableColumnDefinition = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterRole.
CqlParserListener.prototype.enterAlterRole = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterRole.
CqlParserListener.prototype.exitAlterRole = function(ctx) {
};


// Enter a parse tree produced by CqlParser#roleWith.
CqlParserListener.prototype.enterRoleWith = function(ctx) {
};

// Exit a parse tree produced by CqlParser#roleWith.
CqlParserListener.prototype.exitRoleWith = function(ctx) {
};


// Enter a parse tree produced by CqlParser#roleWithOptions.
CqlParserListener.prototype.enterRoleWithOptions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#roleWithOptions.
CqlParserListener.prototype.exitRoleWithOptions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterMaterializedView.
CqlParserListener.prototype.enterAlterMaterializedView = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterMaterializedView.
CqlParserListener.prototype.exitAlterMaterializedView = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropUser.
CqlParserListener.prototype.enterDropUser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropUser.
CqlParserListener.prototype.exitDropUser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropType.
CqlParserListener.prototype.enterDropType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropType.
CqlParserListener.prototype.exitDropType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropMaterializedView.
CqlParserListener.prototype.enterDropMaterializedView = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropMaterializedView.
CqlParserListener.prototype.exitDropMaterializedView = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropAggregate.
CqlParserListener.prototype.enterDropAggregate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropAggregate.
CqlParserListener.prototype.exitDropAggregate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropFunction.
CqlParserListener.prototype.enterDropFunction = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropFunction.
CqlParserListener.prototype.exitDropFunction = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropTrigger.
CqlParserListener.prototype.enterDropTrigger = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropTrigger.
CqlParserListener.prototype.exitDropTrigger = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropRole.
CqlParserListener.prototype.enterDropRole = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropRole.
CqlParserListener.prototype.exitDropRole = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropTable.
CqlParserListener.prototype.enterDropTable = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropTable.
CqlParserListener.prototype.exitDropTable = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropKeyspace.
CqlParserListener.prototype.enterDropKeyspace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropKeyspace.
CqlParserListener.prototype.exitDropKeyspace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dropIndex.
CqlParserListener.prototype.enterDropIndex = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dropIndex.
CqlParserListener.prototype.exitDropIndex = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createTable.
CqlParserListener.prototype.enterCreateTable = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createTable.
CqlParserListener.prototype.exitCreateTable = function(ctx) {
};


// Enter a parse tree produced by CqlParser#withElement.
CqlParserListener.prototype.enterWithElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#withElement.
CqlParserListener.prototype.exitWithElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#clusteringOrderColumns.
CqlParserListener.prototype.enterClusteringOrderColumns = function(ctx) {
};

// Exit a parse tree produced by CqlParser#clusteringOrderColumns.
CqlParserListener.prototype.exitClusteringOrderColumns = function(ctx) {
};


// Enter a parse tree produced by CqlParser#clusteringOrder.
CqlParserListener.prototype.enterClusteringOrder = function(ctx) {
};

// Exit a parse tree produced by CqlParser#clusteringOrder.
CqlParserListener.prototype.exitClusteringOrder = function(ctx) {
};


// Enter a parse tree produced by CqlParser#tableOptions.
CqlParserListener.prototype.enterTableOptions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#tableOptions.
CqlParserListener.prototype.exitTableOptions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#tableOptionItem.
CqlParserListener.prototype.enterTableOptionItem = function(ctx) {
};

// Exit a parse tree produced by CqlParser#tableOptionItem.
CqlParserListener.prototype.exitTableOptionItem = function(ctx) {
};


// Enter a parse tree produced by CqlParser#tableOptionName.
CqlParserListener.prototype.enterTableOptionName = function(ctx) {
};

// Exit a parse tree produced by CqlParser#tableOptionName.
CqlParserListener.prototype.exitTableOptionName = function(ctx) {
};


// Enter a parse tree produced by CqlParser#tableOptionValue.
CqlParserListener.prototype.enterTableOptionValue = function(ctx) {
};

// Exit a parse tree produced by CqlParser#tableOptionValue.
CqlParserListener.prototype.exitTableOptionValue = function(ctx) {
};


// Enter a parse tree produced by CqlParser#optionHash.
CqlParserListener.prototype.enterOptionHash = function(ctx) {
};

// Exit a parse tree produced by CqlParser#optionHash.
CqlParserListener.prototype.exitOptionHash = function(ctx) {
};


// Enter a parse tree produced by CqlParser#optionHashItem.
CqlParserListener.prototype.enterOptionHashItem = function(ctx) {
};

// Exit a parse tree produced by CqlParser#optionHashItem.
CqlParserListener.prototype.exitOptionHashItem = function(ctx) {
};


// Enter a parse tree produced by CqlParser#optionHashKey.
CqlParserListener.prototype.enterOptionHashKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#optionHashKey.
CqlParserListener.prototype.exitOptionHashKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#optionHashValue.
CqlParserListener.prototype.enterOptionHashValue = function(ctx) {
};

// Exit a parse tree produced by CqlParser#optionHashValue.
CqlParserListener.prototype.exitOptionHashValue = function(ctx) {
};


// Enter a parse tree produced by CqlParser#columnDefinitionList.
CqlParserListener.prototype.enterColumnDefinitionList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#columnDefinitionList.
CqlParserListener.prototype.exitColumnDefinitionList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#columnDefinition.
CqlParserListener.prototype.enterColumnDefinition = function(ctx) {
};

// Exit a parse tree produced by CqlParser#columnDefinition.
CqlParserListener.prototype.exitColumnDefinition = function(ctx) {
};


// Enter a parse tree produced by CqlParser#primaryKeyColumn.
CqlParserListener.prototype.enterPrimaryKeyColumn = function(ctx) {
};

// Exit a parse tree produced by CqlParser#primaryKeyColumn.
CqlParserListener.prototype.exitPrimaryKeyColumn = function(ctx) {
};


// Enter a parse tree produced by CqlParser#primaryKeyElement.
CqlParserListener.prototype.enterPrimaryKeyElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#primaryKeyElement.
CqlParserListener.prototype.exitPrimaryKeyElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#primaryKeyDefinition.
CqlParserListener.prototype.enterPrimaryKeyDefinition = function(ctx) {
};

// Exit a parse tree produced by CqlParser#primaryKeyDefinition.
CqlParserListener.prototype.exitPrimaryKeyDefinition = function(ctx) {
};


// Enter a parse tree produced by CqlParser#singlePrimaryKey.
CqlParserListener.prototype.enterSinglePrimaryKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#singlePrimaryKey.
CqlParserListener.prototype.exitSinglePrimaryKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#compoundKey.
CqlParserListener.prototype.enterCompoundKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#compoundKey.
CqlParserListener.prototype.exitCompoundKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#compositeKey.
CqlParserListener.prototype.enterCompositeKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#compositeKey.
CqlParserListener.prototype.exitCompositeKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#partitionKeyList.
CqlParserListener.prototype.enterPartitionKeyList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#partitionKeyList.
CqlParserListener.prototype.exitPartitionKeyList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#clusteringKeyList.
CqlParserListener.prototype.enterClusteringKeyList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#clusteringKeyList.
CqlParserListener.prototype.exitClusteringKeyList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#partitionKey.
CqlParserListener.prototype.enterPartitionKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#partitionKey.
CqlParserListener.prototype.exitPartitionKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#clusteringKey.
CqlParserListener.prototype.enterClusteringKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#clusteringKey.
CqlParserListener.prototype.exitClusteringKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#applyBatch.
CqlParserListener.prototype.enterApplyBatch = function(ctx) {
};

// Exit a parse tree produced by CqlParser#applyBatch.
CqlParserListener.prototype.exitApplyBatch = function(ctx) {
};


// Enter a parse tree produced by CqlParser#beginBatch.
CqlParserListener.prototype.enterBeginBatch = function(ctx) {
};

// Exit a parse tree produced by CqlParser#beginBatch.
CqlParserListener.prototype.exitBeginBatch = function(ctx) {
};


// Enter a parse tree produced by CqlParser#batchType.
CqlParserListener.prototype.enterBatchType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#batchType.
CqlParserListener.prototype.exitBatchType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#alterKeyspace.
CqlParserListener.prototype.enterAlterKeyspace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#alterKeyspace.
CqlParserListener.prototype.exitAlterKeyspace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#replicationList.
CqlParserListener.prototype.enterReplicationList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#replicationList.
CqlParserListener.prototype.exitReplicationList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#replicationListItem.
CqlParserListener.prototype.enterReplicationListItem = function(ctx) {
};

// Exit a parse tree produced by CqlParser#replicationListItem.
CqlParserListener.prototype.exitReplicationListItem = function(ctx) {
};


// Enter a parse tree produced by CqlParser#durableWrites.
CqlParserListener.prototype.enterDurableWrites = function(ctx) {
};

// Exit a parse tree produced by CqlParser#durableWrites.
CqlParserListener.prototype.exitDurableWrites = function(ctx) {
};


// Enter a parse tree produced by CqlParser#use.
CqlParserListener.prototype.enterUse = function(ctx) {
};

// Exit a parse tree produced by CqlParser#use.
CqlParserListener.prototype.exitUse = function(ctx) {
};


// Enter a parse tree produced by CqlParser#truncate.
CqlParserListener.prototype.enterTruncate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#truncate.
CqlParserListener.prototype.exitTruncate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#createIndex.
CqlParserListener.prototype.enterCreateIndex = function(ctx) {
};

// Exit a parse tree produced by CqlParser#createIndex.
CqlParserListener.prototype.exitCreateIndex = function(ctx) {
};


// Enter a parse tree produced by CqlParser#indexName.
CqlParserListener.prototype.enterIndexName = function(ctx) {
};

// Exit a parse tree produced by CqlParser#indexName.
CqlParserListener.prototype.exitIndexName = function(ctx) {
};


// Enter a parse tree produced by CqlParser#indexColumnSpec.
CqlParserListener.prototype.enterIndexColumnSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#indexColumnSpec.
CqlParserListener.prototype.exitIndexColumnSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#indexKeysSpec.
CqlParserListener.prototype.enterIndexKeysSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#indexKeysSpec.
CqlParserListener.prototype.exitIndexKeysSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#indexEntriesSSpec.
CqlParserListener.prototype.enterIndexEntriesSSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#indexEntriesSSpec.
CqlParserListener.prototype.exitIndexEntriesSSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#indexFullSpec.
CqlParserListener.prototype.enterIndexFullSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#indexFullSpec.
CqlParserListener.prototype.exitIndexFullSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#deleteStatement.
CqlParserListener.prototype.enterDeleteStatement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#deleteStatement.
CqlParserListener.prototype.exitDeleteStatement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#deleteColumnList.
CqlParserListener.prototype.enterDeleteColumnList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#deleteColumnList.
CqlParserListener.prototype.exitDeleteColumnList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#deleteColumnItem.
CqlParserListener.prototype.enterDeleteColumnItem = function(ctx) {
};

// Exit a parse tree produced by CqlParser#deleteColumnItem.
CqlParserListener.prototype.exitDeleteColumnItem = function(ctx) {
};


// Enter a parse tree produced by CqlParser#update.
CqlParserListener.prototype.enterUpdate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#update.
CqlParserListener.prototype.exitUpdate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#ifSpec.
CqlParserListener.prototype.enterIfSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#ifSpec.
CqlParserListener.prototype.exitIfSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#ifConditionList.
CqlParserListener.prototype.enterIfConditionList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#ifConditionList.
CqlParserListener.prototype.exitIfConditionList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#ifCondition.
CqlParserListener.prototype.enterIfCondition = function(ctx) {
};

// Exit a parse tree produced by CqlParser#ifCondition.
CqlParserListener.prototype.exitIfCondition = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignments.
CqlParserListener.prototype.enterAssignments = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignments.
CqlParserListener.prototype.exitAssignments = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignmentElement.
CqlParserListener.prototype.enterAssignmentElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignmentElement.
CqlParserListener.prototype.exitAssignmentElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignmentSet.
CqlParserListener.prototype.enterAssignmentSet = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignmentSet.
CqlParserListener.prototype.exitAssignmentSet = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignmentMap.
CqlParserListener.prototype.enterAssignmentMap = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignmentMap.
CqlParserListener.prototype.exitAssignmentMap = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignmentMapExpression.
CqlParserListener.prototype.enterAssignmentMapExpression = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignmentMapExpression.
CqlParserListener.prototype.exitAssignmentMapExpression = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignmentList.
CqlParserListener.prototype.enterAssignmentList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignmentList.
CqlParserListener.prototype.exitAssignmentList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#assignmentTuple.
CqlParserListener.prototype.enterAssignmentTuple = function(ctx) {
};

// Exit a parse tree produced by CqlParser#assignmentTuple.
CqlParserListener.prototype.exitAssignmentTuple = function(ctx) {
};


// Enter a parse tree produced by CqlParser#insert.
CqlParserListener.prototype.enterInsert = function(ctx) {
};

// Exit a parse tree produced by CqlParser#insert.
CqlParserListener.prototype.exitInsert = function(ctx) {
};


// Enter a parse tree produced by CqlParser#usingTtlTimestamp.
CqlParserListener.prototype.enterUsingTtlTimestamp = function(ctx) {
};

// Exit a parse tree produced by CqlParser#usingTtlTimestamp.
CqlParserListener.prototype.exitUsingTtlTimestamp = function(ctx) {
};


// Enter a parse tree produced by CqlParser#timestamp.
CqlParserListener.prototype.enterTimestamp = function(ctx) {
};

// Exit a parse tree produced by CqlParser#timestamp.
CqlParserListener.prototype.exitTimestamp = function(ctx) {
};


// Enter a parse tree produced by CqlParser#ttl.
CqlParserListener.prototype.enterTtl = function(ctx) {
};

// Exit a parse tree produced by CqlParser#ttl.
CqlParserListener.prototype.exitTtl = function(ctx) {
};


// Enter a parse tree produced by CqlParser#usingTimestampSpec.
CqlParserListener.prototype.enterUsingTimestampSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#usingTimestampSpec.
CqlParserListener.prototype.exitUsingTimestampSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#ifNotExist.
CqlParserListener.prototype.enterIfNotExist = function(ctx) {
};

// Exit a parse tree produced by CqlParser#ifNotExist.
CqlParserListener.prototype.exitIfNotExist = function(ctx) {
};


// Enter a parse tree produced by CqlParser#ifExist.
CqlParserListener.prototype.enterIfExist = function(ctx) {
};

// Exit a parse tree produced by CqlParser#ifExist.
CqlParserListener.prototype.exitIfExist = function(ctx) {
};


// Enter a parse tree produced by CqlParser#insertValuesSpec.
CqlParserListener.prototype.enterInsertValuesSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#insertValuesSpec.
CqlParserListener.prototype.exitInsertValuesSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#insertColumnSpec.
CqlParserListener.prototype.enterInsertColumnSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#insertColumnSpec.
CqlParserListener.prototype.exitInsertColumnSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#columnList.
CqlParserListener.prototype.enterColumnList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#columnList.
CqlParserListener.prototype.exitColumnList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#expressionList.
CqlParserListener.prototype.enterExpressionList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#expressionList.
CqlParserListener.prototype.exitExpressionList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#expression.
CqlParserListener.prototype.enterExpression = function(ctx) {
};

// Exit a parse tree produced by CqlParser#expression.
CqlParserListener.prototype.exitExpression = function(ctx) {
};


// Enter a parse tree produced by CqlParser#select.
CqlParserListener.prototype.enterSelect = function(ctx) {
};

// Exit a parse tree produced by CqlParser#select.
CqlParserListener.prototype.exitSelect = function(ctx) {
};


// Enter a parse tree produced by CqlParser#allowFilteringSpec.
CqlParserListener.prototype.enterAllowFilteringSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#allowFilteringSpec.
CqlParserListener.prototype.exitAllowFilteringSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#limitSpec.
CqlParserListener.prototype.enterLimitSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#limitSpec.
CqlParserListener.prototype.exitLimitSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#fromSpec.
CqlParserListener.prototype.enterFromSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#fromSpec.
CqlParserListener.prototype.exitFromSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#fromSpecElement.
CqlParserListener.prototype.enterFromSpecElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#fromSpecElement.
CqlParserListener.prototype.exitFromSpecElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#orderSpec.
CqlParserListener.prototype.enterOrderSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#orderSpec.
CqlParserListener.prototype.exitOrderSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#orderSpecElement.
CqlParserListener.prototype.enterOrderSpecElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#orderSpecElement.
CqlParserListener.prototype.exitOrderSpecElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#whereSpec.
CqlParserListener.prototype.enterWhereSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#whereSpec.
CqlParserListener.prototype.exitWhereSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#distinctSpec.
CqlParserListener.prototype.enterDistinctSpec = function(ctx) {
};

// Exit a parse tree produced by CqlParser#distinctSpec.
CqlParserListener.prototype.exitDistinctSpec = function(ctx) {
};


// Enter a parse tree produced by CqlParser#selectElements.
CqlParserListener.prototype.enterSelectElements = function(ctx) {
};

// Exit a parse tree produced by CqlParser#selectElements.
CqlParserListener.prototype.exitSelectElements = function(ctx) {
};


// Enter a parse tree produced by CqlParser#selectElement.
CqlParserListener.prototype.enterSelectElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#selectElement.
CqlParserListener.prototype.exitSelectElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#relationElements.
CqlParserListener.prototype.enterRelationElements = function(ctx) {
};

// Exit a parse tree produced by CqlParser#relationElements.
CqlParserListener.prototype.exitRelationElements = function(ctx) {
};


// Enter a parse tree produced by CqlParser#relationElement.
CqlParserListener.prototype.enterRelationElement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#relationElement.
CqlParserListener.prototype.exitRelationElement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#relalationContains.
CqlParserListener.prototype.enterRelalationContains = function(ctx) {
};

// Exit a parse tree produced by CqlParser#relalationContains.
CqlParserListener.prototype.exitRelalationContains = function(ctx) {
};


// Enter a parse tree produced by CqlParser#relalationContainsKey.
CqlParserListener.prototype.enterRelalationContainsKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#relalationContainsKey.
CqlParserListener.prototype.exitRelalationContainsKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#functionCall.
CqlParserListener.prototype.enterFunctionCall = function(ctx) {
};

// Exit a parse tree produced by CqlParser#functionCall.
CqlParserListener.prototype.exitFunctionCall = function(ctx) {
};


// Enter a parse tree produced by CqlParser#functionArgs.
CqlParserListener.prototype.enterFunctionArgs = function(ctx) {
};

// Exit a parse tree produced by CqlParser#functionArgs.
CqlParserListener.prototype.exitFunctionArgs = function(ctx) {
};


// Enter a parse tree produced by CqlParser#constant.
CqlParserListener.prototype.enterConstant = function(ctx) {
};

// Exit a parse tree produced by CqlParser#constant.
CqlParserListener.prototype.exitConstant = function(ctx) {
};


// Enter a parse tree produced by CqlParser#decimalLiteral.
CqlParserListener.prototype.enterDecimalLiteral = function(ctx) {
};

// Exit a parse tree produced by CqlParser#decimalLiteral.
CqlParserListener.prototype.exitDecimalLiteral = function(ctx) {
};


// Enter a parse tree produced by CqlParser#floatLiteral.
CqlParserListener.prototype.enterFloatLiteral = function(ctx) {
};

// Exit a parse tree produced by CqlParser#floatLiteral.
CqlParserListener.prototype.exitFloatLiteral = function(ctx) {
};


// Enter a parse tree produced by CqlParser#stringLiteral.
CqlParserListener.prototype.enterStringLiteral = function(ctx) {
};

// Exit a parse tree produced by CqlParser#stringLiteral.
CqlParserListener.prototype.exitStringLiteral = function(ctx) {
};


// Enter a parse tree produced by CqlParser#booleanLiteral.
CqlParserListener.prototype.enterBooleanLiteral = function(ctx) {
};

// Exit a parse tree produced by CqlParser#booleanLiteral.
CqlParserListener.prototype.exitBooleanLiteral = function(ctx) {
};


// Enter a parse tree produced by CqlParser#hexadecimalLiteral.
CqlParserListener.prototype.enterHexadecimalLiteral = function(ctx) {
};

// Exit a parse tree produced by CqlParser#hexadecimalLiteral.
CqlParserListener.prototype.exitHexadecimalLiteral = function(ctx) {
};


// Enter a parse tree produced by CqlParser#keyspace.
CqlParserListener.prototype.enterKeyspace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#keyspace.
CqlParserListener.prototype.exitKeyspace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#table.
CqlParserListener.prototype.enterTable = function(ctx) {
};

// Exit a parse tree produced by CqlParser#table.
CqlParserListener.prototype.exitTable = function(ctx) {
};


// Enter a parse tree produced by CqlParser#column.
CqlParserListener.prototype.enterColumn = function(ctx) {
};

// Exit a parse tree produced by CqlParser#column.
CqlParserListener.prototype.exitColumn = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dataType.
CqlParserListener.prototype.enterDataType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dataType.
CqlParserListener.prototype.exitDataType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dataTypeName.
CqlParserListener.prototype.enterDataTypeName = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dataTypeName.
CqlParserListener.prototype.exitDataTypeName = function(ctx) {
};


// Enter a parse tree produced by CqlParser#dataTypeDefinition.
CqlParserListener.prototype.enterDataTypeDefinition = function(ctx) {
};

// Exit a parse tree produced by CqlParser#dataTypeDefinition.
CqlParserListener.prototype.exitDataTypeDefinition = function(ctx) {
};


// Enter a parse tree produced by CqlParser#orderDirection.
CqlParserListener.prototype.enterOrderDirection = function(ctx) {
};

// Exit a parse tree produced by CqlParser#orderDirection.
CqlParserListener.prototype.exitOrderDirection = function(ctx) {
};


// Enter a parse tree produced by CqlParser#role.
CqlParserListener.prototype.enterRole = function(ctx) {
};

// Exit a parse tree produced by CqlParser#role.
CqlParserListener.prototype.exitRole = function(ctx) {
};


// Enter a parse tree produced by CqlParser#trigger.
CqlParserListener.prototype.enterTrigger = function(ctx) {
};

// Exit a parse tree produced by CqlParser#trigger.
CqlParserListener.prototype.exitTrigger = function(ctx) {
};


// Enter a parse tree produced by CqlParser#triggerClass.
CqlParserListener.prototype.enterTriggerClass = function(ctx) {
};

// Exit a parse tree produced by CqlParser#triggerClass.
CqlParserListener.prototype.exitTriggerClass = function(ctx) {
};


// Enter a parse tree produced by CqlParser#materializedView.
CqlParserListener.prototype.enterMaterializedView = function(ctx) {
};

// Exit a parse tree produced by CqlParser#materializedView.
CqlParserListener.prototype.exitMaterializedView = function(ctx) {
};


// Enter a parse tree produced by CqlParser#type.
CqlParserListener.prototype.enterType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#type.
CqlParserListener.prototype.exitType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#aggregate.
CqlParserListener.prototype.enterAggregate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#aggregate.
CqlParserListener.prototype.exitAggregate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#functionStatement.
CqlParserListener.prototype.enterFunctionStatement = function(ctx) {
};

// Exit a parse tree produced by CqlParser#functionStatement.
CqlParserListener.prototype.exitFunctionStatement = function(ctx) {
};


// Enter a parse tree produced by CqlParser#language.
CqlParserListener.prototype.enterLanguage = function(ctx) {
};

// Exit a parse tree produced by CqlParser#language.
CqlParserListener.prototype.exitLanguage = function(ctx) {
};


// Enter a parse tree produced by CqlParser#user.
CqlParserListener.prototype.enterUser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#user.
CqlParserListener.prototype.exitUser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#password.
CqlParserListener.prototype.enterPassword = function(ctx) {
};

// Exit a parse tree produced by CqlParser#password.
CqlParserListener.prototype.exitPassword = function(ctx) {
};


// Enter a parse tree produced by CqlParser#hashKey.
CqlParserListener.prototype.enterHashKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#hashKey.
CqlParserListener.prototype.exitHashKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#param.
CqlParserListener.prototype.enterParam = function(ctx) {
};

// Exit a parse tree produced by CqlParser#param.
CqlParserListener.prototype.exitParam = function(ctx) {
};


// Enter a parse tree produced by CqlParser#paramName.
CqlParserListener.prototype.enterParamName = function(ctx) {
};

// Exit a parse tree produced by CqlParser#paramName.
CqlParserListener.prototype.exitParamName = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAdd.
CqlParserListener.prototype.enterKwAdd = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAdd.
CqlParserListener.prototype.exitKwAdd = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAggregate.
CqlParserListener.prototype.enterKwAggregate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAggregate.
CqlParserListener.prototype.exitKwAggregate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAll.
CqlParserListener.prototype.enterKwAll = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAll.
CqlParserListener.prototype.exitKwAll = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAllPermissions.
CqlParserListener.prototype.enterKwAllPermissions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAllPermissions.
CqlParserListener.prototype.exitKwAllPermissions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAllow.
CqlParserListener.prototype.enterKwAllow = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAllow.
CqlParserListener.prototype.exitKwAllow = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAlter.
CqlParserListener.prototype.enterKwAlter = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAlter.
CqlParserListener.prototype.exitKwAlter = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAnd.
CqlParserListener.prototype.enterKwAnd = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAnd.
CqlParserListener.prototype.exitKwAnd = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwApply.
CqlParserListener.prototype.enterKwApply = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwApply.
CqlParserListener.prototype.exitKwApply = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAs.
CqlParserListener.prototype.enterKwAs = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAs.
CqlParserListener.prototype.exitKwAs = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAsc.
CqlParserListener.prototype.enterKwAsc = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAsc.
CqlParserListener.prototype.exitKwAsc = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwAuthorize.
CqlParserListener.prototype.enterKwAuthorize = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwAuthorize.
CqlParserListener.prototype.exitKwAuthorize = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwBatch.
CqlParserListener.prototype.enterKwBatch = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwBatch.
CqlParserListener.prototype.exitKwBatch = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwBegin.
CqlParserListener.prototype.enterKwBegin = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwBegin.
CqlParserListener.prototype.exitKwBegin = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwBy.
CqlParserListener.prototype.enterKwBy = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwBy.
CqlParserListener.prototype.exitKwBy = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwCalled.
CqlParserListener.prototype.enterKwCalled = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwCalled.
CqlParserListener.prototype.exitKwCalled = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwClustering.
CqlParserListener.prototype.enterKwClustering = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwClustering.
CqlParserListener.prototype.exitKwClustering = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwCompact.
CqlParserListener.prototype.enterKwCompact = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwCompact.
CqlParserListener.prototype.exitKwCompact = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwContains.
CqlParserListener.prototype.enterKwContains = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwContains.
CqlParserListener.prototype.exitKwContains = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwCreate.
CqlParserListener.prototype.enterKwCreate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwCreate.
CqlParserListener.prototype.exitKwCreate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwDelete.
CqlParserListener.prototype.enterKwDelete = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwDelete.
CqlParserListener.prototype.exitKwDelete = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwDesc.
CqlParserListener.prototype.enterKwDesc = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwDesc.
CqlParserListener.prototype.exitKwDesc = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwDescibe.
CqlParserListener.prototype.enterKwDescibe = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwDescibe.
CqlParserListener.prototype.exitKwDescibe = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwDistinct.
CqlParserListener.prototype.enterKwDistinct = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwDistinct.
CqlParserListener.prototype.exitKwDistinct = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwDrop.
CqlParserListener.prototype.enterKwDrop = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwDrop.
CqlParserListener.prototype.exitKwDrop = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwDurableWrites.
CqlParserListener.prototype.enterKwDurableWrites = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwDurableWrites.
CqlParserListener.prototype.exitKwDurableWrites = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwEntries.
CqlParserListener.prototype.enterKwEntries = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwEntries.
CqlParserListener.prototype.exitKwEntries = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwExecute.
CqlParserListener.prototype.enterKwExecute = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwExecute.
CqlParserListener.prototype.exitKwExecute = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwExists.
CqlParserListener.prototype.enterKwExists = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwExists.
CqlParserListener.prototype.exitKwExists = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwFiltering.
CqlParserListener.prototype.enterKwFiltering = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwFiltering.
CqlParserListener.prototype.exitKwFiltering = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwFinalfunc.
CqlParserListener.prototype.enterKwFinalfunc = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwFinalfunc.
CqlParserListener.prototype.exitKwFinalfunc = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwFrom.
CqlParserListener.prototype.enterKwFrom = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwFrom.
CqlParserListener.prototype.exitKwFrom = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwFull.
CqlParserListener.prototype.enterKwFull = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwFull.
CqlParserListener.prototype.exitKwFull = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwFunction.
CqlParserListener.prototype.enterKwFunction = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwFunction.
CqlParserListener.prototype.exitKwFunction = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwFunctions.
CqlParserListener.prototype.enterKwFunctions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwFunctions.
CqlParserListener.prototype.exitKwFunctions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwGrant.
CqlParserListener.prototype.enterKwGrant = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwGrant.
CqlParserListener.prototype.exitKwGrant = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwIf.
CqlParserListener.prototype.enterKwIf = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwIf.
CqlParserListener.prototype.exitKwIf = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwIn.
CqlParserListener.prototype.enterKwIn = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwIn.
CqlParserListener.prototype.exitKwIn = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwIndex.
CqlParserListener.prototype.enterKwIndex = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwIndex.
CqlParserListener.prototype.exitKwIndex = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwInitcond.
CqlParserListener.prototype.enterKwInitcond = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwInitcond.
CqlParserListener.prototype.exitKwInitcond = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwInput.
CqlParserListener.prototype.enterKwInput = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwInput.
CqlParserListener.prototype.exitKwInput = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwInsert.
CqlParserListener.prototype.enterKwInsert = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwInsert.
CqlParserListener.prototype.exitKwInsert = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwInto.
CqlParserListener.prototype.enterKwInto = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwInto.
CqlParserListener.prototype.exitKwInto = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwIs.
CqlParserListener.prototype.enterKwIs = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwIs.
CqlParserListener.prototype.exitKwIs = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwJson.
CqlParserListener.prototype.enterKwJson = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwJson.
CqlParserListener.prototype.exitKwJson = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwKey.
CqlParserListener.prototype.enterKwKey = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwKey.
CqlParserListener.prototype.exitKwKey = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwKeys.
CqlParserListener.prototype.enterKwKeys = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwKeys.
CqlParserListener.prototype.exitKwKeys = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwKeyspace.
CqlParserListener.prototype.enterKwKeyspace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwKeyspace.
CqlParserListener.prototype.exitKwKeyspace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwKeyspaces.
CqlParserListener.prototype.enterKwKeyspaces = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwKeyspaces.
CqlParserListener.prototype.exitKwKeyspaces = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwLanguage.
CqlParserListener.prototype.enterKwLanguage = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwLanguage.
CqlParserListener.prototype.exitKwLanguage = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwLimit.
CqlParserListener.prototype.enterKwLimit = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwLimit.
CqlParserListener.prototype.exitKwLimit = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwList.
CqlParserListener.prototype.enterKwList = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwList.
CqlParserListener.prototype.exitKwList = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwLogged.
CqlParserListener.prototype.enterKwLogged = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwLogged.
CqlParserListener.prototype.exitKwLogged = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwLogin.
CqlParserListener.prototype.enterKwLogin = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwLogin.
CqlParserListener.prototype.exitKwLogin = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwMaterialized.
CqlParserListener.prototype.enterKwMaterialized = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwMaterialized.
CqlParserListener.prototype.exitKwMaterialized = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwModify.
CqlParserListener.prototype.enterKwModify = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwModify.
CqlParserListener.prototype.exitKwModify = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwNosuperuser.
CqlParserListener.prototype.enterKwNosuperuser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwNosuperuser.
CqlParserListener.prototype.exitKwNosuperuser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwNorecursive.
CqlParserListener.prototype.enterKwNorecursive = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwNorecursive.
CqlParserListener.prototype.exitKwNorecursive = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwNot.
CqlParserListener.prototype.enterKwNot = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwNot.
CqlParserListener.prototype.exitKwNot = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwNull.
CqlParserListener.prototype.enterKwNull = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwNull.
CqlParserListener.prototype.exitKwNull = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwOf.
CqlParserListener.prototype.enterKwOf = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwOf.
CqlParserListener.prototype.exitKwOf = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwOn.
CqlParserListener.prototype.enterKwOn = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwOn.
CqlParserListener.prototype.exitKwOn = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwOptions.
CqlParserListener.prototype.enterKwOptions = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwOptions.
CqlParserListener.prototype.exitKwOptions = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwOr.
CqlParserListener.prototype.enterKwOr = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwOr.
CqlParserListener.prototype.exitKwOr = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwOrder.
CqlParserListener.prototype.enterKwOrder = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwOrder.
CqlParserListener.prototype.exitKwOrder = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwPassword.
CqlParserListener.prototype.enterKwPassword = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwPassword.
CqlParserListener.prototype.exitKwPassword = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwPrimary.
CqlParserListener.prototype.enterKwPrimary = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwPrimary.
CqlParserListener.prototype.exitKwPrimary = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwRename.
CqlParserListener.prototype.enterKwRename = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwRename.
CqlParserListener.prototype.exitKwRename = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwReplace.
CqlParserListener.prototype.enterKwReplace = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwReplace.
CqlParserListener.prototype.exitKwReplace = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwReplication.
CqlParserListener.prototype.enterKwReplication = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwReplication.
CqlParserListener.prototype.exitKwReplication = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwReturns.
CqlParserListener.prototype.enterKwReturns = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwReturns.
CqlParserListener.prototype.exitKwReturns = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwRole.
CqlParserListener.prototype.enterKwRole = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwRole.
CqlParserListener.prototype.exitKwRole = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwInternal.
CqlParserListener.prototype.enterKwInternal = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwInternal.
CqlParserListener.prototype.exitKwInternal = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwLdap.
CqlParserListener.prototype.enterKwLdap = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwLdap.
CqlParserListener.prototype.exitKwLdap = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwScheme.
CqlParserListener.prototype.enterKwScheme = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwScheme.
CqlParserListener.prototype.exitKwScheme = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwRoles.
CqlParserListener.prototype.enterKwRoles = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwRoles.
CqlParserListener.prototype.exitKwRoles = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwSelect.
CqlParserListener.prototype.enterKwSelect = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwSelect.
CqlParserListener.prototype.exitKwSelect = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwSet.
CqlParserListener.prototype.enterKwSet = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwSet.
CqlParserListener.prototype.exitKwSet = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwSfunc.
CqlParserListener.prototype.enterKwSfunc = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwSfunc.
CqlParserListener.prototype.exitKwSfunc = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwStorage.
CqlParserListener.prototype.enterKwStorage = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwStorage.
CqlParserListener.prototype.exitKwStorage = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwStype.
CqlParserListener.prototype.enterKwStype = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwStype.
CqlParserListener.prototype.exitKwStype = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwSuperuser.
CqlParserListener.prototype.enterKwSuperuser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwSuperuser.
CqlParserListener.prototype.exitKwSuperuser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwTable.
CqlParserListener.prototype.enterKwTable = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwTable.
CqlParserListener.prototype.exitKwTable = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwTimestamp.
CqlParserListener.prototype.enterKwTimestamp = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwTimestamp.
CqlParserListener.prototype.exitKwTimestamp = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwTo.
CqlParserListener.prototype.enterKwTo = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwTo.
CqlParserListener.prototype.exitKwTo = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwTrigger.
CqlParserListener.prototype.enterKwTrigger = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwTrigger.
CqlParserListener.prototype.exitKwTrigger = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwTruncate.
CqlParserListener.prototype.enterKwTruncate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwTruncate.
CqlParserListener.prototype.exitKwTruncate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwTtl.
CqlParserListener.prototype.enterKwTtl = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwTtl.
CqlParserListener.prototype.exitKwTtl = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwType.
CqlParserListener.prototype.enterKwType = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwType.
CqlParserListener.prototype.exitKwType = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwUnlogged.
CqlParserListener.prototype.enterKwUnlogged = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwUnlogged.
CqlParserListener.prototype.exitKwUnlogged = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwUpdate.
CqlParserListener.prototype.enterKwUpdate = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwUpdate.
CqlParserListener.prototype.exitKwUpdate = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwUse.
CqlParserListener.prototype.enterKwUse = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwUse.
CqlParserListener.prototype.exitKwUse = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwUser.
CqlParserListener.prototype.enterKwUser = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwUser.
CqlParserListener.prototype.exitKwUser = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwUsers.
CqlParserListener.prototype.enterKwUsers = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwUsers.
CqlParserListener.prototype.exitKwUsers = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwUsing.
CqlParserListener.prototype.enterKwUsing = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwUsing.
CqlParserListener.prototype.exitKwUsing = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwValues.
CqlParserListener.prototype.enterKwValues = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwValues.
CqlParserListener.prototype.exitKwValues = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwView.
CqlParserListener.prototype.enterKwView = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwView.
CqlParserListener.prototype.exitKwView = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwWhere.
CqlParserListener.prototype.enterKwWhere = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwWhere.
CqlParserListener.prototype.exitKwWhere = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwWith.
CqlParserListener.prototype.enterKwWith = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwWith.
CqlParserListener.prototype.exitKwWith = function(ctx) {
};


// Enter a parse tree produced by CqlParser#kwRevoke.
CqlParserListener.prototype.enterKwRevoke = function(ctx) {
};

// Exit a parse tree produced by CqlParser#kwRevoke.
CqlParserListener.prototype.exitKwRevoke = function(ctx) {
};


// Enter a parse tree produced by CqlParser#eof.
CqlParserListener.prototype.enterEof = function(ctx) {
};

// Exit a parse tree produced by CqlParser#eof.
CqlParserListener.prototype.exitEof = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketLr.
CqlParserListener.prototype.enterSyntaxBracketLr = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketLr.
CqlParserListener.prototype.exitSyntaxBracketLr = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketRr.
CqlParserListener.prototype.enterSyntaxBracketRr = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketRr.
CqlParserListener.prototype.exitSyntaxBracketRr = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketLc.
CqlParserListener.prototype.enterSyntaxBracketLc = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketLc.
CqlParserListener.prototype.exitSyntaxBracketLc = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketRc.
CqlParserListener.prototype.enterSyntaxBracketRc = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketRc.
CqlParserListener.prototype.exitSyntaxBracketRc = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketLa.
CqlParserListener.prototype.enterSyntaxBracketLa = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketLa.
CqlParserListener.prototype.exitSyntaxBracketLa = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketRa.
CqlParserListener.prototype.enterSyntaxBracketRa = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketRa.
CqlParserListener.prototype.exitSyntaxBracketRa = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketLs.
CqlParserListener.prototype.enterSyntaxBracketLs = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketLs.
CqlParserListener.prototype.exitSyntaxBracketLs = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxBracketRs.
CqlParserListener.prototype.enterSyntaxBracketRs = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxBracketRs.
CqlParserListener.prototype.exitSyntaxBracketRs = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxComma.
CqlParserListener.prototype.enterSyntaxComma = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxComma.
CqlParserListener.prototype.exitSyntaxComma = function(ctx) {
};


// Enter a parse tree produced by CqlParser#syntaxColon.
CqlParserListener.prototype.enterSyntaxColon = function(ctx) {
};

// Exit a parse tree produced by CqlParser#syntaxColon.
CqlParserListener.prototype.exitSyntaxColon = function(ctx) {
};


// Enter a parse tree produced by CqlParser#id.
CqlParserListener.prototype.enterId = function(ctx) {
};

// Exit a parse tree produced by CqlParser#id.
CqlParserListener.prototype.exitId = function(ctx) {
};



exports.CqlParserListener = CqlParserListener;