// Generated from grammars/CqlParser.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by CqlParser.

function CqlParserVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

CqlParserVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
CqlParserVisitor.prototype.constructor = CqlParserVisitor;

// Visit a parse tree produced by CqlParser#root.
CqlParserVisitor.prototype.visitRoot = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#cqls.
CqlParserVisitor.prototype.visitCqls = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#statementSeparator.
CqlParserVisitor.prototype.visitStatementSeparator = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#empty.
CqlParserVisitor.prototype.visitEmpty = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#cql.
CqlParserVisitor.prototype.visitCql = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#revoke.
CqlParserVisitor.prototype.visitRevoke = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#listUsers.
CqlParserVisitor.prototype.visitListUsers = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#listRoles.
CqlParserVisitor.prototype.visitListRoles = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#listPermissions.
CqlParserVisitor.prototype.visitListPermissions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#grant.
CqlParserVisitor.prototype.visitGrant = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#priviledge.
CqlParserVisitor.prototype.visitPriviledge = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#resource.
CqlParserVisitor.prototype.visitResource = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createUser.
CqlParserVisitor.prototype.visitCreateUser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createRole.
CqlParserVisitor.prototype.visitCreateRole = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createType.
CqlParserVisitor.prototype.visitCreateType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#typeMemberColumnList.
CqlParserVisitor.prototype.visitTypeMemberColumnList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createTrigger.
CqlParserVisitor.prototype.visitCreateTrigger = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createMaterializedView.
CqlParserVisitor.prototype.visitCreateMaterializedView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#materializedViewWhere.
CqlParserVisitor.prototype.visitMaterializedViewWhere = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#columnNotNullList.
CqlParserVisitor.prototype.visitColumnNotNullList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#columnNotNull.
CqlParserVisitor.prototype.visitColumnNotNull = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#materializedViewOptions.
CqlParserVisitor.prototype.visitMaterializedViewOptions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createKeyspace.
CqlParserVisitor.prototype.visitCreateKeyspace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createFunction.
CqlParserVisitor.prototype.visitCreateFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#codeBlock.
CqlParserVisitor.prototype.visitCodeBlock = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#paramList.
CqlParserVisitor.prototype.visitParamList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#returnMode.
CqlParserVisitor.prototype.visitReturnMode = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createAggregate.
CqlParserVisitor.prototype.visitCreateAggregate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#initCondDefinition.
CqlParserVisitor.prototype.visitInitCondDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#initCondHash.
CqlParserVisitor.prototype.visitInitCondHash = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#initCondHashItem.
CqlParserVisitor.prototype.visitInitCondHashItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#initCondListNested.
CqlParserVisitor.prototype.visitInitCondListNested = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#initCondList.
CqlParserVisitor.prototype.visitInitCondList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#orReplace.
CqlParserVisitor.prototype.visitOrReplace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterUser.
CqlParserVisitor.prototype.visitAlterUser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#userPassword.
CqlParserVisitor.prototype.visitUserPassword = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#userSuperUser.
CqlParserVisitor.prototype.visitUserSuperUser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterType.
CqlParserVisitor.prototype.visitAlterType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTypeOperation.
CqlParserVisitor.prototype.visitAlterTypeOperation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTypeRename.
CqlParserVisitor.prototype.visitAlterTypeRename = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTypeRenameList.
CqlParserVisitor.prototype.visitAlterTypeRenameList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTypeRenameItem.
CqlParserVisitor.prototype.visitAlterTypeRenameItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTypeAdd.
CqlParserVisitor.prototype.visitAlterTypeAdd = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTypeAlterType.
CqlParserVisitor.prototype.visitAlterTypeAlterType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTable.
CqlParserVisitor.prototype.visitAlterTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableOperation.
CqlParserVisitor.prototype.visitAlterTableOperation = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableWith.
CqlParserVisitor.prototype.visitAlterTableWith = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableRename.
CqlParserVisitor.prototype.visitAlterTableRename = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableDropCompactStorage.
CqlParserVisitor.prototype.visitAlterTableDropCompactStorage = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableDropColumns.
CqlParserVisitor.prototype.visitAlterTableDropColumns = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableDropColumnList.
CqlParserVisitor.prototype.visitAlterTableDropColumnList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableAdd.
CqlParserVisitor.prototype.visitAlterTableAdd = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterTableColumnDefinition.
CqlParserVisitor.prototype.visitAlterTableColumnDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterRole.
CqlParserVisitor.prototype.visitAlterRole = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#roleWith.
CqlParserVisitor.prototype.visitRoleWith = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#roleWithOptions.
CqlParserVisitor.prototype.visitRoleWithOptions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterMaterializedView.
CqlParserVisitor.prototype.visitAlterMaterializedView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropUser.
CqlParserVisitor.prototype.visitDropUser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropType.
CqlParserVisitor.prototype.visitDropType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropMaterializedView.
CqlParserVisitor.prototype.visitDropMaterializedView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropAggregate.
CqlParserVisitor.prototype.visitDropAggregate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropFunction.
CqlParserVisitor.prototype.visitDropFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropTrigger.
CqlParserVisitor.prototype.visitDropTrigger = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropRole.
CqlParserVisitor.prototype.visitDropRole = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropTable.
CqlParserVisitor.prototype.visitDropTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropKeyspace.
CqlParserVisitor.prototype.visitDropKeyspace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dropIndex.
CqlParserVisitor.prototype.visitDropIndex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createTable.
CqlParserVisitor.prototype.visitCreateTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#withElement.
CqlParserVisitor.prototype.visitWithElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#clusteringOrderColumns.
CqlParserVisitor.prototype.visitClusteringOrderColumns = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#clusteringOrder.
CqlParserVisitor.prototype.visitClusteringOrder = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#tableOptions.
CqlParserVisitor.prototype.visitTableOptions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#tableOptionItem.
CqlParserVisitor.prototype.visitTableOptionItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#tableOptionName.
CqlParserVisitor.prototype.visitTableOptionName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#tableOptionValue.
CqlParserVisitor.prototype.visitTableOptionValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#optionHash.
CqlParserVisitor.prototype.visitOptionHash = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#optionHashItem.
CqlParserVisitor.prototype.visitOptionHashItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#optionHashKey.
CqlParserVisitor.prototype.visitOptionHashKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#optionHashValue.
CqlParserVisitor.prototype.visitOptionHashValue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#columnDefinitionList.
CqlParserVisitor.prototype.visitColumnDefinitionList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#columnDefinition.
CqlParserVisitor.prototype.visitColumnDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#primaryKeyColumn.
CqlParserVisitor.prototype.visitPrimaryKeyColumn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#primaryKeyElement.
CqlParserVisitor.prototype.visitPrimaryKeyElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#primaryKeyDefinition.
CqlParserVisitor.prototype.visitPrimaryKeyDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#singlePrimaryKey.
CqlParserVisitor.prototype.visitSinglePrimaryKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#compoundKey.
CqlParserVisitor.prototype.visitCompoundKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#compositeKey.
CqlParserVisitor.prototype.visitCompositeKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#partitionKeyList.
CqlParserVisitor.prototype.visitPartitionKeyList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#clusteringKeyList.
CqlParserVisitor.prototype.visitClusteringKeyList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#partitionKey.
CqlParserVisitor.prototype.visitPartitionKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#clusteringKey.
CqlParserVisitor.prototype.visitClusteringKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#applyBatch.
CqlParserVisitor.prototype.visitApplyBatch = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#beginBatch.
CqlParserVisitor.prototype.visitBeginBatch = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#batchType.
CqlParserVisitor.prototype.visitBatchType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#alterKeyspace.
CqlParserVisitor.prototype.visitAlterKeyspace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#replicationList.
CqlParserVisitor.prototype.visitReplicationList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#replicationListItem.
CqlParserVisitor.prototype.visitReplicationListItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#durableWrites.
CqlParserVisitor.prototype.visitDurableWrites = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#use.
CqlParserVisitor.prototype.visitUse = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#truncate.
CqlParserVisitor.prototype.visitTruncate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#secondaryIndex.
CqlParserVisitor.prototype.visitSecondaryIndex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#customIndex.
CqlParserVisitor.prototype.visitCustomIndex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#customIndexOption.
CqlParserVisitor.prototype.visitCustomIndexOption = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#createSearchIndex.
CqlParserVisitor.prototype.visitCreateSearchIndex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#searchIndexConfigs.
CqlParserVisitor.prototype.visitSearchIndexConfigs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#directoryFactory.
CqlParserVisitor.prototype.visitDirectoryFactory = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#searchIndexOptions.
CqlParserVisitor.prototype.visitSearchIndexOptions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#searchIndexProfile.
CqlParserVisitor.prototype.visitSearchIndexProfile = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#searchIndexProfiles.
CqlParserVisitor.prototype.visitSearchIndexProfiles = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#searchIndexColumnList.
CqlParserVisitor.prototype.visitSearchIndexColumnList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#searchIndexColumn.
CqlParserVisitor.prototype.visitSearchIndexColumn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#indexName.
CqlParserVisitor.prototype.visitIndexName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#indexColumnSpec.
CqlParserVisitor.prototype.visitIndexColumnSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#indexKeysSpec.
CqlParserVisitor.prototype.visitIndexKeysSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#indexEntriesSSpec.
CqlParserVisitor.prototype.visitIndexEntriesSSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#indexFullSpec.
CqlParserVisitor.prototype.visitIndexFullSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#indexValuesSpec.
CqlParserVisitor.prototype.visitIndexValuesSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#deleteStatement.
CqlParserVisitor.prototype.visitDeleteStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#deleteColumnList.
CqlParserVisitor.prototype.visitDeleteColumnList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#deleteColumnItem.
CqlParserVisitor.prototype.visitDeleteColumnItem = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#update.
CqlParserVisitor.prototype.visitUpdate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#ifSpec.
CqlParserVisitor.prototype.visitIfSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#ifConditionList.
CqlParserVisitor.prototype.visitIfConditionList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#ifCondition.
CqlParserVisitor.prototype.visitIfCondition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignments.
CqlParserVisitor.prototype.visitAssignments = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignmentElement.
CqlParserVisitor.prototype.visitAssignmentElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignmentSet.
CqlParserVisitor.prototype.visitAssignmentSet = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignmentMap.
CqlParserVisitor.prototype.visitAssignmentMap = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignmentMapExpression.
CqlParserVisitor.prototype.visitAssignmentMapExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignmentList.
CqlParserVisitor.prototype.visitAssignmentList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#assignmentTuple.
CqlParserVisitor.prototype.visitAssignmentTuple = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#insert.
CqlParserVisitor.prototype.visitInsert = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#usingTtlTimestamp.
CqlParserVisitor.prototype.visitUsingTtlTimestamp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#timestamp.
CqlParserVisitor.prototype.visitTimestamp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#ttl.
CqlParserVisitor.prototype.visitTtl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#usingTimestampSpec.
CqlParserVisitor.prototype.visitUsingTimestampSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#ifNotExist.
CqlParserVisitor.prototype.visitIfNotExist = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#ifExist.
CqlParserVisitor.prototype.visitIfExist = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#insertValuesSpec.
CqlParserVisitor.prototype.visitInsertValuesSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#insertColumnSpec.
CqlParserVisitor.prototype.visitInsertColumnSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#columnList.
CqlParserVisitor.prototype.visitColumnList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#expressionList.
CqlParserVisitor.prototype.visitExpressionList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#expression.
CqlParserVisitor.prototype.visitExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#select.
CqlParserVisitor.prototype.visitSelect = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#allowFilteringSpec.
CqlParserVisitor.prototype.visitAllowFilteringSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#limitSpec.
CqlParserVisitor.prototype.visitLimitSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#fromSpec.
CqlParserVisitor.prototype.visitFromSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#fromSpecElement.
CqlParserVisitor.prototype.visitFromSpecElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#orderSpec.
CqlParserVisitor.prototype.visitOrderSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#orderSpecElement.
CqlParserVisitor.prototype.visitOrderSpecElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#whereSpec.
CqlParserVisitor.prototype.visitWhereSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#distinctSpec.
CqlParserVisitor.prototype.visitDistinctSpec = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#selectElements.
CqlParserVisitor.prototype.visitSelectElements = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#selectElement.
CqlParserVisitor.prototype.visitSelectElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#relationElements.
CqlParserVisitor.prototype.visitRelationElements = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#relationElement.
CqlParserVisitor.prototype.visitRelationElement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#relalationContains.
CqlParserVisitor.prototype.visitRelalationContains = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#relalationContainsKey.
CqlParserVisitor.prototype.visitRelalationContainsKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#functionCall.
CqlParserVisitor.prototype.visitFunctionCall = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#functionArgs.
CqlParserVisitor.prototype.visitFunctionArgs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#constant.
CqlParserVisitor.prototype.visitConstant = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#decimalLiteral.
CqlParserVisitor.prototype.visitDecimalLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#floatLiteral.
CqlParserVisitor.prototype.visitFloatLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#stringLiteral.
CqlParserVisitor.prototype.visitStringLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#booleanLiteral.
CqlParserVisitor.prototype.visitBooleanLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#hexadecimalLiteral.
CqlParserVisitor.prototype.visitHexadecimalLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#keyspace.
CqlParserVisitor.prototype.visitKeyspace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#table.
CqlParserVisitor.prototype.visitTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#column.
CqlParserVisitor.prototype.visitColumn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dataType.
CqlParserVisitor.prototype.visitDataType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dataTypeName.
CqlParserVisitor.prototype.visitDataTypeName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#dataTypeDefinition.
CqlParserVisitor.prototype.visitDataTypeDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#orderDirection.
CqlParserVisitor.prototype.visitOrderDirection = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#role.
CqlParserVisitor.prototype.visitRole = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#trigger.
CqlParserVisitor.prototype.visitTrigger = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#triggerClass.
CqlParserVisitor.prototype.visitTriggerClass = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#materializedView.
CqlParserVisitor.prototype.visitMaterializedView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#type.
CqlParserVisitor.prototype.visitType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#aggregate.
CqlParserVisitor.prototype.visitAggregate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#functionStatement.
CqlParserVisitor.prototype.visitFunctionStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#language.
CqlParserVisitor.prototype.visitLanguage = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#user.
CqlParserVisitor.prototype.visitUser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#password.
CqlParserVisitor.prototype.visitPassword = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#hashKey.
CqlParserVisitor.prototype.visitHashKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#param.
CqlParserVisitor.prototype.visitParam = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#paramName.
CqlParserVisitor.prototype.visitParamName = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAdd.
CqlParserVisitor.prototype.visitKwAdd = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAggregate.
CqlParserVisitor.prototype.visitKwAggregate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAll.
CqlParserVisitor.prototype.visitKwAll = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAllPermissions.
CqlParserVisitor.prototype.visitKwAllPermissions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAllow.
CqlParserVisitor.prototype.visitKwAllow = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAlter.
CqlParserVisitor.prototype.visitKwAlter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAnd.
CqlParserVisitor.prototype.visitKwAnd = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwApply.
CqlParserVisitor.prototype.visitKwApply = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAs.
CqlParserVisitor.prototype.visitKwAs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAsc.
CqlParserVisitor.prototype.visitKwAsc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAuthorize.
CqlParserVisitor.prototype.visitKwAuthorize = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwBatch.
CqlParserVisitor.prototype.visitKwBatch = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwBegin.
CqlParserVisitor.prototype.visitKwBegin = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwBy.
CqlParserVisitor.prototype.visitKwBy = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwCalled.
CqlParserVisitor.prototype.visitKwCalled = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwClustering.
CqlParserVisitor.prototype.visitKwClustering = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwCompact.
CqlParserVisitor.prototype.visitKwCompact = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwContains.
CqlParserVisitor.prototype.visitKwContains = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwCreate.
CqlParserVisitor.prototype.visitKwCreate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDelete.
CqlParserVisitor.prototype.visitKwDelete = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDesc.
CqlParserVisitor.prototype.visitKwDesc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDescibe.
CqlParserVisitor.prototype.visitKwDescibe = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDistinct.
CqlParserVisitor.prototype.visitKwDistinct = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDrop.
CqlParserVisitor.prototype.visitKwDrop = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDurableWrites.
CqlParserVisitor.prototype.visitKwDurableWrites = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwEntries.
CqlParserVisitor.prototype.visitKwEntries = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwExecute.
CqlParserVisitor.prototype.visitKwExecute = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwExists.
CqlParserVisitor.prototype.visitKwExists = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFiltering.
CqlParserVisitor.prototype.visitKwFiltering = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFinalfunc.
CqlParserVisitor.prototype.visitKwFinalfunc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFrom.
CqlParserVisitor.prototype.visitKwFrom = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFull.
CqlParserVisitor.prototype.visitKwFull = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFunction.
CqlParserVisitor.prototype.visitKwFunction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFunctions.
CqlParserVisitor.prototype.visitKwFunctions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwGrant.
CqlParserVisitor.prototype.visitKwGrant = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwIf.
CqlParserVisitor.prototype.visitKwIf = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwIn.
CqlParserVisitor.prototype.visitKwIn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwIndex.
CqlParserVisitor.prototype.visitKwIndex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwCustom.
CqlParserVisitor.prototype.visitKwCustom = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSearch.
CqlParserVisitor.prototype.visitKwSearch = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAscii.
CqlParserVisitor.prototype.visitKwAscii = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNormalize.
CqlParserVisitor.prototype.visitKwNormalize = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAnalyzed.
CqlParserVisitor.prototype.visitKwAnalyzed = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwIsLiteral.
CqlParserVisitor.prototype.visitKwIsLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwMaxCompactionFlushMemoryInMb.
CqlParserVisitor.prototype.visitKwMaxCompactionFlushMemoryInMb = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTokenizationEnableStemming.
CqlParserVisitor.prototype.visitKwTokenizationEnableStemming = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTokenizationSkipStopWords.
CqlParserVisitor.prototype.visitKwTokenizationSkipStopWords = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTokenizationLocale.
CqlParserVisitor.prototype.visitKwTokenizationLocale = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTokenizationNormalizeLowercase.
CqlParserVisitor.prototype.visitKwTokenizationNormalizeLowercase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTokenizationNormalizeUppercase.
CqlParserVisitor.prototype.visitKwTokenizationNormalizeUppercase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNormalizeLowercase.
CqlParserVisitor.prototype.visitKwNormalizeLowercase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNormalizeUppercase.
CqlParserVisitor.prototype.visitKwNormalizeUppercase = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwMode.
CqlParserVisitor.prototype.visitKwMode = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAnalyzerClass.
CqlParserVisitor.prototype.visitKwAnalyzerClass = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwStorageAttachedIndex.
CqlParserVisitor.prototype.visitKwStorageAttachedIndex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSpaceSavingNoJoin.
CqlParserVisitor.prototype.visitKwSpaceSavingNoJoin = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSpaceSavingAll.
CqlParserVisitor.prototype.visitKwSpaceSavingAll = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSpaceSavingSlowTriePrecision.
CqlParserVisitor.prototype.visitKwSpaceSavingSlowTriePrecision = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSpaceSavingNoTextField.
CqlParserVisitor.prototype.visitKwSpaceSavingNoTextField = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwCopyField.
CqlParserVisitor.prototype.visitKwCopyField = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDocValues.
CqlParserVisitor.prototype.visitKwDocValues = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwExcluded.
CqlParserVisitor.prototype.visitKwExcluded = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwIndexed.
CqlParserVisitor.prototype.visitKwIndexed = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwColumns.
CqlParserVisitor.prototype.visitKwColumns = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwProfiles.
CqlParserVisitor.prototype.visitKwProfiles = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwConfig.
CqlParserVisitor.prototype.visitKwConfig = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwAutoCommitTime.
CqlParserVisitor.prototype.visitKwAutoCommitTime = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDefaultQueryField.
CqlParserVisitor.prototype.visitKwDefaultQueryField = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDirectoryFactory.
CqlParserVisitor.prototype.visitKwDirectoryFactory = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFilterCacheLowWaterMark.
CqlParserVisitor.prototype.visitKwFilterCacheLowWaterMark = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwFilterCacheHighWaterMark.
CqlParserVisitor.prototype.visitKwFilterCacheHighWaterMark = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwDirectoryFactoryClass.
CqlParserVisitor.prototype.visitKwDirectoryFactoryClass = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwMergeMaxThreadCount.
CqlParserVisitor.prototype.visitKwMergeMaxThreadCount = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwMergeMaxMergeCount.
CqlParserVisitor.prototype.visitKwMergeMaxMergeCount = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRamBufferSize.
CqlParserVisitor.prototype.visitKwRamBufferSize = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRealtime.
CqlParserVisitor.prototype.visitKwRealtime = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRecovery.
CqlParserVisitor.prototype.visitKwRecovery = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwReindex.
CqlParserVisitor.prototype.visitKwReindex = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwLenient.
CqlParserVisitor.prototype.visitKwLenient = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwStandard.
CqlParserVisitor.prototype.visitKwStandard = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwEncrypted.
CqlParserVisitor.prototype.visitKwEncrypted = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwCaseSensitive.
CqlParserVisitor.prototype.visitKwCaseSensitive = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwInitcond.
CqlParserVisitor.prototype.visitKwInitcond = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwInput.
CqlParserVisitor.prototype.visitKwInput = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwInsert.
CqlParserVisitor.prototype.visitKwInsert = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwInto.
CqlParserVisitor.prototype.visitKwInto = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwIs.
CqlParserVisitor.prototype.visitKwIs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwJson.
CqlParserVisitor.prototype.visitKwJson = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwKey.
CqlParserVisitor.prototype.visitKwKey = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwKeys.
CqlParserVisitor.prototype.visitKwKeys = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwKeyspace.
CqlParserVisitor.prototype.visitKwKeyspace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwKeyspaces.
CqlParserVisitor.prototype.visitKwKeyspaces = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwLanguage.
CqlParserVisitor.prototype.visitKwLanguage = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwLimit.
CqlParserVisitor.prototype.visitKwLimit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwList.
CqlParserVisitor.prototype.visitKwList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwLogged.
CqlParserVisitor.prototype.visitKwLogged = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwLogin.
CqlParserVisitor.prototype.visitKwLogin = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwMaterialized.
CqlParserVisitor.prototype.visitKwMaterialized = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwModify.
CqlParserVisitor.prototype.visitKwModify = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNosuperuser.
CqlParserVisitor.prototype.visitKwNosuperuser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNorecursive.
CqlParserVisitor.prototype.visitKwNorecursive = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNot.
CqlParserVisitor.prototype.visitKwNot = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwNull.
CqlParserVisitor.prototype.visitKwNull = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwOf.
CqlParserVisitor.prototype.visitKwOf = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwOn.
CqlParserVisitor.prototype.visitKwOn = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwOptions.
CqlParserVisitor.prototype.visitKwOptions = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwOr.
CqlParserVisitor.prototype.visitKwOr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwOrder.
CqlParserVisitor.prototype.visitKwOrder = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwPassword.
CqlParserVisitor.prototype.visitKwPassword = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwPrimary.
CqlParserVisitor.prototype.visitKwPrimary = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRename.
CqlParserVisitor.prototype.visitKwRename = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwReplace.
CqlParserVisitor.prototype.visitKwReplace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwReplication.
CqlParserVisitor.prototype.visitKwReplication = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwReturns.
CqlParserVisitor.prototype.visitKwReturns = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRole.
CqlParserVisitor.prototype.visitKwRole = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwInternal.
CqlParserVisitor.prototype.visitKwInternal = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwLdap.
CqlParserVisitor.prototype.visitKwLdap = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwScheme.
CqlParserVisitor.prototype.visitKwScheme = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRoles.
CqlParserVisitor.prototype.visitKwRoles = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSelect.
CqlParserVisitor.prototype.visitKwSelect = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSet.
CqlParserVisitor.prototype.visitKwSet = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSfunc.
CqlParserVisitor.prototype.visitKwSfunc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwStorage.
CqlParserVisitor.prototype.visitKwStorage = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwStype.
CqlParserVisitor.prototype.visitKwStype = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwSuperuser.
CqlParserVisitor.prototype.visitKwSuperuser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTable.
CqlParserVisitor.prototype.visitKwTable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTimestamp.
CqlParserVisitor.prototype.visitKwTimestamp = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTo.
CqlParserVisitor.prototype.visitKwTo = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTrigger.
CqlParserVisitor.prototype.visitKwTrigger = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTruncate.
CqlParserVisitor.prototype.visitKwTruncate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwTtl.
CqlParserVisitor.prototype.visitKwTtl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwType.
CqlParserVisitor.prototype.visitKwType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwUnlogged.
CqlParserVisitor.prototype.visitKwUnlogged = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwUpdate.
CqlParserVisitor.prototype.visitKwUpdate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwUse.
CqlParserVisitor.prototype.visitKwUse = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwUser.
CqlParserVisitor.prototype.visitKwUser = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwUsers.
CqlParserVisitor.prototype.visitKwUsers = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwUsing.
CqlParserVisitor.prototype.visitKwUsing = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwValues.
CqlParserVisitor.prototype.visitKwValues = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwView.
CqlParserVisitor.prototype.visitKwView = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwWhere.
CqlParserVisitor.prototype.visitKwWhere = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwWith.
CqlParserVisitor.prototype.visitKwWith = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#kwRevoke.
CqlParserVisitor.prototype.visitKwRevoke = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#eof.
CqlParserVisitor.prototype.visitEof = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketLr.
CqlParserVisitor.prototype.visitSyntaxBracketLr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketRr.
CqlParserVisitor.prototype.visitSyntaxBracketRr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketLc.
CqlParserVisitor.prototype.visitSyntaxBracketLc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketRc.
CqlParserVisitor.prototype.visitSyntaxBracketRc = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketLa.
CqlParserVisitor.prototype.visitSyntaxBracketLa = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketRa.
CqlParserVisitor.prototype.visitSyntaxBracketRa = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketLs.
CqlParserVisitor.prototype.visitSyntaxBracketLs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxBracketRs.
CqlParserVisitor.prototype.visitSyntaxBracketRs = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxComma.
CqlParserVisitor.prototype.visitSyntaxComma = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#syntaxColon.
CqlParserVisitor.prototype.visitSyntaxColon = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by CqlParser#id.
CqlParserVisitor.prototype.visitId = function(ctx) {
  return this.visitChildren(ctx);
};



exports.CqlParserVisitor = CqlParserVisitor;