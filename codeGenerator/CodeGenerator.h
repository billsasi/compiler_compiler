#pragma once

#include <iostream>
#include <fstream>
#include "antlr4-runtime.h"
#include "../ant4/PascalBaseVisitor.h"
#include <stack>
#include <map>

using namespace std;

class CodeGenerator : public PascalBaseVisitor {
public:
  CodeGenerator() {
    file = std::ofstream("output.asm");
    nestingLevel = 0;
  }

  void emitInitFrame() {
    file << "LDX stackindex" << endl;
    file << "STB stack, x" << endl;
    file << "ADD #6" << endl;
    file << "ADD stackindex" << endl;
    file << "COMP stackmax" << endl;
    file << "JGT ENDPROGRAM" << endl;
    file << "STA stackindex" << endl;
  }

  antlrcpp::Any visitProgram(PascalParser::ProgramContext *ctx) {
    file << "output START 0" << std::endl;
    file << "stack RESB 10000\n"; // stack
    file <<"stackindex WORD 0\n"; //; index into stack
    file <<"stackmax WORD 10000\n"; //; maximum stack index
    file <<"display RESB 100\n"; //; run time display
    file <<"displayindex WORD 0\n"; //; index into display
    file <<"displaymax WORD 100\n"; //; maximum display index
    file <<"returnvalue RESB 500\n"; //; space for function return value [HACK]
    file <<"returnmax WORD 500\n"; //; maximum size of return value
    nestingLevel++;
    std::map<std::string, int> offsetMap;
    int offset = 0;
    
    //0 - return
    //1 - scope
    //2 - index to prev frame
    //3 - locals

    visitProgramHeading(ctx->programHeading());
    auto entries = curSymtab->sortedEntries();
    for (auto entry : entries) {
      string name = entry->getName();
      string type = entry->getType()->getIdentifier()->getName();
      offsetMap[name] = offset;
      if (type == "integer") {
        offset += 3;
      } else if (type == "real") {
        offset += 6;
      } else if (type == "boolean") {
        offset += 1;
      } else if (type == "char") {
        offset += 1;
      }
    }

    file << "STA " << offset << endl;
    file << "STB 1" << endl;
    emitInitFrame();

    visitBlock(ctx->block());
    
    return nullptr;
  }

  antlrcpp::Any visitProgramHeading(PascalParser::ProgramHeadingContext *ctx) {
    curSymtab = ctx->identifier()->entry->getRoutineSymtab();
    return visitChildren(ctx);
  }


private:
  ofstream file;
  int nestingLevel;
  Symtab *curSymtab;
  // std::stack<std::map<std::string, int>> offsetStack;

};