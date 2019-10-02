package com.company.functionandArray.challenges;

import java.util.Scanner;

public class cbscholorship {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int x=s.nextInt();
        int y=s.nextInt();
        int sc=0;
        for(int i=0;i<N;i++){
            if(M>=x){
                sc++;
                M=M-x;
            }else if(M<x){
                M=M+y;
            }
        }
        System.out.println(sc);
    }
}
