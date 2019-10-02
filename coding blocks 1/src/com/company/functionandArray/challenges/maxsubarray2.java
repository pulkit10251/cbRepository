package com.company.functionandArray.challenges;

import java.util.Scanner;

public class maxsubarray2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 0; row < n; row++) {
            int a = s.nextInt();
            int[] A = new int[a];
            for (int i = 0; i < a; i++) {
                A[i] = s.nextInt();
            }
            int ans=Integer.MIN_VALUE;
            int end=0;
            for(int i=0;i<a;i++){
                end=end+A[i];
                if(ans<end){
                    ans=end;
                }
                if(end<0){
                    end=0;
                }
            }
            System.out.println(ans);


        }
    }
}

