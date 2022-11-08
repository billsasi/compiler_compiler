
// Generated from Pascal.g4 by ANTLR 4.7.2


#include "PascalVisitor.h"

#include "PascalParser.h"

#include "intermediate/symtab/Predefined.h"
#include "intermediate/symtab/SymtabStack.h"
#include "intermediate/type/Typespec.h"

using namespace antlrcpp;
using namespace antlr4;

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

tree::TerminalNode* PascalParser::ProgramContext::PROGRAM() {
  return getToken(PascalParser::PROGRAM, 0);
}

PascalParser::IdentifierContext* PascalParser::ProgramContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ProgramContext::SEMICOLON() {
  return getToken(PascalParser::SEMICOLON, 0);
}

PascalParser::BlockContext* PascalParser::ProgramContext::block() {
  return getRuleContext<PascalParser::BlockContext>(0);
}

tree::TerminalNode* PascalParser::ProgramContext::PERIOD() {
  return getToken(PascalParser::PERIOD, 0);
}

PascalParser::ProgramHeadingContext* PascalParser::ProgramContext::programHeading() {
  return getRuleContext<PascalParser::ProgramHeadingContext>(0);
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
    setState(210);
    match(PascalParser::PROGRAM);
    setState(211);
    auto node = identifier();
    std::string programName = node->getText();
    SymtabEntry *entry = symtabStack->enterLocal(programName, Kind::PROGRAM);
    node->entry = entry;
    setState(213);
    _errHandler->sync(this);

    symtabStack->push();

    _la = _input->LA(1);
    if (_la == PascalParser::LPAREN) {
      setState(212);
      programHeading();
    }
    setState(215);
    match(PascalParser::SEMICOLON);
    setState(216);
    block();
    setState(217);
    match(PascalParser::PERIOD);
   
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

tree::TerminalNode* PascalParser::ProgramHeadingContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

PascalParser::IdentifierListContext* PascalParser::ProgramHeadingContext::identifierList() {
  return getRuleContext<PascalParser::IdentifierListContext>(0);
}

tree::TerminalNode* PascalParser::ProgramHeadingContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
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

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(219);
    match(PascalParser::LPAREN);
    setState(220);
    identifierList();
    setState(221);
    match(PascalParser::RPAREN);
   
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
  enterRule(_localctx, 4, PascalParser::RuleIdentifierList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(223);
    identifier();
    setState(228);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(224);
      match(PascalParser::COMMA);
      setState(225);
      identifier();
      setState(230);
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

//----------------- IdentifierContext ------------------------------------------------------------------

PascalParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::IdentifierContext::IDENTIFIER() {
  return getToken(PascalParser::IDENTIFIER, 0);
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
  enterRule(_localctx, 6, PascalParser::RuleIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(231);
    match(PascalParser::IDENTIFIER);
   
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

PascalParser::LabelDeclarationPartContext* PascalParser::BlockContext::labelDeclarationPart() {
  return getRuleContext<PascalParser::LabelDeclarationPartContext>(0);
}

PascalParser::ConstantDefinitionPartContext* PascalParser::BlockContext::constantDefinitionPart() {
  return getRuleContext<PascalParser::ConstantDefinitionPartContext>(0);
}

PascalParser::TypeDefinitionPartContext* PascalParser::BlockContext::typeDefinitionPart() {
  return getRuleContext<PascalParser::TypeDefinitionPartContext>(0);
}

PascalParser::VariableDeclarationPartContext* PascalParser::BlockContext::variableDeclarationPart() {
  return getRuleContext<PascalParser::VariableDeclarationPartContext>(0);
}

PascalParser::ProcedureAndFunctionDeclarationPartContext* PascalParser::BlockContext::procedureAndFunctionDeclarationPart() {
  return getRuleContext<PascalParser::ProcedureAndFunctionDeclarationPartContext>(0);
}

PascalParser::StatementPartContext* PascalParser::BlockContext::statementPart() {
  return getRuleContext<PascalParser::StatementPartContext>(0);
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
  enterRule(_localctx, 8, PascalParser::RuleBlock);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(233);
    labelDeclarationPart();
    setState(234);
    constantDefinitionPart();
    setState(235);
    typeDefinitionPart();
    setState(236);
    variableDeclarationPart();
    setState(237);
    procedureAndFunctionDeclarationPart();
    setState(238);
    statementPart();
   
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

PascalParser::EmptyContext* PascalParser::LabelDeclarationPartContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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

tree::TerminalNode* PascalParser::LabelDeclarationPartContext::SEMICOLON() {
  return getToken(PascalParser::SEMICOLON, 0);
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
    setState(252);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN:
      case PascalParser::CONST:
      case PascalParser::FUNCTION:
      case PascalParser::PROCEDURE:
      case PascalParser::TYPE:
      case PascalParser::VAR: {
        enterOuterAlt(_localctx, 1);
        setState(240);
        empty();
        break;
      }

      case PascalParser::LABEL: {
        enterOuterAlt(_localctx, 2);
        setState(241);
        match(PascalParser::LABEL);
        setState(242);
        label();
        setState(247);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == PascalParser::COMMA) {
          setState(243);
          match(PascalParser::COMMA);
          setState(244);
          label();
          setState(249);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        setState(250);
        match(PascalParser::SEMICOLON);
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
    setState(254);
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

PascalParser::EmptyContext* PascalParser::ConstantDefinitionPartContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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

std::vector<tree::TerminalNode *> PascalParser::ConstantDefinitionPartContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::ConstantDefinitionPartContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    setState(268);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN:
      case PascalParser::FUNCTION:
      case PascalParser::PROCEDURE:
      case PascalParser::TYPE:
      case PascalParser::VAR: {
        enterOuterAlt(_localctx, 1);
        setState(256);
        empty();
        break;
      }

      case PascalParser::CONST: {
        enterOuterAlt(_localctx, 2);
        setState(257);
        match(PascalParser::CONST);
        setState(258);
        constantDefinition();
        setState(263);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(259);
            match(PascalParser::SEMICOLON);
            setState(260);
            constantDefinition(); 
          }
          setState(265);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
        }
        setState(266);
        match(PascalParser::SEMICOLON);
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
    setState(270);
    auto node = identifier();
    std::string name = node->getText();
    SymtabEntry *entry = symtabStack->enterLocal(name, Kind::CONSTANT);
    node->entry = entry;
    setState(271);
    match(PascalParser::EQUAL);
    setState(272);
    constant();
   
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

PascalParser::ConstantIdentifierContext* PascalParser::ConstantContext::constantIdentifier() {
  return getRuleContext<PascalParser::ConstantIdentifierContext>(0);
}

PascalParser::StringContext* PascalParser::ConstantContext::string() {
  return getRuleContext<PascalParser::StringContext>(0);
}

tree::TerminalNode* PascalParser::ConstantContext::CHARACTER() {
  return getToken(PascalParser::CHARACTER, 0);
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
  enterRule(_localctx, 18, PascalParser::RuleConstant);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(284);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(274);
      unsignedNumber();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(275);
      sign();
      setState(276);
      unsignedNumber();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(278);
      constantIdentifier();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(279);
      sign();
      setState(280);
      constantIdentifier();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(282);
      string();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(283);
      match(PascalParser::CHARACTER);
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
  enterRule(_localctx, 20, PascalParser::RuleUnsignedNumber);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(288);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::INTEGER: {
        enterOuterAlt(_localctx, 1);
        setState(286);
        unsignedInteger();
        break;
      }

      case PascalParser::REAL: {
        enterOuterAlt(_localctx, 2);
        setState(287);
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

tree::TerminalNode* PascalParser::UnsignedIntegerContext::INTEGER() {
  return getToken(PascalParser::INTEGER, 0);
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
  enterRule(_localctx, 22, PascalParser::RuleUnsignedInteger);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(290);
    match(PascalParser::INTEGER);
   
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

tree::TerminalNode* PascalParser::UnsignedRealContext::REAL() {
  return getToken(PascalParser::REAL, 0);
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
  enterRule(_localctx, 24, PascalParser::RuleUnsignedReal);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(292);
    match(PascalParser::REAL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ScaleFactorContext ------------------------------------------------------------------

PascalParser::ScaleFactorContext::ScaleFactorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::UnsignedIntegerContext* PascalParser::ScaleFactorContext::unsignedInteger() {
  return getRuleContext<PascalParser::UnsignedIntegerContext>(0);
}

PascalParser::SignContext* PascalParser::ScaleFactorContext::sign() {
  return getRuleContext<PascalParser::SignContext>(0);
}


size_t PascalParser::ScaleFactorContext::getRuleIndex() const {
  return PascalParser::RuleScaleFactor;
}


antlrcpp::Any PascalParser::ScaleFactorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitScaleFactor(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ScaleFactorContext* PascalParser::scaleFactor() {
  ScaleFactorContext *_localctx = _tracker.createInstance<ScaleFactorContext>(_ctx, getState());
  enterRule(_localctx, 26, PascalParser::RuleScaleFactor);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(295);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PascalParser::PLUSOP

    || _la == PascalParser::MINUSOP) {
      setState(294);
      sign();
    }
    setState(297);
    unsignedInteger();
   
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

tree::TerminalNode* PascalParser::SignContext::PLUSOP() {
  return getToken(PascalParser::PLUSOP, 0);
}

tree::TerminalNode* PascalParser::SignContext::MINUSOP() {
  return getToken(PascalParser::MINUSOP, 0);
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
    setState(299);
    _la = _input->LA(1);
    if (!(_la == PascalParser::PLUSOP

    || _la == PascalParser::MINUSOP)) {
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

//----------------- ConstantIdentifierContext ------------------------------------------------------------------

PascalParser::ConstantIdentifierContext::ConstantIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::ConstantIdentifierContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::ConstantIdentifierContext::getRuleIndex() const {
  return PascalParser::RuleConstantIdentifier;
}


antlrcpp::Any PascalParser::ConstantIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitConstantIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ConstantIdentifierContext* PascalParser::constantIdentifier() {
  ConstantIdentifierContext *_localctx = _tracker.createInstance<ConstantIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 30, PascalParser::RuleConstantIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(301);
    identifier();
   
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
    setState(303);
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

PascalParser::EmptyContext* PascalParser::TypeDefinitionPartContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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

std::vector<tree::TerminalNode *> PascalParser::TypeDefinitionPartContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::TypeDefinitionPartContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    setState(317);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN:
      case PascalParser::FUNCTION:
      case PascalParser::PROCEDURE:
      case PascalParser::VAR: {
        enterOuterAlt(_localctx, 1);
        setState(305);
        empty();
        break;
      }

      case PascalParser::TYPE: {
        enterOuterAlt(_localctx, 2);
        setState(306);
        match(PascalParser::TYPE);
        setState(307);
        typeDefinition();
        setState(312);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(308);
            match(PascalParser::SEMICOLON);
            setState(309);
            typeDefinition(); 
          }
          setState(314);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx);
        }
        setState(315);
        match(PascalParser::SEMICOLON);
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

PascalParser::TypeContext* PascalParser::TypeDefinitionContext::type() {
  return getRuleContext<PascalParser::TypeContext>(0);
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
    setState(319);
    auto node = identifier();
    std::string name = node->getText();
    SymtabEntry *entry = symtabStack->enterLocal(name, Kind::TYPE);
    node->entry = entry;
    setState(320);
    match(PascalParser::EQUAL);
    setState(321);
    type();

   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

PascalParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::SimpleTypeContext* PascalParser::TypeContext::simpleType() {
  return getRuleContext<PascalParser::SimpleTypeContext>(0);
}

PascalParser::StructuredTypeContext* PascalParser::TypeContext::structuredType() {
  return getRuleContext<PascalParser::StructuredTypeContext>(0);
}

PascalParser::PointerTypeContext* PascalParser::TypeContext::pointerType() {
  return getRuleContext<PascalParser::PointerTypeContext>(0);
}


size_t PascalParser::TypeContext::getRuleIndex() const {
  return PascalParser::RuleType;
}


antlrcpp::Any PascalParser::TypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TypeContext* PascalParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 38, PascalParser::RuleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(326);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(323);
      simpleType();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(324);
      structuredType();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(325);
      pointerType();
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
  enterRule(_localctx, 40, PascalParser::RuleSimpleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(331);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(328);
      scalarType();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(329);
      subrangeType();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(330);
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

//----------------- ScalarTypeContext ------------------------------------------------------------------

PascalParser::ScalarTypeContext::ScalarTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ScalarTypeContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

std::vector<PascalParser::IdentifierContext *> PascalParser::ScalarTypeContext::identifier() {
  return getRuleContexts<PascalParser::IdentifierContext>();
}

PascalParser::IdentifierContext* PascalParser::ScalarTypeContext::identifier(size_t i) {
  return getRuleContext<PascalParser::IdentifierContext>(i);
}

tree::TerminalNode* PascalParser::ScalarTypeContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

std::vector<tree::TerminalNode *> PascalParser::ScalarTypeContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ScalarTypeContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 42, PascalParser::RuleScalarType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(333);
    match(PascalParser::LPAREN);
    setState(334);
    identifier();
    setState(339);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(335);
      match(PascalParser::COMMA);
      setState(336);
      identifier();
      setState(341);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(342);
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

tree::TerminalNode* PascalParser::SubrangeTypeContext::DOT_DOT() {
  return getToken(PascalParser::DOT_DOT, 0);
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
  enterRule(_localctx, 44, PascalParser::RuleSubrangeType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(344);
    constant();
    setState(345);
    match(PascalParser::DOT_DOT);
    setState(346);
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
  enterRule(_localctx, 46, PascalParser::RuleTypeIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(348);
    identifier();
   
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

PascalParser::ArrayTypeContext* PascalParser::StructuredTypeContext::arrayType() {
  return getRuleContext<PascalParser::ArrayTypeContext>(0);
}

PascalParser::RecordTypeContext* PascalParser::StructuredTypeContext::recordType() {
  return getRuleContext<PascalParser::RecordTypeContext>(0);
}

PascalParser::SetTypeContext* PascalParser::StructuredTypeContext::setType() {
  return getRuleContext<PascalParser::SetTypeContext>(0);
}

PascalParser::FileTypeContext* PascalParser::StructuredTypeContext::fileType() {
  return getRuleContext<PascalParser::FileTypeContext>(0);
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
  enterRule(_localctx, 48, PascalParser::RuleStructuredType);

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
        new Typespec(ARRAY);
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

//----------------- ArrayTypeContext ------------------------------------------------------------------

PascalParser::ArrayTypeContext::ArrayTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ArrayTypeContext::ARRAY() {
  return getToken(PascalParser::ARRAY, 0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::LBRACKET() {
  return getToken(PascalParser::LBRACKET, 0);
}

std::vector<PascalParser::IndexTypeContext *> PascalParser::ArrayTypeContext::indexType() {
  return getRuleContexts<PascalParser::IndexTypeContext>();
}

PascalParser::IndexTypeContext* PascalParser::ArrayTypeContext::indexType(size_t i) {
  return getRuleContext<PascalParser::IndexTypeContext>(i);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::RBRACKET() {
  return getToken(PascalParser::RBRACKET, 0);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::OF() {
  return getToken(PascalParser::OF, 0);
}

PascalParser::ComponentTypeContext* PascalParser::ArrayTypeContext::componentType() {
  return getRuleContext<PascalParser::ComponentTypeContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::ArrayTypeContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ArrayTypeContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 50, PascalParser::RuleArrayType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(356);
    match(PascalParser::ARRAY);
    setState(357);
    match(PascalParser::LBRACKET);
    setState(358);
    indexType();
    setState(363);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(359);
      match(PascalParser::COMMA);
      setState(360);
      indexType();
      setState(365);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(366);
    match(PascalParser::RBRACKET);
    setState(367);
    match(PascalParser::OF);
    setState(368);
    componentType();
   
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
  enterRule(_localctx, 52, PascalParser::RuleIndexType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(370);
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

PascalParser::TypeContext* PascalParser::ComponentTypeContext::type() {
  return getRuleContext<PascalParser::TypeContext>(0);
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
  enterRule(_localctx, 54, PascalParser::RuleComponentType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(372);
    type();
   
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
  enterRule(_localctx, 56, PascalParser::RuleRecordType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(374);
    match(PascalParser::RECORD);
    setState(375);
    fieldList();
    setState(376);
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

tree::TerminalNode* PascalParser::FieldListContext::SEMICOLON() {
  return getToken(PascalParser::SEMICOLON, 0);
}

PascalParser::VariantContext* PascalParser::FieldListContext::variant() {
  return getRuleContext<PascalParser::VariantContext>(0);
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
  enterRule(_localctx, 58, PascalParser::RuleFieldList);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(384);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(378);
      fixedPart();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(379);
      fixedPart();
      setState(380);
      match(PascalParser::SEMICOLON);
      setState(381);
      variant();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(383);
      variant();
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

std::vector<tree::TerminalNode *> PascalParser::FixedPartContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::FixedPartContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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
  enterRule(_localctx, 60, PascalParser::RuleFixedPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(386);
    recordSection();
    setState(391);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(387);
        match(PascalParser::SEMICOLON);
        setState(388);
        recordSection(); 
      }
      setState(393);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
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

std::vector<PascalParser::FieldIdentifierContext *> PascalParser::RecordSectionContext::fieldIdentifier() {
  return getRuleContexts<PascalParser::FieldIdentifierContext>();
}

PascalParser::FieldIdentifierContext* PascalParser::RecordSectionContext::fieldIdentifier(size_t i) {
  return getRuleContext<PascalParser::FieldIdentifierContext>(i);
}

tree::TerminalNode* PascalParser::RecordSectionContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::TypeContext* PascalParser::RecordSectionContext::type() {
  return getRuleContext<PascalParser::TypeContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::RecordSectionContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::RecordSectionContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}

PascalParser::EmptyContext* PascalParser::RecordSectionContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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
  enterRule(_localctx, 62, PascalParser::RuleRecordSection);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(406);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 1);
        setState(394);
        fieldIdentifier();
        setState(399);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == PascalParser::COMMA) {
          setState(395);
          match(PascalParser::COMMA);
          setState(396);
          fieldIdentifier();
          setState(401);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        setState(402);
        match(PascalParser::COLON);
        setState(403);
        type();
        break;
      }

      case PascalParser::EOF:
      case PascalParser::END:
      case PascalParser::SEMICOLON: {
        enterOuterAlt(_localctx, 2);
        setState(405);
        empty();
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

//----------------- VariantTypeContext ------------------------------------------------------------------

PascalParser::VariantTypeContext::VariantTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::VariantTypeContext::CASE() {
  return getToken(PascalParser::CASE, 0);
}

PascalParser::TagFieldContext* PascalParser::VariantTypeContext::tagField() {
  return getRuleContext<PascalParser::TagFieldContext>(0);
}

PascalParser::TypeIdentifierContext* PascalParser::VariantTypeContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}

tree::TerminalNode* PascalParser::VariantTypeContext::OF() {
  return getToken(PascalParser::OF, 0);
}

std::vector<PascalParser::VariantContext *> PascalParser::VariantTypeContext::variant() {
  return getRuleContexts<PascalParser::VariantContext>();
}

PascalParser::VariantContext* PascalParser::VariantTypeContext::variant(size_t i) {
  return getRuleContext<PascalParser::VariantContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::VariantTypeContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::VariantTypeContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
}


size_t PascalParser::VariantTypeContext::getRuleIndex() const {
  return PascalParser::RuleVariantType;
}


antlrcpp::Any PascalParser::VariantTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariantType(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariantTypeContext* PascalParser::variantType() {
  VariantTypeContext *_localctx = _tracker.createInstance<VariantTypeContext>(_ctx, getState());
  enterRule(_localctx, 64, PascalParser::RuleVariantType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(408);
    match(PascalParser::CASE);
    setState(409);
    tagField();
    setState(410);
    typeIdentifier();
    setState(411);
    match(PascalParser::OF);
    setState(412);
    variant();
    setState(417);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMICOLON) {
      setState(413);
      match(PascalParser::SEMICOLON);
      setState(414);
      variant();
      setState(419);
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

//----------------- TagFieldContext ------------------------------------------------------------------

PascalParser::TagFieldContext::TagFieldContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::FieldIdentifierContext* PascalParser::TagFieldContext::fieldIdentifier() {
  return getRuleContext<PascalParser::FieldIdentifierContext>(0);
}

tree::TerminalNode* PascalParser::TagFieldContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::EmptyContext* PascalParser::TagFieldContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
}


size_t PascalParser::TagFieldContext::getRuleIndex() const {
  return PascalParser::RuleTagField;
}


antlrcpp::Any PascalParser::TagFieldContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitTagField(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::TagFieldContext* PascalParser::tagField() {
  TagFieldContext *_localctx = _tracker.createInstance<TagFieldContext>(_ctx, getState());
  enterRule(_localctx, 66, PascalParser::RuleTagField);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(424);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(420);
      fieldIdentifier();
      setState(421);
      match(PascalParser::COLON);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(423);
      empty();
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

PascalParser::CaseLabelListContext* PascalParser::VariantContext::caseLabelList() {
  return getRuleContext<PascalParser::CaseLabelListContext>(0);
}

tree::TerminalNode* PascalParser::VariantContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::FieldListContext* PascalParser::VariantContext::fieldList() {
  return getRuleContext<PascalParser::FieldListContext>(0);
}

PascalParser::EmptyContext* PascalParser::VariantContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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
  enterRule(_localctx, 68, PascalParser::RuleVariant);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(431);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::REAL:
      case PascalParser::INTEGER:
      case PascalParser::IDENTIFIER:
      case PascalParser::CHARACTER:
      case PascalParser::STRING_LITERAL:
      case PascalParser::PLUSOP:
      case PascalParser::MINUSOP: {
        enterOuterAlt(_localctx, 1);
        setState(426);
        caseLabelList();
        setState(427);
        match(PascalParser::COLON);

        setState(428);
        fieldList();
        break;
      }

      case PascalParser::EOF:
      case PascalParser::END:
      case PascalParser::SEMICOLON: {
        enterOuterAlt(_localctx, 2);
        setState(430);
        empty();
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

//----------------- CaseLabelContext ------------------------------------------------------------------

PascalParser::CaseLabelContext::CaseLabelContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ConstantContext* PascalParser::CaseLabelContext::constant() {
  return getRuleContext<PascalParser::ConstantContext>(0);
}


size_t PascalParser::CaseLabelContext::getRuleIndex() const {
  return PascalParser::RuleCaseLabel;
}


antlrcpp::Any PascalParser::CaseLabelContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitCaseLabel(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::CaseLabelContext* PascalParser::caseLabel() {
  CaseLabelContext *_localctx = _tracker.createInstance<CaseLabelContext>(_ctx, getState());
  enterRule(_localctx, 70, PascalParser::RuleCaseLabel);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(433);
    constant();
   
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
  enterRule(_localctx, 72, PascalParser::RuleSetType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(435);
    match(PascalParser::SET);
    setState(436);
    match(PascalParser::OF);
    setState(437);
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
  enterRule(_localctx, 74, PascalParser::RuleBaseType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(439);
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

PascalParser::TypeContext* PascalParser::FileTypeContext::type() {
  return getRuleContext<PascalParser::TypeContext>(0);
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
  enterRule(_localctx, 76, PascalParser::RuleFileType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(441);
    match(PascalParser::FILE);
    setState(442);
    match(PascalParser::OF);
    setState(443);
    type();
   
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
  enterRule(_localctx, 78, PascalParser::RulePointerType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(445);
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

PascalParser::EmptyContext* PascalParser::VariableDeclarationPartContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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

std::vector<tree::TerminalNode *> PascalParser::VariableDeclarationPartContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::VariableDeclarationPartContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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
  enterRule(_localctx, 80, PascalParser::RuleVariableDeclarationPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    setState(459);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN:
      case PascalParser::FUNCTION:
      case PascalParser::PROCEDURE: {
        enterOuterAlt(_localctx, 1);
        setState(447);
        empty();
        break;
      }

      case PascalParser::VAR: {
        enterOuterAlt(_localctx, 2);
        setState(448);
        match(PascalParser::VAR);
        setState(449);
        variableDeclaration();
        setState(454);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(450);
            match(PascalParser::SEMICOLON);
            setState(451);
            variableDeclaration(); 
          }
          setState(456);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
        }
        setState(457);
        match(PascalParser::SEMICOLON);
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

//----------------- VariableDeclarationContext ------------------------------------------------------------------

PascalParser::VariableDeclarationContext::VariableDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::IdentifierContext *> PascalParser::VariableDeclarationContext::identifier() {
  return getRuleContexts<PascalParser::IdentifierContext>();
}

PascalParser::IdentifierContext* PascalParser::VariableDeclarationContext::identifier(size_t i) {
  return getRuleContext<PascalParser::IdentifierContext>(i);
}

tree::TerminalNode* PascalParser::VariableDeclarationContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::TypeContext* PascalParser::VariableDeclarationContext::type() {
  return getRuleContext<PascalParser::TypeContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::VariableDeclarationContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::VariableDeclarationContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 82, PascalParser::RuleVariableDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(461);
    identifier();
    setState(466);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(462);
      match(PascalParser::COMMA);
      setState(463);
      identifier();
      setState(468);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(469);
    match(PascalParser::COLON);
    setState(470);
    type();
   
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

std::vector<PascalParser::ProcedureOrFunctionDeclarationContext *> PascalParser::ProcedureAndFunctionDeclarationPartContext::procedureOrFunctionDeclaration() {
  return getRuleContexts<PascalParser::ProcedureOrFunctionDeclarationContext>();
}

PascalParser::ProcedureOrFunctionDeclarationContext* PascalParser::ProcedureAndFunctionDeclarationPartContext::procedureOrFunctionDeclaration(size_t i) {
  return getRuleContext<PascalParser::ProcedureOrFunctionDeclarationContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::ProcedureAndFunctionDeclarationPartContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::ProcedureAndFunctionDeclarationPartContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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
  enterRule(_localctx, 84, PascalParser::RuleProcedureAndFunctionDeclarationPart);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(477);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::FUNCTION

    || _la == PascalParser::PROCEDURE) {
      setState(472);
      procedureOrFunctionDeclaration();
      setState(473);
      match(PascalParser::SEMICOLON);
      setState(479);
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
  enterRule(_localctx, 86, PascalParser::RuleProcedureOrFunctionDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(482);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::PROCEDURE: {
        enterOuterAlt(_localctx, 1);
        setState(480);
        procedureDeclaration();
        break;
      }

      case PascalParser::FUNCTION: {
        enterOuterAlt(_localctx, 2);
        setState(481);
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

PascalParser::ProcedureHeadingContext* PascalParser::ProcedureDeclarationContext::procedureHeading() {
  return getRuleContext<PascalParser::ProcedureHeadingContext>(0);
}

PascalParser::BlockContext* PascalParser::ProcedureDeclarationContext::block() {
  return getRuleContext<PascalParser::BlockContext>(0);
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
  enterRule(_localctx, 88, PascalParser::RuleProcedureDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(484);
    procedureHeading();
    setState(485);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProcedureHeadingContext ------------------------------------------------------------------

PascalParser::ProcedureHeadingContext::ProcedureHeadingContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::ProcedureHeadingContext::PROCEDURE() {
  return getToken(PascalParser::PROCEDURE, 0);
}

PascalParser::IdentifierContext* PascalParser::ProcedureHeadingContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::ProcedureHeadingContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::ProcedureHeadingContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
}

tree::TerminalNode* PascalParser::ProcedureHeadingContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

std::vector<PascalParser::FormalParameterSectionContext *> PascalParser::ProcedureHeadingContext::formalParameterSection() {
  return getRuleContexts<PascalParser::FormalParameterSectionContext>();
}

PascalParser::FormalParameterSectionContext* PascalParser::ProcedureHeadingContext::formalParameterSection(size_t i) {
  return getRuleContext<PascalParser::FormalParameterSectionContext>(i);
}

tree::TerminalNode* PascalParser::ProcedureHeadingContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}


size_t PascalParser::ProcedureHeadingContext::getRuleIndex() const {
  return PascalParser::RuleProcedureHeading;
}


antlrcpp::Any PascalParser::ProcedureHeadingContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureHeading(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureHeadingContext* PascalParser::procedureHeading() {
  ProcedureHeadingContext *_localctx = _tracker.createInstance<ProcedureHeadingContext>(_ctx, getState());
  enterRule(_localctx, 90, PascalParser::RuleProcedureHeading);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(505);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(487);
      match(PascalParser::PROCEDURE);
      setState(488);
      identifier();
      setState(489);
      match(PascalParser::SEMICOLON);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(491);
      match(PascalParser::PROCEDURE);
      setState(492);
      identifier();
      setState(493);
      match(PascalParser::LPAREN);
      setState(494);
      formalParameterSection();
      setState(499);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PascalParser::SEMICOLON) {
        setState(495);
        match(PascalParser::SEMICOLON);
        setState(496);
        formalParameterSection();
        setState(501);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(502);
      match(PascalParser::RPAREN);
      setState(503);
      match(PascalParser::SEMICOLON);
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

std::vector<PascalParser::IdentifierContext *> PascalParser::FormalParameterSectionContext::identifier() {
  return getRuleContexts<PascalParser::IdentifierContext>();
}

PascalParser::IdentifierContext* PascalParser::FormalParameterSectionContext::identifier(size_t i) {
  return getRuleContext<PascalParser::IdentifierContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::FormalParameterSectionContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::FormalParameterSectionContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 92, PascalParser::RuleFormalParameterSection);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(521);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 1);
        setState(507);
        parameterGroup();
        break;
      }

      case PascalParser::VAR: {
        enterOuterAlt(_localctx, 2);
        setState(508);
        match(PascalParser::VAR);
        setState(509);
        parameterGroup();
        break;
      }

      case PascalParser::FUNCTION: {
        enterOuterAlt(_localctx, 3);
        setState(510);
        match(PascalParser::FUNCTION);
        setState(511);
        parameterGroup();
        break;
      }

      case PascalParser::PROCEDURE: {
        enterOuterAlt(_localctx, 4);
        setState(512);
        match(PascalParser::PROCEDURE);
        setState(513);
        identifier();
        setState(518);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == PascalParser::COMMA) {
          setState(514);
          match(PascalParser::COMMA);
          setState(515);
          identifier();
          setState(520);
          _errHandler->sync(this);
          _la = _input->LA(1);
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

//----------------- ParameterGroupContext ------------------------------------------------------------------

PascalParser::ParameterGroupContext::ParameterGroupContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::IdentifierContext *> PascalParser::ParameterGroupContext::identifier() {
  return getRuleContexts<PascalParser::IdentifierContext>();
}

PascalParser::IdentifierContext* PascalParser::ParameterGroupContext::identifier(size_t i) {
  return getRuleContext<PascalParser::IdentifierContext>(i);
}

tree::TerminalNode* PascalParser::ParameterGroupContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::TypeIdentifierContext* PascalParser::ParameterGroupContext::typeIdentifier() {
  return getRuleContext<PascalParser::TypeIdentifierContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::ParameterGroupContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ParameterGroupContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 94, PascalParser::RuleParameterGroup);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(523);
    identifier();
    setState(528);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(524);
      match(PascalParser::COMMA);
      setState(525);
      identifier();
      setState(530);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(531);
    match(PascalParser::COLON);
    setState(532);
    typeIdentifier();
   
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

PascalParser::FunctionHeadingContext* PascalParser::FunctionDeclarationContext::functionHeading() {
  return getRuleContext<PascalParser::FunctionHeadingContext>(0);
}

PascalParser::BlockContext* PascalParser::FunctionDeclarationContext::block() {
  return getRuleContext<PascalParser::BlockContext>(0);
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
  enterRule(_localctx, 96, PascalParser::RuleFunctionDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(534);
    functionHeading();
    setState(535);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionHeadingContext ------------------------------------------------------------------

PascalParser::FunctionHeadingContext::FunctionHeadingContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::FunctionHeadingContext::FUNCTION() {
  return getToken(PascalParser::FUNCTION, 0);
}

PascalParser::IdentifierContext* PascalParser::FunctionHeadingContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}

tree::TerminalNode* PascalParser::FunctionHeadingContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::ResultTypeContext* PascalParser::FunctionHeadingContext::resultType() {
  return getRuleContext<PascalParser::ResultTypeContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::FunctionHeadingContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::FunctionHeadingContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
}

tree::TerminalNode* PascalParser::FunctionHeadingContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

std::vector<PascalParser::FormalParameterSectionContext *> PascalParser::FunctionHeadingContext::formalParameterSection() {
  return getRuleContexts<PascalParser::FormalParameterSectionContext>();
}

PascalParser::FormalParameterSectionContext* PascalParser::FunctionHeadingContext::formalParameterSection(size_t i) {
  return getRuleContext<PascalParser::FormalParameterSectionContext>(i);
}

tree::TerminalNode* PascalParser::FunctionHeadingContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}


size_t PascalParser::FunctionHeadingContext::getRuleIndex() const {
  return PascalParser::RuleFunctionHeading;
}


antlrcpp::Any PascalParser::FunctionHeadingContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFunctionHeading(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FunctionHeadingContext* PascalParser::functionHeading() {
  FunctionHeadingContext *_localctx = _tracker.createInstance<FunctionHeadingContext>(_ctx, getState());
  enterRule(_localctx, 98, PascalParser::RuleFunctionHeading);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(558);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 34, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(537);
      match(PascalParser::FUNCTION);
      setState(538);
      identifier();
      setState(539);
      match(PascalParser::COLON);
      setState(540);
      resultType();
      setState(541);
      match(PascalParser::SEMICOLON);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(543);
      match(PascalParser::FUNCTION);
      setState(544);
      identifier();
      setState(545);
      match(PascalParser::LPAREN);
      setState(546);
      formalParameterSection();
      setState(551);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PascalParser::SEMICOLON) {
        setState(547);
        match(PascalParser::SEMICOLON);
        setState(548);
        formalParameterSection();
        setState(553);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(554);
      match(PascalParser::RPAREN);
      setState(555);
      resultType();
      setState(556);
      match(PascalParser::SEMICOLON);
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
  enterRule(_localctx, 100, PascalParser::RuleResultType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(560);
    typeIdentifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementPartContext ------------------------------------------------------------------

PascalParser::StatementPartContext::StatementPartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::CompoundStatementContext* PascalParser::StatementPartContext::compoundStatement() {
  return getRuleContext<PascalParser::CompoundStatementContext>(0);
}


size_t PascalParser::StatementPartContext::getRuleIndex() const {
  return PascalParser::RuleStatementPart;
}


antlrcpp::Any PascalParser::StatementPartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitStatementPart(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::StatementPartContext* PascalParser::statementPart() {
  StatementPartContext *_localctx = _tracker.createInstance<StatementPartContext>(_ctx, getState());
  enterRule(_localctx, 102, PascalParser::RuleStatementPart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(562);
    compoundStatement();
   
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

PascalParser::UnlabelledStatementContext* PascalParser::StatementContext::unlabelledStatement() {
  return getRuleContext<PascalParser::UnlabelledStatementContext>(0);
}

PascalParser::LabelContext* PascalParser::StatementContext::label() {
  return getRuleContext<PascalParser::LabelContext>(0);
}

tree::TerminalNode* PascalParser::StatementContext::COLON() {
  return getToken(PascalParser::COLON, 0);
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
  enterRule(_localctx, 104, PascalParser::RuleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(569);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN:
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
      case PascalParser::IDENTIFIER:
      case PascalParser::SEMICOLON: {
        enterOuterAlt(_localctx, 1);
        setState(564);
        unlabelledStatement();
        break;
      }

      case PascalParser::INTEGER: {
        enterOuterAlt(_localctx, 2);
        setState(565);
        label();
        setState(566);
        match(PascalParser::COLON);
        setState(567);
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
  enterRule(_localctx, 106, PascalParser::RuleUnlabelledStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(573);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::ELSE:
      case PascalParser::END:
      case PascalParser::GOTO:
      case PascalParser::UNTIL:
      case PascalParser::IDENTIFIER:
      case PascalParser::SEMICOLON: {
        enterOuterAlt(_localctx, 1);
        setState(571);
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
        setState(572);
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

PascalParser::GoToStatementContext* PascalParser::SimpleStatementContext::goToStatement() {
  return getRuleContext<PascalParser::GoToStatementContext>(0);
}

PascalParser::EmptyStatementContext* PascalParser::SimpleStatementContext::emptyStatement() {
  return getRuleContext<PascalParser::EmptyStatementContext>(0);
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
  enterRule(_localctx, 108, PascalParser::RuleSimpleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(579);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(575);
      assignmentStatement();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(576);
      procedureStatement();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(577);
      goToStatement();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(578);
      emptyStatement();
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

PascalParser::FunctionIdentifierContext* PascalParser::AssignmentStatementContext::functionIdentifier() {
  return getRuleContext<PascalParser::FunctionIdentifierContext>(0);
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
  enterRule(_localctx, 110, PascalParser::RuleAssignmentStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(589);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(581);
      variable();
      setState(582);
      match(PascalParser::ASSIGN);
      setState(583);
      expression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(585);
      functionIdentifier();
      setState(586);
      match(PascalParser::ASSIGN);
      setState(587);
      expression();
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

//----------------- VariableContext ------------------------------------------------------------------

PascalParser::VariableContext::VariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::EntireVariableContext* PascalParser::VariableContext::entireVariable() {
  return getRuleContext<PascalParser::EntireVariableContext>(0);
}

PascalParser::ComponentVariableContext* PascalParser::VariableContext::componentVariable() {
  return getRuleContext<PascalParser::ComponentVariableContext>(0);
}

PascalParser::ReferencedVariableContext* PascalParser::VariableContext::referencedVariable() {
  return getRuleContext<PascalParser::ReferencedVariableContext>(0);
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
  enterRule(_localctx, 112, PascalParser::RuleVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(594);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 39, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(591);
      entireVariable();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(592);
      componentVariable();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(593);
      referencedVariable();
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

//----------------- EntireVariableContext ------------------------------------------------------------------

PascalParser::EntireVariableContext::EntireVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::VariableIdentifierContext* PascalParser::EntireVariableContext::variableIdentifier() {
  return getRuleContext<PascalParser::VariableIdentifierContext>(0);
}


size_t PascalParser::EntireVariableContext::getRuleIndex() const {
  return PascalParser::RuleEntireVariable;
}


antlrcpp::Any PascalParser::EntireVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitEntireVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::EntireVariableContext* PascalParser::entireVariable() {
  EntireVariableContext *_localctx = _tracker.createInstance<EntireVariableContext>(_ctx, getState());
  enterRule(_localctx, 114, PascalParser::RuleEntireVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(596);
    variableIdentifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableIdentifierContext ------------------------------------------------------------------

PascalParser::VariableIdentifierContext::VariableIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::VariableIdentifierContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::VariableIdentifierContext::getRuleIndex() const {
  return PascalParser::RuleVariableIdentifier;
}


antlrcpp::Any PascalParser::VariableIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitVariableIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::VariableIdentifierContext* PascalParser::variableIdentifier() {
  VariableIdentifierContext *_localctx = _tracker.createInstance<VariableIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 116, PascalParser::RuleVariableIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(598);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ComponentVariableContext ------------------------------------------------------------------

PascalParser::ComponentVariableContext::ComponentVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IndexedVariableContext* PascalParser::ComponentVariableContext::indexedVariable() {
  return getRuleContext<PascalParser::IndexedVariableContext>(0);
}

PascalParser::FieldDesignatorContext* PascalParser::ComponentVariableContext::fieldDesignator() {
  return getRuleContext<PascalParser::FieldDesignatorContext>(0);
}

PascalParser::FileBufferContext* PascalParser::ComponentVariableContext::fileBuffer() {
  return getRuleContext<PascalParser::FileBufferContext>(0);
}


size_t PascalParser::ComponentVariableContext::getRuleIndex() const {
  return PascalParser::RuleComponentVariable;
}


antlrcpp::Any PascalParser::ComponentVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitComponentVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ComponentVariableContext* PascalParser::componentVariable() {
  ComponentVariableContext *_localctx = _tracker.createInstance<ComponentVariableContext>(_ctx, getState());
  enterRule(_localctx, 118, PascalParser::RuleComponentVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(603);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(600);
      indexedVariable();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(601);
      fieldDesignator();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(602);
      fileBuffer();
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

//----------------- IndexedVariableContext ------------------------------------------------------------------

PascalParser::IndexedVariableContext::IndexedVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ArrayVariableContext* PascalParser::IndexedVariableContext::arrayVariable() {
  return getRuleContext<PascalParser::ArrayVariableContext>(0);
}

tree::TerminalNode* PascalParser::IndexedVariableContext::LBRACKET() {
  return getToken(PascalParser::LBRACKET, 0);
}

std::vector<PascalParser::ExpressionContext *> PascalParser::IndexedVariableContext::expression() {
  return getRuleContexts<PascalParser::ExpressionContext>();
}

PascalParser::ExpressionContext* PascalParser::IndexedVariableContext::expression(size_t i) {
  return getRuleContext<PascalParser::ExpressionContext>(i);
}

tree::TerminalNode* PascalParser::IndexedVariableContext::RBRACKET() {
  return getToken(PascalParser::RBRACKET, 0);
}

std::vector<tree::TerminalNode *> PascalParser::IndexedVariableContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::IndexedVariableContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::IndexedVariableContext::getRuleIndex() const {
  return PascalParser::RuleIndexedVariable;
}


antlrcpp::Any PascalParser::IndexedVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitIndexedVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::IndexedVariableContext* PascalParser::indexedVariable() {
  IndexedVariableContext *_localctx = _tracker.createInstance<IndexedVariableContext>(_ctx, getState());
  enterRule(_localctx, 120, PascalParser::RuleIndexedVariable);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(605);
    arrayVariable();
    setState(606);
    match(PascalParser::LBRACKET);
    setState(607);
    expression();
    setState(612);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(608);
      match(PascalParser::COMMA);
      setState(609);
      expression();
      setState(614);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(615);
    match(PascalParser::RBRACKET);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayVariableContext ------------------------------------------------------------------

PascalParser::ArrayVariableContext::ArrayVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::ArrayVariableContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::ArrayVariableContext::getRuleIndex() const {
  return PascalParser::RuleArrayVariable;
}


antlrcpp::Any PascalParser::ArrayVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitArrayVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ArrayVariableContext* PascalParser::arrayVariable() {
  ArrayVariableContext *_localctx = _tracker.createInstance<ArrayVariableContext>(_ctx, getState());
  enterRule(_localctx, 122, PascalParser::RuleArrayVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(617);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldDesignatorContext ------------------------------------------------------------------

PascalParser::FieldDesignatorContext::FieldDesignatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::RecordVariableContext* PascalParser::FieldDesignatorContext::recordVariable() {
  return getRuleContext<PascalParser::RecordVariableContext>(0);
}

tree::TerminalNode* PascalParser::FieldDesignatorContext::PERIOD() {
  return getToken(PascalParser::PERIOD, 0);
}

PascalParser::FieldIdentifierContext* PascalParser::FieldDesignatorContext::fieldIdentifier() {
  return getRuleContext<PascalParser::FieldIdentifierContext>(0);
}


size_t PascalParser::FieldDesignatorContext::getRuleIndex() const {
  return PascalParser::RuleFieldDesignator;
}


antlrcpp::Any PascalParser::FieldDesignatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFieldDesignator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FieldDesignatorContext* PascalParser::fieldDesignator() {
  FieldDesignatorContext *_localctx = _tracker.createInstance<FieldDesignatorContext>(_ctx, getState());
  enterRule(_localctx, 124, PascalParser::RuleFieldDesignator);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(619);
    recordVariable();
    setState(620);
    match(PascalParser::PERIOD);
    setState(621);
    fieldIdentifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RecordVariableContext ------------------------------------------------------------------

PascalParser::RecordVariableContext::RecordVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::RecordVariableContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::RecordVariableContext::getRuleIndex() const {
  return PascalParser::RuleRecordVariable;
}


antlrcpp::Any PascalParser::RecordVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRecordVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RecordVariableContext* PascalParser::recordVariable() {
  RecordVariableContext *_localctx = _tracker.createInstance<RecordVariableContext>(_ctx, getState());
  enterRule(_localctx, 126, PascalParser::RuleRecordVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(623);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldIdentifierContext ------------------------------------------------------------------

PascalParser::FieldIdentifierContext::FieldIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::FieldIdentifierContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::FieldIdentifierContext::getRuleIndex() const {
  return PascalParser::RuleFieldIdentifier;
}


antlrcpp::Any PascalParser::FieldIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFieldIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FieldIdentifierContext* PascalParser::fieldIdentifier() {
  FieldIdentifierContext *_localctx = _tracker.createInstance<FieldIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 128, PascalParser::RuleFieldIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(625);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FileBufferContext ------------------------------------------------------------------

PascalParser::FileBufferContext::FileBufferContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::FileBufferContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::FileBufferContext::getRuleIndex() const {
  return PascalParser::RuleFileBuffer;
}


antlrcpp::Any PascalParser::FileBufferContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFileBuffer(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FileBufferContext* PascalParser::fileBuffer() {
  FileBufferContext *_localctx = _tracker.createInstance<FileBufferContext>(_ctx, getState());
  enterRule(_localctx, 130, PascalParser::RuleFileBuffer);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(627);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FileVariableContext ------------------------------------------------------------------

PascalParser::FileVariableContext::FileVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::FileVariableContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::FileVariableContext::getRuleIndex() const {
  return PascalParser::RuleFileVariable;
}


antlrcpp::Any PascalParser::FileVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFileVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FileVariableContext* PascalParser::fileVariable() {
  FileVariableContext *_localctx = _tracker.createInstance<FileVariableContext>(_ctx, getState());
  enterRule(_localctx, 132, PascalParser::RuleFileVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(629);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ReferencedVariableContext ------------------------------------------------------------------

PascalParser::ReferencedVariableContext::ReferencedVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::PointerVariableContext* PascalParser::ReferencedVariableContext::pointerVariable() {
  return getRuleContext<PascalParser::PointerVariableContext>(0);
}


size_t PascalParser::ReferencedVariableContext::getRuleIndex() const {
  return PascalParser::RuleReferencedVariable;
}


antlrcpp::Any PascalParser::ReferencedVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitReferencedVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ReferencedVariableContext* PascalParser::referencedVariable() {
  ReferencedVariableContext *_localctx = _tracker.createInstance<ReferencedVariableContext>(_ctx, getState());
  enterRule(_localctx, 134, PascalParser::RuleReferencedVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(631);
    pointerVariable();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PointerVariableContext ------------------------------------------------------------------

PascalParser::PointerVariableContext::PointerVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::PointerVariableContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::PointerVariableContext::getRuleIndex() const {
  return PascalParser::RulePointerVariable;
}


antlrcpp::Any PascalParser::PointerVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitPointerVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::PointerVariableContext* PascalParser::pointerVariable() {
  PointerVariableContext *_localctx = _tracker.createInstance<PointerVariableContext>(_ctx, getState());
  enterRule(_localctx, 136, PascalParser::RulePointerVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(633);
    identifier();
   
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

std::vector<PascalParser::SimpleExpressionContext *> PascalParser::ExpressionContext::simpleExpression() {
  return getRuleContexts<PascalParser::SimpleExpressionContext>();
}

PascalParser::SimpleExpressionContext* PascalParser::ExpressionContext::simpleExpression(size_t i) {
  return getRuleContext<PascalParser::SimpleExpressionContext>(i);
}

PascalParser::RelationalOperatorContext* PascalParser::ExpressionContext::relationalOperator() {
  return getRuleContext<PascalParser::RelationalOperatorContext>(0);
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
  enterRule(_localctx, 138, PascalParser::RuleExpression);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(640);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(635);
      simpleExpression(0);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(636);
      simpleExpression(0);
      setState(637);
      relationalOperator();
      setState(638);
      simpleExpression(0);
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

//----------------- RelationalOperatorContext ------------------------------------------------------------------

PascalParser::RelationalOperatorContext::RelationalOperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::EQUAL() {
  return getToken(PascalParser::EQUAL, 0);
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::NE() {
  return getToken(PascalParser::NE, 0);
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::LTEQ() {
  return getToken(PascalParser::LTEQ, 0);
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::GTEQ() {
  return getToken(PascalParser::GTEQ, 0);
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::LT() {
  return getToken(PascalParser::LT, 0);
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::GT() {
  return getToken(PascalParser::GT, 0);
}

tree::TerminalNode* PascalParser::RelationalOperatorContext::IN() {
  return getToken(PascalParser::IN, 0);
}


size_t PascalParser::RelationalOperatorContext::getRuleIndex() const {
  return PascalParser::RuleRelationalOperator;
}


antlrcpp::Any PascalParser::RelationalOperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRelationalOperator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RelationalOperatorContext* PascalParser::relationalOperator() {
  RelationalOperatorContext *_localctx = _tracker.createInstance<RelationalOperatorContext>(_ctx, getState());
  enterRule(_localctx, 140, PascalParser::RuleRelationalOperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(642);
    _la = _input->LA(1);
    if (!(((((_la - 23) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 23)) & ((1ULL << (PascalParser::IN - 23))
      | (1ULL << (PascalParser::EQUAL - 23))
      | (1ULL << (PascalParser::NE - 23))
      | (1ULL << (PascalParser::LTEQ - 23))
      | (1ULL << (PascalParser::GTEQ - 23))
      | (1ULL << (PascalParser::LT - 23))
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

PascalParser::SignContext* PascalParser::SimpleExpressionContext::sign() {
  return getRuleContext<PascalParser::SignContext>(0);
}

PascalParser::SimpleExpressionContext* PascalParser::SimpleExpressionContext::simpleExpression() {
  return getRuleContext<PascalParser::SimpleExpressionContext>(0);
}

PascalParser::AddingOperatorContext* PascalParser::SimpleExpressionContext::addingOperator() {
  return getRuleContext<PascalParser::AddingOperatorContext>(0);
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
   return simpleExpression(0);
}

PascalParser::SimpleExpressionContext* PascalParser::simpleExpression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PascalParser::SimpleExpressionContext *_localctx = _tracker.createInstance<SimpleExpressionContext>(_ctx, parentState);
  PascalParser::SimpleExpressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 142;
  enterRecursionRule(_localctx, 142, PascalParser::RuleSimpleExpression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(649);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::NOT:
      case PascalParser::REAL:
      case PascalParser::INTEGER:
      case PascalParser::IDENTIFIER:
      case PascalParser::STRING_LITERAL:
      case PascalParser::LPAREN:
      case PascalParser::LBRACKET: {
        setState(645);
        term(0);
        break;
      }

      case PascalParser::PLUSOP:
      case PascalParser::MINUSOP: {
        setState(646);
        sign();
        setState(647);
        term(0);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    _ctx->stop = _input->LT(-1);
    setState(657);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 44, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<SimpleExpressionContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleSimpleExpression);
        setState(651);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(652);
        addingOperator();
        setState(653);
        term(0); 
      }
      setState(659);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 44, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- AddingOperatorContext ------------------------------------------------------------------

PascalParser::AddingOperatorContext::AddingOperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::AddingOperatorContext::PLUSOP() {
  return getToken(PascalParser::PLUSOP, 0);
}

tree::TerminalNode* PascalParser::AddingOperatorContext::MINUSOP() {
  return getToken(PascalParser::MINUSOP, 0);
}

tree::TerminalNode* PascalParser::AddingOperatorContext::OR() {
  return getToken(PascalParser::OR, 0);
}


size_t PascalParser::AddingOperatorContext::getRuleIndex() const {
  return PascalParser::RuleAddingOperator;
}


antlrcpp::Any PascalParser::AddingOperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitAddingOperator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::AddingOperatorContext* PascalParser::addingOperator() {
  AddingOperatorContext *_localctx = _tracker.createInstance<AddingOperatorContext>(_ctx, getState());
  enterRule(_localctx, 144, PascalParser::RuleAddingOperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(660);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::OR)
      | (1ULL << PascalParser::PLUSOP)
      | (1ULL << PascalParser::MINUSOP))) != 0))) {
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

PascalParser::FactorContext* PascalParser::TermContext::factor() {
  return getRuleContext<PascalParser::FactorContext>(0);
}

PascalParser::TermContext* PascalParser::TermContext::term() {
  return getRuleContext<PascalParser::TermContext>(0);
}

PascalParser::MultiplyingOperatorContext* PascalParser::TermContext::multiplyingOperator() {
  return getRuleContext<PascalParser::MultiplyingOperatorContext>(0);
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
   return term(0);
}

PascalParser::TermContext* PascalParser::term(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PascalParser::TermContext *_localctx = _tracker.createInstance<TermContext>(_ctx, parentState);
  PascalParser::TermContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 146;
  enterRecursionRule(_localctx, 146, PascalParser::RuleTerm, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(663);
    factor();
    _ctx->stop = _input->LT(-1);
    setState(671);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<TermContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleTerm);
        setState(665);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(666);
        multiplyingOperator();
        setState(667);
        factor(); 
      }
      setState(673);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- MultiplyingOperatorContext ------------------------------------------------------------------

PascalParser::MultiplyingOperatorContext::MultiplyingOperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::MultiplyingOperatorContext::MULTOP() {
  return getToken(PascalParser::MULTOP, 0);
}

tree::TerminalNode* PascalParser::MultiplyingOperatorContext::DIVOP() {
  return getToken(PascalParser::DIVOP, 0);
}

tree::TerminalNode* PascalParser::MultiplyingOperatorContext::DIV() {
  return getToken(PascalParser::DIV, 0);
}

tree::TerminalNode* PascalParser::MultiplyingOperatorContext::MOD() {
  return getToken(PascalParser::MOD, 0);
}

tree::TerminalNode* PascalParser::MultiplyingOperatorContext::AND() {
  return getToken(PascalParser::AND, 0);
}


size_t PascalParser::MultiplyingOperatorContext::getRuleIndex() const {
  return PascalParser::RuleMultiplyingOperator;
}


antlrcpp::Any PascalParser::MultiplyingOperatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitMultiplyingOperator(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::MultiplyingOperatorContext* PascalParser::multiplyingOperator() {
  MultiplyingOperatorContext *_localctx = _tracker.createInstance<MultiplyingOperatorContext>(_ctx, getState());
  enterRule(_localctx, 148, PascalParser::RuleMultiplyingOperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(674);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PascalParser::AND)
      | (1ULL << PascalParser::DIV)
      | (1ULL << PascalParser::MOD)
      | (1ULL << PascalParser::MULTOP)
      | (1ULL << PascalParser::DIVOP))) != 0))) {
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

//----------------- FactorContext ------------------------------------------------------------------

PascalParser::FactorContext::FactorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::VariableContext* PascalParser::FactorContext::variable() {
  return getRuleContext<PascalParser::VariableContext>(0);
}

PascalParser::UnsignedConstantContext* PascalParser::FactorContext::unsignedConstant() {
  return getRuleContext<PascalParser::UnsignedConstantContext>(0);
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

PascalParser::SetContext* PascalParser::FactorContext::set() {
  return getRuleContext<PascalParser::SetContext>(0);
}

tree::TerminalNode* PascalParser::FactorContext::NOT() {
  return getToken(PascalParser::NOT, 0);
}

PascalParser::FactorContext* PascalParser::FactorContext::factor() {
  return getRuleContext<PascalParser::FactorContext>(0);
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
  enterRule(_localctx, 150, PascalParser::RuleFactor);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(686);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(676);
      variable();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(677);
      unsignedConstant();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(678);
      match(PascalParser::LPAREN);
      setState(679);
      expression();
      setState(680);
      match(PascalParser::RPAREN);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(682);
      functionDesignator();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(683);
      set();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(684);
      match(PascalParser::NOT);
      setState(685);
      factor();
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

PascalParser::StringContext* PascalParser::UnsignedConstantContext::string() {
  return getRuleContext<PascalParser::StringContext>(0);
}

PascalParser::ConstantIdentifierContext* PascalParser::UnsignedConstantContext::constantIdentifier() {
  return getRuleContext<PascalParser::ConstantIdentifierContext>(0);
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
  enterRule(_localctx, 152, PascalParser::RuleUnsignedConstant);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(691);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::REAL:
      case PascalParser::INTEGER: {
        enterOuterAlt(_localctx, 1);
        setState(688);
        unsignedNumber();
        break;
      }

      case PascalParser::STRING_LITERAL: {
        enterOuterAlt(_localctx, 2);
        setState(689);
        string();
        break;
      }

      case PascalParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 3);
        setState(690);
        constantIdentifier();
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

PascalParser::FunctionIdentifierContext* PascalParser::FunctionDesignatorContext::functionIdentifier() {
  return getRuleContext<PascalParser::FunctionIdentifierContext>(0);
}

tree::TerminalNode* PascalParser::FunctionDesignatorContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

std::vector<PascalParser::ActualParameterContext *> PascalParser::FunctionDesignatorContext::actualParameter() {
  return getRuleContexts<PascalParser::ActualParameterContext>();
}

PascalParser::ActualParameterContext* PascalParser::FunctionDesignatorContext::actualParameter(size_t i) {
  return getRuleContext<PascalParser::ActualParameterContext>(i);
}

tree::TerminalNode* PascalParser::FunctionDesignatorContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

std::vector<tree::TerminalNode *> PascalParser::FunctionDesignatorContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::FunctionDesignatorContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 154, PascalParser::RuleFunctionDesignator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(706);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 49, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(693);
      functionIdentifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(694);
      functionIdentifier();
      setState(695);
      match(PascalParser::LPAREN);
      setState(696);
      actualParameter();
      setState(701);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PascalParser::COMMA) {
        setState(697);
        match(PascalParser::COMMA);
        setState(698);
        actualParameter();
        setState(703);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(704);
      match(PascalParser::RPAREN);
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

//----------------- FunctionIdentifierContext ------------------------------------------------------------------

PascalParser::FunctionIdentifierContext::FunctionIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::FunctionIdentifierContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::FunctionIdentifierContext::getRuleIndex() const {
  return PascalParser::RuleFunctionIdentifier;
}


antlrcpp::Any PascalParser::FunctionIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitFunctionIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::FunctionIdentifierContext* PascalParser::functionIdentifier() {
  FunctionIdentifierContext *_localctx = _tracker.createInstance<FunctionIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 156, PascalParser::RuleFunctionIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(708);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SetContext ------------------------------------------------------------------

PascalParser::SetContext::SetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::SetContext::LBRACKET() {
  return getToken(PascalParser::LBRACKET, 0);
}

PascalParser::ElementListContext* PascalParser::SetContext::elementList() {
  return getRuleContext<PascalParser::ElementListContext>(0);
}

tree::TerminalNode* PascalParser::SetContext::RBRACKET() {
  return getToken(PascalParser::RBRACKET, 0);
}


size_t PascalParser::SetContext::getRuleIndex() const {
  return PascalParser::RuleSet;
}


antlrcpp::Any PascalParser::SetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitSet(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::SetContext* PascalParser::set() {
  SetContext *_localctx = _tracker.createInstance<SetContext>(_ctx, getState());
  enterRule(_localctx, 158, PascalParser::RuleSet);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(710);
    match(PascalParser::LBRACKET);
    setState(711);
    elementList();
    setState(712);
    match(PascalParser::RBRACKET);
   
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

PascalParser::EmptyContext* PascalParser::ElementListContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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
  enterRule(_localctx, 160, PascalParser::RuleElementList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(723);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::NOT:
      case PascalParser::REAL:
      case PascalParser::INTEGER:
      case PascalParser::IDENTIFIER:
      case PascalParser::STRING_LITERAL:
      case PascalParser::PLUSOP:
      case PascalParser::MINUSOP:
      case PascalParser::LPAREN:
      case PascalParser::LBRACKET: {
        enterOuterAlt(_localctx, 1);
        setState(714);
        element();
        setState(719);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == PascalParser::COMMA) {
          setState(715);
          match(PascalParser::COMMA);
          setState(716);
          element();
          setState(721);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        break;
      }

      case PascalParser::RBRACKET: {
        enterOuterAlt(_localctx, 2);
        setState(722);
        empty();
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

tree::TerminalNode* PascalParser::ElementContext::DOT_DOT() {
  return getToken(PascalParser::DOT_DOT, 0);
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
  enterRule(_localctx, 162, PascalParser::RuleElement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(730);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 52, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(725);
      expression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(726);
      expression();
      setState(727);
      match(PascalParser::DOT_DOT);
      setState(728);
      expression();
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

//----------------- ProcedureStatementContext ------------------------------------------------------------------

PascalParser::ProcedureStatementContext::ProcedureStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::ProcedureIdentifierContext* PascalParser::ProcedureStatementContext::procedureIdentifier() {
  return getRuleContext<PascalParser::ProcedureIdentifierContext>(0);
}

tree::TerminalNode* PascalParser::ProcedureStatementContext::LPAREN() {
  return getToken(PascalParser::LPAREN, 0);
}

std::vector<PascalParser::ActualParameterContext *> PascalParser::ProcedureStatementContext::actualParameter() {
  return getRuleContexts<PascalParser::ActualParameterContext>();
}

PascalParser::ActualParameterContext* PascalParser::ProcedureStatementContext::actualParameter(size_t i) {
  return getRuleContext<PascalParser::ActualParameterContext>(i);
}

tree::TerminalNode* PascalParser::ProcedureStatementContext::RPAREN() {
  return getToken(PascalParser::RPAREN, 0);
}

std::vector<tree::TerminalNode *> PascalParser::ProcedureStatementContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::ProcedureStatementContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
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
  enterRule(_localctx, 164, PascalParser::RuleProcedureStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(745);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(732);
      procedureIdentifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(733);
      procedureIdentifier();
      setState(734);
      match(PascalParser::LPAREN);
      setState(735);
      actualParameter();
      setState(740);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PascalParser::COMMA) {
        setState(736);
        match(PascalParser::COMMA);
        setState(737);
        actualParameter();
        setState(742);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(743);
      match(PascalParser::RPAREN);
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

//----------------- ProcedureIdentifierContext ------------------------------------------------------------------

PascalParser::ProcedureIdentifierContext::ProcedureIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::ProcedureIdentifierContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::ProcedureIdentifierContext::getRuleIndex() const {
  return PascalParser::RuleProcedureIdentifier;
}


antlrcpp::Any PascalParser::ProcedureIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitProcedureIdentifier(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ProcedureIdentifierContext* PascalParser::procedureIdentifier() {
  ProcedureIdentifierContext *_localctx = _tracker.createInstance<ProcedureIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 166, PascalParser::RuleProcedureIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(747);
    identifier();
   
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

PascalParser::VariableContext* PascalParser::ActualParameterContext::variable() {
  return getRuleContext<PascalParser::VariableContext>(0);
}

PascalParser::ProcedureIdentifierContext* PascalParser::ActualParameterContext::procedureIdentifier() {
  return getRuleContext<PascalParser::ProcedureIdentifierContext>(0);
}

PascalParser::FunctionIdentifierContext* PascalParser::ActualParameterContext::functionIdentifier() {
  return getRuleContext<PascalParser::FunctionIdentifierContext>(0);
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
  enterRule(_localctx, 168, PascalParser::RuleActualParameter);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(753);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 55, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(749);
      expression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(750);
      variable();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(751);
      procedureIdentifier();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(752);
      functionIdentifier();
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

//----------------- GoToStatementContext ------------------------------------------------------------------

PascalParser::GoToStatementContext::GoToStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PascalParser::GoToStatementContext::GOTO() {
  return getToken(PascalParser::GOTO, 0);
}

PascalParser::LabelContext* PascalParser::GoToStatementContext::label() {
  return getRuleContext<PascalParser::LabelContext>(0);
}


size_t PascalParser::GoToStatementContext::getRuleIndex() const {
  return PascalParser::RuleGoToStatement;
}


antlrcpp::Any PascalParser::GoToStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitGoToStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::GoToStatementContext* PascalParser::goToStatement() {
  GoToStatementContext *_localctx = _tracker.createInstance<GoToStatementContext>(_ctx, getState());
  enterRule(_localctx, 170, PascalParser::RuleGoToStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(755);
    match(PascalParser::GOTO);
    setState(756);
    label();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EmptyStatementContext ------------------------------------------------------------------

PascalParser::EmptyStatementContext::EmptyStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::EmptyContext* PascalParser::EmptyStatementContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
}


size_t PascalParser::EmptyStatementContext::getRuleIndex() const {
  return PascalParser::RuleEmptyStatement;
}


antlrcpp::Any PascalParser::EmptyStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitEmptyStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::EmptyStatementContext* PascalParser::emptyStatement() {
  EmptyStatementContext *_localctx = _tracker.createInstance<EmptyStatementContext>(_ctx, getState());
  enterRule(_localctx, 172, PascalParser::RuleEmptyStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(758);
    empty();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EmptyContext ------------------------------------------------------------------

PascalParser::EmptyContext::EmptyContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t PascalParser::EmptyContext::getRuleIndex() const {
  return PascalParser::RuleEmpty;
}


antlrcpp::Any PascalParser::EmptyContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitEmpty(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::EmptyContext* PascalParser::empty() {
  EmptyContext *_localctx = _tracker.createInstance<EmptyContext>(_ctx, getState());
  enterRule(_localctx, 174, PascalParser::RuleEmpty);

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

PascalParser::RepetitiveStatementContext* PascalParser::StructuredStatementContext::repetitiveStatement() {
  return getRuleContext<PascalParser::RepetitiveStatementContext>(0);
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
  enterRule(_localctx, 176, PascalParser::RuleStructuredStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(766);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::BEGIN: {
        enterOuterAlt(_localctx, 1);
        setState(762);
        compoundStatement();
        break;
      }

      case PascalParser::CASE:
      case PascalParser::IF: {
        enterOuterAlt(_localctx, 2);
        setState(763);
        conditionalStatement();
        break;
      }

      case PascalParser::FOR:
      case PascalParser::REPEAT:
      case PascalParser::WHILE: {
        enterOuterAlt(_localctx, 3);
        setState(764);
        repetitiveStatement();
        break;
      }

      case PascalParser::WITH: {
        enterOuterAlt(_localctx, 4);
        setState(765);
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

std::vector<PascalParser::StatementContext *> PascalParser::CompoundStatementContext::statement() {
  return getRuleContexts<PascalParser::StatementContext>();
}

PascalParser::StatementContext* PascalParser::CompoundStatementContext::statement(size_t i) {
  return getRuleContext<PascalParser::StatementContext>(i);
}

tree::TerminalNode* PascalParser::CompoundStatementContext::END() {
  return getToken(PascalParser::END, 0);
}

std::vector<tree::TerminalNode *> PascalParser::CompoundStatementContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::CompoundStatementContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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
  enterRule(_localctx, 178, PascalParser::RuleCompoundStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(768);
    match(PascalParser::BEGIN);
    setState(769);
    statement();
    setState(774);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMICOLON) {
      setState(770);
      match(PascalParser::SEMICOLON);
      setState(771);
      statement();
      setState(776);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(777);
    match(PascalParser::END);
   
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
  enterRule(_localctx, 180, PascalParser::RuleConditionalStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(781);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::IF: {
        enterOuterAlt(_localctx, 1);
        setState(779);
        ifStatement();
        break;
      }

      case PascalParser::CASE: {
        enterOuterAlt(_localctx, 2);
        setState(780);
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
  enterRule(_localctx, 182, PascalParser::RuleIfStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(795);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 59, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(783);
      match(PascalParser::IF);
      setState(784);
      expression();
      setState(785);
      match(PascalParser::THEN);
      setState(786);
      statement();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(788);
      match(PascalParser::IF);
      setState(789);
      expression();
      setState(790);
      match(PascalParser::THEN);
      setState(791);
      statement();
      setState(792);
      match(PascalParser::ELSE);
      setState(793);
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

std::vector<tree::TerminalNode *> PascalParser::CaseStatementContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::CaseStatementContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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
  enterRule(_localctx, 184, PascalParser::RuleCaseStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(797);
    match(PascalParser::CASE);
    setState(798);
    expression();
    setState(799);
    match(PascalParser::OF);
    setState(800);
    caseListElement();
    setState(805);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMICOLON) {
      setState(801);
      match(PascalParser::SEMICOLON);
      setState(802);
      caseListElement();
      setState(807);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(808);
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

PascalParser::CaseLabelListContext* PascalParser::CaseListElementContext::caseLabelList() {
  return getRuleContext<PascalParser::CaseLabelListContext>(0);
}

tree::TerminalNode* PascalParser::CaseListElementContext::COLON() {
  return getToken(PascalParser::COLON, 0);
}

PascalParser::StatementContext* PascalParser::CaseListElementContext::statement() {
  return getRuleContext<PascalParser::StatementContext>(0);
}

PascalParser::EmptyContext* PascalParser::CaseListElementContext::empty() {
  return getRuleContext<PascalParser::EmptyContext>(0);
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
  enterRule(_localctx, 186, PascalParser::RuleCaseListElement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(815);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::REAL:
      case PascalParser::INTEGER:
      case PascalParser::IDENTIFIER:
      case PascalParser::CHARACTER:
      case PascalParser::STRING_LITERAL:
      case PascalParser::PLUSOP:
      case PascalParser::MINUSOP: {
        enterOuterAlt(_localctx, 1);
        setState(810);
        caseLabelList();
        setState(811);
        match(PascalParser::COLON);
        setState(812);
        statement();
        break;
      }

      case PascalParser::END:
      case PascalParser::SEMICOLON: {
        enterOuterAlt(_localctx, 2);
        setState(814);
        empty();
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

//----------------- CaseLabelListContext ------------------------------------------------------------------

PascalParser::CaseLabelListContext::CaseLabelListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PascalParser::CaseLabelContext *> PascalParser::CaseLabelListContext::caseLabel() {
  return getRuleContexts<PascalParser::CaseLabelContext>();
}

PascalParser::CaseLabelContext* PascalParser::CaseLabelListContext::caseLabel(size_t i) {
  return getRuleContext<PascalParser::CaseLabelContext>(i);
}

std::vector<tree::TerminalNode *> PascalParser::CaseLabelListContext::COMMA() {
  return getTokens(PascalParser::COMMA);
}

tree::TerminalNode* PascalParser::CaseLabelListContext::COMMA(size_t i) {
  return getToken(PascalParser::COMMA, i);
}


size_t PascalParser::CaseLabelListContext::getRuleIndex() const {
  return PascalParser::RuleCaseLabelList;
}


antlrcpp::Any PascalParser::CaseLabelListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitCaseLabelList(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::CaseLabelListContext* PascalParser::caseLabelList() {
  CaseLabelListContext *_localctx = _tracker.createInstance<CaseLabelListContext>(_ctx, getState());
  enterRule(_localctx, 188, PascalParser::RuleCaseLabelList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(817);
    caseLabel();
    setState(822);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(818);
      match(PascalParser::COMMA);
      setState(819);
      caseLabel();
      setState(824);
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

//----------------- RepetitiveStatementContext ------------------------------------------------------------------

PascalParser::RepetitiveStatementContext::RepetitiveStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::WhileStatementContext* PascalParser::RepetitiveStatementContext::whileStatement() {
  return getRuleContext<PascalParser::WhileStatementContext>(0);
}

PascalParser::RepeatStatementContext* PascalParser::RepetitiveStatementContext::repeatStatement() {
  return getRuleContext<PascalParser::RepeatStatementContext>(0);
}

PascalParser::ForStatementContext* PascalParser::RepetitiveStatementContext::forStatement() {
  return getRuleContext<PascalParser::ForStatementContext>(0);
}


size_t PascalParser::RepetitiveStatementContext::getRuleIndex() const {
  return PascalParser::RuleRepetitiveStatement;
}


antlrcpp::Any PascalParser::RepetitiveStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitRepetitiveStatement(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::RepetitiveStatementContext* PascalParser::repetitiveStatement() {
  RepetitiveStatementContext *_localctx = _tracker.createInstance<RepetitiveStatementContext>(_ctx, getState());
  enterRule(_localctx, 190, PascalParser::RuleRepetitiveStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(828);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PascalParser::WHILE: {
        enterOuterAlt(_localctx, 1);
        setState(825);
        whileStatement();
        break;
      }

      case PascalParser::REPEAT: {
        enterOuterAlt(_localctx, 2);
        setState(826);
        repeatStatement();
        break;
      }

      case PascalParser::FOR: {
        enterOuterAlt(_localctx, 3);
        setState(827);
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
  enterRule(_localctx, 192, PascalParser::RuleWhileStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(830);
    match(PascalParser::WHILE);
    setState(831);
    expression();
    setState(832);
    match(PascalParser::DO);
    setState(833);
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

std::vector<PascalParser::StatementContext *> PascalParser::RepeatStatementContext::statement() {
  return getRuleContexts<PascalParser::StatementContext>();
}

PascalParser::StatementContext* PascalParser::RepeatStatementContext::statement(size_t i) {
  return getRuleContext<PascalParser::StatementContext>(i);
}

tree::TerminalNode* PascalParser::RepeatStatementContext::UNTIL() {
  return getToken(PascalParser::UNTIL, 0);
}

PascalParser::ExpressionContext* PascalParser::RepeatStatementContext::expression() {
  return getRuleContext<PascalParser::ExpressionContext>(0);
}

std::vector<tree::TerminalNode *> PascalParser::RepeatStatementContext::SEMICOLON() {
  return getTokens(PascalParser::SEMICOLON);
}

tree::TerminalNode* PascalParser::RepeatStatementContext::SEMICOLON(size_t i) {
  return getToken(PascalParser::SEMICOLON, i);
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
  enterRule(_localctx, 194, PascalParser::RuleRepeatStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(835);
    match(PascalParser::REPEAT);
    setState(836);
    statement();
    setState(841);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::SEMICOLON) {
      setState(837);
      match(PascalParser::SEMICOLON);
      setState(838);
      statement();
      setState(843);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(844);
    match(PascalParser::UNTIL);
    setState(845);
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

PascalParser::ControlVariableContext* PascalParser::ForStatementContext::controlVariable() {
  return getRuleContext<PascalParser::ControlVariableContext>(0);
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
  enterRule(_localctx, 196, PascalParser::RuleForStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(847);
    match(PascalParser::FOR);
    setState(848);
    controlVariable();
    setState(849);
    match(PascalParser::ASSIGN);
    setState(850);
    forList();
    setState(851);
    match(PascalParser::DO);
    setState(852);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ControlVariableContext ------------------------------------------------------------------

PascalParser::ControlVariableContext::ControlVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PascalParser::IdentifierContext* PascalParser::ControlVariableContext::identifier() {
  return getRuleContext<PascalParser::IdentifierContext>(0);
}


size_t PascalParser::ControlVariableContext::getRuleIndex() const {
  return PascalParser::RuleControlVariable;
}


antlrcpp::Any PascalParser::ControlVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PascalVisitor*>(visitor))
    return parserVisitor->visitControlVariable(this);
  else
    return visitor->visitChildren(this);
}

PascalParser::ControlVariableContext* PascalParser::controlVariable() {
  ControlVariableContext *_localctx = _tracker.createInstance<ControlVariableContext>(_ctx, getState());
  enterRule(_localctx, 198, PascalParser::RuleControlVariable);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(854);
    identifier();
   
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

tree::TerminalNode* PascalParser::ForListContext::TO() {
  return getToken(PascalParser::TO, 0);
}

PascalParser::FinalValueContext* PascalParser::ForListContext::finalValue() {
  return getRuleContext<PascalParser::FinalValueContext>(0);
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
  enterRule(_localctx, 200, PascalParser::RuleForList);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(864);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 65, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(856);
      initialValue();
      setState(857);
      match(PascalParser::TO);
      setState(858);
      finalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(860);
      initialValue();
      setState(861);
      match(PascalParser::DOWNTO);
      setState(862);
      finalValue();
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
  enterRule(_localctx, 202, PascalParser::RuleInitialValue);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(866);
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
  enterRule(_localctx, 204, PascalParser::RuleFinalValue);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(868);
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
  enterRule(_localctx, 206, PascalParser::RuleWithStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(870);
    match(PascalParser::WITH);
    setState(871);
    recordVariableList();
    setState(872);
    match(PascalParser::DO);
    setState(873);
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

std::vector<PascalParser::RecordVariableContext *> PascalParser::RecordVariableListContext::recordVariable() {
  return getRuleContexts<PascalParser::RecordVariableContext>();
}

PascalParser::RecordVariableContext* PascalParser::RecordVariableListContext::recordVariable(size_t i) {
  return getRuleContext<PascalParser::RecordVariableContext>(i);
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
  enterRule(_localctx, 208, PascalParser::RuleRecordVariableList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(875);
    recordVariable();
    setState(880);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PascalParser::COMMA) {
      setState(876);
      match(PascalParser::COMMA);
      setState(877);
      recordVariable();
      setState(882);
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

bool PascalParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 71: return simpleExpressionSempred(dynamic_cast<SimpleExpressionContext *>(context), predicateIndex);
    case 73: return termSempred(dynamic_cast<TermContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool PascalParser::simpleExpressionSempred(SimpleExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

bool PascalParser::termSempred(TermContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> PascalParser::_decisionToDFA;
atn::PredictionContextCache PascalParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN PascalParser::_atn;
std::vector<uint16_t> PascalParser::_serializedATN;

std::vector<std::string> PascalParser::_ruleNames = {
  "program", "programHeading", "identifierList", "identifier", "block", 
  "labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
  "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", "scaleFactor", 
  "sign", "constantIdentifier", "string", "typeDefinitionPart", "typeDefinition", 
  "type", "simpleType", "scalarType", "subrangeType", "typeIdentifier", 
  "structuredType", "arrayType", "indexType", "componentType", "recordType", 
  "fieldList", "fixedPart", "recordSection", "variantType", "tagField", 
  "variant", "caseLabel", "setType", "baseType", "fileType", "pointerType", 
  "variableDeclarationPart", "variableDeclaration", "procedureAndFunctionDeclarationPart", 
  "procedureOrFunctionDeclaration", "procedureDeclaration", "procedureHeading", 
  "formalParameterSection", "parameterGroup", "functionDeclaration", "functionHeading", 
  "resultType", "statementPart", "statement", "unlabelledStatement", "simpleStatement", 
  "assignmentStatement", "variable", "entireVariable", "variableIdentifier", 
  "componentVariable", "indexedVariable", "arrayVariable", "fieldDesignator", 
  "recordVariable", "fieldIdentifier", "fileBuffer", "fileVariable", "referencedVariable", 
  "pointerVariable", "expression", "relationalOperator", "simpleExpression", 
  "addingOperator", "term", "multiplyingOperator", "factor", "unsignedConstant", 
  "functionDesignator", "functionIdentifier", "set", "elementList", "element", 
  "procedureStatement", "procedureIdentifier", "actualParameter", "goToStatement", 
  "emptyStatement", "empty", "structuredStatement", "compoundStatement", 
  "conditionalStatement", "ifStatement", "caseStatement", "caseListElement", 
  "caseLabelList", "repetitiveStatement", "whileStatement", "repeatStatement", 
  "forStatement", "controlVariable", "forList", "initialValue", "finalValue", 
  "withStatement", "recordVariableList"
};

std::vector<std::string> PascalParser::_literalNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "'+'", "'-'", "'*'", "'/'", "':='", "'='", "'<>'", 
  "'<='", "'>='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'^'", "';'", 
  "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'(*'", "'*)'", "'..'", 
  "'.'", "':'"
};

std::vector<std::string> PascalParser::_symbolicNames = {
  "", "AND", "ARRAY", "ASM", "BEGIN", "BREAK", "CASE", "CONST", "CONSTRUCTOR", 
  "CONTINUE", "DESTRUCTOR", "DIV", "DO", "DOWNTO", "ELSE", "END", "FALSE", 
  "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IMPLEMENTATION", "IN", "INLINE", 
  "INTERFACE", "LABEL", "MOD", "NIL", "NOT", "OBJECT", "OF", "ON", "OPERATOR", 
  "OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", "REPEAT", "SET", "SHL", 
  "SHR", "STRING", "THEN", "TO", "TRUE", "TYPE", "UNIT", "UNTIL", "USES", 
  "VAR", "WHILE", "WITH", "XOR", "REAL", "INTEGER", "IDENTIFIER", "CHARACTER", 
  "STRING_LITERAL", "PLUSOP", "MINUSOP", "MULTOP", "DIVOP", "ASSIGN", "EQUAL", 
  "NE", "LTEQ", "GTEQ", "LT", "GT", "PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", 
  "DIVEQUAL", "CARAT", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "LBRACKET", 
  "RBRACKET", "LBRACE", "RBRACE", "LCOMMENT", "RCOMMENT", "DOT_DOT", "PERIOD", 
  "COLON", "WS"
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
    0x3, 0x5b, 0x376, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
    0x9, 0x63, 0x4, 0x64, 0x9, 0x64, 0x4, 0x65, 0x9, 0x65, 0x4, 0x66, 0x9, 
    0x66, 0x4, 0x67, 0x9, 0x67, 0x4, 0x68, 0x9, 0x68, 0x4, 0x69, 0x9, 0x69, 
    0x4, 0x6a, 0x9, 0x6a, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x5, 0x2, 0xd8, 
    0xa, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x7, 0x4, 0xe5, 0xa, 
    0x4, 0xc, 0x4, 0xe, 0x4, 0xe8, 0xb, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 
    0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 
    0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x7, 0x7, 0xf8, 0xa, 0x7, 0xc, 
    0x7, 0xe, 0x7, 0xfb, 0xb, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0xff, 0xa, 
    0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x7, 0x9, 0x108, 0xa, 0x9, 0xc, 0x9, 0xe, 0x9, 0x10b, 0xb, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x10f, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
    0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x11f, 0xa, 0xb, 
    0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x123, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xe, 0x3, 0xe, 0x3, 0xf, 0x5, 0xf, 0x12a, 0xa, 0xf, 0x3, 0xf, 0x3, 0xf, 
    0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 
    0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x7, 0x13, 0x139, 
    0xa, 0x13, 0xc, 0x13, 0xe, 0x13, 0x13c, 0xb, 0x13, 0x3, 0x13, 0x3, 0x13, 
    0x5, 0x13, 0x140, 0xa, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
    0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0x149, 0xa, 0x15, 0x3, 0x16, 
    0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0x14e, 0xa, 0x16, 0x3, 0x17, 0x3, 0x17, 
    0x3, 0x17, 0x3, 0x17, 0x7, 0x17, 0x154, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 
    0x157, 0xb, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 
    0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
    0x1a, 0x5, 0x1a, 0x165, 0xa, 0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
    0x3, 0x1b, 0x3, 0x1b, 0x7, 0x1b, 0x16c, 0xa, 0x1b, 0xc, 0x1b, 0xe, 0x1b, 
    0x16f, 0xb, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 
    0x3, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 
    0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
    0x5, 0x1f, 0x183, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x7, 0x20, 
    0x188, 0xa, 0x20, 0xc, 0x20, 0xe, 0x20, 0x18b, 0xb, 0x20, 0x3, 0x21, 
    0x3, 0x21, 0x3, 0x21, 0x7, 0x21, 0x190, 0xa, 0x21, 0xc, 0x21, 0xe, 0x21, 
    0x193, 0xb, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x5, 0x21, 
    0x199, 0xa, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 
    0x3, 0x22, 0x3, 0x22, 0x7, 0x22, 0x1a2, 0xa, 0x22, 0xc, 0x22, 0xe, 0x22, 
    0x1a5, 0xb, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 
    0x1ab, 0xa, 0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 
    0x5, 0x24, 0x1b2, 0xa, 0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x26, 0x3, 0x26, 
    0x3, 0x26, 0x3, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x28, 0x3, 0x28, 0x3, 
    0x28, 0x3, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 
    0x3, 0x2a, 0x3, 0x2a, 0x7, 0x2a, 0x1c7, 0xa, 0x2a, 0xc, 0x2a, 0xe, 0x2a, 
    0x1ca, 0xb, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1ce, 0xa, 0x2a, 
    0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x7, 0x2b, 0x1d3, 0xa, 0x2b, 0xc, 0x2b, 
    0xe, 0x2b, 0x1d6, 0xb, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2c, 
    0x3, 0x2c, 0x3, 0x2c, 0x7, 0x2c, 0x1de, 0xa, 0x2c, 0xc, 0x2c, 0xe, 0x2c, 
    0x1e1, 0xb, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x5, 0x2d, 0x1e5, 0xa, 0x2d, 
    0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
    0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 
    0x7, 0x2f, 0x1f4, 0xa, 0x2f, 0xc, 0x2f, 0xe, 0x2f, 0x1f7, 0xb, 0x2f, 
    0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x5, 0x2f, 0x1fc, 0xa, 0x2f, 0x3, 0x30, 
    0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 
    0x30, 0x3, 0x30, 0x7, 0x30, 0x207, 0xa, 0x30, 0xc, 0x30, 0xe, 0x30, 
    0x20a, 0xb, 0x30, 0x5, 0x30, 0x20c, 0xa, 0x30, 0x3, 0x31, 0x3, 0x31, 
    0x3, 0x31, 0x7, 0x31, 0x211, 0xa, 0x31, 0xc, 0x31, 0xe, 0x31, 0x214, 
    0xb, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 
    0x32, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 
    0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x7, 
    0x33, 0x228, 0xa, 0x33, 0xc, 0x33, 0xe, 0x33, 0x22b, 0xb, 0x33, 0x3, 
    0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x231, 0xa, 0x33, 
    0x3, 0x34, 0x3, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 
    0x36, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 0x23c, 0xa, 0x36, 0x3, 0x37, 
    0x3, 0x37, 0x5, 0x37, 0x240, 0xa, 0x37, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 
    0x3, 0x38, 0x5, 0x38, 0x246, 0xa, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 
    0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x5, 0x39, 0x250, 
    0xa, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x5, 0x3a, 0x255, 0xa, 0x3a, 
    0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3d, 0x3, 0x3d, 0x3, 
    0x3d, 0x5, 0x3d, 0x25e, 0xa, 0x3d, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 
    0x3, 0x3e, 0x3, 0x3e, 0x7, 0x3e, 0x265, 0xa, 0x3e, 0xc, 0x3e, 0xe, 0x3e, 
    0x268, 0xb, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 0x3, 0x40, 
    0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x41, 0x3, 0x41, 0x3, 0x42, 0x3, 
    0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x44, 0x3, 0x44, 0x3, 0x45, 0x3, 0x45, 
    0x3, 0x46, 0x3, 0x46, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 0x47, 0x3, 
    0x47, 0x5, 0x47, 0x283, 0xa, 0x47, 0x3, 0x48, 0x3, 0x48, 0x3, 0x49, 
    0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x5, 0x49, 0x28c, 0xa, 0x49, 
    0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x3, 0x49, 0x7, 0x49, 0x292, 0xa, 0x49, 
    0xc, 0x49, 0xe, 0x49, 0x295, 0xb, 0x49, 0x3, 0x4a, 0x3, 0x4a, 0x3, 0x4b, 
    0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x7, 
    0x4b, 0x2a0, 0xa, 0x4b, 0xc, 0x4b, 0xe, 0x4b, 0x2a3, 0xb, 0x4b, 0x3, 
    0x4c, 0x3, 0x4c, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 
    0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x5, 0x4d, 0x2b1, 
    0xa, 0x4d, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4e, 0x5, 0x4e, 0x2b6, 0xa, 0x4e, 
    0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x7, 
    0x4f, 0x2be, 0xa, 0x4f, 0xc, 0x4f, 0xe, 0x4f, 0x2c1, 0xb, 0x4f, 0x3, 
    0x4f, 0x3, 0x4f, 0x5, 0x4f, 0x2c5, 0xa, 0x4f, 0x3, 0x50, 0x3, 0x50, 
    0x3, 0x51, 0x3, 0x51, 0x3, 0x51, 0x3, 0x51, 0x3, 0x52, 0x3, 0x52, 0x3, 
    0x52, 0x7, 0x52, 0x2d0, 0xa, 0x52, 0xc, 0x52, 0xe, 0x52, 0x2d3, 0xb, 
    0x52, 0x3, 0x52, 0x5, 0x52, 0x2d6, 0xa, 0x52, 0x3, 0x53, 0x3, 0x53, 
    0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x5, 0x53, 0x2dd, 0xa, 0x53, 0x3, 0x54, 
    0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 0x3, 0x54, 0x7, 0x54, 0x2e5, 
    0xa, 0x54, 0xc, 0x54, 0xe, 0x54, 0x2e8, 0xb, 0x54, 0x3, 0x54, 0x3, 0x54, 
    0x5, 0x54, 0x2ec, 0xa, 0x54, 0x3, 0x55, 0x3, 0x55, 0x3, 0x56, 0x3, 0x56, 
    0x3, 0x56, 0x3, 0x56, 0x5, 0x56, 0x2f4, 0xa, 0x56, 0x3, 0x57, 0x3, 0x57, 
    0x3, 0x57, 0x3, 0x58, 0x3, 0x58, 0x3, 0x59, 0x3, 0x59, 0x3, 0x5a, 0x3, 
    0x5a, 0x3, 0x5a, 0x3, 0x5a, 0x5, 0x5a, 0x301, 0xa, 0x5a, 0x3, 0x5b, 
    0x3, 0x5b, 0x3, 0x5b, 0x3, 0x5b, 0x7, 0x5b, 0x307, 0xa, 0x5b, 0xc, 0x5b, 
    0xe, 0x5b, 0x30a, 0xb, 0x5b, 0x3, 0x5b, 0x3, 0x5b, 0x3, 0x5c, 0x3, 0x5c, 
    0x5, 0x5c, 0x310, 0xa, 0x5c, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 
    0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 0x5d, 0x3, 
    0x5d, 0x3, 0x5d, 0x5, 0x5d, 0x31e, 0xa, 0x5d, 0x3, 0x5e, 0x3, 0x5e, 
    0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x7, 0x5e, 0x326, 0xa, 0x5e, 
    0xc, 0x5e, 0xe, 0x5e, 0x329, 0xb, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5f, 
    0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x5, 0x5f, 0x332, 0xa, 0x5f, 
    0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x7, 0x60, 0x337, 0xa, 0x60, 0xc, 0x60, 
    0xe, 0x60, 0x33a, 0xb, 0x60, 0x3, 0x61, 0x3, 0x61, 0x3, 0x61, 0x5, 0x61, 
    0x33f, 0xa, 0x61, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 
    0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 0x7, 0x63, 0x34a, 0xa, 0x63, 
    0xc, 0x63, 0xe, 0x63, 0x34d, 0xb, 0x63, 0x3, 0x63, 0x3, 0x63, 0x3, 0x63, 
    0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x3, 
    0x64, 0x3, 0x65, 0x3, 0x65, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 
    0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x3, 0x66, 0x5, 0x66, 0x363, 0xa, 0x66, 
    0x3, 0x67, 0x3, 0x67, 0x3, 0x68, 0x3, 0x68, 0x3, 0x69, 0x3, 0x69, 0x3, 
    0x69, 0x3, 0x69, 0x3, 0x69, 0x3, 0x6a, 0x3, 0x6a, 0x3, 0x6a, 0x7, 0x6a, 
    0x371, 0xa, 0x6a, 0xc, 0x6a, 0xe, 0x6a, 0x374, 0xb, 0x6a, 0x3, 0x6a, 
    0x2, 0x4, 0x90, 0x94, 0x6b, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 
    0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 
    0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 
    0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 0x58, 
    0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 0x6e, 0x70, 
    0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 0x84, 0x86, 0x88, 
    0x8a, 0x8c, 0x8e, 0x90, 0x92, 0x94, 0x96, 0x98, 0x9a, 0x9c, 0x9e, 0xa0, 
    0xa2, 0xa4, 0xa6, 0xa8, 0xaa, 0xac, 0xae, 0xb0, 0xb2, 0xb4, 0xb6, 0xb8, 
    0xba, 0xbc, 0xbe, 0xc0, 0xc2, 0xc4, 0xc6, 0xc8, 0xca, 0xcc, 0xce, 0xd0, 
    0xd2, 0x2, 0x6, 0x3, 0x2, 0x3e, 0x3f, 0x4, 0x2, 0x19, 0x19, 0x43, 0x48, 
    0x4, 0x2, 0x24, 0x24, 0x3e, 0x3f, 0x6, 0x2, 0x3, 0x3, 0xd, 0xd, 0x1d, 
    0x1d, 0x40, 0x41, 0x2, 0x368, 0x2, 0xd4, 0x3, 0x2, 0x2, 0x2, 0x4, 0xdd, 
    0x3, 0x2, 0x2, 0x2, 0x6, 0xe1, 0x3, 0x2, 0x2, 0x2, 0x8, 0xe9, 0x3, 0x2, 
    0x2, 0x2, 0xa, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xc, 0xfe, 0x3, 0x2, 0x2, 0x2, 
    0xe, 0x100, 0x3, 0x2, 0x2, 0x2, 0x10, 0x10e, 0x3, 0x2, 0x2, 0x2, 0x12, 
    0x110, 0x3, 0x2, 0x2, 0x2, 0x14, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x16, 0x122, 
    0x3, 0x2, 0x2, 0x2, 0x18, 0x124, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x126, 0x3, 
    0x2, 0x2, 0x2, 0x1c, 0x129, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x12d, 0x3, 0x2, 
    0x2, 0x2, 0x20, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x22, 0x131, 0x3, 0x2, 0x2, 
    0x2, 0x24, 0x13f, 0x3, 0x2, 0x2, 0x2, 0x26, 0x141, 0x3, 0x2, 0x2, 0x2, 
    0x28, 0x148, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x14d, 0x3, 0x2, 0x2, 0x2, 0x2c, 
    0x14f, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x30, 0x15e, 
    0x3, 0x2, 0x2, 0x2, 0x32, 0x164, 0x3, 0x2, 0x2, 0x2, 0x34, 0x166, 0x3, 
    0x2, 0x2, 0x2, 0x36, 0x174, 0x3, 0x2, 0x2, 0x2, 0x38, 0x176, 0x3, 0x2, 
    0x2, 0x2, 0x3a, 0x178, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x182, 0x3, 0x2, 0x2, 
    0x2, 0x3e, 0x184, 0x3, 0x2, 0x2, 0x2, 0x40, 0x198, 0x3, 0x2, 0x2, 0x2, 
    0x42, 0x19a, 0x3, 0x2, 0x2, 0x2, 0x44, 0x1aa, 0x3, 0x2, 0x2, 0x2, 0x46, 
    0x1b1, 0x3, 0x2, 0x2, 0x2, 0x48, 0x1b3, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x1b5, 
    0x3, 0x2, 0x2, 0x2, 0x4c, 0x1b9, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x1bb, 0x3, 
    0x2, 0x2, 0x2, 0x50, 0x1bf, 0x3, 0x2, 0x2, 0x2, 0x52, 0x1cd, 0x3, 0x2, 
    0x2, 0x2, 0x54, 0x1cf, 0x3, 0x2, 0x2, 0x2, 0x56, 0x1df, 0x3, 0x2, 0x2, 
    0x2, 0x58, 0x1e4, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x1e6, 0x3, 0x2, 0x2, 0x2, 
    0x5c, 0x1fb, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x20b, 0x3, 0x2, 0x2, 0x2, 0x60, 
    0x20d, 0x3, 0x2, 0x2, 0x2, 0x62, 0x218, 0x3, 0x2, 0x2, 0x2, 0x64, 0x230, 
    0x3, 0x2, 0x2, 0x2, 0x66, 0x232, 0x3, 0x2, 0x2, 0x2, 0x68, 0x234, 0x3, 
    0x2, 0x2, 0x2, 0x6a, 0x23b, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x23f, 0x3, 0x2, 
    0x2, 0x2, 0x6e, 0x245, 0x3, 0x2, 0x2, 0x2, 0x70, 0x24f, 0x3, 0x2, 0x2, 
    0x2, 0x72, 0x254, 0x3, 0x2, 0x2, 0x2, 0x74, 0x256, 0x3, 0x2, 0x2, 0x2, 
    0x76, 0x258, 0x3, 0x2, 0x2, 0x2, 0x78, 0x25d, 0x3, 0x2, 0x2, 0x2, 0x7a, 
    0x25f, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x7e, 0x26d, 
    0x3, 0x2, 0x2, 0x2, 0x80, 0x271, 0x3, 0x2, 0x2, 0x2, 0x82, 0x273, 0x3, 
    0x2, 0x2, 0x2, 0x84, 0x275, 0x3, 0x2, 0x2, 0x2, 0x86, 0x277, 0x3, 0x2, 
    0x2, 0x2, 0x88, 0x279, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x27b, 0x3, 0x2, 0x2, 
    0x2, 0x8c, 0x282, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x284, 0x3, 0x2, 0x2, 0x2, 
    0x90, 0x28b, 0x3, 0x2, 0x2, 0x2, 0x92, 0x296, 0x3, 0x2, 0x2, 0x2, 0x94, 
    0x298, 0x3, 0x2, 0x2, 0x2, 0x96, 0x2a4, 0x3, 0x2, 0x2, 0x2, 0x98, 0x2b0, 
    0x3, 0x2, 0x2, 0x2, 0x9a, 0x2b5, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x2c4, 0x3, 
    0x2, 0x2, 0x2, 0x9e, 0x2c6, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x2c8, 0x3, 0x2, 
    0x2, 0x2, 0xa2, 0x2d5, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x2dc, 0x3, 0x2, 0x2, 
    0x2, 0xa6, 0x2eb, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x2ed, 0x3, 0x2, 0x2, 0x2, 
    0xaa, 0x2f3, 0x3, 0x2, 0x2, 0x2, 0xac, 0x2f5, 0x3, 0x2, 0x2, 0x2, 0xae, 
    0x2f8, 0x3, 0x2, 0x2, 0x2, 0xb0, 0x2fa, 0x3, 0x2, 0x2, 0x2, 0xb2, 0x300, 
    0x3, 0x2, 0x2, 0x2, 0xb4, 0x302, 0x3, 0x2, 0x2, 0x2, 0xb6, 0x30f, 0x3, 
    0x2, 0x2, 0x2, 0xb8, 0x31d, 0x3, 0x2, 0x2, 0x2, 0xba, 0x31f, 0x3, 0x2, 
    0x2, 0x2, 0xbc, 0x331, 0x3, 0x2, 0x2, 0x2, 0xbe, 0x333, 0x3, 0x2, 0x2, 
    0x2, 0xc0, 0x33e, 0x3, 0x2, 0x2, 0x2, 0xc2, 0x340, 0x3, 0x2, 0x2, 0x2, 
    0xc4, 0x345, 0x3, 0x2, 0x2, 0x2, 0xc6, 0x351, 0x3, 0x2, 0x2, 0x2, 0xc8, 
    0x358, 0x3, 0x2, 0x2, 0x2, 0xca, 0x362, 0x3, 0x2, 0x2, 0x2, 0xcc, 0x364, 
    0x3, 0x2, 0x2, 0x2, 0xce, 0x366, 0x3, 0x2, 0x2, 0x2, 0xd0, 0x368, 0x3, 
    0x2, 0x2, 0x2, 0xd2, 0x36d, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd5, 0x7, 0x27, 
    0x2, 0x2, 0xd5, 0xd7, 0x5, 0x8, 0x5, 0x2, 0xd6, 0xd8, 0x5, 0x4, 0x3, 
    0x2, 0xd7, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xd7, 0xd8, 0x3, 0x2, 0x2, 0x2, 
    0xd8, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xda, 0x7, 0x4e, 0x2, 0x2, 0xda, 
    0xdb, 0x5, 0xa, 0x6, 0x2, 0xdb, 0xdc, 0x7, 0x59, 0x2, 0x2, 0xdc, 0x3, 
    0x3, 0x2, 0x2, 0x2, 0xdd, 0xde, 0x7, 0x50, 0x2, 0x2, 0xde, 0xdf, 0x5, 
    0x6, 0x4, 0x2, 0xdf, 0xe0, 0x7, 0x51, 0x2, 0x2, 0xe0, 0x5, 0x3, 0x2, 
    0x2, 0x2, 0xe1, 0xe6, 0x5, 0x8, 0x5, 0x2, 0xe2, 0xe3, 0x7, 0x4f, 0x2, 
    0x2, 0xe3, 0xe5, 0x5, 0x8, 0x5, 0x2, 0xe4, 0xe2, 0x3, 0x2, 0x2, 0x2, 
    0xe5, 0xe8, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe4, 0x3, 0x2, 0x2, 0x2, 0xe6, 
    0xe7, 0x3, 0x2, 0x2, 0x2, 0xe7, 0x7, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xe6, 
    0x3, 0x2, 0x2, 0x2, 0xe9, 0xea, 0x7, 0x3b, 0x2, 0x2, 0xea, 0x9, 0x3, 
    0x2, 0x2, 0x2, 0xeb, 0xec, 0x5, 0xc, 0x7, 0x2, 0xec, 0xed, 0x5, 0x10, 
    0x9, 0x2, 0xed, 0xee, 0x5, 0x24, 0x13, 0x2, 0xee, 0xef, 0x5, 0x52, 0x2a, 
    0x2, 0xef, 0xf0, 0x5, 0x56, 0x2c, 0x2, 0xf0, 0xf1, 0x5, 0x68, 0x35, 
    0x2, 0xf1, 0xb, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xff, 0x5, 0xb0, 0x59, 0x2, 
    0xf3, 0xf4, 0x7, 0x1c, 0x2, 0x2, 0xf4, 0xf9, 0x5, 0xe, 0x8, 0x2, 0xf5, 
    0xf6, 0x7, 0x4f, 0x2, 0x2, 0xf6, 0xf8, 0x5, 0xe, 0x8, 0x2, 0xf7, 0xf5, 
    0x3, 0x2, 0x2, 0x2, 0xf8, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xf7, 0x3, 
    0x2, 0x2, 0x2, 0xf9, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xfc, 0x3, 0x2, 
    0x2, 0x2, 0xfb, 0xf9, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfd, 0x7, 0x4e, 0x2, 
    0x2, 0xfd, 0xff, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xf2, 0x3, 0x2, 0x2, 0x2, 
    0xfe, 0xf3, 0x3, 0x2, 0x2, 0x2, 0xff, 0xd, 0x3, 0x2, 0x2, 0x2, 0x100, 
    0x101, 0x5, 0x18, 0xd, 0x2, 0x101, 0xf, 0x3, 0x2, 0x2, 0x2, 0x102, 0x10f, 
    0x5, 0xb0, 0x59, 0x2, 0x103, 0x104, 0x7, 0x9, 0x2, 0x2, 0x104, 0x109, 
    0x5, 0x12, 0xa, 0x2, 0x105, 0x106, 0x7, 0x4e, 0x2, 0x2, 0x106, 0x108, 
    0x5, 0x12, 0xa, 0x2, 0x107, 0x105, 0x3, 0x2, 0x2, 0x2, 0x108, 0x10b, 
    0x3, 0x2, 0x2, 0x2, 0x109, 0x107, 0x3, 0x2, 0x2, 0x2, 0x109, 0x10a, 
    0x3, 0x2, 0x2, 0x2, 0x10a, 0x10c, 0x3, 0x2, 0x2, 0x2, 0x10b, 0x109, 
    0x3, 0x2, 0x2, 0x2, 0x10c, 0x10d, 0x7, 0x4e, 0x2, 0x2, 0x10d, 0x10f, 
    0x3, 0x2, 0x2, 0x2, 0x10e, 0x102, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x103, 
    0x3, 0x2, 0x2, 0x2, 0x10f, 0x11, 0x3, 0x2, 0x2, 0x2, 0x110, 0x111, 0x5, 
    0x8, 0x5, 0x2, 0x111, 0x112, 0x7, 0x43, 0x2, 0x2, 0x112, 0x113, 0x5, 
    0x14, 0xb, 0x2, 0x113, 0x13, 0x3, 0x2, 0x2, 0x2, 0x114, 0x11f, 0x5, 
    0x16, 0xc, 0x2, 0x115, 0x116, 0x5, 0x1e, 0x10, 0x2, 0x116, 0x117, 0x5, 
    0x16, 0xc, 0x2, 0x117, 0x11f, 0x3, 0x2, 0x2, 0x2, 0x118, 0x11f, 0x5, 
    0x20, 0x11, 0x2, 0x119, 0x11a, 0x5, 0x1e, 0x10, 0x2, 0x11a, 0x11b, 0x5, 
    0x20, 0x11, 0x2, 0x11b, 0x11f, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x11f, 0x5, 
    0x22, 0x12, 0x2, 0x11d, 0x11f, 0x7, 0x3c, 0x2, 0x2, 0x11e, 0x114, 0x3, 
    0x2, 0x2, 0x2, 0x11e, 0x115, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x118, 0x3, 
    0x2, 0x2, 0x2, 0x11e, 0x119, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11c, 0x3, 
    0x2, 0x2, 0x2, 0x11e, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x11f, 0x15, 0x3, 0x2, 
    0x2, 0x2, 0x120, 0x123, 0x5, 0x18, 0xd, 0x2, 0x121, 0x123, 0x5, 0x1a, 
    0xe, 0x2, 0x122, 0x120, 0x3, 0x2, 0x2, 0x2, 0x122, 0x121, 0x3, 0x2, 
    0x2, 0x2, 0x123, 0x17, 0x3, 0x2, 0x2, 0x2, 0x124, 0x125, 0x7, 0x3a, 
    0x2, 0x2, 0x125, 0x19, 0x3, 0x2, 0x2, 0x2, 0x126, 0x127, 0x7, 0x39, 
    0x2, 0x2, 0x127, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x128, 0x12a, 0x5, 0x1e, 
    0x10, 0x2, 0x129, 0x128, 0x3, 0x2, 0x2, 0x2, 0x129, 0x12a, 0x3, 0x2, 
    0x2, 0x2, 0x12a, 0x12b, 0x3, 0x2, 0x2, 0x2, 0x12b, 0x12c, 0x5, 0x18, 
    0xd, 0x2, 0x12c, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x12e, 0x9, 0x2, 0x2, 
    0x2, 0x12e, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x130, 0x5, 0x8, 0x5, 0x2, 
    0x130, 0x21, 0x3, 0x2, 0x2, 0x2, 0x131, 0x132, 0x7, 0x3d, 0x2, 0x2, 
    0x132, 0x23, 0x3, 0x2, 0x2, 0x2, 0x133, 0x140, 0x5, 0xb0, 0x59, 0x2, 
    0x134, 0x135, 0x7, 0x31, 0x2, 0x2, 0x135, 0x13a, 0x5, 0x26, 0x14, 0x2, 
    0x136, 0x137, 0x7, 0x4e, 0x2, 0x2, 0x137, 0x139, 0x5, 0x26, 0x14, 0x2, 
    0x138, 0x136, 0x3, 0x2, 0x2, 0x2, 0x139, 0x13c, 0x3, 0x2, 0x2, 0x2, 
    0x13a, 0x138, 0x3, 0x2, 0x2, 0x2, 0x13a, 0x13b, 0x3, 0x2, 0x2, 0x2, 
    0x13b, 0x13d, 0x3, 0x2, 0x2, 0x2, 0x13c, 0x13a, 0x3, 0x2, 0x2, 0x2, 
    0x13d, 0x13e, 0x7, 0x4e, 0x2, 0x2, 0x13e, 0x140, 0x3, 0x2, 0x2, 0x2, 
    0x13f, 0x133, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x134, 0x3, 0x2, 0x2, 0x2, 
    0x140, 0x25, 0x3, 0x2, 0x2, 0x2, 0x141, 0x142, 0x5, 0x8, 0x5, 0x2, 0x142, 
    0x143, 0x7, 0x43, 0x2, 0x2, 0x143, 0x144, 0x5, 0x28, 0x15, 0x2, 0x144, 
    0x27, 0x3, 0x2, 0x2, 0x2, 0x145, 0x149, 0x5, 0x2a, 0x16, 0x2, 0x146, 
    0x149, 0x5, 0x32, 0x1a, 0x2, 0x147, 0x149, 0x5, 0x50, 0x29, 0x2, 0x148, 
    0x145, 0x3, 0x2, 0x2, 0x2, 0x148, 0x146, 0x3, 0x2, 0x2, 0x2, 0x148, 
    0x147, 0x3, 0x2, 0x2, 0x2, 0x149, 0x29, 0x3, 0x2, 0x2, 0x2, 0x14a, 0x14e, 
    0x5, 0x2c, 0x17, 0x2, 0x14b, 0x14e, 0x5, 0x2e, 0x18, 0x2, 0x14c, 0x14e, 
    0x5, 0x30, 0x19, 0x2, 0x14d, 0x14a, 0x3, 0x2, 0x2, 0x2, 0x14d, 0x14b, 
    0x3, 0x2, 0x2, 0x2, 0x14d, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x14e, 0x2b, 0x3, 
    0x2, 0x2, 0x2, 0x14f, 0x150, 0x7, 0x50, 0x2, 0x2, 0x150, 0x155, 0x5, 
    0x8, 0x5, 0x2, 0x151, 0x152, 0x7, 0x4f, 0x2, 0x2, 0x152, 0x154, 0x5, 
    0x8, 0x5, 0x2, 0x153, 0x151, 0x3, 0x2, 0x2, 0x2, 0x154, 0x157, 0x3, 
    0x2, 0x2, 0x2, 0x155, 0x153, 0x3, 0x2, 0x2, 0x2, 0x155, 0x156, 0x3, 
    0x2, 0x2, 0x2, 0x156, 0x158, 0x3, 0x2, 0x2, 0x2, 0x157, 0x155, 0x3, 
    0x2, 0x2, 0x2, 0x158, 0x159, 0x7, 0x51, 0x2, 0x2, 0x159, 0x2d, 0x3, 
    0x2, 0x2, 0x2, 0x15a, 0x15b, 0x5, 0x14, 0xb, 0x2, 0x15b, 0x15c, 0x7, 
    0x58, 0x2, 0x2, 0x15c, 0x15d, 0x5, 0x14, 0xb, 0x2, 0x15d, 0x2f, 0x3, 
    0x2, 0x2, 0x2, 0x15e, 0x15f, 0x5, 0x8, 0x5, 0x2, 0x15f, 0x31, 0x3, 0x2, 
    0x2, 0x2, 0x160, 0x165, 0x5, 0x34, 0x1b, 0x2, 0x161, 0x165, 0x5, 0x3a, 
    0x1e, 0x2, 0x162, 0x165, 0x5, 0x4a, 0x26, 0x2, 0x163, 0x165, 0x5, 0x4e, 
    0x28, 0x2, 0x164, 0x160, 0x3, 0x2, 0x2, 0x2, 0x164, 0x161, 0x3, 0x2, 
    0x2, 0x2, 0x164, 0x162, 0x3, 0x2, 0x2, 0x2, 0x164, 0x163, 0x3, 0x2, 
    0x2, 0x2, 0x165, 0x33, 0x3, 0x2, 0x2, 0x2, 0x166, 0x167, 0x7, 0x4, 0x2, 
    0x2, 0x167, 0x168, 0x7, 0x52, 0x2, 0x2, 0x168, 0x16d, 0x5, 0x36, 0x1c, 
    0x2, 0x169, 0x16a, 0x7, 0x4f, 0x2, 0x2, 0x16a, 0x16c, 0x5, 0x36, 0x1c, 
    0x2, 0x16b, 0x169, 0x3, 0x2, 0x2, 0x2, 0x16c, 0x16f, 0x3, 0x2, 0x2, 
    0x2, 0x16d, 0x16b, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x16e, 0x3, 0x2, 0x2, 
    0x2, 0x16e, 0x170, 0x3, 0x2, 0x2, 0x2, 0x16f, 0x16d, 0x3, 0x2, 0x2, 
    0x2, 0x170, 0x171, 0x7, 0x53, 0x2, 0x2, 0x171, 0x172, 0x7, 0x21, 0x2, 
    0x2, 0x172, 0x173, 0x5, 0x38, 0x1d, 0x2, 0x173, 0x35, 0x3, 0x2, 0x2, 
    0x2, 0x174, 0x175, 0x5, 0x2a, 0x16, 0x2, 0x175, 0x37, 0x3, 0x2, 0x2, 
    0x2, 0x176, 0x177, 0x5, 0x28, 0x15, 0x2, 0x177, 0x39, 0x3, 0x2, 0x2, 
    0x2, 0x178, 0x179, 0x7, 0x28, 0x2, 0x2, 0x179, 0x17a, 0x5, 0x3c, 0x1f, 
    0x2, 0x17a, 0x17b, 0x7, 0x11, 0x2, 0x2, 0x17b, 0x3b, 0x3, 0x2, 0x2, 
    0x2, 0x17c, 0x183, 0x5, 0x3e, 0x20, 0x2, 0x17d, 0x17e, 0x5, 0x3e, 0x20, 
    0x2, 0x17e, 0x17f, 0x7, 0x4e, 0x2, 0x2, 0x17f, 0x180, 0x5, 0x46, 0x24, 
    0x2, 0x180, 0x183, 0x3, 0x2, 0x2, 0x2, 0x181, 0x183, 0x5, 0x46, 0x24, 
    0x2, 0x182, 0x17c, 0x3, 0x2, 0x2, 0x2, 0x182, 0x17d, 0x3, 0x2, 0x2, 
    0x2, 0x182, 0x181, 0x3, 0x2, 0x2, 0x2, 0x183, 0x3d, 0x3, 0x2, 0x2, 0x2, 
    0x184, 0x189, 0x5, 0x40, 0x21, 0x2, 0x185, 0x186, 0x7, 0x4e, 0x2, 0x2, 
    0x186, 0x188, 0x5, 0x40, 0x21, 0x2, 0x187, 0x185, 0x3, 0x2, 0x2, 0x2, 
    0x188, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x189, 0x187, 0x3, 0x2, 0x2, 0x2, 
    0x189, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x18a, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x18b, 
    0x189, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x191, 0x5, 0x82, 0x42, 0x2, 0x18d, 
    0x18e, 0x7, 0x4f, 0x2, 0x2, 0x18e, 0x190, 0x5, 0x82, 0x42, 0x2, 0x18f, 
    0x18d, 0x3, 0x2, 0x2, 0x2, 0x190, 0x193, 0x3, 0x2, 0x2, 0x2, 0x191, 
    0x18f, 0x3, 0x2, 0x2, 0x2, 0x191, 0x192, 0x3, 0x2, 0x2, 0x2, 0x192, 
    0x194, 0x3, 0x2, 0x2, 0x2, 0x193, 0x191, 0x3, 0x2, 0x2, 0x2, 0x194, 
    0x195, 0x7, 0x5a, 0x2, 0x2, 0x195, 0x196, 0x5, 0x28, 0x15, 0x2, 0x196, 
    0x199, 0x3, 0x2, 0x2, 0x2, 0x197, 0x199, 0x5, 0xb0, 0x59, 0x2, 0x198, 
    0x18c, 0x3, 0x2, 0x2, 0x2, 0x198, 0x197, 0x3, 0x2, 0x2, 0x2, 0x199, 
    0x41, 0x3, 0x2, 0x2, 0x2, 0x19a, 0x19b, 0x7, 0x8, 0x2, 0x2, 0x19b, 0x19c, 
    0x5, 0x44, 0x23, 0x2, 0x19c, 0x19d, 0x5, 0x30, 0x19, 0x2, 0x19d, 0x19e, 
    0x7, 0x21, 0x2, 0x2, 0x19e, 0x1a3, 0x5, 0x46, 0x24, 0x2, 0x19f, 0x1a0, 
    0x7, 0x4e, 0x2, 0x2, 0x1a0, 0x1a2, 0x5, 0x46, 0x24, 0x2, 0x1a1, 0x19f, 
    0x3, 0x2, 0x2, 0x2, 0x1a2, 0x1a5, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a1, 
    0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a4, 0x43, 0x3, 
    0x2, 0x2, 0x2, 0x1a5, 0x1a3, 0x3, 0x2, 0x2, 0x2, 0x1a6, 0x1a7, 0x5, 
    0x82, 0x42, 0x2, 0x1a7, 0x1a8, 0x7, 0x5a, 0x2, 0x2, 0x1a8, 0x1ab, 0x3, 
    0x2, 0x2, 0x2, 0x1a9, 0x1ab, 0x5, 0xb0, 0x59, 0x2, 0x1aa, 0x1a6, 0x3, 
    0x2, 0x2, 0x2, 0x1aa, 0x1a9, 0x3, 0x2, 0x2, 0x2, 0x1ab, 0x45, 0x3, 0x2, 
    0x2, 0x2, 0x1ac, 0x1ad, 0x5, 0xbe, 0x60, 0x2, 0x1ad, 0x1ae, 0x7, 0x5a, 
    0x2, 0x2, 0x1ae, 0x1af, 0x5, 0x3c, 0x1f, 0x2, 0x1af, 0x1b2, 0x3, 0x2, 
    0x2, 0x2, 0x1b0, 0x1b2, 0x5, 0xb0, 0x59, 0x2, 0x1b1, 0x1ac, 0x3, 0x2, 
    0x2, 0x2, 0x1b1, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1b2, 0x47, 0x3, 0x2, 0x2, 
    0x2, 0x1b3, 0x1b4, 0x5, 0x14, 0xb, 0x2, 0x1b4, 0x49, 0x3, 0x2, 0x2, 
    0x2, 0x1b5, 0x1b6, 0x7, 0x2a, 0x2, 0x2, 0x1b6, 0x1b7, 0x7, 0x21, 0x2, 
    0x2, 0x1b7, 0x1b8, 0x5, 0x4c, 0x27, 0x2, 0x1b8, 0x4b, 0x3, 0x2, 0x2, 
    0x2, 0x1b9, 0x1ba, 0x5, 0x2a, 0x16, 0x2, 0x1ba, 0x4d, 0x3, 0x2, 0x2, 
    0x2, 0x1bb, 0x1bc, 0x7, 0x13, 0x2, 0x2, 0x1bc, 0x1bd, 0x7, 0x21, 0x2, 
    0x2, 0x1bd, 0x1be, 0x5, 0x28, 0x15, 0x2, 0x1be, 0x4f, 0x3, 0x2, 0x2, 
    0x2, 0x1bf, 0x1c0, 0x5, 0x30, 0x19, 0x2, 0x1c0, 0x51, 0x3, 0x2, 0x2, 
    0x2, 0x1c1, 0x1ce, 0x5, 0xb0, 0x59, 0x2, 0x1c2, 0x1c3, 0x7, 0x35, 0x2, 
    0x2, 0x1c3, 0x1c8, 0x5, 0x54, 0x2b, 0x2, 0x1c4, 0x1c5, 0x7, 0x4e, 0x2, 
    0x2, 0x1c5, 0x1c7, 0x5, 0x54, 0x2b, 0x2, 0x1c6, 0x1c4, 0x3, 0x2, 0x2, 
    0x2, 0x1c7, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1c6, 0x3, 0x2, 0x2, 
    0x2, 0x1c8, 0x1c9, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1cb, 0x3, 0x2, 0x2, 
    0x2, 0x1ca, 0x1c8, 0x3, 0x2, 0x2, 0x2, 0x1cb, 0x1cc, 0x7, 0x4e, 0x2, 
    0x2, 0x1cc, 0x1ce, 0x3, 0x2, 0x2, 0x2, 0x1cd, 0x1c1, 0x3, 0x2, 0x2, 
    0x2, 0x1cd, 0x1c2, 0x3, 0x2, 0x2, 0x2, 0x1ce, 0x53, 0x3, 0x2, 0x2, 0x2, 
    0x1cf, 0x1d4, 0x5, 0x8, 0x5, 0x2, 0x1d0, 0x1d1, 0x7, 0x4f, 0x2, 0x2, 
    0x1d1, 0x1d3, 0x5, 0x8, 0x5, 0x2, 0x1d2, 0x1d0, 0x3, 0x2, 0x2, 0x2, 
    0x1d3, 0x1d6, 0x3, 0x2, 0x2, 0x2, 0x1d4, 0x1d2, 0x3, 0x2, 0x2, 0x2, 
    0x1d4, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1d5, 0x1d7, 0x3, 0x2, 0x2, 0x2, 
    0x1d6, 0x1d4, 0x3, 0x2, 0x2, 0x2, 0x1d7, 0x1d8, 0x7, 0x5a, 0x2, 0x2, 
    0x1d8, 0x1d9, 0x5, 0x28, 0x15, 0x2, 0x1d9, 0x55, 0x3, 0x2, 0x2, 0x2, 
    0x1da, 0x1db, 0x5, 0x58, 0x2d, 0x2, 0x1db, 0x1dc, 0x7, 0x4e, 0x2, 0x2, 
    0x1dc, 0x1de, 0x3, 0x2, 0x2, 0x2, 0x1dd, 0x1da, 0x3, 0x2, 0x2, 0x2, 
    0x1de, 0x1e1, 0x3, 0x2, 0x2, 0x2, 0x1df, 0x1dd, 0x3, 0x2, 0x2, 0x2, 
    0x1df, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x57, 0x3, 0x2, 0x2, 0x2, 0x1e1, 
    0x1df, 0x3, 0x2, 0x2, 0x2, 0x1e2, 0x1e5, 0x5, 0x5a, 0x2e, 0x2, 0x1e3, 
    0x1e5, 0x5, 0x62, 0x32, 0x2, 0x1e4, 0x1e2, 0x3, 0x2, 0x2, 0x2, 0x1e4, 
    0x1e3, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x59, 0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e7, 
    0x5, 0x5c, 0x2f, 0x2, 0x1e7, 0x1e8, 0x5, 0xa, 0x6, 0x2, 0x1e8, 0x5b, 
    0x3, 0x2, 0x2, 0x2, 0x1e9, 0x1ea, 0x7, 0x26, 0x2, 0x2, 0x1ea, 0x1eb, 
    0x5, 0x8, 0x5, 0x2, 0x1eb, 0x1ec, 0x7, 0x4e, 0x2, 0x2, 0x1ec, 0x1fc, 
    0x3, 0x2, 0x2, 0x2, 0x1ed, 0x1ee, 0x7, 0x26, 0x2, 0x2, 0x1ee, 0x1ef, 
    0x5, 0x8, 0x5, 0x2, 0x1ef, 0x1f0, 0x7, 0x50, 0x2, 0x2, 0x1f0, 0x1f5, 
    0x5, 0x5e, 0x30, 0x2, 0x1f1, 0x1f2, 0x7, 0x4e, 0x2, 0x2, 0x1f2, 0x1f4, 
    0x5, 0x5e, 0x30, 0x2, 0x1f3, 0x1f1, 0x3, 0x2, 0x2, 0x2, 0x1f4, 0x1f7, 
    0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1f3, 0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1f6, 
    0x3, 0x2, 0x2, 0x2, 0x1f6, 0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1f7, 0x1f5, 
    0x3, 0x2, 0x2, 0x2, 0x1f8, 0x1f9, 0x7, 0x51, 0x2, 0x2, 0x1f9, 0x1fa, 
    0x7, 0x4e, 0x2, 0x2, 0x1fa, 0x1fc, 0x3, 0x2, 0x2, 0x2, 0x1fb, 0x1e9, 
    0x3, 0x2, 0x2, 0x2, 0x1fb, 0x1ed, 0x3, 0x2, 0x2, 0x2, 0x1fc, 0x5d, 0x3, 
    0x2, 0x2, 0x2, 0x1fd, 0x20c, 0x5, 0x60, 0x31, 0x2, 0x1fe, 0x1ff, 0x7, 
    0x35, 0x2, 0x2, 0x1ff, 0x20c, 0x5, 0x60, 0x31, 0x2, 0x200, 0x201, 0x7, 
    0x15, 0x2, 0x2, 0x201, 0x20c, 0x5, 0x60, 0x31, 0x2, 0x202, 0x203, 0x7, 
    0x26, 0x2, 0x2, 0x203, 0x208, 0x5, 0x8, 0x5, 0x2, 0x204, 0x205, 0x7, 
    0x4f, 0x2, 0x2, 0x205, 0x207, 0x5, 0x8, 0x5, 0x2, 0x206, 0x204, 0x3, 
    0x2, 0x2, 0x2, 0x207, 0x20a, 0x3, 0x2, 0x2, 0x2, 0x208, 0x206, 0x3, 
    0x2, 0x2, 0x2, 0x208, 0x209, 0x3, 0x2, 0x2, 0x2, 0x209, 0x20c, 0x3, 
    0x2, 0x2, 0x2, 0x20a, 0x208, 0x3, 0x2, 0x2, 0x2, 0x20b, 0x1fd, 0x3, 
    0x2, 0x2, 0x2, 0x20b, 0x1fe, 0x3, 0x2, 0x2, 0x2, 0x20b, 0x200, 0x3, 
    0x2, 0x2, 0x2, 0x20b, 0x202, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x5f, 0x3, 0x2, 
    0x2, 0x2, 0x20d, 0x212, 0x5, 0x8, 0x5, 0x2, 0x20e, 0x20f, 0x7, 0x4f, 
    0x2, 0x2, 0x20f, 0x211, 0x5, 0x8, 0x5, 0x2, 0x210, 0x20e, 0x3, 0x2, 
    0x2, 0x2, 0x211, 0x214, 0x3, 0x2, 0x2, 0x2, 0x212, 0x210, 0x3, 0x2, 
    0x2, 0x2, 0x212, 0x213, 0x3, 0x2, 0x2, 0x2, 0x213, 0x215, 0x3, 0x2, 
    0x2, 0x2, 0x214, 0x212, 0x3, 0x2, 0x2, 0x2, 0x215, 0x216, 0x7, 0x5a, 
    0x2, 0x2, 0x216, 0x217, 0x5, 0x30, 0x19, 0x2, 0x217, 0x61, 0x3, 0x2, 
    0x2, 0x2, 0x218, 0x219, 0x5, 0x64, 0x33, 0x2, 0x219, 0x21a, 0x5, 0xa, 
    0x6, 0x2, 0x21a, 0x63, 0x3, 0x2, 0x2, 0x2, 0x21b, 0x21c, 0x7, 0x15, 
    0x2, 0x2, 0x21c, 0x21d, 0x5, 0x8, 0x5, 0x2, 0x21d, 0x21e, 0x7, 0x5a, 
    0x2, 0x2, 0x21e, 0x21f, 0x5, 0x66, 0x34, 0x2, 0x21f, 0x220, 0x7, 0x4e, 
    0x2, 0x2, 0x220, 0x231, 0x3, 0x2, 0x2, 0x2, 0x221, 0x222, 0x7, 0x15, 
    0x2, 0x2, 0x222, 0x223, 0x5, 0x8, 0x5, 0x2, 0x223, 0x224, 0x7, 0x50, 
    0x2, 0x2, 0x224, 0x229, 0x5, 0x5e, 0x30, 0x2, 0x225, 0x226, 0x7, 0x4e, 
    0x2, 0x2, 0x226, 0x228, 0x5, 0x5e, 0x30, 0x2, 0x227, 0x225, 0x3, 0x2, 
    0x2, 0x2, 0x228, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x229, 0x227, 0x3, 0x2, 
    0x2, 0x2, 0x229, 0x22a, 0x3, 0x2, 0x2, 0x2, 0x22a, 0x22c, 0x3, 0x2, 
    0x2, 0x2, 0x22b, 0x229, 0x3, 0x2, 0x2, 0x2, 0x22c, 0x22d, 0x7, 0x51, 
    0x2, 0x2, 0x22d, 0x22e, 0x5, 0x66, 0x34, 0x2, 0x22e, 0x22f, 0x7, 0x4e, 
    0x2, 0x2, 0x22f, 0x231, 0x3, 0x2, 0x2, 0x2, 0x230, 0x21b, 0x3, 0x2, 
    0x2, 0x2, 0x230, 0x221, 0x3, 0x2, 0x2, 0x2, 0x231, 0x65, 0x3, 0x2, 0x2, 
    0x2, 0x232, 0x233, 0x5, 0x30, 0x19, 0x2, 0x233, 0x67, 0x3, 0x2, 0x2, 
    0x2, 0x234, 0x235, 0x5, 0xb4, 0x5b, 0x2, 0x235, 0x69, 0x3, 0x2, 0x2, 
    0x2, 0x236, 0x23c, 0x5, 0x6c, 0x37, 0x2, 0x237, 0x238, 0x5, 0xe, 0x8, 
    0x2, 0x238, 0x239, 0x7, 0x5a, 0x2, 0x2, 0x239, 0x23a, 0x5, 0x6c, 0x37, 
    0x2, 0x23a, 0x23c, 0x3, 0x2, 0x2, 0x2, 0x23b, 0x236, 0x3, 0x2, 0x2, 
    0x2, 0x23b, 0x237, 0x3, 0x2, 0x2, 0x2, 0x23c, 0x6b, 0x3, 0x2, 0x2, 0x2, 
    0x23d, 0x240, 0x5, 0x6e, 0x38, 0x2, 0x23e, 0x240, 0x5, 0xb2, 0x5a, 0x2, 
    0x23f, 0x23d, 0x3, 0x2, 0x2, 0x2, 0x23f, 0x23e, 0x3, 0x2, 0x2, 0x2, 
    0x240, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x241, 0x246, 0x5, 0x70, 0x39, 0x2, 
    0x242, 0x246, 0x5, 0xa6, 0x54, 0x2, 0x243, 0x246, 0x5, 0xac, 0x57, 0x2, 
    0x244, 0x246, 0x5, 0xae, 0x58, 0x2, 0x245, 0x241, 0x3, 0x2, 0x2, 0x2, 
    0x245, 0x242, 0x3, 0x2, 0x2, 0x2, 0x245, 0x243, 0x3, 0x2, 0x2, 0x2, 
    0x245, 0x244, 0x3, 0x2, 0x2, 0x2, 0x246, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x247, 
    0x248, 0x5, 0x72, 0x3a, 0x2, 0x248, 0x249, 0x7, 0x42, 0x2, 0x2, 0x249, 
    0x24a, 0x5, 0x8c, 0x47, 0x2, 0x24a, 0x250, 0x3, 0x2, 0x2, 0x2, 0x24b, 
    0x24c, 0x5, 0x9e, 0x50, 0x2, 0x24c, 0x24d, 0x7, 0x42, 0x2, 0x2, 0x24d, 
    0x24e, 0x5, 0x8c, 0x47, 0x2, 0x24e, 0x250, 0x3, 0x2, 0x2, 0x2, 0x24f, 
    0x247, 0x3, 0x2, 0x2, 0x2, 0x24f, 0x24b, 0x3, 0x2, 0x2, 0x2, 0x250, 
    0x71, 0x3, 0x2, 0x2, 0x2, 0x251, 0x255, 0x5, 0x74, 0x3b, 0x2, 0x252, 
    0x255, 0x5, 0x78, 0x3d, 0x2, 0x253, 0x255, 0x5, 0x88, 0x45, 0x2, 0x254, 
    0x251, 0x3, 0x2, 0x2, 0x2, 0x254, 0x252, 0x3, 0x2, 0x2, 0x2, 0x254, 
    0x253, 0x3, 0x2, 0x2, 0x2, 0x255, 0x73, 0x3, 0x2, 0x2, 0x2, 0x256, 0x257, 
    0x5, 0x76, 0x3c, 0x2, 0x257, 0x75, 0x3, 0x2, 0x2, 0x2, 0x258, 0x259, 
    0x5, 0x8, 0x5, 0x2, 0x259, 0x77, 0x3, 0x2, 0x2, 0x2, 0x25a, 0x25e, 0x5, 
    0x7a, 0x3e, 0x2, 0x25b, 0x25e, 0x5, 0x7e, 0x40, 0x2, 0x25c, 0x25e, 0x5, 
    0x84, 0x43, 0x2, 0x25d, 0x25a, 0x3, 0x2, 0x2, 0x2, 0x25d, 0x25b, 0x3, 
    0x2, 0x2, 0x2, 0x25d, 0x25c, 0x3, 0x2, 0x2, 0x2, 0x25e, 0x79, 0x3, 0x2, 
    0x2, 0x2, 0x25f, 0x260, 0x5, 0x7c, 0x3f, 0x2, 0x260, 0x261, 0x7, 0x52, 
    0x2, 0x2, 0x261, 0x266, 0x5, 0x8c, 0x47, 0x2, 0x262, 0x263, 0x7, 0x4f, 
    0x2, 0x2, 0x263, 0x265, 0x5, 0x8c, 0x47, 0x2, 0x264, 0x262, 0x3, 0x2, 
    0x2, 0x2, 0x265, 0x268, 0x3, 0x2, 0x2, 0x2, 0x266, 0x264, 0x3, 0x2, 
    0x2, 0x2, 0x266, 0x267, 0x3, 0x2, 0x2, 0x2, 0x267, 0x269, 0x3, 0x2, 
    0x2, 0x2, 0x268, 0x266, 0x3, 0x2, 0x2, 0x2, 0x269, 0x26a, 0x7, 0x53, 
    0x2, 0x2, 0x26a, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x26b, 0x26c, 0x5, 0x8, 0x5, 
    0x2, 0x26c, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x26d, 0x26e, 0x5, 0x80, 0x41, 
    0x2, 0x26e, 0x26f, 0x7, 0x59, 0x2, 0x2, 0x26f, 0x270, 0x5, 0x82, 0x42, 
    0x2, 0x270, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x271, 0x272, 0x5, 0x8, 0x5, 0x2, 
    0x272, 0x81, 0x3, 0x2, 0x2, 0x2, 0x273, 0x274, 0x5, 0x8, 0x5, 0x2, 0x274, 
    0x83, 0x3, 0x2, 0x2, 0x2, 0x275, 0x276, 0x5, 0x8, 0x5, 0x2, 0x276, 0x85, 
    0x3, 0x2, 0x2, 0x2, 0x277, 0x278, 0x5, 0x8, 0x5, 0x2, 0x278, 0x87, 0x3, 
    0x2, 0x2, 0x2, 0x279, 0x27a, 0x5, 0x8a, 0x46, 0x2, 0x27a, 0x89, 0x3, 
    0x2, 0x2, 0x2, 0x27b, 0x27c, 0x5, 0x8, 0x5, 0x2, 0x27c, 0x8b, 0x3, 0x2, 
    0x2, 0x2, 0x27d, 0x283, 0x5, 0x90, 0x49, 0x2, 0x27e, 0x27f, 0x5, 0x90, 
    0x49, 0x2, 0x27f, 0x280, 0x5, 0x8e, 0x48, 0x2, 0x280, 0x281, 0x5, 0x90, 
    0x49, 0x2, 0x281, 0x283, 0x3, 0x2, 0x2, 0x2, 0x282, 0x27d, 0x3, 0x2, 
    0x2, 0x2, 0x282, 0x27e, 0x3, 0x2, 0x2, 0x2, 0x283, 0x8d, 0x3, 0x2, 0x2, 
    0x2, 0x284, 0x285, 0x9, 0x3, 0x2, 0x2, 0x285, 0x8f, 0x3, 0x2, 0x2, 0x2, 
    0x286, 0x287, 0x8, 0x49, 0x1, 0x2, 0x287, 0x28c, 0x5, 0x94, 0x4b, 0x2, 
    0x288, 0x289, 0x5, 0x1e, 0x10, 0x2, 0x289, 0x28a, 0x5, 0x94, 0x4b, 0x2, 
    0x28a, 0x28c, 0x3, 0x2, 0x2, 0x2, 0x28b, 0x286, 0x3, 0x2, 0x2, 0x2, 
    0x28b, 0x288, 0x3, 0x2, 0x2, 0x2, 0x28c, 0x293, 0x3, 0x2, 0x2, 0x2, 
    0x28d, 0x28e, 0xc, 0x3, 0x2, 0x2, 0x28e, 0x28f, 0x5, 0x92, 0x4a, 0x2, 
    0x28f, 0x290, 0x5, 0x94, 0x4b, 0x2, 0x290, 0x292, 0x3, 0x2, 0x2, 0x2, 
    0x291, 0x28d, 0x3, 0x2, 0x2, 0x2, 0x292, 0x295, 0x3, 0x2, 0x2, 0x2, 
    0x293, 0x291, 0x3, 0x2, 0x2, 0x2, 0x293, 0x294, 0x3, 0x2, 0x2, 0x2, 
    0x294, 0x91, 0x3, 0x2, 0x2, 0x2, 0x295, 0x293, 0x3, 0x2, 0x2, 0x2, 0x296, 
    0x297, 0x9, 0x4, 0x2, 0x2, 0x297, 0x93, 0x3, 0x2, 0x2, 0x2, 0x298, 0x299, 
    0x8, 0x4b, 0x1, 0x2, 0x299, 0x29a, 0x5, 0x98, 0x4d, 0x2, 0x29a, 0x2a1, 
    0x3, 0x2, 0x2, 0x2, 0x29b, 0x29c, 0xc, 0x3, 0x2, 0x2, 0x29c, 0x29d, 
    0x5, 0x96, 0x4c, 0x2, 0x29d, 0x29e, 0x5, 0x98, 0x4d, 0x2, 0x29e, 0x2a0, 
    0x3, 0x2, 0x2, 0x2, 0x29f, 0x29b, 0x3, 0x2, 0x2, 0x2, 0x2a0, 0x2a3, 
    0x3, 0x2, 0x2, 0x2, 0x2a1, 0x29f, 0x3, 0x2, 0x2, 0x2, 0x2a1, 0x2a2, 
    0x3, 0x2, 0x2, 0x2, 0x2a2, 0x95, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x2a1, 0x3, 
    0x2, 0x2, 0x2, 0x2a4, 0x2a5, 0x9, 0x5, 0x2, 0x2, 0x2a5, 0x97, 0x3, 0x2, 
    0x2, 0x2, 0x2a6, 0x2b1, 0x5, 0x72, 0x3a, 0x2, 0x2a7, 0x2b1, 0x5, 0x9a, 
    0x4e, 0x2, 0x2a8, 0x2a9, 0x7, 0x50, 0x2, 0x2, 0x2a9, 0x2aa, 0x5, 0x8c, 
    0x47, 0x2, 0x2aa, 0x2ab, 0x7, 0x51, 0x2, 0x2, 0x2ab, 0x2b1, 0x3, 0x2, 
    0x2, 0x2, 0x2ac, 0x2b1, 0x5, 0x9c, 0x4f, 0x2, 0x2ad, 0x2b1, 0x5, 0xa0, 
    0x51, 0x2, 0x2ae, 0x2af, 0x7, 0x1f, 0x2, 0x2, 0x2af, 0x2b1, 0x5, 0x98, 
    0x4d, 0x2, 0x2b0, 0x2a6, 0x3, 0x2, 0x2, 0x2, 0x2b0, 0x2a7, 0x3, 0x2, 
    0x2, 0x2, 0x2b0, 0x2a8, 0x3, 0x2, 0x2, 0x2, 0x2b0, 0x2ac, 0x3, 0x2, 
    0x2, 0x2, 0x2b0, 0x2ad, 0x3, 0x2, 0x2, 0x2, 0x2b0, 0x2ae, 0x3, 0x2, 
    0x2, 0x2, 0x2b1, 0x99, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x2b6, 0x5, 0x16, 
    0xc, 0x2, 0x2b3, 0x2b6, 0x5, 0x22, 0x12, 0x2, 0x2b4, 0x2b6, 0x5, 0x20, 
    0x11, 0x2, 0x2b5, 0x2b2, 0x3, 0x2, 0x2, 0x2, 0x2b5, 0x2b3, 0x3, 0x2, 
    0x2, 0x2, 0x2b5, 0x2b4, 0x3, 0x2, 0x2, 0x2, 0x2b6, 0x9b, 0x3, 0x2, 0x2, 
    0x2, 0x2b7, 0x2c5, 0x5, 0x9e, 0x50, 0x2, 0x2b8, 0x2b9, 0x5, 0x9e, 0x50, 
    0x2, 0x2b9, 0x2ba, 0x7, 0x50, 0x2, 0x2, 0x2ba, 0x2bf, 0x5, 0xaa, 0x56, 
    0x2, 0x2bb, 0x2bc, 0x7, 0x4f, 0x2, 0x2, 0x2bc, 0x2be, 0x5, 0xaa, 0x56, 
    0x2, 0x2bd, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x2be, 0x2c1, 0x3, 0x2, 0x2, 
    0x2, 0x2bf, 0x2bd, 0x3, 0x2, 0x2, 0x2, 0x2bf, 0x2c0, 0x3, 0x2, 0x2, 
    0x2, 0x2c0, 0x2c2, 0x3, 0x2, 0x2, 0x2, 0x2c1, 0x2bf, 0x3, 0x2, 0x2, 
    0x2, 0x2c2, 0x2c3, 0x7, 0x51, 0x2, 0x2, 0x2c3, 0x2c5, 0x3, 0x2, 0x2, 
    0x2, 0x2c4, 0x2b7, 0x3, 0x2, 0x2, 0x2, 0x2c4, 0x2b8, 0x3, 0x2, 0x2, 
    0x2, 0x2c5, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x2c6, 0x2c7, 0x5, 0x8, 0x5, 0x2, 
    0x2c7, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x2c8, 0x2c9, 0x7, 0x52, 0x2, 0x2, 
    0x2c9, 0x2ca, 0x5, 0xa2, 0x52, 0x2, 0x2ca, 0x2cb, 0x7, 0x53, 0x2, 0x2, 
    0x2cb, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2d1, 0x5, 0xa4, 0x53, 0x2, 
    0x2cd, 0x2ce, 0x7, 0x4f, 0x2, 0x2, 0x2ce, 0x2d0, 0x5, 0xa4, 0x53, 0x2, 
    0x2cf, 0x2cd, 0x3, 0x2, 0x2, 0x2, 0x2d0, 0x2d3, 0x3, 0x2, 0x2, 0x2, 
    0x2d1, 0x2cf, 0x3, 0x2, 0x2, 0x2, 0x2d1, 0x2d2, 0x3, 0x2, 0x2, 0x2, 
    0x2d2, 0x2d6, 0x3, 0x2, 0x2, 0x2, 0x2d3, 0x2d1, 0x3, 0x2, 0x2, 0x2, 
    0x2d4, 0x2d6, 0x5, 0xb0, 0x59, 0x2, 0x2d5, 0x2cc, 0x3, 0x2, 0x2, 0x2, 
    0x2d5, 0x2d4, 0x3, 0x2, 0x2, 0x2, 0x2d6, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x2d7, 
    0x2dd, 0x5, 0x8c, 0x47, 0x2, 0x2d8, 0x2d9, 0x5, 0x8c, 0x47, 0x2, 0x2d9, 
    0x2da, 0x7, 0x58, 0x2, 0x2, 0x2da, 0x2db, 0x5, 0x8c, 0x47, 0x2, 0x2db, 
    0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2dc, 0x2d7, 0x3, 0x2, 0x2, 0x2, 0x2dc, 
    0x2d8, 0x3, 0x2, 0x2, 0x2, 0x2dd, 0xa5, 0x3, 0x2, 0x2, 0x2, 0x2de, 0x2ec, 
    0x5, 0xa8, 0x55, 0x2, 0x2df, 0x2e0, 0x5, 0xa8, 0x55, 0x2, 0x2e0, 0x2e1, 
    0x7, 0x50, 0x2, 0x2, 0x2e1, 0x2e6, 0x5, 0xaa, 0x56, 0x2, 0x2e2, 0x2e3, 
    0x7, 0x4f, 0x2, 0x2, 0x2e3, 0x2e5, 0x5, 0xaa, 0x56, 0x2, 0x2e4, 0x2e2, 
    0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2e8, 0x3, 0x2, 0x2, 0x2, 0x2e6, 0x2e4, 
    0x3, 0x2, 0x2, 0x2, 0x2e6, 0x2e7, 0x3, 0x2, 0x2, 0x2, 0x2e7, 0x2e9, 
    0x3, 0x2, 0x2, 0x2, 0x2e8, 0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2e9, 0x2ea, 
    0x7, 0x51, 0x2, 0x2, 0x2ea, 0x2ec, 0x3, 0x2, 0x2, 0x2, 0x2eb, 0x2de, 
    0x3, 0x2, 0x2, 0x2, 0x2eb, 0x2df, 0x3, 0x2, 0x2, 0x2, 0x2ec, 0xa7, 0x3, 
    0x2, 0x2, 0x2, 0x2ed, 0x2ee, 0x5, 0x8, 0x5, 0x2, 0x2ee, 0xa9, 0x3, 0x2, 
    0x2, 0x2, 0x2ef, 0x2f4, 0x5, 0x8c, 0x47, 0x2, 0x2f0, 0x2f4, 0x5, 0x72, 
    0x3a, 0x2, 0x2f1, 0x2f4, 0x5, 0xa8, 0x55, 0x2, 0x2f2, 0x2f4, 0x5, 0x9e, 
    0x50, 0x2, 0x2f3, 0x2ef, 0x3, 0x2, 0x2, 0x2, 0x2f3, 0x2f0, 0x3, 0x2, 
    0x2, 0x2, 0x2f3, 0x2f1, 0x3, 0x2, 0x2, 0x2, 0x2f3, 0x2f2, 0x3, 0x2, 
    0x2, 0x2, 0x2f4, 0xab, 0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2f6, 0x7, 0x16, 
    0x2, 0x2, 0x2f6, 0x2f7, 0x5, 0xe, 0x8, 0x2, 0x2f7, 0xad, 0x3, 0x2, 0x2, 
    0x2, 0x2f8, 0x2f9, 0x5, 0xb0, 0x59, 0x2, 0x2f9, 0xaf, 0x3, 0x2, 0x2, 
    0x2, 0x2fa, 0x2fb, 0x3, 0x2, 0x2, 0x2, 0x2fb, 0xb1, 0x3, 0x2, 0x2, 0x2, 
    0x2fc, 0x301, 0x5, 0xb4, 0x5b, 0x2, 0x2fd, 0x301, 0x5, 0xb6, 0x5c, 0x2, 
    0x2fe, 0x301, 0x5, 0xc0, 0x61, 0x2, 0x2ff, 0x301, 0x5, 0xd0, 0x69, 0x2, 
    0x300, 0x2fc, 0x3, 0x2, 0x2, 0x2, 0x300, 0x2fd, 0x3, 0x2, 0x2, 0x2, 
    0x300, 0x2fe, 0x3, 0x2, 0x2, 0x2, 0x300, 0x2ff, 0x3, 0x2, 0x2, 0x2, 
    0x301, 0xb3, 0x3, 0x2, 0x2, 0x2, 0x302, 0x303, 0x7, 0x6, 0x2, 0x2, 0x303, 
    0x308, 0x5, 0x6a, 0x36, 0x2, 0x304, 0x305, 0x7, 0x4e, 0x2, 0x2, 0x305, 
    0x307, 0x5, 0x6a, 0x36, 0x2, 0x306, 0x304, 0x3, 0x2, 0x2, 0x2, 0x307, 
    0x30a, 0x3, 0x2, 0x2, 0x2, 0x308, 0x306, 0x3, 0x2, 0x2, 0x2, 0x308, 
    0x309, 0x3, 0x2, 0x2, 0x2, 0x309, 0x30b, 0x3, 0x2, 0x2, 0x2, 0x30a, 
    0x308, 0x3, 0x2, 0x2, 0x2, 0x30b, 0x30c, 0x7, 0x11, 0x2, 0x2, 0x30c, 
    0xb5, 0x3, 0x2, 0x2, 0x2, 0x30d, 0x310, 0x5, 0xb8, 0x5d, 0x2, 0x30e, 
    0x310, 0x5, 0xba, 0x5e, 0x2, 0x30f, 0x30d, 0x3, 0x2, 0x2, 0x2, 0x30f, 
    0x30e, 0x3, 0x2, 0x2, 0x2, 0x310, 0xb7, 0x3, 0x2, 0x2, 0x2, 0x311, 0x312, 
    0x7, 0x17, 0x2, 0x2, 0x312, 0x313, 0x5, 0x8c, 0x47, 0x2, 0x313, 0x314, 
    0x7, 0x2e, 0x2, 0x2, 0x314, 0x315, 0x5, 0x6a, 0x36, 0x2, 0x315, 0x31e, 
    0x3, 0x2, 0x2, 0x2, 0x316, 0x317, 0x7, 0x17, 0x2, 0x2, 0x317, 0x318, 
    0x5, 0x8c, 0x47, 0x2, 0x318, 0x319, 0x7, 0x2e, 0x2, 0x2, 0x319, 0x31a, 
    0x5, 0x6a, 0x36, 0x2, 0x31a, 0x31b, 0x7, 0x10, 0x2, 0x2, 0x31b, 0x31c, 
    0x5, 0x6a, 0x36, 0x2, 0x31c, 0x31e, 0x3, 0x2, 0x2, 0x2, 0x31d, 0x311, 
    0x3, 0x2, 0x2, 0x2, 0x31d, 0x316, 0x3, 0x2, 0x2, 0x2, 0x31e, 0xb9, 0x3, 
    0x2, 0x2, 0x2, 0x31f, 0x320, 0x7, 0x8, 0x2, 0x2, 0x320, 0x321, 0x5, 
    0x8c, 0x47, 0x2, 0x321, 0x322, 0x7, 0x21, 0x2, 0x2, 0x322, 0x327, 0x5, 
    0xbc, 0x5f, 0x2, 0x323, 0x324, 0x7, 0x4e, 0x2, 0x2, 0x324, 0x326, 0x5, 
    0xbc, 0x5f, 0x2, 0x325, 0x323, 0x3, 0x2, 0x2, 0x2, 0x326, 0x329, 0x3, 
    0x2, 0x2, 0x2, 0x327, 0x325, 0x3, 0x2, 0x2, 0x2, 0x327, 0x328, 0x3, 
    0x2, 0x2, 0x2, 0x328, 0x32a, 0x3, 0x2, 0x2, 0x2, 0x329, 0x327, 0x3, 
    0x2, 0x2, 0x2, 0x32a, 0x32b, 0x7, 0x11, 0x2, 0x2, 0x32b, 0xbb, 0x3, 
    0x2, 0x2, 0x2, 0x32c, 0x32d, 0x5, 0xbe, 0x60, 0x2, 0x32d, 0x32e, 0x7, 
    0x5a, 0x2, 0x2, 0x32e, 0x32f, 0x5, 0x6a, 0x36, 0x2, 0x32f, 0x332, 0x3, 
    0x2, 0x2, 0x2, 0x330, 0x332, 0x5, 0xb0, 0x59, 0x2, 0x331, 0x32c, 0x3, 
    0x2, 0x2, 0x2, 0x331, 0x330, 0x3, 0x2, 0x2, 0x2, 0x332, 0xbd, 0x3, 0x2, 
    0x2, 0x2, 0x333, 0x338, 0x5, 0x48, 0x25, 0x2, 0x334, 0x335, 0x7, 0x4f, 
    0x2, 0x2, 0x335, 0x337, 0x5, 0x48, 0x25, 0x2, 0x336, 0x334, 0x3, 0x2, 
    0x2, 0x2, 0x337, 0x33a, 0x3, 0x2, 0x2, 0x2, 0x338, 0x336, 0x3, 0x2, 
    0x2, 0x2, 0x338, 0x339, 0x3, 0x2, 0x2, 0x2, 0x339, 0xbf, 0x3, 0x2, 0x2, 
    0x2, 0x33a, 0x338, 0x3, 0x2, 0x2, 0x2, 0x33b, 0x33f, 0x5, 0xc2, 0x62, 
    0x2, 0x33c, 0x33f, 0x5, 0xc4, 0x63, 0x2, 0x33d, 0x33f, 0x5, 0xc6, 0x64, 
    0x2, 0x33e, 0x33b, 0x3, 0x2, 0x2, 0x2, 0x33e, 0x33c, 0x3, 0x2, 0x2, 
    0x2, 0x33e, 0x33d, 0x3, 0x2, 0x2, 0x2, 0x33f, 0xc1, 0x3, 0x2, 0x2, 0x2, 
    0x340, 0x341, 0x7, 0x36, 0x2, 0x2, 0x341, 0x342, 0x5, 0x8c, 0x47, 0x2, 
    0x342, 0x343, 0x7, 0xe, 0x2, 0x2, 0x343, 0x344, 0x5, 0x6a, 0x36, 0x2, 
    0x344, 0xc3, 0x3, 0x2, 0x2, 0x2, 0x345, 0x346, 0x7, 0x29, 0x2, 0x2, 
    0x346, 0x34b, 0x5, 0x6a, 0x36, 0x2, 0x347, 0x348, 0x7, 0x4e, 0x2, 0x2, 
    0x348, 0x34a, 0x5, 0x6a, 0x36, 0x2, 0x349, 0x347, 0x3, 0x2, 0x2, 0x2, 
    0x34a, 0x34d, 0x3, 0x2, 0x2, 0x2, 0x34b, 0x349, 0x3, 0x2, 0x2, 0x2, 
    0x34b, 0x34c, 0x3, 0x2, 0x2, 0x2, 0x34c, 0x34e, 0x3, 0x2, 0x2, 0x2, 
    0x34d, 0x34b, 0x3, 0x2, 0x2, 0x2, 0x34e, 0x34f, 0x7, 0x33, 0x2, 0x2, 
    0x34f, 0x350, 0x5, 0x8c, 0x47, 0x2, 0x350, 0xc5, 0x3, 0x2, 0x2, 0x2, 
    0x351, 0x352, 0x7, 0x14, 0x2, 0x2, 0x352, 0x353, 0x5, 0xc8, 0x65, 0x2, 
    0x353, 0x354, 0x7, 0x42, 0x2, 0x2, 0x354, 0x355, 0x5, 0xca, 0x66, 0x2, 
    0x355, 0x356, 0x7, 0xe, 0x2, 0x2, 0x356, 0x357, 0x5, 0x6a, 0x36, 0x2, 
    0x357, 0xc7, 0x3, 0x2, 0x2, 0x2, 0x358, 0x359, 0x5, 0x8, 0x5, 0x2, 0x359, 
    0xc9, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x35b, 0x5, 0xcc, 0x67, 0x2, 0x35b, 
    0x35c, 0x7, 0x2f, 0x2, 0x2, 0x35c, 0x35d, 0x5, 0xce, 0x68, 0x2, 0x35d, 
    0x363, 0x3, 0x2, 0x2, 0x2, 0x35e, 0x35f, 0x5, 0xcc, 0x67, 0x2, 0x35f, 
    0x360, 0x7, 0xf, 0x2, 0x2, 0x360, 0x361, 0x5, 0xce, 0x68, 0x2, 0x361, 
    0x363, 0x3, 0x2, 0x2, 0x2, 0x362, 0x35a, 0x3, 0x2, 0x2, 0x2, 0x362, 
    0x35e, 0x3, 0x2, 0x2, 0x2, 0x363, 0xcb, 0x3, 0x2, 0x2, 0x2, 0x364, 0x365, 
    0x5, 0x8c, 0x47, 0x2, 0x365, 0xcd, 0x3, 0x2, 0x2, 0x2, 0x366, 0x367, 
    0x5, 0x8c, 0x47, 0x2, 0x367, 0xcf, 0x3, 0x2, 0x2, 0x2, 0x368, 0x369, 
    0x7, 0x37, 0x2, 0x2, 0x369, 0x36a, 0x5, 0xd2, 0x6a, 0x2, 0x36a, 0x36b, 
    0x7, 0xe, 0x2, 0x2, 0x36b, 0x36c, 0x5, 0x6a, 0x36, 0x2, 0x36c, 0xd1, 
    0x3, 0x2, 0x2, 0x2, 0x36d, 0x372, 0x5, 0x80, 0x41, 0x2, 0x36e, 0x36f, 
    0x7, 0x4f, 0x2, 0x2, 0x36f, 0x371, 0x5, 0x80, 0x41, 0x2, 0x370, 0x36e, 
    0x3, 0x2, 0x2, 0x2, 0x371, 0x374, 0x3, 0x2, 0x2, 0x2, 0x372, 0x370, 
    0x3, 0x2, 0x2, 0x2, 0x372, 0x373, 0x3, 0x2, 0x2, 0x2, 0x373, 0xd3, 0x3, 
    0x2, 0x2, 0x2, 0x374, 0x372, 0x3, 0x2, 0x2, 0x2, 0x45, 0xd7, 0xe6, 0xf9, 
    0xfe, 0x109, 0x10e, 0x11e, 0x122, 0x129, 0x13a, 0x13f, 0x148, 0x14d, 
    0x155, 0x164, 0x16d, 0x182, 0x189, 0x191, 0x198, 0x1a3, 0x1aa, 0x1b1, 
    0x1c8, 0x1cd, 0x1d4, 0x1df, 0x1e4, 0x1f5, 0x1fb, 0x208, 0x20b, 0x212, 
    0x229, 0x230, 0x23b, 0x23f, 0x245, 0x24f, 0x254, 0x25d, 0x266, 0x282, 
    0x28b, 0x293, 0x2a1, 0x2b0, 0x2b5, 0x2bf, 0x2c4, 0x2d1, 0x2d5, 0x2dc, 
    0x2e6, 0x2eb, 0x2f3, 0x300, 0x308, 0x30f, 0x31d, 0x327, 0x331, 0x338, 
    0x33e, 0x34b, 0x362, 0x372, 
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
