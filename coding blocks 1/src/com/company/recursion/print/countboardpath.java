package com.company.recursion.print;

public class countboardpath {
    public static void main(String[] args) {
        int p=boardpath(0,10);
        System.out.println(p);
    }
    public static  int boardpath(int current,int end){
        if(current==end){
            return 1;
        }else if(current>end){
            return 0;
        }
        int count=0;
        for(int i=1;i<=6;i++){

            count=count+boardpath(current+i,end);

        }
        return count;
    }

}
