package com.company.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTrees {
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

    Node root = null;
    int size = 0;

    BinaryTrees() {
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

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + node.left.data + "=>";
        } else {
            str = str + "End=>";
        }
        str = str + node.data;
        if (node.right != null) {
            str = str + "<=" + node.right.data;
        } else {
            str = str + "<=End";
        }
        System.out.println(str);
        if (node.left != null) {
            this.display(node.left);
        }
        if (node.right != null) {
            this.display(node.right);
        }

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
    public void preOrder(){
        this.preOrder(this.root);
        System.out.println();
    }
    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.data+", ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(){
        this.postOrder(this.root);
        System.out.println();
    }
    private void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+", ");
    }
    public void InOrder(){
        this.InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.data+", ");
        InOrder(node.right);
    }
    public void levelOrder() {
        Queue<Node> queue=new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            Node rv=queue.remove();
            System.out.print(rv.data+", ");
            if(rv.left!=null){
                queue.add(rv.left);
            }
            if(rv.right!=null){
                queue.add(rv.right);
            }

        }
    }
    public boolean IsBST(){
        return this.IsBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean IsBST(Node node,int min,int max){
        if(node==null){
            return true;
        }

        if(node.data>max ||node.data<min){
            return false;
        }else if(!this.IsBST(node.left,min,node.data)){
            return false;
        }else if(!this.IsBST(node.right , node.data ,max) ){
            return  false;
        }
        return true;


    }
}
