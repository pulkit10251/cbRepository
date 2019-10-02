package com.company.patterns;

import java.util.Scanner;

public class pythagorasTriplet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int s1,s2,hyp;

        if(n==0 || n==1|| n==2||n<0){
            System.out.println(-1);
        }else{
            if(n%2==0){
                int p=n/2;
                int q=1;
                s1=(p+q)*(p-q);
                s2=2*p*q;
                hyp=(p*p)+(q*q);
                System.out.print(s1+" "+hyp);

            }else{
                s1=(((n+1)/2)*((n+1)/2))-(((n-1)/2)*((n-1)/2));
                s2=2*((n+1)/2)*((n-1)/2);
                hyp=(((n+1)/2)*((n+1)/2))+(((n-1)/2)*((n-1)/2));
                System.out.print(s2+" "+hyp);
            }
        }
    }
}
