grammar gram;

prog:   (line EOL)+EOF
        | func prog
        ;
line:   atr
        ;
func:   type VAR '(' ((type VAR)';'?)+ ')' OBR (line EOL)+ retr CBR
        | VOID VAR '(' ((type VAR)';'?)+ ')' OBR (line EOL)+ CBR
        ;
retr:   RET VAR EOL
        | RET expr EOL
        ;
atr:    INT VAR '=' expr
        | DOUBLE VAR '=' expr
        | FLOAT VAR '=' expr
        | STRING VAR '=' STRVALUE
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
type:   INT
        | DOUBLE
        | FLOAT
        | STRING
        ;

MAIN :  'main';
INT :   'int';
FLOAT : 'float';
DOUBLE : 'double';
STRING : 'string';
VOID : 'void';
RET : 'return';
OBR :   '{';
CBR:    '}';
EOL:    ';';
GLOBAL: 'global';
STRVALUE: '"'[a-zA-Z0-9][a-zA-Z0-9_]*'"';
VAR:    [a-zA-Z][a-zA-Z0-9_]*;
NUM: [-]?[0-9]+('.'[0-9]+)?;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;