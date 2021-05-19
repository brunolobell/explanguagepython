// Generated from /mnt/c/Users/bruno/Documents/FURG/compiladores/Python Compiler Jasmin/Exp.g4 by ANTLR 4.8

import sys
symbol_table = []
variables_used = []
while_table = []
types = {}
stack_cur = 0
stack_max = 0
if_count = 0
elif_count = 0
while_count = 0
def emit(bytecode, delta, End='\n'):
    global stack_cur
    global stack_max
    print(bytecode, end=End)
    stack_cur += delta
    if stack_cur > stack_max:
        stack_max = stack_cur

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SPACE=2, PLUS=3, MINUS=4, TIMES=5, OVER=6, REM=7, OP_PAR=8, 
		CL_PAR=9, ATTRIB=10, COMMA=11, OP_CUR=12, CL_CUR=13, OP_BRA=14, CL_BRA=15, 
		EQ=16, NE=17, GT=18, GE=19, LT=20, LE=21, DOT=22, PRINT=23, READ_INT=24, 
		READ_STR=25, IF=26, ELSE=27, ELIF=28, WHILE=29, BREAK=30, CONTINUE=31, 
		LENGTH=32, PUSH=33, NUMBER=34, STRING=35, NAME=36;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_print = 3, 
		RULE_st_attrib = 4, RULE_st_array_new = 5, RULE_st_array_push = 6, RULE_st_array_attrib = 7, 
		RULE_st_break = 8, RULE_st_continue = 9, RULE_st_while = 10, RULE_st_if = 11, 
		RULE_comparison = 12, RULE_expression = 13, RULE_term = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "st_print", "st_attrib", "st_array_new", 
			"st_array_push", "st_array_attrib", "st_break", "st_continue", "st_while", 
			"st_if", "comparison", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "'{'", "'}'", "'['", "']'", "'=='", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'.'", "'print'", "'read_int'", "'read_str'", "'if'", "'else'", 
			"'elif'", "'while'", "'break'", "'continue'", "'length'", "'push'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "OP_BRA", "CL_BRA", 
			"EQ", "NE", "GT", "GE", "LT", "LE", "DOT", "PRINT", "READ_INT", "READ_STR", 
			"IF", "ELSE", "ELIF", "WHILE", "BREAK", "CONTINUE", "LENGTH", "PUSH", 
			"NUMBER", "STRING", "NAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Exp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{

			print('.source Test.src')
			print('.class  public Test')
			print('.super  java/lang/Object\n')
			print('.method public <init>()V')
			print('    aload_0')
			print('    invokenonvirtual java/lang/Object/<init>()V')
			print('    return')
			print('.end method\n')
			    
			setState(33);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			print('.method public static main([Ljava/lang/String;)V\n')
			    
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );

			print('    return')
			print('    .limit stack ' + str(stack_max))
			if len(symbol_table) > 0:
			    print('    .limit locals', len(symbol_table))
			print('.end method')
			print('\n; symbol_table:', symbol_table)
			if False in variables_used:
			    var_index = variables_used.index(False)
			    print("Variable '" + symbol_table[var_index] + "' declareted but not used", file=sys.stderr)
			    sys.exit(1)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_breakContext st_break() {
			return getRuleContext(St_breakContext.class,0);
		}
		public St_continueContext st_continue() {
			return getRuleContext(St_continueContext.class,0);
		}
		public St_array_newContext st_array_new() {
			return getRuleContext(St_array_newContext.class,0);
		}
		public St_array_pushContext st_array_push() {
			return getRuleContext(St_array_pushContext.class,0);
		}
		public St_array_attribContext st_array_attrib() {
			return getRuleContext(St_array_attribContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				st_break();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				st_continue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				st_array_new();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				st_array_push();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(51);
				st_array_attrib();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_printContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PRINT() { return getToken(ExpParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
		}
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PRINT);
			setState(55);
			match(OP_PAR);

			emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
			    
			setState(57);
			((St_printContext)_localctx).e1 = expression();

			if ((St_printContext)_localctx).e1.type == 'i':
			    emit('    invokevirtual java/io/PrintStream/println(I)V\n', -2)
			elif ((St_printContext)_localctx).e1.type == 's':
			    emit('    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n', -2)
			elif ((St_printContext)_localctx).e1.type == 'a':
			    emit('    invokevirtual Array/string()Ljava/lang/String;\n', 0)
			    emit('    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V', -2)
			else:
			    emit('    Error in Compiler', -2)
			    
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);

				emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
				    
				setState(61);
				((St_printContext)_localctx).e2 = expression();

				if ((St_printContext)_localctx).e2.type == 'i':
				    emit('    invokevirtual java/io/PrintStream/println(I)V\n', -2)
				elif ((St_printContext)_localctx).e2.type == 's':
				    emit('    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n', -2)
				elif ((St_printContext)_localctx).e2.type == 'a':
				    emit('invokevirtual Array/string()Ljava/lang/String;\n', 0)
				    emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
				else:
				    print('ERROR TYPE', file=sys.stderr)
				    
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(CL_PAR);

			# print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
			# print('    invokevirtual java/io/PrintStream/println()V\n')
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_attribContext extends ParserRuleContext {
		public  type;
		public Token NAME;
		public ExpressionContext ex;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(73);
			match(ATTRIB);
			setState(74);
			((St_attribContext)_localctx).ex = expression();

			# testar se a variável existe
			if (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) not in symbol_table:
			    symbol_table.append((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))
			    variables_used.append(False)
			    types[(((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)] = ((St_attribContext)_localctx).ex.type

			# encontrar o index de (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) e gerar bytecode
			index = symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))
			my_type = types[(((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)]
			if my_type != ((St_attribContext)_localctx).ex.type:
			    if my_type == 'i':
			        print("Variable '{}' must receive an integer".format((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)), file=sys.stderr)
			        sys.exit(1)
			    elif my_type == 's':
			        print("Variable '{}' must receive a string".format((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)), file=sys.stderr)
			        sys.exit(1)
			    elif my_type == 'a':
			        print("Variable '{}' must receive a array".format((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)), file=sys.stderr)
			        sys.exit(1)
			_localctx.type = my_type
			if my_type == 'i':
			    emit('    istore ' + str(index) + '\n', 1)
			elif my_type == 's' or my_type == 'a':
			    emit('    astore ' + str(index) + '\n', 1)
			else:
			    print("Error", file=sys.stderr)
			    sys.exit(1)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_newContext extends ParserRuleContext {
		public  type;
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public St_array_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_new; }
	}

	public final St_array_newContext st_array_new() throws RecognitionException {
		St_array_newContext _localctx = new St_array_newContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_array_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((St_array_newContext)_localctx).NAME = match(NAME);
			setState(78);
			match(ATTRIB);
			setState(79);
			match(OP_BRA);
			setState(80);
			match(CL_BRA);

			if (((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null) not in symbol_table:
			    symbol_table.append((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null))
			    variables_used.append(False)
			    types[(((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null)] = 'a'
			index = symbol_table.index((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null))
			_localctx.type = types[(((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null)]
			emit('    new Array', +1)
			emit('    dup', +1)
			emit('    invokespecial Array/<init>()V', -1)
			emit('    astore ' + str(index) + '\n', 1)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_pushContext extends ParserRuleContext {
		public  type;
		public Token NAME;
		public ExpressionContext ex;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(ExpParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(ExpParser.PUSH, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_array_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_push; }
	}

	public final St_array_pushContext st_array_push() throws RecognitionException {
		St_array_pushContext _localctx = new St_array_pushContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_array_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((St_array_pushContext)_localctx).NAME = match(NAME);
			setState(84);
			match(DOT);
			setState(85);
			match(PUSH);
			setState(86);
			match(OP_PAR);

			index = symbol_table.index((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null))
			my_type = types[(((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null)]
			if(my_type == 'a'):
			    emit('    aload ' + str(index), 1)
			else:
			    print("Can't push into non array", file=sys.stderr)
			    sys.exit(1)
			    
			setState(88);
			((St_array_pushContext)_localctx).ex = expression();
			setState(89);
			match(CL_PAR);

			if(((St_array_pushContext)_localctx).ex.type != 'i'):
			    print("Element must be integer", file=sys.stderr)
			    sys.exit(1)
			emit('    invokevirtual Array/push(I)V\n', -2)
			_localctx.type = 'i'
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_array_attribContext extends ParserRuleContext {
		public  type;
		public Token NAME;
		public ExpressionContext ex1;
		public ExpressionContext ex2;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public St_array_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_attrib; }
	}

	public final St_array_attribContext st_array_attrib() throws RecognitionException {
		St_array_attribContext _localctx = new St_array_attribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_array_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((St_array_attribContext)_localctx).NAME = match(NAME);
			setState(93);
			match(OP_BRA);

			index = symbol_table.index((((St_array_attribContext)_localctx).NAME!=null?((St_array_attribContext)_localctx).NAME.getText():null))
			my_type = types[(((St_array_attribContext)_localctx).NAME!=null?((St_array_attribContext)_localctx).NAME.getText():null)]
			if my_type != 'a':
			    print("{} not is an array".format((((St_array_attribContext)_localctx).NAME!=null?((St_array_attribContext)_localctx).NAME.getText():null)), file=sys.stderr)
			    sys.exit(1)
			emit('    aload ' + str(index) + '\n', 1)
			    
			setState(95);
			((St_array_attribContext)_localctx).ex1 = expression();
			setState(96);
			match(CL_BRA);
			setState(97);
			match(ATTRIB);
			setState(98);
			((St_array_attribContext)_localctx).ex2 = expression();

			if ((St_array_attribContext)_localctx).ex1.type != 'i' or ((St_array_attribContext)_localctx).ex2.type != 'i':
			    print("Two expressions must be integer", file=sys.stderr)
			    sys.exit(1)
			emit('    invokevirtual Array/set(II)V\n', -3)
			_localctx.type = my_type
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(ExpParser.BREAK, 0); }
		public St_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_break; }
	}

	public final St_breakContext st_break() throws RecognitionException {
		St_breakContext _localctx = new St_breakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(BREAK);

			global while_count
			while_local = while_count - 1
			if len(while_table) == 0:
			    print('Break without while!', file=sys.stderr)
			    sys.exit(1)
			print('    goto END_WHILE_' + str(while_local))
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_continueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(ExpParser.CONTINUE, 0); }
		public St_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_continue; }
	}

	public final St_continueContext st_continue() throws RecognitionException {
		St_continueContext _localctx = new St_continueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CONTINUE);

			global while_count
			while_local = while_count - 1
			if len(while_table) == 0:
			    print('Continue without while!', file=sys.stderr)
			    sys.exit(1)
			print('    goto BEGIN_WHILE_' + str(while_local))
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExpParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode OP_CUR() { return getToken(ExpParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(ExpParser.CL_CUR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHILE);

			global while_count
			while_local = while_count
			while_count += 1
			while_table.append(1)
			print('BEGIN_WHILE_' + str(while_local) + ':')
			    
			setState(109);
			comparison();

			print('END_WHILE_' + str(while_local))
			    
			setState(111);
			match(OP_CUR);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(117);
			match(CL_CUR);

			print('    goto BEGIN_WHILE_' + str(while_local))
			print('END_WHILE_' + str(while_local) + ':')
			while_table.pop()
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExpParser.IF, 0); }
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> OP_CUR() { return getTokens(ExpParser.OP_CUR); }
		public TerminalNode OP_CUR(int i) {
			return getToken(ExpParser.OP_CUR, i);
		}
		public List<TerminalNode> CL_CUR() { return getTokens(ExpParser.CL_CUR); }
		public TerminalNode CL_CUR(int i) {
			return getToken(ExpParser.CL_CUR, i);
		}
		public TerminalNode ELSE() { return getToken(ExpParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(ExpParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(ExpParser.ELIF, i);
		}
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			setState(121);
			comparison();

			global if_count
			global elif_count
			if_local = if_count
			if_count += 1
			elif_local = -1
			print('NOT_IF_' + str(if_local))
			    
			setState(123);
			match(OP_CUR);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
			setState(129);
			match(CL_CUR);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{

				print('    goto NOT_ELIF_' + str(elif_count))
				if elif_local != -1: 
				    print('NOT_ELIF_' + str(elif_local) + ':')
				else:
				    print('NOT_IF_' + str(if_local) + ':')
				elif_local = elif_count
				elif_count += 1
				    
				setState(131);
				match(ELIF);
				setState(132);
				comparison();

				print('NOT_ELIF_' + str(elif_local))
				    
				setState(134);
				match(OP_CUR);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					statement();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
				setState(140);
				match(CL_CUR);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{

				print('    goto END_ELSE_' + str(if_local)) 
				if elif_local != -1: 
				    print('NOT_ELIF_' + str(elif_local) + ':')
				else: 
				    print('NOT_IF_' + str(if_local) + ':')
				    
				setState(148);
				match(ELSE);
				setState(149);
				match(OP_CUR);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					statement();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << NAME))) != 0) );
				setState(155);
				match(CL_CUR);

				print('END_ELSE_' + str(if_local) + ':')
				    
				}
				break;
			case EOF:
			case CL_CUR:
			case PRINT:
			case IF:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case NAME:
				{
				 
				if elif_local != -1: 
				    print('NOT_ELIF_' + str(elif_local) + ':')
				else: 
				    print('NOT_IF_' + str(if_local) + ':')
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext ex1;
		public Token op;
		public ExpressionContext ex2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ExpParser.NE, 0); }
		public TerminalNode GT() { return getToken(ExpParser.GT, 0); }
		public TerminalNode GE() { return getToken(ExpParser.GE, 0); }
		public TerminalNode LT() { return getToken(ExpParser.LT, 0); }
		public TerminalNode LE() { return getToken(ExpParser.LE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((ComparisonContext)_localctx).ex1 = expression();
			setState(162);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			((ComparisonContext)_localctx).ex2 = expression();

			if ((ComparisonContext)_localctx).ex1.type != ((ComparisonContext)_localctx).ex2.type:
			    print("cannot mix types", file=sys.stderr)
			    sys.exit(1)
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.EQ : emit('   if_icmpne', -2, " ")
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.NE : emit('   if_icmpeq', -2, " ")
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.GT : emit('   if_icmple', -2, " ")
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.GE : emit('   if_icmplt', -2, " ")
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.LT : emit('   if_icmpge', -2, " ")
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.LE : emit('   if_icmpgt', -2, " ")
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public  type;
		public TermContext t1;
		public Token op;
		public ExpressionContext ex2;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((ExpressionContext)_localctx).t1 = term();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(167);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				((ExpressionContext)_localctx).ex2 = expression();

				if ((ExpressionContext)_localctx).t1.type != ((ExpressionContext)_localctx).ex2.type:
				    print("cannot mix types", file=sys.stderr)
				    sys.exit(1)
				if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == ExpParser.PLUS : emit('    iadd', -1)
				if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == ExpParser.MINUS: emit('    isub', -1)
				    
				}
			}


			_localctx.type = ((ExpressionContext)_localctx).t1.type
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public  type;
		public FactorContext f1;
		public Token op;
		public TermContext t1;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ExpParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ExpParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(ExpParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(ExpParser.OVER, i);
		}
		public List<TerminalNode> REM() { return getTokens(ExpParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(ExpParser.REM, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((TermContext)_localctx).f1 = factor();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					((TermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) ) {
						((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(177);
					((TermContext)_localctx).t1 = term();

					if ((TermContext)_localctx).t1.type != ((TermContext)_localctx).f1.type:
					    print("cannot mix types", file=sys.stderr)
					    sys.exit(1)
					if ((TermContext)_localctx).t1.type != 'i':
					    print("Must be a integer", file=sys.stderr)
					    sys.exit(1)
					if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == ExpParser.TIMES : emit('    imul', -1)
					if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == ExpParser.OVER  : emit('    idiv', -1)
					if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == ExpParser.REM   : emit('    irem', -1)
					    
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}

			_localctx.type = ((TermContext)_localctx).f1.type
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public  type;
		public Token NUMBER;
		public Token STRING;
		public ExpressionContext expression;
		public Token NAME;
		public ExpressionContext ex;
		public TerminalNode NUMBER() { return getToken(ExpParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExpParser.STRING, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode READ_INT() { return getToken(ExpParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(ExpParser.READ_STR, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public TerminalNode DOT() { return getToken(ExpParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(ExpParser.LENGTH, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				((FactorContext)_localctx).NUMBER = match(NUMBER);

				emit('    ldc ' + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), 1)
				_localctx.type = 'i'
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((FactorContext)_localctx).STRING = match(STRING);

				emit('    ldc ' + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), 1)
				_localctx.type = 's'
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(OP_PAR);
				setState(192);
				((FactorContext)_localctx).expression = expression();
				setState(193);
				match(CL_PAR);

				_localctx.type = ((FactorContext)_localctx).expression.type
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				((FactorContext)_localctx).NAME = match(NAME);

				if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) not in symbol_table:
				    print("{} is not declared".format((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)), file=sys.stderr)
				    sys.exit(1)
				index = symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))
				variables_used[index] = True
				_localctx.type = types[(((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)]
				if _localctx.type == 'i':
				    emit('    iload ' + str(index), 1)
				elif _localctx.type == 's':
				    emit('    aload ' + str(index), 1)
				elif _localctx.type == 'a':
				    emit('    aload ' + str(index), 1)
				else:
				    print("Err", file=sys.stderr)
				    sys.exit(1)
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(READ_INT);
				setState(199);
				match(OP_PAR);
				setState(200);
				match(CL_PAR);

				emit('    invokestatic Runtime/readInt()I', 1)
				_localctx.type = 'i'
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(READ_STR);
				setState(203);
				match(OP_PAR);
				setState(204);
				match(CL_PAR);

				emit('    invokestatic Runtime/readString()Ljava/lang/String;', 1)
				_localctx.type = 's'
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				((FactorContext)_localctx).NAME = match(NAME);

				index = symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))
				variables_used[index] = True
				_localctx.type = types[(((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)]
				if _localctx.type != 'a':
				    print("Can't access index of non array", file=sys.stderr)
				    sys.exit(1)
				emit('    aload ' + str(index), 1)
				    
				setState(208);
				match(OP_BRA);
				setState(209);
				((FactorContext)_localctx).ex = expression();

				if(((FactorContext)_localctx).ex.type == 'i'):
				    emit('    invokevirtual Array/get(I)I', -1)
				    _localctx.type = 'i'
				else:
				    print("Array index must be integer", file=sys.stderr)
				    sys.exit(1)
				    
				setState(211);
				match(CL_BRA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(213);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(214);
				match(DOT);
				setState(215);
				match(LENGTH);

				index = symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))
				variables_used[index] = True
				_localctx.type = types[(((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)]
				if(_localctx.type == 'a'):
				    emit('    aload ' + str(index), 1)
				    emit('    invokevirtual Array/length()I', 0)
				    _localctx.type = 'i'
				else:
				    print('Type must be array', file=sys.stderr)
				    sys.exit(1)
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16"+
		"\5F\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\6\ft\n\f\r\f\16\fu\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u0080\n\r\r\r\16\r\u0081\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\6\r\u008b\n\r\r\r\16\r\u008c\3\r\3\r\7\r\u0091\n\r\f"+
		"\r\16\r\u0094\13\r\3\r\3\r\3\r\3\r\6\r\u009a\n\r\r\r\16\r\u009b\3\r\3"+
		"\r\3\r\3\r\5\r\u00a2\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00ae\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00b7\n"+
		"\20\f\20\16\20\u00ba\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dc\n\21\3\21\2\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\22\27\3\2\5\6\3\2"+
		"\7\t\2\u00e6\2\"\3\2\2\2\4%\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\nJ\3\2\2\2"+
		"\fO\3\2\2\2\16U\3\2\2\2\20^\3\2\2\2\22g\3\2\2\2\24j\3\2\2\2\26m\3\2\2"+
		"\2\30z\3\2\2\2\32\u00a3\3\2\2\2\34\u00a8\3\2\2\2\36\u00b1\3\2\2\2 \u00db"+
		"\3\2\2\2\"#\b\2\1\2#$\5\4\3\2$\3\3\2\2\2%\'\b\3\1\2&(\5\6\4\2\'&\3\2\2"+
		"\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\3\1\2,\5\3\2\2\2-\67\5"+
		"\b\5\2.\67\5\n\6\2/\67\5\30\r\2\60\67\5\26\f\2\61\67\5\22\n\2\62\67\5"+
		"\24\13\2\63\67\5\f\7\2\64\67\5\16\b\2\65\67\5\20\t\2\66-\3\2\2\2\66.\3"+
		"\2\2\2\66/\3\2\2\2\66\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2"+
		"\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\7\31\2\29:\7\n\2\2:;\b"+
		"\5\1\2;<\5\34\17\2<D\b\5\1\2=>\7\r\2\2>?\b\5\1\2?@\5\34\17\2@A\b\5\1\2"+
		"AC\3\2\2\2B=\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2"+
		"GH\7\13\2\2HI\b\5\1\2I\t\3\2\2\2JK\7&\2\2KL\7\f\2\2LM\5\34\17\2MN\b\6"+
		"\1\2N\13\3\2\2\2OP\7&\2\2PQ\7\f\2\2QR\7\20\2\2RS\7\21\2\2ST\b\7\1\2T\r"+
		"\3\2\2\2UV\7&\2\2VW\7\30\2\2WX\7#\2\2XY\7\n\2\2YZ\b\b\1\2Z[\5\34\17\2"+
		"[\\\7\13\2\2\\]\b\b\1\2]\17\3\2\2\2^_\7&\2\2_`\7\20\2\2`a\b\t\1\2ab\5"+
		"\34\17\2bc\7\21\2\2cd\7\f\2\2de\5\34\17\2ef\b\t\1\2f\21\3\2\2\2gh\7 \2"+
		"\2hi\b\n\1\2i\23\3\2\2\2jk\7!\2\2kl\b\13\1\2l\25\3\2\2\2mn\7\37\2\2no"+
		"\b\f\1\2op\5\32\16\2pq\b\f\1\2qs\7\16\2\2rt\5\6\4\2sr\3\2\2\2tu\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\17\2\2xy\b\f\1\2y\27\3\2\2\2z{\7"+
		"\34\2\2{|\5\32\16\2|}\b\r\1\2}\177\7\16\2\2~\u0080\5\6\4\2\177~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0092\7\17\2\2\u0084\u0085\b\r\1\2\u0085\u0086\7\36\2\2"+
		"\u0086\u0087\5\32\16\2\u0087\u0088\b\r\1\2\u0088\u008a\7\16\2\2\u0089"+
		"\u008b\5\6\4\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\17\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u0084\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u00a1\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\b\r\1\2\u0096\u0097\7\35\2\2\u0097\u0099\7\16\2\2\u0098\u009a\5"+
		"\6\4\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\b"+
		"\r\1\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\b\r\1\2\u00a1\u0095\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\t\2"+
		"\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\b\16\1\2\u00a7\33\3\2\2\2\u00a8"+
		"\u00ad\5\36\20\2\u00a9\u00aa\t\3\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac"+
		"\b\17\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\b\17\1\2\u00b0\35\3\2\2\2\u00b1\u00b8"+
		"\5 \21\2\u00b2\u00b3\t\4\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\b\20\1"+
		"\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\b\20\1\2\u00bc\37\3\2\2\2\u00bd\u00be\7$\2\2\u00be\u00dc\b\21\1"+
		"\2\u00bf\u00c0\7%\2\2\u00c0\u00dc\b\21\1\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3"+
		"\5\34\17\2\u00c3\u00c4\7\13\2\2\u00c4\u00c5\b\21\1\2\u00c5\u00dc\3\2\2"+
		"\2\u00c6\u00c7\7&\2\2\u00c7\u00dc\b\21\1\2\u00c8\u00c9\7\32\2\2\u00c9"+
		"\u00ca\7\n\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00dc\b\21\1\2\u00cc\u00cd\7"+
		"\33\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00dc\b\21\1\2"+
		"\u00d0\u00d1\7&\2\2\u00d1\u00d2\b\21\1\2\u00d2\u00d3\7\20\2\2\u00d3\u00d4"+
		"\5\34\17\2\u00d4\u00d5\b\21\1\2\u00d5\u00d6\7\21\2\2\u00d6\u00dc\3\2\2"+
		"\2\u00d7\u00d8\7&\2\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\7\"\2\2\u00da\u00dc"+
		"\b\21\1\2\u00db\u00bd\3\2\2\2\u00db\u00bf\3\2\2\2\u00db\u00c1\3\2\2\2"+
		"\u00db\u00c6\3\2\2\2\u00db\u00c8\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00d0"+
		"\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc!\3\2\2\2\16)\66Du\u0081\u008c\u0092"+
		"\u009b\u00a1\u00ad\u00b8\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}