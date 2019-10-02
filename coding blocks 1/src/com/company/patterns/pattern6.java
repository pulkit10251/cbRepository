package com.company.patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nst=5;
        int nsp=0;
        for(int row=1;row<=n;row++)
        {
            for(int csp=1;csp<=nsp;csp++)
                System.out.print("  ");
            for(int cst=1;cst<=nst;cst++)
                System.out.print("* ");

            nst=nst-1;
            nsp=nsp+2;
            System.out.println();
        }
    }
}
