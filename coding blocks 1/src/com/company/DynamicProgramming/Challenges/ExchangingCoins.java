package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class ExchangingCoins {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long  n=s.nextLong();
        System.out.println(coinexchange(n));
    }
    public static long coinexchange(long n){
        if(n==0 || n==1){
            return n;
        }
        long sum=n/2 +n/3 +n/4;
        if(sum>n){
            long fac1=coinexchange(n/2);
            long fac2=coinexchange(n/3);
            long fac3=coinexchange(n/4);

            return fac1+fac2+fac3;
        }else{
            return n;
        }
    }
}
