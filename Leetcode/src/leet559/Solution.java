package leet559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
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

    // 递归法
    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        int maxLen = 0;
        for (Node child : root.children) {
            maxLen = Math.max(maxDepth(child),maxLen);
        }
        return maxLen + 1;
    }
}