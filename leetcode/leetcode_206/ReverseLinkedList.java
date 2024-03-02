package leetcode_206;


import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        for (ListNode i = head; i != null; i = i.next) {
            stack.push(i);
        }

        if (stack.isEmpty()) {
            return null;
        }

        ListNode root = stack.pop();
        ListNode node = root;
        while (!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
        }
        // 这一步是因为，在前面我们压栈中，压入的结点可能还连着无用的后续节点，这里直接切断即可
        node.next = null;
        return root;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode a = head;
        ListNode b = head.next;
        ListNode pre = null;
        ListNode next = null;

        if (b != null) {
            next = b.next;
        }

        while (b != null) {
            a.next = pre;
            b.next = a;

            pre = a;
            a = b;
            b = next;
            if (b != null) {
                next = b.next;
            }
        }
        return a;
    }
}
