package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
%caseless
%line
L = [a-zA-Z_]
D = [0-9]

WHITE=[\ \r\t\r\n]
ESPACIO=" "
%{
public String lexeme;
public int numero;
%}
%%
{WHITE} {/*Ignore*/}
{ESPACIO} {/*Ignore*/}

/*Palabras reservadas*/

"bint" {numero=yyline; lexeme=yytext(); return PR;}
"bdouble" {numero=yyline; lexeme=yytext(); return PR;}
"bfloat" {numero=yyline; lexeme=yytext(); return PR;}
"bstring" {numero=yyline; lexeme=yytext(); return PR;}
"bchar" {numero=yyline; lexeme=yytext(); return PR;}
"bfloat" {numero=yyline; lexeme=yytext(); return PR;}
"bshort" {numero=yyline; lexeme=yytext(); return PR;}
"bbyte" {numero=yyline; lexeme=yytext(); return PR;}
"blong" {numero=yyline;lexeme=yytext(); return PR; }
"MsgWarning" {numero=yyline; lexeme=yytext(); return PR; }
"main" {numero=yyline; lexeme=yytext(); return PR; }
"private" {numero=yyline; lexeme=yytext(); return PR; }
"public" {numero=yyline; lexeme=yytext(); return PR; }
"import" {numero=yyline; lexeme=yytext(); return PR; }

"if" {numero=yyline; lexeme=yytext(); return PR; }
"then" {numero=yyline; lexeme=yytext(); return PR; }
"else" {numero=yyline; lexeme=yytext(); return PR; }
"try" {numero=yyline; lexeme=yytext(); return PR; }
"except" {lexeme=yytext(); return PR; }
"while" {numero=yyline; lexeme=yytext(); return PR; }
"for" {numero=yyline; lexeme=yytext(); return PR; }
"do" {numero=yyline; lexeme=yytext(); return PR; }
"case" {numero=yyline; lexeme=yytext(); return PR; }
"Switch" {numero=yyline; lexeme=yytext(); return PR; }
"true" {numero=yyline; lexeme=yytext(); return PR; }
"false" {numero=yyline; lexeme=yytext(); return PR; }

/*Constantes*/
"PI" {numero=yyline; lexeme=yytext(); return CONS; }
"euler" {numero=yyline; lexeme=yytext(); return CONS; }
"Fi" {numero=yyline; lexeme=yytext(); return CONS; }
"StepByStep" {numero=yyline; lexeme=yytext(); return CONS; }

/*FUNCION*/
"sqrt" {numero=yyline; lexeme=yytext(); return FUNCION; }
"pow" {numero=yyline; lexeme=yytext(); return FUNCION; }
"location" {numero=yyline; lexeme=yytext(); return FUNCION; }
"list" {numero=yyline; lexeme=yytext(); return FUNCION; }
"Threads" {numero=yyline; lexeme=yytext(); return FUNCION; }
"defensive" {numero=yyline; lexeme=yytext(); return FUNCION; }
"start" {numero=yyline; lexeme=yytext(); return FUNCION; }
"here" {numero=yyline; lexeme=yytext(); return FUNCION; }
"Error" {numero=yyline; lexeme=yytext(); return VAR;}
"SystemError" {numero=yyline; lexeme=yytext(); return VAR;}

/*Evento*/
"event" {numero=yyline; lexeme=yytext(); return EVENTO;}
"left" {numero=yyline; lexeme=yytext(); return EVENTO;}
"right" {numero=yyline; lexeme=yytext(); return EVENTO;}
"listener" {numero=yyline; lexeme=yytext(); return EVENTO;}
"up" {numero=yyline; lexeme=yytext(); return EVENTO;}
"down" {numero=yyline; lexeme=yytext(); return EVENTO;}
"jump" {numero=yyline; lexeme=yytext(); return EVENTO;}
"walk" {numero=yyline; lexeme=yytext(); return EVENTO;}
"alfred" {numero=yyline; lexeme=yytext(); return EVENTO;}
"mrj" {numero=yyline; lexeme=yytext(); return EVENTO;}
"climb" {numero=yyline; lexeme=yytext(); return EVENTO;}
"carry" {numero=yyline; lexeme=yytext(); return EVENTO;}
"under_attack" {numero=yyline; lexeme=yytext(); return EVENTO;}

