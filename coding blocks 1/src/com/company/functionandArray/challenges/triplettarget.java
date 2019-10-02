package com.company.functionandArray.challenges;

import java.util.Scanner;

public class triplettarget {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        sort(A);
        int tgt=s.nextInt();
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int p=A[i]+A[j]+A[k];
                    if(p==tgt){
                        System.out.println(A[i]+", "+A[j]+" and "+A[k]);
                    }
                }
            }
        }

    }
    public static void sort(int[]A){
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while (counter < A.length - 1) {
            for (int j = 0; j < A.length - 1 - counter; j++) {
                if (A[j] > A[j + 1]) {
                    int temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
            counter++;
        }
    }

}
