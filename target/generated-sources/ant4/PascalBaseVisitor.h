
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

  virtual antlrcpp::Any visitIdentifier(PascalParser::IdentifierContext *ctx) override {
    return visitChildren(ctx);
  }


};

