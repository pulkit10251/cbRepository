package com.company.Linklist;

public class linnklistClient {
    public static void main(String[] args) throws Exception{
        linklist link =new linklist();
     //   link.display();
        link.addLast(10);
        link.addLast(20);
        link.addLast(30);
        link.addLast(40);
        link.addLast(50);
        link.display();
        link.addFirst(20);
        link.addFirst(30);
        link.addFirst(400);
        link.addFirst(50);
        link.display();
        link.removeFirst();
        link.removeLast();
        link.display();
        link.removeAt(3);
        link.display();
        link.reverseData();
        link.display();
        link.ReversePointer();
        link.display();
        System.out.println(link.getFirst());
        System.out.println(link.getlast());
        System.out.println(link.midNode());
    }
}
