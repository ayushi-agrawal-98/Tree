import binarytree.intermediatecode.level1.CountOfLargerLeftAndRightSubtree;
import binarytree.utils.Pair;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Started ...");

        //Tree tree = new Tree();
      CountOfLargerLeftAndRightSubtree object = new CountOfLargerLeftAndRightSubtree();
       Pair ans = object.execute();
       System.out.println(ans);

        System.out.println();
        System.out.println("Ended ...");
    }
}

