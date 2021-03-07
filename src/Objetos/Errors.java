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
public class Errors {
    public String tipo;
    public String valor;
    public int fila;
    public int columna;
    
    public Errors(String tipo, String valor, int fila, int columna){
        this.tipo = tipo;
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
    }
    
    
}
