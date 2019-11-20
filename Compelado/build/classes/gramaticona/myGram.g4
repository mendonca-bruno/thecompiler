/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar myGram;

@header {
    package gramaticona;
}

prog:   (line EOL)*EOF
        | func prog
        ;
line:   atr
        | init_
        ;
func:   type_ VAR '(' ((type_ VAR)+';'?)+ ')' OBR (line EOL)+ CBR
        ;
init_: type_ VAR
        ;
atr:    type_ VAR '=' expr
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
        ;

MAIN :  'main';
INT :   'int';
OBR :   '{';
CBR:    '}';
EOL:    ';';
GLOBAL: 'global';
VAR:    [a-zA-Z][a-zA-Z0-9_]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;
COMMENT: '/' .? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
