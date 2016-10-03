package com.ua.vtkachenko.ch4.ex20;

public class BirdSeed {

    private int numberBags;
    boolean call;

    public BirdSeed(){
        //BirdSeed(2);
        //new BirdSeed(2);
        //this.numberBags = new BirdSeed(2).numberBags; //another way
        this(2);
        //LINE1
        call = false;
        //LINE2
        //BirdSeed(2);
        //new BirdSeed(2);
        //this(2);
    }

    public BirdSeed(int numberBags){
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
