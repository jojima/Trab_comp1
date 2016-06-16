grammar Lua;


@members {
   public static String grupo="558303 - 558273";
}


@header{
   package t1;
}


VARNAME : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*  ;         

COMMENT : '--' ~('\r' | '\n')* '\r'? '\n' {skip();}; 

REALNUM : ('0'..'9')+ ('.' ('0'..'9')+)? ;

BLANK : ( ' ' |'\r' | '\n' | '\t') {skip();} ;

STRING : '"' (~('\\' | '"'))* '"' | '\''~( '\'' | '\\')* '\'' ;

FIELDSEP : ',' | ';' ;

/* REGRAS DE PRODUCAO */

programa : block ;

block : chunk ; 

chunk : (stat (';')?)* (laststat (';')?)? ;

stat :  varlist '=' explist
     | functioncall 
     | 'do' block 'end' 
     | 'while' exp 'do' block 'end'
     | 'repeat' block 'until' exp 
     | 'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end'
     | 'for' VARNAME  '=' exp ',' exp (',' exp)? 'do' block 'end'
     | 'for' namelist 'in' explist 'do' block 'end' 
     | 'function' funcname funcbody 
     | 'local' 'function' VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.FUNCAO); } funcbody 
     | 'local' namelist ('=' explist)? ;

laststat : 'return' (explist)? 
         | 'break' 
         ;

funcname : VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.FUNCAO); } ('.' VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.FUNCAO); })* (':' VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.FUNCAO); })? 
         ;

varlist : var (',' var)* ;

var :  VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); } 
    | prefixexp '[' exp ']' | prefixexp '.' VARNAME 
    ; 

namelist : VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); } (',' VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); })* 
         ; 

explist : (exp ',')* exp 
        ; 

exp : 'nil' 
    | 'false' 
    | 'true' 
    | REALNUM 
    | STRING 
    | '...' 
    | function   
    | prefixexp 
    | tableconstructor 
    | unop exp 
    | 'nil' expa 
    | 'false' expa 
    | 'true' expa  
    | REALNUM expa 
    | STRING expa 
    | '...' expa 
    | function expa
    | prefixexp expa 
    | tableconstructor expa 
    | unop exp expa
    ; 

expa:  binop exp 
    | binop exp expa
    ; 

prefixexp : VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); }
          | '(' exp ')' 
          | VARNAME  prefixexpa 
          |  '(' exp ')' prefixexpa 
          ;

prefixexpa: '[' exp ']' 
          | '.' VARNAME  
          | args 
          | ':' VARNAME args  
          | '[' exp ']' prefixexpa 
          | '.' VARNAME  prefixexpa 
          | args prefixexpa 
          | ':' VARNAME args  prefixexpa 
          ;

functioncall :  prefixexp args 
             | prefixexp ':' VARNAME args
             ;

args :  '(' (explist)? ')' 
     | tableconstructor 
     | STRING 
     ;

function : 'function' funcbody 
         ;

funcbody : '(' (parlist)? ')' block 'end' 
         ;

parlist : namelist (',' '...')? 
        | '...' 
        ;

tableconstructor : '{' (fieldlist)? '}' 
                 ;

fieldlist : field (FIELDSEP field)* (FIELDSEP)? 
          ;

field : '[' exp ']' '=' exp 
      | VARNAME '=' exp 
      | exp 
      ;

binop : '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' | '<=' | '>' | '>=' | '==' | '~=' | 'and' | 'or' ;

unop : '#' | '-' | 'not' ;
 
