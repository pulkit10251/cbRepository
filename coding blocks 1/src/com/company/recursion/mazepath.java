package com.company.recursion;

import java.util.ArrayList;

public class mazepath {
    public static void main(String[] args) {
        System.out.println(mazepath(0,0,2,2));
    }
    public static ArrayList<String> mazepath(int cr, int cc,int er,int ec){
        if(cr==er&&cc==ec){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        else if(cr>er||cc>ec){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }
        ArrayList<String> rh=mazepath(cr,cc+1,er,ec);
        ArrayList<String> result=new ArrayList<>();
        for(String rr:rh){
            result.add("H"+rr);
        }
        ArrayList<String> rv =mazepath(cr+1,cc,er,ec);
        for(String rr:rv){
            result.add("V"+rr);
        }
        return result;
    }
}
