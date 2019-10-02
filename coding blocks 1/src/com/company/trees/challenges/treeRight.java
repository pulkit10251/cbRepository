package com.company.trees.challenges;

import java.util.Scanner;

public class treeRight {
    private class Node{
        String data;
        Node left;
        Node right;
    }
    private  Node root;
    private int max = 0;
    public treeRight(String[] arr){
        Scanner scan = new Scanner(System.in);
        this.root = construct(arr,0,arr.length-1);
        rightView(this.root,1,0);
    }
    public Node construct(String[] arr,int i, int max){
        if(i>max){
            return null;
        }
        if(arr[i].equals("-1")){
            return null;
        }
        Node node = new Node();
        node.data = arr[i];


        node.left = construct(arr,i=2*i+1,max);
        node.right = construct(arr,i=2*i+2,max);
        return node;
    }
    public void rightView(Node node, int level,int maxl ){
        if(node == null){
            return;
        }
       // if(this.max<level){
            System.out.print(node.data+ " ");
          //  this.max = level;
        //    maxl = this.max;
      //  }
        if(node.right!=null) {
            rightView(node.right, level + 1, maxl);
        }else {
            rightView(node.left, level + 1, maxl);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] s1=str.split(" ");
        treeRight t=new treeRight(s1);
        System.out.println();
        t.display();
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
}
