grammar BrainFuck;

main : com EOF # begin;

com :   RB com LB com   # label
    |   PRINT com       # print
    |   IN com          # input
    |   DEC com         # dec
    |   INC com         # inc
    |   LMOV com        # lmov
    |   RMOV com        # rmov
    |                   # end
    ;

RB : '[' ;
LB : ']' ;
PRINT : '.' ;
IN : ',' ;
INC : '+' ;
DEC : '-' ;
LMOV : '<' ;
RMOV : '>' ;

WS   : [ \t\n\r]+ -> skip ;
