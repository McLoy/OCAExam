package com.ua.vtkachenko.ch5.samples.polymorphism.virtualmethods;

public class Bird {

    public String getName(){
        return "Unknown";
    }

    public void displayInformation(){
        System.out.println("The bird name is: " + getName());
    }
}
