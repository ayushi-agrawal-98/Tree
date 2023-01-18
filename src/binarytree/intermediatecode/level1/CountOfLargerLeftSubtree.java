package binarytree.intermediatecode.level1;

import java.util.Arrays;
import java.util.List;

import binarytree.Tree;
import binarytree.utils.Node;

public class CountOfLargerLeftSubtree {
    public Pair execute() {
        List<Character> list = Arrays.asList('1', '2', '3', '5', '4', '2', '6', '7', '8', 'N', 'N', 'N', 'N', '8', 'N');
        Node root = Tree.buildCompleteTree(list);
        Pair ans = recur(root);
        return ans;
    }

    public Pair recur(Node root) {
        if(root == null) return new Pair(0, 0);
        Pair left = recur(root.left);
        Pair right = recur(root.right);
        int cursum = left.getSum() + right.getSum() + root.data;
        int curcount = left.getCount() + right.getCount();
        if(left.getSum() == 0 && right.getSum() == 0) {
            return new Pair(cursum, curcount);
        }
        if(right.getSum() == 0) {
            curcount++;
            return new Pair(cursum, curcount);
        }
        if(left.getSum() == 0) {
            return new Pair(cursum, curcount);
        }
        if(left.getSum() > right.getSum()) {
            curcount++;
        }
        return new Pair(cursum, curcount);
    }

    public class Pair {
        int sum;
        int count;

        public Pair(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "Number of Larger Left Subtree are: " + count;
        }
    }
}
