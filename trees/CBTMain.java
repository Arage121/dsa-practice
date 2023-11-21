import java.util.Scanner;

public class CBTMain {
    public static void main(String[] args) {
        CustomBinaryTree tree = new CustomBinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
        tree.prettyDisplay();
    }
}
