package com.company.backtracking;

public class coinChangepermu {
    public static void main(String[] args) {
        int[] A={2,3,5,6};
        coin(A,10,"");
    }
    public static void coin(int[] A,int sum,String ans){
        if(sum==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<A.length;i++) {
            if(sum>=A[i])
                coin(A,sum-A[i],ans+A[i]);
        }
    }
}
