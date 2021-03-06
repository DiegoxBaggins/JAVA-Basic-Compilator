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
        CrearCarpetas("./ARBOLES_201903969");
        CrearCarpetas("./AFND_201903969");
        CrearCarpetas("./SIGUIENTES_201903969");
        CrearCarpetas("./TRANSICIONES_201903969");
        CrearCarpetas("./AFD_201903969");
        CrearCarpetas("./ERRORES_201903969");
        CrearCarpetas("./SALIDAS_201903969");
        PantallaPrincipal interfaz1 = new PantallaPrincipal();
        interfaz1.setVisible(true);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
    }
    
    public static void CrearCarpetas(String nombre){
        File f = null;
        boolean bool = false;
        try {  
           f = new File(nombre);
           bool = f.mkdirs();
           //System.out.print("Creado: "+bool);
        } catch(Exception e) {
           e.printStackTrace();
        }
    }
}
