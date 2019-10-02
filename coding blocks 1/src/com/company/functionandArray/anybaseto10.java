package com.company.functionandArray;

import java.util.Scanner;

public class anybaseto10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        anybase(a,b);
    }
    public static void anybase(int val,int base){
        int a=val;
        int k=1;
        int ans=0;
        while(a!=0){
            int rem=a%10;
            ans=ans+rem*k;
            k=k*base;
            a=a/10;
        }
        System.out.println(ans);
    }
}
