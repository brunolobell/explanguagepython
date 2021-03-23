# Generated from Exp.g4 by ANTLR 4.9.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


symbol_table = []


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("F\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3\6\3\30\n\3\r\3\16\3\31")
        buf.write("\3\3\3\3\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5")
        buf.write("\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\63\n\7\3")
        buf.write("\b\3\b\3\b\3\b\3\b\5\b:\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\3\t\5\tD\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\5")
        buf.write("\6\3\2\7\t\2C\2\22\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b")
        buf.write("!\3\2\2\2\n(\3\2\2\2\f-\3\2\2\2\16\64\3\2\2\2\20C\3\2")
        buf.write("\2\2\22\23\b\2\1\2\23\24\5\4\3\2\24\3\3\2\2\2\25\27\b")
        buf.write("\3\1\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27")
        buf.write("\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\b\3\1\2\34")
        buf.write("\5\3\2\2\2\35 \5\b\5\2\36 \5\n\6\2\37\35\3\2\2\2\37\36")
        buf.write("\3\2\2\2 \7\3\2\2\2!\"\7\r\2\2\"#\7\n\2\2#$\b\5\1\2$%")
        buf.write("\5\f\7\2%&\7\13\2\2&\'\b\5\1\2\'\t\3\2\2\2()\7\17\2\2")
        buf.write(")*\7\f\2\2*+\5\f\7\2+,\b\6\1\2,\13\3\2\2\2-\62\5\16\b")
        buf.write("\2./\t\2\2\2/\60\5\f\7\2\60\61\b\7\1\2\61\63\3\2\2\2\62")
        buf.write(".\3\2\2\2\62\63\3\2\2\2\63\r\3\2\2\2\649\5\20\t\2\65\66")
        buf.write("\t\3\2\2\66\67\5\16\b\2\678\b\b\1\28:\3\2\2\29\65\3\2")
        buf.write("\2\29:\3\2\2\2:\17\3\2\2\2;<\7\16\2\2<D\b\t\1\2=>\7\n")
        buf.write("\2\2>?\5\f\7\2?@\7\13\2\2@D\3\2\2\2AB\7\17\2\2BD\b\t\1")
        buf.write("\2C;\3\2\2\2C=\3\2\2\2CA\3\2\2\2D\21\3\2\2\2\7\31\37\62")
        buf.write("9C")
        return buf.getvalue()


