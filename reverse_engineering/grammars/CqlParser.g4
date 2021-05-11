/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Domagoj Kovačević
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project : cql-parser; an ANTLR4 grammar for Apache Cassandra CQL  https://github.com/kdcro101cql-parser
 */

parser grammar CqlParser;

options
   { tokenVocab = CqlLexer; }

root
   : cqls? MINUSMINUS? eof
   ;

cqls
   : (cql MINUSMINUS? statementSeparator | empty)* (cql (MINUSMINUS? statementSeparator)? | empty)
   ;

statementSeparator
   : SEMI
   ;

empty
   : statementSeparator
   ;

cql
   : alterKeyspace
   | alterMaterializedView
   | alterRole
   | alterTable
   | alterType
   | alterUser
   | applyBatch
   | createAggregate
   | createFunction
   | createIndex
   | createKeyspace
   | createMaterializedView
   | createRole
   | createTable
   | createTrigger
   | createType
   | createUser
   | deleteStatement
   | dropAggregate
   | dropFunction
   | dropIndex
   | dropKeyspace
   | dropMaterializedView
   | dropRole
   | dropTable
   | dropTrigger
   | dropType
   | dropUser
   | grant
   | insert
   | listPermissions
   | listRoles
   | revoke
   | select
   | truncate
   | update
   | use
   ;

revoke
   : kwRevoke priviledge kwOn resource kwFrom role
   ;

listUsers
   : kwList kwUsers
   ;

listRoles
   : kwList kwRoles (kwOf role)? kwNorecursive?
   ;

listPermissions
   : kwList priviledge (kwOn resource)? (kwOf role)?
   ;

grant
   : kwGrant priviledge kwOn resource kwTo role
   ;

priviledge
   : (kwAll | kwAllPermissions)
   | kwAlter
   | kwAuthorize
   | kwDescibe
   | kwExecute
   | kwCreate
   | kwDrop
   | kwModify
   | kwSelect
   ;

resource
   : kwAll kwFunctions
   | kwAll kwFunctions kwIn kwKeyspace keyspace
   | kwFunction (keyspace DOT)? functionStatement
   | kwAll kwKeyspaces
   | kwKeyspace keyspace
   | (kwTable)? (keyspace DOT)? table
   | kwAll kwRoles
   | kwRole role
   | (kwInternal|kwLdap) kwScheme
   ;

createUser
   : kwCreate kwUser ifNotExist? user kwWith kwPassword stringLiteral (kwSuperuser | kwNosuperuser)?
   ;

createRole
   : kwCreate kwRole ifNotExist? role roleWith?
   ;

createType
   : kwCreate kwType ifNotExist? (keyspace DOT)? type syntaxBracketLr typeMemberColumnList syntaxBracketRr
   ;

typeMemberColumnList
   : column dataType (syntaxComma column dataType)*
   ;

createTrigger
   : kwCreate kwTrigger ifNotExist? (keyspace DOT)? trigger kwUsing triggerClass
   ;

createMaterializedView
   : kwCreate kwMaterialized kwView ifNotExist? (keyspace DOT)? materializedView kwAs kwSelect columnList kwFrom (keyspace DOT)? table materializedViewWhere (primaryKeyElement)? (kwWith materializedViewOptions)?
   ;

materializedViewWhere
   : kwWhere columnNotNullList (kwAnd relationElements)?
   ;

columnNotNullList
   : columnNotNull (kwAnd columnNotNull)*
   ;

columnNotNull
   : column kwIs kwNot kwNull
   ;

materializedViewOptions
   : tableOptions
   ;

createKeyspace
   : kwCreate kwKeyspace ifNotExist? keyspace kwWith kwReplication OPERATOR_EQ syntaxBracketLc replicationList syntaxBracketRc (kwAnd durableWrites)?
   ;

createFunction
   : kwCreate orReplace? kwFunction ifNotExist? (keyspace DOT)? functionStatement syntaxBracketLr paramList? syntaxBracketRr returnMode kwReturns dataType kwLanguage language kwAs codeBlock
   ;

codeBlock
   : CODE_BLOCK | STRING_LITERAL
   ;

paramList
   : param (syntaxComma param)*
   ;

