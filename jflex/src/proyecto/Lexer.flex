package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
PR=[PI/e/Fi/StepByStep]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
<<<<<<< HEAD
"Fi"{return CONSTANTE;}
"e"{return CONSTANTE;}
"PI"{return CONSTANTE;}
"=" {return ASSIGNACION;}
"=="{return COMPARACION;}
=======
"bint" {return BINT;}
"bdouble" {return BDOUBLE;}
"bfloat" {return BFLOAT;}
"bstring" {return BSTRING;}
"bchar" {return BCHAR;}
"bfloat" {return BFLOAT;}
"bshort" {return BSHORT;}
"bbyte" {return BBYTE;}
"(" {return PARENTESISI;}
")" {return PARENTESISD;}
"{" {return INICIOB;}
"}" {return FINALB;}
"=" {return ASIGNACION;}
"==" {return COMPARACION;}
>>>>>>> Cupido
"+" {return SUMA;}
"*" {return MULTIPLICACION;}
"-" {return RESTA;}
"/" {return DIVISION;}
<<<<<<< HEAD
({L}|{D})* {lexeme=yytext(); return TEXTO;}
=======
"\u0022" {return COMILLAD;}
"\u0027" {return COMILLAS;}
"\u0022"({L}|{D}|{WHITE})*"\u0022" {lexeme=yytext(); return TEXTO;}
>>>>>>> Cupido
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
(("-"{D}|{D})("."){D}*) {lexeme=yytext(); return FLOAT;} 
("bint"|"bfloat"|"bbyte")
. {lexeme=yytext(); return ERROR;}