'use strict'

const TAB_SIZE = 2;

module.exports = {
	tab(text, count = 1) {
		const space = ' '.repeat(count * TAB_SIZE);

		return text.split('\n').map(string => space + string).join('\n');
	}
};
