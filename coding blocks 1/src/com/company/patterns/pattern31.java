package com.company.patterns;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=1;
        for(int row=1;row<=n;row++)
        {
            for(int cst=5;cst>=1;cst--)
                if(cst==k){
                    System.out.print("* ");
                }else
                System.out.print(cst+" ");
            System.out.println();
            k++;
        }
    }
}
