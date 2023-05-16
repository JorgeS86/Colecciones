/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Paises;
import java.util.HashSet;
import java.util.Scanner;
import servicios.PaisesService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisesService ps = new PaisesService();
        HashSet<Paises> paises = ps.ingresarPaises();

        ps.mostrarPaises(paises);
        
        ps.ordenarPaises(paises);
        
        ps.elimninarPais(paises);
    }
}
