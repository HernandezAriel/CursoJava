package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numbers[] = new int[10];
        int max, min;
        addNumbers(numbers);
        printArray(numbers);
        System.out.println("El mayor valor es: "+ maxNumber(numbers));
        System.out.println("El menor valor es: "+ minNumber(numbers));
        evenNumber(numbers);
        oddNumber(numbers);
        sortAscending(numbers);
        sortDescending(numbers);

    }

    public static void addNumbers(int numbers[]){
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < numbers.length; i++) {
            System.out.printf("Introduzca número: ", i + 1);
            numbers[i] = sc.nextInt();
        }
    }

    public static void printArray(int numbers[]){
        for (int i = 0; i < numbers.length; i++) System.out.println(numbers[i]);
    }

    public static int maxNumber(int numbers[]){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int minNumber(int numbers[]){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void evenNumber(int numbers[]){
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                System.out.println("Numero par: "+numbers[i]);
            }
        }
    }

    public static void oddNumber(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 != 0){
                System.out.println("Numero impar: "+numbers[i]);
            }
        }
    }

    public static void sortAscending(int numbers[]){
        Arrays.sort(numbers);
        System.out.println("Ordenados Ascendente: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void sortDescending(int numbers[]){
        Arrays.sort(numbers);
        System.out.println("Ordenados Descendente: ");
        for (int i = numbers.length -1 ; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }




}
