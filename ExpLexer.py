# Generated from Exp.g4 by ANTLR 4.9.1
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17")
        buf.write("M\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3\2\3\3\6\3")
        buf.write("(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3")
        buf.write("\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3")
        buf.write("\f\3\f\3\r\6\rE\n\r\r\r\16\rF\3\16\6\16J\n\16\r\16\16")
        buf.write("\16K\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25")
        buf.write("\f\27\r\31\16\33\17\3\2\4\3\2\f\f\5\2\13\f\17\17\"\"\2")
        buf.write("P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13")
        buf.write("\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3")
        buf.write("\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2")
        buf.write("\2\2\3\35\3\2\2\2\5\'\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13")
        buf.write("\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\23")
        buf.write("9\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31D\3\2\2\2\33I\3\2")
        buf.write("\2\2\35!\7%\2\2\36 \n\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37")
        buf.write("\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\b\2\2\2%\4")
        buf.write("\3\2\2\2&(\t\3\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3")
        buf.write("\2\2\2*+\3\2\2\2+,\b\3\2\2,\6\3\2\2\2-.\7-\2\2.\b\3\2")
        buf.write("\2\2/\60\7/\2\2\60\n\3\2\2\2\61\62\7,\2\2\62\f\3\2\2\2")
        buf.write("\63\64\7\61\2\2\64\16\3\2\2\2\65\66\7\'\2\2\66\20\3\2")
        buf.write("\2\2\678\7*\2\28\22\3\2\2\29:\7+\2\2:\24\3\2\2\2;<\7?")
        buf.write("\2\2<\26\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7k\2\2@A\7p\2\2A")
        buf.write("B\7v\2\2B\30\3\2\2\2CE\4\62;\2DC\3\2\2\2EF\3\2\2\2FD\3")
        buf.write("\2\2\2FG\3\2\2\2G\32\3\2\2\2HJ\4c|\2IH\3\2\2\2JK\3\2\2")
        buf.write("\2KI\3\2\2\2KL\3\2\2\2L\34\3\2\2\2\7\2!)FK\3\b\2\2")
        return buf.getvalue()


class ExpLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    COMMENT = 1
    SPACE = 2
    PLUS = 3
    MINUS = 4
    TIMES = 5
    OVER = 6
    REM = 7
    OP_PAR = 8
    CL_PAR = 9
    ATTRIB = 10
    PRINT = 11
    NUMBER = 12
    NAME = 13

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "'print'" ]

    symbolicNames = [ "<INVALID>",
            "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", 
            "OP_PAR", "CL_PAR", "ATTRIB", "PRINT", "NUMBER", "NAME" ]

    ruleNames = [ "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", 
                  "REM", "OP_PAR", "CL_PAR", "ATTRIB", "PRINT", "NUMBER", 
                  "NAME" ]

    grammarFileName = "Exp.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


