// Generated from pascal2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascal2Parser extends Parser {
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
		XOR=54, CHR=55, CHAR=56, BOOLEAN=57, INTEGER=58, REAL=59, PLUS=60, MINUS=61, 
		STAR=62, SLASH=63, ASSIGN=64, COMMA=65, SEMI=66, COLON=67, EQUAL=68, NOT_EQUAL=69, 
		LT=70, LE=71, GE=72, GT=73, LPAREN=74, RPAREN=75, LBRACK=76, LBRACK2=77, 
		RBRACK=78, RBRACK2=79, POINTER=80, AT=81, DOT=82, DOTDOT=83, LCURLY=84, 
		RCURLY=85, WS=86, COMMENT_1=87, COMMENT_2=88, IDENT=89, STRING_LITERAL=90, 
		NUM_INT=91, NUM_REAL=92;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_usesUnitsPart = 4, RULE_labelDeclarationPart = 5, RULE_label = 6, 
		RULE_constantDefinitionPart = 7, RULE_constantDefinition = 8, RULE_constantChr = 9, 
		RULE_constant = 10, RULE_unsignedNumber = 11, RULE_unsignedInteger = 12, 
		RULE_unsignedReal = 13, RULE_sign = 14, RULE_bool_ = 15, RULE_string = 16, 
		RULE_typeDefinitionPart = 17, RULE_typeDefinition = 18, RULE_functionType = 19, 
		RULE_procedureType = 20, RULE_type_ = 21, RULE_simpleType = 22, RULE_scalarType = 23, 
		RULE_subrangeType = 24, RULE_typeIdentifier = 25, RULE_structuredType = 26, 
		RULE_unpackedStructuredType = 27, RULE_stringtype = 28, RULE_arrayType = 29, 
		RULE_typeList = 30, RULE_indexType = 31, RULE_componentType = 32, RULE_recordType = 33, 
		RULE_fieldList = 34, RULE_fixedPart = 35, RULE_recordSection = 36, RULE_variantPart = 37, 
		RULE_tag = 38, RULE_variant = 39, RULE_setType = 40, RULE_baseType = 41, 
		RULE_fileType = 42, RULE_pointerType = 43, RULE_variableDeclarationPart = 44, 
		RULE_variableDeclaration = 45, RULE_procedureAndFunctionDeclarationPart = 46, 
		RULE_procedureOrFunctionDeclaration = 47, RULE_procedureDeclaration = 48, 
		RULE_formalParameterList = 49, RULE_formalParameterSection = 50, RULE_parameterGroup = 51, 
		RULE_identifierList = 52, RULE_constList = 53, RULE_functionDeclaration = 54, 
		RULE_resultType = 55, RULE_statement = 56, RULE_unlabelledStatement = 57, 
		RULE_simpleStatement = 58, RULE_assignmentStatement = 59, RULE_variable = 60, 
		RULE_expression = 61, RULE_relationaloperator = 62, RULE_simpleExpression = 63, 
		RULE_additiveoperator = 64, RULE_term = 65, RULE_multiplicativeoperator = 66, 
		RULE_signedFactor = 67, RULE_factor = 68, RULE_unsignedConstant = 69, 
		RULE_functionDesignator = 70, RULE_parameterList = 71, RULE_set_ = 72, 
		RULE_elementList = 73, RULE_element = 74, RULE_procedureStatement = 75, 
		RULE_actualParameter = 76, RULE_parameterwidth = 77, RULE_gotoStatement = 78, 
		RULE_emptyStatement_ = 79, RULE_empty_ = 80, RULE_structuredStatement = 81, 
		RULE_compoundStatement = 82, RULE_statements = 83, RULE_conditionalStatement = 84, 
		RULE_ifStatement = 85, RULE_caseStatement = 86, RULE_caseListElement = 87, 
		RULE_repetetiveStatement = 88, RULE_whileStatement = 89, RULE_repeatStatement = 90, 
		RULE_forStatement = 91, RULE_forList = 92, RULE_initialValue = 93, RULE_finalValue = 94, 
		RULE_withStatement = 95, RULE_recordVariableList = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "identifier", "block", "usesUnitsPart", 
			"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
			"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
			"sign", "bool_", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
			"procedureType", "type_", "simpleType", "scalarType", "subrangeType", 
			"typeIdentifier", "structuredType", "unpackedStructuredType", "stringtype", 
			"arrayType", "typeList", "indexType", "componentType", "recordType", 
			"fieldList", "fixedPart", "recordSection", "variantPart", "tag", "variant", 
			"setType", "baseType", "fileType", "pointerType", "variableDeclarationPart", 
			"variableDeclaration", "procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
			"procedureDeclaration", "formalParameterList", "formalParameterSection", 
			"parameterGroup", "identifierList", "constList", "functionDeclaration", 
			"resultType", "statement", "unlabelledStatement", "simpleStatement", 
			"assignmentStatement", "variable", "expression", "relationaloperator", 
			"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
			"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
			"set_", "elementList", "element", "procedureStatement", "actualParameter", 
			"parameterwidth", "gotoStatement", "emptyStatement_", "empty_", "structuredStatement", 
			"compoundStatement", "statements", "conditionalStatement", "ifStatement", 
			"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
			"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
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
			"'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", "'<>'", 
			"'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", 
			"'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
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
			"VAR", "WHILE", "WITH", "XOR", "CHR", "CHAR", "BOOLEAN", "INTEGER", "REAL", 
			"PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
			"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
			"RCURLY", "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", 
			"NUM_INT", "NUM_REAL"
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
	public String getGrammarFileName() { return "pascal2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascal2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pascal2Parser.DOT, 0); }
		public TerminalNode EOF() { return getToken(pascal2Parser.EOF, 0); }
		public TerminalNode INTERFACE() { return getToken(pascal2Parser.INTERFACE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			programHeading();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERFACE) {
				{
				setState(195);
				match(INTERFACE);
				}
			}

			setState(198);
			block();
			setState(199);
			match(DOT);
			setState(200);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PROGRAM() { return getToken(pascal2Parser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public TerminalNode UNIT() { return getToken(pascal2Parser.UNIT, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProgramHeading(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(PROGRAM);
				setState(203);
				identifier();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(204);
					match(LPAREN);
					setState(205);
					identifierList();
					setState(206);
					match(RPAREN);
					}
				}

				setState(210);
				match(SEMI);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(UNIT);
				setState(213);
				identifier();
				setState(214);
				match(SEMI);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascal2Parser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<LabelDeclarationPartContext> labelDeclarationPart() {
			return getRuleContexts(LabelDeclarationPartContext.class);
		}
		public LabelDeclarationPartContext labelDeclarationPart(int i) {
			return getRuleContext(LabelDeclarationPartContext.class,i);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public List<UsesUnitsPartContext> usesUnitsPart() {
			return getRuleContexts(UsesUnitsPartContext.class);
		}
		public UsesUnitsPartContext usesUnitsPart(int i) {
			return getRuleContext(UsesUnitsPartContext.class,i);
		}
		public List<TerminalNode> IMPLEMENTATION() { return getTokens(pascal2Parser.IMPLEMENTATION); }
		public TerminalNode IMPLEMENTATION(int i) {
			return getToken(pascal2Parser.IMPLEMENTATION, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << FUNCTION) | (1L << IMPLEMENTATION) | (1L << LABEL) | (1L << PROCEDURE) | (1L << TYPE) | (1L << USES) | (1L << VAR))) != 0)) {
				{
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(220);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(221);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(222);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(223);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(224);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(225);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(226);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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

	public static class UsesUnitsPartContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(pascal2Parser.USES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public UsesUnitsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesUnitsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUsesUnitsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUsesUnitsPart(this);
		}
	}

	public final UsesUnitsPartContext usesUnitsPart() throws RecognitionException {
		UsesUnitsPartContext _localctx = new UsesUnitsPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_usesUnitsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(USES);
			setState(235);
			identifierList();
			setState(236);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LABEL() { return getToken(pascal2Parser.LABEL, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterLabelDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitLabelDeclarationPart(this);
		}
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LABEL);
			setState(239);
			label();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				label();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		public TerminalNode CONST() { return getToken(pascal2Parser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitConstantDefinitionPart(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CONST);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				constantDefinition();
				setState(253);
				match(SEMI);
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQUAL() { return getToken(pascal2Parser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitConstantDefinition(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			identifier();
			setState(260);
			match(EQUAL);
			setState(261);
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

	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(pascal2Parser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitConstantChr(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CHR);
			setState(264);
			match(LPAREN);
			setState(265);
			unsignedInteger();
			setState(266);
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

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				sign();
				setState(270);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				sign();
				setState(274);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				constantChr();
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsignedNumber);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
		public TerminalNode NUM_INT() { return getToken(pascal2Parser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NUM_REAL() { return getToken(pascal2Parser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUnsignedReal(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PLUS() { return getToken(pascal2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascal2Parser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Bool_Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(pascal2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascal2Parser.FALSE, 0); }
		public Bool_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterBool_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitBool_(this);
		}
	}

	public final Bool_Context bool_() throws RecognitionException {
		Bool_Context _localctx = new Bool_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(pascal2Parser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		public TerminalNode TYPE() { return getToken(pascal2Parser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitTypeDefinitionPart(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(TYPE);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				typeDefinition();
				setState(296);
				match(SEMI);
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQUAL() { return getToken(pascal2Parser.EQUAL, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			identifier();
			setState(303);
			match(EQUAL);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
			case STRING:
			case CHR:
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case POINTER:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(304);
				type_();
				}
				break;
			case FUNCTION:
				{
				setState(305);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(306);
				procedureType();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascal2Parser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(FUNCTION);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(310);
				formalParameterList();
				}
			}

			setState(313);
			match(COLON);
			setState(314);
			resultType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureTypeContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(pascal2Parser.PROCEDURE, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProcedureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProcedureType(this);
		}
	}

	public final ProcedureTypeContext procedureType() throws RecognitionException {
		ProcedureTypeContext _localctx = new ProcedureTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(PROCEDURE);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(317);
				formalParameterList();
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

	public static class Type_Context extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case CHR:
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				simpleType();
				}
				break;
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				structuredType();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				pointerType();
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
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleType);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				stringtype();
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
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitScalarType(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LPAREN);
			setState(332);
			identifierList();
			setState(333);
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
		public TerminalNode DOTDOT() { return getToken(pascal2Parser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSubrangeType(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			constant();
			setState(336);
			match(DOTDOT);
			setState(337);
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
		public TerminalNode CHAR() { return getToken(pascal2Parser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascal2Parser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(pascal2Parser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(pascal2Parser.REAL, 0); }
		public TerminalNode STRING() { return getToken(pascal2Parser.STRING, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeIdentifier);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				identifier();
				}
				break;
			case STRING:
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << REAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class StructuredTypeContext extends ParserRuleContext {
		public TerminalNode PACKED() { return getToken(pascal2Parser.PACKED, 0); }
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitStructuredType(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structuredType);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(PACKED);
				setState(344);
				unpackedStructuredType();
				}
				break;
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				unpackedStructuredType();
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

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
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
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUnpackedStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUnpackedStructuredType(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unpackedStructuredType);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
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

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pascal2Parser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(pascal2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pascal2Parser.RBRACK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterStringtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitStringtype(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(STRING);
			setState(355);
			match(LBRACK);
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(356);
				identifier();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
				{
				setState(357);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(360);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ARRAY() { return getToken(pascal2Parser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(pascal2Parser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascal2Parser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(pascal2Parser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public TerminalNode LBRACK2() { return getToken(pascal2Parser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(pascal2Parser.RBRACK2, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayType);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(ARRAY);
				setState(363);
				match(LBRACK);
				setState(364);
				typeList();
				setState(365);
				match(RBRACK);
				setState(366);
				match(OF);
				setState(367);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(ARRAY);
				setState(370);
				match(LBRACK2);
				setState(371);
				typeList();
				setState(372);
				match(RBRACK2);
				setState(373);
				match(OF);
				setState(374);
				componentType();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			indexType();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(379);
				match(COMMA);
				setState(380);
				indexType();
				}
				}
				setState(385);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitIndexType(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitComponentType(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			type_();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RECORD() { return getToken(pascal2Parser.RECORD, 0); }
		public TerminalNode END() { return getToken(pascal2Parser.END, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitRecordType(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(RECORD);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENT) {
				{
				setState(391);
				fieldList();
				}
			}

			setState(394);
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
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fieldList);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				fixedPart();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(397);
					match(SEMI);
					setState(398);
					variantPart();
					}
				}

				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				variantPart();
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

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFixedPart(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			recordSection();
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					match(SEMI);
					setState(406);
					recordSection();
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitRecordSection(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			identifierList();
			setState(413);
			match(COLON);
			setState(414);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pascal2Parser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascal2Parser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterVariantPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitVariantPart(this);
		}
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variantPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(CASE);
			setState(417);
			tag();
			setState(418);
			match(OF);
			setState(419);
			variant();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(420);
				match(SEMI);
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

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tag);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				identifier();
				setState(428);
				match(COLON);
				setState(429);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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

	public static class VariantContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitVariant(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			constList();
			setState(435);
			match(COLON);
			setState(436);
			match(LPAREN);
			setState(437);
			fieldList();
			setState(438);
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

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(pascal2Parser.SET, 0); }
		public TerminalNode OF() { return getToken(pascal2Parser.OF, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSetType(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(SET);
			setState(441);
			match(OF);
			setState(442);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitBaseType(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		public TerminalNode FILE() { return getToken(pascal2Parser.FILE, 0); }
		public TerminalNode OF() { return getToken(pascal2Parser.OF, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFileType(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fileType);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(FILE);
				setState(447);
				match(OF);
				setState(448);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(FILE);
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(pascal2Parser.POINTER, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(POINTER);
			setState(453);
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
		public TerminalNode VAR() { return getToken(pascal2Parser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitVariableDeclarationPart(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(VAR);
			setState(456);
			variableDeclaration();
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					match(SEMI);
					setState(458);
					variableDeclaration();
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(464);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			identifierList();
			setState(467);
			match(COLON);
			setState(468);
			type_();
			}
		}
		catch (RecognitionException re) {
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
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			procedureOrFunctionDeclaration();
			setState(471);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProcedureOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProcedureOrFunctionDeclaration(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_procedureOrFunctionDeclaration);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
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
		public TerminalNode PROCEDURE() { return getToken(pascal2Parser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProcedureDeclaration(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(PROCEDURE);
			setState(478);
			identifier();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(479);
				formalParameterList();
				}
			}

			setState(482);
			match(SEMI);
			setState(483);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LPAREN);
			setState(486);
			formalParameterSection();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(487);
				match(SEMI);
				setState(488);
				formalParameterSection();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(pascal2Parser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(pascal2Parser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(pascal2Parser.PROCEDURE, 0); }
		public TerminalNode CONST() { return getToken(pascal2Parser.CONST, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFormalParameterSection(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameterSection);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(VAR);
				setState(498);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				match(FUNCTION);
				setState(500);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				match(PROCEDURE);
				setState(502);
				parameterGroup();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				match(CONST);
				setState(504);
				parameterGroup();
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitParameterGroup(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifierList();
			setState(508);
			match(COLON);
			setState(509);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			identifier();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(512);
				match(COMMA);
				setState(513);
				identifier();
				}
				}
				setState(518);
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

	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitConstList(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			constant();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(520);
				match(COMMA);
				setState(521);
				constant();
				}
				}
				setState(526);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascal2Parser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascal2Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(FUNCTION);
			setState(528);
			identifier();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(529);
				formalParameterList();
				}
			}

			setState(532);
			match(COLON);
			setState(533);
			resultType();
			setState(534);
			match(SEMI);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitResultType(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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

	public static class StatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_statement);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				label();
				setState(540);
				match(COLON);
				setState(541);
				unlabelledStatement();
				}
				break;
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
			case SEMI:
			case AT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUnlabelledStatement(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unlabelledStatement);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case SEMI:
			case AT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
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
				setState(547);
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
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_simpleStatement);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				emptyStatement_();
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
		public TerminalNode ASSIGN() { return getToken(pascal2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			variable();
			setState(557);
			match(ASSIGN);
			setState(558);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(pascal2Parser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(pascal2Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(pascal2Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(pascal2Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(pascal2Parser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(pascal2Parser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(pascal2Parser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(pascal2Parser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(pascal2Parser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pascal2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pascal2Parser.DOT, i);
		}
		public List<TerminalNode> POINTER() { return getTokens(pascal2Parser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(pascal2Parser.POINTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(560);
				match(AT);
				setState(561);
				identifier();
				}
				break;
			case IDENT:
				{
				setState(562);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (LBRACK - 76)) | (1L << (LBRACK2 - 76)) | (1L << (POINTER - 76)) | (1L << (DOT - 76)))) != 0)) {
				{
				setState(590);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(565);
					match(LBRACK);
					setState(566);
					expression();
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(567);
						match(COMMA);
						setState(568);
						expression();
						}
						}
						setState(573);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(574);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(576);
					match(LBRACK2);
					setState(577);
					expression();
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(578);
						match(COMMA);
						setState(579);
						expression();
						}
						}
						setState(584);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(585);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(587);
					match(DOT);
					setState(588);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(589);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(594);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			simpleExpression();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (IN - 23)) | (1L << (EQUAL - 23)) | (1L << (NOT_EQUAL - 23)) | (1L << (LT - 23)) | (1L << (LE - 23)) | (1L << (GE - 23)) | (1L << (GT - 23)))) != 0)) {
				{
				setState(596);
				relationaloperator();
				setState(597);
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

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(pascal2Parser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(pascal2Parser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(pascal2Parser.LT, 0); }
		public TerminalNode LE() { return getToken(pascal2Parser.LE, 0); }
		public TerminalNode GE() { return getToken(pascal2Parser.GE, 0); }
		public TerminalNode GT() { return getToken(pascal2Parser.GT, 0); }
		public TerminalNode IN() { return getToken(pascal2Parser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitRelationaloperator(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (IN - 23)) | (1L << (EQUAL - 23)) | (1L << (NOT_EQUAL - 23)) | (1L << (LT - 23)) | (1L << (LE - 23)) | (1L << (GE - 23)) | (1L << (GT - 23)))) != 0)) ) {
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
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			term();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(604);
				additiveoperator();
				setState(605);
				simpleExpression();
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

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascal2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascal2Parser.MINUS, 0); }
		public TerminalNode OR() { return getToken(pascal2Parser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitAdditiveoperator(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			signedFactor();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				setState(612);
				multiplicativeoperator();
				setState(613);
				term();
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

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(pascal2Parser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(pascal2Parser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(pascal2Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pascal2Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(pascal2Parser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitMultiplicativeoperator(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(pascal2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascal2Parser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSignedFactor(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(619);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(622);
			factor();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(pascal2Parser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Bool_Context bool_() {
			return getRuleContext(Bool_Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_factor);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(LPAREN);
				setState(626);
				expression();
				setState(627);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(631);
				set_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(632);
				match(NOT);
				setState(633);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(634);
				bool_();
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
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(pascal2Parser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unsignedConstant);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(NIL);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFunctionDesignator(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionDesignator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			identifier();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(644);
				match(LPAREN);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << CHR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LPAREN - 74)) | (1L << (LBRACK - 74)) | (1L << (LBRACK2 - 74)) | (1L << (AT - 74)) | (1L << (IDENT - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (NUM_INT - 74)) | (1L << (NUM_REAL - 74)))) != 0)) {
					{
					setState(645);
					parameterList();
					}
				}

				setState(648);
				match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			actualParameter();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(652);
				match(COMMA);
				setState(653);
				actualParameter();
				}
				}
				setState(658);
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

	public static class Set_Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascal2Parser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascal2Parser.RBRACK, 0); }
		public TerminalNode LBRACK2() { return getToken(pascal2Parser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(pascal2Parser.RBRACK2, 0); }
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitSet_(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_set_);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(LBRACK);
				setState(660);
				elementList();
				setState(661);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(LBRACK2);
				setState(664);
				elementList();
				setState(665);
				match(RBRACK2);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementList);
		int _la;
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case NIL:
			case NOT:
			case TRUE:
			case CHR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case AT:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				element();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(670);
					match(COMMA);
					setState(671);
					element();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
			case RBRACK2:
				enterOuterAlt(_localctx, 2);
				{
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
		public TerminalNode DOTDOT() { return getToken(pascal2Parser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			expression();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(681);
				match(DOTDOT);
				setState(682);
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascal2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascal2Parser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitProcedureStatement(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			identifier();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(686);
				match(LPAREN);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NIL) | (1L << NOT) | (1L << TRUE) | (1L << CHR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LPAREN - 74)) | (1L << (LBRACK - 74)) | (1L << (LBRACK2 - 74)) | (1L << (AT - 74)) | (1L << (IDENT - 74)) | (1L << (STRING_LITERAL - 74)) | (1L << (NUM_INT - 74)) | (1L << (NUM_REAL - 74)))) != 0)) {
					{
					setState(687);
					parameterList();
					}
				}

				setState(690);
				match(RPAREN);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterwidthContext> parameterwidth() {
			return getRuleContexts(ParameterwidthContext.class);
		}
		public ParameterwidthContext parameterwidth(int i) {
			return getRuleContext(ParameterwidthContext.class,i);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			expression();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(694);
				parameterwidth();
				}
				}
				setState(699);
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

	public static class ParameterwidthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterParameterwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitParameterwidth(this);
		}
	}

	public final ParameterwidthContext parameterwidth() throws RecognitionException {
		ParameterwidthContext _localctx = new ParameterwidthContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(COLON);
			setState(701);
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

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(pascal2Parser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitGotoStatement(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(GOTO);
			setState(704);
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

	public static class EmptyStatement_Context extends ParserRuleContext {
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitEmptyStatement_(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_emptyStatement_);
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

	public static class Empty_Context extends ParserRuleContext {
		public Empty_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterEmpty_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitEmpty_(this);
		}
	}

	public final Empty_Context empty_() throws RecognitionException {
		Empty_Context _localctx = new Empty_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_empty_);
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
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitStructuredStatement(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_structuredStatement);
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
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
		public TerminalNode BEGIN() { return getToken(pascal2Parser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascal2Parser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(BEGIN);
			setState(717);
			statements();
			setState(718);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			statement();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(721);
				match(SEMI);
				setState(722);
				statement();
				}
				}
				setState(727);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_conditionalStatement);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
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
		public TerminalNode IF() { return getToken(pascal2Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pascal2Parser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(pascal2Parser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(IF);
			setState(733);
			expression();
			setState(734);
			match(THEN);
			setState(735);
			statement();
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(736);
				match(ELSE);
				setState(737);
				statement();
				}
				break;
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pascal2Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascal2Parser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(pascal2Parser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascal2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascal2Parser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(pascal2Parser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(CASE);
			setState(741);
			expression();
			setState(742);
			match(OF);
			setState(743);
			caseListElement();
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744);
					match(SEMI);
					setState(745);
					caseListElement();
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(751);
				match(SEMI);
				setState(752);
				match(ELSE);
				setState(753);
				statements();
				}
			}

			setState(756);
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
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascal2Parser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitCaseListElement(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			constList();
			setState(759);
			match(COLON);
			setState(760);
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

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitRepetetiveStatement(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_repetetiveStatement);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
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
		public TerminalNode WHILE() { return getToken(pascal2Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascal2Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(WHILE);
			setState(768);
			expression();
			setState(769);
			match(DO);
			setState(770);
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
		public TerminalNode REPEAT() { return getToken(pascal2Parser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(pascal2Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitRepeatStatement(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(REPEAT);
			setState(773);
			statements();
			setState(774);
			match(UNTIL);
			setState(775);
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
		public TerminalNode FOR() { return getToken(pascal2Parser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pascal2Parser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascal2Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(FOR);
			setState(778);
			identifier();
			setState(779);
			match(ASSIGN);
			setState(780);
			forList();
			setState(781);
			match(DO);
			setState(782);
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

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(pascal2Parser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(pascal2Parser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitForList(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			initialValue();
			setState(785);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(786);
			finalValue();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitInitialValue(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
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
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitFinalValue(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
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
		public TerminalNode WITH() { return getToken(pascal2Parser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascal2Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(WITH);
			setState(793);
			recordVariableList();
			setState(794);
			match(DO);
			setState(795);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascal2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascal2Parser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascal2Listener ) ((pascal2Listener)listener).exitRecordVariableList(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			variable();
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(798);
				match(COMMA);
				setState(799);
				variable();
				}
				}
				setState(804);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0328\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\3\2\3\2\5\2\u00c7\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u00d3\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00db\n\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e6\n\5\f\5\16\5\u00e9\13\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00f5\n\7\f\7\16\7\u00f8\13\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t\u0102\n\t\r\t\16\t\u0103\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0119\n\f\3\r\3\r\5\r\u011d\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\6\23\u012d\n\23\r\23\16\23\u012e\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0136\n\24\3\25\3\25\5\25\u013a\n\25\3\25"+
		"\3\25\3\25\3\26\3\26\5\26\u0141\n\26\3\27\3\27\3\27\5\27\u0146\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u014c\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\5\33\u0158\n\33\3\34\3\34\3\34\5\34\u015d\n\34\3\35\3"+
		"\35\3\35\3\35\5\35\u0163\n\35\3\36\3\36\3\36\3\36\5\36\u0169\n\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u017b\n\37\3 \3 \3 \7 \u0180\n \f \16 \u0183\13 \3!\3!\3\""+
		"\3\"\3#\3#\5#\u018b\n#\3#\3#\3$\3$\3$\5$\u0192\n$\3$\5$\u0195\n$\3%\3"+
		"%\3%\7%\u019a\n%\f%\16%\u019d\13%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u01a9\n\'\f\'\16\'\u01ac\13\'\3(\3(\3(\3(\3(\5(\u01b3\n(\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u01c5\n,\3-\3-\3-\3.\3.\3"+
		".\3.\7.\u01ce\n.\f.\16.\u01d1\13.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\5\61\u01de\n\61\3\62\3\62\3\62\5\62\u01e3\n\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\7\63\u01ec\n\63\f\63\16\63\u01ef\13\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01fc\n\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\7\66\u0205\n\66\f\66\16\66\u0208\13\66\3\67"+
		"\3\67\3\67\7\67\u020d\n\67\f\67\16\67\u0210\13\67\38\38\38\58\u0215\n"+
		"8\38\38\38\38\38\39\39\3:\3:\3:\3:\3:\5:\u0223\n:\3;\3;\5;\u0227\n;\3"+
		"<\3<\3<\3<\5<\u022d\n<\3=\3=\3=\3=\3>\3>\3>\5>\u0236\n>\3>\3>\3>\3>\7"+
		">\u023c\n>\f>\16>\u023f\13>\3>\3>\3>\3>\3>\3>\7>\u0247\n>\f>\16>\u024a"+
		"\13>\3>\3>\3>\3>\3>\7>\u0251\n>\f>\16>\u0254\13>\3?\3?\3?\3?\5?\u025a"+
		"\n?\3@\3@\3A\3A\3A\3A\5A\u0262\nA\3B\3B\3C\3C\3C\3C\5C\u026a\nC\3D\3D"+
		"\3E\5E\u026f\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u027e\nF\3G"+
		"\3G\3G\3G\5G\u0284\nG\3H\3H\3H\5H\u0289\nH\3H\5H\u028c\nH\3I\3I\3I\7I"+
		"\u0291\nI\fI\16I\u0294\13I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u029e\nJ\3K\3K\3"+
		"K\7K\u02a3\nK\fK\16K\u02a6\13K\3K\5K\u02a9\nK\3L\3L\3L\5L\u02ae\nL\3M"+
		"\3M\3M\5M\u02b3\nM\3M\5M\u02b6\nM\3N\3N\7N\u02ba\nN\fN\16N\u02bd\13N\3"+
		"O\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\5S\u02cd\nS\3T\3T\3T\3T\3U\3"+
		"U\3U\7U\u02d6\nU\fU\16U\u02d9\13U\3V\3V\5V\u02dd\nV\3W\3W\3W\3W\3W\3W"+
		"\5W\u02e5\nW\3X\3X\3X\3X\3X\3X\7X\u02ed\nX\fX\16X\u02f0\13X\3X\3X\3X\5"+
		"X\u02f5\nX\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\5Z\u0300\nZ\3[\3[\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\3`\3`\3a\3a\3a\3"+
		"a\3a\3b\3b\3b\7b\u0323\nb\fb\16b\u0326\13b\3b\2\2c\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\t"+
		"\3\2>?\4\2\22\22\60\60\4\2--:=\4\2\31\31FK\4\2$$>?\6\2\3\3\r\r\35\35@"+
		"A\4\2\17\17//\2\u032a\2\u00c4\3\2\2\2\4\u00da\3\2\2\2\6\u00dc\3\2\2\2"+
		"\b\u00e7\3\2\2\2\n\u00ec\3\2\2\2\f\u00f0\3\2\2\2\16\u00fb\3\2\2\2\20\u00fd"+
		"\3\2\2\2\22\u0105\3\2\2\2\24\u0109\3\2\2\2\26\u0118\3\2\2\2\30\u011c\3"+
		"\2\2\2\32\u011e\3\2\2\2\34\u0120\3\2\2\2\36\u0122\3\2\2\2 \u0124\3\2\2"+
		"\2\"\u0126\3\2\2\2$\u0128\3\2\2\2&\u0130\3\2\2\2(\u0137\3\2\2\2*\u013e"+
		"\3\2\2\2,\u0145\3\2\2\2.\u014b\3\2\2\2\60\u014d\3\2\2\2\62\u0151\3\2\2"+
		"\2\64\u0157\3\2\2\2\66\u015c\3\2\2\28\u0162\3\2\2\2:\u0164\3\2\2\2<\u017a"+
		"\3\2\2\2>\u017c\3\2\2\2@\u0184\3\2\2\2B\u0186\3\2\2\2D\u0188\3\2\2\2F"+
		"\u0194\3\2\2\2H\u0196\3\2\2\2J\u019e\3\2\2\2L\u01a2\3\2\2\2N\u01b2\3\2"+
		"\2\2P\u01b4\3\2\2\2R\u01ba\3\2\2\2T\u01be\3\2\2\2V\u01c4\3\2\2\2X\u01c6"+
		"\3\2\2\2Z\u01c9\3\2\2\2\\\u01d4\3\2\2\2^\u01d8\3\2\2\2`\u01dd\3\2\2\2"+
		"b\u01df\3\2\2\2d\u01e7\3\2\2\2f\u01fb\3\2\2\2h\u01fd\3\2\2\2j\u0201\3"+
		"\2\2\2l\u0209\3\2\2\2n\u0211\3\2\2\2p\u021b\3\2\2\2r\u0222\3\2\2\2t\u0226"+
		"\3\2\2\2v\u022c\3\2\2\2x\u022e\3\2\2\2z\u0235\3\2\2\2|\u0255\3\2\2\2~"+
		"\u025b\3\2\2\2\u0080\u025d\3\2\2\2\u0082\u0263\3\2\2\2\u0084\u0265\3\2"+
		"\2\2\u0086\u026b\3\2\2\2\u0088\u026e\3\2\2\2\u008a\u027d\3\2\2\2\u008c"+
		"\u0283\3\2\2\2\u008e\u0285\3\2\2\2\u0090\u028d\3\2\2\2\u0092\u029d\3\2"+
		"\2\2\u0094\u02a8\3\2\2\2\u0096\u02aa\3\2\2\2\u0098\u02af\3\2\2\2\u009a"+
		"\u02b7\3\2\2\2\u009c\u02be\3\2\2\2\u009e\u02c1\3\2\2\2\u00a0\u02c4\3\2"+
		"\2\2\u00a2\u02c6\3\2\2\2\u00a4\u02cc\3\2\2\2\u00a6\u02ce\3\2\2\2\u00a8"+
		"\u02d2\3\2\2\2\u00aa\u02dc\3\2\2\2\u00ac\u02de\3\2\2\2\u00ae\u02e6\3\2"+
		"\2\2\u00b0\u02f8\3\2\2\2\u00b2\u02ff\3\2\2\2\u00b4\u0301\3\2\2\2\u00b6"+
		"\u0306\3\2\2\2\u00b8\u030b\3\2\2\2\u00ba\u0312\3\2\2\2\u00bc\u0316\3\2"+
		"\2\2\u00be\u0318\3\2\2\2\u00c0\u031a\3\2\2\2\u00c2\u031f\3\2\2\2\u00c4"+
		"\u00c6\5\4\3\2\u00c5\u00c7\7\33\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\7T\2\2\u00ca"+
		"\u00cb\7\2\2\3\u00cb\3\3\2\2\2\u00cc\u00cd\7\'\2\2\u00cd\u00d2\5\6\4\2"+
		"\u00ce\u00cf\7L\2\2\u00cf\u00d0\5j\66\2\u00d0\u00d1\7M\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7D\2\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\7\62\2\2\u00d7\u00d8\5\6"+
		"\4\2\u00d8\u00d9\7D\2\2\u00d9\u00db\3\2\2\2\u00da\u00cc\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00db\5\3\2\2\2\u00dc\u00dd\7[\2\2\u00dd\7\3\2\2\2\u00de"+
		"\u00e6\5\f\7\2\u00df\u00e6\5\20\t\2\u00e0\u00e6\5$\23\2\u00e1\u00e6\5"+
		"Z.\2\u00e2\u00e6\5^\60\2\u00e3\u00e6\5\n\6\2\u00e4\u00e6\7\30\2\2\u00e5"+
		"\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\u00a6T\2\u00eb\t\3\2\2\2\u00ec"+
		"\u00ed\7\64\2\2\u00ed\u00ee\5j\66\2\u00ee\u00ef\7D\2\2\u00ef\13\3\2\2"+
		"\2\u00f0\u00f1\7\34\2\2\u00f1\u00f6\5\16\b\2\u00f2\u00f3\7C\2\2\u00f3"+
		"\u00f5\5\16\b\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7D\2\2\u00fa\r\3\2\2\2\u00fb\u00fc\5\32\16\2\u00fc\17\3\2\2\2\u00fd"+
		"\u0101\7\t\2\2\u00fe\u00ff\5\22\n\2\u00ff\u0100\7D\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00fe\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\21\3\2\2\2\u0105\u0106\5\6\4\2\u0106\u0107\7F\2\2"+
		"\u0107\u0108\5\26\f\2\u0108\23\3\2\2\2\u0109\u010a\79\2\2\u010a\u010b"+
		"\7L\2\2\u010b\u010c\5\32\16\2\u010c\u010d\7M\2\2\u010d\25\3\2\2\2\u010e"+
		"\u0119\5\30\r\2\u010f\u0110\5\36\20\2\u0110\u0111\5\30\r\2\u0111\u0119"+
		"\3\2\2\2\u0112\u0119\5\6\4\2\u0113\u0114\5\36\20\2\u0114\u0115\5\6\4\2"+
		"\u0115\u0119\3\2\2\2\u0116\u0119\5\"\22\2\u0117\u0119\5\24\13\2\u0118"+
		"\u010e\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\27\3\2\2\2\u011a\u011d"+
		"\5\32\16\2\u011b\u011d\5\34\17\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2"+
		"\2\u011d\31\3\2\2\2\u011e\u011f\7]\2\2\u011f\33\3\2\2\2\u0120\u0121\7"+
		"^\2\2\u0121\35\3\2\2\2\u0122\u0123\t\2\2\2\u0123\37\3\2\2\2\u0124\u0125"+
		"\t\3\2\2\u0125!\3\2\2\2\u0126\u0127\7\\\2\2\u0127#\3\2\2\2\u0128\u012c"+
		"\7\61\2\2\u0129\u012a\5&\24\2\u012a\u012b\7D\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u0129\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f%\3\2\2\2\u0130\u0131\5\6\4\2\u0131\u0135\7F\2\2\u0132\u0136"+
		"\5,\27\2\u0133\u0136\5(\25\2\u0134\u0136\5*\26\2\u0135\u0132\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\'\3\2\2\2\u0137\u0139\7\25\2"+
		"\2\u0138\u013a\5d\63\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\7E\2\2\u013c\u013d\5p9\2\u013d)\3\2\2\2\u013e\u0140"+
		"\7&\2\2\u013f\u0141\5d\63\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"+\3\2\2\2\u0142\u0146\5.\30\2\u0143\u0146\5\66\34\2\u0144\u0146\5X-\2"+
		"\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146-\3"+
		"\2\2\2\u0147\u014c\5\60\31\2\u0148\u014c\5\62\32\2\u0149\u014c\5\64\33"+
		"\2\u014a\u014c\5:\36\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014a\3\2\2\2\u014c/\3\2\2\2\u014d\u014e\7L\2\2\u014e\u014f"+
		"\5j\66\2\u014f\u0150\7M\2\2\u0150\61\3\2\2\2\u0151\u0152\5\26\f\2\u0152"+
		"\u0153\7U\2\2\u0153\u0154\5\26\f\2\u0154\63\3\2\2\2\u0155\u0158\5\6\4"+
		"\2\u0156\u0158\t\4\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\65"+
		"\3\2\2\2\u0159\u015a\7%\2\2\u015a\u015d\58\35\2\u015b\u015d\58\35\2\u015c"+
		"\u0159\3\2\2\2\u015c\u015b\3\2\2\2\u015d\67\3\2\2\2\u015e\u0163\5<\37"+
		"\2\u015f\u0163\5D#\2\u0160\u0163\5R*\2\u0161\u0163\5V,\2\u0162\u015e\3"+
		"\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"9\3\2\2\2\u0164\u0165\7-\2\2\u0165\u0168\7N\2\2\u0166\u0169\5\6\4\2\u0167"+
		"\u0169\5\30\r\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u016b\7P\2\2\u016b;\3\2\2\2\u016c\u016d\7\4\2\2\u016d\u016e"+
		"\7N\2\2\u016e\u016f\5> \2\u016f\u0170\7P\2\2\u0170\u0171\7!\2\2\u0171"+
		"\u0172\5B\"\2\u0172\u017b\3\2\2\2\u0173\u0174\7\4\2\2\u0174\u0175\7O\2"+
		"\2\u0175\u0176\5> \2\u0176\u0177\7Q\2\2\u0177\u0178\7!\2\2\u0178\u0179"+
		"\5B\"\2\u0179\u017b\3\2\2\2\u017a\u016c\3\2\2\2\u017a\u0173\3\2\2\2\u017b"+
		"=\3\2\2\2\u017c\u0181\5@!\2\u017d\u017e\7C\2\2\u017e\u0180\5@!\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182?\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5.\30\2\u0185A\3\2"+
		"\2\2\u0186\u0187\5,\27\2\u0187C\3\2\2\2\u0188\u018a\7(\2\2\u0189\u018b"+
		"\5F$\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\7\21\2\2\u018dE\3\2\2\2\u018e\u0191\5H%\2\u018f\u0190\7D\2\2\u0190"+
		"\u0192\5L\'\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2"+
		"\2\2\u0193\u0195\5L\'\2\u0194\u018e\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"G\3\2\2\2\u0196\u019b\5J&\2\u0197\u0198\7D\2\2\u0198\u019a\5J&\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019cI\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\5j\66\2\u019f\u01a0"+
		"\7E\2\2\u01a0\u01a1\5,\27\2\u01a1K\3\2\2\2\u01a2\u01a3\7\b\2\2\u01a3\u01a4"+
		"\5N(\2\u01a4\u01a5\7!\2\2\u01a5\u01aa\5P)\2\u01a6\u01a7\7D\2\2\u01a7\u01a9"+
		"\5P)\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01abM\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5\6\4\2"+
		"\u01ae\u01af\7E\2\2\u01af\u01b0\5\64\33\2\u01b0\u01b3\3\2\2\2\u01b1\u01b3"+
		"\5\64\33\2\u01b2\u01ad\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3O\3\2\2\2\u01b4"+
		"\u01b5\5l\67\2\u01b5\u01b6\7E\2\2\u01b6\u01b7\7L\2\2\u01b7\u01b8\5F$\2"+
		"\u01b8\u01b9\7M\2\2\u01b9Q\3\2\2\2\u01ba\u01bb\7*\2\2\u01bb\u01bc\7!\2"+
		"\2\u01bc\u01bd\5T+\2\u01bdS\3\2\2\2\u01be\u01bf\5.\30\2\u01bfU\3\2\2\2"+
		"\u01c0\u01c1\7\23\2\2\u01c1\u01c2\7!\2\2\u01c2\u01c5\5,\27\2\u01c3\u01c5"+
		"\7\23\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5W\3\2\2\2\u01c6"+
		"\u01c7\7R\2\2\u01c7\u01c8\5\64\33\2\u01c8Y\3\2\2\2\u01c9\u01ca\7\65\2"+
		"\2\u01ca\u01cf\5\\/\2\u01cb\u01cc\7D\2\2\u01cc\u01ce\5\\/\2\u01cd\u01cb"+
		"\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7D\2\2\u01d3[\3\2\2\2\u01d4"+
		"\u01d5\5j\66\2\u01d5\u01d6\7E\2\2\u01d6\u01d7\5,\27\2\u01d7]\3\2\2\2\u01d8"+
		"\u01d9\5`\61\2\u01d9\u01da\7D\2\2\u01da_\3\2\2\2\u01db\u01de\5b\62\2\u01dc"+
		"\u01de\5n8\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01dea\3\2\2\2\u01df"+
		"\u01e0\7&\2\2\u01e0\u01e2\5\6\4\2\u01e1\u01e3\5d\63\2\u01e2\u01e1\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7D\2\2\u01e5"+
		"\u01e6\5\b\5\2\u01e6c\3\2\2\2\u01e7\u01e8\7L\2\2\u01e8\u01ed\5f\64\2\u01e9"+
		"\u01ea\7D\2\2\u01ea\u01ec\5f\64\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\7M\2\2\u01f1e\3\2\2\2\u01f2\u01fc\5h\65\2\u01f3"+
		"\u01f4\7\65\2\2\u01f4\u01fc\5h\65\2\u01f5\u01f6\7\25\2\2\u01f6\u01fc\5"+
		"h\65\2\u01f7\u01f8\7&\2\2\u01f8\u01fc\5h\65\2\u01f9\u01fa\7\t\2\2\u01fa"+
		"\u01fc\5h\65\2\u01fb\u01f2\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fb\u01f5\3\2"+
		"\2\2\u01fb\u01f7\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fcg\3\2\2\2\u01fd\u01fe"+
		"\5j\66\2\u01fe\u01ff\7E\2\2\u01ff\u0200\5\64\33\2\u0200i\3\2\2\2\u0201"+
		"\u0206\5\6\4\2\u0202\u0203\7C\2\2\u0203\u0205\5\6\4\2\u0204\u0202\3\2"+
		"\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"k\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020e\5\26\f\2\u020a\u020b\7C\2\2"+
		"\u020b\u020d\5\26\f\2\u020c\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020fm\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0212\7\25\2\2\u0212\u0214\5\6\4\2\u0213\u0215\5d\63\2\u0214\u0213\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7E\2\2\u0217"+
		"\u0218\5p9\2\u0218\u0219\7D\2\2\u0219\u021a\5\b\5\2\u021ao\3\2\2\2\u021b"+
		"\u021c\5\64\33\2\u021cq\3\2\2\2\u021d\u021e\5\16\b\2\u021e\u021f\7E\2"+
		"\2\u021f\u0220\5t;\2\u0220\u0223\3\2\2\2\u0221\u0223\5t;\2\u0222\u021d"+
		"\3\2\2\2\u0222\u0221\3\2\2\2\u0223s\3\2\2\2\u0224\u0227\5v<\2\u0225\u0227"+
		"\5\u00a4S\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227u\3\2\2\2\u0228"+
		"\u022d\5x=\2\u0229\u022d\5\u0098M\2\u022a\u022d\5\u009eP\2\u022b\u022d"+
		"\5\u00a0Q\2\u022c\u0228\3\2\2\2\u022c\u0229\3\2\2\2\u022c\u022a\3\2\2"+
		"\2\u022c\u022b\3\2\2\2\u022dw\3\2\2\2\u022e\u022f\5z>\2\u022f\u0230\7"+
		"B\2\2\u0230\u0231\5|?\2\u0231y\3\2\2\2\u0232\u0233\7S\2\2\u0233\u0236"+
		"\5\6\4\2\u0234\u0236\5\6\4\2\u0235\u0232\3\2\2\2\u0235\u0234\3\2\2\2\u0236"+
		"\u0252\3\2\2\2\u0237\u0238\7N\2\2\u0238\u023d\5|?\2\u0239\u023a\7C\2\2"+
		"\u023a\u023c\5|?\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0241\7P\2\2\u0241\u0251\3\2\2\2\u0242\u0243\7O\2\2\u0243\u0248\5|?\2"+
		"\u0244\u0245\7C\2\2\u0245\u0247\5|?\2\u0246\u0244\3\2\2\2\u0247\u024a"+
		"\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024c\7Q\2\2\u024c\u0251\3\2\2\2\u024d\u024e\7T\2"+
		"\2\u024e\u0251\5\6\4\2\u024f\u0251\7R\2\2\u0250\u0237\3\2\2\2\u0250\u0242"+
		"\3\2\2\2\u0250\u024d\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253{\3\2\2\2\u0254\u0252\3\2\2\2"+
		"\u0255\u0259\5\u0080A\2\u0256\u0257\5~@\2\u0257\u0258\5|?\2\u0258\u025a"+
		"\3\2\2\2\u0259\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a}\3\2\2\2\u025b"+
		"\u025c\t\5\2\2\u025c\177\3\2\2\2\u025d\u0261\5\u0084C\2\u025e\u025f\5"+
		"\u0082B\2\u025f\u0260\5\u0080A\2\u0260\u0262\3\2\2\2\u0261\u025e\3\2\2"+
		"\2\u0261\u0262\3\2\2\2\u0262\u0081\3\2\2\2\u0263\u0264\t\6\2\2\u0264\u0083"+
		"\3\2\2\2\u0265\u0269\5\u0088E\2\u0266\u0267\5\u0086D\2\u0267\u0268\5\u0084"+
		"C\2\u0268\u026a\3\2\2\2\u0269\u0266\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u0085\3\2\2\2\u026b\u026c\t\7\2\2\u026c\u0087\3\2\2\2\u026d\u026f\t\2"+
		"\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\5\u008aF\2\u0271\u0089\3\2\2\2\u0272\u027e\5z>\2\u0273\u0274\7"+
		"L\2\2\u0274\u0275\5|?\2\u0275\u0276\7M\2\2\u0276\u027e\3\2\2\2\u0277\u027e"+
		"\5\u008eH\2\u0278\u027e\5\u008cG\2\u0279\u027e\5\u0092J\2\u027a\u027b"+
		"\7\37\2\2\u027b\u027e\5\u008aF\2\u027c\u027e\5 \21\2\u027d\u0272\3\2\2"+
		"\2\u027d\u0273\3\2\2\2\u027d\u0277\3\2\2\2\u027d\u0278\3\2\2\2\u027d\u0279"+
		"\3\2\2\2\u027d\u027a\3\2\2\2\u027d\u027c\3\2\2\2\u027e\u008b\3\2\2\2\u027f"+
		"\u0284\5\30\r\2\u0280\u0284\5\24\13\2\u0281\u0284\5\"\22\2\u0282\u0284"+
		"\7\36\2\2\u0283\u027f\3\2\2\2\u0283\u0280\3\2\2\2\u0283\u0281\3\2\2\2"+
		"\u0283\u0282\3\2\2\2\u0284\u008d\3\2\2\2\u0285\u028b\5\6\4\2\u0286\u0288"+
		"\7L\2\2\u0287\u0289\5\u0090I\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2"+
		"\u0289\u028a\3\2\2\2\u028a\u028c\7M\2\2\u028b\u0286\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u008f\3\2\2\2\u028d\u0292\5\u009aN\2\u028e\u028f\7C\2\2"+
		"\u028f\u0291\5\u009aN\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0091\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0295\u0296\7N\2\2\u0296\u0297\5\u0094K\2\u0297\u0298\7P\2\2\u0298"+
		"\u029e\3\2\2\2\u0299\u029a\7O\2\2\u029a\u029b\5\u0094K\2\u029b\u029c\7"+
		"Q\2\2\u029c\u029e\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u0299\3\2\2\2\u029e"+
		"\u0093\3\2\2\2\u029f\u02a4\5\u0096L\2\u02a0\u02a1\7C\2\2\u02a1\u02a3\5"+
		"\u0096L\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a9\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a9"+
		"\3\2\2\2\u02a8\u029f\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u0095\3\2\2\2\u02aa"+
		"\u02ad\5|?\2\u02ab\u02ac\7U\2\2\u02ac\u02ae\5|?\2\u02ad\u02ab\3\2\2\2"+
		"\u02ad\u02ae\3\2\2\2\u02ae\u0097\3\2\2\2\u02af\u02b5\5\6\4\2\u02b0\u02b2"+
		"\7L\2\2\u02b1\u02b3\5\u0090I\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2"+
		"\u02b3\u02b4\3\2\2\2\u02b4\u02b6\7M\2\2\u02b5\u02b0\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u0099\3\2\2\2\u02b7\u02bb\5|?\2\u02b8\u02ba\5\u009cO\2"+
		"\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u009b\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7E\2\2\u02bf"+
		"\u02c0\5|?\2\u02c0\u009d\3\2\2\2\u02c1\u02c2\7\26\2\2\u02c2\u02c3\5\16"+
		"\b\2\u02c3\u009f\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u00a1\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u00a3\3\2\2\2\u02c8\u02cd\5\u00a6T\2\u02c9\u02cd"+
		"\5\u00aaV\2\u02ca\u02cd\5\u00b2Z\2\u02cb\u02cd\5\u00c0a\2\u02cc\u02c8"+
		"\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u00a5\3\2\2\2\u02ce\u02cf\7\6\2\2\u02cf\u02d0\5\u00a8U\2\u02d0\u02d1"+
		"\7\21\2\2\u02d1\u00a7\3\2\2\2\u02d2\u02d7\5r:\2\u02d3\u02d4\7D\2\2\u02d4"+
		"\u02d6\5r:\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2"+
		"\2\u02d7\u02d8\3\2\2\2\u02d8\u00a9\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dd"+
		"\5\u00acW\2\u02db\u02dd\5\u00aeX\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2"+
		"\2\2\u02dd\u00ab\3\2\2\2\u02de\u02df\7\27\2\2\u02df\u02e0\5|?\2\u02e0"+
		"\u02e1\7.\2\2\u02e1\u02e4\5r:\2\u02e2\u02e3\7\20\2\2\u02e3\u02e5\5r:\2"+
		"\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u00ad\3\2\2\2\u02e6\u02e7"+
		"\7\b\2\2\u02e7\u02e8\5|?\2\u02e8\u02e9\7!\2\2\u02e9\u02ee\5\u00b0Y\2\u02ea"+
		"\u02eb\7D\2\2\u02eb\u02ed\5\u00b0Y\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\3"+
		"\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f4\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f1\u02f2\7D\2\2\u02f2\u02f3\7\20\2\2\u02f3\u02f5\5\u00a8"+
		"U\2\u02f4\u02f1\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f7\7\21\2\2\u02f7\u00af\3\2\2\2\u02f8\u02f9\5l\67\2\u02f9\u02fa\7"+
		"E\2\2\u02fa\u02fb\5r:\2\u02fb\u00b1\3\2\2\2\u02fc\u0300\5\u00b4[\2\u02fd"+
		"\u0300\5\u00b6\\\2\u02fe\u0300\5\u00b8]\2\u02ff\u02fc\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u00b3\3\2\2\2\u0301\u0302\7\66\2\2"+
		"\u0302\u0303\5|?\2\u0303\u0304\7\16\2\2\u0304\u0305\5r:\2\u0305\u00b5"+
		"\3\2\2\2\u0306\u0307\7)\2\2\u0307\u0308\5\u00a8U\2\u0308\u0309\7\63\2"+
		"\2\u0309\u030a\5|?\2\u030a\u00b7\3\2\2\2\u030b\u030c\7\24\2\2\u030c\u030d"+
		"\5\6\4\2\u030d\u030e\7B\2\2\u030e\u030f\5\u00ba^\2\u030f\u0310\7\16\2"+
		"\2\u0310\u0311\5r:\2\u0311\u00b9\3\2\2\2\u0312\u0313\5\u00bc_\2\u0313"+
		"\u0314\t\b\2\2\u0314\u0315\5\u00be`\2\u0315\u00bb\3\2\2\2\u0316\u0317"+
		"\5|?\2\u0317\u00bd\3\2\2\2\u0318\u0319\5|?\2\u0319\u00bf\3\2\2\2\u031a"+
		"\u031b\7\67\2\2\u031b\u031c\5\u00c2b\2\u031c\u031d\7\16\2\2\u031d\u031e"+
		"\5r:\2\u031e\u00c1\3\2\2\2\u031f\u0324\5z>\2\u0320\u0321\7C\2\2\u0321"+
		"\u0323\5z>\2\u0322\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2"+
		"\2\u0324\u0325\3\2\2\2\u0325\u00c3\3\2\2\2\u0326\u0324\3\2\2\2F\u00c6"+
		"\u00d2\u00da\u00e5\u00e7\u00f6\u0103\u0118\u011c\u012e\u0135\u0139\u0140"+
		"\u0145\u014b\u0157\u015c\u0162\u0168\u017a\u0181\u018a\u0191\u0194\u019b"+
		"\u01aa\u01b2\u01c4\u01cf\u01dd\u01e2\u01ed\u01fb\u0206\u020e\u0214\u0222"+
		"\u0226\u022c\u0235\u023d\u0248\u0250\u0252\u0259\u0261\u0269\u026e\u027d"+
		"\u0283\u0288\u028b\u0292\u029d\u02a4\u02a8\u02ad\u02b2\u02b5\u02bb\u02cc"+
		"\u02d7\u02dc\u02e4\u02ee\u02f4\u02ff\u0324";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}