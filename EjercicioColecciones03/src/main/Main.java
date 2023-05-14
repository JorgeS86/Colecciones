/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Alumno;
import java.util.ArrayList;
import services.AlumnoService;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        ArrayList<Alumno> alumnos = as.crearListaAlumnos();
        
        System.out.println(alumnos);
        
        System.out.println("El promedio del alumno es " + as.buscarAlumno(alumnos));
    }
}
