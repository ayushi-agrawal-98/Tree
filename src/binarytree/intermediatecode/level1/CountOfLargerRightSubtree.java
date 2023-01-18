package binarytree.intermediatecode.level1;

import java.util.Arrays;
import java.util.List;

import binarytree.Tree;
import binarytree.utils.Node;

public class CountOfLargerRightSubtree {
    public Triplet execute(){
        List<Character> list = Arrays.asList('1', '2', '3', '5', '4', '2', '6', '7', '8', 'N', 'N', 'N', 'N', '8', 'N');
        Node root = Tree.buildCompleteTree(list);
        Triplet ans = recur(root);
        return ans;
    }

    private Triplet recur(Node root) {
        if(root == null) return new Triplet(-1, 0, 0);
        Triplet left = recur(root.left);
        Triplet right = recur(root.right);
        int cursum = root.data + left.getSum() + right.getSum();
        int curCount = left.getCount() + right.getCount();
        if(left.getValue() == -1 && right.getValue() == -1) {
            return new Triplet(root.data, 0, 0);
        }
        if(left.getValue() == -1) {
            curCount++;
            return new Triplet(root.data, cursum, curCount);
        } else if(right.getValue() == -1) {
            return new Triplet(root.data, cursum, curCount);
            }
        if(right.getSum() > left.getSum()) {
            curCount++;
            return new Triplet(root.data, cursum, curCount);
        }
        return new Triplet(root.data, cursum, curCount);
        }


    public class Triplet {
        private int value;
        private int sum;
        private int count;

        Triplet(int value, int sum, int count) {
            this.value = value;
            this.sum = sum;
            this.count = count;
        }

        public int getValue(){
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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
            return "Number of Larger Subtree are: " + count;
        }
    }
    
}
