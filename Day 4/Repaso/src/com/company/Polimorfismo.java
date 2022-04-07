package com.company;

public class Polimorfismo {

    public void makeSound(){
        System.out.println("Action");
    }

    public static void main(String[] args) {
        Polimorfismo a = new Cars();
        Polimorfismo b = new Motorcycle();
        a.makeSound();
        b.makeSound();
    }
}

public class Cars extends Polimorfismo(){
    public void makeSound(){
        System.out.println("Cars");
    }
}

public class Motorcycle extends Polimorfismo(){
    public void makeSound(){
        System.out.println("Motorcycle");
        }
}
