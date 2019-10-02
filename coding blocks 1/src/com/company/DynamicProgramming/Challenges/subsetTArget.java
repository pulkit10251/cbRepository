package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class subsetTArget {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        int sum=s.nextInt();
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
//        if(SubsetsumRS(A,n,sum)){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
        if(SubsetsumIS(A,n,sum)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean SubsetsumRS(int[] A,int n,int sum){
        if(sum==0){
            return true;
        }
        if(n==0 && sum!=0){
            return false;
        }
        if(A[n-1]>sum){
            return SubsetsumRS(A,n-1,sum);
        }
        boolean fac1=SubsetsumRS(A,n-1,sum);
        boolean fac2=SubsetsumRS(A,n-1,sum-A[n-1]);
        return fac1||fac2;
    }
    public static boolean SubsetsumIS(int[] A,int n,int sum){
        boolean[][] subset=new boolean[sum+1][n+1];
        for(int i=0;i<=n;i++){
            subset[0][i]=true;
        }
        for(int i=1;i<=n;i++){
            subset[i][0]=false;
        }
        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                subset[i][j]=subset[i][j-1];
                if(i>=A[j-1]){
                    subset[i][j]=subset[i][j-1] || subset[i-A[j-1]][j-1];
                }
            }
        }
        return subset[sum][n];
    }
}