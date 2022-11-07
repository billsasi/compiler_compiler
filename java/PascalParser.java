// Generated from Pascal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, ASM=3, BEGIN=4, BREAK=5, CASE=6, CONST=7, CONSTRUCTOR=8, 
		CONTINUE=9, DESTRUCTOR=10, DIV=11, DO=12, DOWNTO=13, ELSE=14, END=15, 
		FALSE=16, FILE=17, FOR=18, FUNCTION=19, GOTO=20, IF=21, IMPLEMENTATION=22, 
		IN=23, INLINE=24, INTERFACE=25, LABEL=26, MOD=27, NIL=28, NOT=29, OBJECT=30, 
		OF=31, ON=32, OPERATOR=33, OR=34, PACKED=35, PROCEDURE=36, PROGRAM=37, 
		RECORD=38, REPEAT=39, SET=40, SHL=41, SHR=42, STRING=43, THEN=44, TO=45, 
		TRUE=46, TYPE=47, UNIT=48, UNTIL=49, USES=50, VAR=51, WHILE=52, WITH=53, 
		XOR=54, REAL=55, INTEGER=56, IDENTIFIER=57, CHARACTER=58, STRING_LITERAL=59, 
		PLUSOP=60, MINUSOP=61, MULTOP=62, DIVOP=63, ASSIGN=64, EQUAL=65, NE=66, 
		LTEQ=67, GTEQ=68, LT=69, GT=70, PLUSEQUAL=71, MINUSEQUAL=72, MULTEQUAL=73, 
		DIVEQUAL=74, CARAT=75, SEMICOLON=76, COMMA=77, LPAREN=78, RPAREN=79, LBRACKET=80, 
		RBRACKET=81, LBRACE=82, RBRACE=83, LCOMMENT=84, RCOMMENT=85, DOT_DOT=86, 
		PERIOD=87, COLON=88, WS=89;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifierList = 2, RULE_identifier = 3, 
		RULE_block = 4, RULE_labelDeclarationPart = 5, RULE_label = 6, RULE_constantDefinitionPart = 7, 
		RULE_constantDefinition = 8, RULE_constant = 9, RULE_unsignedNumber = 10, 
		RULE_unsignedInteger = 11, RULE_unsignedReal = 12, RULE_scaleFactor = 13, 
		RULE_sign = 14, RULE_constantIdentifier = 15, RULE_string = 16, RULE_typeDefinitionPart = 17, 
		RULE_typeDefinition = 18, RULE_type = 19, RULE_simpleType = 20, RULE_scalarType = 21, 
		RULE_subrangeType = 22, RULE_typeIdentifier = 23, RULE_structuredType = 24, 
		RULE_arrayType = 25, RULE_indexType = 26, RULE_componentType = 27, RULE_recordType = 28, 
		RULE_fieldList = 29, RULE_fixedPart = 30, RULE_recordSection = 31, RULE_variantType = 32, 
		RULE_tagField = 33, RULE_variant = 34, RULE_caseLabel = 35, RULE_setType = 36, 
		RULE_baseType = 37, RULE_fileType = 38, RULE_pointerType = 39, RULE_variableDeclarationPart = 40, 
		RULE_variableDeclaration = 41, RULE_procedureAndFunctionDeclarationPart = 42, 
		RULE_procedureOrFunctionDeclaration = 43, RULE_procedureDeclaration = 44, 
		RULE_procedureHeading = 45, RULE_formalParameterSection = 46, RULE_parameterGroup = 47, 
		RULE_functionDeclaration = 48, RULE_functionHeading = 49, RULE_resultType = 50, 
		RULE_statementPart = 51, RULE_statement = 52, RULE_unlabelledStatement = 53, 
		RULE_simpleStatement = 54, RULE_assignmentStatement = 55, RULE_variable = 56, 
		RULE_entireVariable = 57, RULE_variableIdentifier = 58, RULE_componentVariable = 59, 
		RULE_indexedVariable = 60, RULE_arrayVariable = 61, RULE_fieldDesignator = 62, 
		RULE_recordVariable = 63, RULE_fieldIdentifier = 64, RULE_fileBuffer = 65, 
		RULE_fileVariable = 66, RULE_referencedVariable = 67, RULE_pointerVariable = 68, 
		RULE_expression = 69, RULE_relationalOperator = 70, RULE_simpleExpression = 71, 
		RULE_addingOperator = 72, RULE_term = 73, RULE_multiplyingOperator = 74, 
		RULE_factor = 75, RULE_unsignedConstant = 76, RULE_functionDesignator = 77, 
		RULE_functionIdentifier = 78, RULE_set = 79, RULE_elementList = 80, RULE_element = 81, 
		RULE_procedureStatement = 82, RULE_procedureIdentifier = 83, RULE_actualParameter = 84, 
		RULE_goToStatement = 85, RULE_emptyStatement = 86, RULE_empty = 87, RULE_structuredStatement = 88, 
		RULE_compoundStatement = 89, RULE_conditionalStatement = 90, RULE_ifStatement = 91, 
		RULE_caseStatement = 92, RULE_caseListElement = 93, RULE_caseLabelList = 94, 
		RULE_repetitiveStatement = 95, RULE_whileStatement = 96, RULE_repeatStatement = 97, 
		RULE_forStatement = 98, RULE_controlVariable = 99, RULE_forList = 100, 
		RULE_initialValue = 101, RULE_finalValue = 102, RULE_withStatement = 103, 
		RULE_recordVariableList = 104;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "identifierList", "identifier", "block", 
			"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
			"constant", "unsignedNumber", "unsignedInteger", "unsignedReal", "scaleFactor", 
			"sign", "constantIdentifier", "string", "typeDefinitionPart", "typeDefinition", 
			"type", "simpleType", "scalarType", "subrangeType", "typeIdentifier", 
			"structuredType", "arrayType", "indexType", "componentType", "recordType", 
			"fieldList", "fixedPart", "recordSection", "variantType", "tagField", 
			"variant", "caseLabel", "setType", "baseType", "fileType", "pointerType", 
			"variableDeclarationPart", "variableDeclaration", "procedureAndFunctionDeclarationPart", 
			"procedureOrFunctionDeclaration", "procedureDeclaration", "procedureHeading", 
			"formalParameterSection", "parameterGroup", "functionDeclaration", "functionHeading", 
			"resultType", "statementPart", "statement", "unlabelledStatement", "simpleStatement", 
			"assignmentStatement", "variable", "entireVariable", "variableIdentifier", 
			"componentVariable", "indexedVariable", "arrayVariable", "fieldDesignator", 
			"recordVariable", "fieldIdentifier", "fileBuffer", "fileVariable", "referencedVariable", 
			"pointerVariable", "expression", "relationalOperator", "simpleExpression", 
			"addingOperator", "term", "multiplyingOperator", "factor", "unsignedConstant", 
			"functionDesignator", "functionIdentifier", "set", "elementList", "element", 
			"procedureStatement", "procedureIdentifier", "actualParameter", "goToStatement", 
			"emptyStatement", "empty", "structuredStatement", "compoundStatement", 
			"conditionalStatement", "ifStatement", "caseStatement", "caseListElement", 
			"caseLabelList", "repetitiveStatement", "whileStatement", "repeatStatement", 
			"forStatement", "controlVariable", "forList", "initialValue", "finalValue", 
			"withStatement", "recordVariableList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "':='", "'='", "'<>'", "'<='", "'>='", "'<'", 
			"'>'", "'+='", "'-='", "'*='", "'/='", "'^'", "';'", "','", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'(*'", "'*)'", "'..'", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "ASM", "BEGIN", "BREAK", "CASE", "CONST", "CONSTRUCTOR", 
			"CONTINUE", "DESTRUCTOR", "DIV", "DO", "DOWNTO", "ELSE", "END", "FALSE", 
			"FILE", "FOR", "FUNCTION", "GOTO", "IF", "IMPLEMENTATION", "IN", "INLINE", 
			"INTERFACE", "LABEL", "MOD", "NIL", "NOT", "OBJECT", "OF", "ON", "OPERATOR", 
			"OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", "REPEAT", "SET", "SHL", 
			"SHR", "STRING", "THEN", "TO", "TRUE", "TYPE", "UNIT", "UNTIL", "USES", 
			"VAR", "WHILE", "WITH", "XOR", "REAL", "INTEGER", "IDENTIFIER", "CHARACTER", 
			"STRING_LITERAL", "PLUSOP", "MINUSOP", "MULTOP", "DIVOP", "ASSIGN", "EQUAL", 
			"NE", "LTEQ", "GTEQ", "LT", "GT", "PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", 
			"DIVEQUAL", "CARAT", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "LCOMMENT", "RCOMMENT", "DOT_DOT", "PERIOD", 
			"COLON", "WS"
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
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(PascalParser.PERIOD, 0); }
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(PROGRAM);
			setState(211);
			identifier();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(212);
				programHeading();
				}
			}

			setState(215);
			match(SEMICOLON);
			setState(216);
			block();
			setState(217);
			match(PERIOD);
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgramHeading(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LPAREN);
			setState(220);
			identifierList();
			setState(221);
			match(RPAREN);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			identifier();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(224);
				match(COMMA);
				setState(225);
				identifier();
				}
				}
				setState(230);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
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
		public LabelDeclarationPartContext labelDeclarationPart() {
			return getRuleContext(LabelDeclarationPartContext.class,0);
		}
		public ConstantDefinitionPartContext constantDefinitionPart() {
			return getRuleContext(ConstantDefinitionPartContext.class,0);
		}
		public TypeDefinitionPartContext typeDefinitionPart() {
			return getRuleContext(TypeDefinitionPartContext.class,0);
		}
		public VariableDeclarationPartContext variableDeclarationPart() {
			return getRuleContext(VariableDeclarationPartContext.class,0);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,0);
		}
		public StatementPartContext statementPart() {
			return getRuleContext(StatementPartContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			labelDeclarationPart();
			setState(234);
			constantDefinitionPart();
			setState(235);
			typeDefinitionPart();
			setState(236);
			variableDeclarationPart();
			setState(237);
			procedureAndFunctionDeclarationPart();
			setState(238);
			statementPart();
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

	public static class LabelDeclarationPartContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(PascalParser.LABEL, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterLabelDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitLabelDeclarationPart(this);
		}
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelDeclarationPart);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case CONST:
			case FUNCTION:
			case PROCEDURE:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				empty();
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(LABEL);
				setState(242);
				label();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(243);
					match(COMMA);
					setState(244);
					label();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(SEMICOLON);
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

	public static class LabelContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			unsignedInteger();
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConstantDefinitionPart(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinitionPart);
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				empty();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(CONST);
				setState(258);
				constantDefinition();
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(259);
						match(SEMICOLON);
						setState(260);
						constantDefinition();
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(266);
				match(SEMICOLON);
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

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConstantDefinition(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			identifier();
			setState(271);
			match(EQUAL);
			setState(272);
			constant();
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

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(PascalParser.CHARACTER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				sign();
				setState(276);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				constantIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				sign();
				setState(280);
				constantIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(CHARACTER);
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsignedNumber);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				unsignedInteger();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				unsignedReal();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(INTEGER);
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

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitUnsignedReal(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(REAL);
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

	public static class ScaleFactorContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ScaleFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterScaleFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitScaleFactor(this);
		}
	}

	public final ScaleFactorContext scaleFactor() throws RecognitionException {
		ScaleFactorContext _localctx = new ScaleFactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scaleFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUSOP || _la==MINUSOP) {
				{
				setState(294);
				sign();
				}
			}

			setState(297);
			unsignedInteger();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUSOP() { return getToken(PascalParser.PLUSOP, 0); }
		public TerminalNode MINUSOP() { return getToken(PascalParser.MINUSOP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==PLUSOP || _la==MINUSOP) ) {
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

	public static class ConstantIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConstantIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConstantIdentifier(this);
		}
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constantIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			identifier();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PascalParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(STRING_LITERAL);
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTypeDefinitionPart(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDefinitionPart);
		try {
			int _alt;
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				empty();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(TYPE);
				setState(307);
				typeDefinition();
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(SEMICOLON);
						setState(309);
						typeDefinition();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(315);
				match(SEMICOLON);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			identifier();
			setState(320);
			match(EQUAL);
			setState(321);
			type();
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
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				pointerType();
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
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleType);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				typeIdentifier();
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitScalarType(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scalarType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LPAREN);
			setState(334);
			identifier();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				identifier();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(RPAREN);
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

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOT_DOT() { return getToken(PascalParser.DOT_DOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSubrangeType(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			constant();
			setState(345);
			match(DOT_DOT);
			setState(346);
			constant();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			identifier();
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

	public static class StructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStructuredType(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_structuredType);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				fileType();
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
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ARRAY);
			setState(357);
			match(LBRACKET);
			setState(358);
			indexType();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				indexType();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(RBRACKET);
			setState(367);
			match(OF);
			setState(368);
			componentType();
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

	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIndexType(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			simpleType();
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

	public static class ComponentTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitComponentType(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			type();
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

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(PascalParser.RECORD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRecordType(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(RECORD);
			setState(375);
			fieldList();
			setState(376);
			match(END);
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

	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public VariantContext variant() {
			return getRuleContext(VariantContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldList);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				fixedPart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				fixedPart();
				setState(380);
				match(SEMICOLON);
				setState(381);
				variant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				variant();
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

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFixedPart(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			recordSection();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					match(SEMICOLON);
					setState(388);
					recordSection();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class RecordSectionContext extends ParserRuleContext {
		public List<FieldIdentifierContext> fieldIdentifier() {
			return getRuleContexts(FieldIdentifierContext.class);
		}
		public FieldIdentifierContext fieldIdentifier(int i) {
			return getRuleContext(FieldIdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRecordSection(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_recordSection);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				fieldIdentifier();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(395);
					match(COMMA);
					setState(396);
					fieldIdentifier();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(COLON);
				setState(403);
				type();
				}
				break;
			case EOF:
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				empty();
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

	public static class VariantTypeContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public TagFieldContext tagField() {
			return getRuleContext(TagFieldContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public VariantTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariantType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariantType(this);
		}
	}

	public final VariantTypeContext variantType() throws RecognitionException {
		VariantTypeContext _localctx = new VariantTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variantType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(CASE);
			setState(409);
			tagField();
			setState(410);
			typeIdentifier();
			setState(411);
			match(OF);
			setState(412);
			variant();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(413);
				match(SEMICOLON);
				setState(414);
				variant();
				}
				}
				setState(419);
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

	public static class TagFieldContext extends ParserRuleContext {
		public FieldIdentifierContext fieldIdentifier() {
			return getRuleContext(FieldIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TagFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTagField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTagField(this);
		}
	}

	public final TagFieldContext tagField() throws RecognitionException {
		TagFieldContext _localctx = new TagFieldContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tagField);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				fieldIdentifier();
				setState(421);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				empty();
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

	public static class VariantContext extends ParserRuleContext {
		public CaseLabelListContext caseLabelList() {
			return getRuleContext(CaseLabelListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariant(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variant);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
			case INTEGER:
			case IDENTIFIER:
			case CHARACTER:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				caseLabelList();
				setState(427);
				match(COLON);
				{
				setState(428);
				fieldList();
				}
				}
				break;
			case EOF:
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				empty();
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

	public static class CaseLabelContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCaseLabel(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_caseLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			constant();
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

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PascalParser.SET, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSetType(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(SET);
			setState(436);
			match(OF);
			setState(437);
			baseType();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBaseType(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			simpleType();
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

	public static class FileTypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(PascalParser.FILE, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFileType(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fileType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(FILE);
			setState(442);
			match(OF);
			setState(443);
			type();
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			typeIdentifier();
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariableDeclarationPart(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarationPart);
		try {
			int _alt;
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				empty();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(VAR);
				setState(449);
				variableDeclaration();
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(450);
						match(SEMICOLON);
						setState(451);
						variableDeclaration();
						}
						} 
					}
					setState(456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(457);
				match(SEMICOLON);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			identifier();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462);
				match(COMMA);
				setState(463);
				identifier();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(COLON);
			setState(470);
			type();
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public List<ProcedureOrFunctionDeclarationContext> procedureOrFunctionDeclaration() {
			return getRuleContexts(ProcedureOrFunctionDeclarationContext.class);
		}
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration(int i) {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_procedureAndFunctionDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==PROCEDURE) {
				{
				{
				setState(472);
				procedureOrFunctionDeclaration();
				setState(473);
				match(SEMICOLON);
				}
				}
				setState(479);
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

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureOrFunctionDeclaration(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_procedureOrFunctionDeclaration);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				functionDeclaration();
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public ProcedureHeadingContext procedureHeading() {
			return getRuleContext(ProcedureHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureDeclaration(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_procedureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			procedureHeading();
			setState(485);
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

	public static class ProcedureHeadingContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProcedureHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureHeading(this);
		}
	}

	public final ProcedureHeadingContext procedureHeading() throws RecognitionException {
		ProcedureHeadingContext _localctx = new ProcedureHeadingContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_procedureHeading);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(PROCEDURE);
				setState(488);
				identifier();
				setState(489);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(PROCEDURE);
				setState(492);
				identifier();
				setState(493);
				match(LPAREN);
				setState(494);
				formalParameterSection();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(495);
					match(SEMICOLON);
					setState(496);
					formalParameterSection();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				match(RPAREN);
				setState(503);
				match(SEMICOLON);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFormalParameterSection(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterSection);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(VAR);
				setState(509);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(FUNCTION);
				setState(511);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(PROCEDURE);
				setState(513);
				identifier();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(514);
					match(COMMA);
					setState(515);
					identifier();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitParameterGroup(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			identifier();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(524);
				match(COMMA);
				setState(525);
				identifier();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(COLON);
			setState(532);
			typeIdentifier();
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
		public FunctionHeadingContext functionHeading() {
			return getRuleContext(FunctionHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			functionHeading();
			setState(535);
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

	public static class FunctionHeadingContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunctionHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunctionHeading(this);
		}
	}

	public final FunctionHeadingContext functionHeading() throws RecognitionException {
		FunctionHeadingContext _localctx = new FunctionHeadingContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionHeading);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(FUNCTION);
				setState(538);
				identifier();
				setState(539);
				match(COLON);
				setState(540);
				resultType();
				setState(541);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(FUNCTION);
				setState(544);
				identifier();
				setState(545);
				match(LPAREN);
				setState(546);
				formalParameterSection();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(547);
					match(SEMICOLON);
					setState(548);
					formalParameterSection();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554);
				match(RPAREN);
				setState(555);
				resultType();
				setState(556);
				match(SEMICOLON);
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitResultType(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			typeIdentifier();
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

	public static class StatementPartContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStatementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStatementPart(this);
		}
	}

	public final StatementPartContext statementPart() throws RecognitionException {
		StatementPartContext _localctx = new StatementPartContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statementPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			compoundStatement();
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
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_statement);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case CASE:
			case ELSE:
			case END:
			case FOR:
			case GOTO:
			case IF:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case WITH:
			case IDENTIFIER:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				unlabelledStatement();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				label();
				setState(566);
				match(COLON);
				setState(567);
				unlabelledStatement();
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

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitUnlabelledStatement(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unlabelledStatement);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case IDENTIFIER:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case REPEAT:
			case WHILE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				structuredStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public GoToStatementContext goToStatement() {
			return getRuleContext(GoToStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpleStatement);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				goToStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				emptyStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentStatement);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				variable();
				setState(582);
				match(ASSIGN);
				setState(583);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				functionIdentifier();
				setState(586);
				match(ASSIGN);
				setState(587);
				expression();
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

	public static class VariableContext extends ParserRuleContext {
		public EntireVariableContext entireVariable() {
			return getRuleContext(EntireVariableContext.class,0);
		}
		public ComponentVariableContext componentVariable() {
			return getRuleContext(ComponentVariableContext.class,0);
		}
		public ReferencedVariableContext referencedVariable() {
			return getRuleContext(ReferencedVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variable);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				entireVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				componentVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				referencedVariable();
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

	public static class EntireVariableContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public EntireVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entireVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterEntireVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitEntireVariable(this);
		}
	}

	public final EntireVariableContext entireVariable() throws RecognitionException {
		EntireVariableContext _localctx = new EntireVariableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_entireVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			variableIdentifier();
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

	public static class VariableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariableIdentifier(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			identifier();
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

	public static class ComponentVariableContext extends ParserRuleContext {
		public IndexedVariableContext indexedVariable() {
			return getRuleContext(IndexedVariableContext.class,0);
		}
		public FieldDesignatorContext fieldDesignator() {
			return getRuleContext(FieldDesignatorContext.class,0);
		}
		public FileBufferContext fileBuffer() {
			return getRuleContext(FileBufferContext.class,0);
		}
		public ComponentVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterComponentVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitComponentVariable(this);
		}
	}

	public final ComponentVariableContext componentVariable() throws RecognitionException {
		ComponentVariableContext _localctx = new ComponentVariableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_componentVariable);
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				indexedVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				fieldDesignator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				fileBuffer();
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

	public static class IndexedVariableContext extends ParserRuleContext {
		public ArrayVariableContext arrayVariable() {
			return getRuleContext(ArrayVariableContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IndexedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIndexedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIndexedVariable(this);
		}
	}

	public final IndexedVariableContext indexedVariable() throws RecognitionException {
		IndexedVariableContext _localctx = new IndexedVariableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_indexedVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			arrayVariable();
			setState(606);
			match(LBRACKET);
			setState(607);
			expression();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(608);
				match(COMMA);
				setState(609);
				expression();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			match(RBRACKET);
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

	public static class ArrayVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterArrayVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitArrayVariable(this);
		}
	}

	public final ArrayVariableContext arrayVariable() throws RecognitionException {
		ArrayVariableContext _localctx = new ArrayVariableContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrayVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			identifier();
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

	public static class FieldDesignatorContext extends ParserRuleContext {
		public RecordVariableContext recordVariable() {
			return getRuleContext(RecordVariableContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(PascalParser.PERIOD, 0); }
		public FieldIdentifierContext fieldIdentifier() {
			return getRuleContext(FieldIdentifierContext.class,0);
		}
		public FieldDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFieldDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFieldDesignator(this);
		}
	}

	public final FieldDesignatorContext fieldDesignator() throws RecognitionException {
		FieldDesignatorContext _localctx = new FieldDesignatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fieldDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			recordVariable();
			setState(620);
			match(PERIOD);
			setState(621);
			fieldIdentifier();
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

	public static class RecordVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRecordVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRecordVariable(this);
		}
	}

	public final RecordVariableContext recordVariable() throws RecognitionException {
		RecordVariableContext _localctx = new RecordVariableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_recordVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			identifier();
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

	public static class FieldIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFieldIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFieldIdentifier(this);
		}
	}

	public final FieldIdentifierContext fieldIdentifier() throws RecognitionException {
		FieldIdentifierContext _localctx = new FieldIdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_fieldIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			identifier();
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

	public static class FileBufferContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FileBufferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileBuffer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFileBuffer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFileBuffer(this);
		}
	}

	public final FileBufferContext fileBuffer() throws RecognitionException {
		FileBufferContext _localctx = new FileBufferContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fileBuffer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			identifier();
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

	public static class FileVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FileVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFileVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFileVariable(this);
		}
	}

	public final FileVariableContext fileVariable() throws RecognitionException {
		FileVariableContext _localctx = new FileVariableContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_fileVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			identifier();
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

	public static class ReferencedVariableContext extends ParserRuleContext {
		public PointerVariableContext pointerVariable() {
			return getRuleContext(PointerVariableContext.class,0);
		}
		public ReferencedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterReferencedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitReferencedVariable(this);
		}
	}

	public final ReferencedVariableContext referencedVariable() throws RecognitionException {
		ReferencedVariableContext _localctx = new ReferencedVariableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_referencedVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			pointerVariable();
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

	public static class PointerVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PointerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterPointerVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitPointerVariable(this);
		}
	}

	public final PointerVariableContext pointerVariable() throws RecognitionException {
		PointerVariableContext _localctx = new PointerVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pointerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			identifier();
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
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_expression);
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				simpleExpression(0);
				setState(637);
				relationalOperator();
				setState(638);
				simpleExpression(0);
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TerminalNode NE() { return getToken(PascalParser.NE, 0); }
		public TerminalNode LTEQ() { return getToken(PascalParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(PascalParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(PascalParser.LT, 0); }
		public TerminalNode GT() { return getToken(PascalParser.GT, 0); }
		public TerminalNode IN() { return getToken(PascalParser.IN, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (IN - 23)) | (1L << (EQUAL - 23)) | (1L << (NE - 23)) | (1L << (LTEQ - 23)) | (1L << (GTEQ - 23)) | (1L << (LT - 23)) | (1L << (GT - 23)))) != 0)) ) {
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AddingOperatorContext addingOperator() {
			return getRuleContext(AddingOperatorContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case REAL:
			case INTEGER:
			case IDENTIFIER:
			case STRING_LITERAL:
			case LPAREN:
			case LBRACKET:
				{
				setState(645);
				term(0);
				}
				break;
			case PLUSOP:
			case MINUSOP:
				{
				setState(646);
				sign();
				setState(647);
				term(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
					setState(651);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(652);
					addingOperator();
					setState(653);
					term(0);
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddingOperatorContext extends ParserRuleContext {
		public TerminalNode PLUSOP() { return getToken(PascalParser.PLUSOP, 0); }
		public TerminalNode MINUSOP() { return getToken(PascalParser.MINUSOP, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public AddingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAddingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAddingOperator(this);
		}
	}

	public final AddingOperatorContext addingOperator() throws RecognitionException {
		AddingOperatorContext _localctx = new AddingOperatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_addingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUSOP) | (1L << MINUSOP))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultiplyingOperatorContext multiplyingOperator() {
			return getRuleContext(MultiplyingOperatorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(663);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(665);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(666);
					multiplyingOperator();
					setState(667);
					factor();
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplyingOperatorContext extends ParserRuleContext {
		public TerminalNode MULTOP() { return getToken(PascalParser.MULTOP, 0); }
		public TerminalNode DIVOP() { return getToken(PascalParser.DIVOP, 0); }
		public TerminalNode DIV() { return getToken(PascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PascalParser.AND, 0); }
		public MultiplyingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMultiplyingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMultiplyingOperator(this);
		}
	}

	public final MultiplyingOperatorContext multiplyingOperator() throws RecognitionException {
		MultiplyingOperatorContext _localctx = new MultiplyingOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_multiplyingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << MULTOP) | (1L << DIVOP))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_factor);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				unsignedConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				match(LPAREN);
				setState(679);
				expression();
				setState(680);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				functionDesignator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(683);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(684);
				match(NOT);
				setState(685);
				factor();
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unsignedConstant);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				string();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				constantIdentifier();
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunctionDesignator(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_functionDesignator);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				functionIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				functionIdentifier();
				setState(695);
				match(LPAREN);
				setState(696);
				actualParameter();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(697);
					match(COMMA);
					setState(698);
					actualParameter();
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(704);
				match(RPAREN);
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunctionIdentifier(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			identifier();
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PascalParser.LBRACKET, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PascalParser.RBRACKET, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(LBRACKET);
			setState(711);
			elementList();
			setState(712);
			match(RBRACKET);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elementList);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case REAL:
			case INTEGER:
			case IDENTIFIER:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
			case LPAREN:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				element();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(715);
					match(COMMA);
					setState(716);
					element();
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				empty();
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

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT_DOT() { return getToken(PascalParser.DOT_DOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_element);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				expression();
				setState(727);
				match(DOT_DOT);
				setState(728);
				expression();
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public ProcedureIdentifierContext procedureIdentifier() {
			return getRuleContext(ProcedureIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureStatement(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_procedureStatement);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				procedureIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				procedureIdentifier();
				setState(734);
				match(LPAREN);
				setState(735);
				actualParameter();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(736);
					match(COMMA);
					setState(737);
					actualParameter();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				match(RPAREN);
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

	public static class ProcedureIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProcedureIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureIdentifier(this);
		}
	}

	public final ProcedureIdentifierContext procedureIdentifier() throws RecognitionException {
		ProcedureIdentifierContext _localctx = new ProcedureIdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_procedureIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			identifier();
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ProcedureIdentifierContext procedureIdentifier() {
			return getRuleContext(ProcedureIdentifierContext.class,0);
		}
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_actualParameter);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				procedureIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(752);
				functionIdentifier();
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

	public static class GoToStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(PascalParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GoToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterGoToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitGoToStatement(this);
		}
	}

	public final GoToStatementContext goToStatement() throws RecognitionException {
		GoToStatementContext _localctx = new GoToStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_goToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(GOTO);
			setState(756);
			label();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			empty();
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetitiveStatementContext repetitiveStatement() {
			return getRuleContext(RepetitiveStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStructuredStatement(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_structuredStatement);
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				repetitiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(765);
				withStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(BEGIN);
			setState(769);
			statement();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(770);
				match(SEMICOLON);
				setState(771);
				statement();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(END);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_conditionalStatement);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				caseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ifStatement);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(IF);
				setState(784);
				expression();
				setState(785);
				match(THEN);
				setState(786);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				match(IF);
				setState(789);
				expression();
				setState(790);
				match(THEN);
				setState(791);
				statement();
				setState(792);
				match(ELSE);
				setState(793);
				statement();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(CASE);
			setState(798);
			expression();
			setState(799);
			match(OF);
			setState(800);
			caseListElement();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(801);
				match(SEMICOLON);
				setState(802);
				caseListElement();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808);
			match(END);
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

	public static class CaseListElementContext extends ParserRuleContext {
		public CaseLabelListContext caseLabelList() {
			return getRuleContext(CaseLabelListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCaseListElement(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_caseListElement);
		try {
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
			case INTEGER:
			case IDENTIFIER:
			case CHARACTER:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				caseLabelList();
				setState(811);
				match(COLON);
				setState(812);
				statement();
				}
				break;
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				empty();
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

	public static class CaseLabelListContext extends ParserRuleContext {
		public List<CaseLabelContext> caseLabel() {
			return getRuleContexts(CaseLabelContext.class);
		}
		public CaseLabelContext caseLabel(int i) {
			return getRuleContext(CaseLabelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public CaseLabelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabelList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCaseLabelList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCaseLabelList(this);
		}
	}

	public final CaseLabelListContext caseLabelList() throws RecognitionException {
		CaseLabelListContext _localctx = new CaseLabelListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_caseLabelList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			caseLabel();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(818);
				match(COMMA);
				setState(819);
				caseLabel();
				}
				}
				setState(824);
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

	public static class RepetitiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetitiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRepetitiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRepetitiveStatement(this);
		}
	}

	public final RepetitiveStatementContext repetitiveStatement() throws RecognitionException {
		RepetitiveStatementContext _localctx = new RepetitiveStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_repetitiveStatement);
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(WHILE);
			setState(831);
			expression();
			setState(832);
			match(DO);
			setState(833);
			statement();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PascalParser.REPEAT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode UNTIL() { return getToken(PascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRepeatStatement(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(REPEAT);
			setState(836);
			statement();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(837);
				match(SEMICOLON);
				setState(838);
				statement();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(UNTIL);
			setState(845);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PascalParser.FOR, 0); }
		public ControlVariableContext controlVariable() {
			return getRuleContext(ControlVariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(FOR);
			setState(848);
			controlVariable();
			setState(849);
			match(ASSIGN);
			setState(850);
			forList();
			setState(851);
			match(DO);
			setState(852);
			statement();
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

	public static class ControlVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ControlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterControlVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitControlVariable(this);
		}
	}

	public final ControlVariableContext controlVariable() throws RecognitionException {
		ControlVariableContext _localctx = new ControlVariableContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_controlVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			identifier();
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

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalParser.TO, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode DOWNTO() { return getToken(PascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitForList(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_forList);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				initialValue();
				setState(857);
				match(TO);
				setState(858);
				finalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				initialValue();
				setState(861);
				match(DOWNTO);
				setState(862);
				finalValue();
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

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInitialValue(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFinalValue(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PascalParser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(WITH);
			setState(871);
			recordVariableList();
			setState(872);
			match(DO);
			setState(873);
			statement();
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

	public static class RecordVariableListContext extends ParserRuleContext {
		public List<RecordVariableContext> recordVariable() {
			return getRuleContexts(RecordVariableContext.class);
		}
		public RecordVariableContext recordVariable(int i) {
			return getRuleContext(RecordVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRecordVariableList(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			recordVariable();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(876);
				match(COMMA);
				setState(877);
				recordVariable();
				}
				}
				setState(882);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 71:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 73:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u0376\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\2\5\2\u00d8\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\u00e5"+
		"\n\4\f\4\16\4\u00e8\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00f8\n\7\f\7\16\7\u00fb\13\7\3\7\3\7\5\7\u00ff\n\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0108\n\t\f\t\16\t\u010b\13\t\3\t\3\t\5\t"+
		"\u010f\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u011f\n\13\3\f\3\f\5\f\u0123\n\f\3\r\3\r\3\16\3\16\3\17\5\17"+
		"\u012a\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0139\n\23\f\23\16\23\u013c\13\23\3\23\3\23\5\23\u0140\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0149\n\25\3\26\3\26\3\26\5\26"+
		"\u014e\n\26\3\27\3\27\3\27\3\27\7\27\u0154\n\27\f\27\16\27\u0157\13\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0165"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\7\33\u016c\n\33\f\33\16\33\u016f\13\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0183\n\37\3 \3 \3 \7 \u0188\n \f \16 \u018b"+
		"\13 \3!\3!\3!\7!\u0190\n!\f!\16!\u0193\13!\3!\3!\3!\3!\5!\u0199\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01a2\n\"\f\"\16\"\u01a5\13\"\3#\3#\3#\3"+
		"#\5#\u01ab\n#\3$\3$\3$\3$\3$\5$\u01b2\n$\3%\3%\3&\3&\3&\3&\3\'\3\'\3("+
		"\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\7*\u01c7\n*\f*\16*\u01ca\13*\3*\3*\5*\u01ce"+
		"\n*\3+\3+\3+\7+\u01d3\n+\f+\16+\u01d6\13+\3+\3+\3+\3,\3,\3,\7,\u01de\n"+
		",\f,\16,\u01e1\13,\3-\3-\5-\u01e5\n-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\7/\u01f4\n/\f/\16/\u01f7\13/\3/\3/\3/\5/\u01fc\n/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0207\n\60\f\60\16\60\u020a\13\60"+
		"\5\60\u020c\n\60\3\61\3\61\3\61\7\61\u0211\n\61\f\61\16\61\u0214\13\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u0228\n\63\f\63\16\63\u022b\13\63\3\63\3\63"+
		"\3\63\3\63\5\63\u0231\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u023c\n\66\3\67\3\67\5\67\u0240\n\67\38\38\38\38\58\u0246\n8\39"+
		"\39\39\39\39\39\39\39\59\u0250\n9\3:\3:\3:\5:\u0255\n:\3;\3;\3<\3<\3="+
		"\3=\3=\5=\u025e\n=\3>\3>\3>\3>\3>\7>\u0265\n>\f>\16>\u0268\13>\3>\3>\3"+
		"?\3?\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\5"+
		"G\u0283\nG\3H\3H\3I\3I\3I\3I\3I\5I\u028c\nI\3I\3I\3I\3I\7I\u0292\nI\f"+
		"I\16I\u0295\13I\3J\3J\3K\3K\3K\3K\3K\3K\3K\7K\u02a0\nK\fK\16K\u02a3\13"+
		"K\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u02b1\nM\3N\3N\3N\5N\u02b6\n"+
		"N\3O\3O\3O\3O\3O\3O\7O\u02be\nO\fO\16O\u02c1\13O\3O\3O\5O\u02c5\nO\3P"+
		"\3P\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u02d0\nR\fR\16R\u02d3\13R\3R\5R\u02d6\nR\3"+
		"S\3S\3S\3S\3S\5S\u02dd\nS\3T\3T\3T\3T\3T\3T\7T\u02e5\nT\fT\16T\u02e8\13"+
		"T\3T\3T\5T\u02ec\nT\3U\3U\3V\3V\3V\3V\5V\u02f4\nV\3W\3W\3W\3X\3X\3Y\3"+
		"Y\3Z\3Z\3Z\3Z\5Z\u0301\nZ\3[\3[\3[\3[\7[\u0307\n[\f[\16[\u030a\13[\3["+
		"\3[\3\\\3\\\5\\\u0310\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u031e"+
		"\n]\3^\3^\3^\3^\3^\3^\7^\u0326\n^\f^\16^\u0329\13^\3^\3^\3_\3_\3_\3_\3"+
		"_\5_\u0332\n_\3`\3`\3`\7`\u0337\n`\f`\16`\u033a\13`\3a\3a\3a\5a\u033f"+
		"\na\3b\3b\3b\3b\3b\3c\3c\3c\3c\7c\u034a\nc\fc\16c\u034d\13c\3c\3c\3c\3"+
		"d\3d\3d\3d\3d\3d\3d\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0363\nf\3g\3g\3"+
		"h\3h\3i\3i\3i\3i\3i\3j\3j\3j\7j\u0371\nj\fj\16j\u0374\13j\3j\2\4\u0090"+
		"\u0094k\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\2\6\3\2>?\4\2\31\31CH\4\2$$>?\6\2\3\3\r\r\35\35@A\2\u0368\2\u00d4\3\2"+
		"\2\2\4\u00dd\3\2\2\2\6\u00e1\3\2\2\2\b\u00e9\3\2\2\2\n\u00eb\3\2\2\2\f"+
		"\u00fe\3\2\2\2\16\u0100\3\2\2\2\20\u010e\3\2\2\2\22\u0110\3\2\2\2\24\u011e"+
		"\3\2\2\2\26\u0122\3\2\2\2\30\u0124\3\2\2\2\32\u0126\3\2\2\2\34\u0129\3"+
		"\2\2\2\36\u012d\3\2\2\2 \u012f\3\2\2\2\"\u0131\3\2\2\2$\u013f\3\2\2\2"+
		"&\u0141\3\2\2\2(\u0148\3\2\2\2*\u014d\3\2\2\2,\u014f\3\2\2\2.\u015a\3"+
		"\2\2\2\60\u015e\3\2\2\2\62\u0164\3\2\2\2\64\u0166\3\2\2\2\66\u0174\3\2"+
		"\2\28\u0176\3\2\2\2:\u0178\3\2\2\2<\u0182\3\2\2\2>\u0184\3\2\2\2@\u0198"+
		"\3\2\2\2B\u019a\3\2\2\2D\u01aa\3\2\2\2F\u01b1\3\2\2\2H\u01b3\3\2\2\2J"+
		"\u01b5\3\2\2\2L\u01b9\3\2\2\2N\u01bb\3\2\2\2P\u01bf\3\2\2\2R\u01cd\3\2"+
		"\2\2T\u01cf\3\2\2\2V\u01df\3\2\2\2X\u01e4\3\2\2\2Z\u01e6\3\2\2\2\\\u01fb"+
		"\3\2\2\2^\u020b\3\2\2\2`\u020d\3\2\2\2b\u0218\3\2\2\2d\u0230\3\2\2\2f"+
		"\u0232\3\2\2\2h\u0234\3\2\2\2j\u023b\3\2\2\2l\u023f\3\2\2\2n\u0245\3\2"+
		"\2\2p\u024f\3\2\2\2r\u0254\3\2\2\2t\u0256\3\2\2\2v\u0258\3\2\2\2x\u025d"+
		"\3\2\2\2z\u025f\3\2\2\2|\u026b\3\2\2\2~\u026d\3\2\2\2\u0080\u0271\3\2"+
		"\2\2\u0082\u0273\3\2\2\2\u0084\u0275\3\2\2\2\u0086\u0277\3\2\2\2\u0088"+
		"\u0279\3\2\2\2\u008a\u027b\3\2\2\2\u008c\u0282\3\2\2\2\u008e\u0284\3\2"+
		"\2\2\u0090\u028b\3\2\2\2\u0092\u0296\3\2\2\2\u0094\u0298\3\2\2\2\u0096"+
		"\u02a4\3\2\2\2\u0098\u02b0\3\2\2\2\u009a\u02b5\3\2\2\2\u009c\u02c4\3\2"+
		"\2\2\u009e\u02c6\3\2\2\2\u00a0\u02c8\3\2\2\2\u00a2\u02d5\3\2\2\2\u00a4"+
		"\u02dc\3\2\2\2\u00a6\u02eb\3\2\2\2\u00a8\u02ed\3\2\2\2\u00aa\u02f3\3\2"+
		"\2\2\u00ac\u02f5\3\2\2\2\u00ae\u02f8\3\2\2\2\u00b0\u02fa\3\2\2\2\u00b2"+
		"\u0300\3\2\2\2\u00b4\u0302\3\2\2\2\u00b6\u030f\3\2\2\2\u00b8\u031d\3\2"+
		"\2\2\u00ba\u031f\3\2\2\2\u00bc\u0331\3\2\2\2\u00be\u0333\3\2\2\2\u00c0"+
		"\u033e\3\2\2\2\u00c2\u0340\3\2\2\2\u00c4\u0345\3\2\2\2\u00c6\u0351\3\2"+
		"\2\2\u00c8\u0358\3\2\2\2\u00ca\u0362\3\2\2\2\u00cc\u0364\3\2\2\2\u00ce"+
		"\u0366\3\2\2\2\u00d0\u0368\3\2\2\2\u00d2\u036d\3\2\2\2\u00d4\u00d5\7\'"+
		"\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d8\5\4\3\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7N\2\2\u00da\u00db\5\n"+
		"\6\2\u00db\u00dc\7Y\2\2\u00dc\3\3\2\2\2\u00dd\u00de\7P\2\2\u00de\u00df"+
		"\5\6\4\2\u00df\u00e0\7Q\2\2\u00e0\5\3\2\2\2\u00e1\u00e6\5\b\5\2\u00e2"+
		"\u00e3\7O\2\2\u00e3\u00e5\5\b\5\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\7\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\7;\2\2\u00ea\t\3\2\2\2\u00eb\u00ec\5\f\7\2\u00ec"+
		"\u00ed\5\20\t\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\5R*\2\u00ef\u00f0\5V,"+
		"\2\u00f0\u00f1\5h\65\2\u00f1\13\3\2\2\2\u00f2\u00ff\5\u00b0Y\2\u00f3\u00f4"+
		"\7\34\2\2\u00f4\u00f9\5\16\b\2\u00f5\u00f6\7O\2\2\u00f6\u00f8\5\16\b\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7N\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f3\3\2\2\2\u00ff\r\3\2\2\2"+
		"\u0100\u0101\5\30\r\2\u0101\17\3\2\2\2\u0102\u010f\5\u00b0Y\2\u0103\u0104"+
		"\7\t\2\2\u0104\u0109\5\22\n\2\u0105\u0106\7N\2\2\u0106\u0108\5\22\n\2"+
		"\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7N\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0102\3\2\2\2\u010e\u0103\3\2\2\2\u010f\21\3\2\2"+
		"\2\u0110\u0111\5\b\5\2\u0111\u0112\7C\2\2\u0112\u0113\5\24\13\2\u0113"+
		"\23\3\2\2\2\u0114\u011f\5\26\f\2\u0115\u0116\5\36\20\2\u0116\u0117\5\26"+
		"\f\2\u0117\u011f\3\2\2\2\u0118\u011f\5 \21\2\u0119\u011a\5\36\20\2\u011a"+
		"\u011b\5 \21\2\u011b\u011f\3\2\2\2\u011c\u011f\5\"\22\2\u011d\u011f\7"+
		"<\2\2\u011e\u0114\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0118\3\2\2\2\u011e"+
		"\u0119\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\25\3\2\2"+
		"\2\u0120\u0123\5\30\r\2\u0121\u0123\5\32\16\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\27\3\2\2\2\u0124\u0125\7:\2\2\u0125\31\3\2\2\2\u0126"+
		"\u0127\79\2\2\u0127\33\3\2\2\2\u0128\u012a\5\36\20\2\u0129\u0128\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5\30\r\2\u012c"+
		"\35\3\2\2\2\u012d\u012e\t\2\2\2\u012e\37\3\2\2\2\u012f\u0130\5\b\5\2\u0130"+
		"!\3\2\2\2\u0131\u0132\7=\2\2\u0132#\3\2\2\2\u0133\u0140\5\u00b0Y\2\u0134"+
		"\u0135\7\61\2\2\u0135\u013a\5&\24\2\u0136\u0137\7N\2\2\u0137\u0139\5&"+
		"\24\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7N"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0134\3\2\2\2\u0140"+
		"%\3\2\2\2\u0141\u0142\5\b\5\2\u0142\u0143\7C\2\2\u0143\u0144\5(\25\2\u0144"+
		"\'\3\2\2\2\u0145\u0149\5*\26\2\u0146\u0149\5\62\32\2\u0147\u0149\5P)\2"+
		"\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149)\3"+
		"\2\2\2\u014a\u014e\5,\27\2\u014b\u014e\5.\30\2\u014c\u014e\5\60\31\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e+\3\2\2\2"+
		"\u014f\u0150\7P\2\2\u0150\u0155\5\b\5\2\u0151\u0152\7O\2\2\u0152\u0154"+
		"\5\b\5\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7Q"+
		"\2\2\u0159-\3\2\2\2\u015a\u015b\5\24\13\2\u015b\u015c\7X\2\2\u015c\u015d"+
		"\5\24\13\2\u015d/\3\2\2\2\u015e\u015f\5\b\5\2\u015f\61\3\2\2\2\u0160\u0165"+
		"\5\64\33\2\u0161\u0165\5:\36\2\u0162\u0165\5J&\2\u0163\u0165\5N(\2\u0164"+
		"\u0160\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\63\3\2\2\2\u0166\u0167\7\4\2\2\u0167\u0168\7R\2\2\u0168\u016d"+
		"\5\66\34\2\u0169\u016a\7O\2\2\u016a\u016c\5\66\34\2\u016b\u0169\3\2\2"+
		"\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7S\2\2\u0171\u0172\7!\2\2\u0172"+
		"\u0173\58\35\2\u0173\65\3\2\2\2\u0174\u0175\5*\26\2\u0175\67\3\2\2\2\u0176"+
		"\u0177\5(\25\2\u01779\3\2\2\2\u0178\u0179\7(\2\2\u0179\u017a\5<\37\2\u017a"+
		"\u017b\7\21\2\2\u017b;\3\2\2\2\u017c\u0183\5> \2\u017d\u017e\5> \2\u017e"+
		"\u017f\7N\2\2\u017f\u0180\5F$\2\u0180\u0183\3\2\2\2\u0181\u0183\5F$\2"+
		"\u0182\u017c\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u0181\3\2\2\2\u0183=\3"+
		"\2\2\2\u0184\u0189\5@!\2\u0185\u0186\7N\2\2\u0186\u0188\5@!\2\u0187\u0185"+
		"\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"?\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0191\5\u0082B\2\u018d\u018e\7O\2"+
		"\2\u018e\u0190\5\u0082B\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194\u0195\7Z\2\2\u0195\u0196\5(\25\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0199\5\u00b0Y\2\u0198\u018c\3\2\2\2\u0198\u0197\3\2\2\2\u0199A\3\2\2"+
		"\2\u019a\u019b\7\b\2\2\u019b\u019c\5D#\2\u019c\u019d\5\60\31\2\u019d\u019e"+
		"\7!\2\2\u019e\u01a3\5F$\2\u019f\u01a0\7N\2\2\u01a0\u01a2\5F$\2\u01a1\u019f"+
		"\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"C\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\5\u0082B\2\u01a7\u01a8\7Z\2"+
		"\2\u01a8\u01ab\3\2\2\2\u01a9\u01ab\5\u00b0Y\2\u01aa\u01a6\3\2\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01abE\3\2\2\2\u01ac\u01ad\5\u00be`\2\u01ad\u01ae\7Z\2"+
		"\2\u01ae\u01af\5<\37\2\u01af\u01b2\3\2\2\2\u01b0\u01b2\5\u00b0Y\2\u01b1"+
		"\u01ac\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2G\3\2\2\2\u01b3\u01b4\5\24\13"+
		"\2\u01b4I\3\2\2\2\u01b5\u01b6\7*\2\2\u01b6\u01b7\7!\2\2\u01b7\u01b8\5"+
		"L\'\2\u01b8K\3\2\2\2\u01b9\u01ba\5*\26\2\u01baM\3\2\2\2\u01bb\u01bc\7"+
		"\23\2\2\u01bc\u01bd\7!\2\2\u01bd\u01be\5(\25\2\u01beO\3\2\2\2\u01bf\u01c0"+
		"\5\60\31\2\u01c0Q\3\2\2\2\u01c1\u01ce\5\u00b0Y\2\u01c2\u01c3\7\65\2\2"+
		"\u01c3\u01c8\5T+\2\u01c4\u01c5\7N\2\2\u01c5\u01c7\5T+\2\u01c6\u01c4\3"+
		"\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7N\2\2\u01cc\u01ce\3\2"+
		"\2\2\u01cd\u01c1\3\2\2\2\u01cd\u01c2\3\2\2\2\u01ceS\3\2\2\2\u01cf\u01d4"+
		"\5\b\5\2\u01d0\u01d1\7O\2\2\u01d1\u01d3\5\b\5\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\7Z\2\2\u01d8\u01d9\5(\25\2\u01d9"+
		"U\3\2\2\2\u01da\u01db\5X-\2\u01db\u01dc\7N\2\2\u01dc\u01de\3\2\2\2\u01dd"+
		"\u01da\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0W\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\5Z.\2\u01e3\u01e5"+
		"\5b\62\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5Y\3\2\2\2\u01e6"+
		"\u01e7\5\\/\2\u01e7\u01e8\5\n\6\2\u01e8[\3\2\2\2\u01e9\u01ea\7&\2\2\u01ea"+
		"\u01eb\5\b\5\2\u01eb\u01ec\7N\2\2\u01ec\u01fc\3\2\2\2\u01ed\u01ee\7&\2"+
		"\2\u01ee\u01ef\5\b\5\2\u01ef\u01f0\7P\2\2\u01f0\u01f5\5^\60\2\u01f1\u01f2"+
		"\7N\2\2\u01f2\u01f4\5^\60\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01f9\7Q\2\2\u01f9\u01fa\7N\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01e9"+
		"\3\2\2\2\u01fb\u01ed\3\2\2\2\u01fc]\3\2\2\2\u01fd\u020c\5`\61\2\u01fe"+
		"\u01ff\7\65\2\2\u01ff\u020c\5`\61\2\u0200\u0201\7\25\2\2\u0201\u020c\5"+
		"`\61\2\u0202\u0203\7&\2\2\u0203\u0208\5\b\5\2\u0204\u0205\7O\2\2\u0205"+
		"\u0207\5\b\5\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u01fd\3\2\2\2\u020b\u01fe\3\2\2\2\u020b\u0200\3\2\2\2\u020b\u0202\3\2"+
		"\2\2\u020c_\3\2\2\2\u020d\u0212\5\b\5\2\u020e\u020f\7O\2\2\u020f\u0211"+
		"\5\b\5\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7Z"+
		"\2\2\u0216\u0217\5\60\31\2\u0217a\3\2\2\2\u0218\u0219\5d\63\2\u0219\u021a"+
		"\5\n\6\2\u021ac\3\2\2\2\u021b\u021c\7\25\2\2\u021c\u021d\5\b\5\2\u021d"+
		"\u021e\7Z\2\2\u021e\u021f\5f\64\2\u021f\u0220\7N\2\2\u0220\u0231\3\2\2"+
		"\2\u0221\u0222\7\25\2\2\u0222\u0223\5\b\5\2\u0223\u0224\7P\2\2\u0224\u0229"+
		"\5^\60\2\u0225\u0226\7N\2\2\u0226\u0228\5^\60\2\u0227\u0225\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7Q\2\2\u022d\u022e\5f\64\2\u022e"+
		"\u022f\7N\2\2\u022f\u0231\3\2\2\2\u0230\u021b\3\2\2\2\u0230\u0221\3\2"+
		"\2\2\u0231e\3\2\2\2\u0232\u0233\5\60\31\2\u0233g\3\2\2\2\u0234\u0235\5"+
		"\u00b4[\2\u0235i\3\2\2\2\u0236\u023c\5l\67\2\u0237\u0238\5\16\b\2\u0238"+
		"\u0239\7Z\2\2\u0239\u023a\5l\67\2\u023a\u023c\3\2\2\2\u023b\u0236\3\2"+
		"\2\2\u023b\u0237\3\2\2\2\u023ck\3\2\2\2\u023d\u0240\5n8\2\u023e\u0240"+
		"\5\u00b2Z\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240m\3\2\2\2\u0241"+
		"\u0246\5p9\2\u0242\u0246\5\u00a6T\2\u0243\u0246\5\u00acW\2\u0244\u0246"+
		"\5\u00aeX\2\u0245\u0241\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0243\3\2\2"+
		"\2\u0245\u0244\3\2\2\2\u0246o\3\2\2\2\u0247\u0248\5r:\2\u0248\u0249\7"+
		"B\2\2\u0249\u024a\5\u008cG\2\u024a\u0250\3\2\2\2\u024b\u024c\5\u009eP"+
		"\2\u024c\u024d\7B\2\2\u024d\u024e\5\u008cG\2\u024e\u0250\3\2\2\2\u024f"+
		"\u0247\3\2\2\2\u024f\u024b\3\2\2\2\u0250q\3\2\2\2\u0251\u0255\5t;\2\u0252"+
		"\u0255\5x=\2\u0253\u0255\5\u0088E\2\u0254\u0251\3\2\2\2\u0254\u0252\3"+
		"\2\2\2\u0254\u0253\3\2\2\2\u0255s\3\2\2\2\u0256\u0257\5v<\2\u0257u\3\2"+
		"\2\2\u0258\u0259\5\b\5\2\u0259w\3\2\2\2\u025a\u025e\5z>\2\u025b\u025e"+
		"\5~@\2\u025c\u025e\5\u0084C\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2"+
		"\u025d\u025c\3\2\2\2\u025ey\3\2\2\2\u025f\u0260\5|?\2\u0260\u0261\7R\2"+
		"\2\u0261\u0266\5\u008cG\2\u0262\u0263\7O\2\2\u0263\u0265\5\u008cG\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\7S\2\2\u026a"+
		"{\3\2\2\2\u026b\u026c\5\b\5\2\u026c}\3\2\2\2\u026d\u026e\5\u0080A\2\u026e"+
		"\u026f\7Y\2\2\u026f\u0270\5\u0082B\2\u0270\177\3\2\2\2\u0271\u0272\5\b"+
		"\5\2\u0272\u0081\3\2\2\2\u0273\u0274\5\b\5\2\u0274\u0083\3\2\2\2\u0275"+
		"\u0276\5\b\5\2\u0276\u0085\3\2\2\2\u0277\u0278\5\b\5\2\u0278\u0087\3\2"+
		"\2\2\u0279\u027a\5\u008aF\2\u027a\u0089\3\2\2\2\u027b\u027c\5\b\5\2\u027c"+
		"\u008b\3\2\2\2\u027d\u0283\5\u0090I\2\u027e\u027f\5\u0090I\2\u027f\u0280"+
		"\5\u008eH\2\u0280\u0281\5\u0090I\2\u0281\u0283\3\2\2\2\u0282\u027d\3\2"+
		"\2\2\u0282\u027e\3\2\2\2\u0283\u008d\3\2\2\2\u0284\u0285\t\3\2\2\u0285"+
		"\u008f\3\2\2\2\u0286\u0287\bI\1\2\u0287\u028c\5\u0094K\2\u0288\u0289\5"+
		"\36\20\2\u0289\u028a\5\u0094K\2\u028a\u028c\3\2\2\2\u028b\u0286\3\2\2"+
		"\2\u028b\u0288\3\2\2\2\u028c\u0293\3\2\2\2\u028d\u028e\f\3\2\2\u028e\u028f"+
		"\5\u0092J\2\u028f\u0290\5\u0094K\2\u0290\u0292\3\2\2\2\u0291\u028d\3\2"+
		"\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0091\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0297\t\4\2\2\u0297\u0093\3\2"+
		"\2\2\u0298\u0299\bK\1\2\u0299\u029a\5\u0098M\2\u029a\u02a1\3\2\2\2\u029b"+
		"\u029c\f\3\2\2\u029c\u029d\5\u0096L\2\u029d\u029e\5\u0098M\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u029b\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u0095\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5\t\5"+
		"\2\2\u02a5\u0097\3\2\2\2\u02a6\u02b1\5r:\2\u02a7\u02b1\5\u009aN\2\u02a8"+
		"\u02a9\7P\2\2\u02a9\u02aa\5\u008cG\2\u02aa\u02ab\7Q\2\2\u02ab\u02b1\3"+
		"\2\2\2\u02ac\u02b1\5\u009cO\2\u02ad\u02b1\5\u00a0Q\2\u02ae\u02af\7\37"+
		"\2\2\u02af\u02b1\5\u0098M\2\u02b0\u02a6\3\2\2\2\u02b0\u02a7\3\2\2\2\u02b0"+
		"\u02a8\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b1\u0099\3\2\2\2\u02b2\u02b6\5\26\f\2\u02b3\u02b6\5\"\22\2\u02b4"+
		"\u02b6\5 \21\2\u02b5\u02b2\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2"+
		"\2\2\u02b6\u009b\3\2\2\2\u02b7\u02c5\5\u009eP\2\u02b8\u02b9\5\u009eP\2"+
		"\u02b9\u02ba\7P\2\2\u02ba\u02bf\5\u00aaV\2\u02bb\u02bc\7O\2\2\u02bc\u02be"+
		"\5\u00aaV\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2"+
		"\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3"+
		"\7Q\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02b7\3\2\2\2\u02c4\u02b8\3\2\2\2\u02c5"+
		"\u009d\3\2\2\2\u02c6\u02c7\5\b\5\2\u02c7\u009f\3\2\2\2\u02c8\u02c9\7R"+
		"\2\2\u02c9\u02ca\5\u00a2R\2\u02ca\u02cb\7S\2\2\u02cb\u00a1\3\2\2\2\u02cc"+
		"\u02d1\5\u00a4S\2\u02cd\u02ce\7O\2\2\u02ce\u02d0\5\u00a4S\2\u02cf\u02cd"+
		"\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d6\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d6\5\u00b0Y\2\u02d5\u02cc"+
		"\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u00a3\3\2\2\2\u02d7\u02dd\5\u008cG"+
		"\2\u02d8\u02d9\5\u008cG\2\u02d9\u02da\7X\2\2\u02da\u02db\5\u008cG\2\u02db"+
		"\u02dd\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dd\u00a5\3\2"+
		"\2\2\u02de\u02ec\5\u00a8U\2\u02df\u02e0\5\u00a8U\2\u02e0\u02e1\7P\2\2"+
		"\u02e1\u02e6\5\u00aaV\2\u02e2\u02e3\7O\2\2\u02e3\u02e5\5\u00aaV\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\7Q\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02de\3\2\2\2\u02eb\u02df\3\2\2\2\u02ec\u00a7\3\2"+
		"\2\2\u02ed\u02ee\5\b\5\2\u02ee\u00a9\3\2\2\2\u02ef\u02f4\5\u008cG\2\u02f0"+
		"\u02f4\5r:\2\u02f1\u02f4\5\u00a8U\2\u02f2\u02f4\5\u009eP\2\u02f3\u02ef"+
		"\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4"+
		"\u00ab\3\2\2\2\u02f5\u02f6\7\26\2\2\u02f6\u02f7\5\16\b\2\u02f7\u00ad\3"+
		"\2\2\2\u02f8\u02f9\5\u00b0Y\2\u02f9\u00af\3\2\2\2\u02fa\u02fb\3\2\2\2"+
		"\u02fb\u00b1\3\2\2\2\u02fc\u0301\5\u00b4[\2\u02fd\u0301\5\u00b6\\\2\u02fe"+
		"\u0301\5\u00c0a\2\u02ff\u0301\5\u00d0i\2\u0300\u02fc\3\2\2\2\u0300\u02fd"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301\u00b3\3\2\2\2\u0302"+
		"\u0303\7\6\2\2\u0303\u0308\5j\66\2\u0304\u0305\7N\2\2\u0305\u0307\5j\66"+
		"\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\7\21\2\2"+
		"\u030c\u00b5\3\2\2\2\u030d\u0310\5\u00b8]\2\u030e\u0310\5\u00ba^\2\u030f"+
		"\u030d\3\2\2\2\u030f\u030e\3\2\2\2\u0310\u00b7\3\2\2\2\u0311\u0312\7\27"+
		"\2\2\u0312\u0313\5\u008cG\2\u0313\u0314\7.\2\2\u0314\u0315\5j\66\2\u0315"+
		"\u031e\3\2\2\2\u0316\u0317\7\27\2\2\u0317\u0318\5\u008cG\2\u0318\u0319"+
		"\7.\2\2\u0319\u031a\5j\66\2\u031a\u031b\7\20\2\2\u031b\u031c\5j\66\2\u031c"+
		"\u031e\3\2\2\2\u031d\u0311\3\2\2\2\u031d\u0316\3\2\2\2\u031e\u00b9\3\2"+
		"\2\2\u031f\u0320\7\b\2\2\u0320\u0321\5\u008cG\2\u0321\u0322\7!\2\2\u0322"+
		"\u0327\5\u00bc_\2\u0323\u0324\7N\2\2\u0324\u0326\5\u00bc_\2\u0325\u0323"+
		"\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7\21\2\2\u032b\u00bb\3"+
		"\2\2\2\u032c\u032d\5\u00be`\2\u032d\u032e\7Z\2\2\u032e\u032f\5j\66\2\u032f"+
		"\u0332\3\2\2\2\u0330\u0332\5\u00b0Y\2\u0331\u032c\3\2\2\2\u0331\u0330"+
		"\3\2\2\2\u0332\u00bd\3\2\2\2\u0333\u0338\5H%\2\u0334\u0335\7O\2\2\u0335"+
		"\u0337\5H%\2\u0336\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2"+
		"\2\u0338\u0339\3\2\2\2\u0339\u00bf\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033f"+
		"\5\u00c2b\2\u033c\u033f\5\u00c4c\2\u033d\u033f\5\u00c6d\2\u033e\u033b"+
		"\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u00c1\3\2\2\2\u0340"+
		"\u0341\7\66\2\2\u0341\u0342\5\u008cG\2\u0342\u0343\7\16\2\2\u0343\u0344"+
		"\5j\66\2\u0344\u00c3\3\2\2\2\u0345\u0346\7)\2\2\u0346\u034b\5j\66\2\u0347"+
		"\u0348\7N\2\2\u0348\u034a\5j\66\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2"+
		"\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034e\u034f\7\63\2\2\u034f\u0350\5\u008cG\2\u0350\u00c5"+
		"\3\2\2\2\u0351\u0352\7\24\2\2\u0352\u0353\5\u00c8e\2\u0353\u0354\7B\2"+
		"\2\u0354\u0355\5\u00caf\2\u0355\u0356\7\16\2\2\u0356\u0357\5j\66\2\u0357"+
		"\u00c7\3\2\2\2\u0358\u0359\5\b\5\2\u0359\u00c9\3\2\2\2\u035a\u035b\5\u00cc"+
		"g\2\u035b\u035c\7/\2\2\u035c\u035d\5\u00ceh\2\u035d\u0363\3\2\2\2\u035e"+
		"\u035f\5\u00ccg\2\u035f\u0360\7\17\2\2\u0360\u0361\5\u00ceh\2\u0361\u0363"+
		"\3\2\2\2\u0362\u035a\3\2\2\2\u0362\u035e\3\2\2\2\u0363\u00cb\3\2\2\2\u0364"+
		"\u0365\5\u008cG\2\u0365\u00cd\3\2\2\2\u0366\u0367\5\u008cG\2\u0367\u00cf"+
		"\3\2\2\2\u0368\u0369\7\67\2\2\u0369\u036a\5\u00d2j\2\u036a\u036b\7\16"+
		"\2\2\u036b\u036c\5j\66\2\u036c\u00d1\3\2\2\2\u036d\u0372\5\u0080A\2\u036e"+
		"\u036f\7O\2\2\u036f\u0371\5\u0080A\2\u0370\u036e\3\2\2\2\u0371\u0374\3"+
		"\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u00d3\3\2\2\2\u0374"+
		"\u0372\3\2\2\2E\u00d7\u00e6\u00f9\u00fe\u0109\u010e\u011e\u0122\u0129"+
		"\u013a\u013f\u0148\u014d\u0155\u0164\u016d\u0182\u0189\u0191\u0198\u01a3"+
		"\u01aa\u01b1\u01c8\u01cd\u01d4\u01df\u01e4\u01f5\u01fb\u0208\u020b\u0212"+
		"\u0229\u0230\u023b\u023f\u0245\u024f\u0254\u025d\u0266\u0282\u028b\u0293"+
		"\u02a1\u02b0\u02b5\u02bf\u02c4\u02d1\u02d5\u02dc\u02e6\u02eb\u02f3\u0300"+
		"\u0308\u030f\u031d\u0327\u0331\u0338\u033e\u034b\u0362\u0372";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}