grammar Pascal;

program
   :  PROGRAM identifier programHeading? SEMICOLON block PERIOD
   ;

programHeading
   :  LPAREN identifierList RPAREN
   ;   

identifierList
   :  identifier (COMMA identifier)*
   ;

identifier
   : IDENTIFIER
   ;

block
   :  labelDeclarationPart constantDefinitionPart typeDefinitionPart variableDeclarationPart procedureAndFunctionDeclarationPart statementPart
   ;

labelDeclarationPart
   :  empty | LABEL label (COMMA label)* SEMICOLON
   ;

label
   :  unsignedInteger
   ;

constantDefinitionPart
   :  empty | CONST constantDefinition ( SEMICOLON constantDefinition)* SEMICOLON 
   ;


constantDefinition
   : identifier EQUAL constant
   ;

constant
   : unsignedNumber | sign unsignedNumber | constantIdentifier | sign constantIdentifier | string
   ;

unsignedNumber
   :  unsignedInteger | unsignedReal 
   ;

unsignedInteger
   :  INTEGER
   ;

unsignedReal
   : REAL (('e'|'E') scaleFactor)? | unsignedInteger ('e'|'E') scaleFactor
   ;

scaleFactor
   : sign? unsignedInteger 
   ;

sign
   :  PLUSOP | MINUSOP
   ;

constantIdentifier
   : identifier
   ;

string
   : STRING_LITERAL
   ;

typeDefinitionPart
   :  empty | TYPE typeDefinition (SEMICOLON typeDefinition)* SEMICOLON 
   ;

typeDefinition
   : identifier EQUAL type
   ;

type
   :  simpleType | structuredType | pointerType
   ;

simpleType
   :  scalarType | subrangeType | typeIdentifier
   ;

scalarType
   :  (identifier (COMMA identifier)*)
   ;

subrangeType
   :  constant DOT_DOT constant
   ;

typeIdentifier
   :  identifier
   ;

structuredType
   :  arrayType | recordType | setType | fileType 
   ;

arrayType
   :  ARRAY LBRACKET indexType(COMMA indexType)* RBRACKET OF componentType 
   ;

indexType
   :  simpleType
   ;

componentType
   :  type
   ;

recordType
   :  RECORD fieldList END
   ;

fieldList
   :  fixedPart | fixedPart SEMICOLON variant | variant
   ;

fixedPart
   :  recordSection (SEMICOLON recordSection)*
   ;

recordSection
   :  fieldIdentifier (COMMA fieldIdentifier)* COLON type | empty
   ;

variantType
   :  CASE tagField typeIdentifier OF variant ( SEMICOLON variant)*
   ;

tagField
   :  fieldIdentifier COLON | empty
   ;

variant
   :  caseLabelList COLON ( fieldList ) | empty
   ;

caseLabel
   :  constant
   ;

setType
   : SET OF baseType
   ;

baseType
   :  simpleType
   ;

fileType
   :  FILE OF type
   ;

pointerType
   :  typeIdentifier
   ;

variableDeclarationPart
   :  empty | VAR variableDeclaration (SEMICOLON variableDeclaration)* SEMICOLON 
   ;

variableDeclaration
   : identifier (COMMA identifier)* COLON type
   ;

procedureAndFunctionDeclarationPart
   :  (procedureOrFunctionDeclaration SEMICOLON)* 
   ;

procedureOrFunctionDeclaration
   :  procedureDeclaration | functionDeclaration 
   ;

procedureDeclaration
   :  procedureHeading block
   ;

procedureHeading
   :  PROCEDURE identifier SEMICOLON | PROCEDURE identifier LPAREN formalParameterSection (SEMICOLON formalParameterSection)* RPAREN SEMICOLON
   ;

formalParameterSection
   :  parameterGroup | VAR parameterGroup | FUNCTION parameterGroup | PROCEDURE identifier ( COMMA identifier)*
   ;

parameterGroup
   :  identifier (COMMA identifier)* COLON typeIdentifier
   ;

functionDeclaration
   :  functionHeading block
   ;

