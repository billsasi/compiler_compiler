
// Generated from Pascal.g4 by ANTLR 4.7.2


#include "PascalVisitor.h"

#include "PascalParser.h"


using namespace antlrcpp;
using namespace antlr4;

PascalParser::PascalParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

PascalParser::~PascalParser() {
  delete _interpreter;
}

std::string PascalParser::getGrammarFileName() const {
  return "Pascal.g4";
}

const std::vector<std::string>& PascalParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& PascalParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- IdentifierContext ------------------------------------------------------------------

PascalParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::IdentifierContext::IDENTIFIER() {
  return getToken(PascalParser::IDENTIFIER, 0);
}


size_t PascalParser::IdentifierContext::getRuleIndex() const {
  return PascalParser::RuleIdentifier;
}


antlrcpp::Any PascalParser::IdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::IdentifierContext* PascalParser::identifier() {
  IdentifierContext *_localctx = _tracker.createInstance<IdentifierContext>(_ctx, getState());
  enterRule(_localctx, 0, PascalParser::RuleIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(2);
    match(PascalParser::IDENTIFIER);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> PascalParser::_decisionToDFA;
atn::PredictionContextCache PascalParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN PascalParser::_atn;
std::vector<uint16_t> PascalParser::_serializedATN;

std::vector<std::string> PascalParser::_ruleNames = {
  "identifier"
};

std::vector<std::string> PascalParser::_literalNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "'+'", "'-'", "'*'", "'/'", "':='", "'='", "'<>'", 
  "'<='", "'>='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'^'", "';'", 
  "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'(*'", "'*)'", "'..'", 
  "'.'", "':'"
};

std::vector<std::string> PascalParser::_symbolicNames = {
  "", "AND", "ARRAY", "ASM", "BEGIN", "BREAK", "CASE", "CONST", "CONSTRUCTOR", 
  "CONTINUE", "DESTRUCTOR", "DIV", "DO", "DOWNTO", "ELSE", "END", "FALSE", 
  "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IMPLEMENTATION", "IN", "INLINE", 
  "INTERFACE", "LABEL", "MOD", "NIL", "NOT", "OBJECT", "OF", "ON", "OPERATOR", 
  "OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", "REPEAT", "SET", "SHL", 
  "SHR", "STRING", "THEN", "TO", "TRUE", "TYPE", "UNIT", "UNTIL", "USES", 
  "VAR", "WHILE", "WITH", "XOR", "IDENTIFIER", "INTEGER", "REAL", "STRING_LITERAL", 
  "PLUSOP", "MINUSOP", "MULTOP", "DIVOP", "ASSIGN", "EQUAL", "NE", "LTEQ", 
  "GTEQ", "LT", "GT", "PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", "DIVEQUAL", 
  "CARAT", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
  "LBRACE", "RBRACE", "LCOMMENT", "RCOMMENT", "DOT_DOT", "PERIOD", "COLON", 
  "WS"
};

dfa::Vocabulary PascalParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> PascalParser::_tokenNames;

PascalParser::Initializer::Initializer() {
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
    0x3, 0x5a, 0x7, 0x4, 0x2, 0x9, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x2, 
    0x2, 0x3, 0x2, 0x2, 0x2, 0x2, 0x5, 0x2, 0x4, 0x3, 0x2, 0x2, 0x2, 0x4, 
    0x5, 0x7, 0x39, 0x2, 0x2, 0x5, 0x3, 0x3, 0x2, 0x2, 0x2, 0x2, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

PascalParser::Initializer PascalParser::_init;
