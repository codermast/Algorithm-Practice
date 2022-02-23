package problem.leet082;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        Queue<Integer> queue = new LinkedList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for(ListNode i = head; i != null; i= i.next){
            map.put(i.val,map.getOrDefault(i.val,0) + 1);
        }

        for(ListNode i = head; i != null; i= i.next){
            Integer integer = map.get(i.val);
            if(integer == 1){
                queue.offer(i.val);
            }
        }

        ListNode ret;
        if(queue.size() == 0){
            return null;
        }else{
            ret = new ListNode(queue.poll());
            ListNode node = ret;
            while (!queue.isEmpty()){
                node.next = new ListNode(queue.poll());
                node = node.next;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode r1 = new ListNode(2);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(3);
        ListNode r4 = new ListNode(4);
        ListNode r5 = new ListNode(4);
        ListNode r6 = new ListNode(5);
        root.next = r1;
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r5.next = r6;
        Solution s= new Solution();
        ListNode listNode = s.deleteDuplicates(root);
    }
}