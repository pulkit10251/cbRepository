package com.company.recursion;

import java.util.ArrayList;

public class getsubsequence {
    public static void main(String[] args) {
        System.out.println(getss(""));
        System.out.println(getssASCII("ab"));
    }
    public static ArrayList<String> getss(String A){
        if(A.length()==0){
            ArrayList<String> baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;

        }

        char c=A.charAt(0);
        String B=A.substring(1);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> recursion=getss(B);
        for(int i=0;i<recursion.size();i++){
            result.add(recursion.get(i));
            result.add(c+recursion.get(i));
        }
        return  result;
    }
    public static ArrayList<String> getssASCII(String A){
       if(A.length()==0){
           ArrayList<String> basecase=new ArrayList<>();
           basecase.add("");
           return basecase;
       }
        char c=A.charAt(0);
        String B=A.substring(1);
        int a=c;
        String z=Integer.toString(a);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> recursion=getssASCII(B);
        for(int i=0;i<recursion.size();i++){
            result.add(recursion.get(i));
            result.add(c+recursion.get(i));
            result.add(z+recursion.get(i));
        }
        return result;
    }
}
