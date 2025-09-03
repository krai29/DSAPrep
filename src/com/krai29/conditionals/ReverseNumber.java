package com.krai29.conditionals;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reversedNumber = 0;
        while(number>0){
            int rem = number % 10;
            reversedNumber = reversedNumber*10 + rem;
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}
