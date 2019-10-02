package com.company.functionandArray.challenges;

import java.util.Scanner;

public class bookallocation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int row=0;row<n;row++){
            int a=s.nextInt();
            int b=s.nextInt();
            int[] A=new int[a];
            for(int i=0;i<a;i++){
                A[i]=s.nextInt();
            }
            int ans=findpages(A,a,b);
            System.out.println(ans);
        }
    }
    public static int findpages(int[] A,int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+A[i];
        }
        int start=0;
        int end=sum;
        int result=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(isposible(A,n,m,mid)){
                result=Math.min(result,mid);
                end=mid-1;
            }
            else
                start=mid+1;

        }



        return result;
    }

    static boolean isposible(int[] A, int n, int m, int cur_min) {
        int sr=1;
        int cur_sum=0;
        for(int i=0;i<n;i++){
            if(A[i]>cur_min){
                return false;
            }
            if(cur_sum+A[i]>cur_min){
                cur_sum=A[i];
                sr++;
                if(sr>m){
                    return false;
                }
            }
            else{
                cur_sum=cur_sum+A[i];
            }

        }

        return true;
    }
}
