package com.company.functionandArray.challenges;

import java.util.Scanner;

public class formbiggestnuber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++) {
            int x = s.nextInt();
            String[] A = new String[x];
            for (int j = 0; j < x; j++) {
                A[j]=s.next();
            }
            System.out.println(A[3]);
            int k=0;
            while(k<x-1){
                for(int j=0;j<x-1;j++){
                    if(A[j].charAt(0)=='1')
                    if(A[j].compareTo(A[j+1])>0){
                        String temp=A[j];
                        A[j]=A[j+1];
                        A[j+1]=temp;
                    }
                        else  if(A[j].compareTo(A[j+1])<0){
                            String temp=A[j];
                            A[j]=A[j+1];
                            A[j+1]=temp;

                    }
                }
                k++;
            }
            for(int j=0;j<x;j++){
                System.out.print(A[j]);
            }

        }

    }
}
