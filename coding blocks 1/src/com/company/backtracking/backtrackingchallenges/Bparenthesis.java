package com.company.backtracking.backtrackingchallenges;

import java.util.Scanner;

public class Bparenthesis {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char[] A=new char[2*n];
        balancedparenthesis(A,n,0,0,0);
    }
    public static void balancedparenthesis(char[] A,int n,int pos,int open,int close){
        if(close==n){
            for(int i=0;i<A.length;i++)
                System.out.print(A[i]);
            System.out.println();
            return;
        }else{
            if(open>close){
                A[pos]=')';
                balancedparenthesis(A,n,pos+1,open,close+1);
            }
            if(open<n){
                A[pos]='(';
                balancedparenthesis(A,n,pos+1,open+1,close);
            }
        }
    }
}
