package com.krai29.java.string;

import java.util.Locale;

public class Palindrome {

    // Using Array
//    public static void main(String[] args) {
//        String a = "abcdcba";
//        System.out.println(checkPalindrome(a.toCharArray()));
//
//
//    }
//
//    static boolean checkPalindrome(char[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while (start<end){
//            if (arr[start] != arr[end]){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }

    // Using String builder
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String s = in.next().trim();
//        String r = reverseIt(s);
//        System.out.println("Reverse of original is: "+r);
//        if (r.equals(s)){
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a palindrome");
//        }
//    }
//
//    private static String reverseIt(String original) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = original.length()-1;i>=0;i--){
//            sb.append(original.toCharArray()[i]);
//        }
//        return sb.toString();
//    }

    public static void main(String[] args) {
        String s = "";

        System.out.println(checkPalindrome(s));
    }

    private static boolean checkPalindrome(String str) {
        if (str == null) return false;
        str = str.toLowerCase(Locale.ROOT).replace("[^a-b0-9]","");
        for (int i =0; i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end){
                return false;
            }
        }
        return true;
    }

}
