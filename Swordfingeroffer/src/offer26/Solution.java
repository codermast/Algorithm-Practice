package offer26;


class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        if(A.val == B.val) {
            if (B.left != null && B.right == null) {
                if (A.left.val == B.left.val){
                    return true;
                }
            }

            if(B.left == null && B.right != null){
                if (A.right.val == B.right.val){
                    return true;
                }
            }

            if(B.left == null && B.right == null){
                if (A.right.val == B.right.val && A.left.val == B.left.val){
                    return true;
                }
            }
        }

        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
}