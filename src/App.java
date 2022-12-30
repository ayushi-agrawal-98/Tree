import binarytree.basicfunctions.Postorder;
import binarytree.simplecode.FindMaximum;
import binarytree.simplecode.FindMinimum;
import binarytree.simplecode.FindSum;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Started ...");


        FindSum sum = new FindSum();
        int ans = sum.execute();
        System.out.println(ans);

        System.out.println();
        System.out.println("Ended ...");
    }
}
