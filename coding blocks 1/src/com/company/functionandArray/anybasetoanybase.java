package com.company.functionandArray;

import java.util.Scanner;

public class anybasetoanybase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int ans=anybase(a,b);
        anybase1(ans,c);
    }
    public static int anybase(int val,int base){
        int a=val;
        int k=1;
        int ans=0;
        while(a!=0){
            int rem=a%10;
            ans=ans+rem*k;
            k=k*base;
            a=a/10;
        }
        return ans;
    }
    public static void anybase1(int val, int base) {
        int a = val;
        int k = 1;
        int ans = 0;
        while (a != 0) {
            int rem = a % base;
            ans = ans + rem * k;
            k = k * 10;
            a = a / base;
        }
        System.out.println(ans);


    }
}
