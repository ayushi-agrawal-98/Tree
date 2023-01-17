package binarytree.intermediatecode.level1;

import binarytree.Tree;
import binarytree.utils.Node;

/**
 * This class will count the number of parents having their right child value greater than the left child.
 */
public class CountOfLargerRightChild implements IntExecutor {

    @Override
    public int execute() {
        Node root = Tree.IntermediateCode.Level1.buildTree();
        Pair ans = recur(root);
        return ans.count;
    }

    public Pair recur(Node root){
        if(root == null) return new Pair(-1, 0);
        Pair left = recur(root.left);
        Pair right = recur(root.right);
        if(left.rootData == -1 || right.rootData == -1) return new Pair(root.data, left.count + right.count);
        int curAns = left.count + right.count;
        if(right.rootData > left.rootData) ++curAns;
        return new Pair(root.data, curAns);   
    }

    private class Pair {
        int count;
        int rootData;

        public Pair(int rootData, int count){
            this.count = count;
            this.rootData = rootData;
        }
    }
}
