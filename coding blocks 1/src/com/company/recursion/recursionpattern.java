package com.company.recursion;

import java.util.Scanner;

public class recursionpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        pattern(k);
    }
    public static void pattern(int k){
        if(k==0){
            return;
        }
        pattern(k-1);
        int p=k;
        while(p>0) {
            System.out.print("*");
            p--;
        }
        System.out.println();
    }
}
