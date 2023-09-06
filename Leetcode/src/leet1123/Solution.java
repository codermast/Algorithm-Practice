package leet1123;


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

    // 最深叶节点的最近公共祖先
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }

        int leftHigh = high(root.left);
        int rightHigh = high(root.right);

        // 左右子树高度相等，则返回根节点
        if (leftHigh == rightHigh) {
            return root;
        } else if (leftHigh < rightHigh) {
            return lcaDeepestLeaves(root.right);
        } else {
            return lcaDeepestLeaves(root.left);
        }
    }

    // 求树的高度
    private int high(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(high(root.left), high(root.right));
    }
}
