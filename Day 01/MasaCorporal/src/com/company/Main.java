package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float weight, height, bodyMass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso: ");
        weight = sc.nextFloat();
        System.out.println("Ingrese su altura (en metros) : ");
        height = sc.nextFloat();
        sc.close();

        bodyMass = weight / (height * height); //Formula masa corporal MC = peso / altura^2.
        System.out.println("Su masa corporal es de: " + bodyMass);

        if(bodyMass < 20) System.out.println("Mal estado");
        else if(bodyMass >= 20 && bodyMass < 22) System.out.println("Bajo peso");
        else if(bodyMass >= 22 && bodyMass < 25) System.out.println("Peso normal");
        else if(bodyMass >= 25 && bodyMass < 30) System.out.println("Sobrepeso");
        else if(bodyMass >= 30 && bodyMass < 40) System.out.println("Sobrepeso cronico");
        else if(bodyMass >= 40) System.out.println("Hospitalizado");
    }
}
