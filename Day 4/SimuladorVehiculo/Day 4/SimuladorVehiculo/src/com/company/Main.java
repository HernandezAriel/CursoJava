package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList<Particular> particulares = new ArrayList<>();
        ArrayList<Carga> cargas = new ArrayList<>();


        System.out.println("--------------------------Simulador de Vehiculos--------------------------");
        boolean exit = false;
        int op;

        while (!exit) {
            System.out.println("1. Cargar vehiculo particular.");
            System.out.println("2. Cargar vehiculo de carga.");
            System.out.println("3. Acelerar vehiculo.");
            System.out.println("4. Agregar remolque a vehiculo de carga.");
            System.out.println("5. Quitar remolque a vehiculo de carga.");
            System.out.println("6. Mostrar vehiculo.");
            System.out.println("7. Salir.");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    particulares.add(cargarParticular());
                    break;
                case 2:
                    cargas.add(cargarCarga());
                    break;
                case 3:
                    Vehiculo aux = buscarVehiculo(particulares, cargas);
                    System.out.println("Cuanto quiere acelerar?: ");
                    int acelerar = sc.nextInt();
                    aux.acelerar(acelerar);
                    break;
                case 4:
                    System.out.println("Ingrese matricula: ");
                    sc.nextLine();
                    String matricula = sc.nextLine();
                    for (Carga p : cargas) {
                        if (p.getMatricula().equals(matricula)) {
                            p.ponRemolque(crearRemolque());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese matricula: ");
                    sc.nextLine();
                    String matricula1 = sc.nextLine();
                    for (Carga p : cargas) {
                        if (p.getMatricula().equals(matricula1)) p.quitaRemolque();
                        else System.out.println("No existe el vehiculo");
                    }
                    break;
                case 6:
                    Vehiculo aux1 = buscarVehiculo(particulares, cargas);
                    System.out.println(aux1.toString());
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }

    public static Particular cargarParticular() {
        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();
        System.out.println("Ingrese numero de puertas: ");
        int numPuertas = sc.nextInt();
        Particular p = new Particular(matricula, numPuertas);
        return p;
    }

    public static Carga cargarCarga() {
        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();
        Carga c = new Carga(matricula);
        return c;
    }

    public static Vehiculo buscarVehiculo(ArrayList<Particular> particulares, ArrayList<Carga> cargas) {

        System.out.println("Ingrese matricula: ");
        sc.nextLine();
        String matricula = sc.nextLine();

        Vehiculo aux = null;
        for (Particular p : particulares) {
            if (p.getMatricula().equals(matricula)) {
                aux = p;
                break;
            }
        }

        for (Carga c : cargas) {
            if (c.getMatricula().equals(matricula)) {
                aux = c;
            }
        }
        return aux;
    }

    public static Remolque crearRemolque() {
        System.out.println("Ingrese preso del remolque");
        int peso = sc.nextInt();
        Remolque r = new Remolque(peso);
        return r;
    }
}



