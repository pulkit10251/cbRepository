package com.company.patterns;

import java.util.Scanner;

public class pattern34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int nsn=2*n+1;
        int nsp=0;
        int k=n;
        int g=n;
        for(int row=1;row<=2*n+1;row++){

            for(int csp=1;csp<=nsp;csp++)
                System.out.print("  ");
            for(int csn=1;csn<=nsn;csn++)
            {
                if(g>0)
                {
                    System.out.print(k+" ");
                    k--;
                    g--;
                }
                else
                {
                    System.out.print(k+" ");
                    k++;
                    g--;
                }

            }
            if(row<(n+1)) {
                nsp=nsp+1;
                nsn = nsn - 2;
                k=n-row;
                g=k;
            }
            else{
                nsp=nsp-1;
                nsn=nsn+2;
                k=row-n;
                g=k;
            }

            System.out.println();


        }
    }
}