package com.ua.vtkachenko.SomeSamples.ch4.staticsample;

import java.util.ArrayList;

public class StaticSample {

    private static final ArrayList<String> values = new ArrayList<>();
    public static void main(String[] args) {
        values.add("changed");
    }
}
