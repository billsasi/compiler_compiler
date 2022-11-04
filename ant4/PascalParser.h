
// Generated from Pascal.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "../intermediate/symtab/SymtabStack.h"
#include "../intermediate/symtab/Predefined.h"

using namespace intermediate::symtab;

class  PascalParser : public antlr4::Parser {
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

  enum {
    RuleProgram = 0, RuleProgramHeading = 1, RuleIdentifierList = 2, RuleIdentifier = 3, 
    RuleBlock = 4, RuleLabelDeclarationPart = 5, RuleLabel = 6, RuleConstantDefinitionPart = 7, 
    RuleConstantDefinition = 8, RuleConstant = 9, RuleUnsignedNumber = 10, 
    RuleUnsignedInteger = 11, RuleUnsignedReal = 12, RuleScaleFactor = 13, 
    RuleSign = 14, RuleConstantIdentifier = 15, RuleString = 16, RuleTypeDefinitionPart = 17, 
    RuleTypeDefinition = 18, RuleType = 19, RuleSimpleType = 20, RuleScalarType = 21, 
    RuleSubrangeType = 22, RuleTypeIdentifier = 23, RuleStructuredType = 24, 
    RuleArrayType = 25, RuleIndexType = 26, RuleComponentType = 27, RuleRecordType = 28, 
    RuleFieldList = 29, RuleFixedPart = 30, RuleRecordSection = 31, RuleVariantType = 32, 
    RuleTagField = 33, RuleVariant = 34, RuleCaseLabel = 35, RuleSetType = 36, 
    RuleBaseType = 37, RuleFileType = 38, RulePointerType = 39, RuleVariableDeclarationPart = 40, 
    RuleVariableDeclaration = 41, RuleProcedureAndFunctionDeclarationPart = 42, 
    RuleProcedureOrFunctionDeclaration = 43, RuleProcedureDeclaration = 44, 
    RuleProcedureHeading = 45, RuleFormalParameterSection = 46, RuleParameterGroup = 47, 
    RuleFunctionDeclaration = 48, RuleFunctionHeading = 49, RuleResultType = 50, 
    RuleStatementPart = 51, RuleStatement = 52, RuleUnlabelledStatement = 53, 
    RuleSimpleStatement = 54, RuleAssignmentStatement = 55, RuleVariable = 56, 
    RuleEntireVariable = 57, RuleVariableIdentifier = 58, RuleComponentVariable = 59, 
    RuleIndexedVariable = 60, RuleArrayVariable = 61, RuleFieldDesignator = 62, 
    RuleRecordVariable = 63, RuleFieldIdentifier = 64, RuleFileBuffer = 65, 
    RuleFileVariable = 66, RuleReferencedVariable = 67, RulePointerVariable = 68, 
    RuleExpression = 69, RuleRelationalOperator = 70, RuleSimpleExpression = 71, 
    RuleAddingOperator = 72, RuleTerm = 73, RuleMultiplyingOperator = 74, 
    RuleFactor = 75, RuleUnsignedConstant = 76, RuleFunctionDesignator = 77, 
    RuleFunctionIdentifier = 78, RuleSet = 79, RuleElementList = 80, RuleElement = 81, 
    RuleProcedureStatement = 82, RuleProcedureIdentifier = 83, RuleActualParameter = 84, 
    RuleGoToStatement = 85, RuleEmptyStatement = 86, RuleEmpty = 87, RuleStructuredStatement = 88, 
    RuleCompoundStatement = 89, RuleConditionalStatement = 90, RuleIfStatement = 91, 
    RuleCaseStatement = 92, RuleCaseListElement = 93, RuleCaseLabelList = 94, 
    RuleRepetitiveStatement = 95, RuleWhileStatement = 96, RuleRepeatStatement = 97, 
    RuleForStatement = 98, RuleControlVariable = 99, RuleForList = 100, 
    RuleInitialValue = 101, RuleFinalValue = 102, RuleWithStatement = 103, 
    RuleRecordVariableList = 104
  };

