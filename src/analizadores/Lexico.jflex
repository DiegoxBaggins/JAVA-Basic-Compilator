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

BLANCOS = [ |\n|\r|\t]+
D = [0-9]+
DD = [0-9]+("."[0-9]*)?
Palabra = ([a-z]|[A-Z])*
Cadena = [\"]([^\"\n]|(\\\"))*[\"]
Comentario = "<"[\r|\t|\n]*"!"[^]"!"[\r|\t|\n]*">""\n"
ComLinea = "/""/"([Cadena]|[BLANCOS])*"\n"
Conjunto = "C""O""N""J"
Flecha = "-"[ |\r|\t|\n]*">"
Separacion = "%%" "\n" "%%"

%%

"{" {return new Symbol(sym.llave1, yyline, yychar, yytext());}
"}" {return new Symbol(sym.llave2, yyline, yychar, yytext());}
"[" {return new Symbol(sym.corchete1, yyline, yychar, yytext());}
"]" {return new Symbol(sym.corchete2, yyline, yychar, yytext());}
":" {return new Symbol(sym.dospuntos, yyline, yychar, yytext());}
"~" {return new Symbol(sym.virgula, yyline, yychar, yytext());}
";" {return new Symbol(sym.puntocoma, yyline, yychar, yytext());}
"." {return new Symbol(sym.punto, yyline, yychar, yytext());}
"," {return new Symbol(sym.coma, yyline, yychar, yytext());}
"*" {return new Symbol(sym.asterisco, yyline, yychar, yytext());}
"|" {return new Symbol(sym.barra, yyline, yychar, yytext());}
"\"" {return new Symbol(sym.comillas, yyline, yychar, yytext());}
"\'" {return new Symbol(sym.comilla, yyline, yychar, yytext());}
"_" {return new Symbol(sym.gbajo, yyline, yychar, yytext());}
"-" {return new Symbol(sym.guion, yyline, yychar, yytext());}
"+" {return new Symbol(sym.mas, yyline, yychar, yytext());}
"?" {return new Symbol(sym.interrogacion, yyline, yychar, yytext());}
"%" {return new Symbol(sym.separador, yyline, yychar, yytext());}
"\n" {return new Symbol(sym.salto, yyline, yychar, yytext());}

\n {yychar = 1;}

{BLANCOS} {} 
{D} {return new Symbol(sym.entero,yyline,yychar, yytext());} 
{DD} {return new Symbol(sym.decimal,yyline,yychar, yytext());} 
{Palabra} {return new Symbol(sym.palabra,yyline,yychar, yytext());}
{Cadena} {return new Symbol(sym.cadena,yyline,yychar, yytext());}
{Comentario} {return new Symbol(sym.comentario,yyline,yychar, yytext());}
{ComLinea} {return new Symbol(sym.comlinea,yyline,yychar, yytext());}
{Conjunto} {return new Symbol(sym.conj,yyline,yychar, yytext());}
{Flecha} {return new Symbol(sym.flecha,yyline,yychar, yytext());}     
{Separacion} {return new Symbol(sym.separacion,yyline,yychar, yytext());} 
     
. {
    System.out.println("Este es un error lexico: "+yytext()+
    ", en la linea: "+yyline+", en la columna: "+yychar);
}   
     
