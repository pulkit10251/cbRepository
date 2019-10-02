package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class LLkreverse {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    int n=s.nextInt();
    int k=s.nextInt();
    for(int i=0;i<n;i++){
        list.add(s.nextInt());
    }
    LinkedList<Integer> listt=reverselist(list,k);
    for(int i=0;i<n;i++){
        System.out.print(list.get(i)+" ");
    }
}
    public static LinkedList<Integer> reverselist(LinkedList<Integer> list,int k){
        int a=k;
        while(k<=list.size()){
            int left=k-a;
            int right=k-1;
            while(left<right) {
                int previous=list.get(left);
                int ahead=list.get(right);
                list.set(left, ahead);
                list.set(right, previous);
                left++;
                right--;
            }
            k=k+a;
        }
        return list;
    }
}

