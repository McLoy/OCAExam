package com.ua.vtkachenko.SomeSamples.arr.s11;

import java.util.*;
import java.time.*;

public class RemoveEl {
    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds.remove(0));
        System.out.println(birds);

    }
}
