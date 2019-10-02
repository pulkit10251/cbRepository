package com.company.trees.challenges;

import java.util.Scanner;

public class createTree {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        createTree m = new createTree();
        int[] post = takeInput();
        int[] in = takeInput();
        BinaryTree bt = m.new BinaryTree(post, in);
        bt.display();
    }

    public static int[] takeInput() {
        int n = scn.nextInt();

        int[] rv = new int[n];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree(int[] pos, int[] in) {
            this.root = this.construct(pos, in, true);
        }

        private Node construct(int[] pos, int[] in, boolean IsLOR) {
            Node n = new Node();

            n.data = pos[pos.length-1];
            int mid = lserch(pos[pos.length-1], in);
            if(in.length==0){
                return null;
            }
            if (in.length <= 1) {
                n.right = null;
                n.left = null;
                return n;
            }
            n.data = pos[pos.length-1];


            int[] A = new int[mid];
            int[] B = new int[mid];
            int[] C = new int[mid];
            int[] D = new int[mid];

            for (int j = 0; j < mid; j++) {
                A[j] = in[j];
            }
            for (int j = 0; j < mid; j++) {
                B[j] = pos[j];
            }


            for (int i = 0, j = mid + 1; j < in.length; j++, i++) {
                C[i] = in[j];
            }
            for (int i = 0, j = mid ; j < pos.length-1; j++, i++) {
                D[i] = pos[j];
            }

            n.left = construct(B, A, true);
            //if (pos[pos.length-1] == in[0]) {
              //  n.right = null;
                //return n;
            //} else {
                n.right = construct(D, C, false);
            //}
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
            if (node == null) {
                return;
            }

            String str = "";

            if (node.left != null) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right != null) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

    }

}

