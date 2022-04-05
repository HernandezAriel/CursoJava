package com.company;

public class Main {

    public static void main(String[] args) {

        Cajero c1 = new Cajero("Carlos", 20);
        Gerente g1 = new Gerente("Damian", 40);

        System.out.println(c1.cobrar());
        System.out.println(g1.recibirQueja());
        System.out.println(c1.cerrarCaja());

    }
}
