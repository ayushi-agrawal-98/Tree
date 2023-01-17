import binarytree.intermediatecode.level1.CountOfLargerLeftAndRightChild;
import binarytree.intermediatecode.level1.CountOfLargerLeftAndRightChild.Pair;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Started ...");

        //Tree tree = new Tree();
        CountOfLargerLeftAndRightChild countLandR = new CountOfLargerLeftAndRightChild();
        Pair ans1 = countLandR.execute();
        System.out.println(ans1);    

        System.out.println();
        System.out.println("Ended ...");
    }
}

