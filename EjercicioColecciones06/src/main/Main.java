/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import servicios.Servicios;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios ps = new Servicios();
        HashMap<String, Double> productos = new HashMap();
        boolean salir = true;
        int opcion;
        do {
            System.out.println("---------------------");
            System.out.println("TIENDA VIRTUAL");
            System.out.println("MENÚ PRINCIPAL:");

            System.out.println("1: Ingrese Productos y Precio");
            System.out.println("2: Modificar Precios");
            System.out.println("3: Eliminar Productos");
            System.out.println("4: Mostrar lista de Productos");
            System.out.println("0: SALIR");

            System.out.println("---------------------");

            System.out.println("Ingrese la opción deseada: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ps.ingresarProductos(productos);
                    break;
                case 2:
                    ps.modificarPrecio(productos);
                    break;
                case 3:
                    ps.eliminarProducto(productos);
                    break;
                case 4:
                    ps.mostrarProductos(productos);
                    break;
                case 0:
                    salir = false;
                    System.out.println("Usted seleccionó SALIR");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida!!!");
            }
        } while (salir);

    }
}
