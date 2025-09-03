package com.krai29.conditionals;

import java.util.Scanner;

public class OccurenceOfDigitInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int digit = input.nextInt();
        int count = 0;
        while (number>0){
            int rem = number%10;  // to get last digit use modulo and the remainder is last digit
            if (rem == digit){
                count++;
            }
            number = number/10;    // to eliminate that remainder digit from the number
        }
        System.out.println(count);
    }
}
