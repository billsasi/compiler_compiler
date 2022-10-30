ANTLRFILE = Pascal.g4
antlr4 = java -jar ${ANTLR_JAR}
PROJECTPATH = $(shell pwd)
ANTLR_RUNTIME_INCLUDES = /usr/local/include/antlr4-runtime	
ANTLR_INCLUDES = $(PROJECTPATH)/ant4
LIB_PATH = /usr/local/lib
LIB = antlr4-runtime
PROG = main.cpp
OUT = prog.out
ANTLR_SOURCES = ant4/*.cpp
SOURCES = symtab/*.cpp type/*.cpp util/*.cpp $(ANTLR_SOURCES) $(PROG) 
compile:	
	g++ -g -o $(OUT) -std=c++17 -I $(ANTLR_RUNTIME_INCLUDES) -I $(ANTLR_INCLUDES) -I $(PROJECTPATH) \
		-I $(PROJECTPATH)/symtab -I $(PROJECTPATH)/type -I $(PROJECTPATH)/util \
		-w $(SOURCES) -L$(LIB_PATH) -l$(LIB)
antlr:
	$(antlr4) -o ./ant4 -no-listener -visitor -encoding UTF-8 -Dlanguage=Cpp $(ANTLRFILE)
clean:
	rm *.o prog.out