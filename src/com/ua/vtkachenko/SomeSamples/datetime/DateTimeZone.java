package com.ua.vtkachenko.SomeSamples.datetime;

import java.time.*;

public class DateTimeZone {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 =  LocalTime.of(6, 15);               // hour and minute
        LocalTime time2 =  LocalTime.of(6, 15, 30);          // + seconds
        LocalTime time3 =  LocalTime.of(6, 15, 30, 200);     // + nanoseconds

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}
