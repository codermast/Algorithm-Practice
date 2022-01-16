package problem.leet382;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

    ListNode[] arr;
    int size;

    public Solution(ListNode head) {
        List<ListNode> list = new LinkedList<>();

        for(ListNode i = head;i != null;i = i.next) {
            list.add(i);
        }

        this.arr =  list.toArray(new ListNode[0]);
        this.size = list.size();
    }

    public int getRandom() {
        Random random = new Random();

        int i = random.nextInt(size);

        return arr[i].val;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b;
        b.next = c;

        Solution s= new Solution(a);
        System.out.println(s.getRandom());
    }
}