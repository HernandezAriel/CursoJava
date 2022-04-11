package com.company;

public class Perro implements Caminable {
    private String raza;
    private int cantPatas;

    public Perro(String raza, int cantPatas) {
        this.raza = raza;
        this.cantPatas = cantPatas;
    }

    public String caminar(){
        return "El perro esta caminando.";
    }

    public String correr(){
        return "El perro esta corriendo.";
    }

    public String detenerse(){
        return "El perro se detuvo.";
    }
}
