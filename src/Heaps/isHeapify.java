package Heaps;

public class isHeapify {

    class Node{
        int val;
        Node leftNode;
        Node rightNode;

    }
//
//    public static boolean method(Node root){
//        // count n node
//
//        int count = countNodes(root);
//        // check complete binary tree
//
//
//    }

    public static int countNodes(Node root){
        if (root==null) return 0;
        return 1+countNodes(root.leftNode)+countNodes(root.rightNode);
    }

}
