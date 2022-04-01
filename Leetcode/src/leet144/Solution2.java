package leet144;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
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

public class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()){
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                list.add(pop.val);
                if (pop.right != null){
                    stack.push(pop.right);
                }

                if (pop.left != null){
                    stack.push(pop.left);
                }
            }
        }
        return list;
    }
}
