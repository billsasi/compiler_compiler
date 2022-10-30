
// Generated from Pascal.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  PascalLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, AND = 3, ARRAY = 4, ASM = 5, BEGIN = 6, BREAK = 7, 
    CASE = 8, CONST = 9, CONSTRUCTOR = 10, CONTINUE = 11, DESTRUCTOR = 12, 
    DIV = 13, DO = 14, DOWNTO = 15, ELSE = 16, END = 17, FALSE = 18, FILE = 19, 
    FOR = 20, FUNCTION = 21, GOTO = 22, IF = 23, IMPLEMENTATION = 24, IN = 25, 
    INLINE = 26, INTERFACE = 27, LABEL = 28, MOD = 29, NIL = 30, NOT = 31, 
    OBJECT = 32, OF = 33, ON = 34, OPERATOR = 35, OR = 36, PACKED = 37, 
    PROCEDURE = 38, PROGRAM = 39, RECORD = 40, REPEAT = 41, SET = 42, SHL = 43, 
    SHR = 44, STRING = 45, THEN = 46, TO = 47, TRUE = 48, TYPE = 49, UNIT = 50, 
    UNTIL = 51, USES = 52, VAR = 53, WHILE = 54, WITH = 55, XOR = 56, IDENTIFIER = 57, 
    INTEGER = 58, REAL = 59, CHARACTER = 60, STRING_LITERAL = 61, PLUSOP = 62, 
    MINUSOP = 63, MULTOP = 64, DIVOP = 65, ASSIGN = 66, EQUAL = 67, NE = 68, 
    LTEQ = 69, GTEQ = 70, LT = 71, GT = 72, PLUSEQUAL = 73, MINUSEQUAL = 74, 
    MULTEQUAL = 75, DIVEQUAL = 76, CARAT = 77, SEMICOLON = 78, COMMA = 79, 
    LPAREN = 80, RPAREN = 81, LBRACKET = 82, RBRACKET = 83, LBRACE = 84, 
    RBRACE = 85, LCOMMENT = 86, RCOMMENT = 87, DOT_DOT = 88, PERIOD = 89, 
    COLON = 90, WS = 91
  };

  PascalLexer(antlr4::CharStream *input);
  ~PascalLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

