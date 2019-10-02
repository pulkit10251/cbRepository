package com.company.functionandArray.challenges;

import java.util.Scanner;

public class lowuppbound {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int p=s.nextInt();
        for(int j=0;j<p;j++){
            int val=s.nextInt();
            int up=-1;
            int dn=-1;
            for(int i=0;i<n;i++){
                if(A[i]==val){
                    up=i;
                    dn=i;
                    break;
                }
            }
            for(int i=0;i<n;i++){
                if(A[i]==val){
                    dn=i;
                }
            }
            System.out.println(up+" "+dn);
        }
    }
}
