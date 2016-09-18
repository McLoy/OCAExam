package com.ua.vtkachenko.ch1.ex3;

public class InstanceInitializes {
    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(i);
        i = 3;
        System.out.println(i);
        InstanceInitializes ii = new InstanceInitializes();
        System.out.println(i);
    }
    {
        System.out.println("Instance initializes");
        i = 2;
    }

    static int i = 0;
}
