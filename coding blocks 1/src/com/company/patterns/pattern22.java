package com.company.patterns;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = n;
        int nsp = -1;
        for (int row = 1; row <= n; row++) {
            int cst = 1;
            if(row==1)
            cst=2;

            for (; cst <= nst; cst++)
                System.out.print("* ");
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");
            for ( cst=1; cst <= nst; cst++)
                System.out.print("* ");
            nst = nst -1;
            nsp = nsp+2 ;

            System.out.println();
        }
    }
}