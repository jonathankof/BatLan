package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"Fi"{return CONSTANTE;}
"e"{return CONSTANTE;}
"PI"{return CONSTANTE;}
"=" {return ASSIGNACION;}
"=="{return COMPARACION;}
"+" {return SUMA;}
"*" {return MULTIPLICACION;}
"-" {return RESTA;}
"/" {return DIVISION;}
({L}|{D})* {lexeme=yytext(); return TEXTO;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}