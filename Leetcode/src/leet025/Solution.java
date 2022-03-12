package leet025;

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

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = new ListNode();
        ListNode ret = node;
        int size = 0;
        for (ListNode i = head; i != null; i = i.next) {
            size++;
        }

        int count = size / k;
        for (int i = 0; i < count; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < k; j++) {
                stack.push(head.val);
                head = head.next;
            }

            while (!stack.isEmpty()) {
                node.next = new ListNode(stack.pop());
                node = node.next;
            }
        }
        for (int i = 0; i < size % k; i++) {
            node.next = head;
            node = node.next;
            head = head.next;
        }
        return ret.next;
    }
}