package com.company.patterns;

import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int nsp = n - 1;
        int k=1;

        for (int row = 1; row <= n; row++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(k + " ");
                if (cst <row)
                    k++;
                else
                    k--;
            }
            nst = nst + 2;
            nsp = nsp - 1;
            k=k+2;
            System.out.println();
        }

    }
}
