package leetcode_24;


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

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = new ListNode(-1);

        newHead.next = head;

        ListNode a = newHead;
        ListNode b = head;
        ListNode c = head.next;
        ListNode d = c.next;

        // 这里进行循环
        while (b != null && c != null) {
            a.next = c;
            c.next = b;
            b.next = d;

            a = b;
            b = d;

            if (b != null) c = b.next;

            if (c != null) d = c.next;
        }

        return newHead.next;

    }
}
