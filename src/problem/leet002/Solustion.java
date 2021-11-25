package problem.leet002;


import SwordFingerOffer.offer09.CQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class Solustion {
    /*
    *   结点内部类
    * */
}
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                Queue<ListNode> add1 = new LinkedList<>();
                Queue<ListNode> add2 = new LinkedList<>();
                Queue<ListNode> sumStack = new LinkedList<>();
                for(ListNode i = l1;i != null;i = i.next){
                    add1.offer(i);
                }

                for(ListNode i = l2;i != null;i = i.next){
                    add2.offer(i);
                }

                int i = 0;
                int addNum1 = 0;
                int addNum2 = 0;
                while(add1.size() != 0){
                    addNum1 += Math.pow(10,i) * add1.poll().val;
                    i++;
                }
                i = 0;
                while(add2.size() != 0){
                    addNum2 += Math.pow(10,i) * add2.poll().val;
                    i++;
                }

                int sum = addNum1 + addNum2;

                i = 0;
                while(sum >= 10){
                    sumStack.offer(new ListNode(sum % 10));
                    sum /= 10;
                }
                sumStack.offer(new ListNode(sum % 10));

                ListNode sumNode = sumStack.poll();
                ListNode next = sumNode;
                while (sumStack.size() != 0){
                    next.next = sumStack.poll();
                    next = next.next;
                }
                return sumNode;
            }
    }
