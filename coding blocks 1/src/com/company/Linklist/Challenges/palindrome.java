package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        boolean ans = pallindrome(list);
        System.out.println(ans);

    }

    public static boolean pallindrome(LinkedList<Integer> list) {
         int left=0;
         int right=list.size()-1;
         while(left<right){
             if(list.get(left)!=list.get(right)){
                 return false;
             }
             left++;
             right--;
         }
         return true;

    }
}
