package com.krai29.conditionals;

import java.util.Scanner;

// Q: Check if a character is upper case or lowercase
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // No scanner method for char
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch<='z'){
            System.out.println("Input is lowercase");
        } else if(ch>='A' && ch<='Z'){
            System.out.println("Input is uppercase");
        } else System.out.println("Not a valid character");

    }
}
