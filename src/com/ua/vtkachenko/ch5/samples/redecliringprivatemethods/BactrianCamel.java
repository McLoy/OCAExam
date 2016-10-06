package com.ua.vtkachenko.ch5.samples.redecliringprivatemethods;

public class BactrianCamel extends Camel {

    private int getNumberOfHumps(){
        return 2;
    }

    public static void main(String[] args) {
        BactrianCamel c = new BactrianCamel();
        System.out.println("BactrianCamel has " + c.getNumberOfHumps() + " humps");
    }
}
