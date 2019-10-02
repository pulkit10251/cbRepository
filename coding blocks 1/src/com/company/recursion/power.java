package com.company.recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=power(x,n);
        System.out.println(p);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int a=power(x,n-1);
        int ans=x*a;
        return ans;
    }
}