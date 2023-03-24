package leet543;

class TreeNode {
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

public class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode root){
        if (root == null){
            return 0;
        }

        int leftDep = depth(root.left);
        int rightDep = depth(root.right);

        ans = Math.max(ans,leftDep + rightDep + 1);
        return Math.max(leftDep,rightDep) + 1;
    }
}
