package problem.leet606;

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

    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        preOrder(root);

        return sb.toString();
    }


    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }

        sb.append(root.val);

        if(root.left == null && root.right == null){
            return;
        }

        sb.append("(");
        preOrder(root.left);
        sb.append(")");
        if(root.right != null){
            sb.append("(");
            preOrder(root.right);
            sb.append(")");
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);

        a.left = b;
        a.right = c;
        b.left = d;

        System.out.println(s.tree2str(a));

    }
}
