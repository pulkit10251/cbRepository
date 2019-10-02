package com.company.recursion;

import java.util.Scanner;

public class recursionnallindices {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] A={3,8,1,8,8,4};
        int k=s.nextInt();
        int[] B=array(A,0,k,0);
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
    }
    public static int[] array(int[] A,int i,int k,int count){

        int[] B=null;
        if(i==A.length){
            int[] base=new int[count];
            return base;
        }


        if(A[i]==k){
            B=array(A,i+1,k,count+1);
        }else {
            B=array(A,i+1,k,count);
        }
        if(A[i]==k){
            B[count]=i;
        }
        return B;

    }
}
