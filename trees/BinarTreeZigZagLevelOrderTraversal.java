import java.util.*;

public class BinarTreeZigZagLevelOrderTraversal {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isEvenLevel = true;
        while(!queue.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();
                ans.add(currNode.val);
                if(currNode.left != null) queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
            }
            if(!isEvenLevel){
                Collections.reverse(ans);
            }
            result.add(ans);
            isEvenLevel = !isEvenLevel; // toggle the value if level is not even
        }
        return result;
    }
}
