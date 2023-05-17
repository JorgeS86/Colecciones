/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PaisesService {

    /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)*/
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public HashSet<Paises> ingresarPaises() {
        HashSet<Paises> paisesAux = new HashSet();
        boolean salir = true;

        do {
            Paises pais = new Paises();
            System.out.println("Ingrese el nombre del País a agregar: ");
            pais.setNombre(leer.next());
            paisesAux.add(pais);

            System.out.println("Desea ingresar otro país (S/N)?: ");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);

        return paisesAux;
    }

    public void mostrarPaises(HashSet<Paises> paises) {
        System.out.println(paises);
    }

    /*Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.*/
    public void ordenarPaises(HashSet<Paises> paises) {
        ArrayList<Paises> paisesLista = new ArrayList(paises);
        paisesLista.sort(Paises.compararPais);
        //Collections.reverse(paisesLista); orden descendente
        System.out.println(paisesLista);
    }

    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
    public void elimninarPais(HashSet<Paises> paises) {
        Iterator<Paises> it = paises.iterator();
        Paises paisEliminar = new Paises();
        System.out.println("Ingrese país a eliminar: ");
        paisEliminar.setNombre(leer.next());

        boolean encontrado = false;
        while (it.hasNext()) {
            Paises paisAux = it.next();
            if (paisAux.getNombre().equals(paisEliminar.getNombre())) {
                it.remove();
                encontrado = true;
                break;
            }
        }
        System.out.println("Se encontró el país en la lista? " + encontrado);
        PaisesService PS = new PaisesService();
        PS.ordenarPaises(paises);
    }

}
