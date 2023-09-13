package leet404;

import java.util.Stack;

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

    // 递归实现
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves1(root, 0);
    }

    public int sumOfLeftLeaves1(TreeNode root, int sum) {
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

    // 深度优先搜索
    public int sumOfLeftLeavesDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();

            if (isLeafNode(pop.left)) {
                sum += pop.left.val;
            }

            if (pop.right != null) {
                stack.push(pop.right);
            }

            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
        return sum;
    }
}
