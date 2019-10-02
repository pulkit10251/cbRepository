package com.company.backtracking;

public class coinChangeCombi {
    public static void main(String[] args) {
       int[] A={2,3,5,6};
        coin(A,10,"",0);
    }
    public static void coin(int[] A,int sum,String ans,int a){
        if(sum==0){
           System.out.println(ans);
           return;
       }

        for(int i=a;i<A.length;i++) {
            if(sum>=A[i])
            coin(A,sum-A[i],ans+""+A[i],i);
        }
    }
}