returnMode
   : (kwCalled | kwReturns kwNull) kwOn kwNull kwInput
   ;

createAggregate
   : kwCreate orReplace? kwAggregate ifNotExist? (keyspace DOT)? aggregate syntaxBracketLr dataType syntaxBracketRr kwSfunc functionStatement kwStype dataType kwFinalfunc functionStatement kwInitcond initCondDefinition
   ;

// paramList
// :
initCondDefinition
   : constant
   | initCondList
   | initCondListNested
   | initCondHash
   ;

initCondHash
   : syntaxBracketLc initCondHashItem (syntaxComma initCondHashItem)* syntaxBracketRc
   ;

initCondHashItem
   : hashKey COLON initCondDefinition
   ;

initCondListNested
   : syntaxBracketLr initCondList (syntaxComma constant | initCondList)* syntaxBracketRr
   ;

initCondList
   : syntaxBracketLr constant (syntaxComma constant)* syntaxBracketRr
   ;

orReplace
   : kwOr kwReplace
   ;

alterUser
   : kwAlter kwUser user kwWith userPassword userSuperUser?
   ;

userPassword
   : kwPassword stringLiteral
   ;

userSuperUser
   : kwSuperuser
   | kwNosuperuser
   ;

alterType
   : kwAlter kwType (keyspace DOT)? type alterTypeOperation
   ;

alterTypeOperation
   : alterTypeAlterType
   | alterTypeAdd
   | alterTypeRename
   ;

alterTypeRename
   : kwRename alterTypeRenameList
   ;

alterTypeRenameList
   : alterTypeRenameItem (kwAnd alterTypeRenameItem)*
   ;

alterTypeRenameItem
   : column kwTo column
   ;

alterTypeAdd
   : kwAdd typeMemberColumnList
   ;

alterTypeAlterType
   : kwAlter column kwType dataType
   ;

alterTable
   : kwAlter kwTable (keyspace DOT)? table alterTableOperation
   ;

alterTableOperation
   : alterTableAdd
   | alterTableDropColumns
   | alterTableDropColumns
   | alterTableDropCompactStorage
   | alterTableRename
   | alterTableWith
   ;

alterTableWith
   : kwWith tableOptions
   ;

alterTableRename
   : kwRename column kwTo column
   ;

alterTableDropCompactStorage
   : kwDrop kwCompact kwStorage
   ;

alterTableDropColumns
   : kwDrop alterTableDropColumnList
   ;

alterTableDropColumnList
   : column (syntaxComma column)*
   ;

alterTableAdd
   : kwAdd alterTableColumnDefinition
   ;

alterTableColumnDefinition
   : column dataType (syntaxComma column dataType)*
   ;

alterRole
   : kwAlter kwRole role roleWith?
   ;

roleWith
   : kwWith (roleWithOptions (kwAnd roleWithOptions)*)
   ;

roleWithOptions
   : kwPassword OPERATOR_EQ stringLiteral
   | kwLogin OPERATOR_EQ booleanLiteral
   | kwSuperuser OPERATOR_EQ booleanLiteral
   | kwOptions OPERATOR_EQ optionHash
   ;

alterMaterializedView
   : kwAlter kwMaterialized kwView (keyspace DOT)? materializedView (kwWith tableOptions)?
   ;

dropUser
   : kwDrop kwUser ifExist? user
   ;

dropType
   : kwDrop kwType ifExist? (keyspace DOT)? type
   ;

dropMaterializedView
   : kwDrop kwMaterialized kwView ifExist? (keyspace DOT)? materializedView
   ;

dropAggregate
   : kwDrop kwAggregate ifExist? (keyspace DOT)? aggregate
   ;

dropFunction
   : kwDrop kwFunction ifExist? (keyspace DOT)? functionStatement
   ;

dropTrigger
   : kwDrop kwTrigger ifExist? trigger kwOn (keyspace DOT)? table
   ;

dropRole
   : kwDrop kwRole ifExist? role
   ;

dropTable
   : kwDrop kwTable ifExist? (keyspace DOT)? table
   ;

dropKeyspace
   : kwDrop kwKeyspace ifExist? keyspace
   ;

dropIndex
   : kwDrop kwIndex ifExist? (keyspace DOT)? indexName
   ;

