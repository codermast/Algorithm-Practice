package problem.leet234;

import java.util.Stack;

public class Solution {

    static class ListNode {
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

    // 回文链表
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        for (ListNode i = head; i != null; i = i.next) {
            stack.push(i.val);
        }

        for (ListNode i = head; i != null; i = i.next) {
            if (i.val != stack.pop()) {
                return false;
            }
        }
        return true;
    }

}