grammar Lua;

//Desenvolvedores:
//Fábio Kenji Jojima                 558273
//Guilherme Matheus de Almeida Ramos 558303

//OBS: O código foi testado e alterado diversas vezes a fim de obter nota máxima
//porém no foi possível encontrar o problema uma vez que os testes quando executados
//individualmente apresentam a resposta esperada, mas quando executados em conjunto
//não geram uma nota maior que 7.857142...

@members {
   public static String grupo="558303 - 558273";
}

//para adicionar essa linha na primeira linha de todos os arquivos gerados pelo Antlrworks2
@header{
   package t1; 
}

//LEXEMAS

//Nome de variável: começa com letra, e é seguido de nada, letra maiuscula/minuscula ou números em qualquer ordem:
VARNAME : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*  ;  
           
//comentário: 
COMMENT : '--' ~('\r' | '\n')* '\r'? '\n' {skip();}; 

//número real, começando por número de 0 a 9, podendo ter ponto e, caso haja ponto, haverá pelo menos um número de 0 a 9:
REALNUM : ('0'..'9')+ ('.' ('0'..'9')+)? ;

//espaço em branco, se for vazio, \r\n (pula linha) ou \t (tab), é ignorado
BLANK : ( ' ' |'\r' | '\n' | '\t') {skip();} ;

//string, se começar com aspas duplas, pode conter qualquer simbolo menos \ e aspas duplas, e se começar com
//aspas simples, pode conter qualquer simbolo menos \ e aspas simples.
STRING : '"' (~('\\' | '"'))* '"' | '\''~( '\'' | '\\')* '\'' ;

//separador de campo, virgula ou ponto e virgula
FIELDSEP : ',' | ';' ;

/* REGRAS DE PRODUCAO */

programa : block ; //regra de inicio do programa

block : chunk ; //fragmento de código

chunk : (stat (';')?)* (laststat (';')?)? ; //se houver quallquer comando completo ou ultimo comando completo, pode ou não
                                            //ter ;

//todos as instruções elementares se encontram aqui:
//atribuição, chamada de função, do end, while do end, repeat until, if then elsif then else end, for do end, declaração
//de função, declaração de função local e variavel local.
stat :  varlist '=' explist
     | functioncall 
     | 'do' block 'end' 
     | 'while' exp 'do' block 'end'
     | 'repeat' block 'until' exp 
     | 'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end'
     | 'for' VARNAME  '=' exp ',' exp (',' exp)? 'do' block 'end'
     | 'for' namelist 'in' explist 'do' block 'end' 
     | 'function' funcname { TabelaDeSimbolos.adicionarSimbolo($funcname.text,Tipo.FUNCAO); } funcbody 
     | 'local' 'function' VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.FUNCAO); } funcbody 
     | 'local' namelist ('=' explist)? ;

//se for ultimo comando (de laço ou função) precisa ter return ou break e se for return, tem lista de parametros
laststat : 'return' (explist)? 
         | 'break' 
         ;
//nome de funcao ou conjunto de funcoes em hierarquia (separadas por .)
funcname : VARNAME ('.' VARNAME )* (':' VARNAME )? 
         ;

//lista de variaveis para parametros
varlist : var (',' var)* ;

//variavel ou vetor com nome VARNAME
var :  VARNAME { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); } 
    | prefixexp '[' exp ']' | prefixexp '.' VARNAME 
    ; 

//lista de nomes separados por ,
namelist : VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); } (',' VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); })* 
         ; 

//lista de expressoes separadas por ,
explist : (exp ',')* exp 
        ; 

//expressões e operações elementares realizadas em funções ou blocos de código
//exp é composta basicamente de todas as palavras reservadas não utilizadas 
//em stat
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

//expa criada para remoção da recursividade à esquerda de exp, para operações binárias apenas
expa:  binop exp 
    | binop exp expa
    ; 

//prefixexp utilizada para quando existe mais de uma expressão encadeada em algum fragmento de código
prefixexp : VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); }
          | '(' exp ')' 
          | VARNAME  prefixexpa 
          |  '(' exp ')' prefixexpa 
          ;

//prefixexpa criada para remoção da recursividade à esquerda de prefixexp e functioncall
prefixexpa: '[' exp ']' 
          | '.' VARNAME  
          | args 
          | ':' VARNAME args  
          | '[' exp ']' prefixexpa 
          | '.' VARNAME  prefixexpa 
          | args prefixexpa 
          | ':' VARNAME args  prefixexpa 
          ;

//chamada de função com argumentos e variavel de retorno
functioncall :  prefixexp args 
             | prefixexp ':' VARNAME args
             ;

//argumentos de função ou tabela
args :  '(' (explist)? ')' 
     | tableconstructor 
     | STRING 
     ;

//modelo de função com palavra reservada function e corpo da função
function : 'function' funcbody 
         ;

//corpo da função composto de parametros e bloco de código seguido de end
funcbody : '(' (parlist)? ')' block 'end' 
         ;

//lista de parametros separados por , ou com ...
parlist : namelist (',' '...')? 
        | '...' 
        ;

//construtor de tabela para o caso de inserção de multiplos campos na inicialização de uma variável
tableconstructor : '{' (fieldlist)? '}' 
                 ;

//separador de campos
fieldlist : field (FIELDSEP field)* (FIELDSEP)? 
          ;

//campo separado pelo separador de campos num vetor
field : '[' exp ']' '=' exp 
      | VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); } '=' exp 
      | exp 
      ;

//operações binárias que podem ser realizadas
binop : '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' | '<=' | '>' | '>=' | '==' | '~=' | 'and' | 'or' ;

//operações unárias
unop : '#' | '-' | 'not' ;
 
