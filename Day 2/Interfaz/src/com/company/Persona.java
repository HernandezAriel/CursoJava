package com.company;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String caminar(){
        return "La persona esta caminando.";
    }

    public String correr(){
        return "La persona esta corriendo.";
    }

    public String detenerse(){
        return "La persona se detuvo.";
    }
}
