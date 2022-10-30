
// Generated from Pascal.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "PascalVisitor.h"


/**
 * This class provides an empty implementation of PascalVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  PascalBaseVisitor : public PascalVisitor {
public:

  virtual antlrcpp::Any visitProgram(PascalParser::ProgramContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProgramHeading(PascalParser::ProgramHeadingContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifierList(PascalParser::IdentifierListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlock(PascalParser::BlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLabelDeclarationPart(PascalParser::LabelDeclarationPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLabel(PascalParser::LabelContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstantDefinitionPart(PascalParser::ConstantDefinitionPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstantDefinition(PascalParser::ConstantDefinitionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstant(PascalParser::ConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUnsignedNumber(PascalParser::UnsignedNumberContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUnsignedInteger(PascalParser::UnsignedIntegerContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUnsignedReal(PascalParser::UnsignedRealContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitScaleFactor(PascalParser::ScaleFactorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSign(PascalParser::SignContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstantIdentifier(PascalParser::ConstantIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitString(PascalParser::StringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTypeDefinitionPart(PascalParser::TypeDefinitionPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTypeDefinition(PascalParser::TypeDefinitionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType(PascalParser::TypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSimpleType(PascalParser::SimpleTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitScalarType(PascalParser::ScalarTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSubrangeType(PascalParser::SubrangeTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTypeIdentifier(PascalParser::TypeIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStructuredType(PascalParser::StructuredTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayType(PascalParser::ArrayTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIndexType(PascalParser::IndexTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitComponentType(PascalParser::ComponentTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRecordType(PascalParser::RecordTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFieldList(PascalParser::FieldListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFixedPart(PascalParser::FixedPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRecordSection(PascalParser::RecordSectionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariantType(PascalParser::VariantTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTagField(PascalParser::TagFieldContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariant(PascalParser::VariantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCaseLabel(PascalParser::CaseLabelContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSetType(PascalParser::SetTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBaseType(PascalParser::BaseTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFileType(PascalParser::FileTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitPointerType(PascalParser::PointerTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableDeclarationPart(PascalParser::VariableDeclarationPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableDeclaration(PascalParser::VariableDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProcedureAndFunctionDeclarationPart(PascalParser::ProcedureAndFunctionDeclarationPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProcedureOrFunctionDeclaration(PascalParser::ProcedureOrFunctionDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProcedureDeclaration(PascalParser::ProcedureDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProcedureHeading(PascalParser::ProcedureHeadingContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFormalParameterSection(PascalParser::FormalParameterSectionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitParameterGroup(PascalParser::ParameterGroupContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionDeclaration(PascalParser::FunctionDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionHeading(PascalParser::FunctionHeadingContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitResultType(PascalParser::ResultTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStatementPart(PascalParser::StatementPartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStatement(PascalParser::StatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUnlabelledStatement(PascalParser::UnlabelledStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSimpleStatement(PascalParser::SimpleStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAssignmentStatement(PascalParser::AssignmentStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariable(PascalParser::VariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEntireVariable(PascalParser::EntireVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableIdentifier(PascalParser::VariableIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitComponentVariable(PascalParser::ComponentVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIndexedVariable(PascalParser::IndexedVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayVariable(PascalParser::ArrayVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFieldDesignator(PascalParser::FieldDesignatorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRecordVariable(PascalParser::RecordVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFieldIdentifier(PascalParser::FieldIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFileBuffer(PascalParser::FileBufferContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFileVariable(PascalParser::FileVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReferencedVariable(PascalParser::ReferencedVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitPointerVariable(PascalParser::PointerVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExpression(PascalParser::ExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRelationalOperator(PascalParser::RelationalOperatorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSimpleExpression(PascalParser::SimpleExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAddingOperator(PascalParser::AddingOperatorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTerm(PascalParser::TermContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMultiplyingOperator(PascalParser::MultiplyingOperatorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFactor(PascalParser::FactorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUnsignedConstant(PascalParser::UnsignedConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionDesignator(PascalParser::FunctionDesignatorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionIdentifier(PascalParser::FunctionIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSet(PascalParser::SetContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElementList(PascalParser::ElementListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElement(PascalParser::ElementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProcedureStatement(PascalParser::ProcedureStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProcedureIdentifier(PascalParser::ProcedureIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitActualParameter(PascalParser::ActualParameterContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGoToStatement(PascalParser::GoToStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEmptyStatement(PascalParser::EmptyStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEmpty(PascalParser::EmptyContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStructuredStatement(PascalParser::StructuredStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCompoundStatement(PascalParser::CompoundStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalStatement(PascalParser::ConditionalStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIfStatement(PascalParser::IfStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCaseStatement(PascalParser::CaseStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCaseListElement(PascalParser::CaseListElementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCaseLabelList(PascalParser::CaseLabelListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRepetitiveStatement(PascalParser::RepetitiveStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitWhileStatement(PascalParser::WhileStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRepeatStatement(PascalParser::RepeatStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitForStatement(PascalParser::ForStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitControlVariable(PascalParser::ControlVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitForList(PascalParser::ForListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitInitialValue(PascalParser::InitialValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFinalValue(PascalParser::FinalValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitWithStatement(PascalParser::WithStatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRecordVariableList(PascalParser::RecordVariableListContext *ctx) override {
    return visitChildren(ctx);
  }


};

