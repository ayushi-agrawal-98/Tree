package binarytree.intermediatecode.level1;

import binarytree.Tree;
import binarytree.utils.Node;

public class CountOfLargerLeftChild implements IntExecutor {

    @Override
    public int execute() {
        Node root = Tree.IntermediateCode.Level1.buildTree();
        return recur(root).count;
    }

    public Pair recur(Node root){
        if (root == null) return new Pair(-1, 0);
        Pair left = recur(root.left);
        Pair right = recur(root.right);
        if(left.value == -1 || right.value == -1) return new Pair(root.data, left.count + right.count);
        int curAns = left.count + right.count;
        if(left.value > right.value) {
            curAns++;
        }
        return new Pair(root.data, curAns);

    }

    private class Pair {
        int value;
        int count;

        public Pair(int value, int count){
            this.value = value;
            this.count = count;
        }
    }
    
}
