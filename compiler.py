import sys
sys.path.insert(0, './build')
from antlr4 import *
from ExpLexer  import ExpLexer
from ExpParser import ExpParser

input_stream = InputStream(sys.stdin.read())
lexer = ExpLexer(input_stream)
tokens = CommonTokenStream(lexer)
parser = ExpParser(tokens)

parser.program()

