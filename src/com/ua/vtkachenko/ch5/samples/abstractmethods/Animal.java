package com.ua.vtkachenko.ch5.samples.abstractmethods;

public abstract class Animal {

    protected int age;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}
