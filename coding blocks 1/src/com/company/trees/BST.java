package com.company.trees;

public class BST {
    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BST(int[] arr) {
        this.root = construct(arr, 0, arr.length - 1);
    }

    private Node construct(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return null;
        }

        int mid = (lo + hi) / 2;
        Node nn = new Node();
        nn.data = arr[mid];
        nn.left = construct(arr, lo, mid - 1);
        nn.right = construct(arr, mid + 1, hi);
        return nn;
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
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(Node node,int item) {
        if (node == null) {
            return false;
        }
        if (item == node.data) {
            return true;
        } else if (item < node.data) {
            return find(node.left, item);
        } else {
            return find(node.right, item);
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
    public void add(int item){
        add(this.root,item);
    }
    private void add(Node node,int item){
        Node nn=new Node();
        nn.data=item;
        nn.right=null;
        nn.left=null;
        if(item>node.data){
            if(node.right==null){
                node.right=nn;
            }
            add(node.right,item);
        }
        if(item<node.data){
            if(node.left==null){
                node.left=nn;
            }
            add(node.left,item);
        }
    }
    public void remove(int item){
        remove(this.root,null,false,item);
    }
    private void remove(Node node,Node Parent,boolean Islor,int item ) {
        if (item >node.data) {
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
            }else if(node.left==null && node.right!=null){
                if(Islor){
                    Parent.left=node.right;
                }else{
                    Parent.right=node.right;
                }
            }else if(node.left!=null && node.right==null){
                if(Islor){
                    Parent.left=node.left;
                }else{
                    Parent.right=node.left ;
                }
            }else{
                int max=Max(node.left);
                node.data=max;
                remove(node.left,node,true,max);
            }
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
        System.out.print(node.data+", ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