/*OBJETOS*/
"asm"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
"arm"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
"leg"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
"shoulder"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
"lights"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
"vehicle"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
"weapon"{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return OBJETO;}
("_"|{L})({L}|"_")+{WHITE}*("\u0028")(.)("\u0029") {numero=yyline; lexeme=yytext(); return VAROBJETO;}

/*Librerias*/
"situations" {numero=yyline; lexeme=yytext(); return LIB;}
"threading" {numero=yyline; lexeme=yytext(); return LIB;}
"defense" {numero=yyline; lexeme=yytext(); return LIB;}
"@" {numero=yyline; return DIRECTIVAS;}
"%" {numero=yyline; return MODULO;}
">" {numero=yyline; lexeme=yytext(); return ANGLED;}
"<" {numero=yyline; lexeme=yytext(); return ANGLEI;}
"^" {numero=yyline; lexeme=yytext(); return EXPO;}
"log2" {numero=yyline; lexeme=yytext(); return LOG2;}
"log10" {numero=yyline; lexeme=yytext(); return LOG10;}
"ln2" {numero=yyline; lexeme=yytext(); return LN2;}
"ln10" {numero=yyline; lexeme=yytext(); return LN10;}
"." {numero=yyline; return PUNTO;}
"," {numero=yyline; return COMA;}
"(" {numero=yyline; return PARENTESISI;}
")" {numero=yyline; return PARENTESISD;}
"{" {numero=yyline; return INICIOB;}
"}" {numero=yyline; return FINALB;}
"=" {numero=yyline; lexeme=yytext(); return ASIGNACION;}
":" {numero=yyline; lexeme=yytext(); return ASIGNACION;}
"==" {numero=yyline; return COMPARACION;}
"+" {numero=yyline; numero=yyline; return SUMA;}
"*" {numero=yyline; return MULTIPLICACION;}
"-" {numero=yyline; return RESTA;}
"\u002F" {numero=yyline; return DIVISION;}
"&" {numero=yyline; return ASPERSON;}
"!" {numero=yyline; return NOT;}
"+=" {numero=yyline; return SUMAM;}
"-=" {numero=yyline; return RESTAM;}
"*=" {numero=yyline; return MULTIPLICACIONM;}
"/=" {numero=yyline; return DIVISIONM;}
"!=" {numero=yyline; return DIFERENTE;}
"&&" {numero=yyline; return AND;}
"||" {numero=yyline; return OR;}
"\u0022" {numero=yyline; return COMILLAD;}
"\u0027" {numero=yyline; return COMILLAS;}


/*EBNF*/
"\u0022"(.)*"\u0022" {numero=yyline; lexeme=yytext(); return TEXTO;}
{D}+ {numero=yyline; lexeme=yytext(); return INT;}
{D}*("."){D}{1,5} {numero=yyline; lexeme=yytext(); return FLOAT;} 
{D}*("."){D}+ {numero=yyline; lexeme=yytext(); return DOUBLE;} 
("_"|{L})({L}|{D}|"_")+ ("["{D}*"]") {numero=yyline; lexeme=yytext(); return ARREGLO;} 
("_"|{L})({L}|"_")+(".")("_"|{L})({L}|"_")+ {numero=yyline; lexeme=yytext(); return VAROBJETO;} 
("_"|{L})({L}|"_")+(".")("_"|{L})({L}|"_")+("("({L}|{D}|"_")*")") {numero=yyline; lexeme=yytext(); return METOBJETO;}
"<"({L}|{D}|{WHITE})*">" {numero=yyline; lexeme=yytext(); return HTML; }
("\u002F")("\u002F")(.)* {numero=yyline; lexeme=yytext(); return COMENTARIO; }
("_"|{L})({L}|{D}|"_")+ {numero=yyline; lexeme=yytext(); return VAR;}
({L}|"_")({L}|"_"|{D})+{WHITE}*("\u0028")(.)?("\u0029") {numero=yyline; lexeme=yytext(); return FUNCION;}
("_"|{L})({L}|{D})* {numero=yyline; lexeme=yytext(); return VAR;} 
/*Error*/
(".")({D}+|{L}|".")+ {numero=yyline; lexeme=yytext(); return ERROR;} 
{D}+(".")({D}|{L}|".")+ {numero=yyline; lexeme=yytext(); return ERROR;} 
({D})({L}|{D}|"_")+ {numero=yyline; lexeme=yytext(); return ERROR;}

. {numero=yyline; lexeme=yytext(); return ERROR;}