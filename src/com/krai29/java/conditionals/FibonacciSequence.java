package com.krai29.java.conditionals;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        if (n >= 1){
            System.out.print(a);
        }
        if (n>=2){
            System.out.print(", "+b);
        }
        for (int i = 3;i<=n;i++){
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(", "+b);
        }
    }
}
