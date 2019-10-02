package com.company.Strings.challenges;

import java.util.Scanner;

public class lowerupper {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int a=c;
        if(a>=65&&a<=90)
            System.out.println("UPPERCASE");
        else if(a>=97&&a<=122)
            System.out.println("lowercase");
        else
            System.out.println("Invalid");
    }
}
