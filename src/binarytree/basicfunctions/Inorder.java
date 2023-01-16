package binarytree.basicfunctions;

import binarytree.Tree;
import binarytree.utils.Node;

public class Inorder {
    public void execute() {
        Node root = Tree.BasicFunctions.buildTree();
        recur(root);
    }

    private void recur(Node root) {
        if(root == null) return;
        recur(root.left);
        System.out.print(root.data + " ");
        recur(root.right);

    }
}
