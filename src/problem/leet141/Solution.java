package problem.leet141;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        for(ListNode i = head;i != null;i = i.next){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
