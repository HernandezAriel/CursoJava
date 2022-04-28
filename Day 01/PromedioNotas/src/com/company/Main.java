package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float qualification1, qualification2, qualification3, average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese calificacion 1: ");
        qualification1 = sc.nextInt();
        System.out.println("Ingrese calificacion 2 : ");
        qualification2 = sc.nextInt();
        System.out.println("Ingrese calificacion 3 : ");
        qualification3 = sc.nextInt();
        sc.close();

        average = (qualification1 + qualification2 + qualification3) / 3;
        System.out.println("Su promedio es de: " + average);

        if(average < 10) System.out.println("Reprobado");
        else if(average >= 10 && average < 15) System.out.println("Aprobado");
        else if(average >= 15) System.out.println("Eximido");
    }
}
