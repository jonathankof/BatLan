package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]

WHITE=[\ \r\t\r\n]
ESPACIO=" "
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
{ESPACIO} {/*Ignore*/}
/*Palabras reservadas*/

"bint" {lexeme=yytext(); return PR;}
"bdouble" {lexeme=yytext(); return PR;}
"bfloat" {lexeme=yytext(); return PR;}
"bstring" {lexeme=yytext(); return PR;}
"bchar" {lexeme=yytext(); return PR;}
"bfloat" {lexeme=yytext(); return PR;}
"bshort" {lexeme=yytext(); return PR;}
"bbyte" {lexeme=yytext(); return PR;}
"bint[]" {lexeme=yytext(); return PR;}

"blong" {lexeme=yytext(); return PR; }

"MsgWarning" {lexeme=yytext(); return PR; }
"main" {lexeme=yytext(); return PR; }
"private" {lexeme=yytext(); return PR; }
"public" {lexeme=yytext(); return PR; }
"import" {lexeme=yytext(); return PR; }
"if" {lexeme=yytext(); return PR; }
"then" {lexeme=yytext(); return PR; }
"else" {lexeme=yytext(); return PR; }
"try" {lexeme=yytext(); return PR; }
"except" {lexeme=yytext(); return PR; }
"while" {lexeme=yytext(); return PR; }
"for" {lexeme=yytext(); return PR; }
"do" {lexeme=yytext(); return PR; }
"case" {lexeme=yytext(); return PR; }
"Switch" {lexeme=yytext(); return PR; }
"true" {lexeme=yytext(); return PR; }
"false" {lexeme=yytext(); return PR; }

/*Constantes*/
"pi" {lexeme=yytext(); return CONS; }
"euler" {lexeme=yytext(); return CONS; }
"fi" {lexeme=yytext(); return CONS; }
"stepbystep" {lexeme=yytext(); return CONS; }

/*FUNCION*/
"sqrt" {lexeme=yytext(); return FUNCION; }
"pow" {lexeme=yytext(); return FUNCION; }
"location" {lexeme=yytext(); return FUNCION; }
"list" {lexeme=yytext(); return FUNCION; }
"Threads" {lexeme=yytext(); return FUNCION; }
"defensive" {lexeme=yytext(); return FUNCION; }
"start" {lexeme=yytext(); return FUNCION; }
"here" {lexeme=yytext(); return FUNCION; }
"Error" {lexeme=yytext(); return VAR;}
"SystemError" {lexeme=yytext(); return VAR;}

/*Evento*/
"event" {lexeme=yytext(); return EVENTO;}
"left" {lexeme=yytext(); return EVENTO;}
"right" {lexeme=yytext(); return EVENTO;}
"listener" {lexeme=yytext(); return EVENTO;}
"up" {lexeme=yytext(); return EVENTO;}
"down" {lexeme=yytext(); return EVENTO;}
"jump" {lexeme=yytext(); return EVENTO;}
"walk" {lexeme=yytext(); return EVENTO;}
"alfred" {lexeme=yytext(); return EVENTO;}
"mrj" {lexeme=yytext(); return EVENTO;}
"climb" {lexeme=yytext(); return EVENTO;}
"carry" {lexeme=yytext(); return EVENTO;}
"under_attack" {lexeme=yytext(); return EVENTO;}

/*OBJETOS*/
"asm"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}
"arm"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}
"leg"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}
"shoulder"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}
"lights"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}
"vehicle"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}
"weapon"{WHITE}*("\u0028")(.)("\u0029") {lexeme=yytext(); return OBJETO;}

/*Librerias*/
"situations" {lexeme=yytext(); return LIB;}
"threading" {lexeme=yytext(); return LIB;}
"defense" {lexeme=yytext(); return LIB;}



"@" {return DIRECTIVAS;}
"%" {return MODULO;}
">" {lexeme=yytext(); return ANGLED;}
"<" {lexeme=yytext(); return ANGLEI;}
"^" {lexeme=yytext(); return EXPO;}
"log2" {lexeme=yytext(); return LOG2;}
"log10" {lexeme=yytext(); return LOG10;}
"ln2" {lexeme=yytext(); return LN2;}
"ln10" {lexeme=yytext(); return LN10;}
"." {return PUNTO;}
"," {return COMA;}
"(" {return PARENTESISI;}
")" {return PARENTESISD;}
"{" {return INICIOB;}
"}" {return FINALB;}
"=" {return ASIGNACION;}
":" {return DOSP;}
"==" {return COMPARACION;}
"+" {return SUMA;}
"*" {return MULTIPLICACION;}
"-" {return RESTA;}
"""" {return DIVISION;}
"&" {return ASPERSON;}
"!" {return NOT;}
"+=" {return SUMAM;}
"-=" {return RESTAM;}
"*=" {return MULTIPLICACIONM;}
"/=" {return DIVISIONM;}
"!=" {return DIFERENTE;}
"&&" {return AND;}
"^" {return POW;}
"||" {return OR;}
"PR" {return PR;}
"\u0022" {return COMILLAD;}
"\u0027" {return COMILLAS;}

/*EBNF*/
"\u0022"(.)*"\u0022" {lexeme=yytext(); return TEXTO;}
("-")?{D}+ {lexeme=yytext(); return INT;}
("-")?{D}*("."){D}* {lexeme=yytext(); return FLOAT;} 
({L}+)("."|":")({L}+) {lexeme=yytext(); return OPERA;} 
"<"({L}|{D}|{WHITE})*">" {lexeme=yytext(); return HTML; }
"""*"({L}|{D}|{WHITE})*"*""" {lexeme=yytext(); return COMENTARIO; }
("_"|{L})({L}|{D}|"_")+ {lexeme=yytext(); return VAR;}
({L}|"_")({L}|"_"|{D})+{WHITE}*("\u0028")(.)?("\u0029") {lexeme=yytext(); return FUNCION;}
("_"|{L})({L}|{D})* {lexeme=yytext(); return VAR;} 
/*Error*/
({D})({L}|{D}|"_")+ {lexeme=yytext(); return ERROR;}
. {lexeme=yytext(); return ERROR;}