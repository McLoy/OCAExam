package com.ua.vtkachenko.SomeSamples.s7;

import java.util.Arrays;

public class Ints {
    public static void main(String[] args) {


        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));

//        int[] numbers = new int[]{3,2,1};
//        System.out.println(Arrays.binarySearch(numbers, 2));
//        System.out.println(Arrays.binarySearch(numbers, 3));
    }
}
