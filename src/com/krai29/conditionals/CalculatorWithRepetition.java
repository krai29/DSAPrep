package com.krai29.conditionals;

import java.util.Scanner;

public class CalculatorWithRepetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* If you enter 'c' clears the entire operation
        If you enter 'x' or 'X' terminates the operation
         */
        Double ans = null;
        while (true) {

            System.out.println("Enter the operator :");
            char operator = in.next().trim().charAt(0);

            if (operator == 'x' || operator == 'X'){
                System.out.println("Exiting calculator ...");
                break;
            }

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {

                double num1, num2;
                boolean isValid = true;

                if (ans == null){
                    System.out.println("Enter two numbers");
                    num1 = in.nextDouble();
                    num2 = in.nextDouble();
                } else {
                    num1 = ans;
                    System.out.println("Previous answer is :"+ ans);
                    System.out.println("Enter next number");
                    num2 = in.nextDouble();
                }

                switch (operator){
                    case '+':
                        ans = num1 + num2;
                        break;

                    case '-':
                        ans = num1 - num2;
                        break;

                    case '*':
                        ans = num1 * num2;
                        break;

                    case '/':
                        if (num2!=0){
                            ans = num1 / num2;
                        } else {
                            isValid = false;
                            System.out.println("Can't divide by zero");
                        }
                        break;

                    case '%' :
                        if (num2!=0){
                            ans = num1 % num2;
                        } else {
                            isValid = false;
                            System.out.println("Can't divide by zero");
                        }
                        break;
                }

                if (isValid){
                    System.out.printf("Answer is :%.2f%n",ans);
                  //  System.out.println(String.format("Answer is : %.3f", ans));
                }

            }
            else if (operator == 'c'){

                ans = null;
                System.out.println("Clearing all operations");

            }else {

                System.out.println("Invalid operator selected");
            }
        }
        in.close();
    }
}
