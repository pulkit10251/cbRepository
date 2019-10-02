package com.company.functionandArray.challenges;

import java.util.Scanner;

public class targetsum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int target=s.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int p=A[i]+A[j];
                if(p==target){
                    if(A[i]<A[j])
                        System.out.println(A[i]+" and "+A[j]);
                    else
                        System.out.println(A[j]+" and "+A[i]);
                }
            }
        }
    }

}
