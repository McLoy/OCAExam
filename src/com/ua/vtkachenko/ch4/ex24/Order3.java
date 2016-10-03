package com.ua.vtkachenko.ch4.ex24;

public class Order3 {

    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";

    {
//        value1 = "d";
        value2 = "e";
        value3 = "f";
        //CODE SNIPPET 1
    }
    static {
//        value1 = "g";
        //value2 = "h";
//        value3 = "i";
        //CODE SNIPPET 2
    }

    public static void main(String[] args) {

    }
}
