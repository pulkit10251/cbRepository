package com.company.recursion.chalenges;

import java.util.Scanner;

public class Subsetsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 0; row < n; row++) {
            int a = s.nextInt();
            int[] A = new int[a];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextInt();
            }
            boolean result = getss(A, -1, 0);
            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


        }
    }

    public static boolean getss(int[] A, int sum, int a) {
        if (a == A.length) {
            if (sum == 0) {
                return true;
            } else {
                return false;
            }
        }
        boolean include;
        if (sum == Integer.MIN_VALUE) {
            include = getss(A, A[a], a + 1);
        } else {
            include = getss(A, A[a] + sum, a + 1);
        }
        boolean exclude = getss(A, sum, a + 1);
        return include || exclude;
    }
}