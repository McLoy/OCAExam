package com.ua.vtkachenko.SomeSamples.gl.ex0;

public class Dummy {
    int x = 1;

    public static void main(String[] args) {
        new Dummy().foo();
    }

    void foo() {
        int x = 1;
        boo(++x);
    }

    void boo(int x) {
//        int x = ++x;
//        System.out.println(x);
    }
}
