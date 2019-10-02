package com.company.recursion.print;

public class countmazepathD {
    public static void main(String[] args) {
        int p=countMaze(0,0,2,2);
        System.out.println(p);
    }
    public static int countMaze(int cr,int cc,int er,int ec){
        if(cr==er&&cc==ec){
            return 1;
        }
        else if(cr>er||cc>ec){
            return 0;
        }
        int count=0;
        count=count+countMaze(cr,cc+1,er,ec);
        count=count+countMaze(cr+1,cc,er,ec);
        count=count+countMaze(cr+1,cc+1,er,ec);
        return count;
    }
}
