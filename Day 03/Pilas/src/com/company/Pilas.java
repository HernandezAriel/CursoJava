package com.company;
import java.util.EmptyStackException;
public class Pilas {
    private int top = -1;
    private int size;
    private String[] array;

    public Pilas(int size){
        if(size <= 0){
            throw new IllegalArgumentException("La capacidad no puede ser menor a 1");
        }
        this.size = size;
        array = new String[size];
    }

    public void push(String value){
        array[++this.top] = value;
    }

    public String pop(){
        return array[this.top--];
    }

    public String viewStrings(){
        return array[this.top];
    }

    public boolean empty(){
        return top < 0;
    }

    public boolean full(){
        return top > size;
    }

    public void addPila(String value){
        if(!full()){
            push(value);
        }
    }

    public int cantObjs(){
        return top+1;
    }

}
