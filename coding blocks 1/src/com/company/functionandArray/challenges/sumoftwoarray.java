package com.company.functionandArray.challenges;

import java.util.Scanner;

public class sumoftwoarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < B.length; i++) {
            B[i] = s.nextInt();
        }
        int ans1=0;
        int ans2=0;
        int k=1;
        for(int i=n-1;i>=0;i--){
            ans1=ans1+k*A[i];
            k=k*10;
        }
        int g=1;
        for(int i=m-1;i>=0;i--){
            ans2=ans2+g*B[i];
            g=g*10;
        }
        int ans=ans1+ans2;
        int j=ans;

        int i=0;
        int h;
        if(m>n){
            h=m;
        }
        else{
            h=n;
        }
        int d=0;
        while(j!=0){
            j=j/10;
            d++;
        }
        j=ans;

        int[] C=new int[d];
        while(j!=0){
            C[i]=j%10;
            j=j/10;
            i++;
        }

        for(int z=C.length-1;z>=0;z--){
            System.out.print(C[z]+", ");
        }
        System.out.println("END");
    }
}