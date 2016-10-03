package com.ua.vtkachenko.ch4.ex18;

public class Ex18 {

    public Ex18(){
        System.out.println("Constructor by default");
    }

    public Ex18(String a){
        this();
        System.out.println("SomeString: " + a);
    }

    public static void main(String[] args) {

        Ex18 e = new Ex18("Hi");

    }
}


