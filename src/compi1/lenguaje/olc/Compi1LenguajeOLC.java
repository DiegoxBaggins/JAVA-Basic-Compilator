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
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
            parser sintactico;
            sintactico = new parser(new lexico(new StringReader(entradaTeclado)));
            sintactico.parse();
        } catch (Exception e) {
        }
    }
    
}
