package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[]={"Martinez", "Alonso", "Rock", "Gili", "Lazarte"};

        User u1 = new User("Juan", 20);
        Premium p1 = new Premium("Claudio", 4, 4);

        System.out.println(u1.playSong(array));
        u1.skipSong(array);
        u1.playSong(array);
        System.out.println(u1.playSong(array));

        System.out.println("Ingrese numero de cancion que quiere escuchar: ");
        int song = sc.nextInt();
        p1.playSong(array, song);


    }
}
