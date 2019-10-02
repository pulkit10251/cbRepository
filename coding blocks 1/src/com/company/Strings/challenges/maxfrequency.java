package com.company.Strings.challenges;

import java.util.Scanner;

public class maxfrequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        int[] B=new int[256];
        for(int i=0;i<A.length();i++){
            B[A.charAt(i)]++;
        }
        int max=-1;
        char ch =' ';
        for(int i=0;i<A.length();i++){
            if(B[A.charAt(i)]>max) {
                max = B[A.charAt(i)];
                ch=A.charAt(i);
            }
        }
        System.out.println(ch);

    }
}
