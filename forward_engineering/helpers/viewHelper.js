'use strict'

const _ = require('lodash');
const { retrieveContainerName, retrieveEntityName, retrivePropertyFromConfig } = require('./generalHelper');
const { getOptions, getPrimaryKeyList } = require('./tableHelper');

const getColumnNames = (collectionRefsDefinitionsMap, columns) => {
	return _.uniq(Object.keys(columns).map(name => {
		const id = _.get(columns, [name, 'GUID']);

		const itemData = Object.keys(collectionRefsDefinitionsMap).find(viewFieldId => {
			const definitionData = collectionRefsDefinitionsMap[viewFieldId];

			return definitionData.definitionId === id;
		});

		return `"${_.get(itemData, 'name', name)}"`;
	})).filter(_.identity);
};

const getWhereStatement = (primaryKeys, columnsNames) => {
	if (_.isEmpty(columnsNames)) {
		return '';
	}
	return 'WHERE ' + columnsNames
		.filter(name => !primaryKeys.includes(name))
		.reduce((statement, name) => {
			if (!statement) {
				return `${name} IS NOT NULL`;
			}

			return `${statement} AND ${name} IS NOT NULL`;
		}, '');
};

const getNamesByIds = (collectionRefsDefinitionsMap, ids) => {
	return ids.reduce((hash, id) => {
		const name =  _.get(collectionRefsDefinitionsMap, [id, 'name']);
		if (!name) {
			return hash;
		}
		return Object.assign({}, hash, {
			[id]: name
		});
	}, {});
};

const getClusteringKeyData = (collectionRefsDefinitionsMap, viewData) => {
	const clusteringKeys = retrivePropertyFromConfig(viewData, 0, 'compositeClusteringKey', []);

	const clusteringKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		clusteringKeys.map(key => key.keyId)
	);

	return { clusteringKeys, clusteringKeysHash };
};

const getPrimaryKeysNames = (collectionRefsDefinitionsMap, viewData) => {
	const partitionKeys = retrivePropertyFromConfig(viewData, 0, 'compositePartitionKey', []);
	const partitionKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		partitionKeys.map(key => key.keyId)
	);

	return _.values(partitionKeysHash).filter(_.identity).map(name => `"${name}"`);
};

const getPrimaryKeyScript = (collectionRefsDefinitionsMap, viewData) => {
	const partitionKeys = retrivePropertyFromConfig(viewData, 0, 'compositePartitionKey', []);
	const partitionKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		partitionKeys.map(key => key.keyId)
	);
	const clusteringKeyData = getClusteringKeyData(collectionRefsDefinitionsMap, viewData);

	const keysList = getPrimaryKeyList(partitionKeysHash, clusteringKeyData.clusteringKeysHash);
	if (!keysList) {
		return '';
	}

	return `PRIMARY KEY (${keysList})`;
};

const addTab = script => _.trim(script || '').replace(/  /g, '    ');

const getOptionsScript = (collectionRefsDefinitionsMap, viewData) => {
	const clusteringKeyData = getClusteringKeyData(collectionRefsDefinitionsMap, viewData);
	const tableComment = retrivePropertyFromConfig(viewData, 0, 'comments', '');
	const tableOptions = retrivePropertyFromConfig(viewData, 0, 'tableOptions', '');

	return addTab(getOptions(
		clusteringKeyData.clusteringKeys,
		clusteringKeyData.clusteringKeysHash,
		'',
		tableOptions,
		tableComment
	));
};

module.exports = {
	getViewScript({
		schema,
		viewData,
		entityData,
		containerData,
		collectionRefsDefinitionsMap
	}) {
		let script = [];
		const columns = schema.properties || {};
		const view = _.first(viewData) || {};

		const entityName = retrieveEntityName(entityData);
		const bucketName = retrieveContainerName(containerData);
		const tableName = bucketName ? `"${bucketName}"."${entityName}"` : `"${entityName}"`;
		const viewName = view.code || view.name;
		const name = bucketName ? `"${bucketName}"."${viewName}"` : `"${viewName}"`;

		const primaryKeyScript = getPrimaryKeyScript(collectionRefsDefinitionsMap, viewData);
		const optionsScript = getOptionsScript(collectionRefsDefinitionsMap, viewData);

		script.push(`CREATE MATERIALIZED VIEW IF NOT EXISTS ${name}`);
	
		if (!columns) {
			script.push(`AS SELECT * FROM ${tableName};`);
		} else {
			const columnsNames = getColumnNames(collectionRefsDefinitionsMap, columns);
			script.push(`AS SELECT ${columnsNames.join(', ')}`);
			script.push(`FROM ${tableName}`);
			const primaryKeysNames = getPrimaryKeysNames(collectionRefsDefinitionsMap, viewData);
			script.push(getWhereStatement(primaryKeysNames, columnsNames));
		}

		if (primaryKeyScript) {
			script.push(primaryKeyScript);
		}

		if (optionsScript) {
			script.push(optionsScript);
		}
		
		return script.join('\n  ') + ';';
	}
};
