/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1.lenguaje.olc;

import Objetos.*;
import java.io.*;

/**
 *
 * @author dalej
 */
public class Compi1LenguajeOLC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PantallaPrincipal interfaz1 = new PantallaPrincipal();
        interfaz1.setVisible(true);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
    }
    
    public static void graficarArbol(Nodo act, String nombre){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./" + nombre + ".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=box]");
            pw.println("concentrate=true");
            pw.println(act.getCodigoInterno());
            pw.println("}");
        } catch (Exception e) {
            System.out.println("error, no se realizo el archivo");
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }  
}
