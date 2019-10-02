package com.company.recursion;

import java.util.Scanner;

public class recursionArraysorted {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] A={3,8,9,10,90,778};
        boolean B=sort(A,0);
        if(B==true){
            System.out.println("yes");

        }
        else
            System.out.println("No");
    }
    public static boolean sort(int[] A,int si){
        if(si==A.length-1){
            return true;
        }
        if(A[si]<A[si+1]){
         boolean B = sort(A,si+1);
         return B;
        }
        else
            return false;

    }
}
