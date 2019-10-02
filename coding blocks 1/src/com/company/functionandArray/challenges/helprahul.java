package com.company.functionandArray.challenges;

import java.util.Scanner;

public class helprahul {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int val=s.nextInt();
        int p=linearsrch(A,val);
        if(p==-1)
            System.out.println("-1");
        else
            System.out.println(p);

    }


    public static int linearsrch(int[] arr,int val){
        int g=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)
                g=i;
        }
        if(g!=-1)
            return g;
        else
            return -1;
    }
}
