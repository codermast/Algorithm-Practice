package leet101;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution2 {
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

    // 广度优先遍历迭代法
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                list.add(poll);

                if (poll != null){
                    queue.offer(poll.left);

                    queue.offer(poll.right);
                }
            }
            int i = 0, j = size - 1;
            while (i < j) {

                TreeNode iNode = list.get(i);
                TreeNode jNode = list.get(j);
                if ((iNode == null && jNode != null) || (iNode != null && jNode == null) ){
                    return false;
                    // 此时的 Jnode 必定不为 Null，如果为Null，则只会执行前面的语句
                }else if (iNode != null && iNode.val != jNode.val){
                        return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}