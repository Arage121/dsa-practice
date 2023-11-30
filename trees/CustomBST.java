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

    public void populate(int[] nums){ // for unsorted arrays this will work fine
        for(int i=0;i<nums.length;i++) {
            this.insert(nums[i]);
        }
    }

    public void sortedPopulate(int[] nums){  // but for sorted array if you perfom the normal populate method then it will become straight line right tree
        // which is very bad in all terms that's why we will use this sortedPopulate method which will take the middle element from sorted array, and pick the
        // left tree as elements before mid and for right tree elements after mid and this process will go for each recursion
        sortedPopulate(nums, 0, nums.length);
    }

    private void sortedPopulate(int[] nums, int start, int end){
        if(start >= end) return;
        int mid = start+(end-start)/2;

        this.insert(nums[mid]);

        sortedPopulate(nums, 0, mid);
        sortedPopulate(nums, mid+1, end);
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
