package com.company.AVLtrees;

public class avltree {
    private class Node{
        int data;
        Node left;
        Node right;
        int height;

        Node(int data){
            this.data=data;
            this.height=1;
        }
    }
    private Node root;

    public void Insert(int item){
        this.root=Insert(this.root,item);
    }
    private Node Insert(Node node,int item){
        if(node==null){
            Node nn=new Node(item);
            return nn;
        }

        if(item>node.data){
            node.right=Insert(node.right,item);
        }else if(item<node.data) {
            node.left = Insert(node.left, item);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        int bf=bf(node);
        if(bf>1  &&  item<node.left.data){
            return rightRotate(node);
        }
        if(bf<-1  &&  item>node.right.data){
            return leftRotate(node);
        }
        if(bf >1 && item > node.left.data){
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
        if(bf<-1  &&  item<node.right.data){
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    private int bf(Node node){
        if(node==null){
            return 0;
        }
        return height(node.left)-height(node.right);
    }

    private Node rightRotate(Node c){
        Node b=c.left;
        Node T3=b.right;

        b.right=c;
        c.left=T3;

        c.height=Math.max(height(c.left),height(c.right))+1;
        b.height=Math.max(height(b.left),height(b.right))+1;
        return b;
    }

    private Node leftRotate(Node c){
        Node b=c.right;
        Node T3=b.left;

        b.left=c;
        c.right=T3;

        c.height=Math.max(height(c.left),height(c.right))+1;
        b.height=Math.max(height(b.left),height(b.right))+1;
        return b;
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

    private int height(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
    }


}
