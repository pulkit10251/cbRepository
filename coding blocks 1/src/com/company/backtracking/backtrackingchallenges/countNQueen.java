package com.company.backtracking.backtrackingchallenges;

import java.util.Scanner;

public class countNQueen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean[][] board=new boolean[n][n];
        int p=countQueen(board,0);
        System.out.println(p);
    }
    public static int countQueen(boolean[][] board,int row){
       if(row==board.length){
           return 1;
       }
        int count=0;
        for(int col=0;col<board[row].length;col++){
            if(isItsafe(board,row,col)){
                board[row][col]=true;
                count=count+countQueen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    private static boolean isItsafe(boolean[][] board,int row,int column){
        for(int i=row;i>=0;i--){
            if(board[i][column]){
                return false;
            }
        }
        for(int i=row,j=column;i>=0&&j>=0;i--,j--){

            if(board[i][j]){
                return false;
            }
        }
        for(int i=row,j=column;i>=0&&j<board.length;i--,j++){

            if(board[i][j]){
                return false;
            }
        }
        return true;

    }
}
