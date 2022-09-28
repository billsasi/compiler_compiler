#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "ExprLexer.h"
#include "ExprParser.h"

using namespace antlrcpp;
using namespace antlr4;
using namespace std;


int main(int argc, const char *args[])
{
    ifstream source;

    // Create the input stream.
    source.open(args[1]);
    ANTLRInputStream input(source);

    // Create a lexer which scans the input stream
    // to create a token stream.
    ExprLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    // Print the token stream.
    cout << "Tokens:" << endl;
    tokens.fill();
    for (Token *token : tokens.getTokens())
    {
        cout << std::setw(10) << std::left << token->getText() << std::setfill(' ') << "  :  ";
        cout << lexer.getVocabulary().getSymbolicName(token->getType()) << endl;
    }

    return 0;
}
