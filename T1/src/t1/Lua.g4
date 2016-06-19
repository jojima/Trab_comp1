grammar Lua;

//Desenvolvedores:
//F�bio Kenji Jojima                 558273
//Guilherme Matheus de Almeida Ramos 558303

//OBS: O c�digo foi testado e alterado diversas vezes a fim de obter nota m�xima
//por�m no foi poss�vel encontrar o problema uma vez que os testes quando executados
//individualmente apresentam a resposta esperada, mas quando executados em conjunto
//n�o geram uma nota maior que 7.857142...

@members {
   public static String grupo="558303 - 558273";
}

//para adicionar essa linha na primeira linha de todos os arquivos gerados pelo Antlrworks2
@header{
   package t1; 
}

//LEXEMAS

//Nome de vari�vel: come�a com letra, e � seguido de nada, letra maiuscula/minuscula ou n�meros em qualquer ordem:
VARNAME : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*  ;  
           
//coment�rio: 
COMMENT : '--' ~('\r' | '\n')* '\r'? '\n' {skip();}; 

//n�mero real, come�ando por n�mero de 0 a 9, podendo ter ponto e, caso haja ponto, haver� pelo menos um n�mero de 0 a 9:
REALNUM : ('0'..'9')+ ('.' ('0'..'9')+)? ;

//espa�o em branco, se for vazio, \r\n (pula linha) ou \t (tab), � ignorado
BLANK : ( ' ' |'\r' | '\n' | '\t') {skip();} ;

//string, se come�ar com aspas duplas, pode conter qualquer simbolo menos \ e aspas duplas, e se come�ar com
//aspas simples, pode conter qualquer simbolo menos \ e aspas simples.
STRING : '"' (~('\\' | '"'))* '"' | '\''~( '\'' | '\\')* '\'' ;

//separador de campo, virgula ou ponto e virgula
FIELDSEP : ',' | ';' ;

/* REGRAS DE PRODUCAO */

programa : block ; //regra de inicio do programa

block : chunk ; //fragmento de c�digo

chunk : (stat (';')?)* (laststat (';')?)? ; //se houver quallquer comando completo ou ultimo comando completo, pode ou n�o
                                            //ter ;

//todos as instru��es elementares se encontram aqui:
//atribui��o, chamada de fun��o, do end, while do end, repeat until, if then elsif then else end, for do end, declara��o
//de fun��o, declara��o de fun��o local e variavel local.
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

//se for ultimo comando (de la�o ou fun��o) precisa ter return ou break e se for return, tem lista de parametros
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

//express�es e opera��es elementares realizadas em fun��es ou blocos de c�digo
//exp � composta basicamente de todas as palavras reservadas n�o utilizadas 
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

//expa criada para remo��o da recursividade � esquerda de exp, para opera��es bin�rias apenas
expa:  binop exp 
    | binop exp expa
    ; 

//prefixexp utilizada para quando existe mais de uma express�o encadeada em algum fragmento de c�digo
prefixexp : VARNAME  { TabelaDeSimbolos.adicionarSimbolo($VARNAME.text,Tipo.VARIAVEL); }
          | '(' exp ')' 
          | VARNAME  prefixexpa 
          |  '(' exp ')' prefixexpa 
          ;

//prefixexpa criada para remo��o da recursividade � esquerda de prefixexp e functioncall
prefixexpa: '[' exp ']' 
          | '.' VARNAME  
          | args 
          | ':' VARNAME args  
          | '[' exp ']' prefixexpa 
          | '.' VARNAME  prefixexpa 
          | args prefixexpa 
          | ':' VARNAME args  prefixexpa 
          ;

//chamada de fun��o com argumentos e variavel de retorno
functioncall :  prefixexp args 
             | prefixexp ':' VARNAME args
             ;

//argumentos de fun��o ou tabela
args :  '(' (explist)? ')' 
     | tableconstructor 
     | STRING 
     ;

//modelo de fun��o com palavra reservada function e corpo da fun��o
function : 'function' funcbody 
         ;

//corpo da fun��o composto de parametros e bloco de c�digo seguido de end
funcbody : '(' (parlist)? ')' block 'end' 
         ;

//lista de parametros separados por , ou com ...
parlist : namelist (',' '...')? 
        | '...' 
        ;

//construtor de tabela para o caso de inser��o de multiplos campos na inicializa��o de uma vari�vel
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

//opera��es bin�rias que podem ser realizadas
binop : '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' | '<=' | '>' | '>=' | '==' | '~=' | 'and' | 'or' ;

//opera��es un�rias
unop : '#' | '-' | 'not' ;
 
