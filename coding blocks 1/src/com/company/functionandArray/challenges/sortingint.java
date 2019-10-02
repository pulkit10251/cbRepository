package com.company.functionandArray.challenges;

import java.util.Scanner;

public class sortingint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(A[i]==0){
                B[k]=A[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(A[i]==1){
                B[k]=A[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(A[i]==2){
                B[k]=A[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(B[i]);
        }
    }
}
