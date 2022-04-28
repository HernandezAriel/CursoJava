package com.company;

public class Main {

    public static void main(String[] args) {
        Service s1 = new Service("Claudio", "Hernandez", "1", "Single", "2021", 1, "Cleaning");
        System.out.println(s1.toString());
        Teacher t1 = new Teacher("Carlos", "Juarez", "2", "Single", "2020", 2, "Java");
        System.out.println(t1.toString());
        Student st1 = new Student("Juan", "Perez", "3", "Single", 4);
        System.out.println(st1.toString());

        s1.setMaritalStatus("Married");
        t1.setOfficeNum(4);
        t1.setArea("PHP");
        s1.setSection("Management");
        System.out.println(s1.toString());
        System.out.println(t1.toString());
        System.out.println(st1.toString());

    }
}
