package problem.leet160;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for (ListNode i = headA; i != null; i = i.next) {
            for (ListNode j = headB; j != null; j = j.next) {
                if (i == j) {
                    return i;
                }
            }
        }
        return null;
    }
}
