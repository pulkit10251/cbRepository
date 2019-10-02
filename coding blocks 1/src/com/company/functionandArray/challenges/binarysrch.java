package com.company.functionandArray.challenges;

import java.util.Scanner;

public class binarysrch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=null;
        A=new int[n];
        for(int i=0;i<A.length;i++){
            A[i]=s.nextInt();
        }
        int index=s.nextInt();
        int p=bsearch(A,index);
        if(p==-1){
            System.out.println(-1);
        }
        else
            System.out.println(p);
    }

    public static int bsearch(int[] A,int index){
        Scanner s=new Scanner(System.in);
        int lo=0;
        int hi=A.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(A[mid]<index){
                lo=mid+1;
            }
            else if(A[mid]>index){
                hi=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
