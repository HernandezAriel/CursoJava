package com.company;

public class Pilas {
    private int top = -1;
    private int size;
    private int[] array;
    private int total;

    public Pilas(int size){
        if(size <= 0){
            throw new IllegalArgumentException("La capacidad no puede ser menor a 1");
        }
        this.size = size;
        array = new int[size];
    }

    public void push(int value){
        array[++this.top] = value;
    }

    public int pop(){
        return array[this.top--];
    }

    public int viewPila(){
        return array[this.top];
    }

    public boolean empty(){
        return top < 0;
    }

    public boolean full(){
        return top > size;
    }

    public void addPila(int value){
        if(!full()){
            push(value);
        }
    }

    public int sumar(int top){
        if(this.top == 0){
            return 1;
        }
        else{
            return total+=(sumar(this.top-1));
        }
    }

}