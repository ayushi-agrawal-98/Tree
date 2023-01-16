package binarytree.simplecode;

import binarytree.Tree;
import binarytree.utils.Node;

public class FindXor {
    public void execute(){
        Node root = Tree.SimpleCode.buildTree();
        int xor = recur(root);
        System.out.println(xor);
    }

    public int recur(Node root){
        if(root == null) return 0;
        int left = recur(root.left);
        int right = recur(root.right);
        int xor = (left ^ root.data) ^ right;
        return xor;
    }
    
}
