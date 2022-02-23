package offer27;

public class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    /*
    *   镜像二叉树
    * */
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
