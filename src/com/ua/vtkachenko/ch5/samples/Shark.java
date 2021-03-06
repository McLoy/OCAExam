package com.ua.vtkachenko.ch5.samples;

public class Shark extends Fish {

    private int numberOfFins = 8;

    public Shark(int age){
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails(){
        System.out.print("Shark with age:" + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

    public void displaySharkDetailsByThis(){
        System.out.print("Shark with age:" + this.getAge());
        System.out.print(" and " + this.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    public void displaySharkDetailsBySuper(){
        System.out.print("Shark with age:" + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

    public static void main(String[] args) {
        Shark s = new Shark(7);
        s.displaySharkDetails();
        System.out.println();
        s.displaySharkDetailsByThis();
        System.out.println();
        s.displaySharkDetailsBySuper();
    }
}
