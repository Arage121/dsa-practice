//https://leetcode.com/problems/binary-tree-level-order-traversal/
import java.util.*;
public class BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lvlSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i=0 ;i < lvlSize;i++){
                TreeNode currNode = queue.poll(); // because queue is containing tree nodes
                currLevel.add(currNode.val);
                if(currNode.left != null){ // we will pop the upper level node and then add their left and right child in the queue and in this way we will perform breadth-first-search traversal i.e level wise traversal (3->9->20->15->7) 1-2-3 levels
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            result.add(currLevel);
        }

        return result;
    }
}
