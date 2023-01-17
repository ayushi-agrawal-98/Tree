package binarytree.intermediatecode.level1;

import java.util.Arrays;
import java.util.List;

import binarytree.Tree;
import binarytree.utils.Node;

public class CountOfLargerLeftAndRightChild {

    public Pair execute() {
        List<Character> list = Arrays.asList('1', '2', '3', '5', '4', '2', '6', '7', '8', 'N', 'N', 'N', 'N', '8', 'N');
        Node root = Tree.buildCompleteTree(list);
        Triplet ans = recur(root);
        Pair ans1 = new Pair(ans.getLeftCount(), ans.getRightCount());
        return ans1;
    }

    private Triplet recur(Node root) {
        if(root == null) return new Triplet(-1, 0, 0);
        Triplet left = recur(root.left);
        Triplet right = recur(root.right);
        if(left.getValue() == -1 || right.getValue() == -1) 
            return new Triplet(root.data, left.getLeftCount() + right.getLeftCount(), left.getRightCount() + right.getRightCount());
        int currLeft = left.getLeftCount() + right.getLeftCount();
        int currRight = left.getRightCount() + right.getRightCount();
        if(left.getValue() > right.getValue()) {
            currLeft++;
        } else {
            currRight++;
        }
        return new Triplet(root.data, currLeft, currRight);
    }

    
    private class Triplet {
        private int value;
        private int leftCount;
        private int rightCount;

        Triplet(int value, int leftCount, int rightCount){
            this.value = value;
            this.leftCount = leftCount;
            this.rightCount = rightCount;

        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getLeftCount() {
            return leftCount;
        }

        public void setLeftCount(int leftCount) {
            this.leftCount = leftCount;
        }

        public int getRightCount() {
            return rightCount;
        }

        public void setRightCount(int rightCount) {
            this.rightCount = rightCount;
        }
    }

    public class Pair {
        private int leftCount;
        private int rightCount;

        public Pair(int leftCount, int rightCount) {
            this.leftCount = leftCount;
            this.rightCount = rightCount;
        }

        public int getLeftCount() {
            return leftCount;
        }
        
        public void setLeftCount(int leftCount) {
            this.leftCount = leftCount;
        }

        public int getRightCount() {
            return rightCount;
        }

        public void setRightCount(int rightCount) {
            this.rightCount = rightCount;
        }

        @Override
        public String toString() {
            return "[LeftCount: " + leftCount + ", RightCount: " + rightCount + "]";

        }
    }
}
