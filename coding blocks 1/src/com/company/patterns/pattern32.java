package com.company.patterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int k=1;
        for(int row=1;row<=(2*n-1);row++) {
            for (int cst = 1; cst <= nst; cst++)
            {
                if(cst%2!=0)
                    System.out.print(k);
                else
                    System.out.print("*");
            }
            k++;
            if(row<n)
            {
                nst=nst+2;
            }
            else
            {
                nst=nst-2;
            }

            System.out.println();
        }
    }
}
