package com.company.patterns;

import java.util.Scanner;

public class prateeklovescandy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = 100000;

        long[] prime = new long[(int) (a + 1)];
        for (long i = 0; i < prime.length; i++) {
            prime[(int)i] = 1;
        }
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= a; j++)
                    prime[i * j] = 0;
            }


        }
        int p = s.nextInt();
        for (int row = 0; row < p; row++) {
            long n = s.nextInt();
            long count = 0;
            while (count < n) {
                for (int i = 0; i < a; i++) {
                    if (prime[i] == 1)
                        count++;
                    if (count == n) {
                        System.out.println(i);
                        break;
                    }
                }
            }

        }
    }
}
