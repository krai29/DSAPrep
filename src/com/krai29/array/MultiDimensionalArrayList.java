package com.krai29.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization of inner array list
        for (int i = 0; i<3;i++){
            list.add(new ArrayList<>());
        }

        // adding elements
        for (int i = 0;i<3;i++){
            for (int j = 0; j < 3;j++){
                list.get(i).add(j,in.nextInt());
            }

        }
        System.out.println(list);
    }
}
