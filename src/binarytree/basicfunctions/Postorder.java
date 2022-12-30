package binarytree.basicfunctions;

import binarytree.Tree;
import binarytree.utils.Node;

public class Postorder {
    public void execute() { 
        Node root = Tree.BasicFunctions.buildTree();
        recur(root);

    }

    private void recur(Node root) {
        if(root == null) return;
        recur(root.left);
        recur(root.right);
        System.out.print(root.data + " ");
    }
}
