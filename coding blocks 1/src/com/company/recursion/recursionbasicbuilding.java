package com.company.recursion;

import java.util.Scanner;

public class recursionbasicbuilding {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        P(n);
    }
    public static void P(int N){
        if(N==0){
            return;
        }
        System.out.println(N);
        P(N-1);
    }
}
