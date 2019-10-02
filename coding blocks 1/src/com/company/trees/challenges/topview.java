package com.company.trees.challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class topview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer>  list=new LinkedList<>();
        list.add(s.nextInt());
        while(list.getLast()!=-1){
            list.add(s.nextInt());
        }
        list.removeLast();
        int k=0;
        int a=1;
        while(k<2*list.size()){
            if(k<list.size()) {
                System.out.print(list.get(k)+" ");
            }else {
                System.out.print(list.getLast()+" ");
                break;
            }
            k=k+a*2;
            a++;
        }
    }

}
