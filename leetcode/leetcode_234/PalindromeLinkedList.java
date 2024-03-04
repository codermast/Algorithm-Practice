package leetcode_234;

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

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        // 获取前半段链表的末尾节点
        ListNode preLastNode = getPreLastNode(head);

        // 翻转后半段链表
        ListNode afterListHeadNode = reverseList(preLastNode);

        // 前半段链表的头结点
        ListNode preListHeadNode = head;
        // 判断是否是回文
        while (preListHeadNode != null && afterListHeadNode != null) {
            if (preListHeadNode.val != afterListHeadNode.val) {
                return false;
            }
            preListHeadNode = preListHeadNode.next;
            afterListHeadNode = afterListHeadNode.next;
        }
        return true;
    }

    // 获取后半段链表的首节点
    private ListNode getPreLastNode(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // 翻转链表
    private ListNode reverseList(ListNode head) {
        ListNode preNode = null;

        while (head != null) {
            ListNode next = head.next;

            head.next = preNode;
            preNode = head;

            head = next;
        }
        return preNode;
    }
}
