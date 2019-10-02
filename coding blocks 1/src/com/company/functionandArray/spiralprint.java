package com.company.functionandArray;

public class spiralprint {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[top].length - 1;
        int dir = 1;
        int count = (bottom + 1) * (right + 1);
        while (top <= bottom && left <= right) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(arr[top][i] + "\t");
                        count--;
                    }
                    dir = 2;
                    top++;
                }
            }
            if (count > 0) {
                if (dir == 2) {
                    for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right] + "\t");
                        count--;
                    }
                    dir = 3;
                    right--;

                }
            }
            if (count > 0) {
                if (dir == 3) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i] + "\t");
                        count--;
                    }
                    dir = 4;
                    bottom--;
                }
            }
            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left] + "\t");
                        count--;
                    }
                    dir = 1;
                    left++;
                }
            }
        }
    }
}
