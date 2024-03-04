package leetcode_142;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        // 设置快慢指针，快指针每次走两步，慢指针每次走一步
        ListNode fast = head, slow = head;

        while (fast != null) {

            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            slow = slow.next;

            if (fast == slow) {
                // 第二次相遇
                ListNode node = head;

                while (node != slow) {
                    node = node.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
