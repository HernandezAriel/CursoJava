package models;

public class Cancion {

    private String nombre, album;
    private double duracion;

    public Cancion(String nombre, String album, double duracion){
        this.nombre = nombre;
        this.album = album;
        this.duracion = duracion;
    }

    public String getNombre(){
        return this.nombre;
    }


}
