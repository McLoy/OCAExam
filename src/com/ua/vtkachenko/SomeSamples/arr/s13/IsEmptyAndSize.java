package com.ua.vtkachenko.SomeSamples.arr.s13;

import java.util.*;

public class IsEmptyAndSize {
    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

        birds.add("hawk");
        birds.add("hawk");

        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

    }
}
