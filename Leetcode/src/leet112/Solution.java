package leet112;

class Solution {

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 树为空时，则必定为 false
        if (root == null) {
            return false;
        }

        if (root.left != null && root.right != null && root.val == targetSum){
            return true;
        }

        return (hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val));
    }
}
