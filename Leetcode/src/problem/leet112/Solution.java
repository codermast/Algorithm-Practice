package problem.leet112;

import java.util.Stack;

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
            if(root == null){
                return false;
            }
            Stack<TreeNode> stack = new Stack<>();
            int sum = 0;
            // 非递归遍历 : 前序
            while(!stack.empty()){
                Stack<TreeNode> path = new Stack<>();
                TreeNode node = root;
                while(node != null){
                    path.push(node);
                    sum += node.val;
                    node = node.left;
                }

                path.pop();
                node = path.peek().right;

                if(sum == targetSum){
                    return true;
                }

            }
            return false;
        }
}
