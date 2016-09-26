package com.ua.vtkachenko.SomeSamples.datetime.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NanoCalc {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(22,00,30,0);
        int count = 0;
        while (!time.equals(LocalTime.of(22,00,31))){
            time = time.plusNanos(100000000); //step, because by 1 nanosecond it will be executed for a long time
            count += 1;
            System.out.println(time);
        }
        System.out.println(count*100000000 + " nanos" + " in one second of time");

        //LocalDateTime t = LocalDateTime.of(2016,1,1,22,00,00);
//        Period p = Period.of(1,0,0);
//        t = t.plus(p);
//        p = p.ofWeeks(1);
//        t = t.plus(p);
//        System.out.println(t);

//        DateTimeFormatter k = DateTimeFormatter.;
//        System.out.println(t.format(k));
    }
}
