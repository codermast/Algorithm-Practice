package SwordFingerOffer.offer35;

public class Solution {
    /*
    *   链表节点内部类
    * */
    static class  Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

    }
    /*
    *   主方法
    * */
    public Node copyRandomList(Node head) {
        // 判断结点是否为空
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        Node ret = new Node(head.val);
        ret.random = head.random;
        Node last = ret;

        for(Node i = head.next;i != null;i=i.next){
            Node tmp = new Node(i.val);
            tmp.random = i.random;

            last.next = tmp;
            last = last.next;
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Node head = new Node(1);
        head.random = null;
        head.next = new Node(2);
        head.next.random = head;
        head.next.next = null;

        Node node = s.copyRandomList(head);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Node i = node;i != null;i = i.next){
            sb.append("["+i.val+",");
            sb.append(i.random + "]");
            if(i.next != null){
                sb.append(",");
            }
        }
        sb.append("]");

        System.out.println(sb);
    }
}
