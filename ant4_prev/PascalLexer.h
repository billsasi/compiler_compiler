
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
    WITH = 53, XOR = 54, CHR = 55, CHAR = 56, BOOLEAN = 57, INTEGER = 58, 
    REAL = 59, PLUS = 60, MINUS = 61, STAR = 62, SLASH = 63, ASSIGN = 64, 
    COMMA = 65, SEMI = 66, COLON = 67, EQUAL = 68, NOT_EQUAL = 69, LT = 70, 
    LE = 71, GE = 72, GT = 73, LPAREN = 74, RPAREN = 75, LBRACK = 76, LBRACK2 = 77, 
    RBRACK = 78, RBRACK2 = 79, POINTER = 80, AT = 81, DOT = 82, DOTDOT = 83, 
    LCURLY = 84, RCURLY = 85, WS = 86, COMMENT_1 = 87, COMMENT_2 = 88, IDENT = 89, 
    STRING_LITERAL = 90, NUM_INT = 91, NUM_REAL = 92
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

