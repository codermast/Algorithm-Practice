package leet589;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution2 {

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

    // 迭代法
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();

        if (root == null){
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                Node pop = stack.pop();
                list.add(pop.val);

                for (int j = pop.children.size() - 1; j >=0 ; j--) {
                    Node node = pop.children.get(j);
                    if (node != null){
                        stack.push(node);
                    }
                }
            }
        }
        return list;
    }
}