package com.company.patterns;

import java.util.Scanner;

public class pattern35 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nsn=1;
        int nsp=2*n-1;
        int g=n+1;
        for(int row=1;row<=2*n+1;row++){
            int k=n;
            for(int csn=1;csn<=nsn;csn++) {
                System.out.print(k+" ");
                if(csn!=nsn)
                k--;
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            if(row==(n+1))
            {
                k++;
                nsn--;
            }

            for(int csn=1;csn<=nsn;csn++){
                System.out.print(k+" ");
                k++;
            }
            if(row==(n+1))
                nsn++;
            if(row<(n+1)) {
                nsp = nsp - 2;
                nsn = nsn + 1;
            }
            else{
                nsp=nsp+2;
                nsn=nsn-1;
            }

            System.out.println();
        }

    }
}
