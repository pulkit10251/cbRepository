package com.company.Strings.challenges;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        char[] B=new char[A.length()];
        for(int i=0,j=A.length()-1;i<A.length()||j>=0;i++,j--){
            B[i]= A.charAt(j);
        }
        String C=new String(B);
        if(A.equals(C)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
