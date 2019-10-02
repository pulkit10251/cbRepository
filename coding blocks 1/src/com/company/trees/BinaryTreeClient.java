package com.company.trees;

public class BinaryTreeClient {
    public static void main(String[] args) {
       // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        BinaryTrees tree =new BinaryTrees();
        tree.display();
        System.out.println(tree.height());
        tree.preOrder();
        System.out.println();
        //tree.postOrder();
        System.out.println();
        tree.InOrder();
       // tree.levelOrder();
        System.out.println();
        //System.out.println("=====================================");
       // System.out.println(tree.IsBST());
    }
}
//1 true 2 true 4 false false true 5 false false true 3 true 6 false false false