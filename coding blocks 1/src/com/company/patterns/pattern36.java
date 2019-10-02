package com.company.patterns;

import java.util.Scanner;

public class pattern36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nsp1 = n - 1;
        int nsp2 = -1;
        int nsn = 1;
        int k = 1;
        for (int row = 1; row <= n; row++) {

            for (int csp1 = 1; csp1 <= nsp1; csp1++)
                System.out.print("  ");
            for (int csn = 1; csn <= nsn; csn++) {
                System.out.print(k + " ");
                k--;
            }
            for (int csp2 = 1; csp2 <= nsp2; csp2++) {
                System.out.print("  ");
            }
            k++;
            if(row==1||row==n)
                System.out.print(" ");
            else
            for (int csn = 1; csn <= nsn; csn++) {
                System.out.print(k + " ");
                k++;
            }

            if (row < (n + 1) / 2) {
                nsn = nsn + 1;
                nsp1 = nsp1 - 2;
                nsp2 = nsp2 + 2;
                if(row==1)
                k=k+1;
            } else {

                nsn = nsn - 1;
                nsp2 = nsp2 - 2;
                nsp1 = nsp1 + 2;
                k=k-2;
            }

            System.out.println();


        }


    }
}
