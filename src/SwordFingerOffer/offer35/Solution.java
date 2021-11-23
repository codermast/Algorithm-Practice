//package SwordFingerOffer.offer35;
//
//public class Solution {
//    /*
//    *   链表节点内部类
//    * */
//    static class  Node {
//        int val;
//        Node next;
//        Node random;
//
//        public Node(int val) {
//            this.val = val;
//            this.next = null;
//            this.random = null;
//        }
//    }
//    /*
//    *   主方法
//    * */
//    public Node copyRandomList(Node head) {
//        // 判断结点是否为空
//        if(head == null){
//            return null;
//        }
//        Node ret = new Node(head.val);
//        ret.random = head.random;
//
//        Node r = ret;
//        for(Node i = head.next;i!=null;i = i.next){
//            Node tmp = new Node(i.val);
//            tmp.random = i.random;
//
//            ret.next = tmp;
//            ret = ret.next;
//        }
//        return r;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        Node root = new Node(2);
//        root.random = null;
//        // [[7,null],[13,0],[11,4],[10,2],[1,0]]
//
//        Node r1 = new Node(7);
//        r1.random = null;
//
//        Node r2 = new Node(13);
//        r2.random = 0;
//
//        Node r3 = new Node(7);
//        r1.random = null;
//
//        Node r4 = new Node(7);
//        r1.random = null;
//
//        Node r5 = new Node(7);
//        r1.random = null;
//
//        for(Node i = root;i != null;i = i.next){
//            System.out.println(i.val);
//            System.out.println(i.random);
//        }
//    }
//}
