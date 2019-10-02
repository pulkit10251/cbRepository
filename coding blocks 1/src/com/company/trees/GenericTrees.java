package com.company.trees;

//import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {
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

    GenericTrees() {
        Scanner s = new Scanner(System.in);
        this.root = TakeInput(s, null, 0);
    }

    private Node TakeInput(Scanner s, Node Parent, int ithchild) {
//        if (Parent == null) {
//            System.out.println("Enter the data for root node");
//        } else {
//            System.out.println("Enter the data for the "+ ithchild+"th child of "+Parent.data);
//        }
        int nodeData=s.nextInt();
        Node node=new Node(nodeData);
        this.size++;

        //System.out.println("Enter the number of children for "+node.data);
        int children=s.nextInt();

        for(int i=0;i<children;i++){
            Node child=this.TakeInput(s,node,i);
            node.children.add(child);
        }
        return node;

    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str=node.data+"=>";
        for(int i=0;i<node.children.size();i++){
            str=str+node.children.get(i).data+", ";
        }
        str=str+" End";
        System.out.println(str);
        for(int i=0;i<node.children.size();i++){
            display(node.children.get(i));
        }
    }

}
