package com.company.functionandArray.challenges;

import java.util.Scanner;

public class spiralprint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = s.nextInt();
            }
        }
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;
        int dir=1;
        int count=(right+1)*(bottom+1);
        while(top<=bottom && left<=right){
            if(count>0){
                if(dir==1){
                    for(int i=left;i<=right;i++){
                        System.out.print(A[top][i]+", ");
                        count--;
                    }
                    top++;
                    dir=2;
                }
            }
            if(count>0){
                if(dir==2){
                    for(int i=top;i<=bottom;i++){
                        System.out.print(A[i][right]+", ");
                        count--;
                    }
                    right--;
                    dir=3;
                }
            }
            if(count>0){
                if(dir==3){
                    for(int i=right;i>=left;i--){
                        System.out.print(A[bottom][i]+", ");
                        count--;
                    }
                    bottom--;
                    dir=4;
                }
            }
            if(count>0){
                if(dir==4){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(A[i][left]+", ");
                        count--;
                    }
                    left++;
                    dir=1;
                }
            }

        }
        System.out.print("END");
    }
}
