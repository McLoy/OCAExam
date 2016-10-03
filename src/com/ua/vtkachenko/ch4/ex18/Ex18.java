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

        //Ex18 e = new Ex18("Hi");
        //Ex18Child e = new Ex18Child();
        Ex18Child g = new Ex18Child("Child call");

    }
}

class Ex18Child extends Ex18{

    public Ex18Child(){
        super();
        System.out.println("Child");
    }

    public Ex18Child(String b){
        super(b);
        System.out.println("Child");
    }

}


