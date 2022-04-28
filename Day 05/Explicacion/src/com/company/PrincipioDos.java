package com.company;

public class PrincipioDos {

    void acelerar(){

    }

    void stop(){

    }
}

//Puedo acceder pero no modificarlo
public class Vehiculo extends PrincipioDos{
    @Override
    void acelerar(){

    }
}