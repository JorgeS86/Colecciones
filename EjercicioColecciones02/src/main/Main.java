/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean salir = false;
        do {
            System.out.println("Ingrese la raza de perro a agregar: ");
            String raza = leer.next().toLowerCase();
            razaPerros.add(raza);
            System.out.println("Desea agregar otro perro S/N?");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (salir == false);
        System.out.println("Las Razas ingresadas fueron: " + razaPerros);

        System.out.println("Ingrese raza de perro a eliminar: ");
        String perroEliminar = leer.next();
        boolean noEncontrado = false;
        Iterator it = razaPerros.iterator();

        while (it.hasNext()) {
            if (it.next().equals(perroEliminar)) {
                it.remove();
                //break; el break en este punto elimina el primero y sale del bucle.
                noEncontrado = true;
            }
        }
        System.out.println("La raza buscada fue encontrada?: "+noEncontrado);
        System.out.println("Las Razas ingresadas fueron: " + razaPerros);
        Collections.sort(razaPerros);
        System.out.println("Las Razas ordenadas son: " + razaPerros);
    }
}
