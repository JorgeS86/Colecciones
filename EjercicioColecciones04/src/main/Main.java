/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();
        ArrayList<Pelicula> pelis = ps.crearPelicula();

        ps.mostrarTodas(pelis);
        
        ps.mostrarMayorUnaH(pelis);
        
        ps.ordenarMayorDuracion(pelis);
        
        ps.ordenarMenorDuracion(pelis);
        
        ps.ordenarTitulo(pelis);
        
        ps.ordenarDirector(pelis);
    }
}
