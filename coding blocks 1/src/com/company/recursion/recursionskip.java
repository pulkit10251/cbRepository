package com.company.recursion;

import java.util.Scanner;

public class recursionskip {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        PDI(n);
    }
    public static void PDI(int N){
        if(N==0){
            return;
        }
        if(N%2!=0)
        System.out.println(N);
        PDI(N-1);
        if(N%2==0)
        System.out.println(N);
    }
}
