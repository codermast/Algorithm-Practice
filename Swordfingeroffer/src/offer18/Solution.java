package offer18;

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
     public ListNode deleteNode(ListNode head, int val) {
        // 如果根节点就是要删除的结点直接返回根节点的下一个结点
         if(head.val == val){
             return head.next;
         }

         ListNode i = head;
         ListNode prev = head;
         while(i != null){
             if(i.val == val){
                prev.next = i.next;
             }
             prev = i;
             i = i.next;
         }
        return head;
     }

}
