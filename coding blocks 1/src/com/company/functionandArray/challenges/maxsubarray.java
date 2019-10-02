package com.company.functionandArray.challenges;

import java.util.Scanner;

public class maxsubarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=0;row<n;row++){
            int a=s.nextInt();
            int[] A=new int[a];;
            for(int i=0;i<a;i++){
                A[i]=s.nextInt();
            }

            int count=0;
            int[] max=new int[((a-1)*(a)/2)-1];

                int k=a;
                while(k>2){
            for(int i=0;i<k-1;i++) {

                int sum = 0;

                    for (int j = i; j < k; j++) {
                        sum = sum + A[j];

                    }
                    max[count] = sum;
                    count++;

                }
                k--;
            }

            int m=max[0];
            for(int i=0;i<max.length;i++){
                if(max[i]>m){
                    m=max[i];
                }
            }
            System.out.println(m);
            int p=Integer.MIN_VALUE;
            System.out.println(p);




        }
    }
}
