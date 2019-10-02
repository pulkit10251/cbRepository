package com.company.patterns;

import java.util.Scanner;

public class pulkit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        for (int row = 1; row <= n; row++) {
            int f = 0;
            int num = s.nextInt();
            int p = 0;
            for (int i = 2; i <= 1000; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                    if (count == 2) {
                        f++;
                    }
                }
                    if (f == num)
                        p = i;



            }
            System.out.println(p);


        }
    }
}
