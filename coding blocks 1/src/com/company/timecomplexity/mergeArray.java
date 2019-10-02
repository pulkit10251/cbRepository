package com.company.timecomplexity;

public class mergeArray {
    public static void main(String[] args) {
        int[] A={10,20,30,40,50};
        int[] B={5,15,30,45,60,70,90};

        int[] ans=merge(A,B);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }
    }
    public static int[] merge(int[] A,int[] B){
        int[] merged=new int[A.length+B.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<A.length&&j<B.length){
            if(A[i]<=B[j]){
                merged[k]=A[i];
                k++;
                i++;
            }
            else{
                merged[k]=B[j];
                k++;
                j++;
            }
        }
        if(i==A.length){
            while(j<B.length){
                merged[k]=B[j];
                k++;
                j++;
            }
        }
        else{
            while(i<A.length) {
                merged[k] = A[i];
                k++;
                i++;
            }
        }
        return merged;
    }
}
