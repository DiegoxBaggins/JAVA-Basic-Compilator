/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author dalej
 */
public class Expresion {
    public Nodo raiz;
    public String nombre;
    public int ultcontador;
    public int ulthoja;
    public String siguientes[][];
    
    public Expresion(Nodo raiz, String nombre, int contador, int hoja){
        this.raiz = raiz;
        this.nombre = nombre;
        this.ultcontador = contador;
        this.ulthoja = hoja;
    }
    
    public void AgregarRaiz(){
        Nodo ultima = new Nodo(null, null, "#", ultcontador, ulthoja);
        ultima.setAnulabilidad();
        ultima.setPrimeraPos();
        ultima.setUltimaPos();
        ultcontador +=1;
        Nodo rais = new Nodo(raiz, ultima, ".", ultcontador, 0);
        rais.setAnulabilidad();
        rais.setPrimeraPos();
        rais.setUltimaPos();
        this.raiz = rais;
    }
    
    public void graficarArbol(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./" + nombre + ".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=box]");
            pw.println("concentrate=true");
            pw.println(raiz.getCodigoArbol());
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
        try {
            //direcciÃ³n doonde se ecnuentra el compilador de graphviz
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
            //direcciÃ³n del archivo dot
            String fileInputPath = "./" + nombre + ".dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./" + nombre + ".png";
            //tipo de conversÃ³n
            String tParam = "-Tpng";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }
    
    public void ConstruirSiguientes(){
        siguientes = new String[ulthoja][3];
        System.out.println(ulthoja);
        for (int i = 0; i <ulthoja;i ++){
            siguientes[i][0] = String.valueOf(i + 1);
            siguientes[i][2] = "";
        }
        raiz.setSiguientePos(siguientes);
        for (int i = 0; i <ulthoja;i++){
            if (!"".equals(siguientes[i][2])){
                int largo = siguientes[i][2].length()-1;
                String ayuda =  siguientes[i][2].substring(0,largo);
                siguientes[i][2] = ayuda;
            }
        }
        String codigo = "";
        codigo = "nodotabla" + "[shape=record label=\"";
        for (int i = 0; i< 2; i++){
            codigo += "{";
            for (int j = 0; j< ulthoja-1; j ++){
                codigo += siguientes[j][i]+"|"; 
            }
            codigo += siguientes[ulthoja-1][i] + "}|";
        }
        codigo += "{";
        for (int j = 0; j< ulthoja-1; j ++){
                codigo += siguientes[j][2] + "|"; 
            }
        codigo += siguientes[ulthoja-1][2] + "}\"]";
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./" + nombre + "Siguientes.dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=UD");
            pw.println("node[shape=box]");
            pw.println("concentrate=true");
            pw.println(codigo);
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
        try {
            //direcciÃ³n doonde se ecnuentra el compilador de graphviz
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
            //direcciÃ³n del archivo dot
            String fileInputPath = "./" + nombre + "Siguientes.dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./" + nombre + "Siguientes.png";
            //tipo de conversÃ³n
            String tParam = "-Tpng";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }  
    }
   
}
