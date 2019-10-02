package com.company.recursion.chalenges;

import java.util.Scanner;

public class optimalgameStrategy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        gameStrategy(A, 0, A.length-1,0,0,0);


    }

    public static void gameStrategy(int[] A, int front, int end,int ans1,int ans2,int k) {
       if(k==A.length){
               System.out.println(ans1);
               System.out.println(ans2);
               return;

       }
        if(k%2==0) {
            if (A[front] > A[end]) {
                gameStrategy(A, front + 1, end, ans1 + A[front],ans2, k + 1);

            } else {
                gameStrategy(A, front, end - 1, ans1 + A[end], ans2,k + 1);
            }
        }else{
            if(A[front]>A[end]){
                gameStrategy(A,front+1,end,ans1,ans2+A[front],k+1);
            }else{
                gameStrategy(A,front,end-1,ans1,ans2+A[end],k+1);
            }
        }
    }
}
