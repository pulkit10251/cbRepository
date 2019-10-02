package com.company.trees.challenges;

import java.util.Scanner;

public class StructIdentical {
    private class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    private Node root = null;
    int size = 0;

    StructIdentical() {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s, null, false);

    }

    private Node takeInput(Scanner s, Node parent, boolean isLOR) {
//        if (parent == null) {
//            System.out.println("Enter the data for root node");
//        } else {
//            if (isLOR) {
//                System.out.println("Enter the left child of " + parent.data);
//            } else {
//                System.out.println("Enter the right child of " + parent.data);
//            }
//        }
        int Nodedata = s.nextInt();
        Node node = new Node(Nodedata, null, null);
        this.size++;

        boolean choice = false;
       // System.out.println("Do you have left child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.left = takeInput(s, node, true);
        }

        choice = false;
        // System.out.println("Do you have right child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.right = takeInput(s, node, false);
        }
        return node;

    }
//    public boolean IsStructural(){
//        return IsStructural();
//
    public boolean structure(StructIdentical tree){
        return this.structure(this.root,tree.root);
    }
    private boolean structure(Node node1,Node node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1!=null && node2!=null){
            return structure(node1.left,node2.left) && structure(node1.right,node2.right);
        }
        return false;
    }

    public static void main(String[] args) {
        StructIdentical t1=new StructIdentical();
        StructIdentical t2=new StructIdentical();
        System.out.println(t1.structure(t2));
    }
}
