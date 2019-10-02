package com.company.recursion.chalenges;

import java.util.Scanner;

public class smartkeypad1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String table[] = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String A=s.next();
        print(table,A,"");

    }
    public static void print(String[] table,String A,String result){
        if(A.length()==0){
            System.out.println(result);
            return;
        }

        int i=Character.getNumericValue(A.charAt(0));
        for(int j=0;j<table[i].length();j++){
            char b=table[i].charAt(j);
            print(table,A.substring(1),result+b);
        }
    }
}
