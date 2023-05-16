/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author jorge
 */
public class Paises {
    private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + '}';
    }
    
    public static Comparator<Paises> compararPais = new Comparator<Paises>(){
       @Override
       public int compare(Paises p1, Paises p2){
           return p1.getNombre().compareTo(p2.getNombre());
       }  
    };
}
