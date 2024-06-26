const ReservedWords = Object.freeze({
	ADD: 'ADD',
	AGGREGATE: 'AGGREGATE',
	ALLOW: 'ALLOW',
	ALTER: 'ALTER',
	AND: 'AND',
	ANY: 'ANY',
	APPLY: 'APPLY',
	ASC: 'ASC',
	AUTHORIZE: 'AUTHORIZE',
	BATCH: 'BATCH',
	BEGIN: 'BEGIN',
	BY: 'BY',
	COLUMNFAMILY: 'COLUMNFAMILY',
	CREATE: 'CREATE',
	DELETE: 'DELETE',
	DESC: 'DESC',
	DROP: 'DROP',
	EACH_QUORUM: 'EACH_QUORUM',
	ENTRIES: 'ENTRIES',
	FROM: 'FROM',
	FULL: 'FULL',
	GRANT: 'GRANT',
	IF: 'IF',
	IN: 'IN',
	INDEX: 'INDEX',
	INET: 'INET',
	INFINITY: 'INFINITY',
	INSERT: 'INSERT',
	INTO: 'INTO',
	KEYSPACE: 'KEYSPACE',
	KEYSPACES: 'KEYSPACES',
	LIMIT: 'LIMIT',
	LOCAL_ONE: 'LOCAL_ONE',
	LOCAL_QUORUM: 'LOCAL_QUORUM',
	MATERIALIZED: 'MATERIALIZED',
	MODIFY: 'MODIFY',
	NAN: 'NAN',
	NORECURSIVE: 'NORECURSIVE',
	NOT: 'NOT',
	OF: 'OF',
	ON: 'ON',
	ONE: 'ONE',
	ORDER: 'ORDER',
	PARTITION: 'PARTITION',
	PASSWORD: 'PASSWORD',
	PER: 'PER',
	PRIMARY: 'PRIMARY',
	QUORUM: 'QUORUM',
	RENAME: 'RENAME',
	REVOKE: 'REVOKE',
	SCHEMA: 'SCHEMA',
	SELECT: 'SELECT',
	SET: 'SET',
	TABLE: 'TABLE',
	TIME: 'TIME',
	THREE: 'THREE',
	TO: 'TO',
	TOKEN: 'TOKEN',
	TRUNCATE: 'TRUNCATE',
	TWO: 'TWO',
	UNLOGGED: 'UNLOGGED',
	UPDATE: 'UPDATE',
	USE: 'USE',
	USING: 'USING',
	VIEW: 'VIEW',
	WHERE: 'WHERE',
	WITH: 'WITH',
});

const ReservedWordsAsArray = Object.values(ReservedWords);

module.exports = {
	ReservedWordsAsArray,
};
