package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class KthElementfromLast {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        list.add(s.nextInt());
        while(list.getLast()!=-1){
            list.add(s.nextInt());
        }
        int n=s.nextInt();
        list.removeLast();
        int a=list.get(list.size()-n);
        System.out.println(a);

    }
}
