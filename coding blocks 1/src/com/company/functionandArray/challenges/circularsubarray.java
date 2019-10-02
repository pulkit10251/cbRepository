package com.company.functionandArray.challenges;

import java.util.Scanner;

public class circularsubarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=0;row<n;row++){
            int a=s.nextInt();
            int[] A=new int[a];
            for(int i=0;i<a;i++){
                A[i]=s.nextInt();
            }
            cirsubarray(A);
        }
    }
    public static void cirsubarray(int[] A){
        int max_kedane=kedane(A);
        int a=A.length;
        int max_wrap=0;
        for(int i=0;i<a;i++){
            max_wrap=max_wrap+A[i];
            A[i]=-A[i];
        }
        max_wrap=max_wrap+kedane(A);
        if(max_wrap>max_kedane){
            System.out.println(max_wrap);
        }
        else
            System.out.println(max_kedane);

    }
    public static int kedane(int[] A){
        int a=A.length;
        int ans=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<a;i++){
            end=end+A[i];
            if(ans<end){
                ans=end;
            }
            if(end<0){
                end=0;
            }
        }
        return ans;

    }
}


