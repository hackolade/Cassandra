const templates = require('./ddlTemplates');
const { tab } = require("../helpers/generalHelper");
const { serializeOptions } = require("../helpers/indexHelper");
const { alterTablePrefix } = require("../helpers/updateHelpers/tableHelper");
const {getAlterTypePrefix} = require("../helpers/updateHelpers/udtHelper");

module.exports = app => {
    const {assignTemplates} = app.require('@hackolade/ddl-fe-utils');
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

            const ifNotExistStatement = ifNotExist? `IF NOT EXISTS `:``;

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
            
            return assignTemplates(templates.createCustomIndex, {ifNotExistStatement, name, tableName, column, usingStatement, optionsStatement});
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

            return assignTemplates(templates.dropType, {keyspaceName, typeName});
        },

        renameColumn(modelData) {
            const { tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);

            return assignTemplates(templates.renameColumn, {alterTablePrefixStatement, oldName: columnData.oldName, newName: columnData.newName});
        },

        addEntity(modelData) {
            const { tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);
            

            return assignTemplates(templates.addEntity, {alterTablePrefixStatement, name: columnData.name, type: columnData.type});
        },

        deleteEntity(modelData) {
            const { tableName, keyspaceName, columnData } = modelData;
            const alterTablePrefixStatement = alterTablePrefix(tableName, keyspaceName);

            return assignTemplates(templates.deleteEntity, {alterTablePrefixStatement, name: columnData.name});
        },

        addPropertyToUdt(modelData) {
            const { keySpaceName, udtName, name, type } = modelData;
            const alterTypePrefixStatement = getAlterTypePrefix(keySpaceName);

            return assignTemplates(templates.addPropertyToUdt, {alterTypePrefixStatement, udtName, name, type});
        },

        createUdt(modelData) {
            const { keySpaceName, udtName, columnScript } = modelData;

            return assignTemplates(templates.createUdt, {keySpaceName, udtName, columnScript: tab(columnScript)});
        },

        updateType(modelData) {
            const { keySpaceName, udtName, columnData } = modelData;
            const alterTypePrefixStatement = getAlterTypePrefix(keySpaceName);

            return assignTemplates(templates.updateType, {alterTypePrefixStatement, udtName, name: columnData.name, type: columnData.type});
        },
    }
};