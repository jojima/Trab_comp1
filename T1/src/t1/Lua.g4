/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



grammar Lua;


@members {
   public static String grupo="<<558303-558273>>";
}

//PADROES LEXICOS
//PODE TER A MAIS OU A MENOS (os nomes precisam ser especificos (?)) 

VAR_NAME : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*  ; 

RESERVED_WD : 'and' | 'end' | 'in' | 'repeat' | 'break' | 'false' | 'local' | 'return' | 'do' | 'for' 
                    | 'nil' | 'then' | 'else' | 'function' | 'not' | 'true' | 'elseif' | 'if' | 'or' | 'until' 
                    | 'while' ; 

RESERVED_SYMBOL : '+' | '-' | '*' | '/' | '^' | '%' | '..' | ',' 
                '<' | '<=' | '>' | '>=' | '==' | '~=' | '.' | ';' ;               

COMMENT : '--' ~('\r' | '\n')* '\r'? '\n' {skip();}; //precisa ver como faz isso

INT_NUM	: ('+'|'-')? ('0'..'9')+ ; 

REAL_NUM : ('+'|'-')? ('0'..'9')+ ('.' ('0'..'9')+)? ;

BLANK : ( ' ' |'\r' | '\n' | '\t') {skip();} ;

STRING : '"' (~('\\' | '"'))* '"' | '\''~( '\'' | '\\')* '\'' ;


//REGRAS DE PRODUCAO
//COMPLETAMENTE NO PADRÃO ANTLR, PORÉM COM AMBIGUIDADES / RECURSIVIDADES INAPROPRIADAS!

programa : chunk ;

chunk : (stat (';')?)* (laststat (';')?)? ;

block : chunk ; 

stat :  varlist '=' explist | 
         functioncall | 
         'do' block 'end' | //stat > block > chunk > stat
         'while' exp 'do' block 'end' | //stat > block > chunk > stat
         'repeat' block 'until' exp | //stat > block > chunk > stat
         'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end' | //stat > block > chunk > stat
         'for' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); }  '=' exp ',' exp (',' exp)? 'do' block 'end' | //stat > block > chunk > stat
         'for' namelist 'in' explist 'do' block 'end' | //stat > block > chunk > stat
         'function' funcname funcbody | 
         'local' 'function' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } funcbody | 
         'local' namelist ('=' explist)? ;

laststat : 'return' (explist)? | 'break' ;

funcname : VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } ('.' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); })* (':' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); })? ;

varlist : var (',' var)* ;

var :  VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } | prefixexp '[' exp ']' | prefixexp '.' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } ; //prefixexp > var

namelist : VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } (',' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); })* ; 

explist : (exp ',')* exp ; 

exp :  'nil' | 'false' | 'true' | REAL_NUM | STRING | '...' | function | VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } | 
         prefixexp | tableconstructor | unop exp //prefixexp > exp
        |'nil' expA| 'false' expA | 'true' expA | REAL_NUM expA | STRING expA | '...' expA | function expA | VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } expA |
             prefixexp expA | tableconstructor expA | unop exp expA; //expA > exp //prefixexp > exp

expA:  binop exp expA | binop exp; //vice versa

prefixexp : 
'(' exp ')' |
VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } | 
'(' exp ')' prefixexpA | 
VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } prefixexpA | 
'(' exp ')' prefixexpB |
VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } prefixexpB | 
'(' exp ')' prefixexpA prefixexpB |
VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } prefixexpA prefixexpB ; 



prefixexpB:
args | 
':' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } args |
args prefixexpA |
':' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } args prefixexpA | 
args prefixexpB | 
':' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } args prefixexpB |
args prefixexpA prefixexpB |
':' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } args prefixexpA prefixexpB ;

prefixexpA : '[' exp ']' | '.' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } | '[' exp ']' prefixexpA | '.' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } prefixexpA ;

functioncall :  prefixexp args | prefixexp ':' VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } args ;

args :  '(' (explist)? ')' | tableconstructor | STRING ;

function : 'function' funcbody ;

funcbody : '(' (parlist)? ')' block 'end' ;

parlist : namelist (',' '...')? | '...' ;

tableconstructor : '{' (fieldlist)? '}' ;

fieldlist : field (fieldsep field)* (fieldsep)? ;

field : '[' exp ']' '=' exp | VAR_NAME { TabelaDeSimbolos.adicionarSimbolo($VAR_NAME.text,Tipo.VARIAVEL); } '=' exp | exp ;

fieldsep : ',' | ';' ;

binop : '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' | '<=' | '>' | '>=' | '==' | '~=' | 'and' | 'or' ;

unop : '#' | '-' | 'not' ;
 
