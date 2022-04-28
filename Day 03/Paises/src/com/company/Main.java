package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[][] arrayMulti = new String[5][4];
        String ax = "";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre del pais " + (i + 1) + " : ");
            arrayMulti[i][0] = sc.nextLine() + ":";
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i < 4; i++) {
                System.out.print("Introduce el nombre de la ciudad " + (i) + " del pais " + (j + 1) + " : ");
                arrayMulti[j][i] = sc.nextLine();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                ax += arrayMulti[i][j] + "        ";
            }
            ax  += "\n";
        }
        System.out.print(ax);
    }

}

