package com.company.Strings.challenges;

import java.util.Scanner;

public class stringdifference {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        StringBuilder B=new StringBuilder(A);
        int j=1;
        for(int i=0;i<A.length()-1;i++){
            int a=A.charAt(i);
            int b=A.charAt(i+1);
            int c=b-a;
            String P=Integer.toString(c);
            int h=P.length();
            B.insert(j,P);
            j=j+h+1;

        }
        System.out.println(B);
    }
}
