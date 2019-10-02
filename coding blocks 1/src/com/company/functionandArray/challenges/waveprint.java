package com.company.functionandArray.challenges;

import java.util.Scanner;

public class waveprint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] A=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++) {
                    System.out.print(A[i][j] + ", ");

                }
            }
                else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(A[i][j] + ", ");
                }
            }
        }
        System.out.println("END");
    }
}
