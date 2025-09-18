package com.krai29.java.conditionals;

import java.util.Scanner;

public class PrimeNumberSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number<2){
            System.out.println("Not prime");
            in.close();
            return;
        }
        boolean isFirstPrime = true;

        for (int i = 2;i<=number;i++){
            if (isPrime(i)){
                if (!isFirstPrime){
                    System.out.print(", ");
                }
                System.out.print(i);
                isFirstPrime = false;
            }
        }
        in.close();

    }

    public static boolean isPrime(int num){
        if (num<=1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for(int c = 3; c*c<=num;c+=2){
            if (num%c==0) return false;
        }
        return true;
    }
}
