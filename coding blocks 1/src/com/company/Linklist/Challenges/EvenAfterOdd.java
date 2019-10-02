package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class EvenAfterOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        LinkedList<Integer> L1 = evenafterodd(list);
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i) + " ");
        }

    }

    public static LinkedList<Integer> evenafterodd(LinkedList<Integer> list) {
        LinkedList<Integer> L1 = new LinkedList<>();
        int n = 0;
        int a = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                L1.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                L1.addLast(list.get(i));
            }
        }
        return L1;
    }
}
