package com.krai29.java.string;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26;i ++){
            char ch = (char) ('a'+i);
            series += ch;
        }
        System.out.println(series);

        /*
        what's happening is since string is immutable evey iteration the string reference variable is pointing to
        a new object and the old objects are being garbage collected. So much memory is getting wasted

        a, ab , abc, abcd ....., abcd...y til this the objects will be eliminated
        1, 2, 3, 4,...N   N(n+1)/2  O(N^2) time complexity
         */
    }
}
