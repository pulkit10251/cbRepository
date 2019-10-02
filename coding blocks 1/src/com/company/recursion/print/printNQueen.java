package com.company.recursion.print;

public class printNQueen {
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        printQueen(board,0,"");
    }
    public static void printQueen(boolean[][] board,int row,String result){
        if(row==board.length){
            System.out.println(result);
            return;
        }
        for(int col=0;col<board[row].length;col++){
            if(isItsafe(board,row,col)){
                board[row][col]=true;
                printQueen(board,row+1,result+"("+(row+1)+","+(col+1)+")");
                board[row][col]=false;
            }
        }
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
