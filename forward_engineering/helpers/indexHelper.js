'use strict'

const { commentDeactivatedStatement, inlineComment } = require('./commentsHelper');
const { tab, getTableNameStatement } = require('./generalHelper');
const { getNamesByIds } = require('./schemaHelper');

const getIndexes = (indexData, dataSources, tableName, keyspaceName, isTableActivated, isKeyspaceActivated, dbVersion) => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const isParentActivated = isTableActivated && isKeyspaceActivated;
	const generalIndexes = getGeneralIndexes(tableNameStatement, dataSources, indexData.indexes);
	const searchIndex = dbVersion === 'Astra DB' ? [] : getSearchIndexStatement(tableNameStatement, dataSources, isParentActivated, indexData.searchIndex);	
	
	const indexStatements = [...generalIndexes, ...searchIndex].map(index => {
		return commentDeactivatedStatement(
			index.statement,
			index.isActivated,
			isParentActivated
		);
	}).join('\n\n');

	return indexStatements;
};

const getGeneralIndexes = (tableNameStatement, dataSources, indexes = []) => {
	return unwindIndexes(indexes).map(index => {
		let indexStatement;

		const isIndexKeyActivated = index.isActivated && isIndexColumnKeyActivated(index.SecIndxKey, dataSources);
		const columnStatement = getIndexColumnStatement(index.SecIndxKey, dataSources);
		if (index.indexType === 'custom') {
			indexStatement = getCustomIndex({
				name: index.name,
				tableName: tableNameStatement,
				column: columnStatement,
				using: index.isSASI ? 'org.apache.cassandra.index.sasi.SASIIndex' : 'StorageAttachedIndex',
				options: getCustomOptions(index.customOptions, index.isSASI),
				ifNotExist: index.indexIfNotExist
			});
		} else {
			indexStatement =  getIndex(
				index.name,
				tableNameStatement,
				columnStatement,
				index.indexIfNotExist
			);
		}

		return {
			isActivated: isIndexKeyActivated,
			statement: indexStatement,
		};
	});
};

const getSearchIndexStatement = (tableNameStatement, dataSources, isParentActivated, searchIndex) => {
	if (!searchIndex) {
		return [];
	}
	let columns = [];
	if(searchIndex.columns){
			columns = uniqueByName(searchIndex.columns.filter(column => Array.isArray(column.key) && column.key.length).map(column => ({
		...column,
		name: getIndexColumnStatement(column.key[0], dataSources),
		isActivated: isIndexColumnKeyActivated(column.key[0], dataSources),
	})));
	}

	const activatedColumns = columns.filter(column => column.isActivated);
	const isActivated = activatedColumns.length > 0;
	const statement = getSearchIndex({
		tableName: tableNameStatement,
		isActivated: isActivated && isParentActivated,
		index: searchIndex,
		columns,
		ifNotExist: searchIndex.ifNotExist
	});

	return [{
		isActivated,
		statement,
	}];
};

const uniqueByName = (columns) => {
	return columns.reduce((result, column) => {
		const exists = result.find(c => c.name === column.name);

		if (exists) {
			return result;
		}

		return result.concat(column);
	}, []);
};

const getIndex = (name, tableName, indexColumnStatement, ifNotExist) => (
	`CREATE INDEX ${ifNotExist ? `IF NOT EXISTS ` : ``}${name ? `"${name}"` : ``}\n${tab(`ON ${tableName} (${indexColumnStatement});`)}`	
);

const getCustomIndex = ({ name, tableName, column, using, options, ifNotExist }) => (
	`CREATE CUSTOM INDEX ${ifNotExist ? `IF NOT EXISTS ` : ``}${name ? `"${name}"` : ``}\n` +
	`${tab(`ON ${tableName} (${column})`)}\n` +
	`${tab(`USING '${using || 'StorageAttachedIndex'}'`)}` +
	`${Object.keys(options).length ? '\n' + tab(`WITH OPTIONS = {\n${tab(serializeOptions(options).join(',\n'))}\n}`) : ''};`	
);

const getIndexColumnStatement = (key, dataSources) => {
	const { name } = getNamesByIds([key.keyId], dataSources)[key.keyId] || {};

	return name ? wrapKey(`"${name}"`, key.type) : '';
};

const wrapKey = (column, type) => {
	if (type === 'keys') {
		return `KEYS(${column})`;
	}

	if (type === 'values') {
		return `VALUES(${column})`;
	}

	if (type === 'entries') {
		return `ENTRIES(${column})`;
	}

	if (type === 'full') {
		return `FULL(${column})`;
	}

	return column;
};

const isIndexColumnKeyActivated = (key, dataSources) => {
	const { isActivated } = getNamesByIds([key.keyId], dataSources)[key.keyId] || {};

	return isActivated !== false;
};

const unwindIndexes = (indexes) => {
	return indexes.reduce((result, index) => {
		return [...result, ...(index.SecIndxKey || []).map((key, i) => {
			return Object.assign({}, index, {
				name: i > 0 ? index.name + '_' + i : index.name,
				SecIndxKey: key
			});
		})];
	}, []);
};

const serializeOptions = (options) => {
	return Object.keys(options).map(option => `'${option}': '${options[option]}'`);
};

