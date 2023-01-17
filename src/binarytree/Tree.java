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

    public static class IntermediateCode {
        public static class Level1 {
            public static Node buildTree() {
                Node hundred1 = new Node(100);
                Node two = new Node(2, hundred1, null);
                Node ninetynine = new Node(99, null, two);
                Node three1 = new Node(3);
                Node four1 = new Node(4);
                Node hundred2 = new Node(100, three1, four1);
                Node twenty = new Node(20, hundred2, ninetynine);
                Node three2 = new Node(3);
                Node three3 = new Node(3);
                Node five = new Node(5, three2, three3);
                Node four2 = new Node(4);
                Node ten = new Node(10, five, four2);
                Node one = new Node(1, ten, twenty);
                return one;
            }

        }
    }
}