class ExpParser ( Parser ):

    grammarFileName = "Exp.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "'+'", "'-'", 
                     "'*'", "'/'", "'%'", "'('", "')'", "'='", "'print'" ]

    symbolicNames = [ "<INVALID>", "COMMENT", "SPACE", "PLUS", "MINUS", 
                      "TIMES", "OVER", "REM", "OP_PAR", "CL_PAR", "ATTRIB", 
                      "PRINT", "NUMBER", "NAME" ]

    RULE_program = 0
    RULE_main = 1
    RULE_statement = 2
    RULE_st_print = 3
    RULE_st_attrib = 4
    RULE_expression = 5
    RULE_term = 6
    RULE_factor = 7

    ruleNames =  [ "program", "main", "statement", "st_print", "st_attrib", 
                   "expression", "term", "factor" ]

    EOF = Token.EOF
    COMMENT=1
    SPACE=2
    PLUS=3
    MINUS=4
    TIMES=5
    OVER=6
    REM=7
    OP_PAR=8
    CL_PAR=9
    ATTRIB=10
    PRINT=11
    NUMBER=12
    NAME=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def main(self):
            return self.getTypedRuleContext(ExpParser.MainContext,0)


        def getRuleIndex(self):
            return ExpParser.RULE_program




    def program(self):

        localctx = ExpParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)

            print('.source Test.src')
            print('.class  public Test')
            print('.super  java/lang/Object\n')
            print('.method public <init>()V')
            print('    aload_0')
            print('    invokenonvirtual java/lang/Object/<init>()V')
            print('    return')
            print('.end method\n')
                
            self.state = 17
            self.main()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MainContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExpParser.StatementContext)
            else:
                return self.getTypedRuleContext(ExpParser.StatementContext,i)


        def getRuleIndex(self):
            return ExpParser.RULE_main




    def main(self):

        localctx = ExpParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_main)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)

            print('.method public static main([Ljava/lang/String;)V\n')
            symbol_table.append('args')
                
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self.statement()
                self.state = 23 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ExpParser.PRINT or _la==ExpParser.NAME):
                    break


            print('    return')
            print('.limit stack 10')
            print('.limit locals', len(symbol_table))
            print('.end method')
            print('\n; symbol_table:', symbol_table)
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def st_print(self):
            return self.getTypedRuleContext(ExpParser.St_printContext,0)


        def st_attrib(self):
            return self.getTypedRuleContext(ExpParser.St_attribContext,0)


        def getRuleIndex(self):
            return ExpParser.RULE_statement




    def statement(self):

        localctx = ExpParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.state = 29
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ExpParser.PRINT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 27
                self.st_print()
                pass
            elif token in [ExpParser.NAME]:
                self.enterOuterAlt(localctx, 2)
                self.state = 28
                self.st_attrib()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_printContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRINT(self):
            return self.getToken(ExpParser.PRINT, 0)

        def OP_PAR(self):
            return self.getToken(ExpParser.OP_PAR, 0)

        def expression(self):
            return self.getTypedRuleContext(ExpParser.ExpressionContext,0)


        def CL_PAR(self):
            return self.getToken(ExpParser.CL_PAR, 0)

        def getRuleIndex(self):
            return ExpParser.RULE_st_print




    def st_print(self):

        localctx = ExpParser.St_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_st_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self.match(ExpParser.PRINT)
            self.state = 32
            self.match(ExpParser.OP_PAR)

            print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
                
            self.state = 34
            self.expression()
            self.state = 35
            self.match(ExpParser.CL_PAR)

            print('    invokevirtual java/io/PrintStream/println(I)V\n')
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_attribContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NAME = None # Token

        def NAME(self):
            return self.getToken(ExpParser.NAME, 0)

        def ATTRIB(self):
            return self.getToken(ExpParser.ATTRIB, 0)

        def expression(self):
            return self.getTypedRuleContext(ExpParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ExpParser.RULE_st_attrib




    def st_attrib(self):

        localctx = ExpParser.St_attribContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_st_attrib)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            localctx._NAME = self.match(ExpParser.NAME)
            self.state = 39
            self.match(ExpParser.ATTRIB)
            self.state = 40
            self.expression()

            # testar se a variável existe
            if (None if localctx._NAME is None else localctx._NAME.text) not in symbol_table:
                symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))

            # encontrar o index de (None if localctx._NAME is None else localctx._NAME.text) e gerar bytecode
            index = symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))
            print('    istore', index, '\n')
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def term(self):
            return self.getTypedRuleContext(ExpParser.TermContext,0)


        def expression(self):
            return self.getTypedRuleContext(ExpParser.ExpressionContext,0)


        def PLUS(self):
            return self.getToken(ExpParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(ExpParser.MINUS, 0)

        def getRuleIndex(self):
            return ExpParser.RULE_expression




    def expression(self):

        localctx = ExpParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.term()
            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==ExpParser.PLUS or _la==ExpParser.MINUS:
                self.state = 44
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==ExpParser.PLUS or _la==ExpParser.MINUS):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 45
                self.expression()

                if (0 if localctx.op is None else localctx.op.type) == ExpParser.PLUS : print('    iadd')
                if (0 if localctx.op is None else localctx.op.type) == ExpParser.MINUS: print('    isub')
                    


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def factor(self):
            return self.getTypedRuleContext(ExpParser.FactorContext,0)


        def term(self):
            return self.getTypedRuleContext(ExpParser.TermContext,0)


        def TIMES(self):
            return self.getToken(ExpParser.TIMES, 0)

        def OVER(self):
            return self.getToken(ExpParser.OVER, 0)

        def REM(self):
            return self.getToken(ExpParser.REM, 0)

        def getRuleIndex(self):
            return ExpParser.RULE_term




    def term(self):

        localctx = ExpParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.factor()
            self.state = 55
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << ExpParser.TIMES) | (1 << ExpParser.OVER) | (1 << ExpParser.REM))) != 0):
                self.state = 51
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << ExpParser.TIMES) | (1 << ExpParser.OVER) | (1 << ExpParser.REM))) != 0)):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 52
                self.term()

                if (0 if localctx.op is None else localctx.op.type) == ExpParser.TIMES : print('    imul')
                if (0 if localctx.op is None else localctx.op.type) == ExpParser.OVER  : print('    idiv')
                if (0 if localctx.op is None else localctx.op.type) == ExpParser.REM   : print('    irem')
                    


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NUMBER = None # Token
            self._NAME = None # Token

        def NUMBER(self):
            return self.getToken(ExpParser.NUMBER, 0)

        def OP_PAR(self):
            return self.getToken(ExpParser.OP_PAR, 0)

        def expression(self):
            return self.getTypedRuleContext(ExpParser.ExpressionContext,0)


        def CL_PAR(self):
            return self.getToken(ExpParser.CL_PAR, 0)

        def NAME(self):
            return self.getToken(ExpParser.NAME, 0)

        def getRuleIndex(self):
            return ExpParser.RULE_factor




    def factor(self):

        localctx = ExpParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_factor)
        try:
            self.state = 65
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ExpParser.NUMBER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 57
                localctx._NUMBER = self.match(ExpParser.NUMBER)

                print('    ldc ' + (None if localctx._NUMBER is None else localctx._NUMBER.text))
                # symbol_table.append((None if localctx._NUMBER is None else localctx._NUMBER.text))
                    
                pass
            elif token in [ExpParser.OP_PAR]:
                self.enterOuterAlt(localctx, 2)
                self.state = 59
                self.match(ExpParser.OP_PAR)
                self.state = 60
                self.expression()
                self.state = 61
                self.match(ExpParser.CL_PAR)
                pass
            elif token in [ExpParser.NAME]:
                self.enterOuterAlt(localctx, 3)
                self.state = 63
                localctx._NAME = self.match(ExpParser.NAME)

                index = symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))
                print('    iload', index)
                    
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





