package com.bridgelabz.basicprogram;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        int n=2;
        int Count =0;
        if(n>1){
            for(int i=0;i<n;i++){
                if(n%1==0) {
                    Count++;
                }}
                if(Count==2) {
                    System.out.println("prime");
                }else{
                    System.out.println("notprime");
                }

        }else{
            System.out.println("enter positive integer");
        }
    }

}
