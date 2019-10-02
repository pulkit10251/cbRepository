package com.company.functionandArray.challenges;

import java.util.Scanner;

public class bubblesrt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = null;
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextInt();
        }
        bsort(A);
        display(A);
    }

    public static void display(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
    public static void bsort(int[] A) {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while (counter < A.length - 1) {
            for (int j = 0; j < A.length - 1 - counter; j++) {
                if (A[j] > A[j + 1]) {
                    Swap(A, j);
                }
            }
            counter++;
        }
    }

    public static void Swap(int[] A, int j) {
        int temp = A[j];
        A[j] = A[j + 1];
        A[j + 1] = temp;
    }
}
