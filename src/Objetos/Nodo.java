/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author dalej
 */
public class Nodo {
    public Nodo hizq;
    public Nodo hder;
    public String valor;
    public int id;
    public int hoja;
    public String anulable;
    public String primero;
    public String ultimo;
    public String siguiente;
    
    public Nodo(Nodo izq, Nodo der, String valor, int id, int hoja){
        this.hizq = izq;
        this.hder = der;
        this.valor = valor;
        this.id = id;
        this.hoja = hoja;
        this.anulable = "N";
        this.primero = valor;
        this.ultimo = valor;
        this.siguiente = "";
        setAnulabilidad();
        setPrimeraPos();
        setUltimaPos();
    }
    
    public String getCodigoArbol(){
        String codigo = "";
        String valor1 = ("|".equals(valor))?"\\|":valor;
        codigo = "nodo" + id + "[shape=record label=\""+ primero +" |{ "+ anulable +" | " + valor1 + "| id:" + hoja + "} | " + ultimo + "\"]\n";
        if(hizq != null){
            codigo += hizq.getCodigoArbol()+"nodo"+id+"->nodo"+hizq.id+";\n";
        }
        if(hder != null){
            codigo += hder.getCodigoArbol()+"nodo"+id+"->nodo"+hder.id+";\n";
        }
        return codigo;
    }
    
    public void setAnulabilidad(){
        if (hoja ==0){
            if(".".equals(valor)){
                if("A".equals(hizq.anulable) && "A".equals(hder.anulable)){
                    anulable = "A";
                }else{
                    anulable = "N";
                }
            }
            if("|".equals(valor)){
                if("A".equals(hizq.anulable) || "A".equals(hder.anulable)){
                    anulable = "A";
                }else{
                    anulable = "N";
                }
            }
            if("*".equals(valor)){
                anulable = "A";
            }
            if("+".equals(valor)){
                if("A".equals(hizq.anulable)){
                    anulable = "A";
                }else{
                    anulable = "N";
                }
            }
            if("?".equals(valor)){
                anulable = "A";
            }
        }
        else{
            anulable = "N";
        }
    }
    
    public void setPrimeraPos(){
        if (hoja ==0){
            if(".".equals(valor)){
                if("A".equals(hizq.anulable)){
                    primero = hizq.primero + "," + hder.primero;
                }else{
                    primero = hizq.primero;
                }
            }
            if("|".equals(valor)){
                primero = hizq.primero + "," + hder.primero;
            }
            if("*".equals(valor) || "+".equals(valor) || "?".equals(valor)){
                 primero = hizq.primero;
            }
        }
        else{
            primero = String.valueOf(hoja);
        }
    }
    
    public void setUltimaPos(){
        if (hoja ==0){
            if(".".equals(valor)){
                if("A".equals(hder.anulable)){
                    ultimo = hizq.ultimo + "," + hder.ultimo;
                }else{
                    ultimo = hder.ultimo;
                }
            }
            if("|".equals(valor)){
                ultimo = hizq.ultimo + "," + hder.ultimo;
            }
            if("*".equals(valor) || "+".equals(valor) || "?".equals(valor)){
                 ultimo = hizq.ultimo;
            }
        }
        else{
            ultimo = String.valueOf(hoja);
        }
    }
    
    public void setSiguientePos(String[][] siguientes){
        if (hoja ==0){
            if(".".equals(valor)){
                String[] arreglo = hizq.ultimo.split(",");
                int fila = 0;
                for (String arreglo1 : arreglo) {
                    fila = Integer.parseInt(arreglo1);
                    siguientes[fila-1][2] += hder.primero + ",";
                }
            }
            if("+".equals(valor)){
                String[] arreglo = hizq.ultimo.split(",");
                int fila = 0;
                for (String arreglo1 : arreglo) {
                    fila = Integer.parseInt(arreglo1);
                    siguientes[fila-1][2] += hizq.primero + ",";
                }
            }
            if("*".equals(valor)){
                String[] arreglo = hizq.ultimo.split(",");
                int fila = 0;
                for (String arreglo1 : arreglo) {
                    fila = Integer.parseInt(arreglo1);
                    siguientes[fila-1][2] += hizq.primero + ",";
                }
            }
        }else{
            siguientes[hoja-1][1] = valor;
        }
        if(hizq != null){
            hizq.setSiguientePos(siguientes);
        }
        if(hder != null){
            hder.setSiguientePos(siguientes);
        }
    }
    
