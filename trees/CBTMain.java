import java.util.Scanner;

public class CBTMain {
    public static void main(String[] args) {
//        CustomBinaryTree tree = new CustomBinaryTree();
//        Scanner sc = new Scanner(System.in);
//        tree.populate(sc);
//        tree.display();
//        tree.prettyDisplay();

          CustomBST bst = new CustomBST();
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for(int i=0;i<n;i++) {
              bst.insert(sc.nextInt());
          }
          bst.display();
    }
}
