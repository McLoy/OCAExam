package com.ua.vtkachenko.ch3.ex;

public class StringEquals {
    public static void main(String[] args) {

        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);

        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2) System.out.println("1"); //error
        if (s1.equals(s2)) System.out.println("2");

        String letters = "abcdef";
        System.out.println(letters.length());
        System.out.println(letters.charAt(3));
        System.out.println(letters.charAt(6));

    }
}
