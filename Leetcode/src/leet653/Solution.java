package leet653;


import java.util.LinkedList;
import java.util.List;

class TreeNode {
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

public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> listByTreeNode = getListByTreeNode(root);
        int i = 0;
        int j = listByTreeNode.size() - 1;
        while (i < j) {
            int num1 = listByTreeNode.get(i);
            int num2 = listByTreeNode.get(j);

            if (k - num2 > num1) {
                i++;
            } else if (k - num2 < num1) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    List<Integer> list = new LinkedList<>();

    private List<Integer> getListByTreeNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        getListByTreeNode(root.left);
        list.add(root.val);
        getListByTreeNode(root.right);
        return list;
    }
}
