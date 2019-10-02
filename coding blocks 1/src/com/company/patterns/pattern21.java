package com.company.patterns;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nst=1;
        int nsp=2*n-3;
        for(int row=1;row<=n;row++)
        {
            for(int cst=1;cst<=nst;cst++)
                System.out.print("* ");
            for(int csp=1;csp<=nsp;csp++)
                System.out.print("  ");
            int cst=1;
            if(row==n)
            {
                cst=2;
            }
            for(;cst<=nst;cst++)
                System.out.print("* ");
            nst=nst+1;
            nsp=nsp-2;

            System.out.println();

        }
    }
}
