package com.company.backtracking.backtrackingchallenges;

import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = s.nextInt();
            }
        }
        if(Ssolver(A,n)){
            display(A,n);
        }

    }

    public static boolean Ssolver(int[][] A,int n) {
        int row=-1,col=-1;
        boolean isEmpty=true;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }

            if (!isEmpty) {
                break;
            }
        }
        if(isEmpty){
            return true;
        }
        for(int num=1;num<=n;num++){
            if(isItcorrect(A,row,col,num,n)){
                A[row][col]=num;
                if(Ssolver(A,n)){
                    return true;
                }
                A[row][col]=0;
            }
        }


        return false;


    }
    public static void display(int[][] A,int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static boolean isItcorrect(int[][] A, int row, int col, int k,int n) {
        for (int i=0;i<n;i++) {
          if(A[i][col]==k){
              return false;
          }
        }
        for(int i=0;i<n;i++){
            if(A[row][i]==k){
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(A.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++)
        {
            for (int d = boxColStart; d < boxColStart + sqrt; d++)
            {
                if (A[r][d] == k)
                {
                    return false;
                }
            }
        }

        return true;
    }
}



