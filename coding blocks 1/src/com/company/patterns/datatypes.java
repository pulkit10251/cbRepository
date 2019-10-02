package com.company.patterns;

import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int c = ch;
        if ((c >= 97 && c <= 122))
            System.out.println("lowercase");
        else if ((c >= 65 && c <= 90))
            System.out.println("uppercase");
        else
            System.out.println("invalid charecter");


    }
}
