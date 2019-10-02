package com.company.functionandArray;

import java.util.Scanner;

public class tentoanybase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        anybase(a, b);
    }

    public static void anybase(int val, int base) {
        int a = val;
        int k = 1;
        int ans = 0;
        while (a != 0) {
            int rem = a % base;
            ans = ans + rem * k;
            k = k * 10;
            a = a / base;
        }
        System.out.println(ans);


    }
}
