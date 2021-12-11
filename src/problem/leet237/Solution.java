package problem.leet237;




class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        for(ListNode i = node.next;i != null;i = i.next){
            node.val = i.val;
            if(node.next.next == null){
                node.next = null;
                break;
            }
            node = node.next;

        }
    }
}
