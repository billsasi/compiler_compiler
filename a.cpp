// program
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

        symtabStack->push(); 

//constant
auto node = identifier();
    std::string name = node->getText();
    SymtabEntry *entry = symtabStack->enterLocal(name, Kind::CONSTANT);
    node->entry = entry;


//type
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

// arrayType()
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

// variableDeclaration()
auto typenode = type_();
    std::string typeId = typenode->simpleType()->typeIdentifier()->getText();
    if (typenode) {
      auto typespec = symtabStack->lookup(typeId)->getType();
      for (auto name : names) {
        auto entry = symtabStack->enterLocal(name->getText(), Kind::VARIABLE);
        entry->setType(typespec);
      }
    }