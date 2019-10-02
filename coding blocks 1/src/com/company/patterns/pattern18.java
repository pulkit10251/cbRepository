package com.company.patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int nsp = n /2;
        for (int row = 1; row <= n; row++) {
            for(int csp=1;csp<=nsp;csp++)
                System.out.print("  ");
            for(int cst=1;cst<=nst;cst++)
                System.out.print("* ");
            if(row<(n+1)/2){
                nsp=nsp-1;
                nst=nst+2;
            }
            else {
                nsp=nsp+1;
                nst=nst-2;
            }
            System.out.println();
        }
    }
}
