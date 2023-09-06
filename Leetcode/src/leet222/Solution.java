package leet222;


import java.util.LinkedList;
import java.util.Queue;

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
    // 递归法
    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
       return countNodes(root.left) + countNodes(root.right) + 1;
    }

    // 迭代遍历法
    public int countNodes2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 层序遍历需要借助 队列 实现
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            count += size;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();

                assert poll != null;
                if (poll.left != null) {
                    queue.offer(poll.left);
                }

                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return count;
    }
}
