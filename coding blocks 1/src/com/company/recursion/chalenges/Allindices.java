package com.company.recursion.chalenges;

import java.util.Scanner;

public class Allindices {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int key=s.nextInt();
        indecis(A,key,0);
    }
    public static void indecis(int[] A,int key,int a){
        if(a==A.length){
            return;
        }
        if(A[a]==key){
            System.out.print(a+" ");
        }
        indecis(A,key,a+1);

    }
}
