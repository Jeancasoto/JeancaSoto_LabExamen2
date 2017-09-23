/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_labexamen2;

/**
 *
 * @author jeansoto
 */
public class Cancion {
   String album;
    String nombre;
    String autor;
    int duracion;
    String genero;
    
             private static final long SerialVersionUID = 000L;;

    public Cancion(String album, String nombre, String autor, int duracion, String genero) {
        this.album = album;
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

//    @Override
//    public String toString() {
//        return "Nombre:" + nombre ;
//    }
//    
//    @Override
//    public String toString() {
//        return "album:" + album +"\n"+ "nombre:" + nombre +"\n"+ "autor:" + autor + "\n"+ "duracion:" + duracion + "\n" +"genero:" + genero ;
//    }
    
}
