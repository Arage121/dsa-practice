public class CustomBST { // binary search tree
    // if it's height difference is less than equal to 1 then it is balanced bst
    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
    }

//    public CustomBST() {
//
//    }

    private Node root;

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display("Root node: ", root);
    }

    private void display(String msg, Node node){
        if(node == null) return;
        System.out.println(msg + node.value);
        display("Left child of "+node.value+": ", node.left);
        display("Right child of "+node.value+": ", node.right);
    }
}
