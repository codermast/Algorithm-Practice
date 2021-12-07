package SwordFingerOffer.offer28;

public class Solution {

static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    /*
    *   判断两个二叉树是否互为镜像
    * */
    public  boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (!isMirror(p.left, q.right)) {
            return false;
        }

        return isMirror(p.right, q.left);
    }

    /*
    *   判断二叉树是否为镜像二叉树
    * */
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isMirror(root.left,root.right);
    }
}
