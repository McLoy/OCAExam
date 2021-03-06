package com.ua.vtkachenko.ch3.ex;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class StringEquals {
    public static void main(String[] args) {

        System.out.println("Question2");
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");

        System.out.println("Question4");
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);

        System.out.println("Question5");
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2) System.out.println("1"); //error
        if (s1.equals(s2)) System.out.println("2");

        System.out.println("Question6");
        String letters = "abcdef";
        System.out.println(letters.length());
        System.out.println(letters.charAt(3));
        //System.out.println(letters.charAt(6));

        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));

        System.out.println("Question9");
        String ss = "purr";
        ss.toUpperCase();
        ss.trim();
        ss.substring(1,3);
        ss += " two";
        System.out.println(ss.length());

        System.out.println("Question10");
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");

        int total = 0;
        StringBuilder letterss = new StringBuilder("abcdef");
        total += letterss.substring(1, 2).length();
        total += letterss.substring(6, 6).length();
        //total += letterss.substring(6, 5).length(); //error
        System.out.println(total);

        StringBuilder numberss = new StringBuilder("0123456789");
        numberss.delete(2,8);
        numberss.append("-").insert(2, "+");
        System.out.println(numberss);

//        StringBuilder b = "rumble"; //error
//        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
//        System.out.println(b);

        System.out.println("Question14");
        StringBuilder puzzle = new StringBuilder("Java");
        //puzzle.reverse();
        //puzzle.append("vaJ$").substring(0, 4);
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length()-1); //error
        System.out.println(puzzle);

        char[]c = new char[2];
        int length = c.length;

        ArrayList l = new ArrayList();
        int lengthA = l.size();

        //l.remove(0); //error

        System.out.println("Question20");
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7); //error
        for (String sss : list) System.out.println(sss);

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values) System.out.println(v);

        System.out.println("Question22");
        int[] random = {6, -4, 12, 0, -10};
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        System.out.println("++++++");
        List<Integer> listt = Arrays.asList(10, 4, -1, 5);
        Collections.sort(listt);
        Integer array[] = listt.toArray(new Integer[4]);
        System.out.println(array[0]);

//        System.out.println("************");
//        String [] namesss = {"Tom", "Dick", "Harry"};
//        List<String> list2 = namesss.asList(); //error
//        list2.set(0, "Sue");
//        System.out.println(namesss[0]);

        System.out.println("Question25");
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        for (String ds : hex) System.out.print(ds + " ");
        System.out.println();
        int xx = Collections.binarySearch(hex, "8");
        int yy = Collections.binarySearch(hex, "3A");
        int zz = Collections.binarySearch(hex, "4F");
        System.out.println(xx + " " + yy + " " + zz);

        System.out.println("Question26");
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        //ages.add(null); //error
        for (int age : ages) System.out.println(age);

        System.out.println("//////");
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two) System.out.println("A");
        else if (one.equals(two)) System.out.println("B");
        else System.out.println("C");

        System.out.println("Question29");
        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        //date.plusHours(3); //such method not defined
        System.out.println(date.getYear() + " "
                + date.getMonth() + " " + date.getDayOfMonth());

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

        String a1 = "12345";
        String a2 = "1234" + a1.length();
        if(a1 == a2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("====");
        List<Integer> aa1 = new ArrayList<>();
        List<Integer> aa2 = new ArrayList<>();
        List<Integer> aa3 = new ArrayList<>();
        int[] bbb1 = {1,5,4};
        int[] bbb2 = {1,5,4};
        aa1.add(1);
        aa1.add(5);
        aa1.add(4);
        aa2.add(1);
        aa2.add(5);
        aa2.add(4);
        //aa3.remove(0);
//        if (aa1.equals(aa2)) {System.out.println("1");}
//        else System.out.println("2");

        if (bbb1.equals(bbb2)) {System.out.println("1");}
        else System.out.println("2");



    }
}
