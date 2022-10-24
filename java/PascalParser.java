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
		T__0=1, T__1=2, AND=3, ARRAY=4, ASM=5, BEGIN=6, BREAK=7, CASE=8, CONST=9, 
		CONSTRUCTOR=10, CONTINUE=11, DESTRUCTOR=12, DIV=13, DO=14, DOWNTO=15, 
		ELSE=16, END=17, FALSE=18, FILE=19, FOR=20, FUNCTION=21, GOTO=22, IF=23, 
		IMPLEMENTATION=24, IN=25, INLINE=26, INTERFACE=27, LABEL=28, MOD=29, NIL=30, 
		NOT=31, OBJECT=32, OF=33, ON=34, OPERATOR=35, OR=36, PACKED=37, PROCEDURE=38, 
		PROGRAM=39, RECORD=40, REPEAT=41, SET=42, SHL=43, SHR=44, STRING=45, THEN=46, 
		TO=47, TRUE=48, TYPE=49, UNIT=50, UNTIL=51, USES=52, VAR=53, WHILE=54, 
		WITH=55, XOR=56, IDENTIFIER=57, INTEGER=58, REAL=59, CHARACTER=60, STRING_LITERAL=61, 
		PLUSOP=62, MINUSOP=63, MULTOP=64, DIVOP=65, ASSIGN=66, EQUAL=67, NE=68, 
		LTEQ=69, GTEQ=70, LT=71, GT=72, PLUSEQUAL=73, MINUSEQUAL=74, MULTEQUAL=75, 
		DIVEQUAL=76, CARAT=77, SEMICOLON=78, COMMA=79, LPAREN=80, RPAREN=81, LBRACKET=82, 
		RBRACKET=83, LBRACE=84, RBRACE=85, LCOMMENT=86, RCOMMENT=87, DOT_DOT=88, 
		PERIOD=89, COLON=90, WS=91;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifierList = 2, RULE_block = 3, 
		RULE_labelDeclarationPart = 4, RULE_label = 5, RULE_constantDefinitionPart = 6, 
		RULE_constantDefinition = 7, RULE_constant = 8, RULE_unsignedNumber = 9, 
		RULE_unsignedInteger = 10, RULE_unsignedReal = 11, RULE_scaleFactor = 12, 
		RULE_sign = 13, RULE_constantIdentifier = 14, RULE_string = 15, RULE_typeDefinitionPart = 16, 
		RULE_typeDefinition = 17, RULE_type = 18, RULE_simpleType = 19, RULE_scalarType = 20, 
		RULE_subrangeType = 21, RULE_typeIdentifier = 22, RULE_structuredType = 23, 
		RULE_arrayType = 24, RULE_indexType = 25, RULE_componentType = 26, RULE_recordType = 27, 
		RULE_fieldList = 28, RULE_fixedPart = 29, RULE_recordSection = 30, RULE_variantType = 31, 
		RULE_tagField = 32, RULE_variant = 33, RULE_caseLabel = 34, RULE_setType = 35, 
		RULE_baseType = 36, RULE_fileType = 37, RULE_pointerType = 38, RULE_variableDeclarationPart = 39, 
		RULE_variableDeclaration = 40, RULE_procedureAndFunctionDeclarationPart = 41, 
		RULE_procedureOrFunctionDeclaration = 42, RULE_procedureDeclaration = 43, 
		RULE_procedureHeading = 44, RULE_formalParameterSection = 45, RULE_parameterGroup = 46, 
		RULE_functionDeclaration = 47, RULE_functionHeading = 48, RULE_resultType = 49, 
		RULE_statementPart = 50, RULE_statement = 51, RULE_unlabelledStatement = 52, 
		RULE_simpleStatement = 53, RULE_assignmentStatement = 54, RULE_variable = 55, 
		RULE_entireVariable = 56, RULE_variableIdentifier = 57, RULE_componentVariable = 58, 
		RULE_indexedVariable = 59, RULE_arrayVariable = 60, RULE_fieldDesignator = 61, 
		RULE_recordVariable = 62, RULE_fieldIdentifier = 63, RULE_fileBuffer = 64, 
		RULE_fileVariable = 65, RULE_referencedVariable = 66, RULE_pointerVariable = 67, 
		RULE_expression = 68, RULE_relationalOperator = 69, RULE_simpleExpression = 70, 
		RULE_addingOperator = 71, RULE_term = 72, RULE_multiplyingOperator = 73, 
		RULE_factor = 74, RULE_unsignedConstant = 75, RULE_functionDesignator = 76, 
		RULE_functionIdentifier = 77, RULE_set = 78, RULE_elementList = 79, RULE_element = 80, 
		RULE_procedureStatement = 81, RULE_procedureIdentifier = 82, RULE_actualParameter = 83, 
		RULE_goToStatement = 84, RULE_emptyStatement = 85, RULE_empty = 86, RULE_structuredStatement = 87, 
		RULE_compoundStatement = 88, RULE_conditionalStatement = 89, RULE_ifStatement = 90, 
		RULE_caseStatement = 91, RULE_caseListElement = 92, RULE_caseLabelList = 93, 
		RULE_repetitiveStatement = 94, RULE_whileStatement = 95, RULE_repeatStatement = 96, 
		RULE_forStatement = 97, RULE_controlVariable = 98, RULE_forList = 99, 
		RULE_initialValue = 100, RULE_finalValue = 101, RULE_withStatement = 102, 
		RULE_recordVariableList = 103;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "identifierList", "block", "labelDeclarationPart", 
			"label", "constantDefinitionPart", "constantDefinition", "constant", 
			"unsignedNumber", "unsignedInteger", "unsignedReal", "scaleFactor", "sign", 
			"constantIdentifier", "string", "typeDefinitionPart", "typeDefinition", 
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
			null, "'e'", "'E'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "':='", "'='", "'<>'", "'<='", 
			"'>='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'^'", "';'", "','", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'(*'", "'*)'", "'..'", "'.'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AND", "ARRAY", "ASM", "BEGIN", "BREAK", "CASE", "CONST", 
			"CONSTRUCTOR", "CONTINUE", "DESTRUCTOR", "DIV", "DO", "DOWNTO", "ELSE", 
			"END", "FALSE", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IMPLEMENTATION", 
			"IN", "INLINE", "INTERFACE", "LABEL", "MOD", "NIL", "NOT", "OBJECT", 
			"OF", "ON", "OPERATOR", "OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", 
			"REPEAT", "SET", "SHL", "SHR", "STRING", "THEN", "TO", "TRUE", "TYPE", 
			"UNIT", "UNTIL", "USES", "VAR", "WHILE", "WITH", "XOR", "IDENTIFIER", 
			"INTEGER", "REAL", "CHARACTER", "STRING_LITERAL", "PLUSOP", "MINUSOP", 
			"MULTOP", "DIVOP", "ASSIGN", "EQUAL", "NE", "LTEQ", "GTEQ", "LT", "GT", 
			"PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", "DIVEQUAL", "CARAT", "SEMICOLON", 
			"COMMA", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
			"LCOMMENT", "RCOMMENT", "DOT_DOT", "PERIOD", "COLON", "WS"
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(PROGRAM);
			setState(209);
			match(IDENTIFIER);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(210);
				programHeading();
				}
			}

			setState(213);
			match(SEMICOLON);
			setState(214);
			block();
			setState(215);
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
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LPAREN);
			setState(218);
			identifierList();
			setState(219);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IDENTIFIER);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(223);
				match(IDENTIFIER);
				}
				}
				setState(228);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			labelDeclarationPart();
			setState(230);
			constantDefinitionPart();
			setState(231);
			typeDefinitionPart();
			setState(232);
			variableDeclarationPart();
			setState(233);
			procedureAndFunctionDeclarationPart();
			setState(234);
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
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_labelDeclarationPart);
		int _la;
		try {
			setState(248);
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
				setState(236);
				empty();
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(LABEL);
				setState(238);
				label();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					label();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
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
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinitionPart);
		try {
			int _alt;
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				empty();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(CONST);
				setState(254);
				constantDefinition();
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						match(SEMICOLON);
						setState(256);
						constantDefinition();
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(262);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(EQUAL);
			setState(268);
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
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				sign();
				setState(272);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				constantIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				sign();
				setState(276);
				constantIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				string();
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
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unsignedNumber);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				unsignedInteger();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				unsignedReal();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		public List<UnsignedIntegerContext> unsignedInteger() {
			return getRuleContexts(UnsignedIntegerContext.class);
		}
		public UnsignedIntegerContext unsignedInteger(int i) {
			return getRuleContext(UnsignedIntegerContext.class,i);
		}
		public TerminalNode PERIOD() { return getToken(PascalParser.PERIOD, 0); }
		public ScaleFactorContext scaleFactor() {
			return getRuleContext(ScaleFactorContext.class,0);
		}
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsignedReal);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				unsignedInteger();
				setState(288);
				match(PERIOD);
				setState(289);
				unsignedInteger();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				unsignedInteger();
				setState(292);
				match(PERIOD);
				setState(293);
				unsignedInteger();
				setState(294);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				scaleFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				unsignedInteger();
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(299);
				scaleFactor();
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
	}

	public final ScaleFactorContext scaleFactor() throws RecognitionException {
		ScaleFactorContext _localctx = new ScaleFactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scaleFactor);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				unsignedInteger();
				}
				break;
			case PLUSOP:
			case MINUSOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				sign();
				setState(305);
				unsignedInteger();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUSOP() { return getToken(PascalParser.PLUSOP, 0); }
		public TerminalNode MINUSOP() { return getToken(PascalParser.MINUSOP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PascalParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDefinitionPart);
		try {
			int _alt;
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				empty();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(TYPE);
				setState(317);
				typeDefinition();
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						match(SEMICOLON);
						setState(319);
						typeDefinition();
						}
						} 
					}
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(325);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IDENTIFIER);
			setState(330);
			match(EQUAL);
			setState(331);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
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
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simpleType);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scalarType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(343);
			match(IDENTIFIER);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					match(COMMA);
					setState(345);
					match(IDENTIFIER);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			constant();
			setState(352);
			match(DOT_DOT);
			setState(353);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structuredType);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
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
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ARRAY);
			setState(364);
			match(LBRACKET);
			setState(365);
			indexType();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366);
				match(COMMA);
				setState(367);
				indexType();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(RBRACKET);
			setState(374);
			match(OF);
			setState(375);
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
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(RECORD);
			setState(382);
			fieldList();
			setState(383);
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
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldList);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				fixedPart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				fixedPart();
				setState(387);
				match(SEMICOLON);
				setState(388);
				variant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
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
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			recordSection();
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					match(SEMICOLON);
					setState(395);
					recordSection();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_recordSection);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				fieldIdentifier();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					fieldIdentifier();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
				match(COLON);
				setState(410);
				type();
				}
				break;
			case EOF:
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
	}

	public final VariantTypeContext variantType() throws RecognitionException {
		VariantTypeContext _localctx = new VariantTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variantType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(CASE);
			setState(416);
			tagField();
			setState(417);
			typeIdentifier();
			setState(418);
			match(OF);
			setState(419);
			variant();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(420);
				match(SEMICOLON);
				setState(421);
				variant();
				}
				}
				setState(426);
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
	}

	public final TagFieldContext tagField() throws RecognitionException {
		TagFieldContext _localctx = new TagFieldContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tagField);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				fieldIdentifier();
				setState(428);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
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
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variant);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INTEGER:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				caseLabelList();
				setState(434);
				match(COLON);
				{
				setState(435);
				fieldList();
				}
				}
				break;
			case EOF:
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
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
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_caseLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
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
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(SET);
			setState(443);
			match(OF);
			setState(444);
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
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fileType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(FILE);
			setState(449);
			match(OF);
			setState(450);
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
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclarationPart);
		try {
			int _alt;
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				empty();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(VAR);
				setState(456);
				variableDeclaration();
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(457);
						match(SEMICOLON);
						setState(458);
						variableDeclaration();
						}
						} 
					}
					setState(463);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(464);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(IDENTIFIER);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(469);
				match(COMMA);
				setState(470);
				match(IDENTIFIER);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(COLON);
			setState(477);
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
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_procedureAndFunctionDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==PROCEDURE) {
				{
				{
				setState(479);
				procedureOrFunctionDeclaration();
				setState(480);
				match(SEMICOLON);
				}
				}
				setState(486);
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
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_procedureOrFunctionDeclaration);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
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
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_procedureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			procedureHeading();
			setState(492);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
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
	}

	public final ProcedureHeadingContext procedureHeading() throws RecognitionException {
		ProcedureHeadingContext _localctx = new ProcedureHeadingContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_procedureHeading);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(PROCEDURE);
				setState(495);
				match(IDENTIFIER);
				setState(496);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(PROCEDURE);
				setState(498);
				match(IDENTIFIER);
				setState(499);
				match(LPAREN);
				setState(500);
				formalParameterSection();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(501);
					match(SEMICOLON);
					setState(502);
					formalParameterSection();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(RPAREN);
				setState(509);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterSection);
		int _la;
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(VAR);
				setState(515);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(FUNCTION);
				setState(517);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				match(PROCEDURE);
				setState(519);
				match(IDENTIFIER);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(520);
					match(COMMA);
					setState(521);
					match(IDENTIFIER);
					}
					}
					setState(526);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PascalParser.IDENTIFIER, i);
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
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(IDENTIFIER);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(530);
				match(COMMA);
				setState(531);
				match(IDENTIFIER);
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			match(COLON);
			setState(538);
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
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			functionHeading();
			setState(541);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
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
	}

	public final FunctionHeadingContext functionHeading() throws RecognitionException {
		FunctionHeadingContext _localctx = new FunctionHeadingContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionHeading);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(FUNCTION);
				setState(544);
				match(IDENTIFIER);
				setState(545);
				match(COLON);
				setState(546);
				resultType();
				setState(547);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(FUNCTION);
				setState(550);
				match(IDENTIFIER);
				setState(551);
				match(LPAREN);
				setState(552);
				formalParameterSection();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(553);
					match(SEMICOLON);
					setState(554);
					formalParameterSection();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				match(RPAREN);
				setState(561);
				resultType();
				setState(562);
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
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
	}

	public final StatementPartContext statementPart() throws RecognitionException {
		StatementPartContext _localctx = new StatementPartContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_statementPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statement);
		try {
			setState(575);
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
				setState(570);
				unlabelledStatement();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				label();
				setState(572);
				match(COLON);
				setState(573);
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
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unlabelledStatement);
		try {
			setState(579);
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
				setState(577);
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
				setState(578);
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
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simpleStatement);
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				goToStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
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
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignmentStatement);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				variable();
				setState(588);
				match(ASSIGN);
				setState(589);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				functionIdentifier();
				setState(592);
				match(ASSIGN);
				setState(593);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variable);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				entireVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				componentVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
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
	}

	public final EntireVariableContext entireVariable() throws RecognitionException {
		EntireVariableContext _localctx = new EntireVariableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_entireVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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
	}

	public final ComponentVariableContext componentVariable() throws RecognitionException {
		ComponentVariableContext _localctx = new ComponentVariableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_componentVariable);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				indexedVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				fieldDesignator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
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
	}

	public final IndexedVariableContext indexedVariable() throws RecognitionException {
		IndexedVariableContext _localctx = new IndexedVariableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_indexedVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			arrayVariable();
			setState(612);
			match(LBRACKET);
			setState(613);
			expression();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(614);
				match(COMMA);
				setState(615);
				expression();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public ArrayVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariable; }
	}

	public final ArrayVariableContext arrayVariable() throws RecognitionException {
		ArrayVariableContext _localctx = new ArrayVariableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
	}

	public final FieldDesignatorContext fieldDesignator() throws RecognitionException {
		FieldDesignatorContext _localctx = new FieldDesignatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fieldDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			recordVariable();
			setState(626);
			match(PERIOD);
			setState(627);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public RecordVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariable; }
	}

	public final RecordVariableContext recordVariable() throws RecognitionException {
		RecordVariableContext _localctx = new RecordVariableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_recordVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
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

	public static class FieldIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public FieldIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldIdentifier; }
	}

	public final FieldIdentifierContext fieldIdentifier() throws RecognitionException {
		FieldIdentifierContext _localctx = new FieldIdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_fieldIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
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

	public static class FileBufferContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public FileBufferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileBuffer; }
	}

	public final FileBufferContext fileBuffer() throws RecognitionException {
		FileBufferContext _localctx = new FileBufferContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_fileBuffer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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

	public static class FileVariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public FileVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileVariable; }
	}

	public final FileVariableContext fileVariable() throws RecognitionException {
		FileVariableContext _localctx = new FileVariableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fileVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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

	public static class ReferencedVariableContext extends ParserRuleContext {
		public PointerVariableContext pointerVariable() {
			return getRuleContext(PointerVariableContext.class,0);
		}
		public ReferencedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencedVariable; }
	}

	public final ReferencedVariableContext referencedVariable() throws RecognitionException {
		ReferencedVariableContext _localctx = new ReferencedVariableContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_referencedVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public PointerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerVariable; }
	}

	public final PointerVariableContext pointerVariable() throws RecognitionException {
		PointerVariableContext _localctx = new PointerVariableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pointerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_expression);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				simpleExpression(0);
				setState(643);
				relationalOperator();
				setState(644);
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
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (IN - 25)) | (1L << (EQUAL - 25)) | (1L << (NE - 25)) | (1L << (LTEQ - 25)) | (1L << (GTEQ - 25)) | (1L << (LT - 25)) | (1L << (GT - 25)))) != 0)) ) {
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
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case IDENTIFIER:
			case INTEGER:
			case STRING_LITERAL:
			case LPAREN:
			case LBRACKET:
				{
				setState(651);
				term(0);
				}
				break;
			case PLUSOP:
			case MINUSOP:
				{
				setState(652);
				sign();
				setState(653);
				term(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
					setState(657);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(658);
					addingOperator();
					setState(659);
					term(0);
					}
					} 
				}
				setState(665);
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

	public static class AddingOperatorContext extends ParserRuleContext {
		public TerminalNode PLUSOP() { return getToken(PascalParser.PLUSOP, 0); }
		public TerminalNode MINUSOP() { return getToken(PascalParser.MINUSOP, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public AddingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOperator; }
	}

	public final AddingOperatorContext addingOperator() throws RecognitionException {
		AddingOperatorContext _localctx = new AddingOperatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_addingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
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
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(669);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(671);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(672);
					multiplyingOperator();
					setState(673);
					factor();
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
	}

	public final MultiplyingOperatorContext multiplyingOperator() throws RecognitionException {
		MultiplyingOperatorContext _localctx = new MultiplyingOperatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_multiplyingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_la = _input.LA(1);
			if ( !(((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (AND - 3)) | (1L << (DIV - 3)) | (1L << (MOD - 3)) | (1L << (MULTOP - 3)) | (1L << (DIVOP - 3)))) != 0)) ) {
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
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_factor);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				unsignedConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(LPAREN);
				setState(685);
				expression();
				setState(686);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				functionDesignator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(690);
				match(NOT);
				setState(691);
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
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unsignedConstant);
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				string();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
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
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionDesignator);
		int _la;
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				functionIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				functionIdentifier();
				setState(701);
				match(LPAREN);
				setState(702);
				actualParameter();
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(703);
					match(COMMA);
					setState(704);
					actualParameter();
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(710);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
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
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(LBRACKET);
			setState(717);
			elementList();
			setState(718);
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
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_elementList);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case IDENTIFIER:
			case INTEGER:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
			case LPAREN:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				element();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(721);
					match(COMMA);
					setState(722);
					element();
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
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
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_element);
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				expression();
				setState(733);
				match(DOT_DOT);
				setState(734);
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
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_procedureStatement);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				procedureIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				procedureIdentifier();
				setState(740);
				match(LPAREN);
				setState(741);
				actualParameter();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(742);
					match(COMMA);
					setState(743);
					actualParameter();
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public ProcedureIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureIdentifier; }
	}

	public final ProcedureIdentifierContext procedureIdentifier() throws RecognitionException {
		ProcedureIdentifierContext _localctx = new ProcedureIdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_procedureIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_actualParameter);
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				procedureIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
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
	}

	public final GoToStatementContext goToStatement() throws RecognitionException {
		GoToStatementContext _localctx = new GoToStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_goToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(GOTO);
			setState(762);
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
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
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
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_empty);
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
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_structuredStatement);
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				repetitiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
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
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(BEGIN);
			setState(775);
			statement();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(776);
				match(SEMICOLON);
				setState(777);
				statement();
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(783);
			match(END);
			setState(784);
			match(SEMICOLON);
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
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_conditionalStatement);
		try {
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ifStatement);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(IF);
				setState(791);
				expression();
				setState(792);
				match(THEN);
				setState(793);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(IF);
				setState(796);
				expression();
				setState(797);
				match(THEN);
				setState(798);
				statement();
				setState(799);
				match(ELSE);
				setState(800);
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
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(CASE);
			setState(805);
			expression();
			setState(806);
			match(OF);
			setState(807);
			caseListElement();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(808);
				match(SEMICOLON);
				setState(809);
				caseListElement();
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(815);
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
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_caseListElement);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INTEGER:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				caseLabelList();
				setState(818);
				match(COLON);
				setState(819);
				statement();
				}
				break;
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
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
	}

	public final CaseLabelListContext caseLabelList() throws RecognitionException {
		CaseLabelListContext _localctx = new CaseLabelListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_caseLabelList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			caseLabel();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				caseLabel();
				}
				}
				setState(831);
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
	}

	public final RepetitiveStatementContext repetitiveStatement() throws RecognitionException {
		RepetitiveStatementContext _localctx = new RepetitiveStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_repetitiveStatement);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(WHILE);
			setState(838);
			expression();
			setState(839);
			match(DO);
			setState(840);
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
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(REPEAT);
			setState(843);
			statement();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(844);
				match(SEMICOLON);
				setState(845);
				statement();
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			match(UNTIL);
			setState(852);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(FOR);
			setState(855);
			controlVariable();
			setState(856);
			match(ASSIGN);
			setState(857);
			forList();
			setState(858);
			match(DO);
			setState(859);
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
		public TerminalNode IDENTIFIER() { return getToken(PascalParser.IDENTIFIER, 0); }
		public ControlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlVariable; }
	}

	public final ControlVariableContext controlVariable() throws RecognitionException {
		ControlVariableContext _localctx = new ControlVariableContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_controlVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
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
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forList);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				initialValue();
				setState(864);
				match(TO);
				setState(865);
				finalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				initialValue();
				setState(868);
				match(DOWNTO);
				setState(869);
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
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
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
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
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
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(WITH);
			setState(878);
			recordVariableList();
			setState(879);
			match(DO);
			setState(880);
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
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			recordVariable();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(883);
				match(COMMA);
				setState(884);
				recordVariable();
				}
				}
				setState(889);
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
		case 70:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 72:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u037d\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\2"+
		"\5\2\u00d6\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\u00e3\n"+
		"\4\f\4\16\4\u00e6\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u00f4\n\6\f\6\16\6\u00f7\13\6\3\6\3\6\5\6\u00fb\n\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u0104\n\b\f\b\16\b\u0107\13\b\3\b\3\b\5\b\u010b\n\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011a\n\n\3\13"+
		"\3\13\5\13\u011e\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0130\n\r\3\16\3\16\3\16\3\16\5\16\u0136\n\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0143\n\22\f\22"+
		"\16\22\u0146\13\22\3\22\3\22\5\22\u014a\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\5\24\u0153\n\24\3\25\3\25\3\25\5\25\u0158\n\25\3\26\3\26\3"+
		"\26\7\26\u015d\n\26\f\26\16\26\u0160\13\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\5\31\u016c\n\31\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0173\n\32\f\32\16\32\u0176\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018a\n\36"+
		"\3\37\3\37\3\37\7\37\u018f\n\37\f\37\16\37\u0192\13\37\3 \3 \3 \7 \u0197"+
		"\n \f \16 \u019a\13 \3 \3 \3 \3 \5 \u01a0\n \3!\3!\3!\3!\3!\3!\3!\7!\u01a9"+
		"\n!\f!\16!\u01ac\13!\3\"\3\"\3\"\3\"\5\"\u01b2\n\"\3#\3#\3#\3#\3#\5#\u01b9"+
		"\n#\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\7)\u01ce"+
		"\n)\f)\16)\u01d1\13)\3)\3)\5)\u01d5\n)\3*\3*\3*\7*\u01da\n*\f*\16*\u01dd"+
		"\13*\3*\3*\3*\3+\3+\3+\7+\u01e5\n+\f+\16+\u01e8\13+\3,\3,\5,\u01ec\n,"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01fa\n.\f.\16.\u01fd\13.\3.\3"+
		".\3.\5.\u0202\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u020d\n/\f/\16/\u0210\13"+
		"/\5/\u0212\n/\3\60\3\60\3\60\7\60\u0217\n\60\f\60\16\60\u021a\13\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\7\62\u022e\n\62\f\62\16\62\u0231\13\62\3\62\3\62\3"+
		"\62\3\62\5\62\u0237\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0242\n\65\3\66\3\66\5\66\u0246\n\66\3\67\3\67\3\67\3\67\5\67\u024c"+
		"\n\67\38\38\38\38\38\38\38\38\58\u0256\n8\39\39\39\59\u025b\n9\3:\3:\3"+
		";\3;\3<\3<\3<\5<\u0264\n<\3=\3=\3=\3=\3=\7=\u026b\n=\f=\16=\u026e\13="+
		"\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F"+
		"\3F\3F\5F\u0289\nF\3G\3G\3H\3H\3H\3H\3H\5H\u0292\nH\3H\3H\3H\3H\7H\u0298"+
		"\nH\fH\16H\u029b\13H\3I\3I\3J\3J\3J\3J\3J\3J\3J\7J\u02a6\nJ\fJ\16J\u02a9"+
		"\13J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u02b7\nL\3M\3M\3M\5M\u02bc"+
		"\nM\3N\3N\3N\3N\3N\3N\7N\u02c4\nN\fN\16N\u02c7\13N\3N\3N\5N\u02cb\nN\3"+
		"O\3O\3P\3P\3P\3P\3Q\3Q\3Q\7Q\u02d6\nQ\fQ\16Q\u02d9\13Q\3Q\5Q\u02dc\nQ"+
		"\3R\3R\3R\3R\3R\5R\u02e3\nR\3S\3S\3S\3S\3S\3S\7S\u02eb\nS\fS\16S\u02ee"+
		"\13S\3S\3S\5S\u02f2\nS\3T\3T\3U\3U\3U\3U\5U\u02fa\nU\3V\3V\3V\3W\3W\3"+
		"X\3X\3Y\3Y\3Y\3Y\5Y\u0307\nY\3Z\3Z\3Z\3Z\7Z\u030d\nZ\fZ\16Z\u0310\13Z"+
		"\3Z\3Z\3Z\3[\3[\5[\u0317\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\5\\\u0325\n\\\3]\3]\3]\3]\3]\3]\7]\u032d\n]\f]\16]\u0330\13]\3"+
		"]\3]\3^\3^\3^\3^\3^\5^\u0339\n^\3_\3_\3_\7_\u033e\n_\f_\16_\u0341\13_"+
		"\3`\3`\3`\5`\u0346\n`\3a\3a\3a\3a\3a\3b\3b\3b\3b\7b\u0351\nb\fb\16b\u0354"+
		"\13b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\5e\u036a"+
		"\ne\3f\3f\3g\3g\3h\3h\3h\3h\3h\3i\3i\3i\7i\u0378\ni\fi\16i\u037b\13i\3"+
		"i\2\4\u008e\u0092j\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\2\7\3\2\3\4\3\2@A\4\2\33\33EJ\4\2&&@A\6\2\5\5\17\17\37\37BC\2\u0371"+
		"\2\u00d2\3\2\2\2\4\u00db\3\2\2\2\6\u00df\3\2\2\2\b\u00e7\3\2\2\2\n\u00fa"+
		"\3\2\2\2\f\u00fc\3\2\2\2\16\u010a\3\2\2\2\20\u010c\3\2\2\2\22\u0119\3"+
		"\2\2\2\24\u011d\3\2\2\2\26\u011f\3\2\2\2\30\u012f\3\2\2\2\32\u0135\3\2"+
		"\2\2\34\u0137\3\2\2\2\36\u0139\3\2\2\2 \u013b\3\2\2\2\"\u0149\3\2\2\2"+
		"$\u014b\3\2\2\2&\u0152\3\2\2\2(\u0157\3\2\2\2*\u0159\3\2\2\2,\u0161\3"+
		"\2\2\2.\u0165\3\2\2\2\60\u016b\3\2\2\2\62\u016d\3\2\2\2\64\u017b\3\2\2"+
		"\2\66\u017d\3\2\2\28\u017f\3\2\2\2:\u0189\3\2\2\2<\u018b\3\2\2\2>\u019f"+
		"\3\2\2\2@\u01a1\3\2\2\2B\u01b1\3\2\2\2D\u01b8\3\2\2\2F\u01ba\3\2\2\2H"+
		"\u01bc\3\2\2\2J\u01c0\3\2\2\2L\u01c2\3\2\2\2N\u01c6\3\2\2\2P\u01d4\3\2"+
		"\2\2R\u01d6\3\2\2\2T\u01e6\3\2\2\2V\u01eb\3\2\2\2X\u01ed\3\2\2\2Z\u0201"+
		"\3\2\2\2\\\u0211\3\2\2\2^\u0213\3\2\2\2`\u021e\3\2\2\2b\u0236\3\2\2\2"+
		"d\u0238\3\2\2\2f\u023a\3\2\2\2h\u0241\3\2\2\2j\u0245\3\2\2\2l\u024b\3"+
		"\2\2\2n\u0255\3\2\2\2p\u025a\3\2\2\2r\u025c\3\2\2\2t\u025e\3\2\2\2v\u0263"+
		"\3\2\2\2x\u0265\3\2\2\2z\u0271\3\2\2\2|\u0273\3\2\2\2~\u0277\3\2\2\2\u0080"+
		"\u0279\3\2\2\2\u0082\u027b\3\2\2\2\u0084\u027d\3\2\2\2\u0086\u027f\3\2"+
		"\2\2\u0088\u0281\3\2\2\2\u008a\u0288\3\2\2\2\u008c\u028a\3\2\2\2\u008e"+
		"\u0291\3\2\2\2\u0090\u029c\3\2\2\2\u0092\u029e\3\2\2\2\u0094\u02aa\3\2"+
		"\2\2\u0096\u02b6\3\2\2\2\u0098\u02bb\3\2\2\2\u009a\u02ca\3\2\2\2\u009c"+
		"\u02cc\3\2\2\2\u009e\u02ce\3\2\2\2\u00a0\u02db\3\2\2\2\u00a2\u02e2\3\2"+
		"\2\2\u00a4\u02f1\3\2\2\2\u00a6\u02f3\3\2\2\2\u00a8\u02f9\3\2\2\2\u00aa"+
		"\u02fb\3\2\2\2\u00ac\u02fe\3\2\2\2\u00ae\u0300\3\2\2\2\u00b0\u0306\3\2"+
		"\2\2\u00b2\u0308\3\2\2\2\u00b4\u0316\3\2\2\2\u00b6\u0324\3\2\2\2\u00b8"+
		"\u0326\3\2\2\2\u00ba\u0338\3\2\2\2\u00bc\u033a\3\2\2\2\u00be\u0345\3\2"+
		"\2\2\u00c0\u0347\3\2\2\2\u00c2\u034c\3\2\2\2\u00c4\u0358\3\2\2\2\u00c6"+
		"\u035f\3\2\2\2\u00c8\u0369\3\2\2\2\u00ca\u036b\3\2\2\2\u00cc\u036d\3\2"+
		"\2\2\u00ce\u036f\3\2\2\2\u00d0\u0374\3\2\2\2\u00d2\u00d3\7)\2\2\u00d3"+
		"\u00d5\7;\2\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\5\b\5\2\u00d9"+
		"\u00da\7[\2\2\u00da\3\3\2\2\2\u00db\u00dc\7R\2\2\u00dc\u00dd\5\6\4\2\u00dd"+
		"\u00de\7S\2\2\u00de\5\3\2\2\2\u00df\u00e4\7;\2\2\u00e0\u00e1\7Q\2\2\u00e1"+
		"\u00e3\7;\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\5\n\6\2\u00e8\u00e9\5\16\b\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb\5P)\2\u00eb"+
		"\u00ec\5T+\2\u00ec\u00ed\5f\64\2\u00ed\t\3\2\2\2\u00ee\u00fb\5\u00aeX"+
		"\2\u00ef\u00f0\7\36\2\2\u00f0\u00f5\5\f\7\2\u00f1\u00f2\7Q\2\2\u00f2\u00f4"+
		"\5\f\7\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7P"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fb"+
		"\13\3\2\2\2\u00fc\u00fd\5\26\f\2\u00fd\r\3\2\2\2\u00fe\u010b\5\u00aeX"+
		"\2\u00ff\u0100\7\13\2\2\u0100\u0105\5\20\t\2\u0101\u0102\7P\2\2\u0102"+
		"\u0104\5\20\t\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7P\2\2\u0109\u010b\3\2\2\2\u010a\u00fe\3\2\2\2\u010a\u00ff\3\2"+
		"\2\2\u010b\17\3\2\2\2\u010c\u010d\7;\2\2\u010d\u010e\7E\2\2\u010e\u010f"+
		"\5\22\n\2\u010f\21\3\2\2\2\u0110\u011a\5\24\13\2\u0111\u0112\5\34\17\2"+
		"\u0112\u0113\5\24\13\2\u0113\u011a\3\2\2\2\u0114\u011a\5\36\20\2\u0115"+
		"\u0116\5\34\17\2\u0116\u0117\5\36\20\2\u0117\u011a\3\2\2\2\u0118\u011a"+
		"\5 \21\2\u0119\u0110\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0114\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u0118\3\2\2\2\u011a\23\3\2\2\2\u011b\u011e\5\26\f"+
		"\2\u011c\u011e\5\30\r\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\25\3\2\2\2\u011f\u0120\7<\2\2\u0120\27\3\2\2\2\u0121\u0122\5\26\f\2\u0122"+
		"\u0123\7[\2\2\u0123\u0124\5\26\f\2\u0124\u0130\3\2\2\2\u0125\u0126\5\26"+
		"\f\2\u0126\u0127\7[\2\2\u0127\u0128\5\26\f\2\u0128\u0129\t\2\2\2\u0129"+
		"\u012a\5\32\16\2\u012a\u0130\3\2\2\2\u012b\u012c\5\26\f\2\u012c\u012d"+
		"\t\2\2\2\u012d\u012e\5\32\16\2\u012e\u0130\3\2\2\2\u012f\u0121\3\2\2\2"+
		"\u012f\u0125\3\2\2\2\u012f\u012b\3\2\2\2\u0130\31\3\2\2\2\u0131\u0136"+
		"\5\26\f\2\u0132\u0133\5\34\17\2\u0133\u0134\5\26\f\2\u0134\u0136\3\2\2"+
		"\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0136\33\3\2\2\2\u0137\u0138"+
		"\t\3\2\2\u0138\35\3\2\2\2\u0139\u013a\7;\2\2\u013a\37\3\2\2\2\u013b\u013c"+
		"\7?\2\2\u013c!\3\2\2\2\u013d\u014a\5\u00aeX\2\u013e\u013f\7\63\2\2\u013f"+
		"\u0144\5$\23\2\u0140\u0141\7P\2\2\u0141\u0143\5$\23\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7P\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u013d\3\2\2\2\u0149\u013e\3\2\2\2\u014a#\3\2\2\2\u014b\u014c"+
		"\7;\2\2\u014c\u014d\7E\2\2\u014d\u014e\5&\24\2\u014e%\3\2\2\2\u014f\u0153"+
		"\5(\25\2\u0150\u0153\5\60\31\2\u0151\u0153\5N(\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\'\3\2\2\2\u0154\u0158\5*\26\2"+
		"\u0155\u0158\5,\27\2\u0156\u0158\5.\30\2\u0157\u0154\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0156\3\2\2\2\u0158)\3\2\2\2\u0159\u015e\7;\2\2\u015a\u015b"+
		"\7Q\2\2\u015b\u015d\7;\2\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f+\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0161\u0162\5\22\n\2\u0162\u0163\7Z\2\2\u0163\u0164\5\22\n\2\u0164-\3"+
		"\2\2\2\u0165\u0166\7;\2\2\u0166/\3\2\2\2\u0167\u016c\5\62\32\2\u0168\u016c"+
		"\58\35\2\u0169\u016c\5H%\2\u016a\u016c\5L\'\2\u016b\u0167\3\2\2\2\u016b"+
		"\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\61\3\2\2"+
		"\2\u016d\u016e\7\6\2\2\u016e\u016f\7T\2\2\u016f\u0174\5\64\33\2\u0170"+
		"\u0171\7Q\2\2\u0171\u0173\5\64\33\2\u0172\u0170\3\2\2\2\u0173\u0176\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\7U\2\2\u0178\u0179\7#\2\2\u0179\u017a\5\66"+
		"\34\2\u017a\63\3\2\2\2\u017b\u017c\5(\25\2\u017c\65\3\2\2\2\u017d\u017e"+
		"\5&\24\2\u017e\67\3\2\2\2\u017f\u0180\7*\2\2\u0180\u0181\5:\36\2\u0181"+
		"\u0182\7\23\2\2\u01829\3\2\2\2\u0183\u018a\5<\37\2\u0184\u0185\5<\37\2"+
		"\u0185\u0186\7P\2\2\u0186\u0187\5D#\2\u0187\u018a\3\2\2\2\u0188\u018a"+
		"\5D#\2\u0189\u0183\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		";\3\2\2\2\u018b\u0190\5> \2\u018c\u018d\7P\2\2\u018d\u018f\5> \2\u018e"+
		"\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191=\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0198\5\u0080A\2\u0194\u0195"+
		"\7Q\2\2\u0195\u0197\5\u0080A\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019b\u019c\7\\\2\2\u019c\u019d\5&\24\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u01a0\5\u00aeX\2\u019f\u0193\3\2\2\2\u019f\u019e\3\2\2\2\u01a0?\3\2\2"+
		"\2\u01a1\u01a2\7\n\2\2\u01a2\u01a3\5B\"\2\u01a3\u01a4\5.\30\2\u01a4\u01a5"+
		"\7#\2\2\u01a5\u01aa\5D#\2\u01a6\u01a7\7P\2\2\u01a7\u01a9\5D#\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"A\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5\u0080A\2\u01ae\u01af\7\\\2"+
		"\2\u01af\u01b2\3\2\2\2\u01b0\u01b2\5\u00aeX\2\u01b1\u01ad\3\2\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2C\3\2\2\2\u01b3\u01b4\5\u00bc_\2\u01b4\u01b5\7\\\2"+
		"\2\u01b5\u01b6\5:\36\2\u01b6\u01b9\3\2\2\2\u01b7\u01b9\5\u00aeX\2\u01b8"+
		"\u01b3\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9E\3\2\2\2\u01ba\u01bb\5\22\n\2"+
		"\u01bbG\3\2\2\2\u01bc\u01bd\7,\2\2\u01bd\u01be\7#\2\2\u01be\u01bf\5J&"+
		"\2\u01bfI\3\2\2\2\u01c0\u01c1\5(\25\2\u01c1K\3\2\2\2\u01c2\u01c3\7\25"+
		"\2\2\u01c3\u01c4\7#\2\2\u01c4\u01c5\5&\24\2\u01c5M\3\2\2\2\u01c6\u01c7"+
		"\5.\30\2\u01c7O\3\2\2\2\u01c8\u01d5\5\u00aeX\2\u01c9\u01ca\7\67\2\2\u01ca"+
		"\u01cf\5R*\2\u01cb\u01cc\7P\2\2\u01cc\u01ce\5R*\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7P\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01c8\3\2\2\2\u01d4\u01c9\3\2\2\2\u01d5Q\3\2\2\2\u01d6\u01db\7;\2\2\u01d7"+
		"\u01d8\7Q\2\2\u01d8\u01da\7;\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2"+
		"\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01df\7\\\2\2\u01df\u01e0\5&\24\2\u01e0S\3\2\2\2\u01e1"+
		"\u01e2\5V,\2\u01e2\u01e3\7P\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e1\3\2\2"+
		"\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7U"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\5X-\2\u01ea\u01ec\5`\61\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecW\3\2\2\2\u01ed\u01ee\5Z.\2\u01ee"+
		"\u01ef\5\b\5\2\u01efY\3\2\2\2\u01f0\u01f1\7(\2\2\u01f1\u01f2\7;\2\2\u01f2"+
		"\u0202\7P\2\2\u01f3\u01f4\7(\2\2\u01f4\u01f5\7;\2\2\u01f5\u01f6\7R\2\2"+
		"\u01f6\u01fb\5\\/\2\u01f7\u01f8\7P\2\2\u01f8\u01fa\5\\/\2\u01f9\u01f7"+
		"\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7S\2\2\u01ff\u0200\7P\2"+
		"\2\u0200\u0202\3\2\2\2\u0201\u01f0\3\2\2\2\u0201\u01f3\3\2\2\2\u0202["+
		"\3\2\2\2\u0203\u0212\5^\60\2\u0204\u0205\7\67\2\2\u0205\u0212\5^\60\2"+
		"\u0206\u0207\7\27\2\2\u0207\u0212\5^\60\2\u0208\u0209\7(\2\2\u0209\u020e"+
		"\7;\2\2\u020a\u020b\7Q\2\2\u020b\u020d\7;\2\2\u020c\u020a\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0211\u0203\3\2\2\2\u0211\u0204\3\2\2\2\u0211"+
		"\u0206\3\2\2\2\u0211\u0208\3\2\2\2\u0212]\3\2\2\2\u0213\u0218\7;\2\2\u0214"+
		"\u0215\7Q\2\2\u0215\u0217\7;\2\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2"+
		"\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021c\7\\\2\2\u021c\u021d\5.\30\2\u021d_\3\2\2\2\u021e"+
		"\u021f\5b\62\2\u021f\u0220\5\b\5\2\u0220a\3\2\2\2\u0221\u0222\7\27\2\2"+
		"\u0222\u0223\7;\2\2\u0223\u0224\7\\\2\2\u0224\u0225\5d\63\2\u0225\u0226"+
		"\7P\2\2\u0226\u0237\3\2\2\2\u0227\u0228\7\27\2\2\u0228\u0229\7;\2\2\u0229"+
		"\u022a\7R\2\2\u022a\u022f\5\\/\2\u022b\u022c\7P\2\2\u022c\u022e\5\\/\2"+
		"\u022d\u022b\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\7S\2\2\u0233"+
		"\u0234\5d\63\2\u0234\u0235\7P\2\2\u0235\u0237\3\2\2\2\u0236\u0221\3\2"+
		"\2\2\u0236\u0227\3\2\2\2\u0237c\3\2\2\2\u0238\u0239\5.\30\2\u0239e\3\2"+
		"\2\2\u023a\u023b\5\u00b2Z\2\u023bg\3\2\2\2\u023c\u0242\5j\66\2\u023d\u023e"+
		"\5\f\7\2\u023e\u023f\7\\\2\2\u023f\u0240\5j\66\2\u0240\u0242\3\2\2\2\u0241"+
		"\u023c\3\2\2\2\u0241\u023d\3\2\2\2\u0242i\3\2\2\2\u0243\u0246\5l\67\2"+
		"\u0244\u0246\5\u00b0Y\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246"+
		"k\3\2\2\2\u0247\u024c\5n8\2\u0248\u024c\5\u00a4S\2\u0249\u024c\5\u00aa"+
		"V\2\u024a\u024c\5\u00acW\2\u024b\u0247\3\2\2\2\u024b\u0248\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024cm\3\2\2\2\u024d\u024e\5p9\2\u024e"+
		"\u024f\7D\2\2\u024f\u0250\5\u008aF\2\u0250\u0256\3\2\2\2\u0251\u0252\5"+
		"\u009cO\2\u0252\u0253\7D\2\2\u0253\u0254\5\u008aF\2\u0254\u0256\3\2\2"+
		"\2\u0255\u024d\3\2\2\2\u0255\u0251\3\2\2\2\u0256o\3\2\2\2\u0257\u025b"+
		"\5r:\2\u0258\u025b\5v<\2\u0259\u025b\5\u0086D\2\u025a\u0257\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025bq\3\2\2\2\u025c\u025d\5t;\2\u025d"+
		"s\3\2\2\2\u025e\u025f\7;\2\2\u025fu\3\2\2\2\u0260\u0264\5x=\2\u0261\u0264"+
		"\5|?\2\u0262\u0264\5\u0082B\2\u0263\u0260\3\2\2\2\u0263\u0261\3\2\2\2"+
		"\u0263\u0262\3\2\2\2\u0264w\3\2\2\2\u0265\u0266\5z>\2\u0266\u0267\7T\2"+
		"\2\u0267\u026c\5\u008aF\2\u0268\u0269\7Q\2\2\u0269\u026b\5\u008aF\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7U\2\2\u0270"+
		"y\3\2\2\2\u0271\u0272\7;\2\2\u0272{\3\2\2\2\u0273\u0274\5~@\2\u0274\u0275"+
		"\7[\2\2\u0275\u0276\5\u0080A\2\u0276}\3\2\2\2\u0277\u0278\7;\2\2\u0278"+
		"\177\3\2\2\2\u0279\u027a\7;\2\2\u027a\u0081\3\2\2\2\u027b\u027c\7;\2\2"+
		"\u027c\u0083\3\2\2\2\u027d\u027e\7;\2\2\u027e\u0085\3\2\2\2\u027f\u0280"+
		"\5\u0088E\2\u0280\u0087\3\2\2\2\u0281\u0282\7;\2\2\u0282\u0089\3\2\2\2"+
		"\u0283\u0289\5\u008eH\2\u0284\u0285\5\u008eH\2\u0285\u0286\5\u008cG\2"+
		"\u0286\u0287\5\u008eH\2\u0287\u0289\3\2\2\2\u0288\u0283\3\2\2\2\u0288"+
		"\u0284\3\2\2\2\u0289\u008b\3\2\2\2\u028a\u028b\t\4\2\2\u028b\u008d\3\2"+
		"\2\2\u028c\u028d\bH\1\2\u028d\u0292\5\u0092J\2\u028e\u028f\5\34\17\2\u028f"+
		"\u0290\5\u0092J\2\u0290\u0292\3\2\2\2\u0291\u028c\3\2\2\2\u0291\u028e"+
		"\3\2\2\2\u0292\u0299\3\2\2\2\u0293\u0294\f\3\2\2\u0294\u0295\5\u0090I"+
		"\2\u0295\u0296\5\u0092J\2\u0296\u0298\3\2\2\2\u0297\u0293\3\2\2\2\u0298"+
		"\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u008f\3\2"+
		"\2\2\u029b\u0299\3\2\2\2\u029c\u029d\t\5\2\2\u029d\u0091\3\2\2\2\u029e"+
		"\u029f\bJ\1\2\u029f\u02a0\5\u0096L\2\u02a0\u02a7\3\2\2\2\u02a1\u02a2\f"+
		"\3\2\2\u02a2\u02a3\5\u0094K\2\u02a3\u02a4\5\u0096L\2\u02a4\u02a6\3\2\2"+
		"\2\u02a5\u02a1\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8"+
		"\3\2\2\2\u02a8\u0093\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\t\6\2\2\u02ab"+
		"\u0095\3\2\2\2\u02ac\u02b7\5p9\2\u02ad\u02b7\5\u0098M\2\u02ae\u02af\7"+
		"R\2\2\u02af\u02b0\5\u008aF\2\u02b0\u02b1\7S\2\2\u02b1\u02b7\3\2\2\2\u02b2"+
		"\u02b7\5\u009aN\2\u02b3\u02b7\5\u009eP\2\u02b4\u02b5\7!\2\2\u02b5\u02b7"+
		"\5\u0096L\2\u02b6\u02ac\3\2\2\2\u02b6\u02ad\3\2\2\2\u02b6\u02ae\3\2\2"+
		"\2\u02b6\u02b2\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u0097"+
		"\3\2\2\2\u02b8\u02bc\5\24\13\2\u02b9\u02bc\5 \21\2\u02ba\u02bc\5\36\20"+
		"\2\u02bb\u02b8\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc\u0099"+
		"\3\2\2\2\u02bd\u02cb\5\u009cO\2\u02be\u02bf\5\u009cO\2\u02bf\u02c0\7R"+
		"\2\2\u02c0\u02c5\5\u00a8U\2\u02c1\u02c2\7Q\2\2\u02c2\u02c4\5\u00a8U\2"+
		"\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7S\2\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02bd\3\2\2\2\u02ca\u02be\3\2\2\2\u02cb\u009b\3\2"+
		"\2\2\u02cc\u02cd\7;\2\2\u02cd\u009d\3\2\2\2\u02ce\u02cf\7T\2\2\u02cf\u02d0"+
		"\5\u00a0Q\2\u02d0\u02d1\7U\2\2\u02d1\u009f\3\2\2\2\u02d2\u02d7\5\u00a2"+
		"R\2\u02d3\u02d4\7Q\2\2\u02d4\u02d6\5\u00a2R\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02dc\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dc\5\u00aeX\2\u02db\u02d2\3\2\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u00a1\3\2\2\2\u02dd\u02e3\5\u008aF\2\u02de\u02df"+
		"\5\u008aF\2\u02df\u02e0\7Z\2\2\u02e0\u02e1\5\u008aF\2\u02e1\u02e3\3\2"+
		"\2\2\u02e2\u02dd\3\2\2\2\u02e2\u02de\3\2\2\2\u02e3\u00a3\3\2\2\2\u02e4"+
		"\u02f2\5\u00a6T\2\u02e5\u02e6\5\u00a6T\2\u02e6\u02e7\7R\2\2\u02e7\u02ec"+
		"\5\u00a8U\2\u02e8\u02e9\7Q\2\2\u02e9\u02eb\5\u00a8U\2\u02ea\u02e8\3\2"+
		"\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f0\7S\2\2\u02f0\u02f2\3\2"+
		"\2\2\u02f1\u02e4\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f2\u00a5\3\2\2\2\u02f3"+
		"\u02f4\7;\2\2\u02f4\u00a7\3\2\2\2\u02f5\u02fa\5\u008aF\2\u02f6\u02fa\5"+
		"p9\2\u02f7\u02fa\5\u00a6T\2\u02f8\u02fa\5\u009cO\2\u02f9\u02f5\3\2\2\2"+
		"\u02f9\u02f6\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa\u00a9"+
		"\3\2\2\2\u02fb\u02fc\7\30\2\2\u02fc\u02fd\5\f\7\2\u02fd\u00ab\3\2\2\2"+
		"\u02fe\u02ff\5\u00aeX\2\u02ff\u00ad\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u00af\3\2\2\2\u0302\u0307\5\u00b2Z\2\u0303\u0307\5\u00b4[\2\u0304\u0307"+
		"\5\u00be`\2\u0305\u0307\5\u00ceh\2\u0306\u0302\3\2\2\2\u0306\u0303\3\2"+
		"\2\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307\u00b1\3\2\2\2\u0308"+
		"\u0309\7\b\2\2\u0309\u030e\5h\65\2\u030a\u030b\7P\2\2\u030b\u030d\5h\65"+
		"\2\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\7\23\2\2"+
		"\u0312\u0313\7P\2\2\u0313\u00b3\3\2\2\2\u0314\u0317\5\u00b6\\\2\u0315"+
		"\u0317\5\u00b8]\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317\u00b5"+
		"\3\2\2\2\u0318\u0319\7\31\2\2\u0319\u031a\5\u008aF\2\u031a\u031b\7\60"+
		"\2\2\u031b\u031c\5h\65\2\u031c\u0325\3\2\2\2\u031d\u031e\7\31\2\2\u031e"+
		"\u031f\5\u008aF\2\u031f\u0320\7\60\2\2\u0320\u0321\5h\65\2\u0321\u0322"+
		"\7\22\2\2\u0322\u0323\5h\65\2\u0323\u0325\3\2\2\2\u0324\u0318\3\2\2\2"+
		"\u0324\u031d\3\2\2\2\u0325\u00b7\3\2\2\2\u0326\u0327\7\n\2\2\u0327\u0328"+
		"\5\u008aF\2\u0328\u0329\7#\2\2\u0329\u032e\5\u00ba^\2\u032a\u032b\7P\2"+
		"\2\u032b\u032d\5\u00ba^\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u032e\3\2"+
		"\2\2\u0331\u0332\7\23\2\2\u0332\u00b9\3\2\2\2\u0333\u0334\5\u00bc_\2\u0334"+
		"\u0335\7\\\2\2\u0335\u0336\5h\65\2\u0336\u0339\3\2\2\2\u0337\u0339\5\u00ae"+
		"X\2\u0338\u0333\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u00bb\3\2\2\2\u033a"+
		"\u033f\5F$\2\u033b\u033c\7Q\2\2\u033c\u033e\5F$\2\u033d\u033b\3\2\2\2"+
		"\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u00bd"+
		"\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0346\5\u00c0a\2\u0343\u0346\5\u00c2"+
		"b\2\u0344\u0346\5\u00c4c\2\u0345\u0342\3\2\2\2\u0345\u0343\3\2\2\2\u0345"+
		"\u0344\3\2\2\2\u0346\u00bf\3\2\2\2\u0347\u0348\78\2\2\u0348\u0349\5\u008a"+
		"F\2\u0349\u034a\7\20\2\2\u034a\u034b\5h\65\2\u034b\u00c1\3\2\2\2\u034c"+
		"\u034d\7+\2\2\u034d\u0352\5h\65\2\u034e\u034f\7P\2\2\u034f\u0351\5h\65"+
		"\2\u0350\u034e\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\7\65\2\2"+
		"\u0356\u0357\5\u008aF\2\u0357\u00c3\3\2\2\2\u0358\u0359\7\26\2\2\u0359"+
		"\u035a\5\u00c6d\2\u035a\u035b\7D\2\2\u035b\u035c\5\u00c8e\2\u035c\u035d"+
		"\7\20\2\2\u035d\u035e\5h\65\2\u035e\u00c5\3\2\2\2\u035f\u0360\7;\2\2\u0360"+
		"\u00c7\3\2\2\2\u0361\u0362\5\u00caf\2\u0362\u0363\7\61\2\2\u0363\u0364"+
		"\5\u00ccg\2\u0364\u036a\3\2\2\2\u0365\u0366\5\u00caf\2\u0366\u0367\7\21"+
		"\2\2\u0367\u0368\5\u00ccg\2\u0368\u036a\3\2\2\2\u0369\u0361\3\2\2\2\u0369"+
		"\u0365\3\2\2\2\u036a\u00c9\3\2\2\2\u036b\u036c\5\u008aF\2\u036c\u00cb"+
		"\3\2\2\2\u036d\u036e\5\u008aF\2\u036e\u00cd\3\2\2\2\u036f\u0370\79\2\2"+
		"\u0370\u0371\5\u00d0i\2\u0371\u0372\7\20\2\2\u0372\u0373\5h\65\2\u0373"+
		"\u00cf\3\2\2\2\u0374\u0379\5~@\2\u0375\u0376\7Q\2\2\u0376\u0378\5~@\2"+
		"\u0377\u0375\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a"+
		"\3\2\2\2\u037a\u00d1\3\2\2\2\u037b\u0379\3\2\2\2F\u00d5\u00e4\u00f5\u00fa"+
		"\u0105\u010a\u0119\u011d\u012f\u0135\u0144\u0149\u0152\u0157\u015e\u016b"+
		"\u0174\u0189\u0190\u0198\u019f\u01aa\u01b1\u01b8\u01cf\u01d4\u01db\u01e6"+
		"\u01eb\u01fb\u0201\u020e\u0211\u0218\u022f\u0236\u0241\u0245\u024b\u0255"+
		"\u025a\u0263\u026c\u0288\u0291\u0299\u02a7\u02b6\u02bb\u02c5\u02ca\u02d7"+
		"\u02db\u02e2\u02ec\u02f1\u02f9\u0306\u030e\u0316\u0324\u032e\u0338\u033f"+
		"\u0345\u0352\u0369\u0379";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}