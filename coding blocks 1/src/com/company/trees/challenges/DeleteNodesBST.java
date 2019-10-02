package com.company.trees.challenges;

import java.util.Scanner;

public class DeleteNodesBST {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int[] A1=new int[a];
            for(int j=0;j< A1.length;j++){
                A1[j]=s.nextInt();
            }
            int b=s.nextInt();

            //  quicksort(A1,0,A1.length-1);
            DeleteNodesBST bst=new DeleteNodesBST(A1);
            int[] A2=new int[b];
            for(int j=0;j< A2.length;j++){
                A2[j]=s.nextInt();
            }
            bst.display();
            for(int j=0;j<A2.length;j++){
                bst.remove(A2[j]);
            }
            bst.preOrder();
        }

    }
    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public DeleteNodesBST(int[] arr) {
        this.root = ArraytoBST(arr,this.root,arr.length);
        //   display();

    }

    private Node construct(int value, Node node) {
        if (node == null) {
            Node n = new Node();
            n.data = value;
            return n;
        }
        if (value > node.data) {
            node.right = construct(value, node.right);
        } else if (value < node.data) {
            node.left = construct(value, node.left);
        }
        return node;
    }

    public Node ArraytoBST(int[] A, Node node, int n) {
        for (int i = 0; i < n; i++) {
            node = construct(A[i], node);
        }
        return node;
    }
    public void display() {
        System.out.println("======================================");
        display(this.root);
        System.out.println("======================================");
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        if (node.left == null) {
            str = str + ". ";
        } else {
            str = str + node.left.data + " ";
        }
        str = str + "-> " + node.data+" <- ";
        if (node.right == null) {
            str = str + " .";
        } else {
            str = str + node.right.data;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public void remove(int item){
        remove(this.root,null,false,item);
    }
    private void remove(Node node,Node Parent,boolean Islor,int item ) {
        if (node == null) {
            return;
        }
        if (item > node.data) {
            remove(node.right, node, false, item);
        } else if (item < node.data) {
            remove(node.left, node, true, item);
        } else {
            if (node.left == null && node.right == null) {
                if (Islor) {
                    Parent.left = null;
                } else {
                    Parent.right = null;
                }
            } else if (node.left == null && node.right != null) {
                if (Islor) {
                    Parent.left = node.right;
                } else {
                    Parent.right = node.right;
                }
            } else if (node.left != null && node.right == null) {
                if (Islor) {
                    Parent.left = node.left;
                } else {
                    Parent.right = node.left;
                }
            } else {
                int max = Max(node.left);
                node.data = max;
                remove(node.left, node, true, max);
            }
        }
    }
    public int Max(){
        return Max(this.root);
    }
    private int Max(Node node){
        if(node.right==null){
            return node.data;
        }else{
            return Max(node.right);
        }
    }
    public void preOrder(){
        this.preOrder(this.root);
        System.out.println();
    }
    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
