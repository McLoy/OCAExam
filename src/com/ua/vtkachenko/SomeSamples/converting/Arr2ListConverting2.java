package com.ua.vtkachenko.SomeSamples.converting;

import java.util.*;

public class Arr2ListConverting2 {
    public static void main(String[] args) {

        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        list.set(1, "test");
        array[0] = "new";
        for (String b: array) System.out.println(b + " ");
        list.remove(1); //exception
    }
}
