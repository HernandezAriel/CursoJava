package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1, number2, number3, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        number1 = sc.nextInt();
        System.out.println("Ingrese numero 2 : ");
        number2 = sc.nextInt();
        System.out.println("Ingrese numero 3 : ");
        number3 = sc.nextInt();
        sc.close();

        min = number1;

        if(number1 == number2 && number1 == number3 && number2 == number3);
        System.out.println("Los numeros son iguales");
        if(min > number2 ) min = number2;
        if(min > number3) min = number3;

        System.out.println("El numero menor es: " + min);
    }
}
