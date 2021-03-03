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
    
    public Expresion(Nodo raiz, String nombre){
        this.raiz = raiz;
        this.nombre = nombre;
    }
    
    public void AgregarRaiz(int hoja, int contador){
        Nodo ultima = new Nodo(null, null, "#", contador, hoja);
        Nodo rais = new Nodo(null, null, ".", contador, 0);
        rais.hizq = raiz;
        rais.hder = ultima;
        ultima.setAnulabilidad();
        ultima.setPrimeraPos();
        ultima.setUltimaPos();
        rais.setAnulabilidad();
        rais.setPrimeraPos();
        rais.setUltimaPos();
        raiz = rais;
    }
}
