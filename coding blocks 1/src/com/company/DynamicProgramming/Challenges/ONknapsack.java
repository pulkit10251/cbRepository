package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class ONknapsack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cap = s.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = s.nextInt();
        }
        System.out.println(unboundedKnapsack(cap,n,B,A));
    }

    public static int unboundedKnapsack(int W, int n, int[] val, int[] wt) {
        int[] dp = new int[W + 1];

        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i){
                    dp[i] = Math.max(dp[i], dp[i - wt[j]]+val[j]);
                }
            }
        }
        return dp[W];
    }
}
