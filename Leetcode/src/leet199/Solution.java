package leet199;

import java.util.LinkedList;
import java.util.List;
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                assert poll != null;
                if (poll.left != null){
                    queue.offer(poll.left);
                }

                if (poll.right != null){
                    queue.offer(poll.right);
                }
                list.add(poll.val);
            }
            ret.add(list.get(list.size() - 1));
        }
        return ret;
    }
}