const { dependencies } = require('../appDependencies');
const { getColumnDefinition } = require('../columnHelper');
const { eachField } = require('../generalHelper');
const { getTypeByData } = require('../typeHelper');
const { checkIsOldModel, fieldTypeCompatible } = require('./generalHelper');
const { getDelete } = require('./tableHelper');
const { AlterScriptDto } = require("../types/AlterScriptDto");

const DEFAULT_KEY_SPACE = { 'Default_Keyspace': [] };

const scriptData = {
	added: false,
	deleted: false,
	modified: false,
	udt: 'udt',
};

const getAlterTypePrefix = keySpaceName => `ALTER TYPE "${keySpaceName}"`;

const getDropUDT = (dropUDTData) => ([
	AlterScriptDto.getInstance(
		[dependencies.provider.dropType({keyspaceName: dropUDTData.keyspaceName, typeName: dropUDTData.typeName})],
		true, 
		'deletion',
		'udt'
	)
]);

const getAddToUDT = addToUDTData => {
	const { keySpaces, udtName, name, type } = addToUDTData;
	
	return Object.keys(keySpaces).map(keySpaceName => AlterScriptDto.getInstance(
			[dependencies.provider.addPropertyToUdt({keySpaceName, udtName, name, type})], 
			true,
			'add',
			'udt'
		)
	);
};

const getKeySpaces = role => {
	const keySpaces = role.compMod?.bucketsWithCurrentDefinition;
	return !dependencies.lodash.isEmpty(keySpaces) ? keySpaces : DEFAULT_KEY_SPACE;
};

const getAddScript = (item, udtMap) => {
	const { role = {}, compMod = {}, properties = {} } = item;
	const keySpaces = getKeySpaces(role);

	if (compMod.created) {
		const columnScript = getColumnDefinition(properties, udtMap);

		return Object.keys(keySpaces).map(currentKeyspace => {
			const udtName = role.code || role.name || '';
			
			return AlterScriptDto.getInstance(
				[dependencies.provider.createUdt({ keySpaceName: currentKeyspace, udtName, columnScript })],
				true,
				'add',
				'udt'
			);
		});
	}

	return Object.entries(properties)
		.reduce((scripts, [name, property]) => ([
			...scripts,
			...getAddToUDT({
				type: getTypeByData(property, udtMap),
				name,
				keySpaces,
				udtName: role.code || role.name || '',
			})
		]), [])
};

const prepareField = (field, property) => {
	if (field.type !== 'reference' || field.$ref || !property.$ref) {
		return field;
	}

	return {
		...field,
		$ref: property.$ref,
	}
};

const getUpdateScript = (item, data, udtMap) => {
	const { role = {}, properties } = item;
	if (!properties) {
		return [scriptData];
	}
	const keySpaces = getKeySpaces(role);
	const udtName = role.code || role.name;
	return Object.entries(properties).reduce((script, [propertyName, property]) => {
		const itemOldName = dependencies.lodash.get(property, 'compMod.oldField.name');
		const itemNewName = dependencies.lodash.get(property, 'compMod.newField.name');
		const {compMod = {}} = property

		const oldFieldType = getTypeByData(prepareField(compMod.oldField, property), udtMap, 'newField');
		const newFieldType = getTypeByData(prepareField(compMod.newField, property), udtMap, 'oldField');

		const isOldModel = checkIsOldModel(dependencies.lodash.get(data, 'modelData'));
		const newScript = Object.keys(keySpaces).reduce((script, keySpaceName) => {
			const changeType = newFieldType &&
				oldFieldType &&
				newFieldType !== oldFieldType &&
				fieldTypeCompatible(oldFieldType, newFieldType) &&
				isOldModel;
			if (changeType) {
				const updateTypeScript = dependencies.provider.updateType({
					keySpaceName,
					udtName,
					columnData: {
						name: propertyName,
						type: newFieldType
					}
				});
				script = [
					...script,
					AlterScriptDto.getInstance(
						[updateTypeScript],
						true,
						'modify',
						'udt'
					)
				];
			}

			if (itemNewName && itemOldName && itemOldName !== itemNewName) {
				const renameScript = dependencies.provider.renameType({
					keySpaceName,
					oldFieldName: itemOldName,
					newFieldName: itemNewName,
					udtName,
				});
				
				script = [
					...script,
					AlterScriptDto.getInstance(
						[renameScript],
						true,
						'modify',
						'udt'
					)
				];
			}

			return script;
		}, []);
		return [...script, ...newScript];
	}, []);
};

const getDeleteScript = item => {
	const { properties, compMod = {}, role = {} } = item;

	if (!compMod?.deleted || !properties) {
		return [scriptData];
	}
	const keySpaces = getKeySpaces(role);
	const udtName = role.code || role.name || '';

	return Object.entries(keySpaces)
		.reduce((script, [keyspaceName, keySpace]) => {
			const newScript = keySpace.reduce((script, table) => {
				const dropColumnScript = getDelete({
					tableName: table.collectionName || table.code,
					keyspaceName,
					columnData: {
						name: udtName
					}
				});
				const dropUdtScript = getDropUDT({
					keyspaceName,
					typeName: udtName
				});
				return [...script, ...dropColumnScript, ...dropUdtScript];
			}, []);
			return [...script, ...newScript];
		}, []);
};

const getUdtScript = ({ child, mode, data, udtMap }) => {
	if (mode === 'add') {
		return getAddScript(child, udtMap);
	} else if (mode === 'update') {
		return getUpdateScript(child, data, udtMap);
	}
	return getDeleteScript(child);

};

const sortAddedUdt = udt => {
	const items = udt.properties.added?.items;
	if (!items || !Array.isArray(items)) {
		return udt;
	}

	let createdUdt = items.filter(item => {
		const child = item.properties[Object.keys(item.properties)[0]];
		return child.compMod?.created;
	});

	const otherUdt = dependencies.lodash.xorWith(items, createdUdt, dependencies.lodash.isEqual);
	createdUdt = createdUdt.map(item => {
		const itemName = Object.keys(item.properties)[0];
		return [ itemName, item ];
	});

	const createdUdtNames = createdUdt.map(([itemName, __]) => itemName);
	const sortedCreatedUdtNames = [];

	createdUdt.forEach(([itemName, item]) => {
		const referencesName = new Set();
		const child = item.properties[itemName];

		eachField(child || {}, (field) => {
			if (field.$ref) {
				const udtName = field.$ref.split('/').pop();
				referencesName.add(udtName)
			}
		});

		const referencesNameInUdt = Array.from(referencesName)
			.filter(name => createdUdtNames.includes(name) && !sortedCreatedUdtNames.includes(name));

		sortedCreatedUdtNames.push(...referencesNameInUdt);

		if (!referencesNameInUdt.length) {
			const index = sortedCreatedUdtNames.indexOf(itemName)

			if (index === -1) {
				sortedCreatedUdtNames.unshift(itemName);
			} else {
				sortedCreatedUdtNames.unshift(...sortedCreatedUdtNames.splice(index, 1));
			}
		}
	})

	const notSortedUdtNames = createdUdtNames.filter(name => !sortedCreatedUdtNames.includes(name));

	createdUdt = Object.fromEntries(createdUdt);
	createdUdt = [...sortedCreatedUdtNames, ...notSortedUdtNames].map(name => createdUdt[name]).filter(Boolean);

	udt.properties.added.items = [...createdUdt, ...otherUdt];
	
	return udt;
};

module.exports = {
	getUdtScript,
	sortAddedUdt,
	getAlterTypePrefix,
}