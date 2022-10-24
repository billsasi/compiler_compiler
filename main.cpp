#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "PascalLexer.h"
#include "PascalParser.h"
#include "SymTab.hpp"

using namespace antlrcpp;
using namespace antlr4;
using namespace std;

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
    SymTab symTab;

    // Print the token stream.
    cout << "Tokens:" << endl;
    tokens.fill();
    for (Token *token : tokens.getTokens())
    {
        if ( lexer.getVocabulary().getSymbolicName(token->getType()) == "IDENTIFIER" )
        {
            symTab.insert(token->getText());
        }
    }

    // Create a parser which parses the token stream
    // to create a parse tree.
    PascalParser parser(&tokens);
    tree::ParseTree *tree = parser.program();

    // Print the parse tree in Lisp format.
    cout << endl << "Parse tree (Lisp format):" << endl;
    out << endl << "Parse tree (Lisp format):" << endl;
    std::cout << tree->toStringTree(&parser) << endl;
    out << tree->toStringTree(&parser) << endl;

    std::cout << "\nSYMBOL TABLE" << endl;
    out << "\nSYMBOL TABLE" << endl;
    symTab.output(out);
    symTab.output();

    return 0;
}