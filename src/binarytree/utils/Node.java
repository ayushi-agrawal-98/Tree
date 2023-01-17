package binarytree.utils;

public class Node {
    public final int data;
    public  Node left;
    public  Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this(data, null, null);
    }
}
