package com.company.functionandArray;

import java.util.ArrayList;

public class arraylistdemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
        System.out.println(list.size());
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("**************************************");
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list);



    }
}
