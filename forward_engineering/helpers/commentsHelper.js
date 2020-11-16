const LINE = 'LINE';
const INLINE = 'INLINE';
const MULTILINE = 'MULTILINE';

const insertBeforeEachLine = (statement, insertValue = '-- ') =>
	statement
		.split('\n')
		.map((line) => line && `${insertValue}${line}`)
		.join('\n');

const multiLineComment = (statement) => {
	return `/*\n${insertBeforeEachLine(statement, '  ')}\n*/`;
};

const inlineComment = (statement) => {
	return `/* ${statement} */`;
};

const commentDeactivatedStatement = (
	statement,
	isActivated = true,
	isParentActivated = true,
	commentType = MULTILINE
) => {
	if (isActivated || !isParentActivated || !statement) {
		return statement;
	}

	switch (commentType) {
		case MULTILINE:
			return multiLineComment(statement);
		case INLINE:
			return inlineComment(statement);
		case LINE:
			return insertBeforeEachLine(statement);
		default:
			return statement;
	}
};

module.exports = {
	commentDeactivatedStatement,
	inlineComment,
	LINE,
	INLINE,
	MULTILINE,
};