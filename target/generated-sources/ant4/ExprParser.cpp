
// Generated from Expr.g4 by ANTLR 4.7.2


#include "ExprVisitor.h"

#include "ExprParser.h"


using namespace antlrcpp;
using namespace antlr4;

ExprParser::ExprParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

ExprParser::~ExprParser() {
  delete _interpreter;
}

std::string ExprParser::getGrammarFileName() const {
  return "Expr.g4";
}

const std::vector<std::string>& ExprParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& ExprParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- IdentifierContext ------------------------------------------------------------------

ExprParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::IdentifierContext::IDENT() {
  return getToken(ExprParser::IDENT, 0);
}


size_t ExprParser::IdentifierContext::getRuleIndex() const {
  return ExprParser::RuleIdentifier;
}


antlrcpp::Any ExprParser::IdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitIdentifier(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::IdentifierContext* ExprParser::identifier() {
  IdentifierContext *_localctx = _tracker.createInstance<IdentifierContext>(_ctx, getState());
  enterRule(_localctx, 0, ExprParser::RuleIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(2);
    match(ExprParser::IDENT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> ExprParser::_decisionToDFA;
atn::PredictionContextCache ExprParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN ExprParser::_atn;
std::vector<uint16_t> ExprParser::_serializedATN;

std::vector<std::string> ExprParser::_ruleNames = {
  "identifier"
};

std::vector<std::string> ExprParser::_literalNames = {
  "", "'WRITE'", "'WRITELN'", "'AND'", "'ARRAY'", "'BEGIN'", "'BOOLEAN'", 
  "'CASE'", "'CHAR'", "'CHR'", "'CONST'", "'DIV'", "'DO'", "'DOWNTO'", "'ELSE'", 
  "'END'", "'FILE'", "'FOR'", "'FUNCTION'", "'GOTO'", "'IF'", "'IN'", "'INTEGER'", 
  "", "'LABEL'", "'MOD'", "'NIL'", "'NOT'", "'OF'", "'OR'", "'PACKED'", 
  "'PROCEDURE'", "'PROGRAM'", "'REAL'", "'RECORD'", "'REPEAT'", "'SET'", 
  "'THEN'", "'TO'", "'TYPE'", "'UNTIL'", "'VAR'", "'WHILE'", "'WITH'", "'+'", 
  "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", "'<>'", "'<'", 
  "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", "'^'", 
  "'@'", "'.'", "'..'", "'{'", "'}'", "'UNIT'", "'INTERFACE'", "'USES'", 
  "'STRING'", "'IMPLEMENTATION'", "'TRUE'", "'FALSE'"
};

std::vector<std::string> ExprParser::_symbolicNames = {
  "", "WRITE", "WRITELN", "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", 
  "CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", 
  "GOTO", "IF", "IN", "INTEGER", "INTEGER_CONSTANT", "LABEL", "MOD", "NIL", 
  "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "REAL", "RECORD", 
  "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
  "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
  "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
  "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
  "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", "IMPLEMENTATION", "TRUE", 
  "FALSE", "WS", "COMMENT_1", "COMMENT_2", "IDENTIFIER", "STRING_LITERAL", 
  "NUM_INT", "NUM_REAL", "IDENT"
};

dfa::Vocabulary ExprParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> ExprParser::_tokenNames;

ExprParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x56, 0x7, 0x4, 0x2, 0x9, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x2, 
    0x2, 0x3, 0x2, 0x2, 0x2, 0x2, 0x5, 0x2, 0x4, 0x3, 0x2, 0x2, 0x2, 0x4, 
    0x5, 0x7, 0x56, 0x2, 0x2, 0x5, 0x3, 0x3, 0x2, 0x2, 0x2, 0x2, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

ExprParser::Initializer ExprParser::_init;
