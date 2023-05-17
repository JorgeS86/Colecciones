/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Servicios {

    /*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarProductos(HashMap<String, Double> productos) {
        boolean salir = true;

        do {
            System.out.println("Ingresar producto: ");
            String producto = leer.next();
            System.out.println("Ingrese precio: ");
            double precio = leer.nextDouble();

            productos.put(producto, precio);

            System.out.println("Desea ingresar otro producto (S/N)?: ");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }

        } while (salir);
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        //System.out.println(productos);
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " // Precio: " + entry.getValue());
        }
    }

    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("Ingrese producto a modificar Precio: ");
        String prodModif = leer.next();
        boolean conf = false;

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            if (prodModif.equalsIgnoreCase(entry.getKey())) {
                System.out.println("El precio actual es: " + entry.getValue());
                System.out.println("Ingrese el precio nuevo: ");
                entry.setValue(leer.nextDouble());
                conf = true;
            }
        }
        if (conf == false) {
            System.out.println("El producto ingresado no se encuentra en la lista");
        }
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese producto a Eliminar: ");
        String prodEliminar = leer.next();
        boolean conf = false;
        
         for (Map.Entry<String, Double> entry : productos.entrySet()) {
            if (prodEliminar.equalsIgnoreCase(entry.getKey())) {
                productos.remove(prodEliminar);
                conf = true;
                break;
            }
        }
        if (conf == false) {
            System.out.println("El producto ingresado no se encuentra en la lista");
        }
    }
}