  PascalParser(antlr4::TokenStream *input);
  ~PascalParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class ProgramContext;
  class ProgramHeadingContext;
  class IdentifierListContext;
  class IdentifierContext;
  class BlockContext;
  class LabelDeclarationPartContext;
  class LabelContext;
  class ConstantDefinitionPartContext;
  class ConstantDefinitionContext;
  class ConstantContext;
  class UnsignedNumberContext;
  class UnsignedIntegerContext;
  class UnsignedRealContext;
  class ScaleFactorContext;
  class SignContext;
  class ConstantIdentifierContext;
  class StringContext;
  class TypeDefinitionPartContext;
  class TypeDefinitionContext;
  class TypeContext;
  class SimpleTypeContext;
  class ScalarTypeContext;
  class SubrangeTypeContext;
  class TypeIdentifierContext;
  class StructuredTypeContext;
  class ArrayTypeContext;
  class IndexTypeContext;
  class ComponentTypeContext;
  class RecordTypeContext;
  class FieldListContext;
  class FixedPartContext;
  class RecordSectionContext;
  class VariantTypeContext;
  class TagFieldContext;
  class VariantContext;
  class CaseLabelContext;
  class SetTypeContext;
  class BaseTypeContext;
  class FileTypeContext;
  class PointerTypeContext;
  class VariableDeclarationPartContext;
  class VariableDeclarationContext;
  class ProcedureAndFunctionDeclarationPartContext;
  class ProcedureOrFunctionDeclarationContext;
  class ProcedureDeclarationContext;
  class ProcedureHeadingContext;
  class FormalParameterSectionContext;
  class ParameterGroupContext;
  class FunctionDeclarationContext;
  class FunctionHeadingContext;
  class ResultTypeContext;
  class StatementPartContext;
  class StatementContext;
  class UnlabelledStatementContext;
  class SimpleStatementContext;
  class AssignmentStatementContext;
  class VariableContext;
  class EntireVariableContext;
  class VariableIdentifierContext;
  class ComponentVariableContext;
  class IndexedVariableContext;
  class ArrayVariableContext;
  class FieldDesignatorContext;
  class RecordVariableContext;
  class FieldIdentifierContext;
  class FileBufferContext;
  class FileVariableContext;
  class ReferencedVariableContext;
  class PointerVariableContext;
  class ExpressionContext;
  class RelationalOperatorContext;
  class SimpleExpressionContext;
  class AddingOperatorContext;
  class TermContext;
  class MultiplyingOperatorContext;
  class FactorContext;
  class UnsignedConstantContext;
  class FunctionDesignatorContext;
  class FunctionIdentifierContext;
  class SetContext;
  class ElementListContext;
  class ElementContext;
  class ProcedureStatementContext;
  class ProcedureIdentifierContext;
  class ActualParameterContext;
  class GoToStatementContext;
  class EmptyStatementContext;
  class EmptyContext;
  class StructuredStatementContext;
  class CompoundStatementContext;
  class ConditionalStatementContext;
  class IfStatementContext;
  class CaseStatementContext;
  class CaseListElementContext;
  class CaseLabelListContext;
  class RepetitiveStatementContext;
  class WhileStatementContext;
  class RepeatStatementContext;
  class ForStatementContext;
  class ControlVariableContext;
  class ForListContext;
  class InitialValueContext;
  class FinalValueContext;
  class WithStatementContext;
  class RecordVariableListContext; 

  class  ProgramContext : public antlr4::ParserRuleContext {
  public:
    ProgramContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PROGRAM();
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *SEMICOLON();
    BlockContext *block();
    antlr4::tree::TerminalNode *PERIOD();
    ProgramHeadingContext *programHeading();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProgramContext* program();

  class  ProgramHeadingContext : public antlr4::ParserRuleContext {
  public:
    ProgramHeadingContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LPAREN();
    IdentifierListContext *identifierList();
    antlr4::tree::TerminalNode *RPAREN();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProgramHeadingContext* programHeading();

