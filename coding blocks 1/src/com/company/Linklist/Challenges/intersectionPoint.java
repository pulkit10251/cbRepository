package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class intersectionPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            list1.add(s.nextInt());
        }
        int m = s.nextInt();
        for (int i = 0; i < m; i++) {
            list2.add(s.nextInt());
        }
        int list = IntersectionPoint(list1, list2);
        System.out.println(list);
    }

    public static int IntersectionPoint(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int a = 0;
        if (list1.getLast() != list2.getLast()) {
            return -1;
        }
        while (list1.getLast() == list2.getLast()) {
            if (list2.isEmpty()) {
                return -1;
            }
            a = list2.removeLast();
            list1.removeLast();
        }
        // System.out.println(a);
        return a;
    }
}
