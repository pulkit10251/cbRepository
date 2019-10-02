package com.company.BitMasking.challenges;

import java.util.Scanner;

public class playingWithBits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            setbit(a,b);

        }
    }
    public static void setbit(int a,int b){
        int ans=0;
        for(int i=a;i<=b;i++){
            ans=ans+countBit(i);
        }
        System.out.println(ans);
    }
    public static int countBit(int i){
        int mask=1;
        int count=0;
        while(i>0){
            count+=i&1;
            i>>=1;
        }
        return count;
    }
}
