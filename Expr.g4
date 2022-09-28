grammar Expr;

identifier
   : IDENT
   ;

WRITE
    : 'WRITE'
    ;

WRITELN
    : 'WRITELN'
    ;

AND
   : 'AND'
   ;


ARRAY
   : 'ARRAY'
   ;


BEGIN
   : 'BEGIN'
   ;


BOOLEAN
   : 'BOOLEAN'
   ;


CASE
   : 'CASE'
   ;


CHAR
   : 'CHAR'
   ;


CHR
   : 'CHR'
   ;


CONST
   : 'CONST'
   ;


DIV
   : 'DIV'
   ;


DO
   : 'DO'
   ;


DOWNTO
   : 'DOWNTO'
   ;


ELSE
   : 'ELSE'
   ;


END
   : 'END'
   ;


FILE
   : 'FILE'
   ;


FOR
   : 'FOR'
   ;


FUNCTION
   : 'FUNCTION'
   ;


GOTO
   : 'GOTO'
   ;


IF
   : 'IF'
   ;


IN
   : 'IN'
   ;


INTEGER
   : 'INTEGER'
   ;

INTEGER_CONSTANT
    : [0-9]+
    ;

LABEL
   : 'LABEL'
   ;


MOD
   : 'MOD'
   ;


NIL
   : 'NIL'
   ;


NOT
   : 'NOT'
   ;


OF
   : 'OF'
   ;


OR
   : 'OR'
   ;


PACKED
   : 'PACKED'
   ;


PROCEDURE
   : 'PROCEDURE'
   ;


PROGRAM
   : 'PROGRAM'
   ;


REAL
   : 'REAL'
   ;


RECORD
   : 'RECORD'
   ;


REPEAT
   : 'REPEAT'
   ;


SET
   : 'SET'
   ;


THEN
   : 'THEN'
   ;


TO
   : 'TO'
   ;


TYPE
   : 'TYPE'
   ;


UNTIL
   : 'UNTIL'
   ;


VAR
   : 'VAR'
   ;


WHILE
   : 'WHILE'
   ;


WITH
   : 'WITH'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LBRACK
   : '['
   ;


LBRACK2
   : '(.'
   ;


RBRACK
   : ']'
   ;


RBRACK2
   : '.)'
   ;


POINTER
   : '^'
   ;


AT
   : '@'
   ;


DOT
   : '.'
   ;


DOTDOT
   : '..'
   ;


LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;


UNIT
   : 'UNIT'
   ;


INTERFACE
   : 'INTERFACE'
   ;


USES
   : 'USES'
   ;


STRING
   : 'STRING'
   ;


IMPLEMENTATION
   : 'IMPLEMENTATION'
   ;


TRUE
   : 'TRUE'
   ;


FALSE
   : 'FALSE'
   ;


WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENTIFIER
   : [a-zA-Z]+
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


NUM_INT
   : ('0' .. '9') +
   ;


NUM_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;


fragment EXPONENT
   : ('E') ('+' | '-')? ('0' .. '9') +
   ;
