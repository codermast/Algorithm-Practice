package leetcode_94;

import java.util.ArrayList;
import java.util.List;

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

public class BinaryTreeInorderTraversal {

    // 递归法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTree(root,list);
        return list;
    }

    private void inorderTree(TreeNode root,List<Integer> list) {
        if (root == null){
            return;
        }

        inorderTree(root.left,list);
        list.add(root.val);
        inorderTree(root.right,list);
    }

    // TODO 二叉树的中序遍历：迭代法
    //public List<Integer> inorderTraversal1(TreeNode root) {
    //    List<Integer> list = new ArrayList<>();
    //
    //    Stack<TreeNode> stack = new Stack<>();
    //
    //    if (root == null){
    //        return list;
    //    }
    //
    //    stack.push(root);
    //
    //    while (!stack.isEmpty()){
    //        TreeNode peek = stack.peek();
    //
    //        if (peek.left != null){
    //
    //        }
    //    }
    //}
}
