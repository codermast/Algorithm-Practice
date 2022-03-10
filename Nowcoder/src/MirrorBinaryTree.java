class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class MirrorBinaryTree {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        Mirror(root.left);
        TreeNode left = root.left;
        Mirror(root.right);
        root.left = root.right;
        root.right = left;
    }
}