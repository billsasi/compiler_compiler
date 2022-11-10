
// Generated from Pascal.g4 by ANTLR 4.7.2


#include "PascalVisitor.h"

#include "PascalParser.h"

#include "intermediate/symtab/SymtabEntry.h"
#include "intermediate/symtab/SymtabStack.h"
#include "intermediate/symtab/Predefined.h"
#include "intermediate/type/Typespec.h"

using namespace antlrcpp;
using namespace antlr4;
using namespace intermediate::symtab;

PascalParser::PascalParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
  symtabStack = new SymtabStack();
  Predefined::initialize(symtabStack);
}

PascalParser::~PascalParser() {
  delete _interpreter;
}

std::string PascalParser::getGrammarFileName() const {
  return "Pascal.g4";
}

const std::vector<std::string>& PascalParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& PascalParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgramContext ------------------------------------------------------------------

PascalParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ProgramHeadingContext* PascalParser::ProgramContext::programHeading() {
  return getRuleContext<PascalParser::ProgramHeadingContext>(0);
}

PascalParser::BlockContext* PascalParser::ProgramContext::block() {
  return getRuleContext<PascalParser::BlockContext>(0);
}

tree::TerminalNode* PascalParser::ProgramContext::DOT() {
  return getToken(PascalParser::DOT, 0);
}

tree::TerminalNode* PascalParser::ProgramContext::EOF() {
  return getToken(PascalParser::EOF, 0);
}

tree::TerminalNode* PascalParser::ProgramContext::INTERFACE() {
  return getToken(PascalParser::INTERFACE, 0);
}


size_t PascalParser::ProgramContext::getRuleIndex() const {
  return PascalParser::RuleProgram;
}


antlrcpp::Any PascalParser::ProgramContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProgram(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProgramContext* PascalParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 0, PascalParser::RuleProgram);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(196);
    programHeading();
    setState(198);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::INTERFACE) {
      setState(197);
      match(PascalParser::INTERFACE);
    }
    setState(200);
    block();
    setState(201);
    match(PascalParser::DOT);
    setState(202);
    match(PascalParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProgramHeadingContext ------------------------------------------------------------------

PascalParser::ProgramHeadingContext::ProgramHeadingContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ProgramHeadingContext::PROGRAM() {
  return getToken(PascalParser::PROGRAM, 0);
}

PascalParser::IdentifierContext* PascalParser::ProgramHeadingContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ProgramHeadingContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}

tree::TerminalNode* PascalParser::ProgramHeadingContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

PascalParser::IdentifierListContext* PascalParser::ProgramHeadingContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::ProgramHeadingContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

tree::TerminalNode* PascalParser::ProgramHeadingContext::UNIT() {
  return getToken(PascalParser::UNIT, 0);
}


size_t PascalParser::ProgramHeadingContext::getRuleIndex() const {
  return PascalParser::RuleProgramHeading;
}


