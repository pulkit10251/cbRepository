package com.company.functionandArray;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        display(arr);

    }

    public static void display(int[][] A){
        for(int i=0;i<3;i++){
        if(i%2==0){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+"\t");
            }
        }
        else{
            for(int j=A[i].length-1;j>=0;j--)
                System.out.print(A[i][j]+"\t");
        }
            
      }
    }
}
