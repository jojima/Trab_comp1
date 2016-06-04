/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



grammar Lua;


@members {
   public static String grupo="<<Digite os RAs do grupo aqui>>";
}

//PADROES LEXICOS
//PODE TER A MAIS OU A MENOS (os nomes precisam ser especificos (?)) 

NOME_VAR : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*  ;

PAL_RESERVADA : 'and' | 'end' | 'in' | 'repeat' | 'break' | 'false| 'local' | 'return' | 'do' | 'for' 
                    | 'nil' | 'then' | 'else' | 'function' | 'not' | 'true' | 'elseif' | 'if' | 'or' | 'until' ;
                    | 'while' ; 

SIM_RESERVADO : '+' | '-' | '*' | '/' | '^' | '%' | '..' | ',' 
                '<' | '<=' | '>' | '>=' | '==' | '~=' | '.' | ';' ;               

COMMENT : '--' ~(\n)* '\n' ; //precisa ver como faz isso

NUM_INT	: ('+'|'-')? ('0'..'9')+ ; 

NUM_REAL : ('+'|'-')? ('0'..'9')+ ('.' ('0'..'9')+)? ;


//REGRAS DE PRODUCAO
//COMPLETAMENTE NO PADRÃO ANTLR, PORÉM COM AMBIGUIDADES / RECURSIVIDADES INAPROPRIADAS!

programa : chunk ;

chunk : (stat (';')?)* (laststat (';')?) ;

block : chunk ;

stat :  varlist '=' explist | 
         functioncall | 
         'do' block 'end' | 
         'while' exp 'do' block 'end' | 
         'repeat' block 'until' exp | 
         'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end' | 
         'for' NOME_VAR '=' exp ',' exp (',' exp)? 'do' block 'end' | 
         'for' namelist 'in' explist 'do' block 'end' | 
         'function' funcname funcbody | 
         'local' 'function' NOME_VAR funcbody | 
         'local' namelist ('=' explist)? ;

laststat : 'return' (explist)? | break ;

funcname : NOME_VAR ('.' NOME_VAR)* (':' NOME_VAR)? ;

varlist : var (',' var)* ;

var :  NOME_VAR | prefixexp '[' exp ']' | prefixexp '.' NOME_VAR ;

namelist : NOME_VAR (',' NOME_VAR)* ;

explist : (exp ',')* exp ;

exp :  'nil' | 'false' | 'true' | 'Number' | 'String' | '...' | function | 
         prefixexp | tableconstructor | exp binop exp | unop exp ;

prefixexp : var | functioncall | '(' exp ')' ;

functioncall :  prefixexp args | prefixexp ':' NOME_VAR args ;

args :  '(' [explist] ')' | tableconstructor | String ;

function : function funcbody ;

funcbody : '(' [parlist] ')' block end ;

parlist : namelist (',' '...')? | '...' ;

tableconstructor : '{' [fieldlist] '}' ;

fieldlist : field (fieldsep field)* (fieldsep)? ;

field : '[' exp ']' '=' exp | NOME_VAR '=' exp | exp ;

fieldsep : ',' | ';' ;

binop : '+' | '-' | '*' | '/' | '^' | '%' | '..' |  
         '<' | '<=' | '>' | '>=' | '==' | '~=' | 
         'and' | 'or' ;

unop : '-' | not | '#' ;
 
