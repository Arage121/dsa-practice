
public class DetermineIfTwoTreesAreIdentical {
    private class Node{
        private Node left, right;
        private int data;
        Node(int val)
        {
            this.data = val;
            left = right = null;
        }
    }

    //Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2)
    {
        if(root1==null && root2==null) return true; // if both trees are empty they are identical

        if(root1==null || root2==null) return false; // if one tree became empty but the other one didn't
        //then they are not identical

        boolean isTrue = (root1.data == root2.data);

        boolean forLeft = isIdentical(root1.left, root2.left);
        boolean forRight = isIdentical(root1.right, root2.right);

        return isTrue && forLeft && forRight;
    }
}
