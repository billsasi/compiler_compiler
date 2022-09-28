
// Generated from Pascal.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "PascalParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by PascalParser.
 */
class  PascalVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by PascalParser.
   */
    virtual antlrcpp::Any visitIdentifier(PascalParser::IdentifierContext *context) = 0;


};

