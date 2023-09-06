package leet104;

import java.util.LinkedList;
import java.util.Queue;

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


    /*
    *    求树的最大深度，即左子树和右子树深度的最大值 + 1（ 1 为根节点）
    *       如果树为空，则直接返回 0 即可。
    */
    // 递归法
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

    // 深度优先遍历迭代法
    // 最大的深度就是二叉树层序遍历的层数，所以这里我们使用层序遍历
    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 层序遍历需要借助 队列 来实现
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxLen = 0;
        while (!queue.isEmpty()) {
            // size 记录该层的节点数
            int size = queue.size();

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
            // 在遍历完最后一层后，是会再进行 maxLen ++，所以初始的时候的 maxLen初始化为 0
            maxLen++;
        }
        return maxLen;
    }
}
