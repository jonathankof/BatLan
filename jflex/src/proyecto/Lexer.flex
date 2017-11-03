package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
PR=[PI/e/Fi/StepByStep]
WHITE=[ \t\r\n]
VARIABLE=[bint/bfloat]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
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
"+" {return SUMA;}
"*" {return MULTIPLICACION;}
"-" {return RESTA;}
"/" {return DIVISION;}
"\u0022" {return COMILLAD;}
"\u0027" {return COMILLAS;}
"\u0022"({L}|{D}|{WHITE})*"\u0022" {lexeme=yytext(); return TEXTO;}
{D}+ {lexeme=yytext(); return INT;}

(""){WHITE}+{L}({L}|{D})* {lexeme=yytext(); return NOMVAR;}
. {lexeme=yytext(); return ERROR;}