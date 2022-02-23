package leet110;

public class Solution {

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

        /*
            求二叉树的高度
        */
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            return Math.max(maxDepth(root.right),maxDepth(root.left)) + 1;
        }

        /*
            求一个二叉树是否为平衡二叉树
         */
        public boolean isBalanced(TreeNode root) {
            if(root == null){
                return true;
            }

            int lenleft = maxDepth(root.left);
            int lenright = maxDepth(root.right);

            if(Math.abs(lenleft - lenright) > 1){
                return false;
            }

            return isBalanced(root.left) && isBalanced(root.right);
        }
}