createTable
   : kwCreate kwTable ifNotExist? (keyspace DOT)? table syntaxBracketLr columnDefinitionList syntaxBracketRr withElement?
   ;

withElement
   : kwWith tableOptions?
   ;

clusteringOrderColumns
   : column orderDirection? (syntaxComma column orderDirection?)*
   ;
   
clusteringOrder
   : kwClustering kwOrder kwBy syntaxBracketLr clusteringOrderColumns syntaxBracketRr
   ;

tableOptions
   : tableOptionItem (kwAnd tableOptionItem)*
   ;

tableOptionItem
   : tableOptionName OPERATOR_EQ tableOptionValue
   | tableOptionName OPERATOR_EQ optionHash
   | clusteringOrder
   ;

tableOptionName
   : id
   ;

tableOptionValue
   : stringLiteral
   | floatLiteral
   ;

optionHash
   : syntaxBracketLc optionHashItem (syntaxComma optionHashItem)* syntaxBracketRc
   ;

optionHashItem
   : optionHashKey COLON optionHashValue
   ;

optionHashKey
   : stringLiteral
   ;

optionHashValue
   : stringLiteral
   | floatLiteral
   ;

columnDefinitionList
   : (columnDefinition) (syntaxComma columnDefinition)* (syntaxComma primaryKeyElement)?
   ;

//
columnDefinition
   : column dataType primaryKeyColumn?
   ;

//
primaryKeyColumn
   : kwPrimary kwKey
   ;

primaryKeyElement
   : kwPrimary kwKey syntaxBracketLr primaryKeyDefinition syntaxBracketRr
   ;

primaryKeyDefinition
   : singlePrimaryKey
   | compoundKey
   | compositeKey
   ;

singlePrimaryKey
   : column
   ;

compoundKey
   : partitionKey (syntaxComma clusteringKeyList)
   ;

compositeKey
   : syntaxBracketLr partitionKeyList syntaxBracketRr (syntaxComma clusteringKeyList)
   ;

partitionKeyList
   : (partitionKey) (syntaxComma partitionKey)*
   ;

clusteringKeyList
   : (clusteringKey) (syntaxComma clusteringKey)*
   ;

partitionKey
   : column
   ;

clusteringKey
   : column
   ;

applyBatch
   : kwApply kwBatch
   ;

beginBatch
   : kwBegin batchType? kwBatch usingTimestampSpec?
   ;

batchType
   : kwLogged
   | kwUnlogged
   ;

alterKeyspace
   : kwAlter kwKeyspace keyspace kwWith kwReplication OPERATOR_EQ syntaxBracketLc replicationList syntaxBracketRc (kwAnd durableWrites)?
   ;

replicationList
   : (replicationListItem) (syntaxComma replicationListItem)*
   ;

replicationListItem
   : STRING_LITERAL COLON STRING_LITERAL
   | STRING_LITERAL COLON DECIMAL_LITERAL
   ;

durableWrites
   : kwDurableWrites OPERATOR_EQ booleanLiteral
   ;

use
   : kwUse keyspace
   ;

truncate
   : kwTruncate (kwTable)? (keyspace DOT)? table
   ;

createIndex
   : kwCreate kwIndex ifNotExist? indexName? kwOn (keyspace DOT)? table syntaxBracketLr indexColumnSpec syntaxBracketRr
   ;

indexName
   : id
   | stringLiteral
   ;

indexColumnSpec
   : column
   | indexKeysSpec
   | indexEntriesSSpec
   | indexFullSpec
   ;

indexKeysSpec
   : kwKeys syntaxBracketLr column syntaxBracketRr
   ;

indexEntriesSSpec
   : kwEntries syntaxBracketLr column syntaxBracketRr
   ;

indexFullSpec
   : kwFull syntaxBracketLr column syntaxBracketRr
   ;

deleteStatement
   : beginBatch? kwDelete deleteColumnList? fromSpec usingTimestampSpec? whereSpec (ifExist | ifSpec)?
   ;

deleteColumnList
   : (deleteColumnItem) (syntaxComma deleteColumnItem)*
   ;

deleteColumnItem
   : id
   | id LS_BRACKET (stringLiteral | decimalLiteral) RS_BRACKET
   ;

