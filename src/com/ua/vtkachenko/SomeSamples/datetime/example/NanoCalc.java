package com.ua.vtkachenko.SomeSamples.datetime.example;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class NanoCalc {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(22,00,30,0);
        int count = 0;
        List<LocalTime> arr = new ArrayList<>();
        arr.add(time);
        while (arr.get(count) != LocalTime.of(22,00,31,0)){
            LocalTime a = time.plusNanos(100000000);
            arr.add(a);
            count += 1;
            System.out.println(a);
        }
        System.out.println(count*100000000 + " nanos" + " in one second of time");
    }
}
