package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;
import java.util.Vector;

public class MinimumMoneyneeded {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int w=s.nextInt();
        int[] A=new int[w];
        for(int i=0;i<w;i++){
            A[i]=s.nextInt();
        }
//        int[] B={20,10,4,50,100};
        System.out.println(MinimumCost(A,w,w));

    }
    public static int MinimumCost(int cost[],int n,int w){

        Vector<Integer> val=new Vector<Integer>();
        Vector<Integer> wt=new Vector<Integer>();

        int size=0;

        for(int i=0;i<n;i++){
            if(cost[i]!=-1){
                val.add(cost[i]);
                wt.add(i+1);
                size++;
            }
        }
        n=size;
        int[][] min_cost=new int[n+1][w+1];
        for(int i=0;i<=w;i++){
            min_cost[0][i]=Integer.MAX_VALUE;
        }

        for(int i=1;i<=n;i++){
            min_cost[i][0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt.get(i-1)>j){
                    min_cost[i][j]=min_cost[i-1][j];
                }else{
                    min_cost[i][j]=Math.min(min_cost[i-1][j],min_cost[i][j-wt.get(i-1)]+val.get(i-1));
                }
            }
        }
        if(min_cost[n][w]<0){
            return -1;
        }else
        return min_cost[n][w];
    }
}
