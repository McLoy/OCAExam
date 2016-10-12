package com.ua.vtkachenko.ch6.samples;

public class S1 {
    public static void main(String[] args) {

        try{
            System.out.println("try");
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("catch");
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
            throw new RuntimeException();
        }

    }
}
