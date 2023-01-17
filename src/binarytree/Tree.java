package binarytree;

import java.rmi.ConnectIOException;
import java.util.ArrayList;
import java.util.List;

import binarytree.utils.Node;

public class Tree {

    public static Node buildCompleteTree(List<Character> list){
        int n = list.size();
        ArrayList<Node> tree = new ArrayList<Node>();

        for(int i = 0; i < n; i++) {
            Node cur = list.get(i) == 'N' ? null : new Node(Integer.parseInt(String.valueOf(list.get(i))));
            tree.add(cur);

            if(i == 0) continue;
            int parentIdx = (i - 1) / 2;
            Node parent = tree.get(parentIdx);

            if((i - 1) % 2 == 0) parent.left = cur;
            else parent.right = cur;
        }

        // for(int i = 0; i < n; i++) {
        //     if(2 * i + 1 >= n) break;
        //     Node left = tree.get(2 * i + 1);
        //     Node right = tree.get(2 * i + 2);
        //     Node cur = tree.get(i);
        //     cur.left = left;
        //     cur.right = right;
        // }

        return tree.get(0);
        
    }

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
