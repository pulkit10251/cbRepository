package com.company.functionandArray.challenges;

import java.util.Scanner;

public class chewbcca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long p = n;
        long k = n;
        long count = 0;
        long[] A;
        while (p != 0) {
            p = p / 10;
            count++;
        }
        A = new long[(int) count];
        while (k != 0) {
            for (long i = 0; i < A.length; i++) {
                A[(int) i] = k % 10;
                k = k / 10;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 5) {
                A[i] = 9 - A[i];
            }

            if (A[A.length - 1] == 0) {
                A[A.length-1] = 9;
            }
        }

        long ans = 0;
        long h = 1;
        for (int g = 0; g < A.length; g++) {
            ans = ans + h * A[g];
            h = h * 10;
        }

        System.out.println(ans);
    }
}
