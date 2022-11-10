
// Generated from Pascal.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  PascalLexer : public antlr4::Lexer {
public:
  enum {
    AND = 1, ARRAY = 2, ASM = 3, BEGIN = 4, BREAK = 5, CASE = 6, CONST = 7, 
    CONSTRUCTOR = 8, CONTINUE = 9, DESTRUCTOR = 10, DIV = 11, DO = 12, DOWNTO = 13, 
    ELSE = 14, END = 15, FALSE = 16, FILE = 17, FOR = 18, FUNCTION = 19, 
    GOTO = 20, IF = 21, IMPLEMENTATION = 22, IN = 23, INLINE = 24, INTERFACE = 25, 
    LABEL = 26, MOD = 27, NIL = 28, NOT = 29, OBJECT = 30, OF = 31, ON = 32, 
    OPERATOR = 33, OR = 34, PACKED = 35, PROCEDURE = 36, PROGRAM = 37, RECORD = 38, 
    REPEAT = 39, SET = 40, SHL = 41, SHR = 42, STRING = 43, THEN = 44, TO = 45, 
    TRUE = 46, TYPE = 47, UNIT = 48, UNTIL = 49, USES = 50, VAR = 51, WHILE = 52, 
    WITH = 53, XOR = 54, CHAR = 55, BOOLEAN = 56, INTEGER = 57, REAL = 58, 
    PLUS = 59, MINUS = 60, STAR = 61, SLASH = 62, ASSIGN = 63, COMMA = 64, 
    SEMI = 65, COLON = 66, EQUAL = 67, NOT_EQUAL = 68, LT = 69, LE = 70, 
    GE = 71, GT = 72, LPAREN = 73, RPAREN = 74, LBRACK = 75, LBRACK2 = 76, 
    RBRACK = 77, RBRACK2 = 78, POINTER = 79, AT = 80, DOT = 81, DOTDOT = 82, 
    LCURLY = 83, RCURLY = 84, WS = 85, COMMENT_1 = 86, COMMENT_2 = 87, IDENT = 88, 
    STRING_LITERAL = 89, NUM_INT = 90, NUM_REAL = 91
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

