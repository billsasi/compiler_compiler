
#include "CodeGenerator.h"

antlrcpp::Any CodeGenerator::visitProgram(PascalParser::ProgramContext *ctx) {
    string name = ctx->programHeading()->identifier()->getText();
    emitData(name, "START 0" );
    emit("", "J main" );
    emitInitFrame();
    emitFindStackFrame();
    //emitPrint();
    
    nestingLevel++;

    Symtab *progTable = visitProgramHeading(ctx->programHeading());
    int numBytes = setFrameOffsets(progTable);

    emit("main", "LDA #" + to_string(numBytes) );
    emit("", "LDB #1" );
    emit("", "JSUB initFrame" );

    visitBlock(ctx->block());
    

    emit("endprogram", "END " + name);
    emitMemory();

    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitProgramHeading(PascalParser::ProgramHeadingContext *ctx) {
    return ctx->identifier()->entry->getRoutineSymtab();
  }

  antlrcpp::Any CodeGenerator::visitAssignmentStatement(PascalParser::AssignmentStatementContext *ctx) {
    auto node = ctx->variable()->identifier(0);
    auto lhsEntry = node->entry;
    if (lhsEntry == nullptr) {
      return nullptr;
    }
    int lhsScope = lhsEntry->getSymtab()->getNestingLevel();
    int lhsOffset = lhsEntry->getFrameOffset();
    emit("LDA #" + to_string(lhsScope));
    emit("JSUB findStackFrame");
    emit("ADD #" + to_string(lhsOffset));
    emit("CLEAR X");
    emit("ADDR A, X");

    // we now expect visit expression to emit code to place the value in A
    visitExpression(ctx->expression());

    emit("STA stack, X");
    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitFactor(PascalParser::FactorContext *ctx) {
    if (ctx->bool_()) {
      string val = ctx->getText();
      if (val == "true") {
        emit("LDA #1");
      } else {
        emit("LDA #0");
      }
    } else if (ctx->unsignedConstant()) {
      if (ctx->unsignedConstant()->unsignedNumber()) {
        emit("LDA #" + ctx->unsignedConstant()->unsignedNumber()->getText());
      } 
    }
    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitSimpleExpression(PascalParser::SimpleExpressionContext *ctx) {
    // if (ctx->additiveoperator()) {
      
    // }
    return visitChildren(ctx);
  }

  antlrcpp::Any CodeGenerator::visitIfStatement(PascalParser::IfStatementContext *ctx) {
    return visitChildren(ctx);
  }

  antlrcpp::Any visitSimpleExpression(PascalParser::SimpleExpressionContext *ctx) {
    return visitChildren(ctx);
  }