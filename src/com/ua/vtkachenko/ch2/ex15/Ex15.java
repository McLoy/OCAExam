package com.ua.vtkachenko.ch2.ex15;

public class Ex15 {
    public static void main(String[] args) {

        int x = 1, y = 15;
        //while x < 10 //error
        while (x < 10) //infinity loop
            y--;
            x++;
        System.out.println(x+", "+y);
    }
}
