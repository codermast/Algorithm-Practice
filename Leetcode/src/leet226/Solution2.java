package leet226;

import java.util.Stack;

class Solution2 {
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

    // 迭代遍历法
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                TreeNode tmp = pop.left;
                pop.left = pop.right;
                pop.right = tmp;

                if (pop.left != null){
                    stack.push(pop.left);
                }

                if (pop.right != null){
                    stack.push(pop.right);
                }
            }
        }
        return root;
    }
}