    public String[] getCodigoAFN(){
        String codigo = "";
        String [] codigos = new String[3];
        codigos[0] = ""; codigos[1] = ""; codigos[2] = "";
        if (hoja != 0){
        String valor1 = ("|".equals(valor))?"\\|":valor;
        codigo = "nodo" + id + "a [shape=circle label=\""+ id + "a\"]\n";
        codigo += "nodo" + id + "b [shape=circle label=\""+ id + "b\"]\n";
        codigo += "nodo" + id + "a -> " + "nodo" + id + "b[label=\""+ valor + "\"]\n";
        codigos[0]= codigo;
        codigos[1]="nodo" + id + "a";
        codigos[2]="nodo" + id + "b";
        }else{
            if(valor.equals(".")){
                String [] codigo1 = new String[3];
                String [] codigo2 = new String[3];
                codigo1[0] = ""; codigo1[1] = ""; codigo1[2] = "";
                codigo2[0] = ""; codigo2[1] = ""; codigo2[2] = "";
                codigo1 = hizq.getCodigoAFN();
                codigo2 = hder.getCodigoAFN();
                codigo = codigo1[0];
                codigo += codigo2[0];
                codigo += codigo1[2] + " -> " + codigo2[1] + "[label=\"ε\"]\n";
                codigos[0] += codigo;
                codigos[1] = codigo1[1];
                codigos[2] = codigo2[2];
            }
            if(valor.equals("|")){
                String [] codigo1 = new String[3];
                String [] codigo2 = new String[3];
                codigo1[0] = ""; codigo1[1] = ""; codigo1[2] = "";
                codigo2[0] = ""; codigo2[1] = ""; codigo2[2] = "";
                codigo1 = hizq.getCodigoAFN();
                codigo2 = hder.getCodigoAFN();
                codigo = codigo1[0];
                codigo += codigo2[0];
                codigo += "nodo" + id + "a [shape=circle label=\""+ id + "a\"]\n";
                codigo += "nodo" + id + "b [shape=circle label=\""+ id + "b\"]\n";
                codigo += "nodo" + id + "a" + " -> " + codigo1[1] + "[label=\"ε\"]\n";
                codigo += "nodo" + id + "a" + " -> " + codigo2[1] + "[label=\"ε\"]\n";
                codigo += codigo1[2] + "->" + "nodo" + id + "b" + "[label=\"ε\"]\n";
                codigo += codigo2[2] + "->" + "nodo" + id + "b" + "[label=\"ε\"]\n";
                codigos[0] += codigo;
                codigos[1] = "nodo" + id + "a";
                codigos[2] = "nodo" + id + "b";
            }
            if(valor.equals("+")){
                String [] codigo1 = new String[3];
                codigo1[0] = ""; codigo1[1] = ""; codigo1[2] = "";
                codigo1 = hizq.getCodigoAFN();
                codigo = codigo1[0];
                codigo += "nodo" + id + "a [shape=circle label=\""+ id + "a\"]\n";
                codigo += "nodo" + id + "b [shape=circle label=\""+ id + "b\"]\n";
                codigo += "nodo" + id + "a" + " -> " + codigo1[1] + "[label=\"ε\"]\n";
                codigo += codigo1[2] + "->" + "nodo" + id + "b" + "[label=\"ε\"]\n";
                codigo += codigo1[2] + "->" + codigo1[1] + "[label=\"ε\"]\n";
                codigos[0] += codigo;
                codigos[1] = "nodo" + id + "a";
                codigos[2] = "nodo" + id + "b";
            }
            if(valor.equals("*")){
                String [] codigo1 = new String[3];
                codigo1[0] = ""; codigo1[1] = ""; codigo1[2] = "";
                codigo1 = hizq.getCodigoAFN();
                codigo = codigo1[0];
                codigo += "nodo" + id + "a [shape=circle label=\""+ id + "a\"]\n";
                codigo += "nodo" + id + "b [shape=circle label=\""+ id + "b\"]\n";
                codigo += "nodo" + id + "a" + " -> " + codigo1[1] + "[label=\"ε\"]\n";
                codigo += codigo1[2] + "->" + "nodo" + id + "b" + "[label=\"ε\"]\n";
                codigo += codigo1[2] + "->" + codigo1[1] + "[label=\"ε\"]\n";
                codigo += "nodo" + id + "a ->" + "nodo" + id + "b [label=\"ε\"]\n";
                codigos[0] += codigo;
                codigos[1] = "nodo" + id + "a";
                codigos[2] = "nodo" + id + "b";
            }
            if(valor.equals("?")){
                String [] codigo1 = new String[3];
                codigo1[0] = ""; codigo1[1] = ""; codigo1[2] = "";
                codigo1 = hizq.getCodigoAFN();
                codigo = codigo1[0];
                codigo += "nodo" + id + "a [shape=circle label=\""+ id + "a\"]\n";
                codigo += "nodo" + id + "b [shape=circle label=\""+ id + "b\"]\n";
                codigo += "nodo" + id + "a" + " -> " + codigo1[1] + "[label=\"ε\"]\n";
                codigo += codigo1[2] + "->" + "nodo" + id + "b" + "[label=\"ε\"]\n";
                codigo += "nodo" + id + "a ->" + "nodo" + id + "b [label=\"ε\"]\n";
                codigos[0] += codigo;
                codigos[1] = "nodo" + id + "a";
                codigos[2] = "nodo" + id + "b";
            }
        }        
        return codigos;
    }
}
