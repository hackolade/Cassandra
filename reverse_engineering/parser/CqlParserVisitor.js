// Generated from grammars/CqlParser.g4 by ANTLR 4.9.2
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by CqlParser.

class CqlParserVisitor extends antlr4.tree.ParseTreeVisitor {
  // Visit a parse tree produced by CqlParser#root.
  visitRoot(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#cqls.
  visitCqls(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#statementSeparator.
  visitStatementSeparator(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#empty.
  visitEmpty(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#cql.
  visitCql(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#revoke.
  visitRevoke(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#listUsers.
  visitListUsers(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#listRoles.
  visitListRoles(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#listPermissions.
  visitListPermissions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#grant.
  visitGrant(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#priviledge.
  visitPriviledge(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#resource.
  visitResource(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createUser.
  visitCreateUser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createRole.
  visitCreateRole(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createType.
  visitCreateType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#typeMemberColumnList.
  visitTypeMemberColumnList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createTrigger.
  visitCreateTrigger(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createMaterializedView.
  visitCreateMaterializedView(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#materializedViewWhere.
  visitMaterializedViewWhere(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#columnNotNullList.
  visitColumnNotNullList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#columnNotNull.
  visitColumnNotNull(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#materializedViewOptions.
  visitMaterializedViewOptions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createKeyspace.
  visitCreateKeyspace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createFunction.
  visitCreateFunction(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#codeBlock.
  visitCodeBlock(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#paramList.
  visitParamList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#returnMode.
  visitReturnMode(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createAggregate.
  visitCreateAggregate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#initCondDefinition.
  visitInitCondDefinition(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#initCondHash.
  visitInitCondHash(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#initCondHashItem.
  visitInitCondHashItem(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#initCondListNested.
  visitInitCondListNested(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#initCondList.
  visitInitCondList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#orReplace.
  visitOrReplace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterUser.
  visitAlterUser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#userPassword.
  visitUserPassword(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#userSuperUser.
  visitUserSuperUser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterType.
  visitAlterType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTypeOperation.
  visitAlterTypeOperation(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTypeRename.
  visitAlterTypeRename(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTypeRenameList.
  visitAlterTypeRenameList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTypeRenameItem.
  visitAlterTypeRenameItem(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTypeAdd.
  visitAlterTypeAdd(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTypeAlterType.
  visitAlterTypeAlterType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTable.
  visitAlterTable(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableOperation.
  visitAlterTableOperation(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableWith.
  visitAlterTableWith(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableRename.
  visitAlterTableRename(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableDropCompactStorage.
  visitAlterTableDropCompactStorage(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableDropColumns.
  visitAlterTableDropColumns(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableDropColumnList.
  visitAlterTableDropColumnList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableAdd.
  visitAlterTableAdd(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterTableColumnDefinition.
  visitAlterTableColumnDefinition(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterRole.
  visitAlterRole(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#roleWith.
  visitRoleWith(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#roleWithOptions.
  visitRoleWithOptions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterMaterializedView.
  visitAlterMaterializedView(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropUser.
  visitDropUser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropType.
  visitDropType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropMaterializedView.
  visitDropMaterializedView(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropAggregate.
  visitDropAggregate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropFunction.
  visitDropFunction(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropTrigger.
  visitDropTrigger(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropRole.
  visitDropRole(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropTable.
  visitDropTable(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropKeyspace.
  visitDropKeyspace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dropIndex.
  visitDropIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createTable.
  visitCreateTable(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#withElement.
  visitWithElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#clusteringOrderColumns.
  visitClusteringOrderColumns(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#clusteringOrder.
  visitClusteringOrder(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#tableOptions.
  visitTableOptions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#tableOptionItem.
  visitTableOptionItem(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#tableOptionName.
  visitTableOptionName(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#tableOptionValue.
  visitTableOptionValue(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#optionHash.
  visitOptionHash(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#optionHashItem.
  visitOptionHashItem(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#optionHashKey.
  visitOptionHashKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#optionHashValue.
  visitOptionHashValue(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#columnDefinitionList.
  visitColumnDefinitionList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#columnDefinition.
  visitColumnDefinition(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#primaryKeyColumn.
  visitPrimaryKeyColumn(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#primaryKeyElement.
  visitPrimaryKeyElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#primaryKeyDefinition.
  visitPrimaryKeyDefinition(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#singlePrimaryKey.
  visitSinglePrimaryKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#compoundKey.
  visitCompoundKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#compositeKey.
  visitCompositeKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#partitionKeyList.
  visitPartitionKeyList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#clusteringKeyList.
  visitClusteringKeyList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#partitionKey.
  visitPartitionKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#clusteringKey.
  visitClusteringKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#applyBatch.
  visitApplyBatch(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#beginBatch.
  visitBeginBatch(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#batchType.
  visitBatchType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#alterKeyspace.
  visitAlterKeyspace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#replicationList.
  visitReplicationList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#replicationListItem.
  visitReplicationListItem(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#durableWrites.
  visitDurableWrites(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#use.
  visitUse(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#truncate.
  visitTruncate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#secondaryIndex.
  visitSecondaryIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#customIndex.
  visitCustomIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#customIndexOption.
  visitCustomIndexOption(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#createSearchIndex.
  visitCreateSearchIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#searchIndexConfigs.
  visitSearchIndexConfigs(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#directoryFactory.
  visitDirectoryFactory(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#searchIndexOptions.
  visitSearchIndexOptions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#searchIndexProfile.
  visitSearchIndexProfile(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#searchIndexProfiles.
  visitSearchIndexProfiles(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#searchIndexColumnList.
  visitSearchIndexColumnList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#searchIndexColumn.
  visitSearchIndexColumn(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#indexName.
  visitIndexName(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#indexColumnSpec.
  visitIndexColumnSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#indexKeysSpec.
  visitIndexKeysSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#indexEntriesSSpec.
  visitIndexEntriesSSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#indexFullSpec.
  visitIndexFullSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#indexValuesSpec.
  visitIndexValuesSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#deleteStatement.
  visitDeleteStatement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#deleteColumnList.
  visitDeleteColumnList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#deleteColumnItem.
  visitDeleteColumnItem(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#update.
  visitUpdate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#ifSpec.
  visitIfSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#ifConditionList.
  visitIfConditionList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#ifCondition.
  visitIfCondition(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignments.
  visitAssignments(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignmentElement.
  visitAssignmentElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignmentSet.
  visitAssignmentSet(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignmentMap.
  visitAssignmentMap(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignmentMapExpression.
  visitAssignmentMapExpression(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignmentList.
  visitAssignmentList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#assignmentTuple.
  visitAssignmentTuple(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#insert.
  visitInsert(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#usingTtlTimestamp.
  visitUsingTtlTimestamp(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#timestamp.
  visitTimestamp(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#ttl.
  visitTtl(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#usingTimestampSpec.
  visitUsingTimestampSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#ifNotExist.
  visitIfNotExist(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#ifExist.
  visitIfExist(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#insertValuesSpec.
  visitInsertValuesSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#insertColumnSpec.
  visitInsertColumnSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#columnList.
  visitColumnList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#expressionList.
  visitExpressionList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#expression.
  visitExpression(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#select.
  visitSelect(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#allowFilteringSpec.
  visitAllowFilteringSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#limitSpec.
  visitLimitSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#fromSpec.
  visitFromSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#fromSpecElement.
  visitFromSpecElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#orderSpec.
  visitOrderSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#orderSpecElement.
  visitOrderSpecElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#whereSpec.
  visitWhereSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#distinctSpec.
  visitDistinctSpec(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#selectElements.
  visitSelectElements(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#selectElement.
  visitSelectElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#relationElements.
  visitRelationElements(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#relationElement.
  visitRelationElement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#relalationContains.
  visitRelalationContains(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#relalationContainsKey.
  visitRelalationContainsKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#functionCall.
  visitFunctionCall(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#functionArgs.
  visitFunctionArgs(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#constant.
  visitConstant(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#decimalLiteral.
  visitDecimalLiteral(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#floatLiteral.
  visitFloatLiteral(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#stringLiteral.
  visitStringLiteral(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#booleanLiteral.
  visitBooleanLiteral(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#hexadecimalLiteral.
  visitHexadecimalLiteral(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#keyspace.
  visitKeyspace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#table.
  visitTable(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#column.
  visitColumn(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dataType.
  visitDataType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dataTypeName.
  visitDataTypeName(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#dataTypeDefinition.
  visitDataTypeDefinition(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#orderDirection.
  visitOrderDirection(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#role.
  visitRole(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#trigger.
  visitTrigger(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#triggerClass.
  visitTriggerClass(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#materializedView.
  visitMaterializedView(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#type.
  visitType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#aggregate.
  visitAggregate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#functionStatement.
  visitFunctionStatement(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#language.
  visitLanguage(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#user.
  visitUser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#password.
  visitPassword(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#hashKey.
  visitHashKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#param.
  visitParam(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#paramName.
  visitParamName(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAdd.
  visitKwAdd(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAggregate.
  visitKwAggregate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAll.
  visitKwAll(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAllPermissions.
  visitKwAllPermissions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAllow.
  visitKwAllow(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAlter.
  visitKwAlter(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAnd.
  visitKwAnd(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwApply.
  visitKwApply(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAs.
  visitKwAs(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAsc.
  visitKwAsc(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAuthorize.
  visitKwAuthorize(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwBatch.
  visitKwBatch(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwBegin.
  visitKwBegin(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwBy.
  visitKwBy(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwCalled.
  visitKwCalled(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwClustering.
  visitKwClustering(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwCompact.
  visitKwCompact(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwContains.
  visitKwContains(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwCreate.
  visitKwCreate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDelete.
  visitKwDelete(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDesc.
  visitKwDesc(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDescibe.
  visitKwDescibe(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDistinct.
  visitKwDistinct(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDrop.
  visitKwDrop(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDurableWrites.
  visitKwDurableWrites(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwEntries.
  visitKwEntries(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwExecute.
  visitKwExecute(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwExists.
  visitKwExists(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFiltering.
  visitKwFiltering(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFinalfunc.
  visitKwFinalfunc(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFrom.
  visitKwFrom(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFull.
  visitKwFull(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFunction.
  visitKwFunction(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFunctions.
  visitKwFunctions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwGrant.
  visitKwGrant(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwIf.
  visitKwIf(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwIn.
  visitKwIn(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwIndex.
  visitKwIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwCustom.
  visitKwCustom(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSearch.
  visitKwSearch(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAscii.
  visitKwAscii(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNormalize.
  visitKwNormalize(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAnalyzed.
  visitKwAnalyzed(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwIsLiteral.
  visitKwIsLiteral(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwMaxCompactionFlushMemoryInMb.
  visitKwMaxCompactionFlushMemoryInMb(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTokenizationEnableStemming.
  visitKwTokenizationEnableStemming(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTokenizationSkipStopWords.
  visitKwTokenizationSkipStopWords(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTokenizationLocale.
  visitKwTokenizationLocale(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTokenizationNormalizeLowercase.
  visitKwTokenizationNormalizeLowercase(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTokenizationNormalizeUppercase.
  visitKwTokenizationNormalizeUppercase(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNormalizeLowercase.
  visitKwNormalizeLowercase(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNormalizeUppercase.
  visitKwNormalizeUppercase(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwMode.
  visitKwMode(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAnalyzerClass.
  visitKwAnalyzerClass(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwStorageAttachedIndex.
  visitKwStorageAttachedIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSolrIndex.
  visitKwSolrIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSASIIndex.
  visitKwSASIIndex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSpaceSavingNoJoin.
  visitKwSpaceSavingNoJoin(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSpaceSavingAll.
  visitKwSpaceSavingAll(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSpaceSavingSlowTriePrecision.
  visitKwSpaceSavingSlowTriePrecision(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSpaceSavingNoTextField.
  visitKwSpaceSavingNoTextField(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwCopyField.
  visitKwCopyField(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDocValues.
  visitKwDocValues(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwExcluded.
  visitKwExcluded(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwIndexed.
  visitKwIndexed(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLowerCase.
  visitKwLowerCase(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwColumns.
  visitKwColumns(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwProfiles.
  visitKwProfiles(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwConfig.
  visitKwConfig(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwAutoCommitTime.
  visitKwAutoCommitTime(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDefaultQueryField.
  visitKwDefaultQueryField(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDirectoryFactory.
  visitKwDirectoryFactory(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFilterCacheLowWaterMark.
  visitKwFilterCacheLowWaterMark(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwFilterCacheHighWaterMark.
  visitKwFilterCacheHighWaterMark(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwDirectoryFactoryClass.
  visitKwDirectoryFactoryClass(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwMergeMaxThreadCount.
  visitKwMergeMaxThreadCount(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwMergeMaxMergeCount.
  visitKwMergeMaxMergeCount(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRamBufferSize.
  visitKwRamBufferSize(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRealtime.
  visitKwRealtime(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRecovery.
  visitKwRecovery(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwReindex.
  visitKwReindex(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLenient.
  visitKwLenient(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwStandard.
  visitKwStandard(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwEncrypted.
  visitKwEncrypted(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwCaseSensitive.
  visitKwCaseSensitive(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSimilarityFunction.
  visitKwSimilarityFunction(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwInitcond.
  visitKwInitcond(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwInput.
  visitKwInput(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwInsert.
  visitKwInsert(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwInto.
  visitKwInto(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwIs.
  visitKwIs(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwJson.
  visitKwJson(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwKey.
  visitKwKey(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwKeys.
  visitKwKeys(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwKeyspace.
  visitKwKeyspace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwKeyspaces.
  visitKwKeyspaces(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLanguage.
  visitKwLanguage(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLimit.
  visitKwLimit(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwList.
  visitKwList(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLogged.
  visitKwLogged(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLogin.
  visitKwLogin(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwMaterialized.
  visitKwMaterialized(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwModify.
  visitKwModify(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNosuperuser.
  visitKwNosuperuser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNorecursive.
  visitKwNorecursive(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNot.
  visitKwNot(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwNull.
  visitKwNull(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwOf.
  visitKwOf(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwOn.
  visitKwOn(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwOptions.
  visitKwOptions(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwOr.
  visitKwOr(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwOrder.
  visitKwOrder(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwPassword.
  visitKwPassword(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwPrimary.
  visitKwPrimary(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRename.
  visitKwRename(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwReplace.
  visitKwReplace(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwReplication.
  visitKwReplication(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwReturns.
  visitKwReturns(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRole.
  visitKwRole(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwInternal.
  visitKwInternal(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwLdap.
  visitKwLdap(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwScheme.
  visitKwScheme(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRoles.
  visitKwRoles(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSelect.
  visitKwSelect(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSet.
  visitKwSet(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSfunc.
  visitKwSfunc(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwStorage.
  visitKwStorage(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwStype.
  visitKwStype(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwSuperuser.
  visitKwSuperuser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTable.
  visitKwTable(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTimestamp.
  visitKwTimestamp(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTo.
  visitKwTo(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTrigger.
  visitKwTrigger(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTruncate.
  visitKwTruncate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwTtl.
  visitKwTtl(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwType.
  visitKwType(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwUnlogged.
  visitKwUnlogged(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwUpdate.
  visitKwUpdate(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwUse.
  visitKwUse(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwUser.
  visitKwUser(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwUsers.
  visitKwUsers(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwUsing.
  visitKwUsing(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwValues.
  visitKwValues(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwView.
  visitKwView(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwWhere.
  visitKwWhere(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwWith.
  visitKwWith(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#kwRevoke.
  visitKwRevoke(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#eof.
  visitEof(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketLr.
  visitSyntaxBracketLr(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketRr.
  visitSyntaxBracketRr(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketLc.
  visitSyntaxBracketLc(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketRc.
  visitSyntaxBracketRc(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketLa.
  visitSyntaxBracketLa(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketRa.
  visitSyntaxBracketRa(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketLs.
  visitSyntaxBracketLs(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxBracketRs.
  visitSyntaxBracketRs(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxComma.
  visitSyntaxComma(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#syntaxColon.
  visitSyntaxColon(ctx) {
    return this.visitChildren(ctx);
  }

  // Visit a parse tree produced by CqlParser#id.
  visitId(ctx) {
    return this.visitChildren(ctx);
  }
}

exports.CqlParserVisitor = CqlParserVisitor;
