package com.company.functionandArray;

import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = null;
        A = new int[n];
        enter(A);
        isort(A);
        display(A);
    }

    public static void display(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public static void enter(int[] A) {
        System.out.println("enter element:");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextInt();
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
