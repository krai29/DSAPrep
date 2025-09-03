package com.krai29.conditionals;

import java.util.Scanner;

public class PrimeOrNot {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        if (number <= 1){
//            System.out.println("Neither prime nor composite");
//            return;
//        }
//        int c = 2;
//        while(c<=Math.sqrt(number)){
//            if (number % c == 0){
//                System.out.println("Not a prime");
//                return;
//            }
//            c = c+1;
//        }
//        System.out.println("It's a prime number");
//    }

    // Optimized solution

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number<=1){
            System.out.println("Neither prime nor composite");
            in.close();
            return;
        }

        if (number == 2){
            System.out.println("It's a prime number");
            in.close();
            return;
        }

        if (number % 2 == 0){
            System.out.println("Not a prime number");
            in.close();
            return;
        }

        for (int c = 3; c*c<number;c+=2){
            if (number % c == 0){
                System.out.println("Not a prime");
                in.close();
                return;
            }
        }

        System.out.println("It's a prime number");
        in.close();
    }
}
