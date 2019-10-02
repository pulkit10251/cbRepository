package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class countBinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            System.out.println(countStrings(n));
        }
    }
    public static  long countStrings(int n)
    {
        long a[] = new long [n];
        long b[] = new long [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }
}
