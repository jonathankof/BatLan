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
""
"bint" {return BINT;}
"bdouble" {return BDOUBLE;}
"bfloat" {return BFLOAT;}
"bstring" {return BSTRING;}
"bchar" {return BCHAR;}
"bfloat" {return BFLOAT;}
"bshort" {return BSHORT;}
"bbyte" {return BBYTE;}

"=" {return ASIGNACION;}
"==" {return COMPARACION;}
"+" {return SUMA;}
"*" {return MULTIPLICACION;}
"-" {return RESTA;}
"/" {return DIVISION;}
({L}|{D})* {lexeme=yytext(); return TEXTO;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}