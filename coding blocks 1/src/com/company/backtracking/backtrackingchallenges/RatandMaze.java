package com.company.backtracking.backtrackingchallenges;

import java.util.Scanner;

public class RatandMaze {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        String[] A=new String[n];
        int[][] ans=new int[n][m];
        for(int i =0;i<n;i++){
            A[i]=s.next();
        }
        if (rat(A, ans, n, m, 0, 0)) {

            print(ans, n, m);
        }else
        System.out.println("NO PATH FOUND");


    }

    public static boolean rat(String[] A, int[][] ans, int n, int m, int x, int y) {
        if (x == n - 1 && y == m - 1) {
            ans[x][y] = 1;
            return true;
        }
        if (isitright(A, n, m, x, y)) {
            ans[x][y] = 1;
            if (rat(A, ans, n, m, x, y+1)) {
                return true;
            }
            if (rat(A, ans, n, m, x +1, y)) {
                return true;
            }
            ans[x][y] = 0;
            return false;
        }
        return false;

    }

    public static boolean isitright(String[] A, int n, int m, int x, int y) {
        if (x < n && y < m && A[x].charAt(y) == 'O') {
            return true;
        }
        return false;
    }

    public static void print(int[][] ans, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
