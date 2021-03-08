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
public class Estado {
    public String nombre;
    public String hojas;
    public String aceptacion;
    
    public Estado(String nombre, String hojas){
        this.nombre = nombre;
        this.hojas = hojas;
        this.aceptacion = "N";
    }
    
    public Estado(String nombre, String hojas, String aceptacion){
        this.nombre = nombre;
        this.hojas = hojas;
        this.aceptacion = aceptacion;
    }
}
