package com.company.AVLtrees;

public class client {
    public static void main(String[] args) {
        avltree tree=new avltree();
        tree.Insert(20);
        tree.Insert(25);
        tree.Insert(30);
        tree.Insert(10);
        tree.Insert(5);
        tree.Insert(15);
        tree.Insert(27);
        tree.Insert(19);
        tree.Insert(16);
        tree.display();

    }
}
