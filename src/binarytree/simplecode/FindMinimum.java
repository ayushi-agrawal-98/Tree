package binarytree.simplecode;

import binarytree.Tree;
import binarytree.utils.Node;

public class FindMinimum {
    public int execute() {
        Node root = Tree.SimpleCode.buildTree();
        return recur(root);
    }

    private int recur(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        int left = recur(root.left);
        int right = recur(root.right);
        return Math.min(root.data, Math.min(left, right));
    }
    
}
