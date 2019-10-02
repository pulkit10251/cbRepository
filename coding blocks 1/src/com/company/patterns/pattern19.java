package com.company.patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nst=(n+1)/2;
        int nsp=-1;
        for(int row=1;row<=n;row++)
        {
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print("* ");
            }
            for(int csp=1;csp<=nsp;csp++)
                System.out.print("  ");
            int cst=1;
            if(row==n||row==1)
            {
                cst=2;
            }
            for(;cst<=nst;cst++)
            {
                System.out.print("* ");
            }
            if(row<(n+1)/2)
            {
                nst=nst-1;
                nsp=nsp+2;
            }
            else
            {
                nst=nst+1;
                nsp=nsp-2;
            }
            System.out.println();

        }
    }
}
