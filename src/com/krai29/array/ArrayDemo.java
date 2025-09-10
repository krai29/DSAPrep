package com.krai29.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
//        int[] ros = new int[3];
//        System.out.println(ros); // Prints I@4232432   so here I is for Integer array and next part is hex code of the object
//        System.out.println(Arrays.toString(ros));

        int[][] arr1 = new int[3][2];
//        int[][] arr2 = {
//                {1,2,3},
//                {1,3,4,5},
//                {1,2}
//        };
//        System.out.println(Arrays.deepToString(arr2));

        Scanner in = new Scanner(System.in);
        for (int row = 0; row<arr1.length; row++){
            for (int col = 0;col < arr1[row].length; col ++){
                arr1[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr1));

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.getFirst();
    }
}
