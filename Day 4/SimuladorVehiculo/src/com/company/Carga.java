package com.company;

public class Carga extends Vehiculo{
    private Remolque rem;

    public Carga(String matricula){
        super(matricula);
        this.rem = null;
    }

    public void ponRemolque(Remolque r){
        this.rem = r;
    }

    public String quitaRemolque(){
        if(verificarRemolque()){
            this.rem = null;
            return "Se retiro el remolque!";
        }
        else{
            return "Este vehiculo no tiene remolque";
        }
    }

    public boolean verificarRemolque(){
        if(this.rem != null) return true;
        else return false;
    }

    @Override
    public void acelerar(int a){
        if(verificarRemolque()){
            if(a > 100){
                System.out.println("No se puede ir tan rapido con un remolque!");
            }
            else{
                setVelocidad(a);
            }
        }
    }

    public String toString(){
        String def;
        if(rem!=null) def = rem.toString();
        else def = "\nNo tiene remolque";
        return super.toString()+def;
    }

}
