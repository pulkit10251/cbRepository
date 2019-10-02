package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class optimalGAMEstrategy2 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        //System.out.println(strategy(A,0,A.length-1,sum));
        int[][] B=strategyIS(A,0,A.length-1,0);
        //        for(int i=0;i<n;i++){
        //            for(int j=0;j<n;j++){
        //                System.out.print(B[i][j]+"    ");
        //            }
        //            System.out.println();
        //        }
        System.out.println(B[0][n-1]);

    }
    public static int strategy(int[] val,int front,int end,int sum) {
        if(end==front+1){
            return Math.max(val[front],val[end]);
        }

        int fac1=sum - strategy(val,front+1,end,sum - val[front]);
        int fac2=sum - strategy(val,front,end-1,sum-val[end]);

        return Math.max(fac1,fac2);
    }
    public static int[][] strategyIS(int[] val,int front,int end,int sum){
        int table[][] = new int[val.length][val.length];
        int gap, i, j, x, y, z;

        // Fill table using above recursive formula.
        // Note that the tableis filled in diagonal
        // fashion (similar to http:// goo.gl/PQqoS),
        // from diagonal elements to table[0][n-1]
        // which is the result.
        for (gap = 0; gap < val.length; ++gap) {
            for (i = 0, j = gap; j < val.length; ++i, ++j) {

                // Here x is value of F(i+2, j),
                // y is F(i+1, j-1) and z is
                // F(i, j-2) in above recursive formula
                x = ((i + 2) <= j) ? table[i + 2][j] : 0;
                y = ((i + 1) <= (j - 1)) ? table[i + 1][j - 1] : 0;
                z = (i <= (j - 2)) ? table[i][j - 2] : 0;

                table[i][j] = Math.max(val[i] + Math.min(x, y),
                        val[j] + Math.min(y, z));
            }
        }

        return table;

    }
}
