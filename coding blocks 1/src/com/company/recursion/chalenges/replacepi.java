package com.company.recursion.chalenges;

import java.util.Scanner;

public class replacepi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String A=s.next();
            String result=replacep(A);
            System.out.println(result);
        }
    }
    public static String replacep(String A){
        if(A.length()<2){
            return A;
        }
        if(A.startsWith("pi")){
            return 3.14+replacep(A.substring(2,A.length()));
        }
        return A.charAt(0)+replacep(A.substring(1,A.length()));

    }
}