package com.company.StackqueuE.challenges;

import com.sun.istack.internal.NotNull;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StrongestFighter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int k = s.nextInt();
        int i;
        for (i = 0; i < k; i++) {
            queue.add(A[i]);
        }
        Queue<Integer> helper = new LinkedList<>();
        int max = 0;
        int l = 0;

        while (l < k) {
            int c = queue.element();
            if (c > max) {
                max = c;
            }
            helper.add(queue.remove());
            l++;
        }
        queue = helper;
        System.out.println(max);
        //int Max=max(queue,k);
        for (int j = 0; j < n - k; j++, i++) {
            queue.remove();
            queue.add(A[i]);
            helper = new LinkedList<>();
            max = 0;
            l = 0;

            while (l < k) {
                int c = queue.element();
                if (c > max) {
                    max = c;
                }
                helper.add(queue.remove());
                l++;
            }
            queue = helper;
            System.out.println(max);

        }


    }

}
