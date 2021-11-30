package problem.leet144;

import java.util.ArrayList;
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

    // 存储返回链表
    List<Integer> list = new ArrayList<>();

    // 前序遍历的值链表
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }

    // 前序遍历，将结点的值插入到链表
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }

        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
