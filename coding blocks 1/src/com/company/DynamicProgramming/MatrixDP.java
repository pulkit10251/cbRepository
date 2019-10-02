package com.company.DynamicProgramming;

public class MatrixDP {
    public static void main(String[] args) {
        int[] A={40,20,10,20,30};
        System.out.println(MatrixChain(A,1,A.length-1));
    }
    public static int MatrixChain(int[] matrix,int i,int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=MatrixChain(matrix,i,k) + MatrixChain(matrix,k+1,j) +matrix[i-1]*matrix[k]*matrix[j];
            ans=Math.min(ans,temp);
        }
        return ans;
    }
}
