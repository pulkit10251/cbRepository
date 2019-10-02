package com.company.patterns;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int nsp = n - 1;
        for (int row = 1; row <= 2*n-1; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");
            if (row < n) {
                nst = nst + 1;
                nsp = nsp - 1;
            } else {
                nst = nst - 1;
                nsp = nsp + 1;
            }
            System.out.println();
        }
    }
}
