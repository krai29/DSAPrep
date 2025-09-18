package com.krai29.java.array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,19,12,2,1,19};
        int[] result = maxItem(arr);
        System.out.println("max element"+result[0] + " at index "+ result[1]);
    }

    private static int[] maxItem(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return new int[]{max,index};
    }
}
