package com.company.Strings.challenges;

import java.util.Scanner;

public class canyouread {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        StringBuilder B=new StringBuilder(A);
        for(int i=0;i<A.length();i++){
            if(Upperlower(A.charAt(i))==1){
                if(i>=1) {
                    if (Upperlower(A.charAt(i - 1)) == 0||Upperlower(A.charAt(i-1))==1)
                        System.out.println();
                }
                System.out.print(A.charAt(i));

            }
            else if(Upperlower(A.charAt(i))==0){

                System.out.print(A.charAt(i));
            }

        }




    }
    public static int Upperlower(char c){
        int a=c;
        if(a>=65&&a<=90)
            return 1;

        return 0;
    }
}
