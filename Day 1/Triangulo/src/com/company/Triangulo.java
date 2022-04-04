package com.company;

public class Triangulo {

    private float l1, l2, l3;

    public Triangulo(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public String tipoTriangulo() {

        String tipo;
        if (l1 == l2 && l2 == l3 && l3 == l1) tipo = "Equilatero";
        else if (l1 == l2 || l1 == l3 || l2 == l3) tipo = "Isosceles";
        else tipo = "Escaleno";
        return tipo;
    }
}

