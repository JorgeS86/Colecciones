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
public class Pelicula {
    /*Un cine necesita implementar un sistema en el que se puedan cargar 
    peliculas. Para esto, tendremos una clase Pelicula con el título, 
    director y duración de la película (en horas).*/

private String titulo;
private String director;
private Double duración;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duración) {
        this.titulo = titulo;
        this.director = director;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuración() {
        return duración;
    }

    public void setDuración(Double duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duraci\u00f3n=" + duración + '}';
    }

public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getDuración().compareTo(p2.getDuración());
    }
};
  
public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
};

public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
       return p1.getDirector().compareTo(p2.director);
    }
};

}
