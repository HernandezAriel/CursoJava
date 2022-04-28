package com.company;

public class Parametrico {
    public static void main(String[] args) {
        Suma sm = new Suma();
        double result;
        sm.sumar(1,4);
        sm.sumar(3);
    }
}

public class Suma {
    void sumar(int a, int b){
        System.out.println("Suma: "+(a+b));
    }
    void sumar(double a){
        System.out.println("Suma: "+a);

    }
}

