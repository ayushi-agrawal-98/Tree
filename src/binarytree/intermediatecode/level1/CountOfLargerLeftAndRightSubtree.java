package binarytree.intermediatecode.level1;

import java.util.Arrays;
import java.util.List;

import binarytree.Tree;
import binarytree.utils.Node;
import binarytree.utils.Pair;
import binarytree.utils.Triplet;

public class CountOfLargerLeftAndRightSubtree {
    public Pair execute() {
        List<Character> list = Arrays.asList('1', '2', '3', '5', '4', '2', '6', '7', '8', 'N', 'N', 'N', 'N', '8', 'N');
        Node root = Tree.buildCompleteTree(list);
        Triplet curans = recur(root);
        Pair ans = new Pair(curans.getleftCount(), curans.getRightCount());
        return ans;
    }

    public Triplet recur(Node root) {
        if(root == null) return new Triplet(0, 0, 0);
        Triplet left = recur(root.left);
        Triplet right = recur(root.right);
        int cursum = left.getSum() + right.getSum();
        int leftCount = left.getleftCount() + right.getleftCount();
        int rightCount = left.getRightCount() + right.getRightCount();
        if(cursum == 0) {
            return new Triplet(root.data, leftCount, rightCount);
        }
        if(left.getSum() == 0) {
            rightCount++;
            cursum += root.data;
            return new Triplet(cursum, leftCount, rightCount);
        }
        if(right.getSum() == 0) {
            leftCount++;
            cursum += root.data;
            return new Triplet(cursum, leftCount, rightCount);
        }
        if(left.getSum() > right.getSum()) {
            leftCount++;
            cursum += root.data;
            return new Triplet(cursum, leftCount, rightCount);
        }
        if(right.getSum() > left.getSum()) {
            rightCount++;
            cursum += root.data;
            return new Triplet(cursum, leftCount, rightCount);
        }
        cursum += root.data;
        return new Triplet(cursum, leftCount, rightCount);
    }
}
