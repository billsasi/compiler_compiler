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

    // Print the token stream.
    cout << "Tokens:" << endl;
    tokens.fill();
    for (Token *token : tokens.getTokens())
    {
        cout << setw(20) << left << lexer.getVocabulary().getSymbolicName(token->getType()) << " : ";
        cout << token->getText() << endl;
        out << setw(20) << left << lexer.getVocabulary().getSymbolicName(token->getType()) << " : ";
        out << token->getText() << endl;
    }

    // Create a parser which parses the token stream
    // to create a parse tree.
    PascalParser parser(&tokens);
    tree::ParseTree *tree = parser.program();

    // Print the parse tree in Lisp format.
    cout << endl << "Parse tree (Lisp format):" << endl;
    std::cout << tree->toStringTree(&parser) << endl;


    return 0;
}