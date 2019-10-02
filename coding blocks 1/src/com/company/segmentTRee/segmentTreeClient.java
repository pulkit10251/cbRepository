package com.company.segmentTRee;

public class segmentTreeClient {
    public static void main(String[] args) {
        int[] arr={3,8,7,6,-2,-8,4,9};
        segmentTree tree=new segmentTree(arr);
        tree.display();
        System.out.println("********************************");
        System.out.println("sum is "+tree.query(2,6));

        tree.update(3,14);
        tree.display();
        System.out.println("sum is "+tree.query(2,6));

    }
}
