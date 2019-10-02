package com.company.recursion;

import java.util.ArrayList;

public class mazepathdiag {
    public static void main(String[] args) {
        System.out.println(mazepathdiag(0,0,2,2));
    }
    public static ArrayList<String> mazepathdiag(int cr, int cc, int er, int ec){
        if(cr==er&&cc==ec){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        else if(cr>er||cc>ec){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }
        ArrayList<String> rh=mazepathdiag(cr,cc+1,er,ec);
        ArrayList<String> result=new ArrayList<>();
        for(String rr:rh){
            result.add("H"+rr);
        }
        ArrayList<String> rv =mazepathdiag(cr+1,cc,er,ec);
        for(String rr:rv){
            result.add("V"+rr);
        }
        ArrayList<String> rd=mazepathdiag(cr+1,cc+1,er,ec);
        for(String rr:rd){
            result.add("D"+rr);
        }
        return result;
    }
}
