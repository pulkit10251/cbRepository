package com.company.functionandArray;

import java.util.Scanner;

public class binarysearch {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=null;
        A=new int[n];
        enter(A);
        System.out.println("enter element to be searched for.");
        int index=s.nextInt();
        int p=bsearch(A,index);
        if(p==-1){
            System.out.println("element not found");
        }
        else
            System.out.println("element found at "+ (p+1)+" position");    }
    public static void enter(int[] A){
        System.out.println("enter element:");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<A.length;i++){
            A[i]=s.nextInt();
        }

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
