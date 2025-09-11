package com.krai29.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array :"+ Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed Array :"+Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
