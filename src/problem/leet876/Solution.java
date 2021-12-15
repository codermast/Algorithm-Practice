package problem.leet876;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        int size = 0;
        for(ListNode i = head;i != null;i = i.next){
            size ++;
        }
        ListNode ret = null;
        for(int i = 0;i< (size / 2) + 1;i++){
            ret = head;
            head = head.next;
        }
        return ret;
    }
}
