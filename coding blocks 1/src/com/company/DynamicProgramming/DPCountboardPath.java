package com.company.DynamicProgramming;

import java.util.Scanner;

public class DPCountboardPath {
    public static long start;
    public static long end;
    public static void startAlgo(){
        start=System.currentTimeMillis();
    }
    public static long endAlgo(){
        end=System.currentTimeMillis();
        return end-start;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n+1];
        startAlgo();
        System.out.println(boardpath(0,n));
        System.out.println("Cbp Normal took time: "+endAlgo()+" ms");

        startAlgo();
        System.out.println(boardpathRS(0,n,A));
        System.out.println("Cbp RS took time: "+endAlgo()+" ms");

        startAlgo();
        System.out.println(boardpathIS(n));
        System.out.println("Cbp IS took time: "+endAlgo()+" ms");

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
    public static  int boardpathRS(int current,int end, int[] A){
        if(current==end){
            return 1;
        }else if(current>end){
            return 0;
        }
        if(A[current]!=0){
            return A[current];
        }
        int count=0;
        for(int i=1;i<=6;i++){

            count=count+boardpathRS(current+i,end,A);

        }
        A[current]=count;
        return count;
    }
    public static int boardpathIS(int end){
        int[] A=new int[end+1];
        A[end]=1;
        for(int i=end-1;i>=0;i--){
            int count=0;
            for(int dice=1;dice<=6 && dice+i< A.length;dice++){
                    count=count+A[dice+i];
            }
            A[i]=count;
        }
        return A[0];

    }
}
