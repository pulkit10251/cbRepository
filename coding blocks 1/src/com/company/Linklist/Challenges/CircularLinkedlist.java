package com.company.Linklist.Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class CircularLinkedlist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        list.add(s.nextInt());
        while(list.getLast()!=-1){
            list.add(s.nextInt());
        }
        LinkedList<Integer> listt=new LinkedList<>();
        listt.add(list.removeFirst());
        while(listt.getFirst()!=list.getFirst()){
            listt.add(list.removeFirst());
        }
        for(int i=0;i<listt.size();i++){
            System.out.print(listt.get(i)+" ");
        }
    }
}
