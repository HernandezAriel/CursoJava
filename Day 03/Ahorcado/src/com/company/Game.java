package com.company;
import java.util.Scanner;

public class Game {

    private int tries = 6;
    private String[] word;

    public Game(String[] word){
        
    }

    public void startGame(Player p1, Player p2){
        Scanner sc = new Scanner(System.in);
        char character;
        char[] word;
        viewWord(p2);
        System.out.println("Ingrese un caracter de la palabra: ");
        character = sc.next().charAt(0);
        word = splitString(p2);
        while(tries < 7){
            hits(word, character);
        }

    }

    public void viewWord(Player p2){
        for(int i = 0; i < p2.getWord().length(); i++){
            System.out.print(p2.getWord() + " ");
        }
    }

   public char[] splitString(Player p2){
       char[] chars;
       chars = new char[p2.getKeyWord().length()];
       for(int i = 0; i < p2.getKeyWord().length(); i++){
           chars[i] = p2.getKeyWord().charAt(i);
       }
       return chars;
   }

    public void hits(char[] word, char character) {
        for(int i = 0; i < word.length; i++){
            if(word[i]==character){
                System.out.println("hit");
                tries++;
            }
        }
        tries++;
    }
}

