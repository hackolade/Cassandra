// Generated from grammars/CqlParser.g4 by ANTLR 4.9.2
// jshint ignore: start
var antlr4 = require("antlr4/index");

// This class defines a complete listener for a parse tree produced by CqlParser.
class CqlParserListener extends antlr4.tree.ParseTreeListener {
  // Enter a parse tree produced by CqlParser#root.
  enterRoot(ctx) {}

  // Exit a parse tree produced by CqlParser#root.
  exitRoot(ctx) {}

  // Enter a parse tree produced by CqlParser#cqls.
  enterCqls(ctx) {}

  // Exit a parse tree produced by CqlParser#cqls.
  exitCqls(ctx) {}

  // Enter a parse tree produced by CqlParser#statementSeparator.
  enterStatementSeparator(ctx) {}

  // Exit a parse tree produced by CqlParser#statementSeparator.
  exitStatementSeparator(ctx) {}

  // Enter a parse tree produced by CqlParser#empty.
  enterEmpty(ctx) {}

  // Exit a parse tree produced by CqlParser#empty.
  exitEmpty(ctx) {}

  // Enter a parse tree produced by CqlParser#cql.
  enterCql(ctx) {}

  // Exit a parse tree produced by CqlParser#cql.
  exitCql(ctx) {}

  // Enter a parse tree produced by CqlParser#revoke.
  enterRevoke(ctx) {}

  // Exit a parse tree produced by CqlParser#revoke.
  exitRevoke(ctx) {}

  // Enter a parse tree produced by CqlParser#listUsers.
  enterListUsers(ctx) {}

  // Exit a parse tree produced by CqlParser#listUsers.
  exitListUsers(ctx) {}

  // Enter a parse tree produced by CqlParser#listRoles.
  enterListRoles(ctx) {}

  // Exit a parse tree produced by CqlParser#listRoles.
  exitListRoles(ctx) {}

  // Enter a parse tree produced by CqlParser#listPermissions.
  enterListPermissions(ctx) {}

  // Exit a parse tree produced by CqlParser#listPermissions.
  exitListPermissions(ctx) {}

  // Enter a parse tree produced by CqlParser#grant.
  enterGrant(ctx) {}

  // Exit a parse tree produced by CqlParser#grant.
  exitGrant(ctx) {}

  // Enter a parse tree produced by CqlParser#priviledge.
  enterPriviledge(ctx) {}

  // Exit a parse tree produced by CqlParser#priviledge.
  exitPriviledge(ctx) {}

  // Enter a parse tree produced by CqlParser#resource.
  enterResource(ctx) {}

  // Exit a parse tree produced by CqlParser#resource.
  exitResource(ctx) {}

  // Enter a parse tree produced by CqlParser#createUser.
  enterCreateUser(ctx) {}

  // Exit a parse tree produced by CqlParser#createUser.
  exitCreateUser(ctx) {}

  // Enter a parse tree produced by CqlParser#createRole.
  enterCreateRole(ctx) {}

  // Exit a parse tree produced by CqlParser#createRole.
  exitCreateRole(ctx) {}

  // Enter a parse tree produced by CqlParser#createType.
  enterCreateType(ctx) {}

  // Exit a parse tree produced by CqlParser#createType.
  exitCreateType(ctx) {}

  // Enter a parse tree produced by CqlParser#typeMemberColumnList.
  enterTypeMemberColumnList(ctx) {}

  // Exit a parse tree produced by CqlParser#typeMemberColumnList.
  exitTypeMemberColumnList(ctx) {}

  // Enter a parse tree produced by CqlParser#createTrigger.
  enterCreateTrigger(ctx) {}

  // Exit a parse tree produced by CqlParser#createTrigger.
  exitCreateTrigger(ctx) {}

  // Enter a parse tree produced by CqlParser#createMaterializedView.
  enterCreateMaterializedView(ctx) {}

  // Exit a parse tree produced by CqlParser#createMaterializedView.
  exitCreateMaterializedView(ctx) {}

  // Enter a parse tree produced by CqlParser#materializedViewWhere.
  enterMaterializedViewWhere(ctx) {}

  // Exit a parse tree produced by CqlParser#materializedViewWhere.
  exitMaterializedViewWhere(ctx) {}

  // Enter a parse tree produced by CqlParser#columnNotNullList.
  enterColumnNotNullList(ctx) {}

  // Exit a parse tree produced by CqlParser#columnNotNullList.
  exitColumnNotNullList(ctx) {}

  // Enter a parse tree produced by CqlParser#columnNotNull.
  enterColumnNotNull(ctx) {}

  // Exit a parse tree produced by CqlParser#columnNotNull.
  exitColumnNotNull(ctx) {}

  // Enter a parse tree produced by CqlParser#materializedViewOptions.
  enterMaterializedViewOptions(ctx) {}

  // Exit a parse tree produced by CqlParser#materializedViewOptions.
  exitMaterializedViewOptions(ctx) {}

  // Enter a parse tree produced by CqlParser#createKeyspace.
  enterCreateKeyspace(ctx) {}

  // Exit a parse tree produced by CqlParser#createKeyspace.
  exitCreateKeyspace(ctx) {}

  // Enter a parse tree produced by CqlParser#createFunction.
  enterCreateFunction(ctx) {}

  // Exit a parse tree produced by CqlParser#createFunction.
  exitCreateFunction(ctx) {}

  // Enter a parse tree produced by CqlParser#codeBlock.
  enterCodeBlock(ctx) {}

  // Exit a parse tree produced by CqlParser#codeBlock.
  exitCodeBlock(ctx) {}

  // Enter a parse tree produced by CqlParser#paramList.
  enterParamList(ctx) {}

  // Exit a parse tree produced by CqlParser#paramList.
  exitParamList(ctx) {}

  // Enter a parse tree produced by CqlParser#returnMode.
  enterReturnMode(ctx) {}

  // Exit a parse tree produced by CqlParser#returnMode.
  exitReturnMode(ctx) {}

  // Enter a parse tree produced by CqlParser#createAggregate.
  enterCreateAggregate(ctx) {}

  // Exit a parse tree produced by CqlParser#createAggregate.
  exitCreateAggregate(ctx) {}

  // Enter a parse tree produced by CqlParser#initCondDefinition.
  enterInitCondDefinition(ctx) {}

  // Exit a parse tree produced by CqlParser#initCondDefinition.
  exitInitCondDefinition(ctx) {}

  // Enter a parse tree produced by CqlParser#initCondHash.
  enterInitCondHash(ctx) {}

  // Exit a parse tree produced by CqlParser#initCondHash.
  exitInitCondHash(ctx) {}

  // Enter a parse tree produced by CqlParser#initCondHashItem.
  enterInitCondHashItem(ctx) {}

  // Exit a parse tree produced by CqlParser#initCondHashItem.
  exitInitCondHashItem(ctx) {}

  // Enter a parse tree produced by CqlParser#initCondListNested.
  enterInitCondListNested(ctx) {}

  // Exit a parse tree produced by CqlParser#initCondListNested.
  exitInitCondListNested(ctx) {}

  // Enter a parse tree produced by CqlParser#initCondList.
  enterInitCondList(ctx) {}

  // Exit a parse tree produced by CqlParser#initCondList.
  exitInitCondList(ctx) {}

  // Enter a parse tree produced by CqlParser#orReplace.
  enterOrReplace(ctx) {}

  // Exit a parse tree produced by CqlParser#orReplace.
  exitOrReplace(ctx) {}

  // Enter a parse tree produced by CqlParser#alterUser.
  enterAlterUser(ctx) {}

  // Exit a parse tree produced by CqlParser#alterUser.
  exitAlterUser(ctx) {}

