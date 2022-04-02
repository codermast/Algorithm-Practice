package leet515;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ret = new LinkedList<>();

        if (root == null){
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            int lineMaxNum = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                assert poll != null;
                lineMaxNum = Math.max(lineMaxNum,poll.val);
                if (poll.left != null){
                    queue.offer(poll.left);
                }

                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
            ret.add(lineMaxNum);
        }
        return ret;
    }
}
