package leet083;




class Solution {


    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode tmp = head;
        for(ListNode i = head;i!= null;i=i.next){
            if(i.val != tmp.val){
                tmp.next = i;
                tmp  = tmp.next;
            }
        }

        tmp.next = null;
        return head;
    }
}
