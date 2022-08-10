const mergeArrays = (first, sec) => {
	return [...first, ...sec];
};

const typesCompatibility = {
	blob: ['ascii', 'bigint', 'boolean', 'decimal', 'double', 'float', 'inet', 'int', 'timestamp', 'timeuuid', 'uuid', 'varchar', 'varint'],
	varint: ['int'],
	varchar: ['text'],
	uuid: ['timeuuid'],
	text: ['varchar']
};

const checkIsOldModel = modelData => {
	const modelVersion = modelData.filter(element => {
		return element.dbVersion;
	})[0].dbVersion;
	const majorDigitIndex = modelVersion.search(/\d/);

	if (majorDigitIndex !== -1) {
		const majorDigit = modelVersion[majorDigitIndex];
		return majorDigit < 3;
	}
};

const fieldTypeCompatible = (oldType, newType) => {
	const compatibility = typesCompatibility[newType];

	if (!compatibility) {
		return false;
	}

	const foundCapabilityType = compatibility.filter(type => {
		return type === oldType;
	});

	if (!Boolean(foundCapabilityType.length)) {
		return false;
	}

	return true
};

module.exports = {
	mergeArrays,
	checkIsOldModel,
	fieldTypeCompatible,
}