package leet102;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Solution2 {
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
    // 使用队列的层序遍历

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();

        if (root ==null){
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                assert poll != null;
                list.add(poll.val);

                if (poll.left != null){
                    queue.offer(poll.left);
                }

                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }
}