package com.company.functionandArray.challenges;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] A=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=s.nextInt();
            }
        }
        int k=n-1;
        int[][] B=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                B[i][j]=A[j][k];
            }
            k--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
