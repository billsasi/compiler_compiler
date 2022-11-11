#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "tree/Trees.h"
#include "PascalLexer.h"
#include "PascalParser.h"
#include "utils.h"

using namespace antlrcpp;
using namespace antlr4;
using namespace std;

using namespace antlr4::misc;


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
    std::vector<Symtab *> symtabs = parser.getSymtabList();
    std::vector<Typespec *> types = parser.getTypedefList();

    // Print the parse tree in Lisp format.
    cout << endl << "Parse tree (Lisp format):" << endl;
    out << endl << "Parse tree (Lisp format):" << endl;
    cout << toStringTree(tree, parser.getRuleNames(), true) << endl;
    out << toStringTree(tree, parser.getRuleNames(), true) << endl;
    //std::cout << tree->toStringTree(&parser) << endl;
    //out << tree->toStringTree(&parser) << endl;

    // Print the symbol tables.
    cout << endl << "SYMTABS / TYPEDEFS:" << endl;
    out << endl << "SYMTABS / TYPEDEFS:" << endl;
    for (Symtab *symtab : symtabs)
    {
        printSymtab(cout, symtab);
        printSymtab(out, symtab);
    }

    return 0;
}