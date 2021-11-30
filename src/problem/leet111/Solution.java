package problem.leet111;

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

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        // 不太清楚
        int minlen = Integer.MAX_VALUE;
        if(root.left != null){
            minlen = Math.min(minDepth(root.left), minlen);
        }

        if (root.right != null) {
            minlen = Math.min(minDepth(root.right), minlen);
        }

        return minlen + 1;
    }
}
