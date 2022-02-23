package offer06;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    // 通过栈Stack来实现
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int size = 0;
        for(ListNode i = head; i!= null;i = i.next){
            stack.push(i.val);
            size++;
        }
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = stack.pop();
        }

        return arr;
    }
}


