package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        float total = 0;
        char op, c;

        do {
            System.out.println("Ingrese un numero: ");
            number1 = sc.nextInt();
            System.out.println("Ingrese un numero: ");
            number2 = sc.nextInt();
            System.out.println("Indique que operacion quiere realizar (+ - * /): ");
            op = sc.next().charAt(0);
            if (op != '+' || op != '-' || op != '*' || op != '/') {

                switch (op) {
                    case '+':
                        total = number1 + number2;
                        break;
                    case '-':
                        total = number1 - number2;
                        break;
                    case '*':
                        total = number1 * number2;
                        break;
                    case '/':
                        total = number1 / number2;
                        break;
                    default:
                        System.out.println("Operacion invalida.");
                }
            }
            System.out.println("Resultado: " + total);
            System.out.println("Presione cualquier tecla para repetir o 'n' para salir.");
            c = sc.next().charAt(0);
        } while (c != 'n');

    }
}
