package com.company.timecomplexity;

public class quickSort {
    public static void main(String[] args) {
        int[] A = {40, 20, 90, 30, 70, 10, 80, 60, 50};
        quicksort(A, 0, A.length - 1);
        for (int val : A) {
            System.out.print(val + " ");
        }
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = (lo + hi) / 2;
        int pivot = arr[mid];
        int left = lo;
        int right = hi;

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }


        }
        quicksort(arr, lo, right);
        quicksort(arr, left, hi);
    }
}

