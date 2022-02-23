package leet404;

public class Solution {
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


    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return sum;
        }

        if(isLeafNode(root)){
            return 0;
        }

        if(isLeafNode(root.left)){
            sum += root.left.val;
        }

        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return sum;
    }

    public boolean isLeafNode(TreeNode node){
        if(node == null){
            return false;
        }
        return node.left ==null && node.right == null;
    }

}
