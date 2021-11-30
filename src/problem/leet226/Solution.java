package problem.leet226;

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

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        // 将反转后的左子树给到返回的右子树，将反转的右子树给到根的左子数
        return new TreeNode(root.val,invertTree(root.right),invertTree(root.left));
    }
}
