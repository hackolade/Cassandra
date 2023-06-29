const templates = require('./ddlTemplates');
const { tab, getTableNameStatement, getUserDefinedFunctions, getUserDefinedAggregations} = require("../helpers/generalHelper");
const { serializeOptions } = require("../helpers/indexHelper");
const { getAlterTypePrefix } = require("../helpers/updateHelpers/udtHelper");
const { getDiff } = require("../helpers/tableOptionService/getDiff");
const { mergeValuesWithConfigOptions } = require("../helpers/tableHelper");
const { parseToString } = require("../helpers/tableOptionService/parseToString");
const { getViewName } = require("../helpers/updateHelpers/viewHelper");
const { getOptionsScript } = require("../helpers/viewHelper");
const { wrapInQuotes } = require("../helpers/updateHelpers/generalHelper");

const alterTablePrefix = (tableName, keySpace) =>
    keySpace ? `ALTER TABLE ${wrapInQuotes(keySpace)}.${wrapInQuotes(tableName)}` : `ALTER TABLE ${wrapInQuotes(tableName)}`;

module.exports = app => {
    
    const { assignTemplates } = app.require('@hackolade/ddl-fe-utils');
    
    return {

        dropTable(name) {
            return assignTemplates(templates.dropTable, {name});
        },

        createTable(modelData) {
            if (!modelData.databaseName) {
                return '';
            }
            const {
                ifNotExist,
                databaseName,
                items,
                options
            } = modelData;

            const ifNotExistStatement = ifNotExist ? `IF NOT EXISTS `:``;

            return assignTemplates(templates.createTable, {
                ifNotExistStatement,
                name: databaseName,
                items: ` (\n` +
                items.map(item => tab(item)).join(',\n') + '\n' +
                `)`,
                options: `${options}`
            });
        },

        dropDatabase(name) {
            return !name ? '' : assignTemplates(templates.dropDatabase, {name});
        },
        
        createCustomIndex(modelData) {
            if (!modelData.tableName) {
                return '';
            }
            const { name, tableName, column, using, options, ifNotExist } = modelData;
            
            const ifNotExistStatement = ifNotExist? `IF NOT EXISTS `:``;
            const usingStatement = using || 'StorageAttachedIndex';
            const optionsStatement = Object.keys(options).length ? '\n' + tab(`WITH OPTIONS = {\n${tab(serializeOptions(options).join(',\n'))}\n}`) : '';
            
            return assignTemplates(templates.createCustomIndex, {ifNotExistStatement, name: `"${name}"`, tableName, column, usingStatement, optionsStatement});
        },

        createIndex(modelData) {
            const { name, tableName, column, ifNotExist } = modelData;
            const nameStatement = name ? `"${name}"` : ''; 
            const ifNotExistStatement = ifNotExist? `IF NOT EXISTS `:``;

            return assignTemplates(templates.createIndex, {ifNotExistStatement, nameStatement, tableName, column});
        },

        createSearchIndex(modelData) {
            const { ifNotExist, tableName, columnsStatement, profiles, config, options } = modelData;
            const ifNotExistStatement = ifNotExist? `IF NOT EXISTS `:``;

            return assignTemplates(templates.createSearchIndex, {ifNotExistStatement, tableName, columnsStatement, profiles, config, options});
        },

        dropType(modelData) {
            const { keyspaceName, typeName } = modelData;

            return assignTemplates(templates.dropType, {keyspaceName: wrapInQuotes(keyspaceName), typeName: wrapInQuotes(typeName)});
        },

        renameColumn(modelData) {
            const { tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);

            return assignTemplates(templates.renameColumn, {alterTablePrefixStatement, oldName: wrapInQuotes(columnData.oldName), newName: wrapInQuotes(columnData.newName)});
        },

        addEntity(modelData) {
            const { tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);
            

            return assignTemplates(templates.addEntity, {alterTablePrefixStatement, name: wrapInQuotes(columnData.name), type: columnData.type});
        },

        deleteEntity(modelData) {
            const { tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);

            return assignTemplates(templates.deleteEntity, {alterTablePrefixStatement, name: wrapInQuotes(columnData.name)});
        },

        addPropertyToUdt(modelData) {
            const { keySpaceName, udtName, type } = modelData;
            const alterTypePrefixStatement = getAlterTypePrefix(keySpaceName);

            return assignTemplates(templates.addPropertyToUdt, {alterTypePrefixStatement, udtName: wrapInQuotes(udtName), name: wrapInQuotes(udtName), type});
        },

        createUdt(modelData) {
            const { keySpaceName, udtName, columnScript } = modelData;

            return assignTemplates(templates.createUdt, {keySpaceName: wrapInQuotes(keySpaceName), udtName: wrapInQuotes(udtName), columnScript: tab(columnScript)});
        },

        updateUdtType(modelData) {
            const { keySpaceName, udtName, columnData } = modelData;
            const alterTypePrefixStatement = getAlterTypePrefix(keySpaceName);

            return assignTemplates(templates.updateUdtType, {alterTypePrefixStatement, udtName: wrapInQuotes(udtName), name: wrapInQuotes(columnData.name), type: columnData.type});
        },

        renameType(modelData) {
            const { keySpaceName, udtName, oldFieldName, newFieldName } = modelData;
            const alterTypePrefixStatement = getAlterTypePrefix(keySpaceName);

            return assignTemplates(templates.renameType, {
                alterTypePrefixStatement, 
                udtName: wrapInQuotes(udtName), 
                oldFieldName: wrapInQuotes(oldFieldName), 
                newFieldName: wrapInQuotes(newFieldName)
            });
        },

        updateType(modelData) {
            const {  tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);

            return assignTemplates(templates.updateType, {alterTablePrefixStatement, name: wrapInQuotes(columnData.name), type: columnData.type});
        },

        updateTableOptions(compMod, tableName, isGetOptionScript) {
            if (!isGetOptionScript || !compMod || !compMod.tableOptions) {
                return '';
            }
            const { keyspaceName, tableOptions, comments } = compMod;
            const isCommentNew = comment => comment?.new && comment.new !== comment.old;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);

            const optionsDiff = getDiff(tableOptions.new || {}, tableOptions.old || {});
            const configOptionsWithValues = mergeValuesWithConfigOptions(optionsDiff);
            const optionsStatement = isCommentNew(comments)
                ? parseToString(configOptionsWithValues, comments.new)
                : parseToString(configOptionsWithValues);
            
            return optionsStatement 
                ? assignTemplates(templates.updateTableOptions, {alterTablePrefixStatement, optionsStatement: tab(optionsStatement)}) 
                : '';
        },

        dropSearchIndexConfig(keyspaceName, tableName, indexName) {
            const tableNameStatement = getTableNameStatement(keyspaceName, tableName);

            return assignTemplates(templates.dropSearchIndexConfig, {tableNameStatement, indexName});
        },

        modifySearchIndex(keyspaceName, tableName, key, value) {
            const tableNameStatement = getTableNameStatement(keyspaceName, tableName);

            return assignTemplates(templates.modifySearchIndex, {tableNameStatement, key, value});
        },

        dropSearchIndex(keyspaceName, tableName) {
            const tableNameStatement = getTableNameStatement(keyspaceName, tableName);

            return assignTemplates(templates.dropSearchIndex, {tableNameStatement});
        },

        dropIndex(keyspaceName, tableName) {
            const tableNameStatement = getTableNameStatement(keyspaceName, tableName);

            return assignTemplates(templates.dropIndex, {tableNameStatement});
        },

        dropKeySpace(keySpaceName) {

            return assignTemplates(templates.dropKeySpace, {keySpaceName: wrapInQuotes(keySpaceName)});
        },

        createKeySpace(keySpaceName, replication, durableWrites, udfData, udaData) {
            const udfScript = getUserDefinedFunctions(udfData);
            const udaScript = getUserDefinedAggregations(udaData);

            return assignTemplates(templates.createKeySpace, {
                keySpaceName: wrapInQuotes(keySpaceName), 
                replication: tab(replication), 
                durableWrites: tab(durableWrites), 
                udfScript, 
                udaScript
            });
        },
        
        alterKeySpaceReplication(keySpaceName, replication, durableWrites) {

            return assignTemplates(templates.alterKeySpaceReplication, {keySpaceName: wrapInQuotes(keySpaceName), replication: tab(replication), durableWrites: tab(durableWrites, 2)});
        },

        dropView(modelData) {
            const { compMod, name, code } = modelData.role;
            const viewName = getViewName(compMod.keyspaceName, code || name);

            return assignTemplates(templates.dropView, {viewName});
        },
        
        alterView(role) {
            const viewData = [role];
            const optionScript = getOptionsScript({
                collectionRefsDefinitionsMap: role.compMod.collectionData?.collectionRefsDefinitionsMap || {},
                viewData
            });
            const viewName = role.name || role.code;
            const keyspaceName = role.compMod.keyspaceName;
            if (optionScript) {
                const keySpaceViewName = getViewName(keyspaceName, viewName);
                
                return assignTemplates(templates.alterView, {keySpaceViewName, optionScript: tab(optionScript)});
            }
            
            return '';
        },
    }
};