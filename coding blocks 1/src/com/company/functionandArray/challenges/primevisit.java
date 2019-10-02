package com.company.functionandArray.challenges;

import java.util.Scanner;

public class primevisit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 1; row <= n; row++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int[] prime = new int[b + 1];
            for (int i = 0; i <= b; i++)
                prime[i] = 1;
            prime[0] = 0;
            prime[1] = 0;
            for (int i = 2; i <= Math.sqrt(b); i++) {
                if (prime[i] == 1) {
                    for (int j = 2; i * j <= b; j++)
                        prime[i * j] = 0;
                }
            }
            int count=0;
            for (int i = a; i <= b; i++) {
                if(prime[i]==1)
                    count++;
            }
            System.out.println(count);

        }
    }
}
