package com.bridgelabz.basicprogram;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n =10;
        for(int i =1;i<=n;++i){
            System.out.println(n1);
            int nextterm = n1+n2;
            n1=n2;
            n2=nextterm;


        }

    }
}
