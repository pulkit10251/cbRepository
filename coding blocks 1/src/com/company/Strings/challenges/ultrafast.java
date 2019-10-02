package com.company.Strings.challenges;

import java.util.Scanner;

public class ultrafast {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=0;row<n;row++) {
            String A = s.next();
            String B = s.next();
            int p = A.length();
            StringBuilder C=new StringBuilder();
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i)!=B.charAt(i)){
                    C.append("1");
                }
                else
                    C.append("0");

            }
            System.out.println(C);
        }
    }
}
