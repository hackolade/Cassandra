const { dependencies } = require('../appDependencies');
const { getColumnDefinition } = require('../columnHelper');
const { tab, eachField } = require('../generalHelper');
const { getTypeByData } = require('../typeHelper');
const { checkIsOldModel, fieldTypeCompatible } = require('./generalHelper');
const { getDelete } = require('./tableHelper');

let _;

const setDependencies = ({ lodash }) => _ = lodash;

const DEFAULT_KEY_SPACE = { 'Default_Keyspace': [] };

const scriptData = {
	added: false,
	deleted: false,
	modified: false,
	udt: 'udt',
};

const getAlterTypePrefix = keySpaceName => `ALTER TYPE "${keySpaceName}"`;

const getRenameType = (renameData) => 
	`${getAlterTypePrefix(renameData.keySpaceName)}."${renameData.udtName}" 
	RENAME "${renameData.oldFieldName}" TO "${renameData.newFieldName}";`;

const getDropUDT = (dropUDTData) => ([{
	...scriptData,
	script: `DROP TYPE IF EXISTS "${dropUDTData.keyspaceName}"."${dropUDTData.typeName}";`,
	deleted: true,
}]);

const getUpdateType = updateTypeData => 
	`${getAlterTypePrefix(updateTypeData.keySpaceName)}."${updateTypeData.udtName}" 
	ALTER "${updateTypeData.columnData.name}" TYPE ${updateTypeData.columnData.type};`;

const getAddToUDT = addToUDTData => {
	const { keySpaces, udtName, name, type } = addToUDTData;
	return Object.keys(keySpaces).map(keySpaceName => ({
		...scriptData,
		added: true,
		script:
		`${getAlterTypePrefix(keySpaceName)}."${udtName}" ADD "${name}" ${type};`
	})
	);
};

const getCreateUdt = (createData) => 
	`CREATE TYPE IF NOT EXISTS "${createData.keySpaceName}"."${createData.udtName}" (\n` +
	`${tab(createData.columnScript)} \n` + 
	');' ;

const getKeySpaces = role => {
	const keySpaces = role.compMod?.bucketsWithCurrentDefinition;
	return !_.isEmpty(keySpaces) ? keySpaces : DEFAULT_KEY_SPACE;
};

const getAddScript = (item, udtMap) => {
	const { role = {}, compMod = {}, properties = {} } = item;
	const keySpaces = getKeySpaces(role);

	if (compMod.created) {
		const columnScript = getColumnDefinition(properties, udtMap);

		return Object.keys(keySpaces).map(currentKeyspace => {
			const udtName = role.code || role.name || '';
			const script = getCreateUdt({ keySpaceName: currentKeyspace, udtName, columnScript });
			return {
					...scriptData,
					added: true,
					script
				};
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
	const script = Object.entries(properties).reduce((script, [propertyName, property]) => {
		const itemOldName = _.get(property, 'compMod.oldField.name');
		const itemNewName = _.get(property, 'compMod.newField.name');
		const { compMod = {} } = property

		const oldFieldType = getTypeByData(prepareField(compMod.oldField, property), udtMap, 'newField');
		const newFieldType = getTypeByData(prepareField(compMod.newField, property), udtMap, 'oldField');

		const isOldModel = checkIsOldModel(_.get(data, 'modelData'));
		const newScript = Object.keys(keySpaces).reduce((script, keySpaceName) => {
			const changeType = newFieldType && 
				oldFieldType &&
				newFieldType !== oldFieldType &&
				fieldTypeCompatible(oldFieldType, newFieldType) &&
				isOldModel;
			if (changeType) {
				const updateTypeScript = getUpdateType({
					keySpaceName,
					udtName,
					columnData: {
						name: propertyName,
						type: newFieldType
					}
				});
				script = [
					...script, 
					{
						...scriptData,
						script: updateTypeScript,
						modified: true,
					}
				];
			};

			if (itemNewName && itemOldName && itemOldName !== itemNewName) {
				const renameScript = getRenameType({
					keySpaceName,
					oldFieldName: itemOldName,
					newFieldName: itemNewName,
					udtName,
				})
				script = [...script, {
					...scriptData,
					script: renameScript,
					modified: true,
				}];
			}

			return script;
		}, []);
		return [...script, ...newScript];
	}, []);
	return script;
};

const getDeleteScript = item => {
	const { properties, compMod = {}, role = {} } = item;

	if (!compMod?.deleted || !properties) {
		return [scriptData];
	}
	const keySpaces = getKeySpaces(role);
	const udtName = role.code || role.name || '';

	const script = Object.entries(keySpaces)
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


	return script;
};

const getUdtScript = ({ child, mode, data, udtMap }) => {
	setDependencies(dependencies);

	if (mode === 'add') {
		return getAddScript(child, udtMap);
	} else if (mode === 'update') {
		return getUpdateScript(child, data, udtMap);
	}
	return getDeleteScript(child);

};

const sortAddedUdt = udt => {
	setDependencies(dependencies);
	const items = udt.properties.added?.items;
	if (!items || !Array.isArray(items)) {
		return udt;
	}

	let createdUdt = items.filter(item => {
		const child = item.properties[Object.keys(item.properties)[0]];
		return child.compMod?.created;
	});

	const otherUdt = _.xorWith(items, createdUdt, _.isEqual);
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
	sortAddedUdt
}