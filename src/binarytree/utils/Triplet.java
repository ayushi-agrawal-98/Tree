package binarytree.utils;

public class Triplet {
    int sum;
    int leftCount;
    int rightCount;

    public Triplet(int sum, int leftCount, int rightCount) {
        this.sum = sum;
        this.leftCount = leftCount;
        this.rightCount = rightCount;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getleftCount() {
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
