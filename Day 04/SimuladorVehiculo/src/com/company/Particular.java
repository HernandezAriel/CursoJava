package com.company;

public class Particular extends Vehiculo{
    private int numPuertas;

    public Particular(String matricula, int numPuertas){
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas(){
        return numPuertas;
    }

    @Override
    public String toString(){
        return super.toString()+"\nNumero de puertas: "+numPuertas;
    }


}
