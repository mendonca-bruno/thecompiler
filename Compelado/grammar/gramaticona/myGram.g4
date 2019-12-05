/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar myGram;

@header {
    package gramaticona;
}

prog:   (line EOL | func)+ EOF
        | IMPORT '<' VAR'.'GRAMATICA'>'';' prog
        ;
line:   atr
        | init_
        | callfunc
        ;
func:   type_ VAR '(' (((type_ VAR)';'?)+|'0') ')' OBR (cmd)+ retr CBR
        | VOID VAR '(' (((type_ VAR)';'?)+|'0') ')' OBR (cmd)+ CBR
        | (INT|VOID) MAIN '(' '0' ')' OBR (cmd)+ RET '0' EOL CBR
        ;
cmd:    atr EOL
        | init_ EOL
        | print EOL
        | read EOL
        | ifstmt
        | while_
        | for_
        | callfunc EOL
        ;
callfunc:   VAR'(' ((VAR|NUM)','?)+ ')'
            | VAR '('')'          
            ;
while_: WHILE '(' cond ')' OBR (cmd)+ CBR
        ;
for_:   FOR '(' (atr|init_) ';' cond ';'  atr')' OBR (cmd)+ CBR
        ;
ifstmt: IF '(' cond ')' OBR (cmd)+ CBR
        | IF '(' (VAR|'!'VAR) ')' OBR (cmd)+ CBR
        | IF '(' cond ')' OBR (cmd)+ CBR ELSE OBR (cmd)+ CBR
        ;
cond:   cond OR cdand
        | cdand
        ;
cdand:  cdand AND cndts
        | cndts
        ;
cndts:  expr relop expr
        | '(' cond ')' 
        ;
relop:  GRT 
        | LESS
        | GRTEQ 
        | LESSEQ
        | EQ 
        | NEQ 
        ;
read:   READ VAR
        | READ type_ VAR
        ;
print:  PRINT '(' ('+'? STRVALUE '+'? VAR?)+ ')'
        | PRINT '(' VAR ')'
        ;
init_: type_ VAR
        ;
retr:   RET VAR EOL
        | RET expr EOL
        ;
atr:    INT VAR '=' (expr|callfunc)
        | DOUBLE VAR '=' (expr|callfunc)
        | FLOAT VAR '=' (expr|callfunc)
        | STRING VAR '=' (STRVALUE|callfunc)
        | BOOL  VAR '=' (TRUE|FALSE)
        | VAR '=' (expr|callfunc)
        | VAR '=' (STRVALUE|callfunc) 
        | VAR '=' (TRUE|FALSE)
        ;
expr:   term
        | expr '+' term
        | expr '-' term
        ;
term:   fact
        | term '*' fact
        | term '/' fact
        | term '%' fact
        ;
fact:   VAR
        | NUM
        | '('expr')'
        ;
type_:   INT
        | DOUBLE
        | FLOAT
        | STRING
        | BOOL 
        ;
GRAMATICA: 'gramaticaextensao';
IMPORT: 'import';
TRUE:   'true';
FALSE:  'false';
FOR:    'for';
WHILE:  'while';
GRT:    '>';
LESS:   '<';
GRTEQ:  '>=';
LESSEQ: '<=';
EQ:     '==';
NEQ:    '!=';
OR :    '||';
IF:     'if';
AND     : '&&';
ELSE:   'else';
PRINT:  'print';
MAIN :  'main';
INT :   'int';
FLOAT : 'float';
DOUBLE : 'double';
STRING : 'string';
VOID : 'void';
BOOL :  'boolean';
READ : 'read';
RET : 'return';
OBR :   '{';
CBR:    '}';
EOL:    ';';
GLOBAL: 'global';
STRVALUE: '"'[a-zA-Z0-9 ]?[ a-zA-Z0-9_.:]*'"';
VAR:    [a-zA-Z][a-zA-Z0-9_]*;
PRINTCONC: (('+'?'"'[a-zA-Z0-9 ]?[ a-zA-Z0-9_:.]*'"')+('+'VAR)?)+;
NUM: [-]?[0-9]+('.'[0-9]+)?;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
COM: '//'(~[\r\n])*'\r'?'\n' -> skip;