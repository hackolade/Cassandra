const { dependencies } = require('../appDependencies');
const { isEqual, intersectionWith, xorWith } = require('lodash');
const { getReplication, getDurableWrites } = require('../keyspaceHelper');
const { retrievePropertyFromConfig } = require('../generalHelper');
const { AlterScriptDto } = require('../types/AlterScriptDto');

const getDropUDFScript = udfData => (udfData.name ? `DROP FUNCTION IF EXISTS ${udfData.name};` : '');
const getDropUDAScript = udfData => (udfData.name ? `DROP AGGREGATE IF EXISTS ${udfData.name};` : '');

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

		return result?.[1]?.trim();
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
};

const getDataForScript = (newElements, oldElements, requiredProps) => {
	let dataForAddScript = [];
	let dataForDropScript = [];

	if (!newElements.length && !oldElements.length) {
		return {
			dataForAddScript,
			dataForDropScript,
		};
	}

	if (!oldElements.length) {
		dataForAddScript = newElements;
	} else if (!newElements.length) {
		dataForDropScript = oldElements;
	} else {
		const difference = (newElement, oldElement) =>
			requiredProps.every(prop => isEqual(newElement[prop], oldElement[prop]));

		const equalElements = intersectionWith(newElements, oldElements, difference);
		dataForAddScript = xorWith(newElements, equalElements, difference);
		dataForDropScript = xorWith(oldElements, equalElements, difference);
	}
	return {
		dataForAddScript,
		dataForDropScript,
	};
};

const getModifyUDFA = ({ new: newElements = [], old: oldElements = [], udData }) => {
	newElements = newElements.map(element => ({
		...element,
		name: parser[udData.parser](element[udData.functionName]),
	}));
	oldElements = oldElements.map(element => ({
		...element,
		name: parser[udData.parser](element[udData.functionName]),
	}));

	const { dataForAddScript, dataForDropScript } = getDataForScript(newElements, oldElements, udData.requiredProps);

	const addScript = dataForAddScript
		.filter(ud =>
			Object.entries(ud).every(([key, value]) => (udData['requiredProps'].includes(key) ? !!value : true)),
		)
		.map(ud => AlterScriptDto.getInstance([ud[udData.functionName]], true, 'add', 'udf'));

	const dropScript = dataForDropScript
		.filter(ud => !!ud.name)
		.map(ud => AlterScriptDto.getInstance([udData.getDropScript(ud)], true, 'deletion', 'udf'));

	return [...dropScript, ...addScript];
};

const replicationProps = ['replStrategy', 'replFactory', 'dataCenters'];

const getIsModifyKeysSpace = (keySpaceData, props) => {
	return props.some(prop => {
		const { new: newElements, old: oldElements } = keySpaceData[prop] || {};
		return newElements && oldElements && !isEqual(newElements, oldElements);
	});
};

const getKeySpaceScript = ({ child, mode }) => {
	const keyspaceData = [child.role];
	const keySpaceName = child.role.code || child.role.name;
	const replicationStrategyProp = retrievePropertyFromConfig(keyspaceData, 0, 'replStrategy', '');
	const replicationFactorProp = retrievePropertyFromConfig(keyspaceData, 0, 'replFactor', undefined);
	const dataCentersProp = retrievePropertyFromConfig(keyspaceData, 0, 'dataCenters', []);
	const durableWritesProp = retrievePropertyFromConfig(keyspaceData, 0, 'durableWrites', false);
	const compMod = retrievePropertyFromConfig(keyspaceData, 0, 'compMod', {});

	const replication = getReplication(replicationStrategyProp, replicationFactorProp, dataCentersProp);
	const durableWrites = getDurableWrites(durableWritesProp);

	if (mode === 'add') {
		const udfData = retrievePropertyFromConfig(keyspaceData, 0, 'UDFs', []);
		const udaData = retrievePropertyFromConfig(keyspaceData, 0, 'UDAs', []);

		return [
			AlterScriptDto.getInstance(
				[dependencies.provider.createKeySpace(keySpaceName, replication, durableWrites, udfData, udaData)],
				true,
				'add',
				'keySpaces',
			),
		];
	} else if (mode === 'delete') {
		return [
			AlterScriptDto.getInstance(
				[dependencies.provider.dropKeySpace(keySpaceName)],
				true,
				'deletion',
				'keySpaces',
			),
		];
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
	const script = isModifyReplication
		? dependencies.provider.alterKeySpaceReplication(keySpaceName, replication, durableWrites)
		: '';

	return [AlterScriptDto.getInstance([script], true, 'modify', 'keySpaces'), ...modifyUDAScript, ...modifyUDFScript];
};

module.exports = {
	getKeySpaceScript,
};
