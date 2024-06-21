#!/bin/bash

antlr4 -Dlanguage=JavaScript -lib grammars -o parser -visitor -Xexact-output-dir grammars/CqlLexer.g4
antlr4 -Dlanguage=JavaScript -lib grammars -o parser -visitor -Xexact-output-dir grammars/CqlParser.g4
