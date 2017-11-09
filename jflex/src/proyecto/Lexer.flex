package proyecto;
import static proyecto.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
PR=[PI""euler""Fi""StepByStep""blong""here""MsgWarning""main""private""public""import""if""then""else""try""except""while""for""do""case""Switch""true""false""]
OBJETO=[asm""arm""leg""shoulder""lights()""vehicle""weapon]
EVENTO=[event""left""right""listener""up""down""jump""walk""alfred""mrj""climb""carry]
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

"PI" {lexeme=yytext(); return PR; }
"euler" {lexeme=yytext(); return PR; }
"Fi" {lexeme=yytext(); return PR; }
"StepByStep" {lexeme=yytext(); return PR; }
"blong" {lexeme=yytext(); return PR; }
"here" {lexeme=yytext(); return PR; }
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
"""" {return DIVISION;}
"&" {return ASPERSON;}
"!" {return NOT;}
"+=" {return SUMAM;}
"-=" {return RESTAM;}
"*=" {return MULTIPLICACIONM;}
"""=" {return DIVISIONM;}
"!=" {return DIFERENTE;}
"&&" {return AND;}
"^" {return POW;}
"||" {return OR;}
"PR" {return PR;}
"EVENTO" {return EVENTO;}
"OBJETO" {return OBJETO;}
"\u0022" {return COMILLAD;}
"\u0027" {return COMILLAS;}
"\u0022"({L}|{D}|{WHITE})*"\u0022" {lexeme=yytext(); return TEXTO;}
("-"|{WHITE}){D}+ {lexeme=yytext(); return INT;}
("-"|{WHITE}){D}*("."){D}* {lexeme=yytext(); return FLOAT;} 

"<"({L}|{D}|{WHITE})*">" {lexeme=yytext(); return HTML; }
"""*"({L}|{D}|{WHITE})*"*""" {lexeme=yytext(); return COMENTARIO; }
. {lexeme=yytext(); return ERROR;}

