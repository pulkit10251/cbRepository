package com.company.trees.challenges;

import java.util.Scanner;

public class BSSTpreOrder {
    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BSSTpreOrder(int[] arr) {
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
        if (nn.right != null && nn.left != null)
            if (nn.right.data < nn.left.data) {
                int temp = nn.left.data;
                nn.left.data = nn.right.data;
                nn.right.data = temp;

            }
        return nn;
    }

    public void preOrder() {
        this.preOrder(this.root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int[] A1 = new int[a];
            for (int j = 0; j < A1.length; j++) {
                A1[j] = s.nextInt();
            }
            BSSTpreOrder bst=new BSSTpreOrder(A1);
            bst.preOrder();
        }
    }
}
