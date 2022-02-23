package leet105;


import java.util.Arrays;

class Solution {

    static class TreeNode {
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

    // 目前走到前序遍历的哪个节点
    private static int index = 0;

    /*
    *   构建二叉树
    * */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return myBuildTree(preorder,inorder,0,inorder.length);
    }

    /*
    *   根据前序遍历和中序遍历构建二叉树
    * */
    public TreeNode myBuildTree(int[] preorder,int[] inorder,int left,int right){
        if(left >= right){
            return null;
        }

        if(index >= preorder.length){
            return null;
        }

        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int tmp = find(inorder,left,right,root.val);

        root.left = myBuildTree(preorder,inorder,left,tmp);
        root.right = myBuildTree(preorder,inorder, tmp + 1, right);

        return root;
    }

    private int find(int[] inOrder, int left, int right, int val) {
        for (int i = left; i < right; i++) {
            if (inOrder[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
