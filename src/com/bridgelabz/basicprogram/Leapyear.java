package com.bridgelabz.basicprogram;

public class Leapyear {
    public static void main(String[] args) {
        int n = 20000_1000;
        if(n%400==0||n%4==0 && n%100!=0){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
            }
        }
    }

