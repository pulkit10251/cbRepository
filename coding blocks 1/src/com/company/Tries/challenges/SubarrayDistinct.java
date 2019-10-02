package com.company.Tries.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayDistinct {
    public static int Length(int[] A,int n){
        Set<Integer> s=new HashSet<>();
        int j=0,ans=0;
        for (int i = 0; i < n; i++)
        {
            while (j < n && !s.contains(A[j]))
            {
                s.add(A[i]);
                j++;
            }

            ans += ((j - i+1) * (j - i + 2)) / 2;
            s.remove(A[i]);
        }
        return ans;


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        System.out.println(Length(A,n));

    }
}
