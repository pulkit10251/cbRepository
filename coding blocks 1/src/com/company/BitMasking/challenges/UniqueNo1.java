package com.company.BitMasking.challenges;

import java.util.Scanner;

public class UniqueNo1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<A.length;i++){
            A[i]=s.nextInt();
        }
        System.out.println(getSingle(A,n));

    }
    static int getSingle(int arr[], int n)
    {
        int ones = 0, twos = 0;
        int common_bit_mask;

        for(int i=0; i<n; i++ )
        {
            twos = twos | (ones & arr[i]);


            ones = ones ^ arr[i];


            common_bit_mask = ~(ones & twos);

            ones &= common_bit_mask;


            twos &= common_bit_mask;
        }
        return ones;
    }
}
