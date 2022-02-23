package leet097;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private class TreeNode {
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

        /*
         *   返回链表
         * */
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();

            inOrder(root,list);

            return list;
        }

        /*
        *   中序遍历
        * */
        public void inOrder(TreeNode root,List<Integer> res){
            if(root == null){
                return ;
            }

            inOrder(root.left,res);
            res.add(root.val);
            inOrder(root.right,res);
        }

}
