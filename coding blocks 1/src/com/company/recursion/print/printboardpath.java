package com.company.recursion.print;

public class printboardpath {
    public static void main(String[] args) {
        boardpath(0,10,"");
    }
    public static  void boardpath(int current,int end,String result){
        if(current==end){
            System.out.println(result);
            return;
        }else if(current>end){
            return;
        }

        for(int i=1;i<=6;i++){
            current=current+1;
            boardpath(current,end,result+i);

        }
    }
}
