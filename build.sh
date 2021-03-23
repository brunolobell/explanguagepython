#!/bin/bash

if java -jar antlr-4.9.1-complete.jar -Dlanguage=Python3 -no-listener Exp.g4; then
    echo "OK"
else
    rm -f Exp*.py Exp.tokens
fi

