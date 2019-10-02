package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class knapsack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int W=s.nextInt();
        int[] wt=new int[n];
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i]=s.nextInt();
        }
        System.out.println(knapsackIS(W,wt,val,n));


    }
    public static int knapsack(int W,int[] wt ,int[] val,int n ){
        if(n==0||W==0){
            return 0;
        }
        if(wt[n-1] > W){
            return knapsack(W,wt,val,n-1);
        }
        int fac1=val[n-1]+knapsack(W-wt[n-1],wt,val,n-1);
        int fac2=knapsack(W,wt,val,n-1);

        return Math.max(fac1,fac2);
    }
    public static int knapsackIS(int W,int[] wt,int[] val,int n){
        int[][] K=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(i==0 || w==0){
                    K[i][w]=0;
                }else
                if(wt[i-1]<=w){
                    K[i][w]=Math.max(val[i-1]+K[i-1][w-wt[i-1]],K[i-1][w]);
                }else{
                    K[i][w]=K[i-1][w];
                }
            }
        }
        return K[n][W];
    }
}
