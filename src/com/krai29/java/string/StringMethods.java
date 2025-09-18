package com.krai29.java.string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "K aran";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        name.strip();
        name.trim();
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
