package leet2181;

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
}

public class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode ret = null;
        ListNode trueRetNode = null;
        for (ListNode i = head; i != null; i = i.next) {
            if (i.val != 0) {
                sum += i.val;
            } else {
                if (ret == null &&  sum != 0) {
                    ret = new ListNode(sum);
                    trueRetNode = ret;
                } else  if(ret != null){
                    ret.next = new ListNode(sum);
                    ret = ret.next;
                }
                sum = 0;
            }
        }
        return trueRetNode;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode root = new ListNode(0);
        ListNode head = root;
        root.next = new ListNode(3);
        root = root.next;
        root.next = new ListNode(1);
        root = root.next;

        root.next = new ListNode(0);
        root = root.next;

        root.next = new ListNode(4);
        root = root.next;

        root.next = new ListNode(5);
        root = root.next;
        root.next = new ListNode(2);
        root = root.next;
        root.next = new ListNode(0);


        ListNode listNode = s.mergeNodes(head);
        for (ListNode i = listNode; i!= null; i = i.next){
            System.out.println(i.val);
        }
    }
}
