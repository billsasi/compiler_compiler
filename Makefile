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
SOURCES = intermediate/symtab/*.cpp intermediate/type/*.cpp intermediate/util/*.cpp codeGenerator/*.cpp $(ANTLR_SOURCES) $(PROG) 
compile:	
	g++ -g -o $(OUT) -std=c++17 -I $(ANTLR_RUNTIME_INCLUDES) -I $(ANTLR_INCLUDES) -I $(PROJECTPATH) \
		-I $(PROJECTPATH)/intermediate -I $(PROJECTPATH)/codeGenerator \
		-w $(SOURCES) -L$(LIB_PATH) -l$(LIB)
clean:
	rm *.o prog.out