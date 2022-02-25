const { dependencies } = require('../appDependencies');
const { getReplication, getDurableWrites } = require('../keyspaceHelper');
const { retrivePropertyFromConfig, tab } = require('../generalHelper');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const getAddKeyspacePrefix = (keySpaceName) => `CREATE KEYSPACE IF NOT EXISTS "${keySpaceName}" \n`;
const getDropKeyspace = (keySpaceName) => `DROP KEYSPACE "${keySpaceName}"`;
const alterKeyspacePrefix = keyspaceName => `ALTER KEYSPACE "${keyspaceName}" \n`;

const getAddUDFScript = (udfData, keySpaceName) => {
	const { name, columns, calledBody, returnDataType, languageBody, functionBody } = udfData;
	return `CREATE OR REPLACE FUNCTION ${keySpaceName}.${name} (\n` +
		tab(`${tab(columns, 2)}\n${tab(')')}\n`) +
		tab(`${calledBody} INPUT\n`) +
		tab(`RETURNS ${returnDataType}\n`) +
		tab(`LANGUAGE ${languageBody} AS\n`) + 
		tab(`$$\n${tab(functionBody, 2)}\n${tab('$$')}`) + ';';
} 

const getInnerAggregateScript = (script, data) => data ? tab(`\n${script} ${data}`, 2) : '';

const getAddUDAScript = (udfData, keySpaceName) => {
	const { name, typeInput, stateFunction, stateType, finalFunction, initCondition } = udfData;
	return `CREATE OR REPLACE AGGREGATE ${keySpaceName}.${name} (\n` + 
		tab(`${tab(typeInput, 2)}\n${tab(')')}\n`) +
		tab(`SFUNC ${stateFunction}\n`) +
		tab(`STYPE ${stateType}`) +
		getInnerAggregateScript('FINALFUNC', finalFunction) +
		getInnerAggregateScript('INITCOND', initCondition) + ';';
} 

const getDropUDFScript = (udfData, keySpaceName) => `DROP FUNCTION IF EXISTS ${keySpaceName}.${udfData.name}`;
const getDropUDAScript = (udfData, keySpaceName) => `DROP AGGREGATE IF EXISTS ${keySpaceName}.${udfData.name}`;

const requiredPropsForUDF = ['name', 'columns', 'calledBody', 'returnDataType', 'languageBody', 'functionBody'];
const requiredPropsForUDA = ['name', 'typeInput', 'stateFunction', 'stateType',];

const getDataForScript = (newElements, oldElements, requiredProps) => {
	let dataForAddScript = [];
	let dataForDropScript = [];

	if (!oldElements.length) {
		dataForAddScript = newElements;
	} else if (!newElements.length) {
		dataForDropScript = oldElements;
	} else {
		const difference = (newElement, oldElement) => requiredProps.every(prop => _.isEqual(newElement[prop], oldElement[prop]));

		const equalElements = _.intersectionWith(newElements, oldElements, difference);
		dataForAddScript = _.xorWith(newElements, equalElements, difference);
		dataForDropScript = _.xorWith(oldElements, equalElements, difference);
	}
	return {
		dataForAddScript,
		dataForDropScript
	}
}

const getModifyUDFA = ({ new: newElements, old: oldElements, keySpaceName, getAddScript, getDropScript, requiredProps }) => {
	if (!newElements || !oldElements) {
		return '';
	}

	const { dataForAddScript, dataForDropScript } = getDataForScript(newElements, oldElements, requiredProps);


	const addScript = dataForAddScript.filter(udf => Object.entries(udf).every(([key, value]) => 
			requiredProps.includes(key) ? !!value : true
		))
		.map(udfData => getAddScript(udfData, keySpaceName));
	
	const dropScript = dataForDropScript.filter(udf => !!udf.name).map(udfData => getDropScript(udfData, keySpaceName));

	return [...addScript, ...dropScript].join('\n\n')
}

const getKeySpaceScript = ({ child, mode }) => {
	setDependencies(dependencies);
	const keyspaceData = [child.role];
	const keySpaceName = child.role.code || child.role.name;
	const replicationStrategyProp = retrivePropertyFromConfig(keyspaceData, 0, "replStrategy", "");
	const replicationFactorProp = retrivePropertyFromConfig(keyspaceData, 0, "replFactor", undefined);
	const dataCentersProp = retrivePropertyFromConfig(keyspaceData, 0, "dataCenters", []);
	const durableWritesProp = retrivePropertyFromConfig(keyspaceData, 0, "durableWrites", false);
	const compMod = retrivePropertyFromConfig(keyspaceData, 0, 'compMod', {});

	const replication = getReplication(replicationStrategyProp, replicationFactorProp, dataCentersProp);
	const durableWrites = getDurableWrites(durableWritesProp);
	
	if (mode === 'add') {
		let innerScript = getAddKeyspacePrefix(keySpaceName);
		innerScript += `${tab(replication)}\n${durableWrites}; \n\n${udfScript}${udaScript}`;

		return {
			script: innerScript,
			added: true,
			deleted: false,
			modified: false,
			keySpaces: keySpaceName
		};
	} else if (mode === 'delete') {
		const innerScript = `${getDropKeyspace(keySpaceName)};`;

		return {
			script: innerScript,
			added: false,
			deleted: true,
			modified: false,
			keySpaces: keySpaceName
		};
	} 
	const dataForUDFScript = compMod?.UDFs || {};
	const dataForUDAScript = compMod?.UDAs || {};
	const modifyUDFScript = getModifyUDFA({
		...dataForUDFScript, 
		getAddScript: getAddUDFScript,
		getDropScript: getDropUDFScript,
		requiredProps: requiredPropsForUDF,
		keySpaceName
	});
	const modifyUDAScript = getModifyUDFA({
		...dataForUDAScript, 
		getAddScript: getAddUDAScript,
		getDropScript: getDropUDAScript,
		requiredProps: requiredPropsForUDA,
		keySpaceName
	});
	let innerScript = alterKeyspacePrefix(keySpaceName);
	innerScript += `${tab(replication)}\n${durableWrites}; \n\n${modifyUDFScript}${modifyUDAScript}`;

	return {
		script: innerScript,
		added: false,
		deleted: false,
		modified: true,
		keySpaces: keySpaceName
	};
}

module.exports = {
	getKeySpaceScript
}