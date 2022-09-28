ANTLRFILE = Expr.g4
antlr4 = java -jar ~/Library/ANTLR-4.7.2/antlr-4.7.2-complete.jar
PROJECTPATH = $(shell pwd)
ANTLR_RUNTIME_INCLUDES = /usr/local/include/antlr4-runtime	
ANTLR_INCLUDES = $(PROJECTPATH)/target/generated-sources/ant4
LIB_PATH = /usr/local/lib
LIB = antlr4-runtime
PROG = ExprMain.cpp
OUT = prog.out
ANTLR_SOURCES = target/generated-sources/ant4/*.cpp
SOURCES = $(ANTLR_SOURCES) $(PROG)
compile:	
	g++ -o $(OUT) -std=c++17 -I $(ANTLR_RUNTIME_INCLUDES) -I $(ANTLR_INCLUDES) -I $(PROJECTPATH) -w $(SOURCES) -L$(LIB_PATH) -l$(LIB)
antlr:
	$(antlr4) -o ./target/generated-sources/ant4 -no-listener -visitor -encoding UTF-8 -Dlanguage=Cpp $(ANTLRFILE)