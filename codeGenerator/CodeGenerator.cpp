
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
    

    emit("STA temp"); // to prevent assembler errors related to labels
    emit("endprogram", "END " + name);
    emitMemory();

    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitProgramHeading(PascalParser::ProgramHeadingContext *ctx) {
    return ctx->identifier()->entry->getRoutineSymtab();
  }

  antlrcpp::Any CodeGenerator::visitVariable(PascalParser::VariableContext *ctx) {
    auto node = ctx->identifier(0);
    string name = node->getText();
    SymtabEntry *entry = node->entry;
    Typespec *type = entry->getType();
    if (type == nullptr)
      return nullptr;
    Symtab *tab = entry->getSymtab();
    if (tab == nullptr) 
      return nullptr;
    int nestingLevel = tab->getNestingLevel();
    int offset = entry->getFrameOffset();
    emit("LDA #" + to_string(nestingLevel));
    emit("JSUB findStackFrame");
    emit("ADD #" + to_string(offset));
    emit("CLEAR X");
    emit("ADDR A, X");

    string typeName = type->getIdentifier()->getName();
    string tmp = typeName;
    topOfStackBytes = 1;

    if (tmp == "integer") {
      emit("STB #3");
      topOfStackBytes = 3;
    } else if (tmp == "real") {
      emit("STB #6");
      topOfStackBytes = 6;
    } else if (tmp == "boolean") {
      emit("STB #1");
    } else {
      emit("STB #1");
    }

    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitAssignmentStatement(PascalParser::AssignmentStatementContext *ctx) {
    auto node = ctx->variable()->identifier(0);
    auto lhsEntry = node->entry;
    if (lhsEntry == nullptr) {
      return nullptr;
    }
    int lhsScope = lhsEntry->getSymtab()->getNestingLevel();
    int lhsOffset = lhsEntry->getFrameOffset();
    // emit("LDA #" + to_string(lhsScope));
    // emit("JSUB findStackFrame");
    // emit("ADD #" + to_string(lhsOffset));
    // emit("CLEAR X");
    // emit("ADDR A, X");

    // we now expect visit expression to emit code to place the value in A
    visitExpression(ctx->expression());

    //emit("STA stack, X");
    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitFactor(PascalParser::FactorContext *ctx) {
    string val = ctx->getText();
    int stackIncrement = 0;

    if (ctx->expression()) { // in this case, don't push anything on the stack, just return
      visitExpression(ctx->expression());
      return nullptr;
    }

    if (ctx->bool_()) {
      val = (val == "true") ? "1" : "0";
      stackIncrement = 1;
    } else if (ctx->unsignedConstant()) {
      stackIncrement = 3;
    } else if (ctx->variable()) {
      stackIncrement = 3;
      visitVariable(ctx->variable()); // after this, the location of the variable is in X, size will be in B
      emit("LDA stack, X");
      emit("LDX stackindex");
      emit("STA stack, X");
      emit("LDA stackindex");
      emit("ADD #" + to_string(stackIncrement));
      emit("STA stackindex");
      topOfStackBytes = stackIncrement;
      return ctx;
    }
    
    emit("LDX stackindex");
    if (ctx->bool_())
      emit("LDCH #" + val);
    else
      emit("LDA #" + val);
    emit("STA stack, X");
    emit("LDA stackindex");
    emit("ADD #" + to_string(stackIncrement));
    emit("STA stackindex");
    topOfStackBytes = stackIncrement;
    return ctx;
  }

  antlrcpp::Any CodeGenerator::visitSimpleExpression(PascalParser::SimpleExpressionContext *ctx) {
    visitTerm(ctx->term());
    int mode = 0;
    int lhsBytes = topOfStackBytes;
    if (!ctx->additiveoperator()) {
      return nullptr;
    }
    if (ctx->additiveoperator()->PLUS()) {
      mode = 1;
    } else if (ctx->additiveoperator()->MINUS()) {
      mode = 2;
    }
    
    visitSimpleExpression(ctx->simpleExpression());
    int rhsBytes = topOfStackBytes;
    topOfStackBytes = 3; // assume it's an integer
    emit("LDA stackindex");
    emit("SUB #" + to_string(rhsBytes));
    emit("RMO A, X");
    emit("LDT stack, X");
    emit("RMO X, A");
    emit("STX stackindex"); // pop operand off the stack
    emit("SUB #" + to_string(lhsBytes));
    emit("RMO A, X");
    emit("LDS stack, X");
    switch (mode) {
      case 1:
        emit("ADDR T, S");
        break;
      case 2:
        emit("SUBR T, S");
        break;
      default:
        break;
    }
    emit("STS stack, X");

    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitExpression(PascalParser::ExpressionContext *ctx) {
    visitSimpleExpression(ctx->simpleExpression());
    int mode = 0;
    int lhsBytes = topOfStackBytes;
    if (!ctx->relationaloperator()) {
      return nullptr;
    }
    
    if (ctx->relationaloperator()->EQUAL()) {
      mode = 1;
    } else if (ctx->relationaloperator()->NOT_EQUAL()) {
      mode = 2;
    } else if (ctx->relationaloperator()->LT()) {
      mode = 3;
    } else if (ctx->relationaloperator()->LE()) {
      mode = 4;
    } else if (ctx->relationaloperator()->GE()) {
      mode = 5;
    } else if (ctx->relationaloperator()->GT()) {
      mode = 6;
    } 
    
    visitExpression(ctx->expression());
    int rhsBytes = topOfStackBytes;
    emit("LDA stackindex");
    emit("SUB #" + to_string(rhsBytes));
    emit("RMO A, X");
    if (rhsBytes == 1) {
      emit("LDCH stack, X");
      emit("RMO A, T");
    } else
      emit("LDT stack, X");
    emit("RMO X, A");
    emit("SUB #" + to_string(lhsBytes));
    emit("RMO A, X");
    if (lhsBytes == 1) {
      emit("LDCH stack, X");
      emit("RMO A, S");
    } else
      emit("LDS stack, X");
    string trueLabel = getLabel();
    string endLabel = getLabel();
    emit("COMPR T, S");
    switch (mode) {
      case 1: // =
        emit("JEQ " + trueLabel);
        emit("LDA #0");
        emit("J " + endLabel);
        emit(trueLabel, "LDA #1");
        break;
      case 2: // <>
        emit("JGT " + trueLabel);
        emit("JLT " + trueLabel);
        emit("LDA #0");
        emit("J " + endLabel);
        emit(trueLabel, "LDA #1");
        break;
      case 3: // <
        emit("JLT " + trueLabel);
        emit("LDA #0");
        emit("J " + endLabel);
        emit(trueLabel, "LDA #1");
        break;
      case 4: // <=        
        emit("JLT " + trueLabel);
        emit("JEQ " + trueLabel);
        emit("LDA #0");
        emit("J " + endLabel);
        emit(trueLabel, "LDA #1");
        break;
      case 5: // >=        
        emit("JGT " + trueLabel);
        emit("JEQ " + trueLabel);
        emit("LDA #0");
        emit("J " + endLabel);
        emit(trueLabel, "LDA #1");
        break;
      case 6: // >      
        emit("JGT " + trueLabel);
        emit("LDA #0");
        emit("J " + endLabel);
        emit(trueLabel, "LDA #1");
        break;
      default:
        break;
    }
    emit(endLabel, "STCH stack, X");
    emit("STX stackindex");
    topOfStackBytes = 1;

    return nullptr;
  }

  antlrcpp::Any CodeGenerator::visitSignedFactor(PascalParser::SignedFactorContext *ctx) {
    if (ctx->MINUS()) {
      emit("LDA stackindex");
      emit("SUB #" + to_string(topOfStackBytes));
      emit("RMO A, X");
      emit("CLEAR A");
      emit("SUB stack, X");
      emit("STA stack, X");
    }
    return visitChildren(ctx);
  }

  antlrcpp::Any CodeGenerator::visitTerm(PascalParser::TermContext *ctx) {
    visitSignedFactor(ctx->signedFactor());
    int mode = 0;
    int lhsBytes = topOfStackBytes;
    if (!ctx->multiplicativeoperator()) {
      return nullptr;
    }
    if (ctx->multiplicativeoperator()->STAR()) {
      mode = 1;
    } else if (ctx->multiplicativeoperator()->SLASH()) {
      mode = 2;
    }
    // else if (ctx->multiplicativeoperator()->DIV()) {
    //   mode = 3;
    // } else if (ctx->multiplicativeoperator()->MOD()) {
    //   mode = 4;
    // } else if (ctx->multiplicativeoperator()->AND()) {
    //   mode = 5;
    // }
    visitTerm(ctx->term());
    int rhsBytes = topOfStackBytes;
    topOfStackBytes = 3; // assume it's an integer
    emit("LDA stackindex");
    emit("SUB #" + to_string(rhsBytes));
    emit("RMO A, X");
    emit("LDT stack, X");
    emit("RMO X, A");
    emit("STX stackindex"); // pop operand off the stack
    emit("SUB #" + to_string(lhsBytes));
    emit("RMO A, X");
    emit("LDS stack, X");
    switch (mode) {
      case 1:
        emit("MULR T, S");
        break;
      case 2:
        emit("DIVR T, S");
        break;
      default:
        break;
    }
    emit("STS stack, X");

    return nullptr;
  }

antlrcpp::Any CodeGenerator::visitIfStatement(PascalParser::IfStatementContext *ctx) {
  visitExpression(ctx->expression());
  int bytes = topOfStackBytes;
  string falseLabel = getLabel();
  string endLabel = getLabel();
  emit("LDA stackindex");
  emit("SUB #" + to_string(bytes));
  emit("RMO A, X");
  if (bytes == 1)
    emit("LDCH stack, X");
  else if (bytes == 3)
    emit("LDA stack, X");
  else
    emit("LDA stack, X");
  emit("STX stackindex"); // pop expression off the stack
  emit("CLEAR S");
  emit("COMPR A, S");
  emit("JEQ " + falseLabel);
  if (ctx->statement().size() > 0) {
    visitStatement(ctx->statement()[0]);
  }
  emit("J " + endLabel);
  emit(falseLabel, "");
  if (ctx->statement().size() > 1) {
    visitStatement(ctx->statement()[1]);
  }
  emit(endLabel, "");
  return nullptr;
}

antlrcpp::Any CodeGenerator::visitForStatement(PascalParser::ForStatementContext *ctx) {
  return visitChildren(ctx);
}

antlrcpp::Any CodeGenerator::visitWhileStatement(PascalParser::WhileStatementContext *ctx) {
  return visitChildren(ctx);
}