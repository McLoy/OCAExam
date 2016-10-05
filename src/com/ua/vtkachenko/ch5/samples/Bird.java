package com.ua.vtkachenko.ch5.samples;

public class Bird {

    public void fly(){
        System.out.println("Bird is flying");
    }

    public int eat(int food){
        System.out.println("Bird is eating " + food + " units of food");
        return food;
    }
}
