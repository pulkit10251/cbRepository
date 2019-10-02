package com.company.functionandArray.challenges;

import java.util.Scanner;

public class sortgame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        String[] str = new String[x];
        int[] sal = new int[x];
        for (int i = 0; i < x; i++) {
                str[i] = s.next();
            sal[i] = s.nextInt();

        }
        sort(sal, str);
        sortq(sal, str, x);
        display(sal, str, n);

    }

    public static void sortq(int[] A, String[] B, int n) {
        int counter=0;
        while(counter!=n){
        for (int i = 0; i < n-1; i++) {

            if (A[i] == A[i + 1]) {
                for(int j=i+1;j<n;j++) {
                    if (B[i].compareTo(B[j]) > 0) {
                        String temp = B[i];
                        B[i] = B[j];
                        B[j] = temp;
                    }

                }
            }
        }
        counter++;
        }
    }

    public static void display(int[] A, String[] B, int p) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= p) {
                System.out.print(B[i] + " ");
                System.out.println(A[i]);
            }
        }
    }

    public static void sort(int[] A, String[] B) {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while (counter < A.length - 1) {
            for (int j = 0; j < A.length - 1 - counter; j++) {
                if (A[j] < A[j + 1]) {
                    Swap(A, j);
                    Swapi(B, j);
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

    public static void Swapi(String[] B, int j) {
        String temp = B[j];
        B[j] = B[j + 1];
        B[j + 1] = temp;
    }
}
