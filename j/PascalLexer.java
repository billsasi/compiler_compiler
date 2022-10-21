// Generated from Pascal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AND", "ARRAY", "ASM", "BEGIN", "BREAK", "CASE", "CONST", 
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
			"LCOMMENT", "RCOMMENT", "DOT_DOT", "PERIOD", "COLON", "WS", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'E'", "'character (character)*'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "':='", 
			"'='", "'<>'", "'<='", "'>='", "'<'", "'>'", "'+='", "'-='", "'*='", 
			"'/='", "'^'", "';'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'(*'", "'*)'", "'..'", "'.'", "':'"
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2]\u02e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\39\39\39\39\3:\3:\7:\u0242\n:\f:\16:\u0245\13:\3;\6;\u0248\n"+
		";\r;\16;\u0249\3<\6<\u024d\n<\r<\16<\u024e\3<\3<\6<\u0253\n<\r<\16<\u0254"+
		"\3=\3=\3=\3=\3>\3>\7>\u025d\n>\f>\16>\u0260\13>\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3J\3J\3"+
		"J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3[\3\\\6\\\u02aa\n\\"+
		"\r\\\16\\\u02ab\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3"+
		"d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3"+
		"p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3\u025e\2w\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7"+
		"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9\2\u00bb"+
		"\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd"+
		"\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9\2\u00db\2\u00dd\2\u00df"+
		"\2\u00e1\2\u00e3\2\u00e5\2\u00e7\2\u00e9\2\u00eb\2\3\2 \5\2C\\aac|\6\2"+
		"\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFf"+
		"f\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u02ce\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\3\u00ed\3\2\2\2\5\u00ef\3\2\2\2\7\u0106"+
		"\3\2\2\2\t\u010a\3\2\2\2\13\u0110\3\2\2\2\r\u0114\3\2\2\2\17\u011a\3\2"+
		"\2\2\21\u0120\3\2\2\2\23\u0125\3\2\2\2\25\u012b\3\2\2\2\27\u0137\3\2\2"+
		"\2\31\u0140\3\2\2\2\33\u014b\3\2\2\2\35\u014f\3\2\2\2\37\u0152\3\2\2\2"+
		"!\u0159\3\2\2\2#\u015e\3\2\2\2%\u0162\3\2\2\2\'\u0168\3\2\2\2)\u016d\3"+
		"\2\2\2+\u0171\3\2\2\2-\u017a\3\2\2\2/\u017f\3\2\2\2\61\u0182\3\2\2\2\63"+
		"\u0191\3\2\2\2\65\u0194\3\2\2\2\67\u019b\3\2\2\29\u01a5\3\2\2\2;\u01ab"+
		"\3\2\2\2=\u01af\3\2\2\2?\u01b3\3\2\2\2A\u01b7\3\2\2\2C\u01be\3\2\2\2E"+
		"\u01c1\3\2\2\2G\u01c4\3\2\2\2I\u01cd\3\2\2\2K\u01d0\3\2\2\2M\u01d7\3\2"+
		"\2\2O\u01e1\3\2\2\2Q\u01e9\3\2\2\2S\u01f0\3\2\2\2U\u01f7\3\2\2\2W\u01fb"+
		"\3\2\2\2Y\u01ff\3\2\2\2[\u0203\3\2\2\2]\u020a\3\2\2\2_\u020f\3\2\2\2a"+
		"\u0212\3\2\2\2c\u0217\3\2\2\2e\u021c\3\2\2\2g\u0221\3\2\2\2i\u0227\3\2"+
		"\2\2k\u022c\3\2\2\2m\u0230\3\2\2\2o\u0236\3\2\2\2q\u023b\3\2\2\2s\u023f"+
		"\3\2\2\2u\u0247\3\2\2\2w\u024c\3\2\2\2y\u0256\3\2\2\2{\u025a\3\2\2\2}"+
		"\u0263\3\2\2\2\177\u0265\3\2\2\2\u0081\u0267\3\2\2\2\u0083\u0269\3\2\2"+
		"\2\u0085\u026b\3\2\2\2\u0087\u026e\3\2\2\2\u0089\u0270\3\2\2\2\u008b\u0273"+
		"\3\2\2\2\u008d\u0276\3\2\2\2\u008f\u0279\3\2\2\2\u0091\u027b\3\2\2\2\u0093"+
		"\u027d\3\2\2\2\u0095\u0280\3\2\2\2\u0097\u0283\3\2\2\2\u0099\u0286\3\2"+
		"\2\2\u009b\u0289\3\2\2\2\u009d\u028b\3\2\2\2\u009f\u028d\3\2\2\2\u00a1"+
		"\u028f\3\2\2\2\u00a3\u0291\3\2\2\2\u00a5\u0293\3\2\2\2\u00a7\u0295\3\2"+
		"\2\2\u00a9\u0297\3\2\2\2\u00ab\u0299\3\2\2\2\u00ad\u029b\3\2\2\2\u00af"+
		"\u029e\3\2\2\2\u00b1\u02a1\3\2\2\2\u00b3\u02a4\3\2\2\2\u00b5\u02a6\3\2"+
		"\2\2\u00b7\u02a9\3\2\2\2\u00b9\u02af\3\2\2\2\u00bb\u02b1\3\2\2\2\u00bd"+
		"\u02b3\3\2\2\2\u00bf\u02b5\3\2\2\2\u00c1\u02b7\3\2\2\2\u00c3\u02b9\3\2"+
		"\2\2\u00c5\u02bb\3\2\2\2\u00c7\u02bd\3\2\2\2\u00c9\u02bf\3\2\2\2\u00cb"+
		"\u02c1\3\2\2\2\u00cd\u02c3\3\2\2\2\u00cf\u02c5\3\2\2\2\u00d1\u02c7\3\2"+
		"\2\2\u00d3\u02c9\3\2\2\2\u00d5\u02cb\3\2\2\2\u00d7\u02cd\3\2\2\2\u00d9"+
		"\u02cf\3\2\2\2\u00db\u02d1\3\2\2\2\u00dd\u02d3\3\2\2\2\u00df\u02d5\3\2"+
		"\2\2\u00e1\u02d7\3\2\2\2\u00e3\u02d9\3\2\2\2\u00e5\u02db\3\2\2\2\u00e7"+
		"\u02dd\3\2\2\2\u00e9\u02df\3\2\2\2\u00eb\u02e1\3\2\2\2\u00ed\u00ee\7G"+
		"\2\2\u00ee\4\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7e\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7\"\2"+
		"\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd"+
		"\7c\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7e\2\2\u0100"+
		"\u0101\7v\2\2\u0101\u0102\7g\2\2\u0102\u0103\7t\2\2\u0103\u0104\7+\2\2"+
		"\u0104\u0105\7,\2\2\u0105\6\3\2\2\2\u0106\u0107\5\u00b9]\2\u0107\u0108"+
		"\5\u00d3j\2\u0108\u0109\5\u00bf`\2\u0109\b\3\2\2\2\u010a\u010b\5\u00b9"+
		"]\2\u010b\u010c\5\u00dbn\2\u010c\u010d\5\u00dbn\2\u010d\u010e\5\u00b9"+
		"]\2\u010e\u010f\5\u00e9u\2\u010f\n\3\2\2\2\u0110\u0111\5\u00b9]\2\u0111"+
		"\u0112\5\u00ddo\2\u0112\u0113\5\u00d1i\2\u0113\f\3\2\2\2\u0114\u0115\5"+
		"\u00bb^\2\u0115\u0116\5\u00c1a\2\u0116\u0117\5\u00c5c\2\u0117\u0118\5"+
		"\u00c9e\2\u0118\u0119\5\u00d3j\2\u0119\16\3\2\2\2\u011a\u011b\5\u00bb"+
		"^\2\u011b\u011c\5\u00dbn\2\u011c\u011d\5\u00c1a\2\u011d\u011e\5\u00b9"+
		"]\2\u011e\u011f\5\u00cdg\2\u011f\20\3\2\2\2\u0120\u0121\5\u00bd_\2\u0121"+
		"\u0122\5\u00b9]\2\u0122\u0123\5\u00ddo\2\u0123\u0124\5\u00c1a\2\u0124"+
		"\22\3\2\2\2\u0125\u0126\5\u00bd_\2\u0126\u0127\5\u00d5k\2\u0127\u0128"+
		"\5\u00d3j\2\u0128\u0129\5\u00ddo\2\u0129\u012a\5\u00dfp\2\u012a\24\3\2"+
		"\2\2\u012b\u012c\5\u00bd_\2\u012c\u012d\5\u00d5k\2\u012d\u012e\5\u00d3"+
		"j\2\u012e\u012f\5\u00ddo\2\u012f\u0130\5\u00dfp\2\u0130\u0131\5\u00db"+
		"n\2\u0131\u0132\5\u00e1q\2\u0132\u0133\5\u00bd_\2\u0133\u0134\5\u00df"+
		"p\2\u0134\u0135\5\u00d5k\2\u0135\u0136\5\u00dbn\2\u0136\26\3\2\2\2\u0137"+
		"\u0138\5\u00bd_\2\u0138\u0139\5\u00d5k\2\u0139\u013a\5\u00d3j\2\u013a"+
		"\u013b\5\u00dfp\2\u013b\u013c\5\u00c9e\2\u013c\u013d\5\u00d3j\2\u013d"+
		"\u013e\5\u00e1q\2\u013e\u013f\5\u00c1a\2\u013f\30\3\2\2\2\u0140\u0141"+
		"\5\u00bf`\2\u0141\u0142\5\u00c1a\2\u0142\u0143\5\u00ddo\2\u0143\u0144"+
		"\5\u00dfp\2\u0144\u0145\5\u00dbn\2\u0145\u0146\5\u00e1q\2\u0146\u0147"+
		"\5\u00bd_\2\u0147\u0148\5\u00dfp\2\u0148\u0149\5\u00d5k\2\u0149\u014a"+
		"\5\u00dbn\2\u014a\32\3\2\2\2\u014b\u014c\5\u00bf`\2\u014c\u014d\5\u00c9"+
		"e\2\u014d\u014e\5\u00e3r\2\u014e\34\3\2\2\2\u014f\u0150\5\u00bf`\2\u0150"+
		"\u0151\5\u00d5k\2\u0151\36\3\2\2\2\u0152\u0153\5\u00bf`\2\u0153\u0154"+
		"\5\u00d5k\2\u0154\u0155\5\u00e5s\2\u0155\u0156\5\u00d3j\2\u0156\u0157"+
		"\5\u00dfp\2\u0157\u0158\5\u00d5k\2\u0158 \3\2\2\2\u0159\u015a\5\u00c1"+
		"a\2\u015a\u015b\5\u00cfh\2\u015b\u015c\5\u00ddo\2\u015c\u015d\5\u00c1"+
		"a\2\u015d\"\3\2\2\2\u015e\u015f\5\u00c1a\2\u015f\u0160\5\u00d3j\2\u0160"+
		"\u0161\5\u00bf`\2\u0161$\3\2\2\2\u0162\u0163\5\u00c3b\2\u0163\u0164\5"+
		"\u00b9]\2\u0164\u0165\5\u00cfh\2\u0165\u0166\5\u00ddo\2\u0166\u0167\5"+
		"\u00c1a\2\u0167&\3\2\2\2\u0168\u0169\5\u00c3b\2\u0169\u016a\5\u00c9e\2"+
		"\u016a\u016b\5\u00cfh\2\u016b\u016c\5\u00c1a\2\u016c(\3\2\2\2\u016d\u016e"+
		"\5\u00c3b\2\u016e\u016f\5\u00d5k\2\u016f\u0170\5\u00dbn\2\u0170*\3\2\2"+
		"\2\u0171\u0172\5\u00c3b\2\u0172\u0173\5\u00e1q\2\u0173\u0174\5\u00d3j"+
		"\2\u0174\u0175\5\u00bd_\2\u0175\u0176\5\u00dfp\2\u0176\u0177\5\u00c9e"+
		"\2\u0177\u0178\5\u00d5k\2\u0178\u0179\5\u00d3j\2\u0179,\3\2\2\2\u017a"+
		"\u017b\5\u00c5c\2\u017b\u017c\5\u00d5k\2\u017c\u017d\5\u00dfp\2\u017d"+
		"\u017e\5\u00d5k\2\u017e.\3\2\2\2\u017f\u0180\5\u00c9e\2\u0180\u0181\5"+
		"\u00c3b\2\u0181\60\3\2\2\2\u0182\u0183\5\u00c9e\2\u0183\u0184\5\u00d1"+
		"i\2\u0184\u0185\5\u00d7l\2\u0185\u0186\5\u00cfh\2\u0186\u0187\5\u00c1"+
		"a\2\u0187\u0188\5\u00d1i\2\u0188\u0189\5\u00c1a\2\u0189\u018a\5\u00d3"+
		"j\2\u018a\u018b\5\u00dfp\2\u018b\u018c\5\u00b9]\2\u018c\u018d\5\u00df"+
		"p\2\u018d\u018e\5\u00c9e\2\u018e\u018f\5\u00d5k\2\u018f\u0190\5\u00d3"+
		"j\2\u0190\62\3\2\2\2\u0191\u0192\5\u00c9e\2\u0192\u0193\5\u00d3j\2\u0193"+
		"\64\3\2\2\2\u0194\u0195\5\u00c9e\2\u0195\u0196\5\u00d3j\2\u0196\u0197"+
		"\5\u00cfh\2\u0197\u0198\5\u00c9e\2\u0198\u0199\5\u00d3j\2\u0199\u019a"+
		"\5\u00c1a\2\u019a\66\3\2\2\2\u019b\u019c\5\u00c9e\2\u019c\u019d\5\u00d3"+
		"j\2\u019d\u019e\5\u00dfp\2\u019e\u019f\5\u00c1a\2\u019f\u01a0\5\u00db"+
		"n\2\u01a0\u01a1\5\u00c3b\2\u01a1\u01a2\5\u00b9]\2\u01a2\u01a3\5\u00bd"+
		"_\2\u01a3\u01a4\5\u00c1a\2\u01a48\3\2\2\2\u01a5\u01a6\5\u00cfh\2\u01a6"+
		"\u01a7\5\u00b9]\2\u01a7\u01a8\5\u00bb^\2\u01a8\u01a9\5\u00c1a\2\u01a9"+
		"\u01aa\5\u00cfh\2\u01aa:\3\2\2\2\u01ab\u01ac\5\u00d1i\2\u01ac\u01ad\5"+
		"\u00d5k\2\u01ad\u01ae\5\u00bf`\2\u01ae<\3\2\2\2\u01af\u01b0\5\u00d3j\2"+
		"\u01b0\u01b1\5\u00c9e\2\u01b1\u01b2\5\u00cfh\2\u01b2>\3\2\2\2\u01b3\u01b4"+
		"\5\u00d3j\2\u01b4\u01b5\5\u00d5k\2\u01b5\u01b6\5\u00dfp\2\u01b6@\3\2\2"+
		"\2\u01b7\u01b8\5\u00d5k\2\u01b8\u01b9\5\u00bb^\2\u01b9\u01ba\5\u00cbf"+
		"\2\u01ba\u01bb\5\u00c1a\2\u01bb\u01bc\5\u00bd_\2\u01bc\u01bd\5\u00dfp"+
		"\2\u01bdB\3\2\2\2\u01be\u01bf\5\u00d5k\2\u01bf\u01c0\5\u00c3b\2\u01c0"+
		"D\3\2\2\2\u01c1\u01c2\5\u00d5k\2\u01c2\u01c3\5\u00d3j\2\u01c3F\3\2\2\2"+
		"\u01c4\u01c5\5\u00d5k\2\u01c5\u01c6\5\u00d7l\2\u01c6\u01c7\5\u00c1a\2"+
		"\u01c7\u01c8\5\u00dbn\2\u01c8\u01c9\5\u00b9]\2\u01c9\u01ca\5\u00dfp\2"+
		"\u01ca\u01cb\5\u00d5k\2\u01cb\u01cc\5\u00dbn\2\u01ccH\3\2\2\2\u01cd\u01ce"+
		"\5\u00d5k\2\u01ce\u01cf\5\u00dbn\2\u01cfJ\3\2\2\2\u01d0\u01d1\5\u00d7"+
		"l\2\u01d1\u01d2\5\u00b9]\2\u01d2\u01d3\5\u00bd_\2\u01d3\u01d4\5\u00cd"+
		"g\2\u01d4\u01d5\5\u00c1a\2\u01d5\u01d6\5\u00bf`\2\u01d6L\3\2\2\2\u01d7"+
		"\u01d8\5\u00d7l\2\u01d8\u01d9\5\u00dbn\2\u01d9\u01da\5\u00d5k\2\u01da"+
		"\u01db\5\u00bd_\2\u01db\u01dc\5\u00c1a\2\u01dc\u01dd\5\u00bf`\2\u01dd"+
		"\u01de\5\u00e1q\2\u01de\u01df\5\u00dbn\2\u01df\u01e0\5\u00c1a\2\u01e0"+
		"N\3\2\2\2\u01e1\u01e2\5\u00d7l\2\u01e2\u01e3\5\u00dbn\2\u01e3\u01e4\5"+
		"\u00d5k\2\u01e4\u01e5\5\u00c5c\2\u01e5\u01e6\5\u00dbn\2\u01e6\u01e7\5"+
		"\u00b9]\2\u01e7\u01e8\5\u00d1i\2\u01e8P\3\2\2\2\u01e9\u01ea\5\u00dbn\2"+
		"\u01ea\u01eb\5\u00c1a\2\u01eb\u01ec\5\u00bd_\2\u01ec\u01ed\5\u00d5k\2"+
		"\u01ed\u01ee\5\u00dbn\2\u01ee\u01ef\5\u00bf`\2\u01efR\3\2\2\2\u01f0\u01f1"+
		"\5\u00dbn\2\u01f1\u01f2\5\u00c1a\2\u01f2\u01f3\5\u00d7l\2\u01f3\u01f4"+
		"\5\u00c1a\2\u01f4\u01f5\5\u00b9]\2\u01f5\u01f6\5\u00dfp\2\u01f6T\3\2\2"+
		"\2\u01f7\u01f8\5\u00ddo\2\u01f8\u01f9\5\u00c1a\2\u01f9\u01fa\5\u00dfp"+
		"\2\u01faV\3\2\2\2\u01fb\u01fc\5\u00ddo\2\u01fc\u01fd\5\u00c7d\2\u01fd"+
		"\u01fe\5\u00cfh\2\u01feX\3\2\2\2\u01ff\u0200\5\u00ddo\2\u0200\u0201\5"+
		"\u00c7d\2\u0201\u0202\5\u00dbn\2\u0202Z\3\2\2\2\u0203\u0204\5\u00ddo\2"+
		"\u0204\u0205\5\u00dfp\2\u0205\u0206\5\u00dbn\2\u0206\u0207\5\u00c9e\2"+
		"\u0207\u0208\5\u00d3j\2\u0208\u0209\5\u00c5c\2\u0209\\\3\2\2\2\u020a\u020b"+
		"\5\u00dfp\2\u020b\u020c\5\u00c7d\2\u020c\u020d\5\u00c1a\2\u020d\u020e"+
		"\5\u00d3j\2\u020e^\3\2\2\2\u020f\u0210\5\u00dfp\2\u0210\u0211\5\u00d5"+
		"k\2\u0211`\3\2\2\2\u0212\u0213\5\u00dfp\2\u0213\u0214\5\u00dbn\2\u0214"+
		"\u0215\5\u00e1q\2\u0215\u0216\5\u00c1a\2\u0216b\3\2\2\2\u0217\u0218\5"+
		"\u00dfp\2\u0218\u0219\5\u00e9u\2\u0219\u021a\5\u00d7l\2\u021a\u021b\5"+
		"\u00c1a\2\u021bd\3\2\2\2\u021c\u021d\5\u00e1q\2\u021d\u021e\5\u00d3j\2"+
		"\u021e\u021f\5\u00c9e\2\u021f\u0220\5\u00dfp\2\u0220f\3\2\2\2\u0221\u0222"+
		"\5\u00e1q\2\u0222\u0223\5\u00d3j\2\u0223\u0224\5\u00dfp\2\u0224\u0225"+
		"\5\u00c9e\2\u0225\u0226\5\u00cfh\2\u0226h\3\2\2\2\u0227\u0228\5\u00e1"+
		"q\2\u0228\u0229\5\u00ddo\2\u0229\u022a\5\u00c1a\2\u022a\u022b\5\u00dd"+
		"o\2\u022bj\3\2\2\2\u022c\u022d\5\u00e3r\2\u022d\u022e\5\u00b9]\2\u022e"+
		"\u022f\5\u00dbn\2\u022fl\3\2\2\2\u0230\u0231\5\u00e5s\2\u0231\u0232\5"+
		"\u00c7d\2\u0232\u0233\5\u00c9e\2\u0233\u0234\5\u00cfh\2\u0234\u0235\5"+
		"\u00c1a\2\u0235n\3\2\2\2\u0236\u0237\5\u00e5s\2\u0237\u0238\5\u00c9e\2"+
		"\u0238\u0239\5\u00dfp\2\u0239\u023a\5\u00c7d\2\u023ap\3\2\2\2\u023b\u023c"+
		"\5\u00e7t\2\u023c\u023d\5\u00d5k\2\u023d\u023e\5\u00dbn\2\u023er\3\2\2"+
		"\2\u023f\u0243\t\2\2\2\u0240\u0242\t\3\2\2\u0241\u0240\3\2\2\2\u0242\u0245"+
		"\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244t\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0248\t\4\2\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024av\3\2\2\2\u024b\u024d"+
		"\t\4\2\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\7\60\2\2\u0251\u0253\t"+
		"\4\2\2\u0252\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255x\3\2\2\2\u0256\u0257\7)\2\2\u0257\u0258\13\2\2\2"+
		"\u0258\u0259\7)\2\2\u0259z\3\2\2\2\u025a\u025e\7)\2\2\u025b\u025d\13\2"+
		"\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025f\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7)"+
		"\2\2\u0262|\3\2\2\2\u0263\u0264\7-\2\2\u0264~\3\2\2\2\u0265\u0266\7/\2"+
		"\2\u0266\u0080\3\2\2\2\u0267\u0268\7,\2\2\u0268\u0082\3\2\2\2\u0269\u026a"+
		"\7\61\2\2\u026a\u0084\3\2\2\2\u026b\u026c\7<\2\2\u026c\u026d\7?\2\2\u026d"+
		"\u0086\3\2\2\2\u026e\u026f\7?\2\2\u026f\u0088\3\2\2\2\u0270\u0271\7>\2"+
		"\2\u0271\u0272\7@\2\2\u0272\u008a\3\2\2\2\u0273\u0274\7>\2\2\u0274\u0275"+
		"\7?\2\2\u0275\u008c\3\2\2\2\u0276\u0277\7@\2\2\u0277\u0278\7?\2\2\u0278"+
		"\u008e\3\2\2\2\u0279\u027a\7>\2\2\u027a\u0090\3\2\2\2\u027b\u027c\7@\2"+
		"\2\u027c\u0092\3\2\2\2\u027d\u027e\7-\2\2\u027e\u027f\7?\2\2\u027f\u0094"+
		"\3\2\2\2\u0280\u0281\7/\2\2\u0281\u0282\7?\2\2\u0282\u0096\3\2\2\2\u0283"+
		"\u0284\7,\2\2\u0284\u0285\7?\2\2\u0285\u0098\3\2\2\2\u0286\u0287\7\61"+
		"\2\2\u0287\u0288\7?\2\2\u0288\u009a\3\2\2\2\u0289\u028a\7`\2\2\u028a\u009c"+
		"\3\2\2\2\u028b\u028c\7=\2\2\u028c\u009e\3\2\2\2\u028d\u028e\7.\2\2\u028e"+
		"\u00a0\3\2\2\2\u028f\u0290\7*\2\2\u0290\u00a2\3\2\2\2\u0291\u0292\7+\2"+
		"\2\u0292\u00a4\3\2\2\2\u0293\u0294\7]\2\2\u0294\u00a6\3\2\2\2\u0295\u0296"+
		"\7_\2\2\u0296\u00a8\3\2\2\2\u0297\u0298\7}\2\2\u0298\u00aa\3\2\2\2\u0299"+
		"\u029a\7\177\2\2\u029a\u00ac\3\2\2\2\u029b\u029c\7*\2\2\u029c\u029d\7"+
		",\2\2\u029d\u00ae\3\2\2\2\u029e\u029f\7,\2\2\u029f\u02a0\7+\2\2\u02a0"+
		"\u00b0\3\2\2\2\u02a1\u02a2\7\60\2\2\u02a2\u02a3\7\60\2\2\u02a3\u00b2\3"+
		"\2\2\2\u02a4\u02a5\7\60\2\2\u02a5\u00b4\3\2\2\2\u02a6\u02a7\7<\2\2\u02a7"+
		"\u00b6\3\2\2\2\u02a8\u02aa\t\5\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02ae\b\\\2\2\u02ae\u00b8\3\2\2\2\u02af\u02b0\t\6\2\2\u02b0\u00ba\3\2"+
		"\2\2\u02b1\u02b2\t\7\2\2\u02b2\u00bc\3\2\2\2\u02b3\u02b4\t\b\2\2\u02b4"+
		"\u00be\3\2\2\2\u02b5\u02b6\t\t\2\2\u02b6\u00c0\3\2\2\2\u02b7\u02b8\t\n"+
		"\2\2\u02b8\u00c2\3\2\2\2\u02b9\u02ba\t\13\2\2\u02ba\u00c4\3\2\2\2\u02bb"+
		"\u02bc\t\f\2\2\u02bc\u00c6\3\2\2\2\u02bd\u02be\t\r\2\2\u02be\u00c8\3\2"+
		"\2\2\u02bf\u02c0\t\16\2\2\u02c0\u00ca\3\2\2\2\u02c1\u02c2\t\17\2\2\u02c2"+
		"\u00cc\3\2\2\2\u02c3\u02c4\t\20\2\2\u02c4\u00ce\3\2\2\2\u02c5\u02c6\t"+
		"\21\2\2\u02c6\u00d0\3\2\2\2\u02c7\u02c8\t\22\2\2\u02c8\u00d2\3\2\2\2\u02c9"+
		"\u02ca\t\23\2\2\u02ca\u00d4\3\2\2\2\u02cb\u02cc\t\24\2\2\u02cc\u00d6\3"+
		"\2\2\2\u02cd\u02ce\t\25\2\2\u02ce\u00d8\3\2\2\2\u02cf\u02d0\t\26\2\2\u02d0"+
		"\u00da\3\2\2\2\u02d1\u02d2\t\27\2\2\u02d2\u00dc\3\2\2\2\u02d3\u02d4\t"+
		"\30\2\2\u02d4\u00de\3\2\2\2\u02d5\u02d6\t\31\2\2\u02d6\u00e0\3\2\2\2\u02d7"+
		"\u02d8\t\32\2\2\u02d8\u00e2\3\2\2\2\u02d9\u02da\t\33\2\2\u02da\u00e4\3"+
		"\2\2\2\u02db\u02dc\t\34\2\2\u02dc\u00e6\3\2\2\2\u02dd\u02de\t\35\2\2\u02de"+
		"\u00e8\3\2\2\2\u02df\u02e0\t\36\2\2\u02e0\u00ea\3\2\2\2\u02e1\u02e2\t"+
		"\37\2\2\u02e2\u00ec\3\2\2\2\13\2\u0241\u0243\u0249\u024e\u0254\u025e\u02a9"+
		"\u02ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}