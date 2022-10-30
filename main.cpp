#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "PascalLexer.h"
#include "PascalParser.h"

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

    tokens.fill();
    
    // Create a parser which parses the token stream
    // to create a parse tree.
    PascalParser parser(&tokens);
    tree::ParseTree *tree = parser.program();

    // Print the parse tree in Lisp format.
    cout << endl << "Parse tree (Lisp format):" << endl;
    out << endl << "Parse tree (Lisp format):" << endl;
    std::cout << tree->toStringTree(&parser) << endl;
    out << tree->toStringTree(&parser) << endl;
    
    // Print the symbol table.
    std::cout << "\nSYMBOL TABLE" << endl;
    out << "\nSYMBOL TABLE" << endl;

    return 0;
}