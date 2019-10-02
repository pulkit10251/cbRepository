package com.company.recursion.chalenges;

import java.util.Scanner;

public class towerofhanoi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N;
        N=s.nextInt();
        tower(N,1,2,3);
        int a= (int) (Math.pow(2,N)-1);
        System.out.println(a);
    }
    public static void tower(int N,int A,int B,int C){
        if(N>0){
            tower(N-1,A,C,B);
            System.out.println("move "+N+"th disk from T"+A+" to T"+C);
            tower(N-1,B,A,C);
        }
    }
}
