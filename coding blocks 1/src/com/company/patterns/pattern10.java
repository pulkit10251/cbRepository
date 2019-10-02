package com.company.patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nst=2*n-1;
        int nsp=0;
        for(int row=1;row<=n;row++)
        {
            for(int csp=1;csp<=nsp;csp++)
                System.out.print("  ");
            for(int cst=1;cst<=nst;cst++)
                System.out.print("* ");
            nst=nst-2;
            nsp=nsp+1;
            System.out.println();
        }
    }
}
