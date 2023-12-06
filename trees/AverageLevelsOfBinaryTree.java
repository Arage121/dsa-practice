import java.util.*;
public class AverageLevelsOfBinaryTree {
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
    public List<Double> averageOfLevels(TreeNode root) { //used bfs here
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double avg = 0.0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                avg += (currNode != null) ? currNode.val : 0.0;

                if (currNode != null && currNode.left != null) queue.offer(currNode.left);
                if (currNode != null && currNode.right != null) queue.offer(currNode.right);
            }

            avg = (levelSize != 0) ? avg / levelSize : 0.0;
            result.add(avg);
        }

        return result;
    }
}
