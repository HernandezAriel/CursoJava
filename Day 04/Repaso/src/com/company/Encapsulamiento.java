package com.company;

public class Encapsulamiento {
    private int tipo;

    public void setTipo(int t){
        tipo = t;
    }

    public int getTipo(){
        return tipo;
    }
}

public class Acceso {

    public static void main(String[] args) {
        Encapsulamiento sc = new Encapsulamiento();
        sc.setTipo(3);
        sc.getTipo();

    }
}
