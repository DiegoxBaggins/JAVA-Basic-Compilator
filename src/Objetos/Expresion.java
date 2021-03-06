/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

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
    public ArrayList<Estado> estados;
    public ArrayList<String> alfabeto;
    public ArrayList<String[]> transiciones;
    
    public Expresion(Nodo raiz, String nombre, int contador, int hoja){
        this.raiz = raiz;
        this.nombre = nombre;
        this.ultcontador = contador;
        this.ulthoja = hoja;
        this.estados = new ArrayList<Estado>();
        this.alfabeto = new ArrayList<String>();
        this.transiciones = new ArrayList<String[]>();
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
            fichero = new FileWriter("./ARBOLES_201903969/" + nombre + ".dot");
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
            String fileInputPath = "./ARBOLES_201903969/" + nombre + ".dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./ARBOLES_201903969/" + nombre + ".jpg";
            //tipo de conversÃ³n
            String tParam = "-Tjpg";
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
        
        codigo += "{Hoja|";
        for (int j = 0; j< ulthoja-1; j ++){
            codigo += siguientes[j][0]+"|"; 
        }
        codigo += siguientes[ulthoja-1][0] + "}|";
        
        codigo += "{Valor|";
        for (int j = 0; j< ulthoja-1; j ++){
            codigo += siguientes[j][1]+"|"; 
        }
        codigo += siguientes[ulthoja-1][1] + "}|";
        
        codigo += "{Siguiente Posicion|";
        for (int j = 0; j< ulthoja-1; j ++){
                codigo += siguientes[j][2] + "|"; 
            }
        codigo += siguientes[ulthoja-1][2] + "}\"]";
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./SIGUIENTES_201903969/" + nombre + ".dot");
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
            String fileInputPath = "./SIGUIENTES_201903969/" + nombre + ".dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./SIGUIENTES_201903969/" + nombre + ".jpg";
            //tipo de conversÃ³n
            String tParam = "-Tjpg";
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
   
    public void ConstruirTransi(){
        crearAlfabeto();
        int largoMatriz = alfabeto.size() + 2;
        String[] contenedor0 = new String[largoMatriz];
        llenarMatriz(contenedor0);
        Estado estado0 = new Estado("S0", raiz.primero);
        estados.add(estado0);
        contenedor0[0] = "S0";
        contenedor0[1] = raiz.primero;
        String[] arreglo = contenedor0[1].split(",");
        String paso, valor, estado;
        int fila, alfabeto;
        transiciones.add(contenedor0);
        for (String arreglo1 : arreglo) {
            fila = Integer.parseInt(arreglo1)-1;
            paso = siguientes[fila][2];
            valor = siguientes[fila][1];
            estado = buscarEstado(paso);
            if (estado != null){
                alfabeto = buscarAlfabeto(valor);
                contenedor0[alfabeto] = estado;
            }else{
                Estado estadoNuevo = new Estado("S" + String.valueOf(estados.size()), paso);
                estados.add(estadoNuevo);
                alfabeto = buscarAlfabeto(valor);
                contenedor0[alfabeto] = estadoNuevo.nombre;
                String[] contenedorNuevo;
                contenedorNuevo = new String[largoMatriz];
                llenarMatriz(contenedorNuevo);
                contenedorNuevo[0] = estadoNuevo.nombre;
                contenedorNuevo[1] = estadoNuevo.hojas;
                transiciones.add(contenedorNuevo);
            }
        }
        
        transiciones.set(0,contenedor0);
        for (int i = 1; i <  transiciones.size(); i++) {
            contenedor0 = transiciones.get(i);
            arreglo = contenedor0[1].split(",");
            for (String arreglo1 : arreglo) {
                if (Integer.parseInt(arreglo1) != ulthoja){                   
                    fila = Integer.parseInt(arreglo1)-1;
                    paso = siguientes[fila][2];
                    valor = siguientes[fila][1];
                    estado = buscarEstado(paso);
                    if (estado != null){
                        alfabeto = buscarAlfabeto(valor);
                        contenedor0[alfabeto] = estado;
                    }else{
                        Estado estadoNuevo = new Estado("S" + String.valueOf(estados.size()), paso);
                        estados.add(estadoNuevo);
                        alfabeto = buscarAlfabeto(valor);
                        contenedor0[alfabeto] = estadoNuevo.nombre;
                        String[] contenedorNuevo;
                        contenedorNuevo = new String[largoMatriz];
                        llenarMatriz(contenedorNuevo);
                        contenedorNuevo[0] = estadoNuevo.nombre;
                        contenedorNuevo[1] = estadoNuevo.hojas;
                        transiciones.add(contenedorNuevo);
                    }
                }
            }
            //transiciones.set(i,contenedor0);
        } 
    }
    
    public void GraficarTransi(){
        String codigo = "";
        codigo = "nodotabla" + "[shape=record label=\"{Estado|";
        for (int j = 0; j< estados.size()-1; j ++){
            codigo += estados.get(j).nombre+"|"; 
        }
        codigo += estados.get(estados.size()-1).nombre + "}|";
        codigo += "{Hojas|";
        
        for (int j = 0; j< estados.size()-1; j ++){
            codigo += transiciones.get(j)[1]+"|"; 
        }
        codigo += transiciones.get(estados.size()-1)[1] + "}|";
        
        for (int i = 2; i < alfabeto.size()+1; i++){ 
            codigo += "{";
            codigo += alfabeto.get(i-2) + "|";
            for (int j = 0; j< estados.size()-1; j ++){
                   codigo += transiciones.get(j)[i] + "|";
                }
            codigo += transiciones.get(estados.size()-1)[i] + "}|";
        }
        
        codigo += "{" + alfabeto.get(alfabeto.size()-1) + "|";
        for (int j = 0; j< estados.size()-1; j ++){
                   codigo += transiciones.get(j)[alfabeto.size()+1] + "|";
                }
        codigo += transiciones.get(estados.size()-1)[alfabeto.size()+1] + "}\"]";
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./TRANSICIONES_201903969/" + nombre + ".dot");
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
            String fileInputPath = "./TRANSICIONES_201903969/" + nombre + ".dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./TRANSICIONES_201903969/" + nombre + ".jpg";
            //tipo de conversÃ³n
            String tParam = "-Tjpg";
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
    
    public void llenarMatriz(String[] matriz){
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = "--";
        }
    }
    
    public String buscarEstado(String valores){
        for (Estado estado : estados) {
            if(estado.hojas.equals(valores)){
                return estado.nombre; 
            }
        }
        return null;
    }
    
    public int buscarAlfabeto(String valores){
        for (String estado : alfabeto) {
            if(estado.equals(valores)){
                return alfabeto.indexOf(estado) + 2; 
            }
        }
        return 0;
    }
    
    public void crearAlfabeto(){
        String valor;
        int aut;
        for(int i = 0; i < ulthoja-1; i ++){
            aut = 0;
            valor = siguientes[i][1];
            if (alfabeto.isEmpty()){
                alfabeto.add(valor);
            }else{
                for (String alfabeto1 : alfabeto) {
                    if (valor.equals(alfabeto1)){
                        aut = 1;
                        break;
                    }
                }
                if (aut == 0){
                    alfabeto.add(valor);
                }
            }
        }
        /*
        String[] result = new String[2 + alfabeto.size()];
        result[0] = "Estado";
        result[1] = "Hojas";
        for(int i = 0; i < alfabeto.size(); i++){
            result[i+2] = alfabeto.get(i);
        }
        transiciones.add(result);
        */
    }
    
    public void crearAFD(){
        setAceptacion();
        String codigo = "nodoInicial [shape=none label=\"\"]\n";
        for (Estado estado : estados) {
            codigo += estado.nombre + "[shape=";
            if (estado.aceptacion.equals("A")){
                codigo += "doublecircle label=\"" + estado.nombre + "\"]\n";
            }else{
                codigo += "circle label=\"" + estado.nombre + "\"]\n";
            }
        }
        codigo += "nodoInicial->S0[label=\"\"]\n";
        String estado, repetido;
        String[] contenedor;
        for (int i = 0; i < estados.size(); i++){
            contenedor = transiciones.get(i);
            estado = contenedor[0];
            repetido = "";
            for (int j = 0; j < alfabeto.size(); j++){
                
                if (!contenedor[j+2].equals("--")){
                    if(estado.equals(contenedor[j+2])){
                        repetido += alfabeto.get(j) + " \\n";
                    }else{
                        codigo += estado + "->" + contenedor[j+2] + "[label=\"" + alfabeto.get(j) + "\"]\n";
                    }
                }
            }
            if(!repetido.equals("")){
                codigo += estado + "->" + estado + "[label=\"" + repetido + "\"]\n";
            }
        }
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./AFD_201903969/" + nombre + ".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=LR");
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
            String fileInputPath = "./AFD_201903969/" + nombre + ".dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./AFD_201903969/" + nombre + ".jpg";
            //tipo de conversÃ³n
            String tParam = "-Tjpg";
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
    
    public void setAceptacion(){
        String ultimo;
        String[] contenedor, arreglo;
        ultimo = String.valueOf(raiz.hder.hoja);
        for (int i = 0; i < estados.size(); i++){
            contenedor = transiciones.get(i);
            arreglo = contenedor[1].split(",");
            for (String arreglo1 : arreglo){
                if(arreglo1.equals(ultimo)){
                    Estado estado = estados.get(i);
                    estado.aceptacion = "A";
                    estados.set(i,estado);
                }
            } 
        }
        
    }
    
     public void graficarAFN(){
        String [] codigos = new String[3];
        codigos = raiz.hizq.getCodigoAFN();
        String codigo = "nodoInicial [shape=none label=\"\"]\n";
        codigo += "nodoInicial->" + codigos[1] + " [label=\"\"]\n";
        codigo += codigos[0];
        codigo += "nodoFinal [shape=doublecircle label=\"Final\"]\n";
        codigo += codigos[2] + "->nodoFinal [label=\"ε\"]\n";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("./AFND_201903969/" + nombre + ".dot");
            pw = new PrintWriter(fichero);
            pw.println("digraph G{");
            pw.println("rankdir=LR");
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
            String fileInputPath = "./AFND_201903969/" + nombre + ".dot";
            //direcciÃ³n donde se creara la magen
            String fileOutputPath = "./AFND_201903969/" + nombre + ".jpg";
            //tipo de conversÃ³n
            String tParam = "-Tjpg";
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
