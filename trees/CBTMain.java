import java.util.Arrays;
import java.util.Scanner;

public class CBTMain {
    public static void main(String[] args) {
//        CustomBinaryTree tree = new CustomBinaryTree();
//        Scanner sc = new Scanner(System.in);
//        tree.populate(sc);
//        tree.display();
//        tree.prettyDisplay();

          CustomBST bst = new CustomBST();
          int[] arr = {24, 1, 342, 12, 11,21};
          Arrays.sort(arr);
          bst.sortedPopulate(arr);
          bst.display();
    }
}
