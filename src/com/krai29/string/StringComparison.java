package com.krai29.string;

public class StringComparison {
    public static void main(String[] args) {

        String a = "Karan";
        String b = "Karan";
        System.out.println(a.equals(b));
        System.out.println(a == b);

        String c = new String("Karan");
        System.out.println(a.equals(c));
        System.out.println(a == c);
       // Integer m = new Integer(5);  ----> Deprecated as it creates new object in heap
        Integer m = 5;
        Integer n = Integer.valueOf(5);    // Integer pool and stores the value in cache from -128 to 127(default)
    }
}
