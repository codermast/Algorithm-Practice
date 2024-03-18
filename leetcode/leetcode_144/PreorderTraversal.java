package leetcode_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class PreorderTraversal {
    // 递归实现二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        preorder(ret, root);
        return ret;
    }

    private void preorder(List<Integer> ret, TreeNode root) {
        if (root == null) {
            return;
        }

        ret.add(root.val);
        preorder(ret, root.left);
        preorder(ret, root.right);
    }

    // 迭代：借助栈实现
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        if (root == null) {
            return ret;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                ret.add(pop.val);

                if (pop.right != null) {
                    stack.push(pop.right);
                }

                if (pop.left != null) {
                    stack.push(pop.left);
                }
            }
        }
        return ret;
    }
}