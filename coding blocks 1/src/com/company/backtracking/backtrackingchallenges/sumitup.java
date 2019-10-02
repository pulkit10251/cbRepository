package com.company.backtracking.backtrackingchallenges;

import java.util.Scanner;

public class sumitup {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int target=s.nextInt();
    }
    public static void sumit(int[] A,int target,char[] ans,int pos,int sum){
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
            A[i]=0;
            ans[i]=(char) A[i];
            sumit(A,target,ans,pos+1,sum);
        }
    }
}
