package com.company.functionandArray;

import java.util.Scanner;

public class aisehi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String  b=s.next();
        int n = s.nextInt();
        String[][] str = new String[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                str[i][j] = s.next();
            }
        }
        sort(str, n);
        sortq(str, n);
        display(str, n,b);


    }

    public static void display(String[][] str, int n,String b) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (str[i][1].compareTo(b) > 0)
                    System.out.print(str[i][j] + " ");
                }
                System.out.println();

        }
    }

    public static void sort(String[][] A, int n) {
        int counter = 0;
        while (counter != n) {
            for (int i = 0; i < n - 1-counter; i++) {
                if (A[i][1].compareTo(A[i + 1][1]) < 0) {
                    for (int j = 0; j < 2; j++) {
                        String temp = A[i+1][j];
                        A[i+1][j] = A[i][j];
                        A[i][j] = temp;
                    }
                }
            }
            counter++;
        }
    }

    public static void sortq(String[][] A, int n) {
        int count = 0;
        while (count != n) {
            for (int i = 0; i < n-1; i++) {
                if(A[i][1].compareTo(A[i+1][1])==0) {
                    for (int j = 0; j < n; j++) {
                        if (A[i][0].compareTo(A[i + 1][0]) > 0) {
                            String temp = A[i][0];
                            A[i][0] = A[i + 1][0];
                            A[i + 1][0] = temp;
                        }
                    }
                }

            }
            count++;
        }
    }
}