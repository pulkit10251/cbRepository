package com.company.DynamicProgramming;

import java.util.Scanner;

public class DPfibbonaci {
    public static long start;
    public static long end;
    public static void startAlgo(){
        start=System.currentTimeMillis();
    }
    public static long endAlgo(){
        end=System.currentTimeMillis();
        return end-start;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] storage=new int[n+1];
//        startAlgo();
//        System.out.println(fibo(n));
//        System.out.println("fib normal took time:"+endAlgo()+" ms");
        startAlgo();
        System.out.println(fiboRS(n,storage));
        System.out.println("fib recursive Storage took time:"+endAlgo()+" ms");

        startAlgo();
        System.out.println(fibIS(n));
        System.out.println("fib Iterative Storage took time:"+endAlgo()+" ms");
    }
    public static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        int f1=fibo(n-1);
        int f2=fibo(n-2);
        int ans=f1+f2;
        return ans;
    }
    public static int fiboRS(int n,int[] strg){
        if(n==1||n==0){
            return n;
        }
        if(strg[n]!=0){
            return strg[n];
        }
        int f1=fiboRS(n-1,strg);
        int f2=fiboRS(n-2,strg);
        int ans=f1+f2;
        strg[n]=ans;

        return ans;
    }
    public  static int fibIS(int n){
        int[] strg=new int[n+1];
         strg[0]=0;
         strg[1]=1;
         for(int i=2;i<=n;i++){
             strg[i]=strg[i-1]+strg[i-2];
         }
         return strg[n];

    }
}
