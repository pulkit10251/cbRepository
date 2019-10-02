package com.company.trees;

public class BSTclient {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        BST bst=new BST(arr);
        bst.display();
        bst.remove(2);
        bst.remove(3);
        bst.remove(5);
        bst.preOrder();

    }
}
