package com.company;

public class Main {

    public static void main(String[] args) {
        int cant = 5;
        int total;
        Pilas pila = new Pilas(cant);
        Pilas pilaAux = new Pilas(cant);

        pila.addPila(3);
        pila.addPila(4);
        pila.addPila(7);
        pila.addPila(2);

        //Muestra el ultimo elemento
        System.out.println(pila.viewPila());
        total = pila.sumar(pila.viewPila());
        System.out.println(total);

    }
}
