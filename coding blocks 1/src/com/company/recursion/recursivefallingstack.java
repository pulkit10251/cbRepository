package com.company.recursion;

import java.util.Scanner;

public class recursivefallingstack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        PI(n);
    }
    public static void PI(int N){
        if(N==0){
            return;
        }
        PI(N-1);
        System.out.println(N);
    }
}
