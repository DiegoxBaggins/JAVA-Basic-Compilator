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
public class Expresion {
    public Nodo raiz;
    public String nombre;
    public int ultcontador;
    public int ulthoja;
    
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
}
