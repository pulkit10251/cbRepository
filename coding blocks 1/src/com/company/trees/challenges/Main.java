package com.company.trees.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    Scanner s=new Scanner(System.in);
    private class Node {
        int data;
        ArrayList<Node> children;

        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private Node root;
    private int size;

    Main() {
        Scanner s = new Scanner(System.in);
        this.root = TakeInput(s, null, 0);
        int k=s.nextInt();
        System.out.println(ksum(k));
    }

    private Node TakeInput(Scanner s,Node Parent, int ithchild) {
        int nodeData=s.nextInt();
        Node node=new Node(nodeData);
        this.size++;

        int children=s.nextInt();

        for(int i=0;i<children;i++){
            Node child=this.TakeInput(s,node,i);
            node.children.add(child);
        }
        return node;

    }
    public int ksum(int a){
        return ksum(this.root,0,0,a);
    }
    private int ksum(Node node,int sum,int k,int a){

        if(k==a){

            sum=sum+ node.data;
            return sum;
        }

        for(int i=0;i<node.children.size();i++){
           sum= ksum(node.children.get(i),sum,k+1,a);
        }
        return sum;

    }
    public static void main(String[] args) {
        Main gt=new Main();
    }
}
