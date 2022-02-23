package leet206;


import java.util.Stack;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        for(ListNode i = head;i != null;i = i.next){
            stack.push(i.val);
        }
        if(stack.empty()){
            return head;
        }

        ListNode ret = new ListNode(stack.pop());
        ListNode root = ret;
        while(!stack.empty()){
            root.next = new ListNode(stack.pop());
            root = root.next;
        }
        return ret;
    }
}
