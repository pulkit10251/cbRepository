package com.company.functionandArray.challenges;

import java.util.Scanner;

public class formbignu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=0;row<n;row++){
            int a=s.nextInt();
            String[] A=new String[a];
            for(int i=0;i<a;i++){
                A[i]=s.next();
            }
            int count=a;
            while(count>0){
                for(int i=0;i<a-1;i++){
                    if(A[i].compareTo(A[i+1])<0){
                        String temp=A[i];
                        A[i]=A[i+1];
                        A[i+1]=temp;
                    }
                }
                count--;
            }
            for(int i=0;i<a;i++){
                System.out.print(A[i]);
            }


        }
    }
}
