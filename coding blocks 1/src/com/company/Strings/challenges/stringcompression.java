package com.company.Strings.challenges;

import java.util.Scanner;

public class stringcompression {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String A=s.next();
        int p=0;
        int count=0;
        for(int i=0;i<A.length()-1;i++){
            char ch1=A.charAt(i);

            char ch2=A.charAt(i+1);
            if(ch1==ch2)
            count++;

            if(ch1!=ch2){
                System.out.print(ch1);
                if(count>0)
                System.out.print(count+1);
                count=0;
            }
            if(i==A.length()-2) {
                System.out.print(ch2);
                if(count>0)
                System.out.print(count + 1);


            }
        }
    }
}
