package com.company.patterns;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p;
        for(int row=1;row<=n;row++){
             p=s.nextInt();
            int g=0;
            int k=1;
            while(g!=p){
                k++;
                int count=0;
                for(int j=1;j<=k;j++)
                    if(k%j==0)
                        count ++;
                    if(count==1){
                        g++;
                    }

            }
            System.out.println(k);
        }
    }
}
