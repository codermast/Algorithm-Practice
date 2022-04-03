package leet101;


class Solution {
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
    // 递归法
    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (!isMirror(p.left, q.right)) {
            return false;
        }

        return isMirror(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isMirror(root.left,root.right);
    }
}