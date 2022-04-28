package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero del 1 al 14: ");
            num = sc.nextInt();
        }while(num < 1 || num > 14);

        Primo p1 = new Primo(num);
        //Con If
        if(p1.esPrimo()) System.out.println("Es primo");
        else System.out.println("No es primo");
        //Con Switch
        if(p1.numPrimo()) System.out.println("Es primo");
        else System.out.println("No es primo");
    }
}