  class  IdentifierListContext : public antlr4::ParserRuleContext {
  public:
    IdentifierListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<IdentifierContext *> identifier();
    IdentifierContext* identifier(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierListContext* identifierList();

  class  IdentifierContext : public antlr4::ParserRuleContext {
  public:
    IdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IDENTIFIER();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IdentifierContext* identifier();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LabelDeclarationPartContext *labelDeclarationPart();
    ConstantDefinitionPartContext *constantDefinitionPart();
    TypeDefinitionPartContext *typeDefinitionPart();
    VariableDeclarationPartContext *variableDeclarationPart();
    ProcedureAndFunctionDeclarationPartContext *procedureAndFunctionDeclarationPart();
    StatementPartContext *statementPart();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockContext* block();

  class  LabelDeclarationPartContext : public antlr4::ParserRuleContext {
  public:
    LabelDeclarationPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EmptyContext *empty();
    antlr4::tree::TerminalNode *LABEL();
    std::vector<LabelContext *> label();
    LabelContext* label(size_t i);
    antlr4::tree::TerminalNode *SEMICOLON();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LabelDeclarationPartContext* labelDeclarationPart();

  class  LabelContext : public antlr4::ParserRuleContext {
  public:
    LabelContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnsignedIntegerContext *unsignedInteger();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LabelContext* label();

  class  ConstantDefinitionPartContext : public antlr4::ParserRuleContext {
  public:
    ConstantDefinitionPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EmptyContext *empty();
    antlr4::tree::TerminalNode *CONST();
    std::vector<ConstantDefinitionContext *> constantDefinition();
    ConstantDefinitionContext* constantDefinition(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantDefinitionPartContext* constantDefinitionPart();

  class  ConstantDefinitionContext : public antlr4::ParserRuleContext {
  public:
    ConstantDefinitionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *EQUAL();
    ConstantContext *constant();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantDefinitionContext* constantDefinition();

  class  ConstantContext : public antlr4::ParserRuleContext {
  public:
    ConstantContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnsignedNumberContext *unsignedNumber();
    SignContext *sign();
    ConstantIdentifierContext *constantIdentifier();
    StringContext *string();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantContext* constant();

  class  UnsignedNumberContext : public antlr4::ParserRuleContext {
  public:
    UnsignedNumberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnsignedIntegerContext *unsignedInteger();
    UnsignedRealContext *unsignedReal();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnsignedNumberContext* unsignedNumber();

  class  UnsignedIntegerContext : public antlr4::ParserRuleContext {
  public:
    UnsignedIntegerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *INTEGER();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnsignedIntegerContext* unsignedInteger();

  class  UnsignedRealContext : public antlr4::ParserRuleContext {
  public:
    UnsignedRealContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *REAL();
    ScaleFactorContext *scaleFactor();
    UnsignedIntegerContext *unsignedInteger();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnsignedRealContext* unsignedReal();

  class  ScaleFactorContext : public antlr4::ParserRuleContext {
  public:
    ScaleFactorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnsignedIntegerContext *unsignedInteger();
    SignContext *sign();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ScaleFactorContext* scaleFactor();

  class  SignContext : public antlr4::ParserRuleContext {
  public:
    SignContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PLUSOP();
    antlr4::tree::TerminalNode *MINUSOP();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SignContext* sign();

  class  ConstantIdentifierContext : public antlr4::ParserRuleContext {
  public:
    ConstantIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantIdentifierContext* constantIdentifier();

  class  StringContext : public antlr4::ParserRuleContext {
  public:
    StringContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *STRING_LITERAL();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StringContext* string();

  class  TypeDefinitionPartContext : public antlr4::ParserRuleContext {
  public:
    TypeDefinitionPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EmptyContext *empty();
    antlr4::tree::TerminalNode *TYPE();
    std::vector<TypeDefinitionContext *> typeDefinition();
    TypeDefinitionContext* typeDefinition(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeDefinitionPartContext* typeDefinitionPart();

  class  TypeDefinitionContext : public antlr4::ParserRuleContext {
  public:
    TypeDefinitionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *EQUAL();
    TypeContext *type();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeDefinitionContext* typeDefinition();

  class  TypeContext : public antlr4::ParserRuleContext {
  public:
    TypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SimpleTypeContext *simpleType();
    StructuredTypeContext *structuredType();
    PointerTypeContext *pointerType();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeContext* type();

  class  SimpleTypeContext : public antlr4::ParserRuleContext {
  public:
    SimpleTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ScalarTypeContext *scalarType();
    SubrangeTypeContext *subrangeType();
    TypeIdentifierContext *typeIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SimpleTypeContext* simpleType();

  class  ScalarTypeContext : public antlr4::ParserRuleContext {
  public:
    ScalarTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<IdentifierContext *> identifier();
    IdentifierContext* identifier(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ScalarTypeContext* scalarType();

  class  SubrangeTypeContext : public antlr4::ParserRuleContext {
  public:
    SubrangeTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ConstantContext *> constant();
    ConstantContext* constant(size_t i);
    antlr4::tree::TerminalNode *DOT_DOT();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SubrangeTypeContext* subrangeType();

  class  TypeIdentifierContext : public antlr4::ParserRuleContext {
  public:
    TypeIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeIdentifierContext* typeIdentifier();

  class  StructuredTypeContext : public antlr4::ParserRuleContext {
  public:
    StructuredTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ArrayTypeContext *arrayType();
    RecordTypeContext *recordType();
    SetTypeContext *setType();
    FileTypeContext *fileType();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StructuredTypeContext* structuredType();

  class  ArrayTypeContext : public antlr4::ParserRuleContext {
  public:
    ArrayTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ARRAY();
    antlr4::tree::TerminalNode *LBRACKET();
    std::vector<IndexTypeContext *> indexType();
    IndexTypeContext* indexType(size_t i);
    antlr4::tree::TerminalNode *RBRACKET();
    antlr4::tree::TerminalNode *OF();
    ComponentTypeContext *componentType();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayTypeContext* arrayType();

  class  IndexTypeContext : public antlr4::ParserRuleContext {
  public:
    IndexTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SimpleTypeContext *simpleType();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexTypeContext* indexType();

  class  ComponentTypeContext : public antlr4::ParserRuleContext {
  public:
    ComponentTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeContext *type();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ComponentTypeContext* componentType();

  class  RecordTypeContext : public antlr4::ParserRuleContext {
  public:
    RecordTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *RECORD();
    FieldListContext *fieldList();
    antlr4::tree::TerminalNode *END();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecordTypeContext* recordType();

  class  FieldListContext : public antlr4::ParserRuleContext {
  public:
    FieldListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FixedPartContext *fixedPart();
    antlr4::tree::TerminalNode *SEMICOLON();
    VariantContext *variant();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldListContext* fieldList();

  class  FixedPartContext : public antlr4::ParserRuleContext {
  public:
    FixedPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<RecordSectionContext *> recordSection();
    RecordSectionContext* recordSection(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FixedPartContext* fixedPart();

  class  RecordSectionContext : public antlr4::ParserRuleContext {
  public:
    RecordSectionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<FieldIdentifierContext *> fieldIdentifier();
    FieldIdentifierContext* fieldIdentifier(size_t i);
    antlr4::tree::TerminalNode *COLON();
    TypeContext *type();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);
    EmptyContext *empty();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecordSectionContext* recordSection();

  class  VariantTypeContext : public antlr4::ParserRuleContext {
  public:
    VariantTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CASE();
    TagFieldContext *tagField();
    TypeIdentifierContext *typeIdentifier();
    antlr4::tree::TerminalNode *OF();
    std::vector<VariantContext *> variant();
    VariantContext* variant(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariantTypeContext* variantType();

  class  TagFieldContext : public antlr4::ParserRuleContext {
  public:
    TagFieldContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FieldIdentifierContext *fieldIdentifier();
    antlr4::tree::TerminalNode *COLON();
    EmptyContext *empty();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TagFieldContext* tagField();

  class  VariantContext : public antlr4::ParserRuleContext {
  public:
    VariantContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CaseLabelListContext *caseLabelList();
    antlr4::tree::TerminalNode *COLON();
    FieldListContext *fieldList();
    EmptyContext *empty();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariantContext* variant();

  class  CaseLabelContext : public antlr4::ParserRuleContext {
  public:
    CaseLabelContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConstantContext *constant();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CaseLabelContext* caseLabel();

  class  SetTypeContext : public antlr4::ParserRuleContext {
  public:
    SetTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SET();
    antlr4::tree::TerminalNode *OF();
    BaseTypeContext *baseType();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SetTypeContext* setType();

  class  BaseTypeContext : public antlr4::ParserRuleContext {
  public:
    BaseTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SimpleTypeContext *simpleType();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BaseTypeContext* baseType();

  class  FileTypeContext : public antlr4::ParserRuleContext {
  public:
    FileTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FILE();
    antlr4::tree::TerminalNode *OF();
    TypeContext *type();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileTypeContext* fileType();

  class  PointerTypeContext : public antlr4::ParserRuleContext {
  public:
    PointerTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeIdentifierContext *typeIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PointerTypeContext* pointerType();

  class  VariableDeclarationPartContext : public antlr4::ParserRuleContext {
  public:
    VariableDeclarationPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EmptyContext *empty();
    antlr4::tree::TerminalNode *VAR();
    std::vector<VariableDeclarationContext *> variableDeclaration();
    VariableDeclarationContext* variableDeclaration(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDeclarationPartContext* variableDeclarationPart();

  class  VariableDeclarationContext : public antlr4::ParserRuleContext {
  public:
    VariableDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<IdentifierContext *> identifier();
    IdentifierContext* identifier(size_t i);
    antlr4::tree::TerminalNode *COLON();
    TypeContext *type();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDeclarationContext* variableDeclaration();

  class  ProcedureAndFunctionDeclarationPartContext : public antlr4::ParserRuleContext {
  public:
    ProcedureAndFunctionDeclarationPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ProcedureOrFunctionDeclarationContext *> procedureOrFunctionDeclaration();
    ProcedureOrFunctionDeclarationContext* procedureOrFunctionDeclaration(size_t i);
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProcedureAndFunctionDeclarationPartContext* procedureAndFunctionDeclarationPart();

  class  ProcedureOrFunctionDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ProcedureOrFunctionDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ProcedureDeclarationContext *procedureDeclaration();
    FunctionDeclarationContext *functionDeclaration();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProcedureOrFunctionDeclarationContext* procedureOrFunctionDeclaration();

  class  ProcedureDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ProcedureDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ProcedureHeadingContext *procedureHeading();
    BlockContext *block();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProcedureDeclarationContext* procedureDeclaration();

  class  ProcedureHeadingContext : public antlr4::ParserRuleContext {
  public:
    ProcedureHeadingContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PROCEDURE();
    IdentifierContext *identifier();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    antlr4::tree::TerminalNode *LPAREN();
    std::vector<FormalParameterSectionContext *> formalParameterSection();
    FormalParameterSectionContext* formalParameterSection(size_t i);
    antlr4::tree::TerminalNode *RPAREN();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProcedureHeadingContext* procedureHeading();

  class  FormalParameterSectionContext : public antlr4::ParserRuleContext {
  public:
    FormalParameterSectionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ParameterGroupContext *parameterGroup();
    antlr4::tree::TerminalNode *VAR();
    antlr4::tree::TerminalNode *FUNCTION();
    antlr4::tree::TerminalNode *PROCEDURE();
    std::vector<IdentifierContext *> identifier();
    IdentifierContext* identifier(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FormalParameterSectionContext* formalParameterSection();

  class  ParameterGroupContext : public antlr4::ParserRuleContext {
  public:
    ParameterGroupContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<IdentifierContext *> identifier();
    IdentifierContext* identifier(size_t i);
    antlr4::tree::TerminalNode *COLON();
    TypeIdentifierContext *typeIdentifier();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ParameterGroupContext* parameterGroup();

  class  FunctionDeclarationContext : public antlr4::ParserRuleContext {
  public:
    FunctionDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionHeadingContext *functionHeading();
    BlockContext *block();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionDeclarationContext* functionDeclaration();

  class  FunctionHeadingContext : public antlr4::ParserRuleContext {
  public:
    FunctionHeadingContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FUNCTION();
    IdentifierContext *identifier();
    antlr4::tree::TerminalNode *COLON();
    ResultTypeContext *resultType();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);
    antlr4::tree::TerminalNode *LPAREN();
    std::vector<FormalParameterSectionContext *> formalParameterSection();
    FormalParameterSectionContext* formalParameterSection(size_t i);
    antlr4::tree::TerminalNode *RPAREN();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionHeadingContext* functionHeading();

  class  ResultTypeContext : public antlr4::ParserRuleContext {
  public:
    ResultTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeIdentifierContext *typeIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ResultTypeContext* resultType();

  class  StatementPartContext : public antlr4::ParserRuleContext {
  public:
    StatementPartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CompoundStatementContext *compoundStatement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementPartContext* statementPart();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnlabelledStatementContext *unlabelledStatement();
    LabelContext *label();
    antlr4::tree::TerminalNode *COLON();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementContext* statement();

  class  UnlabelledStatementContext : public antlr4::ParserRuleContext {
  public:
    UnlabelledStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SimpleStatementContext *simpleStatement();
    StructuredStatementContext *structuredStatement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnlabelledStatementContext* unlabelledStatement();

  class  SimpleStatementContext : public antlr4::ParserRuleContext {
  public:
    SimpleStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AssignmentStatementContext *assignmentStatement();
    ProcedureStatementContext *procedureStatement();
    GoToStatementContext *goToStatement();
    EmptyStatementContext *emptyStatement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SimpleStatementContext* simpleStatement();

  class  AssignmentStatementContext : public antlr4::ParserRuleContext {
  public:
    AssignmentStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableContext *variable();
    antlr4::tree::TerminalNode *ASSIGN();
    ExpressionContext *expression();
    FunctionIdentifierContext *functionIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignmentStatementContext* assignmentStatement();

  class  VariableContext : public antlr4::ParserRuleContext {
  public:
    VariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EntireVariableContext *entireVariable();
    ComponentVariableContext *componentVariable();
    ReferencedVariableContext *referencedVariable();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableContext* variable();

  class  EntireVariableContext : public antlr4::ParserRuleContext {
  public:
    EntireVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableIdentifierContext *variableIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EntireVariableContext* entireVariable();

  class  VariableIdentifierContext : public antlr4::ParserRuleContext {
  public:
    VariableIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableIdentifierContext* variableIdentifier();

  class  ComponentVariableContext : public antlr4::ParserRuleContext {
  public:
    ComponentVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IndexedVariableContext *indexedVariable();
    FieldDesignatorContext *fieldDesignator();
    FileBufferContext *fileBuffer();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ComponentVariableContext* componentVariable();

  class  IndexedVariableContext : public antlr4::ParserRuleContext {
  public:
    IndexedVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ArrayVariableContext *arrayVariable();
    antlr4::tree::TerminalNode *LBRACKET();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *RBRACKET();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexedVariableContext* indexedVariable();

  class  ArrayVariableContext : public antlr4::ParserRuleContext {
  public:
    ArrayVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayVariableContext* arrayVariable();

  class  FieldDesignatorContext : public antlr4::ParserRuleContext {
  public:
    FieldDesignatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    RecordVariableContext *recordVariable();
    antlr4::tree::TerminalNode *PERIOD();
    FieldIdentifierContext *fieldIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldDesignatorContext* fieldDesignator();

  class  RecordVariableContext : public antlr4::ParserRuleContext {
  public:
    RecordVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecordVariableContext* recordVariable();

  class  FieldIdentifierContext : public antlr4::ParserRuleContext {
  public:
    FieldIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldIdentifierContext* fieldIdentifier();

  class  FileBufferContext : public antlr4::ParserRuleContext {
  public:
    FileBufferContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileBufferContext* fileBuffer();

  class  FileVariableContext : public antlr4::ParserRuleContext {
  public:
    FileVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileVariableContext* fileVariable();

  class  ReferencedVariableContext : public antlr4::ParserRuleContext {
  public:
    ReferencedVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PointerVariableContext *pointerVariable();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ReferencedVariableContext* referencedVariable();

  class  PointerVariableContext : public antlr4::ParserRuleContext {
  public:
    PointerVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PointerVariableContext* pointerVariable();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<SimpleExpressionContext *> simpleExpression();
    SimpleExpressionContext* simpleExpression(size_t i);
    RelationalOperatorContext *relationalOperator();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionContext* expression();

  class  RelationalOperatorContext : public antlr4::ParserRuleContext {
  public:
    RelationalOperatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EQUAL();
    antlr4::tree::TerminalNode *NE();
    antlr4::tree::TerminalNode *LTEQ();
    antlr4::tree::TerminalNode *GTEQ();
    antlr4::tree::TerminalNode *LT();
    antlr4::tree::TerminalNode *GT();
    antlr4::tree::TerminalNode *IN();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RelationalOperatorContext* relationalOperator();

  class  SimpleExpressionContext : public antlr4::ParserRuleContext {
  public:
    SimpleExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TermContext *term();
    SignContext *sign();
    SimpleExpressionContext *simpleExpression();
    AddingOperatorContext *addingOperator();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SimpleExpressionContext* simpleExpression();
  SimpleExpressionContext* simpleExpression(int precedence);
  class  AddingOperatorContext : public antlr4::ParserRuleContext {
  public:
    AddingOperatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PLUSOP();
    antlr4::tree::TerminalNode *MINUSOP();
    antlr4::tree::TerminalNode *OR();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AddingOperatorContext* addingOperator();

  class  TermContext : public antlr4::ParserRuleContext {
  public:
    TermContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FactorContext *factor();
    TermContext *term();
    MultiplyingOperatorContext *multiplyingOperator();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TermContext* term();
  TermContext* term(int precedence);
  class  MultiplyingOperatorContext : public antlr4::ParserRuleContext {
  public:
    MultiplyingOperatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *MULTOP();
    antlr4::tree::TerminalNode *DIVOP();
    antlr4::tree::TerminalNode *DIV();
    antlr4::tree::TerminalNode *MOD();
    antlr4::tree::TerminalNode *AND();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MultiplyingOperatorContext* multiplyingOperator();

  class  FactorContext : public antlr4::ParserRuleContext {
  public:
    FactorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableContext *variable();
    UnsignedConstantContext *unsignedConstant();
    antlr4::tree::TerminalNode *LPAREN();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RPAREN();
    FunctionDesignatorContext *functionDesignator();
    SetContext *set();
    antlr4::tree::TerminalNode *NOT();
    FactorContext *factor();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FactorContext* factor();

  class  UnsignedConstantContext : public antlr4::ParserRuleContext {
  public:
    UnsignedConstantContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnsignedNumberContext *unsignedNumber();
    StringContext *string();
    ConstantIdentifierContext *constantIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnsignedConstantContext* unsignedConstant();

  class  FunctionDesignatorContext : public antlr4::ParserRuleContext {
  public:
    FunctionDesignatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FunctionIdentifierContext *functionIdentifier();
    antlr4::tree::TerminalNode *LPAREN();
    std::vector<ActualParameterContext *> actualParameter();
    ActualParameterContext* actualParameter(size_t i);
    antlr4::tree::TerminalNode *RPAREN();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionDesignatorContext* functionDesignator();

  class  FunctionIdentifierContext : public antlr4::ParserRuleContext {
  public:
    FunctionIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FunctionIdentifierContext* functionIdentifier();

  class  SetContext : public antlr4::ParserRuleContext {
  public:
    SetContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LBRACKET();
    ElementListContext *elementList();
    antlr4::tree::TerminalNode *RBRACKET();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SetContext* set();

  class  ElementListContext : public antlr4::ParserRuleContext {
  public:
    ElementListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ElementContext *> element();
    ElementContext* element(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);
    EmptyContext *empty();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementListContext* elementList();

  class  ElementContext : public antlr4::ParserRuleContext {
  public:
    ElementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *DOT_DOT();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementContext* element();

  class  ProcedureStatementContext : public antlr4::ParserRuleContext {
  public:
    ProcedureStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ProcedureIdentifierContext *procedureIdentifier();
    antlr4::tree::TerminalNode *LPAREN();
    std::vector<ActualParameterContext *> actualParameter();
    ActualParameterContext* actualParameter(size_t i);
    antlr4::tree::TerminalNode *RPAREN();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProcedureStatementContext* procedureStatement();

  class  ProcedureIdentifierContext : public antlr4::ParserRuleContext {
  public:
    ProcedureIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProcedureIdentifierContext* procedureIdentifier();

  class  ActualParameterContext : public antlr4::ParserRuleContext {
  public:
    ActualParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    VariableContext *variable();
    ProcedureIdentifierContext *procedureIdentifier();
    FunctionIdentifierContext *functionIdentifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ActualParameterContext* actualParameter();

  class  GoToStatementContext : public antlr4::ParserRuleContext {
  public:
    GoToStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *GOTO();
    LabelContext *label();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GoToStatementContext* goToStatement();

  class  EmptyStatementContext : public antlr4::ParserRuleContext {
  public:
    EmptyStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EmptyContext *empty();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EmptyStatementContext* emptyStatement();

  class  EmptyContext : public antlr4::ParserRuleContext {
  public:
    EmptyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EmptyContext* empty();

  class  StructuredStatementContext : public antlr4::ParserRuleContext {
  public:
    StructuredStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CompoundStatementContext *compoundStatement();
    ConditionalStatementContext *conditionalStatement();
    RepetitiveStatementContext *repetitiveStatement();
    WithStatementContext *withStatement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StructuredStatementContext* structuredStatement();

  class  CompoundStatementContext : public antlr4::ParserRuleContext {
  public:
    CompoundStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BEGIN();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);
    antlr4::tree::TerminalNode *END();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CompoundStatementContext* compoundStatement();

  class  ConditionalStatementContext : public antlr4::ParserRuleContext {
  public:
    ConditionalStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IfStatementContext *ifStatement();
    CaseStatementContext *caseStatement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalStatementContext* conditionalStatement();

  class  IfStatementContext : public antlr4::ParserRuleContext {
  public:
    IfStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IF();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *THEN();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);
    antlr4::tree::TerminalNode *ELSE();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfStatementContext* ifStatement();

  class  CaseStatementContext : public antlr4::ParserRuleContext {
  public:
    CaseStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CASE();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *OF();
    std::vector<CaseListElementContext *> caseListElement();
    CaseListElementContext* caseListElement(size_t i);
    antlr4::tree::TerminalNode *END();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CaseStatementContext* caseStatement();

  class  CaseListElementContext : public antlr4::ParserRuleContext {
  public:
    CaseListElementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CaseLabelListContext *caseLabelList();
    antlr4::tree::TerminalNode *COLON();
    StatementContext *statement();
    EmptyContext *empty();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CaseListElementContext* caseListElement();

  class  CaseLabelListContext : public antlr4::ParserRuleContext {
  public:
    CaseLabelListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<CaseLabelContext *> caseLabel();
    CaseLabelContext* caseLabel(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CaseLabelListContext* caseLabelList();

  class  RepetitiveStatementContext : public antlr4::ParserRuleContext {
  public:
    RepetitiveStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    WhileStatementContext *whileStatement();
    RepeatStatementContext *repeatStatement();
    ForStatementContext *forStatement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RepetitiveStatementContext* repetitiveStatement();

  class  WhileStatementContext : public antlr4::ParserRuleContext {
  public:
    WhileStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WHILE();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *DO();
    StatementContext *statement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WhileStatementContext* whileStatement();

  class  RepeatStatementContext : public antlr4::ParserRuleContext {
  public:
    RepeatStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *REPEAT();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);
    antlr4::tree::TerminalNode *UNTIL();
    ExpressionContext *expression();
    std::vector<antlr4::tree::TerminalNode *> SEMICOLON();
    antlr4::tree::TerminalNode* SEMICOLON(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RepeatStatementContext* repeatStatement();

  class  ForStatementContext : public antlr4::ParserRuleContext {
  public:
    ForStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FOR();
    ControlVariableContext *controlVariable();
    antlr4::tree::TerminalNode *ASSIGN();
    ForListContext *forList();
    antlr4::tree::TerminalNode *DO();
    StatementContext *statement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForStatementContext* forStatement();

  class  ControlVariableContext : public antlr4::ParserRuleContext {
  public:
    ControlVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IdentifierContext *identifier();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ControlVariableContext* controlVariable();

  class  ForListContext : public antlr4::ParserRuleContext {
  public:
    ForListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InitialValueContext *initialValue();
    antlr4::tree::TerminalNode *TO();
    FinalValueContext *finalValue();
    antlr4::tree::TerminalNode *DOWNTO();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForListContext* forList();

  class  InitialValueContext : public antlr4::ParserRuleContext {
  public:
    InitialValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InitialValueContext* initialValue();

  class  FinalValueContext : public antlr4::ParserRuleContext {
  public:
    FinalValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FinalValueContext* finalValue();

  class  WithStatementContext : public antlr4::ParserRuleContext {
  public:
    WithStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WITH();
    RecordVariableListContext *recordVariableList();
    antlr4::tree::TerminalNode *DO();
    StatementContext *statement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WithStatementContext* withStatement();

  class  RecordVariableListContext : public antlr4::ParserRuleContext {
  public:
    RecordVariableListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<RecordVariableContext *> recordVariable();
    RecordVariableContext* recordVariable(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecordVariableListContext* recordVariableList();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool simpleExpressionSempred(SimpleExpressionContext *_localctx, size_t predicateIndex);
  bool termSempred(TermContext *_localctx, size_t predicateIndex);

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
  SymtabStack *symtabStack = nullptr;

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

