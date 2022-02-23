package problem.leet236;


import java.util.Stack;

class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(isContain(root,p,q)){
            return stack.peek();
        }
        return null;
    }


    Stack<TreeNode> stack = new Stack<>();
    public boolean isContain(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return false;
        }

        if(root.val == p.val && root.left.val == q.val || root.val == p.val && root.right.val == q.val || root.left.val == p.val && root.right.val == q.val || root.left.val == q.val && root.right.val == p.val){
            return true;
        }


        if(isContain(root,p,q)){
            stack.push(root);
        }

        if(isContain(root.left,p,q)){
            stack.push(root.left);
        }

        if(isContain(root.right,p,q)){
            stack.push(root.right);
        }

        return !stack.empty();
    }
}