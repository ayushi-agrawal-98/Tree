package binarytree.simplecode;

import binarytree.Tree;
import binarytree.utils.Node;

public class FindSum {
    public int execute() {
        Node root = Tree.SimpleCode.buildTree();
        return recur(root);
    }

    private int recur(Node root) {
        if(root == null) return 0;
        int left = recur(root.left);
        int right = recur(root.right);
        return left + right + root.data;
    }
}
