package com.company.trees.challenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class largestBstinBT {
    private class Node {
        private int data;
        private Node left;
        private Node right;

    }

    private Node root;
    int size = 0;

    largestBstinBT() {
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int[] pre=new int[n1];
        int[] in=new int[n1];
        for(int i=0;i<n1;i++){
            pre[i]=s.nextInt();
        }
        for(int i=0;i<n1;i++){
            in[i]=s.nextInt();
        }
        this.root = construct(pre,in,true);
    }

    private Node construct(int[] pre, int[] in, boolean IsLOR) {
        Node n = new Node();

        n.data = pre[0];
        int mid = lserch(pre[0], in);
        if(in.length==0){
            return null;
        }
        if (in.length <= 1) {
            n.right = null;
            n.left = null;
            return n;
        }
        n.data = pre[0];


        int[] A = new int[mid];
        int[] B = new int[mid];
        int[] C = new int[mid];
        int[] D = new int[mid];

        for (int j = 0; j < mid; j++) {
            A[j] = in[j];
        }
        for (int i = 0, j = 1; j <= mid; j++, i++) {
            B[i] = pre[j];
        }


        for (int i = 0, j = mid + 1; j < in.length; j++, i++) {
            C[i] = in[j];
        }
        for (int i = 0, j = mid + 1; j < pre.length; j++, i++) {
            D[i] = pre[j];
        }

        n.left = construct(B, A, true);
        if (pre[0] == in[in.length - 1]) {
            n.right = null;
            return n;
        } else {
            n.right = construct(D, C, false);
        }
        return n;


    }

    public int lserch(int item, int[] in) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == item)
                return i;
        }
        return 0;
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

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        int height = Math.max(lheight, rheight) + 1;
        return height;
    }

    public void preOrder() {
        this.preOrder(this.root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        this.postOrder(this.root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + ", ");
    }

    public void InOrder() {
        this.InOrder(this.root);
        System.out.println();
    }

    private void InOrder(Node node) {
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.data + ", ");
        InOrder(node.right);
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node rv = queue.remove();
            System.out.print(rv.data + ", ");
            if (rv.left != null) {
                queue.add(rv.left);
            }
            if (rv.right != null) {
                queue.add(rv.right);
            }

        }
    }

    public boolean IsBST(Node  node) {
        return this.IsBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean IsBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data > max || node.data < min) {
            return false;
        } else if (!this.IsBST(node.left, min, node.data)) {
            return false;
        } else if (!this.IsBST(node.right, node.data, max)) {
            return false;
        }
        return true;


    }
    public int largestBST(Node node){
        if(node==null){
            return 0;
        }
        int max=0;
        if(IsBST(node)){
            int height=height(node);
            if(height>max){
                max=height;
                return max;
            }
        }
        int left=largestBST(node.left);
        int right=largestBST(node.right);
        if(left>right){
            return left;
        }
        return right;
    }


    public static void main(String[] args) {
        largestBstinBT bst =new largestBstinBT();
        bst.display();


    }
}

