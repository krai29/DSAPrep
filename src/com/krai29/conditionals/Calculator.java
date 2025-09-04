package com.krai29.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from the user till user does not press X or x
        while(true){
            // Take operator as input
            System.out.println("Enter the operator: ");
            char operator = in.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){

                int ans = 0;
                boolean valid = true;
                // input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (operator == '+'){
                    ans = num1 + num2;
                }
                if (operator == '-'){
                    ans = num1 - num2;
                }
                if (operator == '*'){
                    ans = num1 * num2;
                }
                if (operator == '/'){
                    if (num2 != 0){
                        ans = num1/num2;
                    } else {
                        System.out.println("Can't divide by 0");
                        valid = false;
                    }
                }
                if (operator == '%'){
                    if (num2!=0){
                        ans = num1%num2;
                    } else {
                        System.out.println("Can't divide by zero");
                        valid = false;
                    }
                }
                if (valid){
                    System.out.println("Answer is : "+ans);
                }
            } else if (operator == 'X' || operator == 'x') {
                break;
            } else System.out.println("Invalid operator selected");


        }

    }
}
