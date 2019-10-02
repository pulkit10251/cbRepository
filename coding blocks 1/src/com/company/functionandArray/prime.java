package com.company.functionandArray;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] primes=new int[n+1];
        for(int i=0;i<=n;i++)
            primes[i]=1;
        primes[0]=0;
        primes[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes[i]==1) {
                for (int j = 2; i * j <= n; j++)
                    primes[i * j] = 0;

            }
        }
        int count=0;
        for(int i=1;i<primes.length;i++){
            if(primes[i]==1){
                System.out.print(i+"  ");
                count++;
            }
        }
        System.out.println(count);
    }
}
