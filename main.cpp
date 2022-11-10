#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "tree/Trees.h"
#include "PascalLexer.h"
#include "PascalParser.h"

using namespace antlrcpp;
using namespace antlr4;
using namespace std;

using namespace antlr4::misc;
using namespace antlr4::tree;

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

int main(int argc, const char *args[])
{
    ifstream source;
    ofstream out("test-out.txt");

    // Create the input stream.
    source.open(args[1]);
    ANTLRInputStream input(source);

    // Create a lexer which scans the input stream
    // to create a token stream.
    PascalLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    tokens.fill();
    
    // Create a parser which parses the token stream
    // to create a parse tree.
    PascalParser parser(&tokens);
    tree::ParseTree *tree = parser.program(); 

    // Print the parse tree in Lisp format.
    cout << endl << "Parse tree (Lisp format):" << endl;
    out << endl << "Parse tree (Lisp format):" << endl;
    cout << toStringTree(tree, parser.getRuleNames(), true) << endl;
    out << toStringTree(tree, parser.getRuleNames(), true) << endl;
    //std::cout << tree->toStringTree(&parser) << endl;
    //out << tree->toStringTree(&parser) << endl;
    
    // Print the symbol table.
    std::cout << "\nSYMBOL TABLE" << endl;
    out << "\nSYMBOL TABLE" << endl;

    return 0;
}