update
   : beginBatch? kwUpdate (keyspace DOT)? table usingTtlTimestamp? kwSet assignments whereSpec (ifExist | ifSpec)?
   ;

ifSpec
   : kwIf ifConditionList
   ;

ifConditionList
   : (ifCondition) (kwAnd ifCondition)*
   ;

ifCondition
   : id OPERATOR_EQ constant
   ;

assignments
   : (assignmentElement) (syntaxComma assignmentElement)*
   ;

assignmentElement
   : id OPERATOR_EQ (constant | assignmentMap | assignmentSet | assignmentList)
   | id OPERATOR_EQ id (PLUS | MINUS) decimalLiteral
   | id OPERATOR_EQ id (PLUS | MINUS) assignmentSet
   | id OPERATOR_EQ assignmentSet (PLUS | MINUS) id
   | id OPERATOR_EQ id (PLUS | MINUS) assignmentMap
   | id OPERATOR_EQ assignmentMap (PLUS | MINUS) id
   | id OPERATOR_EQ id (PLUS | MINUS) assignmentList
   | id OPERATOR_EQ assignmentList (PLUS | MINUS) id
   | id syntaxBracketLs decimalLiteral syntaxBracketRs OPERATOR_EQ constant
   ;

assignmentSet
   : syntaxBracketLc (constant (syntaxComma expression)*)?  syntaxBracketRc
   ;

assignmentMap
   : syntaxBracketLc (constant syntaxColon expression) (syntaxComma constant syntaxColon expression)* syntaxBracketRc
   ;

assignmentMapExpression
   : syntaxBracketLc expression (syntaxComma expression)* syntaxBracketRc
   ;

assignmentList
   : syntaxBracketLs constant (syntaxComma expression)* syntaxBracketRs
   ;

assignmentTuple
   : syntaxBracketLr (
         expression ((syntaxComma expression)* | (syntaxComma assignmentTuple)*) |
         assignmentTuple (syntaxComma assignmentTuple)*
     ) syntaxBracketRr
   ;

insert
   : beginBatch? kwInsert kwInto (keyspace DOT)? table insertColumnSpec? insertValuesSpec ifNotExist? usingTtlTimestamp?
   ;

usingTtlTimestamp
   : kwUsing ttl
   | kwUsing ttl kwAnd timestamp
   | kwUsing timestamp
   | kwUsing timestamp kwAnd ttl
   ;

timestamp
   : kwTimestamp decimalLiteral
   ;

ttl
   : kwTtl decimalLiteral
   ;

usingTimestampSpec
   : kwUsing timestamp
   ;

ifNotExist
   : kwIf kwNot kwExists
   ;

ifExist
   : kwIf kwExists
   ;

insertValuesSpec
   : kwValues '(' expressionList ')'
   | kwJson constant
   ;

insertColumnSpec
   : '(' columnList ')'
   ;

columnList
   : column (syntaxComma column)*
   ;

expressionList
   : expression (syntaxComma expression)*
   ;

expression
   : constant
   | assignmentMap
   | assignmentSet
   | assignmentList
   | assignmentTuple
   | assignmentMapExpression
   ;

select
   : kwSelect distinctSpec? kwJson? selectElements fromSpec whereSpec? orderSpec? limitSpec? allowFilteringSpec?
   ;

allowFilteringSpec
   : kwAllow kwFiltering
   ;

limitSpec
   : kwLimit decimalLiteral
   ;

fromSpec
   : kwFrom fromSpecElement
   ;

fromSpecElement
   : id
   | id '.' id
   ;

orderSpec
   : kwOrder kwBy orderSpecElement
   ;

orderSpecElement
   : id (kwAsc | kwDesc)?
   ;

whereSpec
   : kwWhere relationElements
   ;

distinctSpec
   : kwDistinct
   ;

selectElements
   : (star = '*' | selectElement) (syntaxComma selectElement)*
   ;

selectElement
   : id '.' '*'
   | id (kwAs id)?
   | functionCall (kwAs id)?
   ;

relationElements
   : (relationElement) (kwAnd relationElement)*
   ;

