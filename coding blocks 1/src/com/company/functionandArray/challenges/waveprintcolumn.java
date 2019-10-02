package com.company.functionandArray.challenges;

import java.util.Scanner;

public class waveprintcolumn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] A=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            if(i%2==0)
            for(int j=0;j<n;j++){
                System.out.print(A[j][i]+", ");
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(A[j][i]+", ");
                }
            }

        }
        System.out.print("END");
    }
}
