package com.company.trees.challenges;

import com.company.trees.BinaryTrees;

import java.util.Scanner;

public class IsBalanced {
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

    IsBalanced() {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s, null, false);
    }

    private Node takeInput(Scanner s, Node parent, boolean isLOR) {
        if (parent == null) {
            System.out.println("Enter the data for root node");
        } else {
            if (isLOR) {
                System.out.println("Enter the left child of " + parent.data);
            } else {
                System.out.println("Enter the right child of " + parent.data);
            }
        }
        int Nodedata = s.nextInt();
        Node node = new Node(Nodedata, null, null);
        this.size++;

        boolean choice = false;
        System.out.println("Do you have left child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.left = takeInput(s, node, true);
        }

        choice = false;
        System.out.println("Do you have right child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.right = takeInput(s, node, false);
        }
        return node;

    }
    public int height(){
        return this.height(this.root);
    }
    private int height(Node node){
        if(node==null){
            return -1;
        }
        int lheight=height(node.left);
        int rheight=height(node.right);
        int height=Math.max(lheight,rheight)+1;
        return height;
    }
    public boolean isBalanced(){
        return isBalanced(this.root);
    }
    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        int h1 = height(node.left);
        int h2 = height(node.right);
        int a = h1 - h2;
        if (a <= 1 && a >= -1) {
            isBalanced(node.left);
            isBalanced(node.right);
        } else {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        IsBalanced ib=new IsBalanced();
        System.out.println(ib.isBalanced());
    }
}