relationElement
   : id (OPERATOR_EQ | OPERATOR_LT | OPERATOR_GT | OPERATOR_LTE | OPERATOR_GTE) constant
   | id '.' id (OPERATOR_EQ | OPERATOR_LT | OPERATOR_GT | OPERATOR_LTE | OPERATOR_GTE) constant
   | functionCall (OPERATOR_EQ | OPERATOR_LT | OPERATOR_GT | OPERATOR_LTE | OPERATOR_GTE) constant
   | functionCall (OPERATOR_EQ | OPERATOR_LT | OPERATOR_GT | OPERATOR_LTE | OPERATOR_GTE) functionCall
   | id kwIn '(' functionArgs? ')'
   | '(' id (syntaxComma id)* ')' kwIn '(' assignmentTuple (syntaxComma assignmentTuple)* ')'
   | '(' id (syntaxComma id)* ')' (OPERATOR_EQ | OPERATOR_LT | OPERATOR_GT | OPERATOR_LTE | OPERATOR_GTE) ( assignmentTuple (syntaxComma assignmentTuple)* )
   | relalationContainsKey
   | relalationContains
   ;

relalationContains
   : id kwContains constant
   ;

relalationContainsKey
   : id (kwContains kwKey) constant
   ;

functionCall
   : id '(' STAR ')'
   | id '(' functionArgs? ')'
   ;

functionArgs
   : (constant | id | functionCall) (syntaxComma (constant | id | functionCall))*
   ;

constant
   : UUID
   | stringLiteral
   | decimalLiteral
   | floatLiteral
   | hexadecimalLiteral
   | booleanLiteral
   | codeBlock
   | kwNull
   | id
   ;

decimalLiteral
   : DECIMAL_LITERAL
   ;

floatLiteral
   : DECIMAL_LITERAL
   | FLOAT_LITERAL
   ;

stringLiteral
   : STRING_LITERAL
   ;

booleanLiteral
   : K_TRUE
   | K_FALSE
   ;

hexadecimalLiteral
   : HEXADECIMAL_LITERAL
   ;

keyspace
   : id
   | DQUOTE id DQUOTE
   ;

table
   : id
   | DQUOTE id DQUOTE
   ;

column
   : id
   | DQUOTE id DQUOTE
   ;

dataType
   : dataTypeName dataTypeDefinition?
   ;

dataTypeName
   : id
   | STRING_LITERAL
   | K_TIMESTAMP
   | K_SET
   | K_ASCII
   | K_BIGINT
   | K_BLOB
   | K_BOOLEAN
   | K_COUNTER
   | K_DATE
   | K_DECIMAL
   | K_DOUBLE
   | K_FLOAT
   | K_FROZEN
   | K_INET
   | K_INT
   | K_LIST
   | K_MAP
   | K_SMALLINT
   | K_TEXT
   | K_TIME
   | K_TIMEUUID
   | K_TINYINT
   | K_TUPLE
   | K_VARCHAR
   | K_VARINT
   | K_TIMESTAMP
   | K_UUID
   ;

dataTypeDefinition
   : syntaxBracketLa dataType (syntaxComma dataType)* syntaxBracketRa
   ;

orderDirection
   : kwAsc
   | kwDesc
   ;

role
   : id
   ;

trigger
   : id
   ;

triggerClass
   : stringLiteral
   ;

materializedView
   : id
   ;

type
   : id
   ;

aggregate
   : id
   ;

functionStatement
   : id
   ;

language
   : id
   ;

user
   : id
   ;

password
   : stringLiteral
   ;

hashKey
   : id
   ;

param
   : paramName dataType
   ;

paramName
   : id
   ;

kwAdd
   : K_ADD
   ;

kwAggregate
   : K_AGGREGATE
   ;

kwAll
   : K_ALL
   ;

kwAllPermissions
   : K_ALL K_PERMISSIONS
   ;

kwAllow
   : K_ALLOW
   ;

kwAlter
   : K_ALTER
   ;

kwAnd
   : K_AND
   ;

kwApply
   : K_APPLY
   ;

kwAs
   : K_AS
   ;

kwAsc
   : K_ASC
   ;

kwAuthorize
   : K_AUTHORIZE
   ;

kwBatch
   : K_BATCH
   ;

kwBegin
   : K_BEGIN
   ;

kwBy
   : K_BY
   ;

