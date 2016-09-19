package com.ua.vtkachenko.ch2.ex1;

public class Switch {

    public static void main(String[] args) {

        int day = 5;
        switch (day){
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

}
