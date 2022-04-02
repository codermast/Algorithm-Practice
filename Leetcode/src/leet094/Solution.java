package leet094;

import java.util.LinkedList;
import java.util.List;


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

    List<Integer> list = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }

    public void inorder(TreeNode root){
        if (root == null) {
            return;
        }
        inorder(root.left);

        list.add(root.val);

        inorder(root.right);
    }
}