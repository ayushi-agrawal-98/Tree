package binarytree.utils;

public class Pair {
    int value1;
    int value2;

    public Pair(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }


    @Override
    public String toString() {
        return "No. of Larger LeftCount: " + value1 + " No. of Larger RightCount: " + value2;
    }
}
