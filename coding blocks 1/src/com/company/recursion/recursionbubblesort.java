package com.company.recursion;

public class recursionbubblesort {
    public static void main(String[] args) {
        int [] A={50,40,20,30,10};
        bsort(A,0,A.length-1);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void bsort(int[] A,int i,int l){
       if(l==0){
           return;
       }
        if(i==l){
            bsort(A,0,l-1);
            return;
        }

        if(A[i]>A[i+1]){
            int temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
        }
            bsort(A,i+1,l);

    }
}
