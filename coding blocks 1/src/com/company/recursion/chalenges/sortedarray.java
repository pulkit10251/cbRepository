package com.company.recursion.chalenges;

import java.util.Scanner;

public class sortedarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<A.length;i++){
            A[i]=s.nextInt();
        }
        System.out.println(sort(A,0));

    }
    public static boolean sort(int[] A,int start){
        if(start==A.length-1){
            return true;
        }
        if(A[start]<=A[start+1]){
            boolean B=sort(A,start+1);
            return B;

        }
        else
            return false;
    }
}
