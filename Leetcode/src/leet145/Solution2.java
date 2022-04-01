package leet145;

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
class Solution2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();

        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                TreeNode peek = stack.pop();

                if (peek.left != null){
                    stack.push(peek.left);
                }

                if (peek.right != null){
                    stack.push(peek.right);
                }
                list.add(peek.val);
            }
        }
        List<Integer> ret = new LinkedList<>();
        for (int val : list) {
            ret.add(0,val);
        }
        return ret;
    }
}