package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1, number2, number3, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        number1 = sc.nextInt();
        System.out.println("Ingrese numero 2 : ");
        number2 = sc.nextInt();
        System.out.println("Ingrese numero 3 : ");
        number3 = sc.nextInt();
        sc.close();

        max = number1;

        if(number1 == number2 && number1 == number2 && number2 == number3) System.out.println("Los numeros son iguales");
        if(max < number2 ) max = number2;
        if(max < number3) max = number3;

        System.out.println("El numero mayor es: " + max);
    }
}
