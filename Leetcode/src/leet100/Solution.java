package leet100;

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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // 如果两个树都为 null 则返回true
        if(p == null && q == null){
            return true;
        }

        // 在此时，两个树不可能同时为null，只要其中一个为null，则另外一个必不为 null，即两树不同
        if(p == null || q == null){
            return false;
        }

        // 当两树根结点的val值不同，则两树不相等
        if(p.val != q.val){
            return false;
        }

        // 判断左子树和右子树分别是否相等，如果其中一个不相等，则整个树不相等。
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
