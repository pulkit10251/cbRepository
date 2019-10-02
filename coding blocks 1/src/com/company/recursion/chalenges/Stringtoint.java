package com.company.recursion.chalenges;

import java.util.Scanner;

public class Stringtoint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.next();
        int ans=convert(num,0,0);
        System.out.println(ans);
    }
    public static int convert(String A,int result,int i){
        if(i==A.length()){
            return result;
        }
        char ch=A.charAt(i);
        int ans=Character.getNumericValue(ch);
        result=result*10+ans;
        int anss=convert(A,result,i+1);
        return anss;
    }
}
