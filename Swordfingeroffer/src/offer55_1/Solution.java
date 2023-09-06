package offer55_1;

public class Solution {
    // 递归实现
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 等于 左子树的深度 和 右子树的深度 最大值 + 1
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }

    // 二叉树的深度

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
