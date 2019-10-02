package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistKAppend {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<Integer> list =new LinkedList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        int k=s.nextInt();
        LinkedList<Integer> L1=KAppend(list,k);
        for(int i=0;i<n;i++){
            System.out.println(L1.get(i)+" ");
        }
    }
    public static LinkedList<Integer> KAppend(LinkedList<Integer> list,int k){
        while(k!=0){
            list.addFirst(list.removeLast());
            k--;
        }
        return list;
    }
}
