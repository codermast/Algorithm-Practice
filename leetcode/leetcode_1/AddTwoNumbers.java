package leetcode_1;

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

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(), node = head;
        int sub = 0;
        while (!(l1 == null && l2 == null)) {
            int sum = 0;

            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + sub;
            }

            if (l1 == null) {
                sum = l2.val + sub;
            }

            if (l2 == null) {
                sum = l1.val + sub;
            }

            if (sum > 9) {
                sub = 1;
            } else {
                sub = 0;
            }
            node.next = new ListNode(sum % 10);
            node = node.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (sub == 1) {
            node.next = new ListNode(sub);
        }
        return head.next;
    }
}
