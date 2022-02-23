package leet061;

class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int len = 0;
        for(ListNode i = head;i != null; i=i.next){
            len ++;
        }
        // 循环的次数
        for(int i = 0;i<(k % len);i++){
            ListNode node = head.next;
            ListNode pre = head;

            while(node.next != null){
                pre = pre.next;
                node = node.next;
            }
            pre.next = null;
            node.next = head;
            head = node;
        }
        return head;
    }
}
