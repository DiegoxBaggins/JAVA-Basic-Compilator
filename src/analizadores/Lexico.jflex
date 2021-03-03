package analizadores;
import java_cup.runtime.Symbol;

%%

%class lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%init{
    yyline = 1;
    yychar = 1;
%init}

BLANCOS=[ \r\t\n]+
PALABRA = ([0-9]|[a-z]|[A-Z])+
ID = ([a-z]|[A-Z])('_'|[0-9]|[A-Z]|[a-z])+
COMENTARIO = "<!""!"*([^!>]|[^!]">"|"!"[^>])*"!"*"!>"
COMLINEA = ("//".*\r\n)|("//".*\n)|("//".*\r)
CASO1 = [0-9]"~"[0-9]
CASO2 = [a-z]"~"[a-z]
CASO3 = [A-Z]"~"[A-Z]
CASO4 =  [^\"\n~]"~"[^\"\n~]
CADENA =  [\"]([^\"\n]|(\\\"))*[\"]
%%

"CONJ" {return new Symbol(sym.conj, yyline, yychar, yytext());}
"%" {return new Symbol(sym.separador, yyline, yychar, yytext());}
"{" {return new Symbol(sym.llave1, yyline, yychar, yytext());}
"}" {return new Symbol(sym.llave2, yyline, yychar, yytext());}
":" {return new Symbol(sym.dospuntos, yyline, yychar, yytext());}
";" {return new Symbol(sym.puntocoma, yyline, yychar, yytext());}
"." {return new Symbol(sym.punto, yyline, yychar, yytext());}
"," {return new Symbol(sym.coma, yyline, yychar, yytext());}
"-" {return new Symbol(sym.guion, yyline, yychar, yytext());}
">" {return new Symbol(sym.mayorq, yyline, yychar, yytext());}
"*" {return new Symbol(sym.asterisco, yyline, yychar, yytext());}
"|" {return new Symbol(sym.barra, yyline, yychar, yytext());}
"\"" {return new Symbol(sym.comillas, yyline, yychar, yytext());}
"\'" {return new Symbol(sym.comilla, yyline, yychar, yytext());}
"\\" {return new Symbol(sym.invertida, yyline, yychar, yytext());}
"+" {return new Symbol(sym.mas, yyline, yychar, yytext());}
"?" {return new Symbol(sym.interrogacion, yyline, yychar, yytext());}

\n {yychar = 1;}

{BLANCOS} {} 
{COMENTARIO} {}
{COMLINEA} {}
{ID} {return new Symbol(sym.id,yyline,yychar, yytext());}
{PALABRA} {return new Symbol(sym.palabra,yyline,yychar, yytext());}
{CASO1} {return new Symbol(sym.casonum,yyline,yychar, yytext());} 
{CASO2} {return new Symbol(sym.casomin,yyline,yychar, yytext());} 
{CASO3} {return new Symbol(sym.casomayus,yyline,yychar, yytext());}   
{CADENA} {return new Symbol(sym.cadena,yyline,yychar, yytext());}
{CASO4} {return new Symbol(sym.casosim,yyline,yychar, yytext());} 

. {
    System.out.println("Este es un error lexico: "+yytext()+
    ", en la linea: "+yyline+", en la columna: "+yychar);
}   
     
