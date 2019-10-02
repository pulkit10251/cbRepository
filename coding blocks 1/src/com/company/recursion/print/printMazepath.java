package com.company.recursion.print;

public class printMazepath {
    public static void main(String[] args) {
        mazepath(0,0,2,2,"");
    }
    public static void mazepath(int cr,int cc,int er,int ec,String result){
        if(cr==er&&cc==er){
            System.out.println(result);
            return;
        }
        else if(cr>2||cc>2){
            return;
        }
        mazepath(cr,cc+1,er,ec,result+"H");
        mazepath(cr+1,cc,er,ec,result+"V");

    }
}
