/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> crearListaAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del Alumno: ");
            alumno.setNombre(leer.next());
            System.out.println("Ingrese las notas del Alumno: ");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno S/N: ");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion=false;
            }
        } while (confirmacion);
        return alumnos;
    }
    
    public Double buscarAlumno(ArrayList<Alumno> alumnos){
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final: ");
        String alumnosABuscar = leer.next();
        
        Iterator<Alumno> it = alumnos.iterator();
        while((it.hasNext())){
            Alumno alumnoAuxiliar = it.next();
            if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnosABuscar)) {
                return promedioNotas(alumnoAuxiliar);
            }
        }
        System.out.println("No se encontró el alumno");
        return null;
    }
    
    public double promedioNotas(Alumno alumno){
        double sumaNotas = 0;
        for(Integer nota : alumno.getNotas()){
            sumaNotas += nota;
        }
            
    return sumaNotas / alumno.getNotas().size();
    }
}
