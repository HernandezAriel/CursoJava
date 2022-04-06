package com.company;

public class Main {

    public static void main(String[] args) {
	    int cant = 5;
        Pilas pila = new Pilas(cant);
        Pilas pilaAux = new Pilas(cant);

        pila.addPila("Test1");
        pila.addPila("Test2");
        pila.addPila("Test3");
        pila.addPila("Test4");

        System.out.println(pila.viewStrings());
        System.out.println("Cantidad de objetos: "+pila.cantObjs());
        if(pila.empty()) System.out.println("La pila esta vacia");
        else System.out.println("La pila NO esta vacia");
    }
}
