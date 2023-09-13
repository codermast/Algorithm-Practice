package leet513;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // 可以层序遍历
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        TreeNode ret = queue.peek();

        while (!queue.isEmpty()) {
            int size = queue.size();
            ret = queue.peek();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();

                if (poll.left != null) {
                    queue.offer(poll.left);
                }

                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return ret.val;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}