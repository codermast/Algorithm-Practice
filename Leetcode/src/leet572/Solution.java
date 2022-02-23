package leet572;

class Solution {


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

    /*
    *   是否为子树
    * */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(isSametree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    /*
     *   判断两个树是否相等
     * */
    public boolean isSametree(TreeNode root, TreeNode subRoot){
        // 两个树都为空 null
        if(root == null && subRoot == null){
            return true;
        }

        // 近一个为空 null， 则不相等
        if(root == null || subRoot == null){
            return false;
        }

        if(root.val != subRoot.val){
            return false;
        }

        return isSametree(root.left,subRoot.left) && isSametree(root.right,subRoot.right);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(2);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(1);
        TreeNode h = new TreeNode(2);

        f.left = g;
        f.right = h;

        System.out.println(s.isSubtree(a, f));
    }
}
