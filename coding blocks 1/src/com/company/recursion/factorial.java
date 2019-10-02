package com.company.recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p=factorial(n);
        System.out.println(p);
    }

    public static int  factorial(int N) {
        if (N == 1) {
            return 1;
        }
        int p=factorial(N-1);
        int ans=N*p;
        return ans;

    }
}

