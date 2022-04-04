package com.company;
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number, aux, inverse = 0, cifra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        number = sc.nextInt();
        aux = number;
        while (aux!=0){
            cifra = aux % 10;
            inverse = inverse * 10 + cifra;
            aux = aux / 10;
        }

        if(number == inverse){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}
