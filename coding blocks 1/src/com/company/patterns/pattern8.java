package com.company.patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nst=1;
        int nsp1=0;
        int nsp2=n-2;
        for(int row=1;row<=n;row++)
        {
            for(int csp1=1;csp1<=nsp1;csp1++)
                System.out.print("  ");
                System.out.print("* ");
            for(int csp2=1;csp2<=nsp2;csp2++)
                System.out.print("  ");
            if(row!=((n/2)+1))
            {
                System.out.print("* ");
            }
            if(row<=n/2) {

                nsp1 = nsp1 + 1;
                nsp2 = nsp2 - 2;
            }
            else{
                nsp1=nsp1-1;
                nsp2=nsp2+2;
            }
            System.out.println();


        }
    }
}
