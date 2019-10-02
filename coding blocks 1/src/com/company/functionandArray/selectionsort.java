package com.company.functionandArray;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = null;
        A = new int[n];
        enter(A);
        ssort(A);
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

    public static void ssort(int[] A) {
        Scanner s = new Scanner(System.in);
        int counter = 0;

        while (counter < A.length - 1) {
            int min=counter;
            for (int j = counter+1; j <=A.length - 1 ; j++) {
                if (A[j] < A[min]) {
                    min=j;
                }
            }
            Swap(A,min,counter);
            counter++;
        }
    }

    public static void Swap(int[] A, int j,int counter) {
        int temp = A[j];
        A[j] = A[counter];
        A[counter] = temp;
    }
}
