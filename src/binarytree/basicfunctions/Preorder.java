package binarytree.basicfunctions;

import binarytree.Tree;
import binarytree.utils.Node;

public class Preorder {
    public void execute() {
        Node root = Tree.BasicFunctions.buildTree();
        recur(root);
    }

    private void recur(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        recur(root.left);
        recur(root.right);
    }
}
