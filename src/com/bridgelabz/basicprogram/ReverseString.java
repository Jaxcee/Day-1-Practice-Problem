package com.bridgelabz.basicprogram;

public class ReverseString {
    public static void main(String[] args) {
        String str = "123";
        String rev ="";
        for(int i =0;i<str.length();i++){
            rev =str.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}
