package com.company.Strings.challenges;

import java.util.Scanner;

public class piyushandpark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int K = s.nextInt();
        int S = s.nextInt();
        String[][] A = new String[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = s.next();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (S > 0) {
                    if (A[i][j].equals("*")) {

                        S = S + 5;
                    } else
                    if (A[i][j].equals(".")) {
                        S = S - 2;

                    }else
                    if (A[i][j].equals("#")) {
                        break;


                    }
                }
                System.out.println(S);
                S--;
                if (j == M - 1) {
                    S++;
                }
                System.out.println(S);
            }


        }

        if (S >= K) {
            System.out.println("Yes");
            System.out.println(S);
        } else
            System.out.println("No");


    }
}
