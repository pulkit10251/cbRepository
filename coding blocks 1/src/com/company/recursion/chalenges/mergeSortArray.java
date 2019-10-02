package com.company.recursion.chalenges;

import java.util.Scanner;

public class mergeSortArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int val:A){
            A[val]=s.nextInt();
        }
        int[] result=mergeSort(A,0,A.length-1);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] mergeSort(int[] A, int lo, int hi) {

        if(lo==hi){
            int[] base=new int[1];
            base[0]=A[lo];
            return base;
        }
        int mid = (lo + hi) / 2;
        int[] fh = mergeSort(A, lo, mid);
        int[] sh = mergeSort(A, mid + 1, hi);
        int[] ans=merge(fh,sh);
        return ans;

    }
    public static int[] merge(int[] A,int[] B){
        int[] merged=new int[A.length+B.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<A.length&&j<B.length){
            if(A[i]<=B[j]){
                merged[k]=A[i];
                k++;
                i++;
            }
            else{
                merged[k]=B[j];
                k++;
                j++;
            }
        }
        if(i==A.length){
            while(j<B.length){
                merged[k]=B[j];
                k++;
                j++;
            }
        }
        else{
            while(i<A.length) {
                merged[k] = A[i];
                k++;
                i++;
            }
        }
        return merged;
    }
}
