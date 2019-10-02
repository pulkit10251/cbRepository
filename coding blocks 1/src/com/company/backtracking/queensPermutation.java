package com.company.backtracking;

public class queensPermutation {
    public static void main(String[] args) {
        boolean[] A=new boolean[4];
        Queen(A,2,0,"");
    }
    public static void Queen(boolean[] A,int tq,int qp,String ans){
        if(qp==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<A.length;i++){
            if(!A[i]){
                A[i]=true;
                Queen(A,tq,qp+1,ans+"Q"+qp+" "+"B"+i+" ");
                A[i]=false;
            }
        }
    }
}
