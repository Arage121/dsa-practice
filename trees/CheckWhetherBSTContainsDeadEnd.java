//https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1
public class CheckWhetherBSTContainsDeadEnd {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static boolean isDeadEnd(Node root)
    {
        return isDeadUntil(root, 1, 10002); //range of value of nodes from the question
    }

    private static boolean isDeadUntil(Node root, int min, int max){
        if(root == null) return false;
        if(min == max) return true; // found deadend
        boolean left = isDeadUntil(root.left, min, root.data-1);
        boolean right = isDeadUntil(root.right, root.data+1, max);
        return left || right;
    }
}
