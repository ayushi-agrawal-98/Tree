import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import binarytree.Tree;
import binarytree.basicfunctions.Inorder;
import binarytree.intermediatecode.level1.CountOfLargerLeftChild;
import binarytree.intermediatecode.level1.CountOfLargerRightChild;
import binarytree.simplecode.FindXor;
import binarytree.utils.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Started ...");

        List<Character> list = Arrays.asList('1', '2', '3', '4', '5', '6', '7');

        //Tree tree = new Tree();
        Node ans =  Tree.buildCompleteTree(list);
        Inorder inorder = new Inorder();
        inorder.execute(ans)
        ;



        System.out.println();
        System.out.println("Ended ...");
    }
}

