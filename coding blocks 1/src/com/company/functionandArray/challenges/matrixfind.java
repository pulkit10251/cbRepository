package com.company.functionandArray.challenges;

import java.util.Scanner;

public class matrixfind {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] A=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=s.nextInt();
            }
        }
        int x=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==x) {
                    count++;

                }
            }
        }
        if(count==0) {
            System.out.println("0");
        }
            else
            System.out.println("1");

    }
}
