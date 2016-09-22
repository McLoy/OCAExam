package com.ua.vtkachenko.SomeSamples.s3;

public class Ch3_1 {
    public static void main(String[] args) {

        String a = "abc";
        String b = a.toUpperCase();

        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a="  +a);
        System.out.println("b="  +b);
    }
}
