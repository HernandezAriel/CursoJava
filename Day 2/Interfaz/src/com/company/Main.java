package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 19);
        Perro perro1 = new Perro("Golden", 4);

        System.out.println(persona1.caminar());
        System.out.println(perro1.caminar());
        System.out.println(persona1.detenerse());
        System.out.println(perro1.correr());
    }
}
