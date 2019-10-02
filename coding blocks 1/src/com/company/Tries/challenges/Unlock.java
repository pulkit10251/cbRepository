package com.company.Tries.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unlock {
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] A=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
            map.put(A[i],i);
        }
        for(int i=0;i<n;i++){
            if(k<=0){
                break;
            }
            if(A[i]==n-i){
                continue;
            }
            int h=n-i;
            int pos=map.get(h);
            map.put(A[i],pos);
            map.put(A[pos],i);
            int temp=A[pos];
            A[pos]=A[i];
            A[i]=temp;
            k--;
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }


    }
}
