package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class mergeSortedll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = s.nextInt();
            for (int j = 0; j < n1; j++) {
                L1.add(s.nextInt());
            }
            int n2 = s.nextInt();
            for (int j = 0; j < n2; j++) {
                L2.add(s.nextInt());
            }
            LinkedList<Integer> list = mergesort(L1, L2);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j)+" ");
            }
        }
    }

    public static LinkedList<Integer> mergesort(LinkedList<Integer> L1, LinkedList<Integer> L2) {
        LinkedList<Integer> list = new LinkedList<>();
        while (!L1.isEmpty() && !L2.isEmpty()) {
            int a = L1.getFirst();
            int b = L2.getFirst();
            if (a <= b) {
                list.add(L1.removeFirst());
            } else {
                list.add(L2.removeFirst());
            }
        }
        if (L1.size() > L2.size()) {
            while (!L1.isEmpty()) {
                list.add(L1.removeFirst());
            }
        } else {
            while (!L2.isEmpty()) {
                list.add(L2.removeFirst());
            }
        }
        return list;
    }
}

