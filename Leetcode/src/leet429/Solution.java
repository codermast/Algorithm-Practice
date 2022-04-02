package leet429;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();

        if (root == null){
            return ret;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                assert poll != null;
                for (Node child : poll.children) {
                    if (child != null){
                        queue.offer(child);
                    }
                }
                list.add(poll.val);
            }
            ret.add(list);
        }
        return ret;
    }
}