package leetcode_19;

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

public class RemoveNthFormEnd {
    // 删除链表的倒数第 n 个结点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;
        ListNode next = head;
        ListNode cur = head;

        for (int i = 0; i < n; i++) {
            next = next.next;
        }

        while (next != null) {
            next = next.next;
            pre = cur;
            cur = cur.next;
        }

        // 此时为删除第一个节点
        if (pre == null) {
            return head.next;
        }

        pre.next = cur.next;
        return head;
    }
}
