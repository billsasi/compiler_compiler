#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "PascalLexer.h"

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

    // Print the token stream.
    cout << "Tokens:" << endl;
    
    antlr4::dfa::Vocabulary& vocab = lexer.getVocabulary();
    Token *token = lexer.nextToken().get();
    int type = token->getType();
    string typestr = vocab.getSymbolicName(type);
    string text = token->getText();
    
    while (type != Token::EOF)
    {
        cout << std::setw(20) << std::left << typestr << std::setfill(' ') << "  :  ";
        cout << text << endl;
        // print to file
        out << std::setw(20) << std::left << typestr << std::setfill(' ') << "  :  ";
        out << text << endl;

        token = lexer.nextToken().get();
        type = token->getType();
        typestr = vocab.getSymbolicName(type);
        text = token->getText();
    }

    return 0;
}