antlrcpp::Any PascalParser::ProgramHeadingContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProgramHeading(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProgramHeadingContext* PascalParser::programHeading() {
  ProgramHeadingContext *_localctx = _tracker.createInstance<ProgramHeadingContext>(_ctx, getState());
  enterRule(_localctx, 2, PascalParser::RuleProgramHeading);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(218);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::PROGRAM: {
        enterOuterAlt(_localctx, 1);
        setState(204);
        match(PascalParser::PROGRAM);
        setState(205);
        IdentifierContext* node = identifier();
        std::string programName = node->getText();
        SymtabEntry *entry = symtabStack->enterLocal(programName, Kind::PROGRAM);
        node->entry = entry;
        symtabStack->setProgramId(entry);
        setState(210);
        _errHandler->sync(this);

        symtabStack->push(); // move from global scope to level 1 (program scope)

        _la = _input->LA(1);
        if (_la == PascalParser::LPAREN) {
          setState(206);
          match(PascalParser::LPAREN);
          setState(207);
          identifierList();
          setState(208);
          match(PascalParser::RPAREN);
        }
        setState(212);
        match(PascalParser::SEMI);
        break;
      }

      case PascalParser::UNIT: {
        enterOuterAlt(_localctx, 2);
        setState(214);
        match(PascalParser::UNIT);
        setState(215);
        identifier();
        setState(216);
        match(PascalParser::SEMI);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierContext ------------------------------------------------------------------

PascalParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::IdentifierContext::IDENT() {
  return getToken(PascalParser::IDENT, 0);
}


size_t PascalParser::IdentifierContext::getRuleIndex() const {
  return PascalParser::RuleIdentifier;
}


antlrcpp::Any PascalParser::IdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::IdentifierContext* PascalParser::identifier() {
  IdentifierContext *_localctx = _tracker.createInstance<IdentifierContext>(_ctx, getState());
  enterRule(_localctx, 4, PascalParser::RuleIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(220);
    match(PascalParser::IDENT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

PascalParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::CompoundStatementContext* PascalParser::BlockContext::compoundStatement() {
  return getRuleContext<PascalParser::CompoundStatementContext>(0);
}

std::vector<PascalParser::LabelDeclarationPartContext *> PascalParser::BlockContext::labelDeclarationPart() {
  return getRuleContexts<PascalParser::LabelDeclarationPartContext>();
}

PascalParser::LabelDeclarationPartContext* PascalParser::BlockContext::labelDeclarationPart(size_t i) {
  return getRuleContext<PascalParser::LabelDeclarationPartContext>(i);
}

std::vector<PascalParser::ConstantDefinitionPartContext *> PascalParser::BlockContext::constantDefinitionPart() {
  return getRuleContexts<PascalParser::ConstantDefinitionPartContext>();
}

PascalParser::ConstantDefinitionPartContext* PascalParser::BlockContext::constantDefinitionPart(size_t i) {
  return getRuleContext<PascalParser::ConstantDefinitionPartContext>(i);
}

std::vector<PascalParser::TypeDefinitionPartContext *> PascalParser::BlockContext::typeDefinitionPart() {
  return getRuleContexts<PascalParser::TypeDefinitionPartContext>();
}

PascalParser::TypeDefinitionPartContext* PascalParser::BlockContext::typeDefinitionPart(size_t i) {
  return getRuleContext<PascalParser::TypeDefinitionPartContext>(i);
}

std::vector<PascalParser::VariableDeclarationPartContext *> PascalParser::BlockContext::variableDeclarationPart() {
  return getRuleContexts<PascalParser::VariableDeclarationPartContext>();
}

PascalParser::VariableDeclarationPartContext* PascalParser::BlockContext::variableDeclarationPart(size_t i) {
  return getRuleContext<PascalParser::VariableDeclarationPartContext>(i);
}

std::vector<PascalParser::ProcedureAndFunctionDeclarationPartContext *> PascalParser::BlockContext::procedureAndFunctionDeclarationPart() {
  return getRuleContexts<PascalParser::ProcedureAndFunctionDeclarationPartContext>();
}

PascalParser::ProcedureAndFunctionDeclarationPartContext* PascalParser::BlockContext::procedureAndFunctionDeclarationPart(size_t i) {
  return getRuleContext<PascalParser::ProcedureAndFunctionDeclarationPartContext>(i);
}

std::vector<PascalParser::UsesUnitsPartContext *> PascalParser::BlockContext::usesUnitsPart() {
  return getRuleContexts<PascalParser::UsesUnitsPartContext>();
}

PascalParser::UsesUnitsPartContext* PascalParser::BlockContext::usesUnitsPart(size_t i) {
  return getRuleContext<PascalParser::UsesUnitsPartContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::BlockContext::IMPLEMENTATION() {
  return getTokens(PascalParser::IMPLEMENTATION);
}

tree::TerminalNode* PascalParser::BlockContext::IMPLEMENTATION(size_t i) {
  return getToken(PascalParser::IMPLEMENTATION, i);
}


size_t PascalParser::BlockContext::getRuleIndex() const {
  return PascalParser::RuleBlock;
}


antlrcpp::Any PascalParser::BlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitBlock(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::BlockContext* PascalParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 6, PascalParser::RuleBlock);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(231);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::CONST)
      | (1ULL << PascalParser::FUNCTION)
      | (1ULL << PascalParser::IMPLEMENTATION)
      | (1ULL << PascalParser::LABEL)
      | (1ULL << PascalParser::PROCEDURE)
      | (1ULL << PascalParser::TYPE)
      | (1ULL << PascalParser::USES)
      | (1ULL << PascalParser::VAR))) != 0)) {
      setState(229);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case PascalParser::LABEL: {
          setState(222);
          labelDeclarationPart();
          break;
        }

        case PascalParser::CONST: {
          setState(223);
          constantDefinitionPart();
          break;
        }

        case PascalParser::TYPE: {
          setState(224);
          typeDefinitionPart();
          break;
        }

        case PascalParser::VAR: {
          setState(225);
          variableDeclarationPart();
          break;
        }

        case PascalParser::FUNCTION:
        case PascalParser::PROCEDURE: {
          setState(226);
          procedureAndFunctionDeclarationPart();
          break;
        }

        case PascalParser::USES: {
          setState(227);
          usesUnitsPart();
          break;
        }

        case PascalParser::IMPLEMENTATION: {
          setState(228);
          match(PascalParser::IMPLEMENTATION);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(233);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(234);
    compoundStatement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UsesUnitsPartContext ------------------------------------------------------------------

PascalParser::UsesUnitsPartContext::UsesUnitsPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::UsesUnitsPartContext::USES() {
  return getToken(PascalParser::USES, 0);
}

PascalParser::IdentifierListContext* PascalParser::UsesUnitsPartContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::UsesUnitsPartContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}


size_t PascalParser::UsesUnitsPartContext::getRuleIndex() const {
  return PascalParser::RuleUsesUnitsPart;
}


antlrcpp::Any PascalParser::UsesUnitsPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUsesUnitsPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UsesUnitsPartContext* PascalParser::usesUnitsPart() {
  UsesUnitsPartContext *_localctx = _tracker.createInstance<UsesUnitsPartContext>(_ctx, getState());
  enterRule(_localctx, 8, PascalParser::RuleUsesUnitsPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(236);
    match(PascalParser::USES);
    setState(237);
    identifierList();
    setState(238);
    match(PascalParser::SEMI);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LabelDeclarationPartContext ------------------------------------------------------------------

PascalParser::LabelDeclarationPartContext::LabelDeclarationPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::LabelDeclarationPartContext::LABEL() {
  return getToken(PascalParser::LABEL, 0);
}

std::vector<PascalParser::LabelContext *> PascalParser::LabelDeclarationPartContext::label() {
  return getRuleContexts<PascalParser::LabelContext>();
}

PascalParser::LabelContext* PascalParser::LabelDeclarationPartContext::label(size_t i) {
  return getRuleContext<PascalParser::LabelContext>(i);
}

tree::TerminalNode* PascalParser::LabelDeclarationPartContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}

std::vector<tree::TerminalNode *> PascalParser::LabelDeclarationPartContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::LabelDeclarationPartContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::LabelDeclarationPartContext::getRuleIndex() const {
  return PascalParser::RuleLabelDeclarationPart;
}


antlrcpp::Any PascalParser::LabelDeclarationPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitLabelDeclarationPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::LabelDeclarationPartContext* PascalParser::labelDeclarationPart() {
  LabelDeclarationPartContext *_localctx = _tracker.createInstance<LabelDeclarationPartContext>(_ctx, getState());
  enterRule(_localctx, 10, PascalParser::RuleLabelDeclarationPart);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(240);
    match(PascalParser::LABEL);
    setState(241);
    label();
    setState(246);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(242);
      match(PascalParser::COMMA);
      setState(243);
      label();
      setState(248);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(249);
    match(PascalParser::SEMI);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LabelContext ------------------------------------------------------------------

PascalParser::LabelContext::LabelContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::UnsignedIntegerContext* PascalParser::LabelContext::unsignedInteger() {
  return getRuleContext<PascalParser::UnsignedIntegerContext>(0);
}


size_t PascalParser::LabelContext::getRuleIndex() const {
  return PascalParser::RuleLabel;
}


antlrcpp::Any PascalParser::LabelContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitLabel(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::LabelContext* PascalParser::label() {
  LabelContext *_localctx = _tracker.createInstance<LabelContext>(_ctx, getState());
  enterRule(_localctx, 12, PascalParser::RuleLabel);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(251);
    unsignedInteger();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstantDefinitionPartContext ------------------------------------------------------------------

PascalParser::ConstantDefinitionPartContext::ConstantDefinitionPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ConstantDefinitionPartContext::CONST() {
  return getToken(PascalParser::CONST, 0);
}

std::vector<PascalParser::ConstantDefinitionContext *> PascalParser::ConstantDefinitionPartContext::constantDefinition() {
  return getRuleContexts<PascalParser::ConstantDefinitionContext>();
}

PascalParser::ConstantDefinitionContext* PascalParser::ConstantDefinitionPartContext::constantDefinition(size_t i) {
  return getRuleContext<PascalParser::ConstantDefinitionContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::ConstantDefinitionPartContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::ConstantDefinitionPartContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::ConstantDefinitionPartContext::getRuleIndex() const {
  return PascalParser::RuleConstantDefinitionPart;
}


antlrcpp::Any PascalParser::ConstantDefinitionPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConstantDefinitionPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConstantDefinitionPartContext* PascalParser::constantDefinitionPart() {
  ConstantDefinitionPartContext *_localctx = _tracker.createInstance<ConstantDefinitionPartContext>(_ctx, getState());
  enterRule(_localctx, 14, PascalParser::RuleConstantDefinitionPart);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(253);
    match(PascalParser::CONST);
    setState(257); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(254);
      constantDefinition();
      setState(255);
      match(PascalParser::SEMI);
      setState(259); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == PascalParser::IDENT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstantDefinitionContext ------------------------------------------------------------------

PascalParser::ConstantDefinitionContext::ConstantDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::ConstantDefinitionContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ConstantDefinitionContext::EQUAL() {
  return getToken(PascalParser::EQUAL, 0);
}

PascalParser::ConstantContext* PascalParser::ConstantDefinitionContext::constant() {
  return getRuleContext<PascalParser::ConstantContext>(0);
}


size_t PascalParser::ConstantDefinitionContext::getRuleIndex() const {
  return PascalParser::RuleConstantDefinition;
}


antlrcpp::Any PascalParser::ConstantDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConstantDefinition(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConstantDefinitionContext* PascalParser::constantDefinition() {
  ConstantDefinitionContext *_localctx = _tracker.createInstance<ConstantDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 16, PascalParser::RuleConstantDefinition);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(261);
    auto node = identifier();
    std::string name = node->getText();
    SymtabEntry *entry = symtabStack->enterLocal(name, Kind::CONSTANT);
    node->entry = entry;
    setState(262);
    match(PascalParser::EQUAL);
    setState(263);
    constant();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstantChrContext ------------------------------------------------------------------

PascalParser::ConstantChrContext::ConstantChrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ConstantChrContext::CHR() {
  return getToken(PascalParser::CHR, 0);
}

tree::TerminalNode* PascalParser::ConstantChrContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

PascalParser::UnsignedIntegerContext* PascalParser::ConstantChrContext::unsignedInteger() {
  return getRuleContext<PascalParser::UnsignedIntegerContext>(0);
}

tree::TerminalNode* PascalParser::ConstantChrContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}


size_t PascalParser::ConstantChrContext::getRuleIndex() const {
  return PascalParser::RuleConstantChr;
}


antlrcpp::Any PascalParser::ConstantChrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConstantChr(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConstantChrContext* PascalParser::constantChr() {
  ConstantChrContext *_localctx = _tracker.createInstance<ConstantChrContext>(_ctx, getState());
  enterRule(_localctx, 18, PascalParser::RuleConstantChr);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(265);
    match(PascalParser::CHR);
    setState(266);
    match(PascalParser::LPAREN);
    setState(267);
    unsignedInteger();
    setState(268);
    match(PascalParser::RPAREN);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstantContext ------------------------------------------------------------------

PascalParser::ConstantContext::ConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::UnsignedNumberContext* PascalParser::ConstantContext::unsignedNumber() {
  return getRuleContext<PascalParser::UnsignedNumberContext>(0);
}

PascalParser::SignContext* PascalParser::ConstantContext::sign() {
  return getRuleContext<PascalParser::SignContext>(0);
}

PascalParser::IdentifierContext* PascalParser::ConstantContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

PascalParser::StringContext* PascalParser::ConstantContext::string() {
  return getRuleContext<PascalParser::StringContext>(0);
}

PascalParser::ConstantChrContext* PascalParser::ConstantContext::constantChr() {
  return getRuleContext<PascalParser::ConstantChrContext>(0);
}


size_t PascalParser::ConstantContext::getRuleIndex() const {
  return PascalParser::RuleConstant;
}


antlrcpp::Any PascalParser::ConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConstant(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConstantContext* PascalParser::constant() {
  ConstantContext *_localctx = _tracker.createInstance<ConstantContext>(_ctx, getState());
  enterRule(_localctx, 20, PascalParser::RuleConstant);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(280);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(270);
      unsignedNumber();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(271);
      sign();
      setState(272);
      unsignedNumber();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(274);
      identifier();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(275);
      sign();
      setState(276);
      identifier();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(278);
      string();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(279);
      constantChr();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnsignedNumberContext ------------------------------------------------------------------

PascalParser::UnsignedNumberContext::UnsignedNumberContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::UnsignedIntegerContext* PascalParser::UnsignedNumberContext::unsignedInteger() {
  return getRuleContext<PascalParser::UnsignedIntegerContext>(0);
}

PascalParser::UnsignedRealContext* PascalParser::UnsignedNumberContext::unsignedReal() {
  return getRuleContext<PascalParser::UnsignedRealContext>(0);
}


size_t PascalParser::UnsignedNumberContext::getRuleIndex() const {
  return PascalParser::RuleUnsignedNumber;
}


antlrcpp::Any PascalParser::UnsignedNumberContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUnsignedNumber(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UnsignedNumberContext* PascalParser::unsignedNumber() {
  UnsignedNumberContext *_localctx = _tracker.createInstance<UnsignedNumberContext>(_ctx, getState());
  enterRule(_localctx, 22, PascalParser::RuleUnsignedNumber);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(284);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::NUM_INT: {
        enterOuterAlt(_localctx, 1);
        setState(282);
        unsignedInteger();
        break;
      }

      case PascalParser::NUM_REAL: {
        enterOuterAlt(_localctx, 2);
        setState(283);
        unsignedReal();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnsignedIntegerContext ------------------------------------------------------------------

PascalParser::UnsignedIntegerContext::UnsignedIntegerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::UnsignedIntegerContext::NUM_INT() {
  return getToken(PascalParser::NUM_INT, 0);
}


size_t PascalParser::UnsignedIntegerContext::getRuleIndex() const {
  return PascalParser::RuleUnsignedInteger;
}


antlrcpp::Any PascalParser::UnsignedIntegerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUnsignedInteger(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UnsignedIntegerContext* PascalParser::unsignedInteger() {
  UnsignedIntegerContext *_localctx = _tracker.createInstance<UnsignedIntegerContext>(_ctx, getState());
  enterRule(_localctx, 24, PascalParser::RuleUnsignedInteger);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(286);
    match(PascalParser::NUM_INT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnsignedRealContext ------------------------------------------------------------------

PascalParser::UnsignedRealContext::UnsignedRealContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::UnsignedRealContext::NUM_REAL() {
  return getToken(PascalParser::NUM_REAL, 0);
}


size_t PascalParser::UnsignedRealContext::getRuleIndex() const {
  return PascalParser::RuleUnsignedReal;
}


antlrcpp::Any PascalParser::UnsignedRealContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUnsignedReal(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UnsignedRealContext* PascalParser::unsignedReal() {
  UnsignedRealContext *_localctx = _tracker.createInstance<UnsignedRealContext>(_ctx, getState());
  enterRule(_localctx, 26, PascalParser::RuleUnsignedReal);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(288);
    match(PascalParser::NUM_REAL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SignContext ------------------------------------------------------------------

PascalParser::SignContext::SignContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::SignContext::PLUS() {
  return getToken(PascalParser::PLUS, 0);
}

tree::TerminalNode* PascalParser::SignContext::MINUS() {
  return getToken(PascalParser::MINUS, 0);
}


size_t PascalParser::SignContext::getRuleIndex() const {
  return PascalParser::RuleSign;
}


antlrcpp::Any PascalParser::SignContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSign(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SignContext* PascalParser::sign() {
  SignContext *_localctx = _tracker.createInstance<SignContext>(_ctx, getState());
  enterRule(_localctx, 28, PascalParser::RuleSign);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(290);
    _la = _input->LA(1);
    if (!(_la == PascalParser::PLUS

    || _la == PascalParser::MINUS)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Bool_Context ------------------------------------------------------------------

PascalParser::Bool_Context::Bool_Context(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::Bool_Context::TRUE() {
  return getToken(PascalParser::TRUE, 0);
}

tree::TerminalNode* PascalParser::Bool_Context::FALSE() {
  return getToken(PascalParser::FALSE, 0);
}


size_t PascalParser::Bool_Context::getRuleIndex() const {
  return PascalParser::RuleBool_;
}


antlrcpp::Any PascalParser::Bool_Context::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitBool_(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::Bool_Context* PascalParser::bool_() {
  Bool_Context *_localctx = _tracker.createInstance<Bool_Context>(_ctx, getState());
  enterRule(_localctx, 30, PascalParser::RuleBool_);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(292);
    _la = _input->LA(1);
    if (!(_la == PascalParser::FALSE

    || _la == PascalParser::TRUE)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StringContext ------------------------------------------------------------------

PascalParser::StringContext::StringContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::StringContext::STRING_LITERAL() {
  return getToken(PascalParser::STRING_LITERAL, 0);
}


size_t PascalParser::StringContext::getRuleIndex() const {
  return PascalParser::RuleString;
}


antlrcpp::Any PascalParser::StringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitString(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StringContext* PascalParser::string() {
  StringContext *_localctx = _tracker.createInstance<StringContext>(_ctx, getState());
  enterRule(_localctx, 32, PascalParser::RuleString);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(294);
    match(PascalParser::STRING_LITERAL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeDefinitionPartContext ------------------------------------------------------------------

PascalParser::TypeDefinitionPartContext::TypeDefinitionPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::TypeDefinitionPartContext::TYPE() {
  return getToken(PascalParser::TYPE, 0);
}

std::vector<PascalParser::TypeDefinitionContext *> PascalParser::TypeDefinitionPartContext::typeDefinition() {
  return getRuleContexts<PascalParser::TypeDefinitionContext>();
}

PascalParser::TypeDefinitionContext* PascalParser::TypeDefinitionPartContext::typeDefinition(size_t i) {
  return getRuleContext<PascalParser::TypeDefinitionContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::TypeDefinitionPartContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::TypeDefinitionPartContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::TypeDefinitionPartContext::getRuleIndex() const {
  return PascalParser::RuleTypeDefinitionPart;
}


antlrcpp::Any PascalParser::TypeDefinitionPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTypeDefinitionPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TypeDefinitionPartContext* PascalParser::typeDefinitionPart() {
  TypeDefinitionPartContext *_localctx = _tracker.createInstance<TypeDefinitionPartContext>(_ctx, getState());
  enterRule(_localctx, 34, PascalParser::RuleTypeDefinitionPart);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(296);
    match(PascalParser::TYPE);
    setState(300); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(297);
      typeDefinition();
      setState(298);
      match(PascalParser::SEMI);
      setState(302); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == PascalParser::IDENT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeDefinitionContext ------------------------------------------------------------------

PascalParser::TypeDefinitionContext::TypeDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::TypeDefinitionContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::TypeDefinitionContext::EQUAL() {
  return getToken(PascalParser::EQUAL, 0);
}

PascalParser::Type_Context* PascalParser::TypeDefinitionContext::type_() {
  return getRuleContext<PascalParser::Type_Context>(0);
}

PascalParser::FunctionTypeContext* PascalParser::TypeDefinitionContext::functionType() {
  return getRuleContext<PascalParser::FunctionTypeContext>(0);
}

PascalParser::ProcedureTypeContext* PascalParser::TypeDefinitionContext::procedureType() {
  return getRuleContext<PascalParser::ProcedureTypeContext>(0);
}


size_t PascalParser::TypeDefinitionContext::getRuleIndex() const {
  return PascalParser::RuleTypeDefinition;
}


antlrcpp::Any PascalParser::TypeDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTypeDefinition(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TypeDefinitionContext* PascalParser::typeDefinition() {
  TypeDefinitionContext *_localctx = _tracker.createInstance<TypeDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 36, PascalParser::RuleTypeDefinition);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(304);
    auto id = identifier();
    auto entry = symtabStack->enterLocal(id->getText(), Kind::TYPE);
    setState(305);
    match(PascalParser::EQUAL);
    setState(309);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::ARRAY:
      case PascalParser::FILE:
      case PascalParser::PACKED:
      case PascalParser::RECORD:
      case PascalParser::SET:
      case PascalParser::STRING:
      case PascalParser::CHR:
      case PascalParser::CHAR:
      case PascalParser::BOOLEAN:
      case PascalParser::INTEGER:
      case PascalParser::REAL:
      case PascalParser::PLUS:
      case PascalParser::MINUS:
      case PascalParser::LPAREN:
      case PascalParser::POINTER:
      case PascalParser::IDENT:
      case PascalParser::STRING_LITERAL:
      case PascalParser::NUM_INT:
      case PascalParser::NUM_REAL: {
        setState(306);
        auto typenode = type_();
        if (typenode->simpleType() != nullptr) {
          Typespec *typespec = symtabStack->lookup(typenode->getText())->getType();
          entry->setType(typespec);
          typespec->setIdentifier(entry);
        }
        auto array = typenode->structuredType()->unpackedStructuredType()->arrayType();
        if (array) {
          Typespec *typespec = array->type;
          entry->setType(typespec);
          typespec->setIdentifier(entry);
        }
        break;
      }

      case PascalParser::FUNCTION: {
        setState(307);
        functionType();
        break;
      }

      case PascalParser::PROCEDURE: {
        setState(308);
        procedureType();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionTypeContext ------------------------------------------------------------------

PascalParser::FunctionTypeContext::FunctionTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::FunctionTypeContext::FUNCTION() {
  return getToken(PascalParser::FUNCTION, 0);
}

tree::TerminalNode* PascalParser::FunctionTypeContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::ResultTypeContext* PascalParser::FunctionTypeContext::resultType() {
  return getRuleContext<PascalParser::ResultTypeContext>(0);
}

PascalParser::FormalParameterListContext* PascalParser::FunctionTypeContext::formalParameterList() {
  return getRuleContext<PascalParser::FormalParameterListContext>(0);
}


size_t PascalParser::FunctionTypeContext::getRuleIndex() const {
  return PascalParser::RuleFunctionType;
}


antlrcpp::Any PascalParser::FunctionTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFunctionType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FunctionTypeContext* PascalParser::functionType() {
  FunctionTypeContext *_localctx = _tracker.createInstance<FunctionTypeContext>(_ctx, getState());
  enterRule(_localctx, 38, PascalParser::RuleFunctionType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(311);
    match(PascalParser::FUNCTION);
    setState(313);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(312);
      formalParameterList();
    }
    setState(315);
    match(PascalParser::COLON);
    setState(316);
    resultType();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProcedureTypeContext ------------------------------------------------------------------

PascalParser::ProcedureTypeContext::ProcedureTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ProcedureTypeContext::PROCEDURE() {
  return getToken(PascalParser::PROCEDURE, 0);
}

PascalParser::FormalParameterListContext* PascalParser::ProcedureTypeContext::formalParameterList() {
  return getRuleContext<PascalParser::FormalParameterListContext>(0);
}


size_t PascalParser::ProcedureTypeContext::getRuleIndex() const {
  return PascalParser::RuleProcedureType;
}


antlrcpp::Any PascalParser::ProcedureTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureTypeContext* PascalParser::procedureType() {
  ProcedureTypeContext *_localctx = _tracker.createInstance<ProcedureTypeContext>(_ctx, getState());
  enterRule(_localctx, 40, PascalParser::RuleProcedureType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(318);
    match(PascalParser::PROCEDURE);
    setState(320);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(319);
      formalParameterList();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Type_Context ------------------------------------------------------------------

PascalParser::Type_Context::Type_Context(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SimpleTypeContext* PascalParser::Type_Context::simpleType() {
  return getRuleContext<PascalParser::SimpleTypeContext>(0);
}

PascalParser::StructuredTypeContext* PascalParser::Type_Context::structuredType() {
  return getRuleContext<PascalParser::StructuredTypeContext>(0);
}

PascalParser::PointerTypeContext* PascalParser::Type_Context::pointerType() {
  return getRuleContext<PascalParser::PointerTypeContext>(0);
}


size_t PascalParser::Type_Context::getRuleIndex() const {
  return PascalParser::RuleType_;
}


antlrcpp::Any PascalParser::Type_Context::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitType_(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::Type_Context* PascalParser::type_() {
  Type_Context *_localctx = _tracker.createInstance<Type_Context>(_ctx, getState());
  enterRule(_localctx, 42, PascalParser::RuleType_);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(325);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::STRING:
      case PascalParser::CHR:
      case PascalParser::CHAR:
      case PascalParser::BOOLEAN:
      case PascalParser::INTEGER:
      case PascalParser::REAL:
      case PascalParser::PLUS:
      case PascalParser::MINUS:
      case PascalParser::LPAREN:
      case PascalParser::IDENT:
      case PascalParser::STRING_LITERAL:
      case PascalParser::NUM_INT:
      case PascalParser::NUM_REAL: {
        enterOuterAlt(_localctx, 1);
        setState(322);
        simpleType();
        break;
      }

      case PascalParser::ARRAY:
      case PascalParser::FILE:
      case PascalParser::PACKED:
      case PascalParser::RECORD:
      case PascalParser::SET: {
        enterOuterAlt(_localctx, 2);
        setState(323);
        structuredType();
        break;
      }

      case PascalParser::POINTER: {
        enterOuterAlt(_localctx, 3);
        setState(324);
        pointerType();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SimpleTypeContext ------------------------------------------------------------------

PascalParser::SimpleTypeContext::SimpleTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ScalarTypeContext* PascalParser::SimpleTypeContext::scalarType() {
  return getRuleContext<PascalParser::ScalarTypeContext>(0);
}

PascalParser::SubrangeTypeContext* PascalParser::SimpleTypeContext::subrangeType() {
  return getRuleContext<PascalParser::SubrangeTypeContext>(0);
}

PascalParser::TypeIdentifierContext* PascalParser::SimpleTypeContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}

PascalParser::StringtypeContext* PascalParser::SimpleTypeContext::stringtype() {
  return getRuleContext<PascalParser::StringtypeContext>(0);
}


size_t PascalParser::SimpleTypeContext::getRuleIndex() const {
  return PascalParser::RuleSimpleType;
}


antlrcpp::Any PascalParser::SimpleTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSimpleType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SimpleTypeContext* PascalParser::simpleType() {
  SimpleTypeContext *_localctx = _tracker.createInstance<SimpleTypeContext>(_ctx, getState());
  enterRule(_localctx, 44, PascalParser::RuleSimpleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(331);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(327);
      scalarType();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(328);
      subrangeType();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(329);
      typeIdentifier();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(330);
      stringtype();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ScalarTypeContext ------------------------------------------------------------------

PascalParser::ScalarTypeContext::ScalarTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ScalarTypeContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

PascalParser::IdentifierListContext* PascalParser::ScalarTypeContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::ScalarTypeContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}


size_t PascalParser::ScalarTypeContext::getRuleIndex() const {
  return PascalParser::RuleScalarType;
}


antlrcpp::Any PascalParser::ScalarTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitScalarType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ScalarTypeContext* PascalParser::scalarType() {
  ScalarTypeContext *_localctx = _tracker.createInstance<ScalarTypeContext>(_ctx, getState());
  enterRule(_localctx, 46, PascalParser::RuleScalarType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(333);
    match(PascalParser::LPAREN);
    setState(334);
    identifierList();
    setState(335);
    match(PascalParser::RPAREN);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SubrangeTypeContext ------------------------------------------------------------------

PascalParser::SubrangeTypeContext::SubrangeTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::ConstantContext *> PascalParser::SubrangeTypeContext::constant() {
  return getRuleContexts<PascalParser::ConstantContext>();
}

PascalParser::ConstantContext* PascalParser::SubrangeTypeContext::constant(size_t i) {
  return getRuleContext<PascalParser::ConstantContext>(i);
}

tree::TerminalNode* PascalParser::SubrangeTypeContext::DOTDOT() {
  return getToken(PascalParser::DOTDOT, 0);
}


size_t PascalParser::SubrangeTypeContext::getRuleIndex() const {
  return PascalParser::RuleSubrangeType;
}


antlrcpp::Any PascalParser::SubrangeTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSubrangeType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SubrangeTypeContext* PascalParser::subrangeType() {
  SubrangeTypeContext *_localctx = _tracker.createInstance<SubrangeTypeContext>(_ctx, getState());
  enterRule(_localctx, 48, PascalParser::RuleSubrangeType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(337);
    constant();
    setState(338);
    match(PascalParser::DOTDOT);
    setState(339);
    constant();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeIdentifierContext ------------------------------------------------------------------

PascalParser::TypeIdentifierContext::TypeIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::TypeIdentifierContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::TypeIdentifierContext::CHAR() {
  return getToken(PascalParser::CHAR, 0);
}

tree::TerminalNode* PascalParser::TypeIdentifierContext::BOOLEAN() {
  return getToken(PascalParser::BOOLEAN, 0);
}

tree::TerminalNode* PascalParser::TypeIdentifierContext::INTEGER() {
  return getToken(PascalParser::INTEGER, 0);
}

tree::TerminalNode* PascalParser::TypeIdentifierContext::REAL() {
  return getToken(PascalParser::REAL, 0);
}

tree::TerminalNode* PascalParser::TypeIdentifierContext::STRING() {
  return getToken(PascalParser::STRING, 0);
}


size_t PascalParser::TypeIdentifierContext::getRuleIndex() const {
  return PascalParser::RuleTypeIdentifier;
}


antlrcpp::Any PascalParser::TypeIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTypeIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TypeIdentifierContext* PascalParser::typeIdentifier() {
  TypeIdentifierContext *_localctx = _tracker.createInstance<TypeIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 50, PascalParser::RuleTypeIdentifier);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(343);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IDENT: {
        enterOuterAlt(_localctx, 1);
        setState(341);
        identifier();
        break;
      }

      case PascalParser::STRING:
      case PascalParser::CHAR:
      case PascalParser::BOOLEAN:
      case PascalParser::INTEGER:
      case PascalParser::REAL: {
        enterOuterAlt(_localctx, 2);
        setState(342);
        _la = _input->LA(1);
        if (!((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << PascalParser::STRING)
          | (1ULL << PascalParser::CHAR)
          | (1ULL << PascalParser::BOOLEAN)
          | (1ULL << PascalParser::INTEGER)
          | (1ULL << PascalParser::REAL))) != 0))) {
        _errHandler->recoverInline(this);
        }
        else {
          _errHandler->reportMatch(this);
          consume();
        }
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StructuredTypeContext ------------------------------------------------------------------

PascalParser::StructuredTypeContext::StructuredTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::StructuredTypeContext::PACKED() {
  return getToken(PascalParser::PACKED, 0);
}

PascalParser::UnpackedStructuredTypeContext* PascalParser::StructuredTypeContext::unpackedStructuredType() {
  return getRuleContext<PascalParser::UnpackedStructuredTypeContext>(0);
}


size_t PascalParser::StructuredTypeContext::getRuleIndex() const {
  return PascalParser::RuleStructuredType;
}


antlrcpp::Any PascalParser::StructuredTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitStructuredType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StructuredTypeContext* PascalParser::structuredType() {
  StructuredTypeContext *_localctx = _tracker.createInstance<StructuredTypeContext>(_ctx, getState());
  enterRule(_localctx, 52, PascalParser::RuleStructuredType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(348);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::PACKED: {
        enterOuterAlt(_localctx, 1);
        setState(345);
        match(PascalParser::PACKED);
        setState(346);
        unpackedStructuredType();
        break;
      }

      case PascalParser::ARRAY:
      case PascalParser::FILE:
      case PascalParser::RECORD:
      case PascalParser::SET: {
        enterOuterAlt(_localctx, 2);
        setState(347);
        unpackedStructuredType();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnpackedStructuredTypeContext ------------------------------------------------------------------

PascalParser::UnpackedStructuredTypeContext::UnpackedStructuredTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ArrayTypeContext* PascalParser::UnpackedStructuredTypeContext::arrayType() {
  return getRuleContext<PascalParser::ArrayTypeContext>(0);
}

PascalParser::RecordTypeContext* PascalParser::UnpackedStructuredTypeContext::recordType() {
  return getRuleContext<PascalParser::RecordTypeContext>(0);
}

PascalParser::SetTypeContext* PascalParser::UnpackedStructuredTypeContext::setType() {
  return getRuleContext<PascalParser::SetTypeContext>(0);
}

PascalParser::FileTypeContext* PascalParser::UnpackedStructuredTypeContext::fileType() {
  return getRuleContext<PascalParser::FileTypeContext>(0);
}


size_t PascalParser::UnpackedStructuredTypeContext::getRuleIndex() const {
  return PascalParser::RuleUnpackedStructuredType;
}


antlrcpp::Any PascalParser::UnpackedStructuredTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUnpackedStructuredType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UnpackedStructuredTypeContext* PascalParser::unpackedStructuredType() {
  UnpackedStructuredTypeContext *_localctx = _tracker.createInstance<UnpackedStructuredTypeContext>(_ctx, getState());
  enterRule(_localctx, 54, PascalParser::RuleUnpackedStructuredType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(354);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::ARRAY: {
        enterOuterAlt(_localctx, 1);
        setState(350);
        arrayType();
        break;
      }

      case PascalParser::RECORD: {
        enterOuterAlt(_localctx, 2);
        setState(351);
        recordType();
        break;
      }

      case PascalParser::SET: {
        enterOuterAlt(_localctx, 3);
        setState(352);
        setType();
        break;
      }

      case PascalParser::FILE: {
        enterOuterAlt(_localctx, 4);
        setState(353);
        fileType();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StringtypeContext ------------------------------------------------------------------

PascalParser::StringtypeContext::StringtypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::StringtypeContext::STRING() {
  return getToken(PascalParser::STRING, 0);
}

tree::TerminalNode* PascalParser::StringtypeContext::LBRACK() {
  return getToken(PascalParser::LBRACK, 0);
}

tree::TerminalNode* PascalParser::StringtypeContext::RBRACK() {
  return getToken(PascalParser::RBRACK, 0);
}

PascalParser::IdentifierContext* PascalParser::StringtypeContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

PascalParser::UnsignedNumberContext* PascalParser::StringtypeContext::unsignedNumber() {
  return getRuleContext<PascalParser::UnsignedNumberContext>(0);
}


size_t PascalParser::StringtypeContext::getRuleIndex() const {
  return PascalParser::RuleStringtype;
}


antlrcpp::Any PascalParser::StringtypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitStringtype(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StringtypeContext* PascalParser::stringtype() {
  StringtypeContext *_localctx = _tracker.createInstance<StringtypeContext>(_ctx, getState());
  enterRule(_localctx, 56, PascalParser::RuleStringtype);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(356);
    match(PascalParser::STRING);
    setState(357);
    match(PascalParser::LBRACK);
    setState(360);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IDENT: {
        setState(358);
        identifier();
        break;
      }

      case PascalParser::NUM_INT:
      case PascalParser::NUM_REAL: {
        setState(359);
        unsignedNumber();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(362);
    match(PascalParser::RBRACK);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayTypeContext ------------------------------------------------------------------

PascalParser::ArrayTypeContext::ArrayTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ArrayTypeContext::ARRAY() {
  return getToken(PascalParser::ARRAY, 0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::LBRACK() {
  return getToken(PascalParser::LBRACK, 0);
}

PascalParser::TypeListContext* PascalParser::ArrayTypeContext::typeList() {
  return getRuleContext<PascalParser::TypeListContext>(0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::RBRACK() {
  return getToken(PascalParser::RBRACK, 0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::OF() {
  return getToken(PascalParser::OF, 0);
}

PascalParser::ComponentTypeContext* PascalParser::ArrayTypeContext::componentType() {
  return getRuleContext<PascalParser::ComponentTypeContext>(0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::LBRACK2() {
  return getToken(PascalParser::LBRACK2, 0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::RBRACK2() {
  return getToken(PascalParser::RBRACK2, 0);
}


size_t PascalParser::ArrayTypeContext::getRuleIndex() const {
  return PascalParser::RuleArrayType;
}


antlrcpp::Any PascalParser::ArrayTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitArrayType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ArrayTypeContext* PascalParser::arrayType() {
  ArrayTypeContext *_localctx = _tracker.createInstance<ArrayTypeContext>(_ctx, getState());
  enterRule(_localctx, 58, PascalParser::RuleArrayType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(378);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(364);
      match(PascalParser::ARRAY);
      setState(365);
      match(PascalParser::LBRACK);
      setState(366);

      std::vector<IndexTypeContext *> indexTypes = typeList()->indexType();
      
      Typespec *cur = new Typespec(Form::ARRAY);
      _localctx->type = cur;
      for (auto indexType : indexTypes) {
        std::string txt = indexType->getText();
        SymtabEntry *indexEntry = symtabStack->lookup(txt);
        cur->setArrayIndexType(indexEntry->getType());
        cur->setArrayElementCount(calculateElementCount(txt));
        Typespec *next = new Typespec(Form::ARRAY);
        if (indexType == indexTypes.back()) {
          break;
        }
        cur->setArrayElementType(next);
        cur = next;
      }
  
      setState(367);
      match(PascalParser::RBRACK);
      setState(368);
      match(PascalParser::OF);
      setState(369);
      auto compType = componentType();
      SymtabEntry *compEntry = symtabStack->lookup(compType->getText());
      if (compEntry != nullptr) {
        cur->setArrayElementType(compEntry->getType());
      } else {
        cur->setArrayElementType(compType->type_()->structuredType()->unpackedStructuredType()->arrayType()->type);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(371);
      match(PascalParser::ARRAY);
      setState(372);
      match(PascalParser::LBRACK2);
      setState(373);
      typeList();
      setState(374);
      match(PascalParser::RBRACK2);
      setState(375);
      match(PascalParser::OF);
      setState(376);
      componentType();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeListContext ------------------------------------------------------------------

PascalParser::TypeListContext::TypeListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::IndexTypeContext *> PascalParser::TypeListContext::indexType() {
  return getRuleContexts<PascalParser::IndexTypeContext>();
}

PascalParser::IndexTypeContext* PascalParser::TypeListContext::indexType(size_t i) {
  return getRuleContext<PascalParser::IndexTypeContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::TypeListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::TypeListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::TypeListContext::getRuleIndex() const {
  return PascalParser::RuleTypeList;
}


antlrcpp::Any PascalParser::TypeListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTypeList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TypeListContext* PascalParser::typeList() {
  TypeListContext *_localctx = _tracker.createInstance<TypeListContext>(_ctx, getState());
  enterRule(_localctx, 60, PascalParser::RuleTypeList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(380);
    indexType();
    setState(385);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(381);
      match(PascalParser::COMMA);
      setState(382);
      indexType();
      setState(387);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndexTypeContext ------------------------------------------------------------------

PascalParser::IndexTypeContext::IndexTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SimpleTypeContext* PascalParser::IndexTypeContext::simpleType() {
  return getRuleContext<PascalParser::SimpleTypeContext>(0);
}


size_t PascalParser::IndexTypeContext::getRuleIndex() const {
  return PascalParser::RuleIndexType;
}


antlrcpp::Any PascalParser::IndexTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitIndexType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::IndexTypeContext* PascalParser::indexType() {
  IndexTypeContext *_localctx = _tracker.createInstance<IndexTypeContext>(_ctx, getState());
  enterRule(_localctx, 62, PascalParser::RuleIndexType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(388);
    simpleType();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ComponentTypeContext ------------------------------------------------------------------

PascalParser::ComponentTypeContext::ComponentTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::Type_Context* PascalParser::ComponentTypeContext::type_() {
  return getRuleContext<PascalParser::Type_Context>(0);
}


size_t PascalParser::ComponentTypeContext::getRuleIndex() const {
  return PascalParser::RuleComponentType;
}


antlrcpp::Any PascalParser::ComponentTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitComponentType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ComponentTypeContext* PascalParser::componentType() {
  ComponentTypeContext *_localctx = _tracker.createInstance<ComponentTypeContext>(_ctx, getState());
  enterRule(_localctx, 64, PascalParser::RuleComponentType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(390);
    type_();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RecordTypeContext ------------------------------------------------------------------

PascalParser::RecordTypeContext::RecordTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::RecordTypeContext::RECORD() {
  return getToken(PascalParser::RECORD, 0);
}

PascalParser::FieldListContext* PascalParser::RecordTypeContext::fieldList() {
  return getRuleContext<PascalParser::FieldListContext>(0);
}

tree::TerminalNode* PascalParser::RecordTypeContext::END() {
  return getToken(PascalParser::END, 0);
}


size_t PascalParser::RecordTypeContext::getRuleIndex() const {
  return PascalParser::RuleRecordType;
}


antlrcpp::Any PascalParser::RecordTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRecordType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RecordTypeContext* PascalParser::recordType() {
  RecordTypeContext *_localctx = _tracker.createInstance<RecordTypeContext>(_ctx, getState());
  enterRule(_localctx, 66, PascalParser::RuleRecordType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(392);
    match(PascalParser::RECORD);
    setState(393);
    fieldList();
    setState(394);
    match(PascalParser::END);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldListContext ------------------------------------------------------------------

PascalParser::FieldListContext::FieldListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::FixedPartContext* PascalParser::FieldListContext::fixedPart() {
  return getRuleContext<PascalParser::FixedPartContext>(0);
}

tree::TerminalNode* PascalParser::FieldListContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}

PascalParser::VariantPartContext* PascalParser::FieldListContext::variantPart() {
  return getRuleContext<PascalParser::VariantPartContext>(0);
}


size_t PascalParser::FieldListContext::getRuleIndex() const {
  return PascalParser::RuleFieldList;
}


antlrcpp::Any PascalParser::FieldListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFieldList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FieldListContext* PascalParser::fieldList() {
  FieldListContext *_localctx = _tracker.createInstance<FieldListContext>(_ctx, getState());
  enterRule(_localctx, 68, PascalParser::RuleFieldList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(402);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::END:
      case PascalParser::SEMI:
      case PascalParser::RPAREN:
      case PascalParser::IDENT: {
        enterOuterAlt(_localctx, 1);
        setState(396);
        fixedPart();
        setState(399);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == PascalParser::SEMI) {
          setState(397);
          match(PascalParser::SEMI);
          setState(398);
          variantPart();
        }
        break;
      }

      case PascalParser::CASE: {
        enterOuterAlt(_localctx, 2);
        setState(401);
        variantPart();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FixedPartContext ------------------------------------------------------------------

PascalParser::FixedPartContext::FixedPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::RecordSectionContext *> PascalParser::FixedPartContext::recordSection() {
  return getRuleContexts<PascalParser::RecordSectionContext>();
}

PascalParser::RecordSectionContext* PascalParser::FixedPartContext::recordSection(size_t i) {
  return getRuleContext<PascalParser::RecordSectionContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::FixedPartContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::FixedPartContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::FixedPartContext::getRuleIndex() const {
  return PascalParser::RuleFixedPart;
}


antlrcpp::Any PascalParser::FixedPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFixedPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FixedPartContext* PascalParser::fixedPart() {
  FixedPartContext *_localctx = _tracker.createInstance<FixedPartContext>(_ctx, getState());
  enterRule(_localctx, 70, PascalParser::RuleFixedPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(404);
    recordSection();
    setState(409);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(405);
        match(PascalParser::SEMI);
        setState(406);
        recordSection(); 
      }
      setState(411);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RecordSectionContext ------------------------------------------------------------------

PascalParser::RecordSectionContext::RecordSectionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierListContext* PascalParser::RecordSectionContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::RecordSectionContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::Type_Context* PascalParser::RecordSectionContext::type_() {
  return getRuleContext<PascalParser::Type_Context>(0);
}

PascalParser::Empty_Context* PascalParser::RecordSectionContext::empty_() {
  return getRuleContext<PascalParser::Empty_Context>(0);
}


size_t PascalParser::RecordSectionContext::getRuleIndex() const {
  return PascalParser::RuleRecordSection;
}


antlrcpp::Any PascalParser::RecordSectionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRecordSection(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RecordSectionContext* PascalParser::recordSection() {
  RecordSectionContext *_localctx = _tracker.createInstance<RecordSectionContext>(_ctx, getState());
  enterRule(_localctx, 72, PascalParser::RuleRecordSection);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(417);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IDENT: {
        enterOuterAlt(_localctx, 1);
        setState(412);
        identifierList();
        setState(413);
        match(PascalParser::COLON);
        setState(414);
        type_();
        break;
      }

      case PascalParser::END:
      case PascalParser::SEMI:
      case PascalParser::RPAREN: {
        enterOuterAlt(_localctx, 2);
        setState(416);
        empty_();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariantPartContext ------------------------------------------------------------------

PascalParser::VariantPartContext::VariantPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::VariantPartContext::CASE() {
  return getToken(PascalParser::CASE, 0);
}

PascalParser::TagContext* PascalParser::VariantPartContext::tag() {
  return getRuleContext<PascalParser::TagContext>(0);
}

tree::TerminalNode* PascalParser::VariantPartContext::OF() {
  return getToken(PascalParser::OF, 0);
}

std::vector<PascalParser::VariantContext *> PascalParser::VariantPartContext::variant() {
  return getRuleContexts<PascalParser::VariantContext>();
}

PascalParser::VariantContext* PascalParser::VariantPartContext::variant(size_t i) {
  return getRuleContext<PascalParser::VariantContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::VariantPartContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::VariantPartContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::VariantPartContext::getRuleIndex() const {
  return PascalParser::RuleVariantPart;
}


antlrcpp::Any PascalParser::VariantPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariantPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariantPartContext* PascalParser::variantPart() {
  VariantPartContext *_localctx = _tracker.createInstance<VariantPartContext>(_ctx, getState());
  enterRule(_localctx, 74, PascalParser::RuleVariantPart);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(419);
    match(PascalParser::CASE);
    setState(420);
    tag();
    setState(421);
    match(PascalParser::OF);
    setState(422);
    variant();
    setState(427);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMI) {
      setState(423);
      match(PascalParser::SEMI);
      setState(424);
      variant();
      setState(429);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TagContext ------------------------------------------------------------------

PascalParser::TagContext::TagContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::TagContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::TagContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::TypeIdentifierContext* PascalParser::TagContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}


size_t PascalParser::TagContext::getRuleIndex() const {
  return PascalParser::RuleTag;
}


antlrcpp::Any PascalParser::TagContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTag(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TagContext* PascalParser::tag() {
  TagContext *_localctx = _tracker.createInstance<TagContext>(_ctx, getState());
  enterRule(_localctx, 76, PascalParser::RuleTag);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(435);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(430);
      identifier();
      setState(431);
      match(PascalParser::COLON);
      setState(432);
      typeIdentifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(434);
      typeIdentifier();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariantContext ------------------------------------------------------------------

PascalParser::VariantContext::VariantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ConstListContext* PascalParser::VariantContext::constList() {
  return getRuleContext<PascalParser::ConstListContext>(0);
}

tree::TerminalNode* PascalParser::VariantContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

tree::TerminalNode* PascalParser::VariantContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

PascalParser::FieldListContext* PascalParser::VariantContext::fieldList() {
  return getRuleContext<PascalParser::FieldListContext>(0);
}

tree::TerminalNode* PascalParser::VariantContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}


size_t PascalParser::VariantContext::getRuleIndex() const {
  return PascalParser::RuleVariant;
}


antlrcpp::Any PascalParser::VariantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariant(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariantContext* PascalParser::variant() {
  VariantContext *_localctx = _tracker.createInstance<VariantContext>(_ctx, getState());
  enterRule(_localctx, 78, PascalParser::RuleVariant);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(437);
    constList();
    setState(438);
    match(PascalParser::COLON);
    setState(439);
    match(PascalParser::LPAREN);
    setState(440);
    fieldList();
    setState(441);
    match(PascalParser::RPAREN);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SetTypeContext ------------------------------------------------------------------

PascalParser::SetTypeContext::SetTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::SetTypeContext::SET() {
  return getToken(PascalParser::SET, 0);
}

tree::TerminalNode* PascalParser::SetTypeContext::OF() {
  return getToken(PascalParser::OF, 0);
}

PascalParser::BaseTypeContext* PascalParser::SetTypeContext::baseType() {
  return getRuleContext<PascalParser::BaseTypeContext>(0);
}


size_t PascalParser::SetTypeContext::getRuleIndex() const {
  return PascalParser::RuleSetType;
}


antlrcpp::Any PascalParser::SetTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSetType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SetTypeContext* PascalParser::setType() {
  SetTypeContext *_localctx = _tracker.createInstance<SetTypeContext>(_ctx, getState());
  enterRule(_localctx, 80, PascalParser::RuleSetType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(443);
    match(PascalParser::SET);
    setState(444);
    match(PascalParser::OF);
    setState(445);
    baseType();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BaseTypeContext ------------------------------------------------------------------

PascalParser::BaseTypeContext::BaseTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SimpleTypeContext* PascalParser::BaseTypeContext::simpleType() {
  return getRuleContext<PascalParser::SimpleTypeContext>(0);
}


size_t PascalParser::BaseTypeContext::getRuleIndex() const {
  return PascalParser::RuleBaseType;
}


antlrcpp::Any PascalParser::BaseTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitBaseType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::BaseTypeContext* PascalParser::baseType() {
  BaseTypeContext *_localctx = _tracker.createInstance<BaseTypeContext>(_ctx, getState());
  enterRule(_localctx, 82, PascalParser::RuleBaseType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(447);
    simpleType();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FileTypeContext ------------------------------------------------------------------

PascalParser::FileTypeContext::FileTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::FileTypeContext::FILE() {
  return getToken(PascalParser::FILE, 0);
}

tree::TerminalNode* PascalParser::FileTypeContext::OF() {
  return getToken(PascalParser::OF, 0);
}

PascalParser::Type_Context* PascalParser::FileTypeContext::type_() {
  return getRuleContext<PascalParser::Type_Context>(0);
}


size_t PascalParser::FileTypeContext::getRuleIndex() const {
  return PascalParser::RuleFileType;
}


antlrcpp::Any PascalParser::FileTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFileType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FileTypeContext* PascalParser::fileType() {
  FileTypeContext *_localctx = _tracker.createInstance<FileTypeContext>(_ctx, getState());
  enterRule(_localctx, 84, PascalParser::RuleFileType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(453);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(449);
      match(PascalParser::FILE);
      setState(450);
      match(PascalParser::OF);
      setState(451);
      type_();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(452);
      match(PascalParser::FILE);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PointerTypeContext ------------------------------------------------------------------

PascalParser::PointerTypeContext::PointerTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::PointerTypeContext::POINTER() {
  return getToken(PascalParser::POINTER, 0);
}

PascalParser::TypeIdentifierContext* PascalParser::PointerTypeContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}


size_t PascalParser::PointerTypeContext::getRuleIndex() const {
  return PascalParser::RulePointerType;
}


antlrcpp::Any PascalParser::PointerTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitPointerType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::PointerTypeContext* PascalParser::pointerType() {
  PointerTypeContext *_localctx = _tracker.createInstance<PointerTypeContext>(_ctx, getState());
  enterRule(_localctx, 86, PascalParser::RulePointerType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(455);
    match(PascalParser::POINTER);
    setState(456);
    typeIdentifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDeclarationPartContext ------------------------------------------------------------------

PascalParser::VariableDeclarationPartContext::VariableDeclarationPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::VariableDeclarationPartContext::VAR() {
  return getToken(PascalParser::VAR, 0);
}

std::vector<PascalParser::VariableDeclarationContext *> PascalParser::VariableDeclarationPartContext::variableDeclaration() {
  return getRuleContexts<PascalParser::VariableDeclarationContext>();
}

PascalParser::VariableDeclarationContext* PascalParser::VariableDeclarationPartContext::variableDeclaration(size_t i) {
  return getRuleContext<PascalParser::VariableDeclarationContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableDeclarationPartContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::VariableDeclarationPartContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::VariableDeclarationPartContext::getRuleIndex() const {
  return PascalParser::RuleVariableDeclarationPart;
}


antlrcpp::Any PascalParser::VariableDeclarationPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariableDeclarationPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariableDeclarationPartContext* PascalParser::variableDeclarationPart() {
  VariableDeclarationPartContext *_localctx = _tracker.createInstance<VariableDeclarationPartContext>(_ctx, getState());
  enterRule(_localctx, 88, PascalParser::RuleVariableDeclarationPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(458);
    match(PascalParser::VAR);
    setState(459);
    variableDeclaration();
    setState(464);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 28, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(460);
        match(PascalParser::SEMI);
        setState(461);
        variableDeclaration(); 
      }
      setState(466);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 28, _ctx);
    }
    setState(467);
    match(PascalParser::SEMI);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDeclarationContext ------------------------------------------------------------------

PascalParser::VariableDeclarationContext::VariableDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierListContext* PascalParser::VariableDeclarationContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::VariableDeclarationContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::Type_Context* PascalParser::VariableDeclarationContext::type_() {
  return getRuleContext<PascalParser::Type_Context>(0);
}


size_t PascalParser::VariableDeclarationContext::getRuleIndex() const {
  return PascalParser::RuleVariableDeclaration;
}


antlrcpp::Any PascalParser::VariableDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariableDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariableDeclarationContext* PascalParser::variableDeclaration() {
  VariableDeclarationContext *_localctx = _tracker.createInstance<VariableDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 90, PascalParser::RuleVariableDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(469);
    std::vector<IdentifierContext *> names = identifierList()->identifier();
    setState(470);
    match(PascalParser::COLON);
    setState(471);
    auto typenode = type_();
    std::string typeId = typenode->simpleType()->typeIdentifier()->getText();
    if (typenode) {
      auto typespec = symtabStack->lookup(typeId)->getType();
      for (auto name : names) {
        auto entry = symtabStack->enterLocal(name->getText(), Kind::VARIABLE);
        entry->setType(typespec);
      }
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProcedureAndFunctionDeclarationPartContext ------------------------------------------------------------------

PascalParser::ProcedureAndFunctionDeclarationPartContext::ProcedureAndFunctionDeclarationPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ProcedureOrFunctionDeclarationContext* PascalParser::ProcedureAndFunctionDeclarationPartContext::procedureOrFunctionDeclaration() {
  return getRuleContext<PascalParser::ProcedureOrFunctionDeclarationContext>(0);
}

tree::TerminalNode* PascalParser::ProcedureAndFunctionDeclarationPartContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}


size_t PascalParser::ProcedureAndFunctionDeclarationPartContext::getRuleIndex() const {
  return PascalParser::RuleProcedureAndFunctionDeclarationPart;
}


antlrcpp::Any PascalParser::ProcedureAndFunctionDeclarationPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureAndFunctionDeclarationPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureAndFunctionDeclarationPartContext* PascalParser::procedureAndFunctionDeclarationPart() {
  ProcedureAndFunctionDeclarationPartContext *_localctx = _tracker.createInstance<ProcedureAndFunctionDeclarationPartContext>(_ctx, getState());
  enterRule(_localctx, 92, PascalParser::RuleProcedureAndFunctionDeclarationPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(473);
    procedureOrFunctionDeclaration();
    setState(474);
    match(PascalParser::SEMI);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProcedureOrFunctionDeclarationContext ------------------------------------------------------------------

PascalParser::ProcedureOrFunctionDeclarationContext::ProcedureOrFunctionDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ProcedureDeclarationContext* PascalParser::ProcedureOrFunctionDeclarationContext::procedureDeclaration() {
  return getRuleContext<PascalParser::ProcedureDeclarationContext>(0);
}

PascalParser::FunctionDeclarationContext* PascalParser::ProcedureOrFunctionDeclarationContext::functionDeclaration() {
  return getRuleContext<PascalParser::FunctionDeclarationContext>(0);
}


size_t PascalParser::ProcedureOrFunctionDeclarationContext::getRuleIndex() const {
  return PascalParser::RuleProcedureOrFunctionDeclaration;
}


antlrcpp::Any PascalParser::ProcedureOrFunctionDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureOrFunctionDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureOrFunctionDeclarationContext* PascalParser::procedureOrFunctionDeclaration() {
  ProcedureOrFunctionDeclarationContext *_localctx = _tracker.createInstance<ProcedureOrFunctionDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 94, PascalParser::RuleProcedureOrFunctionDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(478);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::PROCEDURE: {
        enterOuterAlt(_localctx, 1);
        setState(476);
        procedureDeclaration();
        break;
      }

      case PascalParser::FUNCTION: {
        enterOuterAlt(_localctx, 2);
        setState(477);
        functionDeclaration();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProcedureDeclarationContext ------------------------------------------------------------------

PascalParser::ProcedureDeclarationContext::ProcedureDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ProcedureDeclarationContext::PROCEDURE() {
  return getToken(PascalParser::PROCEDURE, 0);
}

PascalParser::IdentifierContext* PascalParser::ProcedureDeclarationContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ProcedureDeclarationContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}

PascalParser::BlockContext* PascalParser::ProcedureDeclarationContext::block() {
  return getRuleContext<PascalParser::BlockContext>(0);
}

PascalParser::FormalParameterListContext* PascalParser::ProcedureDeclarationContext::formalParameterList() {
  return getRuleContext<PascalParser::FormalParameterListContext>(0);
}


size_t PascalParser::ProcedureDeclarationContext::getRuleIndex() const {
  return PascalParser::RuleProcedureDeclaration;
}


antlrcpp::Any PascalParser::ProcedureDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureDeclarationContext* PascalParser::procedureDeclaration() {
  ProcedureDeclarationContext *_localctx = _tracker.createInstance<ProcedureDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 96, PascalParser::RuleProcedureDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(480);
    match(PascalParser::PROCEDURE);
    setState(481);
    auto node = identifier();
    std::string name = node->getText();
    SymtabEntry *entry = symtabStack->enterLocal(name, Kind::PROCEDURE);
    node->entry = entry;
    setState(483);
    _errHandler->sync(this);

    symtabStack->push();

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(482);
      formalParameterList();
    }
    setState(485);
    match(PascalParser::SEMI);
    setState(486);
    block();

    symtabStack->pop();
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FormalParameterListContext ------------------------------------------------------------------

PascalParser::FormalParameterListContext::FormalParameterListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::FormalParameterListContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

std::vector<PascalParser::FormalParameterSectionContext *> PascalParser::FormalParameterListContext::formalParameterSection() {
  return getRuleContexts<PascalParser::FormalParameterSectionContext>();
}

PascalParser::FormalParameterSectionContext* PascalParser::FormalParameterListContext::formalParameterSection(size_t i) {
  return getRuleContext<PascalParser::FormalParameterSectionContext>(i);
}

tree::TerminalNode* PascalParser::FormalParameterListContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

std::vector<tree::TerminalNode *> PascalParser::FormalParameterListContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::FormalParameterListContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::FormalParameterListContext::getRuleIndex() const {
  return PascalParser::RuleFormalParameterList;
}


antlrcpp::Any PascalParser::FormalParameterListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFormalParameterList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FormalParameterListContext* PascalParser::formalParameterList() {
  FormalParameterListContext *_localctx = _tracker.createInstance<FormalParameterListContext>(_ctx, getState());
  enterRule(_localctx, 98, PascalParser::RuleFormalParameterList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(488);
    match(PascalParser::LPAREN);
    setState(489);
    formalParameterSection();
    setState(494);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMI) {
      setState(490);
      match(PascalParser::SEMI);
      setState(491);
      formalParameterSection();
      setState(496);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(497);
    match(PascalParser::RPAREN);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FormalParameterSectionContext ------------------------------------------------------------------

PascalParser::FormalParameterSectionContext::FormalParameterSectionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ParameterGroupContext* PascalParser::FormalParameterSectionContext::parameterGroup() {
  return getRuleContext<PascalParser::ParameterGroupContext>(0);
}

tree::TerminalNode* PascalParser::FormalParameterSectionContext::VAR() {
  return getToken(PascalParser::VAR, 0);
}

tree::TerminalNode* PascalParser::FormalParameterSectionContext::FUNCTION() {
  return getToken(PascalParser::FUNCTION, 0);
}

tree::TerminalNode* PascalParser::FormalParameterSectionContext::PROCEDURE() {
  return getToken(PascalParser::PROCEDURE, 0);
}

tree::TerminalNode* PascalParser::FormalParameterSectionContext::CONST() {
  return getToken(PascalParser::CONST, 0);
}


size_t PascalParser::FormalParameterSectionContext::getRuleIndex() const {
  return PascalParser::RuleFormalParameterSection;
}


antlrcpp::Any PascalParser::FormalParameterSectionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFormalParameterSection(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FormalParameterSectionContext* PascalParser::formalParameterSection() {
  FormalParameterSectionContext *_localctx = _tracker.createInstance<FormalParameterSectionContext>(_ctx, getState());
  enterRule(_localctx, 100, PascalParser::RuleFormalParameterSection);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(508);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IDENT: {
        enterOuterAlt(_localctx, 1);
        setState(499);
        parameterGroup();
        break;
      }

      case PascalParser::VAR: {
        enterOuterAlt(_localctx, 2);
        setState(500);
        match(PascalParser::VAR);
        setState(501);
        parameterGroup();
        break;
      }

      case PascalParser::FUNCTION: {
        enterOuterAlt(_localctx, 3);
        setState(502);
        match(PascalParser::FUNCTION);
        setState(503);
        parameterGroup();
        break;
      }

      case PascalParser::PROCEDURE: {
        enterOuterAlt(_localctx, 4);
        setState(504);
        match(PascalParser::PROCEDURE);
        setState(505);
        parameterGroup();
        break;
      }

      case PascalParser::CONST: {
        enterOuterAlt(_localctx, 5);
        setState(506);
        match(PascalParser::CONST);
        setState(507);
        parameterGroup();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParameterGroupContext ------------------------------------------------------------------

PascalParser::ParameterGroupContext::ParameterGroupContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierListContext* PascalParser::ParameterGroupContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::ParameterGroupContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::TypeIdentifierContext* PascalParser::ParameterGroupContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}


size_t PascalParser::ParameterGroupContext::getRuleIndex() const {
  return PascalParser::RuleParameterGroup;
}


antlrcpp::Any PascalParser::ParameterGroupContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitParameterGroup(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ParameterGroupContext* PascalParser::parameterGroup() {
  ParameterGroupContext *_localctx = _tracker.createInstance<ParameterGroupContext>(_ctx, getState());
  enterRule(_localctx, 102, PascalParser::RuleParameterGroup);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(510);
    identifierList();
    setState(511);
    match(PascalParser::COLON);
    setState(512);
    typeIdentifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierListContext ------------------------------------------------------------------

PascalParser::IdentifierListContext::IdentifierListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::IdentifierContext *> PascalParser::IdentifierListContext::identifier() {
  return getRuleContexts<PascalParser::IdentifierContext>();
}

PascalParser::IdentifierContext* PascalParser::IdentifierListContext::identifier(size_t i) {
  return getRuleContext<PascalParser::IdentifierContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::IdentifierListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::IdentifierListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::IdentifierListContext::getRuleIndex() const {
  return PascalParser::RuleIdentifierList;
}


antlrcpp::Any PascalParser::IdentifierListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitIdentifierList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::IdentifierListContext* PascalParser::identifierList() {
  IdentifierListContext *_localctx = _tracker.createInstance<IdentifierListContext>(_ctx, getState());
  enterRule(_localctx, 104, PascalParser::RuleIdentifierList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(514);
    identifier();
    setState(519);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(515);
      match(PascalParser::COMMA);
      setState(516);
      identifier();
      setState(521);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstListContext ------------------------------------------------------------------

PascalParser::ConstListContext::ConstListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::ConstantContext *> PascalParser::ConstListContext::constant() {
  return getRuleContexts<PascalParser::ConstantContext>();
}

PascalParser::ConstantContext* PascalParser::ConstListContext::constant(size_t i) {
  return getRuleContext<PascalParser::ConstantContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::ConstListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ConstListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::ConstListContext::getRuleIndex() const {
  return PascalParser::RuleConstList;
}


antlrcpp::Any PascalParser::ConstListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConstList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConstListContext* PascalParser::constList() {
  ConstListContext *_localctx = _tracker.createInstance<ConstListContext>(_ctx, getState());
  enterRule(_localctx, 106, PascalParser::RuleConstList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(522);
    constant();
    setState(527);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(523);
      match(PascalParser::COMMA);
      setState(524);
      constant();
      setState(529);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDeclarationContext ------------------------------------------------------------------

PascalParser::FunctionDeclarationContext::FunctionDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::FunctionDeclarationContext::FUNCTION() {
  return getToken(PascalParser::FUNCTION, 0);
}

PascalParser::IdentifierContext* PascalParser::FunctionDeclarationContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::FunctionDeclarationContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::ResultTypeContext* PascalParser::FunctionDeclarationContext::resultType() {
  return getRuleContext<PascalParser::ResultTypeContext>(0);
}

tree::TerminalNode* PascalParser::FunctionDeclarationContext::SEMI() {
  return getToken(PascalParser::SEMI, 0);
}

PascalParser::BlockContext* PascalParser::FunctionDeclarationContext::block() {
  return getRuleContext<PascalParser::BlockContext>(0);
}

PascalParser::FormalParameterListContext* PascalParser::FunctionDeclarationContext::formalParameterList() {
  return getRuleContext<PascalParser::FormalParameterListContext>(0);
}


size_t PascalParser::FunctionDeclarationContext::getRuleIndex() const {
  return PascalParser::RuleFunctionDeclaration;
}


antlrcpp::Any PascalParser::FunctionDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFunctionDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FunctionDeclarationContext* PascalParser::functionDeclaration() {
  FunctionDeclarationContext *_localctx = _tracker.createInstance<FunctionDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 108, PascalParser::RuleFunctionDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(530);
    match(PascalParser::FUNCTION);
    setState(531);
    identifier();
    setState(533);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(532);
      formalParameterList();
    }
    setState(535);
    match(PascalParser::COLON);
    setState(536);
    resultType();
    setState(537);
    match(PascalParser::SEMI);
    setState(538);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ResultTypeContext ------------------------------------------------------------------

PascalParser::ResultTypeContext::ResultTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::TypeIdentifierContext* PascalParser::ResultTypeContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}


size_t PascalParser::ResultTypeContext::getRuleIndex() const {
  return PascalParser::RuleResultType;
}


antlrcpp::Any PascalParser::ResultTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitResultType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ResultTypeContext* PascalParser::resultType() {
  ResultTypeContext *_localctx = _tracker.createInstance<ResultTypeContext>(_ctx, getState());
  enterRule(_localctx, 110, PascalParser::RuleResultType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(540);
    typeIdentifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

PascalParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::LabelContext* PascalParser::StatementContext::label() {
  return getRuleContext<PascalParser::LabelContext>(0);
}

tree::TerminalNode* PascalParser::StatementContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::UnlabelledStatementContext* PascalParser::StatementContext::unlabelledStatement() {
  return getRuleContext<PascalParser::UnlabelledStatementContext>(0);
}


size_t PascalParser::StatementContext::getRuleIndex() const {
  return PascalParser::RuleStatement;
}


antlrcpp::Any PascalParser::StatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StatementContext* PascalParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 112, PascalParser::RuleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(547);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::NUM_INT: {
        enterOuterAlt(_localctx, 1);
        setState(542);
        label();
        setState(543);
        match(PascalParser::COLON);
        setState(544);
        unlabelledStatement();
        break;
      }

      case PascalParser::BEGIN:
      case PascalParser::BREAK:
      case PascalParser::CASE:
      case PascalParser::ELSE:
      case PascalParser::END:
      case PascalParser::FOR:
      case PascalParser::GOTO:
      case PascalParser::IF:
      case PascalParser::REPEAT:
      case PascalParser::UNTIL:
      case PascalParser::WHILE:
      case PascalParser::WITH:
      case PascalParser::SEMI:
      case PascalParser::AT:
      case PascalParser::IDENT: {
        enterOuterAlt(_localctx, 2);
        setState(546);
        unlabelledStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnlabelledStatementContext ------------------------------------------------------------------

PascalParser::UnlabelledStatementContext::UnlabelledStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SimpleStatementContext* PascalParser::UnlabelledStatementContext::simpleStatement() {
  return getRuleContext<PascalParser::SimpleStatementContext>(0);
}

PascalParser::StructuredStatementContext* PascalParser::UnlabelledStatementContext::structuredStatement() {
  return getRuleContext<PascalParser::StructuredStatementContext>(0);
}


size_t PascalParser::UnlabelledStatementContext::getRuleIndex() const {
  return PascalParser::RuleUnlabelledStatement;
}


antlrcpp::Any PascalParser::UnlabelledStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUnlabelledStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UnlabelledStatementContext* PascalParser::unlabelledStatement() {
  UnlabelledStatementContext *_localctx = _tracker.createInstance<UnlabelledStatementContext>(_ctx, getState());
  enterRule(_localctx, 114, PascalParser::RuleUnlabelledStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(551);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BREAK:
      case PascalParser::ELSE:
      case PascalParser::END:
      case PascalParser::GOTO:
      case PascalParser::UNTIL:
      case PascalParser::SEMI:
      case PascalParser::AT:
      case PascalParser::IDENT: {
        enterOuterAlt(_localctx, 1);
        setState(549);
        simpleStatement();
        break;
      }

      case PascalParser::BEGIN:
      case PascalParser::CASE:
      case PascalParser::FOR:
      case PascalParser::IF:
      case PascalParser::REPEAT:
      case PascalParser::WHILE:
      case PascalParser::WITH: {
        enterOuterAlt(_localctx, 2);
        setState(550);
        structuredStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SimpleStatementContext ------------------------------------------------------------------

PascalParser::SimpleStatementContext::SimpleStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::AssignmentStatementContext* PascalParser::SimpleStatementContext::assignmentStatement() {
  return getRuleContext<PascalParser::AssignmentStatementContext>(0);
}

PascalParser::ProcedureStatementContext* PascalParser::SimpleStatementContext::procedureStatement() {
  return getRuleContext<PascalParser::ProcedureStatementContext>(0);
}

PascalParser::GotoStatementContext* PascalParser::SimpleStatementContext::gotoStatement() {
  return getRuleContext<PascalParser::GotoStatementContext>(0);
}

PascalParser::BreakStatementContext* PascalParser::SimpleStatementContext::breakStatement() {
  return getRuleContext<PascalParser::BreakStatementContext>(0);
}

PascalParser::EmptyStatement_Context* PascalParser::SimpleStatementContext::emptyStatement_() {
  return getRuleContext<PascalParser::EmptyStatement_Context>(0);
}


size_t PascalParser::SimpleStatementContext::getRuleIndex() const {
  return PascalParser::RuleSimpleStatement;
}


antlrcpp::Any PascalParser::SimpleStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSimpleStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SimpleStatementContext* PascalParser::simpleStatement() {
  SimpleStatementContext *_localctx = _tracker.createInstance<SimpleStatementContext>(_ctx, getState());
  enterRule(_localctx, 116, PascalParser::RuleSimpleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(558);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(553);
      assignmentStatement();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(554);
      procedureStatement();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(555);
      gotoStatement();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(556);
      breakStatement();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(557);
      emptyStatement_();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignmentStatementContext ------------------------------------------------------------------

PascalParser::AssignmentStatementContext::AssignmentStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::VariableContext* PascalParser::AssignmentStatementContext::variable() {
  return getRuleContext<PascalParser::VariableContext>(0);
}

tree::TerminalNode* PascalParser::AssignmentStatementContext::ASSIGN() {
  return getToken(PascalParser::ASSIGN, 0);
}

PascalParser::ExpressionContext* PascalParser::AssignmentStatementContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}


size_t PascalParser::AssignmentStatementContext::getRuleIndex() const {
  return PascalParser::RuleAssignmentStatement;
}


antlrcpp::Any PascalParser::AssignmentStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitAssignmentStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::AssignmentStatementContext* PascalParser::assignmentStatement() {
  AssignmentStatementContext *_localctx = _tracker.createInstance<AssignmentStatementContext>(_ctx, getState());
  enterRule(_localctx, 118, PascalParser::RuleAssignmentStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(560);
    variable();
    setState(561);
    match(PascalParser::ASSIGN);
    setState(562);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableContext ------------------------------------------------------------------

PascalParser::VariableContext::VariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::VariableContext::AT() {
  return getToken(PascalParser::AT, 0);
}

std::vector<PascalParser::IdentifierContext *> PascalParser::VariableContext::identifier() {
  return getRuleContexts<PascalParser::IdentifierContext>();
}

PascalParser::IdentifierContext* PascalParser::VariableContext::identifier(size_t i) {
  return getRuleContext<PascalParser::IdentifierContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::LBRACK() {
  return getTokens(PascalParser::LBRACK);
}

tree::TerminalNode* PascalParser::VariableContext::LBRACK(size_t i) {
  return getToken(PascalParser::LBRACK, i);
}

std::vector<PascalParser::ExpressionContext *> PascalParser::VariableContext::expression() {
  return getRuleContexts<PascalParser::ExpressionContext>();
}

PascalParser::ExpressionContext* PascalParser::VariableContext::expression(size_t i) {
  return getRuleContext<PascalParser::ExpressionContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::RBRACK() {
  return getTokens(PascalParser::RBRACK);
}

tree::TerminalNode* PascalParser::VariableContext::RBRACK(size_t i) {
  return getToken(PascalParser::RBRACK, i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::LBRACK2() {
  return getTokens(PascalParser::LBRACK2);
}

tree::TerminalNode* PascalParser::VariableContext::LBRACK2(size_t i) {
  return getToken(PascalParser::LBRACK2, i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::RBRACK2() {
  return getTokens(PascalParser::RBRACK2);
}

tree::TerminalNode* PascalParser::VariableContext::RBRACK2(size_t i) {
  return getToken(PascalParser::RBRACK2, i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::DOT() {
  return getTokens(PascalParser::DOT);
}

tree::TerminalNode* PascalParser::VariableContext::DOT(size_t i) {
  return getToken(PascalParser::DOT, i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::POINTER() {
  return getTokens(PascalParser::POINTER);
}

tree::TerminalNode* PascalParser::VariableContext::POINTER(size_t i) {
  return getToken(PascalParser::POINTER, i);
}

std::vector<tree::TerminalNode *> PascalParser::VariableContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::VariableContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::VariableContext::getRuleIndex() const {
  return PascalParser::RuleVariable;
}


antlrcpp::Any PascalParser::VariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariableContext* PascalParser::variable() {
  VariableContext *_localctx = _tracker.createInstance<VariableContext>(_ctx, getState());
  enterRule(_localctx, 120, PascalParser::RuleVariable);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(567);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::AT: {
        setState(564);
        match(PascalParser::AT);
        setState(565);
        identifier();
        break;
      }

      case PascalParser::IDENT: {
        setState(566);
        identifier();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(596);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (((((_la - 76) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 76)) & ((1ULL << (PascalParser::LBRACK - 76))
      | (1ULL << (PascalParser::LBRACK2 - 76))
      | (1ULL << (PascalParser::POINTER - 76))
      | (1ULL << (PascalParser::DOT - 76)))) != 0)) {
      setState(594);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case PascalParser::LBRACK: {
          setState(569);
          match(PascalParser::LBRACK);
          setState(570);
          expression();
          setState(575);
          _errHandler->sync(this);
          _la = _input->LA(1);
          while (_la == PascalParser::COMMA) {
            setState(571);
            match(PascalParser::COMMA);
            setState(572);
            expression();
            setState(577);
            _errHandler->sync(this);
            _la = _input->LA(1);
          }
          setState(578);
          match(PascalParser::RBRACK);
          break;
        }

        case PascalParser::LBRACK2: {
          setState(580);
          match(PascalParser::LBRACK2);
          setState(581);
          expression();
          setState(586);
          _errHandler->sync(this);
          _la = _input->LA(1);
          while (_la == PascalParser::COMMA) {
            setState(582);
            match(PascalParser::COMMA);
            setState(583);
            expression();
            setState(588);
            _errHandler->sync(this);
            _la = _input->LA(1);
          }
          setState(589);
          match(PascalParser::RBRACK2);
          break;
        }

        case PascalParser::DOT: {
          setState(591);
          match(PascalParser::DOT);
          setState(592);
          identifier();
          break;
        }

        case PascalParser::POINTER: {
          setState(593);
          match(PascalParser::POINTER);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(598);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

PascalParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SimpleExpressionContext* PascalParser::ExpressionContext::simpleExpression() {
  return getRuleContext<PascalParser::SimpleExpressionContext>(0);
}

PascalParser::RelationaloperatorContext* PascalParser::ExpressionContext::relationaloperator() {
  return getRuleContext<PascalParser::RelationaloperatorContext>(0);
}

PascalParser::ExpressionContext* PascalParser::ExpressionContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}


size_t PascalParser::ExpressionContext::getRuleIndex() const {
  return PascalParser::RuleExpression;
}


antlrcpp::Any PascalParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ExpressionContext* PascalParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 122, PascalParser::RuleExpression);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(599);
    simpleExpression();
    setState(603);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 23) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 23)) & ((1ULL << (PascalParser::IN - 23))
      | (1ULL << (PascalParser::EQUAL - 23))
      | (1ULL << (PascalParser::NOT_EQUAL - 23))
      | (1ULL << (PascalParser::LT - 23))
      | (1ULL << (PascalParser::LE - 23))
      | (1ULL << (PascalParser::GE - 23))
      | (1ULL << (PascalParser::GT - 23)))) != 0)) {
      setState(600);
      relationaloperator();
      setState(601);
      expression();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RelationaloperatorContext ------------------------------------------------------------------

PascalParser::RelationaloperatorContext::RelationaloperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::EQUAL() {
  return getToken(PascalParser::EQUAL, 0);
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::NOT_EQUAL() {
  return getToken(PascalParser::NOT_EQUAL, 0);
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::LT() {
  return getToken(PascalParser::LT, 0);
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::LE() {
  return getToken(PascalParser::LE, 0);
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::GE() {
  return getToken(PascalParser::GE, 0);
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::GT() {
  return getToken(PascalParser::GT, 0);
}

tree::TerminalNode* PascalParser::RelationaloperatorContext::IN() {
  return getToken(PascalParser::IN, 0);
}


size_t PascalParser::RelationaloperatorContext::getRuleIndex() const {
  return PascalParser::RuleRelationaloperator;
}


antlrcpp::Any PascalParser::RelationaloperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRelationaloperator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RelationaloperatorContext* PascalParser::relationaloperator() {
  RelationaloperatorContext *_localctx = _tracker.createInstance<RelationaloperatorContext>(_ctx, getState());
  enterRule(_localctx, 124, PascalParser::RuleRelationaloperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(605);
    _la = _input->LA(1);
    if (!(((((_la - 23) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 23)) & ((1ULL << (PascalParser::IN - 23))
      | (1ULL << (PascalParser::EQUAL - 23))
      | (1ULL << (PascalParser::NOT_EQUAL - 23))
      | (1ULL << (PascalParser::LT - 23))
      | (1ULL << (PascalParser::LE - 23))
      | (1ULL << (PascalParser::GE - 23))
      | (1ULL << (PascalParser::GT - 23)))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SimpleExpressionContext ------------------------------------------------------------------

PascalParser::SimpleExpressionContext::SimpleExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::TermContext* PascalParser::SimpleExpressionContext::term() {
  return getRuleContext<PascalParser::TermContext>(0);
}

PascalParser::AdditiveoperatorContext* PascalParser::SimpleExpressionContext::additiveoperator() {
  return getRuleContext<PascalParser::AdditiveoperatorContext>(0);
}

PascalParser::SimpleExpressionContext* PascalParser::SimpleExpressionContext::simpleExpression() {
  return getRuleContext<PascalParser::SimpleExpressionContext>(0);
}


size_t PascalParser::SimpleExpressionContext::getRuleIndex() const {
  return PascalParser::RuleSimpleExpression;
}


antlrcpp::Any PascalParser::SimpleExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSimpleExpression(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SimpleExpressionContext* PascalParser::simpleExpression() {
  SimpleExpressionContext *_localctx = _tracker.createInstance<SimpleExpressionContext>(_ctx, getState());
  enterRule(_localctx, 126, PascalParser::RuleSimpleExpression);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(607);
    term();
    setState(611);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::OR)
      | (1ULL << PascalParser::PLUS)
      | (1ULL << PascalParser::MINUS))) != 0)) {
      setState(608);
      additiveoperator();
      setState(609);
      simpleExpression();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AdditiveoperatorContext ------------------------------------------------------------------

PascalParser::AdditiveoperatorContext::AdditiveoperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::AdditiveoperatorContext::PLUS() {
  return getToken(PascalParser::PLUS, 0);
}

tree::TerminalNode* PascalParser::AdditiveoperatorContext::MINUS() {
  return getToken(PascalParser::MINUS, 0);
}

tree::TerminalNode* PascalParser::AdditiveoperatorContext::OR() {
  return getToken(PascalParser::OR, 0);
}


size_t PascalParser::AdditiveoperatorContext::getRuleIndex() const {
  return PascalParser::RuleAdditiveoperator;
}


antlrcpp::Any PascalParser::AdditiveoperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitAdditiveoperator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::AdditiveoperatorContext* PascalParser::additiveoperator() {
  AdditiveoperatorContext *_localctx = _tracker.createInstance<AdditiveoperatorContext>(_ctx, getState());
  enterRule(_localctx, 128, PascalParser::RuleAdditiveoperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(613);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::OR)
      | (1ULL << PascalParser::PLUS)
      | (1ULL << PascalParser::MINUS))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TermContext ------------------------------------------------------------------

PascalParser::TermContext::TermContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SignedFactorContext* PascalParser::TermContext::signedFactor() {
  return getRuleContext<PascalParser::SignedFactorContext>(0);
}

PascalParser::MultiplicativeoperatorContext* PascalParser::TermContext::multiplicativeoperator() {
  return getRuleContext<PascalParser::MultiplicativeoperatorContext>(0);
}

PascalParser::TermContext* PascalParser::TermContext::term() {
  return getRuleContext<PascalParser::TermContext>(0);
}


size_t PascalParser::TermContext::getRuleIndex() const {
  return PascalParser::RuleTerm;
}


antlrcpp::Any PascalParser::TermContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTerm(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TermContext* PascalParser::term() {
  TermContext *_localctx = _tracker.createInstance<TermContext>(_ctx, getState());
  enterRule(_localctx, 130, PascalParser::RuleTerm);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(615);
    signedFactor();
    setState(619);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::AND)
      | (1ULL << PascalParser::DIV)
      | (1ULL << PascalParser::MOD)
      | (1ULL << PascalParser::STAR)
      | (1ULL << PascalParser::SLASH))) != 0)) {
      setState(616);
      multiplicativeoperator();
      setState(617);
      term();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MultiplicativeoperatorContext ------------------------------------------------------------------

PascalParser::MultiplicativeoperatorContext::MultiplicativeoperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::MultiplicativeoperatorContext::STAR() {
  return getToken(PascalParser::STAR, 0);
}

tree::TerminalNode* PascalParser::MultiplicativeoperatorContext::SLASH() {
  return getToken(PascalParser::SLASH, 0);
}

tree::TerminalNode* PascalParser::MultiplicativeoperatorContext::DIV() {
  return getToken(PascalParser::DIV, 0);
}

tree::TerminalNode* PascalParser::MultiplicativeoperatorContext::MOD() {
  return getToken(PascalParser::MOD, 0);
}

tree::TerminalNode* PascalParser::MultiplicativeoperatorContext::AND() {
  return getToken(PascalParser::AND, 0);
}


size_t PascalParser::MultiplicativeoperatorContext::getRuleIndex() const {
  return PascalParser::RuleMultiplicativeoperator;
}


antlrcpp::Any PascalParser::MultiplicativeoperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitMultiplicativeoperator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::MultiplicativeoperatorContext* PascalParser::multiplicativeoperator() {
  MultiplicativeoperatorContext *_localctx = _tracker.createInstance<MultiplicativeoperatorContext>(_ctx, getState());
  enterRule(_localctx, 132, PascalParser::RuleMultiplicativeoperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(621);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::AND)
      | (1ULL << PascalParser::DIV)
      | (1ULL << PascalParser::MOD)
      | (1ULL << PascalParser::STAR)
      | (1ULL << PascalParser::SLASH))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SignedFactorContext ------------------------------------------------------------------

PascalParser::SignedFactorContext::SignedFactorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::FactorContext* PascalParser::SignedFactorContext::factor() {
  return getRuleContext<PascalParser::FactorContext>(0);
}

tree::TerminalNode* PascalParser::SignedFactorContext::PLUS() {
  return getToken(PascalParser::PLUS, 0);
}

tree::TerminalNode* PascalParser::SignedFactorContext::MINUS() {
  return getToken(PascalParser::MINUS, 0);
}


size_t PascalParser::SignedFactorContext::getRuleIndex() const {
  return PascalParser::RuleSignedFactor;
}


antlrcpp::Any PascalParser::SignedFactorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSignedFactor(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SignedFactorContext* PascalParser::signedFactor() {
  SignedFactorContext *_localctx = _tracker.createInstance<SignedFactorContext>(_ctx, getState());
  enterRule(_localctx, 134, PascalParser::RuleSignedFactor);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(624);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::PLUS

    || _la == PascalParser::MINUS) {
      setState(623);
      _la = _input->LA(1);
      if (!(_la == PascalParser::PLUS

      || _la == PascalParser::MINUS)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(626);
    factor();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FactorContext ------------------------------------------------------------------

PascalParser::FactorContext::FactorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::VariableContext* PascalParser::FactorContext::variable() {
  return getRuleContext<PascalParser::VariableContext>(0);
}

tree::TerminalNode* PascalParser::FactorContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

PascalParser::ExpressionContext* PascalParser::FactorContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}

tree::TerminalNode* PascalParser::FactorContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

PascalParser::FunctionDesignatorContext* PascalParser::FactorContext::functionDesignator() {
  return getRuleContext<PascalParser::FunctionDesignatorContext>(0);
}

PascalParser::UnsignedConstantContext* PascalParser::FactorContext::unsignedConstant() {
  return getRuleContext<PascalParser::UnsignedConstantContext>(0);
}

PascalParser::Set_Context* PascalParser::FactorContext::set_() {
  return getRuleContext<PascalParser::Set_Context>(0);
}

tree::TerminalNode* PascalParser::FactorContext::NOT() {
  return getToken(PascalParser::NOT, 0);
}

PascalParser::FactorContext* PascalParser::FactorContext::factor() {
  return getRuleContext<PascalParser::FactorContext>(0);
}

PascalParser::Bool_Context* PascalParser::FactorContext::bool_() {
  return getRuleContext<PascalParser::Bool_Context>(0);
}


size_t PascalParser::FactorContext::getRuleIndex() const {
  return PascalParser::RuleFactor;
}


antlrcpp::Any PascalParser::FactorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFactor(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FactorContext* PascalParser::factor() {
  FactorContext *_localctx = _tracker.createInstance<FactorContext>(_ctx, getState());
  enterRule(_localctx, 136, PascalParser::RuleFactor);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(639);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 48, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(628);
      variable();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(629);
      match(PascalParser::LPAREN);
      setState(630);
      expression();
      setState(631);
      match(PascalParser::RPAREN);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(633);
      functionDesignator();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(634);
      unsignedConstant();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(635);
      set_();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(636);
      match(PascalParser::NOT);
      setState(637);
      factor();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(638);
      bool_();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnsignedConstantContext ------------------------------------------------------------------

PascalParser::UnsignedConstantContext::UnsignedConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::UnsignedNumberContext* PascalParser::UnsignedConstantContext::unsignedNumber() {
  return getRuleContext<PascalParser::UnsignedNumberContext>(0);
}

PascalParser::ConstantChrContext* PascalParser::UnsignedConstantContext::constantChr() {
  return getRuleContext<PascalParser::ConstantChrContext>(0);
}

PascalParser::StringContext* PascalParser::UnsignedConstantContext::string() {
  return getRuleContext<PascalParser::StringContext>(0);
}

tree::TerminalNode* PascalParser::UnsignedConstantContext::NIL() {
  return getToken(PascalParser::NIL, 0);
}


size_t PascalParser::UnsignedConstantContext::getRuleIndex() const {
  return PascalParser::RuleUnsignedConstant;
}


antlrcpp::Any PascalParser::UnsignedConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitUnsignedConstant(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::UnsignedConstantContext* PascalParser::unsignedConstant() {
  UnsignedConstantContext *_localctx = _tracker.createInstance<UnsignedConstantContext>(_ctx, getState());
  enterRule(_localctx, 138, PascalParser::RuleUnsignedConstant);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(645);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::NUM_INT:
      case PascalParser::NUM_REAL: {
        enterOuterAlt(_localctx, 1);
        setState(641);
        unsignedNumber();
        break;
      }

      case PascalParser::CHR: {
        enterOuterAlt(_localctx, 2);
        setState(642);
        constantChr();
        break;
      }

      case PascalParser::STRING_LITERAL: {
        enterOuterAlt(_localctx, 3);
        setState(643);
        string();
        break;
      }

      case PascalParser::NIL: {
        enterOuterAlt(_localctx, 4);
        setState(644);
        match(PascalParser::NIL);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDesignatorContext ------------------------------------------------------------------

PascalParser::FunctionDesignatorContext::FunctionDesignatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::FunctionDesignatorContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::FunctionDesignatorContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

tree::TerminalNode* PascalParser::FunctionDesignatorContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

PascalParser::ParameterListContext* PascalParser::FunctionDesignatorContext::parameterList() {
  return getRuleContext<PascalParser::ParameterListContext>(0);
}


size_t PascalParser::FunctionDesignatorContext::getRuleIndex() const {
  return PascalParser::RuleFunctionDesignator;
}


antlrcpp::Any PascalParser::FunctionDesignatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFunctionDesignator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FunctionDesignatorContext* PascalParser::functionDesignator() {
  FunctionDesignatorContext *_localctx = _tracker.createInstance<FunctionDesignatorContext>(_ctx, getState());
  enterRule(_localctx, 140, PascalParser::RuleFunctionDesignator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(647);
    identifier();
    setState(653);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(648);
      match(PascalParser::LPAREN);
      setState(650);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << PascalParser::FALSE)
        | (1ULL << PascalParser::NIL)
        | (1ULL << PascalParser::NOT)
        | (1ULL << PascalParser::TRUE)
        | (1ULL << PascalParser::CHR)
        | (1ULL << PascalParser::PLUS)
        | (1ULL << PascalParser::MINUS))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 74)) & ((1ULL << (PascalParser::LPAREN - 74))
        | (1ULL << (PascalParser::LBRACK - 74))
        | (1ULL << (PascalParser::LBRACK2 - 74))
        | (1ULL << (PascalParser::AT - 74))
        | (1ULL << (PascalParser::IDENT - 74))
        | (1ULL << (PascalParser::STRING_LITERAL - 74))
        | (1ULL << (PascalParser::NUM_INT - 74))
        | (1ULL << (PascalParser::NUM_REAL - 74)))) != 0)) {
        setState(649);
        parameterList();
      }
      setState(652);
      match(PascalParser::RPAREN);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParameterListContext ------------------------------------------------------------------

PascalParser::ParameterListContext::ParameterListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::ActualParameterContext *> PascalParser::ParameterListContext::actualParameter() {
  return getRuleContexts<PascalParser::ActualParameterContext>();
}

PascalParser::ActualParameterContext* PascalParser::ParameterListContext::actualParameter(size_t i) {
  return getRuleContext<PascalParser::ActualParameterContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::ParameterListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ParameterListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::ParameterListContext::getRuleIndex() const {
  return PascalParser::RuleParameterList;
}


antlrcpp::Any PascalParser::ParameterListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitParameterList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ParameterListContext* PascalParser::parameterList() {
  ParameterListContext *_localctx = _tracker.createInstance<ParameterListContext>(_ctx, getState());
  enterRule(_localctx, 142, PascalParser::RuleParameterList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(655);
    actualParameter();
    setState(660);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(656);
      match(PascalParser::COMMA);
      setState(657);
      actualParameter();
      setState(662);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Set_Context ------------------------------------------------------------------

PascalParser::Set_Context::Set_Context(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::Set_Context::LBRACK() {
  return getToken(PascalParser::LBRACK, 0);
}

PascalParser::ElementListContext* PascalParser::Set_Context::elementList() {
  return getRuleContext<PascalParser::ElementListContext>(0);
}

tree::TerminalNode* PascalParser::Set_Context::RBRACK() {
  return getToken(PascalParser::RBRACK, 0);
}

tree::TerminalNode* PascalParser::Set_Context::LBRACK2() {
  return getToken(PascalParser::LBRACK2, 0);
}

tree::TerminalNode* PascalParser::Set_Context::RBRACK2() {
  return getToken(PascalParser::RBRACK2, 0);
}


size_t PascalParser::Set_Context::getRuleIndex() const {
  return PascalParser::RuleSet_;
}


antlrcpp::Any PascalParser::Set_Context::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSet_(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::Set_Context* PascalParser::set_() {
  Set_Context *_localctx = _tracker.createInstance<Set_Context>(_ctx, getState());
  enterRule(_localctx, 144, PascalParser::RuleSet_);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(671);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::LBRACK: {
        enterOuterAlt(_localctx, 1);
        setState(663);
        match(PascalParser::LBRACK);
        setState(664);
        elementList();
        setState(665);
        match(PascalParser::RBRACK);
        break;
      }

      case PascalParser::LBRACK2: {
        enterOuterAlt(_localctx, 2);
        setState(667);
        match(PascalParser::LBRACK2);
        setState(668);
        elementList();
        setState(669);
        match(PascalParser::RBRACK2);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElementListContext ------------------------------------------------------------------

PascalParser::ElementListContext::ElementListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::ElementContext *> PascalParser::ElementListContext::element() {
  return getRuleContexts<PascalParser::ElementContext>();
}

PascalParser::ElementContext* PascalParser::ElementListContext::element(size_t i) {
  return getRuleContext<PascalParser::ElementContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::ElementListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ElementListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::ElementListContext::getRuleIndex() const {
  return PascalParser::RuleElementList;
}


antlrcpp::Any PascalParser::ElementListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitElementList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ElementListContext* PascalParser::elementList() {
  ElementListContext *_localctx = _tracker.createInstance<ElementListContext>(_ctx, getState());
  enterRule(_localctx, 146, PascalParser::RuleElementList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(682);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::FALSE:
      case PascalParser::NIL:
      case PascalParser::NOT:
      case PascalParser::TRUE:
      case PascalParser::CHR:
      case PascalParser::PLUS:
      case PascalParser::MINUS:
      case PascalParser::LPAREN:
      case PascalParser::LBRACK:
      case PascalParser::LBRACK2:
      case PascalParser::AT:
      case PascalParser::IDENT:
      case PascalParser::STRING_LITERAL:
      case PascalParser::NUM_INT:
      case PascalParser::NUM_REAL: {
        enterOuterAlt(_localctx, 1);
        setState(673);
        element();
        setState(678);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == PascalParser::COMMA) {
          setState(674);
          match(PascalParser::COMMA);
          setState(675);
          element();
          setState(680);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        break;
      }

      case PascalParser::RBRACK:
      case PascalParser::RBRACK2: {
        enterOuterAlt(_localctx, 2);

        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElementContext ------------------------------------------------------------------

PascalParser::ElementContext::ElementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::ExpressionContext *> PascalParser::ElementContext::expression() {
  return getRuleContexts<PascalParser::ExpressionContext>();
}

PascalParser::ExpressionContext* PascalParser::ElementContext::expression(size_t i) {
  return getRuleContext<PascalParser::ExpressionContext>(i);
}

tree::TerminalNode* PascalParser::ElementContext::DOTDOT() {
  return getToken(PascalParser::DOTDOT, 0);
}


size_t PascalParser::ElementContext::getRuleIndex() const {
  return PascalParser::RuleElement;
}


antlrcpp::Any PascalParser::ElementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitElement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ElementContext* PascalParser::element() {
  ElementContext *_localctx = _tracker.createInstance<ElementContext>(_ctx, getState());
  enterRule(_localctx, 148, PascalParser::RuleElement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(684);
    expression();
    setState(687);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::DOTDOT) {
      setState(685);
      match(PascalParser::DOTDOT);
      setState(686);
      expression();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProcedureStatementContext ------------------------------------------------------------------

PascalParser::ProcedureStatementContext::ProcedureStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::ProcedureStatementContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ProcedureStatementContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

tree::TerminalNode* PascalParser::ProcedureStatementContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

PascalParser::ParameterListContext* PascalParser::ProcedureStatementContext::parameterList() {
  return getRuleContext<PascalParser::ParameterListContext>(0);
}


size_t PascalParser::ProcedureStatementContext::getRuleIndex() const {
  return PascalParser::RuleProcedureStatement;
}


antlrcpp::Any PascalParser::ProcedureStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureStatementContext* PascalParser::procedureStatement() {
  ProcedureStatementContext *_localctx = _tracker.createInstance<ProcedureStatementContext>(_ctx, getState());
  enterRule(_localctx, 150, PascalParser::RuleProcedureStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(689);
    identifier();
    setState(695);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(690);
      match(PascalParser::LPAREN);
      setState(692);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << PascalParser::FALSE)
        | (1ULL << PascalParser::NIL)
        | (1ULL << PascalParser::NOT)
        | (1ULL << PascalParser::TRUE)
        | (1ULL << PascalParser::CHR)
        | (1ULL << PascalParser::PLUS)
        | (1ULL << PascalParser::MINUS))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 74)) & ((1ULL << (PascalParser::LPAREN - 74))
        | (1ULL << (PascalParser::LBRACK - 74))
        | (1ULL << (PascalParser::LBRACK2 - 74))
        | (1ULL << (PascalParser::AT - 74))
        | (1ULL << (PascalParser::IDENT - 74))
        | (1ULL << (PascalParser::STRING_LITERAL - 74))
        | (1ULL << (PascalParser::NUM_INT - 74))
        | (1ULL << (PascalParser::NUM_REAL - 74)))) != 0)) {
        setState(691);
        parameterList();
      }
      setState(694);
      match(PascalParser::RPAREN);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ActualParameterContext ------------------------------------------------------------------

PascalParser::ActualParameterContext::ActualParameterContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ExpressionContext* PascalParser::ActualParameterContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}

std::vector<PascalParser::ParameterwidthContext *> PascalParser::ActualParameterContext::parameterwidth() {
  return getRuleContexts<PascalParser::ParameterwidthContext>();
}

PascalParser::ParameterwidthContext* PascalParser::ActualParameterContext::parameterwidth(size_t i) {
  return getRuleContext<PascalParser::ParameterwidthContext>(i);
}


size_t PascalParser::ActualParameterContext::getRuleIndex() const {
  return PascalParser::RuleActualParameter;
}


antlrcpp::Any PascalParser::ActualParameterContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitActualParameter(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ActualParameterContext* PascalParser::actualParameter() {
  ActualParameterContext *_localctx = _tracker.createInstance<ActualParameterContext>(_ctx, getState());
  enterRule(_localctx, 152, PascalParser::RuleActualParameter);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(697);
    expression();
    setState(701);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COLON) {
      setState(698);
      parameterwidth();
      setState(703);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParameterwidthContext ------------------------------------------------------------------

PascalParser::ParameterwidthContext::ParameterwidthContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ParameterwidthContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::ExpressionContext* PascalParser::ParameterwidthContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}


size_t PascalParser::ParameterwidthContext::getRuleIndex() const {
  return PascalParser::RuleParameterwidth;
}


antlrcpp::Any PascalParser::ParameterwidthContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitParameterwidth(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ParameterwidthContext* PascalParser::parameterwidth() {
  ParameterwidthContext *_localctx = _tracker.createInstance<ParameterwidthContext>(_ctx, getState());
  enterRule(_localctx, 154, PascalParser::RuleParameterwidth);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(704);
    match(PascalParser::COLON);
    setState(705);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GotoStatementContext ------------------------------------------------------------------

PascalParser::GotoStatementContext::GotoStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::GotoStatementContext::GOTO() {
  return getToken(PascalParser::GOTO, 0);
}

PascalParser::LabelContext* PascalParser::GotoStatementContext::label() {
  return getRuleContext<PascalParser::LabelContext>(0);
}


size_t PascalParser::GotoStatementContext::getRuleIndex() const {
  return PascalParser::RuleGotoStatement;
}


antlrcpp::Any PascalParser::GotoStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitGotoStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::GotoStatementContext* PascalParser::gotoStatement() {
  GotoStatementContext *_localctx = _tracker.createInstance<GotoStatementContext>(_ctx, getState());
  enterRule(_localctx, 156, PascalParser::RuleGotoStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(707);
    match(PascalParser::GOTO);
    setState(708);
    label();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BreakStatementContext ------------------------------------------------------------------

PascalParser::BreakStatementContext::BreakStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::BreakStatementContext::BREAK() {
  return getToken(PascalParser::BREAK, 0);
}


size_t PascalParser::BreakStatementContext::getRuleIndex() const {
  return PascalParser::RuleBreakStatement;
}


antlrcpp::Any PascalParser::BreakStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitBreakStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::BreakStatementContext* PascalParser::breakStatement() {
  BreakStatementContext *_localctx = _tracker.createInstance<BreakStatementContext>(_ctx, getState());
  enterRule(_localctx, 158, PascalParser::RuleBreakStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(710);
    match(PascalParser::BREAK);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EmptyStatement_Context ------------------------------------------------------------------

PascalParser::EmptyStatement_Context::EmptyStatement_Context(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t PascalParser::EmptyStatement_Context::getRuleIndex() const {
  return PascalParser::RuleEmptyStatement_;
}


antlrcpp::Any PascalParser::EmptyStatement_Context::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitEmptyStatement_(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::EmptyStatement_Context* PascalParser::emptyStatement_() {
  EmptyStatement_Context *_localctx = _tracker.createInstance<EmptyStatement_Context>(_ctx, getState());
  enterRule(_localctx, 160, PascalParser::RuleEmptyStatement_);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);

   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Empty_Context ------------------------------------------------------------------

PascalParser::Empty_Context::Empty_Context(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t PascalParser::Empty_Context::getRuleIndex() const {
  return PascalParser::RuleEmpty_;
}


antlrcpp::Any PascalParser::Empty_Context::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitEmpty_(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::Empty_Context* PascalParser::empty_() {
  Empty_Context *_localctx = _tracker.createInstance<Empty_Context>(_ctx, getState());
  enterRule(_localctx, 162, PascalParser::RuleEmpty_);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);

   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StructuredStatementContext ------------------------------------------------------------------

PascalParser::StructuredStatementContext::StructuredStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::CompoundStatementContext* PascalParser::StructuredStatementContext::compoundStatement() {
  return getRuleContext<PascalParser::CompoundStatementContext>(0);
}

PascalParser::ConditionalStatementContext* PascalParser::StructuredStatementContext::conditionalStatement() {
  return getRuleContext<PascalParser::ConditionalStatementContext>(0);
}

PascalParser::RepetetiveStatementContext* PascalParser::StructuredStatementContext::repetetiveStatement() {
  return getRuleContext<PascalParser::RepetetiveStatementContext>(0);
}

PascalParser::WithStatementContext* PascalParser::StructuredStatementContext::withStatement() {
  return getRuleContext<PascalParser::WithStatementContext>(0);
}


size_t PascalParser::StructuredStatementContext::getRuleIndex() const {
  return PascalParser::RuleStructuredStatement;
}


antlrcpp::Any PascalParser::StructuredStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitStructuredStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StructuredStatementContext* PascalParser::structuredStatement() {
  StructuredStatementContext *_localctx = _tracker.createInstance<StructuredStatementContext>(_ctx, getState());
  enterRule(_localctx, 164, PascalParser::RuleStructuredStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(720);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN: {
        enterOuterAlt(_localctx, 1);
        setState(716);
        compoundStatement();
        break;
      }

      case PascalParser::CASE:
      case PascalParser::IF: {
        enterOuterAlt(_localctx, 2);
        setState(717);
        conditionalStatement();
        break;
      }

      case PascalParser::FOR:
      case PascalParser::REPEAT:
      case PascalParser::WHILE: {
        enterOuterAlt(_localctx, 3);
        setState(718);
        repetetiveStatement();
        break;
      }

      case PascalParser::WITH: {
        enterOuterAlt(_localctx, 4);
        setState(719);
        withStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CompoundStatementContext ------------------------------------------------------------------

PascalParser::CompoundStatementContext::CompoundStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::CompoundStatementContext::BEGIN() {
  return getToken(PascalParser::BEGIN, 0);
}

PascalParser::StatementsContext* PascalParser::CompoundStatementContext::statements() {
  return getRuleContext<PascalParser::StatementsContext>(0);
}

tree::TerminalNode* PascalParser::CompoundStatementContext::END() {
  return getToken(PascalParser::END, 0);
}


size_t PascalParser::CompoundStatementContext::getRuleIndex() const {
  return PascalParser::RuleCompoundStatement;
}


antlrcpp::Any PascalParser::CompoundStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitCompoundStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::CompoundStatementContext* PascalParser::compoundStatement() {
  CompoundStatementContext *_localctx = _tracker.createInstance<CompoundStatementContext>(_ctx, getState());
  enterRule(_localctx, 166, PascalParser::RuleCompoundStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(722);
    match(PascalParser::BEGIN);
    setState(723);
    statements();
    setState(724);
    match(PascalParser::END);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementsContext ------------------------------------------------------------------

PascalParser::StatementsContext::StatementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::StatementContext *> PascalParser::StatementsContext::statement() {
  return getRuleContexts<PascalParser::StatementContext>();
}

PascalParser::StatementContext* PascalParser::StatementsContext::statement(size_t i) {
  return getRuleContext<PascalParser::StatementContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::StatementsContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::StatementsContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}


size_t PascalParser::StatementsContext::getRuleIndex() const {
  return PascalParser::RuleStatements;
}


antlrcpp::Any PascalParser::StatementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitStatements(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StatementsContext* PascalParser::statements() {
  StatementsContext *_localctx = _tracker.createInstance<StatementsContext>(_ctx, getState());
  enterRule(_localctx, 168, PascalParser::RuleStatements);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(726);
    statement();
    setState(731);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMI) {
      setState(727);
      match(PascalParser::SEMI);
      setState(728);
      statement();
      setState(733);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalStatementContext ------------------------------------------------------------------

PascalParser::ConditionalStatementContext::ConditionalStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IfStatementContext* PascalParser::ConditionalStatementContext::ifStatement() {
  return getRuleContext<PascalParser::IfStatementContext>(0);
}

PascalParser::CaseStatementContext* PascalParser::ConditionalStatementContext::caseStatement() {
  return getRuleContext<PascalParser::CaseStatementContext>(0);
}


size_t PascalParser::ConditionalStatementContext::getRuleIndex() const {
  return PascalParser::RuleConditionalStatement;
}


antlrcpp::Any PascalParser::ConditionalStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConditionalStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConditionalStatementContext* PascalParser::conditionalStatement() {
  ConditionalStatementContext *_localctx = _tracker.createInstance<ConditionalStatementContext>(_ctx, getState());
  enterRule(_localctx, 170, PascalParser::RuleConditionalStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(736);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IF: {
        enterOuterAlt(_localctx, 1);
        setState(734);
        ifStatement();
        break;
      }

      case PascalParser::CASE: {
        enterOuterAlt(_localctx, 2);
        setState(735);
        caseStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfStatementContext ------------------------------------------------------------------

PascalParser::IfStatementContext::IfStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::IfStatementContext::IF() {
  return getToken(PascalParser::IF, 0);
}

PascalParser::ExpressionContext* PascalParser::IfStatementContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}

tree::TerminalNode* PascalParser::IfStatementContext::THEN() {
  return getToken(PascalParser::THEN, 0);
}

std::vector<PascalParser::StatementContext *> PascalParser::IfStatementContext::statement() {
  return getRuleContexts<PascalParser::StatementContext>();
}

PascalParser::StatementContext* PascalParser::IfStatementContext::statement(size_t i) {
  return getRuleContext<PascalParser::StatementContext>(i);
}

tree::TerminalNode* PascalParser::IfStatementContext::ELSE() {
  return getToken(PascalParser::ELSE, 0);
}


size_t PascalParser::IfStatementContext::getRuleIndex() const {
  return PascalParser::RuleIfStatement;
}


antlrcpp::Any PascalParser::IfStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitIfStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::IfStatementContext* PascalParser::ifStatement() {
  IfStatementContext *_localctx = _tracker.createInstance<IfStatementContext>(_ctx, getState());
  enterRule(_localctx, 172, PascalParser::RuleIfStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(738);
    match(PascalParser::IF);
    setState(739);
    expression();
    setState(740);
    match(PascalParser::THEN);
    setState(741);
    statement();
    setState(744);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 63, _ctx)) {
    case 1: {
      setState(742);
      match(PascalParser::ELSE);
      setState(743);
      statement();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CaseStatementContext ------------------------------------------------------------------

PascalParser::CaseStatementContext::CaseStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::CaseStatementContext::CASE() {
  return getToken(PascalParser::CASE, 0);
}

PascalParser::ExpressionContext* PascalParser::CaseStatementContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}

tree::TerminalNode* PascalParser::CaseStatementContext::OF() {
  return getToken(PascalParser::OF, 0);
}

std::vector<PascalParser::CaseListElementContext *> PascalParser::CaseStatementContext::caseListElement() {
  return getRuleContexts<PascalParser::CaseListElementContext>();
}

PascalParser::CaseListElementContext* PascalParser::CaseStatementContext::caseListElement(size_t i) {
  return getRuleContext<PascalParser::CaseListElementContext>(i);
}

tree::TerminalNode* PascalParser::CaseStatementContext::END() {
  return getToken(PascalParser::END, 0);
}

std::vector<tree::TerminalNode *> PascalParser::CaseStatementContext::SEMI() {
  return getTokens(PascalParser::SEMI);
}

tree::TerminalNode* PascalParser::CaseStatementContext::SEMI(size_t i) {
  return getToken(PascalParser::SEMI, i);
}

tree::TerminalNode* PascalParser::CaseStatementContext::ELSE() {
  return getToken(PascalParser::ELSE, 0);
}

PascalParser::StatementsContext* PascalParser::CaseStatementContext::statements() {
  return getRuleContext<PascalParser::StatementsContext>(0);
}


size_t PascalParser::CaseStatementContext::getRuleIndex() const {
  return PascalParser::RuleCaseStatement;
}


antlrcpp::Any PascalParser::CaseStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitCaseStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::CaseStatementContext* PascalParser::caseStatement() {
  CaseStatementContext *_localctx = _tracker.createInstance<CaseStatementContext>(_ctx, getState());
  enterRule(_localctx, 174, PascalParser::RuleCaseStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(746);
    match(PascalParser::CASE);
    setState(747);
    expression();
    setState(748);
    match(PascalParser::OF);
    setState(749);
    caseListElement();
    setState(754);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 64, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(750);
        match(PascalParser::SEMI);
        setState(751);
        caseListElement(); 
      }
      setState(756);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 64, _ctx);
    }
    setState(760);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::SEMI) {
      setState(757);
      match(PascalParser::SEMI);
      setState(758);
      match(PascalParser::ELSE);
      setState(759);
      statements();
    }
    setState(762);
    match(PascalParser::END);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CaseListElementContext ------------------------------------------------------------------

PascalParser::CaseListElementContext::CaseListElementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ConstListContext* PascalParser::CaseListElementContext::constList() {
  return getRuleContext<PascalParser::ConstListContext>(0);
}

tree::TerminalNode* PascalParser::CaseListElementContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::StatementContext* PascalParser::CaseListElementContext::statement() {
  return getRuleContext<PascalParser::StatementContext>(0);
}


size_t PascalParser::CaseListElementContext::getRuleIndex() const {
  return PascalParser::RuleCaseListElement;
}


antlrcpp::Any PascalParser::CaseListElementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitCaseListElement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::CaseListElementContext* PascalParser::caseListElement() {
  CaseListElementContext *_localctx = _tracker.createInstance<CaseListElementContext>(_ctx, getState());
  enterRule(_localctx, 176, PascalParser::RuleCaseListElement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(764);
    constList();
    setState(765);
    match(PascalParser::COLON);
    setState(766);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RepetetiveStatementContext ------------------------------------------------------------------

PascalParser::RepetetiveStatementContext::RepetetiveStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::WhileStatementContext* PascalParser::RepetetiveStatementContext::whileStatement() {
  return getRuleContext<PascalParser::WhileStatementContext>(0);
}

PascalParser::RepeatStatementContext* PascalParser::RepetetiveStatementContext::repeatStatement() {
  return getRuleContext<PascalParser::RepeatStatementContext>(0);
}

PascalParser::ForStatementContext* PascalParser::RepetetiveStatementContext::forStatement() {
  return getRuleContext<PascalParser::ForStatementContext>(0);
}


size_t PascalParser::RepetetiveStatementContext::getRuleIndex() const {
  return PascalParser::RuleRepetetiveStatement;
}


antlrcpp::Any PascalParser::RepetetiveStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRepetetiveStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RepetetiveStatementContext* PascalParser::repetetiveStatement() {
  RepetetiveStatementContext *_localctx = _tracker.createInstance<RepetetiveStatementContext>(_ctx, getState());
  enterRule(_localctx, 178, PascalParser::RuleRepetetiveStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(771);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::WHILE: {
        enterOuterAlt(_localctx, 1);
        setState(768);
        whileStatement();
        break;
      }

      case PascalParser::REPEAT: {
        enterOuterAlt(_localctx, 2);
        setState(769);
        repeatStatement();
        break;
      }

      case PascalParser::FOR: {
        enterOuterAlt(_localctx, 3);
        setState(770);
        forStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WhileStatementContext ------------------------------------------------------------------

PascalParser::WhileStatementContext::WhileStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::WhileStatementContext::WHILE() {
  return getToken(PascalParser::WHILE, 0);
}

PascalParser::ExpressionContext* PascalParser::WhileStatementContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}

tree::TerminalNode* PascalParser::WhileStatementContext::DO() {
  return getToken(PascalParser::DO, 0);
}

PascalParser::StatementContext* PascalParser::WhileStatementContext::statement() {
  return getRuleContext<PascalParser::StatementContext>(0);
}


size_t PascalParser::WhileStatementContext::getRuleIndex() const {
  return PascalParser::RuleWhileStatement;
}


antlrcpp::Any PascalParser::WhileStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitWhileStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::WhileStatementContext* PascalParser::whileStatement() {
  WhileStatementContext *_localctx = _tracker.createInstance<WhileStatementContext>(_ctx, getState());
  enterRule(_localctx, 180, PascalParser::RuleWhileStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(773);
    match(PascalParser::WHILE);
    setState(774);
    expression();
    setState(775);
    match(PascalParser::DO);
    setState(776);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RepeatStatementContext ------------------------------------------------------------------

PascalParser::RepeatStatementContext::RepeatStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::RepeatStatementContext::REPEAT() {
  return getToken(PascalParser::REPEAT, 0);
}

PascalParser::StatementsContext* PascalParser::RepeatStatementContext::statements() {
  return getRuleContext<PascalParser::StatementsContext>(0);
}

tree::TerminalNode* PascalParser::RepeatStatementContext::UNTIL() {
  return getToken(PascalParser::UNTIL, 0);
}

PascalParser::ExpressionContext* PascalParser::RepeatStatementContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}


size_t PascalParser::RepeatStatementContext::getRuleIndex() const {
  return PascalParser::RuleRepeatStatement;
}


antlrcpp::Any PascalParser::RepeatStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRepeatStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RepeatStatementContext* PascalParser::repeatStatement() {
  RepeatStatementContext *_localctx = _tracker.createInstance<RepeatStatementContext>(_ctx, getState());
  enterRule(_localctx, 182, PascalParser::RuleRepeatStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(778);
    match(PascalParser::REPEAT);
    setState(779);
    statements();
    setState(780);
    match(PascalParser::UNTIL);
    setState(781);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ForStatementContext ------------------------------------------------------------------

PascalParser::ForStatementContext::ForStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ForStatementContext::FOR() {
  return getToken(PascalParser::FOR, 0);
}

PascalParser::IdentifierContext* PascalParser::ForStatementContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ForStatementContext::ASSIGN() {
  return getToken(PascalParser::ASSIGN, 0);
}

PascalParser::ForListContext* PascalParser::ForStatementContext::forList() {
  return getRuleContext<PascalParser::ForListContext>(0);
}

tree::TerminalNode* PascalParser::ForStatementContext::DO() {
  return getToken(PascalParser::DO, 0);
}

PascalParser::StatementContext* PascalParser::ForStatementContext::statement() {
  return getRuleContext<PascalParser::StatementContext>(0);
}


size_t PascalParser::ForStatementContext::getRuleIndex() const {
  return PascalParser::RuleForStatement;
}


antlrcpp::Any PascalParser::ForStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitForStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ForStatementContext* PascalParser::forStatement() {
  ForStatementContext *_localctx = _tracker.createInstance<ForStatementContext>(_ctx, getState());
  enterRule(_localctx, 184, PascalParser::RuleForStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(783);
    match(PascalParser::FOR);
    setState(784);
    identifier();
    setState(785);
    match(PascalParser::ASSIGN);
    setState(786);
    forList();
    setState(787);
    match(PascalParser::DO);
    setState(788);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ForListContext ------------------------------------------------------------------

PascalParser::ForListContext::ForListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::InitialValueContext* PascalParser::ForListContext::initialValue() {
  return getRuleContext<PascalParser::InitialValueContext>(0);
}

PascalParser::FinalValueContext* PascalParser::ForListContext::finalValue() {
  return getRuleContext<PascalParser::FinalValueContext>(0);
}

tree::TerminalNode* PascalParser::ForListContext::TO() {
  return getToken(PascalParser::TO, 0);
}

tree::TerminalNode* PascalParser::ForListContext::DOWNTO() {
  return getToken(PascalParser::DOWNTO, 0);
}


size_t PascalParser::ForListContext::getRuleIndex() const {
  return PascalParser::RuleForList;
}


antlrcpp::Any PascalParser::ForListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitForList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ForListContext* PascalParser::forList() {
  ForListContext *_localctx = _tracker.createInstance<ForListContext>(_ctx, getState());
  enterRule(_localctx, 186, PascalParser::RuleForList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(790);
    initialValue();
    setState(791);
    _la = _input->LA(1);
    if (!(_la == PascalParser::DOWNTO

    || _la == PascalParser::TO)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(792);
    finalValue();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InitialValueContext ------------------------------------------------------------------

PascalParser::InitialValueContext::InitialValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ExpressionContext* PascalParser::InitialValueContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}


size_t PascalParser::InitialValueContext::getRuleIndex() const {
  return PascalParser::RuleInitialValue;
}


antlrcpp::Any PascalParser::InitialValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitInitialValue(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::InitialValueContext* PascalParser::initialValue() {
  InitialValueContext *_localctx = _tracker.createInstance<InitialValueContext>(_ctx, getState());
  enterRule(_localctx, 188, PascalParser::RuleInitialValue);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(794);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FinalValueContext ------------------------------------------------------------------

PascalParser::FinalValueContext::FinalValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ExpressionContext* PascalParser::FinalValueContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}


size_t PascalParser::FinalValueContext::getRuleIndex() const {
  return PascalParser::RuleFinalValue;
}


antlrcpp::Any PascalParser::FinalValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFinalValue(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FinalValueContext* PascalParser::finalValue() {
  FinalValueContext *_localctx = _tracker.createInstance<FinalValueContext>(_ctx, getState());
  enterRule(_localctx, 190, PascalParser::RuleFinalValue);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(796);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WithStatementContext ------------------------------------------------------------------

PascalParser::WithStatementContext::WithStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::WithStatementContext::WITH() {
  return getToken(PascalParser::WITH, 0);
}

PascalParser::RecordVariableListContext* PascalParser::WithStatementContext::recordVariableList() {
  return getRuleContext<PascalParser::RecordVariableListContext>(0);
}

tree::TerminalNode* PascalParser::WithStatementContext::DO() {
  return getToken(PascalParser::DO, 0);
}

PascalParser::StatementContext* PascalParser::WithStatementContext::statement() {
  return getRuleContext<PascalParser::StatementContext>(0);
}


size_t PascalParser::WithStatementContext::getRuleIndex() const {
  return PascalParser::RuleWithStatement;
}


antlrcpp::Any PascalParser::WithStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitWithStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::WithStatementContext* PascalParser::withStatement() {
  WithStatementContext *_localctx = _tracker.createInstance<WithStatementContext>(_ctx, getState());
  enterRule(_localctx, 192, PascalParser::RuleWithStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(798);
    match(PascalParser::WITH);
    setState(799);
    recordVariableList();
    setState(800);
    match(PascalParser::DO);
    setState(801);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RecordVariableListContext ------------------------------------------------------------------

PascalParser::RecordVariableListContext::RecordVariableListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::VariableContext *> PascalParser::RecordVariableListContext::variable() {
  return getRuleContexts<PascalParser::VariableContext>();
}

PascalParser::VariableContext* PascalParser::RecordVariableListContext::variable(size_t i) {
  return getRuleContext<PascalParser::VariableContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::RecordVariableListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::RecordVariableListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::RecordVariableListContext::getRuleIndex() const {
  return PascalParser::RuleRecordVariableList;
}


antlrcpp::Any PascalParser::RecordVariableListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRecordVariableList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RecordVariableListContext* PascalParser::recordVariableList() {
  RecordVariableListContext *_localctx = _tracker.createInstance<RecordVariableListContext>(_ctx, getState());
  enterRule(_localctx, 194, PascalParser::RuleRecordVariableList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(803);
    variable();
    setState(808);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(804);
      match(PascalParser::COMMA);
      setState(805);
      variable();
      setState(810);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> PascalParser::_decisionToDFA;
atn::PredictionContextCache PascalParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN PascalParser::_atn;
std::vector<uint16_t> PascalParser::_serializedATN;

std::vector<std::string> PascalParser::_ruleNames = {
  "program", "programHeading", "identifier", "block", "usesUnitsPart", "labelDeclarationPart", 
  "label", "constantDefinitionPart", "constantDefinition", "constantChr", 
  "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", "sign", 
  "bool_", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
  "procedureType", "type_", "simpleType", "scalarType", "subrangeType", 
  "typeIdentifier", "structuredType", "unpackedStructuredType", "stringtype", 
  "arrayType", "typeList", "indexType", "componentType", "recordType", "fieldList", 
  "fixedPart", "recordSection", "variantPart", "tag", "variant", "setType", 
  "baseType", "fileType", "pointerType", "variableDeclarationPart", "variableDeclaration", 
  "procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
  "procedureDeclaration", "formalParameterList", "formalParameterSection", 
  "parameterGroup", "identifierList", "constList", "functionDeclaration", 
  "resultType", "statement", "unlabelledStatement", "simpleStatement", "assignmentStatement", 
  "variable", "expression", "relationaloperator", "simpleExpression", "additiveoperator", 
  "term", "multiplicativeoperator", "signedFactor", "factor", "unsignedConstant", 
  "functionDesignator", "parameterList", "set_", "elementList", "element", 
  "procedureStatement", "actualParameter", "parameterwidth", "gotoStatement", 
  "breakStatement", "emptyStatement_", "empty_", "structuredStatement", 
  "compoundStatement", "statements", "conditionalStatement", "ifStatement", 
  "caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
  "repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
  "withStatement", "recordVariableList"
};

std::vector<std::string> PascalParser::_literalNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", 
  "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", 
  "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
};

std::vector<std::string> PascalParser::_symbolicNames = {
  "", "AND", "ARRAY", "ASM", "BEGIN", "BREAK", "CASE", "CONST", "CONSTRUCTOR", 
  "CONTINUE", "DESTRUCTOR", "DIV", "DO", "DOWNTO", "ELSE", "END", "FALSE", 
  "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IMPLEMENTATION", "IN", "INLINE", 
  "INTERFACE", "LABEL", "MOD", "NIL", "NOT", "OBJECT", "OF", "ON", "OPERATOR", 
  "OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", "REPEAT", "SET", "SHL", 
  "SHR", "STRING", "THEN", "TO", "TRUE", "TYPE", "UNIT", "UNTIL", "USES", 
  "VAR", "WHILE", "WITH", "XOR", "CHR", "CHAR", "BOOLEAN", "INTEGER", "REAL", 
  "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
  "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
  "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
  "RCURLY", "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", 
  "NUM_REAL"
};

dfa::Vocabulary PascalParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> PascalParser::_tokenNames;

PascalParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x5e, 0x32e, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x4, 
    0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 0x15, 
    0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 0x9, 0x17, 0x4, 0x18, 0x9, 
    0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 
    0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 
    0x1f, 0x9, 0x1f, 0x4, 0x20, 0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 
    0x9, 0x22, 0x4, 0x23, 0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x4, 0x25, 0x9, 
    0x25, 0x4, 0x26, 0x9, 0x26, 0x4, 0x27, 0x9, 0x27, 0x4, 0x28, 0x9, 0x28, 
    0x4, 0x29, 0x9, 0x29, 0x4, 0x2a, 0x9, 0x2a, 0x4, 0x2b, 0x9, 0x2b, 0x4, 
    0x2c, 0x9, 0x2c, 0x4, 0x2d, 0x9, 0x2d, 0x4, 0x2e, 0x9, 0x2e, 0x4, 0x2f, 
    0x9, 0x2f, 0x4, 0x30, 0x9, 0x30, 0x4, 0x31, 0x9, 0x31, 0x4, 0x32, 0x9, 
    0x32, 0x4, 0x33, 0x9, 0x33, 0x4, 0x34, 0x9, 0x34, 0x4, 0x35, 0x9, 0x35, 
    0x4, 0x36, 0x9, 0x36, 0x4, 0x37, 0x9, 0x37, 0x4, 0x38, 0x9, 0x38, 0x4, 
    0x39, 0x9, 0x39, 0x4, 0x3a, 0x9, 0x3a, 0x4, 0x3b, 0x9, 0x3b, 0x4, 0x3c, 
    0x9, 0x3c, 0x4, 0x3d, 0x9, 0x3d, 0x4, 0x3e, 0x9, 0x3e, 0x4, 0x3f, 0x9, 
    0x3f, 0x4, 0x40, 0x9, 0x40, 0x4, 0x41, 0x9, 0x41, 0x4, 0x42, 0x9, 0x42, 
    0x4, 0x43, 0x9, 0x43, 0x4, 0x44, 0x9, 0x44, 0x4, 0x45, 0x9, 0x45, 0x4, 
    0x46, 0x9, 0x46, 0x4, 0x47, 0x9, 0x47, 0x4, 0x48, 0x9, 0x48, 0x4, 0x49, 
    0x9, 0x49, 0x4, 0x4a, 0x9, 0x4a, 0x4, 0x4b, 0x9, 0x4b, 0x4, 0x4c, 0x9, 
    0x4c, 0x4, 0x4d, 0x9, 0x4d, 0x4, 0x4e, 0x9, 0x4e, 0x4, 0x4f, 0x9, 0x4f, 
    0x4, 0x50, 0x9, 0x50, 0x4, 0x51, 0x9, 0x51, 0x4, 0x52, 0x9, 0x52, 0x4, 
    0x53, 0x9, 0x53, 0x4, 0x54, 0x9, 0x54, 0x4, 0x55, 0x9, 0x55, 0x4, 0x56, 
    0x9, 0x56, 0x4, 0x57, 0x9, 0x57, 0x4, 0x58, 0x9, 0x58, 0x4, 0x59, 0x9, 
    0x59, 0x4, 0x5a, 0x9, 0x5a, 0x4, 0x5b, 0x9, 0x5b, 0x4, 0x5c, 0x9, 0x5c, 
    0x4, 0x5d, 0x9, 0x5d, 0x4, 0x5e, 0x9, 0x5e, 0x4, 0x5f, 0x9, 0x5f, 0x4, 
    0x60, 0x9, 0x60, 0x4, 0x61, 0x9, 0x61, 0x4, 0x62, 0x9, 0x62, 0x4, 0x63, 
    0x9, 0x63, 0x3, 0x2, 0x3, 0x2, 0x5, 0x2, 0xc9, 0xa, 0x2, 0x3, 0x2, 0x3, 
    0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x5, 0x3, 0xd5, 0xa, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0xdd, 0xa, 0x3, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
    0x5, 0x7, 0x5, 0xe8, 0xa, 0x5, 0xc, 0x5, 0xe, 0x5, 0xeb, 0xb, 0x5, 0x3, 
    0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 
    0x7, 0x3, 0x7, 0x3, 0x7, 0x7, 0x7, 0xf7, 0xa, 0x7, 0xc, 0x7, 0xe, 0x7, 
    0xfa, 0xb, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x3, 0x9, 0x6, 0x9, 0x104, 0xa, 0x9, 0xd, 0x9, 0xe, 0x9, 
    0x105, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 
    0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x11b, 
    0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0x11f, 0xa, 0xd, 0x3, 0xe, 0x3, 
    0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x6, 
    0x13, 0x12f, 0xa, 0x13, 0xd, 0x13, 0xe, 0x13, 0x130, 0x3, 0x14, 0x3, 
    0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 0x138, 0xa, 0x14, 
    0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0x13c, 0xa, 0x15, 0x3, 0x15, 0x3, 0x15, 
    0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0x143, 0xa, 0x16, 0x3, 0x17, 
    0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 0x148, 0xa, 0x17, 0x3, 0x18, 0x3, 0x18, 
    0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x14e, 0xa, 0x18, 0x3, 0x19, 0x3, 0x19, 
    0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
    0x1b, 0x3, 0x1b, 0x5, 0x1b, 0x15a, 0xa, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 
    0x3, 0x1c, 0x5, 0x1c, 0x15f, 0xa, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 
    0x3, 0x1d, 0x5, 0x1d, 0x165, 0xa, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 
    0x3, 0x1e, 0x5, 0x1e, 0x16b, 0xa, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1f, 
    0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 
    0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
    0x5, 0x1f, 0x17d, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x7, 0x20, 
    0x182, 0xa, 0x20, 0xc, 0x20, 0xe, 0x20, 0x185, 0xb, 0x20, 0x3, 0x21, 
    0x3, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 
    0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x192, 0xa, 0x24, 
    0x3, 0x24, 0x5, 0x24, 0x195, 0xa, 0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 
    0x7, 0x25, 0x19a, 0xa, 0x25, 0xc, 0x25, 0xe, 0x25, 0x19d, 0xb, 0x25, 
    0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x5, 0x26, 0x1a4, 
    0xa, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 
    0x27, 0x7, 0x27, 0x1ac, 0xa, 0x27, 0xc, 0x27, 0xe, 0x27, 0x1af, 0xb, 
    0x27, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x5, 0x28, 
    0x1b6, 0xa, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
    0x3, 0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2b, 0x3, 
    0x2b, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x1c8, 
    0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 
    0x2e, 0x3, 0x2e, 0x7, 0x2e, 0x1d1, 0xa, 0x2e, 0xc, 0x2e, 0xe, 0x2e, 
    0x1d4, 0xb, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 
    0x3, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x31, 0x3, 0x31, 0x5, 
    0x31, 0x1e1, 0xa, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 
    0x1e6, 0xa, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x33, 0x3, 0x33, 
    0x3, 0x33, 0x3, 0x33, 0x7, 0x33, 0x1ef, 0xa, 0x33, 0xc, 0x33, 0xe, 0x33, 
    0x1f2, 0xb, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
    0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x5, 
    0x34, 0x1ff, 0xa, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 
    0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x7, 0x36, 0x208, 0xa, 0x36, 0xc, 0x36, 
    0xe, 0x36, 0x20b, 0xb, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x7, 0x37, 
    0x210, 0xa, 0x37, 0xc, 0x37, 0xe, 0x37, 0x213, 0xb, 0x37, 0x3, 0x38, 
    0x3, 0x38, 0x3, 0x38, 0x5, 0x38, 0x218, 0xa, 0x38, 0x3, 0x38, 0x3, 0x38, 
    0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 0x3a, 0x3, 
    0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x5, 0x3a, 0x226, 0xa, 0x3a, 
    0x3, 0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x22a, 0xa, 0x3b, 0x3, 0x3c, 0x3, 0x3c, 
    0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x231, 0xa, 0x3c, 0x3, 0x3d, 
    0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x5, 
    0x3e, 0x23a, 0xa, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 
    0x7, 0x3e, 0x240, 0xa, 0x3e, 0xc, 0x3e, 0xe, 0x3e, 0x243, 0xb, 0x3e, 
    0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x7, 
    0x3e, 0x24b, 0xa, 0x3e, 0xc, 0x3e, 0xe, 0x3e, 0x24e, 0xb, 0x3e, 0x3, 
    0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x7, 0x3e, 0x255, 
    0xa, 0x3e, 0xc, 0x3e, 0xe, 0x3e, 0x258, 0xb, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 
    0x3, 0x3f, 0x3, 0x3f, 0x5, 0x3f, 0x25e, 0xa, 0x3f, 0x3, 0x40, 0x3, 0x40, 
    0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x5, 0x41, 0x266, 0xa, 0x41, 
    0x3, 0x42, 0x3, 0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x5, 
    0x43, 0x26e, 0xa, 0x43, 0x3, 0x44, 0x3, 0x44, 0x3, 0x45, 0x5, 0x45, 
    0x273, 0xa, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 
    0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 0x46, 0x3, 
    0x46, 0x3, 0x46, 0x5, 0x46, 0x282, 0xa, 0x46, 0x3, 0x47, 0x3, 0x47, 
    0x3, 0x47, 0x3, 0x47, 0x5, 0x47, 0x288, 0xa, 0x47, 0x3, 0x48, 0x3, 0x48, 
    0x3, 0x48, 0x5, 0x48, 0x28d, 0xa, 0x48, 0x3, 0x48, 0x5, 0x48, 0x290, 
    0xa, 0x48, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x7, 0x49, 0x295, 0xa, 0x49, 
    0xc, 0x49, 0xe, 0x49, 0x298, 0xb, 0x49, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 
    0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4a, 0x5, 0x4a, 0x2a2, 
    0xa, 0x4a, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x7, 0x4b, 0x2a7, 0xa, 0x4b, 
    0xc, 0x4b, 0xe, 0x4b, 0x2aa, 0xb, 0x4b, 0x3, 0x4b, 0x5, 0x4b, 0x2ad, 
    0xa, 0x4b, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x5, 0x4c, 0x2b2, 0xa, 0x4c, 
    0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x5, 0x4d, 0x2b7, 0xa, 0x4d, 0x3, 0x4d, 
    0x5, 0x4d, 0x2ba, 0xa, 0x4d, 0x3, 0x4e, 0x3, 0x4e, 0x7, 0x4e, 0x2be, 
    0xa, 0x4e, 0xc, 0x4e, 0xe, 0x4e, 0x2c1, 0xb, 0x4e, 0x3, 0x4f, 0x3, 0x4f, 
    0x3, 0x4f, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x51, 0x3, 0x51, 0x3, 
    0x52, 0x3, 0x52, 0x3, 0x53, 0x3, 0x53, 0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 
    0x3, 0x54, 0x5, 0x54, 0x2d3, 0xa, 0x54, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 
    0x3, 0x55, 0x3, 0x56, 0x3, 0x56, 0x3, 0x56, 0x7, 0x56, 0x2dc, 0xa, 0x56, 
    0xc, 0x56, 0xe, 0x56, 0x2df, 0xb, 0x56, 0x3, 0x57, 0x3, 0x57, 0x5, 0x57, 
    0x2e3, 0xa, 0x57, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 
    0x3, 0x58, 0x5, 0x58, 0x2eb, 0xa, 0x58, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 
    0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x7, 0x59, 0x2f3, 0xa, 0x59, 0xc, 0x59, 
    0xe, 0x59, 0x2f6, 0xb, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x59, 0x5, 0x59, 
    0x2fb, 0xa, 0x59, 0x3, 0x59, 0x3, 0x59, 0x3, 0x5a, 0x3, 0x5a, 0x3, 0x5a, 
    0x3, 0x5a, 0x3, 0x5b, 0x3, 0x5b, 0x3, 0x5b, 0x5, 0x5b, 0x306, 0xa, 0x5b, 
    0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5d, 0x3, 
    0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 
    0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5f, 0x3, 0x5f, 0x3, 
    0x5f, 0x3, 0x5f, 0x3, 0x60, 0x3, 0x60, 0x3, 0x61, 0x3, 0x61, 0x3, 0x62, 
    0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x63, 0x3, 0x63, 0x3, 
    0x63, 0x7, 0x63, 0x329, 0xa, 0x63, 0xc, 0x63, 0xe, 0x63, 0x32c, 0xb, 
    0x63, 0x3, 0x63, 0x2, 0x2, 0x64, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 
    0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 
    0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 
    0x40, 0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 
    0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 0x6e, 
    0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 0x84, 0x86, 
    0x88, 0x8a, 0x8c, 0x8e, 0x90, 0x92, 0x94, 0x96, 0x98, 0x9a, 0x9c, 0x9e, 
    0xa0, 0xa2, 0xa4, 0xa6, 0xa8, 0xaa, 0xac, 0xae, 0xb0, 0xb2, 0xb4, 0xb6, 
    0xb8, 0xba, 0xbc, 0xbe, 0xc0, 0xc2, 0xc4, 0x2, 0x9, 0x3, 0x2, 0x3e, 
    0x3f, 0x4, 0x2, 0x12, 0x12, 0x30, 0x30, 0x4, 0x2, 0x2d, 0x2d, 0x3a, 
    0x3d, 0x4, 0x2, 0x19, 0x19, 0x46, 0x4b, 0x4, 0x2, 0x24, 0x24, 0x3e, 
    0x3f, 0x6, 0x2, 0x3, 0x3, 0xd, 0xd, 0x1d, 0x1d, 0x40, 0x41, 0x4, 0x2, 
    0xf, 0xf, 0x2f, 0x2f, 0x2, 0x330, 0x2, 0xc6, 0x3, 0x2, 0x2, 0x2, 0x4, 
    0xdc, 0x3, 0x2, 0x2, 0x2, 0x6, 0xde, 0x3, 0x2, 0x2, 0x2, 0x8, 0xe9, 
    0x3, 0x2, 0x2, 0x2, 0xa, 0xee, 0x3, 0x2, 0x2, 0x2, 0xc, 0xf2, 0x3, 0x2, 
    0x2, 0x2, 0xe, 0xfd, 0x3, 0x2, 0x2, 0x2, 0x10, 0xff, 0x3, 0x2, 0x2, 
    0x2, 0x12, 0x107, 0x3, 0x2, 0x2, 0x2, 0x14, 0x10b, 0x3, 0x2, 0x2, 0x2, 
    0x16, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x18, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x1a, 
    0x120, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x122, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x124, 
    0x3, 0x2, 0x2, 0x2, 0x20, 0x126, 0x3, 0x2, 0x2, 0x2, 0x22, 0x128, 0x3, 
    0x2, 0x2, 0x2, 0x24, 0x12a, 0x3, 0x2, 0x2, 0x2, 0x26, 0x132, 0x3, 0x2, 
    0x2, 0x2, 0x28, 0x139, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x140, 0x3, 0x2, 0x2, 
    0x2, 0x2c, 0x147, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x14d, 0x3, 0x2, 0x2, 0x2, 
    0x30, 0x14f, 0x3, 0x2, 0x2, 0x2, 0x32, 0x153, 0x3, 0x2, 0x2, 0x2, 0x34, 
    0x159, 0x3, 0x2, 0x2, 0x2, 0x36, 0x15e, 0x3, 0x2, 0x2, 0x2, 0x38, 0x164, 
    0x3, 0x2, 0x2, 0x2, 0x3a, 0x166, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x17c, 0x3, 
    0x2, 0x2, 0x2, 0x3e, 0x17e, 0x3, 0x2, 0x2, 0x2, 0x40, 0x186, 0x3, 0x2, 
    0x2, 0x2, 0x42, 0x188, 0x3, 0x2, 0x2, 0x2, 0x44, 0x18a, 0x3, 0x2, 0x2, 
    0x2, 0x46, 0x194, 0x3, 0x2, 0x2, 0x2, 0x48, 0x196, 0x3, 0x2, 0x2, 0x2, 
    0x4a, 0x1a3, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x1a5, 0x3, 0x2, 0x2, 0x2, 0x4e, 
    0x1b5, 0x3, 0x2, 0x2, 0x2, 0x50, 0x1b7, 0x3, 0x2, 0x2, 0x2, 0x52, 0x1bd, 
    0x3, 0x2, 0x2, 0x2, 0x54, 0x1c1, 0x3, 0x2, 0x2, 0x2, 0x56, 0x1c7, 0x3, 
    0x2, 0x2, 0x2, 0x58, 0x1c9, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x1cc, 0x3, 0x2, 
    0x2, 0x2, 0x5c, 0x1d7, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x1db, 0x3, 0x2, 0x2, 
    0x2, 0x60, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x62, 0x1e2, 0x3, 0x2, 0x2, 0x2, 
    0x64, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x66, 0x1fe, 0x3, 0x2, 0x2, 0x2, 0x68, 
    0x200, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x204, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x20c, 
    0x3, 0x2, 0x2, 0x2, 0x6e, 0x214, 0x3, 0x2, 0x2, 0x2, 0x70, 0x21e, 0x3, 
    0x2, 0x2, 0x2, 0x72, 0x225, 0x3, 0x2, 0x2, 0x2, 0x74, 0x229, 0x3, 0x2, 
    0x2, 0x2, 0x76, 0x230, 0x3, 0x2, 0x2, 0x2, 0x78, 0x232, 0x3, 0x2, 0x2, 
    0x2, 0x7a, 0x239, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x259, 0x3, 0x2, 0x2, 0x2, 
    0x7e, 0x25f, 0x3, 0x2, 0x2, 0x2, 0x80, 0x261, 0x3, 0x2, 0x2, 0x2, 0x82, 
    0x267, 0x3, 0x2, 0x2, 0x2, 0x84, 0x269, 0x3, 0x2, 0x2, 0x2, 0x86, 0x26f, 
    0x3, 0x2, 0x2, 0x2, 0x88, 0x272, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x281, 0x3, 
    0x2, 0x2, 0x2, 0x8c, 0x287, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x289, 0x3, 0x2, 
    0x2, 0x2, 0x90, 0x291, 0x3, 0x2, 0x2, 0x2, 0x92, 0x2a1, 0x3, 0x2, 0x2, 
    0x2, 0x94, 0x2ac, 0x3, 0x2, 0x2, 0x2, 0x96, 0x2ae, 0x3, 0x2, 0x2, 0x2, 
    0x98, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x9c, 
    0x2c2, 0x3, 0x2, 0x2, 0x2, 0x9e, 0x2c5, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x2c8, 
    0x3, 0x2, 0x2, 0x2, 0xa2, 0x2ca, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x2cc, 0x3, 
    0x2, 0x2, 0x2, 0xa6, 0x2d2, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x2d4, 0x3, 0x2, 
    0x2, 0x2, 0xaa, 0x2d8, 0x3, 0x2, 0x2, 0x2, 0xac, 0x2e2, 0x3, 0x2, 0x2, 
    0x2, 0xae, 0x2e4, 0x3, 0x2, 0x2, 0x2, 0xb0, 0x2ec, 0x3, 0x2, 0x2, 0x2, 
    0xb2, 0x2fe, 0x3, 0x2, 0x2, 0x2, 0xb4, 0x305, 0x3, 0x2, 0x2, 0x2, 0xb6, 
    0x307, 0x3, 0x2, 0x2, 0x2, 0xb8, 0x30c, 0x3, 0x2, 0x2, 0x2, 0xba, 0x311, 
    0x3, 0x2, 0x2, 0x2, 0xbc, 0x318, 0x3, 0x2, 0x2, 0x2, 0xbe, 0x31c, 0x3, 
    0x2, 0x2, 0x2, 0xc0, 0x31e, 0x3, 0x2, 0x2, 0x2, 0xc2, 0x320, 0x3, 0x2, 
    0x2, 0x2, 0xc4, 0x325, 0x3, 0x2, 0x2, 0x2, 0xc6, 0xc8, 0x5, 0x4, 0x3, 
    0x2, 0xc7, 0xc9, 0x7, 0x1b, 0x2, 0x2, 0xc8, 0xc7, 0x3, 0x2, 0x2, 0x2, 
    0xc8, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xc9, 0xca, 0x3, 0x2, 0x2, 0x2, 0xca, 
    0xcb, 0x5, 0x8, 0x5, 0x2, 0xcb, 0xcc, 0x7, 0x54, 0x2, 0x2, 0xcc, 0xcd, 
    0x7, 0x2, 0x2, 0x3, 0xcd, 0x3, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x7, 
    0x27, 0x2, 0x2, 0xcf, 0xd4, 0x5, 0x6, 0x4, 0x2, 0xd0, 0xd1, 0x7, 0x4c, 
    0x2, 0x2, 0xd1, 0xd2, 0x5, 0x6a, 0x36, 0x2, 0xd2, 0xd3, 0x7, 0x4d, 0x2, 
    0x2, 0xd3, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd0, 0x3, 0x2, 0x2, 0x2, 
    0xd4, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xd5, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xd6, 
    0xd7, 0x7, 0x44, 0x2, 0x2, 0xd7, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xd8, 0xd9, 
    0x7, 0x32, 0x2, 0x2, 0xd9, 0xda, 0x5, 0x6, 0x4, 0x2, 0xda, 0xdb, 0x7, 
    0x44, 0x2, 0x2, 0xdb, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xce, 0x3, 0x2, 
    0x2, 0x2, 0xdc, 0xd8, 0x3, 0x2, 0x2, 0x2, 0xdd, 0x5, 0x3, 0x2, 0x2, 
    0x2, 0xde, 0xdf, 0x7, 0x5b, 0x2, 0x2, 0xdf, 0x7, 0x3, 0x2, 0x2, 0x2, 
    0xe0, 0xe8, 0x5, 0xc, 0x7, 0x2, 0xe1, 0xe8, 0x5, 0x10, 0x9, 0x2, 0xe2, 
    0xe8, 0x5, 0x24, 0x13, 0x2, 0xe3, 0xe8, 0x5, 0x5a, 0x2e, 0x2, 0xe4, 
    0xe8, 0x5, 0x5e, 0x30, 0x2, 0xe5, 0xe8, 0x5, 0xa, 0x6, 0x2, 0xe6, 0xe8, 
    0x7, 0x18, 0x2, 0x2, 0xe7, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe1, 0x3, 
    0x2, 0x2, 0x2, 0xe7, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe3, 0x3, 0x2, 
    0x2, 0x2, 0xe7, 0xe4, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe5, 0x3, 0x2, 0x2, 
    0x2, 0xe7, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xeb, 0x3, 0x2, 0x2, 0x2, 
    0xe9, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xea, 0x3, 0x2, 0x2, 0x2, 0xea, 
    0xec, 0x3, 0x2, 0x2, 0x2, 0xeb, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xec, 0xed, 
    0x5, 0xa8, 0x55, 0x2, 0xed, 0x9, 0x3, 0x2, 0x2, 0x2, 0xee, 0xef, 0x7, 
    0x34, 0x2, 0x2, 0xef, 0xf0, 0x5, 0x6a, 0x36, 0x2, 0xf0, 0xf1, 0x7, 0x44, 
    0x2, 0x2, 0xf1, 0xb, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xf3, 0x7, 0x1c, 0x2, 
    0x2, 0xf3, 0xf8, 0x5, 0xe, 0x8, 0x2, 0xf4, 0xf5, 0x7, 0x43, 0x2, 0x2, 
    0xf5, 0xf7, 0x5, 0xe, 0x8, 0x2, 0xf6, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xf7, 
    0xfa, 0x3, 0x2, 0x2, 0x2, 0xf8, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf8, 0xf9, 
    0x3, 0x2, 0x2, 0x2, 0xf9, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xf8, 0x3, 
    0x2, 0x2, 0x2, 0xfb, 0xfc, 0x7, 0x44, 0x2, 0x2, 0xfc, 0xd, 0x3, 0x2, 
    0x2, 0x2, 0xfd, 0xfe, 0x5, 0x1a, 0xe, 0x2, 0xfe, 0xf, 0x3, 0x2, 0x2, 
    0x2, 0xff, 0x103, 0x7, 0x9, 0x2, 0x2, 0x100, 0x101, 0x5, 0x12, 0xa, 
    0x2, 0x101, 0x102, 0x7, 0x44, 0x2, 0x2, 0x102, 0x104, 0x3, 0x2, 0x2, 
    0x2, 0x103, 0x100, 0x3, 0x2, 0x2, 0x2, 0x104, 0x105, 0x3, 0x2, 0x2, 
    0x2, 0x105, 0x103, 0x3, 0x2, 0x2, 0x2, 0x105, 0x106, 0x3, 0x2, 0x2, 
    0x2, 0x106, 0x11, 0x3, 0x2, 0x2, 0x2, 0x107, 0x108, 0x5, 0x6, 0x4, 0x2, 
    0x108, 0x109, 0x7, 0x46, 0x2, 0x2, 0x109, 0x10a, 0x5, 0x16, 0xc, 0x2, 
    0x10a, 0x13, 0x3, 0x2, 0x2, 0x2, 0x10b, 0x10c, 0x7, 0x39, 0x2, 0x2, 
    0x10c, 0x10d, 0x7, 0x4c, 0x2, 0x2, 0x10d, 0x10e, 0x5, 0x1a, 0xe, 0x2, 
    0x10e, 0x10f, 0x7, 0x4d, 0x2, 0x2, 0x10f, 0x15, 0x3, 0x2, 0x2, 0x2, 
    0x110, 0x11b, 0x5, 0x18, 0xd, 0x2, 0x111, 0x112, 0x5, 0x1e, 0x10, 0x2, 
    0x112, 0x113, 0x5, 0x18, 0xd, 0x2, 0x113, 0x11b, 0x3, 0x2, 0x2, 0x2, 
    0x114, 0x11b, 0x5, 0x6, 0x4, 0x2, 0x115, 0x116, 0x5, 0x1e, 0x10, 0x2, 
    0x116, 0x117, 0x5, 0x6, 0x4, 0x2, 0x117, 0x11b, 0x3, 0x2, 0x2, 0x2, 
    0x118, 0x11b, 0x5, 0x22, 0x12, 0x2, 0x119, 0x11b, 0x5, 0x14, 0xb, 0x2, 
    0x11a, 0x110, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x111, 0x3, 0x2, 0x2, 0x2, 
    0x11a, 0x114, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x115, 0x3, 0x2, 0x2, 0x2, 
    0x11a, 0x118, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x119, 0x3, 0x2, 0x2, 0x2, 
    0x11b, 0x17, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x11f, 0x5, 0x1a, 0xe, 0x2, 
    0x11d, 0x11f, 0x5, 0x1c, 0xf, 0x2, 0x11e, 0x11c, 0x3, 0x2, 0x2, 0x2, 
    0x11e, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x11f, 0x19, 0x3, 0x2, 0x2, 0x2, 0x120, 
    0x121, 0x7, 0x5d, 0x2, 0x2, 0x121, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x122, 
    0x123, 0x7, 0x5e, 0x2, 0x2, 0x123, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x124, 
    0x125, 0x9, 0x2, 0x2, 0x2, 0x125, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x126, 0x127, 
    0x9, 0x3, 0x2, 0x2, 0x127, 0x21, 0x3, 0x2, 0x2, 0x2, 0x128, 0x129, 0x7, 
    0x5c, 0x2, 0x2, 0x129, 0x23, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x12e, 0x7, 
    0x31, 0x2, 0x2, 0x12b, 0x12c, 0x5, 0x26, 0x14, 0x2, 0x12c, 0x12d, 0x7, 
    0x44, 0x2, 0x2, 0x12d, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x12b, 0x3, 
    0x2, 0x2, 0x2, 0x12f, 0x130, 0x3, 0x2, 0x2, 0x2, 0x130, 0x12e, 0x3, 
    0x2, 0x2, 0x2, 0x130, 0x131, 0x3, 0x2, 0x2, 0x2, 0x131, 0x25, 0x3, 0x2, 
    0x2, 0x2, 0x132, 0x133, 0x5, 0x6, 0x4, 0x2, 0x133, 0x137, 0x7, 0x46, 
    0x2, 0x2, 0x134, 0x138, 0x5, 0x2c, 0x17, 0x2, 0x135, 0x138, 0x5, 0x28, 
    0x15, 0x2, 0x136, 0x138, 0x5, 0x2a, 0x16, 0x2, 0x137, 0x134, 0x3, 0x2, 
    0x2, 0x2, 0x137, 0x135, 0x3, 0x2, 0x2, 0x2, 0x137, 0x136, 0x3, 0x2, 
    0x2, 0x2, 0x138, 0x27, 0x3, 0x2, 0x2, 0x2, 0x139, 0x13b, 0x7, 0x15, 
    0x2, 0x2, 0x13a, 0x13c, 0x5, 0x64, 0x33, 0x2, 0x13b, 0x13a, 0x3, 0x2, 
    0x2, 0x2, 0x13b, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x13c, 0x13d, 0x3, 0x2, 
    0x2, 0x2, 0x13d, 0x13e, 0x7, 0x45, 0x2, 0x2, 0x13e, 0x13f, 0x5, 0x70, 
    0x39, 0x2, 0x13f, 0x29, 0x3, 0x2, 0x2, 0x2, 0x140, 0x142, 0x7, 0x26, 
    0x2, 0x2, 0x141, 0x143, 0x5, 0x64, 0x33, 0x2, 0x142, 0x141, 0x3, 0x2, 
    0x2, 0x2, 0x142, 0x143, 0x3, 0x2, 0x2, 0x2, 0x143, 0x2b, 0x3, 0x2, 0x2, 
    0x2, 0x144, 0x148, 0x5, 0x2e, 0x18, 0x2, 0x145, 0x148, 0x5, 0x36, 0x1c, 
    0x2, 0x146, 0x148, 0x5, 0x58, 0x2d, 0x2, 0x147, 0x144, 0x3, 0x2, 0x2, 
    0x2, 0x147, 0x145, 0x3, 0x2, 0x2, 0x2, 0x147, 0x146, 0x3, 0x2, 0x2, 
    0x2, 0x148, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x149, 0x14e, 0x5, 0x30, 0x19, 
    0x2, 0x14a, 0x14e, 0x5, 0x32, 0x1a, 0x2, 0x14b, 0x14e, 0x5, 0x34, 0x1b, 
    0x2, 0x14c, 0x14e, 0x5, 0x3a, 0x1e, 0x2, 0x14d, 0x149, 0x3, 0x2, 0x2, 
    0x2, 0x14d, 0x14a, 0x3, 0x2, 0x2, 0x2, 0x14d, 0x14b, 0x3, 0x2, 0x2, 
    0x2, 0x14d, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x14e, 0x2f, 0x3, 0x2, 0x2, 0x2, 
    0x14f, 0x150, 0x7, 0x4c, 0x2, 0x2, 0x150, 0x151, 0x5, 0x6a, 0x36, 0x2, 
    0x151, 0x152, 0x7, 0x4d, 0x2, 0x2, 0x152, 0x31, 0x3, 0x2, 0x2, 0x2, 
    0x153, 0x154, 0x5, 0x16, 0xc, 0x2, 0x154, 0x155, 0x7, 0x55, 0x2, 0x2, 
    0x155, 0x156, 0x5, 0x16, 0xc, 0x2, 0x156, 0x33, 0x3, 0x2, 0x2, 0x2, 
    0x157, 0x15a, 0x5, 0x6, 0x4, 0x2, 0x158, 0x15a, 0x9, 0x4, 0x2, 0x2, 
    0x159, 0x157, 0x3, 0x2, 0x2, 0x2, 0x159, 0x158, 0x3, 0x2, 0x2, 0x2, 
    0x15a, 0x35, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x15c, 0x7, 0x25, 0x2, 0x2, 
    0x15c, 0x15f, 0x5, 0x38, 0x1d, 0x2, 0x15d, 0x15f, 0x5, 0x38, 0x1d, 0x2, 
    0x15e, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x15e, 0x15d, 0x3, 0x2, 0x2, 0x2, 
    0x15f, 0x37, 0x3, 0x2, 0x2, 0x2, 0x160, 0x165, 0x5, 0x3c, 0x1f, 0x2, 
    0x161, 0x165, 0x5, 0x44, 0x23, 0x2, 0x162, 0x165, 0x5, 0x52, 0x2a, 0x2, 
    0x163, 0x165, 0x5, 0x56, 0x2c, 0x2, 0x164, 0x160, 0x3, 0x2, 0x2, 0x2, 
    0x164, 0x161, 0x3, 0x2, 0x2, 0x2, 0x164, 0x162, 0x3, 0x2, 0x2, 0x2, 
    0x164, 0x163, 0x3, 0x2, 0x2, 0x2, 0x165, 0x39, 0x3, 0x2, 0x2, 0x2, 0x166, 
    0x167, 0x7, 0x2d, 0x2, 0x2, 0x167, 0x16a, 0x7, 0x4e, 0x2, 0x2, 0x168, 
    0x16b, 0x5, 0x6, 0x4, 0x2, 0x169, 0x16b, 0x5, 0x18, 0xd, 0x2, 0x16a, 
    0x168, 0x3, 0x2, 0x2, 0x2, 0x16a, 0x169, 0x3, 0x2, 0x2, 0x2, 0x16b, 
    0x16c, 0x3, 0x2, 0x2, 0x2, 0x16c, 0x16d, 0x7, 0x50, 0x2, 0x2, 0x16d, 
    0x3b, 0x3, 0x2, 0x2, 0x2, 0x16e, 0x16f, 0x7, 0x4, 0x2, 0x2, 0x16f, 0x170, 
    0x7, 0x4e, 0x2, 0x2, 0x170, 0x171, 0x5, 0x3e, 0x20, 0x2, 0x171, 0x172, 
    0x7, 0x50, 0x2, 0x2, 0x172, 0x173, 0x7, 0x21, 0x2, 0x2, 0x173, 0x174, 
    0x5, 0x42, 0x22, 0x2, 0x174, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x175, 0x176, 
    0x7, 0x4, 0x2, 0x2, 0x176, 0x177, 0x7, 0x4f, 0x2, 0x2, 0x177, 0x178, 
    0x5, 0x3e, 0x20, 0x2, 0x178, 0x179, 0x7, 0x51, 0x2, 0x2, 0x179, 0x17a, 
    0x7, 0x21, 0x2, 0x2, 0x17a, 0x17b, 0x5, 0x42, 0x22, 0x2, 0x17b, 0x17d, 
    0x3, 0x2, 0x2, 0x2, 0x17c, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x17c, 0x175, 
    0x3, 0x2, 0x2, 0x2, 0x17d, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x17e, 0x183, 0x5, 
    0x40, 0x21, 0x2, 0x17f, 0x180, 0x7, 0x43, 0x2, 0x2, 0x180, 0x182, 0x5, 
    0x40, 0x21, 0x2, 0x181, 0x17f, 0x3, 0x2, 0x2, 0x2, 0x182, 0x185, 0x3, 
    0x2, 0x2, 0x2, 0x183, 0x181, 0x3, 0x2, 0x2, 0x2, 0x183, 0x184, 0x3, 
    0x2, 0x2, 0x2, 0x184, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x185, 0x183, 0x3, 0x2, 
    0x2, 0x2, 0x186, 0x187, 0x5, 0x2e, 0x18, 0x2, 0x187, 0x41, 0x3, 0x2, 
    0x2, 0x2, 0x188, 0x189, 0x5, 0x2c, 0x17, 0x2, 0x189, 0x43, 0x3, 0x2, 
    0x2, 0x2, 0x18a, 0x18b, 0x7, 0x28, 0x2, 0x2, 0x18b, 0x18c, 0x5, 0x46, 
    0x24, 0x2, 0x18c, 0x18d, 0x7, 0x11, 0x2, 0x2, 0x18d, 0x45, 0x3, 0x2, 
    0x2, 0x2, 0x18e, 0x191, 0x5, 0x48, 0x25, 0x2, 0x18f, 0x190, 0x7, 0x44, 
    0x2, 0x2, 0x190, 0x192, 0x5, 0x4c, 0x27, 0x2, 0x191, 0x18f, 0x3, 0x2, 
    0x2, 0x2, 0x191, 0x192, 0x3, 0x2, 0x2, 0x2, 0x192, 0x195, 0x3, 0x2, 
    0x2, 0x2, 0x193, 0x195, 0x5, 0x4c, 0x27, 0x2, 0x194, 0x18e, 0x3, 0x2, 
    0x2, 0x2, 0x194, 0x193, 0x3, 0x2, 0x2, 0x2, 0x195, 0x47, 0x3, 0x2, 0x2, 
    0x2, 0x196, 0x19b, 0x5, 0x4a, 0x26, 0x2, 0x197, 0x198, 0x7, 0x44, 0x2, 
    0x2, 0x198, 0x19a, 0x5, 0x4a, 0x26, 0x2, 0x199, 0x197, 0x3, 0x2, 0x2, 
    0x2, 0x19a, 0x19d, 0x3, 0x2, 0x2, 0x2, 0x19b, 0x199, 0x3, 0x2, 0x2, 
    0x2, 0x19b, 0x19c, 0x3, 0x2, 0x2, 0x2, 0x19c, 0x49, 0x3, 0x2, 0x2, 0x2, 
    0x19d, 0x19b, 0x3, 0x2, 0x2, 0x2, 0x19e, 0x19f, 0x5, 0x6a, 0x36, 0x2, 
    0x19f, 0x1a0, 0x7, 0x45, 0x2, 0x2, 0x1a0, 0x1a1, 0x5, 0x2c, 0x17, 0x2, 
    0x1a1, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a2, 0x1a4, 0x5, 0xa4, 0x53, 0x2, 
    0x1a3, 0x19e, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a2, 0x3, 0x2, 0x2, 0x2, 
    0x1a4, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x1a5, 0x1a6, 0x7, 0x8, 0x2, 0x2, 0x1a6, 
    0x1a7, 0x5, 0x4e, 0x28, 0x2, 0x1a7, 0x1a8, 0x7, 0x21, 0x2, 0x2, 0x1a8, 
    0x1ad, 0x5, 0x50, 0x29, 0x2, 0x1a9, 0x1aa, 0x7, 0x44, 0x2, 0x2, 0x1aa, 
    0x1ac, 0x5, 0x50, 0x29, 0x2, 0x1ab, 0x1a9, 0x3, 0x2, 0x2, 0x2, 0x1ac, 
    0x1af, 0x3, 0x2, 0x2, 0x2, 0x1ad, 0x1ab, 0x3, 0x2, 0x2, 0x2, 0x1ad, 
    0x1ae, 0x3, 0x2, 0x2, 0x2, 0x1ae, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x1af, 0x1ad, 
    0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1b1, 0x5, 0x6, 0x4, 0x2, 0x1b1, 0x1b2, 
    0x7, 0x45, 0x2, 0x2, 0x1b2, 0x1b3, 0x5, 0x34, 0x1b, 0x2, 0x1b3, 0x1b6, 
    0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b6, 0x5, 0x34, 0x1b, 0x2, 0x1b5, 0x1b0, 
    0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1b6, 0x4f, 0x3, 
    0x2, 0x2, 0x2, 0x1b7, 0x1b8, 0x5, 0x6c, 0x37, 0x2, 0x1b8, 0x1b9, 0x7, 
    0x45, 0x2, 0x2, 0x1b9, 0x1ba, 0x7, 0x4c, 0x2, 0x2, 0x1ba, 0x1bb, 0x5, 
    0x46, 0x24, 0x2, 0x1bb, 0x1bc, 0x7, 0x4d, 0x2, 0x2, 0x1bc, 0x51, 0x3, 
    0x2, 0x2, 0x2, 0x1bd, 0x1be, 0x7, 0x2a, 0x2, 0x2, 0x1be, 0x1bf, 0x7, 
    0x21, 0x2, 0x2, 0x1bf, 0x1c0, 0x5, 0x54, 0x2b, 0x2, 0x1c0, 0x53, 0x3, 
    0x2, 0x2, 0x2, 0x1c1, 0x1c2, 0x5, 0x2e, 0x18, 0x2, 0x1c2, 0x55, 0x3, 
    0x2, 0x2, 0x2, 0x1c3, 0x1c4, 0x7, 0x13, 0x2, 0x2, 0x1c4, 0x1c5, 0x7, 
    0x21, 0x2, 0x2, 0x1c5, 0x1c8, 0x5, 0x2c, 0x17, 0x2, 0x1c6, 0x1c8, 0x7, 
    0x13, 0x2, 0x2, 0x1c7, 0x1c3, 0x3, 0x2, 0x2, 0x2, 0x1c7, 0x1c6, 0x3, 
    0x2, 0x2, 0x2, 0x1c8, 0x57, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1ca, 0x7, 0x52, 
    0x2, 0x2, 0x1ca, 0x1cb, 0x5, 0x34, 0x1b, 0x2, 0x1cb, 0x59, 0x3, 0x2, 
    0x2, 0x2, 0x1cc, 0x1cd, 0x7, 0x35, 0x2, 0x2, 0x1cd, 0x1d2, 0x5, 0x5c, 
    0x2f, 0x2, 0x1ce, 0x1cf, 0x7, 0x44, 0x2, 0x2, 0x1cf, 0x1d1, 0x5, 0x5c, 
    0x2f, 0x2, 0x1d0, 0x1ce, 0x3, 0x2, 0x2, 0x2, 0x1d1, 0x1d4, 0x3, 0x2, 
    0x2, 0x2, 0x1d2, 0x1d0, 0x3, 0x2, 0x2, 0x2, 0x1d2, 0x1d3, 0x3, 0x2, 
    0x2, 0x2, 0x1d3, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1d4, 0x1d2, 0x3, 0x2, 
    0x2, 0x2, 0x1d5, 0x1d6, 0x7, 0x44, 0x2, 0x2, 0x1d6, 0x5b, 0x3, 0x2, 
    0x2, 0x2, 0x1d7, 0x1d8, 0x5, 0x6a, 0x36, 0x2, 0x1d8, 0x1d9, 0x7, 0x45, 
    0x2, 0x2, 0x1d9, 0x1da, 0x5, 0x2c, 0x17, 0x2, 0x1da, 0x5d, 0x3, 0x2, 
    0x2, 0x2, 0x1db, 0x1dc, 0x5, 0x60, 0x31, 0x2, 0x1dc, 0x1dd, 0x7, 0x44, 
    0x2, 0x2, 0x1dd, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x1de, 0x1e1, 0x5, 0x62, 
    0x32, 0x2, 0x1df, 0x1e1, 0x5, 0x6e, 0x38, 0x2, 0x1e0, 0x1de, 0x3, 0x2, 
    0x2, 0x2, 0x1e0, 0x1df, 0x3, 0x2, 0x2, 0x2, 0x1e1, 0x61, 0x3, 0x2, 0x2, 
    0x2, 0x1e2, 0x1e3, 0x7, 0x26, 0x2, 0x2, 0x1e3, 0x1e5, 0x5, 0x6, 0x4, 
    0x2, 0x1e4, 0x1e6, 0x5, 0x64, 0x33, 0x2, 0x1e5, 0x1e4, 0x3, 0x2, 0x2, 
    0x2, 0x1e5, 0x1e6, 0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e7, 0x3, 0x2, 0x2, 
    0x2, 0x1e7, 0x1e8, 0x7, 0x44, 0x2, 0x2, 0x1e8, 0x1e9, 0x5, 0x8, 0x5, 
    0x2, 0x1e9, 0x63, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1eb, 0x7, 0x4c, 0x2, 
    0x2, 0x1eb, 0x1f0, 0x5, 0x66, 0x34, 0x2, 0x1ec, 0x1ed, 0x7, 0x44, 0x2, 
    0x2, 0x1ed, 0x1ef, 0x5, 0x66, 0x34, 0x2, 0x1ee, 0x1ec, 0x3, 0x2, 0x2, 
    0x2, 0x1ef, 0x1f2, 0x3, 0x2, 0x2, 0x2, 0x1f0, 0x1ee, 0x3, 0x2, 0x2, 
    0x2, 0x1f0, 0x1f1, 0x3, 0x2, 0x2, 0x2, 0x1f1, 0x1f3, 0x3, 0x2, 0x2, 
    0x2, 0x1f2, 0x1f0, 0x3, 0x2, 0x2, 0x2, 0x1f3, 0x1f4, 0x7, 0x4d, 0x2, 
    0x2, 0x1f4, 0x65, 0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1ff, 0x5, 0x68, 0x35, 
    0x2, 0x1f6, 0x1f7, 0x7, 0x35, 0x2, 0x2, 0x1f7, 0x1ff, 0x5, 0x68, 0x35, 
    0x2, 0x1f8, 0x1f9, 0x7, 0x15, 0x2, 0x2, 0x1f9, 0x1ff, 0x5, 0x68, 0x35, 
    0x2, 0x1fa, 0x1fb, 0x7, 0x26, 0x2, 0x2, 0x1fb, 0x1ff, 0x5, 0x68, 0x35, 
    0x2, 0x1fc, 0x1fd, 0x7, 0x9, 0x2, 0x2, 0x1fd, 0x1ff, 0x5, 0x68, 0x35, 
    0x2, 0x1fe, 0x1f5, 0x3, 0x2, 0x2, 0x2, 0x1fe, 0x1f6, 0x3, 0x2, 0x2, 
    0x2, 0x1fe, 0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1fe, 0x1fa, 0x3, 0x2, 0x2, 
    0x2, 0x1fe, 0x1fc, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x67, 0x3, 0x2, 0x2, 0x2, 
    0x200, 0x201, 0x5, 0x6a, 0x36, 0x2, 0x201, 0x202, 0x7, 0x45, 0x2, 0x2, 
    0x202, 0x203, 0x5, 0x34, 0x1b, 0x2, 0x203, 0x69, 0x3, 0x2, 0x2, 0x2, 
    0x204, 0x209, 0x5, 0x6, 0x4, 0x2, 0x205, 0x206, 0x7, 0x43, 0x2, 0x2, 
    0x206, 0x208, 0x5, 0x6, 0x4, 0x2, 0x207, 0x205, 0x3, 0x2, 0x2, 0x2, 
    0x208, 0x20b, 0x3, 0x2, 0x2, 0x2, 0x209, 0x207, 0x3, 0x2, 0x2, 0x2, 
    0x209, 0x20a, 0x3, 0x2, 0x2, 0x2, 0x20a, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x20b, 
    0x209, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x211, 0x5, 0x16, 0xc, 0x2, 0x20d, 
    0x20e, 0x7, 0x43, 0x2, 0x2, 0x20e, 0x210, 0x5, 0x16, 0xc, 0x2, 0x20f, 
    0x20d, 0x3, 0x2, 0x2, 0x2, 0x210, 0x213, 0x3, 0x2, 0x2, 0x2, 0x211, 
    0x20f, 0x3, 0x2, 0x2, 0x2, 0x211, 0x212, 0x3, 0x2, 0x2, 0x2, 0x212, 
    0x6d, 0x3, 0x2, 0x2, 0x2, 0x213, 0x211, 0x3, 0x2, 0x2, 0x2, 0x214, 0x215, 
    0x7, 0x15, 0x2, 0x2, 0x215, 0x217, 0x5, 0x6, 0x4, 0x2, 0x216, 0x218, 
    0x5, 0x64, 0x33, 0x2, 0x217, 0x216, 0x3, 0x2, 0x2, 0x2, 0x217, 0x218, 
    0x3, 0x2, 0x2, 0x2, 0x218, 0x219, 0x3, 0x2, 0x2, 0x2, 0x219, 0x21a, 
    0x7, 0x45, 0x2, 0x2, 0x21a, 0x21b, 0x5, 0x70, 0x39, 0x2, 0x21b, 0x21c, 
    0x7, 0x44, 0x2, 0x2, 0x21c, 0x21d, 0x5, 0x8, 0x5, 0x2, 0x21d, 0x6f, 
    0x3, 0x2, 0x2, 0x2, 0x21e, 0x21f, 0x5, 0x34, 0x1b, 0x2, 0x21f, 0x71, 
    0x3, 0x2, 0x2, 0x2, 0x220, 0x221, 0x5, 0xe, 0x8, 0x2, 0x221, 0x222, 
    0x7, 0x45, 0x2, 0x2, 0x222, 0x223, 0x5, 0x74, 0x3b, 0x2, 0x223, 0x226, 
    0x3, 0x2, 0x2, 0x2, 0x224, 0x226, 0x5, 0x74, 0x3b, 0x2, 0x225, 0x220, 
    0x3, 0x2, 0x2, 0x2, 0x225, 0x224, 0x3, 0x2, 0x2, 0x2, 0x226, 0x73, 0x3, 
    0x2, 0x2, 0x2, 0x227, 0x22a, 0x5, 0x76, 0x3c, 0x2, 0x228, 0x22a, 0x5, 
    0xa6, 0x54, 0x2, 0x229, 0x227, 0x3, 0x2, 0x2, 0x2, 0x229, 0x228, 0x3, 
    0x2, 0x2, 0x2, 0x22a, 0x75, 0x3, 0x2, 0x2, 0x2, 0x22b, 0x231, 0x5, 0x78, 
    0x3d, 0x2, 0x22c, 0x231, 0x5, 0x98, 0x4d, 0x2, 0x22d, 0x231, 0x5, 0x9e, 
    0x50, 0x2, 0x22e, 0x231, 0x5, 0xa0, 0x51, 0x2, 0x22f, 0x231, 0x5, 0xa2, 
    0x52, 0x2, 0x230, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x230, 0x22c, 0x3, 0x2, 
    0x2, 0x2, 0x230, 0x22d, 0x3, 0x2, 0x2, 0x2, 0x230, 0x22e, 0x3, 0x2, 
    0x2, 0x2, 0x230, 0x22f, 0x3, 0x2, 0x2, 0x2, 0x231, 0x77, 0x3, 0x2, 0x2, 
    0x2, 0x232, 0x233, 0x5, 0x7a, 0x3e, 0x2, 0x233, 0x234, 0x7, 0x42, 0x2, 
    0x2, 0x234, 0x235, 0x5, 0x7c, 0x3f, 0x2, 0x235, 0x79, 0x3, 0x2, 0x2, 
    0x2, 0x236, 0x237, 0x7, 0x53, 0x2, 0x2, 0x237, 0x23a, 0x5, 0x6, 0x4, 
    0x2, 0x238, 0x23a, 0x5, 0x6, 0x4, 0x2, 0x239, 0x236, 0x3, 0x2, 0x2, 
    0x2, 0x239, 0x238, 0x3, 0x2, 0x2, 0x2, 0x23a, 0x256, 0x3, 0x2, 0x2, 
    0x2, 0x23b, 0x23c, 0x7, 0x4e, 0x2, 0x2, 0x23c, 0x241, 0x5, 0x7c, 0x3f, 
    0x2, 0x23d, 0x23e, 0x7, 0x43, 0x2, 0x2, 0x23e, 0x240, 0x5, 0x7c, 0x3f, 
    0x2, 0x23f, 0x23d, 0x3, 0x2, 0x2, 0x2, 0x240, 0x243, 0x3, 0x2, 0x2, 
    0x2, 0x241, 0x23f, 0x3, 0x2, 0x2, 0x2, 0x241, 0x242, 0x3, 0x2, 0x2, 
    0x2, 0x242, 0x244, 0x3, 0x2, 0x2, 0x2, 0x243, 0x241, 0x3, 0x2, 0x2, 
    0x2, 0x244, 0x245, 0x7, 0x50, 0x2, 0x2, 0x245, 0x255, 0x3, 0x2, 0x2, 
    0x2, 0x246, 0x247, 0x7, 0x4f, 0x2, 0x2, 0x247, 0x24c, 0x5, 0x7c, 0x3f, 
    0x2, 0x248, 0x249, 0x7, 0x43, 0x2, 0x2, 0x249, 0x24b, 0x5, 0x7c, 0x3f, 
    0x2, 0x24a, 0x248, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x24e, 0x3, 0x2, 0x2, 
    0x2, 0x24c, 0x24a, 0x3, 0x2, 0x2, 0x2, 0x24c, 0x24d, 0x3, 0x2, 0x2, 
    0x2, 0x24d, 0x24f, 0x3, 0x2, 0x2, 0x2, 0x24e, 0x24c, 0x3, 0x2, 0x2, 
    0x2, 0x24f, 0x250, 0x7, 0x51, 0x2, 0x2, 0x250, 0x255, 0x3, 0x2, 0x2, 
    0x2, 0x251, 0x252, 0x7, 0x54, 0x2, 0x2, 0x252, 0x255, 0x5, 0x6, 0x4, 
    0x2, 0x253, 0x255, 0x7, 0x52, 0x2, 0x2, 0x254, 0x23b, 0x3, 0x2, 0x2, 
    0x2, 0x254, 0x246, 0x3, 0x2, 0x2, 0x2, 0x254, 0x251, 0x3, 0x2, 0x2, 
    0x2, 0x254, 0x253, 0x3, 0x2, 0x2, 0x2, 0x255, 0x258, 0x3, 0x2, 0x2, 
    0x2, 0x256, 0x254, 0x3, 0x2, 0x2, 0x2, 0x256, 0x257, 0x3, 0x2, 0x2, 
    0x2, 0x257, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x258, 0x256, 0x3, 0x2, 0x2, 0x2, 
    0x259, 0x25d, 0x5, 0x80, 0x41, 0x2, 0x25a, 0x25b, 0x5, 0x7e, 0x40, 0x2, 
    0x25b, 0x25c, 0x5, 0x7c, 0x3f, 0x2, 0x25c, 0x25e, 0x3, 0x2, 0x2, 0x2, 
    0x25d, 0x25a, 0x3, 0x2, 0x2, 0x2, 0x25d, 0x25e, 0x3, 0x2, 0x2, 0x2, 
    0x25e, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x25f, 0x260, 0x9, 0x5, 0x2, 0x2, 0x260, 
    0x7f, 0x3, 0x2, 0x2, 0x2, 0x261, 0x265, 0x5, 0x84, 0x43, 0x2, 0x262, 
    0x263, 0x5, 0x82, 0x42, 0x2, 0x263, 0x264, 0x5, 0x80, 0x41, 0x2, 0x264, 
    0x266, 0x3, 0x2, 0x2, 0x2, 0x265, 0x262, 0x3, 0x2, 0x2, 0x2, 0x265, 
    0x266, 0x3, 0x2, 0x2, 0x2, 0x266, 0x81, 0x3, 0x2, 0x2, 0x2, 0x267, 0x268, 
    0x9, 0x6, 0x2, 0x2, 0x268, 0x83, 0x3, 0x2, 0x2, 0x2, 0x269, 0x26d, 0x5, 
    0x88, 0x45, 0x2, 0x26a, 0x26b, 0x5, 0x86, 0x44, 0x2, 0x26b, 0x26c, 0x5, 
    0x84, 0x43, 0x2, 0x26c, 0x26e, 0x3, 0x2, 0x2, 0x2, 0x26d, 0x26a, 0x3, 
    0x2, 0x2, 0x2, 0x26d, 0x26e, 0x3, 0x2, 0x2, 0x2, 0x26e, 0x85, 0x3, 0x2, 
    0x2, 0x2, 0x26f, 0x270, 0x9, 0x7, 0x2, 0x2, 0x270, 0x87, 0x3, 0x2, 0x2, 
    0x2, 0x271, 0x273, 0x9, 0x2, 0x2, 0x2, 0x272, 0x271, 0x3, 0x2, 0x2, 
    0x2, 0x272, 0x273, 0x3, 0x2, 0x2, 0x2, 0x273, 0x274, 0x3, 0x2, 0x2, 
    0x2, 0x274, 0x275, 0x5, 0x8a, 0x46, 0x2, 0x275, 0x89, 0x3, 0x2, 0x2, 
    0x2, 0x276, 0x282, 0x5, 0x7a, 0x3e, 0x2, 0x277, 0x278, 0x7, 0x4c, 0x2, 
    0x2, 0x278, 0x279, 0x5, 0x7c, 0x3f, 0x2, 0x279, 0x27a, 0x7, 0x4d, 0x2, 
    0x2, 0x27a, 0x282, 0x3, 0x2, 0x2, 0x2, 0x27b, 0x282, 0x5, 0x8e, 0x48, 
    0x2, 0x27c, 0x282, 0x5, 0x8c, 0x47, 0x2, 0x27d, 0x282, 0x5, 0x92, 0x4a, 
    0x2, 0x27e, 0x27f, 0x7, 0x1f, 0x2, 0x2, 0x27f, 0x282, 0x5, 0x8a, 0x46, 
    0x2, 0x280, 0x282, 0x5, 0x20, 0x11, 0x2, 0x281, 0x276, 0x3, 0x2, 0x2, 
    0x2, 0x281, 0x277, 0x3, 0x2, 0x2, 0x2, 0x281, 0x27b, 0x3, 0x2, 0x2, 
    0x2, 0x281, 0x27c, 0x3, 0x2, 0x2, 0x2, 0x281, 0x27d, 0x3, 0x2, 0x2, 
    0x2, 0x281, 0x27e, 0x3, 0x2, 0x2, 0x2, 0x281, 0x280, 0x3, 0x2, 0x2, 
    0x2, 0x282, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x283, 0x288, 0x5, 0x18, 0xd, 
    0x2, 0x284, 0x288, 0x5, 0x14, 0xb, 0x2, 0x285, 0x288, 0x5, 0x22, 0x12, 
    0x2, 0x286, 0x288, 0x7, 0x1e, 0x2, 0x2, 0x287, 0x283, 0x3, 0x2, 0x2, 
    0x2, 0x287, 0x284, 0x3, 0x2, 0x2, 0x2, 0x287, 0x285, 0x3, 0x2, 0x2, 
    0x2, 0x287, 0x286, 0x3, 0x2, 0x2, 0x2, 0x288, 0x8d, 0x3, 0x2, 0x2, 0x2, 
    0x289, 0x28f, 0x5, 0x6, 0x4, 0x2, 0x28a, 0x28c, 0x7, 0x4c, 0x2, 0x2, 
    0x28b, 0x28d, 0x5, 0x90, 0x49, 0x2, 0x28c, 0x28b, 0x3, 0x2, 0x2, 0x2, 
    0x28c, 0x28d, 0x3, 0x2, 0x2, 0x2, 0x28d, 0x28e, 0x3, 0x2, 0x2, 0x2, 
    0x28e, 0x290, 0x7, 0x4d, 0x2, 0x2, 0x28f, 0x28a, 0x3, 0x2, 0x2, 0x2, 
    0x28f, 0x290, 0x3, 0x2, 0x2, 0x2, 0x290, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x291, 
    0x296, 0x5, 0x9a, 0x4e, 0x2, 0x292, 0x293, 0x7, 0x43, 0x2, 0x2, 0x293, 
    0x295, 0x5, 0x9a, 0x4e, 0x2, 0x294, 0x292, 0x3, 0x2, 0x2, 0x2, 0x295, 
    0x298, 0x3, 0x2, 0x2, 0x2, 0x296, 0x294, 0x3, 0x2, 0x2, 0x2, 0x296, 
    0x297, 0x3, 0x2, 0x2, 0x2, 0x297, 0x91, 0x3, 0x2, 0x2, 0x2, 0x298, 0x296, 
    0x3, 0x2, 0x2, 0x2, 0x299, 0x29a, 0x7, 0x4e, 0x2, 0x2, 0x29a, 0x29b, 
    0x5, 0x94, 0x4b, 0x2, 0x29b, 0x29c, 0x7, 0x50, 0x2, 0x2, 0x29c, 0x2a2, 
    0x3, 0x2, 0x2, 0x2, 0x29d, 0x29e, 0x7, 0x4f, 0x2, 0x2, 0x29e, 0x29f, 
    0x5, 0x94, 0x4b, 0x2, 0x29f, 0x2a0, 0x7, 0x51, 0x2, 0x2, 0x2a0, 0x2a2, 
    0x3, 0x2, 0x2, 0x2, 0x2a1, 0x299, 0x3, 0x2, 0x2, 0x2, 0x2a1, 0x29d, 
    0x3, 0x2, 0x2, 0x2, 0x2a2, 0x93, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x2a8, 0x5, 
    0x96, 0x4c, 0x2, 0x2a4, 0x2a5, 0x7, 0x43, 0x2, 0x2, 0x2a5, 0x2a7, 0x5, 
    0x96, 0x4c, 0x2, 0x2a6, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x2a7, 0x2aa, 0x3, 
    0x2, 0x2, 0x2, 0x2a8, 0x2a6, 0x3, 0x2, 0x2, 0x2, 0x2a8, 0x2a9, 0x3, 
    0x2, 0x2, 0x2, 0x2a9, 0x2ad, 0x3, 0x2, 0x2, 0x2, 0x2aa, 0x2a8, 0x3, 
    0x2, 0x2, 0x2, 0x2ab, 0x2ad, 0x3, 0x2, 0x2, 0x2, 0x2ac, 0x2a3, 0x3, 
    0x2, 0x2, 0x2, 0x2ac, 0x2ab, 0x3, 0x2, 0x2, 0x2, 0x2ad, 0x95, 0x3, 0x2, 
    0x2, 0x2, 0x2ae, 0x2b1, 0x5, 0x7c, 0x3f, 0x2, 0x2af, 0x2b0, 0x7, 0x55, 
    0x2, 0x2, 0x2b0, 0x2b2, 0x5, 0x7c, 0x3f, 0x2, 0x2b1, 0x2af, 0x3, 0x2, 
    0x2, 0x2, 0x2b1, 0x2b2, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x97, 0x3, 0x2, 0x2, 
    0x2, 0x2b3, 0x2b9, 0x5, 0x6, 0x4, 0x2, 0x2b4, 0x2b6, 0x7, 0x4c, 0x2, 
    0x2, 0x2b5, 0x2b7, 0x5, 0x90, 0x49, 0x2, 0x2b6, 0x2b5, 0x3, 0x2, 0x2, 
    0x2, 0x2b6, 0x2b7, 0x3, 0x2, 0x2, 0x2, 0x2b7, 0x2b8, 0x3, 0x2, 0x2, 
    0x2, 0x2b8, 0x2ba, 0x7, 0x4d, 0x2, 0x2, 0x2b9, 0x2b4, 0x3, 0x2, 0x2, 
    0x2, 0x2b9, 0x2ba, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x99, 0x3, 0x2, 0x2, 0x2, 
    0x2bb, 0x2bf, 0x5, 0x7c, 0x3f, 0x2, 0x2bc, 0x2be, 0x5, 0x9c, 0x4f, 0x2, 
    0x2bd, 0x2bc, 0x3, 0x2, 0x2, 0x2, 0x2be, 0x2c1, 0x3, 0x2, 0x2, 0x2, 
    0x2bf, 0x2bd, 0x3, 0x2, 0x2, 0x2, 0x2bf, 0x2c0, 0x3, 0x2, 0x2, 0x2, 
    0x2c0, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x2c1, 0x2bf, 0x3, 0x2, 0x2, 0x2, 0x2c2, 
    0x2c3, 0x7, 0x45, 0x2, 0x2, 0x2c3, 0x2c4, 0x5, 0x7c, 0x3f, 0x2, 0x2c4, 
    0x9d, 0x3, 0x2, 0x2, 0x2, 0x2c5, 0x2c6, 0x7, 0x16, 0x2, 0x2, 0x2c6, 
    0x2c7, 0x5, 0xe, 0x8, 0x2, 0x2c7, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x2c8, 0x2c9, 
    0x7, 0x7, 0x2, 0x2, 0x2c9, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x2ca, 0x2cb, 0x3, 
    0x2, 0x2, 0x2, 0x2cb, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2cd, 0x3, 0x2, 
    0x2, 0x2, 0x2cd, 0xa5, 0x3, 0x2, 0x2, 0x2, 0x2ce, 0x2d3, 0x5, 0xa8, 
    0x55, 0x2, 0x2cf, 0x2d3, 0x5, 0xac, 0x57, 0x2, 0x2d0, 0x2d3, 0x5, 0xb4, 
    0x5b, 0x2, 0x2d1, 0x2d3, 0x5, 0xc2, 0x62, 0x2, 0x2d2, 0x2ce, 0x3, 0x2, 
    0x2, 0x2, 0x2d2, 0x2cf, 0x3, 0x2, 0x2, 0x2, 0x2d2, 0x2d0, 0x3, 0x2, 
    0x2, 0x2, 0x2d2, 0x2d1, 0x3, 0x2, 0x2, 0x2, 0x2d3, 0xa7, 0x3, 0x2, 0x2, 
    0x2, 0x2d4, 0x2d5, 0x7, 0x6, 0x2, 0x2, 0x2d5, 0x2d6, 0x5, 0xaa, 0x56, 
    0x2, 0x2d6, 0x2d7, 0x7, 0x11, 0x2, 0x2, 0x2d7, 0xa9, 0x3, 0x2, 0x2, 
    0x2, 0x2d8, 0x2dd, 0x5, 0x72, 0x3a, 0x2, 0x2d9, 0x2da, 0x7, 0x44, 0x2, 
    0x2, 0x2da, 0x2dc, 0x5, 0x72, 0x3a, 0x2, 0x2db, 0x2d9, 0x3, 0x2, 0x2, 
    0x2, 0x2dc, 0x2df, 0x3, 0x2, 0x2, 0x2, 0x2dd, 0x2db, 0x3, 0x2, 0x2, 
    0x2, 0x2dd, 0x2de, 0x3, 0x2, 0x2, 0x2, 0x2de, 0xab, 0x3, 0x2, 0x2, 0x2, 
    0x2df, 0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2e3, 0x5, 0xae, 0x58, 0x2, 
    0x2e1, 0x2e3, 0x5, 0xb0, 0x59, 0x2, 0x2e2, 0x2e0, 0x3, 0x2, 0x2, 0x2, 
    0x2e2, 0x2e1, 0x3, 0x2, 0x2, 0x2, 0x2e3, 0xad, 0x3, 0x2, 0x2, 0x2, 0x2e4, 
    0x2e5, 0x7, 0x17, 0x2, 0x2, 0x2e5, 0x2e6, 0x5, 0x7c, 0x3f, 0x2, 0x2e6, 
    0x2e7, 0x7, 0x2e, 0x2, 0x2, 0x2e7, 0x2ea, 0x5, 0x72, 0x3a, 0x2, 0x2e8, 
    0x2e9, 0x7, 0x10, 0x2, 0x2, 0x2e9, 0x2eb, 0x5, 0x72, 0x3a, 0x2, 0x2ea, 
    0x2e8, 0x3, 0x2, 0x2, 0x2, 0x2ea, 0x2eb, 0x3, 0x2, 0x2, 0x2, 0x2eb, 
    0xaf, 0x3, 0x2, 0x2, 0x2, 0x2ec, 0x2ed, 0x7, 0x8, 0x2, 0x2, 0x2ed, 0x2ee, 
    0x5, 0x7c, 0x3f, 0x2, 0x2ee, 0x2ef, 0x7, 0x21, 0x2, 0x2, 0x2ef, 0x2f4, 
    0x5, 0xb2, 0x5a, 0x2, 0x2f0, 0x2f1, 0x7, 0x44, 0x2, 0x2, 0x2f1, 0x2f3, 
    0x5, 0xb2, 0x5a, 0x2, 0x2f2, 0x2f0, 0x3, 0x2, 0x2, 0x2, 0x2f3, 0x2f6, 
    0x3, 0x2, 0x2, 0x2, 0x2f4, 0x2f2, 0x3, 0x2, 0x2, 0x2, 0x2f4, 0x2f5, 
    0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2fa, 0x3, 0x2, 0x2, 0x2, 0x2f6, 0x2f4, 
    0x3, 0x2, 0x2, 0x2, 0x2f7, 0x2f8, 0x7, 0x44, 0x2, 0x2, 0x2f8, 0x2f9, 
    0x7, 0x10, 0x2, 0x2, 0x2f9, 0x2fb, 0x5, 0xaa, 0x56, 0x2, 0x2fa, 0x2f7, 
    0x3, 0x2, 0x2, 0x2, 0x2fa, 0x2fb, 0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2fc, 
    0x3, 0x2, 0x2, 0x2, 0x2fc, 0x2fd, 0x7, 0x11, 0x2, 0x2, 0x2fd, 0xb1, 
    0x3, 0x2, 0x2, 0x2, 0x2fe, 0x2ff, 0x5, 0x6c, 0x37, 0x2, 0x2ff, 0x300, 
    0x7, 0x45, 0x2, 0x2, 0x300, 0x301, 0x5, 0x72, 0x3a, 0x2, 0x301, 0xb3, 
    0x3, 0x2, 0x2, 0x2, 0x302, 0x306, 0x5, 0xb6, 0x5c, 0x2, 0x303, 0x306, 
    0x5, 0xb8, 0x5d, 0x2, 0x304, 0x306, 0x5, 0xba, 0x5e, 0x2, 0x305, 0x302, 
    0x3, 0x2, 0x2, 0x2, 0x305, 0x303, 0x3, 0x2, 0x2, 0x2, 0x305, 0x304, 
    0x3, 0x2, 0x2, 0x2, 0x306, 0xb5, 0x3, 0x2, 0x2, 0x2, 0x307, 0x308, 0x7, 
    0x36, 0x2, 0x2, 0x308, 0x309, 0x5, 0x7c, 0x3f, 0x2, 0x309, 0x30a, 0x7, 
    0xe, 0x2, 0x2, 0x30a, 0x30b, 0x5, 0x72, 0x3a, 0x2, 0x30b, 0xb7, 0x3, 
    0x2, 0x2, 0x2, 0x30c, 0x30d, 0x7, 0x29, 0x2, 0x2, 0x30d, 0x30e, 0x5, 
    0xaa, 0x56, 0x2, 0x30e, 0x30f, 0x7, 0x33, 0x2, 0x2, 0x30f, 0x310, 0x5, 
    0x7c, 0x3f, 0x2, 0x310, 0xb9, 0x3, 0x2, 0x2, 0x2, 0x311, 0x312, 0x7, 
    0x14, 0x2, 0x2, 0x312, 0x313, 0x5, 0x6, 0x4, 0x2, 0x313, 0x314, 0x7, 
    0x42, 0x2, 0x2, 0x314, 0x315, 0x5, 0xbc, 0x5f, 0x2, 0x315, 0x316, 0x7, 
    0xe, 0x2, 0x2, 0x316, 0x317, 0x5, 0x72, 0x3a, 0x2, 0x317, 0xbb, 0x3, 
    0x2, 0x2, 0x2, 0x318, 0x319, 0x5, 0xbe, 0x60, 0x2, 0x319, 0x31a, 0x9, 
    0x8, 0x2, 0x2, 0x31a, 0x31b, 0x5, 0xc0, 0x61, 0x2, 0x31b, 0xbd, 0x3, 
    0x2, 0x2, 0x2, 0x31c, 0x31d, 0x5, 0x7c, 0x3f, 0x2, 0x31d, 0xbf, 0x3, 
    0x2, 0x2, 0x2, 0x31e, 0x31f, 0x5, 0x7c, 0x3f, 0x2, 0x31f, 0xc1, 0x3, 
    0x2, 0x2, 0x2, 0x320, 0x321, 0x7, 0x37, 0x2, 0x2, 0x321, 0x322, 0x5, 
    0xc4, 0x63, 0x2, 0x322, 0x323, 0x7, 0xe, 0x2, 0x2, 0x323, 0x324, 0x5, 
    0x72, 0x3a, 0x2, 0x324, 0xc3, 0x3, 0x2, 0x2, 0x2, 0x325, 0x32a, 0x5, 
    0x7a, 0x3e, 0x2, 0x326, 0x327, 0x7, 0x43, 0x2, 0x2, 0x327, 0x329, 0x5, 
    0x7a, 0x3e, 0x2, 0x328, 0x326, 0x3, 0x2, 0x2, 0x2, 0x329, 0x32c, 0x3, 
    0x2, 0x2, 0x2, 0x32a, 0x328, 0x3, 0x2, 0x2, 0x2, 0x32a, 0x32b, 0x3, 
    0x2, 0x2, 0x2, 0x32b, 0xc5, 0x3, 0x2, 0x2, 0x2, 0x32c, 0x32a, 0x3, 0x2, 
    0x2, 0x2, 0x46, 0xc8, 0xd4, 0xdc, 0xe7, 0xe9, 0xf8, 0x105, 0x11a, 0x11e, 
    0x130, 0x137, 0x13b, 0x142, 0x147, 0x14d, 0x159, 0x15e, 0x164, 0x16a, 
    0x17c, 0x183, 0x191, 0x194, 0x19b, 0x1a3, 0x1ad, 0x1b5, 0x1c7, 0x1d2, 
    0x1e0, 0x1e5, 0x1f0, 0x1fe, 0x209, 0x211, 0x217, 0x225, 0x229, 0x230, 
    0x239, 0x241, 0x24c, 0x254, 0x256, 0x25d, 0x265, 0x26d, 0x272, 0x281, 
    0x287, 0x28c, 0x28f, 0x296, 0x2a1, 0x2a8, 0x2ac, 0x2b1, 0x2b6, 0x2b9, 
    0x2bf, 0x2d2, 0x2dd, 0x2e2, 0x2ea, 0x2f4, 0x2fa, 0x305, 0x32a, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

PascalParser::Initializer PascalParser::_init;


int calculateElementCount(string typestr) {
    int count = 1;
    for (int x=0; x<typestr.length(); x++)
        typestr[x] = tolower(typestr[x]);

    if (typestr == "boolean") {
        return 2;
    } else if (typestr == "integer") {
        return 4294967296;
    } else if (typestr == "char") {
        return 256;
    }
    return count;
}