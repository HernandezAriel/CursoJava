package com.company;

public class Cajero implements Gestionable{
    private String nombre;
    private int edad;

    public Cajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String cerrarCaja(){
        return "El Cajero esta cerrando la caja";
    }

    public String cobrar(){
        return "El Cajero esta cobrando";
    }

    public String recibirQueja(){
        return "El Cajero esta recibiendo una queja";
    }

}
