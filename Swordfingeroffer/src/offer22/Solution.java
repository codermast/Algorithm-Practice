package offer22;

// https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {

        int length = 0;
        for(ListNode i = head;i!=null;i = i.next){
            length++;
        }

        for(int i = 0;i<length - k;i++){
            head = head.next;
        }

        return head;
    }
}
