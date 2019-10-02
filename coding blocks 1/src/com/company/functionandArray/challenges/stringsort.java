package com.company.functionandArray.challenges;

import java.util.Scanner;

public class stringsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] A = new String[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.next();
        }
        ssort(A, n);
        bsort(A,n);
        display(A, n);
    }
    public static void bsort(String[] A,int n){
        int counter=0;
        while(counter!=n){
        for(int i=0;i<n-1;i++){
            if(A[i+1].contains(A[i])){
                String temp=A[i+1];
                A[i+1]=A[i];
                A[i]=temp;
            }
        }
        counter++;
        }
    }
    public static void ssort(String[] A,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i].compareTo(A[j])>0){
                    String temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }

        }
    }
    public static void display(String[] A,int n){
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
    }
}
