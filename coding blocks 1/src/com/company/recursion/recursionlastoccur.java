package com.company.recursion;

import java.util.Scanner;

public class recursionlastoccur {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] A={3,5,7,9,4,4,5,5,6,4};
        int k=s.nextInt();
        int ans=last(A,0,k);
        System.out.println(ans);


    }
    public static int last(int[] A,int i,int k){
        if(i==A.length){
            return -1;
        }
        if(A[i]==k){
            int p=last(A,i+1,k);
            if(p==-1){
                return i;
            }
            else
                return p;
        }
        else{
            int p=last(A,i+1,k);
            return p;
        }

    }
}
