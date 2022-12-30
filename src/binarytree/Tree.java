package binarytree;

import binarytree.utils.Node;

public class Tree {

    public static class BasicFunctions {
        public static Node buildTree() {
            Node four = new Node(4);
            Node two = new Node(2, four, null);
            Node seven = new Node(7);
            Node five = new Node(5, null, seven);
            Node six = new Node(6);
            Node three = new Node(3, five, six);
            Node one = new Node(1, two, three);
            return one;
        }    
    }

    public static class SimpleCode {
        public static Node buildTree() {
            Node five = new Node(5);
            Node four = new Node(4);
            Node three = new Node(3, five, four);
            Node one = new Node(1);
            Node seven = new Node(7, null, one);
            Node two = new Node(2, three, seven);
            return two;
        }
    }
}