const getCustomOptions = (options, isSASI) => {
	let result = {};

	if (!options) {
		return result;
	}

	if (options.case_sensitive) {
		result.case_sensitive = 'true';
	}

	if (options.normalize) {
		result.normalize = 'true';
	}

	if (options.ascii && !isSASI) {
		result.ascii = 'true';
	}

	if(!isSASI){
		return result;
	}


	if (options.analyzed) {
		result.analyzed = 'true';
	}

	if (options.isLiteral) {
		result.is_literal = 'true';
	}

	if (options.tokenizationEnableStemming) {
		result.tokenization_enable_stemming = 'true';
	}

	if (options.tokenizationNormalizeLowercase) {
		result.tokenization_normalize_lowercase = 'true';
	}

	if (options.tokenizationNormalizeUppercase) {
		result.tokenization_normalize_uppercase = 'true';
	}

	if (options.normalizeLowercase) {
		result.normalize_lowercase = 'true';
	}

	if (options.normalizeUppercase) {
		result.normalize_uppercase = 'true';
	}

	if (options.tokenizationLocale) {
		result.tokenization_locale = `${options.tokenizationLocale}`;
	}

	if (options.tokenizationSkipStopWords) {
		result.tokenization_skip_stop_words = `${options.tokenizationSkipStopWords}`;
	}

	if (options.mode) {
		result.mode = `${options.mode}`;
	}

	if (options.analyzerClass) {
		result.analyzer_class = `${options.analyzerClass}`;
	}

	if (options.maxCompactionFlushMemoryInMb) {
		result.max_compaction_flush_memory_in_mb = `${options.maxCompactionFlushMemoryInMb}`;
	}

	return result;
};

const getSearchIndex = ({ tableName, columns, index, isActivated, ifNotExist }) => {
	const columnsStatement = getSearchIndexColumnStatements(getSearchIndexColumns(columns), isActivated);
	const profiles = index.profiles.length ? `\n${tab(`AND PROFILES ${index.profiles.join(', ')}`)}` : '';
	const indexConfig = getSearchIndexConfig(index.config);
	const config = indexConfig ? `\n${tab(`AND CONFIG ${indexConfig}`)}` : '';
	const indexOptions = getSearchIndexOptions(index.options);
	const options = indexOptions ? `\n${tab(`AND OPTIONS ${indexOptions}`)}` : '';
	return `CREATE SEARCH INDEX ${ifNotExist ? `IF NOT EXISTS `:``}ON ${tableName}\n` + 
		`${tab(`WITH COLUMNS\n${tab(columnsStatement)}`)}` + 
		profiles + config + options +
		';';
};

const getSearchIndexColumns = columns => {
	return columns.map(column => {
		const options = [];

		if (column.copyField) {
			options.push(`copyField: true`);
		}

		if (column.docValues) {
			options.push(`docValues: true`);
		}

		if (column.excluded) {
			options.push(`excluded: true`);
		}

		if (!column.indexed) {
			options.push(`indexed: false`);
		}

		if (column.lowerCase) {
			options.push(`lowerCase: true`);
		}

		return {
			statement: `${column.name}${options.length ? ` {${options.join(', ')}}` : ''}`,
			isActivated: column.isActivated,
		};
	});
};

const getSearchIndexColumnStatements = (columns, isParentActivated) => {
	const commentedColumns = !isParentActivated ? [] : columns.filter(column => !column.isActivated);
	const othersColumns = !isParentActivated ? columns : columns.filter(column => column.isActivated);
	const commented = commentedColumns.length ? commentedColumns.map(({ statement }) => statement).join(',\n').split('\n').map(inlineComment).join('\n') : '';
	const others = othersColumns.map(({ statement }) => statement).join(',\n');

	if (commented && others) {
		return commented + ',\n' + others;
	}

	if (commented) {
		return commented;
	}

	return others;
};

const getSearchIndexConfig = (config = {}) => {
	const result = [];

	if (config.autoCommitTime && config.autoCommitTime !== 10000) {
		result.push(`autoCommitTime: ${config.autoCommitTime}`);
	}

	if (config.defaultQueryField) {
		result.push(`defaultQueryField: '${config.defaultQueryField}'`);
	}

	if (config.directoryFactory) {
		result.push(`directoryFactory: '${config.directoryFactory}'`);
	}

	if (config.filterCacheLowWaterMark && config.filterCacheLowWaterMark !== 1024) {
		result.push(`filterCacheLowWaterMark: ${config.filterCacheLowWaterMark}`);
	}

	if (config.filterCacheHighWaterMark && config.filterCacheHighWaterMark !== 2048) {
		result.push(`filterCacheHighWaterMark: ${config.filterCacheHighWaterMark}`);
	}

	if (config.directoryFactoryClass) {
		result.push(`directoryFactoryClass: '${config.directoryFactoryClass}'`);
	}

	if (config.mergeMaxThreadCount && config.mergeMaxMergeCount) {
		result.push(`mergeMaxThreadCount: ${config.mergeMaxThreadCount}`);
		result.push(`mergeMaxMergeCount: ${config.mergeMaxMergeCount}`);
	}

	if (config.ramBufferSize && config.ramBufferSize !== 512) {
		result.push(`ramBufferSize: ${config.ramBufferSize}`);
	}

	if (config.realtime) {
		result.push(`realtime: true`);
	}

	if (!result.length) {
		return '';
	}

	return `{\n${tab(result.join(',\n'))}\n}`;
};

const getSearchIndexOptions = (options = {}) => {
	const result = [];

	if (options.recovery) {
		result.push(`recovery: true`);
	}

	if (!options.reindex) {
		result.push(`reindex: false`);
	}

	if (options.lenient) {
		result.push(`lenient: true`);
	}

	if (!result.length) {
		return '';
	}

	return `{${result.join(', ')}}`;
};

module.exports = {
	getIndexes
};