kwCalled
   : K_CALLED
   ;

kwClustering
   : K_CLUSTERING
   ;

kwCompact
   : K_COMPACT
   ;

kwContains
   : K_CONTAINS
   ;

kwCreate
   : K_CREATE
   ;

kwDelete
   : K_DELETE
   ;

kwDesc
   : K_DESC
   ;

kwDescibe
   : K_DESCRIBE
   ;

kwDistinct
   : K_DISTINCT
   ;

kwDrop
   : K_DROP
   ;

kwDurableWrites
   : K_DURABLE_WRITES
   ;

kwEntries
   : K_ENTRIES
   ;

kwExecute
   : K_EXECUTE
   ;

kwExists
   : K_EXISTS
   ;

kwFiltering
   : K_FILTERING
   ;

kwFinalfunc
   : K_FINALFUNC
   ;

kwFrom
   : K_FROM
   ;

kwFull
   : K_FULL
   ;

kwFunction
   : K_FUNCTION
   ;

kwFunctions
   : K_FUNCTIONS
   ;

kwGrant
   : K_GRANT
   ;

kwIf
   : K_IF
   ;

kwIn
   : K_IN
   ;

kwIndex
   : K_INDEX
   ;

kwInitcond
   : K_INITCOND
   ;

kwInput
   : K_INPUT
   ;

kwInsert
   : K_INSERT
   ;

kwInto
   : K_INTO
   ;

kwIs
   : K_IS
   ;

kwJson
   : K_JSON
   ;

kwKey
   : K_KEY
   ;

kwKeys
   : K_KEYS
   ;

kwKeyspace
   : K_KEYSPACE
   ;

kwKeyspaces
   : K_KEYSPACES
   ;

kwLanguage
   : K_LANGUAGE
   ;

kwLimit
   : K_LIMIT
   ;

kwList
   : K_LIST
   ;

kwLogged
   : K_LOGGED
   ;

kwLogin
   : K_LOGIN
   ;

kwMaterialized
   : K_MATERIALIZED
   ;

kwModify
   : K_MODIFY
   ;

kwNosuperuser
   : K_NOSUPERUSER
   ;

kwNorecursive
   : K_NORECURSIVE
   ;

kwNot
   : K_NOT
   ;

kwNull
   : K_NULL
   ;

kwOf
   : K_OF
   ;

kwOn
   : K_ON
   ;

kwOptions
   : K_OPTIONS
   ;

kwOr
   : K_OR
   ;

kwOrder
   : K_ORDER
   ;

kwPassword
   : K_PASSWORD
   ;

kwPrimary
   : K_PRIMARY
   ;

kwRename
   : K_RENAME
   ;

kwReplace
   : K_REPLACE
   ;

kwReplication
   : K_REPLICATION
   ;

kwReturns
   : K_RETURNS
   ;

kwRole
   : K_ROLE
   ;

kwInternal
   : K_INTERNAL
   ;

kwLdap
   : K_LDAP
   ;

kwScheme
   : K_SCHEME
   ;

kwRoles
   : K_ROLES
   ;

kwSelect
   : K_SELECT
   ;

kwSet
   : K_SET
   ;

kwSfunc
   : K_SFUNC
   ;

kwStorage
   : K_STORAGE
   ;

kwStype
   : K_STYPE
   ;

kwSuperuser
   : K_SUPERUSER
   ;

kwTable
   : K_TABLE
   ;

kwTimestamp
   : K_TIMESTAMP
   ;

kwTo
   : K_TO
   ;

kwTrigger
   : K_TRIGGER
   ;

kwTruncate
   : K_TRUNCATE
   ;

kwTtl
   : K_TTL
   ;

kwType
   : K_TYPE
   ;

kwUnlogged
   : K_UNLOGGED
   ;

kwUpdate
   : K_UPDATE
   ;

kwUse
   : K_USE
   ;

kwUser
   : K_USER
   ;

kwUsers
   : K_USERS
   ;

kwUsing
   : K_USING
   ;

kwValues
   : K_VALUES
   ;

kwView
   : K_VIEW
   ;

kwWhere
   : K_WHERE
   ;

kwWith
   : K_WITH
   ;

kwRevoke
   : K_REVOKE
   ;

