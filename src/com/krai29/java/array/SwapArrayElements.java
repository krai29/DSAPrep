package com.krai29.java.array;

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,4,6,9,2};
        swap(arr,0, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] aray, int index1, int index2){
        int temp = aray[index1];
        aray[index1] = aray[index2];
        aray[index2] = temp;
    }
}
