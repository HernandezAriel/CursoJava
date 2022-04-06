package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String word;
        String keyWord;
        char[] charKey;
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player("Claudio");
        Player p2 = new Player("Juan");

        Game g1 = new Game(6);

        System.out.println("Ingrese una palabra: ");
        word = sc.nextLine();
        p2.setWord(word);
        System.out.println("Ingrese una pista: ");
        keyWord = sc.nextLine();
        p2.setKeyWord(keyWord);

        g1.viewWord(p2);
        charKey = g1.splitString(p2);


    }
}
