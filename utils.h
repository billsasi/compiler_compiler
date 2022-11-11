#include <iomanip>
#include "tree/Trees.h"

using namespace antlr4::tree;
using namespace antlrcpp;
using namespace antlr4;
using namespace std;

using namespace antlr4::misc;

void printTypespec(ostream& out, Typespec *ts, int indent) {
  if (ts==nullptr) {
    out << "undefined\n";
    return;
  }
  std::string indentStr = "";
  for (int i = 0; i < indent; i++) {
    indentStr += "   ";
  }
  // auto typeId = ts->getIdentifier();
  // if (typeId)
  //   out << indentStr << std::setw(20) << std::left << typeId->getName();
  if (ts->getForm() == SCALAR || ts->getForm() == ENUMERATION) {
    auto identNode = ts->getIdentifier();
    if (identNode) {
      out << identNode->getName() << " Scalar";
    } else
      out << "Scalar";
  } else if (ts->getForm() == ARRAY) {
    out << "Array\n"; 
    auto et = ts->getArrayElementType();
    out << indentStr << " ElementType: ";
    printTypespec(out, et, indent+1);
    out << indentStr << " ElementCount: " << ts->getArrayElementCount();
    out << std::endl << indentStr << " IndexType: " << ts->getArrayIndexType()->getIdentifier()->getName();
  }
  out << std::endl;
}

void printSymtab(ostream& out, Symtab* symtab) {
    std::vector<SymtabEntry*> entries = symtab->sortedEntries();
    out << "Nesting Level " << symtab->getNestingLevel() << "------------------------------------------------------" << std::endl;
    out << "  " << std::setw(20) << std::left << "NAME" << std::setw(22) << std::left << "KIND";
    out << "TYPE\n";
    for (SymtabEntry* entry : entries) {
        int k = int(entry->getKind());
        auto ts = entry->getType();
        out << "  " << std::setw(20) << std::left << entry->getName() << std::setw(22) << std::left << KIND_STRINGS[k];
        printTypespec(out, ts, 15);
    }
    out << "-----------------------------------------------------------------------";
    out << std::endl;
}

// https://github.com/antlr/antlr4/blob/master/runtime/Cpp/runtime/src/tree/Trees.cpp#L38
std::string toStringTree(tree::ParseTree *t, const std::vector<std::string> &ruleNames, bool pretty) {
  std::string temp = antlrcpp::escapeWhitespace(Trees::getNodeText(t, ruleNames), false);
  if (t->children.empty()) {
    return temp;
  }

  std::stringstream ss;
  ss << "(" << temp << ' ';

  // Implement the recursive walk as iteration to avoid trouble with deep nesting.
  std::stack<size_t> stack;
  size_t childIndex = 0;
  ParseTree *run = t;
  size_t indentationLevel = 1;
  while (childIndex < run->children.size()) {
    if (childIndex > 0) {
      ss << ' ';
    }
    ParseTree *child = run->children[childIndex];
    temp = antlrcpp::escapeWhitespace(Trees::getNodeText(child, ruleNames), false);
    if (!child->children.empty()) {
      // Go deeper one level.
      stack.push(childIndex);
      run = child;
      childIndex = 0;
      if (pretty) {
        ++indentationLevel;
        ss << std::endl;
        for (size_t i = 0; i < indentationLevel; ++i) {
          ss << "    ";
        }
      }
      ss << "(" << temp << " ";
    } else {
      ss << temp;
      while (++childIndex == run->children.size()) {
        if (stack.size() > 0) {
          // Reached the end of the current level. See if we can step up from here.
          childIndex = stack.top();
          stack.pop();
          run = run->parent;
          if (pretty) {
            --indentationLevel;
          }
          ss << ")";
        } else {
          break;
        }
      }
    }
  }

  ss << ")";
  return ss.str();
}