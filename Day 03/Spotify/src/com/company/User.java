package com.company;

public class User {
    private String name;
    private int age;
    private int numSong=0;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String playSong(String[] array){
        return "Reproduciendo: "+ array[numSong];
    }

    public String stopSong(){
        return "Pauso la cancion";
    }

   public int skipSong(String[] array){
        System.out.println("Se skipeo la cancion");
        return numSong++;
    }
}
