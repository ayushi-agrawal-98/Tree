package binarytree.simplecode;

import binarytree.Tree;
import binarytree.utils.Node;

public class FindMaximum {
    public void execute(){
        Node root = Tree.SimpleCode.buildTree();
        int maximum = recur(root);
        System.out.println(maximum);



    }
    public int recur(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int left = recur(root.left);
        int right = recur(root.right);
        return Math.max(root.data, Math.max(left, right));
    }
    
}
