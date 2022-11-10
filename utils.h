#include <iomanip>
#include "tree/Trees.h"

using namespace antlr4::tree;
using namespace antlrcpp;
using namespace antlr4;
using namespace std;

using namespace antlr4::misc;

void printTypespec(ostream& out, Typespec *ts) {
  auto typeId = ts->getIdentifier();
  if (typeId)
    out << std::setw(20) << std::left << typeId->getName();
  if (ts->getForm() == SCALAR) {
    out << "  Scalar";
  } else if (ts->getForm() == ENUMERATION) {
    out << "  Enumeration";
  } else if (ts->getForm() == ARRAY) {
    out << "  Array\n";
    auto et = ts->getArrayElementType();
    out << "    ElementType: ";
    printTypespec(out, et);
    out << std::endl;
    out << "    ElementCount: " << ts->getArrayElementCount() << std::endl;
    out << "    IndexType: " << ts->getArrayIndexType()->getIdentifier()->getName() << std::endl;
  }
  out << std::endl;
}

void printSymtab(ostream& out, Symtab* symtab) {
    std::vector<SymtabEntry*> entries = symtab->sortedEntries();
    out << "Nesting Level " << symtab->getNestingLevel() << std::endl;
    out << "  " << std::setw(20) << std::left << "NAME" << "   " << "KIND" << std::endl;
    for (SymtabEntry* entry : entries) {
        int k = int(entry->getKind());
        out << "  " << std::setw(20) << std::left << entry->getName() << "   " << KIND_STRINGS[k] << std::endl;
    }
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