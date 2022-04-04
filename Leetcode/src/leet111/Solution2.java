package leet111;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    static class TreeNode {
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
    // 遍历迭代法，广度优先
    public int minDepth(TreeNode root) {
        if (root == null){
            return  0;
        }
        int minLen = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();

                assert poll != null;

                if (poll.left == null && poll.right == null){
                    return minLen + 1;
                }

                if (poll.left != null){
                    queue.offer(poll.left);
                }

                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
            minLen++;
        }
        return minLen;
    }
}