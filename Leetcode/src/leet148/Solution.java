package leet148;

import java.util.List;

public class Solution {

static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        // 找到链表的中间节点，奇数个结点找最中间的结点，偶数个结点找中间偏左的结点
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // 此时链表氛围两段，左段：头结点head，尾结点slow 右段：头结点slow.next
        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(tmp);

        ListNode ret = new ListNode();
        ListNode node = ret;
        // 此时，左右两段均排序完毕，进行合并即可
        while (left != null && right != null){
            if (left.val < right.val){
                node.next = left;
                left = left.next;
            }else {
                node.next = right;
                right = right.next;
            }
            node = node.next;
        }
        // 此时left和right，只有如下三种情况：
        //  left == null && right == null
        //  left == null && right != null
        //  left != null && right == null

        if (left == null){
            node.next = right;
        }else {
            node.next = left;
        }
        return ret.next;
    }
}
