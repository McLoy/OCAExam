package com.ua.vtkachenko.ch2.ex8;

public class Ex8 {
    public static void main(String[] args) {

        boolean x = true, z = true;
        int y = 20;
//        System.out.println(y!=10);
//        System.out.println(z=false);
        x = (y!=10)^(z=false);
        System.out.println(x+", "+y+", "+z);


//        boolean f = true;
//        if (f = false)
//            System.out.println(f);
//        System.out.println(f);
    }
}
