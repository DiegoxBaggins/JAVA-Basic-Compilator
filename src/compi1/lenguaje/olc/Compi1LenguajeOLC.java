/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1.lenguaje.olc;

import analizadores.*;
import java.io.StringReader;
import java.util.Scanner;
/**
 *
 * @author dalej
 */
public class Compi1LenguajeOLC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               try {
            String entrada = "{\n" +
"\n" +
"CONJ: mayus - > A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;\n" +
"CONJ: minus -     > a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;\n" +
"CONJ: letra -  > a~z;\n" +
"CONJ: digito -  > 0~9;\n" +
"CONJ: posibles -   > P, C, O; \n" +
"\n" +
"EXP5  -   > . \' . + | | | | \n {minus} {mayus} {digito} \" \" \';\n" +
"Pl -   >  . {posibles} . ? \"-\"  . {digito} . {digito} . {digito}  . {letra}  . {letra} {letra};\n" +
"%%\n" +
"%%\n" +
"EXP5 : \"\'cadena entre comilla simple\'\";\n" +
"P1 : \"P-385fde\"; // bueno\n" +
"P1 : \"P388fdc\"; // bueno\n" +
"P1 : \"P38df8c\"; // malo\n" +
"P1 : \"P-38df8k\";  // malo\n" +
"P1 : \"K-385ffk\";  // malo\n" +
"}";
            System.out.println();
            parser sintactico;
            sintactico = new parser(new lexico(new StringReader(entrada)));
            sintactico.parse();
        } catch (Exception e) {
        }
    }
    
}
