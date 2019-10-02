package com.company.functionandArray.challenges;

import java.util.Scanner;

public class insertionsrt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = null;
        A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextInt();
        }
        isort(A);
        display(A);
    }

    public static void display(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public static void isort(int[] A) {
        Scanner s = new Scanner(System.in);
        for(int counter=1;counter <= (A.length - 1);counter++) {
            int val = A[counter];
            int j = counter -1;
            while (j>=0 &&A[j] > val ) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = val;
        }
    }

    public static void Swap(int[] A, int j) {
        int temp = A[j];
        A[j] = A[j + 1];
        A[j + 1] = temp;
    }
}
