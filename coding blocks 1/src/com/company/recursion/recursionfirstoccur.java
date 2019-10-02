package com.company.recursion;

import java.util.Scanner;

public class recursionfirstoccur {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] A={6,8,1,1,8,3,4};
        int k=s.nextInt();
        int B=srch(A,0,k);
        if(B==-1){
            System.out.println("not present");
        }else
        System.out.println(B+1);
    }
    public static int srch(int[] A,int i,int k){
        if(i==A.length){
            return -1;
        }

        int B;
        if(A[i]==k){
            return i;
        }
        else {
            B = srch(A, i + 1, k);
            return B;
        }

    }
}