functionHeading
   :  FUNCTION identifier COLON resultType SEMICOLON | 
      FUNCTION identifier LPAREN formalParameterSection (SEMICOLON formalParameterSection)* RPAREN resultType SEMICOLON
   ;

resultType
   :  typeIdentifier
   ;

statementPart
   :  compoundStatement
   ;

statement
   :  unlabelledStatement | label COLON unlabelledStatement
   ;

unlabelledStatement
   :  simpleStatement | structuredStatement
   ;

simpleStatement
   :  assignmentStatement | procedureStatement | goToStatement | emptyStatement
   ;

assignmentStatement
   :  variable ASSIGN expression | functionIdentifier ASSIGN expression
   ;

variable
   :  entireVariable | componentVariable | referencedVariable
   ;

entireVariable
   :  variableIdentifier
   ;

variableIdentifier
   :  identifier
   ;

componentVariable
   :  indexedVariable | fieldDesignator | fileBuffer 
   ;

indexedVariable
   :  arrayVariable LBRACKET expression (COMMA expression)* RBRACKET
   ;

arrayVariable
   :  identifier
   ;

fieldDesignator
   :  recordVariable PERIOD fieldIdentifier
   ;

recordVariable
   :  identifier
   ;

fieldIdentifier
   :  identifier
   ;

fileBuffer
   :  identifier
   ;

fileVariable
   :  identifier
   ;

referencedVariable
   :  pointerVariable
   ;

pointerVariable
   :  identifier
   ;

expression
   :  simpleExpression | simpleExpression relationalOperator simpleExpression
   ;

relationalOperator
   : EQUAL | NE | LTEQ | GTEQ | LT | GT | IN
   ;

simpleExpression
   :  term | sign term| simpleExpression addingOperator term
   ;

addingOperator
   :  PLUSOP | MINUSOP | OR
   ;

term
   :  factor | term multiplyingOperator factor
   ;

multiplyingOperator
   :  MULTOP | DIVOP | DIV | MOD | AND
   ;

factor
   :  variable | unsignedConstant | LPAREN expression RPAREN | functionDesignator | set | NOT factor
   ;

unsignedConstant
   :  unsignedNumber | string | constantIdentifier 
   ;

functionDesignator
   :  functionIdentifier | functionIdentifier LPAREN actualParameter (COMMA actualParameter)* RPAREN
   ;

functionIdentifier
   :  identifier
   ;

set
   :  LBRACKET elementList RBRACKET
   ;

elementList
   :  element (COMMA element )* | empty
   ;

element
   :  expression | expression DOT_DOT expression
   ;

procedureStatement
   :  procedureIdentifier | procedureIdentifier LPAREN actualParameter (COMMA actualParameter )* RPAREN
   ;

procedureIdentifier
   :  identifier
   ;

actualParameter
   :  expression | variable | procedureIdentifier | functionIdentifier
   ;

goToStatement
   :  GOTO label
   ;

emptyStatement
   :  empty
   ;

empty
   : 
   ;

structuredStatement
   :  compoundStatement | conditionalStatement | repetitiveStatement | withStatement
   ;

compoundStatement
   :  BEGIN statement (SEMICOLON statement)* END 
   ;

conditionalStatement
   :  ifStatement | caseStatement
   ;

ifStatement
   :  IF expression THEN statement | IF expression THEN statement ELSE statement 
   ;

caseStatement
   :  CASE expression OF caseListElement (SEMICOLON caseListElement )* END
   ;

caseListElement
   :  caseLabelList COLON statement | empty
   ;

caseLabelList
   :  caseLabel (COMMA caseLabel )*
   ;

repetitiveStatement
   :  whileStatement | repeatStatement | forStatement 
   ;

whileStatement
   :  WHILE expression DO statement
   ;

repeatStatement
   :  REPEAT statement (SEMICOLON statement)* UNTIL expression
   ;

forStatement
   :  FOR controlVariable ASSIGN forList DO statement
   ;

controlVariable
   :  identifier
   ;

forList
   :  initialValue TO finalValue | initialValue DOWNTO finalValue 
   ;

initialValue
   :  expression
   ;

finalValue
   :  expression
   ;

withStatement
   :  WITH recordVariableList DO statement
   ;

