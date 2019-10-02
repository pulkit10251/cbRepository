package com.company.trees.challenges;

import java.util.Scanner;

public class TreeBottom {
    private class Node{
        String data;
        Node left;
        Node right;
    }
    private  Node root;
    private int max = 0;
    public TreeBottom(String[] arr){
        Scanner scan = new Scanner(System.in);
        this.root = construct(arr,0,arr.length-1);
        bottomview(this.root);
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
    public void bottomview(Node node){
        if(node.left==null && node.right==null){
            System.out.print(node.data+" ");
            return;
        }
        bottomview(node.left);
        bottomview(node.right);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] s1=str.split(" ");
        TreeBottom t=new TreeBottom(s1);
        System.out.println();
      //  t.display();
    }
}
