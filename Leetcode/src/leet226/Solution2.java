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

    // 迭代遍历法（深度优先遍历）
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
                TreeNode pop = stack.pop();
                TreeNode tmp = pop.left;
                pop.left = pop.right;
                pop.right = tmp;

                // 先压入左子树，那么说明先反转右子树，因为这里是栈的结构，先进后出
                if (pop.left != null){
                    stack.push(pop.left);
                }

                if (pop.right != null){
                    stack.push(pop.right);
                }
        }
        return root;
    }
}