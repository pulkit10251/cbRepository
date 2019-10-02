package com.company.patterns;

import java.util.Scanner;

public class fibonakiPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] fibbo=new int[100];
        fibbo[0]=0;
        fibbo[1]=1;
        for(int i=2;i<100;i++ ){
           fibbo[i]=fibbo[i-1]+fibbo[i-2];
        }

        for(int i=0;i<10;i++ ){
            System.out.println(fibbo[i]);
        }
        int count=0;
        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++){
                System.out.print(fibbo[count]+"\t");
                count++;
            }
            System.out.println();

        }

    }
}
