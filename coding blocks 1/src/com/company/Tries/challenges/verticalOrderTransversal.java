package com.company.Tries.challenges;

import java.util.*;

public class verticalOrderTransversal {


    private class Node {
        int data;
        int value;
        Node left;
        Node right;

        Node(int data, int value) {
            this.data = data;
            this.value = value;
        }

        Node() {
            this.data = 0;
            this.value = 0;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public verticalOrderTransversal(int[] A) {
        this.root = Construct(A, 0, 0, A.length - 1);
        HashMap<Integer,Integer> map=new HashMap<>();
        vertical(map,this.root);
       // System.out.println(map);
        print(map);
    }

    public Node Construct(int[] A, int level, int val, int max) {
        if (level > max) {
            return null;
        }
        if (A[level] == -1) {
            return null;
        }

        Node node = new Node(A[level], val);
        node.left = Construct(A, 2 * level + 1, val - 1, max);
        node.right = Construct(A, 2 * level + 2, val + 1, max);
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
    private void vertical(HashMap<Integer,Integer> map,Node node){
        if(node==null){
            return;
        }
        map.put(node.data,node.value);
        vertical(map,node.left);
        vertical(map,node.right);
    }
    private void print(HashMap<Integer,Integer> map){
        Set<Map.Entry<Integer,Integer>> entries=map.entrySet();
        int min= Collections.min(map.values());
        int max=Collections.max(map.values());
        while(min<=max) {
            for (Map.Entry<Integer, Integer> entry : entries) {
                if(entry.getValue()==min){
                    System.out.print(entry.getKey()+" ");
                }

            }
            min++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextShort();

//        String str=s.nextLine();
//        String[] A=str.split(" ");
//        int size=A.length;
        int size=4*n-1+n;
        int[] B=new int[size];
//        for(int i=0;i<size;i++){
//            B[i]=Integer.parseInt(A[i]);
//        }
        for(int i=0;i<size;i++){
            B[i]=s.nextInt();
        }

        verticalOrderTransversal vot=new verticalOrderTransversal(B);
    }


}
