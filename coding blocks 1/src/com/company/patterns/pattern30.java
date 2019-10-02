package com.company.patterns;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int cst=5;cst>=1;cst--)
                System.out.print(cst+" ");
            System.out.println();
        }
    }
}
