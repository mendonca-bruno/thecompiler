grammar gram;

prog:   (line EOL)+EOF
        | func prog
        ;
line:   atr
        ;
func:   type VAR '(' ((type VAR)+';'?)+ ')' OBR (line EOL)+ CBR
        ;
atr:    type VAR '=' expr
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
        ;

MAIN :  'main';
INT :   'int';
OBR :   '{';
CBR:    '}';
EOL:    ';';
GLOBAL: 'global';
VAR:    [a-zA-Z][a-zA-Z0-9_]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;