package leet023;

import java.util.Arrays;

class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }

        if(lists.length == 1){
            return lists[0];
        }

        int len = 0;

        for (ListNode list : lists) {
            for(ListNode i = list; i != null; i = i.next){
                len ++;
            }
        }
        int[] arr = new int[len];
        int index = 0;
        for (ListNode list : lists) {
            for(ListNode i = list; i != null; i = i.next){
                arr[index] = i.val;
                index++;
            }
        }
        Arrays.sort(arr);
        ListNode ret = new ListNode(-1);
        ListNode node = ret;

        for (int i : arr){
            node.next  = new ListNode(i);
            node = node.next;
        }

        return ret.next;
    }
}