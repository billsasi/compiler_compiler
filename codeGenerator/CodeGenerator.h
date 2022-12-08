#pragma once

#include <iostream>
#include <fstream>
#include "antlr4-runtime.h"
#include "../ant4/PascalBaseVisitor.h"
#include <stack>
#include <map>
#include <iomanip>
#include "../intermediate/symtab/Predefined.h"

using namespace std;

class CodeGenerator : public PascalBaseVisitor {
public:
  CodeGenerator(SymtabEntry *programId) {
    string name = "output.asm";
    if (programId != nullptr) {
      name = programId->getName() += ".asm";
    } else {
      exit(1);
    }
    cout << "Generating code to " << name << endl;
    file = std::ofstream(name);
    nestingLevel = 0;
    address = 0;
    labelCount = 0;
  }

  int emit(string label, string inst) {
    file << setw(20) << left << label << " " << inst << endl;
    //cout << setw(20) << left << label << " " << inst << endl;
    return address++;
  }

  int emit(string inst) {
    file << setw(20) << left << "" << " " << inst << endl;
    //cout << setw(20) << left << "" << " " << inst << endl;
    return address++;
  }

  void emitData(string label, string inst) {
    file << setw(20) << left << label << " " << inst << endl;
    //cout << setw(20) << left << label << " " << inst << endl;
  }

  void emitPrint() {
    emit("outdev",	"BYTE	5");
    emit("pstr",	"LDCH	0, X	");
	  emit("COMP	#0"	);
	  emit("JGT	pstr1");
	  emit("RSUB"		);
    emit("pstr1",	"TD	outdev	");
	  emit("JEQ	pstr1"	);
	  emit("WD	outdev"	);
	  emit("TIX ");
	  emit("J	pstr"	);
  }

  // A contains scope
  // returns framestart at X
  void emitFindStackFrame() {
    emit("findStackFrame", "LDX framestart" );
    emit("findStackFrameloop","LDT #3" );
    emit("ADDR T, X" );
    emit("COMP stack, X");
    emit("JEQ findStackFramedone");
    emit("ADDR T, X" );
    emit("LDX stack, X" );
    emit("J findStackFrameloop");
    emit("findStackFramedone", "SUBR T, X");
    emit("RSUB");
  }

  void emitInitFrame() {
    emit("initFrame", "LDX stackindex" );
    emit("", "LDS framestart" );
    emit("", "STX framestart" );
    emit("", "LDT #3" );
    emit("", "ADDR T, X" );
    emit("", "STB stack, X" );       // Store scope
    emit("", "ADDR T, X" );
    emit("", "STS stack, X" );       // Store previous framestart
    emit("", "ADDR T, X" );
    emit("", "ADDR A, X" );
    emit("", "STX stackindex" );
    emit("", "RSUB" );
  }

  void emitFreeFrame() {
    emit("freeFrame", "LDA framestart" );
    emit("", "STA stackindex" );
    emit("", "ADD #6" );
    emit("", "RMO A, X" );
    emit("", "LDA stack, X" );
    emit("", "STA framestart" );       
    emit("", "RSUB" );
  }

  void emitMemory() {
    emitData("stack", "RESB 10000"); // stack
    emitData("stackindex","WORD 0"); //; index into stack
    emitData("evalstack", "RESB 1000"); // stack
    emitData("evalstackindex","WORD 0"); //; index into stack
    emitData("framestart","WORD 0"); //; index into stack
    emitData("stackmax","WORD 10000"); //; maximum stack index
    emitData("display","RESB 100"); //; run time display
    emitData("displayindex","WORD 0"); //; index into display
    emitData("displaymax","WORD 100"); //; maximum display index
    emitData("returnvalue","RESB 500"); //; space for function return value [HACK]
    emitData("returnmax","WORD 500"); //; maximum size of return value
    emitData("temp","WORD 0"); //; temp var
  }

  int setFrameOffsets(Symtab *symtab) {
    int offset = 9; // 3 bytes for return address, 3 for scope, 3 for previous framestart
    auto entries = symtab->sortedEntries();
    for (auto entry : entries) {
      Typespec *type = entry->getType();
      entry->setFrameOffset(offset);
      if (type == Predefined::integerType) {
        offset += 3;
      } else if (type == Predefined::realType) {
        offset += 6;
      } else if (type == Predefined::charType) {
        offset += 1;
      } else if (type == Predefined::booleanType) {
        offset += 1;
      }
    }
    return offset - 9;
  }

  string getLabel() {
    return "L" + to_string(labelCount++);
  }

  antlrcpp::Any visitProgram(PascalParser::ProgramContext *ctx);
  antlrcpp::Any visitProgramHeading(PascalParser::ProgramHeadingContext *ctx);
  antlrcpp::Any visitAssignmentStatement(PascalParser::AssignmentStatementContext *ctx);
  antlrcpp::Any visitSimpleExpression(PascalParser::SimpleExpressionContext *ctx);
  antlrcpp::Any visitExpression(PascalParser::ExpressionContext *ctx);
  antlrcpp::Any visitTerm(PascalParser::TermContext *ctx);
  antlrcpp::Any visitSignedFactor(PascalParser::SignedFactorContext *ctx);
  antlrcpp::Any visitVariable(PascalParser::VariableContext *ctx);
  antlrcpp::Any visitFactor(PascalParser::FactorContext *ctx);
  antlrcpp::Any visitIfStatement(PascalParser::IfStatementContext *ctx);
  antlrcpp::Any visitForStatement(PascalParser::ForStatementContext *ctx);
  antlrcpp::Any visitWhileStatement(PascalParser::WhileStatementContext *ctx);
  antlrcpp::Any visitBlock(PascalParser::BlockContext *ctx);

private:
  ofstream file;
  int nestingLevel;
  int address;
  Symtab *curSymtab;
  int topOfStackBytes; // used to store the size of the last value pushed onto the stack 
  int labelCount;
  string currentLabel;

};