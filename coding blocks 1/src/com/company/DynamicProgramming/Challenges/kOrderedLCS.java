package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class kOrderedLCS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int[] A=new int[n];
        int[] B=new int[m];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            B[i]=s.nextInt();
        }
        int[][][] MAX=new int[0][0][0];
    }
    public static int KorderLCS(int[] A,int[] B,int n,int m,int k){
        return  0;

    }

}
