// Generated from C:/Users/Davo/Desktop/ProyectoCompiladores\miParser.g4 by ANTLR 4.9.1
package proyecto.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyComa=1, COMA=2, UNDERSC=3, POINT=4, COMIDOBLES=5, ASSIGN=6, VIR=7, DOSPUN=8, 
		PIZQ=9, PDER=10, LLAIZQ=11, LLADER=12, PCIZQ=13, PCDER=14, REOPERATOR=15, 
		ADDITIVEOP=16, MULTIPLICATEOP=17, OPERATOR=18, BOOLEAN=19, CHAR=20, INT=21, 
		STRING=22, TRUE=23, FALSE=24, SUM=25, SUB=26, OR=27, MUL=28, DIV=29, AND=30, 
		INTERROGATION=31, UNARY=32, IF=33, ELSE=34, WHILE=35, RETURN=36, CLASS=37, 
		NEW=38, LENGTH=39, ID=40, INTLITERAL=41, REALLITERAL=42, STRINGLITERAL=43, 
		CHARLITERAL=44, WS=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_functionDeclaration = 3, 
		RULE_formalParams = 4, RULE_formalParam = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_returnStatement = 8, RULE_classDeclaration = 9, 
		RULE_classVariableDeclaration = 10, RULE_variableDeclaration = 11, RULE_type = 12, 
		RULE_simpleType = 13, RULE_arrayType = 14, RULE_assignment = 15, RULE_arrayAssignment = 16, 
		RULE_expression = 17, RULE_simpleExpression = 18, RULE_term = 19, RULE_factor = 20, 
		RULE_unary = 21, RULE_allocationExpression = 22, RULE_arrayAllocationExpression = 23, 
		RULE_subExpression = 24, RULE_functionCall = 25, RULE_classCall = 26, 
		RULE_actualParams = 27, RULE_arrayLookup = 28, RULE_arrayLength = 29, 
		RULE_boolLiteral = 30, RULE_literal = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "functionDeclaration", "formalParams", 
			"formalParam", "whileStatement", "ifStatement", "returnStatement", "classDeclaration", 
			"classVariableDeclaration", "variableDeclaration", "type", "simpleType", 
			"arrayType", "assignment", "arrayAssignment", "expression", "simpleExpression", 
			"term", "factor", "unary", "allocationExpression", "arrayAllocationExpression", 
			"subExpression", "functionCall", "classCall", "actualParams", "arrayLookup", 
			"arrayLength", "boolLiteral", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'_'", "'.'", "'\"'", "'='", "'~'", "':'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", null, null, null, null, "'boolean'", 
			"'char'", "'int'", "'string'", "'true'", "'false'", "'+'", "'-'", "'or'", 
			"'*'", "'/'", "'and'", "'!'", null, "'if'", "'else'", "'while'", "'return'", 
			"'class'", "'new'", "'lenght'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyComa", "COMA", "UNDERSC", "POINT", "COMIDOBLES", "ASSIGN", "VIR", 
			"DOSPUN", "PIZQ", "PDER", "LLAIZQ", "LLADER", "PCIZQ", "PCDER", "REOPERATOR", 
			"ADDITIVEOP", "MULTIPLICATEOP", "OPERATOR", "BOOLEAN", "CHAR", "INT", 
			"STRING", "TRUE", "FALSE", "SUM", "SUB", "OR", "MUL", "DIV", "AND", "INTERROGATION", 
			"UNARY", "IF", "ELSE", "WHILE", "RETURN", "CLASS", "NEW", "LENGTH", "ID", 
			"INTLITERAL", "REALLITERAL", "STRINGLITERAL", "CHARLITERAL", "WS"
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
	public String getGrammarFileName() { return "miParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramSTContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramSTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterProgramST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitProgramST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitProgramST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramSTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAIZQ) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationSTContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public VariableDeclarationSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterVariableDeclarationST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitVariableDeclarationST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitVariableDeclarationST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementSTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterIfStatementST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitIfStatementST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitIfStatementST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementSTContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public ReturnStatementSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterReturnStatementST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitReturnStatementST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitReturnStatementST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockSTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterBlockST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitBlockST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitBlockST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclarationSTContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFunctionDeclarationST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFunctionDeclarationST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionDeclarationST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentSTContext extends StatementContext {
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public ArrayAssignmentSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayAssignmentST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayAssignmentST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayAssignmentST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDeclarationSTContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclarationSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterClassDeclarationST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitClassDeclarationST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassDeclarationST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallSTContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public FunctionCallSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFunctionCallST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFunctionCallST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionCallST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassCallSTContext extends StatementContext {
		public ClassCallContext classCall() {
			return getRuleContext(ClassCallContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public ClassCallSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterClassCallST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitClassCallST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassCallST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentSTContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public AssignmentSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterAssignmentST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitAssignmentST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitAssignmentST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementSTContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStatementSTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterWhileStatementST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitWhileStatementST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitWhileStatementST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationSTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				variableDeclaration();
				setState(71);
				match(PyComa);
				}
				break;
			case 2:
				_localctx = new ClassDeclarationSTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				classDeclaration();
				}
				break;
			case 3:
				_localctx = new AssignmentSTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				assignment();
				setState(75);
				match(PyComa);
				}
				break;
			case 4:
				_localctx = new ArrayAssignmentSTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				arrayAssignment();
				setState(78);
				match(PyComa);
				}
				break;
			case 5:
				_localctx = new IfStatementSTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				ifStatement();
				}
				break;
			case 6:
				_localctx = new WhileStatementSTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				whileStatement();
				}
				break;
			case 7:
				_localctx = new ReturnStatementSTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				returnStatement();
				setState(83);
				match(PyComa);
				}
				break;
			case 8:
				_localctx = new FunctionDeclarationSTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				functionDeclaration();
				}
				break;
			case 9:
				_localctx = new BlockSTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				block();
				}
				break;
			case 10:
				_localctx = new FunctionCallSTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				functionCall();
				setState(88);
				match(PyComa);
				}
				break;
			case 11:
				_localctx = new ClassCallSTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				classCall();
				setState(91);
				match(PyComa);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockASTContext extends BlockContext {
		public TerminalNode LLAIZQ() { return getToken(miParser.LLAIZQ, 0); }
		public TerminalNode LLADER() { return getToken(miParser.LLADER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitBlockAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LLAIZQ);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAIZQ) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(LLADER);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationASTContext extends FunctionDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionDeclarationASTContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFunctionDeclarationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFunctionDeclarationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			_localctx = new FunctionDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type();
			setState(105);
			match(ID);
			setState(106);
			match(PIZQ);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(107);
				formalParams();
				}
			}

			setState(110);
			match(PDER);
			setState(111);
			block();
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

	public static class FormalParamsContext extends ParserRuleContext {
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
	 
		public FormalParamsContext() { }
		public void copyFrom(FormalParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamsASTContext extends FormalParamsContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public FormalParamsASTContext(FormalParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFormalParamsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFormalParamsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFormalParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			_localctx = new FormalParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			formalParam();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(114);
				match(COMA);
				setState(115);
				formalParam();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParamContext extends ParserRuleContext {
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
	 
		public FormalParamContext() { }
		public void copyFrom(FormalParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamASTContext extends FormalParamContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public FormalParamASTContext(FormalParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFormalParamAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFormalParamAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFormalParamAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParam);
		try {
			_localctx = new FormalParamASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			type();
			setState(122);
			match(ID);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementASTContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(miParser.WHILE, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementASTContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterWhileStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitWhileStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitWhileStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WHILE);
			setState(125);
			match(PIZQ);
			setState(126);
			expression();
			setState(127);
			match(PDER);
			setState(128);
			block();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(miParser.IF, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miParser.ELSE, 0); }
		public IfStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitIfStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitIfStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IF);
			setState(131);
			match(PIZQ);
			setState(132);
			expression();
			setState(133);
			match(PDER);
			setState(134);
			block();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(135);
				match(ELSE);
				setState(136);
				block();
				}
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatementASTContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(miParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterReturnStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitReturnStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitReturnStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			_localctx = new ReturnStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RETURN);
			setState(140);
			expression();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclarationASTContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(miParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassDeclarationASTContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterClassDeclarationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitClassDeclarationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		try {
			_localctx = new ClassDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(CLASS);
			setState(143);
			match(ID);
			setState(144);
			block();
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

	public static class ClassVariableDeclarationContext extends ParserRuleContext {
		public ClassVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariableDeclaration; }
	 
		public ClassVariableDeclarationContext() { }
		public void copyFrom(ClassVariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassVariableDeclarationASTContext extends ClassVariableDeclarationContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassVariableDeclarationASTContext(ClassVariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterClassVariableDeclarationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitClassVariableDeclarationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassVariableDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVariableDeclarationContext classVariableDeclaration() throws RecognitionException {
		ClassVariableDeclarationContext _localctx = new ClassVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classVariableDeclaration);
		int _la;
		try {
			_localctx = new ClassVariableDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			simpleType();
			setState(147);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(148);
				match(ASSIGN);
				setState(149);
				expression();
				}
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationASTContext extends VariableDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationASTContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterVariableDeclarationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitVariableDeclarationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitVariableDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			type();
			setState(153);
			match(ID);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(154);
				match(ASSIGN);
				setState(155);
				expression();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeTContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayTypeT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayTypeT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayTypeT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleTypeASTContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleTypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterSimpleTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitSimpleTypeAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitSimpleTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				simpleType();
				}
				break;
			case 2:
				_localctx = new ArrayTypeTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				arrayType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	 
		public SimpleTypeContext() { }
		public void copyFrom(SimpleTypeContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class CharASTContext extends SimpleTypeContext {
		public TerminalNode CHAR() { return getToken(miParser.CHAR, 0); }
		public CharASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterCharAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitCharAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitCharAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntASTContext extends SimpleTypeContext {
		public TerminalNode INT() { return getToken(miParser.INT, 0); }
		public IntASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterIntAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitIntAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitIntAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringASTContext extends SimpleTypeContext {
		public TerminalNode STRING() { return getToken(miParser.STRING, 0); }
		public StringASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterStringAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitStringAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitStringAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanASTContext extends SimpleTypeContext {
		public TerminalNode BOOLEAN() { return getToken(miParser.BOOLEAN, 0); }
		public BooleanASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterBooleanAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitBooleanAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitBooleanAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleType);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				_localctx = new CharASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(CHAR);
				}
				break;
			case INT:
				_localctx = new IntASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeASTContext extends ArrayTypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayTypeASTContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayTypeAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			_localctx = new ArrayTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			simpleType();
			setState(169);
			match(PCIZQ);
			setState(170);
			match(PCDER);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentASTContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POINT() { return getToken(miParser.POINT, 0); }
		public AssignmentASTContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterAssignmentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitAssignmentAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitAssignmentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			_localctx = new AssignmentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(173);
				match(POINT);
				setState(174);
				match(ID);
				}
			}

			setState(177);
			match(ASSIGN);
			setState(178);
			expression();
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	 
		public ArrayAssignmentContext() { }
		public void copyFrom(ArrayAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignmentASTContext extends ArrayAssignmentContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ArrayAssignmentASTContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayAssignmentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayAssignmentAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayAssignmentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayAssignment);
		try {
			_localctx = new ArrayAssignmentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(PCIZQ);
			setState(182);
			expression();
			setState(183);
			match(PCDER);
			setState(184);
			match(ASSIGN);
			setState(185);
			expression();
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> REOPERATOR() { return getTokens(miParser.REOPERATOR); }
		public TerminalNode REOPERATOR(int i) {
			return getToken(miParser.REOPERATOR, i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			int _alt;
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			simpleExpression();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(REOPERATOR);
					setState(189);
					simpleExpression();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExpressionASTContext extends SimpleExpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADDITIVEOP() { return getTokens(miParser.ADDITIVEOP); }
		public TerminalNode ADDITIVEOP(int i) {
			return getToken(miParser.ADDITIVEOP, i);
		}
		public SimpleExpressionASTContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterSimpleExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitSimpleExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitSimpleExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleExpression);
		try {
			int _alt;
			_localctx = new SimpleExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			term();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(ADDITIVEOP);
					setState(197);
					term();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermFContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATEOP() { return getTokens(miParser.MULTIPLICATEOP); }
		public TerminalNode MULTIPLICATEOP(int i) {
			return getToken(miParser.MULTIPLICATEOP, i);
		}
		public TermFContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterTermF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitTermF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitTermF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			int _alt;
			_localctx = new TermFContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			factor();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(MULTIPLICATEOP);
					setState(205);
					factor();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorLiteralFContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FactorLiteralFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFactorLiteralF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFactorLiteralF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFactorLiteralF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocationExpressionFContext extends FactorContext {
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public AllocationExpressionFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterAllocationExpressionF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitAllocationExpressionF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitAllocationExpressionF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallFContext extends FactorContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFunctionCallF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFunctionCallF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionCallF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryFContext extends FactorContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UnaryFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterUnaryF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitUnaryF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitUnaryF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLookupFContext extends FactorContext {
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public ArrayLookupFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayLookupF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayLookupF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayLookupF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdFContext extends FactorContext {
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode POINT() { return getToken(miParser.POINT, 0); }
		public IdFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterIdF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitIdF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitIdF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionFContext extends FactorContext {
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public SubExpressionFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterSubExpressionF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitSubExpressionF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitSubExpressionF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLengthFContext extends FactorContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ArrayLengthFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayLengthF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayLengthF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayLengthF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAllocationExpressionFContext extends FactorContext {
		public ArrayAllocationExpressionContext arrayAllocationExpression() {
			return getRuleContext(ArrayAllocationExpressionContext.class,0);
		}
		public ArrayAllocationExpressionFContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayAllocationExpressionF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayAllocationExpressionF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayAllocationExpressionF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FactorLiteralFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				literal();
				}
				break;
			case 2:
				_localctx = new IdFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(ID);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINT) {
					{
					setState(213);
					match(POINT);
					setState(214);
					match(ID);
					}
				}

				}
				break;
			case 3:
				_localctx = new FunctionCallFContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				functionCall();
				}
				break;
			case 4:
				_localctx = new ArrayLookupFContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				arrayLookup();
				}
				break;
			case 5:
				_localctx = new ArrayLengthFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				arrayLength();
				}
				break;
			case 6:
				_localctx = new SubExpressionFContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				subExpression();
				}
				break;
			case 7:
				_localctx = new ArrayAllocationExpressionFContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				arrayAllocationExpression();
				}
				break;
			case 8:
				_localctx = new AllocationExpressionFContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				allocationExpression();
				}
				break;
			case 9:
				_localctx = new UnaryFContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryASTContext extends UnaryContext {
		public TerminalNode UNARY() { return getToken(miParser.UNARY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryASTContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterUnaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitUnaryAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitUnaryAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unary);
		try {
			int _alt;
			_localctx = new UnaryASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(UNARY);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					expression();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
	 
		public AllocationExpressionContext() { }
		public void copyFrom(AllocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllocationExpressionASTContext extends AllocationExpressionContext {
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public AllocationExpressionASTContext(AllocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterAllocationExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitAllocationExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitAllocationExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocationExpressionContext allocationExpression() throws RecognitionException {
		AllocationExpressionContext _localctx = new AllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_allocationExpression);
		try {
			_localctx = new AllocationExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(NEW);
			setState(234);
			match(ID);
			setState(235);
			match(PIZQ);
			setState(236);
			match(PDER);
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

	public static class ArrayAllocationExpressionContext extends ParserRuleContext {
		public ArrayAllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAllocationExpression; }
	 
		public ArrayAllocationExpressionContext() { }
		public void copyFrom(ArrayAllocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAllocationExpressionASTContext extends ArrayAllocationExpressionContext {
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayAllocationExpressionASTContext(ArrayAllocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayAllocationExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayAllocationExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayAllocationExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAllocationExpressionContext arrayAllocationExpression() throws RecognitionException {
		ArrayAllocationExpressionContext _localctx = new ArrayAllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayAllocationExpression);
		try {
			_localctx = new ArrayAllocationExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(NEW);
			setState(239);
			simpleType();
			setState(240);
			match(PCIZQ);
			setState(241);
			expression();
			setState(242);
			match(PCDER);
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

	public static class SubExpressionContext extends ParserRuleContext {
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
	 
		public SubExpressionContext() { }
		public void copyFrom(SubExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubExpressionASTContext extends SubExpressionContext {
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public SubExpressionASTContext(SubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterSubExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitSubExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitSubExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subExpression);
		try {
			_localctx = new SubExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(PIZQ);
			setState(245);
			expression();
			setState(246);
			match(PDER);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallASTContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FunctionCallASTContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterFunctionCallAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitFunctionCallAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitFunctionCallAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCallASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(249);
			match(PIZQ);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << TRUE) | (1L << FALSE) | (1L << UNARY) | (1L << NEW) | (1L << ID) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << CHARLITERAL))) != 0)) {
				{
				setState(250);
				actualParams();
				}
			}

			setState(253);
			match(PDER);
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

	public static class ClassCallContext extends ParserRuleContext {
		public ClassCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCall; }
	 
		public ClassCallContext() { }
		public void copyFrom(ClassCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassCallASTContext extends ClassCallContext {
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public ClassCallASTContext(ClassCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterClassCallAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitClassCallAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitClassCallAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCallContext classCall() throws RecognitionException {
		ClassCallContext _localctx = new ClassCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classCall);
		try {
			_localctx = new ClassCallASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
			setState(256);
			match(ID);
			setState(257);
			match(ASSIGN);
			setState(258);
			match(NEW);
			setState(259);
			match(ID);
			setState(260);
			match(PIZQ);
			setState(261);
			match(PDER);
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

	public static class ActualParamsContext extends ParserRuleContext {
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
	 
		public ActualParamsContext() { }
		public void copyFrom(ActualParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualParamsASTContext extends ActualParamsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public ActualParamsASTContext(ActualParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterActualParamsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitActualParamsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitActualParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_actualParams);
		int _la;
		try {
			_localctx = new ActualParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expression();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(264);
				match(COMA);
				setState(265);
				expression();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayLookupContext extends ParserRuleContext {
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
	 
		public ArrayLookupContext() { }
		public void copyFrom(ArrayLookupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLookupASTContext extends ArrayLookupContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayLookupASTContext(ArrayLookupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayLookupAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayLookupAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayLookupAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLookupContext arrayLookup() throws RecognitionException {
		ArrayLookupContext _localctx = new ArrayLookupContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayLookup);
		try {
			_localctx = new ArrayLookupASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(272);
			match(PCIZQ);
			setState(273);
			expression();
			setState(274);
			match(PCDER);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
	 
		public ArrayLengthContext() { }
		public void copyFrom(ArrayLengthContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLengthASTContext extends ArrayLengthContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode POINT() { return getToken(miParser.POINT, 0); }
		public TerminalNode LENGTH() { return getToken(miParser.LENGTH, 0); }
		public ArrayLengthASTContext(ArrayLengthContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterArrayLengthAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitArrayLengthAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitArrayLengthAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayLength);
		try {
			_localctx = new ArrayLengthASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			match(POINT);
			setState(278);
			match(LENGTH);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(miParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(miParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharLContext extends LiteralContext {
		public TerminalNode CHARLITERAL() { return getToken(miParser.CHARLITERAL, 0); }
		public CharLContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterCharL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitCharL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitCharL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLContext extends LiteralContext {
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public BooleanLContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterBooleanL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitBooleanL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitBooleanL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLContext extends LiteralContext {
		public TerminalNode INTLITERAL() { return getToken(miParser.INTLITERAL, 0); }
		public IntLContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterIntL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitIntL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitIntL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLContext extends LiteralContext {
		public TerminalNode STRINGLITERAL() { return getToken(miParser.STRINGLITERAL, 0); }
		public StringLContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).enterStringL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miParserListener ) ((miParserListener)listener).exitStringL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miParserVisitor ) return ((miParserVisitor<? extends T>)visitor).visitStringL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				_localctx = new IntLContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(INTLITERAL);
				}
				break;
			case CHARLITERAL:
				_localctx = new CharLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(CHARLITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				boolLiteral();
				}
				break;
			case STRINGLITERAL:
				_localctx = new StringLContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(STRINGLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3"+
		"\4\7\4d\n\4\f\4\16\4g\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\r\3\r\3\r\3\r\5\r\u009f\n\r\3"+
		"\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\17\3\17\5\17\u00a9\n\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\5\21\u00b2\n\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00c1\n\23\f\23\16\23\u00c4\13"+
		"\23\3\24\3\24\3\24\7\24\u00c9\n\24\f\24\16\24\u00cc\13\24\3\25\3\25\3"+
		"\25\7\25\u00d1\n\25\f\25\16\25\u00d4\13\25\3\26\3\26\3\26\3\26\5\26\u00da"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e3\n\26\3\27\3\27\7\27"+
		"\u00e7\n\27\f\27\16\27\u00ea\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00fe\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u010d\n\35\f\35\16\35\u0110\13\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\5!\u0121\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\3\3\2\31\32\2\u012a\2E"+
		"\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bj\3\2\2\2\ns\3\2\2\2\f{\3\2\2\2\16~\3"+
		"\2\2\2\20\u0084\3\2\2\2\22\u008d\3\2\2\2\24\u0090\3\2\2\2\26\u0094\3\2"+
		"\2\2\30\u009a\3\2\2\2\32\u00a2\3\2\2\2\34\u00a8\3\2\2\2\36\u00aa\3\2\2"+
		"\2 \u00ae\3\2\2\2\"\u00b6\3\2\2\2$\u00bd\3\2\2\2&\u00c5\3\2\2\2(\u00cd"+
		"\3\2\2\2*\u00e2\3\2\2\2,\u00e4\3\2\2\2.\u00eb\3\2\2\2\60\u00f0\3\2\2\2"+
		"\62\u00f6\3\2\2\2\64\u00fa\3\2\2\2\66\u0101\3\2\2\28\u0109\3\2\2\2:\u0111"+
		"\3\2\2\2<\u0116\3\2\2\2>\u011a\3\2\2\2@\u0120\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HI\5\30\r\2IJ\7"+
		"\3\2\2J`\3\2\2\2K`\5\24\13\2LM\5 \21\2MN\7\3\2\2N`\3\2\2\2OP\5\"\22\2"+
		"PQ\7\3\2\2Q`\3\2\2\2R`\5\20\t\2S`\5\16\b\2TU\5\22\n\2UV\7\3\2\2V`\3\2"+
		"\2\2W`\5\b\5\2X`\5\6\4\2YZ\5\64\33\2Z[\7\3\2\2[`\3\2\2\2\\]\5\66\34\2"+
		"]^\7\3\2\2^`\3\2\2\2_H\3\2\2\2_K\3\2\2\2_L\3\2\2\2_O\3\2\2\2_R\3\2\2\2"+
		"_S\3\2\2\2_T\3\2\2\2_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_\\\3\2\2\2`\5\3\2\2"+
		"\2ae\7\r\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2"+
		"\2ge\3\2\2\2hi\7\16\2\2i\7\3\2\2\2jk\5\32\16\2kl\7*\2\2ln\7\13\2\2mo\5"+
		"\n\6\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2qr\5\6\4\2r\t\3\2\2\2sx"+
		"\5\f\7\2tu\7\4\2\2uw\5\f\7\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y"+
		"\13\3\2\2\2zx\3\2\2\2{|\5\32\16\2|}\7*\2\2}\r\3\2\2\2~\177\7%\2\2\177"+
		"\u0080\7\13\2\2\u0080\u0081\5$\23\2\u0081\u0082\7\f\2\2\u0082\u0083\5"+
		"\6\4\2\u0083\17\3\2\2\2\u0084\u0085\7#\2\2\u0085\u0086\7\13\2\2\u0086"+
		"\u0087\5$\23\2\u0087\u0088\7\f\2\2\u0088\u008b\5\6\4\2\u0089\u008a\7$"+
		"\2\2\u008a\u008c\5\6\4\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008e\7&\2\2\u008e\u008f\5$\23\2\u008f\23\3\2\2\2\u0090"+
		"\u0091\7\'\2\2\u0091\u0092\7*\2\2\u0092\u0093\5\6\4\2\u0093\25\3\2\2\2"+
		"\u0094\u0095\5\34\17\2\u0095\u0098\7*\2\2\u0096\u0097\7\b\2\2\u0097\u0099"+
		"\5$\23\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\27\3\2\2\2\u009a"+
		"\u009b\5\32\16\2\u009b\u009e\7*\2\2\u009c\u009d\7\b\2\2\u009d\u009f\5"+
		"$\23\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\31\3\2\2\2\u00a0"+
		"\u00a3\5\34\17\2\u00a1\u00a3\5\36\20\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a9\7\25\2\2\u00a5\u00a9\7\26\2\2\u00a6"+
		"\u00a9\7\27\2\2\u00a7\u00a9\7\30\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\35\3\2\2\2\u00aa"+
		"\u00ab\5\34\17\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\7\20\2\2\u00ad\37\3"+
		"\2\2\2\u00ae\u00b1\7*\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b2\7*\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\b"+
		"\2\2\u00b4\u00b5\5$\23\2\u00b5!\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7\u00b8"+
		"\7\17\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\7\b\2\2"+
		"\u00bb\u00bc\5$\23\2\u00bc#\3\2\2\2\u00bd\u00c2\5&\24\2\u00be\u00bf\7"+
		"\21\2\2\u00bf\u00c1\5&\24\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00ca\5(\25\2\u00c6\u00c7\7\22\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\'\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d2\5*\26\2\u00ce\u00cf\7\23\2"+
		"\2\u00cf\u00d1\5*\26\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00e3\5@!\2\u00d6\u00d9\7*\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00da\7*\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e3\3\2\2\2\u00db\u00e3"+
		"\5\64\33\2\u00dc\u00e3\5:\36\2\u00dd\u00e3\5<\37\2\u00de\u00e3\5\62\32"+
		"\2\u00df\u00e3\5\60\31\2\u00e0\u00e3\5.\30\2\u00e1\u00e3\5,\27\2\u00e2"+
		"\u00d5\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2"+
		"\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3+\3\2\2\2\u00e4\u00e8\7\"\2\2"+
		"\u00e5\u00e7\5$\23\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7(\2\2\u00ec\u00ed\7*\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\7\f"+
		"\2\2\u00ef/\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3"+
		"\7\17\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\7\20\2\2\u00f5\61\3\2\2\2\u00f6"+
		"\u00f7\7\13\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7\f\2\2\u00f9\63\3\2\2"+
		"\2\u00fa\u00fb\7*\2\2\u00fb\u00fd\7\13\2\2\u00fc\u00fe\58\35\2\u00fd\u00fc"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\f\2\2\u0100"+
		"\65\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103\7*\2\2\u0103\u0104\7\b\2\2"+
		"\u0104\u0105\7(\2\2\u0105\u0106\7*\2\2\u0106\u0107\7\13\2\2\u0107\u0108"+
		"\7\f\2\2\u0108\67\3\2\2\2\u0109\u010e\5$\23\2\u010a\u010b\7\4\2\2\u010b"+
		"\u010d\5$\23\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f9\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112"+
		"\7*\2\2\u0112\u0113\7\17\2\2\u0113\u0114\5$\23\2\u0114\u0115\7\20\2\2"+
		"\u0115;\3\2\2\2\u0116\u0117\7*\2\2\u0117\u0118\7\6\2\2\u0118\u0119\7)"+
		"\2\2\u0119=\3\2\2\2\u011a\u011b\t\2\2\2\u011b?\3\2\2\2\u011c\u0121\7+"+
		"\2\2\u011d\u0121\7.\2\2\u011e\u0121\5> \2\u011f\u0121\7-\2\2\u0120\u011c"+
		"\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"A\3\2\2\2\26E_enx\u008b\u0098\u009e\u00a2\u00a8\u00b1\u00c2\u00ca\u00d2"+
		"\u00d9\u00e2\u00e8\u00fd\u010e\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}