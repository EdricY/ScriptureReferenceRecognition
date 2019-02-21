grammar Expr;   // note: must be same as filename (Expr.g4)

prog: stat+ ;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr     : multExpr (('+' | '-') multExpr)* ;
multExpr : atom ('*' atom)* ;
atom: INT
    | ID
    | '[' expr ']'
    ;

ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;
NEWLINE : '\r'? '\n' ;
WS      : [ \t]+ -> skip ;  // tells ANTLR to ignore these