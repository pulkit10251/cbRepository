package com.company.StackqueuE.challenges;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCards {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> Primes = prime(1000);
        Stack<Integer> S1 = new Stack<>();
        Stack<Integer> S2 = new Stack<>();
        Stack<Integer> S3 = new Stack<>();
        int n = s.nextInt();
        int q = s.nextInt();
        for (int i = 0; i < n; i++) {
            S1.push(s.nextInt());
        }
        for (int i = 0; i < q; i++) {
            if(S1.empty()){
                break;
            }
            int a = Primes.get(i);
            while (!S1.empty()) {
                int b = S1.peek();
                S1.pop();
                if (b % a == 0) {
                    S2.push(b);
                } else {
                    S3.push(b);
                }
            }
                while (!S2.empty()) {
                    System.out.println(S2.pop());
                }
                S1 = S3;
                while (!S3.empty()) {
                   S3=new Stack<>();
                }

            }
        while (!S1.empty()) {
            System.out.println(S1.pop());
        }
        }



    public static ArrayList<Integer> prime(int n) {
        int[] primes = new int[n + 1];
        ArrayList<Integer> Primes = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            primes[i] = 1;
        primes[0] = 0;
        primes[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = 2; i * j <= n; j++)
                    primes[i * j] = 0;

            }
        }
        int count = 0;
        for (int i = 1; i < primes.length; i++) {
            if (primes[i] == 1) {
                Primes.add(i);
            }
        }
        return Primes;
    }

}