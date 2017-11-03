package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
PR=[PI/euler/Fi/StepByStep/blong/here/MsgWarning/main/private/public/import/if/then/else/try/except/while/for/do/
case/Switch/true/false/]
OBJETO=[asm/arm/leg/shoulder/lights()/vehicle/weapon]
EVENTO=[event/left/right/listener/up/down/jump/walk/alfred/mrj/climb/carry]
WHITE=[ \t\r\n]
ERR=[Error/ SystemError/]
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
"bint[]" {return BINTA;}
"@" {return DIRECTIVAS;}
"%" {return MODULO;}
">" {return ANGLED;}
"<" {return ANGLEI;}
"." {return PUNTO;}
"," {return COMA;}
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
"ERR" {return ERR;}
"log2()" {return LOGDOS;}
"lgo10()" {return LOGDIEZ;}
"ln2()" {return LNDOS;}
"ln10()" {return LNDIEZ;}
"sqrt()" {return RAIZ;}
"PR" {return PR;}
"EVENTO" {return EVENTO;}
"OBJETO" {return OBJETO;}
"\u0022" {return COMILLAD;}
"\u0027" {return COMILLAS;}
"\u0022"({L}|{D}|{WHITE})*"\u0022" {lexeme=yytext(); return TEXTO;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
(("-"{D}|{D})("."){D}*) {lexeme=yytext(); return FLOAT;} 
("bint"|"bfloat"|"bbyte")
. {lexeme=yytext(); return ERROR;}