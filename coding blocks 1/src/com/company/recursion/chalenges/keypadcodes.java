package com.company.recursion.chalenges;

import java.util.Scanner;

public class keypadcodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] key = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
        String A = s.next();
        print(key, A, "");
        int ans=count(key,A);
        System.out.println();
        System.out.println(ans);
    }

    public static void print(String[] table, String A, String result) {
        if (A.length() == 0) {
            System.out.print(result + " ");
            return;
        }

        int i = Character.getNumericValue(A.charAt(0)) - 1;
        for (int j = 0; j < table[i].length(); j++) {
            char b = table[i].charAt(j);
            print(table, A.substring(1), result + b);
        }
    }

    public static int count(String[] table, String A) {
        if (A.length() == 0) {
            return 1;
        }
        int ans = 0;
        int i = Character.getNumericValue(A.charAt(0)) - 1;
        for (int j = 0; j < table[i].length(); j++) {
            char b = table[i].charAt(j);
            ans = ans + count(table, A.substring(1));
        }
        return ans;
    }
}
