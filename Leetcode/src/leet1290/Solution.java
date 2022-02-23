package leet1290;


class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        for(ListNode i = head; i != null;i =i.next){
            sb.append(i.val);
        }
        int ret = 0;
        for (int i = 0; i < sb.length(); i++) {
            int integer = sb.charAt(sb.length() - i - 1) - 48;
            ret += Math.pow(2,i) * integer;
        }
        return ret;
    }
}
