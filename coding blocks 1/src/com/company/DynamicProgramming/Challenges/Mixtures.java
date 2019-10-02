package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class Mixtures {
    public static int[][] dp=new int[1000][1000];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp.length;j++) {

                dp[i][j]=-1;
            }
        }
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
      //  System.out.println(MixturesRS(A,0,A.length-1));
        System.out.println(MixturesIS(0,A.length-1,A));
    }
    public static int MixturesRS(int[] mat,int i,int j){
        if(i>=j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=MixturesRS(mat,i,k)+MixturesRS(mat,k+1,j)+(csum(i,k,mat)*csum(k+1,j,mat));
            ans=Math.min(temp,ans);
        }
        return ans;
    }
    public static int csum(int a,int b,int[] mat){
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=sum+mat[i];
            sum=sum%100;
        }
        return sum;
    }
    public static int MixturesIS(int i, int j,int[] mat){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            dp[i][j]=Math.min(dp[i][j],MixturesIS(i,k,mat)+MixturesIS(k+1,j,mat)+csum(i,k,mat)*csum(k+1,j,mat));
        }
        return dp[i][j];
    }
}
