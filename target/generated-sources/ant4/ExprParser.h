
// Generated from Expr.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  ExprParser : public antlr4::Parser {
public:
  enum {
    WRITE = 1, WRITELN = 2, AND = 3, ARRAY = 4, BEGIN = 5, BOOLEAN = 6, 
    CASE = 7, CHAR = 8, CHR = 9, CONST = 10, DIV = 11, DO = 12, DOWNTO = 13, 
    ELSE = 14, END = 15, FILE = 16, FOR = 17, FUNCTION = 18, GOTO = 19, 
    IF = 20, IN = 21, INTEGER = 22, INTEGER_CONSTANT = 23, LABEL = 24, MOD = 25, 
    NIL = 26, NOT = 27, OF = 28, OR = 29, PACKED = 30, PROCEDURE = 31, PROGRAM = 32, 
    REAL = 33, RECORD = 34, REPEAT = 35, SET = 36, THEN = 37, TO = 38, TYPE = 39, 
    UNTIL = 40, VAR = 41, WHILE = 42, WITH = 43, PLUS = 44, MINUS = 45, 
    STAR = 46, SLASH = 47, ASSIGN = 48, COMMA = 49, SEMI = 50, COLON = 51, 
    EQUAL = 52, NOT_EQUAL = 53, LT = 54, LE = 55, GE = 56, GT = 57, LPAREN = 58, 
    RPAREN = 59, LBRACK = 60, LBRACK2 = 61, RBRACK = 62, RBRACK2 = 63, POINTER = 64, 
    AT = 65, DOT = 66, DOTDOT = 67, LCURLY = 68, RCURLY = 69, UNIT = 70, 
    INTERFACE = 71, USES = 72, STRING = 73, IMPLEMENTATION = 74, TRUE = 75, 
    FALSE = 76, WS = 77, COMMENT_1 = 78, COMMENT_2 = 79, IDENTIFIER = 80, 
    STRING_LITERAL = 81, NUM_INT = 82, NUM_REAL = 83, IDENT = 84
  };

  enum {
    RuleIdentifier = 0
  };

  ExprParser(antlr4::TokenStream *input);
  ~ExprParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class IdentifierContext; 

  class  IdentifierContext : public antlr4::ParserRuleContext {
  public:
    IdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IDENT();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierContext* identifier();


private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

