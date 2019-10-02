package com.company.recursion.print;

public class printmazepathD {
    public static void main(String[] args) {
        mazepath(0,0,2,2,"");
    }
    public static void mazepath(int cr,int cc,int er,int ec,String result){
        if(cr==er&&cc==er){
            System.out.println(result);
            return;
        }
        else if(cr>er||cc>ec){
            return;
        }
        mazepath(cr,cc+1,er,ec,result+"H");
        mazepath(cr+1,cc,er,ec,result+"V");
        mazepath(cr+1,cc+1,er,ec,result+"D");


    }
}