recordVariableList
   :  recordVariable (COMMA recordVariable)*
   ;


// Lexical Rules ------------------------------------------------------------------------------

AND : A N D  ;
ARRAY : A R R A Y  ;
ASM : A S M  ;
BEGIN : B E G I N  ;
BREAK : B R E A K  ;
CASE : C A S E  ;
CONST : C O N S T  ;
CONSTRUCTOR : C O N S T R U C T O R  ;
CONTINUE : C O N T I N U E  ;
DESTRUCTOR : D E S T R U C T O R  ;
DIV : D I V  ;
DO : D O  ;
DOWNTO : D O W N T O  ;
ELSE : E L S E  ;
END : E N D  ;
FALSE : F A L S E  ;
FILE : F I L E  ;
FOR : F O R  ;
FUNCTION : F U N C T I O N  ;
GOTO : G O T O  ;
IF : I F  ;
IMPLEMENTATION : I M P L E M E N T A T I O N  ;
IN : I N  ;
INLINE : I N L I N E  ;
INTERFACE : I N T E R F A C E  ;
LABEL : L A B E L  ;
MOD : M O D  ;
NIL : N I L  ;
NOT : N O T  ;
OBJECT : O B J E C T  ;
OF : O F  ;
ON : O N  ;
OPERATOR : O P E R A T O R  ;
OR : O R  ;
PACKED : P A C K E D  ;
PROCEDURE : P R O C E D U R E  ;
PROGRAM : P R O G R A M  ;
RECORD : R E C O R D  ;
REPEAT : R E P E A T  ;
SET : S E T  ;
SHL : S H L  ;
SHR : S H R  ;
STRING : S T R I N G  ;
THEN : T H E N  ;
TO : T O  ;
TRUE : T R U E  ;
TYPE : T Y P E  ;
UNIT : U N I T  ;
UNTIL : U N T I L  ;
USES : U S E S  ;
VAR : V A R  ;
WHILE : W H I L E  ;
WITH : W I T H  ;
XOR : X O R  ;

IDENTIFIER : [a-zA-Z_] ([a-zA-Z0-9] | '_' )*;
INTEGER : [0-9]+;
REAL : [0-9]+ '.' [0-9]+;
CHARACTER : '\'' . '\'';
STRING_LITERAL : '\'' .*? '\'' ;

PLUSOP : '+' ;
MINUSOP : '-' ;
MULTOP : '*' ;
DIVOP : '/' ;
ASSIGN : ':=' ;
EQUAL : '=' ;
NE : '<>' ;
LTEQ : '<=' ;
GTEQ : '>=' ;
LT : '<' ;
GT : '>' ;
PLUSEQUAL : '+=' ;
MINUSEQUAL : '-=' ;
MULTEQUAL : '*=' ;
DIVEQUAL : '/=' ;
CARAT : '^' ;
SEMICOLON : ';' ;
COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
LBRACE : '{' ;
RBRACE : '}' ;
LCOMMENT : '(*' ;
RCOMMENT : '*)' ;
DOT_DOT : '..' ;
PERIOD : '.' ;
COLON : ':' ;

WS : ([\n\t\r] | ' ')+  -> skip ; 

fragment A : 'a' | 'A';
fragment B : 'b' | 'B';
fragment C : 'c' | 'C';
fragment D : 'd' | 'D';
fragment E : 'e' | 'E';
fragment F : 'f' | 'F';
fragment G : 'g' | 'G';
fragment H : 'h' | 'H';
fragment I : 'i' | 'I';
fragment J : 'j' | 'J';
fragment K : 'k' | 'K';
fragment L : 'l' | 'L';
fragment M : 'm' | 'M';
fragment N : 'n' | 'N';
fragment O : 'o' | 'O';
fragment P : 'p' | 'P';
fragment Q : 'q' | 'Q';
fragment R : 'r' | 'R';
fragment S : 's' | 'S';
fragment T : 't' | 'T';
fragment U : 'u' | 'U';
fragment V : 'v' | 'V';
fragment W : 'w' | 'W';
fragment X : 'x' | 'X';
fragment Y : 'y' | 'Y';
fragment Z : 'z' | 'Z';