  // Enter a parse tree produced by CqlParser#userPassword.
  enterUserPassword(ctx) {}

  // Exit a parse tree produced by CqlParser#userPassword.
  exitUserPassword(ctx) {}

  // Enter a parse tree produced by CqlParser#userSuperUser.
  enterUserSuperUser(ctx) {}

  // Exit a parse tree produced by CqlParser#userSuperUser.
  exitUserSuperUser(ctx) {}

  // Enter a parse tree produced by CqlParser#alterType.
  enterAlterType(ctx) {}

  // Exit a parse tree produced by CqlParser#alterType.
  exitAlterType(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTypeOperation.
  enterAlterTypeOperation(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTypeOperation.
  exitAlterTypeOperation(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTypeRename.
  enterAlterTypeRename(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTypeRename.
  exitAlterTypeRename(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTypeRenameList.
  enterAlterTypeRenameList(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTypeRenameList.
  exitAlterTypeRenameList(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTypeRenameItem.
  enterAlterTypeRenameItem(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTypeRenameItem.
  exitAlterTypeRenameItem(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTypeAdd.
  enterAlterTypeAdd(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTypeAdd.
  exitAlterTypeAdd(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTypeAlterType.
  enterAlterTypeAlterType(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTypeAlterType.
  exitAlterTypeAlterType(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTable.
  enterAlterTable(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTable.
  exitAlterTable(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableOperation.
  enterAlterTableOperation(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableOperation.
  exitAlterTableOperation(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableWith.
  enterAlterTableWith(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableWith.
  exitAlterTableWith(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableRename.
  enterAlterTableRename(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableRename.
  exitAlterTableRename(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableDropCompactStorage.
  enterAlterTableDropCompactStorage(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableDropCompactStorage.
  exitAlterTableDropCompactStorage(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableDropColumns.
  enterAlterTableDropColumns(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableDropColumns.
  exitAlterTableDropColumns(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableDropColumnList.
  enterAlterTableDropColumnList(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableDropColumnList.
  exitAlterTableDropColumnList(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableAdd.
  enterAlterTableAdd(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableAdd.
  exitAlterTableAdd(ctx) {}

  // Enter a parse tree produced by CqlParser#alterTableColumnDefinition.
  enterAlterTableColumnDefinition(ctx) {}

  // Exit a parse tree produced by CqlParser#alterTableColumnDefinition.
  exitAlterTableColumnDefinition(ctx) {}

  // Enter a parse tree produced by CqlParser#alterRole.
  enterAlterRole(ctx) {}

  // Exit a parse tree produced by CqlParser#alterRole.
  exitAlterRole(ctx) {}

  // Enter a parse tree produced by CqlParser#roleWith.
  enterRoleWith(ctx) {}

  // Exit a parse tree produced by CqlParser#roleWith.
  exitRoleWith(ctx) {}

  // Enter a parse tree produced by CqlParser#roleWithOptions.
  enterRoleWithOptions(ctx) {}

  // Exit a parse tree produced by CqlParser#roleWithOptions.
  exitRoleWithOptions(ctx) {}

  // Enter a parse tree produced by CqlParser#alterMaterializedView.
  enterAlterMaterializedView(ctx) {}

  // Exit a parse tree produced by CqlParser#alterMaterializedView.
  exitAlterMaterializedView(ctx) {}

  // Enter a parse tree produced by CqlParser#dropUser.
  enterDropUser(ctx) {}

  // Exit a parse tree produced by CqlParser#dropUser.
  exitDropUser(ctx) {}

  // Enter a parse tree produced by CqlParser#dropType.
  enterDropType(ctx) {}

  // Exit a parse tree produced by CqlParser#dropType.
  exitDropType(ctx) {}

  // Enter a parse tree produced by CqlParser#dropMaterializedView.
  enterDropMaterializedView(ctx) {}

  // Exit a parse tree produced by CqlParser#dropMaterializedView.
  exitDropMaterializedView(ctx) {}

  // Enter a parse tree produced by CqlParser#dropAggregate.
  enterDropAggregate(ctx) {}

  // Exit a parse tree produced by CqlParser#dropAggregate.
  exitDropAggregate(ctx) {}

  // Enter a parse tree produced by CqlParser#dropFunction.
  enterDropFunction(ctx) {}

  // Exit a parse tree produced by CqlParser#dropFunction.
  exitDropFunction(ctx) {}

  // Enter a parse tree produced by CqlParser#dropTrigger.
  enterDropTrigger(ctx) {}

  // Exit a parse tree produced by CqlParser#dropTrigger.
  exitDropTrigger(ctx) {}

  // Enter a parse tree produced by CqlParser#dropRole.
  enterDropRole(ctx) {}

  // Exit a parse tree produced by CqlParser#dropRole.
  exitDropRole(ctx) {}

  // Enter a parse tree produced by CqlParser#dropTable.
  enterDropTable(ctx) {}

  // Exit a parse tree produced by CqlParser#dropTable.
  exitDropTable(ctx) {}

  // Enter a parse tree produced by CqlParser#dropKeyspace.
  enterDropKeyspace(ctx) {}

  // Exit a parse tree produced by CqlParser#dropKeyspace.
  exitDropKeyspace(ctx) {}

  // Enter a parse tree produced by CqlParser#dropIndex.
  enterDropIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#dropIndex.
  exitDropIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#createTable.
  enterCreateTable(ctx) {}

  // Exit a parse tree produced by CqlParser#createTable.
  exitCreateTable(ctx) {}

  // Enter a parse tree produced by CqlParser#withElement.
  enterWithElement(ctx) {}

  // Exit a parse tree produced by CqlParser#withElement.
  exitWithElement(ctx) {}

  // Enter a parse tree produced by CqlParser#clusteringOrderColumns.
  enterClusteringOrderColumns(ctx) {}

  // Exit a parse tree produced by CqlParser#clusteringOrderColumns.
  exitClusteringOrderColumns(ctx) {}

  // Enter a parse tree produced by CqlParser#clusteringOrder.
  enterClusteringOrder(ctx) {}

  // Exit a parse tree produced by CqlParser#clusteringOrder.
  exitClusteringOrder(ctx) {}

  // Enter a parse tree produced by CqlParser#tableOptions.
  enterTableOptions(ctx) {}

  // Exit a parse tree produced by CqlParser#tableOptions.
  exitTableOptions(ctx) {}

  // Enter a parse tree produced by CqlParser#tableOptionItem.
  enterTableOptionItem(ctx) {}

  // Exit a parse tree produced by CqlParser#tableOptionItem.
  exitTableOptionItem(ctx) {}

  // Enter a parse tree produced by CqlParser#tableOptionName.
  enterTableOptionName(ctx) {}

  // Exit a parse tree produced by CqlParser#tableOptionName.
  exitTableOptionName(ctx) {}

  // Enter a parse tree produced by CqlParser#tableOptionValue.
  enterTableOptionValue(ctx) {}

  // Exit a parse tree produced by CqlParser#tableOptionValue.
  exitTableOptionValue(ctx) {}

  // Enter a parse tree produced by CqlParser#optionHash.
  enterOptionHash(ctx) {}

  // Exit a parse tree produced by CqlParser#optionHash.
  exitOptionHash(ctx) {}

  // Enter a parse tree produced by CqlParser#optionHashItem.
  enterOptionHashItem(ctx) {}

  // Exit a parse tree produced by CqlParser#optionHashItem.
  exitOptionHashItem(ctx) {}

  // Enter a parse tree produced by CqlParser#optionHashKey.
  enterOptionHashKey(ctx) {}

  // Exit a parse tree produced by CqlParser#optionHashKey.
  exitOptionHashKey(ctx) {}

  // Enter a parse tree produced by CqlParser#optionHashValue.
  enterOptionHashValue(ctx) {}

  // Exit a parse tree produced by CqlParser#optionHashValue.
  exitOptionHashValue(ctx) {}

  // Enter a parse tree produced by CqlParser#columnDefinitionList.
  enterColumnDefinitionList(ctx) {}

  // Exit a parse tree produced by CqlParser#columnDefinitionList.
  exitColumnDefinitionList(ctx) {}

  // Enter a parse tree produced by CqlParser#columnDefinition.
  enterColumnDefinition(ctx) {}

  // Exit a parse tree produced by CqlParser#columnDefinition.
  exitColumnDefinition(ctx) {}

  // Enter a parse tree produced by CqlParser#primaryKeyColumn.
  enterPrimaryKeyColumn(ctx) {}

  // Exit a parse tree produced by CqlParser#primaryKeyColumn.
  exitPrimaryKeyColumn(ctx) {}

  // Enter a parse tree produced by CqlParser#primaryKeyElement.
  enterPrimaryKeyElement(ctx) {}

  // Exit a parse tree produced by CqlParser#primaryKeyElement.
  exitPrimaryKeyElement(ctx) {}

  // Enter a parse tree produced by CqlParser#primaryKeyDefinition.
  enterPrimaryKeyDefinition(ctx) {}

  // Exit a parse tree produced by CqlParser#primaryKeyDefinition.
  exitPrimaryKeyDefinition(ctx) {}

  // Enter a parse tree produced by CqlParser#singlePrimaryKey.
  enterSinglePrimaryKey(ctx) {}

  // Exit a parse tree produced by CqlParser#singlePrimaryKey.
  exitSinglePrimaryKey(ctx) {}

  // Enter a parse tree produced by CqlParser#compoundKey.
  enterCompoundKey(ctx) {}

  // Exit a parse tree produced by CqlParser#compoundKey.
  exitCompoundKey(ctx) {}

  // Enter a parse tree produced by CqlParser#compositeKey.
  enterCompositeKey(ctx) {}

  // Exit a parse tree produced by CqlParser#compositeKey.
  exitCompositeKey(ctx) {}

  // Enter a parse tree produced by CqlParser#partitionKeyList.
  enterPartitionKeyList(ctx) {}

  // Exit a parse tree produced by CqlParser#partitionKeyList.
  exitPartitionKeyList(ctx) {}

  // Enter a parse tree produced by CqlParser#clusteringKeyList.
  enterClusteringKeyList(ctx) {}

  // Exit a parse tree produced by CqlParser#clusteringKeyList.
  exitClusteringKeyList(ctx) {}

  // Enter a parse tree produced by CqlParser#partitionKey.
  enterPartitionKey(ctx) {}

  // Exit a parse tree produced by CqlParser#partitionKey.
  exitPartitionKey(ctx) {}

  // Enter a parse tree produced by CqlParser#clusteringKey.
  enterClusteringKey(ctx) {}

  // Exit a parse tree produced by CqlParser#clusteringKey.
  exitClusteringKey(ctx) {}

  // Enter a parse tree produced by CqlParser#applyBatch.
  enterApplyBatch(ctx) {}

  // Exit a parse tree produced by CqlParser#applyBatch.
  exitApplyBatch(ctx) {}

  // Enter a parse tree produced by CqlParser#beginBatch.
  enterBeginBatch(ctx) {}

  // Exit a parse tree produced by CqlParser#beginBatch.
  exitBeginBatch(ctx) {}

  // Enter a parse tree produced by CqlParser#batchType.
  enterBatchType(ctx) {}

  // Exit a parse tree produced by CqlParser#batchType.
  exitBatchType(ctx) {}

  // Enter a parse tree produced by CqlParser#alterKeyspace.
  enterAlterKeyspace(ctx) {}

  // Exit a parse tree produced by CqlParser#alterKeyspace.
  exitAlterKeyspace(ctx) {}

  // Enter a parse tree produced by CqlParser#replicationList.
  enterReplicationList(ctx) {}

  // Exit a parse tree produced by CqlParser#replicationList.
  exitReplicationList(ctx) {}

  // Enter a parse tree produced by CqlParser#replicationListItem.
  enterReplicationListItem(ctx) {}

  // Exit a parse tree produced by CqlParser#replicationListItem.
  exitReplicationListItem(ctx) {}

  // Enter a parse tree produced by CqlParser#durableWrites.
  enterDurableWrites(ctx) {}

  // Exit a parse tree produced by CqlParser#durableWrites.
  exitDurableWrites(ctx) {}

  // Enter a parse tree produced by CqlParser#use.
  enterUse(ctx) {}

  // Exit a parse tree produced by CqlParser#use.
  exitUse(ctx) {}

  // Enter a parse tree produced by CqlParser#truncate.
  enterTruncate(ctx) {}

  // Exit a parse tree produced by CqlParser#truncate.
  exitTruncate(ctx) {}

  // Enter a parse tree produced by CqlParser#secondaryIndex.
  enterSecondaryIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#secondaryIndex.
  exitSecondaryIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#customIndex.
  enterCustomIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#customIndex.
  exitCustomIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#customIndexOption.
  enterCustomIndexOption(ctx) {}

  // Exit a parse tree produced by CqlParser#customIndexOption.
  exitCustomIndexOption(ctx) {}

  // Enter a parse tree produced by CqlParser#createSearchIndex.
  enterCreateSearchIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#createSearchIndex.
  exitCreateSearchIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#searchIndexConfigs.
  enterSearchIndexConfigs(ctx) {}

  // Exit a parse tree produced by CqlParser#searchIndexConfigs.
  exitSearchIndexConfigs(ctx) {}

  // Enter a parse tree produced by CqlParser#directoryFactory.
  enterDirectoryFactory(ctx) {}

  // Exit a parse tree produced by CqlParser#directoryFactory.
  exitDirectoryFactory(ctx) {}

  // Enter a parse tree produced by CqlParser#searchIndexOptions.
  enterSearchIndexOptions(ctx) {}

  // Exit a parse tree produced by CqlParser#searchIndexOptions.
  exitSearchIndexOptions(ctx) {}

  // Enter a parse tree produced by CqlParser#searchIndexProfile.
  enterSearchIndexProfile(ctx) {}

  // Exit a parse tree produced by CqlParser#searchIndexProfile.
  exitSearchIndexProfile(ctx) {}

  // Enter a parse tree produced by CqlParser#searchIndexProfiles.
  enterSearchIndexProfiles(ctx) {}

  // Exit a parse tree produced by CqlParser#searchIndexProfiles.
  exitSearchIndexProfiles(ctx) {}

  // Enter a parse tree produced by CqlParser#searchIndexColumnList.
  enterSearchIndexColumnList(ctx) {}

  // Exit a parse tree produced by CqlParser#searchIndexColumnList.
  exitSearchIndexColumnList(ctx) {}

  // Enter a parse tree produced by CqlParser#searchIndexColumn.
  enterSearchIndexColumn(ctx) {}

  // Exit a parse tree produced by CqlParser#searchIndexColumn.
  exitSearchIndexColumn(ctx) {}

  // Enter a parse tree produced by CqlParser#indexName.
  enterIndexName(ctx) {}

  // Exit a parse tree produced by CqlParser#indexName.
  exitIndexName(ctx) {}

  // Enter a parse tree produced by CqlParser#indexColumnSpec.
  enterIndexColumnSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#indexColumnSpec.
  exitIndexColumnSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#indexKeysSpec.
  enterIndexKeysSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#indexKeysSpec.
  exitIndexKeysSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#indexEntriesSSpec.
  enterIndexEntriesSSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#indexEntriesSSpec.
  exitIndexEntriesSSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#indexFullSpec.
  enterIndexFullSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#indexFullSpec.
  exitIndexFullSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#indexValuesSpec.
  enterIndexValuesSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#indexValuesSpec.
  exitIndexValuesSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#deleteStatement.
  enterDeleteStatement(ctx) {}

  // Exit a parse tree produced by CqlParser#deleteStatement.
  exitDeleteStatement(ctx) {}

  // Enter a parse tree produced by CqlParser#deleteColumnList.
  enterDeleteColumnList(ctx) {}

  // Exit a parse tree produced by CqlParser#deleteColumnList.
  exitDeleteColumnList(ctx) {}

  // Enter a parse tree produced by CqlParser#deleteColumnItem.
  enterDeleteColumnItem(ctx) {}

  // Exit a parse tree produced by CqlParser#deleteColumnItem.
  exitDeleteColumnItem(ctx) {}

  // Enter a parse tree produced by CqlParser#update.
  enterUpdate(ctx) {}

  // Exit a parse tree produced by CqlParser#update.
  exitUpdate(ctx) {}

  // Enter a parse tree produced by CqlParser#ifSpec.
  enterIfSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#ifSpec.
  exitIfSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#ifConditionList.
  enterIfConditionList(ctx) {}

  // Exit a parse tree produced by CqlParser#ifConditionList.
  exitIfConditionList(ctx) {}

  // Enter a parse tree produced by CqlParser#ifCondition.
  enterIfCondition(ctx) {}

  // Exit a parse tree produced by CqlParser#ifCondition.
  exitIfCondition(ctx) {}

  // Enter a parse tree produced by CqlParser#assignments.
  enterAssignments(ctx) {}

  // Exit a parse tree produced by CqlParser#assignments.
  exitAssignments(ctx) {}

  // Enter a parse tree produced by CqlParser#assignmentElement.
  enterAssignmentElement(ctx) {}

  // Exit a parse tree produced by CqlParser#assignmentElement.
  exitAssignmentElement(ctx) {}

  // Enter a parse tree produced by CqlParser#assignmentSet.
  enterAssignmentSet(ctx) {}

  // Exit a parse tree produced by CqlParser#assignmentSet.
  exitAssignmentSet(ctx) {}

  // Enter a parse tree produced by CqlParser#assignmentMap.
  enterAssignmentMap(ctx) {}

  // Exit a parse tree produced by CqlParser#assignmentMap.
  exitAssignmentMap(ctx) {}

  // Enter a parse tree produced by CqlParser#assignmentMapExpression.
  enterAssignmentMapExpression(ctx) {}

  // Exit a parse tree produced by CqlParser#assignmentMapExpression.
  exitAssignmentMapExpression(ctx) {}

  // Enter a parse tree produced by CqlParser#assignmentList.
  enterAssignmentList(ctx) {}

  // Exit a parse tree produced by CqlParser#assignmentList.
  exitAssignmentList(ctx) {}

  // Enter a parse tree produced by CqlParser#assignmentTuple.
  enterAssignmentTuple(ctx) {}

  // Exit a parse tree produced by CqlParser#assignmentTuple.
  exitAssignmentTuple(ctx) {}

  // Enter a parse tree produced by CqlParser#insert.
  enterInsert(ctx) {}

  // Exit a parse tree produced by CqlParser#insert.
  exitInsert(ctx) {}

  // Enter a parse tree produced by CqlParser#usingTtlTimestamp.
  enterUsingTtlTimestamp(ctx) {}

  // Exit a parse tree produced by CqlParser#usingTtlTimestamp.
  exitUsingTtlTimestamp(ctx) {}

  // Enter a parse tree produced by CqlParser#timestamp.
  enterTimestamp(ctx) {}

  // Exit a parse tree produced by CqlParser#timestamp.
  exitTimestamp(ctx) {}

  // Enter a parse tree produced by CqlParser#ttl.
  enterTtl(ctx) {}

  // Exit a parse tree produced by CqlParser#ttl.
  exitTtl(ctx) {}

  // Enter a parse tree produced by CqlParser#usingTimestampSpec.
  enterUsingTimestampSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#usingTimestampSpec.
  exitUsingTimestampSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#ifNotExist.
  enterIfNotExist(ctx) {}

  // Exit a parse tree produced by CqlParser#ifNotExist.
  exitIfNotExist(ctx) {}

  // Enter a parse tree produced by CqlParser#ifExist.
  enterIfExist(ctx) {}

  // Exit a parse tree produced by CqlParser#ifExist.
  exitIfExist(ctx) {}

  // Enter a parse tree produced by CqlParser#insertValuesSpec.
  enterInsertValuesSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#insertValuesSpec.
  exitInsertValuesSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#insertColumnSpec.
  enterInsertColumnSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#insertColumnSpec.
  exitInsertColumnSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#columnList.
  enterColumnList(ctx) {}

  // Exit a parse tree produced by CqlParser#columnList.
  exitColumnList(ctx) {}

  // Enter a parse tree produced by CqlParser#expressionList.
  enterExpressionList(ctx) {}

  // Exit a parse tree produced by CqlParser#expressionList.
  exitExpressionList(ctx) {}

  // Enter a parse tree produced by CqlParser#expression.
  enterExpression(ctx) {}

  // Exit a parse tree produced by CqlParser#expression.
  exitExpression(ctx) {}

  // Enter a parse tree produced by CqlParser#select.
  enterSelect(ctx) {}

  // Exit a parse tree produced by CqlParser#select.
  exitSelect(ctx) {}

  // Enter a parse tree produced by CqlParser#allowFilteringSpec.
  enterAllowFilteringSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#allowFilteringSpec.
  exitAllowFilteringSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#limitSpec.
  enterLimitSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#limitSpec.
  exitLimitSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#fromSpec.
  enterFromSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#fromSpec.
  exitFromSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#fromSpecElement.
  enterFromSpecElement(ctx) {}

  // Exit a parse tree produced by CqlParser#fromSpecElement.
  exitFromSpecElement(ctx) {}

  // Enter a parse tree produced by CqlParser#orderSpec.
  enterOrderSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#orderSpec.
  exitOrderSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#orderSpecElement.
  enterOrderSpecElement(ctx) {}

  // Exit a parse tree produced by CqlParser#orderSpecElement.
  exitOrderSpecElement(ctx) {}

  // Enter a parse tree produced by CqlParser#whereSpec.
  enterWhereSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#whereSpec.
  exitWhereSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#distinctSpec.
  enterDistinctSpec(ctx) {}

  // Exit a parse tree produced by CqlParser#distinctSpec.
  exitDistinctSpec(ctx) {}

  // Enter a parse tree produced by CqlParser#selectElements.
  enterSelectElements(ctx) {}

  // Exit a parse tree produced by CqlParser#selectElements.
  exitSelectElements(ctx) {}

  // Enter a parse tree produced by CqlParser#selectElement.
  enterSelectElement(ctx) {}

  // Exit a parse tree produced by CqlParser#selectElement.
  exitSelectElement(ctx) {}

  // Enter a parse tree produced by CqlParser#relationElements.
  enterRelationElements(ctx) {}

  // Exit a parse tree produced by CqlParser#relationElements.
  exitRelationElements(ctx) {}

  // Enter a parse tree produced by CqlParser#relationElement.
  enterRelationElement(ctx) {}

  // Exit a parse tree produced by CqlParser#relationElement.
  exitRelationElement(ctx) {}

  // Enter a parse tree produced by CqlParser#relalationContains.
  enterRelalationContains(ctx) {}

  // Exit a parse tree produced by CqlParser#relalationContains.
  exitRelalationContains(ctx) {}

  // Enter a parse tree produced by CqlParser#relalationContainsKey.
  enterRelalationContainsKey(ctx) {}

  // Exit a parse tree produced by CqlParser#relalationContainsKey.
  exitRelalationContainsKey(ctx) {}

  // Enter a parse tree produced by CqlParser#functionCall.
  enterFunctionCall(ctx) {}

  // Exit a parse tree produced by CqlParser#functionCall.
  exitFunctionCall(ctx) {}

  // Enter a parse tree produced by CqlParser#functionArgs.
  enterFunctionArgs(ctx) {}

  // Exit a parse tree produced by CqlParser#functionArgs.
  exitFunctionArgs(ctx) {}

  // Enter a parse tree produced by CqlParser#constant.
  enterConstant(ctx) {}

  // Exit a parse tree produced by CqlParser#constant.
  exitConstant(ctx) {}

  // Enter a parse tree produced by CqlParser#decimalLiteral.
  enterDecimalLiteral(ctx) {}

  // Exit a parse tree produced by CqlParser#decimalLiteral.
  exitDecimalLiteral(ctx) {}

  // Enter a parse tree produced by CqlParser#floatLiteral.
  enterFloatLiteral(ctx) {}

  // Exit a parse tree produced by CqlParser#floatLiteral.
  exitFloatLiteral(ctx) {}

  // Enter a parse tree produced by CqlParser#stringLiteral.
  enterStringLiteral(ctx) {}

  // Exit a parse tree produced by CqlParser#stringLiteral.
  exitStringLiteral(ctx) {}

  // Enter a parse tree produced by CqlParser#booleanLiteral.
  enterBooleanLiteral(ctx) {}

  // Exit a parse tree produced by CqlParser#booleanLiteral.
  exitBooleanLiteral(ctx) {}

  // Enter a parse tree produced by CqlParser#hexadecimalLiteral.
  enterHexadecimalLiteral(ctx) {}

  // Exit a parse tree produced by CqlParser#hexadecimalLiteral.
  exitHexadecimalLiteral(ctx) {}

  // Enter a parse tree produced by CqlParser#keyspace.
  enterKeyspace(ctx) {}

  // Exit a parse tree produced by CqlParser#keyspace.
  exitKeyspace(ctx) {}

  // Enter a parse tree produced by CqlParser#table.
  enterTable(ctx) {}

  // Exit a parse tree produced by CqlParser#table.
  exitTable(ctx) {}

  // Enter a parse tree produced by CqlParser#column.
  enterColumn(ctx) {}

  // Exit a parse tree produced by CqlParser#column.
  exitColumn(ctx) {}

  // Enter a parse tree produced by CqlParser#dataType.
  enterDataType(ctx) {}

  // Exit a parse tree produced by CqlParser#dataType.
  exitDataType(ctx) {}

  // Enter a parse tree produced by CqlParser#dataTypeName.
  enterDataTypeName(ctx) {}

  // Exit a parse tree produced by CqlParser#dataTypeName.
  exitDataTypeName(ctx) {}

  // Enter a parse tree produced by CqlParser#dataTypeDefinition.
  enterDataTypeDefinition(ctx) {}

  // Exit a parse tree produced by CqlParser#dataTypeDefinition.
  exitDataTypeDefinition(ctx) {}

  // Enter a parse tree produced by CqlParser#orderDirection.
  enterOrderDirection(ctx) {}

  // Exit a parse tree produced by CqlParser#orderDirection.
  exitOrderDirection(ctx) {}

  // Enter a parse tree produced by CqlParser#role.
  enterRole(ctx) {}

  // Exit a parse tree produced by CqlParser#role.
  exitRole(ctx) {}

  // Enter a parse tree produced by CqlParser#trigger.
  enterTrigger(ctx) {}

  // Exit a parse tree produced by CqlParser#trigger.
  exitTrigger(ctx) {}

  // Enter a parse tree produced by CqlParser#triggerClass.
  enterTriggerClass(ctx) {}

  // Exit a parse tree produced by CqlParser#triggerClass.
  exitTriggerClass(ctx) {}

  // Enter a parse tree produced by CqlParser#materializedView.
  enterMaterializedView(ctx) {}

  // Exit a parse tree produced by CqlParser#materializedView.
  exitMaterializedView(ctx) {}

  // Enter a parse tree produced by CqlParser#type.
  enterType(ctx) {}

  // Exit a parse tree produced by CqlParser#type.
  exitType(ctx) {}

  // Enter a parse tree produced by CqlParser#aggregate.
  enterAggregate(ctx) {}

  // Exit a parse tree produced by CqlParser#aggregate.
  exitAggregate(ctx) {}

  // Enter a parse tree produced by CqlParser#functionStatement.
  enterFunctionStatement(ctx) {}

  // Exit a parse tree produced by CqlParser#functionStatement.
  exitFunctionStatement(ctx) {}

  // Enter a parse tree produced by CqlParser#language.
  enterLanguage(ctx) {}

  // Exit a parse tree produced by CqlParser#language.
  exitLanguage(ctx) {}

  // Enter a parse tree produced by CqlParser#user.
  enterUser(ctx) {}

  // Exit a parse tree produced by CqlParser#user.
  exitUser(ctx) {}

  // Enter a parse tree produced by CqlParser#password.
  enterPassword(ctx) {}

  // Exit a parse tree produced by CqlParser#password.
  exitPassword(ctx) {}

  // Enter a parse tree produced by CqlParser#hashKey.
  enterHashKey(ctx) {}

  // Exit a parse tree produced by CqlParser#hashKey.
  exitHashKey(ctx) {}

  // Enter a parse tree produced by CqlParser#param.
  enterParam(ctx) {}

  // Exit a parse tree produced by CqlParser#param.
  exitParam(ctx) {}

  // Enter a parse tree produced by CqlParser#paramName.
  enterParamName(ctx) {}

  // Exit a parse tree produced by CqlParser#paramName.
  exitParamName(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAdd.
  enterKwAdd(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAdd.
  exitKwAdd(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAggregate.
  enterKwAggregate(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAggregate.
  exitKwAggregate(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAll.
  enterKwAll(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAll.
  exitKwAll(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAllPermissions.
  enterKwAllPermissions(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAllPermissions.
  exitKwAllPermissions(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAllow.
  enterKwAllow(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAllow.
  exitKwAllow(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAlter.
  enterKwAlter(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAlter.
  exitKwAlter(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAnd.
  enterKwAnd(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAnd.
  exitKwAnd(ctx) {}

  // Enter a parse tree produced by CqlParser#kwApply.
  enterKwApply(ctx) {}

  // Exit a parse tree produced by CqlParser#kwApply.
  exitKwApply(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAs.
  enterKwAs(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAs.
  exitKwAs(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAsc.
  enterKwAsc(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAsc.
  exitKwAsc(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAuthorize.
  enterKwAuthorize(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAuthorize.
  exitKwAuthorize(ctx) {}

  // Enter a parse tree produced by CqlParser#kwBatch.
  enterKwBatch(ctx) {}

  // Exit a parse tree produced by CqlParser#kwBatch.
  exitKwBatch(ctx) {}

  // Enter a parse tree produced by CqlParser#kwBegin.
  enterKwBegin(ctx) {}

  // Exit a parse tree produced by CqlParser#kwBegin.
  exitKwBegin(ctx) {}

  // Enter a parse tree produced by CqlParser#kwBy.
  enterKwBy(ctx) {}

  // Exit a parse tree produced by CqlParser#kwBy.
  exitKwBy(ctx) {}

  // Enter a parse tree produced by CqlParser#kwCalled.
  enterKwCalled(ctx) {}

  // Exit a parse tree produced by CqlParser#kwCalled.
  exitKwCalled(ctx) {}

  // Enter a parse tree produced by CqlParser#kwClustering.
  enterKwClustering(ctx) {}

  // Exit a parse tree produced by CqlParser#kwClustering.
  exitKwClustering(ctx) {}

  // Enter a parse tree produced by CqlParser#kwCompact.
  enterKwCompact(ctx) {}

  // Exit a parse tree produced by CqlParser#kwCompact.
  exitKwCompact(ctx) {}

  // Enter a parse tree produced by CqlParser#kwContains.
  enterKwContains(ctx) {}

  // Exit a parse tree produced by CqlParser#kwContains.
  exitKwContains(ctx) {}

  // Enter a parse tree produced by CqlParser#kwCreate.
  enterKwCreate(ctx) {}

  // Exit a parse tree produced by CqlParser#kwCreate.
  exitKwCreate(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDelete.
  enterKwDelete(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDelete.
  exitKwDelete(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDesc.
  enterKwDesc(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDesc.
  exitKwDesc(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDescibe.
  enterKwDescibe(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDescibe.
  exitKwDescibe(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDistinct.
  enterKwDistinct(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDistinct.
  exitKwDistinct(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDrop.
  enterKwDrop(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDrop.
  exitKwDrop(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDurableWrites.
  enterKwDurableWrites(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDurableWrites.
  exitKwDurableWrites(ctx) {}

  // Enter a parse tree produced by CqlParser#kwEntries.
  enterKwEntries(ctx) {}

  // Exit a parse tree produced by CqlParser#kwEntries.
  exitKwEntries(ctx) {}

  // Enter a parse tree produced by CqlParser#kwExecute.
  enterKwExecute(ctx) {}

  // Exit a parse tree produced by CqlParser#kwExecute.
  exitKwExecute(ctx) {}

  // Enter a parse tree produced by CqlParser#kwExists.
  enterKwExists(ctx) {}

  // Exit a parse tree produced by CqlParser#kwExists.
  exitKwExists(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFiltering.
  enterKwFiltering(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFiltering.
  exitKwFiltering(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFinalfunc.
  enterKwFinalfunc(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFinalfunc.
  exitKwFinalfunc(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFrom.
  enterKwFrom(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFrom.
  exitKwFrom(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFull.
  enterKwFull(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFull.
  exitKwFull(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFunction.
  enterKwFunction(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFunction.
  exitKwFunction(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFunctions.
  enterKwFunctions(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFunctions.
  exitKwFunctions(ctx) {}

  // Enter a parse tree produced by CqlParser#kwGrant.
  enterKwGrant(ctx) {}

  // Exit a parse tree produced by CqlParser#kwGrant.
  exitKwGrant(ctx) {}

  // Enter a parse tree produced by CqlParser#kwIf.
  enterKwIf(ctx) {}

  // Exit a parse tree produced by CqlParser#kwIf.
  exitKwIf(ctx) {}

  // Enter a parse tree produced by CqlParser#kwIn.
  enterKwIn(ctx) {}

  // Exit a parse tree produced by CqlParser#kwIn.
  exitKwIn(ctx) {}

  // Enter a parse tree produced by CqlParser#kwIndex.
  enterKwIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#kwIndex.
  exitKwIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#kwCustom.
  enterKwCustom(ctx) {}

  // Exit a parse tree produced by CqlParser#kwCustom.
  exitKwCustom(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSearch.
  enterKwSearch(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSearch.
  exitKwSearch(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAscii.
  enterKwAscii(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAscii.
  exitKwAscii(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNormalize.
  enterKwNormalize(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNormalize.
  exitKwNormalize(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAnalyzed.
  enterKwAnalyzed(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAnalyzed.
  exitKwAnalyzed(ctx) {}

  // Enter a parse tree produced by CqlParser#kwIsLiteral.
  enterKwIsLiteral(ctx) {}

  // Exit a parse tree produced by CqlParser#kwIsLiteral.
  exitKwIsLiteral(ctx) {}

  // Enter a parse tree produced by CqlParser#kwMaxCompactionFlushMemoryInMb.
  enterKwMaxCompactionFlushMemoryInMb(ctx) {}

  // Exit a parse tree produced by CqlParser#kwMaxCompactionFlushMemoryInMb.
  exitKwMaxCompactionFlushMemoryInMb(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTokenizationEnableStemming.
  enterKwTokenizationEnableStemming(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTokenizationEnableStemming.
  exitKwTokenizationEnableStemming(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTokenizationSkipStopWords.
  enterKwTokenizationSkipStopWords(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTokenizationSkipStopWords.
  exitKwTokenizationSkipStopWords(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTokenizationLocale.
  enterKwTokenizationLocale(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTokenizationLocale.
  exitKwTokenizationLocale(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTokenizationNormalizeLowercase.
  enterKwTokenizationNormalizeLowercase(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTokenizationNormalizeLowercase.
  exitKwTokenizationNormalizeLowercase(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTokenizationNormalizeUppercase.
  enterKwTokenizationNormalizeUppercase(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTokenizationNormalizeUppercase.
  exitKwTokenizationNormalizeUppercase(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNormalizeLowercase.
  enterKwNormalizeLowercase(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNormalizeLowercase.
  exitKwNormalizeLowercase(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNormalizeUppercase.
  enterKwNormalizeUppercase(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNormalizeUppercase.
  exitKwNormalizeUppercase(ctx) {}

  // Enter a parse tree produced by CqlParser#kwMode.
  enterKwMode(ctx) {}

  // Exit a parse tree produced by CqlParser#kwMode.
  exitKwMode(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAnalyzerClass.
  enterKwAnalyzerClass(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAnalyzerClass.
  exitKwAnalyzerClass(ctx) {}

  // Enter a parse tree produced by CqlParser#kwStorageAttachedIndex.
  enterKwStorageAttachedIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#kwStorageAttachedIndex.
  exitKwStorageAttachedIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSolrIndex.
  enterKwSolrIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSolrIndex.
  exitKwSolrIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSASIIndex.
  enterKwSASIIndex(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSASIIndex.
  exitKwSASIIndex(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSpaceSavingNoJoin.
  enterKwSpaceSavingNoJoin(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSpaceSavingNoJoin.
  exitKwSpaceSavingNoJoin(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSpaceSavingAll.
  enterKwSpaceSavingAll(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSpaceSavingAll.
  exitKwSpaceSavingAll(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSpaceSavingSlowTriePrecision.
  enterKwSpaceSavingSlowTriePrecision(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSpaceSavingSlowTriePrecision.
  exitKwSpaceSavingSlowTriePrecision(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSpaceSavingNoTextField.
  enterKwSpaceSavingNoTextField(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSpaceSavingNoTextField.
  exitKwSpaceSavingNoTextField(ctx) {}

  // Enter a parse tree produced by CqlParser#kwCopyField.
  enterKwCopyField(ctx) {}

  // Exit a parse tree produced by CqlParser#kwCopyField.
  exitKwCopyField(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDocValues.
  enterKwDocValues(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDocValues.
  exitKwDocValues(ctx) {}

  // Enter a parse tree produced by CqlParser#kwExcluded.
  enterKwExcluded(ctx) {}

  // Exit a parse tree produced by CqlParser#kwExcluded.
  exitKwExcluded(ctx) {}

  // Enter a parse tree produced by CqlParser#kwIndexed.
  enterKwIndexed(ctx) {}

  // Exit a parse tree produced by CqlParser#kwIndexed.
  exitKwIndexed(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLowerCase.
  enterKwLowerCase(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLowerCase.
  exitKwLowerCase(ctx) {}

  // Enter a parse tree produced by CqlParser#kwColumns.
  enterKwColumns(ctx) {}

  // Exit a parse tree produced by CqlParser#kwColumns.
  exitKwColumns(ctx) {}

  // Enter a parse tree produced by CqlParser#kwProfiles.
  enterKwProfiles(ctx) {}

  // Exit a parse tree produced by CqlParser#kwProfiles.
  exitKwProfiles(ctx) {}

  // Enter a parse tree produced by CqlParser#kwConfig.
  enterKwConfig(ctx) {}

  // Exit a parse tree produced by CqlParser#kwConfig.
  exitKwConfig(ctx) {}

  // Enter a parse tree produced by CqlParser#kwAutoCommitTime.
  enterKwAutoCommitTime(ctx) {}

  // Exit a parse tree produced by CqlParser#kwAutoCommitTime.
  exitKwAutoCommitTime(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDefaultQueryField.
  enterKwDefaultQueryField(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDefaultQueryField.
  exitKwDefaultQueryField(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDirectoryFactory.
  enterKwDirectoryFactory(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDirectoryFactory.
  exitKwDirectoryFactory(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFilterCacheLowWaterMark.
  enterKwFilterCacheLowWaterMark(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFilterCacheLowWaterMark.
  exitKwFilterCacheLowWaterMark(ctx) {}

  // Enter a parse tree produced by CqlParser#kwFilterCacheHighWaterMark.
  enterKwFilterCacheHighWaterMark(ctx) {}

  // Exit a parse tree produced by CqlParser#kwFilterCacheHighWaterMark.
  exitKwFilterCacheHighWaterMark(ctx) {}

  // Enter a parse tree produced by CqlParser#kwDirectoryFactoryClass.
  enterKwDirectoryFactoryClass(ctx) {}

  // Exit a parse tree produced by CqlParser#kwDirectoryFactoryClass.
  exitKwDirectoryFactoryClass(ctx) {}

  // Enter a parse tree produced by CqlParser#kwMergeMaxThreadCount.
  enterKwMergeMaxThreadCount(ctx) {}

  // Exit a parse tree produced by CqlParser#kwMergeMaxThreadCount.
  exitKwMergeMaxThreadCount(ctx) {}

  // Enter a parse tree produced by CqlParser#kwMergeMaxMergeCount.
  enterKwMergeMaxMergeCount(ctx) {}

  // Exit a parse tree produced by CqlParser#kwMergeMaxMergeCount.
  exitKwMergeMaxMergeCount(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRamBufferSize.
  enterKwRamBufferSize(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRamBufferSize.
  exitKwRamBufferSize(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRealtime.
  enterKwRealtime(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRealtime.
  exitKwRealtime(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRecovery.
  enterKwRecovery(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRecovery.
  exitKwRecovery(ctx) {}

  // Enter a parse tree produced by CqlParser#kwReindex.
  enterKwReindex(ctx) {}

  // Exit a parse tree produced by CqlParser#kwReindex.
  exitKwReindex(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLenient.
  enterKwLenient(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLenient.
  exitKwLenient(ctx) {}

  // Enter a parse tree produced by CqlParser#kwStandard.
  enterKwStandard(ctx) {}

  // Exit a parse tree produced by CqlParser#kwStandard.
  exitKwStandard(ctx) {}

  // Enter a parse tree produced by CqlParser#kwEncrypted.
  enterKwEncrypted(ctx) {}

  // Exit a parse tree produced by CqlParser#kwEncrypted.
  exitKwEncrypted(ctx) {}

  // Enter a parse tree produced by CqlParser#kwCaseSensitive.
  enterKwCaseSensitive(ctx) {}

  // Exit a parse tree produced by CqlParser#kwCaseSensitive.
  exitKwCaseSensitive(ctx) {}

  // Enter a parse tree produced by CqlParser#kwInitcond.
  enterKwInitcond(ctx) {}

  // Exit a parse tree produced by CqlParser#kwInitcond.
  exitKwInitcond(ctx) {}

  // Enter a parse tree produced by CqlParser#kwInput.
  enterKwInput(ctx) {}

  // Exit a parse tree produced by CqlParser#kwInput.
  exitKwInput(ctx) {}

  // Enter a parse tree produced by CqlParser#kwInsert.
  enterKwInsert(ctx) {}

  // Exit a parse tree produced by CqlParser#kwInsert.
  exitKwInsert(ctx) {}

  // Enter a parse tree produced by CqlParser#kwInto.
  enterKwInto(ctx) {}

  // Exit a parse tree produced by CqlParser#kwInto.
  exitKwInto(ctx) {}

  // Enter a parse tree produced by CqlParser#kwIs.
  enterKwIs(ctx) {}

  // Exit a parse tree produced by CqlParser#kwIs.
  exitKwIs(ctx) {}

  // Enter a parse tree produced by CqlParser#kwJson.
  enterKwJson(ctx) {}

  // Exit a parse tree produced by CqlParser#kwJson.
  exitKwJson(ctx) {}

  // Enter a parse tree produced by CqlParser#kwKey.
  enterKwKey(ctx) {}

  // Exit a parse tree produced by CqlParser#kwKey.
  exitKwKey(ctx) {}

  // Enter a parse tree produced by CqlParser#kwKeys.
  enterKwKeys(ctx) {}

  // Exit a parse tree produced by CqlParser#kwKeys.
  exitKwKeys(ctx) {}

  // Enter a parse tree produced by CqlParser#kwKeyspace.
  enterKwKeyspace(ctx) {}

  // Exit a parse tree produced by CqlParser#kwKeyspace.
  exitKwKeyspace(ctx) {}

  // Enter a parse tree produced by CqlParser#kwKeyspaces.
  enterKwKeyspaces(ctx) {}

  // Exit a parse tree produced by CqlParser#kwKeyspaces.
  exitKwKeyspaces(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLanguage.
  enterKwLanguage(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLanguage.
  exitKwLanguage(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLimit.
  enterKwLimit(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLimit.
  exitKwLimit(ctx) {}

  // Enter a parse tree produced by CqlParser#kwList.
  enterKwList(ctx) {}

  // Exit a parse tree produced by CqlParser#kwList.
  exitKwList(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLogged.
  enterKwLogged(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLogged.
  exitKwLogged(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLogin.
  enterKwLogin(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLogin.
  exitKwLogin(ctx) {}

  // Enter a parse tree produced by CqlParser#kwMaterialized.
  enterKwMaterialized(ctx) {}

  // Exit a parse tree produced by CqlParser#kwMaterialized.
  exitKwMaterialized(ctx) {}

  // Enter a parse tree produced by CqlParser#kwModify.
  enterKwModify(ctx) {}

  // Exit a parse tree produced by CqlParser#kwModify.
  exitKwModify(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNosuperuser.
  enterKwNosuperuser(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNosuperuser.
  exitKwNosuperuser(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNorecursive.
  enterKwNorecursive(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNorecursive.
  exitKwNorecursive(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNot.
  enterKwNot(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNot.
  exitKwNot(ctx) {}

  // Enter a parse tree produced by CqlParser#kwNull.
  enterKwNull(ctx) {}

  // Exit a parse tree produced by CqlParser#kwNull.
  exitKwNull(ctx) {}

  // Enter a parse tree produced by CqlParser#kwOf.
  enterKwOf(ctx) {}

  // Exit a parse tree produced by CqlParser#kwOf.
  exitKwOf(ctx) {}

  // Enter a parse tree produced by CqlParser#kwOn.
  enterKwOn(ctx) {}

  // Exit a parse tree produced by CqlParser#kwOn.
  exitKwOn(ctx) {}

  // Enter a parse tree produced by CqlParser#kwOptions.
  enterKwOptions(ctx) {}

  // Exit a parse tree produced by CqlParser#kwOptions.
  exitKwOptions(ctx) {}

  // Enter a parse tree produced by CqlParser#kwOr.
  enterKwOr(ctx) {}

  // Exit a parse tree produced by CqlParser#kwOr.
  exitKwOr(ctx) {}

  // Enter a parse tree produced by CqlParser#kwOrder.
  enterKwOrder(ctx) {}

  // Exit a parse tree produced by CqlParser#kwOrder.
  exitKwOrder(ctx) {}

  // Enter a parse tree produced by CqlParser#kwPassword.
  enterKwPassword(ctx) {}

  // Exit a parse tree produced by CqlParser#kwPassword.
  exitKwPassword(ctx) {}

  // Enter a parse tree produced by CqlParser#kwPrimary.
  enterKwPrimary(ctx) {}

  // Exit a parse tree produced by CqlParser#kwPrimary.
  exitKwPrimary(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRename.
  enterKwRename(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRename.
  exitKwRename(ctx) {}

  // Enter a parse tree produced by CqlParser#kwReplace.
  enterKwReplace(ctx) {}

  // Exit a parse tree produced by CqlParser#kwReplace.
  exitKwReplace(ctx) {}

  // Enter a parse tree produced by CqlParser#kwReplication.
  enterKwReplication(ctx) {}

  // Exit a parse tree produced by CqlParser#kwReplication.
  exitKwReplication(ctx) {}

  // Enter a parse tree produced by CqlParser#kwReturns.
  enterKwReturns(ctx) {}

  // Exit a parse tree produced by CqlParser#kwReturns.
  exitKwReturns(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRole.
  enterKwRole(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRole.
  exitKwRole(ctx) {}

  // Enter a parse tree produced by CqlParser#kwInternal.
  enterKwInternal(ctx) {}

  // Exit a parse tree produced by CqlParser#kwInternal.
  exitKwInternal(ctx) {}

  // Enter a parse tree produced by CqlParser#kwLdap.
  enterKwLdap(ctx) {}

  // Exit a parse tree produced by CqlParser#kwLdap.
  exitKwLdap(ctx) {}

  // Enter a parse tree produced by CqlParser#kwScheme.
  enterKwScheme(ctx) {}

  // Exit a parse tree produced by CqlParser#kwScheme.
  exitKwScheme(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRoles.
  enterKwRoles(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRoles.
  exitKwRoles(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSelect.
  enterKwSelect(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSelect.
  exitKwSelect(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSet.
  enterKwSet(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSet.
  exitKwSet(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSfunc.
  enterKwSfunc(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSfunc.
  exitKwSfunc(ctx) {}

  // Enter a parse tree produced by CqlParser#kwStorage.
  enterKwStorage(ctx) {}

  // Exit a parse tree produced by CqlParser#kwStorage.
  exitKwStorage(ctx) {}

  // Enter a parse tree produced by CqlParser#kwStype.
  enterKwStype(ctx) {}

  // Exit a parse tree produced by CqlParser#kwStype.
  exitKwStype(ctx) {}

  // Enter a parse tree produced by CqlParser#kwSuperuser.
  enterKwSuperuser(ctx) {}

  // Exit a parse tree produced by CqlParser#kwSuperuser.
  exitKwSuperuser(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTable.
  enterKwTable(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTable.
  exitKwTable(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTimestamp.
  enterKwTimestamp(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTimestamp.
  exitKwTimestamp(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTo.
  enterKwTo(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTo.
  exitKwTo(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTrigger.
  enterKwTrigger(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTrigger.
  exitKwTrigger(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTruncate.
  enterKwTruncate(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTruncate.
  exitKwTruncate(ctx) {}

  // Enter a parse tree produced by CqlParser#kwTtl.
  enterKwTtl(ctx) {}

  // Exit a parse tree produced by CqlParser#kwTtl.
  exitKwTtl(ctx) {}

  // Enter a parse tree produced by CqlParser#kwType.
  enterKwType(ctx) {}

  // Exit a parse tree produced by CqlParser#kwType.
  exitKwType(ctx) {}

  // Enter a parse tree produced by CqlParser#kwUnlogged.
  enterKwUnlogged(ctx) {}

  // Exit a parse tree produced by CqlParser#kwUnlogged.
  exitKwUnlogged(ctx) {}

  // Enter a parse tree produced by CqlParser#kwUpdate.
  enterKwUpdate(ctx) {}

  // Exit a parse tree produced by CqlParser#kwUpdate.
  exitKwUpdate(ctx) {}

  // Enter a parse tree produced by CqlParser#kwUse.
  enterKwUse(ctx) {}

  // Exit a parse tree produced by CqlParser#kwUse.
  exitKwUse(ctx) {}

  // Enter a parse tree produced by CqlParser#kwUser.
  enterKwUser(ctx) {}

  // Exit a parse tree produced by CqlParser#kwUser.
  exitKwUser(ctx) {}

  // Enter a parse tree produced by CqlParser#kwUsers.
  enterKwUsers(ctx) {}

  // Exit a parse tree produced by CqlParser#kwUsers.
  exitKwUsers(ctx) {}

  // Enter a parse tree produced by CqlParser#kwUsing.
  enterKwUsing(ctx) {}

  // Exit a parse tree produced by CqlParser#kwUsing.
  exitKwUsing(ctx) {}

  // Enter a parse tree produced by CqlParser#kwValues.
  enterKwValues(ctx) {}

  // Exit a parse tree produced by CqlParser#kwValues.
  exitKwValues(ctx) {}

  // Enter a parse tree produced by CqlParser#kwView.
  enterKwView(ctx) {}

  // Exit a parse tree produced by CqlParser#kwView.
  exitKwView(ctx) {}

  // Enter a parse tree produced by CqlParser#kwWhere.
  enterKwWhere(ctx) {}

  // Exit a parse tree produced by CqlParser#kwWhere.
  exitKwWhere(ctx) {}

  // Enter a parse tree produced by CqlParser#kwWith.
  enterKwWith(ctx) {}

  // Exit a parse tree produced by CqlParser#kwWith.
  exitKwWith(ctx) {}

  // Enter a parse tree produced by CqlParser#kwRevoke.
  enterKwRevoke(ctx) {}

  // Exit a parse tree produced by CqlParser#kwRevoke.
  exitKwRevoke(ctx) {}

  // Enter a parse tree produced by CqlParser#eof.
  enterEof(ctx) {}

  // Exit a parse tree produced by CqlParser#eof.
  exitEof(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketLr.
  enterSyntaxBracketLr(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketLr.
  exitSyntaxBracketLr(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketRr.
  enterSyntaxBracketRr(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketRr.
  exitSyntaxBracketRr(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketLc.
  enterSyntaxBracketLc(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketLc.
  exitSyntaxBracketLc(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketRc.
  enterSyntaxBracketRc(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketRc.
  exitSyntaxBracketRc(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketLa.
  enterSyntaxBracketLa(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketLa.
  exitSyntaxBracketLa(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketRa.
  enterSyntaxBracketRa(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketRa.
  exitSyntaxBracketRa(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketLs.
  enterSyntaxBracketLs(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketLs.
  exitSyntaxBracketLs(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxBracketRs.
  enterSyntaxBracketRs(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxBracketRs.
  exitSyntaxBracketRs(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxComma.
  enterSyntaxComma(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxComma.
  exitSyntaxComma(ctx) {}

  // Enter a parse tree produced by CqlParser#syntaxColon.
  enterSyntaxColon(ctx) {}

  // Exit a parse tree produced by CqlParser#syntaxColon.
  exitSyntaxColon(ctx) {}

  // Enter a parse tree produced by CqlParser#id.
  enterId(ctx) {}

  // Exit a parse tree produced by CqlParser#id.
  exitId(ctx) {}
}

exports.CqlParserListener = CqlParserListener;
