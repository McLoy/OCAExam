package com.ua.vtkachenko.SomeSamples.autoboxing;

import java.util.*;

public class RemoveAutoBoxing {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(1); //by undex
        System.out.println(numbers);

        numbers.remove(new Integer(3)); //by value
        System.out.println(numbers);

    }
}
