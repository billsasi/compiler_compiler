// Generated from /Users/billsasi/work/compiler_compiler/Pascal.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public ScaleFactorContext scaleFactor() {
			return getRuleContext(ScaleFactorContext.class,0);
		}
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(REAL);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(288);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(289);
					scaleFactor();
					}
					break;
				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				unsignedInteger();
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				scaleFactor();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUSOP || _la==MINUSOP) {
				{
				setState(298);
				sign();
				}
			}

			setState(301);
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
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
			setState(305);
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
			setState(307);
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				empty();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(TYPE);
				setState(311);
				typeDefinition();
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						match(SEMICOLON);
						setState(313);
						typeDefinition();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(319);
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
			setState(323);
			match(IDENTIFIER);
			setState(324);
			match(EQUAL);
			setState(325);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
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
			setState(337);
			match(IDENTIFIER);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					match(COMMA);
					setState(339);
					match(IDENTIFIER);
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(345);
			constant();
			setState(346);
			match(DOT_DOT);
			setState(347);
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
			setState(349);
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
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
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
			setState(357);
			match(ARRAY);
			setState(358);
			match(LBRACKET);
			setState(359);
			indexType();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				indexType();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(RBRACKET);
			setState(368);
			match(OF);
			setState(369);
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
			setState(371);
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
			setState(373);
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
			setState(375);
			match(RECORD);
			setState(376);
			fieldList();
			setState(377);
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
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				fixedPart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				fixedPart();
				setState(381);
				match(SEMICOLON);
				setState(382);
				variant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
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
			setState(387);
			recordSection();
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(SEMICOLON);
					setState(389);
					recordSection();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				fieldIdentifier();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(396);
					match(COMMA);
					setState(397);
					fieldIdentifier();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(COLON);
				setState(404);
				type();
				}
				break;
			case EOF:
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
			setState(409);
			match(CASE);
			setState(410);
			tagField();
			setState(411);
			typeIdentifier();
			setState(412);
			match(OF);
			setState(413);
			variant();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(414);
				match(SEMICOLON);
				setState(415);
				variant();
				}
				}
				setState(420);
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				fieldIdentifier();
				setState(422);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
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
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INTEGER:
			case REAL:
			case STRING_LITERAL:
			case PLUSOP:
			case MINUSOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				caseLabelList();
				setState(428);
				match(COLON);
				{
				setState(429);
				fieldList();
				}
				}
				break;
			case EOF:
			case END:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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
			setState(434);
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
			setState(436);
			match(SET);
			setState(437);
			match(OF);
			setState(438);
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
			setState(440);
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
			setState(442);
			match(FILE);
			setState(443);
			match(OF);
			setState(444);
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
			setState(446);
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
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case FUNCTION:
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				empty();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(VAR);
				setState(450);
				variableDeclaration();
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(451);
						match(SEMICOLON);
						setState(452);
						variableDeclaration();
						}
						} 
					}
					setState(457);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(458);
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
			setState(462);
			match(IDENTIFIER);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(463);
				match(COMMA);
				setState(464);
				match(IDENTIFIER);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(COLON);
			setState(471);
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
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==PROCEDURE) {
				{
				{
				setState(473);
				procedureOrFunctionDeclaration();
				setState(474);
				match(SEMICOLON);
				}
				}
				setState(480);
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
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
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
			setState(485);
			procedureHeading();
			setState(486);
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
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(PROCEDURE);
				setState(489);
				match(IDENTIFIER);
				setState(490);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(PROCEDURE);
				setState(492);
				match(IDENTIFIER);
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
				match(IDENTIFIER);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(514);
					match(COMMA);
					setState(515);
					match(IDENTIFIER);
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
			setState(523);
			match(IDENTIFIER);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(524);
				match(COMMA);
				setState(525);
				match(IDENTIFIER);
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
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionDeclaration);
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
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(FUNCTION);
				setState(538);
				match(IDENTIFIER);
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
				match(IDENTIFIER);
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
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_resultType);
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
	}

	public final StatementPartContext statementPart() throws RecognitionException {
		StatementPartContext _localctx = new StatementPartContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_statementPart);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statement);
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
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unlabelledStatement);
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
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simpleStatement);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
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
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignmentStatement);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variable);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
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
	}

	public final EntireVariableContext entireVariable() throws RecognitionException {
		EntireVariableContext _localctx = new EntireVariableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_entireVariable);
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
			setState(598);
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
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
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
	}

	public final IndexedVariableContext indexedVariable() throws RecognitionException {
		IndexedVariableContext _localctx = new IndexedVariableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_indexedVariable);
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
			setState(617);
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
			setState(625);
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
			setState(627);
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
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
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
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case IDENTIFIER:
			case INTEGER:
			case REAL:
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
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
			setState(663);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
			setState(674);
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
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
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
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unsignedConstant);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
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
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionDesignator);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
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
			setState(708);
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
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_elementList);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case IDENTIFIER:
			case INTEGER:
			case REAL:
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
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_element);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
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
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_procedureStatement);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
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
			setState(747);
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
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
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
	}

	public final GoToStatementContext goToStatement() throws RecognitionException {
		GoToStatementContext _localctx = new GoToStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_goToStatement);
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
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_emptyStatement);
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
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_compoundStatement);
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
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_conditionalStatement);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ifStatement);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
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
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_caseStatement);
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
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_caseListElement);
		try {
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INTEGER:
			case REAL:
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
	}

	public final CaseLabelListContext caseLabelList() throws RecognitionException {
		CaseLabelListContext _localctx = new CaseLabelListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_caseLabelList);
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
	}

	public final RepetitiveStatementContext repetitiveStatement() throws RecognitionException {
		RepetitiveStatementContext _localctx = new RepetitiveStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_repetitiveStatement);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_whileStatement);
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
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_repeatStatement);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forStatement);
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
			setState(854);
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
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
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
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_initialValue);
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
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_finalValue);
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
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_withStatement);
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
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_recordVariableList);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u0376\4\2\t\2\4"+
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
		"\3\13\5\13\u011e\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u0125\n\r\3\r\3\r\3\r\3"+
		"\r\5\r\u012b\n\r\3\16\5\16\u012e\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u013d\n\22\f\22\16\22\u0140\13"+
		"\22\3\22\3\22\5\22\u0144\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u014d\n\24\3\25\3\25\3\25\5\25\u0152\n\25\3\26\3\26\3\26\7\26\u0157\n"+
		"\26\f\26\16\26\u015a\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\5\31\u0166\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u016d\n\32\f\32\16"+
		"\32\u0170\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0184\n\36\3\37\3\37\3\37\7\37"+
		"\u0189\n\37\f\37\16\37\u018c\13\37\3 \3 \3 \7 \u0191\n \f \16 \u0194\13"+
		" \3 \3 \3 \3 \5 \u019a\n \3!\3!\3!\3!\3!\3!\3!\7!\u01a3\n!\f!\16!\u01a6"+
		"\13!\3\"\3\"\3\"\3\"\5\"\u01ac\n\"\3#\3#\3#\3#\3#\5#\u01b3\n#\3$\3$\3"+
		"%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\7)\u01c8\n)\f)\16"+
		")\u01cb\13)\3)\3)\5)\u01cf\n)\3*\3*\3*\7*\u01d4\n*\f*\16*\u01d7\13*\3"+
		"*\3*\3*\3+\3+\3+\7+\u01df\n+\f+\16+\u01e2\13+\3,\3,\5,\u01e6\n,\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01f4\n.\f.\16.\u01f7\13.\3.\3.\3.\5"+
		".\u01fc\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0207\n/\f/\16/\u020a\13/\5/"+
		"\u020c\n/\3\60\3\60\3\60\7\60\u0211\n\60\f\60\16\60\u0214\13\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\7\62\u0228\n\62\f\62\16\62\u022b\13\62\3\62\3\62\3\62\3"+
		"\62\5\62\u0231\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u023c\n\65\3\66\3\66\5\66\u0240\n\66\3\67\3\67\3\67\3\67\5\67\u0246\n"+
		"\67\38\38\38\38\38\38\38\38\58\u0250\n8\39\39\39\59\u0255\n9\3:\3:\3;"+
		"\3;\3<\3<\3<\5<\u025e\n<\3=\3=\3=\3=\3=\7=\u0265\n=\f=\16=\u0268\13=\3"+
		"=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3"+
		"F\3F\5F\u0283\nF\3G\3G\3H\3H\3H\3H\3H\5H\u028c\nH\3H\3H\3H\3H\7H\u0292"+
		"\nH\fH\16H\u0295\13H\3I\3I\3J\3J\3J\3J\3J\3J\3J\7J\u02a0\nJ\fJ\16J\u02a3"+
		"\13J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u02b1\nL\3M\3M\3M\5M\u02b6"+
		"\nM\3N\3N\3N\3N\3N\3N\7N\u02be\nN\fN\16N\u02c1\13N\3N\3N\5N\u02c5\nN\3"+
		"O\3O\3P\3P\3P\3P\3Q\3Q\3Q\7Q\u02d0\nQ\fQ\16Q\u02d3\13Q\3Q\5Q\u02d6\nQ"+
		"\3R\3R\3R\3R\3R\5R\u02dd\nR\3S\3S\3S\3S\3S\3S\7S\u02e5\nS\fS\16S\u02e8"+
		"\13S\3S\3S\5S\u02ec\nS\3T\3T\3U\3U\3U\3U\5U\u02f4\nU\3V\3V\3V\3W\3W\3"+
		"X\3X\3Y\3Y\3Y\3Y\5Y\u0301\nY\3Z\3Z\3Z\3Z\7Z\u0307\nZ\fZ\16Z\u030a\13Z"+
		"\3Z\3Z\3[\3[\5[\u0310\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u031e\n\\\3]\3]\3]\3]\3]\3]\7]\u0326\n]\f]\16]\u0329\13]\3]\3]"+
		"\3^\3^\3^\3^\3^\5^\u0332\n^\3_\3_\3_\7_\u0337\n_\f_\16_\u033a\13_\3`\3"+
		"`\3`\5`\u033f\n`\3a\3a\3a\3a\3a\3b\3b\3b\3b\7b\u034a\nb\fb\16b\u034d\13"+
		"b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0363"+
		"\ne\3f\3f\3g\3g\3h\3h\3h\3h\3h\3i\3i\3i\7i\u0371\ni\fi\16i\u0374\13i\3"+
		"i\2\4\u008e\u0092j\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\2\7\3\2\3\4\3\2@A\4\2\33\33EJ\4\2&&@A\6\2\5\5\17\17\37\37BC\2\u036a"+
		"\2\u00d2\3\2\2\2\4\u00db\3\2\2\2\6\u00df\3\2\2\2\b\u00e7\3\2\2\2\n\u00fa"+
		"\3\2\2\2\f\u00fc\3\2\2\2\16\u010a\3\2\2\2\20\u010c\3\2\2\2\22\u0119\3"+
		"\2\2\2\24\u011d\3\2\2\2\26\u011f\3\2\2\2\30\u012a\3\2\2\2\32\u012d\3\2"+
		"\2\2\34\u0131\3\2\2\2\36\u0133\3\2\2\2 \u0135\3\2\2\2\"\u0143\3\2\2\2"+
		"$\u0145\3\2\2\2&\u014c\3\2\2\2(\u0151\3\2\2\2*\u0153\3\2\2\2,\u015b\3"+
		"\2\2\2.\u015f\3\2\2\2\60\u0165\3\2\2\2\62\u0167\3\2\2\2\64\u0175\3\2\2"+
		"\2\66\u0177\3\2\2\28\u0179\3\2\2\2:\u0183\3\2\2\2<\u0185\3\2\2\2>\u0199"+
		"\3\2\2\2@\u019b\3\2\2\2B\u01ab\3\2\2\2D\u01b2\3\2\2\2F\u01b4\3\2\2\2H"+
		"\u01b6\3\2\2\2J\u01ba\3\2\2\2L\u01bc\3\2\2\2N\u01c0\3\2\2\2P\u01ce\3\2"+
		"\2\2R\u01d0\3\2\2\2T\u01e0\3\2\2\2V\u01e5\3\2\2\2X\u01e7\3\2\2\2Z\u01fb"+
		"\3\2\2\2\\\u020b\3\2\2\2^\u020d\3\2\2\2`\u0218\3\2\2\2b\u0230\3\2\2\2"+
		"d\u0232\3\2\2\2f\u0234\3\2\2\2h\u023b\3\2\2\2j\u023f\3\2\2\2l\u0245\3"+
		"\2\2\2n\u024f\3\2\2\2p\u0254\3\2\2\2r\u0256\3\2\2\2t\u0258\3\2\2\2v\u025d"+
		"\3\2\2\2x\u025f\3\2\2\2z\u026b\3\2\2\2|\u026d\3\2\2\2~\u0271\3\2\2\2\u0080"+
		"\u0273\3\2\2\2\u0082\u0275\3\2\2\2\u0084\u0277\3\2\2\2\u0086\u0279\3\2"+
		"\2\2\u0088\u027b\3\2\2\2\u008a\u0282\3\2\2\2\u008c\u0284\3\2\2\2\u008e"+
		"\u028b\3\2\2\2\u0090\u0296\3\2\2\2\u0092\u0298\3\2\2\2\u0094\u02a4\3\2"+
		"\2\2\u0096\u02b0\3\2\2\2\u0098\u02b5\3\2\2\2\u009a\u02c4\3\2\2\2\u009c"+
		"\u02c6\3\2\2\2\u009e\u02c8\3\2\2\2\u00a0\u02d5\3\2\2\2\u00a2\u02dc\3\2"+
		"\2\2\u00a4\u02eb\3\2\2\2\u00a6\u02ed\3\2\2\2\u00a8\u02f3\3\2\2\2\u00aa"+
		"\u02f5\3\2\2\2\u00ac\u02f8\3\2\2\2\u00ae\u02fa\3\2\2\2\u00b0\u0300\3\2"+
		"\2\2\u00b2\u0302\3\2\2\2\u00b4\u030f\3\2\2\2\u00b6\u031d\3\2\2\2\u00b8"+
		"\u031f\3\2\2\2\u00ba\u0331\3\2\2\2\u00bc\u0333\3\2\2\2\u00be\u033e\3\2"+
		"\2\2\u00c0\u0340\3\2\2\2\u00c2\u0345\3\2\2\2\u00c4\u0351\3\2\2\2\u00c6"+
		"\u0358\3\2\2\2\u00c8\u0362\3\2\2\2\u00ca\u0364\3\2\2\2\u00cc\u0366\3\2"+
		"\2\2\u00ce\u0368\3\2\2\2\u00d0\u036d\3\2\2\2\u00d2\u00d3\7)\2\2\u00d3"+
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
		"\25\3\2\2\2\u011f\u0120\7<\2\2\u0120\27\3\2\2\2\u0121\u0124\7=\2\2\u0122"+
		"\u0123\t\2\2\2\u0123\u0125\5\32\16\2\u0124\u0122\3\2\2\2\u0124\u0125\3"+
		"\2\2\2\u0125\u012b\3\2\2\2\u0126\u0127\5\26\f\2\u0127\u0128\t\2\2\2\u0128"+
		"\u0129\5\32\16\2\u0129\u012b\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0126\3"+
		"\2\2\2\u012b\31\3\2\2\2\u012c\u012e\5\34\17\2\u012d\u012c\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\26\f\2\u0130\33\3\2\2"+
		"\2\u0131\u0132\t\3\2\2\u0132\35\3\2\2\2\u0133\u0134\7;\2\2\u0134\37\3"+
		"\2\2\2\u0135\u0136\7?\2\2\u0136!\3\2\2\2\u0137\u0144\5\u00aeX\2\u0138"+
		"\u0139\7\63\2\2\u0139\u013e\5$\23\2\u013a\u013b\7P\2\2\u013b\u013d\5$"+
		"\23\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7P"+
		"\2\2\u0142\u0144\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u0138\3\2\2\2\u0144"+
		"#\3\2\2\2\u0145\u0146\7;\2\2\u0146\u0147\7E\2\2\u0147\u0148\5&\24\2\u0148"+
		"%\3\2\2\2\u0149\u014d\5(\25\2\u014a\u014d\5\60\31\2\u014b\u014d\5N(\2"+
		"\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\'\3"+
		"\2\2\2\u014e\u0152\5*\26\2\u014f\u0152\5,\27\2\u0150\u0152\5.\30\2\u0151"+
		"\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152)\3\2\2\2"+
		"\u0153\u0158\7;\2\2\u0154\u0155\7Q\2\2\u0155\u0157\7;\2\2\u0156\u0154"+
		"\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"+\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\5\22\n\2\u015c\u015d\7Z\2\2"+
		"\u015d\u015e\5\22\n\2\u015e-\3\2\2\2\u015f\u0160\7;\2\2\u0160/\3\2\2\2"+
		"\u0161\u0166\5\62\32\2\u0162\u0166\58\35\2\u0163\u0166\5H%\2\u0164\u0166"+
		"\5L\'\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\61\3\2\2\2\u0167\u0168\7\6\2\2\u0168\u0169\7T\2\2"+
		"\u0169\u016e\5\64\33\2\u016a\u016b\7Q\2\2\u016b\u016d\5\64\33\2\u016c"+
		"\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7U\2\2\u0172"+
		"\u0173\7#\2\2\u0173\u0174\5\66\34\2\u0174\63\3\2\2\2\u0175\u0176\5(\25"+
		"\2\u0176\65\3\2\2\2\u0177\u0178\5&\24\2\u0178\67\3\2\2\2\u0179\u017a\7"+
		"*\2\2\u017a\u017b\5:\36\2\u017b\u017c\7\23\2\2\u017c9\3\2\2\2\u017d\u0184"+
		"\5<\37\2\u017e\u017f\5<\37\2\u017f\u0180\7P\2\2\u0180\u0181\5D#\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0184\5D#\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2\2"+
		"\2\u0183\u0182\3\2\2\2\u0184;\3\2\2\2\u0185\u018a\5> \2\u0186\u0187\7"+
		"P\2\2\u0187\u0189\5> \2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b=\3\2\2\2\u018c\u018a\3\2\2\2"+
		"\u018d\u0192\5\u0080A\2\u018e\u018f\7Q\2\2\u018f\u0191\5\u0080A\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7\\\2\2\u0196"+
		"\u0197\5&\24\2\u0197\u019a\3\2\2\2\u0198\u019a\5\u00aeX\2\u0199\u018d"+
		"\3\2\2\2\u0199\u0198\3\2\2\2\u019a?\3\2\2\2\u019b\u019c\7\n\2\2\u019c"+
		"\u019d\5B\"\2\u019d\u019e\5.\30\2\u019e\u019f\7#\2\2\u019f\u01a4\5D#\2"+
		"\u01a0\u01a1\7P\2\2\u01a1\u01a3\5D#\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5A\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\5\u0080A\2\u01a8\u01a9\7\\\2\2\u01a9\u01ac"+
		"\3\2\2\2\u01aa\u01ac\5\u00aeX\2\u01ab\u01a7\3\2\2\2\u01ab\u01aa\3\2\2"+
		"\2\u01acC\3\2\2\2\u01ad\u01ae\5\u00bc_\2\u01ae\u01af\7\\\2\2\u01af\u01b0"+
		"\5:\36\2\u01b0\u01b3\3\2\2\2\u01b1\u01b3\5\u00aeX\2\u01b2\u01ad\3\2\2"+
		"\2\u01b2\u01b1\3\2\2\2\u01b3E\3\2\2\2\u01b4\u01b5\5\22\n\2\u01b5G\3\2"+
		"\2\2\u01b6\u01b7\7,\2\2\u01b7\u01b8\7#\2\2\u01b8\u01b9\5J&\2\u01b9I\3"+
		"\2\2\2\u01ba\u01bb\5(\25\2\u01bbK\3\2\2\2\u01bc\u01bd\7\25\2\2\u01bd\u01be"+
		"\7#\2\2\u01be\u01bf\5&\24\2\u01bfM\3\2\2\2\u01c0\u01c1\5.\30\2\u01c1O"+
		"\3\2\2\2\u01c2\u01cf\5\u00aeX\2\u01c3\u01c4\7\67\2\2\u01c4\u01c9\5R*\2"+
		"\u01c5\u01c6\7P\2\2\u01c6\u01c8\5R*\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01cd\7P\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01c2\3\2"+
		"\2\2\u01ce\u01c3\3\2\2\2\u01cfQ\3\2\2\2\u01d0\u01d5\7;\2\2\u01d1\u01d2"+
		"\7Q\2\2\u01d2\u01d4\7;\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01d9\7\\\2\2\u01d9\u01da\5&\24\2\u01daS\3\2\2\2\u01db\u01dc"+
		"\5V,\2\u01dc\u01dd\7P\2\2\u01dd\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1U\3\2\2\2"+
		"\u01e2\u01e0\3\2\2\2\u01e3\u01e6\5X-\2\u01e4\u01e6\5`\61\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6W\3\2\2\2\u01e7\u01e8\5Z.\2\u01e8\u01e9"+
		"\5\b\5\2\u01e9Y\3\2\2\2\u01ea\u01eb\7(\2\2\u01eb\u01ec\7;\2\2\u01ec\u01fc"+
		"\7P\2\2\u01ed\u01ee\7(\2\2\u01ee\u01ef\7;\2\2\u01ef\u01f0\7R\2\2\u01f0"+
		"\u01f5\5\\/\2\u01f1\u01f2\7P\2\2\u01f2\u01f4\5\\/\2\u01f3\u01f1\3\2\2"+
		"\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7S\2\2\u01f9\u01fa\7P\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01ea\3\2\2\2\u01fb\u01ed\3\2\2\2\u01fc[\3\2\2\2"+
		"\u01fd\u020c\5^\60\2\u01fe\u01ff\7\67\2\2\u01ff\u020c\5^\60\2\u0200\u0201"+
		"\7\27\2\2\u0201\u020c\5^\60\2\u0202\u0203\7(\2\2\u0203\u0208\7;\2\2\u0204"+
		"\u0205\7Q\2\2\u0205\u0207\7;\2\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u01fd\3\2\2\2\u020b\u01fe\3\2\2\2\u020b\u0200\3\2\2\2\u020b"+
		"\u0202\3\2\2\2\u020c]\3\2\2\2\u020d\u0212\7;\2\2\u020e\u020f\7Q\2\2\u020f"+
		"\u0211\7;\2\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0216\7\\\2\2\u0216\u0217\5.\30\2\u0217_\3\2\2\2\u0218\u0219\5b\62\2"+
		"\u0219\u021a\5\b\5\2\u021aa\3\2\2\2\u021b\u021c\7\27\2\2\u021c\u021d\7"+
		";\2\2\u021d\u021e\7\\\2\2\u021e\u021f\5d\63\2\u021f\u0220\7P\2\2\u0220"+
		"\u0231\3\2\2\2\u0221\u0222\7\27\2\2\u0222\u0223\7;\2\2\u0223\u0224\7R"+
		"\2\2\u0224\u0229\5\\/\2\u0225\u0226\7P\2\2\u0226\u0228\5\\/\2\u0227\u0225"+
		"\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7S\2\2\u022d\u022e\5d\63"+
		"\2\u022e\u022f\7P\2\2\u022f\u0231\3\2\2\2\u0230\u021b\3\2\2\2\u0230\u0221"+
		"\3\2\2\2\u0231c\3\2\2\2\u0232\u0233\5.\30\2\u0233e\3\2\2\2\u0234\u0235"+
		"\5\u00b2Z\2\u0235g\3\2\2\2\u0236\u023c\5j\66\2\u0237\u0238\5\f\7\2\u0238"+
		"\u0239\7\\\2\2\u0239\u023a\5j\66\2\u023a\u023c\3\2\2\2\u023b\u0236\3\2"+
		"\2\2\u023b\u0237\3\2\2\2\u023ci\3\2\2\2\u023d\u0240\5l\67\2\u023e\u0240"+
		"\5\u00b0Y\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240k\3\2\2\2\u0241"+
		"\u0246\5n8\2\u0242\u0246\5\u00a4S\2\u0243\u0246\5\u00aaV\2\u0244\u0246"+
		"\5\u00acW\2\u0245\u0241\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0243\3\2\2"+
		"\2\u0245\u0244\3\2\2\2\u0246m\3\2\2\2\u0247\u0248\5p9\2\u0248\u0249\7"+
		"D\2\2\u0249\u024a\5\u008aF\2\u024a\u0250\3\2\2\2\u024b\u024c\5\u009cO"+
		"\2\u024c\u024d\7D\2\2\u024d\u024e\5\u008aF\2\u024e\u0250\3\2\2\2\u024f"+
		"\u0247\3\2\2\2\u024f\u024b\3\2\2\2\u0250o\3\2\2\2\u0251\u0255\5r:\2\u0252"+
		"\u0255\5v<\2\u0253\u0255\5\u0086D\2\u0254\u0251\3\2\2\2\u0254\u0252\3"+
		"\2\2\2\u0254\u0253\3\2\2\2\u0255q\3\2\2\2\u0256\u0257\5t;\2\u0257s\3\2"+
		"\2\2\u0258\u0259\7;\2\2\u0259u\3\2\2\2\u025a\u025e\5x=\2\u025b\u025e\5"+
		"|?\2\u025c\u025e\5\u0082B\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025c\3\2\2\2\u025ew\3\2\2\2\u025f\u0260\5z>\2\u0260\u0261\7T\2\2\u0261"+
		"\u0266\5\u008aF\2\u0262\u0263\7Q\2\2\u0263\u0265\5\u008aF\2\u0264\u0262"+
		"\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\7U\2\2\u026ay\3\2\2\2\u026b"+
		"\u026c\7;\2\2\u026c{\3\2\2\2\u026d\u026e\5~@\2\u026e\u026f\7[\2\2\u026f"+
		"\u0270\5\u0080A\2\u0270}\3\2\2\2\u0271\u0272\7;\2\2\u0272\177\3\2\2\2"+
		"\u0273\u0274\7;\2\2\u0274\u0081\3\2\2\2\u0275\u0276\7;\2\2\u0276\u0083"+
		"\3\2\2\2\u0277\u0278\7;\2\2\u0278\u0085\3\2\2\2\u0279\u027a\5\u0088E\2"+
		"\u027a\u0087\3\2\2\2\u027b\u027c\7;\2\2\u027c\u0089\3\2\2\2\u027d\u0283"+
		"\5\u008eH\2\u027e\u027f\5\u008eH\2\u027f\u0280\5\u008cG\2\u0280\u0281"+
		"\5\u008eH\2\u0281\u0283\3\2\2\2\u0282\u027d\3\2\2\2\u0282\u027e\3\2\2"+
		"\2\u0283\u008b\3\2\2\2\u0284\u0285\t\4\2\2\u0285\u008d\3\2\2\2\u0286\u0287"+
		"\bH\1\2\u0287\u028c\5\u0092J\2\u0288\u0289\5\34\17\2\u0289\u028a\5\u0092"+
		"J\2\u028a\u028c\3\2\2\2\u028b\u0286\3\2\2\2\u028b\u0288\3\2\2\2\u028c"+
		"\u0293\3\2\2\2\u028d\u028e\f\3\2\2\u028e\u028f\5\u0090I\2\u028f\u0290"+
		"\5\u0092J\2\u0290\u0292\3\2\2\2\u0291\u028d\3\2\2\2\u0292\u0295\3\2\2"+
		"\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u008f\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0297\t\5\2\2\u0297\u0091\3\2\2\2\u0298\u0299\bJ\1\2\u0299"+
		"\u029a\5\u0096L\2\u029a\u02a1\3\2\2\2\u029b\u029c\f\3\2\2\u029c\u029d"+
		"\5\u0094K\2\u029d\u029e\5\u0096L\2\u029e\u02a0\3\2\2\2\u029f\u029b\3\2"+
		"\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u0093\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5\t\6\2\2\u02a5\u0095\3\2"+
		"\2\2\u02a6\u02b1\5p9\2\u02a7\u02b1\5\u0098M\2\u02a8\u02a9\7R\2\2\u02a9"+
		"\u02aa\5\u008aF\2\u02aa\u02ab\7S\2\2\u02ab\u02b1\3\2\2\2\u02ac\u02b1\5"+
		"\u009aN\2\u02ad\u02b1\5\u009eP\2\u02ae\u02af\7!\2\2\u02af\u02b1\5\u0096"+
		"L\2\u02b0\u02a6\3\2\2\2\u02b0\u02a7\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0"+
		"\u02ac\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u0097\3\2"+
		"\2\2\u02b2\u02b6\5\24\13\2\u02b3\u02b6\5 \21\2\u02b4\u02b6\5\36\20\2\u02b5"+
		"\u02b2\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u0099\3\2"+
		"\2\2\u02b7\u02c5\5\u009cO\2\u02b8\u02b9\5\u009cO\2\u02b9\u02ba\7R\2\2"+
		"\u02ba\u02bf\5\u00a8U\2\u02bb\u02bc\7Q\2\2\u02bc\u02be\5\u00a8U\2\u02bd"+
		"\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7S\2\2\u02c3"+
		"\u02c5\3\2\2\2\u02c4\u02b7\3\2\2\2\u02c4\u02b8\3\2\2\2\u02c5\u009b\3\2"+
		"\2\2\u02c6\u02c7\7;\2\2\u02c7\u009d\3\2\2\2\u02c8\u02c9\7T\2\2\u02c9\u02ca"+
		"\5\u00a0Q\2\u02ca\u02cb\7U\2\2\u02cb\u009f\3\2\2\2\u02cc\u02d1\5\u00a2"+
		"R\2\u02cd\u02ce\7Q\2\2\u02ce\u02d0\5\u00a2R\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d6\3\2"+
		"\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d6\5\u00aeX\2\u02d5\u02cc\3\2\2\2\u02d5"+
		"\u02d4\3\2\2\2\u02d6\u00a1\3\2\2\2\u02d7\u02dd\5\u008aF\2\u02d8\u02d9"+
		"\5\u008aF\2\u02d9\u02da\7Z\2\2\u02da\u02db\5\u008aF\2\u02db\u02dd\3\2"+
		"\2\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dd\u00a3\3\2\2\2\u02de"+
		"\u02ec\5\u00a6T\2\u02df\u02e0\5\u00a6T\2\u02e0\u02e1\7R\2\2\u02e1\u02e6"+
		"\5\u00a8U\2\u02e2\u02e3\7Q\2\2\u02e3\u02e5\5\u00a8U\2\u02e4\u02e2\3\2"+
		"\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e9\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\7S\2\2\u02ea\u02ec\3\2"+
		"\2\2\u02eb\u02de\3\2\2\2\u02eb\u02df\3\2\2\2\u02ec\u00a5\3\2\2\2\u02ed"+
		"\u02ee\7;\2\2\u02ee\u00a7\3\2\2\2\u02ef\u02f4\5\u008aF\2\u02f0\u02f4\5"+
		"p9\2\u02f1\u02f4\5\u00a6T\2\u02f2\u02f4\5\u009cO\2\u02f3\u02ef\3\2\2\2"+
		"\u02f3\u02f0\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4\u00a9"+
		"\3\2\2\2\u02f5\u02f6\7\30\2\2\u02f6\u02f7\5\f\7\2\u02f7\u00ab\3\2\2\2"+
		"\u02f8\u02f9\5\u00aeX\2\u02f9\u00ad\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u00af\3\2\2\2\u02fc\u0301\5\u00b2Z\2\u02fd\u0301\5\u00b4[\2\u02fe\u0301"+
		"\5\u00be`\2\u02ff\u0301\5\u00ceh\2\u0300\u02fc\3\2\2\2\u0300\u02fd\3\2"+
		"\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301\u00b1\3\2\2\2\u0302"+
		"\u0303\7\b\2\2\u0303\u0308\5h\65\2\u0304\u0305\7P\2\2\u0305\u0307\5h\65"+
		"\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\7\23\2\2"+
		"\u030c\u00b3\3\2\2\2\u030d\u0310\5\u00b6\\\2\u030e\u0310\5\u00b8]\2\u030f"+
		"\u030d\3\2\2\2\u030f\u030e\3\2\2\2\u0310\u00b5\3\2\2\2\u0311\u0312\7\31"+
		"\2\2\u0312\u0313\5\u008aF\2\u0313\u0314\7\60\2\2\u0314\u0315\5h\65\2\u0315"+
		"\u031e\3\2\2\2\u0316\u0317\7\31\2\2\u0317\u0318\5\u008aF\2\u0318\u0319"+
		"\7\60\2\2\u0319\u031a\5h\65\2\u031a\u031b\7\22\2\2\u031b\u031c\5h\65\2"+
		"\u031c\u031e\3\2\2\2\u031d\u0311\3\2\2\2\u031d\u0316\3\2\2\2\u031e\u00b7"+
		"\3\2\2\2\u031f\u0320\7\n\2\2\u0320\u0321\5\u008aF\2\u0321\u0322\7#\2\2"+
		"\u0322\u0327\5\u00ba^\2\u0323\u0324\7P\2\2\u0324\u0326\5\u00ba^\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b\7\23\2\2\u032b"+
		"\u00b9\3\2\2\2\u032c\u032d\5\u00bc_\2\u032d\u032e\7\\\2\2\u032e\u032f"+
		"\5h\65\2\u032f\u0332\3\2\2\2\u0330\u0332\5\u00aeX\2\u0331\u032c\3\2\2"+
		"\2\u0331\u0330\3\2\2\2\u0332\u00bb\3\2\2\2\u0333\u0338\5F$\2\u0334\u0335"+
		"\7Q\2\2\u0335\u0337\5F$\2\u0336\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u00bd\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033b\u033f\5\u00c0a\2\u033c\u033f\5\u00c2b\2\u033d\u033f\5\u00c4"+
		"c\2\u033e\u033b\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033f"+
		"\u00bf\3\2\2\2\u0340\u0341\78\2\2\u0341\u0342\5\u008aF\2\u0342\u0343\7"+
		"\20\2\2\u0343\u0344\5h\65\2\u0344\u00c1\3\2\2\2\u0345\u0346\7+\2\2\u0346"+
		"\u034b\5h\65\2\u0347\u0348\7P\2\2\u0348\u034a\5h\65\2\u0349\u0347\3\2"+
		"\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7\65\2\2\u034f\u0350\5"+
		"\u008aF\2\u0350\u00c3\3\2\2\2\u0351\u0352\7\26\2\2\u0352\u0353\5\u00c6"+
		"d\2\u0353\u0354\7D\2\2\u0354\u0355\5\u00c8e\2\u0355\u0356\7\20\2\2\u0356"+
		"\u0357\5h\65\2\u0357\u00c5\3\2\2\2\u0358\u0359\7;\2\2\u0359\u00c7\3\2"+
		"\2\2\u035a\u035b\5\u00caf\2\u035b\u035c\7\61\2\2\u035c\u035d\5\u00ccg"+
		"\2\u035d\u0363\3\2\2\2\u035e\u035f\5\u00caf\2\u035f\u0360\7\21\2\2\u0360"+
		"\u0361\5\u00ccg\2\u0361\u0363\3\2\2\2\u0362\u035a\3\2\2\2\u0362\u035e"+
		"\3\2\2\2\u0363\u00c9\3\2\2\2\u0364\u0365\5\u008aF\2\u0365\u00cb\3\2\2"+
		"\2\u0366\u0367\5\u008aF\2\u0367\u00cd\3\2\2\2\u0368\u0369\79\2\2\u0369"+
		"\u036a\5\u00d0i\2\u036a\u036b\7\20\2\2\u036b\u036c\5h\65\2\u036c\u00cf"+
		"\3\2\2\2\u036d\u0372\5~@\2\u036e\u036f\7Q\2\2\u036f\u0371\5~@\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u00d1\3\2\2\2\u0374\u0372\3\2\2\2G\u00d5\u00e4\u00f5\u00fa"+
		"\u0105\u010a\u0119\u011d\u0124\u012a\u012d\u013e\u0143\u014c\u0151\u0158"+
		"\u0165\u016e\u0183\u018a\u0192\u0199\u01a4\u01ab\u01b2\u01c9\u01ce\u01d5"+
		"\u01e0\u01e5\u01f5\u01fb\u0208\u020b\u0212\u0229\u0230\u023b\u023f\u0245"+
		"\u024f\u0254\u025d\u0266\u0282\u028b\u0293\u02a1\u02b0\u02b5\u02bf\u02c4"+
		"\u02d1\u02d5\u02dc\u02e6\u02eb\u02f3\u0300\u0308\u030f\u031d\u0327\u0331"+
		"\u0338\u033e\u034b\u0362\u0372";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}