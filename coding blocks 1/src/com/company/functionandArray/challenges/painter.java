package com.company.functionandArray.challenges;

import java.util.Scanner;

public class painter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int d=k;
        int n = s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int lo=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(A[i]>lo){
                lo=A[i];
            }
        }
        int hi=0;
        for(int i=0;i<n;i++){
            hi=hi+A[i];
        }
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            int total =0;
            int np=1;
            for(int i=0;i<n;i++){
                total+=A[i];
                if(total>mid){
                    total=A[i];
                    np++;
                }
            }
            if(np<=k){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(lo);

    }


}
