package com.company.Strings.challenges;

import java.util.Scanner;

public class SanketandString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        StringBuilder B=new StringBuilder(A);
        int k=s.nextInt();
        int p=count(A,'a');
        int q=count(A,'b');
        System.out.println(p);
        System.out.println(q);
        if(p>q){

        }

    }
    public static int count(String A,char b){
        int c=0;
        for(int i=0;i<A.length();i++){
            if (A.charAt(i)==b){
                c++;
            }
        }
        return c;
    }
    public static void Ans(StringBuilder B,char b){
        char[] D=new char[B.length()];
        for(int i=0;i<B.length();i++){
            if(B.charAt(i)==b)
            D[i]=B.charAt(i);
        }
    }
}
