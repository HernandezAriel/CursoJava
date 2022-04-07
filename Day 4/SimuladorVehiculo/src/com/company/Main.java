package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //MAIN harcodeado probando todas las funcionalidades.
        Particular p1 = new Particular("ASD123", 4);
        Carga c1 = new Carga("QWE345");
        Remolque r1 = new Remolque(50);

        System.out.println(p1.getNumPuertas());
        p1.acelerar(20);
        System.out.println(p1.getVelocidad());
        System.out.println(p1.toString());

        c1.acelerar(30);
        c1.quitaRemolque();
        c1.ponRemolque(r1);
        //System.out.println(c1.quitaRemolque());
        System.out.println(c1.toString());
        c1.acelerar(40);

/*
        ArrayList<Particular>particulares = new ArrayList<>();
        ArrayList<Carga>cargas = new ArrayList<>();


        System.out.println("--------------------------Simulador de Vehiculos--------------------------");
        boolean exit = false;
        int op;

        while(!exit){
            System.out.println("1. Cargar vehiculo particular.");
            System.out.println("2. Cargar vehiculo de carga.");
            System.out.println("3. Acelerar vehiculo.");
            System.out.println("4. Agregar remolque a vehiculo de carga.");
            System.out.println("4. Quitar remolque a vehiculo de carga.");
            System.out.println("5. Mostrar vehiculo.");
            System.out.println("6. Mostrar todos.");
            System.out.println("7. Salir.");
            op = sc.nextInt();

            switch (op){
                case 1: particulares.add(cargarParticular());
                break;
                case 2: cargas.add(cargarCarga());
                break;
                case 3:
                        Vehiculo aux = buscarVehiculo(particulares, cargas);
                        System.out.println("Cuanto quiere acelerar?: ");
                        int acelerar = sc.nextInt();
                        aux.acelerar(acelerar);
                break;
                case 4: Vehiculo aux2 = buscarVehiculo(particulares, cargas);
                        aux2.toString();
                }


        }
    }

    public static Particular cargarParticular(){
        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();
        System.out.println("Ingrese numero de puertas: ");
        int numPuertas = sc.nextInt();
        Particular p = new Particular(matricula, numPuertas);
        return p;
    }

    public static Carga cargarCarga(){
        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();
        Carga c = new Carga(matricula);
        return c;
    }

    public static Vehiculo buscarVehiculo(ArrayList<Particular> particulares, ArrayList<Carga> cargas){

        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();

        Vehiculo aux = null;
        for(Particular p: particulares) {
            if (p.getMatricula().equals(matricula)) {
                aux = p;
            }
        }

        for(Carga c: cargas) {
            if (c.getMatricula().equals(matricula)) {
                aux = c;
            }
        }
        return aux;
    }*/
    }
}
