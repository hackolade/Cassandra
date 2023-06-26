const {dependencies} = require("./appDependencies");
const {getAlterScriptDtos} = require("./alterScriptFromDeltaHelper");
const {commentDeactivatedStatement, getApplyDropStatement} = require("./generalHelper");

/**
 *
 * @param scriptDtos {Array<AlterScriptDto>}
 * @param data
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getCommentedDropScript = (scriptDtos, data) => {
    const applyDropStatements = getApplyDropStatement(data);
    if (applyDropStatements) {
        return scriptDtos;
    }
    return scriptDtos.map((dto = {}) => {
        if (!dto?.scripts[0]?.isDropScript || !dto?.scripts[0]?.script) {
            return dto;
        }
        return {
            ...dto,
            scripts: dto.scripts.map(scriptObject => {
                return {
                    ...scriptObject,
                    script: commentDeactivatedStatement(scriptObject.script, false)
                }

            })
        };
    })
};

/**
 * 
 * @param scriptDtos {[(AlterScriptDto|undefined)]}
 * @returns {(string | undefined)[]}
 */
const sortScript = (scriptDtos) => {
    const scriptData = scriptDtos.flatMap(dto => dto.scripts);
    const filterProp = (key, prop, script = {}) => script[key] && script.modelLevel === prop;
    const filter = (scriptType, scriptData, modelLevel) => {
        return scriptData.reduce((scripts, currentScript) => {
            if (filterProp(scriptType, modelLevel, currentScript)) {
                scripts.scripts.push(currentScript);
                return scripts;
            }
            scripts.filteredScripts.push(currentScript);

            return scripts;
        }, { scripts: [], filteredScripts: [] });
    };

    const orderForScripts = [
        ['keySpaces', 'isAddScript'],
        ['keySpaces', 'isModifyScript'],
        ['view', 'isDropScript'],
        ['index', 'isDropScript'],
        ['renewal', 'isDropScript'],
        ['table', 'isDropScript'],
        ['udt', 'isDropScript'],
        ['udt', 'isAddScript'],
        ['udt', 'isModifyScript'],
        ['table', 'isAddScript'],
        ['table', 'isModifyScript'],
        ['field', 'isDropScript'],
        ['field', 'isAddScript'],
        ['field', 'isModifyScript'],
        ['index', 'isAddScript'],
        ['index', 'isModifyScript'],
        ['renewal', 'isAddScript'],
        ['view', 'isAddScript'],
        ['view', 'isModifyScript'],
        ['udf', 'isDropScript'],
        ['udf', 'isAddScript'],
        ['keySpaces', 'isDropScript'],
    ];
    const sortedScripts = orderForScripts.reduce((script, [modelLevel, scriptType]) => {
        const { scripts, filteredScripts } = filter(scriptType, script.filteredScripts, modelLevel);
        return {
            sorted: [...script.sorted, ...scripts],
            filteredScripts
        }
    }, {
        sorted: [],
        filteredScripts: scriptData
    });

    return [...sortedScripts.sorted, ...sortedScripts.filteredScripts].map(data => data.script);
};
const buildContainerLevelAlterScript = (jsonSchema, udtMap, data) => {
    let alterScriptDtos = getAlterScriptDtos(jsonSchema, udtMap, data);
    alterScriptDtos = dependencies.lodash.uniqWith(alterScriptDtos, dependencies.lodash.isEqual);
    alterScriptDtos = getCommentedDropScript(alterScriptDtos, data);
    const scriptData = sortScript(alterScriptDtos);

    return scriptData.filter(Boolean).join('\n\n');
}

/**
 *
 * @param child {PersistenceSchemaChild}
 * @param udtMap {Object}
 * @param data {Object}
 * @returns {boolean}
 */
const isDropInStatements = (child, udtMap, data) => {
    return getAlterScriptDtos(child, udtMap, data)
        .some(dto => dto.isActivated && dto.scripts.some(script => script.isDropScript));
}

module.exports = {
    buildContainerLevelAlterScript,
    isDropInStatements
}