package com.krai29.java.conditionals;

import java.util.Scanner;
// Q: Finding nth fibonacci number
public class FibonacciUsingConditionals {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
//        for (int i = 3;i<=n;i++){
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }
//        System.out.println(b);
        int count = 2;
        while (count<=n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
