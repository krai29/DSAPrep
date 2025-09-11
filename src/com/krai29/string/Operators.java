package com.krai29.string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println("a"+'b'); // ab
        System.out.println('a'+'b');  // 195
        System.out.println('a'+3);    // 100
        System.out.println((char)('a'+3) ); // d

        int c = 'c';
        System.out.println(c);         // 99
        System.out.println("a"+1);   //a1
        System.out.println("Abc"+new ArrayList<>()); //Abc[]
        System.out.println("Abc"+new int[3]);
    }
}
