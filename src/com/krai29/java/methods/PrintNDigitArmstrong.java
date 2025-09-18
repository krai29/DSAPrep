package com.krai29.java.methods;

/*
Armstrong number is that no whose sum of cube of each individual digit should be same the original no
Eg 153 = 1^3 + 5^3 + 3^3 = 153
 */

import java.util.Scanner;

public class PrintNDigitArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = in.nextInt();

        System.out.println("Armstrong numbers with "+n+" digits are :");
        int start = (int) Math.pow(10,n-1);
        int end = (int)Math.pow(10,n)-1;
        for (int i = start;i<=end;i++){
            if (isArmstrong(i,n)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isArmstrong(int num, int n) {
        int original = num;
        int sum = 0;
        while (num>0){
            int remainder = num % 10;
            num = num/10;
            sum+= (int) Math.pow(remainder,n);
        }

        return sum == original;
    }
}
