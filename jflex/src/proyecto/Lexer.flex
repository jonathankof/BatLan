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
"\u0022"({L}|{D}|{" "})*"\u0022" {lexeme=yytext(); return TEXTO;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
({L}|{D})* {return ERROR;}
. {lexeme=yytext(); return ERROR;}