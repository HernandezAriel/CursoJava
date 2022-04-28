package com.company;

public class Primo {

    private int num;

    public Primo(int num) {
        this.num = num;
    }

    public boolean esPrimo(){
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        }
        else{
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        return esPrimo;
    }

    public boolean numPrimo(){
        boolean esPrimo;
        switch (num){
            case 2: esPrimo = true;
                break;
            case 3: esPrimo = true;
                break;
            case 5: esPrimo = true;
                break;
            case 7: esPrimo = true;
                break;
            case 11: esPrimo = true;
                break;
            case 13: esPrimo = true;
                break;
            default: esPrimo = false;
        }
        return esPrimo;
    }
}