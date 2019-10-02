package com.company.recursion;

import java.util.*;

public class nthfibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a=System.currentTimeMillis();
        long ans=fibo(n);
        long b=System.currentTimeMillis();
        System.out.println(ans);
        System.out.println((b-a));

    }
    public static long fibo(int n){
        if(n==1||n==0){
            return n;
        }
        long f1=fibo(n-1);
        long f2=fibo(n-2);
        long ans=f1+f2;
        return ans;
    }
}
