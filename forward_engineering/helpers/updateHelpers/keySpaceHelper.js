const { dependencies } = require('../appDependencies');
const { getReplication, getDurableWrites } = require('../keyspaceHelper');
const { retrivePropertyFromConfig, 
	getUserDefinedFunctions, 
	getUserDefinedAggregations,
	tab,
} = require('../generalHelper');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const scriptData = {
	added: false,
	deleted: false,
	modified: false,
	keySpaces: 'keySpaces',
}

const getAddKeyspacePrefix = (keySpaceName) => `CREATE KEYSPACE IF NOT EXISTS "${keySpaceName}" \n`;
const getDropKeyspace = (keySpaceName) => `DROP KEYSPACE IF EXISTS "${keySpaceName}";`;
const alterKeyspacePrefix = keyspaceName => `ALTER KEYSPACE "${keyspaceName}" \n`;

const getDropUDFScript = udfData => udfData.name ? `DROP FUNCTION IF EXISTS ${udfData.name};` : '';
const getDropUDAScript = udfData => udfData.name ? `DROP AGGREGATE IF EXISTS ${udfData.name};` : '';

const requiredPropsForUDF = ['functionBody'];
const requiredPropsForUDA = ['storedProcFunction'];

const udfData = {
	getDropScript: getDropUDFScript,
	requiredProps: requiredPropsForUDF,
	parser: 'getUDFName',
	functionName: 'functionBody',
};

const udaData = {
	getDropScript: getDropUDAScript,
	requiredProps: requiredPropsForUDA,
	parser: 'getUDAName',
	functionName: 'storedProcFunction',
};

const parser = {
	regExpUDFForName: /^.+function(.+?)\(/is,
	regExpUDAForName: /^.+aggregate(.+?)\(/is,
	getResult(body, reg) {
		const result = body.match(reg);
		if (result && result[1]) {
			return result[1].trim();
		}
		return;
	},
	getName(body, regex) {
		const result = this.getResult(body, regex);
		if (!result) {
			return result;
		}
		return result.replace(/if not exists/i, '').trim();
	},
	getUDFName(body) {
		return this.getName(body, this.regExpUDFForName);
	},
	getUDAName(body) {
		return this.getName(body, this.regExpUDAForName);
	},
}

const getDataForScript = (newElements, oldElements, requiredProps) => {
	let dataForAddScript = [];
	let dataForDropScript = [];

	if (!newElements.length && !oldElements.length) {
		return {
			dataForAddScript,
			dataForDropScript
		};
	}

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
	};
}

const getModifyUDFA = ({ new: newElements = [], old: oldElements = [], udData }) => {
	newElements = newElements.map(element => ({
		...element,
		name: parser[udData.parser](element[udData.functionName])
	}));
	oldElements = oldElements.map(element => ({
		...element,
		name: parser[udData.parser](element[udData.functionName])
	}));

	const { dataForAddScript, dataForDropScript } = getDataForScript(newElements, oldElements, udData.requiredProps);


	const addScript = dataForAddScript.filter(ud => Object.entries(ud).every(([key, value]) => 
			udData['requiredProps'].includes(key) ? !!value : true
		))
		.map(ud => ({
			udf: 'udf',
			added: true,
			script: ud[udData.functionName]
		}));
	
	const dropScript = dataForDropScript
		.filter(ud => !!ud.name)
		.map(ud => ({ udf: 'udf', script: udData.getDropScript(ud), deleted: true }));

	return [...dropScript, ...addScript];
}

const replicationProps = ['replStrategy', 'replFactory', 'dataCenters'];

const getIsModifyKeysSpace = (keySpaceData, props) => {
	const differentReplication = props.some(prop => {
		const { new: newElements, old: oldElements } = keySpaceData[prop] || {};
		return newElements && oldElements && !_.isEqual(newElements, oldElements);
	});
	return differentReplication;
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
		const udfData = retrivePropertyFromConfig(keyspaceData, 0, 'UDFs', []);
		const udaData = retrivePropertyFromConfig(keyspaceData, 0, 'UDAs', []);
		const udfScript = getUserDefinedFunctions(udfData);
		const udaScript = getUserDefinedAggregations(udaData);

		const script = [
			getAddKeyspacePrefix(keySpaceName) + `${tab(replication)}\n${tab(durableWrites)};`,
			udfScript ? udfScript : '',
			udaScript ? udaScript : ''
		].filter(Boolean).join('\n\n');

		return [{
			...scriptData,
			script,
			added: true,
		}];
	} else if (mode === 'delete') {
		const script = getDropKeyspace(keySpaceName);

		return [{
			...scriptData,
			script,
			deleted: true,
		}];
	} 
	const dataForUDFScript = compMod?.UDFs || {};
	const dataForUDAScript = compMod?.UDAs || {};
	const modifyUDFScript = getModifyUDFA({
		...dataForUDFScript, 
		udData: udfData,
	});
	const modifyUDAScript = getModifyUDFA({
		...dataForUDAScript, 
		udData: udaData,
	});
	const isModifyReplication = getIsModifyKeysSpace(compMod, replicationProps);
	const script = isModifyReplication ? 
		alterKeyspacePrefix(keySpaceName) +
		tab(`${replication}\n`) +
		tab(`${durableWrites};`) : '';

	return [{
		...scriptData,
		modified: true,
		script,
	}, ...modifyUDAScript, ...modifyUDFScript];
}

module.exports = {
	getKeySpaceScript
}