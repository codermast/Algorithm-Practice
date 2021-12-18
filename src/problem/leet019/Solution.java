package problem.leet019;


class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 遍历一遍的方法
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = head;
        ListNode last = head;
        for(int i = 1;i < n - 1;i++){
            last = last.next;
        }

        // 此时，first和last之间的距离为 n - 1;
        for(;last.next != null;){
            last = last.next;
            first = first.next;
        }
        first.next = first.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(removeNthFromEnd(head, 2));
    }
}
