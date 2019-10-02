package com.company.recursion;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        System.out.println(getp("aba"));

    }
    public static ArrayList<String> getp(String A){
        if(A.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;

        }
        char c=A.charAt(0);
        String B=A.substring(1);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> recursion=getp(B);
        for(String a:recursion){
            for(int j=0;j<=a.length();j++){
               String val=a.substring(0,j)+c+a.substring(j);
               result.add(val);
            }

        }
        return result;
    }
}
