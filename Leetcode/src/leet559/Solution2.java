package leet559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution2 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    // 迭代遍历法
    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int maxLen = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                assert poll != null;
                for (Node child : poll.children) {
                    if (child != null){
                        queue.offer(child);
                    }
                }
            }
            maxLen++;
        }
        return maxLen;
    }
}