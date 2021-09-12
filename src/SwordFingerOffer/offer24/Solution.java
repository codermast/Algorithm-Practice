package SwordFingerOffer.offer24;

import java.util.Stack;

//https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        // 返回结点
        Stack<Integer> stack = new Stack<>();

        for(ListNode i = head;i != null;i=i.next){
            stack.push(i.val);
        }

        ListNode retroot = new ListNode(stack.pop());
        ListNode lastnode = retroot;
        while(!stack.empty()){
            ListNode next = new ListNode(stack.pop());
            lastnode.next = next;
            lastnode = lastnode.next;
        }
        return  retroot;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode listNode1 = solution.reverseList(listNode);

        for(ListNode i = listNode1 ;i != null;i=i.next){
            System.out.println(i.val);
        }
    }
}
