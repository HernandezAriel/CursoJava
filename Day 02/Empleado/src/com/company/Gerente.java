package com.company;

public class Gerente {
    private String nombre;
    private int edad;

    public Gerente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String cerrarCaja(){
        return "El gerente esta cerrando la caja";
    }

    public String cobrar(){
        return "El gerente esta cobrando";
    }

    public String recibirQueja(){
        return "El gerente esta recibiendo una queja";
    }


}
