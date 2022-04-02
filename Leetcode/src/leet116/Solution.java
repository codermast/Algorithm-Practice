package leet116;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        root.next = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                assert poll != null;

                if (poll.left != null){
                    queue.offer(poll.left);
                    list.add(poll.left);
                }

                if (poll.right != null){
                    queue.offer(poll.right);
                    list.add(poll.right);
                }
            }
            for (int i = 0; i + 1 < list.size(); i++) {
                list.get(i).next = list.get(i + 1);
            }
            if(list.size() > 0){
                list.get(list.size() - 1).next = null;

            }
        }
        return root;
    }
}
