grammar Scripture;   // note: must be same as filename (Expr.g4)

prog: scripture+ EOF;

scripture
    : book reference translation NEWLINE
    | NEWLINE;

book: ordinal NAME;

reference
    : addr
    | addr ';' reference
    | // epsilon
    ;

addr
    : chapter
    | chapter ':' verselist
    | addrverse '-' '-'? addrverse
    ;

addrverse
    : DIGIT ':' DIGIT
    ;

chapter: DIGIT;

verselist
    : verse
    | verse ',' verselist
    ;

verse
    : DIGIT
    | DIGIT '-' '-'? DIGIT
    ;

translation
    : '(' NAME ')'
    | // epsilon
    ;

ordinal
    : DIGIT
    | // epsilon
    ;

NAME: [a-zA-Z]+ ;
DIGIT: [0-9]+ ;
NEWLINE : '\r'? '\n';
WS: [ \t]+ -> skip ;