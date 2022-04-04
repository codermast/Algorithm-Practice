package leet111;

public class Solution {
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

    // 递归法
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int minLen = Integer.MAX_VALUE;
        if (root.left != null) {
            minLen = Math.min(minLen, minDepth(root.left));
        }

        if (root.right != null) {
            minLen = Math.min(minLen, minDepth(root.right));
        }
        return minLen + 1;
    }
}