eof
   : EOF
   ;

// BRACKETS
// L - left
// R - right
// a - angle
// c - curly
// r - rounded
syntaxBracketLr
   : LR_BRACKET
   ;

syntaxBracketRr
   : RR_BRACKET
   ;

syntaxBracketLc
   : LC_BRACKET
   ;

syntaxBracketRc
   : RC_BRACKET
   ;

syntaxBracketLa
   : OPERATOR_LT
   ;

syntaxBracketRa
   : OPERATOR_GT
   ;

syntaxBracketLs
   : LS_BRACKET
   ;

syntaxBracketRs
   : RS_BRACKET
   ;

syntaxComma
   : COMMA
   ;

syntaxColon
   : COLON
   ;

id
   : OBJECT_NAME |
   K_ADD
   K_AGGREGATE |
   K_ALL |
   K_ALLOW |
   K_ALTER |
   K_AND |
   K_ANY |
   K_APPLY |
   K_AS |
   K_ASC |
   K_AUTHORIZE |
   K_BATCH |
   K_BEGIN |
   K_BY |
   K_CALLED |
   K_CLUSTERING |
   K_COLUMNFAMILY |
   K_COMPACT |
   K_CONSISTENCY |
   K_CONTAINS |
   K_CREATE |
   K_CUSTOM |
   K_DELETE |
   K_DESC |
   K_DESCRIBE |
   K_DISTINCT |
   K_DROP |
   K_DURABLE_WRITES |
   K_EACH_QUORUM |
   K_ENTRIES |
   K_EXECUTE |
   K_EXISTS |
   K_FALSE |
   K_FILTERING |
   K_FINALFUNC |
   K_FROM |
   K_FULL |
   K_FUNCTION |
   K_FUNCTIONS |
   K_GRANT |
   K_IF |
   K_IN |
   K_INDEX |
   K_INFINITY |
   K_INITCOND |
   K_INPUT |
   K_INSERT |
   K_INTO |
   K_IS |
   K_JSON |
   K_KEY |
   K_KEYS |
   K_KEYSPACE |
   K_KEYSPACES |
   K_LANGUAGE |
   K_LEVEL |
   K_LIMIT |
   K_LOCAL_ONE |
   K_LOCAL_QUORUM |
   K_LOGGED |
   K_LOGIN |
   K_MATERIALIZED |
   K_MODIFY |
   K_NAN |
   K_NORECURSIVE |
   K_NOSUPERUSER |
   K_NOT |
   K_NULL |
   K_OF |
   K_ON |
   K_ONE |
   K_OPTIONS |
   K_OR |
   K_ORDER |
   K_PARTITION |
   K_PASSWORD |
   K_PER |
   K_PERMISSION |
   K_PERMISSIONS |
   K_PRIMARY |
   K_QUORUM |
   K_RENAME |
   K_REPLACE |
   K_REPLICATION |
   K_RETURNS |
   K_REVOKE |
   K_ROLE |
   K_ROLES |
   K_SCHEMA |
   K_SELECT |
   K_SET |
   K_SFUNC |
   K_STATIC |
   K_STORAGE |
   K_STYPE |
   K_SUPERUSER |
   K_TABLE |
   K_THREE |
   K_TIMESTAMP |
   K_TO |
   K_TOKEN |
   K_TRIGGER |
   K_TRUE |
   K_TRUNCATE |
   K_TTL |
   K_TWO |
   K_TYPE |
   K_UNLOGGED |
   K_UPDATE |
   K_USE |
   K_USER |
   K_USING |
   K_UUID |
   K_VALUES |
   K_VIEW |
   K_WHERE |
   K_WITH |
   K_WRITETIME |
   K_ASCII |
   K_BIGINT |
   K_BLOB |
   K_BOOLEAN |
   K_COUNTER |
   K_DATE |
   K_DECIMAL |
   K_DOUBLE |
   K_FLOAT |
   K_FROZEN |
   K_INET |
   K_INT |
   K_LIST |
   K_MAP |
   K_SMALLINT |
   K_TEXT |
   K_TIMEUUID |
   K_TIME |
   K_TINYINT |
   K_TUPLE |
   K_VARCHAR |
   K_VARINT |
   K_USERS
;