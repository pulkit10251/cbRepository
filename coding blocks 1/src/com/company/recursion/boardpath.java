package com.company.recursion;

import java.util.ArrayList;

public class boardpath {
    public static void main(String[] args) {
        System.out.println(boardpath(0,10));
    }
    public static ArrayList<String> boardpath(int curr, int end){
        int sum=0;
        if(curr==end){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        else if(curr>end){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }

        ArrayList<String> result=new ArrayList<>();
        for(int i=1;i<=6;i++){
            StringBuilder A=new StringBuilder();
            ArrayList<String> recursion=boardpath(curr+i,end);
            for(String rrs:recursion){
                result.add(i+rrs);
            }
        }
        return result;
    }
}
